/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.overrides;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.wireframesketcher.model.overrides.OverridesFactory
 * @model kind="package"
 * @generated
 */
public interface OverridesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "overrides";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://wireframesketcher.com/1.0/model/overrides";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "o";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OverridesPackage eINSTANCE = com.wireframesketcher.model.overrides.impl.OverridesPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.overrides.impl.WidgetContainerOverridesImpl <em>Widget Container Overrides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.overrides.impl.WidgetContainerOverridesImpl
	 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getWidgetContainerOverrides()
	 * @generated
	 */
	int WIDGET_CONTAINER_OVERRIDES = 10;

	/**
	 * The feature id for the '<em><b>Widget Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_CONTAINER_OVERRIDES__WIDGET_CHANGES = 0;

	/**
	 * The number of structural features of the '<em>Widget Container Overrides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_CONTAINER_OVERRIDES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.overrides.impl.OverridesImpl <em>Overrides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.overrides.impl.OverridesImpl
	 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getOverrides()
	 * @generated
	 */
	int OVERRIDES = 0;

	/**
	 * The feature id for the '<em><b>Widget Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDES__WIDGET_CHANGES = WIDGET_CONTAINER_OVERRIDES__WIDGET_CHANGES;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDES__WIDGETS = WIDGET_CONTAINER_OVERRIDES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Overrides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDES_FEATURE_COUNT = WIDGET_CONTAINER_OVERRIDES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.overrides.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.overrides.impl.ReferenceImpl
	 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 9;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.overrides.impl.WidgetOverridesImpl <em>Widget Overrides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.overrides.impl.WidgetOverridesImpl
	 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getWidgetOverrides()
	 * @generated
	 */
	int WIDGET_OVERRIDES = 1;

	/**
	 * The feature id for the '<em><b>Widget Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OVERRIDES__WIDGET_CHANGES = WIDGET_CONTAINER_OVERRIDES__WIDGET_CHANGES;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OVERRIDES__REF = WIDGET_CONTAINER_OVERRIDES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OVERRIDES__X = WIDGET_CONTAINER_OVERRIDES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OVERRIDES__Y = WIDGET_CONTAINER_OVERRIDES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OVERRIDES__WIDTH = WIDGET_CONTAINER_OVERRIDES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OVERRIDES__HEIGHT = WIDGET_CONTAINER_OVERRIDES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OVERRIDES__TEXT = WIDGET_CONTAINER_OVERRIDES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>No Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OVERRIDES__NO_TEXT = WIDGET_CONTAINER_OVERRIDES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OVERRIDES__LINK = WIDGET_CONTAINER_OVERRIDES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>No Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OVERRIDES__NO_LINK = WIDGET_CONTAINER_OVERRIDES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OVERRIDES__SRC = WIDGET_CONTAINER_OVERRIDES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OVERRIDES__ATTRIBUTES = WIDGET_CONTAINER_OVERRIDES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OVERRIDES__FONT = WIDGET_CONTAINER_OVERRIDES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OVERRIDES__ITEMS = WIDGET_CONTAINER_OVERRIDES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Item Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OVERRIDES__ITEM_CHANGES = WIDGET_CONTAINER_OVERRIDES_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Widget Overrides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OVERRIDES_FEATURE_COUNT = WIDGET_CONTAINER_OVERRIDES_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.overrides.impl.FontOverridesImpl <em>Font Overrides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.overrides.impl.FontOverridesImpl
	 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getFontOverrides()
	 * @generated
	 */
	int FONT_OVERRIDES = 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_OVERRIDES__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_OVERRIDES__BOLD = 1;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_OVERRIDES__ITALIC = 2;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_OVERRIDES__UNDERLINE = 3;

	/**
	 * The number of structural features of the '<em>Font Overrides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_OVERRIDES_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REF = 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.overrides.impl.ItemOverridesImpl <em>Item Overrides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.overrides.impl.ItemOverridesImpl
	 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getItemOverrides()
	 * @generated
	 */
	int ITEM_OVERRIDES = 3;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OVERRIDES__REF = REFERENCE__REF;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OVERRIDES__TEXT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OVERRIDES__LINK = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>No Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OVERRIDES__NO_LINK = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Item Overrides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OVERRIDES_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.overrides.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.overrides.impl.StringToStringMapImpl
	 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getStringToStringMap()
	 * @generated
	 */
	int STRING_TO_STRING_MAP = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.overrides.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.overrides.impl.OperationImpl
	 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 5;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.overrides.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.overrides.impl.MoveImpl
	 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 6;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__REF = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__NEW_INDEX = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.overrides.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.overrides.impl.DeleteImpl
	 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 7;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__REF = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.overrides.impl.InsertImpl <em>Insert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.overrides.impl.InsertImpl
	 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getInsert()
	 * @generated
	 */
	int INSERT = 8;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__OBJECT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__NEW_INDEX = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Insert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.overrides.Overrides <em>Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overrides</em>'.
	 * @see com.wireframesketcher.model.overrides.Overrides
	 * @generated
	 */
	EClass getOverrides();

	/**
	 * Returns the meta object for the containment reference list '{@link com.wireframesketcher.model.overrides.Overrides#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see com.wireframesketcher.model.overrides.Overrides#getWidgets()
	 * @see #getOverrides()
	 * @generated
	 */
	EReference getOverrides_Widgets();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.overrides.WidgetOverrides <em>Widget Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Overrides</em>'.
	 * @see com.wireframesketcher.model.overrides.WidgetOverrides
	 * @generated
	 */
	EClass getWidgetOverrides();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.overrides.WidgetOverrides#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see com.wireframesketcher.model.overrides.WidgetOverrides#getX()
	 * @see #getWidgetOverrides()
	 * @generated
	 */
	EAttribute getWidgetOverrides_X();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.overrides.WidgetOverrides#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see com.wireframesketcher.model.overrides.WidgetOverrides#getY()
	 * @see #getWidgetOverrides()
	 * @generated
	 */
	EAttribute getWidgetOverrides_Y();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.overrides.WidgetOverrides#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see com.wireframesketcher.model.overrides.WidgetOverrides#getWidth()
	 * @see #getWidgetOverrides()
	 * @generated
	 */
	EAttribute getWidgetOverrides_Width();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.overrides.WidgetOverrides#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see com.wireframesketcher.model.overrides.WidgetOverrides#getHeight()
	 * @see #getWidgetOverrides()
	 * @generated
	 */
	EAttribute getWidgetOverrides_Height();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.overrides.WidgetOverrides#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see com.wireframesketcher.model.overrides.WidgetOverrides#getText()
	 * @see #getWidgetOverrides()
	 * @generated
	 */
	EAttribute getWidgetOverrides_Text();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.overrides.WidgetOverrides#isNoText <em>No Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Text</em>'.
	 * @see com.wireframesketcher.model.overrides.WidgetOverrides#isNoText()
	 * @see #getWidgetOverrides()
	 * @generated
	 */
	EAttribute getWidgetOverrides_NoText();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.overrides.WidgetOverrides#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see com.wireframesketcher.model.overrides.WidgetOverrides#getLink()
	 * @see #getWidgetOverrides()
	 * @generated
	 */
	EAttribute getWidgetOverrides_Link();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.overrides.WidgetOverrides#isNoLink <em>No Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Link</em>'.
	 * @see com.wireframesketcher.model.overrides.WidgetOverrides#isNoLink()
	 * @see #getWidgetOverrides()
	 * @generated
	 */
	EAttribute getWidgetOverrides_NoLink();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.overrides.WidgetOverrides#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see com.wireframesketcher.model.overrides.WidgetOverrides#getSrc()
	 * @see #getWidgetOverrides()
	 * @generated
	 */
	EAttribute getWidgetOverrides_Src();

	/**
	 * Returns the meta object for the map '{@link com.wireframesketcher.model.overrides.WidgetOverrides#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Attributes</em>'.
	 * @see com.wireframesketcher.model.overrides.WidgetOverrides#getAttributes()
	 * @see #getWidgetOverrides()
	 * @generated
	 */
	EReference getWidgetOverrides_Attributes();

	/**
	 * Returns the meta object for the containment reference '{@link com.wireframesketcher.model.overrides.WidgetOverrides#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font</em>'.
	 * @see com.wireframesketcher.model.overrides.WidgetOverrides#getFont()
	 * @see #getWidgetOverrides()
	 * @generated
	 */
	EReference getWidgetOverrides_Font();

	/**
	 * Returns the meta object for the containment reference list '{@link com.wireframesketcher.model.overrides.WidgetOverrides#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see com.wireframesketcher.model.overrides.WidgetOverrides#getItems()
	 * @see #getWidgetOverrides()
	 * @generated
	 */
	EReference getWidgetOverrides_Items();

	/**
	 * Returns the meta object for the containment reference list '{@link com.wireframesketcher.model.overrides.WidgetOverrides#getItemChanges <em>Item Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Changes</em>'.
	 * @see com.wireframesketcher.model.overrides.WidgetOverrides#getItemChanges()
	 * @see #getWidgetOverrides()
	 * @generated
	 */
	EReference getWidgetOverrides_ItemChanges();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.overrides.FontOverrides <em>Font Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font Overrides</em>'.
	 * @see com.wireframesketcher.model.overrides.FontOverrides
	 * @generated
	 */
	EClass getFontOverrides();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.overrides.FontOverrides#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see com.wireframesketcher.model.overrides.FontOverrides#getSize()
	 * @see #getFontOverrides()
	 * @generated
	 */
	EAttribute getFontOverrides_Size();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.overrides.FontOverrides#getBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see com.wireframesketcher.model.overrides.FontOverrides#getBold()
	 * @see #getFontOverrides()
	 * @generated
	 */
	EAttribute getFontOverrides_Bold();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.overrides.FontOverrides#getItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see com.wireframesketcher.model.overrides.FontOverrides#getItalic()
	 * @see #getFontOverrides()
	 * @generated
	 */
	EAttribute getFontOverrides_Italic();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.overrides.FontOverrides#getUnderline <em>Underline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underline</em>'.
	 * @see com.wireframesketcher.model.overrides.FontOverrides#getUnderline()
	 * @see #getFontOverrides()
	 * @generated
	 */
	EAttribute getFontOverrides_Underline();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.overrides.ItemOverrides <em>Item Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Overrides</em>'.
	 * @see com.wireframesketcher.model.overrides.ItemOverrides
	 * @generated
	 */
	EClass getItemOverrides();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.overrides.ItemOverrides#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see com.wireframesketcher.model.overrides.ItemOverrides#getText()
	 * @see #getItemOverrides()
	 * @generated
	 */
	EAttribute getItemOverrides_Text();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.overrides.ItemOverrides#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see com.wireframesketcher.model.overrides.ItemOverrides#getLink()
	 * @see #getItemOverrides()
	 * @generated
	 */
	EAttribute getItemOverrides_Link();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.overrides.ItemOverrides#isNoLink <em>No Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Link</em>'.
	 * @see com.wireframesketcher.model.overrides.ItemOverrides#isNoLink()
	 * @see #getItemOverrides()
	 * @generated
	 */
	EAttribute getItemOverrides_NoLink();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getStringToStringMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Value();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.overrides.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see com.wireframesketcher.model.overrides.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.overrides.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see com.wireframesketcher.model.overrides.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.overrides.Move#getNewIndex <em>New Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Index</em>'.
	 * @see com.wireframesketcher.model.overrides.Move#getNewIndex()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_NewIndex();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.overrides.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see com.wireframesketcher.model.overrides.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.overrides.Insert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert</em>'.
	 * @see com.wireframesketcher.model.overrides.Insert
	 * @generated
	 */
	EClass getInsert();

	/**
	 * Returns the meta object for the containment reference '{@link com.wireframesketcher.model.overrides.Insert#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see com.wireframesketcher.model.overrides.Insert#getObject()
	 * @see #getInsert()
	 * @generated
	 */
	EReference getInsert_Object();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.overrides.Insert#getNewIndex <em>New Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Index</em>'.
	 * @see com.wireframesketcher.model.overrides.Insert#getNewIndex()
	 * @see #getInsert()
	 * @generated
	 */
	EAttribute getInsert_NewIndex();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.overrides.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see com.wireframesketcher.model.overrides.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.overrides.Reference#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see com.wireframesketcher.model.overrides.Reference#getRef()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Ref();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.overrides.WidgetContainerOverrides <em>Widget Container Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Container Overrides</em>'.
	 * @see com.wireframesketcher.model.overrides.WidgetContainerOverrides
	 * @generated
	 */
	EClass getWidgetContainerOverrides();

	/**
	 * Returns the meta object for the containment reference list '{@link com.wireframesketcher.model.overrides.WidgetContainerOverrides#getWidgetChanges <em>Widget Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widget Changes</em>'.
	 * @see com.wireframesketcher.model.overrides.WidgetContainerOverrides#getWidgetChanges()
	 * @see #getWidgetContainerOverrides()
	 * @generated
	 */
	EReference getWidgetContainerOverrides_WidgetChanges();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OverridesFactory getOverridesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.overrides.impl.OverridesImpl <em>Overrides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.overrides.impl.OverridesImpl
		 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getOverrides()
		 * @generated
		 */
		EClass OVERRIDES = eINSTANCE.getOverrides();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERRIDES__WIDGETS = eINSTANCE.getOverrides_Widgets();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.overrides.impl.WidgetOverridesImpl <em>Widget Overrides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.overrides.impl.WidgetOverridesImpl
		 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getWidgetOverrides()
		 * @generated
		 */
		EClass WIDGET_OVERRIDES = eINSTANCE.getWidgetOverrides();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_OVERRIDES__X = eINSTANCE.getWidgetOverrides_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_OVERRIDES__Y = eINSTANCE.getWidgetOverrides_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_OVERRIDES__WIDTH = eINSTANCE.getWidgetOverrides_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_OVERRIDES__HEIGHT = eINSTANCE.getWidgetOverrides_Height();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_OVERRIDES__TEXT = eINSTANCE.getWidgetOverrides_Text();

		/**
		 * The meta object literal for the '<em><b>No Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_OVERRIDES__NO_TEXT = eINSTANCE.getWidgetOverrides_NoText();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_OVERRIDES__LINK = eINSTANCE.getWidgetOverrides_Link();

		/**
		 * The meta object literal for the '<em><b>No Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_OVERRIDES__NO_LINK = eINSTANCE.getWidgetOverrides_NoLink();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_OVERRIDES__SRC = eINSTANCE.getWidgetOverrides_Src();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_OVERRIDES__ATTRIBUTES = eINSTANCE.getWidgetOverrides_Attributes();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_OVERRIDES__FONT = eINSTANCE.getWidgetOverrides_Font();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_OVERRIDES__ITEMS = eINSTANCE.getWidgetOverrides_Items();

		/**
		 * The meta object literal for the '<em><b>Item Changes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_OVERRIDES__ITEM_CHANGES = eINSTANCE.getWidgetOverrides_ItemChanges();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.overrides.impl.FontOverridesImpl <em>Font Overrides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.overrides.impl.FontOverridesImpl
		 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getFontOverrides()
		 * @generated
		 */
		EClass FONT_OVERRIDES = eINSTANCE.getFontOverrides();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_OVERRIDES__SIZE = eINSTANCE.getFontOverrides_Size();

		/**
		 * The meta object literal for the '<em><b>Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_OVERRIDES__BOLD = eINSTANCE.getFontOverrides_Bold();

		/**
		 * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_OVERRIDES__ITALIC = eINSTANCE.getFontOverrides_Italic();

		/**
		 * The meta object literal for the '<em><b>Underline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_OVERRIDES__UNDERLINE = eINSTANCE.getFontOverrides_Underline();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.overrides.impl.ItemOverridesImpl <em>Item Overrides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.overrides.impl.ItemOverridesImpl
		 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getItemOverrides()
		 * @generated
		 */
		EClass ITEM_OVERRIDES = eINSTANCE.getItemOverrides();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_OVERRIDES__TEXT = eINSTANCE.getItemOverrides_Text();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_OVERRIDES__LINK = eINSTANCE.getItemOverrides_Link();

		/**
		 * The meta object literal for the '<em><b>No Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_OVERRIDES__NO_LINK = eINSTANCE.getItemOverrides_NoLink();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.overrides.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.overrides.impl.StringToStringMapImpl
		 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getStringToStringMap()
		 * @generated
		 */
		EClass STRING_TO_STRING_MAP = eINSTANCE.getStringToStringMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__KEY = eINSTANCE.getStringToStringMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__VALUE = eINSTANCE.getStringToStringMap_Value();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.overrides.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.overrides.impl.OperationImpl
		 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.overrides.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.overrides.impl.MoveImpl
		 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>New Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__NEW_INDEX = eINSTANCE.getMove_NewIndex();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.overrides.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.overrides.impl.DeleteImpl
		 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.overrides.impl.InsertImpl <em>Insert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.overrides.impl.InsertImpl
		 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getInsert()
		 * @generated
		 */
		EClass INSERT = eINSTANCE.getInsert();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT__OBJECT = eINSTANCE.getInsert_Object();

		/**
		 * The meta object literal for the '<em><b>New Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT__NEW_INDEX = eINSTANCE.getInsert_NewIndex();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.overrides.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.overrides.impl.ReferenceImpl
		 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__REF = eINSTANCE.getReference_Ref();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.overrides.impl.WidgetContainerOverridesImpl <em>Widget Container Overrides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.overrides.impl.WidgetContainerOverridesImpl
		 * @see com.wireframesketcher.model.overrides.impl.OverridesPackageImpl#getWidgetContainerOverrides()
		 * @generated
		 */
		EClass WIDGET_CONTAINER_OVERRIDES = eINSTANCE.getWidgetContainerOverrides();

		/**
		 * The meta object literal for the '<em><b>Widget Changes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_CONTAINER_OVERRIDES__WIDGET_CHANGES = eINSTANCE.getWidgetContainerOverrides_WidgetChanges();

	}

} //OverridesPackage
