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
 * A representation of the model object '<em><b>Line Height Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.LineHeightSupport#getLineHeight <em>Line Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getLineHeightSupport()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface LineHeightSupport extends EObject {
	/**
	 * Returns the value of the '<em><b>Line Height</b></em>' attribute.
	 * The default value is <code>"normal"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Line height specified either in em, percents or pixels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Height</em>' attribute.
	 * @see #setLineHeight(LineHeight)
	 * @see com.wireframesketcher.model.ModelPackage#getLineHeightSupport_LineHeight()
	 * @model default="normal" dataType="com.wireframesketcher.model.LineHeightDataType"
	 * @generated
	 */
	LineHeight getLineHeight();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.LineHeightSupport#getLineHeight <em>Line Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Height</em>' attribute.
	 * @see #getLineHeight()
	 * @generated
	 */
	void setLineHeight(LineHeight value);

} // LineHeightSupport
