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
 * A representation of the model object '<em><b>Icon Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.IconSupport#getIcon <em>Icon</em>}</li>
 *   <li>{@link com.wireframesketcher.model.IconSupport#getIconRotation <em>Icon Rotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getIconSupport()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IconSupport extends EObject {
	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Icon. Format "icon-name (icon-size)". Icon size values are small, medium, large and xlarge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(IconDesc)
	 * @see com.wireframesketcher.model.ModelPackage#getIconSupport_Icon()
	 * @model default="" dataType="com.wireframesketcher.model.IconDataType"
	 * @generated
	 */
	IconDesc getIcon();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.IconSupport#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(IconDesc value);

	/**
	 * Returns the value of the '<em><b>Icon Rotation</b></em>' attribute.
	 * The literals are from the enumeration {@link com.wireframesketcher.model.Rotation90}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rotation in degrees in 90 degree increments
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Icon Rotation</em>' attribute.
	 * @see com.wireframesketcher.model.Rotation90
	 * @see #setIconRotation(Rotation90)
	 * @see com.wireframesketcher.model.ModelPackage#getIconSupport_IconRotation()
	 * @model
	 * @generated
	 */
	Rotation90 getIconRotation();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.IconSupport#getIconRotation <em>Icon Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Rotation</em>' attribute.
	 * @see com.wireframesketcher.model.Rotation90
	 * @see #getIconRotation()
	 * @generated
	 */
	void setIconRotation(Rotation90 value);

} // IconSupport
