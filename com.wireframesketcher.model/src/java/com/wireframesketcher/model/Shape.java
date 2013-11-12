/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.Shape#getShapeType <em>Shape Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getShape()
 * @model
 * @generated
 */
public interface Shape extends Widget, ColorBackgroundSupport, ColorAlphaSupport, ColorForegroundSupport, BorderSupport, IconSupport, IconPositionSupport, FontSupport, LinkSupport, TextAlignmentSupport, LineStyleSupport, SkinSupport, RotationSupport {

	/**
	 * Returns the value of the '<em><b>Shape Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.wireframesketcher.model.ShapeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Type</em>' attribute.
	 * @see com.wireframesketcher.model.ShapeType
	 * @see #setShapeType(ShapeType)
	 * @see com.wireframesketcher.model.ModelPackage#getShape_ShapeType()
	 * @model
	 * @generated
	 */
	ShapeType getShapeType();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Shape#getShapeType <em>Shape Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Type</em>' attribute.
	 * @see com.wireframesketcher.model.ShapeType
	 * @see #getShapeType()
	 * @generated
	 */
	void setShapeType(ShapeType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isRotatable();
} // Shape
