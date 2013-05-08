/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.util;

import com.wireframesketcher.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.wireframesketcher.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseScreen(Screen object) {
				return createScreenAdapter();
			}
			@Override
			public Adapter caseScreenRuler(ScreenRuler object) {
				return createScreenRulerAdapter();
			}
			@Override
			public Adapter caseRulerGuide(RulerGuide object) {
				return createRulerGuideAdapter();
			}
			@Override
			public Adapter caseWidget(Widget object) {
				return createWidgetAdapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter caseCheckbox(Checkbox object) {
				return createCheckboxAdapter();
			}
			@Override
			public Adapter caseCombo(Combo object) {
				return createComboAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter casePlaceholder(Placeholder object) {
				return createPlaceholderAdapter();
			}
			@Override
			public Adapter caseRadioButton(RadioButton object) {
				return createRadioButtonAdapter();
			}
			@Override
			public Adapter caseTextField(TextField object) {
				return createTextFieldAdapter();
			}
			@Override
			public Adapter caseSpinner(Spinner object) {
				return createSpinnerAdapter();
			}
			@Override
			public Adapter caseWindow(Window object) {
				return createWindowAdapter();
			}
			@Override
			public Adapter caseBrowser(Browser object) {
				return createBrowserAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseArea(Area object) {
				return createAreaAdapter();
			}
			@Override
			public Adapter casePanel(Panel object) {
				return createPanelAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseList(List object) {
				return createListAdapter();
			}
			@Override
			public Adapter casePopup(Popup object) {
				return createPopupAdapter();
			}
			@Override
			public Adapter caseMenu(Menu object) {
				return createMenuAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseTree(Tree object) {
				return createTreeAdapter();
			}
			@Override
			public Adapter caseIcon(Icon object) {
				return createIconAdapter();
			}
			@Override
			public Adapter caseTextArea(TextArea object) {
				return createTextAreaAdapter();
			}
			@Override
			public Adapter caseHScrollbar(HScrollbar object) {
				return createHScrollbarAdapter();
			}
			@Override
			public Adapter caseVScrollbar(VScrollbar object) {
				return createVScrollbarAdapter();
			}
			@Override
			public Adapter caseHLine(HLine object) {
				return createHLineAdapter();
			}
			@Override
			public Adapter caseVLine(VLine object) {
				return createVLineAdapter();
			}
			@Override
			public Adapter caseHSlider(HSlider object) {
				return createHSliderAdapter();
			}
			@Override
			public Adapter caseVSlider(VSlider object) {
				return createVSliderAdapter();
			}
			@Override
			public Adapter caseTabs(Tabs object) {
				return createTabsAdapter();
			}
			@Override
			public Adapter caseWidgetDescriptor(WidgetDescriptor object) {
				return createWidgetDescriptorAdapter();
			}
			@Override
			public Adapter caseFont(Font object) {
				return createFontAdapter();
			}
			@Override
			public Adapter caseWidgetContainer(WidgetContainer object) {
				return createWidgetContainerAdapter();
			}
			@Override
			public Adapter caseWidgetGroup(WidgetGroup object) {
				return createWidgetGroupAdapter();
			}
			@Override
			public Adapter caseMaster(Master object) {
				return createMasterAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseScreenFont(ScreenFont object) {
				return createScreenFontAdapter();
			}
			@Override
			public Adapter caseFontSupport(FontSupport object) {
				return createFontSupportAdapter();
			}
			@Override
			public Adapter caseColorForegroundSupport(ColorForegroundSupport object) {
				return createColorForegroundSupportAdapter();
			}
			@Override
			public Adapter caseColorBackgroundSupport(ColorBackgroundSupport object) {
				return createColorBackgroundSupportAdapter();
			}
			@Override
			public Adapter caseColorBorderSupport(ColorBorderSupport object) {
				return createColorBorderSupportAdapter();
			}
			@Override
			public Adapter caseColorAlphaSupport(ColorAlphaSupport object) {
				return createColorAlphaSupportAdapter();
			}
			@Override
			public Adapter caseSelectionSupport(SelectionSupport object) {
				return createSelectionSupportAdapter();
			}
			@Override
			public Adapter caseTextAlignmentSupport(TextAlignmentSupport object) {
				return createTextAlignmentSupportAdapter();
			}
			@Override
			public Adapter caseBooleanSelectionSupport(BooleanSelectionSupport object) {
				return createBooleanSelectionSupportAdapter();
			}
			@Override
			public Adapter caseNote(Note object) {
				return createNoteAdapter();
			}
			@Override
			public Adapter caseProgressBar(ProgressBar object) {
				return createProgressBarAdapter();
			}
			@Override
			public Adapter caseCallout(Callout object) {
				return createCalloutAdapter();
			}
			@Override
			public Adapter caseSearchField(SearchField object) {
				return createSearchFieldAdapter();
			}
			@Override
			public Adapter caseTooltip(Tooltip object) {
				return createTooltipAdapter();
			}
			@Override
			public Adapter caseScratchOut(ScratchOut object) {
				return createScratchOutAdapter();
			}
			@Override
			public Adapter caseBorderSupport(BorderSupport object) {
				return createBorderSupportAdapter();
			}
			@Override
			public Adapter caseStateSupport(StateSupport object) {
				return createStateSupportAdapter();
			}
			@Override
			public Adapter caseBreadcrumbs(Breadcrumbs object) {
				return createBreadcrumbsAdapter();
			}
			@Override
			public Adapter caseLinkBar(LinkBar object) {
				return createLinkBarAdapter();
			}
			@Override
			public Adapter caseAccordion(Accordion object) {
				return createAccordionAdapter();
			}
			@Override
			public Adapter caseVerticalScrollbarSupport(VerticalScrollbarSupport object) {
				return createVerticalScrollbarSupportAdapter();
			}
			@Override
			public Adapter caseDateField(DateField object) {
				return createDateFieldAdapter();
			}
			@Override
			public Adapter caseVideoPlayer(VideoPlayer object) {
				return createVideoPlayerAdapter();
			}
			@Override
			public Adapter caseMap(Map object) {
				return createMapAdapter();
			}
			@Override
			public Adapter caseCoverFlow(CoverFlow object) {
				return createCoverFlowAdapter();
			}
			@Override
			public Adapter caseTabbedPane(TabbedPane object) {
				return createTabbedPaneAdapter();
			}
			@Override
			public Adapter caseIconSupport(IconSupport object) {
				return createIconSupportAdapter();
			}
			@Override
			public Adapter caseHSplitter(HSplitter object) {
				return createHSplitterAdapter();
			}
			@Override
			public Adapter caseVSplitter(VSplitter object) {
				return createVSplitterAdapter();
			}
			@Override
			public Adapter caseValueSupport(ValueSupport object) {
				return createValueSupportAdapter();
			}
			@Override
			public Adapter caseColorPicker(ColorPicker object) {
				return createColorPickerAdapter();
			}
			@Override
			public Adapter caseArrow(Arrow object) {
				return createArrowAdapter();
			}
			@Override
			public Adapter caseCurlyBrace(CurlyBrace object) {
				return createCurlyBraceAdapter();
			}
			@Override
			public Adapter caseButtonBar(ButtonBar object) {
				return createButtonBarAdapter();
			}
			@Override
			public Adapter caseBorderStyleSupport(BorderStyleSupport object) {
				return createBorderStyleSupportAdapter();
			}
			@Override
			public Adapter caseCircle(Circle object) {
				return createCircleAdapter();
			}
			@Override
			public Adapter caseRectangle(Rectangle object) {
				return createRectangleAdapter();
			}
			@Override
			public Adapter caseIconPositionSupport(IconPositionSupport object) {
				return createIconPositionSupportAdapter();
			}
			@Override
			public Adapter caseListSupport(ListSupport object) {
				return createListSupportAdapter();
			}
			@Override
			public Adapter caseChart(Chart object) {
				return createChartAdapter();
			}
			@Override
			public Adapter caseCrossOut(CrossOut object) {
				return createCrossOutAdapter();
			}
			@Override
			public Adapter caseItem(Item object) {
				return createItemAdapter();
			}
			@Override
			public Adapter caseItemSupport(ItemSupport object) {
				return createItemSupportAdapter();
			}
			@Override
			public Adapter caseLinkSupport(LinkSupport object) {
				return createLinkSupportAdapter();
			}
			@Override
			public Adapter caseHotspot(Hotspot object) {
				return createHotspotAdapter();
			}
			@Override
			public Adapter caseNameSupport(NameSupport object) {
				return createNameSupportAdapter();
			}
			@Override
			public Adapter caseColorAlternativeSupport(ColorAlternativeSupport object) {
				return createColorAlternativeSupportAdapter();
			}
			@Override
			public Adapter caseLineStyleSupport(LineStyleSupport object) {
				return createLineStyleSupportAdapter();
			}
			@Override
			public Adapter caseRotationSupport(RotationSupport object) {
				return createRotationSupportAdapter();
			}
			@Override
			public Adapter caseFlipSupport(FlipSupport object) {
				return createFlipSupportAdapter();
			}
			@Override
			public Adapter caseSVGImage(SVGImage object) {
				return createSVGImageAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Screen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Screen
	 * @generated
	 */
	public Adapter createScreenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.ScreenRuler <em>Screen Ruler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.ScreenRuler
	 * @generated
	 */
	public Adapter createScreenRulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.RulerGuide <em>Ruler Guide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.RulerGuide
	 * @generated
	 */
	public Adapter createRulerGuideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Widget
	 * @generated
	 */
	public Adapter createWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Checkbox <em>Checkbox</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Checkbox
	 * @generated
	 */
	public Adapter createCheckboxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Combo <em>Combo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Combo
	 * @generated
	 */
	public Adapter createComboAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Placeholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Placeholder
	 * @generated
	 */
	public Adapter createPlaceholderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.RadioButton
	 * @generated
	 */
	public Adapter createRadioButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.TextField
	 * @generated
	 */
	public Adapter createTextFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Window
	 * @generated
	 */
	public Adapter createWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.WidgetDescriptor <em>Widget Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.WidgetDescriptor
	 * @generated
	 */
	public Adapter createWidgetDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Area
	 * @generated
	 */
	public Adapter createAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.List
	 * @generated
	 */
	public Adapter createListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Popup <em>Popup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Popup
	 * @generated
	 */
	public Adapter createPopupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Menu
	 * @generated
	 */
	public Adapter createMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Tree
	 * @generated
	 */
	public Adapter createTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Icon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Icon
	 * @generated
	 */
	public Adapter createIconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.TextArea <em>Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.TextArea
	 * @generated
	 */
	public Adapter createTextAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Browser <em>Browser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Browser
	 * @generated
	 */
	public Adapter createBrowserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Font <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Font
	 * @generated
	 */
	public Adapter createFontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.WidgetContainer <em>Widget Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.WidgetContainer
	 * @generated
	 */
	public Adapter createWidgetContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.WidgetGroup <em>Widget Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.WidgetGroup
	 * @generated
	 */
	public Adapter createWidgetGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Master <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Master
	 * @generated
	 */
	public Adapter createMasterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.ScreenFont <em>Screen Font</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.ScreenFont
	 * @generated
	 */
	public Adapter createScreenFontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.FontSupport <em>Font Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.FontSupport
	 * @generated
	 */
	public Adapter createFontSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.ColorForegroundSupport <em>Color Foreground Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.ColorForegroundSupport
	 * @generated
	 */
	public Adapter createColorForegroundSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.ColorBackgroundSupport <em>Color Background Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.ColorBackgroundSupport
	 * @generated
	 */
	public Adapter createColorBackgroundSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.ColorBorderSupport <em>Color Border Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.ColorBorderSupport
	 * @generated
	 */
	public Adapter createColorBorderSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.ColorAlphaSupport <em>Color Alpha Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.ColorAlphaSupport
	 * @generated
	 */
	public Adapter createColorAlphaSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.SelectionSupport <em>Selection Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.SelectionSupport
	 * @generated
	 */
	public Adapter createSelectionSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.TextAlignmentSupport <em>Text Alignment Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.TextAlignmentSupport
	 * @generated
	 */
	public Adapter createTextAlignmentSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.BooleanSelectionSupport <em>Boolean Selection Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.BooleanSelectionSupport
	 * @generated
	 */
	public Adapter createBooleanSelectionSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Note
	 * @generated
	 */
	public Adapter createNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.ProgressBar <em>Progress Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.ProgressBar
	 * @generated
	 */
	public Adapter createProgressBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Callout <em>Callout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Callout
	 * @generated
	 */
	public Adapter createCalloutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.SearchField <em>Search Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.SearchField
	 * @generated
	 */
	public Adapter createSearchFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Tooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Tooltip
	 * @generated
	 */
	public Adapter createTooltipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.ScratchOut <em>Scratch Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.ScratchOut
	 * @generated
	 */
	public Adapter createScratchOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.BorderSupport <em>Border Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.BorderSupport
	 * @generated
	 */
	public Adapter createBorderSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.StateSupport <em>State Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.StateSupport
	 * @generated
	 */
	public Adapter createStateSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Breadcrumbs <em>Breadcrumbs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Breadcrumbs
	 * @generated
	 */
	public Adapter createBreadcrumbsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.LinkBar <em>Link Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.LinkBar
	 * @generated
	 */
	public Adapter createLinkBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Accordion <em>Accordion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Accordion
	 * @generated
	 */
	public Adapter createAccordionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.VerticalScrollbarSupport <em>Vertical Scrollbar Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.VerticalScrollbarSupport
	 * @generated
	 */
	public Adapter createVerticalScrollbarSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.DateField <em>Date Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.DateField
	 * @generated
	 */
	public Adapter createDateFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.VideoPlayer <em>Video Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.VideoPlayer
	 * @generated
	 */
	public Adapter createVideoPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Map
	 * @generated
	 */
	public Adapter createMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.CoverFlow <em>Cover Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.CoverFlow
	 * @generated
	 */
	public Adapter createCoverFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.TabbedPane <em>Tabbed Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.TabbedPane
	 * @generated
	 */
	public Adapter createTabbedPaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.IconSupport <em>Icon Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.IconSupport
	 * @generated
	 */
	public Adapter createIconSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.HSplitter <em>HSplitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.HSplitter
	 * @generated
	 */
	public Adapter createHSplitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.VSplitter <em>VSplitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.VSplitter
	 * @generated
	 */
	public Adapter createVSplitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.ValueSupport <em>Value Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.ValueSupport
	 * @generated
	 */
	public Adapter createValueSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.ColorPicker <em>Color Picker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.ColorPicker
	 * @generated
	 */
	public Adapter createColorPickerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Arrow <em>Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Arrow
	 * @generated
	 */
	public Adapter createArrowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.CurlyBrace <em>Curly Brace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.CurlyBrace
	 * @generated
	 */
	public Adapter createCurlyBraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.ButtonBar <em>Button Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.ButtonBar
	 * @generated
	 */
	public Adapter createButtonBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.BorderStyleSupport <em>Border Style Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.BorderStyleSupport
	 * @generated
	 */
	public Adapter createBorderStyleSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Circle
	 * @generated
	 */
	public Adapter createCircleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Rectangle
	 * @generated
	 */
	public Adapter createRectangleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.IconPositionSupport <em>Icon Position Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.IconPositionSupport
	 * @generated
	 */
	public Adapter createIconPositionSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.ListSupport <em>List Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.ListSupport
	 * @generated
	 */
	public Adapter createListSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Chart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Chart
	 * @generated
	 */
	public Adapter createChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.CrossOut <em>Cross Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.CrossOut
	 * @generated
	 */
	public Adapter createCrossOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.ItemSupport <em>Item Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.ItemSupport
	 * @generated
	 */
	public Adapter createItemSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.LinkSupport <em>Link Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.LinkSupport
	 * @generated
	 */
	public Adapter createLinkSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Hotspot <em>Hotspot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Hotspot
	 * @generated
	 */
	public Adapter createHotspotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.NameSupport <em>Name Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.NameSupport
	 * @generated
	 */
	public Adapter createNameSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.ColorAlternativeSupport <em>Color Alternative Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.ColorAlternativeSupport
	 * @generated
	 */
	public Adapter createColorAlternativeSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.LineStyleSupport <em>Line Style Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.LineStyleSupport
	 * @generated
	 */
	public Adapter createLineStyleSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.RotationSupport <em>Rotation Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.RotationSupport
	 * @generated
	 */
	public Adapter createRotationSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.FlipSupport <em>Flip Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.FlipSupport
	 * @generated
	 */
	public Adapter createFlipSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.SVGImage <em>SVG Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.SVGImage
	 * @generated
	 */
	public Adapter createSVGImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Spinner <em>Spinner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Spinner
	 * @generated
	 */
	public Adapter createSpinnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.HScrollbar <em>HScrollbar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.HScrollbar
	 * @generated
	 */
	public Adapter createHScrollbarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.VScrollbar <em>VScrollbar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.VScrollbar
	 * @generated
	 */
	public Adapter createVScrollbarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.HLine <em>HLine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.HLine
	 * @generated
	 */
	public Adapter createHLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.VLine <em>VLine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.VLine
	 * @generated
	 */
	public Adapter createVLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.HSlider <em>HSlider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.HSlider
	 * @generated
	 */
	public Adapter createHSliderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.VSlider <em>VSlider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.VSlider
	 * @generated
	 */
	public Adapter createVSliderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Tabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Tabs
	 * @generated
	 */
	public Adapter createTabsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.wireframesketcher.model.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.wireframesketcher.model.Panel
	 * @generated
	 */
	public Adapter createPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
