/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see com.wireframesketcher.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://wireframesketcher.com/1.0/model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = com.wireframesketcher.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.WidgetContainer <em>Widget Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.WidgetContainer
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getWidgetContainer()
	 * @generated
	 */
	int WIDGET_CONTAINER = 35;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_CONTAINER__WIDGETS = 0;

	/**
	 * The number of structural features of the '<em>Widget Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.ScreenImpl <em>Screen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.ScreenImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getScreen()
	 * @generated
	 */
	int SCREEN = 0;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__WIDGETS = WIDGET_CONTAINER__WIDGETS;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__NOTE = WIDGET_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>HRuler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__HRULER = WIDGET_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>VRuler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__VRULER = WIDGET_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__NAME = WIDGET_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__FONT = WIDGET_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__THEME = WIDGET_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__MIN_VERSION = WIDGET_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Screen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_FEATURE_COUNT = WIDGET_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.ScreenRulerImpl <em>Screen Ruler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.ScreenRulerImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getScreenRuler()
	 * @generated
	 */
	int SCREEN_RULER = 1;

	/**
	 * The feature id for the '<em><b>Guides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_RULER__GUIDES = 0;

	/**
	 * The number of structural features of the '<em>Screen Ruler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_RULER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.RulerGuideImpl <em>Ruler Guide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.RulerGuideImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getRulerGuide()
	 * @generated
	 */
	int RULER_GUIDE = 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER_GUIDE__POSITION = 0;

	/**
	 * The number of structural features of the '<em>Ruler Guide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER_GUIDE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.NoteSupport <em>Note Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.NoteSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getNoteSupport()
	 * @generated
	 */
	int NOTE_SUPPORT = 98;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_SUPPORT__NOTE = 0;

	/**
	 * The number of structural features of the '<em>Note Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.WidgetImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 3;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NOTE = NOTE_SUPPORT__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ID = NOTE_SUPPORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__CONTAINER = NOTE_SUPPORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__X = NOTE_SUPPORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__Y = NOTE_SUPPORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__WIDTH = NOTE_SUPPORT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__HEIGHT = NOTE_SUPPORT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__TEXT = NOTE_SUPPORT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__DESCRIPTOR = NOTE_SUPPORT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__LOCKED = NOTE_SUPPORT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__MEASURED_WIDTH = NOTE_SUPPORT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__MEASURED_HEIGHT = NOTE_SUPPORT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__CUSTOM_ID = NOTE_SUPPORT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__CUSTOM_DATA = NOTE_SUPPORT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ANNOTATION = NOTE_SUPPORT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__LAYOUT_PARAMS = NOTE_SUPPORT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = NOTE_SUPPORT_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.ButtonImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 4;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__STATE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BACKGROUND = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__FONT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ICON = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Icon Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ICON_ROTATION = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LINK = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TEXT_ALIGNMENT = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__SKIN = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__STYLE = WIDGET_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.CheckboxImpl <em>Checkbox</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.CheckboxImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getCheckbox()
	 * @generated
	 */
	int CHECKBOX = 5;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__SELECTED = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__STATE = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__LINK = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__FONT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__SKIN = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Checkbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.ComboImpl <em>Combo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.ComboImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getCombo()
	 * @generated
	 */
	int COMBO = 6;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__STATE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__FONT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__BORDER_COLOR = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__BACKGROUND = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__ALPHA = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__LINK = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO__SKIN = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Combo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.LabelImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 7;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FONT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_ALIGNMENT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FOREGROUND = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__STATE = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ICON = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Icon Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ICON_ROTATION = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Icon Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ICON_POSITION = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__LINK = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ROTATION = WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ITEMS = WIDGET_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.LinkImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 8;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__FONT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__STATE = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LINK = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SKIN = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.PlaceholderImpl <em>Placeholder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.PlaceholderImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getPlaceholder()
	 * @generated
	 */
	int PLACEHOLDER = 9;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__LINK = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__SKIN = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Placeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.RadioButtonImpl <em>Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.RadioButtonImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getRadioButton()
	 * @generated
	 */
	int RADIO_BUTTON = 10;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__SELECTED = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__STATE = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__LINK = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__FONT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__SKIN = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.TextFieldImpl <em>Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.TextFieldImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTextField()
	 * @generated
	 */
	int TEXT_FIELD = 11;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__STATE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__FONT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__TEXT_ALIGNMENT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__BACKGROUND = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__ALPHA = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__BORDER_COLOR = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__SKIN = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.WindowImpl <em>Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.WindowImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getWindow()
	 * @generated
	 */
	int WINDOW = 13;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.WidgetDescriptorImpl <em>Widget Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.WidgetDescriptorImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getWidgetDescriptor()
	 * @generated
	 */
	int WIDGET_DESCRIPTOR = 33;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.TextImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 15;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.AreaImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getArea()
	 * @generated
	 */
	int AREA = 16;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.ListImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getList()
	 * @generated
	 */
	int LIST = 19;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.PopupImpl <em>Popup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.PopupImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getPopup()
	 * @generated
	 */
	int POPUP = 20;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.MenuImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 21;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.TableImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 22;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.TreeImpl <em>Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.TreeImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTree()
	 * @generated
	 */
	int TREE = 23;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.IconImpl <em>Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.IconImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getIcon()
	 * @generated
	 */
	int ICON = 24;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.TextAreaImpl <em>Text Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.TextAreaImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTextArea()
	 * @generated
	 */
	int TEXT_AREA = 25;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.BrowserImpl <em>Browser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.BrowserImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getBrowser()
	 * @generated
	 */
	int BROWSER = 14;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.FontImpl <em>Font</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.FontImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getFont()
	 * @generated
	 */
	int FONT = 34;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.SpinnerImpl <em>Spinner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.SpinnerImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getSpinner()
	 * @generated
	 */
	int SPINNER = 12;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__STATE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__FONT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__BORDER_COLOR = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__BACKGROUND = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__ALPHA = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__SKIN = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Spinner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__VALUE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vertical Scrollbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__VERTICAL_SCROLLBAR = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__SKIN = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__BACKGROUND = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ALPHA = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Close Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__CLOSE_BUTTON = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Minimize Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__MINIMIZE_BUTTON = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Maximize Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__MAXIMIZE_BUTTON = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__VALUE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vertical Scrollbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__VERTICAL_SCROLLBAR = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__BACKGROUND = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__SKIN = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__ALPHA = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER__FONT = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Browser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__FONT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT_ALIGNMENT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__FOREGROUND = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__LINK = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Line Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__LINE_HEIGHT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ITEMS = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Dummy Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DUMMY_TEXT = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The number of structural features of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.HScrollbarImpl <em>HScrollbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.HScrollbarImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getHScrollbar()
	 * @generated
	 */
	int HSCROLLBAR = 26;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.VScrollbarImpl <em>VScrollbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.VScrollbarImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getVScrollbar()
	 * @generated
	 */
	int VSCROLLBAR = 27;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.HLineImpl <em>HLine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.HLineImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getHLine()
	 * @generated
	 */
	int HLINE = 28;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.VLineImpl <em>VLine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.VLineImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getVLine()
	 * @generated
	 */
	int VLINE = 29;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.HSliderImpl <em>HSlider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.HSliderImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getHSlider()
	 * @generated
	 */
	int HSLIDER = 30;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.VSliderImpl <em>VSlider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.VSliderImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getVSlider()
	 * @generated
	 */
	int VSLIDER = 31;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.TabsImpl <em>Tabs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.TabsImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTabs()
	 * @generated
	 */
	int TABS = 32;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.GroupImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 18;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.PanelImpl <em>Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.PanelImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getPanel()
	 * @generated
	 */
	int PANEL = 17;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__BACKGROUND = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__ALPHA = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__VALUE = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vertical Scrollbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__VERTICAL_SCROLLBAR = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__FOREGROUND = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__BORDER = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__LINK = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__SKIN = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__VALUE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vertical Scrollbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__VERTICAL_SCROLLBAR = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__BACKGROUND = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ALPHA = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__FONT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SKIN = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SELECTION = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__BORDER = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__VALUE = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vertical Scrollbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__VERTICAL_SCROLLBAR = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__BACKGROUND = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ALPHA = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Row Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ROW_HEIGHT = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Horizontal Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__HORIZONTAL_LINES = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__FONT = WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ITEMS = WIDGET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ALTERNATIVE = WIDGET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__HEADER = WIDGET_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP__SELECTION = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP__ITEMS = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Popup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__SELECTION = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ICON = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Icon Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ICON_ROTATION = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ITEMS = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__SKIN = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SELECTION = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BORDER = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__VALUE = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vertical Scrollbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__VERTICAL_SCROLLBAR = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BACKGROUND = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ALPHA = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Row Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ROW_HEIGHT = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Horizontal Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__HORIZONTAL_LINES = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__FONT = WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TEXT_ALIGNMENT = WIDGET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ALTERNATIVE = WIDGET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ITEMS = WIDGET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Vertical Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__VERTICAL_LINES = WIDGET_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__HEADER = WIDGET_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__BORDER = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__VALUE = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vertical Scrollbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__VERTICAL_SCROLLBAR = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__BACKGROUND = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__ALPHA = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__SELECTION = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__ITEMS = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__FONT = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__FOREGROUND = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__ICON = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Icon Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__ICON_ROTATION = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__LINK = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__STATE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__VALUE = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vertical Scrollbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__VERTICAL_SCROLLBAR = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__FONT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__TEXT_ALIGNMENT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__BACKGROUND = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__ALPHA = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__BORDER_COLOR = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__SKIN = WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Line Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__LINE_HEIGHT = WIDGET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__ITEMS = WIDGET_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSCROLLBAR__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSCROLLBAR__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSCROLLBAR__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSCROLLBAR__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSCROLLBAR__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSCROLLBAR__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSCROLLBAR__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSCROLLBAR__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSCROLLBAR__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSCROLLBAR__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSCROLLBAR__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSCROLLBAR__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSCROLLBAR__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSCROLLBAR__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSCROLLBAR__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSCROLLBAR__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSCROLLBAR__VALUE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSCROLLBAR__SKIN = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HScrollbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSCROLLBAR_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSCROLLBAR__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSCROLLBAR__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSCROLLBAR__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSCROLLBAR__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSCROLLBAR__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSCROLLBAR__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSCROLLBAR__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSCROLLBAR__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSCROLLBAR__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSCROLLBAR__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSCROLLBAR__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSCROLLBAR__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSCROLLBAR__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSCROLLBAR__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSCROLLBAR__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSCROLLBAR__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSCROLLBAR__VALUE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSCROLLBAR__SKIN = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VScrollbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSCROLLBAR_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLINE__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLINE__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLINE__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLINE__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLINE__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLINE__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLINE__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLINE__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLINE__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLINE__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLINE__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLINE__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLINE__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLINE__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLINE__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLINE__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLINE__FOREGROUND = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLINE__LINE_STYLE = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLINE__SKIN = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>HLine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLINE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLINE__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLINE__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLINE__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLINE__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLINE__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLINE__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLINE__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLINE__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLINE__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLINE__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLINE__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLINE__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLINE__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLINE__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLINE__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLINE__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLINE__FOREGROUND = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLINE__LINE_STYLE = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLINE__SKIN = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VLine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLINE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSLIDER__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSLIDER__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSLIDER__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSLIDER__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSLIDER__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSLIDER__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSLIDER__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSLIDER__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSLIDER__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSLIDER__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSLIDER__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSLIDER__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSLIDER__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSLIDER__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSLIDER__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSLIDER__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSLIDER__VALUE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSLIDER__STATE = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSLIDER__BACKGROUND = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSLIDER__SKIN = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>HSlider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSLIDER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSLIDER__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSLIDER__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSLIDER__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSLIDER__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSLIDER__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSLIDER__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSLIDER__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSLIDER__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSLIDER__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSLIDER__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSLIDER__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSLIDER__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSLIDER__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSLIDER__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSLIDER__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSLIDER__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSLIDER__VALUE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSLIDER__STATE = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSLIDER__BACKGROUND = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSLIDER__SKIN = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>VSlider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSLIDER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__SELECTION = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__ITEMS = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__FONT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS__SKIN = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tabs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABS_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DESCRIPTOR__TYPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Resize Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DESCRIPTOR__RESIZE_MODE = 1;

	/**
	 * The feature id for the '<em><b>Text Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DESCRIPTOR__TEXT_EDITABLE = 2;

	/**
	 * The feature id for the '<em><b>Text Wrappable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DESCRIPTOR__TEXT_WRAPPABLE = 3;

	/**
	 * The feature id for the '<em><b>Text Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DESCRIPTOR__TEXT_LINES = 4;

	/**
	 * The feature id for the '<em><b>Text Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DESCRIPTOR__TEXT_CENTERED = 5;

	/**
	 * The number of structural features of the '<em>Widget Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DESCRIPTOR_FEATURE_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__BOLD = 1;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__ITALIC = 2;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__UNDERLINE = 3;

	/**
	 * The number of structural features of the '<em>Font</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.WidgetGroupImpl <em>Widget Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.WidgetGroupImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getWidgetGroup()
	 * @generated
	 */
	int WIDGET_GROUP = 36;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__WIDGETS = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__LINK = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__NAME = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Widget Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.MasterImpl <em>Master</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.MasterImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getMaster()
	 * @generated
	 */
	int MASTER = 37;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__LINK = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Screen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__SCREEN = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dimmed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__DIMMED = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__OVERRIDES = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__INSTANCE = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.ImageImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 38;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LINK = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ROTATION = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>HFlip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__HFLIP = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>VFlip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__VFLIP = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__BORDER = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SRC = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Grayscale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__GRAYSCALE = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.ScreenFontImpl <em>Screen Font</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.ScreenFontImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getScreenFont()
	 * @generated
	 */
	int SCREEN_FONT = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_FONT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_FONT__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_FONT__BOLD = 2;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_FONT__ITALIC = 3;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_FONT__AVAILABLE = 4;

	/**
	 * The number of structural features of the '<em>Screen Font</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_FONT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.FontSupport <em>Font Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.FontSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getFontSupport()
	 * @generated
	 */
	int FONT_SUPPORT = 40;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_SUPPORT__FONT = 0;

	/**
	 * The number of structural features of the '<em>Font Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.ColorForegroundSupport <em>Color Foreground Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.ColorForegroundSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getColorForegroundSupport()
	 * @generated
	 */
	int COLOR_FOREGROUND_SUPPORT = 41;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_FOREGROUND_SUPPORT__FOREGROUND = 0;

	/**
	 * The number of structural features of the '<em>Color Foreground Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_FOREGROUND_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.ColorBackgroundSupport <em>Color Background Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.ColorBackgroundSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getColorBackgroundSupport()
	 * @generated
	 */
	int COLOR_BACKGROUND_SUPPORT = 42;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BACKGROUND_SUPPORT__BACKGROUND = 0;

	/**
	 * The number of structural features of the '<em>Color Background Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BACKGROUND_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.ColorBorderSupport <em>Color Border Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.ColorBorderSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getColorBorderSupport()
	 * @generated
	 */
	int COLOR_BORDER_SUPPORT = 43;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BORDER_SUPPORT__BORDER_COLOR = 0;

	/**
	 * The number of structural features of the '<em>Color Border Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_BORDER_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.ColorAlphaSupport <em>Color Alpha Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.ColorAlphaSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getColorAlphaSupport()
	 * @generated
	 */
	int COLOR_ALPHA_SUPPORT = 44;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_ALPHA_SUPPORT__ALPHA = 0;

	/**
	 * The number of structural features of the '<em>Color Alpha Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_ALPHA_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.SelectionSupport <em>Selection Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.SelectionSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getSelectionSupport()
	 * @generated
	 */
	int SELECTION_SUPPORT = 45;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_SUPPORT__SELECTION = 0;

	/**
	 * The number of structural features of the '<em>Selection Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.TextAlignmentSupport <em>Text Alignment Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.TextAlignmentSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTextAlignmentSupport()
	 * @generated
	 */
	int TEXT_ALIGNMENT_SUPPORT = 46;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ALIGNMENT_SUPPORT__TEXT_ALIGNMENT = 0;

	/**
	 * The number of structural features of the '<em>Text Alignment Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ALIGNMENT_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.BooleanSelectionSupport <em>Boolean Selection Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.BooleanSelectionSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getBooleanSelectionSupport()
	 * @generated
	 */
	int BOOLEAN_SELECTION_SUPPORT = 47;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SELECTION_SUPPORT__SELECTED = 0;

	/**
	 * The number of structural features of the '<em>Boolean Selection Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SELECTION_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.NoteImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 48;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__FONT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__TEXT_ALIGNMENT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__BACKGROUND = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__ALPHA = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__LINK = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__SKIN = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__ITEMS = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.ProgressBarImpl <em>Progress Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.ProgressBarImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getProgressBar()
	 * @generated
	 */
	int PROGRESS_BAR = 49;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__VALUE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__BACKGROUND = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR__SKIN = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Progress Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_BAR_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.CalloutImpl <em>Callout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.CalloutImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getCallout()
	 * @generated
	 */
	int CALLOUT = 50;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT__FONT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT__BACKGROUND = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT__ALPHA = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT__LINK = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT__SKIN = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Callout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLOUT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.SearchFieldImpl <em>Search Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.SearchFieldImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getSearchField()
	 * @generated
	 */
	int SEARCH_FIELD = 51;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD__FONT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD__STATE = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD__BORDER_COLOR = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD__LINK = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD__SKIN = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Search Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FIELD_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.TooltipImpl <em>Tooltip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.TooltipImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTooltip()
	 * @generated
	 */
	int TOOLTIP = 52;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__FONT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__TEXT_ALIGNMENT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__BACKGROUND = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__SKIN = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__ITEMS = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__POSITION = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Tooltip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.ScratchOutImpl <em>Scratch Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.ScratchOutImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getScratchOut()
	 * @generated
	 */
	int SCRATCH_OUT = 53;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_OUT__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_OUT__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_OUT__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_OUT__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_OUT__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_OUT__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_OUT__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_OUT__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_OUT__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_OUT__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_OUT__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_OUT__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_OUT__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_OUT__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_OUT__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_OUT__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_OUT__FOREGROUND = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_OUT__ALPHA = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_OUT__SKIN = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Scratch Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRATCH_OUT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.BorderSupport <em>Border Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.BorderSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getBorderSupport()
	 * @generated
	 */
	int BORDER_SUPPORT = 54;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_SUPPORT__BORDER = 0;

	/**
	 * The number of structural features of the '<em>Border Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.StateSupport <em>State Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.StateSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getStateSupport()
	 * @generated
	 */
	int STATE_SUPPORT = 55;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SUPPORT__STATE = 0;

	/**
	 * The number of structural features of the '<em>State Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.BreadcrumbsImpl <em>Breadcrumbs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.BreadcrumbsImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getBreadcrumbs()
	 * @generated
	 */
	int BREADCRUMBS = 56;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS__FONT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS__ITEMS = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS__SKIN = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Breadcrumbs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.LinkBarImpl <em>Link Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.LinkBarImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getLinkBar()
	 * @generated
	 */
	int LINK_BAR = 57;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BAR__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BAR__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BAR__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BAR__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BAR__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BAR__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BAR__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BAR__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BAR__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BAR__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BAR__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BAR__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BAR__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BAR__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BAR__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BAR__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BAR__FONT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BAR__SELECTION = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BAR__ITEMS = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BAR__SKIN = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Link Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BAR_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.AccordionImpl <em>Accordion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.AccordionImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getAccordion()
	 * @generated
	 */
	int ACCORDION = 58;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__SELECTION = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__VALUE = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vertical Scrollbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__VERTICAL_SCROLLBAR = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__ITEMS = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION__FONT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Accordion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.VerticalScrollbarSupport <em>Vertical Scrollbar Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.VerticalScrollbarSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getVerticalScrollbarSupport()
	 * @generated
	 */
	int VERTICAL_SCROLLBAR_SUPPORT = 59;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.DateFieldImpl <em>Date Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.DateFieldImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getDateField()
	 * @generated
	 */
	int DATE_FIELD = 60;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.VideoPlayerImpl <em>Video Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.VideoPlayerImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getVideoPlayer()
	 * @generated
	 */
	int VIDEO_PLAYER = 61;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.MapImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 62;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.CoverFlowImpl <em>Cover Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.CoverFlowImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getCoverFlow()
	 * @generated
	 */
	int COVER_FLOW = 63;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.TabbedPaneImpl <em>Tabbed Pane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.TabbedPaneImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTabbedPane()
	 * @generated
	 */
	int TABBED_PANE = 64;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.IconSupport <em>Icon Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.IconSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getIconSupport()
	 * @generated
	 */
	int ICON_SUPPORT = 65;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.HSplitterImpl <em>HSplitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.HSplitterImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getHSplitter()
	 * @generated
	 */
	int HSPLITTER = 66;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.VSplitterImpl <em>VSplitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.VSplitterImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getVSplitter()
	 * @generated
	 */
	int VSPLITTER = 67;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.ValueSupport <em>Value Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.ValueSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getValueSupport()
	 * @generated
	 */
	int VALUE_SUPPORT = 68;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SUPPORT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Value Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCROLLBAR_SUPPORT__VALUE = VALUE_SUPPORT__VALUE;

	/**
	 * The feature id for the '<em><b>Vertical Scrollbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCROLLBAR_SUPPORT__VERTICAL_SCROLLBAR = VALUE_SUPPORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vertical Scrollbar Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCROLLBAR_SUPPORT_FEATURE_COUNT = VALUE_SUPPORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__STATE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__BORDER_COLOR = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__BACKGROUND = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__ALPHA = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__SKIN = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Date Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_PLAYER__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_PLAYER__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_PLAYER__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_PLAYER__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_PLAYER__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_PLAYER__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_PLAYER__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_PLAYER__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_PLAYER__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_PLAYER__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_PLAYER__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_PLAYER__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_PLAYER__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_PLAYER__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_PLAYER__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_PLAYER__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_PLAYER__SKIN = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Video Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_PLAYER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__SKIN = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER_FLOW__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER_FLOW__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER_FLOW__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER_FLOW__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER_FLOW__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER_FLOW__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER_FLOW__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER_FLOW__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER_FLOW__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER_FLOW__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER_FLOW__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER_FLOW__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER_FLOW__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER_FLOW__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER_FLOW__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER_FLOW__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER_FLOW__SKIN = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cover Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER_FLOW_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__SELECTION = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__VALUE = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vertical Scrollbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__VERTICAL_SCROLLBAR = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__BACKGROUND = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__ALPHA = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__ITEMS = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__FONT = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__SKIN = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE__POSITION = WIDGET_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Tabbed Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_SUPPORT__ICON = 0;

	/**
	 * The feature id for the '<em><b>Icon Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_SUPPORT__ICON_ROTATION = 1;

	/**
	 * The number of structural features of the '<em>Icon Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_SUPPORT_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPLITTER__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPLITTER__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPLITTER__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPLITTER__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPLITTER__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPLITTER__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPLITTER__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPLITTER__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPLITTER__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPLITTER__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPLITTER__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPLITTER__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPLITTER__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPLITTER__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPLITTER__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPLITTER__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPLITTER__SKIN = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HSplitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPLITTER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPLITTER__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPLITTER__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPLITTER__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPLITTER__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPLITTER__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPLITTER__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPLITTER__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPLITTER__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPLITTER__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPLITTER__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPLITTER__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPLITTER__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPLITTER__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPLITTER__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPLITTER__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPLITTER__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPLITTER__SKIN = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSplitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPLITTER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.ColorPickerImpl <em>Color Picker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.ColorPickerImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getColorPicker()
	 * @generated
	 */
	int COLOR_PICKER = 69;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__BACKGROUND = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER__SKIN = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Color Picker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PICKER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.ArrowImpl <em>Arrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.ArrowImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getArrow()
	 * @generated
	 */
	int ARROW = 70;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__FOREGROUND = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__LINE_STYLE = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__LEFT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__RIGHT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__DIRECTION = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.CurlyBraceImpl <em>Curly Brace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.CurlyBraceImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getCurlyBrace()
	 * @generated
	 */
	int CURLY_BRACE = 71;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE__FONT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE__FOREGROUND = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE__SKIN = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE__ITEMS = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE__POSITION = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Curly Brace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.ButtonBarImpl <em>Button Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.ButtonBarImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getButtonBar()
	 * @generated
	 */
	int BUTTON_BAR = 72;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__SELECTION = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__FONT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__BACKGROUND = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__ITEMS = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR__SKIN = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Button Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BAR_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.BorderStyleSupport <em>Border Style Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.BorderStyleSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getBorderStyleSupport()
	 * @generated
	 */
	int BORDER_STYLE_SUPPORT = 73;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_STYLE_SUPPORT__BORDER = 0;

	/**
	 * The number of structural features of the '<em>Border Style Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_STYLE_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.CircleImpl <em>Circle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.CircleImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getCircle()
	 * @generated
	 */
	int CIRCLE = 74;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__BACKGROUND = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__ALPHA = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__FOREGROUND = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__BORDER = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__ICON = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Icon Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__ICON_ROTATION = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Icon Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__ICON_POSITION = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__FONT = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__LINK = WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__TEXT_ALIGNMENT = WIDGET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__LINE_STYLE = WIDGET_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.RectangleImpl <em>Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.RectangleImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 75;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__BACKGROUND = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__ALPHA = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__FOREGROUND = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__BORDER = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__ICON = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Icon Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__ICON_ROTATION = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Icon Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__ICON_POSITION = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__FONT = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LINK = WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__TEXT_ALIGNMENT = WIDGET_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.IconPositionSupport <em>Icon Position Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.IconPositionSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getIconPositionSupport()
	 * @generated
	 */
	int ICON_POSITION_SUPPORT = 76;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_POSITION_SUPPORT__ICON = ICON_SUPPORT__ICON;

	/**
	 * The feature id for the '<em><b>Icon Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_POSITION_SUPPORT__ICON_ROTATION = ICON_SUPPORT__ICON_ROTATION;

	/**
	 * The feature id for the '<em><b>Icon Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_POSITION_SUPPORT__ICON_POSITION = ICON_SUPPORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Icon Position Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_POSITION_SUPPORT_FEATURE_COUNT = ICON_SUPPORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.ListSupport <em>List Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.ListSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getListSupport()
	 * @generated
	 */
	int LIST_SUPPORT = 77;

	/**
	 * The feature id for the '<em><b>Row Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_SUPPORT__ROW_HEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Horizontal Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_SUPPORT__HORIZONTAL_LINES = 1;

	/**
	 * The number of structural features of the '<em>List Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_SUPPORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.ChartImpl <em>Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.ChartImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getChart()
	 * @generated
	 */
	int CHART = 78;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__SKIN = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chart Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__CHART_TYPE = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.CrossOutImpl <em>Cross Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.CrossOutImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getCrossOut()
	 * @generated
	 */
	int CROSS_OUT = 79;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_OUT__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_OUT__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_OUT__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_OUT__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_OUT__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_OUT__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_OUT__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_OUT__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_OUT__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_OUT__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_OUT__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_OUT__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_OUT__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_OUT__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_OUT__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_OUT__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_OUT__FOREGROUND = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_OUT__ALPHA = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_OUT__SKIN = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cross Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_OUT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.LinkSupport <em>Link Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.LinkSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getLinkSupport()
	 * @generated
	 */
	int LINK_SUPPORT = 82;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SUPPORT__LINK = 0;

	/**
	 * The number of structural features of the '<em>Link Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.ItemImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 80;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__LINK = LINK_SUPPORT__LINK;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__X = LINK_SUPPORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__Y = LINK_SUPPORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__WIDTH = LINK_SUPPORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__HEIGHT = LINK_SUPPORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__TEXT = LINK_SUPPORT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = LINK_SUPPORT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.ItemSupport <em>Item Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.ItemSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getItemSupport()
	 * @generated
	 */
	int ITEM_SUPPORT = 81;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_SUPPORT__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Item Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.HotspotImpl <em>Hotspot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.HotspotImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getHotspot()
	 * @generated
	 */
	int HOTSPOT = 83;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__LINK = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hotspot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.NameSupport <em>Name Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.NameSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getNameSupport()
	 * @generated
	 */
	int NAME_SUPPORT = 84;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SUPPORT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Name Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.ColorAlternativeSupport <em>Color Alternative Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.ColorAlternativeSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getColorAlternativeSupport()
	 * @generated
	 */
	int COLOR_ALTERNATIVE_SUPPORT = 85;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_ALTERNATIVE_SUPPORT__ALTERNATIVE = 0;

	/**
	 * The number of structural features of the '<em>Color Alternative Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_ALTERNATIVE_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.LineStyleSupport <em>Line Style Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.LineStyleSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getLineStyleSupport()
	 * @generated
	 */
	int LINE_STYLE_SUPPORT = 86;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_SUPPORT__LINE_STYLE = 0;

	/**
	 * The number of structural features of the '<em>Line Style Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.RotationSupport <em>Rotation Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.RotationSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getRotationSupport()
	 * @generated
	 */
	int ROTATION_SUPPORT = 87;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_SUPPORT__ROTATION = 0;

	/**
	 * The number of structural features of the '<em>Rotation Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.FlipSupport <em>Flip Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.FlipSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getFlipSupport()
	 * @generated
	 */
	int FLIP_SUPPORT = 88;

	/**
	 * The feature id for the '<em><b>HFlip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIP_SUPPORT__HFLIP = 0;

	/**
	 * The feature id for the '<em><b>VFlip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIP_SUPPORT__VFLIP = 1;

	/**
	 * The number of structural features of the '<em>Flip Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIP_SUPPORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.SVGImageImpl <em>SVG Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.SVGImageImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getSVGImage()
	 * @generated
	 */
	int SVG_IMAGE = 89;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__LINK = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__BACKGROUND = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__FOREGROUND = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__ALPHA = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__ROTATION = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>HFlip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__HFLIP = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>VFlip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__VFLIP = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE__SRC = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>SVG Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_IMAGE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.SkinSupport <em>Skin Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.SkinSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getSkinSupport()
	 * @generated
	 */
	int SKIN_SUPPORT = 90;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIN_SUPPORT__SKIN = 0;

	/**
	 * The number of structural features of the '<em>Skin Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIN_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.ShapeImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 91;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__BACKGROUND = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ALPHA = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FOREGROUND = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__BORDER = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ICON = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Icon Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ICON_ROTATION = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Icon Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ICON_POSITION = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FONT = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LINK = WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__TEXT_ALIGNMENT = WIDGET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LINE_STYLE = WIDGET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__SKIN = WIDGET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ROTATION = WIDGET_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Shape Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__SHAPE_TYPE = WIDGET_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.AlertImpl <em>Alert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.AlertImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getAlert()
	 * @generated
	 */
	int ALERT = 92;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__ICON = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__ICON_ROTATION = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__ITEMS = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__FONT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__SKIN = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.SwitchImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 93;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__SELECTED = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__BACKGROUND = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__FONT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__LINK = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__STATE = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__SKIN = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.LineHeightSupport <em>Line Height Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.LineHeightSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getLineHeightSupport()
	 * @generated
	 */
	int LINE_HEIGHT_SUPPORT = 94;

	/**
	 * The feature id for the '<em><b>Line Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_HEIGHT_SUPPORT__LINE_HEIGHT = 0;

	/**
	 * The number of structural features of the '<em>Line Height Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_HEIGHT_SUPPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.impl.VButtonBarImpl <em>VButton Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.VButtonBarImpl
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getVButtonBar()
	 * @generated
	 */
	int VBUTTON_BAR = 95;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__NOTE = WIDGET__NOTE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__CONTAINER = WIDGET__CONTAINER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__DESCRIPTOR = WIDGET__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__LOCKED = WIDGET__LOCKED;

	/**
	 * The feature id for the '<em><b>Measured Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__MEASURED_WIDTH = WIDGET__MEASURED_WIDTH;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__MEASURED_HEIGHT = WIDGET__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__CUSTOM_ID = WIDGET__CUSTOM_ID;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__CUSTOM_DATA = WIDGET__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__ANNOTATION = WIDGET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__SELECTION = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__FONT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__TEXT_ALIGNMENT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__BACKGROUND = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__ITEMS = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Skin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR__SKIN = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>VButton Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBUTTON_BAR_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.AnnotationSupport <em>Annotation Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.AnnotationSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getAnnotationSupport()
	 * @generated
	 */
	int ANNOTATION_SUPPORT = 96;

	/**
	 * The number of structural features of the '<em>Annotation Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_SUPPORT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.TextLinksSupport <em>Text Links Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.TextLinksSupport
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTextLinksSupport()
	 * @generated
	 */
	int TEXT_LINKS_SUPPORT = 97;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINKS_SUPPORT__ITEMS = ITEM_SUPPORT__ITEMS;

	/**
	 * The number of structural features of the '<em>Text Links Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINKS_SUPPORT_FEATURE_COUNT = ITEM_SUPPORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.ResizeMode <em>Resize Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.ResizeMode
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getResizeMode()
	 * @generated
	 */
	int RESIZE_MODE = 99;


	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.TextAlignment <em>Text Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.TextAlignment
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTextAlignment()
	 * @generated
	 */
	int TEXT_ALIGNMENT = 100;


	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.IconSize <em>Icon Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.IconSize
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getIconSize()
	 * @generated
	 */
	int ICON_SIZE = 101;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.State <em>State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.State
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getState()
	 * @generated
	 */
	int STATE = 102;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.Position <em>Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.Position
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 103;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.BorderStyle <em>Border Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.BorderStyle
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getBorderStyle()
	 * @generated
	 */
	int BORDER_STYLE = 104;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.ButtonStyle <em>Button Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.ButtonStyle
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getButtonStyle()
	 * @generated
	 */
	int BUTTON_STYLE = 105;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.ChartType <em>Chart Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.ChartType
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getChartType()
	 * @generated
	 */
	int CHART_TYPE = 106;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.Theme <em>Theme</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.Theme
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTheme()
	 * @generated
	 */
	int THEME = 107;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.LineStyle <em>Line Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.LineStyle
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getLineStyle()
	 * @generated
	 */
	int LINE_STYLE = 108;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.Rotation90 <em>Rotation90</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.Rotation90
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getRotation90()
	 * @generated
	 */
	int ROTATION90 = 109;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.ShapeType <em>Shape Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.ShapeType
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getShapeType()
	 * @generated
	 */
	int SHAPE_TYPE = 110;

	/**
	 * The meta object id for the '<em>Icon Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.IconDesc
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getIconDataType()
	 * @generated
	 */
	int ICON_DATA_TYPE = 111;


	/**
	 * The meta object id for the '<em>Font Size Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.FontSize
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getFontSizeDataType()
	 * @generated
	 */
	int FONT_SIZE_DATA_TYPE = 112;


	/**
	 * The meta object id for the '<em>Color Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.ColorDesc
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getColorDataType()
	 * @generated
	 */
	int COLOR_DATA_TYPE = 113;


	/**
	 * The meta object id for the '<em>URI Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.URI
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getURIDataType()
	 * @generated
	 */
	int URI_DATA_TYPE = 114;


	/**
	 * The meta object id for the '<em>Selection Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getSelectionDataType()
	 * @generated
	 */
	int SELECTION_DATA_TYPE = 115;


	/**
	 * The meta object id for the '<em>Version Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.VersionDesc
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getVersionDataType()
	 * @generated
	 */
	int VERSION_DATA_TYPE = 116;


	/**
	 * The meta object id for the '<em>Line Height Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.LineHeight
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getLineHeightDataType()
	 * @generated
	 */
	int LINE_HEIGHT_DATA_TYPE = 117;


	/**
	 * The meta object id for the '<em>Layout Params Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.LayoutParams
	 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getLayoutParamsDataType()
	 * @generated
	 */
	int LAYOUT_PARAMS_DATA_TYPE = 118;


	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Screen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screen</em>'.
	 * @see com.wireframesketcher.model.Screen
	 * @generated
	 */
	EClass getScreen();

	/**
	 * Returns the meta object for the containment reference '{@link com.wireframesketcher.model.Screen#getHRuler <em>HRuler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HRuler</em>'.
	 * @see com.wireframesketcher.model.Screen#getHRuler()
	 * @see #getScreen()
	 * @generated
	 */
	EReference getScreen_HRuler();

	/**
	 * Returns the meta object for the containment reference '{@link com.wireframesketcher.model.Screen#getVRuler <em>VRuler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VRuler</em>'.
	 * @see com.wireframesketcher.model.Screen#getVRuler()
	 * @see #getScreen()
	 * @generated
	 */
	EReference getScreen_VRuler();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Screen#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.wireframesketcher.model.Screen#getName()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.wireframesketcher.model.Screen#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font</em>'.
	 * @see com.wireframesketcher.model.Screen#getFont()
	 * @see #getScreen()
	 * @generated
	 */
	EReference getScreen_Font();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Screen#getTheme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theme</em>'.
	 * @see com.wireframesketcher.model.Screen#getTheme()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_Theme();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Screen#getMinVersion <em>Min Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Version</em>'.
	 * @see com.wireframesketcher.model.Screen#getMinVersion()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_MinVersion();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.ScreenRuler <em>Screen Ruler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screen Ruler</em>'.
	 * @see com.wireframesketcher.model.ScreenRuler
	 * @generated
	 */
	EClass getScreenRuler();

	/**
	 * Returns the meta object for the containment reference list '{@link com.wireframesketcher.model.ScreenRuler#getGuides <em>Guides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guides</em>'.
	 * @see com.wireframesketcher.model.ScreenRuler#getGuides()
	 * @see #getScreenRuler()
	 * @generated
	 */
	EReference getScreenRuler_Guides();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.RulerGuide <em>Ruler Guide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ruler Guide</em>'.
	 * @see com.wireframesketcher.model.RulerGuide
	 * @generated
	 */
	EClass getRulerGuide();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.RulerGuide#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see com.wireframesketcher.model.RulerGuide#getPosition()
	 * @see #getRulerGuide()
	 * @generated
	 */
	EAttribute getRulerGuide_Position();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see com.wireframesketcher.model.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Widget#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.wireframesketcher.model.Widget#getId()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Id();

	/**
	 * Returns the meta object for the container reference '{@link com.wireframesketcher.model.Widget#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see com.wireframesketcher.model.Widget#getContainer()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Container();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Widget#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see com.wireframesketcher.model.Widget#getX()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_X();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Widget#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see com.wireframesketcher.model.Widget#getY()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Y();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Widget#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see com.wireframesketcher.model.Widget#getWidth()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Width();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Widget#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see com.wireframesketcher.model.Widget#getHeight()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Height();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Widget#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see com.wireframesketcher.model.Widget#getText()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Text();

	/**
	 * Returns the meta object for the reference '{@link com.wireframesketcher.model.Widget#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Descriptor</em>'.
	 * @see com.wireframesketcher.model.Widget#getDescriptor()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Descriptor();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Widget#isLocked <em>Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locked</em>'.
	 * @see com.wireframesketcher.model.Widget#isLocked()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Locked();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Widget#getMeasuredWidth <em>Measured Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measured Width</em>'.
	 * @see com.wireframesketcher.model.Widget#getMeasuredWidth()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_MeasuredWidth();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Widget#getMeasuredHeight <em>Measured Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measured Height</em>'.
	 * @see com.wireframesketcher.model.Widget#getMeasuredHeight()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_MeasuredHeight();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Widget#getCustomId <em>Custom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Id</em>'.
	 * @see com.wireframesketcher.model.Widget#getCustomId()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_CustomId();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Widget#getCustomData <em>Custom Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Data</em>'.
	 * @see com.wireframesketcher.model.Widget#getCustomData()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_CustomData();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Widget#isAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation</em>'.
	 * @see com.wireframesketcher.model.Widget#isAnnotation()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Widget#getLayoutParams <em>Layout Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Params</em>'.
	 * @see com.wireframesketcher.model.Widget#getLayoutParams()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_LayoutParams();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see com.wireframesketcher.model.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Button#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see com.wireframesketcher.model.Button#getStyle()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Style();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Checkbox <em>Checkbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checkbox</em>'.
	 * @see com.wireframesketcher.model.Checkbox
	 * @generated
	 */
	EClass getCheckbox();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Combo <em>Combo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combo</em>'.
	 * @see com.wireframesketcher.model.Combo
	 * @generated
	 */
	EClass getCombo();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see com.wireframesketcher.model.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see com.wireframesketcher.model.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Placeholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placeholder</em>'.
	 * @see com.wireframesketcher.model.Placeholder
	 * @generated
	 */
	EClass getPlaceholder();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Button</em>'.
	 * @see com.wireframesketcher.model.RadioButton
	 * @generated
	 */
	EClass getRadioButton();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Field</em>'.
	 * @see com.wireframesketcher.model.TextField
	 * @generated
	 */
	EClass getTextField();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window</em>'.
	 * @see com.wireframesketcher.model.Window
	 * @generated
	 */
	EClass getWindow();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Window#isCloseButton <em>Close Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Close Button</em>'.
	 * @see com.wireframesketcher.model.Window#isCloseButton()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_CloseButton();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Window#isMinimizeButton <em>Minimize Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimize Button</em>'.
	 * @see com.wireframesketcher.model.Window#isMinimizeButton()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_MinimizeButton();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Window#isMaximizeButton <em>Maximize Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximize Button</em>'.
	 * @see com.wireframesketcher.model.Window#isMaximizeButton()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_MaximizeButton();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.WidgetDescriptor <em>Widget Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Descriptor</em>'.
	 * @see com.wireframesketcher.model.WidgetDescriptor
	 * @generated
	 */
	EClass getWidgetDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.WidgetDescriptor#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see com.wireframesketcher.model.WidgetDescriptor#getTypeName()
	 * @see #getWidgetDescriptor()
	 * @generated
	 */
	EAttribute getWidgetDescriptor_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.WidgetDescriptor#getResizeMode <em>Resize Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resize Mode</em>'.
	 * @see com.wireframesketcher.model.WidgetDescriptor#getResizeMode()
	 * @see #getWidgetDescriptor()
	 * @generated
	 */
	EAttribute getWidgetDescriptor_ResizeMode();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.WidgetDescriptor#isTextEditable <em>Text Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Editable</em>'.
	 * @see com.wireframesketcher.model.WidgetDescriptor#isTextEditable()
	 * @see #getWidgetDescriptor()
	 * @generated
	 */
	EAttribute getWidgetDescriptor_TextEditable();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.WidgetDescriptor#isTextWrappable <em>Text Wrappable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Wrappable</em>'.
	 * @see com.wireframesketcher.model.WidgetDescriptor#isTextWrappable()
	 * @see #getWidgetDescriptor()
	 * @generated
	 */
	EAttribute getWidgetDescriptor_TextWrappable();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.WidgetDescriptor#getTextLines <em>Text Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Lines</em>'.
	 * @see com.wireframesketcher.model.WidgetDescriptor#getTextLines()
	 * @see #getWidgetDescriptor()
	 * @generated
	 */
	EAttribute getWidgetDescriptor_TextLines();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.WidgetDescriptor#isTextCentered <em>Text Centered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Centered</em>'.
	 * @see com.wireframesketcher.model.WidgetDescriptor#isTextCentered()
	 * @see #getWidgetDescriptor()
	 * @generated
	 */
	EAttribute getWidgetDescriptor_TextCentered();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see com.wireframesketcher.model.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Text#isDummyText <em>Dummy Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dummy Text</em>'.
	 * @see com.wireframesketcher.model.Text#isDummyText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_DummyText();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see com.wireframesketcher.model.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see com.wireframesketcher.model.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.List#isHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see com.wireframesketcher.model.List#isHeader()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Header();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Popup <em>Popup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Popup</em>'.
	 * @see com.wireframesketcher.model.Popup
	 * @generated
	 */
	EClass getPopup();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see com.wireframesketcher.model.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see com.wireframesketcher.model.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Table#isVerticalLines <em>Vertical Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Lines</em>'.
	 * @see com.wireframesketcher.model.Table#isVerticalLines()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_VerticalLines();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Table#isHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see com.wireframesketcher.model.Table#isHeader()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Header();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree</em>'.
	 * @see com.wireframesketcher.model.Tree
	 * @generated
	 */
	EClass getTree();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Icon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon</em>'.
	 * @see com.wireframesketcher.model.Icon
	 * @generated
	 */
	EClass getIcon();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.TextArea <em>Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Area</em>'.
	 * @see com.wireframesketcher.model.TextArea
	 * @generated
	 */
	EClass getTextArea();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Browser <em>Browser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Browser</em>'.
	 * @see com.wireframesketcher.model.Browser
	 * @generated
	 */
	EClass getBrowser();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Font <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font</em>'.
	 * @see com.wireframesketcher.model.Font
	 * @generated
	 */
	EClass getFont();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Font#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see com.wireframesketcher.model.Font#getSize()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Size();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Font#getBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see com.wireframesketcher.model.Font#getBold()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Bold();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Font#getItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see com.wireframesketcher.model.Font#getItalic()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Italic();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Font#getUnderline <em>Underline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underline</em>'.
	 * @see com.wireframesketcher.model.Font#getUnderline()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Underline();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.WidgetContainer <em>Widget Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Container</em>'.
	 * @see com.wireframesketcher.model.WidgetContainer
	 * @generated
	 */
	EClass getWidgetContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link com.wireframesketcher.model.WidgetContainer#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see com.wireframesketcher.model.WidgetContainer#getWidgets()
	 * @see #getWidgetContainer()
	 * @generated
	 */
	EReference getWidgetContainer_Widgets();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.WidgetGroup <em>Widget Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Group</em>'.
	 * @see com.wireframesketcher.model.WidgetGroup
	 * @generated
	 */
	EClass getWidgetGroup();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Master <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master</em>'.
	 * @see com.wireframesketcher.model.Master
	 * @generated
	 */
	EClass getMaster();

	/**
	 * Returns the meta object for the reference '{@link com.wireframesketcher.model.Master#getScreen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screen</em>'.
	 * @see com.wireframesketcher.model.Master#getScreen()
	 * @see #getMaster()
	 * @generated
	 */
	EReference getMaster_Screen();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Master#isDimmed <em>Dimmed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimmed</em>'.
	 * @see com.wireframesketcher.model.Master#isDimmed()
	 * @see #getMaster()
	 * @generated
	 */
	EAttribute getMaster_Dimmed();

	/**
	 * Returns the meta object for the containment reference '{@link com.wireframesketcher.model.Master#getOverrides <em>Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overrides</em>'.
	 * @see com.wireframesketcher.model.Master#getOverrides()
	 * @see #getMaster()
	 * @generated
	 */
	EReference getMaster_Overrides();

	/**
	 * Returns the meta object for the containment reference '{@link com.wireframesketcher.model.Master#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instance</em>'.
	 * @see com.wireframesketcher.model.Master#getInstance()
	 * @see #getMaster()
	 * @generated
	 */
	EReference getMaster_Instance();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see com.wireframesketcher.model.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Image#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see com.wireframesketcher.model.Image#getSrc()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Src();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Image#isGrayscale <em>Grayscale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grayscale</em>'.
	 * @see com.wireframesketcher.model.Image#isGrayscale()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Grayscale();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.ScreenFont <em>Screen Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screen Font</em>'.
	 * @see com.wireframesketcher.model.ScreenFont
	 * @generated
	 */
	EClass getScreenFont();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.ScreenFont#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.wireframesketcher.model.ScreenFont#getName()
	 * @see #getScreenFont()
	 * @generated
	 */
	EAttribute getScreenFont_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.ScreenFont#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see com.wireframesketcher.model.ScreenFont#getSize()
	 * @see #getScreenFont()
	 * @generated
	 */
	EAttribute getScreenFont_Size();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.ScreenFont#isBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see com.wireframesketcher.model.ScreenFont#isBold()
	 * @see #getScreenFont()
	 * @generated
	 */
	EAttribute getScreenFont_Bold();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.ScreenFont#isItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see com.wireframesketcher.model.ScreenFont#isItalic()
	 * @see #getScreenFont()
	 * @generated
	 */
	EAttribute getScreenFont_Italic();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.ScreenFont#getAvailable <em>Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available</em>'.
	 * @see com.wireframesketcher.model.ScreenFont#getAvailable()
	 * @see #getScreenFont()
	 * @generated
	 */
	EAttribute getScreenFont_Available();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.FontSupport <em>Font Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font Support</em>'.
	 * @see com.wireframesketcher.model.FontSupport
	 * @generated
	 */
	EClass getFontSupport();

	/**
	 * Returns the meta object for the containment reference '{@link com.wireframesketcher.model.FontSupport#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font</em>'.
	 * @see com.wireframesketcher.model.FontSupport#getFont()
	 * @see #getFontSupport()
	 * @generated
	 */
	EReference getFontSupport_Font();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.ColorForegroundSupport <em>Color Foreground Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Foreground Support</em>'.
	 * @see com.wireframesketcher.model.ColorForegroundSupport
	 * @generated
	 */
	EClass getColorForegroundSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.ColorForegroundSupport#getForeground <em>Foreground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground</em>'.
	 * @see com.wireframesketcher.model.ColorForegroundSupport#getForeground()
	 * @see #getColorForegroundSupport()
	 * @generated
	 */
	EAttribute getColorForegroundSupport_Foreground();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.ColorBackgroundSupport <em>Color Background Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Background Support</em>'.
	 * @see com.wireframesketcher.model.ColorBackgroundSupport
	 * @generated
	 */
	EClass getColorBackgroundSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.ColorBackgroundSupport#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see com.wireframesketcher.model.ColorBackgroundSupport#getBackground()
	 * @see #getColorBackgroundSupport()
	 * @generated
	 */
	EAttribute getColorBackgroundSupport_Background();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.ColorBorderSupport <em>Color Border Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Border Support</em>'.
	 * @see com.wireframesketcher.model.ColorBorderSupport
	 * @generated
	 */
	EClass getColorBorderSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.ColorBorderSupport#getBorderColor <em>Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Color</em>'.
	 * @see com.wireframesketcher.model.ColorBorderSupport#getBorderColor()
	 * @see #getColorBorderSupport()
	 * @generated
	 */
	EAttribute getColorBorderSupport_BorderColor();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.ColorAlphaSupport <em>Color Alpha Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Alpha Support</em>'.
	 * @see com.wireframesketcher.model.ColorAlphaSupport
	 * @generated
	 */
	EClass getColorAlphaSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.ColorAlphaSupport#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see com.wireframesketcher.model.ColorAlphaSupport#getAlpha()
	 * @see #getColorAlphaSupport()
	 * @generated
	 */
	EAttribute getColorAlphaSupport_Alpha();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.SelectionSupport <em>Selection Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Support</em>'.
	 * @see com.wireframesketcher.model.SelectionSupport
	 * @generated
	 */
	EClass getSelectionSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.SelectionSupport#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection</em>'.
	 * @see com.wireframesketcher.model.SelectionSupport#getSelection()
	 * @see #getSelectionSupport()
	 * @generated
	 */
	EAttribute getSelectionSupport_Selection();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.TextAlignmentSupport <em>Text Alignment Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Alignment Support</em>'.
	 * @see com.wireframesketcher.model.TextAlignmentSupport
	 * @generated
	 */
	EClass getTextAlignmentSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.TextAlignmentSupport#getTextAlignment <em>Text Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Alignment</em>'.
	 * @see com.wireframesketcher.model.TextAlignmentSupport#getTextAlignment()
	 * @see #getTextAlignmentSupport()
	 * @generated
	 */
	EAttribute getTextAlignmentSupport_TextAlignment();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.BooleanSelectionSupport <em>Boolean Selection Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Selection Support</em>'.
	 * @see com.wireframesketcher.model.BooleanSelectionSupport
	 * @generated
	 */
	EClass getBooleanSelectionSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.BooleanSelectionSupport#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see com.wireframesketcher.model.BooleanSelectionSupport#isSelected()
	 * @see #getBooleanSelectionSupport()
	 * @generated
	 */
	EAttribute getBooleanSelectionSupport_Selected();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see com.wireframesketcher.model.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.ProgressBar <em>Progress Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Progress Bar</em>'.
	 * @see com.wireframesketcher.model.ProgressBar
	 * @generated
	 */
	EClass getProgressBar();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Callout <em>Callout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callout</em>'.
	 * @see com.wireframesketcher.model.Callout
	 * @generated
	 */
	EClass getCallout();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.SearchField <em>Search Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Field</em>'.
	 * @see com.wireframesketcher.model.SearchField
	 * @generated
	 */
	EClass getSearchField();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Tooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tooltip</em>'.
	 * @see com.wireframesketcher.model.Tooltip
	 * @generated
	 */
	EClass getTooltip();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Tooltip#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see com.wireframesketcher.model.Tooltip#getPosition()
	 * @see #getTooltip()
	 * @generated
	 */
	EAttribute getTooltip_Position();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.ScratchOut <em>Scratch Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scratch Out</em>'.
	 * @see com.wireframesketcher.model.ScratchOut
	 * @generated
	 */
	EClass getScratchOut();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.BorderSupport <em>Border Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border Support</em>'.
	 * @see com.wireframesketcher.model.BorderSupport
	 * @generated
	 */
	EClass getBorderSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.BorderSupport#isBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see com.wireframesketcher.model.BorderSupport#isBorder()
	 * @see #getBorderSupport()
	 * @generated
	 */
	EAttribute getBorderSupport_Border();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.StateSupport <em>State Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Support</em>'.
	 * @see com.wireframesketcher.model.StateSupport
	 * @generated
	 */
	EClass getStateSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.StateSupport#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see com.wireframesketcher.model.StateSupport#getState()
	 * @see #getStateSupport()
	 * @generated
	 */
	EAttribute getStateSupport_State();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Breadcrumbs <em>Breadcrumbs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breadcrumbs</em>'.
	 * @see com.wireframesketcher.model.Breadcrumbs
	 * @generated
	 */
	EClass getBreadcrumbs();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.LinkBar <em>Link Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Bar</em>'.
	 * @see com.wireframesketcher.model.LinkBar
	 * @generated
	 */
	EClass getLinkBar();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Accordion <em>Accordion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accordion</em>'.
	 * @see com.wireframesketcher.model.Accordion
	 * @generated
	 */
	EClass getAccordion();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.VerticalScrollbarSupport <em>Vertical Scrollbar Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertical Scrollbar Support</em>'.
	 * @see com.wireframesketcher.model.VerticalScrollbarSupport
	 * @generated
	 */
	EClass getVerticalScrollbarSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.VerticalScrollbarSupport#isVerticalScrollbar <em>Vertical Scrollbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Scrollbar</em>'.
	 * @see com.wireframesketcher.model.VerticalScrollbarSupport#isVerticalScrollbar()
	 * @see #getVerticalScrollbarSupport()
	 * @generated
	 */
	EAttribute getVerticalScrollbarSupport_VerticalScrollbar();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.DateField <em>Date Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Field</em>'.
	 * @see com.wireframesketcher.model.DateField
	 * @generated
	 */
	EClass getDateField();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.VideoPlayer <em>Video Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Player</em>'.
	 * @see com.wireframesketcher.model.VideoPlayer
	 * @generated
	 */
	EClass getVideoPlayer();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see com.wireframesketcher.model.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.CoverFlow <em>Cover Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cover Flow</em>'.
	 * @see com.wireframesketcher.model.CoverFlow
	 * @generated
	 */
	EClass getCoverFlow();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.TabbedPane <em>Tabbed Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabbed Pane</em>'.
	 * @see com.wireframesketcher.model.TabbedPane
	 * @generated
	 */
	EClass getTabbedPane();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.TabbedPane#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see com.wireframesketcher.model.TabbedPane#getPosition()
	 * @see #getTabbedPane()
	 * @generated
	 */
	EAttribute getTabbedPane_Position();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.IconSupport <em>Icon Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Support</em>'.
	 * @see com.wireframesketcher.model.IconSupport
	 * @generated
	 */
	EClass getIconSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.IconSupport#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see com.wireframesketcher.model.IconSupport#getIcon()
	 * @see #getIconSupport()
	 * @generated
	 */
	EAttribute getIconSupport_Icon();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.IconSupport#getIconRotation <em>Icon Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Rotation</em>'.
	 * @see com.wireframesketcher.model.IconSupport#getIconRotation()
	 * @see #getIconSupport()
	 * @generated
	 */
	EAttribute getIconSupport_IconRotation();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.ValueSupport <em>Value Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Support</em>'.
	 * @see com.wireframesketcher.model.ValueSupport
	 * @generated
	 */
	EClass getValueSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.ValueSupport#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.wireframesketcher.model.ValueSupport#getValue()
	 * @see #getValueSupport()
	 * @generated
	 */
	EAttribute getValueSupport_Value();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.ColorPicker <em>Color Picker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Picker</em>'.
	 * @see com.wireframesketcher.model.ColorPicker
	 * @generated
	 */
	EClass getColorPicker();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Arrow <em>Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrow</em>'.
	 * @see com.wireframesketcher.model.Arrow
	 * @generated
	 */
	EClass getArrow();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Arrow#isLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see com.wireframesketcher.model.Arrow#isLeft()
	 * @see #getArrow()
	 * @generated
	 */
	EAttribute getArrow_Left();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Arrow#isRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see com.wireframesketcher.model.Arrow#isRight()
	 * @see #getArrow()
	 * @generated
	 */
	EAttribute getArrow_Right();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Arrow#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see com.wireframesketcher.model.Arrow#getDirection()
	 * @see #getArrow()
	 * @generated
	 */
	EAttribute getArrow_Direction();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.CurlyBrace <em>Curly Brace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curly Brace</em>'.
	 * @see com.wireframesketcher.model.CurlyBrace
	 * @generated
	 */
	EClass getCurlyBrace();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.CurlyBrace#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see com.wireframesketcher.model.CurlyBrace#getPosition()
	 * @see #getCurlyBrace()
	 * @generated
	 */
	EAttribute getCurlyBrace_Position();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.ButtonBar <em>Button Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Bar</em>'.
	 * @see com.wireframesketcher.model.ButtonBar
	 * @generated
	 */
	EClass getButtonBar();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.BorderStyleSupport <em>Border Style Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border Style Support</em>'.
	 * @see com.wireframesketcher.model.BorderStyleSupport
	 * @generated
	 */
	EClass getBorderStyleSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.BorderStyleSupport#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see com.wireframesketcher.model.BorderStyleSupport#getBorder()
	 * @see #getBorderStyleSupport()
	 * @generated
	 */
	EAttribute getBorderStyleSupport_Border();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle</em>'.
	 * @see com.wireframesketcher.model.Circle
	 * @generated
	 */
	EClass getCircle();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see com.wireframesketcher.model.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.IconPositionSupport <em>Icon Position Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Position Support</em>'.
	 * @see com.wireframesketcher.model.IconPositionSupport
	 * @generated
	 */
	EClass getIconPositionSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.IconPositionSupport#getIconPosition <em>Icon Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Position</em>'.
	 * @see com.wireframesketcher.model.IconPositionSupport#getIconPosition()
	 * @see #getIconPositionSupport()
	 * @generated
	 */
	EAttribute getIconPositionSupport_IconPosition();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.ListSupport <em>List Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Support</em>'.
	 * @see com.wireframesketcher.model.ListSupport
	 * @generated
	 */
	EClass getListSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.ListSupport#getRowHeight <em>Row Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Height</em>'.
	 * @see com.wireframesketcher.model.ListSupport#getRowHeight()
	 * @see #getListSupport()
	 * @generated
	 */
	EAttribute getListSupport_RowHeight();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.ListSupport#isHorizontalLines <em>Horizontal Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Lines</em>'.
	 * @see com.wireframesketcher.model.ListSupport#isHorizontalLines()
	 * @see #getListSupport()
	 * @generated
	 */
	EAttribute getListSupport_HorizontalLines();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Chart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart</em>'.
	 * @see com.wireframesketcher.model.Chart
	 * @generated
	 */
	EClass getChart();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Chart#getChartType <em>Chart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chart Type</em>'.
	 * @see com.wireframesketcher.model.Chart#getChartType()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_ChartType();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.CrossOut <em>Cross Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cross Out</em>'.
	 * @see com.wireframesketcher.model.CrossOut
	 * @generated
	 */
	EClass getCrossOut();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see com.wireframesketcher.model.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Item#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see com.wireframesketcher.model.Item#getX()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_X();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Item#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see com.wireframesketcher.model.Item#getY()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Y();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Item#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see com.wireframesketcher.model.Item#getWidth()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Width();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Item#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see com.wireframesketcher.model.Item#getHeight()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Height();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Item#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see com.wireframesketcher.model.Item#getText()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Text();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.ItemSupport <em>Item Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Support</em>'.
	 * @see com.wireframesketcher.model.ItemSupport
	 * @generated
	 */
	EClass getItemSupport();

	/**
	 * Returns the meta object for the containment reference list '{@link com.wireframesketcher.model.ItemSupport#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see com.wireframesketcher.model.ItemSupport#getItems()
	 * @see #getItemSupport()
	 * @generated
	 */
	EReference getItemSupport_Items();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.LinkSupport <em>Link Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Support</em>'.
	 * @see com.wireframesketcher.model.LinkSupport
	 * @generated
	 */
	EClass getLinkSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.LinkSupport#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see com.wireframesketcher.model.LinkSupport#getLink()
	 * @see #getLinkSupport()
	 * @generated
	 */
	EAttribute getLinkSupport_Link();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Hotspot <em>Hotspot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotspot</em>'.
	 * @see com.wireframesketcher.model.Hotspot
	 * @generated
	 */
	EClass getHotspot();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.NameSupport <em>Name Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Support</em>'.
	 * @see com.wireframesketcher.model.NameSupport
	 * @generated
	 */
	EClass getNameSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.NameSupport#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.wireframesketcher.model.NameSupport#getName()
	 * @see #getNameSupport()
	 * @generated
	 */
	EAttribute getNameSupport_Name();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.ColorAlternativeSupport <em>Color Alternative Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Alternative Support</em>'.
	 * @see com.wireframesketcher.model.ColorAlternativeSupport
	 * @generated
	 */
	EClass getColorAlternativeSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.ColorAlternativeSupport#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternative</em>'.
	 * @see com.wireframesketcher.model.ColorAlternativeSupport#getAlternative()
	 * @see #getColorAlternativeSupport()
	 * @generated
	 */
	EAttribute getColorAlternativeSupport_Alternative();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.LineStyleSupport <em>Line Style Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Style Support</em>'.
	 * @see com.wireframesketcher.model.LineStyleSupport
	 * @generated
	 */
	EClass getLineStyleSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.LineStyleSupport#getLineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Style</em>'.
	 * @see com.wireframesketcher.model.LineStyleSupport#getLineStyle()
	 * @see #getLineStyleSupport()
	 * @generated
	 */
	EAttribute getLineStyleSupport_LineStyle();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.RotationSupport <em>Rotation Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation Support</em>'.
	 * @see com.wireframesketcher.model.RotationSupport
	 * @generated
	 */
	EClass getRotationSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.RotationSupport#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see com.wireframesketcher.model.RotationSupport#getRotation()
	 * @see #getRotationSupport()
	 * @generated
	 */
	EAttribute getRotationSupport_Rotation();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.FlipSupport <em>Flip Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flip Support</em>'.
	 * @see com.wireframesketcher.model.FlipSupport
	 * @generated
	 */
	EClass getFlipSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.FlipSupport#isHFlip <em>HFlip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HFlip</em>'.
	 * @see com.wireframesketcher.model.FlipSupport#isHFlip()
	 * @see #getFlipSupport()
	 * @generated
	 */
	EAttribute getFlipSupport_HFlip();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.FlipSupport#isVFlip <em>VFlip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VFlip</em>'.
	 * @see com.wireframesketcher.model.FlipSupport#isVFlip()
	 * @see #getFlipSupport()
	 * @generated
	 */
	EAttribute getFlipSupport_VFlip();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.SVGImage <em>SVG Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SVG Image</em>'.
	 * @see com.wireframesketcher.model.SVGImage
	 * @generated
	 */
	EClass getSVGImage();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.SVGImage#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see com.wireframesketcher.model.SVGImage#getSrc()
	 * @see #getSVGImage()
	 * @generated
	 */
	EAttribute getSVGImage_Src();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.SkinSupport <em>Skin Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skin Support</em>'.
	 * @see com.wireframesketcher.model.SkinSupport
	 * @generated
	 */
	EClass getSkinSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.SkinSupport#getSkin <em>Skin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skin</em>'.
	 * @see com.wireframesketcher.model.SkinSupport#getSkin()
	 * @see #getSkinSupport()
	 * @generated
	 */
	EAttribute getSkinSupport_Skin();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see com.wireframesketcher.model.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.Shape#getShapeType <em>Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape Type</em>'.
	 * @see com.wireframesketcher.model.Shape#getShapeType()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_ShapeType();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Alert <em>Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert</em>'.
	 * @see com.wireframesketcher.model.Alert
	 * @generated
	 */
	EClass getAlert();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see com.wireframesketcher.model.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.LineHeightSupport <em>Line Height Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Height Support</em>'.
	 * @see com.wireframesketcher.model.LineHeightSupport
	 * @generated
	 */
	EClass getLineHeightSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.LineHeightSupport#getLineHeight <em>Line Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Height</em>'.
	 * @see com.wireframesketcher.model.LineHeightSupport#getLineHeight()
	 * @see #getLineHeightSupport()
	 * @generated
	 */
	EAttribute getLineHeightSupport_LineHeight();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.VButtonBar <em>VButton Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VButton Bar</em>'.
	 * @see com.wireframesketcher.model.VButtonBar
	 * @generated
	 */
	EClass getVButtonBar();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.AnnotationSupport <em>Annotation Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Support</em>'.
	 * @see com.wireframesketcher.model.AnnotationSupport
	 * @generated
	 */
	EClass getAnnotationSupport();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.TextLinksSupport <em>Text Links Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Links Support</em>'.
	 * @see com.wireframesketcher.model.TextLinksSupport
	 * @generated
	 */
	EClass getTextLinksSupport();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.NoteSupport <em>Note Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note Support</em>'.
	 * @see com.wireframesketcher.model.NoteSupport
	 * @generated
	 */
	EClass getNoteSupport();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.NoteSupport#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see com.wireframesketcher.model.NoteSupport#getNote()
	 * @see #getNoteSupport()
	 * @generated
	 */
	EAttribute getNoteSupport_Note();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.HSplitter <em>HSplitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HSplitter</em>'.
	 * @see com.wireframesketcher.model.HSplitter
	 * @generated
	 */
	EClass getHSplitter();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.VSplitter <em>VSplitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSplitter</em>'.
	 * @see com.wireframesketcher.model.VSplitter
	 * @generated
	 */
	EClass getVSplitter();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Spinner <em>Spinner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spinner</em>'.
	 * @see com.wireframesketcher.model.Spinner
	 * @generated
	 */
	EClass getSpinner();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.HScrollbar <em>HScrollbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HScrollbar</em>'.
	 * @see com.wireframesketcher.model.HScrollbar
	 * @generated
	 */
	EClass getHScrollbar();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.VScrollbar <em>VScrollbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VScrollbar</em>'.
	 * @see com.wireframesketcher.model.VScrollbar
	 * @generated
	 */
	EClass getVScrollbar();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.HLine <em>HLine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLine</em>'.
	 * @see com.wireframesketcher.model.HLine
	 * @generated
	 */
	EClass getHLine();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.VLine <em>VLine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VLine</em>'.
	 * @see com.wireframesketcher.model.VLine
	 * @generated
	 */
	EClass getVLine();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.HSlider <em>HSlider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HSlider</em>'.
	 * @see com.wireframesketcher.model.HSlider
	 * @generated
	 */
	EClass getHSlider();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.VSlider <em>VSlider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSlider</em>'.
	 * @see com.wireframesketcher.model.VSlider
	 * @generated
	 */
	EClass getVSlider();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Tabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabs</em>'.
	 * @see com.wireframesketcher.model.Tabs
	 * @generated
	 */
	EClass getTabs();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see com.wireframesketcher.model.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel</em>'.
	 * @see com.wireframesketcher.model.Panel
	 * @generated
	 */
	EClass getPanel();

	/**
	 * Returns the meta object for enum '{@link com.wireframesketcher.model.ResizeMode <em>Resize Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resize Mode</em>'.
	 * @see com.wireframesketcher.model.ResizeMode
	 * @generated
	 */
	EEnum getResizeMode();

	/**
	 * Returns the meta object for enum '{@link com.wireframesketcher.model.TextAlignment <em>Text Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Alignment</em>'.
	 * @see com.wireframesketcher.model.TextAlignment
	 * @generated
	 */
	EEnum getTextAlignment();

	/**
	 * Returns the meta object for enum '{@link com.wireframesketcher.model.IconSize <em>Icon Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Icon Size</em>'.
	 * @see com.wireframesketcher.model.IconSize
	 * @generated
	 */
	EEnum getIconSize();

	/**
	 * Returns the meta object for enum '{@link com.wireframesketcher.model.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State</em>'.
	 * @see com.wireframesketcher.model.State
	 * @generated
	 */
	EEnum getState();

	/**
	 * Returns the meta object for enum '{@link com.wireframesketcher.model.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position</em>'.
	 * @see com.wireframesketcher.model.Position
	 * @generated
	 */
	EEnum getPosition();

	/**
	 * Returns the meta object for enum '{@link com.wireframesketcher.model.BorderStyle <em>Border Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Border Style</em>'.
	 * @see com.wireframesketcher.model.BorderStyle
	 * @generated
	 */
	EEnum getBorderStyle();

	/**
	 * Returns the meta object for enum '{@link com.wireframesketcher.model.ButtonStyle <em>Button Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Button Style</em>'.
	 * @see com.wireframesketcher.model.ButtonStyle
	 * @generated
	 */
	EEnum getButtonStyle();

	/**
	 * Returns the meta object for enum '{@link com.wireframesketcher.model.ChartType <em>Chart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Chart Type</em>'.
	 * @see com.wireframesketcher.model.ChartType
	 * @generated
	 */
	EEnum getChartType();

	/**
	 * Returns the meta object for enum '{@link com.wireframesketcher.model.Theme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Theme</em>'.
	 * @see com.wireframesketcher.model.Theme
	 * @generated
	 */
	EEnum getTheme();

	/**
	 * Returns the meta object for enum '{@link com.wireframesketcher.model.LineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Line Style</em>'.
	 * @see com.wireframesketcher.model.LineStyle
	 * @generated
	 */
	EEnum getLineStyle();

	/**
	 * Returns the meta object for enum '{@link com.wireframesketcher.model.Rotation90 <em>Rotation90</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rotation90</em>'.
	 * @see com.wireframesketcher.model.Rotation90
	 * @generated
	 */
	EEnum getRotation90();

	/**
	 * Returns the meta object for enum '{@link com.wireframesketcher.model.ShapeType <em>Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shape Type</em>'.
	 * @see com.wireframesketcher.model.ShapeType
	 * @generated
	 */
	EEnum getShapeType();

	/**
	 * Returns the meta object for data type '{@link com.wireframesketcher.model.IconDesc <em>Icon Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Icon Data Type</em>'.
	 * @see com.wireframesketcher.model.IconDesc
	 * @model instanceClass="com.wireframesketcher.model.IconDesc"
	 * @generated
	 */
	EDataType getIconDataType();

	/**
	 * Returns the meta object for data type '{@link com.wireframesketcher.model.FontSize <em>Font Size Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Font Size Data Type</em>'.
	 * @see com.wireframesketcher.model.FontSize
	 * @model instanceClass="com.wireframesketcher.model.FontSize"
	 * @generated
	 */
	EDataType getFontSizeDataType();

	/**
	 * Returns the meta object for data type '{@link com.wireframesketcher.model.ColorDesc <em>Color Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color Data Type</em>'.
	 * @see com.wireframesketcher.model.ColorDesc
	 * @model instanceClass="com.wireframesketcher.model.ColorDesc"
	 * @generated
	 */
	EDataType getColorDataType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.URI <em>URI Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI Data Type</em>'.
	 * @see org.eclipse.emf.common.util.URI
	 * @model instanceClass="org.eclipse.emf.common.util.URI"
	 * @generated
	 */
	EDataType getURIDataType();

	/**
	 * Returns the meta object for data type '<em>Selection Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Selection Data Type</em>'.
	 * @model instanceClass="int"
	 * @generated
	 */
	EDataType getSelectionDataType();

	/**
	 * Returns the meta object for data type '{@link com.wireframesketcher.model.VersionDesc <em>Version Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Data Type</em>'.
	 * @see com.wireframesketcher.model.VersionDesc
	 * @model instanceClass="com.wireframesketcher.model.VersionDesc"
	 * @generated
	 */
	EDataType getVersionDataType();

	/**
	 * Returns the meta object for data type '{@link com.wireframesketcher.model.LineHeight <em>Line Height Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Line Height Data Type</em>'.
	 * @see com.wireframesketcher.model.LineHeight
	 * @model instanceClass="com.wireframesketcher.model.LineHeight"
	 * @generated
	 */
	EDataType getLineHeightDataType();

	/**
	 * Returns the meta object for data type '{@link com.wireframesketcher.model.LayoutParams <em>Layout Params Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Layout Params Data Type</em>'.
	 * @see com.wireframesketcher.model.LayoutParams
	 * @model instanceClass="com.wireframesketcher.model.LayoutParams"
	 * @generated
	 */
	EDataType getLayoutParamsDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
	interface Literals  {
		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.ScreenImpl <em>Screen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.ScreenImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getScreen()
		 * @generated
		 */
		EClass SCREEN = eINSTANCE.getScreen();

		/**
		 * The meta object literal for the '<em><b>HRuler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN__HRULER = eINSTANCE.getScreen_HRuler();

		/**
		 * The meta object literal for the '<em><b>VRuler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN__VRULER = eINSTANCE.getScreen_VRuler();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__NAME = eINSTANCE.getScreen_Name();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN__FONT = eINSTANCE.getScreen_Font();

		/**
		 * The meta object literal for the '<em><b>Theme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__THEME = eINSTANCE.getScreen_Theme();

		/**
		 * The meta object literal for the '<em><b>Min Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__MIN_VERSION = eINSTANCE.getScreen_MinVersion();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.ScreenRulerImpl <em>Screen Ruler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.ScreenRulerImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getScreenRuler()
		 * @generated
		 */
		EClass SCREEN_RULER = eINSTANCE.getScreenRuler();

		/**
		 * The meta object literal for the '<em><b>Guides</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN_RULER__GUIDES = eINSTANCE.getScreenRuler_Guides();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.RulerGuideImpl <em>Ruler Guide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.RulerGuideImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getRulerGuide()
		 * @generated
		 */
		EClass RULER_GUIDE = eINSTANCE.getRulerGuide();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULER_GUIDE__POSITION = eINSTANCE.getRulerGuide_Position();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.WidgetImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__ID = eINSTANCE.getWidget_Id();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__CONTAINER = eINSTANCE.getWidget_Container();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__X = eINSTANCE.getWidget_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__Y = eINSTANCE.getWidget_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__WIDTH = eINSTANCE.getWidget_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__HEIGHT = eINSTANCE.getWidget_Height();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__TEXT = eINSTANCE.getWidget_Text();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__DESCRIPTOR = eINSTANCE.getWidget_Descriptor();

		/**
		 * The meta object literal for the '<em><b>Locked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__LOCKED = eINSTANCE.getWidget_Locked();

		/**
		 * The meta object literal for the '<em><b>Measured Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__MEASURED_WIDTH = eINSTANCE.getWidget_MeasuredWidth();

		/**
		 * The meta object literal for the '<em><b>Measured Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__MEASURED_HEIGHT = eINSTANCE.getWidget_MeasuredHeight();

		/**
		 * The meta object literal for the '<em><b>Custom Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__CUSTOM_ID = eINSTANCE.getWidget_CustomId();

		/**
		 * The meta object literal for the '<em><b>Custom Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__CUSTOM_DATA = eINSTANCE.getWidget_CustomData();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__ANNOTATION = eINSTANCE.getWidget_Annotation();

		/**
		 * The meta object literal for the '<em><b>Layout Params</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__LAYOUT_PARAMS = eINSTANCE.getWidget_LayoutParams();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.ButtonImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__STYLE = eINSTANCE.getButton_Style();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.CheckboxImpl <em>Checkbox</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.CheckboxImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getCheckbox()
		 * @generated
		 */
		EClass CHECKBOX = eINSTANCE.getCheckbox();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.ComboImpl <em>Combo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.ComboImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getCombo()
		 * @generated
		 */
		EClass COMBO = eINSTANCE.getCombo();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.LabelImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.LinkImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.PlaceholderImpl <em>Placeholder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.PlaceholderImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getPlaceholder()
		 * @generated
		 */
		EClass PLACEHOLDER = eINSTANCE.getPlaceholder();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.RadioButtonImpl <em>Radio Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.RadioButtonImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getRadioButton()
		 * @generated
		 */
		EClass RADIO_BUTTON = eINSTANCE.getRadioButton();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.TextFieldImpl <em>Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.TextFieldImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTextField()
		 * @generated
		 */
		EClass TEXT_FIELD = eINSTANCE.getTextField();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.WindowImpl <em>Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.WindowImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getWindow()
		 * @generated
		 */
		EClass WINDOW = eINSTANCE.getWindow();

		/**
		 * The meta object literal for the '<em><b>Close Button</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__CLOSE_BUTTON = eINSTANCE.getWindow_CloseButton();

		/**
		 * The meta object literal for the '<em><b>Minimize Button</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__MINIMIZE_BUTTON = eINSTANCE.getWindow_MinimizeButton();

		/**
		 * The meta object literal for the '<em><b>Maximize Button</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__MAXIMIZE_BUTTON = eINSTANCE.getWindow_MaximizeButton();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.WidgetDescriptorImpl <em>Widget Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.WidgetDescriptorImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getWidgetDescriptor()
		 * @generated
		 */
		EClass WIDGET_DESCRIPTOR = eINSTANCE.getWidgetDescriptor();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_DESCRIPTOR__TYPE_NAME = eINSTANCE.getWidgetDescriptor_TypeName();

		/**
		 * The meta object literal for the '<em><b>Resize Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_DESCRIPTOR__RESIZE_MODE = eINSTANCE.getWidgetDescriptor_ResizeMode();

		/**
		 * The meta object literal for the '<em><b>Text Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_DESCRIPTOR__TEXT_EDITABLE = eINSTANCE.getWidgetDescriptor_TextEditable();

		/**
		 * The meta object literal for the '<em><b>Text Wrappable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_DESCRIPTOR__TEXT_WRAPPABLE = eINSTANCE.getWidgetDescriptor_TextWrappable();

		/**
		 * The meta object literal for the '<em><b>Text Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_DESCRIPTOR__TEXT_LINES = eINSTANCE.getWidgetDescriptor_TextLines();

		/**
		 * The meta object literal for the '<em><b>Text Centered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_DESCRIPTOR__TEXT_CENTERED = eINSTANCE.getWidgetDescriptor_TextCentered();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.TextImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Dummy Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__DUMMY_TEXT = eINSTANCE.getText_DummyText();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.AreaImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getArea()
		 * @generated
		 */
		EClass AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.ListImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__HEADER = eINSTANCE.getList_Header();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.PopupImpl <em>Popup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.PopupImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getPopup()
		 * @generated
		 */
		EClass POPUP = eINSTANCE.getPopup();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.MenuImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.TableImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Vertical Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__VERTICAL_LINES = eINSTANCE.getTable_VerticalLines();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__HEADER = eINSTANCE.getTable_Header();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.TreeImpl <em>Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.TreeImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTree()
		 * @generated
		 */
		EClass TREE = eINSTANCE.getTree();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.IconImpl <em>Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.IconImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getIcon()
		 * @generated
		 */
		EClass ICON = eINSTANCE.getIcon();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.TextAreaImpl <em>Text Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.TextAreaImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTextArea()
		 * @generated
		 */
		EClass TEXT_AREA = eINSTANCE.getTextArea();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.BrowserImpl <em>Browser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.BrowserImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getBrowser()
		 * @generated
		 */
		EClass BROWSER = eINSTANCE.getBrowser();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.FontImpl <em>Font</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.FontImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getFont()
		 * @generated
		 */
		EClass FONT = eINSTANCE.getFont();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__SIZE = eINSTANCE.getFont_Size();

		/**
		 * The meta object literal for the '<em><b>Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__BOLD = eINSTANCE.getFont_Bold();

		/**
		 * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__ITALIC = eINSTANCE.getFont_Italic();

		/**
		 * The meta object literal for the '<em><b>Underline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__UNDERLINE = eINSTANCE.getFont_Underline();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.WidgetContainer <em>Widget Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.WidgetContainer
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getWidgetContainer()
		 * @generated
		 */
		EClass WIDGET_CONTAINER = eINSTANCE.getWidgetContainer();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_CONTAINER__WIDGETS = eINSTANCE.getWidgetContainer_Widgets();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.WidgetGroupImpl <em>Widget Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.WidgetGroupImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getWidgetGroup()
		 * @generated
		 */
		EClass WIDGET_GROUP = eINSTANCE.getWidgetGroup();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.MasterImpl <em>Master</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.MasterImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getMaster()
		 * @generated
		 */
		EClass MASTER = eINSTANCE.getMaster();

		/**
		 * The meta object literal for the '<em><b>Screen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER__SCREEN = eINSTANCE.getMaster_Screen();

		/**
		 * The meta object literal for the '<em><b>Dimmed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER__DIMMED = eINSTANCE.getMaster_Dimmed();

		/**
		 * The meta object literal for the '<em><b>Overrides</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER__OVERRIDES = eINSTANCE.getMaster_Overrides();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER__INSTANCE = eINSTANCE.getMaster_Instance();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.ImageImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__SRC = eINSTANCE.getImage_Src();

		/**
		 * The meta object literal for the '<em><b>Grayscale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__GRAYSCALE = eINSTANCE.getImage_Grayscale();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.ScreenFontImpl <em>Screen Font</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.ScreenFontImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getScreenFont()
		 * @generated
		 */
		EClass SCREEN_FONT = eINSTANCE.getScreenFont();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN_FONT__NAME = eINSTANCE.getScreenFont_Name();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN_FONT__SIZE = eINSTANCE.getScreenFont_Size();

		/**
		 * The meta object literal for the '<em><b>Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN_FONT__BOLD = eINSTANCE.getScreenFont_Bold();

		/**
		 * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN_FONT__ITALIC = eINSTANCE.getScreenFont_Italic();

		/**
		 * The meta object literal for the '<em><b>Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN_FONT__AVAILABLE = eINSTANCE.getScreenFont_Available();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.FontSupport <em>Font Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.FontSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getFontSupport()
		 * @generated
		 */
		EClass FONT_SUPPORT = eINSTANCE.getFontSupport();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FONT_SUPPORT__FONT = eINSTANCE.getFontSupport_Font();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.ColorForegroundSupport <em>Color Foreground Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.ColorForegroundSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getColorForegroundSupport()
		 * @generated
		 */
		EClass COLOR_FOREGROUND_SUPPORT = eINSTANCE.getColorForegroundSupport();

		/**
		 * The meta object literal for the '<em><b>Foreground</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_FOREGROUND_SUPPORT__FOREGROUND = eINSTANCE.getColorForegroundSupport_Foreground();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.ColorBackgroundSupport <em>Color Background Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.ColorBackgroundSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getColorBackgroundSupport()
		 * @generated
		 */
		EClass COLOR_BACKGROUND_SUPPORT = eINSTANCE.getColorBackgroundSupport();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_BACKGROUND_SUPPORT__BACKGROUND = eINSTANCE.getColorBackgroundSupport_Background();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.ColorBorderSupport <em>Color Border Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.ColorBorderSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getColorBorderSupport()
		 * @generated
		 */
		EClass COLOR_BORDER_SUPPORT = eINSTANCE.getColorBorderSupport();

		/**
		 * The meta object literal for the '<em><b>Border Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_BORDER_SUPPORT__BORDER_COLOR = eINSTANCE.getColorBorderSupport_BorderColor();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.ColorAlphaSupport <em>Color Alpha Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.ColorAlphaSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getColorAlphaSupport()
		 * @generated
		 */
		EClass COLOR_ALPHA_SUPPORT = eINSTANCE.getColorAlphaSupport();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_ALPHA_SUPPORT__ALPHA = eINSTANCE.getColorAlphaSupport_Alpha();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.SelectionSupport <em>Selection Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.SelectionSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getSelectionSupport()
		 * @generated
		 */
		EClass SELECTION_SUPPORT = eINSTANCE.getSelectionSupport();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_SUPPORT__SELECTION = eINSTANCE.getSelectionSupport_Selection();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.TextAlignmentSupport <em>Text Alignment Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.TextAlignmentSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTextAlignmentSupport()
		 * @generated
		 */
		EClass TEXT_ALIGNMENT_SUPPORT = eINSTANCE.getTextAlignmentSupport();

		/**
		 * The meta object literal for the '<em><b>Text Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ALIGNMENT_SUPPORT__TEXT_ALIGNMENT = eINSTANCE.getTextAlignmentSupport_TextAlignment();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.BooleanSelectionSupport <em>Boolean Selection Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.BooleanSelectionSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getBooleanSelectionSupport()
		 * @generated
		 */
		EClass BOOLEAN_SELECTION_SUPPORT = eINSTANCE.getBooleanSelectionSupport();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_SELECTION_SUPPORT__SELECTED = eINSTANCE.getBooleanSelectionSupport_Selected();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.NoteImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.ProgressBarImpl <em>Progress Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.ProgressBarImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getProgressBar()
		 * @generated
		 */
		EClass PROGRESS_BAR = eINSTANCE.getProgressBar();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.CalloutImpl <em>Callout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.CalloutImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getCallout()
		 * @generated
		 */
		EClass CALLOUT = eINSTANCE.getCallout();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.SearchFieldImpl <em>Search Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.SearchFieldImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getSearchField()
		 * @generated
		 */
		EClass SEARCH_FIELD = eINSTANCE.getSearchField();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.TooltipImpl <em>Tooltip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.TooltipImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTooltip()
		 * @generated
		 */
		EClass TOOLTIP = eINSTANCE.getTooltip();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOLTIP__POSITION = eINSTANCE.getTooltip_Position();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.ScratchOutImpl <em>Scratch Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.ScratchOutImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getScratchOut()
		 * @generated
		 */
		EClass SCRATCH_OUT = eINSTANCE.getScratchOut();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.BorderSupport <em>Border Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.BorderSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getBorderSupport()
		 * @generated
		 */
		EClass BORDER_SUPPORT = eINSTANCE.getBorderSupport();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER_SUPPORT__BORDER = eINSTANCE.getBorderSupport_Border();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.StateSupport <em>State Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.StateSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getStateSupport()
		 * @generated
		 */
		EClass STATE_SUPPORT = eINSTANCE.getStateSupport();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_SUPPORT__STATE = eINSTANCE.getStateSupport_State();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.BreadcrumbsImpl <em>Breadcrumbs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.BreadcrumbsImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getBreadcrumbs()
		 * @generated
		 */
		EClass BREADCRUMBS = eINSTANCE.getBreadcrumbs();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.LinkBarImpl <em>Link Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.LinkBarImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getLinkBar()
		 * @generated
		 */
		EClass LINK_BAR = eINSTANCE.getLinkBar();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.AccordionImpl <em>Accordion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.AccordionImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getAccordion()
		 * @generated
		 */
		EClass ACCORDION = eINSTANCE.getAccordion();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.VerticalScrollbarSupport <em>Vertical Scrollbar Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.VerticalScrollbarSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getVerticalScrollbarSupport()
		 * @generated
		 */
		EClass VERTICAL_SCROLLBAR_SUPPORT = eINSTANCE.getVerticalScrollbarSupport();

		/**
		 * The meta object literal for the '<em><b>Vertical Scrollbar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCROLLBAR_SUPPORT__VERTICAL_SCROLLBAR = eINSTANCE.getVerticalScrollbarSupport_VerticalScrollbar();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.DateFieldImpl <em>Date Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.DateFieldImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getDateField()
		 * @generated
		 */
		EClass DATE_FIELD = eINSTANCE.getDateField();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.VideoPlayerImpl <em>Video Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.VideoPlayerImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getVideoPlayer()
		 * @generated
		 */
		EClass VIDEO_PLAYER = eINSTANCE.getVideoPlayer();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.MapImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.CoverFlowImpl <em>Cover Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.CoverFlowImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getCoverFlow()
		 * @generated
		 */
		EClass COVER_FLOW = eINSTANCE.getCoverFlow();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.TabbedPaneImpl <em>Tabbed Pane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.TabbedPaneImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTabbedPane()
		 * @generated
		 */
		EClass TABBED_PANE = eINSTANCE.getTabbedPane();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABBED_PANE__POSITION = eINSTANCE.getTabbedPane_Position();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.IconSupport <em>Icon Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.IconSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getIconSupport()
		 * @generated
		 */
		EClass ICON_SUPPORT = eINSTANCE.getIconSupport();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_SUPPORT__ICON = eINSTANCE.getIconSupport_Icon();

		/**
		 * The meta object literal for the '<em><b>Icon Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_SUPPORT__ICON_ROTATION = eINSTANCE.getIconSupport_IconRotation();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.HSplitterImpl <em>HSplitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.HSplitterImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getHSplitter()
		 * @generated
		 */
		EClass HSPLITTER = eINSTANCE.getHSplitter();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.VSplitterImpl <em>VSplitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.VSplitterImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getVSplitter()
		 * @generated
		 */
		EClass VSPLITTER = eINSTANCE.getVSplitter();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.ValueSupport <em>Value Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.ValueSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getValueSupport()
		 * @generated
		 */
		EClass VALUE_SUPPORT = eINSTANCE.getValueSupport();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SUPPORT__VALUE = eINSTANCE.getValueSupport_Value();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.ColorPickerImpl <em>Color Picker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.ColorPickerImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getColorPicker()
		 * @generated
		 */
		EClass COLOR_PICKER = eINSTANCE.getColorPicker();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.ArrowImpl <em>Arrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.ArrowImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getArrow()
		 * @generated
		 */
		EClass ARROW = eINSTANCE.getArrow();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARROW__LEFT = eINSTANCE.getArrow_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARROW__RIGHT = eINSTANCE.getArrow_Right();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARROW__DIRECTION = eINSTANCE.getArrow_Direction();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.CurlyBraceImpl <em>Curly Brace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.CurlyBraceImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getCurlyBrace()
		 * @generated
		 */
		EClass CURLY_BRACE = eINSTANCE.getCurlyBrace();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURLY_BRACE__POSITION = eINSTANCE.getCurlyBrace_Position();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.ButtonBarImpl <em>Button Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.ButtonBarImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getButtonBar()
		 * @generated
		 */
		EClass BUTTON_BAR = eINSTANCE.getButtonBar();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.BorderStyleSupport <em>Border Style Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.BorderStyleSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getBorderStyleSupport()
		 * @generated
		 */
		EClass BORDER_STYLE_SUPPORT = eINSTANCE.getBorderStyleSupport();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER_STYLE_SUPPORT__BORDER = eINSTANCE.getBorderStyleSupport_Border();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.CircleImpl <em>Circle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.CircleImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getCircle()
		 * @generated
		 */
		EClass CIRCLE = eINSTANCE.getCircle();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.RectangleImpl <em>Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.RectangleImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getRectangle()
		 * @generated
		 */
		EClass RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.IconPositionSupport <em>Icon Position Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.IconPositionSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getIconPositionSupport()
		 * @generated
		 */
		EClass ICON_POSITION_SUPPORT = eINSTANCE.getIconPositionSupport();

		/**
		 * The meta object literal for the '<em><b>Icon Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_POSITION_SUPPORT__ICON_POSITION = eINSTANCE.getIconPositionSupport_IconPosition();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.ListSupport <em>List Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.ListSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getListSupport()
		 * @generated
		 */
		EClass LIST_SUPPORT = eINSTANCE.getListSupport();

		/**
		 * The meta object literal for the '<em><b>Row Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_SUPPORT__ROW_HEIGHT = eINSTANCE.getListSupport_RowHeight();

		/**
		 * The meta object literal for the '<em><b>Horizontal Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_SUPPORT__HORIZONTAL_LINES = eINSTANCE.getListSupport_HorizontalLines();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.ChartImpl <em>Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.ChartImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getChart()
		 * @generated
		 */
		EClass CHART = eINSTANCE.getChart();

		/**
		 * The meta object literal for the '<em><b>Chart Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART__CHART_TYPE = eINSTANCE.getChart_ChartType();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.CrossOutImpl <em>Cross Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.CrossOutImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getCrossOut()
		 * @generated
		 */
		EClass CROSS_OUT = eINSTANCE.getCrossOut();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.ItemImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__X = eINSTANCE.getItem_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__Y = eINSTANCE.getItem_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__WIDTH = eINSTANCE.getItem_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__HEIGHT = eINSTANCE.getItem_Height();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__TEXT = eINSTANCE.getItem_Text();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.ItemSupport <em>Item Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.ItemSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getItemSupport()
		 * @generated
		 */
		EClass ITEM_SUPPORT = eINSTANCE.getItemSupport();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_SUPPORT__ITEMS = eINSTANCE.getItemSupport_Items();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.LinkSupport <em>Link Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.LinkSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getLinkSupport()
		 * @generated
		 */
		EClass LINK_SUPPORT = eINSTANCE.getLinkSupport();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_SUPPORT__LINK = eINSTANCE.getLinkSupport_Link();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.HotspotImpl <em>Hotspot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.HotspotImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getHotspot()
		 * @generated
		 */
		EClass HOTSPOT = eINSTANCE.getHotspot();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.NameSupport <em>Name Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.NameSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getNameSupport()
		 * @generated
		 */
		EClass NAME_SUPPORT = eINSTANCE.getNameSupport();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_SUPPORT__NAME = eINSTANCE.getNameSupport_Name();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.ColorAlternativeSupport <em>Color Alternative Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.ColorAlternativeSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getColorAlternativeSupport()
		 * @generated
		 */
		EClass COLOR_ALTERNATIVE_SUPPORT = eINSTANCE.getColorAlternativeSupport();

		/**
		 * The meta object literal for the '<em><b>Alternative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_ALTERNATIVE_SUPPORT__ALTERNATIVE = eINSTANCE.getColorAlternativeSupport_Alternative();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.LineStyleSupport <em>Line Style Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.LineStyleSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getLineStyleSupport()
		 * @generated
		 */
		EClass LINE_STYLE_SUPPORT = eINSTANCE.getLineStyleSupport();

		/**
		 * The meta object literal for the '<em><b>Line Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STYLE_SUPPORT__LINE_STYLE = eINSTANCE.getLineStyleSupport_LineStyle();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.RotationSupport <em>Rotation Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.RotationSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getRotationSupport()
		 * @generated
		 */
		EClass ROTATION_SUPPORT = eINSTANCE.getRotationSupport();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION_SUPPORT__ROTATION = eINSTANCE.getRotationSupport_Rotation();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.FlipSupport <em>Flip Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.FlipSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getFlipSupport()
		 * @generated
		 */
		EClass FLIP_SUPPORT = eINSTANCE.getFlipSupport();

		/**
		 * The meta object literal for the '<em><b>HFlip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIP_SUPPORT__HFLIP = eINSTANCE.getFlipSupport_HFlip();

		/**
		 * The meta object literal for the '<em><b>VFlip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIP_SUPPORT__VFLIP = eINSTANCE.getFlipSupport_VFlip();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.SVGImageImpl <em>SVG Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.SVGImageImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getSVGImage()
		 * @generated
		 */
		EClass SVG_IMAGE = eINSTANCE.getSVGImage();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SVG_IMAGE__SRC = eINSTANCE.getSVGImage_Src();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.SkinSupport <em>Skin Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.SkinSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getSkinSupport()
		 * @generated
		 */
		EClass SKIN_SUPPORT = eINSTANCE.getSkinSupport();

		/**
		 * The meta object literal for the '<em><b>Skin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKIN_SUPPORT__SKIN = eINSTANCE.getSkinSupport_Skin();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.ShapeImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Shape Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__SHAPE_TYPE = eINSTANCE.getShape_ShapeType();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.AlertImpl <em>Alert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.AlertImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getAlert()
		 * @generated
		 */
		EClass ALERT = eINSTANCE.getAlert();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.SwitchImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.LineHeightSupport <em>Line Height Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.LineHeightSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getLineHeightSupport()
		 * @generated
		 */
		EClass LINE_HEIGHT_SUPPORT = eINSTANCE.getLineHeightSupport();

		/**
		 * The meta object literal for the '<em><b>Line Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_HEIGHT_SUPPORT__LINE_HEIGHT = eINSTANCE.getLineHeightSupport_LineHeight();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.VButtonBarImpl <em>VButton Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.VButtonBarImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getVButtonBar()
		 * @generated
		 */
		EClass VBUTTON_BAR = eINSTANCE.getVButtonBar();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.AnnotationSupport <em>Annotation Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.AnnotationSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getAnnotationSupport()
		 * @generated
		 */
		EClass ANNOTATION_SUPPORT = eINSTANCE.getAnnotationSupport();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.TextLinksSupport <em>Text Links Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.TextLinksSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTextLinksSupport()
		 * @generated
		 */
		EClass TEXT_LINKS_SUPPORT = eINSTANCE.getTextLinksSupport();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.NoteSupport <em>Note Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.NoteSupport
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getNoteSupport()
		 * @generated
		 */
		EClass NOTE_SUPPORT = eINSTANCE.getNoteSupport();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_SUPPORT__NOTE = eINSTANCE.getNoteSupport_Note();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.SpinnerImpl <em>Spinner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.SpinnerImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getSpinner()
		 * @generated
		 */
		EClass SPINNER = eINSTANCE.getSpinner();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.HScrollbarImpl <em>HScrollbar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.HScrollbarImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getHScrollbar()
		 * @generated
		 */
		EClass HSCROLLBAR = eINSTANCE.getHScrollbar();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.VScrollbarImpl <em>VScrollbar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.VScrollbarImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getVScrollbar()
		 * @generated
		 */
		EClass VSCROLLBAR = eINSTANCE.getVScrollbar();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.HLineImpl <em>HLine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.HLineImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getHLine()
		 * @generated
		 */
		EClass HLINE = eINSTANCE.getHLine();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.VLineImpl <em>VLine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.VLineImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getVLine()
		 * @generated
		 */
		EClass VLINE = eINSTANCE.getVLine();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.HSliderImpl <em>HSlider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.HSliderImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getHSlider()
		 * @generated
		 */
		EClass HSLIDER = eINSTANCE.getHSlider();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.VSliderImpl <em>VSlider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.VSliderImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getVSlider()
		 * @generated
		 */
		EClass VSLIDER = eINSTANCE.getVSlider();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.TabsImpl <em>Tabs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.TabsImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTabs()
		 * @generated
		 */
		EClass TABS = eINSTANCE.getTabs();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.GroupImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.impl.PanelImpl <em>Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.PanelImpl
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getPanel()
		 * @generated
		 */
		EClass PANEL = eINSTANCE.getPanel();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.ResizeMode <em>Resize Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.ResizeMode
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getResizeMode()
		 * @generated
		 */
		EEnum RESIZE_MODE = eINSTANCE.getResizeMode();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.TextAlignment <em>Text Alignment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.TextAlignment
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTextAlignment()
		 * @generated
		 */
		EEnum TEXT_ALIGNMENT = eINSTANCE.getTextAlignment();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.IconSize <em>Icon Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.IconSize
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getIconSize()
		 * @generated
		 */
		EEnum ICON_SIZE = eINSTANCE.getIconSize();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.State <em>State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.State
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getState()
		 * @generated
		 */
		EEnum STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.Position <em>Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.Position
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getPosition()
		 * @generated
		 */
		EEnum POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.BorderStyle <em>Border Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.BorderStyle
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getBorderStyle()
		 * @generated
		 */
		EEnum BORDER_STYLE = eINSTANCE.getBorderStyle();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.ButtonStyle <em>Button Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.ButtonStyle
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getButtonStyle()
		 * @generated
		 */
		EEnum BUTTON_STYLE = eINSTANCE.getButtonStyle();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.ChartType <em>Chart Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.ChartType
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getChartType()
		 * @generated
		 */
		EEnum CHART_TYPE = eINSTANCE.getChartType();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.Theme <em>Theme</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.Theme
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getTheme()
		 * @generated
		 */
		EEnum THEME = eINSTANCE.getTheme();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.LineStyle <em>Line Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.LineStyle
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getLineStyle()
		 * @generated
		 */
		EEnum LINE_STYLE = eINSTANCE.getLineStyle();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.Rotation90 <em>Rotation90</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.Rotation90
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getRotation90()
		 * @generated
		 */
		EEnum ROTATION90 = eINSTANCE.getRotation90();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.ShapeType <em>Shape Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.ShapeType
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getShapeType()
		 * @generated
		 */
		EEnum SHAPE_TYPE = eINSTANCE.getShapeType();

		/**
		 * The meta object literal for the '<em>Icon Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.IconDesc
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getIconDataType()
		 * @generated
		 */
		EDataType ICON_DATA_TYPE = eINSTANCE.getIconDataType();

		/**
		 * The meta object literal for the '<em>Font Size Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.FontSize
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getFontSizeDataType()
		 * @generated
		 */
		EDataType FONT_SIZE_DATA_TYPE = eINSTANCE.getFontSizeDataType();

		/**
		 * The meta object literal for the '<em>Color Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.ColorDesc
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getColorDataType()
		 * @generated
		 */
		EDataType COLOR_DATA_TYPE = eINSTANCE.getColorDataType();

		/**
		 * The meta object literal for the '<em>URI Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.URI
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getURIDataType()
		 * @generated
		 */
		EDataType URI_DATA_TYPE = eINSTANCE.getURIDataType();

		/**
		 * The meta object literal for the '<em>Selection Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getSelectionDataType()
		 * @generated
		 */
		EDataType SELECTION_DATA_TYPE = eINSTANCE.getSelectionDataType();

		/**
		 * The meta object literal for the '<em>Version Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.VersionDesc
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getVersionDataType()
		 * @generated
		 */
		EDataType VERSION_DATA_TYPE = eINSTANCE.getVersionDataType();

		/**
		 * The meta object literal for the '<em>Line Height Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.LineHeight
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getLineHeightDataType()
		 * @generated
		 */
		EDataType LINE_HEIGHT_DATA_TYPE = eINSTANCE.getLineHeightDataType();

		/**
		 * The meta object literal for the '<em>Layout Params Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.LayoutParams
		 * @see com.wireframesketcher.model.impl.ModelPackageImpl#getLayoutParamsDataType()
		 * @generated
		 */
		EDataType LAYOUT_PARAMS_DATA_TYPE = eINSTANCE.getLayoutParamsDataType();

	}

} //ModelPackage
