/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.overrides.impl;

import com.wireframesketcher.model.overrides.FontOverrides;
import com.wireframesketcher.model.overrides.ItemOverrides;
import com.wireframesketcher.model.overrides.Operation;
import com.wireframesketcher.model.overrides.OverridesPackage;
import com.wireframesketcher.model.overrides.Reference;
import com.wireframesketcher.model.overrides.WidgetOverrides;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget Overrides</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.overrides.impl.WidgetOverridesImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.impl.WidgetOverridesImpl#getX <em>X</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.impl.WidgetOverridesImpl#getY <em>Y</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.impl.WidgetOverridesImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.impl.WidgetOverridesImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.impl.WidgetOverridesImpl#getText <em>Text</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.impl.WidgetOverridesImpl#getLink <em>Link</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.impl.WidgetOverridesImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.impl.WidgetOverridesImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.impl.WidgetOverridesImpl#getFont <em>Font</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.impl.WidgetOverridesImpl#getItems <em>Items</em>}</li>
 *   <li>{@link com.wireframesketcher.model.overrides.impl.WidgetOverridesImpl#getItemChanges <em>Item Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WidgetOverridesImpl extends WidgetContainerOverridesImpl implements WidgetOverrides {
	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final Integer X_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected Integer x = X_EDEFAULT;
	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final Integer Y_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected Integer y = Y_EDEFAULT;
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WIDTH_EDEFAULT = new Integer(-1);
	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer width = WIDTH_EDEFAULT;
	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HEIGHT_EDEFAULT = new Integer(-1);
	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected Integer height = HEIGHT_EDEFAULT;
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
	/**
	 * The default value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected static final URI SRC_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected URI src = SRC_EDEFAULT;
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> attributes;

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected FontOverrides font;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemOverrides> items;

	/**
	 * The cached value of the '{@link #getItemChanges() <em>Item Changes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemChanges()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> itemChanges;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetOverridesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OverridesPackage.Literals.WIDGET_OVERRIDES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OverridesPackage.WIDGET_OVERRIDES__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(Integer newX) {
		Integer oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OverridesPackage.WIDGET_OVERRIDES__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(Integer newY) {
		Integer oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OverridesPackage.WIDGET_OVERRIDES__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Integer newWidth) {
		Integer oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OverridesPackage.WIDGET_OVERRIDES__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Integer newHeight) {
		Integer oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OverridesPackage.WIDGET_OVERRIDES__HEIGHT, oldHeight, height));
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
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OverridesPackage.WIDGET_OVERRIDES__TEXT, oldText, text));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OverridesPackage.WIDGET_OVERRIDES__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(URI newSrc) {
		URI oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OverridesPackage.WIDGET_OVERRIDES__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getAttributes() {
		if (attributes == null) {
			attributes = new EcoreEMap<String,String>(OverridesPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, OverridesPackage.WIDGET_OVERRIDES__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontOverrides getFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFont(FontOverrides newFont, NotificationChain msgs) {
		FontOverrides oldFont = font;
		font = newFont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OverridesPackage.WIDGET_OVERRIDES__FONT, oldFont, newFont);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont(FontOverrides newFont) {
		if (newFont != font) {
			NotificationChain msgs = null;
			if (font != null)
				msgs = ((InternalEObject)font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OverridesPackage.WIDGET_OVERRIDES__FONT, null, msgs);
			if (newFont != null)
				msgs = ((InternalEObject)newFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OverridesPackage.WIDGET_OVERRIDES__FONT, null, msgs);
			msgs = basicSetFont(newFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OverridesPackage.WIDGET_OVERRIDES__FONT, newFont, newFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemOverrides> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<ItemOverrides>(ItemOverrides.class, this, OverridesPackage.WIDGET_OVERRIDES__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getItemChanges() {
		if (itemChanges == null) {
			itemChanges = new EObjectContainmentEList<Operation>(Operation.class, this, OverridesPackage.WIDGET_OVERRIDES__ITEM_CHANGES);
		}
		return itemChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OverridesPackage.WIDGET_OVERRIDES__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case OverridesPackage.WIDGET_OVERRIDES__FONT:
				return basicSetFont(null, msgs);
			case OverridesPackage.WIDGET_OVERRIDES__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
			case OverridesPackage.WIDGET_OVERRIDES__ITEM_CHANGES:
				return ((InternalEList<?>)getItemChanges()).basicRemove(otherEnd, msgs);
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
			case OverridesPackage.WIDGET_OVERRIDES__REF:
				return getRef();
			case OverridesPackage.WIDGET_OVERRIDES__X:
				return getX();
			case OverridesPackage.WIDGET_OVERRIDES__Y:
				return getY();
			case OverridesPackage.WIDGET_OVERRIDES__WIDTH:
				return getWidth();
			case OverridesPackage.WIDGET_OVERRIDES__HEIGHT:
				return getHeight();
			case OverridesPackage.WIDGET_OVERRIDES__TEXT:
				return getText();
			case OverridesPackage.WIDGET_OVERRIDES__LINK:
				return getLink();
			case OverridesPackage.WIDGET_OVERRIDES__SRC:
				return getSrc();
			case OverridesPackage.WIDGET_OVERRIDES__ATTRIBUTES:
				if (coreType) return getAttributes();
				else return getAttributes().map();
			case OverridesPackage.WIDGET_OVERRIDES__FONT:
				return getFont();
			case OverridesPackage.WIDGET_OVERRIDES__ITEMS:
				return getItems();
			case OverridesPackage.WIDGET_OVERRIDES__ITEM_CHANGES:
				return getItemChanges();
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
			case OverridesPackage.WIDGET_OVERRIDES__REF:
				setRef((String)newValue);
				return;
			case OverridesPackage.WIDGET_OVERRIDES__X:
				setX((Integer)newValue);
				return;
			case OverridesPackage.WIDGET_OVERRIDES__Y:
				setY((Integer)newValue);
				return;
			case OverridesPackage.WIDGET_OVERRIDES__WIDTH:
				setWidth((Integer)newValue);
				return;
			case OverridesPackage.WIDGET_OVERRIDES__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case OverridesPackage.WIDGET_OVERRIDES__TEXT:
				setText((String)newValue);
				return;
			case OverridesPackage.WIDGET_OVERRIDES__LINK:
				setLink((URI)newValue);
				return;
			case OverridesPackage.WIDGET_OVERRIDES__SRC:
				setSrc((URI)newValue);
				return;
			case OverridesPackage.WIDGET_OVERRIDES__ATTRIBUTES:
				((EStructuralFeature.Setting)getAttributes()).set(newValue);
				return;
			case OverridesPackage.WIDGET_OVERRIDES__FONT:
				setFont((FontOverrides)newValue);
				return;
			case OverridesPackage.WIDGET_OVERRIDES__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends ItemOverrides>)newValue);
				return;
			case OverridesPackage.WIDGET_OVERRIDES__ITEM_CHANGES:
				getItemChanges().clear();
				getItemChanges().addAll((Collection<? extends Operation>)newValue);
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
			case OverridesPackage.WIDGET_OVERRIDES__REF:
				setRef(REF_EDEFAULT);
				return;
			case OverridesPackage.WIDGET_OVERRIDES__X:
				setX(X_EDEFAULT);
				return;
			case OverridesPackage.WIDGET_OVERRIDES__Y:
				setY(Y_EDEFAULT);
				return;
			case OverridesPackage.WIDGET_OVERRIDES__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case OverridesPackage.WIDGET_OVERRIDES__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case OverridesPackage.WIDGET_OVERRIDES__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case OverridesPackage.WIDGET_OVERRIDES__LINK:
				setLink(LINK_EDEFAULT);
				return;
			case OverridesPackage.WIDGET_OVERRIDES__SRC:
				setSrc(SRC_EDEFAULT);
				return;
			case OverridesPackage.WIDGET_OVERRIDES__ATTRIBUTES:
				getAttributes().clear();
				return;
			case OverridesPackage.WIDGET_OVERRIDES__FONT:
				setFont((FontOverrides)null);
				return;
			case OverridesPackage.WIDGET_OVERRIDES__ITEMS:
				getItems().clear();
				return;
			case OverridesPackage.WIDGET_OVERRIDES__ITEM_CHANGES:
				getItemChanges().clear();
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
			case OverridesPackage.WIDGET_OVERRIDES__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case OverridesPackage.WIDGET_OVERRIDES__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case OverridesPackage.WIDGET_OVERRIDES__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
			case OverridesPackage.WIDGET_OVERRIDES__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case OverridesPackage.WIDGET_OVERRIDES__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case OverridesPackage.WIDGET_OVERRIDES__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case OverridesPackage.WIDGET_OVERRIDES__LINK:
				return LINK_EDEFAULT == null ? link != null : !LINK_EDEFAULT.equals(link);
			case OverridesPackage.WIDGET_OVERRIDES__SRC:
				return SRC_EDEFAULT == null ? src != null : !SRC_EDEFAULT.equals(src);
			case OverridesPackage.WIDGET_OVERRIDES__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case OverridesPackage.WIDGET_OVERRIDES__FONT:
				return font != null;
			case OverridesPackage.WIDGET_OVERRIDES__ITEMS:
				return items != null && !items.isEmpty();
			case OverridesPackage.WIDGET_OVERRIDES__ITEM_CHANGES:
				return itemChanges != null && !itemChanges.isEmpty();
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
		if (baseClass == Reference.class) {
			switch (derivedFeatureID) {
				case OverridesPackage.WIDGET_OVERRIDES__REF: return OverridesPackage.REFERENCE__REF;
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
		if (baseClass == Reference.class) {
			switch (baseFeatureID) {
				case OverridesPackage.REFERENCE__REF: return OverridesPackage.WIDGET_OVERRIDES__REF;
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
		result.append(" (ref: ");
		result.append(ref);
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
		result.append(", link: ");
		result.append(link);
		result.append(", src: ");
		result.append(src);
		result.append(')');
		return result.toString();
	}

} //WidgetOverridesImpl
