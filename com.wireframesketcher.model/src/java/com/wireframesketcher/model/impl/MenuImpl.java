/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import com.wireframesketcher.model.IconDesc;
import com.wireframesketcher.model.IconSupport;
import com.wireframesketcher.model.Item;
import com.wireframesketcher.model.ItemSupport;
import com.wireframesketcher.model.Menu;
import com.wireframesketcher.model.ModelFactory;
import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.Rotation90;
import com.wireframesketcher.model.SelectionSupport;
import com.wireframesketcher.model.SkinSupport;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import com.wireframesketcher.model.ResizeMode;
import com.wireframesketcher.model.WidgetDescriptor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.impl.MenuImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.MenuImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.MenuImpl#getIconRotation <em>Icon Rotation</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.MenuImpl#getItems <em>Items</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.MenuImpl#getSkin <em>Skin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuImpl extends WidgetImpl implements Menu {
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
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final IconDesc ICON_EDEFAULT = (IconDesc)ModelFactory.eINSTANCE.createFromString(ModelPackage.eINSTANCE.getIconDataType(), "");
	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected IconDesc icon = ICON_EDEFAULT;
	/**
	 * The default value of the '{@link #getIconRotation() <em>Icon Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconRotation()
	 * @generated
	 * @ordered
	 */
	protected static final Rotation90 ICON_ROTATION_EDEFAULT = Rotation90._0;
	/**
	 * The cached value of the '{@link #getIconRotation() <em>Icon Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconRotation()
	 * @generated
	 * @ordered
	 */
	protected Rotation90 iconRotation = ICON_ROTATION_EDEFAULT;
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
	private static final WidgetDescriptor DESCRIPTOR = describe("Menu", ResizeMode.HORIZONTAL_LITERAL);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected MenuImpl() {
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
		return ModelPackage.Literals.MENU;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MENU__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconDesc getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(IconDesc newIcon) {
		IconDesc oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MENU__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotation90 getIconRotation() {
		return iconRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconRotation(Rotation90 newIconRotation) {
		Rotation90 oldIconRotation = iconRotation;
		iconRotation = newIconRotation == null ? ICON_ROTATION_EDEFAULT : newIconRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MENU__ICON_ROTATION, oldIconRotation, iconRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<Item>(Item.class, this, ModelPackage.MENU__ITEMS);
		}
		return items;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MENU__SKIN, oldSkin, skin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.MENU__ITEMS:
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
			case ModelPackage.MENU__SELECTION:
				return getSelection();
			case ModelPackage.MENU__ICON:
				return getIcon();
			case ModelPackage.MENU__ICON_ROTATION:
				return getIconRotation();
			case ModelPackage.MENU__ITEMS:
				return getItems();
			case ModelPackage.MENU__SKIN:
				return getSkin();
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
			case ModelPackage.MENU__SELECTION:
				setSelection((Integer)newValue);
				return;
			case ModelPackage.MENU__ICON:
				setIcon((IconDesc)newValue);
				return;
			case ModelPackage.MENU__ICON_ROTATION:
				setIconRotation((Rotation90)newValue);
				return;
			case ModelPackage.MENU__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends Item>)newValue);
				return;
			case ModelPackage.MENU__SKIN:
				setSkin((URI)newValue);
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
			case ModelPackage.MENU__SELECTION:
				setSelection(SELECTION_EDEFAULT);
				return;
			case ModelPackage.MENU__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case ModelPackage.MENU__ICON_ROTATION:
				setIconRotation(ICON_ROTATION_EDEFAULT);
				return;
			case ModelPackage.MENU__ITEMS:
				getItems().clear();
				return;
			case ModelPackage.MENU__SKIN:
				setSkin(SKIN_EDEFAULT);
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
			case ModelPackage.MENU__SELECTION:
				return selection != SELECTION_EDEFAULT;
			case ModelPackage.MENU__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case ModelPackage.MENU__ICON_ROTATION:
				return iconRotation != ICON_ROTATION_EDEFAULT;
			case ModelPackage.MENU__ITEMS:
				return items != null && !items.isEmpty();
			case ModelPackage.MENU__SKIN:
				return SKIN_EDEFAULT == null ? skin != null : !SKIN_EDEFAULT.equals(skin);
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
				case ModelPackage.MENU__SELECTION: return ModelPackage.SELECTION_SUPPORT__SELECTION;
				default: return -1;
			}
		}
		if (baseClass == IconSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.MENU__ICON: return ModelPackage.ICON_SUPPORT__ICON;
				case ModelPackage.MENU__ICON_ROTATION: return ModelPackage.ICON_SUPPORT__ICON_ROTATION;
				default: return -1;
			}
		}
		if (baseClass == ItemSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.MENU__ITEMS: return ModelPackage.ITEM_SUPPORT__ITEMS;
				default: return -1;
			}
		}
		if (baseClass == SkinSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.MENU__SKIN: return ModelPackage.SKIN_SUPPORT__SKIN;
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
				case ModelPackage.SELECTION_SUPPORT__SELECTION: return ModelPackage.MENU__SELECTION;
				default: return -1;
			}
		}
		if (baseClass == IconSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.ICON_SUPPORT__ICON: return ModelPackage.MENU__ICON;
				case ModelPackage.ICON_SUPPORT__ICON_ROTATION: return ModelPackage.MENU__ICON_ROTATION;
				default: return -1;
			}
		}
		if (baseClass == ItemSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.ITEM_SUPPORT__ITEMS: return ModelPackage.MENU__ITEMS;
				default: return -1;
			}
		}
		if (baseClass == SkinSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.SKIN_SUPPORT__SKIN: return ModelPackage.MENU__SKIN;
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
		result.append(", icon: ");
		result.append(icon);
		result.append(", iconRotation: ");
		result.append(iconRotation);
		result.append(", skin: ");
		result.append(skin);
		result.append(')');
		return result.toString();
	}

} //MenuImpl