package com.wireframesketcher.model.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import com.wireframesketcher.model.Master;
import com.wireframesketcher.model.ModelResource;
import com.wireframesketcher.model.NameSupport;
import com.wireframesketcher.model.Screen;
import com.wireframesketcher.model.Widget;
import com.wireframesketcher.model.overrides.Insert;
import com.wireframesketcher.model.overrides.Operation;
import com.wireframesketcher.model.overrides.Overrides;
import com.wireframesketcher.model.overrides.OverridesPackage;
import com.wireframesketcher.model.overrides.WidgetContainerOverrides;
import com.wireframesketcher.model.overrides.WidgetOverrides;
import com.wireframesketcher.model.story.Panel;
import com.wireframesketcher.model.story.impl.PanelImpl;
import com.wireframesketcher.model.util.WidgetTreeIterator;

public class ModelXMLResourceImpl extends XMLResourceImpl implements ModelResource {
	private long maxWidgetId;

	public ModelXMLResourceImpl() {
		super();
	}

	public ModelXMLResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	protected void init() {
		super.init();
		setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
	}

	@Override
	protected XMLHelper createXMLHelper() {
		return new ModelXMLHelperImpl(this);
	}

	@Override
	public String getURIFragment(EObject object) {
		if (object instanceof NameSupport) {
			String name = ((NameSupport) object).getName();
			if (name != null)
				return URI.encodeFragment(name, false);
		}

		return super.getURIFragment(object);
	}

	public String getDefaultURIFragment(EObject object) {
		return super.getURIFragment(object);
	}

	@Override
	public EObject getEObject(String uriFragment) {
		EList<EObject> contents = getContents();
		String name = URI.decode(uriFragment);
		for (int i = 0; i < contents.size(); i++) {
			EObject root = contents.get(i);

			EList<EObject> children = root.eContents();
			for (int j = 0; j < children.size(); j++) {
				EObject child = children.get(j);

				if (child instanceof NameSupport
						&& name.equals(((NameSupport) child).getName()))
					return child;
			}
		}

		return super.getEObject(uriFragment);
	}

	@Override
	protected void doUnload() {
		super.doUnload();

		getIntrinsicIDToEObjectMap().clear();
	}

	@Override
	protected void attachedHelper(EObject eObject) {
		if (eObject instanceof Widget) {
			Widget widget = (Widget) eObject;
			Long id = widget.getId();

			if (id == null && !isLoading() && isDirectWidget(widget))
				assignWidgetId(widget);
		} else if (eObject instanceof Panel) {
			Panel panel = (Panel) eObject;
			String id = panel.getId();

			if (id == null)
				assignPanelId(panel);
		}

		super.attachedHelper(eObject);
	}

	private void assignPanelId(Panel panel) {
		panel.setId(generatePanelId(panel));
	}

	private String generatePanelId(Panel panel) {
		return PanelUUID.generateUUID(this, panel);
	}

	private void assignWidgetId(Widget widget) {
		widget.setId(generateNextWidgetId());
	}

	private Long generateNextWidgetId() {
		return Long.valueOf(++maxWidgetId);
	}

	@Override
	public void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		assignMissingIds();
		super.doSave(outputStream, options);
	}

	@Override
	public void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		super.doLoad(inputStream, options);
		maxWidgetId = computeMaxWidgetId();
	}

	private long computeMaxWidgetId() {
		long maxId = 0;

		for (TreeIterator<Widget> i = getAllDirectWidgets(); i.hasNext();) {
			Widget widget = i.next();
			Long id = widget.getId();
			if (id != null)
				maxId = Math.max(maxId, id.longValue());
		}

		return maxId;
	}

	private WidgetTreeIterator getAllDirectWidgets() {
		EList<EObject> contents = getContents();
		return new DirectWidgetsIterator(contents.isEmpty() ? null
				: contents.get(0));
	}

	/**
	 * This implementation handles components by descending into overrides and
	 * iterating over inserted widgets which are direct children of this
	 * resource.
	 */
	protected static class DirectWidgetsIterator extends WidgetTreeIterator {
		public DirectWidgetsIterator(Object object) {
			super(object, true);
		}

		@Override
		protected Iterator<? extends Widget> getComponentChildren(Master master) {
			Overrides overrides = master.getOverrides();
			if (overrides != null) {
				List<Widget> children = new BasicEList<Widget>();

				if (overrides
						.eIsSet(OverridesPackage.Literals.OVERRIDES__WIDGETS)) {
					EList<WidgetOverrides> widgets = overrides.getWidgets();
					for (int j = 0, jSz = widgets.size(); j < jSz; j++) {
						WidgetContainerOverrides widgetOverrides = widgets
								.get(j);
						collectInsertedWidgets(widgetOverrides, children);
					}
				}
				collectInsertedWidgets(overrides, children);

				if (!children.isEmpty())
					return children.iterator();
			}

			return ECollections.<Widget> emptyEList().iterator();
		}

		private void collectInsertedWidgets(
				WidgetContainerOverrides widgetOverrides, List<Widget> widgets) {

			if (widgetOverrides
					.eIsSet(OverridesPackage.Literals.WIDGET_CONTAINER_OVERRIDES__WIDGET_CHANGES)) {
				EList<Operation> changes = widgetOverrides.getWidgetChanges();
				for (int i = 0, sz = changes.size(); i < sz; i++) {
					Operation operation = changes.get(i);
					if (operation instanceof Insert) {
						Insert insert = (Insert) operation;
						EObject object = insert.getObject();
						if (object instanceof Widget) {
							widgets.add((Widget) object);
						}
					}
				}
			}
		}
	}

	private void assignMissingIds() {
		for (TreeIterator<Widget> i = getAllDirectWidgets(); i.hasNext();) {
			Widget widget = i.next();
			if (widget.getId() == null)
				assignWidgetId(widget);
		}
	}

	private boolean isDirectWidget(Widget widget) {
		EObject object = widget;
		boolean insertedObject = false;

		while (object != null && !(object instanceof Screen)) {
			object = object.eContainer();
			if (object instanceof Insert)
				insertedObject = true;
			else if (object instanceof Master && !insertedObject)
				return false;
		}

		return object instanceof Screen && getContents().contains(object);
	}

	/**
	 * Generate a stable but unique panel id. Stable means that the same id is
	 * generated repeatedly for the same panel. The id must be unique across all
	 * panels in the storyboard and account for nested storyboards and the
	 * possibility that the same screen can be present multiple times.
	 */
	private static class PanelUUID {
		public static String generateUUID(ModelXMLResourceImpl resource,
				Panel panel) {
			int counter = 0;
			String id;
			try {
				do {
					id = generateUUID(panel, counter++);
					counter++;
				} while (resource.getIntrinsicIDToEObjectMap().get(id) != null);
			} catch (NoSuchAlgorithmException e) {
				throw new RuntimeException(e);
			} catch (UnsupportedEncodingException e) {
				throw new RuntimeException(e);
			}

			return id;
		}

		private static String generateUUID(Panel panel, int sequence)
				throws NoSuchAlgorithmException, UnsupportedEncodingException {
			MessageDigest sig = MessageDigest.getInstance("SHA-1");
			URI storyURI = getStoryURI(panel);
			if (storyURI != null)
				sig.update(storyURI.toString().getBytes("UTF-8"));
			URI panelURI = getPanelURI(panel);
			if (panelURI != null)
				sig.update(panelURI.toString().getBytes("UTF-8"));
			sig.update((byte) ((sequence >> 24) & 0xFF));
			sig.update((byte) ((sequence >> 16) & 0xFF));
			sig.update((byte) ((sequence >> 8) & 0xFF));
			sig.update((byte) (sequence & 0xFF));
			byte[] bytes = sig.digest();
			return Base64.encode(bytes);
		}

		private static URI getPanelURI(Panel panel) {
			EObject ref = ((PanelImpl) panel).basicGetScreen();
			if (ref == null)
				ref = ((PanelImpl) panel).basicGetStory();
			return getURI(ref);
		}

		private static URI getStoryURI(Panel panel) {
			return getURI(panel);
		}

		private static URI getURI(EObject obj) {
			if (obj == null)
				return null;

			if (obj.eIsProxy())
				return ((InternalEObject) obj).eProxyURI();
			else if (obj.eResource() != null)
				return obj.eResource().getURI();

			return null;
		}
	}

	private static class Base64 {
		private Base64() {
		}

		private static final char[] BYTE_TO_BASE64 = { 'A', 'B', 'C', 'D', 'E',
				'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c',
				'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
				'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0',
				'1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_' };

		private static final char PAD_CHAR = '=';

		/**
		 * Encodes the given byte array using Base64 encoding
		 * 
		 * @param bytes
		 *            the byte array
		 * @return the Base64 string
		 */
		public static String encode(byte[] bytes) {
			if (bytes == null)
				return null;

			StringBuilder buffer = new StringBuilder(
					4 * ((bytes.length + 2) / 3));

			int i = 0;

			while (i + 2 < bytes.length) {
				int b0 = bytes[i++] & 0xFF;
				int b1 = bytes[i++] & 0xFF;
				int b2 = bytes[i++] & 0xFF;
				buffer.append(BYTE_TO_BASE64[b0 >> 2]);
				buffer.append(BYTE_TO_BASE64[(b0 << 4) & 0x3F | (b1 >> 4)]);
				buffer.append(BYTE_TO_BASE64[(b1 << 2) & 0x3F | (b2 >> 6)]);
				buffer.append(BYTE_TO_BASE64[b2 & 0x3F]);
			}

			if (i + 1 == bytes.length) {
				int b0 = bytes[i++] & 0xFF;
				buffer.append(BYTE_TO_BASE64[b0 >> 2]);
				buffer.append(BYTE_TO_BASE64[(b0 << 4) & 0x3F]);
				buffer.append(PAD_CHAR);
				buffer.append(PAD_CHAR);
			} else if (i + 2 == bytes.length) {
				int b0 = bytes[i++] & 0xFF;
				int b1 = bytes[i++] & 0xFF;
				buffer.append(BYTE_TO_BASE64[b0 >> 2]);
				buffer.append(BYTE_TO_BASE64[(b0 << 4) & 0x3F | (b1 >> 4)]);
				buffer.append(BYTE_TO_BASE64[(b1 << 2) & 0x3F]);
				buffer.append(PAD_CHAR);
			}

			return buffer.toString();
		}
	}
}
