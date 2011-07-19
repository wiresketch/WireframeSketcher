/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen Ruler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.ScreenRuler#getGuides <em>Guides</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getScreenRuler()
 * @model
 * @generated
 */
public interface ScreenRuler extends EObject {
	/**
	 * Returns the value of the '<em><b>Guides</b></em>' containment reference list.
	 * The list contents are of type {@link com.wireframesketcher.model.RulerGuide}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guides</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guides</em>' containment reference list.
	 * @see com.wireframesketcher.model.ModelPackage#getScreenRuler_Guides()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RulerGuide> getGuides();

} // ScreenRuler