/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.Window#isCloseButton <em>Close Button</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Window#isMinimizeButton <em>Minimize Button</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Window#isMaximizeButton <em>Maximize Button</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getWindow()
 * @model
 * @generated
 */
public interface Window extends Widget, VerticalScrollbarSupport, SkinSupport, ColorBackgroundSupport, ColorAlphaSupport {

	/**
	 * Returns the value of the '<em><b>Close Button</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles close button
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Close Button</em>' attribute.
	 * @see #setCloseButton(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getWindow_CloseButton()
	 * @model default="true"
	 * @generated
	 */
	boolean isCloseButton();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Window#isCloseButton <em>Close Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Close Button</em>' attribute.
	 * @see #isCloseButton()
	 * @generated
	 */
	void setCloseButton(boolean value);

	/**
	 * Returns the value of the '<em><b>Minimize Button</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles minimize button
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimize Button</em>' attribute.
	 * @see #setMinimizeButton(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getWindow_MinimizeButton()
	 * @model default="false"
	 * @generated
	 */
	boolean isMinimizeButton();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Window#isMinimizeButton <em>Minimize Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimize Button</em>' attribute.
	 * @see #isMinimizeButton()
	 * @generated
	 */
	void setMinimizeButton(boolean value);

	/**
	 * Returns the value of the '<em><b>Maximize Button</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles maximize button
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximize Button</em>' attribute.
	 * @see #setMaximizeButton(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getWindow_MaximizeButton()
	 * @model default="false"
	 * @generated
	 */
	boolean isMaximizeButton();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Window#isMaximizeButton <em>Maximize Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximize Button</em>' attribute.
	 * @see #isMaximizeButton()
	 * @generated
	 */
	void setMaximizeButton(boolean value);
} // Window