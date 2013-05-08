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
 * A representation of the model object '<em><b>Flip Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.FlipSupport#isHFlip <em>HFlip</em>}</li>
 *   <li>{@link com.wireframesketcher.model.FlipSupport#isVFlip <em>VFlip</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getFlipSupport()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FlipSupport extends EObject {
	/**
	 * Returns the value of the '<em><b>HFlip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles horizontal flip
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>HFlip</em>' attribute.
	 * @see #setHFlip(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getFlipSupport_HFlip()
	 * @model
	 * @generated
	 */
	boolean isHFlip();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.FlipSupport#isHFlip <em>HFlip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HFlip</em>' attribute.
	 * @see #isHFlip()
	 * @generated
	 */
	void setHFlip(boolean value);

	/**
	 * Returns the value of the '<em><b>VFlip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles vertical flip
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VFlip</em>' attribute.
	 * @see #setVFlip(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getFlipSupport_VFlip()
	 * @model
	 * @generated
	 */
	boolean isVFlip();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.FlipSupport#isVFlip <em>VFlip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VFlip</em>' attribute.
	 * @see #isVFlip()
	 * @generated
	 */
	void setVFlip(boolean value);

} // FlipSupport
