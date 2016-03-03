/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;

import org.eclipse.emf.common.util.URI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.Image#getSrc <em>Src</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Image#isGrayscale <em>Grayscale</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends Widget, LinkSupport, RotationSupport, FlipSupport, BorderSupport {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Image source file path. Can be absolute or relative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(URI)
	 * @see com.wireframesketcher.model.ModelPackage#getImage_Src()
	 * @model dataType="com.wireframesketcher.model.URIDataType"
	 * @generated
	 */
	URI getSrc();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Image#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(URI value);

	/**
	 * Returns the value of the '<em><b>Grayscale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grayscale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles grayscale image rendering.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grayscale</em>' attribute.
	 * @see #setGrayscale(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getImage_Grayscale()
	 * @model
	 * @generated
	 */
	boolean isGrayscale();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Image#isGrayscale <em>Grayscale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grayscale</em>' attribute.
	 * @see #isGrayscale()
	 * @generated
	 */
	void setGrayscale(boolean value);

} // Image
