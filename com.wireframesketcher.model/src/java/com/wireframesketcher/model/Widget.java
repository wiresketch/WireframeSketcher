/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.Widget#getId <em>Id</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Widget#getContainer <em>Container</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Widget#getX <em>X</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Widget#getY <em>Y</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Widget#getWidth <em>Width</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Widget#getHeight <em>Height</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Widget#getText <em>Text</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Widget#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Widget#isLocked <em>Locked</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Widget#getMeasuredWidth <em>Measured Width</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Widget#getMeasuredHeight <em>Measured Height</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Widget#getCustomId <em>Custom Id</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Widget#getCustomData <em>Custom Data</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Widget#isAnnotation <em>Annotation</em>}</li>
 *   <li>{@link com.wireframesketcher.model.Widget#getLayoutParams <em>Layout Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getWidget()
 * @model abstract="true"
 * @generated
 */
public interface Widget extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource-wide identifier
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see com.wireframesketcher.model.ModelPackage#getWidget_Id()
	 * @model id="true" derived="true"
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Widget#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Long value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.wireframesketcher.model.WidgetContainer#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(WidgetContainer)
	 * @see com.wireframesketcher.model.ModelPackage#getWidget_Container()
	 * @see com.wireframesketcher.model.WidgetContainer#getWidgets
	 * @model opposite="widgets" transient="false"
	 * @generated
	 */
	WidgetContainer getContainer();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Widget#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(WidgetContainer value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see com.wireframesketcher.model.ModelPackage#getWidget_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Widget#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see com.wireframesketcher.model.ModelPackage#getWidget_Y()
	 * @model
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Widget#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see com.wireframesketcher.model.ModelPackage#getWidget_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Widget#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see com.wireframesketcher.model.ModelPackage#getWidget_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Widget#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see com.wireframesketcher.model.ModelPackage#getWidget_Text()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Widget#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' reference.
	 * @see com.wireframesketcher.model.ModelPackage#getWidget_Descriptor()
	 * @model resolveProxies="false" transient="true" changeable="false"
	 * @generated
	 */
	WidgetDescriptor getDescriptor();

	/**
	 * Returns the value of the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells if the widget is locked or not
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locked</em>' attribute.
	 * @see #setLocked(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getWidget_Locked()
	 * @model
	 * @generated
	 */
	boolean isLocked();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Widget#isLocked <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked</em>' attribute.
	 * @see #isLocked()
	 * @generated
	 */
	void setLocked(boolean value);

	/**
	 * Returns the value of the '<em><b>Measured Width</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measured Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actual width in pixels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measured Width</em>' attribute.
	 * @see #setMeasuredWidth(int)
	 * @see com.wireframesketcher.model.ModelPackage#getWidget_MeasuredWidth()
	 * @model default="-1" derived="true"
	 * @generated
	 */
	int getMeasuredWidth();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Widget#getMeasuredWidth <em>Measured Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured Width</em>' attribute.
	 * @see #getMeasuredWidth()
	 * @generated
	 */
	void setMeasuredWidth(int value);

	/**
	 * Returns the value of the '<em><b>Measured Height</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measured Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actual height in pixels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measured Height</em>' attribute.
	 * @see #setMeasuredHeight(int)
	 * @see com.wireframesketcher.model.ModelPackage#getWidget_MeasuredHeight()
	 * @model default="-1" derived="true"
	 * @generated
	 */
	int getMeasuredHeight();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Widget#getMeasuredHeight <em>Measured Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured Height</em>' attribute.
	 * @see #getMeasuredHeight()
	 * @generated
	 */
	void setMeasuredHeight(int value);

	/**
	 * Returns the value of the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User-specified custom widget ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Id</em>' attribute.
	 * @see #setCustomId(String)
	 * @see com.wireframesketcher.model.ModelPackage#getWidget_CustomId()
	 * @model
	 * @generated
	 */
	String getCustomId();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Widget#getCustomId <em>Custom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Id</em>' attribute.
	 * @see #getCustomId()
	 * @generated
	 */
	void setCustomId(String value);

	/**
	 * Returns the value of the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User-specified custom widget data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Data</em>' attribute.
	 * @see #setCustomData(String)
	 * @see com.wireframesketcher.model.ModelPackage#getWidget_CustomData()
	 * @model
	 * @generated
	 */
	String getCustomData();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Widget#getCustomData <em>Custom Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Data</em>' attribute.
	 * @see #getCustomData()
	 * @generated
	 */
	void setCustomData(String value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether the widget should be treated as annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation</em>' attribute.
	 * @see #setAnnotation(boolean)
	 * @see com.wireframesketcher.model.ModelPackage#getWidget_Annotation()
	 * @model
	 * @generated
	 */
	boolean isAnnotation();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Widget#isAnnotation <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' attribute.
	 * @see #isAnnotation()
	 * @generated
	 */
	void setAnnotation(boolean value);

	/**
	 * Returns the value of the '<em><b>Layout Params</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Layout parameters that control how the widget behaves when its container is resized. It's a combination of anchor-left, anchor-center, anchor-right flags for horizontal direction and anchor-top, anchor-middle, anchor-bottom for vertical direction. For example "anchor-left,anchor-right|anchor-top" value will anchor the widget to left and right horizontally and to top vertically..
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layout Params</em>' attribute.
	 * @see #setLayoutParams(LayoutParams)
	 * @see com.wireframesketcher.model.ModelPackage#getWidget_LayoutParams()
	 * @model default="none" dataType="com.wireframesketcher.model.LayoutParamsDataType"
	 * @generated
	 */
	LayoutParams getLayoutParams();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Widget#getLayoutParams <em>Layout Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Params</em>' attribute.
	 * @see #getLayoutParams()
	 * @generated
	 */
	void setLayoutParams(LayoutParams value);

	String getType();
} // Widget
