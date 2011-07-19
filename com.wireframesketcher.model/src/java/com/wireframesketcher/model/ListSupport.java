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
 * A representation of the model object '<em><b>List Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.ListSupport#getRowHeight <em>Row Height</em>}</li>
 *   <li>{@link com.wireframesketcher.model.ListSupport#isHorizontalLines <em>Horizontal Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getListSupport()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ListSupport extends EObject {
	/**
	 * Returns the value of the '<em><b>Row Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Row height in pixels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Row Height</em>' attribute.
	 * @see #setRowHeight(int)
	 * @see com.wireframesketcher.model.ModelPackage#getListSupport_RowHeight()
	 * @model
	 * @generated
	 */
	int getRowHeight();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.ListSupport#getRowHeight <em>Row Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Height</em>' attribute.
	 * @see #getRowHeight()
	 * @generated
	 */
	void setRowHeight(int value);

	/**
	 * Returns the value of the '<em><b>Horizontal Lines</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles horizontal lines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Lines</em>' attribute.
	 * @see #setHorizontalLines(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getListSupport_HorizontalLines()
	 * @model default="false"
	 * @generated
	 */
	boolean isHorizontalLines();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.ListSupport#isHorizontalLines <em>Horizontal Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Lines</em>' attribute.
	 * @see #isHorizontalLines()
	 * @generated
	 */
	void setHorizontalLines(boolean value);

} // ListSupport
