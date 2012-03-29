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
 * A representation of the model object '<em><b>Screen Font</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.ScreenFont#getName <em>Name</em>}</li>
 *   <li>{@link com.wireframesketcher.model.ScreenFont#getSize <em>Size</em>}</li>
 *   <li>{@link com.wireframesketcher.model.ScreenFont#isBold <em>Bold</em>}</li>
 *   <li>{@link com.wireframesketcher.model.ScreenFont#isItalic <em>Italic</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getScreenFont()
 * @model
 * @generated
 */
public interface ScreenFont extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.wireframesketcher.model.ModelPackage#getScreenFont_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.ScreenFont#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(FontSize)
	 * @see com.wireframesketcher.model.ModelPackage#getScreenFont_Size()
	 * @model dataType="com.wireframesketcher.model.FontSizeDataType" required="true"
	 * @generated
	 */
	FontSize getSize();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.ScreenFont#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(FontSize value);

	/**
	 * Returns the value of the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bold</em>' attribute.
	 * @see #setBold(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getScreenFont_Bold()
	 * @model required="true"
	 * @generated
	 */
	boolean isBold();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.ScreenFont#isBold <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bold</em>' attribute.
	 * @see #isBold()
	 * @generated
	 */
	void setBold(boolean value);

	/**
	 * Returns the value of the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Italic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Italic</em>' attribute.
	 * @see #setItalic(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getScreenFont_Italic()
	 * @model required="true"
	 * @generated
	 */
	boolean isItalic();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.ScreenFont#isItalic <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Italic</em>' attribute.
	 * @see #isItalic()
	 * @generated
	 */
	void setItalic(boolean value);

} // ScreenFont
