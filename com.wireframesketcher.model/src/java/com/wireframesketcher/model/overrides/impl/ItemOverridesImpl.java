/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.overrides.impl;

import com.wireframesketcher.model.overrides.ItemOverrides;
import com.wireframesketcher.model.overrides.OverridesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Overrides</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.overrides.impl.ItemOverridesImpl#getText <em>Text</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.impl.ItemOverridesImpl#getLink <em>Link</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.impl.ItemOverridesImpl#isNoLink <em>No Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemOverridesImpl extends ReferenceImpl implements ItemOverrides {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;
	/**
	 * The default value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected static final URI LINK_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected URI link = LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoLink() <em>No Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoLink()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_LINK_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isNoLink() <em>No Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoLink()
	 * @generated
	 * @ordered
	 */
	protected boolean noLink = NO_LINK_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemOverridesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OverridesPackage.Literals.ITEM_OVERRIDES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OverridesPackage.ITEM_OVERRIDES__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(URI newLink) {
		URI oldLink = link;
		link = newLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OverridesPackage.ITEM_OVERRIDES__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoLink() {
		return noLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoLink(boolean newNoLink) {
		boolean oldNoLink = noLink;
		noLink = newNoLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OverridesPackage.ITEM_OVERRIDES__NO_LINK, oldNoLink, noLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OverridesPackage.ITEM_OVERRIDES__TEXT:
				return getText();
			case OverridesPackage.ITEM_OVERRIDES__LINK:
				return getLink();
			case OverridesPackage.ITEM_OVERRIDES__NO_LINK:
				return isNoLink();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OverridesPackage.ITEM_OVERRIDES__TEXT:
				setText((String)newValue);
				return;
			case OverridesPackage.ITEM_OVERRIDES__LINK:
				setLink((URI)newValue);
				return;
			case OverridesPackage.ITEM_OVERRIDES__NO_LINK:
				setNoLink((Boolean)newValue);
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
			case OverridesPackage.ITEM_OVERRIDES__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case OverridesPackage.ITEM_OVERRIDES__LINK:
				setLink(LINK_EDEFAULT);
				return;
			case OverridesPackage.ITEM_OVERRIDES__NO_LINK:
				setNoLink(NO_LINK_EDEFAULT);
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
			case OverridesPackage.ITEM_OVERRIDES__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case OverridesPackage.ITEM_OVERRIDES__LINK:
				return LINK_EDEFAULT == null ? link != null : !LINK_EDEFAULT.equals(link);
			case OverridesPackage.ITEM_OVERRIDES__NO_LINK:
				return noLink != NO_LINK_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (text: ");
		result.append(text);
		result.append(", link: ");
		result.append(link);
		result.append(", noLink: ");
		result.append(noLink);
		result.append(')');
		return result.toString();
	}

} //ItemOverridesImpl
