/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.Screen;
import com.wireframesketcher.model.ScreenFont;
import com.wireframesketcher.model.ScreenRuler;
import com.wireframesketcher.model.Theme;
import com.wireframesketcher.model.Widget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.impl.ScreenImpl#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ScreenImpl#getHRuler <em>HRuler</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ScreenImpl#getVRuler <em>VRuler</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ScreenImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ScreenImpl#getFont <em>Font</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ScreenImpl#getTheme <em>Theme</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScreenImpl extends EObjectImpl implements Screen {
	/**
	 * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgets()
	 * @generated
	 * @ordered
	 */
	protected EList<Widget> widgets;

	/**
	 * The cached value of the '{@link #getHRuler() <em>HRuler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHRuler()
	 * @generated
	 * @ordered
	 */
	protected ScreenRuler hRuler;

	/**
	 * The cached value of the '{@link #getVRuler() <em>VRuler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVRuler()
	 * @generated
	 * @ordered
	 */
	protected ScreenRuler vRuler;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected ScreenFont font;

	/**
	 * The default value of the '{@link #getTheme() <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheme()
	 * @generated
	 * @ordered
	 */
	protected static final Theme THEME_EDEFAULT = Theme.DEFAULT;

	/**
	 * The cached value of the '{@link #getTheme() <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheme()
	 * @generated
	 * @ordered
	 */
	protected Theme theme = THEME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScreenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SCREEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenRuler getHRuler() {
		return hRuler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHRuler(ScreenRuler newHRuler, NotificationChain msgs) {
		ScreenRuler oldHRuler = hRuler;
		hRuler = newHRuler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SCREEN__HRULER, oldHRuler, newHRuler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHRuler(ScreenRuler newHRuler) {
		if (newHRuler != hRuler) {
			NotificationChain msgs = null;
			if (hRuler != null)
				msgs = ((InternalEObject)hRuler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SCREEN__HRULER, null, msgs);
			if (newHRuler != null)
				msgs = ((InternalEObject)newHRuler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SCREEN__HRULER, null, msgs);
			msgs = basicSetHRuler(newHRuler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SCREEN__HRULER, newHRuler, newHRuler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenRuler getVRuler() {
		return vRuler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVRuler(ScreenRuler newVRuler, NotificationChain msgs) {
		ScreenRuler oldVRuler = vRuler;
		vRuler = newVRuler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SCREEN__VRULER, oldVRuler, newVRuler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVRuler(ScreenRuler newVRuler) {
		if (newVRuler != vRuler) {
			NotificationChain msgs = null;
			if (vRuler != null)
				msgs = ((InternalEObject)vRuler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SCREEN__VRULER, null, msgs);
			if (newVRuler != null)
				msgs = ((InternalEObject)newVRuler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SCREEN__VRULER, null, msgs);
			msgs = basicSetVRuler(newVRuler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SCREEN__VRULER, newVRuler, newVRuler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SCREEN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenFont getFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFont(ScreenFont newFont, NotificationChain msgs) {
		ScreenFont oldFont = font;
		font = newFont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SCREEN__FONT, oldFont, newFont);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont(ScreenFont newFont) {
		if (newFont != font) {
			NotificationChain msgs = null;
			if (font != null)
				msgs = ((InternalEObject)font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SCREEN__FONT, null, msgs);
			if (newFont != null)
				msgs = ((InternalEObject)newFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SCREEN__FONT, null, msgs);
			msgs = basicSetFont(newFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SCREEN__FONT, newFont, newFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Theme getTheme() {
		return theme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheme(Theme newTheme) {
		Theme oldTheme = theme;
		theme = newTheme == null ? THEME_EDEFAULT : newTheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SCREEN__THEME, oldTheme, theme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SCREEN__WIDGETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWidgets()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Widget> getWidgets() {
		if (widgets == null) {
			widgets = new EObjectContainmentWithInverseEList<Widget>(Widget.class, this, ModelPackage.SCREEN__WIDGETS, ModelPackage.WIDGET__CONTAINER);
		}
		return widgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SCREEN__WIDGETS:
				return ((InternalEList<?>)getWidgets()).basicRemove(otherEnd, msgs);
			case ModelPackage.SCREEN__HRULER:
				return basicSetHRuler(null, msgs);
			case ModelPackage.SCREEN__VRULER:
				return basicSetVRuler(null, msgs);
			case ModelPackage.SCREEN__FONT:
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
			case ModelPackage.SCREEN__WIDGETS:
				return getWidgets();
			case ModelPackage.SCREEN__HRULER:
				return getHRuler();
			case ModelPackage.SCREEN__VRULER:
				return getVRuler();
			case ModelPackage.SCREEN__NAME:
				return getName();
			case ModelPackage.SCREEN__FONT:
				return getFont();
			case ModelPackage.SCREEN__THEME:
				return getTheme();
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
			case ModelPackage.SCREEN__WIDGETS:
				getWidgets().clear();
				getWidgets().addAll((Collection<? extends Widget>)newValue);
				return;
			case ModelPackage.SCREEN__HRULER:
				setHRuler((ScreenRuler)newValue);
				return;
			case ModelPackage.SCREEN__VRULER:
				setVRuler((ScreenRuler)newValue);
				return;
			case ModelPackage.SCREEN__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.SCREEN__FONT:
				setFont((ScreenFont)newValue);
				return;
			case ModelPackage.SCREEN__THEME:
				setTheme((Theme)newValue);
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
			case ModelPackage.SCREEN__WIDGETS:
				getWidgets().clear();
				return;
			case ModelPackage.SCREEN__HRULER:
				setHRuler((ScreenRuler)null);
				return;
			case ModelPackage.SCREEN__VRULER:
				setVRuler((ScreenRuler)null);
				return;
			case ModelPackage.SCREEN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.SCREEN__FONT:
				setFont((ScreenFont)null);
				return;
			case ModelPackage.SCREEN__THEME:
				setTheme(THEME_EDEFAULT);
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
			case ModelPackage.SCREEN__WIDGETS:
				return widgets != null && !widgets.isEmpty();
			case ModelPackage.SCREEN__HRULER:
				return hRuler != null;
			case ModelPackage.SCREEN__VRULER:
				return vRuler != null;
			case ModelPackage.SCREEN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.SCREEN__FONT:
				return font != null;
			case ModelPackage.SCREEN__THEME:
				return theme != THEME_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", theme: ");
		result.append(theme);
		result.append(')');
		return result.toString();
	}

} //ScreenImpl