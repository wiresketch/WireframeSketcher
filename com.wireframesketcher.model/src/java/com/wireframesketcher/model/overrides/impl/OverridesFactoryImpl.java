/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.overrides.impl;

import com.wireframesketcher.model.overrides.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OverridesFactoryImpl extends EFactoryImpl implements OverridesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OverridesFactory init() {
		try {
			OverridesFactory theOverridesFactory = (OverridesFactory)EPackage.Registry.INSTANCE.getEFactory("http://wireframesketcher.com/1.0/model/overrides"); 
			if (theOverridesFactory != null) {
				return theOverridesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OverridesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverridesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OverridesPackage.OVERRIDES: return createOverrides();
			case OverridesPackage.WIDGET_OVERRIDES: return createWidgetOverrides();
			case OverridesPackage.FONT_OVERRIDES: return createFontOverrides();
			case OverridesPackage.ITEM_OVERRIDES: return createItemOverrides();
			case OverridesPackage.STRING_TO_STRING_MAP: return (EObject)createStringToStringMap();
			case OverridesPackage.MOVE: return createMove();
			case OverridesPackage.DELETE: return createDelete();
			case OverridesPackage.INSERT: return createInsert();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Overrides createOverrides() {
		OverridesImpl overrides = new OverridesImpl();
		return overrides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetOverrides createWidgetOverrides() {
		WidgetOverridesImpl widgetOverrides = new WidgetOverridesImpl();
		return widgetOverrides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontOverrides createFontOverrides() {
		FontOverridesImpl fontOverrides = new FontOverridesImpl();
		return fontOverrides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemOverrides createItemOverrides() {
		ItemOverridesImpl itemOverrides = new ItemOverridesImpl();
		return itemOverrides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createStringToStringMap() {
		StringToStringMapImpl stringToStringMap = new StringToStringMapImpl();
		return stringToStringMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move createMove() {
		MoveImpl move = new MoveImpl();
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Insert createInsert() {
		InsertImpl insert = new InsertImpl();
		return insert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverridesPackage getOverridesPackage() {
		return (OverridesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OverridesPackage getPackage() {
		return OverridesPackage.eINSTANCE;
	}

} //OverridesFactoryImpl
