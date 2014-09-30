/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.Arrow#isLeft <em>Left</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Arrow#isRight <em>Right</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Arrow#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getArrow()
 * @model
 * @generated
 */
public interface Arrow extends Widget, ColorForegroundSupport, LineStyleSupport, AnnotationSupport {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles left arrow head.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Left</em>' attribute.
	 * @see #setLeft(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getArrow_Left()
	 * @model default="true"
	 * @generated
	 */
	boolean isLeft();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Arrow#isLeft <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' attribute.
	 * @see #isLeft()
	 * @generated
	 */
	void setLeft(boolean value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles right arrow head.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Right</em>' attribute.
	 * @see #setRight(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getArrow_Right()
	 * @model default="false"
	 * @generated
	 */
	boolean isRight();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Arrow#isRight <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' attribute.
	 * @see #isRight()
	 * @generated
	 */
	void setRight(boolean value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link com.wireframesketcher.model.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see com.wireframesketcher.model.Position
	 * @see #setDirection(Position)
	 * @see com.wireframesketcher.model.ModelPackage#getArrow_Direction()
	 * @model
	 * @generated
	 */
	Position getDirection();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Arrow#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see com.wireframesketcher.model.Position
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Position value);

} // Arrow
