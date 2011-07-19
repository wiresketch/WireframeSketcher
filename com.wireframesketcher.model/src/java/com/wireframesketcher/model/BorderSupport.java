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
 * A representation of the model object '<em><b>Border Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.BorderSupport#isBorder <em>Border</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getBorderSupport()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BorderSupport extends EObject {
	/**
	 * Returns the value of the '<em><b>Border</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles border rendering.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Border</em>' attribute.
	 * @see #setBorder(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getBorderSupport_Border()
	 * @model default="true"
	 * @generated
	 */
	boolean isBorder();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.BorderSupport#isBorder <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border</em>' attribute.
	 * @see #isBorder()
	 * @generated
	 */
	void setBorder(boolean value);

} // BorderSupport
