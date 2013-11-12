/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.Button#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends Widget, StateSupport, ColorBackgroundSupport, FontSupport, IconSupport, LinkSupport, TextAlignmentSupport, SkinSupport {

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The default value is <code>"square"</code>.
	 * The literals are from the enumeration {@link com.wireframesketcher.model.ButtonStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see com.wireframesketcher.model.ButtonStyle
	 * @see #setStyle(ButtonStyle)
	 * @see com.wireframesketcher.model.ModelPackage#getButton_Style()
	 * @model default="square"
	 * @generated
	 */
	ButtonStyle getStyle();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Button#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see com.wireframesketcher.model.ButtonStyle
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(ButtonStyle value);

} // Button