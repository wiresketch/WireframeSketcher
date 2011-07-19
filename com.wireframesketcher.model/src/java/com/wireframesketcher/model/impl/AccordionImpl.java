/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import com.wireframesketcher.model.Accordion;
import com.wireframesketcher.model.Item;
import com.wireframesketcher.model.ItemSupport;
import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.ResizeMode;
import com.wireframesketcher.model.SelectionSupport;
import com.wireframesketcher.model.ValueSupport;
import com.wireframesketcher.model.VerticalScrollbarSupport;
import java.util.Collection;
import com.wireframesketcher.model.WidgetDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accordion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.impl.AccordionImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.AccordionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.AccordionImpl#isVerticalScrollbar <em>Vertical Scrollbar</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.AccordionImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccordionImpl extends WidgetImpl implements Accordion {
	/**
	 * The default value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected String selection = SELECTION_EDEFAULT;

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
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

	private static final WidgetDescriptor DESCRIPTOR = describe("Accordion", ResizeMode.BOTH_LITERAL, true, true);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected AccordionImpl() {
		super();
		descriptor = DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ACCORDION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(String newSelection) {
		String oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACCORDION__SELECTION, oldSelection, selection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACCORDION__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACCORDION__VERTICAL_SCROLLBAR, oldVerticalScrollbar, verticalScrollbar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<Item>(Item.class, this, ModelPackage.ACCORDION__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ACCORDION__ITEMS:
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
			case ModelPackage.ACCORDION__SELECTION:
				return getSelection();
			case ModelPackage.ACCORDION__VALUE:
				return new Integer(getValue());
			case ModelPackage.ACCORDION__VERTICAL_SCROLLBAR:
				return isVerticalScrollbar() ? Boolean.TRUE : Boolean.FALSE;
			case ModelPackage.ACCORDION__ITEMS:
				return getItems();
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
			case ModelPackage.ACCORDION__SELECTION:
				setSelection((String)newValue);
				return;
			case ModelPackage.ACCORDION__VALUE:
				setValue(((Integer)newValue).intValue());
				return;
			case ModelPackage.ACCORDION__VERTICAL_SCROLLBAR:
				setVerticalScrollbar(((Boolean)newValue).booleanValue());
				return;
			case ModelPackage.ACCORDION__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends Item>)newValue);
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
			case ModelPackage.ACCORDION__SELECTION:
				setSelection(SELECTION_EDEFAULT);
				return;
			case ModelPackage.ACCORDION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ModelPackage.ACCORDION__VERTICAL_SCROLLBAR:
				setVerticalScrollbar(VERTICAL_SCROLLBAR_EDEFAULT);
				return;
			case ModelPackage.ACCORDION__ITEMS:
				getItems().clear();
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
			case ModelPackage.ACCORDION__SELECTION:
				return SELECTION_EDEFAULT == null ? selection != null : !SELECTION_EDEFAULT.equals(selection);
			case ModelPackage.ACCORDION__VALUE:
				return value != VALUE_EDEFAULT;
			case ModelPackage.ACCORDION__VERTICAL_SCROLLBAR:
				return verticalScrollbar != VERTICAL_SCROLLBAR_EDEFAULT;
			case ModelPackage.ACCORDION__ITEMS:
				return items != null && !items.isEmpty();
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
				case ModelPackage.ACCORDION__SELECTION: return ModelPackage.SELECTION_SUPPORT__SELECTION;
				default: return -1;
			}
		}
		if (baseClass == ValueSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.ACCORDION__VALUE: return ModelPackage.VALUE_SUPPORT__VALUE;
				default: return -1;
			}
		}
		if (baseClass == VerticalScrollbarSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.ACCORDION__VERTICAL_SCROLLBAR: return ModelPackage.VERTICAL_SCROLLBAR_SUPPORT__VERTICAL_SCROLLBAR;
				default: return -1;
			}
		}
		if (baseClass == ItemSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.ACCORDION__ITEMS: return ModelPackage.ITEM_SUPPORT__ITEMS;
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
				case ModelPackage.SELECTION_SUPPORT__SELECTION: return ModelPackage.ACCORDION__SELECTION;
				default: return -1;
			}
		}
		if (baseClass == ValueSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.VALUE_SUPPORT__VALUE: return ModelPackage.ACCORDION__VALUE;
				default: return -1;
			}
		}
		if (baseClass == VerticalScrollbarSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.VERTICAL_SCROLLBAR_SUPPORT__VERTICAL_SCROLLBAR: return ModelPackage.ACCORDION__VERTICAL_SCROLLBAR;
				default: return -1;
			}
		}
		if (baseClass == ItemSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.ITEM_SUPPORT__ITEMS: return ModelPackage.ACCORDION__ITEMS;
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
		result.append(')');
		return result.toString();
	}

} //AccordionImpl
