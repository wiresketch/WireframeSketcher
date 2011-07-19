/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Icon Position Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.IconPositionSupport#getIconPosition <em>Icon Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getIconPositionSupport()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IconPositionSupport extends IconSupport {
	/**
	 * Returns the value of the '<em><b>Icon Position</b></em>' attribute.
	 * The default value is <code>"left"</code>.
	 * The literals are from the enumeration {@link com.wireframesketcher.model.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Position</em>' attribute.
	 * @see com.wireframesketcher.model.Position
	 * @see #setIconPosition(Position)
	 * @see com.wireframesketcher.model.ModelPackage#getIconPositionSupport_IconPosition()
	 * @model default="left"
	 * @generated
	 */
	Position getIconPosition();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.IconPositionSupport#getIconPosition <em>Icon Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Position</em>' attribute.
	 * @see com.wireframesketcher.model.Position
	 * @see #getIconPosition()
	 * @generated
	 */
	void setIconPosition(Position value);

} // IconPositionSupport
