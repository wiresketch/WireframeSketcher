/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.story.impl;

import com.wireframesketcher.model.Screen;

import com.wireframesketcher.model.story.Panel;
import com.wireframesketcher.model.story.StoryPackage;

import com.wireframesketcher.model.story.Storyboard;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.story.impl.PanelImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.wireframesketcher.model.story.impl.PanelImpl#getScreen <em>Screen</em>}</li>
 *   <li>{@link com.wireframesketcher.model.story.impl.PanelImpl#getStory <em>Story</em>}</li>
 *   <li>{@link com.wireframesketcher.model.story.impl.PanelImpl#getX <em>X</em>}</li>
 *   <li>{@link com.wireframesketcher.model.story.impl.PanelImpl#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PanelImpl extends EObjectImpl implements Panel {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScreen() <em>Screen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreen()
	 * @generated
	 * @ordered
	 */
	protected Screen screen;

	/**
	 * The cached value of the '{@link #getStory() <em>Story</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStory()
	 * @generated
	 * @ordered
	 */
	protected Storyboard story;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = -2147483648;
	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;
	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = -2147483648;
	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StoryPackage.Literals.PANEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StoryPackage.PANEL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screen getScreen() {
		if (screen != null && screen.eIsProxy()) {
			InternalEObject oldScreen = (InternalEObject)screen;
			screen = (Screen)eResolveProxy(oldScreen);
			if (screen != oldScreen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StoryPackage.PANEL__SCREEN, oldScreen, screen));
			}
		}
		return screen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screen basicGetScreen() {
		return screen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScreen(Screen newScreen) {
		Screen oldScreen = screen;
		screen = newScreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StoryPackage.PANEL__SCREEN, oldScreen, screen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storyboard getStory() {
		if (story != null && story.eIsProxy()) {
			InternalEObject oldStory = (InternalEObject)story;
			story = (Storyboard)eResolveProxy(oldStory);
			if (story != oldStory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StoryPackage.PANEL__STORY, oldStory, story));
			}
		}
		return story;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storyboard basicGetStory() {
		return story;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStory(Storyboard newStory) {
		Storyboard oldStory = story;
		story = newStory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StoryPackage.PANEL__STORY, oldStory, story));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StoryPackage.PANEL__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StoryPackage.PANEL__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StoryPackage.PANEL__ID:
				return getId();
			case StoryPackage.PANEL__SCREEN:
				if (resolve) return getScreen();
				return basicGetScreen();
			case StoryPackage.PANEL__STORY:
				if (resolve) return getStory();
				return basicGetStory();
			case StoryPackage.PANEL__X:
				return getX();
			case StoryPackage.PANEL__Y:
				return getY();
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
			case StoryPackage.PANEL__ID:
				setId((String)newValue);
				return;
			case StoryPackage.PANEL__SCREEN:
				setScreen((Screen)newValue);
				return;
			case StoryPackage.PANEL__STORY:
				setStory((Storyboard)newValue);
				return;
			case StoryPackage.PANEL__X:
				setX((Integer)newValue);
				return;
			case StoryPackage.PANEL__Y:
				setY((Integer)newValue);
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
			case StoryPackage.PANEL__ID:
				setId(ID_EDEFAULT);
				return;
			case StoryPackage.PANEL__SCREEN:
				setScreen((Screen)null);
				return;
			case StoryPackage.PANEL__STORY:
				setStory((Storyboard)null);
				return;
			case StoryPackage.PANEL__X:
				setX(X_EDEFAULT);
				return;
			case StoryPackage.PANEL__Y:
				setY(Y_EDEFAULT);
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
			case StoryPackage.PANEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case StoryPackage.PANEL__SCREEN:
				return screen != null;
			case StoryPackage.PANEL__STORY:
				return story != null;
			case StoryPackage.PANEL__X:
				return x != X_EDEFAULT;
			case StoryPackage.PANEL__Y:
				return y != Y_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(')');
		return result.toString();
	}

} //PanelImpl
