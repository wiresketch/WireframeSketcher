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
 * A representation of the model object '<em><b>Line Style Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.LineStyleSupport#getLineStyle <em>Line Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getLineStyleSupport()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface LineStyleSupport extends EObject {
	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' attribute.
	 * The default value is <code>"solid"</code>.
	 * The literals are from the enumeration {@link com.wireframesketcher.model.LineStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Line style
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Style</em>' attribute.
	 * @see com.wireframesketcher.model.LineStyle
	 * @see #setLineStyle(LineStyle)
	 * @see com.wireframesketcher.model.ModelPackage#getLineStyleSupport_LineStyle()
	 * @model default="solid"
	 * @generated
	 */
	LineStyle getLineStyle();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.LineStyleSupport#getLineStyle <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Style</em>' attribute.
	 * @see com.wireframesketcher.model.LineStyle
	 * @see #getLineStyle()
	 * @generated
	 */
	void setLineStyle(LineStyle value);

} // LineStyleSupport
