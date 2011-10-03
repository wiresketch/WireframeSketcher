/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import com.wireframesketcher.model.Browser;
import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.ValueSupport;
import com.wireframesketcher.model.VerticalScrollbarSupport;
import org.eclipse.emf.common.notify.Notification;
import com.wireframesketcher.model.ResizeMode;
import com.wireframesketcher.model.WidgetDescriptor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Browser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.impl.BrowserImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.BrowserImpl#isVerticalScrollbar <em>Vertical Scrollbar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BrowserImpl extends WidgetImpl implements Browser {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;
	/**
	 * The default value of the '{@link #isVerticalScrollbar() <em>Vertical Scrollbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerticalScrollbar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERTICAL_SCROLLBAR_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isVerticalScrollbar() <em>Vertical Scrollbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerticalScrollbar()
	 * @generated
	 * @ordered
	 */
	protected boolean verticalScrollbar = VERTICAL_SCROLLBAR_EDEFAULT;
	
	private static final WidgetDescriptor DESCRIPTOR = describe("Browser").resizeBoth().multiLine(2).get();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected BrowserImpl() {
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
		return ModelPackage.Literals.BROWSER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BROWSER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVerticalScrollbar() {
		return verticalScrollbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalScrollbar(boolean newVerticalScrollbar) {
		boolean oldVerticalScrollbar = verticalScrollbar;
		verticalScrollbar = newVerticalScrollbar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BROWSER__VERTICAL_SCROLLBAR, oldVerticalScrollbar, verticalScrollbar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.BROWSER__VALUE:
				return getValue();
			case ModelPackage.BROWSER__VERTICAL_SCROLLBAR:
				return isVerticalScrollbar();
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
			case ModelPackage.BROWSER__VALUE:
				setValue((Integer)newValue);
				return;
			case ModelPackage.BROWSER__VERTICAL_SCROLLBAR:
				setVerticalScrollbar((Boolean)newValue);
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
			case ModelPackage.BROWSER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ModelPackage.BROWSER__VERTICAL_SCROLLBAR:
				setVerticalScrollbar(VERTICAL_SCROLLBAR_EDEFAULT);
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
			case ModelPackage.BROWSER__VALUE:
				return value != VALUE_EDEFAULT;
			case ModelPackage.BROWSER__VERTICAL_SCROLLBAR:
				return verticalScrollbar != VERTICAL_SCROLLBAR_EDEFAULT;
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
		if (baseClass == ValueSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.BROWSER__VALUE: return ModelPackage.VALUE_SUPPORT__VALUE;
				default: return -1;
			}
		}
		if (baseClass == VerticalScrollbarSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.BROWSER__VERTICAL_SCROLLBAR: return ModelPackage.VERTICAL_SCROLLBAR_SUPPORT__VERTICAL_SCROLLBAR;
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
		if (baseClass == ValueSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.VALUE_SUPPORT__VALUE: return ModelPackage.BROWSER__VALUE;
				default: return -1;
			}
		}
		if (baseClass == VerticalScrollbarSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.VERTICAL_SCROLLBAR_SUPPORT__VERTICAL_SCROLLBAR: return ModelPackage.BROWSER__VERTICAL_SCROLLBAR;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", verticalScrollbar: ");
		result.append(verticalScrollbar);
		result.append(')');
		return result.toString();
	}

} //BrowserImpl