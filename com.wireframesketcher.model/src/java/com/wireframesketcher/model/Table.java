/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.Table#isVerticalLines <em>Vertical Lines</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Table#isHeader <em>Header</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends Widget, SelectionSupport, BorderSupport, VerticalScrollbarSupport, ColorBackgroundSupport, ColorAlphaSupport, ListSupport, FontSupport, TextAlignmentSupport, ColorAlternativeSupport, TextLinksSupport {

	/**
	 * Returns the value of the '<em><b>Vertical Lines</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles vertical lines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Lines</em>' attribute.
	 * @see #setVerticalLines(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getTable_VerticalLines()
	 * @model default="true"
	 * @generated
	 */
	boolean isVerticalLines();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Table#isVerticalLines <em>Vertical Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Lines</em>' attribute.
	 * @see #isVerticalLines()
	 * @generated
	 */
	void setVerticalLines(boolean value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles header row
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getTable_Header()
	 * @model default="true"
	 * @generated
	 */
	boolean isHeader();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Table#isHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #isHeader()
	 * @generated
	 */
	void setHeader(boolean value);
} // Table