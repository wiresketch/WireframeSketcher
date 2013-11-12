/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import com.wireframesketcher.model.Accordion;
import com.wireframesketcher.model.Alert;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.wireframesketcher.model.Area;
import com.wireframesketcher.model.Arrow;
import com.wireframesketcher.model.BooleanSelectionSupport;
import com.wireframesketcher.model.BorderStyle;
import com.wireframesketcher.model.BorderStyleSupport;
import com.wireframesketcher.model.BorderSupport;
import com.wireframesketcher.model.Breadcrumbs;
import com.wireframesketcher.model.Browser;
import com.wireframesketcher.model.Button;
import com.wireframesketcher.model.ButtonBar;
import com.wireframesketcher.model.ButtonStyle;
import com.wireframesketcher.model.Callout;
import com.wireframesketcher.model.Chart;
import com.wireframesketcher.model.ChartType;
import com.wireframesketcher.model.Checkbox;
import com.wireframesketcher.model.Circle;
import com.wireframesketcher.model.ColorAlphaSupport;
import com.wireframesketcher.model.ColorAlternativeSupport;
import com.wireframesketcher.model.ColorBackgroundSupport;
import com.wireframesketcher.model.ColorBorderSupport;
import com.wireframesketcher.model.ColorDesc;
import com.wireframesketcher.model.ColorForegroundSupport;
import com.wireframesketcher.model.ColorPicker;
import com.wireframesketcher.model.Combo;
import com.wireframesketcher.model.CoverFlow;
import com.wireframesketcher.model.CrossOut;
import com.wireframesketcher.model.CurlyBrace;
import com.wireframesketcher.model.DateField;
import com.wireframesketcher.model.FlipSupport;
import com.wireframesketcher.model.Font;
import com.wireframesketcher.model.FontSize;
import com.wireframesketcher.model.FontSupport;
import com.wireframesketcher.model.Group;
import com.wireframesketcher.model.HLine;
import com.wireframesketcher.model.HScrollbar;
import com.wireframesketcher.model.HSlider;
import com.wireframesketcher.model.HSplitter;
import com.wireframesketcher.model.Hotspot;
import com.wireframesketcher.model.Icon;
import com.wireframesketcher.model.IconDesc;
import com.wireframesketcher.model.IconPositionSupport;
import com.wireframesketcher.model.IconSize;
import com.wireframesketcher.model.IconSupport;
import com.wireframesketcher.model.Image;
import com.wireframesketcher.model.Item;
import com.wireframesketcher.model.ItemSupport;
import com.wireframesketcher.model.Label;
import com.wireframesketcher.model.LineStyle;
import com.wireframesketcher.model.LineStyleSupport;
import com.wireframesketcher.model.Link;
import com.wireframesketcher.model.LinkBar;
import com.wireframesketcher.model.LinkSupport;
import com.wireframesketcher.model.List;
import com.wireframesketcher.model.ListSupport;
import com.wireframesketcher.model.Map;
import com.wireframesketcher.model.Master;
import com.wireframesketcher.model.Menu;
import com.wireframesketcher.model.ModelFactory;
import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.NameSupport;
import com.wireframesketcher.model.Note;
import com.wireframesketcher.model.Panel;
import com.wireframesketcher.model.Placeholder;
import com.wireframesketcher.model.Popup;
import com.wireframesketcher.model.Position;
import com.wireframesketcher.model.ProgressBar;
import com.wireframesketcher.model.RadioButton;
import com.wireframesketcher.model.Rectangle;
import com.wireframesketcher.model.ResizeMode;
import com.wireframesketcher.model.Rotation90;
import com.wireframesketcher.model.RotationSupport;
import com.wireframesketcher.model.RulerGuide;
import com.wireframesketcher.model.SVGImage;
import com.wireframesketcher.model.ScratchOut;
import com.wireframesketcher.model.Screen;
import com.wireframesketcher.model.ScreenFont;
import com.wireframesketcher.model.ScreenRuler;
import com.wireframesketcher.model.SearchField;
import com.wireframesketcher.model.SelectionSupport;
import com.wireframesketcher.model.Shape;
import com.wireframesketcher.model.ShapeType;
import com.wireframesketcher.model.SkinSupport;
import com.wireframesketcher.model.Spinner;
import com.wireframesketcher.model.State;
import com.wireframesketcher.model.StateSupport;
import com.wireframesketcher.model.Switch;
import com.wireframesketcher.model.TabbedPane;
import com.wireframesketcher.model.Table;
import com.wireframesketcher.model.Tabs;
import com.wireframesketcher.model.Text;
import com.wireframesketcher.model.TextAlignment;
import com.wireframesketcher.model.TextAlignmentSupport;
import com.wireframesketcher.model.TextArea;
import com.wireframesketcher.model.TextField;
import com.wireframesketcher.model.Theme;
import com.wireframesketcher.model.Tooltip;
import com.wireframesketcher.model.Tree;
import com.wireframesketcher.model.VLine;
import com.wireframesketcher.model.VScrollbar;
import com.wireframesketcher.model.VSlider;
import com.wireframesketcher.model.VSplitter;
import com.wireframesketcher.model.ValueSupport;
import com.wireframesketcher.model.VersionDesc;
import com.wireframesketcher.model.VerticalScrollbarSupport;
import com.wireframesketcher.model.VideoPlayer;
import com.wireframesketcher.model.Widget;
import com.wireframesketcher.model.WidgetContainer;
import com.wireframesketcher.model.WidgetDescriptor;
import com.wireframesketcher.model.WidgetGroup;
import com.wireframesketcher.model.Window;
import com.wireframesketcher.model.overrides.OverridesPackage;
import com.wireframesketcher.model.overrides.impl.OverridesPackageImpl;
import com.wireframesketcher.model.story.StoryPackage;
import com.wireframesketcher.model.story.impl.StoryPackageImpl;
import org.eclipse.emf.common.util.URI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screenRulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rulerGuideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkboxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comboEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeholderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radioButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass popupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iconEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass browserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screenFontEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorForegroundSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorBackgroundSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorBorderSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorAlphaSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textAlignmentSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanSelectionSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progressBarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calloutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tooltipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scratchOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass borderSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breadcrumbsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkBarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accordionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verticalScrollbarSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoPlayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coverFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabbedPaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iconSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorPickerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass curlyBraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonBarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass borderStyleSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iconPositionSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotspotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorAlternativeSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineStyleSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotationSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flipSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skinSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hSplitterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vSplitterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spinnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hScrollbarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vScrollbarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hSliderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vSliderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resizeModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textAlignmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum iconSizeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum positionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum borderStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum buttonStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chartTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum themeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rotation90EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shapeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iconDataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontSizeDataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorDataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriDataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType selectionDataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionDataTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.wireframesketcher.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		StoryPackageImpl theStoryPackage = (StoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StoryPackage.eNS_URI) instanceof StoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StoryPackage.eNS_URI) : StoryPackage.eINSTANCE);
		OverridesPackageImpl theOverridesPackage = (OverridesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OverridesPackage.eNS_URI) instanceof OverridesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OverridesPackage.eNS_URI) : OverridesPackage.eINSTANCE);

		// Create package meta-data objects
		theModelPackage.createPackageContents();
		theStoryPackage.createPackageContents();
		theOverridesPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();
		theStoryPackage.initializePackageContents();
		theOverridesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScreen() {
		return screenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreen_HRuler() {
		return (EReference)screenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreen_VRuler() {
		return (EReference)screenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreen_Name() {
		return (EAttribute)screenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreen_Font() {
		return (EReference)screenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreen_Theme() {
		return (EAttribute)screenEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreen_MinVersion() {
		return (EAttribute)screenEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScreenRuler() {
		return screenRulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreenRuler_Guides() {
		return (EReference)screenRulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRulerGuide() {
		return rulerGuideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRulerGuide_Position() {
		return (EAttribute)rulerGuideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidget() {
		return widgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Id() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Container() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_X() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Y() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Width() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Height() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Text() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Descriptor() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Locked() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_MeasuredWidth() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_MeasuredHeight() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_CustomId() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_CustomData() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Annotation() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_Style() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckbox() {
		return checkboxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombo() {
		return comboEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceholder() {
		return placeholderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadioButton() {
		return radioButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextField() {
		return textFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWindow() {
		return windowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindow_CloseButton() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindow_MinimizeButton() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindow_MaximizeButton() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetDescriptor() {
		return widgetDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetDescriptor_TypeName() {
		return (EAttribute)widgetDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetDescriptor_ResizeMode() {
		return (EAttribute)widgetDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetDescriptor_TextEditable() {
		return (EAttribute)widgetDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetDescriptor_TextWrappable() {
		return (EAttribute)widgetDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetDescriptor_TextLines() {
		return (EAttribute)widgetDescriptorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetDescriptor_TextCentered() {
		return (EAttribute)widgetDescriptorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_DummyText() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArea() {
		return areaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getList() {
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_Header() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopup() {
		return popupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenu() {
		return menuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_VerticalLines() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Header() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTree() {
		return treeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIcon() {
		return iconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextArea() {
		return textAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrowser() {
		return browserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFont() {
		return fontEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Size() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Bold() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Italic() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Underline() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetContainer() {
		return widgetContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetContainer_Widgets() {
		return (EReference)widgetContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetGroup() {
		return widgetGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaster() {
		return masterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaster_Screen() {
		return (EReference)masterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaster_Dimmed() {
		return (EAttribute)masterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaster_Overrides() {
		return (EReference)masterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaster_Instance() {
		return (EReference)masterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Src() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Grayscale() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScreenFont() {
		return screenFontEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreenFont_Name() {
		return (EAttribute)screenFontEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreenFont_Size() {
		return (EAttribute)screenFontEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreenFont_Bold() {
		return (EAttribute)screenFontEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreenFont_Italic() {
		return (EAttribute)screenFontEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFontSupport() {
		return fontSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFontSupport_Font() {
		return (EReference)fontSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorForegroundSupport() {
		return colorForegroundSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorForegroundSupport_Foreground() {
		return (EAttribute)colorForegroundSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorBackgroundSupport() {
		return colorBackgroundSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorBackgroundSupport_Background() {
		return (EAttribute)colorBackgroundSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorBorderSupport() {
		return colorBorderSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorBorderSupport_BorderColor() {
		return (EAttribute)colorBorderSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorAlphaSupport() {
		return colorAlphaSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorAlphaSupport_Alpha() {
		return (EAttribute)colorAlphaSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionSupport() {
		return selectionSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionSupport_Selection() {
		return (EAttribute)selectionSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextAlignmentSupport() {
		return textAlignmentSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextAlignmentSupport_TextAlignment() {
		return (EAttribute)textAlignmentSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanSelectionSupport() {
		return booleanSelectionSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanSelectionSupport_Selected() {
		return (EAttribute)booleanSelectionSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgressBar() {
		return progressBarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallout() {
		return calloutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchField() {
		return searchFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTooltip() {
		return tooltipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTooltip_Position() {
		return (EAttribute)tooltipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScratchOut() {
		return scratchOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBorderSupport() {
		return borderSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBorderSupport_Border() {
		return (EAttribute)borderSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateSupport() {
		return stateSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateSupport_State() {
		return (EAttribute)stateSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreadcrumbs() {
		return breadcrumbsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkBar() {
		return linkBarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccordion() {
		return accordionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerticalScrollbarSupport() {
		return verticalScrollbarSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalScrollbarSupport_VerticalScrollbar() {
		return (EAttribute)verticalScrollbarSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateField() {
		return dateFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoPlayer() {
		return videoPlayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMap() {
		return mapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoverFlow() {
		return coverFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabbedPane() {
		return tabbedPaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabbedPane_Position() {
		return (EAttribute)tabbedPaneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIconSupport() {
		return iconSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconSupport_Icon() {
		return (EAttribute)iconSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconSupport_IconRotation() {
		return (EAttribute)iconSupportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHSplitter() {
		return hSplitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSplitter() {
		return vSplitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSupport() {
		return valueSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSupport_Value() {
		return (EAttribute)valueSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorPicker() {
		return colorPickerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrow() {
		return arrowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrow_Left() {
		return (EAttribute)arrowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrow_Right() {
		return (EAttribute)arrowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrow_Direction() {
		return (EAttribute)arrowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurlyBrace() {
		return curlyBraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurlyBrace_Position() {
		return (EAttribute)curlyBraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonBar() {
		return buttonBarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBorderStyleSupport() {
		return borderStyleSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBorderStyleSupport_Border() {
		return (EAttribute)borderStyleSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircle() {
		return circleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangle() {
		return rectangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIconPositionSupport() {
		return iconPositionSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconPositionSupport_IconPosition() {
		return (EAttribute)iconPositionSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListSupport() {
		return listSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListSupport_RowHeight() {
		return (EAttribute)listSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListSupport_HorizontalLines() {
		return (EAttribute)listSupportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChart() {
		return chartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChart_ChartType() {
		return (EAttribute)chartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrossOut() {
		return crossOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_X() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Y() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Width() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Height() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Text() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemSupport() {
		return itemSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemSupport_Items() {
		return (EReference)itemSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkSupport() {
		return linkSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkSupport_Link() {
		return (EAttribute)linkSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotspot() {
		return hotspotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameSupport() {
		return nameSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameSupport_Name() {
		return (EAttribute)nameSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorAlternativeSupport() {
		return colorAlternativeSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorAlternativeSupport_Alternative() {
		return (EAttribute)colorAlternativeSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineStyleSupport() {
		return lineStyleSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineStyleSupport_LineStyle() {
		return (EAttribute)lineStyleSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotationSupport() {
		return rotationSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotationSupport_Rotation() {
		return (EAttribute)rotationSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlipSupport() {
		return flipSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlipSupport_HFlip() {
		return (EAttribute)flipSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlipSupport_VFlip() {
		return (EAttribute)flipSupportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSVGImage() {
		return svgImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSVGImage_Src() {
		return (EAttribute)svgImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkinSupport() {
		return skinSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkinSupport_Skin() {
		return (EAttribute)skinSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShape() {
		return shapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShape_ShapeType() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlert() {
		return alertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitch() {
		return switchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpinner() {
		return spinnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHScrollbar() {
		return hScrollbarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVScrollbar() {
		return vScrollbarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLine() {
		return hLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVLine() {
		return vLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHSlider() {
		return hSliderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSlider() {
		return vSliderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabs() {
		return tabsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanel() {
		return panelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResizeMode() {
		return resizeModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextAlignment() {
		return textAlignmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIconSize() {
		return iconSizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getState() {
		return stateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPosition() {
		return positionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBorderStyle() {
		return borderStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getButtonStyle() {
		return buttonStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChartType() {
		return chartTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTheme() {
		return themeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLineStyle() {
		return lineStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRotation90() {
		return rotation90EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getShapeType() {
		return shapeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIconDataType() {
		return iconDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFontSizeDataType() {
		return fontSizeDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorDataType() {
		return colorDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURIDataType() {
		return uriDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSelectionDataType() {
		return selectionDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersionDataType() {
		return versionDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		screenEClass = createEClass(SCREEN);
		createEReference(screenEClass, SCREEN__HRULER);
		createEReference(screenEClass, SCREEN__VRULER);
		createEAttribute(screenEClass, SCREEN__NAME);
		createEReference(screenEClass, SCREEN__FONT);
		createEAttribute(screenEClass, SCREEN__THEME);
		createEAttribute(screenEClass, SCREEN__MIN_VERSION);

		screenRulerEClass = createEClass(SCREEN_RULER);
		createEReference(screenRulerEClass, SCREEN_RULER__GUIDES);

		rulerGuideEClass = createEClass(RULER_GUIDE);
		createEAttribute(rulerGuideEClass, RULER_GUIDE__POSITION);

		widgetEClass = createEClass(WIDGET);
		createEAttribute(widgetEClass, WIDGET__ID);
		createEReference(widgetEClass, WIDGET__CONTAINER);
		createEAttribute(widgetEClass, WIDGET__X);
		createEAttribute(widgetEClass, WIDGET__Y);
		createEAttribute(widgetEClass, WIDGET__WIDTH);
		createEAttribute(widgetEClass, WIDGET__HEIGHT);
		createEAttribute(widgetEClass, WIDGET__TEXT);
		createEReference(widgetEClass, WIDGET__DESCRIPTOR);
		createEAttribute(widgetEClass, WIDGET__LOCKED);
		createEAttribute(widgetEClass, WIDGET__MEASURED_WIDTH);
		createEAttribute(widgetEClass, WIDGET__MEASURED_HEIGHT);
		createEAttribute(widgetEClass, WIDGET__CUSTOM_ID);
		createEAttribute(widgetEClass, WIDGET__CUSTOM_DATA);
		createEAttribute(widgetEClass, WIDGET__ANNOTATION);

		buttonEClass = createEClass(BUTTON);
		createEAttribute(buttonEClass, BUTTON__STYLE);

		checkboxEClass = createEClass(CHECKBOX);

		comboEClass = createEClass(COMBO);

		labelEClass = createEClass(LABEL);

		linkEClass = createEClass(LINK);

		placeholderEClass = createEClass(PLACEHOLDER);

		radioButtonEClass = createEClass(RADIO_BUTTON);

		textFieldEClass = createEClass(TEXT_FIELD);

		spinnerEClass = createEClass(SPINNER);

		windowEClass = createEClass(WINDOW);
		createEAttribute(windowEClass, WINDOW__CLOSE_BUTTON);
		createEAttribute(windowEClass, WINDOW__MINIMIZE_BUTTON);
		createEAttribute(windowEClass, WINDOW__MAXIMIZE_BUTTON);

		browserEClass = createEClass(BROWSER);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__DUMMY_TEXT);

		areaEClass = createEClass(AREA);

		panelEClass = createEClass(PANEL);

		groupEClass = createEClass(GROUP);

		listEClass = createEClass(LIST);
		createEAttribute(listEClass, LIST__HEADER);

		popupEClass = createEClass(POPUP);

		menuEClass = createEClass(MENU);

		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__VERTICAL_LINES);
		createEAttribute(tableEClass, TABLE__HEADER);

		treeEClass = createEClass(TREE);

		iconEClass = createEClass(ICON);

		textAreaEClass = createEClass(TEXT_AREA);

		hScrollbarEClass = createEClass(HSCROLLBAR);

		vScrollbarEClass = createEClass(VSCROLLBAR);

		hLineEClass = createEClass(HLINE);

		vLineEClass = createEClass(VLINE);

		hSliderEClass = createEClass(HSLIDER);

		vSliderEClass = createEClass(VSLIDER);

		tabsEClass = createEClass(TABS);

		widgetDescriptorEClass = createEClass(WIDGET_DESCRIPTOR);
		createEAttribute(widgetDescriptorEClass, WIDGET_DESCRIPTOR__TYPE_NAME);
		createEAttribute(widgetDescriptorEClass, WIDGET_DESCRIPTOR__RESIZE_MODE);
		createEAttribute(widgetDescriptorEClass, WIDGET_DESCRIPTOR__TEXT_EDITABLE);
		createEAttribute(widgetDescriptorEClass, WIDGET_DESCRIPTOR__TEXT_WRAPPABLE);
		createEAttribute(widgetDescriptorEClass, WIDGET_DESCRIPTOR__TEXT_LINES);
		createEAttribute(widgetDescriptorEClass, WIDGET_DESCRIPTOR__TEXT_CENTERED);

		fontEClass = createEClass(FONT);
		createEAttribute(fontEClass, FONT__SIZE);
		createEAttribute(fontEClass, FONT__BOLD);
		createEAttribute(fontEClass, FONT__ITALIC);
		createEAttribute(fontEClass, FONT__UNDERLINE);

		widgetContainerEClass = createEClass(WIDGET_CONTAINER);
		createEReference(widgetContainerEClass, WIDGET_CONTAINER__WIDGETS);

		widgetGroupEClass = createEClass(WIDGET_GROUP);

		masterEClass = createEClass(MASTER);
		createEReference(masterEClass, MASTER__SCREEN);
		createEAttribute(masterEClass, MASTER__DIMMED);
		createEReference(masterEClass, MASTER__OVERRIDES);
		createEReference(masterEClass, MASTER__INSTANCE);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__SRC);
		createEAttribute(imageEClass, IMAGE__GRAYSCALE);

		screenFontEClass = createEClass(SCREEN_FONT);
		createEAttribute(screenFontEClass, SCREEN_FONT__NAME);
		createEAttribute(screenFontEClass, SCREEN_FONT__SIZE);
		createEAttribute(screenFontEClass, SCREEN_FONT__BOLD);
		createEAttribute(screenFontEClass, SCREEN_FONT__ITALIC);

		fontSupportEClass = createEClass(FONT_SUPPORT);
		createEReference(fontSupportEClass, FONT_SUPPORT__FONT);

		colorForegroundSupportEClass = createEClass(COLOR_FOREGROUND_SUPPORT);
		createEAttribute(colorForegroundSupportEClass, COLOR_FOREGROUND_SUPPORT__FOREGROUND);

		colorBackgroundSupportEClass = createEClass(COLOR_BACKGROUND_SUPPORT);
		createEAttribute(colorBackgroundSupportEClass, COLOR_BACKGROUND_SUPPORT__BACKGROUND);

		colorBorderSupportEClass = createEClass(COLOR_BORDER_SUPPORT);
		createEAttribute(colorBorderSupportEClass, COLOR_BORDER_SUPPORT__BORDER_COLOR);

		colorAlphaSupportEClass = createEClass(COLOR_ALPHA_SUPPORT);
		createEAttribute(colorAlphaSupportEClass, COLOR_ALPHA_SUPPORT__ALPHA);

		selectionSupportEClass = createEClass(SELECTION_SUPPORT);
		createEAttribute(selectionSupportEClass, SELECTION_SUPPORT__SELECTION);

		textAlignmentSupportEClass = createEClass(TEXT_ALIGNMENT_SUPPORT);
		createEAttribute(textAlignmentSupportEClass, TEXT_ALIGNMENT_SUPPORT__TEXT_ALIGNMENT);

		booleanSelectionSupportEClass = createEClass(BOOLEAN_SELECTION_SUPPORT);
		createEAttribute(booleanSelectionSupportEClass, BOOLEAN_SELECTION_SUPPORT__SELECTED);

		noteEClass = createEClass(NOTE);

		progressBarEClass = createEClass(PROGRESS_BAR);

		calloutEClass = createEClass(CALLOUT);

		searchFieldEClass = createEClass(SEARCH_FIELD);

		tooltipEClass = createEClass(TOOLTIP);
		createEAttribute(tooltipEClass, TOOLTIP__POSITION);

		scratchOutEClass = createEClass(SCRATCH_OUT);

		borderSupportEClass = createEClass(BORDER_SUPPORT);
		createEAttribute(borderSupportEClass, BORDER_SUPPORT__BORDER);

		stateSupportEClass = createEClass(STATE_SUPPORT);
		createEAttribute(stateSupportEClass, STATE_SUPPORT__STATE);

		breadcrumbsEClass = createEClass(BREADCRUMBS);

		linkBarEClass = createEClass(LINK_BAR);

		accordionEClass = createEClass(ACCORDION);

		verticalScrollbarSupportEClass = createEClass(VERTICAL_SCROLLBAR_SUPPORT);
		createEAttribute(verticalScrollbarSupportEClass, VERTICAL_SCROLLBAR_SUPPORT__VERTICAL_SCROLLBAR);

		dateFieldEClass = createEClass(DATE_FIELD);

		videoPlayerEClass = createEClass(VIDEO_PLAYER);

		mapEClass = createEClass(MAP);

		coverFlowEClass = createEClass(COVER_FLOW);

		tabbedPaneEClass = createEClass(TABBED_PANE);
		createEAttribute(tabbedPaneEClass, TABBED_PANE__POSITION);

		iconSupportEClass = createEClass(ICON_SUPPORT);
		createEAttribute(iconSupportEClass, ICON_SUPPORT__ICON);
		createEAttribute(iconSupportEClass, ICON_SUPPORT__ICON_ROTATION);

		hSplitterEClass = createEClass(HSPLITTER);

		vSplitterEClass = createEClass(VSPLITTER);

		valueSupportEClass = createEClass(VALUE_SUPPORT);
		createEAttribute(valueSupportEClass, VALUE_SUPPORT__VALUE);

		colorPickerEClass = createEClass(COLOR_PICKER);

		arrowEClass = createEClass(ARROW);
		createEAttribute(arrowEClass, ARROW__LEFT);
		createEAttribute(arrowEClass, ARROW__RIGHT);
		createEAttribute(arrowEClass, ARROW__DIRECTION);

		curlyBraceEClass = createEClass(CURLY_BRACE);
		createEAttribute(curlyBraceEClass, CURLY_BRACE__POSITION);

		buttonBarEClass = createEClass(BUTTON_BAR);

		borderStyleSupportEClass = createEClass(BORDER_STYLE_SUPPORT);
		createEAttribute(borderStyleSupportEClass, BORDER_STYLE_SUPPORT__BORDER);

		circleEClass = createEClass(CIRCLE);

		rectangleEClass = createEClass(RECTANGLE);

		iconPositionSupportEClass = createEClass(ICON_POSITION_SUPPORT);
		createEAttribute(iconPositionSupportEClass, ICON_POSITION_SUPPORT__ICON_POSITION);

		listSupportEClass = createEClass(LIST_SUPPORT);
		createEAttribute(listSupportEClass, LIST_SUPPORT__ROW_HEIGHT);
		createEAttribute(listSupportEClass, LIST_SUPPORT__HORIZONTAL_LINES);

		chartEClass = createEClass(CHART);
		createEAttribute(chartEClass, CHART__CHART_TYPE);

		crossOutEClass = createEClass(CROSS_OUT);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__X);
		createEAttribute(itemEClass, ITEM__Y);
		createEAttribute(itemEClass, ITEM__WIDTH);
		createEAttribute(itemEClass, ITEM__HEIGHT);
		createEAttribute(itemEClass, ITEM__TEXT);

		itemSupportEClass = createEClass(ITEM_SUPPORT);
		createEReference(itemSupportEClass, ITEM_SUPPORT__ITEMS);

		linkSupportEClass = createEClass(LINK_SUPPORT);
		createEAttribute(linkSupportEClass, LINK_SUPPORT__LINK);

		hotspotEClass = createEClass(HOTSPOT);

		nameSupportEClass = createEClass(NAME_SUPPORT);
		createEAttribute(nameSupportEClass, NAME_SUPPORT__NAME);

		colorAlternativeSupportEClass = createEClass(COLOR_ALTERNATIVE_SUPPORT);
		createEAttribute(colorAlternativeSupportEClass, COLOR_ALTERNATIVE_SUPPORT__ALTERNATIVE);

		lineStyleSupportEClass = createEClass(LINE_STYLE_SUPPORT);
		createEAttribute(lineStyleSupportEClass, LINE_STYLE_SUPPORT__LINE_STYLE);

		rotationSupportEClass = createEClass(ROTATION_SUPPORT);
		createEAttribute(rotationSupportEClass, ROTATION_SUPPORT__ROTATION);

		flipSupportEClass = createEClass(FLIP_SUPPORT);
		createEAttribute(flipSupportEClass, FLIP_SUPPORT__HFLIP);
		createEAttribute(flipSupportEClass, FLIP_SUPPORT__VFLIP);

		svgImageEClass = createEClass(SVG_IMAGE);
		createEAttribute(svgImageEClass, SVG_IMAGE__SRC);

		skinSupportEClass = createEClass(SKIN_SUPPORT);
		createEAttribute(skinSupportEClass, SKIN_SUPPORT__SKIN);

		shapeEClass = createEClass(SHAPE);
		createEAttribute(shapeEClass, SHAPE__SHAPE_TYPE);

		alertEClass = createEClass(ALERT);

		switchEClass = createEClass(SWITCH);

		// Create enums
		resizeModeEEnum = createEEnum(RESIZE_MODE);
		textAlignmentEEnum = createEEnum(TEXT_ALIGNMENT);
		iconSizeEEnum = createEEnum(ICON_SIZE);
		stateEEnum = createEEnum(STATE);
		positionEEnum = createEEnum(POSITION);
		borderStyleEEnum = createEEnum(BORDER_STYLE);
		buttonStyleEEnum = createEEnum(BUTTON_STYLE);
		chartTypeEEnum = createEEnum(CHART_TYPE);
		themeEEnum = createEEnum(THEME);
		lineStyleEEnum = createEEnum(LINE_STYLE);
		rotation90EEnum = createEEnum(ROTATION90);
		shapeTypeEEnum = createEEnum(SHAPE_TYPE);

		// Create data types
		iconDataTypeEDataType = createEDataType(ICON_DATA_TYPE);
		fontSizeDataTypeEDataType = createEDataType(FONT_SIZE_DATA_TYPE);
		colorDataTypeEDataType = createEDataType(COLOR_DATA_TYPE);
		uriDataTypeEDataType = createEDataType(URI_DATA_TYPE);
		selectionDataTypeEDataType = createEDataType(SELECTION_DATA_TYPE);
		versionDataTypeEDataType = createEDataType(VERSION_DATA_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StoryPackage theStoryPackage = (StoryPackage)EPackage.Registry.INSTANCE.getEPackage(StoryPackage.eNS_URI);
		OverridesPackage theOverridesPackage = (OverridesPackage)EPackage.Registry.INSTANCE.getEPackage(OverridesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStoryPackage);
		getESubpackages().add(theOverridesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		screenEClass.getESuperTypes().add(this.getWidgetContainer());
		buttonEClass.getESuperTypes().add(this.getWidget());
		buttonEClass.getESuperTypes().add(this.getStateSupport());
		buttonEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		buttonEClass.getESuperTypes().add(this.getFontSupport());
		buttonEClass.getESuperTypes().add(this.getIconSupport());
		buttonEClass.getESuperTypes().add(this.getLinkSupport());
		buttonEClass.getESuperTypes().add(this.getTextAlignmentSupport());
		buttonEClass.getESuperTypes().add(this.getSkinSupport());
		checkboxEClass.getESuperTypes().add(this.getWidget());
		checkboxEClass.getESuperTypes().add(this.getBooleanSelectionSupport());
		checkboxEClass.getESuperTypes().add(this.getStateSupport());
		checkboxEClass.getESuperTypes().add(this.getLinkSupport());
		checkboxEClass.getESuperTypes().add(this.getFontSupport());
		checkboxEClass.getESuperTypes().add(this.getSkinSupport());
		comboEClass.getESuperTypes().add(this.getWidget());
		comboEClass.getESuperTypes().add(this.getStateSupport());
		comboEClass.getESuperTypes().add(this.getFontSupport());
		comboEClass.getESuperTypes().add(this.getColorBorderSupport());
		comboEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		comboEClass.getESuperTypes().add(this.getColorAlphaSupport());
		comboEClass.getESuperTypes().add(this.getLinkSupport());
		comboEClass.getESuperTypes().add(this.getSkinSupport());
		labelEClass.getESuperTypes().add(this.getWidget());
		labelEClass.getESuperTypes().add(this.getFontSupport());
		labelEClass.getESuperTypes().add(this.getTextAlignmentSupport());
		labelEClass.getESuperTypes().add(this.getColorForegroundSupport());
		labelEClass.getESuperTypes().add(this.getStateSupport());
		labelEClass.getESuperTypes().add(this.getIconSupport());
		labelEClass.getESuperTypes().add(this.getIconPositionSupport());
		labelEClass.getESuperTypes().add(this.getLinkSupport());
		labelEClass.getESuperTypes().add(this.getRotationSupport());
		linkEClass.getESuperTypes().add(this.getWidget());
		linkEClass.getESuperTypes().add(this.getFontSupport());
		linkEClass.getESuperTypes().add(this.getStateSupport());
		linkEClass.getESuperTypes().add(this.getLinkSupport());
		linkEClass.getESuperTypes().add(this.getSkinSupport());
		placeholderEClass.getESuperTypes().add(this.getWidget());
		placeholderEClass.getESuperTypes().add(this.getLinkSupport());
		placeholderEClass.getESuperTypes().add(this.getSkinSupport());
		radioButtonEClass.getESuperTypes().add(this.getWidget());
		radioButtonEClass.getESuperTypes().add(this.getBooleanSelectionSupport());
		radioButtonEClass.getESuperTypes().add(this.getStateSupport());
		radioButtonEClass.getESuperTypes().add(this.getLinkSupport());
		radioButtonEClass.getESuperTypes().add(this.getFontSupport());
		radioButtonEClass.getESuperTypes().add(this.getSkinSupport());
		textFieldEClass.getESuperTypes().add(this.getWidget());
		textFieldEClass.getESuperTypes().add(this.getStateSupport());
		textFieldEClass.getESuperTypes().add(this.getFontSupport());
		textFieldEClass.getESuperTypes().add(this.getTextAlignmentSupport());
		textFieldEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		textFieldEClass.getESuperTypes().add(this.getColorAlphaSupport());
		textFieldEClass.getESuperTypes().add(this.getColorBorderSupport());
		textFieldEClass.getESuperTypes().add(this.getSkinSupport());
		spinnerEClass.getESuperTypes().add(this.getWidget());
		spinnerEClass.getESuperTypes().add(this.getStateSupport());
		spinnerEClass.getESuperTypes().add(this.getFontSupport());
		spinnerEClass.getESuperTypes().add(this.getColorBorderSupport());
		spinnerEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		spinnerEClass.getESuperTypes().add(this.getColorAlphaSupport());
		spinnerEClass.getESuperTypes().add(this.getSkinSupport());
		windowEClass.getESuperTypes().add(this.getWidget());
		windowEClass.getESuperTypes().add(this.getVerticalScrollbarSupport());
		windowEClass.getESuperTypes().add(this.getSkinSupport());
		browserEClass.getESuperTypes().add(this.getWidget());
		browserEClass.getESuperTypes().add(this.getVerticalScrollbarSupport());
		browserEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		browserEClass.getESuperTypes().add(this.getSkinSupport());
		textEClass.getESuperTypes().add(this.getWidget());
		textEClass.getESuperTypes().add(this.getFontSupport());
		textEClass.getESuperTypes().add(this.getTextAlignmentSupport());
		textEClass.getESuperTypes().add(this.getColorForegroundSupport());
		textEClass.getESuperTypes().add(this.getLinkSupport());
		areaEClass.getESuperTypes().add(this.getWidget());
		panelEClass.getESuperTypes().add(this.getWidget());
		panelEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		panelEClass.getESuperTypes().add(this.getColorAlphaSupport());
		panelEClass.getESuperTypes().add(this.getVerticalScrollbarSupport());
		panelEClass.getESuperTypes().add(this.getColorForegroundSupport());
		panelEClass.getESuperTypes().add(this.getBorderStyleSupport());
		panelEClass.getESuperTypes().add(this.getLinkSupport());
		panelEClass.getESuperTypes().add(this.getSkinSupport());
		groupEClass.getESuperTypes().add(this.getWidget());
		groupEClass.getESuperTypes().add(this.getVerticalScrollbarSupport());
		groupEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		groupEClass.getESuperTypes().add(this.getColorAlphaSupport());
		groupEClass.getESuperTypes().add(this.getFontSupport());
		groupEClass.getESuperTypes().add(this.getSkinSupport());
		listEClass.getESuperTypes().add(this.getWidget());
		listEClass.getESuperTypes().add(this.getSelectionSupport());
		listEClass.getESuperTypes().add(this.getBorderSupport());
		listEClass.getESuperTypes().add(this.getVerticalScrollbarSupport());
		listEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		listEClass.getESuperTypes().add(this.getColorAlphaSupport());
		listEClass.getESuperTypes().add(this.getListSupport());
		listEClass.getESuperTypes().add(this.getFontSupport());
		listEClass.getESuperTypes().add(this.getItemSupport());
		listEClass.getESuperTypes().add(this.getColorAlternativeSupport());
		popupEClass.getESuperTypes().add(this.getWidget());
		popupEClass.getESuperTypes().add(this.getSelectionSupport());
		popupEClass.getESuperTypes().add(this.getItemSupport());
		menuEClass.getESuperTypes().add(this.getWidget());
		menuEClass.getESuperTypes().add(this.getSelectionSupport());
		menuEClass.getESuperTypes().add(this.getIconSupport());
		menuEClass.getESuperTypes().add(this.getItemSupport());
		menuEClass.getESuperTypes().add(this.getSkinSupport());
		tableEClass.getESuperTypes().add(this.getWidget());
		tableEClass.getESuperTypes().add(this.getSelectionSupport());
		tableEClass.getESuperTypes().add(this.getBorderSupport());
		tableEClass.getESuperTypes().add(this.getVerticalScrollbarSupport());
		tableEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		tableEClass.getESuperTypes().add(this.getColorAlphaSupport());
		tableEClass.getESuperTypes().add(this.getListSupport());
		tableEClass.getESuperTypes().add(this.getFontSupport());
		tableEClass.getESuperTypes().add(this.getTextAlignmentSupport());
		tableEClass.getESuperTypes().add(this.getColorAlternativeSupport());
		treeEClass.getESuperTypes().add(this.getWidget());
		treeEClass.getESuperTypes().add(this.getBorderSupport());
		treeEClass.getESuperTypes().add(this.getVerticalScrollbarSupport());
		treeEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		treeEClass.getESuperTypes().add(this.getColorAlphaSupport());
		treeEClass.getESuperTypes().add(this.getSelectionSupport());
		treeEClass.getESuperTypes().add(this.getItemSupport());
		treeEClass.getESuperTypes().add(this.getFontSupport());
		iconEClass.getESuperTypes().add(this.getWidget());
		iconEClass.getESuperTypes().add(this.getColorForegroundSupport());
		iconEClass.getESuperTypes().add(this.getIconSupport());
		iconEClass.getESuperTypes().add(this.getLinkSupport());
		textAreaEClass.getESuperTypes().add(this.getWidget());
		textAreaEClass.getESuperTypes().add(this.getStateSupport());
		textAreaEClass.getESuperTypes().add(this.getVerticalScrollbarSupport());
		textAreaEClass.getESuperTypes().add(this.getFontSupport());
		textAreaEClass.getESuperTypes().add(this.getTextAlignmentSupport());
		textAreaEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		textAreaEClass.getESuperTypes().add(this.getColorAlphaSupport());
		textAreaEClass.getESuperTypes().add(this.getColorBorderSupport());
		textAreaEClass.getESuperTypes().add(this.getSkinSupport());
		hScrollbarEClass.getESuperTypes().add(this.getWidget());
		hScrollbarEClass.getESuperTypes().add(this.getValueSupport());
		hScrollbarEClass.getESuperTypes().add(this.getSkinSupport());
		vScrollbarEClass.getESuperTypes().add(this.getWidget());
		vScrollbarEClass.getESuperTypes().add(this.getValueSupport());
		vScrollbarEClass.getESuperTypes().add(this.getSkinSupport());
		hLineEClass.getESuperTypes().add(this.getWidget());
		hLineEClass.getESuperTypes().add(this.getColorForegroundSupport());
		hLineEClass.getESuperTypes().add(this.getLineStyleSupport());
		hLineEClass.getESuperTypes().add(this.getSkinSupport());
		vLineEClass.getESuperTypes().add(this.getWidget());
		vLineEClass.getESuperTypes().add(this.getColorForegroundSupport());
		vLineEClass.getESuperTypes().add(this.getLineStyleSupport());
		vLineEClass.getESuperTypes().add(this.getSkinSupport());
		hSliderEClass.getESuperTypes().add(this.getWidget());
		hSliderEClass.getESuperTypes().add(this.getValueSupport());
		hSliderEClass.getESuperTypes().add(this.getStateSupport());
		hSliderEClass.getESuperTypes().add(this.getSkinSupport());
		vSliderEClass.getESuperTypes().add(this.getWidget());
		vSliderEClass.getESuperTypes().add(this.getValueSupport());
		vSliderEClass.getESuperTypes().add(this.getStateSupport());
		vSliderEClass.getESuperTypes().add(this.getSkinSupport());
		tabsEClass.getESuperTypes().add(this.getWidget());
		tabsEClass.getESuperTypes().add(this.getSelectionSupport());
		tabsEClass.getESuperTypes().add(this.getItemSupport());
		tabsEClass.getESuperTypes().add(this.getFontSupport());
		tabsEClass.getESuperTypes().add(this.getSkinSupport());
		widgetGroupEClass.getESuperTypes().add(this.getWidget());
		widgetGroupEClass.getESuperTypes().add(this.getWidgetContainer());
		widgetGroupEClass.getESuperTypes().add(this.getLinkSupport());
		widgetGroupEClass.getESuperTypes().add(this.getNameSupport());
		masterEClass.getESuperTypes().add(this.getWidget());
		masterEClass.getESuperTypes().add(this.getLinkSupport());
		imageEClass.getESuperTypes().add(this.getWidget());
		imageEClass.getESuperTypes().add(this.getLinkSupport());
		imageEClass.getESuperTypes().add(this.getRotationSupport());
		imageEClass.getESuperTypes().add(this.getFlipSupport());
		noteEClass.getESuperTypes().add(this.getWidget());
		noteEClass.getESuperTypes().add(this.getFontSupport());
		noteEClass.getESuperTypes().add(this.getTextAlignmentSupport());
		noteEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		noteEClass.getESuperTypes().add(this.getColorAlphaSupport());
		noteEClass.getESuperTypes().add(this.getLinkSupport());
		noteEClass.getESuperTypes().add(this.getSkinSupport());
		progressBarEClass.getESuperTypes().add(this.getWidget());
		progressBarEClass.getESuperTypes().add(this.getValueSupport());
		progressBarEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		progressBarEClass.getESuperTypes().add(this.getSkinSupport());
		calloutEClass.getESuperTypes().add(this.getWidget());
		calloutEClass.getESuperTypes().add(this.getFontSupport());
		calloutEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		calloutEClass.getESuperTypes().add(this.getColorAlphaSupport());
		calloutEClass.getESuperTypes().add(this.getLinkSupport());
		calloutEClass.getESuperTypes().add(this.getSkinSupport());
		searchFieldEClass.getESuperTypes().add(this.getWidget());
		searchFieldEClass.getESuperTypes().add(this.getFontSupport());
		searchFieldEClass.getESuperTypes().add(this.getStateSupport());
		searchFieldEClass.getESuperTypes().add(this.getColorBorderSupport());
		searchFieldEClass.getESuperTypes().add(this.getLinkSupport());
		searchFieldEClass.getESuperTypes().add(this.getSkinSupport());
		tooltipEClass.getESuperTypes().add(this.getWidget());
		tooltipEClass.getESuperTypes().add(this.getFontSupport());
		tooltipEClass.getESuperTypes().add(this.getTextAlignmentSupport());
		tooltipEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		tooltipEClass.getESuperTypes().add(this.getSkinSupport());
		scratchOutEClass.getESuperTypes().add(this.getWidget());
		scratchOutEClass.getESuperTypes().add(this.getColorForegroundSupport());
		scratchOutEClass.getESuperTypes().add(this.getColorAlphaSupport());
		scratchOutEClass.getESuperTypes().add(this.getSkinSupport());
		breadcrumbsEClass.getESuperTypes().add(this.getWidget());
		breadcrumbsEClass.getESuperTypes().add(this.getFontSupport());
		breadcrumbsEClass.getESuperTypes().add(this.getItemSupport());
		breadcrumbsEClass.getESuperTypes().add(this.getSkinSupport());
		linkBarEClass.getESuperTypes().add(this.getWidget());
		linkBarEClass.getESuperTypes().add(this.getFontSupport());
		linkBarEClass.getESuperTypes().add(this.getSelectionSupport());
		linkBarEClass.getESuperTypes().add(this.getItemSupport());
		linkBarEClass.getESuperTypes().add(this.getSkinSupport());
		accordionEClass.getESuperTypes().add(this.getWidget());
		accordionEClass.getESuperTypes().add(this.getSelectionSupport());
		accordionEClass.getESuperTypes().add(this.getVerticalScrollbarSupport());
		accordionEClass.getESuperTypes().add(this.getItemSupport());
		verticalScrollbarSupportEClass.getESuperTypes().add(this.getValueSupport());
		dateFieldEClass.getESuperTypes().add(this.getWidget());
		dateFieldEClass.getESuperTypes().add(this.getStateSupport());
		dateFieldEClass.getESuperTypes().add(this.getColorBorderSupport());
		dateFieldEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		dateFieldEClass.getESuperTypes().add(this.getColorAlphaSupport());
		dateFieldEClass.getESuperTypes().add(this.getSkinSupport());
		videoPlayerEClass.getESuperTypes().add(this.getWidget());
		videoPlayerEClass.getESuperTypes().add(this.getSkinSupport());
		mapEClass.getESuperTypes().add(this.getWidget());
		mapEClass.getESuperTypes().add(this.getSkinSupport());
		coverFlowEClass.getESuperTypes().add(this.getWidget());
		coverFlowEClass.getESuperTypes().add(this.getSkinSupport());
		tabbedPaneEClass.getESuperTypes().add(this.getWidget());
		tabbedPaneEClass.getESuperTypes().add(this.getSelectionSupport());
		tabbedPaneEClass.getESuperTypes().add(this.getVerticalScrollbarSupport());
		tabbedPaneEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		tabbedPaneEClass.getESuperTypes().add(this.getColorAlphaSupport());
		tabbedPaneEClass.getESuperTypes().add(this.getItemSupport());
		tabbedPaneEClass.getESuperTypes().add(this.getFontSupport());
		tabbedPaneEClass.getESuperTypes().add(this.getSkinSupport());
		hSplitterEClass.getESuperTypes().add(this.getWidget());
		hSplitterEClass.getESuperTypes().add(this.getSkinSupport());
		vSplitterEClass.getESuperTypes().add(this.getWidget());
		vSplitterEClass.getESuperTypes().add(this.getSkinSupport());
		colorPickerEClass.getESuperTypes().add(this.getWidget());
		colorPickerEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		colorPickerEClass.getESuperTypes().add(this.getSkinSupport());
		arrowEClass.getESuperTypes().add(this.getWidget());
		arrowEClass.getESuperTypes().add(this.getColorForegroundSupport());
		arrowEClass.getESuperTypes().add(this.getLineStyleSupport());
		curlyBraceEClass.getESuperTypes().add(this.getWidget());
		curlyBraceEClass.getESuperTypes().add(this.getFontSupport());
		curlyBraceEClass.getESuperTypes().add(this.getColorForegroundSupport());
		curlyBraceEClass.getESuperTypes().add(this.getSkinSupport());
		buttonBarEClass.getESuperTypes().add(this.getWidget());
		buttonBarEClass.getESuperTypes().add(this.getSelectionSupport());
		buttonBarEClass.getESuperTypes().add(this.getFontSupport());
		buttonBarEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		buttonBarEClass.getESuperTypes().add(this.getItemSupport());
		buttonBarEClass.getESuperTypes().add(this.getSkinSupport());
		circleEClass.getESuperTypes().add(this.getWidget());
		circleEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		circleEClass.getESuperTypes().add(this.getColorAlphaSupport());
		circleEClass.getESuperTypes().add(this.getColorForegroundSupport());
		circleEClass.getESuperTypes().add(this.getBorderSupport());
		circleEClass.getESuperTypes().add(this.getIconSupport());
		circleEClass.getESuperTypes().add(this.getIconPositionSupport());
		circleEClass.getESuperTypes().add(this.getFontSupport());
		circleEClass.getESuperTypes().add(this.getLinkSupport());
		circleEClass.getESuperTypes().add(this.getTextAlignmentSupport());
		circleEClass.getESuperTypes().add(this.getLineStyleSupport());
		rectangleEClass.getESuperTypes().add(this.getWidget());
		rectangleEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		rectangleEClass.getESuperTypes().add(this.getColorAlphaSupport());
		rectangleEClass.getESuperTypes().add(this.getColorForegroundSupport());
		rectangleEClass.getESuperTypes().add(this.getBorderStyleSupport());
		rectangleEClass.getESuperTypes().add(this.getIconSupport());
		rectangleEClass.getESuperTypes().add(this.getIconPositionSupport());
		rectangleEClass.getESuperTypes().add(this.getFontSupport());
		rectangleEClass.getESuperTypes().add(this.getLinkSupport());
		rectangleEClass.getESuperTypes().add(this.getTextAlignmentSupport());
		iconPositionSupportEClass.getESuperTypes().add(this.getIconSupport());
		chartEClass.getESuperTypes().add(this.getWidget());
		chartEClass.getESuperTypes().add(this.getSkinSupport());
		crossOutEClass.getESuperTypes().add(this.getWidget());
		crossOutEClass.getESuperTypes().add(this.getColorForegroundSupport());
		crossOutEClass.getESuperTypes().add(this.getColorAlphaSupport());
		crossOutEClass.getESuperTypes().add(this.getSkinSupport());
		itemEClass.getESuperTypes().add(this.getLinkSupport());
		hotspotEClass.getESuperTypes().add(this.getWidget());
		hotspotEClass.getESuperTypes().add(this.getLinkSupport());
		svgImageEClass.getESuperTypes().add(this.getWidget());
		svgImageEClass.getESuperTypes().add(this.getLinkSupport());
		svgImageEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		svgImageEClass.getESuperTypes().add(this.getColorForegroundSupport());
		svgImageEClass.getESuperTypes().add(this.getColorAlphaSupport());
		svgImageEClass.getESuperTypes().add(this.getRotationSupport());
		svgImageEClass.getESuperTypes().add(this.getFlipSupport());
		shapeEClass.getESuperTypes().add(this.getWidget());
		shapeEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		shapeEClass.getESuperTypes().add(this.getColorAlphaSupport());
		shapeEClass.getESuperTypes().add(this.getColorForegroundSupport());
		shapeEClass.getESuperTypes().add(this.getBorderSupport());
		shapeEClass.getESuperTypes().add(this.getIconSupport());
		shapeEClass.getESuperTypes().add(this.getIconPositionSupport());
		shapeEClass.getESuperTypes().add(this.getFontSupport());
		shapeEClass.getESuperTypes().add(this.getLinkSupport());
		shapeEClass.getESuperTypes().add(this.getTextAlignmentSupport());
		shapeEClass.getESuperTypes().add(this.getLineStyleSupport());
		shapeEClass.getESuperTypes().add(this.getSkinSupport());
		shapeEClass.getESuperTypes().add(this.getRotationSupport());
		alertEClass.getESuperTypes().add(this.getWidget());
		alertEClass.getESuperTypes().add(this.getIconSupport());
		alertEClass.getESuperTypes().add(this.getItemSupport());
		alertEClass.getESuperTypes().add(this.getSkinSupport());
		switchEClass.getESuperTypes().add(this.getWidget());
		switchEClass.getESuperTypes().add(this.getBooleanSelectionSupport());
		switchEClass.getESuperTypes().add(this.getColorBackgroundSupport());
		switchEClass.getESuperTypes().add(this.getFontSupport());
		switchEClass.getESuperTypes().add(this.getLinkSupport());
		switchEClass.getESuperTypes().add(this.getStateSupport());
		switchEClass.getESuperTypes().add(this.getSkinSupport());

		// Initialize classes and features; add operations and parameters
		initEClass(screenEClass, Screen.class, "Screen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScreen_HRuler(), this.getScreenRuler(), null, "hRuler", null, 1, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScreen_VRuler(), this.getScreenRuler(), null, "vRuler", null, 1, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreen_Name(), ecorePackage.getEString(), "name", null, 0, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScreen_Font(), this.getScreenFont(), null, "font", null, 0, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreen_Theme(), this.getTheme(), "theme", null, 0, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreen_MinVersion(), this.getVersionDataType(), "minVersion", null, 0, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(screenRulerEClass, ScreenRuler.class, "ScreenRuler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScreenRuler_Guides(), this.getRulerGuide(), null, "guides", null, 0, -1, ScreenRuler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rulerGuideEClass, RulerGuide.class, "RulerGuide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRulerGuide_Position(), ecorePackage.getEInt(), "position", null, 0, 1, RulerGuide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetEClass, Widget.class, "Widget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidget_Id(), ecorePackage.getELongObject(), "id", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Container(), this.getWidgetContainer(), this.getWidgetContainer_Widgets(), "container", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_X(), ecorePackage.getEInt(), "x", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Y(), ecorePackage.getEInt(), "y", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Width(), ecorePackage.getEInt(), "width", "-1", 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Height(), ecorePackage.getEInt(), "height", "-1", 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Text(), ecorePackage.getEString(), "text", "", 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Descriptor(), this.getWidgetDescriptor(), null, "descriptor", null, 0, 1, Widget.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Locked(), ecorePackage.getEBoolean(), "locked", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_MeasuredWidth(), ecorePackage.getEInt(), "measuredWidth", "-1", 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_MeasuredHeight(), ecorePackage.getEInt(), "measuredHeight", "-1", 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_CustomId(), ecorePackage.getEString(), "customId", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_CustomData(), ecorePackage.getEString(), "customData", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Annotation(), ecorePackage.getEBoolean(), "annotation", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButton_Style(), this.getButtonStyle(), "style", "square", 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkboxEClass, Checkbox.class, "Checkbox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(comboEClass, Combo.class, "Combo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(placeholderEClass, Placeholder.class, "Placeholder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(radioButtonEClass, RadioButton.class, "RadioButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textFieldEClass, TextField.class, "TextField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spinnerEClass, Spinner.class, "Spinner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(windowEClass, Window.class, "Window", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWindow_CloseButton(), ecorePackage.getEBoolean(), "closeButton", "true", 0, 1, Window.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindow_MinimizeButton(), ecorePackage.getEBoolean(), "minimizeButton", "false", 0, 1, Window.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindow_MaximizeButton(), ecorePackage.getEBoolean(), "maximizeButton", "false", 0, 1, Window.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(browserEClass, Browser.class, "Browser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_DummyText(), ecorePackage.getEBoolean(), "dummyText", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(areaEClass, Area.class, "Area", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(panelEClass, Panel.class, "Panel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getList_Header(), ecorePackage.getEBoolean(), "header", "false", 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(popupEClass, Popup.class, "Popup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(menuEClass, Menu.class, "Menu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTable_VerticalLines(), ecorePackage.getEBoolean(), "verticalLines", "true", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Header(), ecorePackage.getEBoolean(), "header", "true", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeEClass, Tree.class, "Tree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iconEClass, Icon.class, "Icon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textAreaEClass, TextArea.class, "TextArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hScrollbarEClass, HScrollbar.class, "HScrollbar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vScrollbarEClass, VScrollbar.class, "VScrollbar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hLineEClass, HLine.class, "HLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vLineEClass, VLine.class, "VLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hSliderEClass, HSlider.class, "HSlider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vSliderEClass, VSlider.class, "VSlider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tabsEClass, Tabs.class, "Tabs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(widgetDescriptorEClass, WidgetDescriptor.class, "WidgetDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetDescriptor_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, WidgetDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetDescriptor_ResizeMode(), this.getResizeMode(), "resizeMode", null, 0, 1, WidgetDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetDescriptor_TextEditable(), ecorePackage.getEBoolean(), "textEditable", null, 0, 1, WidgetDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetDescriptor_TextWrappable(), ecorePackage.getEBoolean(), "textWrappable", null, 0, 1, WidgetDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetDescriptor_TextLines(), ecorePackage.getEInt(), "textLines", "1", 0, 1, WidgetDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetDescriptor_TextCentered(), ecorePackage.getEBoolean(), "textCentered", null, 0, 1, WidgetDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fontEClass, Font.class, "Font", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFont_Size(), this.getFontSizeDataType(), "size", null, 1, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFont_Bold(), ecorePackage.getEBooleanObject(), "bold", null, 1, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFont_Italic(), ecorePackage.getEBooleanObject(), "italic", null, 1, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFont_Underline(), ecorePackage.getEBooleanObject(), "underline", null, 1, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetContainerEClass, WidgetContainer.class, "WidgetContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWidgetContainer_Widgets(), this.getWidget(), this.getWidget_Container(), "widgets", null, 0, -1, WidgetContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetGroupEClass, WidgetGroup.class, "WidgetGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(masterEClass, Master.class, "Master", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaster_Screen(), this.getWidgetContainer(), null, "screen", null, 0, 1, Master.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaster_Dimmed(), ecorePackage.getEBoolean(), "dimmed", null, 0, 1, Master.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMaster_Overrides(), theOverridesPackage.getOverrides(), null, "overrides", null, 0, 1, Master.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMaster_Instance(), this.getWidgetContainer(), null, "instance", null, 0, 1, Master.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Src(), this.getURIDataType(), "src", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Grayscale(), ecorePackage.getEBoolean(), "grayscale", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(screenFontEClass, ScreenFont.class, "ScreenFont", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScreenFont_Name(), ecorePackage.getEString(), "name", null, 0, 1, ScreenFont.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreenFont_Size(), this.getFontSizeDataType(), "size", null, 1, 1, ScreenFont.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreenFont_Bold(), ecorePackage.getEBoolean(), "bold", null, 1, 1, ScreenFont.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreenFont_Italic(), ecorePackage.getEBoolean(), "italic", null, 1, 1, ScreenFont.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fontSupportEClass, FontSupport.class, "FontSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFontSupport_Font(), this.getFont(), null, "font", null, 1, 1, FontSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorForegroundSupportEClass, ColorForegroundSupport.class, "ColorForegroundSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorForegroundSupport_Foreground(), this.getColorDataType(), "foreground", "black", 0, 1, ColorForegroundSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorBackgroundSupportEClass, ColorBackgroundSupport.class, "ColorBackgroundSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorBackgroundSupport_Background(), this.getColorDataType(), "background", "white", 0, 1, ColorBackgroundSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorBorderSupportEClass, ColorBorderSupport.class, "ColorBorderSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorBorderSupport_BorderColor(), this.getColorDataType(), "borderColor", "black", 0, 1, ColorBorderSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorAlphaSupportEClass, ColorAlphaSupport.class, "ColorAlphaSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorAlphaSupport_Alpha(), ecorePackage.getEInt(), "alpha", "255", 0, 1, ColorAlphaSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionSupportEClass, SelectionSupport.class, "SelectionSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectionSupport_Selection(), this.getSelectionDataType(), "selection", "-1", 0, 1, SelectionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textAlignmentSupportEClass, TextAlignmentSupport.class, "TextAlignmentSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextAlignmentSupport_TextAlignment(), this.getTextAlignment(), "textAlignment", null, 0, 1, TextAlignmentSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanSelectionSupportEClass, BooleanSelectionSupport.class, "BooleanSelectionSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanSelectionSupport_Selected(), ecorePackage.getEBoolean(), "selected", null, 0, 1, BooleanSelectionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(progressBarEClass, ProgressBar.class, "ProgressBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calloutEClass, Callout.class, "Callout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(searchFieldEClass, SearchField.class, "SearchField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tooltipEClass, Tooltip.class, "Tooltip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTooltip_Position(), this.getPosition(), "position", "bottomLeft", 1, 1, Tooltip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scratchOutEClass, ScratchOut.class, "ScratchOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(borderSupportEClass, BorderSupport.class, "BorderSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBorderSupport_Border(), ecorePackage.getEBoolean(), "border", "true", 0, 1, BorderSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateSupportEClass, StateSupport.class, "StateSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateSupport_State(), this.getState(), "state", null, 0, 1, StateSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(stateSupportEClass, ecorePackage.getEBoolean(), "isValidState", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getState(), "state", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(breadcrumbsEClass, Breadcrumbs.class, "Breadcrumbs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkBarEClass, LinkBar.class, "LinkBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accordionEClass, Accordion.class, "Accordion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(verticalScrollbarSupportEClass, VerticalScrollbarSupport.class, "VerticalScrollbarSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerticalScrollbarSupport_VerticalScrollbar(), ecorePackage.getEBoolean(), "verticalScrollbar", "false", 0, 1, VerticalScrollbarSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateFieldEClass, DateField.class, "DateField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoPlayerEClass, VideoPlayer.class, "VideoPlayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mapEClass, Map.class, "Map", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coverFlowEClass, CoverFlow.class, "CoverFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tabbedPaneEClass, TabbedPane.class, "TabbedPane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTabbedPane_Position(), this.getPosition(), "position", "top", 0, 1, TabbedPane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iconSupportEClass, IconSupport.class, "IconSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIconSupport_Icon(), this.getIconDataType(), "icon", "", 0, 1, IconSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIconSupport_IconRotation(), this.getRotation90(), "iconRotation", null, 0, 1, IconSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hSplitterEClass, HSplitter.class, "HSplitter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vSplitterEClass, VSplitter.class, "VSplitter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueSupportEClass, ValueSupport.class, "ValueSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueSupport_Value(), ecorePackage.getEInt(), "value", "0", 0, 1, ValueSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorPickerEClass, ColorPicker.class, "ColorPicker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrowEClass, Arrow.class, "Arrow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrow_Left(), ecorePackage.getEBoolean(), "left", "true", 0, 1, Arrow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArrow_Right(), ecorePackage.getEBoolean(), "right", "false", 0, 1, Arrow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArrow_Direction(), this.getPosition(), "direction", null, 0, 1, Arrow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(curlyBraceEClass, CurlyBrace.class, "CurlyBrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurlyBrace_Position(), this.getPosition(), "position", "left", 1, 1, CurlyBrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonBarEClass, ButtonBar.class, "ButtonBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(borderStyleSupportEClass, BorderStyleSupport.class, "BorderStyleSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBorderStyleSupport_Border(), this.getBorderStyle(), "border", "solid", 0, 1, BorderStyleSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(circleEClass, Circle.class, "Circle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rectangleEClass, Rectangle.class, "Rectangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iconPositionSupportEClass, IconPositionSupport.class, "IconPositionSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIconPositionSupport_IconPosition(), this.getPosition(), "iconPosition", "left", 0, 1, IconPositionSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listSupportEClass, ListSupport.class, "ListSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListSupport_RowHeight(), ecorePackage.getEInt(), "rowHeight", null, 0, 1, ListSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListSupport_HorizontalLines(), ecorePackage.getEBoolean(), "horizontalLines", "false", 0, 1, ListSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chartEClass, Chart.class, "Chart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChart_ChartType(), this.getChartType(), "chartType", null, 0, 1, Chart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crossOutEClass, CrossOut.class, "CrossOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_X(), ecorePackage.getEInt(), "x", "-1", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Y(), ecorePackage.getEInt(), "y", "-1", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Width(), ecorePackage.getEInt(), "width", "-1", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Height(), ecorePackage.getEInt(), "height", "-1", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Text(), ecorePackage.getEString(), "text", "", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemSupportEClass, ItemSupport.class, "ItemSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemSupport_Items(), this.getItem(), null, "items", null, 0, -1, ItemSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkSupportEClass, LinkSupport.class, "LinkSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkSupport_Link(), this.getURIDataType(), "link", null, 0, 1, LinkSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hotspotEClass, Hotspot.class, "Hotspot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nameSupportEClass, NameSupport.class, "NameSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameSupport_Name(), ecorePackage.getEString(), "name", null, 0, 1, NameSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorAlternativeSupportEClass, ColorAlternativeSupport.class, "ColorAlternativeSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorAlternativeSupport_Alternative(), this.getColorDataType(), "alternative", "white", 0, 1, ColorAlternativeSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineStyleSupportEClass, LineStyleSupport.class, "LineStyleSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineStyleSupport_LineStyle(), this.getLineStyle(), "lineStyle", "solid", 0, 1, LineStyleSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotationSupportEClass, RotationSupport.class, "RotationSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotationSupport_Rotation(), this.getRotation90(), "rotation", null, 0, 1, RotationSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flipSupportEClass, FlipSupport.class, "FlipSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlipSupport_HFlip(), ecorePackage.getEBoolean(), "hFlip", null, 0, 1, FlipSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlipSupport_VFlip(), ecorePackage.getEBoolean(), "vFlip", null, 0, 1, FlipSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgImageEClass, SVGImage.class, "SVGImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSVGImage_Src(), this.getURIDataType(), "src", null, 0, 1, SVGImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skinSupportEClass, SkinSupport.class, "SkinSupport", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkinSupport_Skin(), this.getURIDataType(), "skin", null, 0, 1, SkinSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeEClass, Shape.class, "Shape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShape_ShapeType(), this.getShapeType(), "shapeType", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(shapeEClass, ecorePackage.getEBoolean(), "isRotatable", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(alertEClass, Alert.class, "Alert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(resizeModeEEnum, ResizeMode.class, "ResizeMode");
		addEEnumLiteral(resizeModeEEnum, ResizeMode.BOTH_LITERAL);
		addEEnumLiteral(resizeModeEEnum, ResizeMode.HORIZONTAL_LITERAL);
		addEEnumLiteral(resizeModeEEnum, ResizeMode.VERTICAL_LITERAL);
		addEEnumLiteral(resizeModeEEnum, ResizeMode.NONE_LITERAL);

		initEEnum(textAlignmentEEnum, TextAlignment.class, "TextAlignment");
		addEEnumLiteral(textAlignmentEEnum, TextAlignment.LEFT_LITERAL);
		addEEnumLiteral(textAlignmentEEnum, TextAlignment.CENTER_LITERAL);
		addEEnumLiteral(textAlignmentEEnum, TextAlignment.RIGHT_LITERAL);

		initEEnum(iconSizeEEnum, IconSize.class, "IconSize");
		addEEnumLiteral(iconSizeEEnum, IconSize.SMALL_LITERAL);
		addEEnumLiteral(iconSizeEEnum, IconSize.MEDIUM_LITERAL);
		addEEnumLiteral(iconSizeEEnum, IconSize.LARGE_LITERAL);
		addEEnumLiteral(iconSizeEEnum, IconSize.XLARGE_LITERAL);
		addEEnumLiteral(iconSizeEEnum, IconSize.CUSTOM_LITERAL);

		initEEnum(stateEEnum, State.class, "State");
		addEEnumLiteral(stateEEnum, State.NORMAL);
		addEEnumLiteral(stateEEnum, State.DISABLED);
		addEEnumLiteral(stateEEnum, State.SELECTED);
		addEEnumLiteral(stateEEnum, State.FOCUSED);

		initEEnum(positionEEnum, Position.class, "Position");
		addEEnumLiteral(positionEEnum, Position.TOP);
		addEEnumLiteral(positionEEnum, Position.BOTTOM);
		addEEnumLiteral(positionEEnum, Position.LEFT);
		addEEnumLiteral(positionEEnum, Position.RIGHT);
		addEEnumLiteral(positionEEnum, Position.TOP_LEFT);
		addEEnumLiteral(positionEEnum, Position.TOP_RIGHT);
		addEEnumLiteral(positionEEnum, Position.BOTTOM_LEFT);
		addEEnumLiteral(positionEEnum, Position.BOTTOM_RIGHT);

		initEEnum(borderStyleEEnum, BorderStyle.class, "BorderStyle");
		addEEnumLiteral(borderStyleEEnum, BorderStyle.NONE);
		addEEnumLiteral(borderStyleEEnum, BorderStyle.SOLID);
		addEEnumLiteral(borderStyleEEnum, BorderStyle.SOLID_ROUNDED);
		addEEnumLiteral(borderStyleEEnum, BorderStyle.DASHED_ROUNDED);

		initEEnum(buttonStyleEEnum, ButtonStyle.class, "ButtonStyle");
		addEEnumLiteral(buttonStyleEEnum, ButtonStyle.POINT_LEFT);
		addEEnumLiteral(buttonStyleEEnum, ButtonStyle.SQUARE);
		addEEnumLiteral(buttonStyleEEnum, ButtonStyle.ROUND);
		addEEnumLiteral(buttonStyleEEnum, ButtonStyle.POINT_RIGHT);

		initEEnum(chartTypeEEnum, ChartType.class, "ChartType");
		addEEnumLiteral(chartTypeEEnum, ChartType.PIE);
		addEEnumLiteral(chartTypeEEnum, ChartType.LINE);
		addEEnumLiteral(chartTypeEEnum, ChartType.BAR);
		addEEnumLiteral(chartTypeEEnum, ChartType.COLUMN);

		initEEnum(themeEEnum, Theme.class, "Theme");
		addEEnumLiteral(themeEEnum, Theme.DEFAULT);
		addEEnumLiteral(themeEEnum, Theme.CLEAN);
		addEEnumLiteral(themeEEnum, Theme.SKETCH);

		initEEnum(lineStyleEEnum, LineStyle.class, "LineStyle");
		addEEnumLiteral(lineStyleEEnum, LineStyle.SOLID);
		addEEnumLiteral(lineStyleEEnum, LineStyle.DOTTED);
		addEEnumLiteral(lineStyleEEnum, LineStyle.DASHED);

		initEEnum(rotation90EEnum, Rotation90.class, "Rotation90");
		addEEnumLiteral(rotation90EEnum, Rotation90._0);
		addEEnumLiteral(rotation90EEnum, Rotation90._90);
		addEEnumLiteral(rotation90EEnum, Rotation90._180);
		addEEnumLiteral(rotation90EEnum, Rotation90._270);

		initEEnum(shapeTypeEEnum, ShapeType.class, "ShapeType");
		addEEnumLiteral(shapeTypeEEnum, ShapeType.ELLIPSE);
		addEEnumLiteral(shapeTypeEEnum, ShapeType.RECTANGLE);
		addEEnumLiteral(shapeTypeEEnum, ShapeType.ROUNDED_RECTANGLE);
		addEEnumLiteral(shapeTypeEEnum, ShapeType.ROUND_RECTANGLE);
		addEEnumLiteral(shapeTypeEEnum, ShapeType.DIAMOND);
		addEEnumLiteral(shapeTypeEEnum, ShapeType.STAR);
		addEEnumLiteral(shapeTypeEEnum, ShapeType.PARALLELOGRAM);
		addEEnumLiteral(shapeTypeEEnum, ShapeType.TRIANGLE);
		addEEnumLiteral(shapeTypeEEnum, ShapeType.RIGHT_TRIANGLE);

		// Initialize data types
		initEDataType(iconDataTypeEDataType, IconDesc.class, "IconDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fontSizeDataTypeEDataType, FontSize.class, "FontSizeDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(colorDataTypeEDataType, ColorDesc.class, "ColorDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriDataTypeEDataType, URI.class, "URIDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(selectionDataTypeEDataType, int.class, "SelectionDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionDataTypeEDataType, VersionDesc.class, "VersionDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
