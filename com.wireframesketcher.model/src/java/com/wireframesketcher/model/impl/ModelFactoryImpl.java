/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import com.wireframesketcher.model.*;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://wireframesketcher.com/1.0/model.ecore"); 
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.SCREEN: return createScreen();
			case ModelPackage.SCREEN_RULER: return createScreenRuler();
			case ModelPackage.RULER_GUIDE: return createRulerGuide();
			case ModelPackage.BUTTON: return createButton();
			case ModelPackage.CHECKBOX: return createCheckbox();
			case ModelPackage.COMBO: return createCombo();
			case ModelPackage.LABEL: return createLabel();
			case ModelPackage.LINK: return createLink();
			case ModelPackage.PLACEHOLDER: return createPlaceholder();
			case ModelPackage.RADIO_BUTTON: return createRadioButton();
			case ModelPackage.TEXT_FIELD: return createTextField();
			case ModelPackage.SPINNER: return createSpinner();
			case ModelPackage.WINDOW: return createWindow();
			case ModelPackage.BROWSER: return createBrowser();
			case ModelPackage.TEXT: return createText();
			case ModelPackage.AREA: return createArea();
			case ModelPackage.PANEL: return createPanel();
			case ModelPackage.GROUP: return createGroup();
			case ModelPackage.LIST: return createList();
			case ModelPackage.POPUP: return createPopup();
			case ModelPackage.MENU: return createMenu();
			case ModelPackage.TABLE: return createTable();
			case ModelPackage.TREE: return createTree();
			case ModelPackage.ICON: return createIcon();
			case ModelPackage.TEXT_AREA: return createTextArea();
			case ModelPackage.HSCROLLBAR: return createHScrollbar();
			case ModelPackage.VSCROLLBAR: return createVScrollbar();
			case ModelPackage.HLINE: return createHLine();
			case ModelPackage.VLINE: return createVLine();
			case ModelPackage.HSLIDER: return createHSlider();
			case ModelPackage.VSLIDER: return createVSlider();
			case ModelPackage.TABS: return createTabs();
			case ModelPackage.WIDGET_DESCRIPTOR: return createWidgetDescriptor();
			case ModelPackage.FONT: return createFont();
			case ModelPackage.WIDGET_GROUP: return createWidgetGroup();
			case ModelPackage.MASTER: return createMaster();
			case ModelPackage.IMAGE: return createImage();
			case ModelPackage.SCREEN_FONT: return createScreenFont();
			case ModelPackage.NOTE: return createNote();
			case ModelPackage.PROGRESS_BAR: return createProgressBar();
			case ModelPackage.CALLOUT: return createCallout();
			case ModelPackage.SEARCH_FIELD: return createSearchField();
			case ModelPackage.TOOLTIP: return createTooltip();
			case ModelPackage.SCRATCH_OUT: return createScratchOut();
			case ModelPackage.BREADCRUMBS: return createBreadcrumbs();
			case ModelPackage.LINK_BAR: return createLinkBar();
			case ModelPackage.ACCORDION: return createAccordion();
			case ModelPackage.DATE_FIELD: return createDateField();
			case ModelPackage.VIDEO_PLAYER: return createVideoPlayer();
			case ModelPackage.MAP: return createMap();
			case ModelPackage.COVER_FLOW: return createCoverFlow();
			case ModelPackage.TABBED_PANE: return createTabbedPane();
			case ModelPackage.HSPLITTER: return createHSplitter();
			case ModelPackage.VSPLITTER: return createVSplitter();
			case ModelPackage.COLOR_PICKER: return createColorPicker();
			case ModelPackage.ARROW: return createArrow();
			case ModelPackage.CURLY_BRACE: return createCurlyBrace();
			case ModelPackage.BUTTON_BAR: return createButtonBar();
			case ModelPackage.CIRCLE: return createCircle();
			case ModelPackage.RECTANGLE: return createRectangle();
			case ModelPackage.CHART: return createChart();
			case ModelPackage.CROSS_OUT: return createCrossOut();
			case ModelPackage.ITEM: return createItem();
			case ModelPackage.HOTSPOT: return createHotspot();
			case ModelPackage.SVG_IMAGE: return createSVGImage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.RESIZE_MODE:
				return createResizeModeFromString(eDataType, initialValue);
			case ModelPackage.TEXT_ALIGNMENT:
				return createTextAlignmentFromString(eDataType, initialValue);
			case ModelPackage.ICON_SIZE:
				return createIconSizeFromString(eDataType, initialValue);
			case ModelPackage.STATE:
				return createStateFromString(eDataType, initialValue);
			case ModelPackage.POSITION:
				return createPositionFromString(eDataType, initialValue);
			case ModelPackage.BORDER_STYLE:
				return createBorderStyleFromString(eDataType, initialValue);
			case ModelPackage.BUTTON_STYLE:
				return createButtonStyleFromString(eDataType, initialValue);
			case ModelPackage.CHART_TYPE:
				return createChartTypeFromString(eDataType, initialValue);
			case ModelPackage.THEME:
				return createThemeFromString(eDataType, initialValue);
			case ModelPackage.LINE_STYLE:
				return createLineStyleFromString(eDataType, initialValue);
			case ModelPackage.ROTATION90:
				return createRotation90FromString(eDataType, initialValue);
			case ModelPackage.ICON_DATA_TYPE:
				return createIconDataTypeFromString(eDataType, initialValue);
			case ModelPackage.FONT_SIZE_DATA_TYPE:
				return createFontSizeDataTypeFromString(eDataType, initialValue);
			case ModelPackage.COLOR_DATA_TYPE:
				return createColorDataTypeFromString(eDataType, initialValue);
			case ModelPackage.URI_DATA_TYPE:
				return createURIDataTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.RESIZE_MODE:
				return convertResizeModeToString(eDataType, instanceValue);
			case ModelPackage.TEXT_ALIGNMENT:
				return convertTextAlignmentToString(eDataType, instanceValue);
			case ModelPackage.ICON_SIZE:
				return convertIconSizeToString(eDataType, instanceValue);
			case ModelPackage.STATE:
				return convertStateToString(eDataType, instanceValue);
			case ModelPackage.POSITION:
				return convertPositionToString(eDataType, instanceValue);
			case ModelPackage.BORDER_STYLE:
				return convertBorderStyleToString(eDataType, instanceValue);
			case ModelPackage.BUTTON_STYLE:
				return convertButtonStyleToString(eDataType, instanceValue);
			case ModelPackage.CHART_TYPE:
				return convertChartTypeToString(eDataType, instanceValue);
			case ModelPackage.THEME:
				return convertThemeToString(eDataType, instanceValue);
			case ModelPackage.LINE_STYLE:
				return convertLineStyleToString(eDataType, instanceValue);
			case ModelPackage.ROTATION90:
				return convertRotation90ToString(eDataType, instanceValue);
			case ModelPackage.ICON_DATA_TYPE:
				return convertIconDataTypeToString(eDataType, instanceValue);
			case ModelPackage.FONT_SIZE_DATA_TYPE:
				return convertFontSizeDataTypeToString(eDataType, instanceValue);
			case ModelPackage.COLOR_DATA_TYPE:
				return convertColorDataTypeToString(eDataType, instanceValue);
			case ModelPackage.URI_DATA_TYPE:
				return convertURIDataTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}
	
	/**
	 * Custom screen creation method. Ensures that required child references are created.
	 */
	public Screen createScreen() {
		Screen screen = createScreenGen();
		screen.setFont(createScreenFont());
		screen.setHRuler(createScreenRuler());
		screen.setVRuler(createScreenRuler());
		return screen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screen createScreenGen() {
		ScreenImpl screen = new ScreenImpl();
		return screen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenRuler createScreenRuler() {
		ScreenRulerImpl screenRuler = new ScreenRulerImpl();
		return screenRuler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulerGuide createRulerGuide() {
		RulerGuideImpl rulerGuide = new RulerGuideImpl();
		return rulerGuide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Checkbox createCheckbox() {
		CheckboxImpl checkbox = new CheckboxImpl();
		return checkbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Combo createCombo() {
		ComboImpl combo = new ComboImpl();
		return combo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Placeholder createPlaceholder() {
		PlaceholderImpl placeholder = new PlaceholderImpl();
		return placeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioButton createRadioButton() {
		RadioButtonImpl radioButton = new RadioButtonImpl();
		return radioButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextField createTextField() {
		TextFieldImpl textField = new TextFieldImpl();
		return textField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Window createWindow() {
		WindowImpl window = new WindowImpl();
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetDescriptor createWidgetDescriptor() {
		WidgetDescriptorImpl widgetDescriptor = new WidgetDescriptorImpl();
		return widgetDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Area createArea() {
		AreaImpl area = new AreaImpl();
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Popup createPopup() {
		PopupImpl popup = new PopupImpl();
		return popup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu createMenu() {
		MenuImpl menu = new MenuImpl();
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tree createTree() {
		TreeImpl tree = new TreeImpl();
		return tree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Icon createIcon() {
		IconImpl icon = new IconImpl();
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextArea createTextArea() {
		TextAreaImpl textArea = new TextAreaImpl();
		return textArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Browser createBrowser() {
		BrowserImpl browser = new BrowserImpl();
		return browser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font createFont() {
		FontImpl font = new FontImpl();
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetGroup createWidgetGroup() {
		WidgetGroupImpl widgetGroup = new WidgetGroupImpl();
		return widgetGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Master createMaster() {
		MasterImpl master = new MasterImpl();
		return master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenFont createScreenFont() {
		ScreenFontImpl screenFont = new ScreenFontImpl();
		return screenFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressBar createProgressBar() {
		ProgressBarImpl progressBar = new ProgressBarImpl();
		return progressBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Callout createCallout() {
		CalloutImpl callout = new CalloutImpl();
		return callout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchField createSearchField() {
		SearchFieldImpl searchField = new SearchFieldImpl();
		return searchField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tooltip createTooltip() {
		TooltipImpl tooltip = new TooltipImpl();
		return tooltip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScratchOut createScratchOut() {
		ScratchOutImpl scratchOut = new ScratchOutImpl();
		return scratchOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Breadcrumbs createBreadcrumbs() {
		BreadcrumbsImpl breadcrumbs = new BreadcrumbsImpl();
		return breadcrumbs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkBar createLinkBar() {
		LinkBarImpl linkBar = new LinkBarImpl();
		return linkBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accordion createAccordion() {
		AccordionImpl accordion = new AccordionImpl();
		return accordion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateField createDateField() {
		DateFieldImpl dateField = new DateFieldImpl();
		return dateField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoPlayer createVideoPlayer() {
		VideoPlayerImpl videoPlayer = new VideoPlayerImpl();
		return videoPlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map createMap() {
		MapImpl map = new MapImpl();
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverFlow createCoverFlow() {
		CoverFlowImpl coverFlow = new CoverFlowImpl();
		return coverFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabbedPane createTabbedPane() {
		TabbedPaneImpl tabbedPane = new TabbedPaneImpl();
		return tabbedPane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSplitter createHSplitter() {
		HSplitterImpl hSplitter = new HSplitterImpl();
		return hSplitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSplitter createVSplitter() {
		VSplitterImpl vSplitter = new VSplitterImpl();
		return vSplitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorPicker createColorPicker() {
		ColorPickerImpl colorPicker = new ColorPickerImpl();
		return colorPicker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arrow createArrow() {
		ArrowImpl arrow = new ArrowImpl();
		return arrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurlyBrace createCurlyBrace() {
		CurlyBraceImpl curlyBrace = new CurlyBraceImpl();
		return curlyBrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonBar createButtonBar() {
		ButtonBarImpl buttonBar = new ButtonBarImpl();
		return buttonBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circle createCircle() {
		CircleImpl circle = new CircleImpl();
		return circle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle createRectangle() {
		RectangleImpl rectangle = new RectangleImpl();
		return rectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chart createChart() {
		ChartImpl chart = new ChartImpl();
		return chart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossOut createCrossOut() {
		CrossOutImpl crossOut = new CrossOutImpl();
		return crossOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotspot createHotspot() {
		HotspotImpl hotspot = new HotspotImpl();
		return hotspot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SVGImage createSVGImage() {
		SVGImageImpl svgImage = new SVGImageImpl();
		return svgImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spinner createSpinner() {
		SpinnerImpl spinner = new SpinnerImpl();
		return spinner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HScrollbar createHScrollbar() {
		HScrollbarImpl hScrollbar = new HScrollbarImpl();
		return hScrollbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VScrollbar createVScrollbar() {
		VScrollbarImpl vScrollbar = new VScrollbarImpl();
		return vScrollbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLine createHLine() {
		HLineImpl hLine = new HLineImpl();
		return hLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VLine createVLine() {
		VLineImpl vLine = new VLineImpl();
		return vLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSlider createHSlider() {
		HSliderImpl hSlider = new HSliderImpl();
		return hSlider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSlider createVSlider() {
		VSliderImpl vSlider = new VSliderImpl();
		return vSlider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabs createTabs() {
		TabsImpl tabs = new TabsImpl();
		return tabs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Panel createPanel() {
		PanelImpl panel = new PanelImpl();
		return panel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResizeMode createResizeModeFromString(EDataType eDataType, String initialValue) {
		ResizeMode result = ResizeMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResizeModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAlignment createTextAlignmentFromString(EDataType eDataType, String initialValue) {
		TextAlignment result = TextAlignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconSize createIconSizeFromString(EDataType eDataType, String initialValue) {
		IconSize result = IconSize.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIconSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createStateFromString(EDataType eDataType, String initialValue) {
		State result = State.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPositionFromString(EDataType eDataType, String initialValue) {
		Position result = Position.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public BorderStyle createBorderStyleFromString(EDataType eDataType, String initialValue) {
		if("true".equalsIgnoreCase(initialValue))
			return BorderStyle.SOLID;
		if("false".equalsIgnoreCase(initialValue))
			return BorderStyle.NONE;
		
		BorderStyle result = BorderStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBorderStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonStyle createButtonStyleFromString(EDataType eDataType, String initialValue) {
		ButtonStyle result = ButtonStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertButtonStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartType createChartTypeFromString(EDataType eDataType, String initialValue) {
		ChartType result = ChartType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChartTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Theme createThemeFromString(EDataType eDataType, String initialValue) {
		Theme result = Theme.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThemeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStyle createLineStyleFromString(EDataType eDataType, String initialValue) {
		LineStyle result = LineStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotation90 createRotation90FromString(EDataType eDataType, String initialValue) {
		Rotation90 result = Rotation90.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRotation90ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public IconDesc createIconDataTypeFromString(EDataType eDataType, String initialValue) {
		return IconDesc.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String convertIconDataTypeToString(EDataType eDataType, Object instanceValue) {
		if(instanceValue == null)
			return null;
		return ((IconDesc) instanceValue).toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public FontSize createFontSizeDataTypeFromString(EDataType eDataType, String initialValue) {
		return FontSize.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String convertFontSizeDataTypeToString(EDataType eDataType, Object instanceValue) {
		if(instanceValue == null)
			return "";
		
		return ((FontSize) instanceValue).toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ColorDesc createColorDataTypeFromString(EDataType eDataType, String initialValue) {
		return ColorDesc.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String convertColorDataTypeToString(EDataType eDataType, Object instanceValue) {
		if(instanceValue == null)
			return null;
		
		return ((ColorDesc) instanceValue).toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public URI createURIDataTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null)
			return null;

		initialValue = initialValue.trim();

		if (initialValue.length() == 0)
			return null;
		
		return URI.createURI(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String convertURIDataTypeToString(EDataType eDataType, Object instanceValue) {
		URI uri = (URI) instanceValue;
		
		if(uri == null)
			return null;
		
		return uri.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
