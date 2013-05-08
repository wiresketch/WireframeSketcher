/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import com.wireframesketcher.model.ColorAlphaSupport;
import com.wireframesketcher.model.ColorBackgroundSupport;
import com.wireframesketcher.model.ColorDesc;
import com.wireframesketcher.model.ColorForegroundSupport;
import com.wireframesketcher.model.FlipSupport;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.wireframesketcher.model.LinkSupport;
import com.wireframesketcher.model.ModelFactory;
import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.Rotation90;
import com.wireframesketcher.model.RotationSupport;
import com.wireframesketcher.model.ResizeMode;
import com.wireframesketcher.model.SVGImage;
import com.wireframesketcher.model.WidgetDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SVG Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.impl.SVGImageImpl#getLink <em>Link</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.SVGImageImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.SVGImageImpl#getForeground <em>Foreground</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.SVGImageImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.SVGImageImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.SVGImageImpl#isHFlip <em>HFlip</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.SVGImageImpl#isVFlip <em>VFlip</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.SVGImageImpl#getSrc <em>Src</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SVGImageImpl extends WidgetImpl implements SVGImage {
	/**
	 * The default value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected static final URI LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected URI link = LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final ColorDesc BACKGROUND_EDEFAULT = (ColorDesc)ModelFactory.eINSTANCE.createFromString(ModelPackage.eINSTANCE.getColorDataType(), "white");

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected ColorDesc background = BACKGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getForeground() <em>Foreground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeground()
	 * @generated
	 * @ordered
	 */
	protected static final ColorDesc FOREGROUND_EDEFAULT = (ColorDesc)ModelFactory.eINSTANCE.createFromString(ModelPackage.eINSTANCE.getColorDataType(), "black");

	/**
	 * The cached value of the '{@link #getForeground() <em>Foreground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeground()
	 * @generated
	 * @ordered
	 */
	protected ColorDesc foreground = FOREGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final int ALPHA_EDEFAULT = 255;

	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected int alpha = ALPHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final Rotation90 ROTATION_EDEFAULT = Rotation90._0;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected Rotation90 rotation = ROTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isHFlip() <em>HFlip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHFlip()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HFLIP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHFlip() <em>HFlip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHFlip()
	 * @generated
	 * @ordered
	 */
	protected boolean hFlip = HFLIP_EDEFAULT;

	/**
	 * The default value of the '{@link #isVFlip() <em>VFlip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVFlip()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VFLIP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVFlip() <em>VFlip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVFlip()
	 * @generated
	 * @ordered
	 */
	protected boolean vFlip = VFLIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected static final URI SRC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected URI src = SRC_EDEFAULT;

	private static final WidgetDescriptor DESCRIPTOR = describe("SVG Image", ResizeMode.BOTH_LITERAL, false, false);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SVGImageImpl() {
		super();
		descriptor = DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SVG_IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(URI newLink) {
		URI oldLink = link;
		link = newLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SVG_IMAGE__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorDesc getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(ColorDesc newBackground) {
		ColorDesc oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SVG_IMAGE__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorDesc getForeground() {
		return foreground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeground(ColorDesc newForeground) {
		ColorDesc oldForeground = foreground;
		foreground = newForeground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SVG_IMAGE__FOREGROUND, oldForeground, foreground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlpha(int newAlpha) {
		int oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SVG_IMAGE__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotation90 getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(Rotation90 newRotation) {
		Rotation90 oldRotation = rotation;
		rotation = newRotation == null ? ROTATION_EDEFAULT : newRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SVG_IMAGE__ROTATION, oldRotation, rotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(URI newSrc) {
		URI oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SVG_IMAGE__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHFlip() {
		return hFlip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHFlip(boolean newHFlip) {
		boolean oldHFlip = hFlip;
		hFlip = newHFlip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SVG_IMAGE__HFLIP, oldHFlip, hFlip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVFlip() {
		return vFlip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVFlip(boolean newVFlip) {
		boolean oldVFlip = vFlip;
		vFlip = newVFlip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SVG_IMAGE__VFLIP, oldVFlip, vFlip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.SVG_IMAGE__LINK:
				return getLink();
			case ModelPackage.SVG_IMAGE__BACKGROUND:
				return getBackground();
			case ModelPackage.SVG_IMAGE__FOREGROUND:
				return getForeground();
			case ModelPackage.SVG_IMAGE__ALPHA:
				return getAlpha();
			case ModelPackage.SVG_IMAGE__ROTATION:
				return getRotation();
			case ModelPackage.SVG_IMAGE__HFLIP:
				return isHFlip();
			case ModelPackage.SVG_IMAGE__VFLIP:
				return isVFlip();
			case ModelPackage.SVG_IMAGE__SRC:
				return getSrc();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.SVG_IMAGE__LINK:
				setLink((URI)newValue);
				return;
			case ModelPackage.SVG_IMAGE__BACKGROUND:
				setBackground((ColorDesc)newValue);
				return;
			case ModelPackage.SVG_IMAGE__FOREGROUND:
				setForeground((ColorDesc)newValue);
				return;
			case ModelPackage.SVG_IMAGE__ALPHA:
				setAlpha((Integer)newValue);
				return;
			case ModelPackage.SVG_IMAGE__ROTATION:
				setRotation((Rotation90)newValue);
				return;
			case ModelPackage.SVG_IMAGE__HFLIP:
				setHFlip((Boolean)newValue);
				return;
			case ModelPackage.SVG_IMAGE__VFLIP:
				setVFlip((Boolean)newValue);
				return;
			case ModelPackage.SVG_IMAGE__SRC:
				setSrc((URI)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.SVG_IMAGE__LINK:
				setLink(LINK_EDEFAULT);
				return;
			case ModelPackage.SVG_IMAGE__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case ModelPackage.SVG_IMAGE__FOREGROUND:
				setForeground(FOREGROUND_EDEFAULT);
				return;
			case ModelPackage.SVG_IMAGE__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case ModelPackage.SVG_IMAGE__ROTATION:
				setRotation(ROTATION_EDEFAULT);
				return;
			case ModelPackage.SVG_IMAGE__HFLIP:
				setHFlip(HFLIP_EDEFAULT);
				return;
			case ModelPackage.SVG_IMAGE__VFLIP:
				setVFlip(VFLIP_EDEFAULT);
				return;
			case ModelPackage.SVG_IMAGE__SRC:
				setSrc(SRC_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.SVG_IMAGE__LINK:
				return LINK_EDEFAULT == null ? link != null : !LINK_EDEFAULT.equals(link);
			case ModelPackage.SVG_IMAGE__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case ModelPackage.SVG_IMAGE__FOREGROUND:
				return FOREGROUND_EDEFAULT == null ? foreground != null : !FOREGROUND_EDEFAULT.equals(foreground);
			case ModelPackage.SVG_IMAGE__ALPHA:
				return alpha != ALPHA_EDEFAULT;
			case ModelPackage.SVG_IMAGE__ROTATION:
				return rotation != ROTATION_EDEFAULT;
			case ModelPackage.SVG_IMAGE__HFLIP:
				return hFlip != HFLIP_EDEFAULT;
			case ModelPackage.SVG_IMAGE__VFLIP:
				return vFlip != VFLIP_EDEFAULT;
			case ModelPackage.SVG_IMAGE__SRC:
				return SRC_EDEFAULT == null ? src != null : !SRC_EDEFAULT.equals(src);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == LinkSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.SVG_IMAGE__LINK: return ModelPackage.LINK_SUPPORT__LINK;
				default: return -1;
			}
		}
		if (baseClass == ColorBackgroundSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.SVG_IMAGE__BACKGROUND: return ModelPackage.COLOR_BACKGROUND_SUPPORT__BACKGROUND;
				default: return -1;
			}
		}
		if (baseClass == ColorForegroundSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.SVG_IMAGE__FOREGROUND: return ModelPackage.COLOR_FOREGROUND_SUPPORT__FOREGROUND;
				default: return -1;
			}
		}
		if (baseClass == ColorAlphaSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.SVG_IMAGE__ALPHA: return ModelPackage.COLOR_ALPHA_SUPPORT__ALPHA;
				default: return -1;
			}
		}
		if (baseClass == RotationSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.SVG_IMAGE__ROTATION: return ModelPackage.ROTATION_SUPPORT__ROTATION;
				default: return -1;
			}
		}
		if (baseClass == FlipSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.SVG_IMAGE__HFLIP: return ModelPackage.FLIP_SUPPORT__HFLIP;
				case ModelPackage.SVG_IMAGE__VFLIP: return ModelPackage.FLIP_SUPPORT__VFLIP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == LinkSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.LINK_SUPPORT__LINK: return ModelPackage.SVG_IMAGE__LINK;
				default: return -1;
			}
		}
		if (baseClass == ColorBackgroundSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.COLOR_BACKGROUND_SUPPORT__BACKGROUND: return ModelPackage.SVG_IMAGE__BACKGROUND;
				default: return -1;
			}
		}
		if (baseClass == ColorForegroundSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.COLOR_FOREGROUND_SUPPORT__FOREGROUND: return ModelPackage.SVG_IMAGE__FOREGROUND;
				default: return -1;
			}
		}
		if (baseClass == ColorAlphaSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.COLOR_ALPHA_SUPPORT__ALPHA: return ModelPackage.SVG_IMAGE__ALPHA;
				default: return -1;
			}
		}
		if (baseClass == RotationSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.ROTATION_SUPPORT__ROTATION: return ModelPackage.SVG_IMAGE__ROTATION;
				default: return -1;
			}
		}
		if (baseClass == FlipSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.FLIP_SUPPORT__HFLIP: return ModelPackage.SVG_IMAGE__HFLIP;
				case ModelPackage.FLIP_SUPPORT__VFLIP: return ModelPackage.SVG_IMAGE__VFLIP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (link: ");
		result.append(link);
		result.append(", background: ");
		result.append(background);
		result.append(", foreground: ");
		result.append(foreground);
		result.append(", alpha: ");
		result.append(alpha);
		result.append(", rotation: ");
		result.append(rotation);
		result.append(", hFlip: ");
		result.append(hFlip);
		result.append(", vFlip: ");
		result.append(vFlip);
		result.append(", src: ");
		result.append(src);
		result.append(')');
		return result.toString();
	}

} //SVGImageImpl
