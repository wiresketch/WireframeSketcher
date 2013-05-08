/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.util;

import com.wireframesketcher.model.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.wireframesketcher.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.SCREEN: {
				Screen screen = (Screen)theEObject;
				T result = caseScreen(screen);
				if (result == null) result = caseWidgetContainer(screen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SCREEN_RULER: {
				ScreenRuler screenRuler = (ScreenRuler)theEObject;
				T result = caseScreenRuler(screenRuler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RULER_GUIDE: {
				RulerGuide rulerGuide = (RulerGuide)theEObject;
				T result = caseRulerGuide(rulerGuide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.WIDGET: {
				Widget widget = (Widget)theEObject;
				T result = caseWidget(widget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseWidget(button);
				if (result == null) result = caseStateSupport(button);
				if (result == null) result = caseColorBackgroundSupport(button);
				if (result == null) result = caseFontSupport(button);
				if (result == null) result = caseIconSupport(button);
				if (result == null) result = caseLinkSupport(button);
				if (result == null) result = caseTextAlignmentSupport(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CHECKBOX: {
				Checkbox checkbox = (Checkbox)theEObject;
				T result = caseCheckbox(checkbox);
				if (result == null) result = caseWidget(checkbox);
				if (result == null) result = caseBooleanSelectionSupport(checkbox);
				if (result == null) result = caseStateSupport(checkbox);
				if (result == null) result = caseLinkSupport(checkbox);
				if (result == null) result = caseFontSupport(checkbox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COMBO: {
				Combo combo = (Combo)theEObject;
				T result = caseCombo(combo);
				if (result == null) result = caseWidget(combo);
				if (result == null) result = caseStateSupport(combo);
				if (result == null) result = caseFontSupport(combo);
				if (result == null) result = caseColorBorderSupport(combo);
				if (result == null) result = caseColorBackgroundSupport(combo);
				if (result == null) result = caseColorAlphaSupport(combo);
				if (result == null) result = caseLinkSupport(combo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = caseWidget(label);
				if (result == null) result = caseFontSupport(label);
				if (result == null) result = caseTextAlignmentSupport(label);
				if (result == null) result = caseColorForegroundSupport(label);
				if (result == null) result = caseStateSupport(label);
				if (result == null) result = caseIconPositionSupport(label);
				if (result == null) result = caseLinkSupport(label);
				if (result == null) result = caseRotationSupport(label);
				if (result == null) result = caseIconSupport(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseWidget(link);
				if (result == null) result = caseFontSupport(link);
				if (result == null) result = caseStateSupport(link);
				if (result == null) result = caseLinkSupport(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PLACEHOLDER: {
				Placeholder placeholder = (Placeholder)theEObject;
				T result = casePlaceholder(placeholder);
				if (result == null) result = caseWidget(placeholder);
				if (result == null) result = caseLinkSupport(placeholder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RADIO_BUTTON: {
				RadioButton radioButton = (RadioButton)theEObject;
				T result = caseRadioButton(radioButton);
				if (result == null) result = caseWidget(radioButton);
				if (result == null) result = caseBooleanSelectionSupport(radioButton);
				if (result == null) result = caseStateSupport(radioButton);
				if (result == null) result = caseLinkSupport(radioButton);
				if (result == null) result = caseFontSupport(radioButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TEXT_FIELD: {
				TextField textField = (TextField)theEObject;
				T result = caseTextField(textField);
				if (result == null) result = caseWidget(textField);
				if (result == null) result = caseStateSupport(textField);
				if (result == null) result = caseFontSupport(textField);
				if (result == null) result = caseTextAlignmentSupport(textField);
				if (result == null) result = caseColorBackgroundSupport(textField);
				if (result == null) result = caseColorAlphaSupport(textField);
				if (result == null) result = caseColorBorderSupport(textField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SPINNER: {
				Spinner spinner = (Spinner)theEObject;
				T result = caseSpinner(spinner);
				if (result == null) result = caseWidget(spinner);
				if (result == null) result = caseStateSupport(spinner);
				if (result == null) result = caseFontSupport(spinner);
				if (result == null) result = caseColorBorderSupport(spinner);
				if (result == null) result = caseColorBackgroundSupport(spinner);
				if (result == null) result = caseColorAlphaSupport(spinner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.WINDOW: {
				Window window = (Window)theEObject;
				T result = caseWindow(window);
				if (result == null) result = caseWidget(window);
				if (result == null) result = caseVerticalScrollbarSupport(window);
				if (result == null) result = caseValueSupport(window);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BROWSER: {
				Browser browser = (Browser)theEObject;
				T result = caseBrowser(browser);
				if (result == null) result = caseWidget(browser);
				if (result == null) result = caseVerticalScrollbarSupport(browser);
				if (result == null) result = caseColorBackgroundSupport(browser);
				if (result == null) result = caseValueSupport(browser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseWidget(text);
				if (result == null) result = caseFontSupport(text);
				if (result == null) result = caseTextAlignmentSupport(text);
				if (result == null) result = caseColorForegroundSupport(text);
				if (result == null) result = caseLinkSupport(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.AREA: {
				Area area = (Area)theEObject;
				T result = caseArea(area);
				if (result == null) result = caseWidget(area);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PANEL: {
				Panel panel = (Panel)theEObject;
				T result = casePanel(panel);
				if (result == null) result = caseWidget(panel);
				if (result == null) result = caseColorBackgroundSupport(panel);
				if (result == null) result = caseColorAlphaSupport(panel);
				if (result == null) result = caseVerticalScrollbarSupport(panel);
				if (result == null) result = caseColorForegroundSupport(panel);
				if (result == null) result = caseBorderStyleSupport(panel);
				if (result == null) result = caseLinkSupport(panel);
				if (result == null) result = caseValueSupport(panel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = caseWidget(group);
				if (result == null) result = caseVerticalScrollbarSupport(group);
				if (result == null) result = caseColorBackgroundSupport(group);
				if (result == null) result = caseColorAlphaSupport(group);
				if (result == null) result = caseFontSupport(group);
				if (result == null) result = caseValueSupport(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LIST: {
				com.wireframesketcher.model.List list = (com.wireframesketcher.model.List)theEObject;
				T result = caseList(list);
				if (result == null) result = caseWidget(list);
				if (result == null) result = caseSelectionSupport(list);
				if (result == null) result = caseBorderSupport(list);
				if (result == null) result = caseVerticalScrollbarSupport(list);
				if (result == null) result = caseColorBackgroundSupport(list);
				if (result == null) result = caseColorAlphaSupport(list);
				if (result == null) result = caseListSupport(list);
				if (result == null) result = caseFontSupport(list);
				if (result == null) result = caseItemSupport(list);
				if (result == null) result = caseColorAlternativeSupport(list);
				if (result == null) result = caseValueSupport(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.POPUP: {
				Popup popup = (Popup)theEObject;
				T result = casePopup(popup);
				if (result == null) result = caseWidget(popup);
				if (result == null) result = caseSelectionSupport(popup);
				if (result == null) result = caseItemSupport(popup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MENU: {
				Menu menu = (Menu)theEObject;
				T result = caseMenu(menu);
				if (result == null) result = caseWidget(menu);
				if (result == null) result = caseSelectionSupport(menu);
				if (result == null) result = caseIconSupport(menu);
				if (result == null) result = caseItemSupport(menu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseWidget(table);
				if (result == null) result = caseSelectionSupport(table);
				if (result == null) result = caseBorderSupport(table);
				if (result == null) result = caseVerticalScrollbarSupport(table);
				if (result == null) result = caseColorBackgroundSupport(table);
				if (result == null) result = caseColorAlphaSupport(table);
				if (result == null) result = caseListSupport(table);
				if (result == null) result = caseFontSupport(table);
				if (result == null) result = caseTextAlignmentSupport(table);
				if (result == null) result = caseColorAlternativeSupport(table);
				if (result == null) result = caseValueSupport(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TREE: {
				Tree tree = (Tree)theEObject;
				T result = caseTree(tree);
				if (result == null) result = caseWidget(tree);
				if (result == null) result = caseBorderSupport(tree);
				if (result == null) result = caseVerticalScrollbarSupport(tree);
				if (result == null) result = caseColorBackgroundSupport(tree);
				if (result == null) result = caseColorAlphaSupport(tree);
				if (result == null) result = caseSelectionSupport(tree);
				if (result == null) result = caseItemSupport(tree);
				if (result == null) result = caseFontSupport(tree);
				if (result == null) result = caseValueSupport(tree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ICON: {
				Icon icon = (Icon)theEObject;
				T result = caseIcon(icon);
				if (result == null) result = caseWidget(icon);
				if (result == null) result = caseColorForegroundSupport(icon);
				if (result == null) result = caseIconSupport(icon);
				if (result == null) result = caseLinkSupport(icon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TEXT_AREA: {
				TextArea textArea = (TextArea)theEObject;
				T result = caseTextArea(textArea);
				if (result == null) result = caseWidget(textArea);
				if (result == null) result = caseStateSupport(textArea);
				if (result == null) result = caseVerticalScrollbarSupport(textArea);
				if (result == null) result = caseFontSupport(textArea);
				if (result == null) result = caseTextAlignmentSupport(textArea);
				if (result == null) result = caseColorBackgroundSupport(textArea);
				if (result == null) result = caseColorAlphaSupport(textArea);
				if (result == null) result = caseColorBorderSupport(textArea);
				if (result == null) result = caseValueSupport(textArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.HSCROLLBAR: {
				HScrollbar hScrollbar = (HScrollbar)theEObject;
				T result = caseHScrollbar(hScrollbar);
				if (result == null) result = caseWidget(hScrollbar);
				if (result == null) result = caseValueSupport(hScrollbar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VSCROLLBAR: {
				VScrollbar vScrollbar = (VScrollbar)theEObject;
				T result = caseVScrollbar(vScrollbar);
				if (result == null) result = caseWidget(vScrollbar);
				if (result == null) result = caseValueSupport(vScrollbar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.HLINE: {
				HLine hLine = (HLine)theEObject;
				T result = caseHLine(hLine);
				if (result == null) result = caseWidget(hLine);
				if (result == null) result = caseColorForegroundSupport(hLine);
				if (result == null) result = caseLineStyleSupport(hLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VLINE: {
				VLine vLine = (VLine)theEObject;
				T result = caseVLine(vLine);
				if (result == null) result = caseWidget(vLine);
				if (result == null) result = caseColorForegroundSupport(vLine);
				if (result == null) result = caseLineStyleSupport(vLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.HSLIDER: {
				HSlider hSlider = (HSlider)theEObject;
				T result = caseHSlider(hSlider);
				if (result == null) result = caseWidget(hSlider);
				if (result == null) result = caseValueSupport(hSlider);
				if (result == null) result = caseStateSupport(hSlider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VSLIDER: {
				VSlider vSlider = (VSlider)theEObject;
				T result = caseVSlider(vSlider);
				if (result == null) result = caseWidget(vSlider);
				if (result == null) result = caseValueSupport(vSlider);
				if (result == null) result = caseStateSupport(vSlider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TABS: {
				Tabs tabs = (Tabs)theEObject;
				T result = caseTabs(tabs);
				if (result == null) result = caseWidget(tabs);
				if (result == null) result = caseSelectionSupport(tabs);
				if (result == null) result = caseItemSupport(tabs);
				if (result == null) result = caseFontSupport(tabs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.WIDGET_DESCRIPTOR: {
				WidgetDescriptor widgetDescriptor = (WidgetDescriptor)theEObject;
				T result = caseWidgetDescriptor(widgetDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FONT: {
				Font font = (Font)theEObject;
				T result = caseFont(font);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.WIDGET_CONTAINER: {
				WidgetContainer widgetContainer = (WidgetContainer)theEObject;
				T result = caseWidgetContainer(widgetContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.WIDGET_GROUP: {
				WidgetGroup widgetGroup = (WidgetGroup)theEObject;
				T result = caseWidgetGroup(widgetGroup);
				if (result == null) result = caseWidget(widgetGroup);
				if (result == null) result = caseWidgetContainer(widgetGroup);
				if (result == null) result = caseLinkSupport(widgetGroup);
				if (result == null) result = caseNameSupport(widgetGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MASTER: {
				Master master = (Master)theEObject;
				T result = caseMaster(master);
				if (result == null) result = caseWidget(master);
				if (result == null) result = caseLinkSupport(master);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseWidget(image);
				if (result == null) result = caseLinkSupport(image);
				if (result == null) result = caseRotationSupport(image);
				if (result == null) result = caseFlipSupport(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SCREEN_FONT: {
				ScreenFont screenFont = (ScreenFont)theEObject;
				T result = caseScreenFont(screenFont);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FONT_SUPPORT: {
				FontSupport fontSupport = (FontSupport)theEObject;
				T result = caseFontSupport(fontSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COLOR_FOREGROUND_SUPPORT: {
				ColorForegroundSupport colorForegroundSupport = (ColorForegroundSupport)theEObject;
				T result = caseColorForegroundSupport(colorForegroundSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COLOR_BACKGROUND_SUPPORT: {
				ColorBackgroundSupport colorBackgroundSupport = (ColorBackgroundSupport)theEObject;
				T result = caseColorBackgroundSupport(colorBackgroundSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COLOR_BORDER_SUPPORT: {
				ColorBorderSupport colorBorderSupport = (ColorBorderSupport)theEObject;
				T result = caseColorBorderSupport(colorBorderSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COLOR_ALPHA_SUPPORT: {
				ColorAlphaSupport colorAlphaSupport = (ColorAlphaSupport)theEObject;
				T result = caseColorAlphaSupport(colorAlphaSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SELECTION_SUPPORT: {
				SelectionSupport selectionSupport = (SelectionSupport)theEObject;
				T result = caseSelectionSupport(selectionSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TEXT_ALIGNMENT_SUPPORT: {
				TextAlignmentSupport textAlignmentSupport = (TextAlignmentSupport)theEObject;
				T result = caseTextAlignmentSupport(textAlignmentSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BOOLEAN_SELECTION_SUPPORT: {
				BooleanSelectionSupport booleanSelectionSupport = (BooleanSelectionSupport)theEObject;
				T result = caseBooleanSelectionSupport(booleanSelectionSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NOTE: {
				Note note = (Note)theEObject;
				T result = caseNote(note);
				if (result == null) result = caseWidget(note);
				if (result == null) result = caseFontSupport(note);
				if (result == null) result = caseTextAlignmentSupport(note);
				if (result == null) result = caseColorBackgroundSupport(note);
				if (result == null) result = caseColorAlphaSupport(note);
				if (result == null) result = caseLinkSupport(note);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PROGRESS_BAR: {
				ProgressBar progressBar = (ProgressBar)theEObject;
				T result = caseProgressBar(progressBar);
				if (result == null) result = caseWidget(progressBar);
				if (result == null) result = caseValueSupport(progressBar);
				if (result == null) result = caseColorBackgroundSupport(progressBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CALLOUT: {
				Callout callout = (Callout)theEObject;
				T result = caseCallout(callout);
				if (result == null) result = caseWidget(callout);
				if (result == null) result = caseFontSupport(callout);
				if (result == null) result = caseColorBackgroundSupport(callout);
				if (result == null) result = caseColorAlphaSupport(callout);
				if (result == null) result = caseLinkSupport(callout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SEARCH_FIELD: {
				SearchField searchField = (SearchField)theEObject;
				T result = caseSearchField(searchField);
				if (result == null) result = caseWidget(searchField);
				if (result == null) result = caseFontSupport(searchField);
				if (result == null) result = caseStateSupport(searchField);
				if (result == null) result = caseColorBorderSupport(searchField);
				if (result == null) result = caseLinkSupport(searchField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TOOLTIP: {
				Tooltip tooltip = (Tooltip)theEObject;
				T result = caseTooltip(tooltip);
				if (result == null) result = caseWidget(tooltip);
				if (result == null) result = caseFontSupport(tooltip);
				if (result == null) result = caseTextAlignmentSupport(tooltip);
				if (result == null) result = caseColorBackgroundSupport(tooltip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SCRATCH_OUT: {
				ScratchOut scratchOut = (ScratchOut)theEObject;
				T result = caseScratchOut(scratchOut);
				if (result == null) result = caseWidget(scratchOut);
				if (result == null) result = caseColorForegroundSupport(scratchOut);
				if (result == null) result = caseColorAlphaSupport(scratchOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BORDER_SUPPORT: {
				BorderSupport borderSupport = (BorderSupport)theEObject;
				T result = caseBorderSupport(borderSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.STATE_SUPPORT: {
				StateSupport stateSupport = (StateSupport)theEObject;
				T result = caseStateSupport(stateSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BREADCRUMBS: {
				Breadcrumbs breadcrumbs = (Breadcrumbs)theEObject;
				T result = caseBreadcrumbs(breadcrumbs);
				if (result == null) result = caseWidget(breadcrumbs);
				if (result == null) result = caseFontSupport(breadcrumbs);
				if (result == null) result = caseItemSupport(breadcrumbs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LINK_BAR: {
				LinkBar linkBar = (LinkBar)theEObject;
				T result = caseLinkBar(linkBar);
				if (result == null) result = caseWidget(linkBar);
				if (result == null) result = caseFontSupport(linkBar);
				if (result == null) result = caseSelectionSupport(linkBar);
				if (result == null) result = caseItemSupport(linkBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ACCORDION: {
				Accordion accordion = (Accordion)theEObject;
				T result = caseAccordion(accordion);
				if (result == null) result = caseWidget(accordion);
				if (result == null) result = caseSelectionSupport(accordion);
				if (result == null) result = caseVerticalScrollbarSupport(accordion);
				if (result == null) result = caseItemSupport(accordion);
				if (result == null) result = caseValueSupport(accordion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VERTICAL_SCROLLBAR_SUPPORT: {
				VerticalScrollbarSupport verticalScrollbarSupport = (VerticalScrollbarSupport)theEObject;
				T result = caseVerticalScrollbarSupport(verticalScrollbarSupport);
				if (result == null) result = caseValueSupport(verticalScrollbarSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DATE_FIELD: {
				DateField dateField = (DateField)theEObject;
				T result = caseDateField(dateField);
				if (result == null) result = caseWidget(dateField);
				if (result == null) result = caseStateSupport(dateField);
				if (result == null) result = caseColorBorderSupport(dateField);
				if (result == null) result = caseColorBackgroundSupport(dateField);
				if (result == null) result = caseColorAlphaSupport(dateField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VIDEO_PLAYER: {
				VideoPlayer videoPlayer = (VideoPlayer)theEObject;
				T result = caseVideoPlayer(videoPlayer);
				if (result == null) result = caseWidget(videoPlayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MAP: {
				Map map = (Map)theEObject;
				T result = caseMap(map);
				if (result == null) result = caseWidget(map);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COVER_FLOW: {
				CoverFlow coverFlow = (CoverFlow)theEObject;
				T result = caseCoverFlow(coverFlow);
				if (result == null) result = caseWidget(coverFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TABBED_PANE: {
				TabbedPane tabbedPane = (TabbedPane)theEObject;
				T result = caseTabbedPane(tabbedPane);
				if (result == null) result = caseWidget(tabbedPane);
				if (result == null) result = caseSelectionSupport(tabbedPane);
				if (result == null) result = caseVerticalScrollbarSupport(tabbedPane);
				if (result == null) result = caseColorBackgroundSupport(tabbedPane);
				if (result == null) result = caseColorAlphaSupport(tabbedPane);
				if (result == null) result = caseItemSupport(tabbedPane);
				if (result == null) result = caseFontSupport(tabbedPane);
				if (result == null) result = caseValueSupport(tabbedPane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ICON_SUPPORT: {
				IconSupport iconSupport = (IconSupport)theEObject;
				T result = caseIconSupport(iconSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.HSPLITTER: {
				HSplitter hSplitter = (HSplitter)theEObject;
				T result = caseHSplitter(hSplitter);
				if (result == null) result = caseWidget(hSplitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VSPLITTER: {
				VSplitter vSplitter = (VSplitter)theEObject;
				T result = caseVSplitter(vSplitter);
				if (result == null) result = caseWidget(vSplitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VALUE_SUPPORT: {
				ValueSupport valueSupport = (ValueSupport)theEObject;
				T result = caseValueSupport(valueSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COLOR_PICKER: {
				ColorPicker colorPicker = (ColorPicker)theEObject;
				T result = caseColorPicker(colorPicker);
				if (result == null) result = caseWidget(colorPicker);
				if (result == null) result = caseColorBackgroundSupport(colorPicker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ARROW: {
				Arrow arrow = (Arrow)theEObject;
				T result = caseArrow(arrow);
				if (result == null) result = caseWidget(arrow);
				if (result == null) result = caseColorForegroundSupport(arrow);
				if (result == null) result = caseLineStyleSupport(arrow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CURLY_BRACE: {
				CurlyBrace curlyBrace = (CurlyBrace)theEObject;
				T result = caseCurlyBrace(curlyBrace);
				if (result == null) result = caseWidget(curlyBrace);
				if (result == null) result = caseFontSupport(curlyBrace);
				if (result == null) result = caseColorForegroundSupport(curlyBrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BUTTON_BAR: {
				ButtonBar buttonBar = (ButtonBar)theEObject;
				T result = caseButtonBar(buttonBar);
				if (result == null) result = caseWidget(buttonBar);
				if (result == null) result = caseSelectionSupport(buttonBar);
				if (result == null) result = caseFontSupport(buttonBar);
				if (result == null) result = caseColorBackgroundSupport(buttonBar);
				if (result == null) result = caseItemSupport(buttonBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BORDER_STYLE_SUPPORT: {
				BorderStyleSupport borderStyleSupport = (BorderStyleSupport)theEObject;
				T result = caseBorderStyleSupport(borderStyleSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CIRCLE: {
				Circle circle = (Circle)theEObject;
				T result = caseCircle(circle);
				if (result == null) result = caseWidget(circle);
				if (result == null) result = caseColorBackgroundSupport(circle);
				if (result == null) result = caseColorAlphaSupport(circle);
				if (result == null) result = caseColorForegroundSupport(circle);
				if (result == null) result = caseBorderSupport(circle);
				if (result == null) result = caseIconPositionSupport(circle);
				if (result == null) result = caseFontSupport(circle);
				if (result == null) result = caseLinkSupport(circle);
				if (result == null) result = caseTextAlignmentSupport(circle);
				if (result == null) result = caseLineStyleSupport(circle);
				if (result == null) result = caseIconSupport(circle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RECTANGLE: {
				Rectangle rectangle = (Rectangle)theEObject;
				T result = caseRectangle(rectangle);
				if (result == null) result = caseWidget(rectangle);
				if (result == null) result = caseColorBackgroundSupport(rectangle);
				if (result == null) result = caseColorAlphaSupport(rectangle);
				if (result == null) result = caseColorForegroundSupport(rectangle);
				if (result == null) result = caseBorderStyleSupport(rectangle);
				if (result == null) result = caseIconPositionSupport(rectangle);
				if (result == null) result = caseFontSupport(rectangle);
				if (result == null) result = caseLinkSupport(rectangle);
				if (result == null) result = caseTextAlignmentSupport(rectangle);
				if (result == null) result = caseIconSupport(rectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ICON_POSITION_SUPPORT: {
				IconPositionSupport iconPositionSupport = (IconPositionSupport)theEObject;
				T result = caseIconPositionSupport(iconPositionSupport);
				if (result == null) result = caseIconSupport(iconPositionSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LIST_SUPPORT: {
				ListSupport listSupport = (ListSupport)theEObject;
				T result = caseListSupport(listSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CHART: {
				Chart chart = (Chart)theEObject;
				T result = caseChart(chart);
				if (result == null) result = caseWidget(chart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CROSS_OUT: {
				CrossOut crossOut = (CrossOut)theEObject;
				T result = caseCrossOut(crossOut);
				if (result == null) result = caseWidget(crossOut);
				if (result == null) result = caseColorForegroundSupport(crossOut);
				if (result == null) result = caseColorAlphaSupport(crossOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ITEM: {
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = caseLinkSupport(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ITEM_SUPPORT: {
				ItemSupport itemSupport = (ItemSupport)theEObject;
				T result = caseItemSupport(itemSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LINK_SUPPORT: {
				LinkSupport linkSupport = (LinkSupport)theEObject;
				T result = caseLinkSupport(linkSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.HOTSPOT: {
				Hotspot hotspot = (Hotspot)theEObject;
				T result = caseHotspot(hotspot);
				if (result == null) result = caseWidget(hotspot);
				if (result == null) result = caseLinkSupport(hotspot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NAME_SUPPORT: {
				NameSupport nameSupport = (NameSupport)theEObject;
				T result = caseNameSupport(nameSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COLOR_ALTERNATIVE_SUPPORT: {
				ColorAlternativeSupport colorAlternativeSupport = (ColorAlternativeSupport)theEObject;
				T result = caseColorAlternativeSupport(colorAlternativeSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LINE_STYLE_SUPPORT: {
				LineStyleSupport lineStyleSupport = (LineStyleSupport)theEObject;
				T result = caseLineStyleSupport(lineStyleSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ROTATION_SUPPORT: {
				RotationSupport rotationSupport = (RotationSupport)theEObject;
				T result = caseRotationSupport(rotationSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FLIP_SUPPORT: {
				FlipSupport flipSupport = (FlipSupport)theEObject;
				T result = caseFlipSupport(flipSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SVG_IMAGE: {
				SVGImage svgImage = (SVGImage)theEObject;
				T result = caseSVGImage(svgImage);
				if (result == null) result = caseWidget(svgImage);
				if (result == null) result = caseLinkSupport(svgImage);
				if (result == null) result = caseColorBackgroundSupport(svgImage);
				if (result == null) result = caseColorForegroundSupport(svgImage);
				if (result == null) result = caseColorAlphaSupport(svgImage);
				if (result == null) result = caseRotationSupport(svgImage);
				if (result == null) result = caseFlipSupport(svgImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreen(Screen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen Ruler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen Ruler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreenRuler(ScreenRuler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ruler Guide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ruler Guide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRulerGuide(RulerGuide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidget(Widget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checkbox</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checkbox</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckbox(Checkbox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombo(Combo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placeholder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placeholder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceholder(Placeholder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radio Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radio Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadioButton(RadioButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextField(TextField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Window</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Window</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindow(Window object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidgetDescriptor(WidgetDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArea(Area object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList(com.wireframesketcher.model.List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Popup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Popup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopup(Popup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenu(Menu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTree(Tree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIcon(Icon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextArea(TextArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Browser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Browser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrowser(Browser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFont(Font object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidgetContainer(WidgetContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidgetGroup(WidgetGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Master</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Master</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaster(Master object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen Font</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen Font</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreenFont(ScreenFont object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontSupport(FontSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Foreground Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Foreground Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorForegroundSupport(ColorForegroundSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Background Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Background Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorBackgroundSupport(ColorBackgroundSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Border Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Border Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorBorderSupport(ColorBorderSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Alpha Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Alpha Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorAlphaSupport(ColorAlphaSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionSupport(SelectionSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Alignment Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Alignment Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextAlignmentSupport(TextAlignmentSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Selection Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Selection Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanSelectionSupport(BooleanSelectionSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNote(Note object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Progress Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Progress Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgressBar(ProgressBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Callout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallout(Callout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchField(SearchField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tooltip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tooltip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTooltip(Tooltip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scratch Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scratch Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScratchOut(ScratchOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Border Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Border Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorderSupport(BorderSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateSupport(StateSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breadcrumbs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breadcrumbs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreadcrumbs(Breadcrumbs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkBar(LinkBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accordion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accordion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccordion(Accordion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertical Scrollbar Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertical Scrollbar Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerticalScrollbarSupport(VerticalScrollbarSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateField(DateField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Player</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Player</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoPlayer(VideoPlayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMap(Map object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cover Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cover Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverFlow(CoverFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tabbed Pane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tabbed Pane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabbedPane(TabbedPane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIconSupport(IconSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HSplitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HSplitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHSplitter(HSplitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSplitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSplitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSplitter(VSplitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSupport(ValueSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Picker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Picker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorPicker(ColorPicker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arrow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arrow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrow(Arrow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curly Brace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curly Brace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurlyBrace(CurlyBrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonBar(ButtonBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Border Style Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Border Style Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorderStyleSupport(BorderStyleSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircle(Circle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangle(Rectangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon Position Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon Position Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIconPositionSupport(IconPositionSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListSupport(ListSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChart(Chart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cross Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cross Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrossOut(CrossOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemSupport(ItemSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkSupport(LinkSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotspot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotspot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotspot(Hotspot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameSupport(NameSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Alternative Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Alternative Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorAlternativeSupport(ColorAlternativeSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Style Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Style Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineStyleSupport(LineStyleSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotation Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotation Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotationSupport(RotationSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flip Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flip Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlipSupport(FlipSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SVG Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SVG Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSVGImage(SVGImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spinner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spinner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpinner(Spinner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HScrollbar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HScrollbar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHScrollbar(HScrollbar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VScrollbar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VScrollbar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVScrollbar(VScrollbar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLine(HLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VLine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VLine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVLine(VLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HSlider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HSlider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHSlider(HSlider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSlider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSlider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSlider(VSlider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tabs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tabs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabs(Tabs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePanel(Panel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
