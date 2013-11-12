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
 * A representation of the model object '<em><b>Selection Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.SelectionSupport#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getSelectionSupport()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SelectionSupport extends EObject {
	/**
	 * Returns the value of the '<em><b>Selection</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Selection index. Zero-based. Default: -1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selection</em>' attribute.
	 * @see #setSelection(int)
	 * @see com.wireframesketcher.model.ModelPackage#getSelectionSupport_Selection()
	 * @model default="-1" dataType="com.wireframesketcher.model.SelectionDataType"
	 * @generated
	 */
	int getSelection();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.SelectionSupport#getSelection <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' attribute.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(int value);

} // SelectionSupport
