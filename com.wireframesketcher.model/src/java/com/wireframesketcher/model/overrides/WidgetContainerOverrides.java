/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.overrides;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget Container Overrides</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.overrides.WidgetContainerOverrides#getWidgetChanges <em>Widget Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.overrides.OverridesPackage#getWidgetContainerOverrides()
 * @model abstract="true"
 * @generated
 */
public interface WidgetContainerOverrides extends EObject {
	/**
	 * Returns the value of the '<em><b>Widget Changes</b></em>' containment reference list.
	 * The list contents are of type {@link com.wireframesketcher.model.overrides.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widget Changes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widget Changes</em>' containment reference list.
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getWidgetContainerOverrides_WidgetChanges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getWidgetChanges();

} // WidgetContainerOverrides
