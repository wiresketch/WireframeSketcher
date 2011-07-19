/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.story;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storyboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.story.Storyboard#getPanels <em>Panels</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.story.StoryPackage#getStoryboard()
 * @model
 * @generated
 */
public interface Storyboard extends EObject {
	/**
	 * Returns the value of the '<em><b>Panels</b></em>' containment reference list.
	 * The list contents are of type {@link com.wireframesketcher.model.story.Panel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panels</em>' containment reference list.
	 * @see com.wireframesketcher.model.story.StoryPackage#getStoryboard_Panels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Panel> getPanels();

} // Storyboard
