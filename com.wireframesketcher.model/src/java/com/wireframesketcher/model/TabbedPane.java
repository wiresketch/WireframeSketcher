/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tabbed Pane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.TabbedPane#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getTabbedPane()
 * @model
 * @generated
 */
public interface TabbedPane extends Widget, SelectionSupport, VerticalScrollbarSupport, ColorBackgroundSupport, ColorAlphaSupport, ItemSupport, FontSupport, SkinSupport {

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The default value is <code>"top"</code>.
	 * The literals are from the enumeration {@link com.wireframesketcher.model.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tabs position.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see com.wireframesketcher.model.Position
	 * @see #setPosition(Position)
	 * @see com.wireframesketcher.model.ModelPackage#getTabbedPane_Position()
	 * @model default="top"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.TabbedPane#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see com.wireframesketcher.model.Position
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);
} // TabbedPane
