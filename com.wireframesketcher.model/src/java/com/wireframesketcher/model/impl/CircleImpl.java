/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.wireframesketcher.model.BorderSupport;
import com.wireframesketcher.model.Circle;
import com.wireframesketcher.model.ColorAlphaSupport;
import com.wireframesketcher.model.ColorBackgroundSupport;
import com.wireframesketcher.model.ColorDesc;
import com.wireframesketcher.model.ColorForegroundSupport;
import com.wireframesketcher.model.Font;
import com.wireframesketcher.model.FontSupport;
import com.wireframesketcher.model.IconDesc;
import com.wireframesketcher.model.IconPositionSupport;
import com.wireframesketcher.model.IconSupport;
import com.wireframesketcher.model.LineStyle;
import com.wireframesketcher.model.LineStyleSupport;
import com.wireframesketcher.model.LinkSupport;
import com.wireframesketcher.model.ModelFactory;
import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.Position;
import com.wireframesketcher.model.TextAlignment;
import com.wireframesketcher.model.TextAlignmentSupport;
import com.wireframesketcher.model.ResizeMode;
import com.wireframesketcher.model.WidgetDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.impl.CircleImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.CircleImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.CircleImpl#getForeground <em>Foreground</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.CircleImpl#isBorder <em>Border</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.CircleImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.CircleImpl#getIconPosition <em>Icon Position</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.CircleImpl#getFont <em>Font</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.CircleImpl#getLink <em>Link</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.CircleImpl#getTextAlignment <em>Text Alignment</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.CircleImpl#getLineStyle <em>Line Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CircleImpl extends WidgetImpl implements Circle {
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
	 * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final int ALPHA_EDEFAULT = 255;

	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected int alpha = ALPHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getForeground() <em>Foreground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeground()
	 * @generated
	 * @ordered
	 */
	protected static final ColorDesc FOREGROUND_EDEFAULT = (ColorDesc)ModelFactory.eINSTANCE.createFromString(ModelPackage.eINSTANCE.getColorDataType(), "black");

	/**
	 * The cached value of the '{@link #getForeground() <em>Foreground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeground()
	 * @generated
	 * @ordered
	 */
	protected ColorDesc foreground = FOREGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #isBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBorder()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BORDER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBorder()
	 * @generated
	 * @ordered
	 */
	protected boolean border = BORDER_EDEFAULT;

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
	 * The default value of the '{@link #getIconPosition() <em>Icon Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconPosition()
	 * @ordered
	 */
	protected static final Position ICON_POSITION_EDEFAULT = Position.LEFT;

	/**
	 * The cached value of the '{@link #getIconPosition() <em>Icon Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconPosition()
	 * @generated
	 * @ordered
	 */
	protected Position iconPosition = ICON_POSITION_EDEFAULT;

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
	 * The default value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected static final LineStyle LINE_STYLE_EDEFAULT = LineStyle.SOLID;

	/**
	 * The cached value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected LineStyle lineStyle = LINE_STYLE_EDEFAULT;

	private static final WidgetDescriptor DESCRIPTOR = describe("Circle").resizeBoth().singleLine().centered().get();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected CircleImpl() {
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
		return ModelPackage.Literals.CIRCLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CIRCLE__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlpha(int newAlpha) {
		int oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CIRCLE__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorDesc getForeground() {
		return foreground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeground(ColorDesc newForeground) {
		ColorDesc oldForeground = foreground;
		foreground = newForeground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CIRCLE__FOREGROUND, oldForeground, foreground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBorder() {
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorder(boolean newBorder) {
		boolean oldBorder = border;
		border = newBorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CIRCLE__BORDER, oldBorder, border));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CIRCLE__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getIconPosition() {
		return iconPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconPosition(Position newIconPosition) {
		Position oldIconPosition = iconPosition;
		iconPosition = newIconPosition == null ? ICON_POSITION_EDEFAULT : newIconPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CIRCLE__ICON_POSITION, oldIconPosition, iconPosition));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.CIRCLE__FONT, oldFont, newFont);
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
				msgs = ((InternalEObject)font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.CIRCLE__FONT, null, msgs);
			if (newFont != null)
				msgs = ((InternalEObject)newFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.CIRCLE__FONT, null, msgs);
			msgs = basicSetFont(newFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CIRCLE__FONT, newFont, newFont));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CIRCLE__LINK, oldLink, link));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CIRCLE__TEXT_ALIGNMENT, oldTextAlignment, textAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStyle getLineStyle() {
		return lineStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineStyle(LineStyle newLineStyle) {
		LineStyle oldLineStyle = lineStyle;
		lineStyle = newLineStyle == null ? LINE_STYLE_EDEFAULT : newLineStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CIRCLE__LINE_STYLE, oldLineStyle, lineStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.CIRCLE__FONT:
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
			case ModelPackage.CIRCLE__BACKGROUND:
				return getBackground();
			case ModelPackage.CIRCLE__ALPHA:
				return new Integer(getAlpha());
			case ModelPackage.CIRCLE__FOREGROUND:
				return getForeground();
			case ModelPackage.CIRCLE__BORDER:
				return isBorder() ? Boolean.TRUE : Boolean.FALSE;
			case ModelPackage.CIRCLE__ICON:
				return getIcon();
			case ModelPackage.CIRCLE__ICON_POSITION:
				return getIconPosition();
			case ModelPackage.CIRCLE__FONT:
				return getFont();
			case ModelPackage.CIRCLE__LINK:
				return getLink();
			case ModelPackage.CIRCLE__TEXT_ALIGNMENT:
				return getTextAlignment();
			case ModelPackage.CIRCLE__LINE_STYLE:
				return getLineStyle();
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
			case ModelPackage.CIRCLE__BACKGROUND:
				setBackground((ColorDesc)newValue);
				return;
			case ModelPackage.CIRCLE__ALPHA:
				setAlpha(((Integer)newValue).intValue());
				return;
			case ModelPackage.CIRCLE__FOREGROUND:
				setForeground((ColorDesc)newValue);
				return;
			case ModelPackage.CIRCLE__BORDER:
				setBorder(((Boolean)newValue).booleanValue());
				return;
			case ModelPackage.CIRCLE__ICON:
				setIcon((IconDesc)newValue);
				return;
			case ModelPackage.CIRCLE__ICON_POSITION:
				setIconPosition((Position)newValue);
				return;
			case ModelPackage.CIRCLE__FONT:
				setFont((Font)newValue);
				return;
			case ModelPackage.CIRCLE__LINK:
				setLink((URI)newValue);
				return;
			case ModelPackage.CIRCLE__TEXT_ALIGNMENT:
				setTextAlignment((TextAlignment)newValue);
				return;
			case ModelPackage.CIRCLE__LINE_STYLE:
				setLineStyle((LineStyle)newValue);
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
			case ModelPackage.CIRCLE__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case ModelPackage.CIRCLE__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case ModelPackage.CIRCLE__FOREGROUND:
				setForeground(FOREGROUND_EDEFAULT);
				return;
			case ModelPackage.CIRCLE__BORDER:
				setBorder(BORDER_EDEFAULT);
				return;
			case ModelPackage.CIRCLE__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case ModelPackage.CIRCLE__ICON_POSITION:
				setIconPosition(ICON_POSITION_EDEFAULT);
				return;
			case ModelPackage.CIRCLE__FONT:
				setFont((Font)null);
				return;
			case ModelPackage.CIRCLE__LINK:
				setLink(LINK_EDEFAULT);
				return;
			case ModelPackage.CIRCLE__TEXT_ALIGNMENT:
				setTextAlignment(TEXT_ALIGNMENT_EDEFAULT);
				return;
			case ModelPackage.CIRCLE__LINE_STYLE:
				setLineStyle(LINE_STYLE_EDEFAULT);
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
			case ModelPackage.CIRCLE__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case ModelPackage.CIRCLE__ALPHA:
				return alpha != ALPHA_EDEFAULT;
			case ModelPackage.CIRCLE__FOREGROUND:
				return FOREGROUND_EDEFAULT == null ? foreground != null : !FOREGROUND_EDEFAULT.equals(foreground);
			case ModelPackage.CIRCLE__BORDER:
				return border != BORDER_EDEFAULT;
			case ModelPackage.CIRCLE__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case ModelPackage.CIRCLE__ICON_POSITION:
				return iconPosition != ICON_POSITION_EDEFAULT;
			case ModelPackage.CIRCLE__FONT:
				return font != null;
			case ModelPackage.CIRCLE__LINK:
				return LINK_EDEFAULT == null ? link != null : !LINK_EDEFAULT.equals(link);
			case ModelPackage.CIRCLE__TEXT_ALIGNMENT:
				return textAlignment != TEXT_ALIGNMENT_EDEFAULT;
			case ModelPackage.CIRCLE__LINE_STYLE:
				return lineStyle != LINE_STYLE_EDEFAULT;
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
		if (baseClass == ColorBackgroundSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.CIRCLE__BACKGROUND: return ModelPackage.COLOR_BACKGROUND_SUPPORT__BACKGROUND;
				default: return -1;
			}
		}
		if (baseClass == ColorAlphaSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.CIRCLE__ALPHA: return ModelPackage.COLOR_ALPHA_SUPPORT__ALPHA;
				default: return -1;
			}
		}
		if (baseClass == ColorForegroundSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.CIRCLE__FOREGROUND: return ModelPackage.COLOR_FOREGROUND_SUPPORT__FOREGROUND;
				default: return -1;
			}
		}
		if (baseClass == BorderSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.CIRCLE__BORDER: return ModelPackage.BORDER_SUPPORT__BORDER;
				default: return -1;
			}
		}
		if (baseClass == IconSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.CIRCLE__ICON: return ModelPackage.ICON_SUPPORT__ICON;
				default: return -1;
			}
		}
		if (baseClass == IconPositionSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.CIRCLE__ICON_POSITION: return ModelPackage.ICON_POSITION_SUPPORT__ICON_POSITION;
				default: return -1;
			}
		}
		if (baseClass == FontSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.CIRCLE__FONT: return ModelPackage.FONT_SUPPORT__FONT;
				default: return -1;
			}
		}
		if (baseClass == LinkSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.CIRCLE__LINK: return ModelPackage.LINK_SUPPORT__LINK;
				default: return -1;
			}
		}
		if (baseClass == TextAlignmentSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.CIRCLE__TEXT_ALIGNMENT: return ModelPackage.TEXT_ALIGNMENT_SUPPORT__TEXT_ALIGNMENT;
				default: return -1;
			}
		}
		if (baseClass == LineStyleSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.CIRCLE__LINE_STYLE: return ModelPackage.LINE_STYLE_SUPPORT__LINE_STYLE;
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
		if (baseClass == ColorBackgroundSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.COLOR_BACKGROUND_SUPPORT__BACKGROUND: return ModelPackage.CIRCLE__BACKGROUND;
				default: return -1;
			}
		}
		if (baseClass == ColorAlphaSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.COLOR_ALPHA_SUPPORT__ALPHA: return ModelPackage.CIRCLE__ALPHA;
				default: return -1;
			}
		}
		if (baseClass == ColorForegroundSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.COLOR_FOREGROUND_SUPPORT__FOREGROUND: return ModelPackage.CIRCLE__FOREGROUND;
				default: return -1;
			}
		}
		if (baseClass == BorderSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.BORDER_SUPPORT__BORDER: return ModelPackage.CIRCLE__BORDER;
				default: return -1;
			}
		}
		if (baseClass == IconSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.ICON_SUPPORT__ICON: return ModelPackage.CIRCLE__ICON;
				default: return -1;
			}
		}
		if (baseClass == IconPositionSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.ICON_POSITION_SUPPORT__ICON_POSITION: return ModelPackage.CIRCLE__ICON_POSITION;
				default: return -1;
			}
		}
		if (baseClass == FontSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.FONT_SUPPORT__FONT: return ModelPackage.CIRCLE__FONT;
				default: return -1;
			}
		}
		if (baseClass == LinkSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.LINK_SUPPORT__LINK: return ModelPackage.CIRCLE__LINK;
				default: return -1;
			}
		}
		if (baseClass == TextAlignmentSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.TEXT_ALIGNMENT_SUPPORT__TEXT_ALIGNMENT: return ModelPackage.CIRCLE__TEXT_ALIGNMENT;
				default: return -1;
			}
		}
		if (baseClass == LineStyleSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.LINE_STYLE_SUPPORT__LINE_STYLE: return ModelPackage.CIRCLE__LINE_STYLE;
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
		result.append(" (background: ");
		result.append(background);
		result.append(", alpha: ");
		result.append(alpha);
		result.append(", foreground: ");
		result.append(foreground);
		result.append(", border: ");
		result.append(border);
		result.append(", icon: ");
		result.append(icon);
		result.append(", iconPosition: ");
		result.append(iconPosition);
		result.append(", link: ");
		result.append(link);
		result.append(", textAlignment: ");
		result.append(textAlignment);
		result.append(", lineStyle: ");
		result.append(lineStyle);
		result.append(')');
		return result.toString();
	}

} //CircleImpl
