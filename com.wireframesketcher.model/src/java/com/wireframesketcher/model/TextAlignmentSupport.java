/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Alignment Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.TextAlignmentSupport#getTextAlignment <em>Text Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getTextAlignmentSupport()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TextAlignmentSupport extends EObject {
	/**
	 * Returns the value of the '<em><b>Text Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link com.wireframesketcher.model.TextAlignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text alignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Alignment</em>' attribute.
	 * @see com.wireframesketcher.model.TextAlignment
	 * @see #setTextAlignment(TextAlignment)
	 * @see com.wireframesketcher.model.ModelPackage#getTextAlignmentSupport_TextAlignment()
	 * @model
	 * @generated
	 */
	TextAlignment getTextAlignment();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.TextAlignmentSupport#getTextAlignment <em>Text Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Alignment</em>' attribute.
	 * @see com.wireframesketcher.model.TextAlignment
	 * @see #getTextAlignment()
	 * @generated
	 */
	void setTextAlignment(TextAlignment value);

} // TextAlignmentSupport
