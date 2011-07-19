/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.LinkSupport#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getLinkSupport()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface LinkSupport extends EObject {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linked screen file path. Can be absolute or relative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link</em>' attribute.
	 * @see #setLink(URI)
	 * @see com.wireframesketcher.model.ModelPackage#getLinkSupport_Link()
	 * @model dataType="com.wireframesketcher.model.URIDataType"
	 * @generated
	 */
	URI getLink();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.LinkSupport#getLink <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' attribute.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(URI value);

} // LinkSupport
