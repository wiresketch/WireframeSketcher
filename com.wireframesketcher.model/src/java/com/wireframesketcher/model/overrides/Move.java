/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.overrides;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.overrides.Move#getNewIndex <em>New Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.overrides.OverridesPackage#getMove()
 * @model
 * @generated
 */
public interface Move extends Operation, Reference {
	/**
	 * Returns the value of the '<em><b>New Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Index</em>' attribute.
	 * @see #setNewIndex(int)
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getMove_NewIndex()
	 * @model
	 * @generated
	 */
	int getNewIndex();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.overrides.Move#getNewIndex <em>New Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Index</em>' attribute.
	 * @see #getNewIndex()
	 * @generated
	 */
	void setNewIndex(int value);

} // Move
