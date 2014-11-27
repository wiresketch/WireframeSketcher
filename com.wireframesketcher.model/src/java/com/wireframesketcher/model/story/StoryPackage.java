/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.story;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.wireframesketcher.model.story.StoryFactory
 * @model kind="package"
 * @generated
 */
public interface StoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "story";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://wireframesketcher.com/1.0/model/story";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "story";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StoryPackage eINSTANCE = com.wireframesketcher.model.story.impl.StoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.story.impl.StoryboardImpl <em>Storyboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.story.impl.StoryboardImpl
	 * @see com.wireframesketcher.model.story.impl.StoryPackageImpl#getStoryboard()
	 * @generated
	 */
	int STORYBOARD = 0;

	/**
	 * The feature id for the '<em><b>Panels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORYBOARD__PANELS = 0;

	/**
	 * The number of structural features of the '<em>Storyboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORYBOARD_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.wireframesketcher.model.story.impl.PanelImpl <em>Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.wireframesketcher.model.story.impl.PanelImpl
	 * @see com.wireframesketcher.model.story.impl.StoryPackageImpl#getPanel()
	 * @generated
	 */
	int PANEL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__ID = 0;

	/**
	 * The feature id for the '<em><b>Screen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__SCREEN = 1;

	/**
	 * The feature id for the '<em><b>Story</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__STORY = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__X = 3;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__Y = 4;

	/**
	 * The number of structural features of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.story.Storyboard <em>Storyboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storyboard</em>'.
	 * @see com.wireframesketcher.model.story.Storyboard
	 * @generated
	 */
	EClass getStoryboard();

	/**
	 * Returns the meta object for the containment reference list '{@link com.wireframesketcher.model.story.Storyboard#getPanels <em>Panels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Panels</em>'.
	 * @see com.wireframesketcher.model.story.Storyboard#getPanels()
	 * @see #getStoryboard()
	 * @generated
	 */
	EReference getStoryboard_Panels();

	/**
	 * Returns the meta object for class '{@link com.wireframesketcher.model.story.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel</em>'.
	 * @see com.wireframesketcher.model.story.Panel
	 * @generated
	 */
	EClass getPanel();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.story.Panel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.wireframesketcher.model.story.Panel#getId()
	 * @see #getPanel()
	 * @generated
	 */
	EAttribute getPanel_Id();

	/**
	 * Returns the meta object for the reference '{@link com.wireframesketcher.model.story.Panel#getScreen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screen</em>'.
	 * @see com.wireframesketcher.model.story.Panel#getScreen()
	 * @see #getPanel()
	 * @generated
	 */
	EReference getPanel_Screen();

	/**
	 * Returns the meta object for the reference '{@link com.wireframesketcher.model.story.Panel#getStory <em>Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Story</em>'.
	 * @see com.wireframesketcher.model.story.Panel#getStory()
	 * @see #getPanel()
	 * @generated
	 */
	EReference getPanel_Story();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.story.Panel#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see com.wireframesketcher.model.story.Panel#getX()
	 * @see #getPanel()
	 * @generated
	 */
	EAttribute getPanel_X();

	/**
	 * Returns the meta object for the attribute '{@link com.wireframesketcher.model.story.Panel#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see com.wireframesketcher.model.story.Panel#getY()
	 * @see #getPanel()
	 * @generated
	 */
	EAttribute getPanel_Y();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StoryFactory getStoryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.story.impl.StoryboardImpl <em>Storyboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.story.impl.StoryboardImpl
		 * @see com.wireframesketcher.model.story.impl.StoryPackageImpl#getStoryboard()
		 * @generated
		 */
		EClass STORYBOARD = eINSTANCE.getStoryboard();

		/**
		 * The meta object literal for the '<em><b>Panels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORYBOARD__PANELS = eINSTANCE.getStoryboard_Panels();

		/**
		 * The meta object literal for the '{@link com.wireframesketcher.model.story.impl.PanelImpl <em>Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.wireframesketcher.model.story.impl.PanelImpl
		 * @see com.wireframesketcher.model.story.impl.StoryPackageImpl#getPanel()
		 * @generated
		 */
		EClass PANEL = eINSTANCE.getPanel();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANEL__ID = eINSTANCE.getPanel_Id();

		/**
		 * The meta object literal for the '<em><b>Screen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL__SCREEN = eINSTANCE.getPanel_Screen();

		/**
		 * The meta object literal for the '<em><b>Story</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL__STORY = eINSTANCE.getPanel_Story();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANEL__X = eINSTANCE.getPanel_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANEL__Y = eINSTANCE.getPanel_Y();

	}

} //StoryPackage
