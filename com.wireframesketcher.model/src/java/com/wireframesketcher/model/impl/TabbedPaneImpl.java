/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import com.wireframesketcher.model.ColorAlphaSupport;
import com.wireframesketcher.model.ColorBackgroundSupport;
import com.wireframesketcher.model.ColorDesc;
import com.wireframesketcher.model.Font;
import com.wireframesketcher.model.FontSupport;
import com.wireframesketcher.model.Item;
import com.wireframesketcher.model.ItemSupport;
import com.wireframesketcher.model.ModelFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.Position;
import com.wireframesketcher.model.ResizeMode;
import com.wireframesketcher.model.SelectionSupport;
import com.wireframesketcher.model.SkinSupport;
import com.wireframesketcher.model.TabbedPane;
import com.wireframesketcher.model.ValueSupport;
import com.wireframesketcher.model.VerticalScrollbarSupport;
import java.util.Collection;
import com.wireframesketcher.model.WidgetDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tabbed Pane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.impl.TabbedPaneImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.TabbedPaneImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.TabbedPaneImpl#isVerticalScrollbar <em>Vertical Scrollbar</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.TabbedPaneImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.TabbedPaneImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.TabbedPaneImpl#getItems <em>Items</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.TabbedPaneImpl#getFont <em>Font</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.TabbedPaneImpl#getSkin <em>Skin</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.TabbedPaneImpl#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TabbedPaneImpl extends WidgetImpl implements TabbedPane {
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
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

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
	 * The default value of the '{@link #getSkin() <em>Skin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkin()
	 * @generated
	 * @ordered
	 */
	protected static final URI SKIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkin() <em>Skin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkin()
	 * @generated
	 * @ordered
	 */
	protected URI skin = SKIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Position POSITION_EDEFAULT = Position.TOP;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position = POSITION_EDEFAULT;

	private static final WidgetDescriptor DESCRIPTOR = describe("Tabbed Pane", ResizeMode.BOTH_LITERAL, true, true);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected TabbedPaneImpl() {
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
		return ModelPackage.Literals.TABBED_PANE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TABBED_PANE__SELECTION, oldSelection, selection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TABBED_PANE__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TABBED_PANE__VERTICAL_SCROLLBAR, oldVerticalScrollbar, verticalScrollbar));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TABBED_PANE__BACKGROUND, oldBackground, background));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TABBED_PANE__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<Item>(Item.class, this, ModelPackage.TABBED_PANE__ITEMS);
		}
		return items;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.TABBED_PANE__FONT, oldFont, newFont);
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
				msgs = ((InternalEObject)font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TABBED_PANE__FONT, null, msgs);
			if (newFont != null)
				msgs = ((InternalEObject)newFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TABBED_PANE__FONT, null, msgs);
			msgs = basicSetFont(newFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TABBED_PANE__FONT, newFont, newFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getSkin() {
		return skin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkin(URI newSkin) {
		URI oldSkin = skin;
		skin = newSkin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TABBED_PANE__SKIN, oldSkin, skin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setPosition(Position newPosition) {
		newPosition = toValidPosition(newPosition);

		Position oldPosition = position;
		position = newPosition == null ? POSITION_EDEFAULT : newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TABBED_PANE__POSITION, oldPosition, position));
	}

	private static Position toValidPosition(Position position) {
		if (position != null
				&& !(position == Position.TOP || position == Position.BOTTOM
						|| position == Position.LEFT || position == Position.RIGHT)) {
			position = POSITION_EDEFAULT;
		}

		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.TABBED_PANE__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
			case ModelPackage.TABBED_PANE__FONT:
				return basicSetFont(null, msgs);
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
			case ModelPackage.TABBED_PANE__SELECTION:
				return getSelection();
			case ModelPackage.TABBED_PANE__VALUE:
				return getValue();
			case ModelPackage.TABBED_PANE__VERTICAL_SCROLLBAR:
				return isVerticalScrollbar();
			case ModelPackage.TABBED_PANE__BACKGROUND:
				return getBackground();
			case ModelPackage.TABBED_PANE__ALPHA:
				return getAlpha();
			case ModelPackage.TABBED_PANE__ITEMS:
				return getItems();
			case ModelPackage.TABBED_PANE__FONT:
				return getFont();
			case ModelPackage.TABBED_PANE__SKIN:
				return getSkin();
			case ModelPackage.TABBED_PANE__POSITION:
				return getPosition();
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
			case ModelPackage.TABBED_PANE__SELECTION:
				setSelection((Integer)newValue);
				return;
			case ModelPackage.TABBED_PANE__VALUE:
				setValue((Integer)newValue);
				return;
			case ModelPackage.TABBED_PANE__VERTICAL_SCROLLBAR:
				setVerticalScrollbar((Boolean)newValue);
				return;
			case ModelPackage.TABBED_PANE__BACKGROUND:
				setBackground((ColorDesc)newValue);
				return;
			case ModelPackage.TABBED_PANE__ALPHA:
				setAlpha((Integer)newValue);
				return;
			case ModelPackage.TABBED_PANE__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends Item>)newValue);
				return;
			case ModelPackage.TABBED_PANE__FONT:
				setFont((Font)newValue);
				return;
			case ModelPackage.TABBED_PANE__SKIN:
				setSkin((URI)newValue);
				return;
			case ModelPackage.TABBED_PANE__POSITION:
				setPosition((Position)newValue);
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
			case ModelPackage.TABBED_PANE__SELECTION:
				setSelection(SELECTION_EDEFAULT);
				return;
			case ModelPackage.TABBED_PANE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ModelPackage.TABBED_PANE__VERTICAL_SCROLLBAR:
				setVerticalScrollbar(VERTICAL_SCROLLBAR_EDEFAULT);
				return;
			case ModelPackage.TABBED_PANE__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case ModelPackage.TABBED_PANE__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case ModelPackage.TABBED_PANE__ITEMS:
				getItems().clear();
				return;
			case ModelPackage.TABBED_PANE__FONT:
				setFont((Font)null);
				return;
			case ModelPackage.TABBED_PANE__SKIN:
				setSkin(SKIN_EDEFAULT);
				return;
			case ModelPackage.TABBED_PANE__POSITION:
				setPosition(POSITION_EDEFAULT);
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
			case ModelPackage.TABBED_PANE__SELECTION:
				return selection != SELECTION_EDEFAULT;
			case ModelPackage.TABBED_PANE__VALUE:
				return value != VALUE_EDEFAULT;
			case ModelPackage.TABBED_PANE__VERTICAL_SCROLLBAR:
				return verticalScrollbar != VERTICAL_SCROLLBAR_EDEFAULT;
			case ModelPackage.TABBED_PANE__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case ModelPackage.TABBED_PANE__ALPHA:
				return alpha != ALPHA_EDEFAULT;
			case ModelPackage.TABBED_PANE__ITEMS:
				return items != null && !items.isEmpty();
			case ModelPackage.TABBED_PANE__FONT:
				return font != null;
			case ModelPackage.TABBED_PANE__SKIN:
				return SKIN_EDEFAULT == null ? skin != null : !SKIN_EDEFAULT.equals(skin);
			case ModelPackage.TABBED_PANE__POSITION:
				return position != POSITION_EDEFAULT;
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
				case ModelPackage.TABBED_PANE__SELECTION: return ModelPackage.SELECTION_SUPPORT__SELECTION;
				default: return -1;
			}
		}
		if (baseClass == ValueSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.TABBED_PANE__VALUE: return ModelPackage.VALUE_SUPPORT__VALUE;
				default: return -1;
			}
		}
		if (baseClass == VerticalScrollbarSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.TABBED_PANE__VERTICAL_SCROLLBAR: return ModelPackage.VERTICAL_SCROLLBAR_SUPPORT__VERTICAL_SCROLLBAR;
				default: return -1;
			}
		}
		if (baseClass == ColorBackgroundSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.TABBED_PANE__BACKGROUND: return ModelPackage.COLOR_BACKGROUND_SUPPORT__BACKGROUND;
				default: return -1;
			}
		}
		if (baseClass == ColorAlphaSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.TABBED_PANE__ALPHA: return ModelPackage.COLOR_ALPHA_SUPPORT__ALPHA;
				default: return -1;
			}
		}
		if (baseClass == ItemSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.TABBED_PANE__ITEMS: return ModelPackage.ITEM_SUPPORT__ITEMS;
				default: return -1;
			}
		}
		if (baseClass == FontSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.TABBED_PANE__FONT: return ModelPackage.FONT_SUPPORT__FONT;
				default: return -1;
			}
		}
		if (baseClass == SkinSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.TABBED_PANE__SKIN: return ModelPackage.SKIN_SUPPORT__SKIN;
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
				case ModelPackage.SELECTION_SUPPORT__SELECTION: return ModelPackage.TABBED_PANE__SELECTION;
				default: return -1;
			}
		}
		if (baseClass == ValueSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.VALUE_SUPPORT__VALUE: return ModelPackage.TABBED_PANE__VALUE;
				default: return -1;
			}
		}
		if (baseClass == VerticalScrollbarSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.VERTICAL_SCROLLBAR_SUPPORT__VERTICAL_SCROLLBAR: return ModelPackage.TABBED_PANE__VERTICAL_SCROLLBAR;
				default: return -1;
			}
		}
		if (baseClass == ColorBackgroundSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.COLOR_BACKGROUND_SUPPORT__BACKGROUND: return ModelPackage.TABBED_PANE__BACKGROUND;
				default: return -1;
			}
		}
		if (baseClass == ColorAlphaSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.COLOR_ALPHA_SUPPORT__ALPHA: return ModelPackage.TABBED_PANE__ALPHA;
				default: return -1;
			}
		}
		if (baseClass == ItemSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.ITEM_SUPPORT__ITEMS: return ModelPackage.TABBED_PANE__ITEMS;
				default: return -1;
			}
		}
		if (baseClass == FontSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.FONT_SUPPORT__FONT: return ModelPackage.TABBED_PANE__FONT;
				default: return -1;
			}
		}
		if (baseClass == SkinSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.SKIN_SUPPORT__SKIN: return ModelPackage.TABBED_PANE__SKIN;
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
		result.append(", value: ");
		result.append(value);
		result.append(", verticalScrollbar: ");
		result.append(verticalScrollbar);
		result.append(", background: ");
		result.append(background);
		result.append(", alpha: ");
		result.append(alpha);
		result.append(", skin: ");
		result.append(skin);
		result.append(", position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //TabbedPaneImpl
