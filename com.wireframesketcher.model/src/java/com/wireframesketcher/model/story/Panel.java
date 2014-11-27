/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.story;

import com.wireframesketcher.model.Screen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.story.Panel#getId <em>Id</em>}</li>
 *   <li>{@link com.wireframesketcher.model.story.Panel#getScreen <em>Screen</em>}</li>
 *   <li>{@link com.wireframesketcher.model.story.Panel#getStory <em>Story</em>}</li>
 *   <li>{@link com.wireframesketcher.model.story.Panel#getX <em>X</em>}</li>
 *   <li>{@link com.wireframesketcher.model.story.Panel#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.wireframesketcher.model.story.StoryPackage#getPanel()
 * @model
 * @generated
 */
public interface Panel extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.wireframesketcher.model.story.StoryPackage#getPanel_Id()
	 * @model id="true" derived="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.story.Panel#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Screen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen</em>' reference.
	 * @see #setScreen(Screen)
	 * @see com.wireframesketcher.model.story.StoryPackage#getPanel_Screen()
	 * @model
	 * @generated
	 */
	Screen getScreen();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.story.Panel#getScreen <em>Screen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen</em>' reference.
	 * @see #getScreen()
	 * @generated
	 */
	void setScreen(Screen value);

	/**
	 * Returns the value of the '<em><b>Story</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Story</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Story</em>' reference.
	 * @see #setStory(Storyboard)
	 * @see com.wireframesketcher.model.story.StoryPackage#getPanel_Story()
	 * @model
	 * @generated
	 */
	Storyboard getStory();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.story.Panel#getStory <em>Story</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Story</em>' reference.
	 * @see #getStory()
	 * @generated
	 */
	void setStory(Storyboard value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * The default value is <code>"-2147483648"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Absolute X position in pixels
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see com.wireframesketcher.model.story.StoryPackage#getPanel_X()
	 * @model default="-2147483648"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.story.Panel#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * The default value is <code>"-2147483648"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Absolute Y position in pixels
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see com.wireframesketcher.model.story.StoryPackage#getPanel_Y()
	 * @model default="-2147483648"
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link com.wireframesketcher.model.story.Panel#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

} // Panel
