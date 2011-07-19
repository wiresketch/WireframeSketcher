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
 * A representation of the model object '<em><b>Widget Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.WidgetContainer#getWidgets <em>Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getWidgetContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface WidgetContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link com.wireframesketcher.model.Widget}.
	 * It is bidirectional and its opposite is '{@link com.wireframesketcher.model.Widget#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contained widgets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see com.wireframesketcher.model.ModelPackage#getWidgetContainer_Widgets()
	 * @see com.wireframesketcher.model.Widget#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Widget> getWidgets();

} // WidgetContainer
