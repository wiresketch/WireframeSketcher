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
 * A representation of the model object '<em><b>Color Foreground Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.ColorForegroundSupport#getForeground <em>Foreground</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getColorForegroundSupport()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ColorForegroundSupport extends EObject {
	/**
	 * Returns the value of the '<em><b>Foreground</b></em>' attribute.
	 * The default value is <code>"black"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreground</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Foreground color.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Foreground</em>' attribute.
	 * @see #setForeground(ColorDesc)
	 * @see com.wireframesketcher.model.ModelPackage#getColorForegroundSupport_Foreground()
	 * @model default="black" dataType="com.wireframesketcher.model.ColorDataType"
	 * @generated
	 */
	ColorDesc getForeground();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.ColorForegroundSupport#getForeground <em>Foreground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreground</em>' attribute.
	 * @see #getForeground()
	 * @generated
	 */
	void setForeground(ColorDesc value);

} // ColorForegroundSupport
