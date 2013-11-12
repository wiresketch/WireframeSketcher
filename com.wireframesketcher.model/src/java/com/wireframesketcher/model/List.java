/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.List#isHeader <em>Header</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getList()
 * @model
 * @generated
 */
public interface List extends Widget, SelectionSupport, BorderSupport, VerticalScrollbarSupport, ColorBackgroundSupport, ColorAlphaSupport, ListSupport, FontSupport, ItemSupport, ColorAlternativeSupport {

	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles header row
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getList_Header()
	 * @model default="false"
	 * @generated
	 */
	boolean isHeader();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.List#isHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #isHeader()
	 * @generated
	 */
	void setHeader(boolean value);

} // List