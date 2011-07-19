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
 * A representation of the model object '<em><b>Vertical Scrollbar Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.VerticalScrollbarSupport#isVerticalScrollbar <em>Vertical Scrollbar</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getVerticalScrollbarSupport()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface VerticalScrollbarSupport extends ValueSupport {
	/**
	 * Returns the value of the '<em><b>Vertical Scrollbar</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Scrollbar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles vertical scrollbar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Scrollbar</em>' attribute.
	 * @see #setVerticalScrollbar(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getVerticalScrollbarSupport_VerticalScrollbar()
	 * @model default="false"
	 * @generated
	 */
	boolean isVerticalScrollbar();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.VerticalScrollbarSupport#isVerticalScrollbar <em>Vertical Scrollbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Scrollbar</em>' attribute.
	 * @see #isVerticalScrollbar()
	 * @generated
	 */
	void setVerticalScrollbar(boolean value);

} // VerticalScrollbarSupport
