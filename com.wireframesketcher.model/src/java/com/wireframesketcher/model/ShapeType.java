/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Shape Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.wireframesketcher.model.ModelPackage#getShapeType()
 * @model
 * @generated
 */
public enum ShapeType implements Enumerator {
	/**
	 * The '<em><b>Ellipse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELLIPSE_VALUE
	 * @generated
	 * @ordered
	 */
	ELLIPSE(0, "Ellipse", "ellipse"), /**
	 * The '<em><b>Rectangle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECTANGLE_VALUE
	 * @generated
	 * @ordered
	 */
	RECTANGLE(1, "Rectangle", "rectangle"),

	/**
	 * The '<em><b>Rounded Rectangle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUNDED_RECTANGLE_VALUE
	 * @generated
	 * @ordered
	 */
	ROUNDED_RECTANGLE(2, "RoundedRectangle", "rectangle-rounded"),

	/**
	 * The '<em><b>Round Rectangle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUND_RECTANGLE_VALUE
	 * @generated
	 * @ordered
	 */
	ROUND_RECTANGLE(3, "RoundRectangle", "rectangle-round"),

	/**
	 * The '<em><b>Diamond</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAMOND_VALUE
	 * @generated
	 * @ordered
	 */
	DIAMOND(4, "Diamond", "diamond"),

	/**
	 * The '<em><b>Star</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STAR_VALUE
	 * @generated
	 * @ordered
	 */
	STAR(5, "Star", "star"),

	/**
	 * The '<em><b>Parallelogram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLELOGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	PARALLELOGRAM(6, "Parallelogram", "parallelogram"),

	/**
	 * The '<em><b>Triangle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIANGLE_VALUE
	 * @generated
	 * @ordered
	 */
	TRIANGLE(7, "Triangle", "triangle"), /**
	 * The '<em><b>Right Triangle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_TRIANGLE_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT_TRIANGLE(8, "RightTriangle", "triangle-right");

	/**
	 * The '<em><b>Ellipse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ellipse</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELLIPSE
	 * @model name="Ellipse" literal="ellipse"
	 * @generated
	 * @ordered
	 */
	public static final int ELLIPSE_VALUE = 0;

	/**
	 * The '<em><b>Rectangle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rectangle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECTANGLE
	 * @model name="Rectangle" literal="rectangle"
	 * @generated
	 * @ordered
	 */
	public static final int RECTANGLE_VALUE = 1;

	/**
	 * The '<em><b>Rounded Rectangle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rounded Rectangle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROUNDED_RECTANGLE
	 * @model name="RoundedRectangle" literal="rectangle-rounded"
	 * @generated
	 * @ordered
	 */
	public static final int ROUNDED_RECTANGLE_VALUE = 2;

	/**
	 * The '<em><b>Round Rectangle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Round Rectangle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROUND_RECTANGLE
	 * @model name="RoundRectangle" literal="rectangle-round"
	 * @generated
	 * @ordered
	 */
	public static final int ROUND_RECTANGLE_VALUE = 3;

	/**
	 * The '<em><b>Diamond</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diamond</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIAMOND
	 * @model name="Diamond" literal="diamond"
	 * @generated
	 * @ordered
	 */
	public static final int DIAMOND_VALUE = 4;

	/**
	 * The '<em><b>Star</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Star</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STAR
	 * @model name="Star" literal="star"
	 * @generated
	 * @ordered
	 */
	public static final int STAR_VALUE = 5;

	/**
	 * The '<em><b>Parallelogram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parallelogram</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARALLELOGRAM
	 * @model name="Parallelogram" literal="parallelogram"
	 * @generated
	 * @ordered
	 */
	public static final int PARALLELOGRAM_VALUE = 6;

	/**
	 * The '<em><b>Triangle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Triangle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIANGLE
	 * @model name="Triangle" literal="triangle"
	 * @generated
	 * @ordered
	 */
	public static final int TRIANGLE_VALUE = 7;

	/**
	 * The '<em><b>Right Triangle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Right Triangle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGHT_TRIANGLE
	 * @model name="RightTriangle" literal="triangle-right"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_TRIANGLE_VALUE = 8;

	/**
	 * An array of all the '<em><b>Shape Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ShapeType[] VALUES_ARRAY =
		new ShapeType[] {
			ELLIPSE,
			RECTANGLE,
			ROUNDED_RECTANGLE,
			ROUND_RECTANGLE,
			DIAMOND,
			STAR,
			PARALLELOGRAM,
			TRIANGLE,
			RIGHT_TRIANGLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Shape Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ShapeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Shape Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShapeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ShapeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Shape Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShapeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ShapeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Shape Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShapeType get(int value) {
		switch (value) {
			case ELLIPSE_VALUE: return ELLIPSE;
			case RECTANGLE_VALUE: return RECTANGLE;
			case ROUNDED_RECTANGLE_VALUE: return ROUNDED_RECTANGLE;
			case ROUND_RECTANGLE_VALUE: return ROUND_RECTANGLE;
			case DIAMOND_VALUE: return DIAMOND;
			case STAR_VALUE: return STAR;
			case PARALLELOGRAM_VALUE: return PARALLELOGRAM;
			case TRIANGLE_VALUE: return TRIANGLE;
			case RIGHT_TRIANGLE_VALUE: return RIGHT_TRIANGLE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ShapeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ShapeType
