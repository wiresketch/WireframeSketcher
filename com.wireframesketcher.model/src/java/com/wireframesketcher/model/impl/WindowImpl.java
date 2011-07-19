/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.ValueSupport;
import com.wireframesketcher.model.VerticalScrollbarSupport;
import com.wireframesketcher.model.ResizeMode;
import com.wireframesketcher.model.WidgetDescriptor;
import com.wireframesketcher.model.Window;
import org.eclipse.emf.common.notify.Notification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.impl.WindowImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WindowImpl#isVerticalScrollbar <em>Vertical Scrollbar</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WindowImpl#isCloseButton <em>Close Button</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WindowImpl#isMinimizeButton <em>Minimize Button</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WindowImpl#isMaximizeButton <em>Maximize Button</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WindowImpl extends WidgetImpl implements Window {
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
	
	/**
	 * The default value of the '{@link #isCloseButton() <em>Close Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCloseButton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLOSE_BUTTON_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isCloseButton() <em>Close Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCloseButton()
	 * @generated
	 * @ordered
	 */
	protected boolean closeButton = CLOSE_BUTTON_EDEFAULT;
	/**
	 * The default value of the '{@link #isMinimizeButton() <em>Minimize Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinimizeButton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MINIMIZE_BUTTON_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isMinimizeButton() <em>Minimize Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinimizeButton()
	 * @generated
	 * @ordered
	 */
	protected boolean minimizeButton = MINIMIZE_BUTTON_EDEFAULT;
	/**
	 * The default value of the '{@link #isMaximizeButton() <em>Maximize Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaximizeButton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAXIMIZE_BUTTON_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isMaximizeButton() <em>Maximize Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaximizeButton()
	 * @generated
	 * @ordered
	 */
	protected boolean maximizeButton = MAXIMIZE_BUTTON_EDEFAULT;
	private static final WidgetDescriptor DESCRIPTOR = describe("Window", ResizeMode.BOTH_LITERAL);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected WindowImpl() {
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
		return ModelPackage.Literals.WINDOW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WINDOW__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WINDOW__VERTICAL_SCROLLBAR, oldVerticalScrollbar, verticalScrollbar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCloseButton() {
		return closeButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloseButton(boolean newCloseButton) {
		boolean oldCloseButton = closeButton;
		closeButton = newCloseButton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WINDOW__CLOSE_BUTTON, oldCloseButton, closeButton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMinimizeButton() {
		return minimizeButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimizeButton(boolean newMinimizeButton) {
		boolean oldMinimizeButton = minimizeButton;
		minimizeButton = newMinimizeButton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WINDOW__MINIMIZE_BUTTON, oldMinimizeButton, minimizeButton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMaximizeButton() {
		return maximizeButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximizeButton(boolean newMaximizeButton) {
		boolean oldMaximizeButton = maximizeButton;
		maximizeButton = newMaximizeButton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WINDOW__MAXIMIZE_BUTTON, oldMaximizeButton, maximizeButton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.WINDOW__VALUE:
				return new Integer(getValue());
			case ModelPackage.WINDOW__VERTICAL_SCROLLBAR:
				return isVerticalScrollbar() ? Boolean.TRUE : Boolean.FALSE;
			case ModelPackage.WINDOW__CLOSE_BUTTON:
				return isCloseButton() ? Boolean.TRUE : Boolean.FALSE;
			case ModelPackage.WINDOW__MINIMIZE_BUTTON:
				return isMinimizeButton() ? Boolean.TRUE : Boolean.FALSE;
			case ModelPackage.WINDOW__MAXIMIZE_BUTTON:
				return isMaximizeButton() ? Boolean.TRUE : Boolean.FALSE;
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
			case ModelPackage.WINDOW__VALUE:
				setValue(((Integer)newValue).intValue());
				return;
			case ModelPackage.WINDOW__VERTICAL_SCROLLBAR:
				setVerticalScrollbar(((Boolean)newValue).booleanValue());
				return;
			case ModelPackage.WINDOW__CLOSE_BUTTON:
				setCloseButton(((Boolean)newValue).booleanValue());
				return;
			case ModelPackage.WINDOW__MINIMIZE_BUTTON:
				setMinimizeButton(((Boolean)newValue).booleanValue());
				return;
			case ModelPackage.WINDOW__MAXIMIZE_BUTTON:
				setMaximizeButton(((Boolean)newValue).booleanValue());
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
			case ModelPackage.WINDOW__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ModelPackage.WINDOW__VERTICAL_SCROLLBAR:
				setVerticalScrollbar(VERTICAL_SCROLLBAR_EDEFAULT);
				return;
			case ModelPackage.WINDOW__CLOSE_BUTTON:
				setCloseButton(CLOSE_BUTTON_EDEFAULT);
				return;
			case ModelPackage.WINDOW__MINIMIZE_BUTTON:
				setMinimizeButton(MINIMIZE_BUTTON_EDEFAULT);
				return;
			case ModelPackage.WINDOW__MAXIMIZE_BUTTON:
				setMaximizeButton(MAXIMIZE_BUTTON_EDEFAULT);
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
			case ModelPackage.WINDOW__VALUE:
				return value != VALUE_EDEFAULT;
			case ModelPackage.WINDOW__VERTICAL_SCROLLBAR:
				return verticalScrollbar != VERTICAL_SCROLLBAR_EDEFAULT;
			case ModelPackage.WINDOW__CLOSE_BUTTON:
				return closeButton != CLOSE_BUTTON_EDEFAULT;
			case ModelPackage.WINDOW__MINIMIZE_BUTTON:
				return minimizeButton != MINIMIZE_BUTTON_EDEFAULT;
			case ModelPackage.WINDOW__MAXIMIZE_BUTTON:
				return maximizeButton != MAXIMIZE_BUTTON_EDEFAULT;
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
				case ModelPackage.WINDOW__VALUE: return ModelPackage.VALUE_SUPPORT__VALUE;
				default: return -1;
			}
		}
		if (baseClass == VerticalScrollbarSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.WINDOW__VERTICAL_SCROLLBAR: return ModelPackage.VERTICAL_SCROLLBAR_SUPPORT__VERTICAL_SCROLLBAR;
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
				case ModelPackage.VALUE_SUPPORT__VALUE: return ModelPackage.WINDOW__VALUE;
				default: return -1;
			}
		}
		if (baseClass == VerticalScrollbarSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.VERTICAL_SCROLLBAR_SUPPORT__VERTICAL_SCROLLBAR: return ModelPackage.WINDOW__VERTICAL_SCROLLBAR;
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
		result.append(", closeButton: ");
		result.append(closeButton);
		result.append(", minimizeButton: ");
		result.append(minimizeButton);
		result.append(", maximizeButton: ");
		result.append(maximizeButton);
		result.append(')');
		return result.toString();
	}

} //WindowImpl