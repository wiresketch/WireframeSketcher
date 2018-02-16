/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.overrides;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget Overrides</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.overrides.WidgetOverrides#getX <em>X</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.WidgetOverrides#getY <em>Y</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.WidgetOverrides#getWidth <em>Width</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.WidgetOverrides#getHeight <em>Height</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.WidgetOverrides#getText <em>Text</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.WidgetOverrides#isNoText <em>No Text</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.WidgetOverrides#getLink <em>Link</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.WidgetOverrides#isNoLink <em>No Link</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.WidgetOverrides#getSrc <em>Src</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.WidgetOverrides#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.WidgetOverrides#getFont <em>Font</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.WidgetOverrides#getItems <em>Items</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.WidgetOverrides#getItemChanges <em>Item Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.overrides.OverridesPackage#getWidgetOverrides()
 * @model
 * @generated
 */
public interface WidgetOverrides extends WidgetContainerOverrides, Reference {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Absolute X position in pixels
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(Integer)
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getWidgetOverrides_X()
	 * @model
	 * @generated
	 */
	Integer getX();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.overrides.WidgetOverrides#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(Integer value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Absolute Y position in pixels
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(Integer)
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getWidgetOverrides_Y()
	 * @model
	 * @generated
	 */
	Integer getY();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.overrides.WidgetOverrides#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(Integer value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User-specified width in pixels. If -1 then look at measuredWidth.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Integer)
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getWidgetOverrides_Width()
	 * @model
	 * @generated
	 */
	Integer getWidth();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.overrides.WidgetOverrides#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User-specified height in pixels. If -1 then look at measuredHeight.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(Integer)
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getWidgetOverrides_Height()
	 * @model
	 * @generated
	 */
	Integer getHeight();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.overrides.WidgetOverrides#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Integer value);

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
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getWidgetOverrides_Text()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.overrides.WidgetOverrides#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>No Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the text is deleted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Text</em>' attribute.
	 * @see #setNoText(boolean)
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getWidgetOverrides_NoText()
	 * @model
	 * @generated
	 */
	boolean isNoText();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.overrides.WidgetOverrides#isNoText <em>No Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Text</em>' attribute.
	 * @see #isNoText()
	 * @generated
	 */
	void setNoText(boolean value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linked screen file path. Can be absolute or relative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link</em>' attribute.
	 * @see #setLink(URI)
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getWidgetOverrides_Link()
	 * @model dataType="com.wireframesketcher.model.URIDataType"
	 * @generated
	 */
	URI getLink();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.overrides.WidgetOverrides#getLink <em>Link</em>}' attribute.
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
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getWidgetOverrides_NoLink()
	 * @model
	 * @generated
	 */
	boolean isNoLink();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.overrides.WidgetOverrides#isNoLink <em>No Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Link</em>' attribute.
	 * @see #isNoLink()
	 * @generated
	 */
	void setNoLink(boolean value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Image source file path. Can be absolute or relative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(URI)
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getWidgetOverrides_Src()
	 * @model dataType="com.wireframesketcher.model.URIDataType"
	 * @generated
	 */
	URI getSrc();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.overrides.WidgetOverrides#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(URI value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' map.
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getWidgetOverrides_Attributes()
	 * @model mapType="com.wireframesketcher.model.overrides.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getAttributes();

	/**
	 * Returns the value of the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' containment reference.
	 * @see #setFont(FontOverrides)
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getWidgetOverrides_Font()
	 * @model containment="true"
	 * @generated
	 */
	FontOverrides getFont();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.overrides.WidgetOverrides#getFont <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' containment reference.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(FontOverrides value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link com.wireframesketcher.model.overrides.ItemOverrides}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getWidgetOverrides_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemOverrides> getItems();

	/**
	 * Returns the value of the '<em><b>Item Changes</b></em>' containment reference list.
	 * The list contents are of type {@link com.wireframesketcher.model.overrides.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Changes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Changes</em>' containment reference list.
	 * @see com.wireframesketcher.model.overrides.OverridesPackage#getWidgetOverrides_ItemChanges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getItemChanges();

} // WidgetOverrides
