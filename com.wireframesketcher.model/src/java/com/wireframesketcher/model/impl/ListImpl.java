/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import com.wireframesketcher.model.BorderSupport;
import com.wireframesketcher.model.ColorAlphaSupport;
import com.wireframesketcher.model.ColorAlternativeSupport;
import com.wireframesketcher.model.ColorBackgroundSupport;
import com.wireframesketcher.model.ColorDesc;
import com.wireframesketcher.model.Font;
import com.wireframesketcher.model.FontSupport;
import com.wireframesketcher.model.Item;
import com.wireframesketcher.model.ItemSupport;
import com.wireframesketcher.model.List;
import com.wireframesketcher.model.ListSupport;
import com.wireframesketcher.model.ModelFactory;
import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.SelectionSupport;
import com.wireframesketcher.model.ValueSupport;
import com.wireframesketcher.model.VerticalScrollbarSupport;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import com.wireframesketcher.model.ResizeMode;
import com.wireframesketcher.model.WidgetDescriptor;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.impl.ListImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ListImpl#isBorder <em>Border</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ListImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ListImpl#isVerticalScrollbar <em>Vertical Scrollbar</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ListImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ListImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ListImpl#getRowHeight <em>Row Height</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ListImpl#isHorizontalLines <em>Horizontal Lines</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ListImpl#getFont <em>Font</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ListImpl#getItems <em>Items</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ListImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ListImpl#isHeader <em>Header</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListImpl extends WidgetImpl implements List {
	/**
	 * The default value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected static final int SELECTION_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected int selection = SELECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBorder()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BORDER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBorder()
	 * @generated
	 * @ordered
	 */
	protected boolean border = BORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isVerticalScrollbar() <em>Vertical Scrollbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerticalScrollbar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERTICAL_SCROLLBAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVerticalScrollbar() <em>Vertical Scrollbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerticalScrollbar()
	 * @generated
	 * @ordered
	 */
	protected boolean verticalScrollbar = VERTICAL_SCROLLBAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final ColorDesc BACKGROUND_EDEFAULT = (ColorDesc)ModelFactory.eINSTANCE.createFromString(ModelPackage.eINSTANCE.getColorDataType(), "white");

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected ColorDesc background = BACKGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final int ALPHA_EDEFAULT = 255;

	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected int alpha = ALPHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowHeight() <em>Row Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRowHeight() <em>Row Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowHeight()
	 * @generated
	 * @ordered
	 */
	protected int rowHeight = ROW_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #isHorizontalLines() <em>Horizontal Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHorizontalLines()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HORIZONTAL_LINES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHorizontalLines() <em>Horizontal Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHorizontalLines()
	 * @generated
	 * @ordered
	 */
	protected boolean horizontalLines = HORIZONTAL_LINES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected Font font;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

	/**
	 * The default value of the '{@link #getAlternative() <em>Alternative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected static final ColorDesc ALTERNATIVE_EDEFAULT = (ColorDesc)ModelFactory.eINSTANCE.createFromString(ModelPackage.eINSTANCE.getColorDataType(), "white");

	/**
	 * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected ColorDesc alternative = ALTERNATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHeader()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HEADER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHeader()
	 * @generated
	 * @ordered
	 */
	protected boolean header = HEADER_EDEFAULT;

	private static final WidgetDescriptor DESCRIPTOR = describe("List", ResizeMode.BOTH_LITERAL, true, true);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ListImpl() {
		super();
		setFont(ModelFactory.eINSTANCE.createFont());
		descriptor = DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(int newSelection) {
		int oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LIST__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBorder() {
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorder(boolean newBorder) {
		boolean oldBorder = border;
		border = newBorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LIST__BORDER, oldBorder, border));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LIST__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVerticalScrollbar() {
		return verticalScrollbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalScrollbar(boolean newVerticalScrollbar) {
		boolean oldVerticalScrollbar = verticalScrollbar;
		verticalScrollbar = newVerticalScrollbar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LIST__VERTICAL_SCROLLBAR, oldVerticalScrollbar, verticalScrollbar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorDesc getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(ColorDesc newBackground) {
		ColorDesc oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LIST__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlpha(int newAlpha) {
		int oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LIST__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRowHeight() {
		return rowHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowHeight(int newRowHeight) {
		int oldRowHeight = rowHeight;
		rowHeight = newRowHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LIST__ROW_HEIGHT, oldRowHeight, rowHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHorizontalLines() {
		return horizontalLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalLines(boolean newHorizontalLines) {
		boolean oldHorizontalLines = horizontalLines;
		horizontalLines = newHorizontalLines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LIST__HORIZONTAL_LINES, oldHorizontalLines, horizontalLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font getFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFont(Font newFont, NotificationChain msgs) {
		Font oldFont = font;
		font = newFont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.LIST__FONT, oldFont, newFont);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont(Font newFont) {
		if (newFont != font) {
			NotificationChain msgs = null;
			if (font != null)
				msgs = ((InternalEObject)font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.LIST__FONT, null, msgs);
			if (newFont != null)
				msgs = ((InternalEObject)newFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.LIST__FONT, null, msgs);
			msgs = basicSetFont(newFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LIST__FONT, newFont, newFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<Item>(Item.class, this, ModelPackage.LIST__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorDesc getAlternative() {
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternative(ColorDesc newAlternative) {
		ColorDesc oldAlternative = alternative;
		alternative = newAlternative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LIST__ALTERNATIVE, oldAlternative, alternative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(boolean newHeader) {
		boolean oldHeader = header;
		header = newHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LIST__HEADER, oldHeader, header));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.LIST__FONT:
				return basicSetFont(null, msgs);
			case ModelPackage.LIST__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.LIST__SELECTION:
				return getSelection();
			case ModelPackage.LIST__BORDER:
				return isBorder();
			case ModelPackage.LIST__VALUE:
				return getValue();
			case ModelPackage.LIST__VERTICAL_SCROLLBAR:
				return isVerticalScrollbar();
			case ModelPackage.LIST__BACKGROUND:
				return getBackground();
			case ModelPackage.LIST__ALPHA:
				return getAlpha();
			case ModelPackage.LIST__ROW_HEIGHT:
				return getRowHeight();
			case ModelPackage.LIST__HORIZONTAL_LINES:
				return isHorizontalLines();
			case ModelPackage.LIST__FONT:
				return getFont();
			case ModelPackage.LIST__ITEMS:
				return getItems();
			case ModelPackage.LIST__ALTERNATIVE:
				return getAlternative();
			case ModelPackage.LIST__HEADER:
				return isHeader();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.LIST__SELECTION:
				setSelection((Integer)newValue);
				return;
			case ModelPackage.LIST__BORDER:
				setBorder((Boolean)newValue);
				return;
			case ModelPackage.LIST__VALUE:
				setValue((Integer)newValue);
				return;
			case ModelPackage.LIST__VERTICAL_SCROLLBAR:
				setVerticalScrollbar((Boolean)newValue);
				return;
			case ModelPackage.LIST__BACKGROUND:
				setBackground((ColorDesc)newValue);
				return;
			case ModelPackage.LIST__ALPHA:
				setAlpha((Integer)newValue);
				return;
			case ModelPackage.LIST__ROW_HEIGHT:
				setRowHeight((Integer)newValue);
				return;
			case ModelPackage.LIST__HORIZONTAL_LINES:
				setHorizontalLines((Boolean)newValue);
				return;
			case ModelPackage.LIST__FONT:
				setFont((Font)newValue);
				return;
			case ModelPackage.LIST__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends Item>)newValue);
				return;
			case ModelPackage.LIST__ALTERNATIVE:
				setAlternative((ColorDesc)newValue);
				return;
			case ModelPackage.LIST__HEADER:
				setHeader((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.LIST__SELECTION:
				setSelection(SELECTION_EDEFAULT);
				return;
			case ModelPackage.LIST__BORDER:
				setBorder(BORDER_EDEFAULT);
				return;
			case ModelPackage.LIST__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ModelPackage.LIST__VERTICAL_SCROLLBAR:
				setVerticalScrollbar(VERTICAL_SCROLLBAR_EDEFAULT);
				return;
			case ModelPackage.LIST__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case ModelPackage.LIST__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case ModelPackage.LIST__ROW_HEIGHT:
				setRowHeight(ROW_HEIGHT_EDEFAULT);
				return;
			case ModelPackage.LIST__HORIZONTAL_LINES:
				setHorizontalLines(HORIZONTAL_LINES_EDEFAULT);
				return;
			case ModelPackage.LIST__FONT:
				setFont((Font)null);
				return;
			case ModelPackage.LIST__ITEMS:
				getItems().clear();
				return;
			case ModelPackage.LIST__ALTERNATIVE:
				setAlternative(ALTERNATIVE_EDEFAULT);
				return;
			case ModelPackage.LIST__HEADER:
				setHeader(HEADER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.LIST__SELECTION:
				return selection != SELECTION_EDEFAULT;
			case ModelPackage.LIST__BORDER:
				return border != BORDER_EDEFAULT;
			case ModelPackage.LIST__VALUE:
				return value != VALUE_EDEFAULT;
			case ModelPackage.LIST__VERTICAL_SCROLLBAR:
				return verticalScrollbar != VERTICAL_SCROLLBAR_EDEFAULT;
			case ModelPackage.LIST__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case ModelPackage.LIST__ALPHA:
				return alpha != ALPHA_EDEFAULT;
			case ModelPackage.LIST__ROW_HEIGHT:
				return rowHeight != ROW_HEIGHT_EDEFAULT;
			case ModelPackage.LIST__HORIZONTAL_LINES:
				return horizontalLines != HORIZONTAL_LINES_EDEFAULT;
			case ModelPackage.LIST__FONT:
				return font != null;
			case ModelPackage.LIST__ITEMS:
				return items != null && !items.isEmpty();
			case ModelPackage.LIST__ALTERNATIVE:
				return ALTERNATIVE_EDEFAULT == null ? alternative != null : !ALTERNATIVE_EDEFAULT.equals(alternative);
			case ModelPackage.LIST__HEADER:
				return header != HEADER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SelectionSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.LIST__SELECTION: return ModelPackage.SELECTION_SUPPORT__SELECTION;
				default: return -1;
			}
		}
		if (baseClass == BorderSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.LIST__BORDER: return ModelPackage.BORDER_SUPPORT__BORDER;
				default: return -1;
			}
		}
		if (baseClass == ValueSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.LIST__VALUE: return ModelPackage.VALUE_SUPPORT__VALUE;
				default: return -1;
			}
		}
		if (baseClass == VerticalScrollbarSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.LIST__VERTICAL_SCROLLBAR: return ModelPackage.VERTICAL_SCROLLBAR_SUPPORT__VERTICAL_SCROLLBAR;
				default: return -1;
			}
		}
		if (baseClass == ColorBackgroundSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.LIST__BACKGROUND: return ModelPackage.COLOR_BACKGROUND_SUPPORT__BACKGROUND;
				default: return -1;
			}
		}
		if (baseClass == ColorAlphaSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.LIST__ALPHA: return ModelPackage.COLOR_ALPHA_SUPPORT__ALPHA;
				default: return -1;
			}
		}
		if (baseClass == ListSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.LIST__ROW_HEIGHT: return ModelPackage.LIST_SUPPORT__ROW_HEIGHT;
				case ModelPackage.LIST__HORIZONTAL_LINES: return ModelPackage.LIST_SUPPORT__HORIZONTAL_LINES;
				default: return -1;
			}
		}
		if (baseClass == FontSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.LIST__FONT: return ModelPackage.FONT_SUPPORT__FONT;
				default: return -1;
			}
		}
		if (baseClass == ItemSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.LIST__ITEMS: return ModelPackage.ITEM_SUPPORT__ITEMS;
				default: return -1;
			}
		}
		if (baseClass == ColorAlternativeSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.LIST__ALTERNATIVE: return ModelPackage.COLOR_ALTERNATIVE_SUPPORT__ALTERNATIVE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SelectionSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.SELECTION_SUPPORT__SELECTION: return ModelPackage.LIST__SELECTION;
				default: return -1;
			}
		}
		if (baseClass == BorderSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.BORDER_SUPPORT__BORDER: return ModelPackage.LIST__BORDER;
				default: return -1;
			}
		}
		if (baseClass == ValueSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.VALUE_SUPPORT__VALUE: return ModelPackage.LIST__VALUE;
				default: return -1;
			}
		}
		if (baseClass == VerticalScrollbarSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.VERTICAL_SCROLLBAR_SUPPORT__VERTICAL_SCROLLBAR: return ModelPackage.LIST__VERTICAL_SCROLLBAR;
				default: return -1;
			}
		}
		if (baseClass == ColorBackgroundSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.COLOR_BACKGROUND_SUPPORT__BACKGROUND: return ModelPackage.LIST__BACKGROUND;
				default: return -1;
			}
		}
		if (baseClass == ColorAlphaSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.COLOR_ALPHA_SUPPORT__ALPHA: return ModelPackage.LIST__ALPHA;
				default: return -1;
			}
		}
		if (baseClass == ListSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.LIST_SUPPORT__ROW_HEIGHT: return ModelPackage.LIST__ROW_HEIGHT;
				case ModelPackage.LIST_SUPPORT__HORIZONTAL_LINES: return ModelPackage.LIST__HORIZONTAL_LINES;
				default: return -1;
			}
		}
		if (baseClass == FontSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.FONT_SUPPORT__FONT: return ModelPackage.LIST__FONT;
				default: return -1;
			}
		}
		if (baseClass == ItemSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.ITEM_SUPPORT__ITEMS: return ModelPackage.LIST__ITEMS;
				default: return -1;
			}
		}
		if (baseClass == ColorAlternativeSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.COLOR_ALTERNATIVE_SUPPORT__ALTERNATIVE: return ModelPackage.LIST__ALTERNATIVE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (selection: ");
		result.append(selection);
		result.append(", border: ");
		result.append(border);
		result.append(", value: ");
		result.append(value);
		result.append(", verticalScrollbar: ");
		result.append(verticalScrollbar);
		result.append(", background: ");
		result.append(background);
		result.append(", alpha: ");
		result.append(alpha);
		result.append(", rowHeight: ");
		result.append(rowHeight);
		result.append(", horizontalLines: ");
		result.append(horizontalLines);
		result.append(", alternative: ");
		result.append(alternative);
		result.append(", header: ");
		result.append(header);
		result.append(')');
		return result.toString();
	}

} //ListImpl