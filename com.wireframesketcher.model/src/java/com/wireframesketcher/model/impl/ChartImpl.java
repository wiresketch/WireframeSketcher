/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.wireframesketcher.model.Chart;
import com.wireframesketcher.model.ChartType;
import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.SkinSupport;
import com.wireframesketcher.model.ResizeMode;
import com.wireframesketcher.model.WidgetDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.impl.ChartImpl#getSkin <em>Skin</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ChartImpl#getChartType <em>Chart Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChartImpl extends WidgetImpl implements Chart {
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
	 * The default value of the '{@link #getChartType() <em>Chart Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChartType()
	 * @generated
	 * @ordered
	 */
	protected static final ChartType CHART_TYPE_EDEFAULT = ChartType.PIE;

	/**
	 * The cached value of the '{@link #getChartType() <em>Chart Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChartType()
	 * @generated
	 * @ordered
	 */
	protected ChartType chartType = CHART_TYPE_EDEFAULT;

	private static final WidgetDescriptor DESCRIPTOR = describe("Chart", ResizeMode.BOTH_LITERAL, false, false);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ChartImpl() {
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
		return ModelPackage.Literals.CHART;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHART__SKIN, oldSkin, skin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartType getChartType() {
		return chartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChartType(ChartType newChartType) {
		ChartType oldChartType = chartType;
		chartType = newChartType == null ? CHART_TYPE_EDEFAULT : newChartType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHART__CHART_TYPE, oldChartType, chartType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CHART__SKIN:
				return getSkin();
			case ModelPackage.CHART__CHART_TYPE:
				return getChartType();
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
			case ModelPackage.CHART__SKIN:
				setSkin((URI)newValue);
				return;
			case ModelPackage.CHART__CHART_TYPE:
				setChartType((ChartType)newValue);
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
			case ModelPackage.CHART__SKIN:
				setSkin(SKIN_EDEFAULT);
				return;
			case ModelPackage.CHART__CHART_TYPE:
				setChartType(CHART_TYPE_EDEFAULT);
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
			case ModelPackage.CHART__SKIN:
				return SKIN_EDEFAULT == null ? skin != null : !SKIN_EDEFAULT.equals(skin);
			case ModelPackage.CHART__CHART_TYPE:
				return chartType != CHART_TYPE_EDEFAULT;
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
		if (baseClass == SkinSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.CHART__SKIN: return ModelPackage.SKIN_SUPPORT__SKIN;
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
		if (baseClass == SkinSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.SKIN_SUPPORT__SKIN: return ModelPackage.CHART__SKIN;
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
		result.append(" (skin: ");
		result.append(skin);
		result.append(", chartType: ");
		result.append(chartType);
		result.append(')');
		return result.toString();
	}

} //ChartImpl
