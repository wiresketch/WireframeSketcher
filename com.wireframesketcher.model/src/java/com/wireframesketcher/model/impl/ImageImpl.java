/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import com.wireframesketcher.model.FlipSupport;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.wireframesketcher.model.Image;
import com.wireframesketcher.model.LinkSupport;
import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.Rotation90;
import com.wireframesketcher.model.RotationSupport;
import com.wireframesketcher.model.ResizeMode;
import com.wireframesketcher.model.WidgetDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.impl.ImageImpl#getLink <em>Link</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ImageImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ImageImpl#isHFlip <em>HFlip</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ImageImpl#isVFlip <em>VFlip</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ImageImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ImageImpl#isGrayscale <em>Grayscale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageImpl extends WidgetImpl implements Image {
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

	private static final WidgetDescriptor DESCRIPTOR = describe("Image", ResizeMode.BOTH_LITERAL, false, false);
	
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

	/**
	 * The default value of the '{@link #isGrayscale() <em>Grayscale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrayscale()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GRAYSCALE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGrayscale() <em>Grayscale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrayscale()
	 * @generated
	 * @ordered
	 */
	protected boolean grayscale = GRAYSCALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ImageImpl() {
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
		return ModelPackage.Literals.IMAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IMAGE__LINK, oldLink, link));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IMAGE__ROTATION, oldRotation, rotation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IMAGE__HFLIP, oldHFlip, hFlip));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IMAGE__VFLIP, oldVFlip, vFlip));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IMAGE__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrayscale() {
		return grayscale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrayscale(boolean newGrayscale) {
		boolean oldGrayscale = grayscale;
		grayscale = newGrayscale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IMAGE__GRAYSCALE, oldGrayscale, grayscale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.IMAGE__LINK:
				return getLink();
			case ModelPackage.IMAGE__ROTATION:
				return getRotation();
			case ModelPackage.IMAGE__HFLIP:
				return isHFlip();
			case ModelPackage.IMAGE__VFLIP:
				return isVFlip();
			case ModelPackage.IMAGE__SRC:
				return getSrc();
			case ModelPackage.IMAGE__GRAYSCALE:
				return isGrayscale();
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
			case ModelPackage.IMAGE__LINK:
				setLink((URI)newValue);
				return;
			case ModelPackage.IMAGE__ROTATION:
				setRotation((Rotation90)newValue);
				return;
			case ModelPackage.IMAGE__HFLIP:
				setHFlip((Boolean)newValue);
				return;
			case ModelPackage.IMAGE__VFLIP:
				setVFlip((Boolean)newValue);
				return;
			case ModelPackage.IMAGE__SRC:
				setSrc((URI)newValue);
				return;
			case ModelPackage.IMAGE__GRAYSCALE:
				setGrayscale((Boolean)newValue);
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
			case ModelPackage.IMAGE__LINK:
				setLink(LINK_EDEFAULT);
				return;
			case ModelPackage.IMAGE__ROTATION:
				setRotation(ROTATION_EDEFAULT);
				return;
			case ModelPackage.IMAGE__HFLIP:
				setHFlip(HFLIP_EDEFAULT);
				return;
			case ModelPackage.IMAGE__VFLIP:
				setVFlip(VFLIP_EDEFAULT);
				return;
			case ModelPackage.IMAGE__SRC:
				setSrc(SRC_EDEFAULT);
				return;
			case ModelPackage.IMAGE__GRAYSCALE:
				setGrayscale(GRAYSCALE_EDEFAULT);
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
			case ModelPackage.IMAGE__LINK:
				return LINK_EDEFAULT == null ? link != null : !LINK_EDEFAULT.equals(link);
			case ModelPackage.IMAGE__ROTATION:
				return rotation != ROTATION_EDEFAULT;
			case ModelPackage.IMAGE__HFLIP:
				return hFlip != HFLIP_EDEFAULT;
			case ModelPackage.IMAGE__VFLIP:
				return vFlip != VFLIP_EDEFAULT;
			case ModelPackage.IMAGE__SRC:
				return SRC_EDEFAULT == null ? src != null : !SRC_EDEFAULT.equals(src);
			case ModelPackage.IMAGE__GRAYSCALE:
				return grayscale != GRAYSCALE_EDEFAULT;
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
				case ModelPackage.IMAGE__LINK: return ModelPackage.LINK_SUPPORT__LINK;
				default: return -1;
			}
		}
		if (baseClass == RotationSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.IMAGE__ROTATION: return ModelPackage.ROTATION_SUPPORT__ROTATION;
				default: return -1;
			}
		}
		if (baseClass == FlipSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.IMAGE__HFLIP: return ModelPackage.FLIP_SUPPORT__HFLIP;
				case ModelPackage.IMAGE__VFLIP: return ModelPackage.FLIP_SUPPORT__VFLIP;
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
				case ModelPackage.LINK_SUPPORT__LINK: return ModelPackage.IMAGE__LINK;
				default: return -1;
			}
		}
		if (baseClass == RotationSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.ROTATION_SUPPORT__ROTATION: return ModelPackage.IMAGE__ROTATION;
				default: return -1;
			}
		}
		if (baseClass == FlipSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.FLIP_SUPPORT__HFLIP: return ModelPackage.IMAGE__HFLIP;
				case ModelPackage.FLIP_SUPPORT__VFLIP: return ModelPackage.IMAGE__VFLIP;
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
		result.append(", rotation: ");
		result.append(rotation);
		result.append(", hFlip: ");
		result.append(hFlip);
		result.append(", vFlip: ");
		result.append(vFlip);
		result.append(", src: ");
		result.append(src);
		result.append(", grayscale: ");
		result.append(grayscale);
		result.append(')');
		return result.toString();
	}

} //ImageImpl
