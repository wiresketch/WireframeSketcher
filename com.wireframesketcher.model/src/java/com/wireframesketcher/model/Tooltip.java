/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tooltip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.Tooltip#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getTooltip()
 * @model
 * @generated
 */
public interface Tooltip extends Widget, FontSupport, TextAlignmentSupport, ColorBackgroundSupport, SkinSupport, TextLinksSupport {

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The default value is <code>"bottomLeft"</code>.
	 * The literals are from the enumeration {@link com.wireframesketcher.model.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pointing arrow position.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see com.wireframesketcher.model.Position
	 * @see #setPosition(Position)
	 * @see com.wireframesketcher.model.ModelPackage#getTooltip_Position()
	 * @model default="bottomLeft" required="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Tooltip#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see com.wireframesketcher.model.Position
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);
} // Tooltip
