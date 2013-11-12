/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.Chart#getChartType <em>Chart Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.ModelPackage#getChart()
 * @model
 * @generated
 */
public interface Chart extends Widget, SkinSupport {
	/**
	 * Returns the value of the '<em><b>Chart Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.wireframesketcher.model.ChartType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chart Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chart Type</em>' attribute.
	 * @see com.wireframesketcher.model.ChartType
	 * @see #setChartType(ChartType)
	 * @see com.wireframesketcher.model.ModelPackage#getChart_ChartType()
	 * @model
	 * @generated
	 */
	ChartType getChartType();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.Chart#getChartType <em>Chart Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chart Type</em>' attribute.
	 * @see com.wireframesketcher.model.ChartType
	 * @see #getChartType()
	 * @generated
	 */
	void setChartType(ChartType value);

} // Chart
