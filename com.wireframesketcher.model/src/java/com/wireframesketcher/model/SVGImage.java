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
 * A representation of the model object '<em><b>SVG Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.SVGImage#getSrc <em>Src</em>}</li>
 *   <li>{@link com.wireframesketcher.model.SVGImage#isHFlip <em>HFlip</em>}</li>
 *   <li>{@link com.wireframesketcher.model.SVGImage#isVFlip <em>VFlip</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getSVGImage()
 * @model
 * @generated
 */
public interface SVGImage extends Widget, LinkSupport, ColorBackgroundSupport, ColorForegroundSupport, ColorAlphaSupport, RotationSupport {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Image source file path. Can be absolute or relative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(URI)
	 * @see com.wireframesketcher.model.ModelPackage#getSVGImage_Src()
	 * @model dataType="com.wireframesketcher.model.URIDataType"
	 * @generated
	 */
	URI getSrc();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.SVGImage#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(URI value);

	/**
	 * Returns the value of the '<em><b>HFlip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles horizontal flip
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>HFlip</em>' attribute.
	 * @see #setHFlip(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getSVGImage_HFlip()
	 * @model
	 * @generated
	 */
	boolean isHFlip();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.SVGImage#isHFlip <em>HFlip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HFlip</em>' attribute.
	 * @see #isHFlip()
	 * @generated
	 */
	void setHFlip(boolean value);

	/**
	 * Returns the value of the '<em><b>VFlip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles vertical flip
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VFlip</em>' attribute.
	 * @see #setVFlip(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getSVGImage_VFlip()
	 * @model
	 * @generated
	 */
	boolean isVFlip();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.SVGImage#isVFlip <em>VFlip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VFlip</em>' attribute.
	 * @see #isVFlip()
	 * @generated
	 */
	void setVFlip(boolean value);

} // SVGImage
