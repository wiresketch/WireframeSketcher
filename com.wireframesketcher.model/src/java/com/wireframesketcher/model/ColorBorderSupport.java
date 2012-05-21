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
 * A representation of the model object '<em><b>Color Border Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.ColorBorderSupport#getBorderColor <em>Border Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getColorBorderSupport()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ColorBorderSupport extends EObject {
	/**
	 * Returns the value of the '<em><b>Border Color</b></em>' attribute.
	 * The default value is <code>"black"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Border color
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Border Color</em>' attribute.
	 * @see #setBorderColor(ColorDesc)
	 * @see com.wireframesketcher.model.ModelPackage#getColorBorderSupport_BorderColor()
	 * @model default="black" dataType="com.wireframesketcher.model.ColorDataType"
	 * @generated
	 */
	ColorDesc getBorderColor();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.ColorBorderSupport#getBorderColor <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Color</em>' attribute.
	 * @see #getBorderColor()
	 * @generated
	 */
	void setBorderColor(ColorDesc value);

} // ColorBorderSupport
