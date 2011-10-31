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
 * A representation of the model object '<em><b>Rotation Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.RotationSupport#getRotation <em>Rotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getRotationSupport()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RotationSupport extends EObject {
	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rotation in degrees from 0 to 360
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #setRotation(int)
	 * @see com.wireframesketcher.model.ModelPackage#getRotationSupport_Rotation()
	 * @model
	 * @generated
	 */
	int getRotation();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.RotationSupport#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(int value);

} // RotationSupport