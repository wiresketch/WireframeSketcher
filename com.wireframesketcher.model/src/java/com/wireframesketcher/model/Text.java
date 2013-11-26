/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.Text#isDummyText <em>Dummy Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getText()
 * @model
 * @generated
 */
public interface Text extends Widget, FontSupport, TextAlignmentSupport, ColorForegroundSupport, LinkSupport, LineHeightSupport {
	/**
	 * Returns the value of the '<em><b>Dummy Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dummy Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true then Lorem Ipsum default text is used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dummy Text</em>' attribute.
	 * @see #setDummyText(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getText_DummyText()
	 * @model
	 * @generated
	 */
	boolean isDummyText();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Text#isDummyText <em>Dummy Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dummy Text</em>' attribute.
	 * @see #isDummyText()
	 * @generated
	 */
	void setDummyText(boolean value);

} // Text