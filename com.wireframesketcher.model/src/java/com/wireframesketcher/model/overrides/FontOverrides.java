/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.overrides;

import com.wireframesketcher.model.FontSize;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Overrides</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.overrides.FontOverrides#getSize <em>Size</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.FontOverrides#getBold <em>Bold</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.FontOverrides#getItalic <em>Italic</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.FontOverrides#getUnderline <em>Underline</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.overrides.OverridesPackage#getFontOverrides()
 * @model
 * @generated
 */
public interface FontOverrides extends EObject {

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Font size.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(FontSize)
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getFontOverrides_Size()
	 * @model dataType="com.wireframesketcher.model.FontSizeDataType" required="true"
	 * @generated
	 */
	FontSize getSize();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.overrides.FontOverrides#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(FontSize value);

	/**
	 * Returns the value of the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles bold style.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bold</em>' attribute.
	 * @see #setBold(Boolean)
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getFontOverrides_Bold()
	 * @model required="true"
	 * @generated
	 */
	Boolean getBold();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.overrides.FontOverrides#getBold <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bold</em>' attribute.
	 * @see #getBold()
	 * @generated
	 */
	void setBold(Boolean value);

	/**
	 * Returns the value of the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles italics style.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Italic</em>' attribute.
	 * @see #setItalic(Boolean)
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getFontOverrides_Italic()
	 * @model required="true"
	 * @generated
	 */
	Boolean getItalic();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.overrides.FontOverrides#getItalic <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Italic</em>' attribute.
	 * @see #getItalic()
	 * @generated
	 */
	void setItalic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toggles underline style.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Underline</em>' attribute.
	 * @see #setUnderline(Boolean)
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getFontOverrides_Underline()
	 * @model required="true"
	 * @generated
	 */
	Boolean getUnderline();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.overrides.FontOverrides#getUnderline <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underline</em>' attribute.
	 * @see #getUnderline()
	 * @generated
	 */
	void setUnderline(Boolean value);
} // FontOverrides
