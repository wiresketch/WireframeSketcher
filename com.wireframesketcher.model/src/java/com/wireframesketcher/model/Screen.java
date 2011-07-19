/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.Screen#getHRuler <em>HRuler</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Screen#getVRuler <em>VRuler</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Screen#getName <em>Name</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Screen#getFont <em>Font</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Screen#getTheme <em>Theme</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getScreen()
 * @model
 * @generated
 */
public interface Screen extends WidgetContainer {
	/**
	 * Returns the value of the '<em><b>HRuler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HRuler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HRuler</em>' containment reference.
	 * @see #setHRuler(ScreenRuler)
	 * @see com.wireframesketcher.model.ModelPackage#getScreen_HRuler()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ScreenRuler getHRuler();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Screen#getHRuler <em>HRuler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HRuler</em>' containment reference.
	 * @see #getHRuler()
	 * @generated
	 */
	void setHRuler(ScreenRuler value);

	/**
	 * Returns the value of the '<em><b>VRuler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VRuler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VRuler</em>' containment reference.
	 * @see #setVRuler(ScreenRuler)
	 * @see com.wireframesketcher.model.ModelPackage#getScreen_VRuler()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ScreenRuler getVRuler();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Screen#getVRuler <em>VRuler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VRuler</em>' containment reference.
	 * @see #getVRuler()
	 * @generated
	 */
	void setVRuler(ScreenRuler value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.wireframesketcher.model.ModelPackage#getScreen_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Screen#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' containment reference.
	 * @see #setFont(ScreenFont)
	 * @see com.wireframesketcher.model.ModelPackage#getScreen_Font()
	 * @model containment="true"
	 * @generated
	 */
	ScreenFont getFont();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Screen#getFont <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' containment reference.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(ScreenFont value);

	/**
	 * Returns the value of the '<em><b>Theme</b></em>' attribute.
	 * The literals are from the enumeration {@link com.wireframesketcher.model.Theme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theme</em>' attribute.
	 * @see com.wireframesketcher.model.Theme
	 * @see #setTheme(Theme)
	 * @see com.wireframesketcher.model.ModelPackage#getScreen_Theme()
	 * @model
	 * @generated
	 */
	Theme getTheme();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Screen#getTheme <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theme</em>' attribute.
	 * @see com.wireframesketcher.model.Theme
	 * @see #getTheme()
	 * @generated
	 */
	void setTheme(Theme value);

} // Screen