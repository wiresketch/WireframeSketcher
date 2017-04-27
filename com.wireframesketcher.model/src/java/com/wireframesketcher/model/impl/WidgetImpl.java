/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.wireframesketcher.model.AnnotationSupport;
import com.wireframesketcher.model.LayoutParams;
import com.wireframesketcher.model.ModelFactory;
import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.ResizeMode;
import com.wireframesketcher.model.Widget;
import com.wireframesketcher.model.WidgetContainer;
import com.wireframesketcher.model.WidgetDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetImpl#getNote <em>Note</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetImpl#getX <em>X</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetImpl#getY <em>Y</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetImpl#getText <em>Text</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetImpl#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetImpl#isLocked <em>Locked</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetImpl#getMeasuredWidth <em>Measured Width</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetImpl#getMeasuredHeight <em>Measured Height</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetImpl#getCustomId <em>Custom Id</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetImpl#getCustomData <em>Custom Data</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetImpl#isAnnotation <em>Annotation</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.WidgetImpl#getLayoutParams <em>Layout Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WidgetImpl extends EObjectImpl implements Widget {
	/**
	 * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected String note = NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Long ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

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
	protected static final int Y_EDEFAULT = 0;

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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescriptor() <em>Descriptor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected WidgetDescriptor descriptor;

	/**
	 * The default value of the '{@link #isLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocked()
	 * @generated
	 * @ordered
	 */
	protected boolean locked = LOCKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasuredWidth() <em>Measured Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuredWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int MEASURED_WIDTH_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getMeasuredWidth() <em>Measured Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuredWidth()
	 * @generated
	 * @ordered
	 */
	protected int measuredWidth = MEASURED_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasuredHeight() <em>Measured Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuredHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int MEASURED_HEIGHT_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getMeasuredHeight() <em>Measured Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuredHeight()
	 * @generated
	 * @ordered
	 */
	protected int measuredHeight = MEASURED_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomId() <em>Custom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomId() <em>Custom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomId()
	 * @generated
	 * @ordered
	 */
	protected String customId = CUSTOM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomData() <em>Custom Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomData()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomData() <em>Custom Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomData()
	 * @generated
	 * @ordered
	 */
	protected String customData = CUSTOM_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #isAnnotation() <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnnotation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANNOTATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnnotation() <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnnotation()
	 * @generated
	 * @ordered
	 */
	protected boolean annotation = ANNOTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayoutParams() <em>Layout Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutParams()
	 * @generated
	 * @ordered
	 */
	protected static final LayoutParams LAYOUT_PARAMS_EDEFAULT = (LayoutParams)ModelFactory.eINSTANCE.createFromString(ModelPackage.eINSTANCE.getLayoutParamsDataType(), "none");

	/**
	 * The cached value of the '{@link #getLayoutParams() <em>Layout Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutParams()
	 * @generated
	 * @ordered
	 */
	protected LayoutParams layoutParams = LAYOUT_PARAMS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected WidgetImpl() {
		super();
		this.annotation = getAnnotationDefault();
	}

	private boolean getAnnotationDefault() {
		if(this instanceof AnnotationSupport)
			return true;
		else
			return ANNOTATION_EDEFAULT;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(String newNote) {
		String oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIDGET__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(Long newId) {
		Long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIDGET__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetContainer getContainer() {
		if (eContainerFeatureID() != ModelPackage.WIDGET__CONTAINER) return null;
		return (WidgetContainer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(WidgetContainer newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, ModelPackage.WIDGET__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(WidgetContainer newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != ModelPackage.WIDGET__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, ModelPackage.WIDGET_CONTAINER__WIDGETS, WidgetContainer.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIDGET__CONTAINER, newContainer, newContainer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIDGET__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIDGET__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setWidth(int newWidth) {
		if((descriptor.getResizeMode().getValue() & ResizeMode.HORIZONTAL) == 0)
			return;
		
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIDGET__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setHeight(int newHeight) {
		if((descriptor.getResizeMode().getValue() & ResizeMode.VERTICAL) == 0)
			return;
		
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIDGET__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setText(String newText) {
		if(!descriptor.isTextEditable())
			return;
		
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIDGET__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetDescriptor getDescriptor() {
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocked() {
		return locked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocked(boolean newLocked) {
		boolean oldLocked = locked;
		locked = newLocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIDGET__LOCKED, oldLocked, locked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMeasuredWidth() {
		return measuredWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasuredWidth(int newMeasuredWidth) {
		int oldMeasuredWidth = measuredWidth;
		measuredWidth = newMeasuredWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIDGET__MEASURED_WIDTH, oldMeasuredWidth, measuredWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMeasuredHeight() {
		return measuredHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasuredHeight(int newMeasuredHeight) {
		int oldMeasuredHeight = measuredHeight;
		measuredHeight = newMeasuredHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIDGET__MEASURED_HEIGHT, oldMeasuredHeight, measuredHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomId() {
		return customId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomId(String newCustomId) {
		String oldCustomId = customId;
		customId = newCustomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIDGET__CUSTOM_ID, oldCustomId, customId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomData() {
		return customData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomData(String newCustomData) {
		String oldCustomData = customData;
		customData = newCustomData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIDGET__CUSTOM_DATA, oldCustomData, customData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnnotation() {
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotation(boolean newAnnotation) {
		boolean oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIDGET__ANNOTATION, oldAnnotation, annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutParams getLayoutParams() {
		return layoutParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutParams(LayoutParams newLayoutParams) {
		LayoutParams oldLayoutParams = layoutParams;
		layoutParams = newLayoutParams;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIDGET__LAYOUT_PARAMS, oldLayoutParams, layoutParams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.WIDGET__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((WidgetContainer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.WIDGET__CONTAINER:
				return basicSetContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModelPackage.WIDGET__CONTAINER:
				return eInternalContainer().eInverseRemove(this, ModelPackage.WIDGET_CONTAINER__WIDGETS, WidgetContainer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.WIDGET__NOTE:
				return getNote();
			case ModelPackage.WIDGET__ID:
				return getId();
			case ModelPackage.WIDGET__CONTAINER:
				return getContainer();
			case ModelPackage.WIDGET__X:
				return getX();
			case ModelPackage.WIDGET__Y:
				return getY();
			case ModelPackage.WIDGET__WIDTH:
				return getWidth();
			case ModelPackage.WIDGET__HEIGHT:
				return getHeight();
			case ModelPackage.WIDGET__TEXT:
				return getText();
			case ModelPackage.WIDGET__DESCRIPTOR:
				return getDescriptor();
			case ModelPackage.WIDGET__LOCKED:
				return isLocked();
			case ModelPackage.WIDGET__MEASURED_WIDTH:
				return getMeasuredWidth();
			case ModelPackage.WIDGET__MEASURED_HEIGHT:
				return getMeasuredHeight();
			case ModelPackage.WIDGET__CUSTOM_ID:
				return getCustomId();
			case ModelPackage.WIDGET__CUSTOM_DATA:
				return getCustomData();
			case ModelPackage.WIDGET__ANNOTATION:
				return isAnnotation();
			case ModelPackage.WIDGET__LAYOUT_PARAMS:
				return getLayoutParams();
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
			case ModelPackage.WIDGET__NOTE:
				setNote((String)newValue);
				return;
			case ModelPackage.WIDGET__ID:
				setId((Long)newValue);
				return;
			case ModelPackage.WIDGET__CONTAINER:
				setContainer((WidgetContainer)newValue);
				return;
			case ModelPackage.WIDGET__X:
				setX((Integer)newValue);
				return;
			case ModelPackage.WIDGET__Y:
				setY((Integer)newValue);
				return;
			case ModelPackage.WIDGET__WIDTH:
				setWidth((Integer)newValue);
				return;
			case ModelPackage.WIDGET__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case ModelPackage.WIDGET__TEXT:
				setText((String)newValue);
				return;
			case ModelPackage.WIDGET__LOCKED:
				setLocked((Boolean)newValue);
				return;
			case ModelPackage.WIDGET__MEASURED_WIDTH:
				setMeasuredWidth((Integer)newValue);
				return;
			case ModelPackage.WIDGET__MEASURED_HEIGHT:
				setMeasuredHeight((Integer)newValue);
				return;
			case ModelPackage.WIDGET__CUSTOM_ID:
				setCustomId((String)newValue);
				return;
			case ModelPackage.WIDGET__CUSTOM_DATA:
				setCustomData((String)newValue);
				return;
			case ModelPackage.WIDGET__ANNOTATION:
				setAnnotation((Boolean)newValue);
				return;
			case ModelPackage.WIDGET__LAYOUT_PARAMS:
				setLayoutParams((LayoutParams)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.WIDGET__NOTE:
				setNote(NOTE_EDEFAULT);
				return;
			case ModelPackage.WIDGET__ID:
				setId(ID_EDEFAULT);
				return;
			case ModelPackage.WIDGET__CONTAINER:
				setContainer((WidgetContainer)null);
				return;
			case ModelPackage.WIDGET__X:
				setX(X_EDEFAULT);
				return;
			case ModelPackage.WIDGET__Y:
				setY(Y_EDEFAULT);
				return;
			case ModelPackage.WIDGET__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case ModelPackage.WIDGET__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case ModelPackage.WIDGET__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case ModelPackage.WIDGET__LOCKED:
				setLocked(LOCKED_EDEFAULT);
				return;
			case ModelPackage.WIDGET__MEASURED_WIDTH:
				setMeasuredWidth(MEASURED_WIDTH_EDEFAULT);
				return;
			case ModelPackage.WIDGET__MEASURED_HEIGHT:
				setMeasuredHeight(MEASURED_HEIGHT_EDEFAULT);
				return;
			case ModelPackage.WIDGET__CUSTOM_ID:
				setCustomId(CUSTOM_ID_EDEFAULT);
				return;
			case ModelPackage.WIDGET__CUSTOM_DATA:
				setCustomData(CUSTOM_DATA_EDEFAULT);
				return;
			case ModelPackage.WIDGET__ANNOTATION:
				setAnnotation(getAnnotationDefault());
				return;
			case ModelPackage.WIDGET__LAYOUT_PARAMS:
				setLayoutParams(LAYOUT_PARAMS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.WIDGET__NOTE:
				return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
			case ModelPackage.WIDGET__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ModelPackage.WIDGET__CONTAINER:
				return getContainer() != null;
			case ModelPackage.WIDGET__X:
				return x != X_EDEFAULT;
			case ModelPackage.WIDGET__Y:
				return y != Y_EDEFAULT;
			case ModelPackage.WIDGET__WIDTH:
				return width != WIDTH_EDEFAULT;
			case ModelPackage.WIDGET__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case ModelPackage.WIDGET__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case ModelPackage.WIDGET__DESCRIPTOR:
				return descriptor != null;
			case ModelPackage.WIDGET__LOCKED:
				return locked != LOCKED_EDEFAULT;
			case ModelPackage.WIDGET__MEASURED_WIDTH:
				return measuredWidth != MEASURED_WIDTH_EDEFAULT;
			case ModelPackage.WIDGET__MEASURED_HEIGHT:
				return measuredHeight != MEASURED_HEIGHT_EDEFAULT;
			case ModelPackage.WIDGET__CUSTOM_ID:
				return CUSTOM_ID_EDEFAULT == null ? customId != null : !CUSTOM_ID_EDEFAULT.equals(customId);
			case ModelPackage.WIDGET__CUSTOM_DATA:
				return CUSTOM_DATA_EDEFAULT == null ? customData != null : !CUSTOM_DATA_EDEFAULT.equals(customData);
			case ModelPackage.WIDGET__ANNOTATION:
				return annotation != getAnnotationDefault();
			case ModelPackage.WIDGET__LAYOUT_PARAMS:
				return LAYOUT_PARAMS_EDEFAULT == null ? layoutParams != null : !LAYOUT_PARAMS_EDEFAULT.equals(layoutParams);
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
		result.append(" (note: ");
		result.append(note);
		result.append(", id: ");
		result.append(id);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", text: ");
		result.append(text);
		result.append(", locked: ");
		result.append(locked);
		result.append(", measuredWidth: ");
		result.append(measuredWidth);
		result.append(", measuredHeight: ");
		result.append(measuredHeight);
		result.append(", customId: ");
		result.append(customId);
		result.append(", customData: ");
		result.append(customData);
		result.append(", annotation: ");
		result.append(annotation);
		result.append(", layoutParams: ");
		result.append(layoutParams);
		result.append(')');
		return result.toString();
	}

	protected static WidgetDescriptor describe(String typeName, ResizeMode resizeMode) {
		return describe(typeName, resizeMode, true, false);
	}

	protected static WidgetDescriptor describe(String typeName, ResizeMode resizeMode,
			boolean textEditable, boolean textMultiline) {
		return describe(typeName, resizeMode, textEditable, textMultiline, false);
	}

	protected static WidgetDescriptor describe(String typeName, ResizeMode resizeMode,
			boolean textEditable, boolean textMultiline, boolean textWrappable) {
		WidgetDescriptor desc = new WidgetDescriptorImpl();
		desc.setTypeName(typeName);
		desc.setResizeMode(resizeMode);
		desc.setTextEditable(textEditable);
		desc.setTextLines(textMultiline ? 0 : 1);
		desc.setTextWrappable(textWrappable);
		return desc;
	}

	protected static DescriptorBuilder describe(String typeName) {
		return new DescriptorBuilder(typeName);
	}
	
	protected static class DescriptorBuilder {
		private WidgetDescriptor desc = new WidgetDescriptorImpl();

		public DescriptorBuilder(String typeName) {
			desc.setTypeName(typeName);
			desc.setTextEditable(false);
			desc.setResizeMode(ResizeMode.NONE_LITERAL);
			desc.setTextLines(1);
			desc.setTextWrappable(false);
		}
		
		public DescriptorBuilder resizeMode(ResizeMode mode) {
			desc.setResizeMode(ResizeMode.get(desc.getResizeMode().getValue() | mode.getValue()));
			return this;
		}

		public DescriptorBuilder resizeHorizontal() {
			return resizeMode(ResizeMode.HORIZONTAL_LITERAL);
		}

		public DescriptorBuilder resizeVertical() {
			return resizeMode(ResizeMode.VERTICAL_LITERAL);
		}

		public DescriptorBuilder resizeBoth() {
			return resizeMode(ResizeMode.BOTH_LITERAL);
		}

		public DescriptorBuilder singleLine() {
			desc.setTextEditable(true);
			desc.setTextLines(1);
			desc.setTextWrappable(false);
			return this;
		}
		
		public DescriptorBuilder multiLine() {
			desc.setTextEditable(true);
			desc.setTextLines(0);
			desc.setTextWrappable(true);
			return this;
		}

		public DescriptorBuilder multiLine(int lines) {
			desc.setTextEditable(true);
			desc.setTextLines(lines);
			desc.setTextWrappable(lines <= 0);
			return this;
		}

		public DescriptorBuilder multiLineNoWrap() {
			desc.setTextEditable(true);
			desc.setTextLines(0);
			desc.setTextWrappable(false);
			return this;
		}

		public DescriptorBuilder centered() {
			desc.setTextCentered(true);
			return this;
		}
		
		public WidgetDescriptor get() {
			return desc;
		}
	}
} // WidgetImpl
