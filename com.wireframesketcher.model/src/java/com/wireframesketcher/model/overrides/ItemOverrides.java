/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.overrides;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Overrides</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.overrides.ItemOverrides#getText <em>Text</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.ItemOverrides#getLink <em>Link</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.ItemOverrides#isNoLink <em>No Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.overrides.OverridesPackage#getItemOverrides()
 * @model
 * @generated
 */
public interface ItemOverrides extends Reference {

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getItemOverrides_Text()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.overrides.ItemOverrides#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linked screen file path. Can be absolute or relative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link</em>' attribute.
	 * @see #setLink(URI)
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getItemOverrides_Link()
	 * @model dataType="com.wireframesketcher.model.URIDataType"
	 * @generated
	 */
	URI getLink();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.overrides.ItemOverrides#getLink <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' attribute.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(URI value);

	/**
	 * Returns the value of the '<em><b>No Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the link is deleted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Link</em>' attribute.
	 * @see #setNoLink(boolean)
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getItemOverrides_NoLink()
	 * @model
	 * @generated
	 */
	boolean isNoLink();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.overrides.ItemOverrides#isNoLink <em>No Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Link</em>' attribute.
	 * @see #isNoLink()
	 * @generated
	 */
	void setNoLink(boolean value);
} // ItemOverrides
