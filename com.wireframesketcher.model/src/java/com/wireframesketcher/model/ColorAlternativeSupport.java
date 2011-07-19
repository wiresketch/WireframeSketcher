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
 * A representation of the model object '<em><b>Color Alternative Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.ColorAlternativeSupport#getAlternative <em>Alternative</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getColorAlternativeSupport()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ColorAlternativeSupport extends EObject {
	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' attribute.
	 * The default value is <code>"white"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Alternative color for rows in lists and tables
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternative</em>' attribute.
	 * @see #setAlternative(ColorDesc)
	 * @see com.wireframesketcher.model.ModelPackage#getColorAlternativeSupport_Alternative()
	 * @model default="white" dataType="com.wireframesketcher.model.ColorDataType"
	 * @generated
	 */
	ColorDesc getAlternative();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.ColorAlternativeSupport#getAlternative <em>Alternative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative</em>' attribute.
	 * @see #getAlternative()
	 * @generated
	 */
	void setAlternative(ColorDesc value);

} // ColorAlternativeSupport
