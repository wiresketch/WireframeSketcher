package com.wireframesketcher.model.impl;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
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
import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.Widget;
import com.wireframesketcher.model.WidgetContainer;
import com.wireframesketcher.model.impl.Diff.Edit;
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
class OverridesHelper {
	private final MasterImpl master;

	private boolean computingOverrides;

	private Map<EObject, EObject> copies, reverseCopies;

	private boolean staleInstance;

	private final Adapter masterAdapter = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification msg) {
			if (msg.getFeature() == ModelPackage.Literals.MASTER__SCREEN) {
				staleInstance = true;

				// lazy computation
				if (master.eIsSet(ModelPackage.Literals.MASTER__INSTANCE))
					computeInstance();
			} else if (msg.getFeature() == ModelPackage.Literals.MASTER__OVERRIDES) {
				if (computingOverrides)
					return;

				staleInstance = true;

				// lazy computation
				if (master.eIsSet(ModelPackage.Literals.MASTER__INSTANCE))
					computeInstance();
			}
		}
	};

	private final Adapter instanceChangeTracker = new EContentAdapter() {
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);

			if (!notification.isTouch()) {
				EStructuralFeature feature = (EStructuralFeature) notification
						.getFeature();

				if (feature != null && !ignoreFeature(feature)) {
					// We are interested only in widgets list changes on top
					// object
					if (notification.getNotifier() == master.instance
							&& feature != ModelPackage.Literals.WIDGET_CONTAINER__WIDGETS)
						return;

					if (!updateOverrides(notification))
						computeOverrides();
				}
			}
		};
	};

	private final Comparator<EObject> comparator = new Comparator<EObject>() {
		public int compare(EObject left, EObject right) {
			return copies.get(left) == right ? 0 : 1;
		}
	};

	public OverridesHelper(final MasterImpl master) {
		this.master = master;

		master.eAdapters().add(masterAdapter);
	}

	public void computeInstance() {
		if (!staleInstance)
			return;

		cleanupOldInstance();

		WidgetContainer screen = master.getScreen();
		WidgetContainer instance = null;

		if (screen != null && !screen.eIsProxy()) {
			Copier copier = new Copier();
			EObject result = copier.copy(screen);
			copier.copyReferences();

			copies = copier;

			instance = (WidgetContainer) result;
			applyOverrides(instance);

			instance.eAdapters().add(instanceChangeTracker);
		}

		staleInstance = false;
		master.setInstance(instance);
	}

	private void applyOverrides(WidgetContainer instance) {
		Overrides overrides = master.getOverrides();
		if (overrides == null)
			return;

		try {
			new OverridesApplier(master.getScreen(), instance)
					.applyOverrides(overrides);
		} catch (Exception e) {
			// Never fail
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

	public Map<EObject, EObject> getReverseCopies() {
		if (reverseCopies == null)
			reverseCopies = computeReverseMap(copies);
		return reverseCopies;
	}

	private static Map<EObject, EObject> computeReverseMap(
			Map<EObject, EObject> map) {
		Map<EObject, EObject> reverseMap = new HashMap<EObject, EObject>(map
				.size());

		for (Entry<EObject, EObject> entry : map.entrySet())
			reverseMap.put(entry.getValue(), entry.getKey());

		return reverseMap;
	}

	private void computeOverrides() {
		setOverrides(new OverridesCalculator(master.getScreen(),
				master.instance).calculateOverrides());
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
		Overrides overrides = master.getOverrides();

		OverridesUpdater updater = new OverridesUpdater(master.getScreen(),
				master.instance);
		boolean updated = updater.updateOverrides(overrides, notification);

		if (updated) {
			if (updater.getUpdatedOverrides() != overrides)
				setOverrides(updater.getUpdatedOverrides());
		}

		return updated;
	}

	private static boolean ignoreFeature(EStructuralFeature feature) {
		return !feature.isChangeable() || feature.isDerived()
				|| feature.isTransient();
	}

	static class Helper {
		protected final WidgetContainer leftRoot, rightRoot;

		private String leftUri;

		public Helper(WidgetContainer leftRoot, WidgetContainer rightRoot) {
			this.leftRoot = leftRoot;
			this.rightRoot = rightRoot;
		}

		protected String getURIFragment(EObject object) {
			return ((InternalEObject) object.eContainer()).eURIFragmentSegment(
					object.eContainingFeature(), object);
		}

		protected String getRelativeURI(EObject object) {
			String uri = getURI(object);
			String containerUri = getURI(object.eContainer());
			if (uri.startsWith(containerUri)) {
				uri = uri.substring(containerUri.length());
				if (uri.length() == 0)
					uri = null;
			}
			return uri;
		}

		protected String getURI(EObject object) {
			return ((ModelXMLResourceImpl) leftRoot.eResource())
					.getDefaultURIFragment(object);
		}

		protected String getLeftURI() {
			if (leftUri == null)
				leftUri = getURI(leftRoot);
			return leftUri;
		}

		protected EObject getObjectForURIFragment(EObject container,
				String uriFragment) {
			if (uriFragment == null)
				return null;

			return ((InternalEObject) container)
					.eObjectForURIFragmentSegment(uriFragment);
		}

		protected EObject getObjectForURI(String uri) {
			if (uri == null)
				return null;

			try {
				return leftRoot.eResource().getEObject(uri);
			} catch (Exception e) {
				EcorePlugin.INSTANCE.log(e);
				return null;
			}
		}

		protected String getAbsoluteURI(Reference ref) {
			String uri = ref.getRef();
			if (uri == null)
				return null;

			if (uri.startsWith("/"))
				uri = getLeftURI() + uri;
			return uri;
		}

		protected String getWidgetURI(Widget widget) {
			String uri = getURI(widget);
			String leftUri = getLeftURI();
			if (uri.startsWith(leftUri)) {
				uri = uri.substring(leftUri.length());
				if (uri.length() == 0)
					uri = null;
			}
			return uri;
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
				itemOverrides.setRef(getURIFragment(item));
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
			return getWidgetOverrides((Widget) container).getWidgetChanges();
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
			if (leftValue.size() != 0 && rightValue.size() != 0) {
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
							delete.setRef(getRelativeURI(leftAry[edit.index0]));
							operations.add(delete);
						} else if (edit.type == Diff.EditType.MOVE) {
							Move move = OverridesFactory.eINSTANCE.createMove();
							move.setRef(getRelativeURI(leftAry[edit.index0]));
							move
									.setNewIndex(edit.index1 > edit.index0 ? edit.index1 - 1
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
			if (!(leftWidget instanceof WidgetContainer))
				return;

			WidgetContainer leftContainer = (WidgetContainer) leftWidget;
			WidgetContainer rightContainer = (WidgetContainer) rightWidget;

			calculateWidgetUpdates(leftContainer, rightContainer);
			calculateWidgetChanges(leftContainer, rightContainer);
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
							delete.setRef(getURIFragment(leftAry[edit.index0]));
							operations.add(delete);
						} else if (edit.type == Diff.EditType.MOVE) {
							Move move = OverridesFactory.eINSTANCE.createMove();
							move.setRef(getURIFragment(leftAry[edit.index0]));
							move
									.setNewIndex(edit.index1 > edit.index0 ? edit.index1 - 1
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

						o.eSet(feature, rightValue);
					} else {
						o.getAttributes().put(
								eAttribute.getName(),
								EcoreUtil.convertToString(eAttribute
										.getEAttributeType(), rightValue));
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
						widgetOverrides.eSet(f, rightValue);
					} else {
						widgetOverrides.getAttributes().put(
								eAttribute.getName(),
								EcoreUtil.convertToString(eAttribute
										.getEAttributeType(), rightValue));
					}
				} else {
					if (f != null) {
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
				String itemURI = getURIFragment(left);
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
					itemOverrides.eSet(f, rightValue);
				} else {
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
				String uri = getAbsoluteURI(widgetOverrides);

				EObject eObject = getObjectForURI(uri);
				if (!(eObject instanceof Widget))
					continue;

				Widget left = (Widget) eObject;
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
			if (!(left instanceof WidgetContainer))
				return;

			applyWidgetChanges(widgetOverrides, (WidgetContainer) left,
					(WidgetContainer) right);
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
					EObject eObject = getObjectForURI(getAbsoluteURI(delete));
					if (!(eObject instanceof Widget))
						continue;

					Widget rightChild = (Widget) copies.get(eObject);
					if (rightChild != null)
						widgets.remove(rightChild);
				} else if (operation instanceof Move) {
					Move move = (Move) operation;

					EObject eObject = getObjectForURI(getAbsoluteURI(move));
					if (!(eObject instanceof Widget))
						continue;

					Widget rightChild = (Widget) copies.get(eObject);
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
					if (object instanceof Widget)
						widgets.add(newIndex, (Widget) EcoreUtil.copy(object));
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
					EObject eObject = getObjectForURIFragment(left,
							itemOverrides.getRef());
					if (!(eObject instanceof Item))
						continue;
					Item item = (Item) copies.get(eObject);
					if (item == null)
						continue;

					applyObjectAttributes(itemOverrides, item);
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
					EObject eObject = getObjectForURIFragment(left, delete
							.getRef());
					if (!(eObject instanceof Item))
						continue;

					Item rightItem = (Item) copies.get(eObject);
					if (rightItem != null)
						items.remove(rightItem);
				} else if (operation instanceof Move) {
					Move move = (Move) operation;

					EObject eObject = getObjectForURIFragment(left, move
							.getRef());
					if (!(eObject instanceof Item))
						continue;

					Item rightItem = (Item) copies.get(eObject);
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

				EStructuralFeature feature = eClass
						.getEStructuralFeature(eAttribute.getName());
				if (!(feature instanceof EAttribute))
					continue;

				object.eSet(feature, objectOverrides.eGet(eAttribute));
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
							((EAttribute) feature).getEAttributeType(), entry
									.getValue()));
				}
			}
		}
	}
}
