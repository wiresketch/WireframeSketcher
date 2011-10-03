/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;

import com.wireframesketcher.model.overrides.Overrides;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Master</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.Master#getScreen <em>Screen</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Master#isDimmed <em>Dimmed</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Master#getOverrides <em>Overrides</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Master#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getMaster()
 * @model
 * @generated
 */
public interface Master extends Widget, LinkSupport {
	/**
	 * Returns the value of the '<em><b>Screen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the master screen file. Can be absolute to workspace or relative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Screen</em>' reference.
	 * @see #setScreen(WidgetContainer)
	 * @see com.wireframesketcher.model.ModelPackage#getMaster_Screen()
	 * @model
	 * @generated
	 */
	WidgetContainer getScreen();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Master#getScreen <em>Screen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen</em>' reference.
	 * @see #getScreen()
	 * @generated
	 */
	void setScreen(WidgetContainer value);

	/**
	 * Returns the value of the '<em><b>Dimmed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimmed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles dimmed style rendering in design mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dimmed</em>' attribute.
	 * @see #setDimmed(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getMaster_Dimmed()
	 * @model
	 * @generated
	 */
	boolean isDimmed();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Master#isDimmed <em>Dimmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimmed</em>' attribute.
	 * @see #isDimmed()
	 * @generated
	 */
	void setDimmed(boolean value);

	/**
	 * Returns the value of the '<em><b>Overrides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overrides</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Local overrides
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overrides</em>' containment reference.
	 * @see #setOverrides(Overrides)
	 * @see com.wireframesketcher.model.ModelPackage#getMaster_Overrides()
	 * @model containment="true"
	 * @generated
	 */
	Overrides getOverrides();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Master#getOverrides <em>Overrides</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overrides</em>' containment reference.
	 * @see #getOverrides()
	 * @generated
	 */
	void setOverrides(Overrides value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Local instance of referenced component with overrides applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference.
	 * @see com.wireframesketcher.model.ModelPackage#getMaster_Instance()
	 * @model containment="true" transient="true" derived="true" suppressedSetVisibility="true"
	 * @generated
	 */
	WidgetContainer getInstance();

} // Master
