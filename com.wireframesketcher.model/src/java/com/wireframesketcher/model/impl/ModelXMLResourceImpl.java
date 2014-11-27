package com.wireframesketcher.model.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import com.wireframesketcher.model.Master;
import com.wireframesketcher.model.NameSupport;
import com.wireframesketcher.model.Screen;
import com.wireframesketcher.model.Widget;
import com.wireframesketcher.model.story.Panel;
import com.wireframesketcher.model.story.impl.PanelImpl;
import com.wireframesketcher.model.util.WidgetTreeIterator;

public class ModelXMLResourceImpl extends XMLResourceImpl {
	private long nextWidgetId;

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
				return encodeFragment(name);
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
		return Long.valueOf(++nextWidgetId);
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
		computeMaxWidgetId();
	}

	private void computeMaxWidgetId() {
		for (TreeIterator<Widget> i = getAllDirectWidgets(); i.hasNext();) {
			Widget widget = i.next();
			Long id = widget.getId();
			if (id != null)
				nextWidgetId = Math.max(nextWidgetId, id.longValue());
		}
	}

	private WidgetTreeIterator getAllDirectWidgets() {
		EList<EObject> contents = getContents();
		return new WidgetTreeIterator(contents.isEmpty() ? null
				: contents.get(0), false);
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

		while (object != null && !(object instanceof Screen)) {
			object = object.eContainer();
			if (object instanceof Master)
				return false;
		}

		return object instanceof Screen && getContents().contains(object);
	}

	private static final String[] ESCAPE = { "%00", "%01", "%02", "%03", "%04",
			"%05", "%06", "%07", "%08", "%09", "%0A", "%0B", "%0C", "%0D",
			"%0E", "%0F", "%10", "%11", "%12", "%13", "%14", "%15", "%16",
			"%17", "%18", "%19", "%1A", "%1B", "%1C", "%1D", "%1E", "%1F",
			"%20", null, "%22", "%23", null, "%25", "%26", "%27", null, null,
			null, null, "%2C", null, null, "%2F", null, null, null, null, null,
			null, null, null, null, null, "%3A", null, "%3C", null, "%3E",
			null, };

	private static String encodeFragment(String s) {
		int length = s.length();
		StringBuilder result = new StringBuilder(length + 2);
		for (int i = 0; i < length; ++i) {
			char character = s.charAt(i);
			if (character < ESCAPE.length) {
				String escape = ESCAPE[character];
				if (escape != null) {
					result.append(escape);
					continue;
				}
			}
			result.append(character);
		}
		return result.toString();
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
