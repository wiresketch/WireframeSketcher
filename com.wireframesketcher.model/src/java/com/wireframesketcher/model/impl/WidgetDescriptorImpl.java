/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.ResizeMode;
import com.wireframesketcher.model.WidgetDescriptor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetDescriptorImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetDescriptorImpl#getResizeMode <em>Resize Mode</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetDescriptorImpl#isTextEditable <em>Text Editable</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetDescriptorImpl#isTextWrappable <em>Text Wrappable</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetDescriptorImpl#getTextLines <em>Text Lines</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetDescriptorImpl#isTextCentered <em>Text Centered</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WidgetDescriptorImpl extends EObjectImpl implements WidgetDescriptor {
	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getResizeMode() <em>Resize Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResizeMode()
	 * @generated
	 * @ordered
	 */
	protected static final ResizeMode RESIZE_MODE_EDEFAULT = ResizeMode.BOTH_LITERAL;

	/**
	 * The cached value of the '{@link #getResizeMode() <em>Resize Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResizeMode()
	 * @generated
	 * @ordered
	 */
	protected ResizeMode resizeMode = RESIZE_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTextEditable() <em>Text Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTextEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEXT_EDITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTextEditable() <em>Text Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTextEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean textEditable = TEXT_EDITABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTextWrappable() <em>Text Wrappable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTextWrappable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEXT_WRAPPABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTextWrappable() <em>Text Wrappable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTextWrappable()
	 * @generated
	 * @ordered
	 */
	protected boolean textWrappable = TEXT_WRAPPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextLines() <em>Text Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLines()
	 * @generated
	 * @ordered
	 */
	protected static final int TEXT_LINES_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTextLines() <em>Text Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLines()
	 * @generated
	 * @ordered
	 */
	protected int textLines = TEXT_LINES_EDEFAULT;

	/**
	 * The default value of the '{@link #isTextCentered() <em>Text Centered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTextCentered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEXT_CENTERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTextCentered() <em>Text Centered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTextCentered()
	 * @generated
	 * @ordered
	 */
	protected boolean textCentered = TEXT_CENTERED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.WIDGET_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIDGET_DESCRIPTOR__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResizeMode getResizeMode() {
		return resizeMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResizeMode(ResizeMode newResizeMode) {
		ResizeMode oldResizeMode = resizeMode;
		resizeMode = newResizeMode == null ? RESIZE_MODE_EDEFAULT : newResizeMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIDGET_DESCRIPTOR__RESIZE_MODE, oldResizeMode, resizeMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTextEditable() {
		return textEditable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextEditable(boolean newTextEditable) {
		boolean oldTextEditable = textEditable;
		textEditable = newTextEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIDGET_DESCRIPTOR__TEXT_EDITABLE, oldTextEditable, textEditable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTextWrappable() {
		return textWrappable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextWrappable(boolean newTextWrappable) {
		boolean oldTextWrappable = textWrappable;
		textWrappable = newTextWrappable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIDGET_DESCRIPTOR__TEXT_WRAPPABLE, oldTextWrappable, textWrappable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTextLines() {
		return textLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextLines(int newTextLines) {
		int oldTextLines = textLines;
		textLines = newTextLines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIDGET_DESCRIPTOR__TEXT_LINES, oldTextLines, textLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTextCentered() {
		return textCentered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextCentered(boolean newTextCentered) {
		boolean oldTextCentered = textCentered;
		textCentered = newTextCentered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIDGET_DESCRIPTOR__TEXT_CENTERED, oldTextCentered, textCentered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.WIDGET_DESCRIPTOR__TYPE_NAME:
				return getTypeName();
			case ModelPackage.WIDGET_DESCRIPTOR__RESIZE_MODE:
				return getResizeMode();
			case ModelPackage.WIDGET_DESCRIPTOR__TEXT_EDITABLE:
				return isTextEditable();
			case ModelPackage.WIDGET_DESCRIPTOR__TEXT_WRAPPABLE:
				return isTextWrappable();
			case ModelPackage.WIDGET_DESCRIPTOR__TEXT_LINES:
				return getTextLines();
			case ModelPackage.WIDGET_DESCRIPTOR__TEXT_CENTERED:
				return isTextCentered();
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
			case ModelPackage.WIDGET_DESCRIPTOR__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case ModelPackage.WIDGET_DESCRIPTOR__RESIZE_MODE:
				setResizeMode((ResizeMode)newValue);
				return;
			case ModelPackage.WIDGET_DESCRIPTOR__TEXT_EDITABLE:
				setTextEditable((Boolean)newValue);
				return;
			case ModelPackage.WIDGET_DESCRIPTOR__TEXT_WRAPPABLE:
				setTextWrappable((Boolean)newValue);
				return;
			case ModelPackage.WIDGET_DESCRIPTOR__TEXT_LINES:
				setTextLines((Integer)newValue);
				return;
			case ModelPackage.WIDGET_DESCRIPTOR__TEXT_CENTERED:
				setTextCentered((Boolean)newValue);
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
			case ModelPackage.WIDGET_DESCRIPTOR__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case ModelPackage.WIDGET_DESCRIPTOR__RESIZE_MODE:
				setResizeMode(RESIZE_MODE_EDEFAULT);
				return;
			case ModelPackage.WIDGET_DESCRIPTOR__TEXT_EDITABLE:
				setTextEditable(TEXT_EDITABLE_EDEFAULT);
				return;
			case ModelPackage.WIDGET_DESCRIPTOR__TEXT_WRAPPABLE:
				setTextWrappable(TEXT_WRAPPABLE_EDEFAULT);
				return;
			case ModelPackage.WIDGET_DESCRIPTOR__TEXT_LINES:
				setTextLines(TEXT_LINES_EDEFAULT);
				return;
			case ModelPackage.WIDGET_DESCRIPTOR__TEXT_CENTERED:
				setTextCentered(TEXT_CENTERED_EDEFAULT);
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
			case ModelPackage.WIDGET_DESCRIPTOR__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case ModelPackage.WIDGET_DESCRIPTOR__RESIZE_MODE:
				return resizeMode != RESIZE_MODE_EDEFAULT;
			case ModelPackage.WIDGET_DESCRIPTOR__TEXT_EDITABLE:
				return textEditable != TEXT_EDITABLE_EDEFAULT;
			case ModelPackage.WIDGET_DESCRIPTOR__TEXT_WRAPPABLE:
				return textWrappable != TEXT_WRAPPABLE_EDEFAULT;
			case ModelPackage.WIDGET_DESCRIPTOR__TEXT_LINES:
				return textLines != TEXT_LINES_EDEFAULT;
			case ModelPackage.WIDGET_DESCRIPTOR__TEXT_CENTERED:
				return textCentered != TEXT_CENTERED_EDEFAULT;
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
		result.append(" (typeName: ");
		result.append(typeName);
		result.append(", resizeMode: ");
		result.append(resizeMode);
		result.append(", textEditable: ");
		result.append(textEditable);
		result.append(", textWrappable: ");
		result.append(textWrappable);
		result.append(", textLines: ");
		result.append(textLines);
		result.append(", textCentered: ");
		result.append(textCentered);
		result.append(')');
		return result.toString();
	}

} //WidgetDescriptorImpl