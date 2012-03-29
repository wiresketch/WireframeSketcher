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
 * A representation of the model object '<em><b>Font</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.Font#getSize <em>Size</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Font#getBold <em>Bold</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Font#getItalic <em>Italic</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Font#getUnderline <em>Underline</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getFont()
 * @model
 * @generated
 */
public interface Font extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Font size.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(FontSize)
	 * @see com.wireframesketcher.model.ModelPackage#getFont_Size()
	 * @model dataType="com.wireframesketcher.model.FontSizeDataType" required="true"
	 * @generated
	 */
	FontSize getSize();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Font#getSize <em>Size</em>}' attribute.
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
	 * <!-- begin-model-doc -->
	 * Toggles bold style.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bold</em>' attribute.
	 * @see #setBold(Boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getFont_Bold()
	 * @model required="true"
	 * @generated
	 */
	Boolean getBold();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Font#getBold <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bold</em>' attribute.
	 * @see #getBold()
	 * @generated
	 */
	void setBold(Boolean value);

	/**
	 * Returns the value of the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Italic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles italics style.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Italic</em>' attribute.
	 * @see #setItalic(Boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getFont_Italic()
	 * @model required="true"
	 * @generated
	 */
	Boolean getItalic();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Font#getItalic <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Italic</em>' attribute.
	 * @see #getItalic()
	 * @generated
	 */
	void setItalic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Underline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles underline style.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Underline</em>' attribute.
	 * @see #setUnderline(Boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getFont_Underline()
	 * @model required="true"
	 * @generated
	 */
	Boolean getUnderline();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Font#getUnderline <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underline</em>' attribute.
	 * @see #getUnderline()
	 * @generated
	 */
	void setUnderline(Boolean value);

} // Font