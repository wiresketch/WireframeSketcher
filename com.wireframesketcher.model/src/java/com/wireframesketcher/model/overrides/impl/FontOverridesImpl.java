/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.overrides.impl;

import com.wireframesketcher.model.FontSize;
import com.wireframesketcher.model.overrides.FontOverrides;
import com.wireframesketcher.model.overrides.OverridesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font Overrides</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.overrides.impl.FontOverridesImpl#getSize <em>Size</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.impl.FontOverridesImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.impl.FontOverridesImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.impl.FontOverridesImpl#getUnderline <em>Underline</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FontOverridesImpl extends EObjectImpl implements FontOverrides {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final FontSize SIZE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected FontSize size = SIZE_EDEFAULT;
	/**
	 * The default value of the '{@link #getBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBold()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BOLD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBold()
	 * @generated
	 * @ordered
	 */
	protected Boolean bold = BOLD_EDEFAULT;
	/**
	 * The default value of the '{@link #getItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItalic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ITALIC_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItalic()
	 * @generated
	 * @ordered
	 */
	protected Boolean italic = ITALIC_EDEFAULT;
	/**
	 * The default value of the '{@link #getUnderline() <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderline()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean UNDERLINE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUnderline() <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderline()
	 * @generated
	 * @ordered
	 */
	protected Boolean underline = UNDERLINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FontOverridesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OverridesPackage.Literals.FONT_OVERRIDES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontSize getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(FontSize newSize) {
		FontSize oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OverridesPackage.FONT_OVERRIDES__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBold() {
		return bold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBold(Boolean newBold) {
		Boolean oldBold = bold;
		bold = newBold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OverridesPackage.FONT_OVERRIDES__BOLD, oldBold, bold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getItalic() {
		return italic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItalic(Boolean newItalic) {
		Boolean oldItalic = italic;
		italic = newItalic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OverridesPackage.FONT_OVERRIDES__ITALIC, oldItalic, italic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getUnderline() {
		return underline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderline(Boolean newUnderline) {
		Boolean oldUnderline = underline;
		underline = newUnderline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OverridesPackage.FONT_OVERRIDES__UNDERLINE, oldUnderline, underline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OverridesPackage.FONT_OVERRIDES__SIZE:
				return getSize();
			case OverridesPackage.FONT_OVERRIDES__BOLD:
				return getBold();
			case OverridesPackage.FONT_OVERRIDES__ITALIC:
				return getItalic();
			case OverridesPackage.FONT_OVERRIDES__UNDERLINE:
				return getUnderline();
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
			case OverridesPackage.FONT_OVERRIDES__SIZE:
				setSize((FontSize)newValue);
				return;
			case OverridesPackage.FONT_OVERRIDES__BOLD:
				setBold((Boolean)newValue);
				return;
			case OverridesPackage.FONT_OVERRIDES__ITALIC:
				setItalic((Boolean)newValue);
				return;
			case OverridesPackage.FONT_OVERRIDES__UNDERLINE:
				setUnderline((Boolean)newValue);
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
			case OverridesPackage.FONT_OVERRIDES__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case OverridesPackage.FONT_OVERRIDES__BOLD:
				setBold(BOLD_EDEFAULT);
				return;
			case OverridesPackage.FONT_OVERRIDES__ITALIC:
				setItalic(ITALIC_EDEFAULT);
				return;
			case OverridesPackage.FONT_OVERRIDES__UNDERLINE:
				setUnderline(UNDERLINE_EDEFAULT);
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
			case OverridesPackage.FONT_OVERRIDES__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case OverridesPackage.FONT_OVERRIDES__BOLD:
				return BOLD_EDEFAULT == null ? bold != null : !BOLD_EDEFAULT.equals(bold);
			case OverridesPackage.FONT_OVERRIDES__ITALIC:
				return ITALIC_EDEFAULT == null ? italic != null : !ITALIC_EDEFAULT.equals(italic);
			case OverridesPackage.FONT_OVERRIDES__UNDERLINE:
				return UNDERLINE_EDEFAULT == null ? underline != null : !UNDERLINE_EDEFAULT.equals(underline);
		}
		return super.eIsSet(featureID);
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
		result.append(" (size: ");
		result.append(size);
		result.append(", bold: ");
		result.append(bold);
		result.append(", italic: ");
		result.append(italic);
		result.append(", underline: ");
		result.append(underline);
		result.append(')');
		return result.toString();
	}

} //FontOverridesImpl
