/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.wireframesketcher.model.LinkSupport;
import com.wireframesketcher.model.Master;
import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.ResizeMode;
import com.wireframesketcher.model.WidgetContainer;
import com.wireframesketcher.model.WidgetDescriptor;
import com.wireframesketcher.model.overrides.Overrides;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Master</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.impl.MasterImpl#getLink <em>Link</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.MasterImpl#getScreen <em>Screen</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.MasterImpl#isDimmed <em>Dimmed</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.MasterImpl#getOverrides <em>Overrides</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.MasterImpl#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MasterImpl extends WidgetImpl implements Master {
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

	private static final WidgetDescriptor DESCRIPTOR = describe("Component", ResizeMode.BOTH_LITERAL, false, false);
	
	/**
	 * The cached value of the '{@link #getScreen() <em>Screen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreen()
	 * @generated
	 * @ordered
	 */
	protected WidgetContainer screen;

	/**
	 * The default value of the '{@link #isDimmed() <em>Dimmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDimmed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIMMED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDimmed() <em>Dimmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDimmed()
	 * @generated
	 * @ordered
	 */
	protected boolean dimmed = DIMMED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOverrides() <em>Overrides</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrides()
	 * @generated
	 * @ordered
	 */
	protected Overrides overrides;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected WidgetContainer instance;

	/**
	 * Abstracts the strategy behind instance attribute computation
	 */
	interface IInstanceStrategy {
		void computeInstance();
	}
	
	/**
	 * Instance computation strategy
	 */
	private IInstanceStrategy instanceStrategy;
	
	IInstanceStrategy getInstanceStrategy() {
		if(instanceStrategy == null)
			instanceStrategy = new OverridesHelper(this);
		return instanceStrategy;
	}
	
	void setInstanceStrategy(IInstanceStrategy instanceStrategy) {
		if(this.instanceStrategy != null)
			throw new IllegalStateException();
		if(instanceStrategy == null)
			throw new NullPointerException();
		this.instanceStrategy = instanceStrategy;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected MasterImpl() {
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
		return ModelPackage.Literals.MASTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MASTER__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetContainer getScreen() {
		if (screen != null && screen.eIsProxy()) {
			InternalEObject oldScreen = (InternalEObject)screen;
			screen = (WidgetContainer)eResolveProxy(oldScreen);
			if (screen != oldScreen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.MASTER__SCREEN, oldScreen, screen));
			}
		}
		return screen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetContainer basicGetScreen() {
		return screen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScreen(WidgetContainer newScreen) {
		WidgetContainer oldScreen = screen;
		screen = newScreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MASTER__SCREEN, oldScreen, screen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDimmed() {
		return dimmed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimmed(boolean newDimmed) {
		boolean oldDimmed = dimmed;
		dimmed = newDimmed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MASTER__DIMMED, oldDimmed, dimmed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Overrides getOverrides() {
		return overrides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverrides(Overrides newOverrides, NotificationChain msgs) {
		Overrides oldOverrides = overrides;
		overrides = newOverrides;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MASTER__OVERRIDES, oldOverrides, newOverrides);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverrides(Overrides newOverrides) {
		if (newOverrides != overrides) {
			NotificationChain msgs = null;
			if (overrides != null)
				msgs = ((InternalEObject)overrides).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MASTER__OVERRIDES, null, msgs);
			if (newOverrides != null)
				msgs = ((InternalEObject)newOverrides).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MASTER__OVERRIDES, null, msgs);
			msgs = basicSetOverrides(newOverrides, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MASTER__OVERRIDES, newOverrides, newOverrides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public WidgetContainer getInstance() {
		getInstanceStrategy().computeInstance();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstance(WidgetContainer newInstance, NotificationChain msgs) {
		WidgetContainer oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MASTER__INSTANCE, oldInstance, newInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(WidgetContainer newInstance) {
		if (newInstance != instance) {
			NotificationChain msgs = null;
			if (instance != null)
				msgs = ((InternalEObject)instance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MASTER__INSTANCE, null, msgs);
			if (newInstance != null)
				msgs = ((InternalEObject)newInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MASTER__INSTANCE, null, msgs);
			msgs = basicSetInstance(newInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MASTER__INSTANCE, newInstance, newInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.MASTER__OVERRIDES:
				return basicSetOverrides(null, msgs);
			case ModelPackage.MASTER__INSTANCE:
				return basicSetInstance(null, msgs);
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
			case ModelPackage.MASTER__LINK:
				return getLink();
			case ModelPackage.MASTER__SCREEN:
				if (resolve) return getScreen();
				return basicGetScreen();
			case ModelPackage.MASTER__DIMMED:
				return isDimmed();
			case ModelPackage.MASTER__OVERRIDES:
				return getOverrides();
			case ModelPackage.MASTER__INSTANCE:
				return getInstance();
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
			case ModelPackage.MASTER__LINK:
				setLink((URI)newValue);
				return;
			case ModelPackage.MASTER__SCREEN:
				setScreen((WidgetContainer)newValue);
				return;
			case ModelPackage.MASTER__DIMMED:
				setDimmed((Boolean)newValue);
				return;
			case ModelPackage.MASTER__OVERRIDES:
				setOverrides((Overrides)newValue);
				return;
			case ModelPackage.MASTER__INSTANCE:
				setInstance((WidgetContainer)newValue);
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
			case ModelPackage.MASTER__LINK:
				setLink(LINK_EDEFAULT);
				return;
			case ModelPackage.MASTER__SCREEN:
				setScreen((WidgetContainer)null);
				return;
			case ModelPackage.MASTER__DIMMED:
				setDimmed(DIMMED_EDEFAULT);
				return;
			case ModelPackage.MASTER__OVERRIDES:
				setOverrides((Overrides)null);
				return;
			case ModelPackage.MASTER__INSTANCE:
				setInstance((WidgetContainer)null);
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
			case ModelPackage.MASTER__LINK:
				return LINK_EDEFAULT == null ? link != null : !LINK_EDEFAULT.equals(link);
			case ModelPackage.MASTER__SCREEN:
				return screen != null;
			case ModelPackage.MASTER__DIMMED:
				return dimmed != DIMMED_EDEFAULT;
			case ModelPackage.MASTER__OVERRIDES:
				return overrides != null;
			case ModelPackage.MASTER__INSTANCE:
				return instance != null;
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
		if (baseClass == LinkSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.MASTER__LINK: return ModelPackage.LINK_SUPPORT__LINK;
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
		if (baseClass == LinkSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.LINK_SUPPORT__LINK: return ModelPackage.MASTER__LINK;
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
		result.append(" (link: ");
		result.append(link);
		result.append(", dimmed: ");
		result.append(dimmed);
		result.append(')');
		return result.toString();
	}

} //MasterImpl
