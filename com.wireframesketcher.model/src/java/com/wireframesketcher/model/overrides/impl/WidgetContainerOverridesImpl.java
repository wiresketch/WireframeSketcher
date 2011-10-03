/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.overrides.impl;

import com.wireframesketcher.model.overrides.Operation;
import com.wireframesketcher.model.overrides.OverridesPackage;
import com.wireframesketcher.model.overrides.WidgetContainerOverrides;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget Container Overrides</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.overrides.impl.WidgetContainerOverridesImpl#getWidgetChanges <em>Widget Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WidgetContainerOverridesImpl extends EObjectImpl implements WidgetContainerOverrides {
	/**
	 * The cached value of the '{@link #getWidgetChanges() <em>Widget Changes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetChanges()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> widgetChanges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetContainerOverridesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OverridesPackage.Literals.WIDGET_CONTAINER_OVERRIDES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getWidgetChanges() {
		if (widgetChanges == null) {
			widgetChanges = new EObjectContainmentEList<Operation>(Operation.class, this, OverridesPackage.WIDGET_CONTAINER_OVERRIDES__WIDGET_CHANGES);
		}
		return widgetChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OverridesPackage.WIDGET_CONTAINER_OVERRIDES__WIDGET_CHANGES:
				return ((InternalEList<?>)getWidgetChanges()).basicRemove(otherEnd, msgs);
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
			case OverridesPackage.WIDGET_CONTAINER_OVERRIDES__WIDGET_CHANGES:
				return getWidgetChanges();
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
			case OverridesPackage.WIDGET_CONTAINER_OVERRIDES__WIDGET_CHANGES:
				getWidgetChanges().clear();
				getWidgetChanges().addAll((Collection<? extends Operation>)newValue);
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
			case OverridesPackage.WIDGET_CONTAINER_OVERRIDES__WIDGET_CHANGES:
				getWidgetChanges().clear();
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
			case OverridesPackage.WIDGET_CONTAINER_OVERRIDES__WIDGET_CHANGES:
				return widgetChanges != null && !widgetChanges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WidgetContainerOverridesImpl
