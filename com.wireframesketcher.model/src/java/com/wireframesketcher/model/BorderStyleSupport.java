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
 * A representation of the model object '<em><b>Border Style Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.BorderStyleSupport#getBorder <em>Border</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getBorderStyleSupport()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BorderStyleSupport extends EObject {
	/**
	 * Returns the value of the '<em><b>Border</b></em>' attribute.
	 * The default value is <code>"solid"</code>.
	 * The literals are from the enumeration {@link com.wireframesketcher.model.BorderStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' attribute.
	 * @see com.wireframesketcher.model.BorderStyle
	 * @see #setBorder(BorderStyle)
	 * @see com.wireframesketcher.model.ModelPackage#getBorderStyleSupport_Border()
	 * @model default="solid"
	 * @generated
	 */
	BorderStyle getBorder();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.BorderStyleSupport#getBorder <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border</em>' attribute.
	 * @see com.wireframesketcher.model.BorderStyle
	 * @see #getBorder()
	 * @generated
	 */
	void setBorder(BorderStyle value);

} // BorderStyleSupport
