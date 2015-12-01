package com.wireframesketcher.model.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

import com.wireframesketcher.model.Font;
import com.wireframesketcher.model.FontSupport;
import com.wireframesketcher.model.Item;
import com.wireframesketcher.model.ItemSupport;
import com.wireframesketcher.model.Master;
import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.Screen;
import com.wireframesketcher.model.Widget;
import com.wireframesketcher.model.WidgetContainer;
import com.wireframesketcher.model.impl.Diff.Edit;
import com.wireframesketcher.model.impl.MasterImpl.IInstanceStrategy;
import com.wireframesketcher.model.overrides.Delete;
import com.wireframesketcher.model.overrides.FontOverrides;
import com.wireframesketcher.model.overrides.Insert;
import com.wireframesketcher.model.overrides.ItemOverrides;
import com.wireframesketcher.model.overrides.Move;
import com.wireframesketcher.model.overrides.Operation;
import com.wireframesketcher.model.overrides.Overrides;
import com.wireframesketcher.model.overrides.OverridesFactory;
import com.wireframesketcher.model.overrides.OverridesPackage;
import com.wireframesketcher.model.overrides.Reference;
import com.wireframesketcher.model.overrides.WidgetContainerOverrides;
import com.wireframesketcher.model.overrides.WidgetOverrides;

/**
 * A helper class for managing component overrides
 */
class OverridesHelper implements IInstanceStrategy {
	private final MasterImpl master;

	private boolean computingOverrides;

	private Map<EObject, EObject> copies, reverseCopies, insertCopies,
			reverseInsertCopies;

	private boolean staleInstance = true, computingInstance, staleOverrides;

	private final Adapter masterChangeTracker = new EContentAdapter() {
		@Override
		protected void setTarget(EObject target) {
			super.setTarget(target);
			if (target == master) {
				WidgetContainer ref = ((Master) target).getScreen();
				if (ref != null)
					addAdapter(ref);
			}
		}

		@Override
		protected void unsetTarget(EObject target) {
			super.unsetTarget(target);
			if (target == master) {
				WidgetContainer ref = ((Master) target).getScreen();
				if (ref != null)
					removeAdapter(ref);
			}
		}

		@Override
		public void notifyChanged(Notification msg) {
			super.notifyChanged(msg);

			if (msg.getFeature() == ModelPackage.Literals.MASTER__SCREEN) {
				if (msg.getNotifier() == master)
					handleContainment(msg);
			} else if (msg.isTouch()) {
				// Ignore touch events for anything but screens
				// Touch events for screen seem to be needed only
				// to make pass unit tests that force instance recalculation
				// by calling Master#setScreen with the same screen instance
				return;
			}

			if (msg.getFeature() == ModelPackage.Literals.MASTER__SCREEN) {
				if (msg.getNotifier() == master) {
					staleInstance = true;

					// lazy computation
					if (master.eIsSet(ModelPackage.Literals.MASTER__INSTANCE))
						computeInstance();
				}
			} else if (msg.getFeature() == ModelPackage.Literals.MASTER__OVERRIDES) {
				if (msg.getNotifier() == master) {
					if (computingOverrides)
						return;

					staleInstance = true;

					// lazy computation
					if (master.eIsSet(ModelPackage.Literals.MASTER__INSTANCE))
						computeInstance();
				}
			} else if (msg.getFeature() == ModelPackage.Literals.MASTER__INSTANCE) {
				// Instance notifications can be also caused by calls to
				// getInstance
				// during a parent instance computation. Ignore them by checking
				// computingInstance flag
				if (msg.getNotifier() != master && !computingInstance) {
					staleInstance = true;

					// lazy computation
					if (master.eIsSet(ModelPackage.Literals.MASTER__INSTANCE))
						computeInstance();
				}
			}
		}
	};

	private final Adapter instanceChangeTracker = new EContentAdapter() {
		@Override
		protected void setTarget(EObject target) {
			super.setTarget(target);
			if (target instanceof Master) {
				WidgetContainer instance = ((Master) target).getInstance();
				if (instance != null)
					addAdapter(instance);
			}
		}

		@Override
		protected void unsetTarget(EObject target) {
			super.unsetTarget(target);
			if (target instanceof Master) {
				WidgetContainer instance = ((Master) target).getInstance();
				if (instance != null)
					removeAdapter(instance);
			}
		}

		@Override
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);

			if (!notification.isTouch()) {
				EStructuralFeature feature = (EStructuralFeature) notification
						.getFeature();

				if (feature != null && !ignoreFeature(feature)) {
					// Ignore screen reference changes
					if (feature == ModelPackage.Literals.MASTER__SCREEN)
						return;

					// Ignore all changes except widgets list changes for top
					// object
					if (notification.getNotifier() == master.instance
							&& feature != ModelPackage.Literals.WIDGET_CONTAINER__WIDGETS)
						return;

					if (!updateOverrides(notification))
						computeOverrides();
				}
			}
		}
	};

	private final Comparator<EObject> comparator = new Comparator<EObject>() {
		public int compare(EObject left, EObject right) {
			return copies.get(left) == right ? 0 : 1;
		}
	};

	private static final IInstanceStrategy INSTANCE_COPY = new IInstanceStrategy() {
		public void computeInstance() {
		}
	};

	public OverridesHelper(final MasterImpl master) {
		this.master = master;

		master.eAdapters().add(masterChangeTracker);
	}

	public void computeInstance() {
		if (!staleInstance)
			return;

		this.computingInstance = true;

		cleanupOldInstance();

		WidgetContainer screen = master.getScreen();
		WidgetContainer instance = null;

		if (exists(screen)) {
			Copier copier = new Copier() {
				@Override
				protected EObject createCopy(EObject eObject) {
					EObject copy = super.createCopy(eObject);

					if (eObject instanceof Master) {
						MasterImpl master = (MasterImpl) eObject;
						MasterImpl masterCopy = (MasterImpl) copy;
						masterCopy.setInstanceStrategy(INSTANCE_COPY);
						masterCopy.setInstance((WidgetContainer) copy(master
								.getInstance()));
					}
					return copy;
				}
			};
			EObject result = copier.copy(screen);
			copier.copyReferences();

			copies = copier;

			instance = (WidgetContainer) result;
			applyOverrides(instance);

			instance.eAdapters().add(instanceChangeTracker);
		}

		staleInstance = false;
		master.setInstance(instance);
		this.computingInstance = false;
	}

	private void applyOverrides(WidgetContainer instance) {
		Overrides overrides = master.getOverrides();
		if (overrides == null)
			return;

		try {
			OverridesApplier applier = new OverridesApplier(master.getScreen(),
					instance);
			applier.applyOverrides(overrides);
			if(applier.missingReferences)
				staleOverrides = true;
		} catch (Exception e) {
			// Never fail
			staleOverrides = true;
			EcorePlugin.INSTANCE.log(e);
		}
	}

	private void cleanupOldInstance() {
		if (copies != null)
			copies = null;
		if (reverseCopies != null)
			reverseCopies = null;
		if (master.instance != null)
			master.instance.eAdapters().remove(instanceChangeTracker);
	}

	private Map<EObject, EObject> getReverseCopies() {
		if (reverseCopies == null)
			reverseCopies = computeReverseMap(copies);
		return reverseCopies;
	}

	private <T extends EObject> T insertCopy(T insertedObject) {
		Copier copier = new Copier();
		@SuppressWarnings("unchecked")
		T insertedObjectInstance = (T) copier.copy(insertedObject);
		copier.copyReferences();

		registerCopies(copier);

		return insertedObjectInstance;
	}

	protected void registerCopies(Map<EObject, EObject> copies) {
		if (insertCopies == null)
			insertCopies = copies;
		else
			insertCopies.putAll(copies);

		reverseInsertCopies = null;
	}

	private <T extends EObject> T reverseInsertCopy(T insertedObjectInstance) {
		Copier copier = new Copier();
		@SuppressWarnings("unchecked")
		T insertedObject = (T) copier.copy(insertedObjectInstance);
		copier.copyReferences();

		registerCopies(computeReverseMap(copier));

		return insertedObject;
	}

	private Map<EObject, EObject> getReverseInsertCopies() {
		if (insertCopies == null)
			return null;
		if (reverseInsertCopies == null)
			reverseInsertCopies = computeReverseMap(insertCopies);
		return reverseInsertCopies;
	}

	private static Map<EObject, EObject> computeReverseMap(
			Map<EObject, EObject> map) {
		Map<EObject, EObject> reverseMap = new HashMap<EObject, EObject>(
				map.size());

		for (Entry<EObject, EObject> entry : map.entrySet())
			reverseMap.put(entry.getValue(), entry.getKey());

		return reverseMap;
	}

	private void computeOverrides() {
		setOverrides(new OverridesCalculator(master.getScreen(),
				master.instance).calculateOverrides());
		staleOverrides = false;
	}

	private void setOverrides(Overrides overrides) {
		computingOverrides = true;

		try {
			master.setOverrides(overrides);
		} finally {
			computingOverrides = false;
		}
	}

	private boolean updateOverrides(Notification notification) {
		if(staleOverrides)
			return false;
		
		Overrides overrides = master.getOverrides();

		OverridesUpdater updater = new OverridesUpdater(master.getScreen(),
				master.instance);
		boolean updated = updater.updateOverrides(overrides, notification);

		if (updated) {
			// if (updater.getUpdatedOverrides() != overrides)
			setOverrides(updater.getUpdatedOverrides());
		}

		return updated;
	}

	private static boolean ignoreFeature(EStructuralFeature feature) {
		return !feature.isChangeable() || feature.isDerived()
				|| feature.isTransient();
	}

	private static boolean exists(WidgetContainer ref) {
		return ref != null && !ref.eIsProxy();
	}

	static class Helper {
		protected final WidgetContainer leftRoot, rightRoot;

		private String leftUri;

		public Helper(WidgetContainer leftRoot, WidgetContainer rightRoot) {
			this.leftRoot = leftRoot;
			this.rightRoot = rightRoot;
		}

		protected String getItemURIFragment(Item item) {
			return ((InternalEObject) item.eContainer()).eURIFragmentSegment(
					item.eContainingFeature(), item);
		}

		protected String getRelativeWidgetURI(Widget widget) {
			String uri = getURI(widget);
			String containerUri = getURI(widget.eContainer());
			if (uri.startsWith("/") && uri.startsWith(containerUri)) {
				uri = uri.substring(containerUri.length());
				if (uri.length() == 0)
					uri = null;
			}
			return uri;
		}

		private String getURI(EObject object) {
			return ((ModelXMLResourceImpl) leftRoot.eResource())
					.getDefaultURIFragment(object);
		}

		private String getLeftURI() {
			if (leftUri == null)
				leftUri = getURI(leftRoot);
			return leftUri;
		}

		protected Item getItemForURIFragment(EObject container,
				String uriFragment) {
			if (uriFragment == null)
				return null;

			EObject object = ((InternalEObject) container)
					.eObjectForURIFragmentSegment(uriFragment);
			if (!(object instanceof Item))
				return null;

			return (Item) object;
		}

		protected Widget getWidgetForURI(String uri) {
			if (uri == null)
				return null;

			try {
				if (isNestedWidgetURI(uri))
					return getNestedWidgetForURI(uri);

				EObject object = leftRoot.eResource().getEObject(uri);
				if (!(object instanceof Widget))
					return null;

				Widget widget = (Widget) object;

				if (isInsertWidget(widget))
					widget = (Widget) getInsertedInstance(widget);

				return widget;
			} catch (Exception e) {
				EcorePlugin.INSTANCE.log(e);
				return null;
			}
		}

		private EObject getInsertedInstance(EObject object) {
			Master master = getMasterContainer(object);
			if (master == null)
				return null;

			if (!isDirectContent(master))
				return null;

			MasterImpl masterImpl = (MasterImpl) master;
			OverridesHelper overridesHelper = (OverridesHelper) masterImpl
					.getInstanceStrategy();
			if (overridesHelper.insertCopies != null)
				return overridesHelper.insertCopies.get(object);

			return null;
		}

		protected String getAbsoluteURI(EObject container, Reference ref) {
			String uri = ref.getRef();
			if (uri == null)
				return null;

			if (uri.startsWith("/")) {
				String containerUri = container == leftRoot ? getLeftURI()
						: getURI(container);
				uri = containerUri + uri;
			}
			return uri;
		}

		protected Master getMasterContainer(EObject object) {
			Master master = null;

			EObject parent = object.eContainer();
			while (master == null && parent != null && parent != leftRoot) {
				if (parent instanceof Master) {
					master = (Master) parent;
				}
				parent = parent.eContainer();
			}
			return master;
		}

		private boolean isDirectContent(EObject object) {
			EObject parent = object.eContainer();
			while (parent != null && parent != leftRoot) {
				if (parent instanceof Master)
					return false;
				parent = parent.eContainer();
			}

			return parent == leftRoot;
		}

		private boolean isInsertWidget(Widget widget) {
			EObject object = widget;

			while (object != null) {
				object = object.eContainer();
				if (object instanceof Insert)
					return true;
				else if (object instanceof Screen || object instanceof Master)
					return false;
			}

			return false;
		}

		protected String getWidgetURI(Widget widget) {
			String uri = null;
			if (!isDirectContent(widget))
				uri = getNestedWidgetURI(widget);

			if (uri != null)
				return uri;

			uri = getURI(widget);
			String leftUri = getLeftURI();
			if (uri.startsWith("/") && uri.startsWith(leftUri)) {
				uri = uri.substring(leftUri.length());
				if (uri.length() == 0)
					uri = null;
			}
			return uri;
		}

		protected Long getSourceWidgetId(Widget widget) {
			Widget sourceWidget = getSourceWidget(widget);
			if (sourceWidget != null)
				return sourceWidget.getId();

			return null;
		}

		/**
		 * Maps the given widget to its source widget. The algorithm goes
		 * upwards to find the overrides root and then maps the widget to its
		 * source. Then it does this recursively on source widget until the
		 * initial source is found.
		 */
		protected Widget getSourceWidget(Widget widget) {
			EObject parent = widget.eContainer();
			while (parent != null) {
				if (parent instanceof MasterImpl
						&& ((MasterImpl) parent).getInstanceStrategy() != INSTANCE_COPY)
					break;
				parent = parent.eContainer();
			}

			if (parent == null)
				return widget;

			MasterImpl master = (MasterImpl) parent;
			OverridesHelper overridesHelper = (OverridesHelper) master
					.getInstanceStrategy();

			Map<EObject, EObject> reverseInsertCopies = overridesHelper
					.getReverseInsertCopies();
			if (reverseInsertCopies != null) {
				Widget insertedWidget = (Widget) reverseInsertCopies
						.get(widget);
				if (insertedWidget != null)
					return insertedWidget;
			}

			Widget sourceWidget = (Widget) overridesHelper.getReverseCopies()
					.get(widget);

			if (sourceWidget == null)
				return null;

			return getSourceWidget(sourceWidget);
		}

		/**
		 * Maps source widget identified by id path to a copy widget. The
		 * algorithm descends recursively into the left (source) branch and maps
		 * to the right (copy) branch on return.
		 */
		private Widget getCopyWidgetForId(WidgetContainer container,
				List<Long> idPath, int index) {
			if (container == null)
				return null;

			String idFragment = idPath.get(index).toString();
			Widget widget = (Widget) container.eResource().getEObject(
					idFragment);
			if (widget == null)
				return null;

			if (index == idPath.size() - 1) {
				if (isInsertWidget(widget)) {
					MasterImpl master = (MasterImpl) getMasterContainer(widget);
					OverridesHelper overridesHelper = (OverridesHelper) master
							.getInstanceStrategy();
					if (overridesHelper.insertCopies != null)
						return (Widget) overridesHelper.insertCopies
								.get(widget);

					return null;
				}

				return widget;
			}

			if (!(widget instanceof MasterImpl))
				return null;

			MasterImpl master = (MasterImpl) widget;
			if (!exists(master.getScreen()))
				return null;

			OverridesHelper overridesHelper = (OverridesHelper) master
					.getInstanceStrategy();

			Widget sourceWidget = getCopyWidgetForId(master.getScreen(),
					idPath, index + 1);
			return (Widget) overridesHelper.copies.get(sourceWidget);
		}

		private String getNestedWidgetURI(Widget widget) {
			List<Long> uriPath = new ArrayList<Long>();
			Widget sourceWidget = getSourceWidget(widget);
			if (sourceWidget == null)
				return null;

			Long id = sourceWidget.getId();
			if (id == null)
				return null;

			uriPath.add(id);
			EObject parent = widget.eContainer();
			while (parent != null && parent != leftRoot) {
				if (parent instanceof Master) {
					Master master = (Master) parent;
					id = getSourceWidgetId(master);
					if (id == null)
						return null;
					uriPath.add(id);
				}
				parent = parent.eContainer();
			}

			// For insert do not include the immediate parent
			if (isInsertWidget(sourceWidget))
				uriPath.remove(1);

			StringBuilder buf = new StringBuilder();

			for (int i = uriPath.size() - 1; i > 0; i--) {
				buf.append(uriPath.get(i));
				buf.append('/');
			}

			buf.append(uriPath.get(0));

			return buf.toString();
		}

		private boolean isNestedWidgetURI(String uri) {
			int length = uri.length();
			if (length > 1) {
				return Character.isDigit(uri.charAt(0))
						&& uri.indexOf('/') != -1;
			}
			return false;
		}

		private Widget getNestedWidgetForURI(String uri) {
			int start = 0;
			int length = uri.length();
			int index = 1;
			List<Long> idPath = new ArrayList<Long>();

			WidgetContainer container = leftRoot;

			for (; index < length; index++) {
				if (uri.charAt(index) == '/') {
					Long id = Long.parseLong(uri.substring(start, index));
					idPath.add(id);
					start = index + 1;
					index++;
				}
			}

			Long id = Long.parseLong(uri.substring(start, length));
			idPath.add(id);

			return getCopyWidgetForId(container, idPath, 0);
		}

		protected boolean eq(Object a, Object b) {
			if (a == null)
				return b == null;

			return b == null ? false : a.equals(b);
		}
	}

	class OverridesCalculator extends Helper {

		private Overrides overrides;

		private WidgetOverrides widgetOverrides;

		private Widget widget;

		private ItemOverrides itemOverrides;

		private Item item;

		public OverridesCalculator(WidgetContainer leftRoot,
				WidgetContainer rightRoot) {
			super(leftRoot, rightRoot);
		}

		private Overrides getOverrides() {
			if (overrides == null)
				overrides = OverridesFactory.eINSTANCE.createOverrides();
			return overrides;
		}

		private WidgetOverrides getWidgetOverrides(Widget widget) {
			if (widgetOverrides == null || this.widget != widget) {
				WidgetOverrides widgetOverrides = OverridesFactory.eINSTANCE
						.createWidgetOverrides();
				widgetOverrides.setRef(getWidgetURI(widget));
				getOverrides().getWidgets().add(widgetOverrides);

				this.widget = widget;
				this.widgetOverrides = widgetOverrides;
			}

			return widgetOverrides;
		}

		private ItemOverrides getItemOverrides(Item item) {
			if (itemOverrides == null || this.item != item) {
				ItemOverrides itemOverrides = OverridesFactory.eINSTANCE
						.createItemOverrides();
				itemOverrides.setRef(getItemURIFragment(item));
				getWidgetOverrides((Widget) item.eContainer()).getItems().add(
						itemOverrides);

				this.item = item;
				this.itemOverrides = itemOverrides;
			}

			return itemOverrides;
		}

		private FontOverrides getFontOverrides(Widget widget) {
			WidgetOverrides wo = getWidgetOverrides(widget);
			if (wo.getFont() == null)
				wo.setFont(OverridesFactory.eINSTANCE.createFontOverrides());
			return wo.getFont();
		}

		private EList<Operation> getWidgetChanges(WidgetContainer container) {
			if (container == leftRoot)
				return getOverrides().getWidgetChanges();
			else if (container.eContainer() instanceof Master)
				return getWidgetOverrides((Widget) container.eContainer())
						.getWidgetChanges();
			else
				return getWidgetOverrides((Widget) container)
						.getWidgetChanges();
		}

		public Overrides calculateOverrides() {
			calculateWidgetUpdates(leftRoot, rightRoot);
			calculateWidgetChanges(leftRoot, rightRoot);

			return overrides;
		}

		private void calculateWidgetChanges(WidgetContainer left,
				WidgetContainer right) {
			EList<Widget> leftValue = left.getWidgets();
			EList<Widget> rightValue = right.getWidgets();
			if (leftValue.size() != 0 || rightValue.size() != 0) {
				Widget[] leftAry = leftValue.toArray(new Widget[leftValue
						.size()]);
				Widget[] rightAry = rightValue.toArray(new Widget[rightValue
						.size()]);
				Edit[] edits = Diff
						.diffWithMoves(leftAry, rightAry, comparator);

				if (edits.length > 0) {
					EList<Operation> operations = getWidgetChanges(left);

					for (int j = 0; j < edits.length; j++) {
						Edit edit = edits[j];

						if (edit.type == Diff.EditType.DELETE) {
							Delete delete = OverridesFactory.eINSTANCE
									.createDelete();
							delete.setRef(getRelativeWidgetURI(leftAry[edit.index0]));
							operations.add(delete);
						} else if (edit.type == Diff.EditType.MOVE) {
							Move move = OverridesFactory.eINSTANCE.createMove();
							move.setRef(getRelativeWidgetURI(leftAry[edit.index0]));
							move.setNewIndex(edit.index1 > edit.index0 ? edit.index1 - 1
									: edit.index1);
							operations.add(move);
						} else if (edit.type == Diff.EditType.INSERT) {
							Insert insert = OverridesFactory.eINSTANCE
									.createInsert();
							insert.setNewIndex(edit.index0);
							Widget addedWidget = rightAry[edit.index1];
							Long sourceId = getSourceWidgetId(addedWidget);
							Widget addedWidgetCopy = reverseInsertCopy(addedWidget);
							if (sourceId != null)
								addedWidgetCopy.setId(sourceId);
							insert.setObject(addedWidgetCopy);
							operations.add(insert);
						}
					}
				}
			}
		}

		private void calculateWidgetUpdates(WidgetContainer left,
				WidgetContainer right) {
			EList<Widget> widgets = left.getWidgets();

			for (Widget leftWidget : widgets) {
				Widget rightWidget = (Widget) copies.get(leftWidget);

				if (rightWidget != null && rightWidget.eContainer() == right) {
					checkAttributes(leftWidget, rightWidget);
					checkFont(leftWidget, rightWidget);
					checkItems(leftWidget, rightWidget);
					checkWidgetUpdates(leftWidget, rightWidget);
				}
			}
		}

		private void checkWidgetUpdates(Widget leftWidget, Widget rightWidget) {
			if (leftWidget instanceof WidgetContainer) {
				WidgetContainer leftContainer = (WidgetContainer) leftWidget;
				WidgetContainer rightContainer = (WidgetContainer) rightWidget;

				calculateWidgetUpdates(leftContainer, rightContainer);
				calculateWidgetChanges(leftContainer, rightContainer);
			} else if (leftWidget instanceof Master) {
				Master leftMaster = (Master) leftWidget;
				Master rightMaster = (Master) rightWidget;

				if (exists(leftMaster.getScreen())
						&& exists(rightMaster.getScreen())) {
					WidgetContainer leftContainer = leftMaster.getInstance();
					WidgetContainer rightContainer = rightMaster.getInstance();

					calculateWidgetUpdates(leftContainer, rightContainer);
					calculateWidgetChanges(leftContainer, rightContainer);
				}
			}
		}

		private void checkItems(Widget leftWidget, Widget rightWidget) {
			if (!(leftWidget instanceof ItemSupport))
				return;

			ItemSupport leftItemSupport = (ItemSupport) leftWidget;
			ItemSupport rightItemSupport = (ItemSupport) rightWidget;

			for (Item leftItem : leftItemSupport.getItems()) {
				Item rightItem = (Item) copies.get(leftItem);

				if (rightItem != null && rightItem.eContainer() == rightWidget) {
					checkItemAttributes(leftItem, rightItem);
				}
			}

			calculateItemChanges(leftItemSupport, rightItemSupport);
		}

		private void calculateItemChanges(ItemSupport leftWidget,
				ItemSupport rightWidget) {
			EList<Item> leftValue = leftWidget.getItems();
			EList<Item> rightValue = rightWidget.getItems();
			if (leftValue.size() != 0 && rightValue.size() != 0) {
				Item[] leftAry = leftValue.toArray(new Item[leftValue.size()]);
				Item[] rightAry = rightValue
						.toArray(new Item[rightValue.size()]);
				Edit[] edits = Diff
						.diffWithMoves(leftAry, rightAry, comparator);

				if (edits.length > 0) {
					EList<Operation> operations = getWidgetOverrides(
							(Widget) leftWidget).getItemChanges();

					for (int j = 0; j < edits.length; j++) {
						Edit edit = edits[j];

						if (edit.type == Diff.EditType.DELETE) {
							Delete delete = OverridesFactory.eINSTANCE
									.createDelete();
							delete.setRef(getItemURIFragment(leftAry[edit.index0]));
							operations.add(delete);
						} else if (edit.type == Diff.EditType.MOVE) {
							Move move = OverridesFactory.eINSTANCE.createMove();
							move.setRef(getItemURIFragment(leftAry[edit.index0]));
							move.setNewIndex(edit.index1 > edit.index0 ? edit.index1 - 1
									: edit.index1);
							operations.add(move);
						} else if (edit.type == Diff.EditType.INSERT) {
							Insert insert = OverridesFactory.eINSTANCE
									.createInsert();
							insert.setNewIndex(edit.index0);
							EObject addedObject = rightAry[edit.index1];
							insert.setObject(EcoreUtil.copy(addedObject));
							operations.add(insert);
						}
					}
				}
			}
		}

		private void checkItemAttributes(Item leftItem, Item rightItem) {
			EClass eClass = leftItem.eClass();

			EList<EAttribute> attributes = eClass.getEAllAttributes();

			for (EAttribute eAttribute : attributes) {
				if (ignoreFeature(eAttribute))
					continue;

				Object leftValue = leftItem.eGet(eAttribute);
				Object rightValue = rightItem.eGet(eAttribute);

				if (!eq(leftValue, rightValue)) {
					EStructuralFeature feature = OverridesPackage.Literals.ITEM_OVERRIDES
							.getEStructuralFeature(eAttribute.getName());
					if (!(feature instanceof EAttribute))
						throw new IllegalStateException();

					ItemOverrides o = getItemOverrides(leftItem);

					if (feature == OverridesPackage.Literals.ITEM_OVERRIDES__LINK)
						o.setNoLink(rightValue == null);

					o.eSet(feature, rightValue);
				}
			}

		}

		private void checkFont(Widget leftWidget, Widget rightWidget) {
			if (!(leftWidget instanceof FontSupport))
				return;

			Font leftFont = ((FontSupport) leftWidget).getFont();
			Font rightFont = ((FontSupport) rightWidget).getFont();

			EClass eClass = leftFont.eClass();

			EList<EAttribute> attributes = eClass.getEAllAttributes();

			for (EAttribute eAttribute : attributes) {
				if (ignoreFeature(eAttribute))
					continue;

				Object leftValue = leftFont.eGet(eAttribute);
				Object rightValue = rightFont.eGet(eAttribute);

				if (!eq(leftValue, rightValue)) {
					EStructuralFeature feature = OverridesPackage.Literals.FONT_OVERRIDES
							.getEStructuralFeature(eAttribute.getName());
					FontOverrides o = getFontOverrides(leftWidget);
					if (!(feature instanceof EAttribute))
						throw new IllegalStateException();

					o.eSet(feature, rightValue);
				}
			}
		}

		private void checkAttributes(Widget leftWidget, Widget rightWidget) {
			EClass eClass = leftWidget.eClass();

			EList<EAttribute> attributes = eClass.getEAllAttributes();

			for (EAttribute eAttribute : attributes) {
				if (ignoreFeature(eAttribute))
					continue;

				Object leftValue = leftWidget.eGet(eAttribute);
				Object rightValue = rightWidget.eGet(eAttribute);

				if (!eq(leftValue, rightValue)) {
					EStructuralFeature feature = OverridesPackage.Literals.WIDGET_OVERRIDES
							.getEStructuralFeature(eAttribute.getName());
					WidgetOverrides o = getWidgetOverrides(leftWidget);
					if (feature != null) {
						if (!(feature instanceof EAttribute))
							throw new IllegalStateException();

						if (feature == OverridesPackage.Literals.WIDGET_OVERRIDES__LINK)
							o.setNoLink(rightValue == null);
						else if (feature == OverridesPackage.Literals.WIDGET_OVERRIDES__TEXT)
							o.setNoText(rightValue == null
									|| "".equals(rightValue));

						o.eSet(feature, rightValue);
					} else {
						o.getAttributes().put(
								eAttribute.getName(),
								EcoreUtil.convertToString(
										eAttribute.getEAttributeType(),
										rightValue));
					}
				}
			}
		}
	}

	private class OverridesUpdater extends Helper {
		private Overrides updatedOverrides;

		public OverridesUpdater(WidgetContainer leftRoot,
				WidgetContainer rightRoot) {
			super(leftRoot, rightRoot);
		}

		public Overrides getUpdatedOverrides() {
			return updatedOverrides;
		}

		public boolean updateOverrides(Overrides overrides,
				Notification notification) {
			EStructuralFeature feature = (EStructuralFeature) notification
					.getFeature();

			if (!(feature instanceof EAttribute))
				return false;

			EAttribute eAttribute = (EAttribute) feature;

			Object notifier = notification.getNotifier();

			if (!(notifier instanceof EObject))
				return false;

			// Make sure we are updating an existing object that didn't change
			// containers
			EObject right = (EObject) notifier;
			EObject left = getReverseCopies().get(right);

			if (left == null)
				return false;

			if (getReverseCopies().get(right.eContainer()) != left.eContainer())
				return false;

			// Get the updated widget
			Widget leftWidget = null;

			if (left instanceof Widget) {
				leftWidget = (Widget) left;
			} else if (left instanceof Item) {
				leftWidget = (Widget) left.eContainer();
			} else if (left instanceof Font) {
				leftWidget = (Widget) left.eContainer();
			}

			if (leftWidget == null)
				return false;

			if (overrides == null)
				overrides = OverridesFactory.eINSTANCE.createOverrides();

			// Get the overrides for the updated widget
			String uri = getWidgetURI(leftWidget);
			WidgetOverrides widgetOverrides = null;
			for (WidgetOverrides wo : overrides.getWidgets()) {
				if (eq(uri, wo.getRef())) {
					widgetOverrides = wo;
					break;
				}
			}

			if (widgetOverrides == null) {
				widgetOverrides = OverridesFactory.eINSTANCE
						.createWidgetOverrides();
				widgetOverrides.setRef(uri);
				overrides.getWidgets().add(widgetOverrides);
			}

			if (left instanceof Widget) {
				// update widget overrides
				Object leftValue = leftWidget.eGet(eAttribute);
				Object rightValue = notification.getNewValue();

				EStructuralFeature f = OverridesPackage.Literals.WIDGET_OVERRIDES
						.getEStructuralFeature(eAttribute.getName());
				if (f != null && !(f instanceof EAttribute))
					throw new IllegalStateException();

				if (!eq(leftValue, rightValue)) {
					if (f != null) {
						if (f == OverridesPackage.Literals.WIDGET_OVERRIDES__LINK)
							widgetOverrides.setNoLink(rightValue == null);
						else if (f == OverridesPackage.Literals.WIDGET_OVERRIDES__TEXT)
							widgetOverrides.setNoText(rightValue == null
									|| "".equals(rightValue));
						widgetOverrides.eSet(f, rightValue);
					} else {
						widgetOverrides.getAttributes().put(
								eAttribute.getName(),
								EcoreUtil.convertToString(
										eAttribute.getEAttributeType(),
										rightValue));
					}
				} else {
					if (f != null) {
						if (f == OverridesPackage.Literals.WIDGET_OVERRIDES__LINK)
							widgetOverrides.setNoLink(false);
						else if (f == OverridesPackage.Literals.WIDGET_OVERRIDES__TEXT)
							widgetOverrides.setNoText(false);
						widgetOverrides.eUnset(f);
					} else {
						widgetOverrides.getAttributes().remove(
								eAttribute.getName());
					}
				}
			} else if (left instanceof Font) {
				FontOverrides fontOverrides = widgetOverrides.getFont();
				if (fontOverrides == null)
					widgetOverrides
							.setFont(fontOverrides = OverridesFactory.eINSTANCE
									.createFontOverrides());

				Object leftValue = left.eGet(eAttribute);
				Object rightValue = notification.getNewValue();

				EStructuralFeature f = OverridesPackage.Literals.FONT_OVERRIDES
						.getEStructuralFeature(eAttribute.getName());
				if (!(f instanceof EAttribute))
					throw new IllegalStateException();

				if (!eq(leftValue, rightValue)) {
					fontOverrides.eSet(f, rightValue);
				} else {
					fontOverrides.eUnset(f);
				}

				if (isEmpty(fontOverrides))
					widgetOverrides.setFont(null);
			} else if (left instanceof Item) {
				String itemURI = getItemURIFragment((Item) left);
				ItemOverrides itemOverrides = null;
				for (ItemOverrides io : widgetOverrides.getItems()) {
					if (eq(itemURI, io.getRef())) {
						itemOverrides = io;
						break;
					}
				}

				if (itemOverrides == null) {
					itemOverrides = OverridesFactory.eINSTANCE
							.createItemOverrides();
					itemOverrides.setRef(itemURI);
					widgetOverrides.getItems().add(itemOverrides);
				}

				Object leftValue = left.eGet(eAttribute);
				Object rightValue = notification.getNewValue();

				EStructuralFeature f = OverridesPackage.Literals.ITEM_OVERRIDES
						.getEStructuralFeature(eAttribute.getName());
				if (!(f instanceof EAttribute))
					throw new IllegalStateException();

				if (!eq(leftValue, rightValue)) {
					if (f == OverridesPackage.Literals.ITEM_OVERRIDES__LINK)
						itemOverrides.setNoLink(rightValue == null);

					itemOverrides.eSet(f, rightValue);
				} else {
					if (f == OverridesPackage.Literals.ITEM_OVERRIDES__LINK)
						itemOverrides.setNoLink(false);
					itemOverrides.eUnset(f);
				}

				if (isEmpty(itemOverrides))
					widgetOverrides.getItems().remove(itemOverrides);
			}

			if (isEmpty(widgetOverrides))
				overrides.getWidgets().remove(widgetOverrides);

			if (isEmpty(overrides))
				overrides = null;

			updatedOverrides = overrides;

			return true;
		}

		private boolean isEmpty(WidgetOverrides widgetOverrides) {
			if (!isEmpty(widgetOverrides.getFont()))
				return false;

			if (!isEmptyFeatures(widgetOverrides))
				return false;

			return true;
		}

		private boolean isEmpty(ItemOverrides itemOverrides) {
			return isEmptyFeatures(itemOverrides);
		}

		private boolean isEmpty(FontOverrides fontOverrides) {
			return isEmptyFeatures(fontOverrides);
		}

		private boolean isEmpty(Overrides overrides) {
			return isEmptyFeatures(overrides);
		}

		private boolean isEmptyFeatures(EObject objectOverrides) {
			if (objectOverrides == null)
				return true;

			EList<EStructuralFeature> features = objectOverrides.eClass()
					.getEAllStructuralFeatures();
			for (EStructuralFeature feature : features) {
				if (feature == OverridesPackage.Literals.REFERENCE__REF)
					continue;

				if (objectOverrides.eIsSet(feature))
					return false;
			}

			return true;
		}
	}

	private class OverridesApplier extends Helper {
		public boolean missingReferences;

		public OverridesApplier(WidgetContainer leftRoot,
				WidgetContainer rightRoot) {
			super(leftRoot, rightRoot);
		}

		public void applyOverrides(Overrides overrides) {
			applyWidgetUpdates(overrides);
			applyWidgetChanges(overrides);
		}

		private void applyWidgetChanges(Overrides overrides) {
			applyWidgetChanges(overrides, leftRoot, rightRoot);
		}

		private void applyWidgetUpdates(Overrides overrides) {
			if (!overrides.eIsSet(OverridesPackage.Literals.OVERRIDES__WIDGETS))
				return;

			for (WidgetOverrides widgetOverrides : overrides.getWidgets()) {
				String uri = getAbsoluteURI(leftRoot, widgetOverrides);

				Widget left = getWidgetForURI(uri);
				if (left == null) {
					missingReferences = true;
					continue;
				}

				Widget right = (Widget) copies.get(left);
				if (right == null)
					continue;

				applyAttributes(widgetOverrides, right);
				applyFont(widgetOverrides, right);
				applyItems(widgetOverrides, left, right);
				applyWidgetChanges(widgetOverrides, left, right);
			}
		}

		private void applyWidgetChanges(WidgetOverrides widgetOverrides,
				Widget left, Widget right) {
			if (left instanceof WidgetContainer) {
				applyWidgetChanges(widgetOverrides, (WidgetContainer) left,
						(WidgetContainer) right);
			} else if (left instanceof Master) {
				Master leftMaster = (Master) left;
				Master rightMaster = (Master) right;
				if (exists(leftMaster.getScreen())
						&& exists(rightMaster.getScreen())) {
					applyWidgetChanges(widgetOverrides,
							leftMaster.getInstance(), rightMaster.getInstance());
				}
			}
		}

		private void applyWidgetChanges(WidgetContainerOverrides overrides,
				WidgetContainer left, WidgetContainer right) {
			if (!overrides
					.eIsSet(OverridesPackage.Literals.WIDGET_CONTAINER_OVERRIDES__WIDGET_CHANGES))
				return;

			EList<Widget> widgets = right.getWidgets();

			for (Operation operation : overrides.getWidgetChanges()) {
				if (operation instanceof Delete) {
					Delete delete = (Delete) operation;
					Widget leftChild = getWidgetForURI(getAbsoluteURI(left,
							delete));
					if (leftChild == null)
						continue;

					Widget rightChild = (Widget) copies.get(leftChild);
					if (rightChild != null)
						widgets.remove(rightChild);
				} else if (operation instanceof Move) {
					Move move = (Move) operation;

					Widget leftChild = getWidgetForURI(getAbsoluteURI(left,
							move));
					if (leftChild == null)
						continue;

					Widget rightChild = (Widget) copies.get(leftChild);
					if (rightChild != null) {
						int newIndex = move.getNewIndex();
						if (newIndex >= widgets.size())
							newIndex = widgets.size() - 1;
						widgets.move(newIndex, rightChild);
					}
				} else if (operation instanceof Insert) {
					Insert insert = (Insert) operation;
					int newIndex = insert.getNewIndex();
					if (newIndex > widgets.size())
						newIndex = widgets.size();
					EObject object = insert.getObject();
					if (object instanceof Widget) {
						Widget widget = insertCopy((Widget) object);
						widgets.add(newIndex, widget);
					}
				}
			}
		}

		private void applyItems(WidgetOverrides widgetOverrides, Widget left,
				Widget right) {
			if (!(right instanceof ItemSupport))
				return;

			if (widgetOverrides
					.eIsSet(OverridesPackage.Literals.WIDGET_OVERRIDES__ITEMS)) {
				for (ItemOverrides itemOverrides : widgetOverrides.getItems()) {
					Item leftItem = getItemForURIFragment(left,
							itemOverrides.getRef());
					if (leftItem == null)
						continue;
					Item rightItem = (Item) copies.get(leftItem);
					if (rightItem == null)
						continue;

					applyObjectAttributes(itemOverrides, rightItem);
				}
			}

			applyItemChanges(widgetOverrides, (ItemSupport) left,
					(ItemSupport) right);
		}

		private void applyItemChanges(WidgetOverrides widgetOverrides,
				ItemSupport left, ItemSupport right) {
			if (!widgetOverrides
					.eIsSet(OverridesPackage.Literals.WIDGET_OVERRIDES__ITEM_CHANGES))
				return;

			EList<Item> items = right.getItems();

			for (Operation operation : widgetOverrides.getItemChanges()) {
				if (operation instanceof Delete) {
					Delete delete = (Delete) operation;
					Item leftItem = getItemForURIFragment(left, delete.getRef());
					if (leftItem == null)
						continue;

					Item rightItem = (Item) copies.get(leftItem);
					if (rightItem != null)
						items.remove(rightItem);
				} else if (operation instanceof Move) {
					Move move = (Move) operation;

					Item leftItem = getItemForURIFragment(left, move.getRef());
					if (leftItem == null)
						continue;

					Item rightItem = (Item) copies.get(leftItem);
					if (rightItem != null) {
						int newIndex = move.getNewIndex();
						if (newIndex >= items.size())
							newIndex = items.size() - 1;
						items.move(newIndex, rightItem);
					}
				} else if (operation instanceof Insert) {
					Insert insert = (Insert) operation;
					int newIndex = insert.getNewIndex();
					if (newIndex > items.size())
						newIndex = items.size();
					EObject object = insert.getObject();
					if (object instanceof Item)
						items.add(newIndex, (Item) EcoreUtil.copy(object));
				}
			}
		}

		private void applyObjectAttributes(EObject objectOverrides,
				EObject object) {
			EList<EAttribute> attributes = objectOverrides.eClass()
					.getEAllAttributes();
			EClass eClass = object.eClass();
			for (EAttribute eAttribute : attributes) {
				if (eAttribute == OverridesPackage.Literals.REFERENCE__REF)
					continue;
				if (!objectOverrides.eIsSet(eAttribute))
					continue;

				if (eAttribute == OverridesPackage.Literals.WIDGET_OVERRIDES__NO_LINK) {
					EStructuralFeature feature = eClass
							.getEStructuralFeature(OverridesPackage.Literals.WIDGET_OVERRIDES__LINK
									.getName());
					if (!(feature instanceof EAttribute))
						continue;

					object.eUnset(feature);
				} else if (eAttribute == OverridesPackage.Literals.WIDGET_OVERRIDES__NO_TEXT) {
					EStructuralFeature feature = eClass
							.getEStructuralFeature(OverridesPackage.Literals.WIDGET_OVERRIDES__TEXT
									.getName());
					if (!(feature instanceof EAttribute))
						continue;

					object.eUnset(feature);
				} else if (eAttribute == OverridesPackage.Literals.ITEM_OVERRIDES__NO_LINK) {
					EStructuralFeature feature = eClass
							.getEStructuralFeature(OverridesPackage.Literals.ITEM_OVERRIDES__LINK
									.getName());
					if (!(feature instanceof EAttribute))
						continue;

					object.eUnset(feature);
				} else {
					EStructuralFeature feature = eClass
							.getEStructuralFeature(eAttribute.getName());
					if (!(feature instanceof EAttribute))
						continue;

					object.eSet(feature, objectOverrides.eGet(eAttribute));
				}
			}
		}

		private void applyFont(WidgetOverrides widgetOverrides, Widget right) {
			if (!(right instanceof FontSupport))
				return;
			FontOverrides fontOverrides = widgetOverrides.getFont();
			if (fontOverrides == null)
				return;

			Font font = ((FontSupport) right).getFont();

			applyObjectAttributes(fontOverrides, font);
		}

		private void applyAttributes(WidgetOverrides widgetOverrides,
				Widget widget) {
			applyObjectAttributes(widgetOverrides, widget);

			if (widgetOverrides
					.eIsSet(OverridesPackage.Literals.WIDGET_OVERRIDES__ATTRIBUTES)) {
				EClass eClass = widget.eClass();
				EMap<String, String> map = widgetOverrides.getAttributes();
				for (Entry<String, String> entry : map.entrySet()) {
					EStructuralFeature feature = eClass
							.getEStructuralFeature(entry.getKey());
					if (!(feature instanceof EAttribute))
						continue;

					widget.eSet(feature, EcoreUtil.createFromString(
							((EAttribute) feature).getEAttributeType(),
							entry.getValue()));
				}
			}
		}
	}
}
