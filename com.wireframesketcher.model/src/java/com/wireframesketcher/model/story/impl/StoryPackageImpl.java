/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.story.impl;

import com.wireframesketcher.model.ModelPackage;

import com.wireframesketcher.model.impl.ModelPackageImpl;

import com.wireframesketcher.model.overrides.OverridesPackage;
import com.wireframesketcher.model.overrides.impl.OverridesPackageImpl;
import com.wireframesketcher.model.story.Panel;
import com.wireframesketcher.model.story.StoryFactory;
import com.wireframesketcher.model.story.StoryPackage;
import com.wireframesketcher.model.story.Storyboard;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StoryPackageImpl extends EPackageImpl implements StoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyboardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.wireframesketcher.model.story.StoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StoryPackageImpl() {
		super(eNS_URI, StoryFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StoryPackage init() {
		if (isInited) return (StoryPackage)EPackage.Registry.INSTANCE.getEPackage(StoryPackage.eNS_URI);

		// Obtain or create and register package
		StoryPackageImpl theStoryPackage = (StoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StoryPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		OverridesPackageImpl theOverridesPackage = (OverridesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OverridesPackage.eNS_URI) instanceof OverridesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OverridesPackage.eNS_URI) : OverridesPackage.eINSTANCE);

		// Create package meta-data objects
		theStoryPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theOverridesPackage.createPackageContents();

		// Initialize created meta-data
		theStoryPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theOverridesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StoryPackage.eNS_URI, theStoryPackage);
		return theStoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryboard() {
		return storyboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboard_Panels() {
		return (EReference)storyboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanel() {
		return panelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPanel_Id() {
		return (EAttribute)panelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanel_Screen() {
		return (EReference)panelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanel_Story() {
		return (EReference)panelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPanel_X() {
		return (EAttribute)panelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPanel_Y() {
		return (EAttribute)panelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryFactory getStoryFactory() {
		return (StoryFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		storyboardEClass = createEClass(STORYBOARD);
		createEReference(storyboardEClass, STORYBOARD__PANELS);

		panelEClass = createEClass(PANEL);
		createEAttribute(panelEClass, PANEL__ID);
		createEReference(panelEClass, PANEL__SCREEN);
		createEReference(panelEClass, PANEL__STORY);
		createEAttribute(panelEClass, PANEL__X);
		createEAttribute(panelEClass, PANEL__Y);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(storyboardEClass, Storyboard.class, "Storyboard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStoryboard_Panels(), this.getPanel(), null, "panels", null, 0, -1, Storyboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(panelEClass, Panel.class, "Panel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPanel_Id(), ecorePackage.getEString(), "id", null, 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPanel_Screen(), theModelPackage.getScreen(), null, "screen", null, 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPanel_Story(), this.getStoryboard(), null, "story", null, 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPanel_X(), ecorePackage.getEInt(), "x", "-2147483648", 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPanel_Y(), ecorePackage.getEInt(), "y", "-2147483648", 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StoryPackageImpl
