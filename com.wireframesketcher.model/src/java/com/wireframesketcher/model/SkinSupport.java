/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skin Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.SkinSupport#getSkin <em>Skin</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getSkinSupport()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SkinSupport extends EObject {
	/**
	 * Returns the value of the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Skin resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skin</em>' attribute.
	 * @see #setSkin(URI)
	 * @see com.wireframesketcher.model.ModelPackage#getSkinSupport_Skin()
	 * @model dataType="com.wireframesketcher.model.URIDataType"
	 * @generated
	 */
	URI getSkin();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.SkinSupport#getSkin <em>Skin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skin</em>' attribute.
	 * @see #getSkin()
	 * @generated
	 */
	void setSkin(URI value);

} // SkinSupport
