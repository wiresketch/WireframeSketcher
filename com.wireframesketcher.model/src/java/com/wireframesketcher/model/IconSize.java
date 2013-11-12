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
 * A representation of the literals of the enumeration '<em><b>Icon Size</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.wireframesketcher.model.ModelPackage#getIconSize()
 * @model
 * @generated
 */
public enum IconSize implements Enumerator
{
	/**
	 * The '<em><b>Small</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL
	 * @generated
	 * @ordered
	 */
	SMALL_LITERAL(0, "Small", "small"),
	/**
	 * The '<em><b>Medium</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM
	 * @generated
	 * @ordered
	 */
	MEDIUM_LITERAL(1, "Medium", "medium"),
	/**
	 * The '<em><b>Large</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LARGE
	 * @generated
	 * @ordered
	 */
	LARGE_LITERAL(2, "Large", "large"), /**
	 * The '<em><b>XLarge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE
	 * @generated
	 * @ordered
	 */
	XLARGE_LITERAL(3, "XLarge", "xlarge"), /**
	 * The '<em><b>Custom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM
	 * @generated
	 * @ordered
	 */
	CUSTOM_LITERAL(4, "Custom", "custom");
	/**
	 * The '<em><b>Small</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Small</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMALL_LITERAL
	 * @model name="Small" literal="small"
	 * @generated
	 * @ordered
	 */
	public static final int SMALL = 0;

	/**
	 * The '<em><b>Medium</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medium</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDIUM_LITERAL
	 * @model name="Medium" literal="medium"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM = 1;

	/**
	 * The '<em><b>Large</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Large</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LARGE_LITERAL
	 * @model name="Large" literal="large"
	 * @generated
	 * @ordered
	 */
	public static final int LARGE = 2;

	/**
	 * The '<em><b>XLarge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XLarge</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XLARGE_LITERAL
	 * @model name="XLarge" literal="xlarge"
	 * @generated
	 * @ordered
	 */
	public static final int XLARGE = 3;

	/**
	 * The '<em><b>Custom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Custom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_LITERAL
	 * @model name="Custom" literal="custom"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM = 4;

	/**
	 * An array of all the '<em><b>Icon Size</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IconSize[] VALUES_ARRAY =
		new IconSize[] {
			SMALL_LITERAL,
			MEDIUM_LITERAL,
			LARGE_LITERAL,
			XLARGE_LITERAL,
			CUSTOM_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Icon Size</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IconSize> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Icon Size</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IconSize get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IconSize result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Icon Size</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IconSize getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IconSize result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Icon Size</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IconSize get(int value) {
		switch (value) {
			case SMALL: return SMALL_LITERAL;
			case MEDIUM: return MEDIUM_LITERAL;
			case LARGE: return LARGE_LITERAL;
			case XLARGE: return XLARGE_LITERAL;
			case CUSTOM: return CUSTOM_LITERAL;
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
	private IconSize(int value, String name, String literal) {
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
	
	/**
	 * Returns this size expressed in pixels
	 * 
	 * @see #getSizePixels(IconSize)
	 */
	public int getSizePixels() {
		return getSizePixels(this);
	}
	
	/**
	 * Converts the given size to pixels. For custom sizes <code>-1</code> is
	 * returned.
	 * 
	 * @param size
	 *            the size
	 * @return size in pixels or <code>-1</code>
	 */
	public static int getSizePixels(IconSize size) {
		switch (size.getValue()) {
		case SMALL:
			return 16;
		case MEDIUM:
			return 24;
		case LARGE:
			return 32;
		case XLARGE:
			return 48;
		case CUSTOM:
			return -1;
		}
		throw new IllegalArgumentException(size.toString());
	}
}
