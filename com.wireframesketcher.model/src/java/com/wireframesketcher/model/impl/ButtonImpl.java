/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.wireframesketcher.model.Button;
import com.wireframesketcher.model.ButtonStyle;
import com.wireframesketcher.model.ColorBackgroundSupport;
import com.wireframesketcher.model.ColorDesc;
import com.wireframesketcher.model.Font;
import com.wireframesketcher.model.FontSupport;
import com.wireframesketcher.model.IconDesc;
import com.wireframesketcher.model.IconSupport;
import com.wireframesketcher.model.LinkSupport;
import com.wireframesketcher.model.ModelFactory;
import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.Rotation90;
import com.wireframesketcher.model.SkinSupport;
import com.wireframesketcher.model.State;
import com.wireframesketcher.model.StateSupport;
import com.wireframesketcher.model.TextAlignment;
import com.wireframesketcher.model.TextAlignmentSupport;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.URI;
import com.wireframesketcher.model.ResizeMode;
import com.wireframesketcher.model.WidgetDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.impl.ButtonImpl#getState <em>State</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ButtonImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ButtonImpl#getFont <em>Font</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ButtonImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ButtonImpl#getIconRotation <em>Icon Rotation</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ButtonImpl#getLink <em>Link</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ButtonImpl#getTextAlignment <em>Text Alignment</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ButtonImpl#getSkin <em>Skin</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ButtonImpl#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ButtonImpl extends WidgetImpl implements Button {
	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final State STATE_EDEFAULT = State.NORMAL;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final ColorDesc BACKGROUND_EDEFAULT = (ColorDesc)ModelFactory.eINSTANCE.createFromString(ModelPackage.eINSTANCE.getColorDataType(), "white");

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected ColorDesc background = BACKGROUND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected Font font;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final IconDesc ICON_EDEFAULT = (IconDesc)ModelFactory.eINSTANCE.createFromString(ModelPackage.eINSTANCE.getIconDataType(), "");

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected IconDesc icon = ICON_EDEFAULT;

	/**
	 * The default value of the '{@link #getIconRotation() <em>Icon Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconRotation()
	 * @generated
	 * @ordered
	 */
	protected static final Rotation90 ICON_ROTATION_EDEFAULT = Rotation90._0;

	/**
	 * The cached value of the '{@link #getIconRotation() <em>Icon Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconRotation()
	 * @generated
	 * @ordered
	 */
	protected Rotation90 iconRotation = ICON_ROTATION_EDEFAULT;

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
	 * The default value of the '{@link #getTextAlignment() <em>Text Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlignment()
	 * @ordered
	 */
	protected static final TextAlignment TEXT_ALIGNMENT_EDEFAULT = TextAlignment.CENTER_LITERAL;

	/**
	 * The cached value of the '{@link #getTextAlignment() <em>Text Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlignment()
	 * @generated
	 * @ordered
	 */
	protected TextAlignment textAlignment = TEXT_ALIGNMENT_EDEFAULT;

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
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @ordered
	 */
	protected static final ButtonStyle STYLE_EDEFAULT = ButtonStyle.SQUARE;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected ButtonStyle style = STYLE_EDEFAULT;

	private static final WidgetDescriptor DESCRIPTOR = describe("Button").resizeBoth().singleLine().centered().get();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ButtonImpl() {
		super();
		setFont(ModelFactory.eINSTANCE.createFont());
		descriptor = DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		State oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUTTON__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorDesc getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(ColorDesc newBackground) {
		ColorDesc oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUTTON__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font getFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFont(Font newFont, NotificationChain msgs) {
		Font oldFont = font;
		font = newFont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.BUTTON__FONT, oldFont, newFont);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont(Font newFont) {
		if (newFont != font) {
			NotificationChain msgs = null;
			if (font != null)
				msgs = ((InternalEObject)font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.BUTTON__FONT, null, msgs);
			if (newFont != null)
				msgs = ((InternalEObject)newFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.BUTTON__FONT, null, msgs);
			msgs = basicSetFont(newFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUTTON__FONT, newFont, newFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconDesc getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(IconDesc newIcon) {
		IconDesc oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUTTON__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotation90 getIconRotation() {
		return iconRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconRotation(Rotation90 newIconRotation) {
		Rotation90 oldIconRotation = iconRotation;
		iconRotation = newIconRotation == null ? ICON_ROTATION_EDEFAULT : newIconRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUTTON__ICON_ROTATION, oldIconRotation, iconRotation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUTTON__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAlignment getTextAlignment() {
		return textAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAlignment(TextAlignment newTextAlignment) {
		TextAlignment oldTextAlignment = textAlignment;
		textAlignment = newTextAlignment == null ? TEXT_ALIGNMENT_EDEFAULT : newTextAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUTTON__TEXT_ALIGNMENT, oldTextAlignment, textAlignment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUTTON__SKIN, oldSkin, skin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonStyle getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(ButtonStyle newStyle) {
		ButtonStyle oldStyle = style;
		style = newStyle == null ? STYLE_EDEFAULT : newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUTTON__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isValidState(State state) {
		return state == State.NORMAL || state == State.DISABLED || state == State.SELECTED || state == State.FOCUSED; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.BUTTON__FONT:
				return basicSetFont(null, msgs);
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
			case ModelPackage.BUTTON__STATE:
				return getState();
			case ModelPackage.BUTTON__BACKGROUND:
				return getBackground();
			case ModelPackage.BUTTON__FONT:
				return getFont();
			case ModelPackage.BUTTON__ICON:
				return getIcon();
			case ModelPackage.BUTTON__ICON_ROTATION:
				return getIconRotation();
			case ModelPackage.BUTTON__LINK:
				return getLink();
			case ModelPackage.BUTTON__TEXT_ALIGNMENT:
				return getTextAlignment();
			case ModelPackage.BUTTON__SKIN:
				return getSkin();
			case ModelPackage.BUTTON__STYLE:
				return getStyle();
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
			case ModelPackage.BUTTON__STATE:
				setState((State)newValue);
				return;
			case ModelPackage.BUTTON__BACKGROUND:
				setBackground((ColorDesc)newValue);
				return;
			case ModelPackage.BUTTON__FONT:
				setFont((Font)newValue);
				return;
			case ModelPackage.BUTTON__ICON:
				setIcon((IconDesc)newValue);
				return;
			case ModelPackage.BUTTON__ICON_ROTATION:
				setIconRotation((Rotation90)newValue);
				return;
			case ModelPackage.BUTTON__LINK:
				setLink((URI)newValue);
				return;
			case ModelPackage.BUTTON__TEXT_ALIGNMENT:
				setTextAlignment((TextAlignment)newValue);
				return;
			case ModelPackage.BUTTON__SKIN:
				setSkin((URI)newValue);
				return;
			case ModelPackage.BUTTON__STYLE:
				setStyle((ButtonStyle)newValue);
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
			case ModelPackage.BUTTON__STATE:
				setState(STATE_EDEFAULT);
				return;
			case ModelPackage.BUTTON__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case ModelPackage.BUTTON__FONT:
				setFont((Font)null);
				return;
			case ModelPackage.BUTTON__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case ModelPackage.BUTTON__ICON_ROTATION:
				setIconRotation(ICON_ROTATION_EDEFAULT);
				return;
			case ModelPackage.BUTTON__LINK:
				setLink(LINK_EDEFAULT);
				return;
			case ModelPackage.BUTTON__TEXT_ALIGNMENT:
				setTextAlignment(TEXT_ALIGNMENT_EDEFAULT);
				return;
			case ModelPackage.BUTTON__SKIN:
				setSkin(SKIN_EDEFAULT);
				return;
			case ModelPackage.BUTTON__STYLE:
				setStyle(STYLE_EDEFAULT);
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
			case ModelPackage.BUTTON__STATE:
				return state != STATE_EDEFAULT;
			case ModelPackage.BUTTON__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case ModelPackage.BUTTON__FONT:
				return font != null;
			case ModelPackage.BUTTON__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case ModelPackage.BUTTON__ICON_ROTATION:
				return iconRotation != ICON_ROTATION_EDEFAULT;
			case ModelPackage.BUTTON__LINK:
				return LINK_EDEFAULT == null ? link != null : !LINK_EDEFAULT.equals(link);
			case ModelPackage.BUTTON__TEXT_ALIGNMENT:
				return textAlignment != TEXT_ALIGNMENT_EDEFAULT;
			case ModelPackage.BUTTON__SKIN:
				return SKIN_EDEFAULT == null ? skin != null : !SKIN_EDEFAULT.equals(skin);
			case ModelPackage.BUTTON__STYLE:
				return style != STYLE_EDEFAULT;
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
		if (baseClass == StateSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.BUTTON__STATE: return ModelPackage.STATE_SUPPORT__STATE;
				default: return -1;
			}
		}
		if (baseClass == ColorBackgroundSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.BUTTON__BACKGROUND: return ModelPackage.COLOR_BACKGROUND_SUPPORT__BACKGROUND;
				default: return -1;
			}
		}
		if (baseClass == FontSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.BUTTON__FONT: return ModelPackage.FONT_SUPPORT__FONT;
				default: return -1;
			}
		}
		if (baseClass == IconSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.BUTTON__ICON: return ModelPackage.ICON_SUPPORT__ICON;
				case ModelPackage.BUTTON__ICON_ROTATION: return ModelPackage.ICON_SUPPORT__ICON_ROTATION;
				default: return -1;
			}
		}
		if (baseClass == LinkSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.BUTTON__LINK: return ModelPackage.LINK_SUPPORT__LINK;
				default: return -1;
			}
		}
		if (baseClass == TextAlignmentSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.BUTTON__TEXT_ALIGNMENT: return ModelPackage.TEXT_ALIGNMENT_SUPPORT__TEXT_ALIGNMENT;
				default: return -1;
			}
		}
		if (baseClass == SkinSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.BUTTON__SKIN: return ModelPackage.SKIN_SUPPORT__SKIN;
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
		if (baseClass == StateSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.STATE_SUPPORT__STATE: return ModelPackage.BUTTON__STATE;
				default: return -1;
			}
		}
		if (baseClass == ColorBackgroundSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.COLOR_BACKGROUND_SUPPORT__BACKGROUND: return ModelPackage.BUTTON__BACKGROUND;
				default: return -1;
			}
		}
		if (baseClass == FontSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.FONT_SUPPORT__FONT: return ModelPackage.BUTTON__FONT;
				default: return -1;
			}
		}
		if (baseClass == IconSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.ICON_SUPPORT__ICON: return ModelPackage.BUTTON__ICON;
				case ModelPackage.ICON_SUPPORT__ICON_ROTATION: return ModelPackage.BUTTON__ICON_ROTATION;
				default: return -1;
			}
		}
		if (baseClass == LinkSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.LINK_SUPPORT__LINK: return ModelPackage.BUTTON__LINK;
				default: return -1;
			}
		}
		if (baseClass == TextAlignmentSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.TEXT_ALIGNMENT_SUPPORT__TEXT_ALIGNMENT: return ModelPackage.BUTTON__TEXT_ALIGNMENT;
				default: return -1;
			}
		}
		if (baseClass == SkinSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.SKIN_SUPPORT__SKIN: return ModelPackage.BUTTON__SKIN;
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
		result.append(" (state: ");
		result.append(state);
		result.append(", background: ");
		result.append(background);
		result.append(", icon: ");
		result.append(icon);
		result.append(", iconRotation: ");
		result.append(iconRotation);
		result.append(", link: ");
		result.append(link);
		result.append(", textAlignment: ");
		result.append(textAlignment);
		result.append(", skin: ");
		result.append(skin);
		result.append(", style: ");
		result.append(style);
		result.append(')');
		return result.toString();
	}

} //ButtonImpl