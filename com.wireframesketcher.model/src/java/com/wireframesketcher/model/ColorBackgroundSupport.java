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
 * A representation of the model object '<em><b>Color Background Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.ColorBackgroundSupport#getBackground <em>Background</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getColorBackgroundSupport()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ColorBackgroundSupport extends EObject {
	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * The default value is <code>"white"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Background color.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(ColorDesc)
	 * @see com.wireframesketcher.model.ModelPackage#getColorBackgroundSupport_Background()
	 * @model default="white" dataType="com.wireframesketcher.model.ColorDataType"
	 * @generated
	 */
	ColorDesc getBackground();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.ColorBackgroundSupport#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(ColorDesc value);

} // ColorBackgroundSupport
