/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.WidgetDescriptor#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link com.wireframesketcher.model.WidgetDescriptor#getResizeMode <em>Resize Mode</em>}</li>
 *   <li>{@link com.wireframesketcher.model.WidgetDescriptor#isTextEditable <em>Text Editable</em>}</li>
 *   <li>{@link com.wireframesketcher.model.WidgetDescriptor#isTextWrappable <em>Text Wrappable</em>}</li>
 *   <li>{@link com.wireframesketcher.model.WidgetDescriptor#getTextLines <em>Text Lines</em>}</li>
 *   <li>{@link com.wireframesketcher.model.WidgetDescriptor#isTextCentered <em>Text Centered</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getWidgetDescriptor()
 * @model
 * @generated
 */
public interface WidgetDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see com.wireframesketcher.model.ModelPackage#getWidgetDescriptor_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.WidgetDescriptor#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Resize Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link com.wireframesketcher.model.ResizeMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resize Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resize Mode</em>' attribute.
	 * @see com.wireframesketcher.model.ResizeMode
	 * @see #setResizeMode(ResizeMode)
	 * @see com.wireframesketcher.model.ModelPackage#getWidgetDescriptor_ResizeMode()
	 * @model
	 * @generated
	 */
	ResizeMode getResizeMode();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.WidgetDescriptor#getResizeMode <em>Resize Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resize Mode</em>' attribute.
	 * @see com.wireframesketcher.model.ResizeMode
	 * @see #getResizeMode()
	 * @generated
	 */
	void setResizeMode(ResizeMode value);

	/**
	 * Returns the value of the '<em><b>Text Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Editable</em>' attribute.
	 * @see #setTextEditable(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getWidgetDescriptor_TextEditable()
	 * @model
	 * @generated
	 */
	boolean isTextEditable();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.WidgetDescriptor#isTextEditable <em>Text Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Editable</em>' attribute.
	 * @see #isTextEditable()
	 * @generated
	 */
	void setTextEditable(boolean value);

	/**
	 * Returns the value of the '<em><b>Text Wrappable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Wrappable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Wrappable</em>' attribute.
	 * @see #setTextWrappable(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getWidgetDescriptor_TextWrappable()
	 * @model
	 * @generated
	 */
	boolean isTextWrappable();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.WidgetDescriptor#isTextWrappable <em>Text Wrappable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Wrappable</em>' attribute.
	 * @see #isTextWrappable()
	 * @generated
	 */
	void setTextWrappable(boolean value);

	/**
	 * Returns the value of the '<em><b>Text Lines</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Lines</em>' attribute.
	 * @see #setTextLines(int)
	 * @see com.wireframesketcher.model.ModelPackage#getWidgetDescriptor_TextLines()
	 * @model default="1"
	 * @generated
	 */
	int getTextLines();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.WidgetDescriptor#getTextLines <em>Text Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Lines</em>' attribute.
	 * @see #getTextLines()
	 * @generated
	 */
	void setTextLines(int value);

	/**
	 * Returns the value of the '<em><b>Text Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Centered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Centered</em>' attribute.
	 * @see #setTextCentered(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getWidgetDescriptor_TextCentered()
	 * @model
	 * @generated
	 */
	boolean isTextCentered();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.WidgetDescriptor#isTextCentered <em>Text Centered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Centered</em>' attribute.
	 * @see #isTextCentered()
	 * @generated
	 */
	void setTextCentered(boolean value);

} // WidgetDescriptor