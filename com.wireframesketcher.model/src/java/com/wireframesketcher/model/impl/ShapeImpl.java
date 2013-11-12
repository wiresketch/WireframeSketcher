/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import com.wireframesketcher.model.BorderSupport;
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
import com.wireframesketcher.model.Rotation90;
import com.wireframesketcher.model.RotationSupport;
import com.wireframesketcher.model.Shape;
import com.wireframesketcher.model.ShapeType;
import com.wireframesketcher.model.SkinSupport;
import com.wireframesketcher.model.TextAlignment;
import com.wireframesketcher.model.TextAlignmentSupport;
import com.wireframesketcher.model.WidgetDescriptor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.impl.ShapeImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ShapeImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ShapeImpl#getForeground <em>Foreground</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ShapeImpl#isBorder <em>Border</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ShapeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ShapeImpl#getIconRotation <em>Icon Rotation</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ShapeImpl#getIconPosition <em>Icon Position</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ShapeImpl#getFont <em>Font</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ShapeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ShapeImpl#getTextAlignment <em>Text Alignment</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ShapeImpl#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ShapeImpl#getSkin <em>Skin</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ShapeImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ShapeImpl#getShapeType <em>Shape Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShapeImpl extends WidgetImpl implements Shape {
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
	 * The default value of the '{@link #getIconPosition() <em>Icon Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconPosition()
	 * @generated
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
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final Rotation90 ROTATION_EDEFAULT = Rotation90._0;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected Rotation90 rotation = ROTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getShapeType() <em>Shape Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeType()
	 * @generated
	 * @ordered
	 */
	protected static final ShapeType SHAPE_TYPE_EDEFAULT = ShapeType.ELLIPSE;

	/**
	 * The cached value of the '{@link #getShapeType() <em>Shape Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeType()
	 * @generated
	 * @ordered
	 */
	protected ShapeType shapeType = SHAPE_TYPE_EDEFAULT;

	private static final WidgetDescriptor DESCRIPTOR = describe("Shape").resizeBoth().singleLine().centered().get();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ShapeImpl() {
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
		return ModelPackage.Literals.SHAPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SHAPE__BACKGROUND, oldBackground, background));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SHAPE__ALPHA, oldAlpha, alpha));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SHAPE__FOREGROUND, oldForeground, foreground));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SHAPE__BORDER, oldBorder, border));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SHAPE__ICON, oldIcon, icon));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SHAPE__ICON_ROTATION, oldIconRotation, iconRotation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SHAPE__ICON_POSITION, oldIconPosition, iconPosition));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SHAPE__FONT, oldFont, newFont);
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
				msgs = ((InternalEObject)font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SHAPE__FONT, null, msgs);
			if (newFont != null)
				msgs = ((InternalEObject)newFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SHAPE__FONT, null, msgs);
			msgs = basicSetFont(newFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SHAPE__FONT, newFont, newFont));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SHAPE__LINK, oldLink, link));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SHAPE__TEXT_ALIGNMENT, oldTextAlignment, textAlignment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SHAPE__LINE_STYLE, oldLineStyle, lineStyle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SHAPE__SKIN, oldSkin, skin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotation90 getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(Rotation90 newRotation) {
		Rotation90 oldRotation = rotation;
		rotation = newRotation == null ? ROTATION_EDEFAULT : newRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SHAPE__ROTATION, oldRotation, rotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeType getShapeType() {
		return shapeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeType(ShapeType newShapeType) {
		ShapeType oldShapeType = shapeType;
		shapeType = newShapeType == null ? SHAPE_TYPE_EDEFAULT : newShapeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SHAPE__SHAPE_TYPE, oldShapeType, shapeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isRotatable() {
		return skin == null && (shapeType == ShapeType.TRIANGLE || shapeType == ShapeType.STAR || shapeType == ShapeType.RIGHT_TRIANGLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SHAPE__FONT:
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
			case ModelPackage.SHAPE__BACKGROUND:
				return getBackground();
			case ModelPackage.SHAPE__ALPHA:
				return getAlpha();
			case ModelPackage.SHAPE__FOREGROUND:
				return getForeground();
			case ModelPackage.SHAPE__BORDER:
				return isBorder();
			case ModelPackage.SHAPE__ICON:
				return getIcon();
			case ModelPackage.SHAPE__ICON_ROTATION:
				return getIconRotation();
			case ModelPackage.SHAPE__ICON_POSITION:
				return getIconPosition();
			case ModelPackage.SHAPE__FONT:
				return getFont();
			case ModelPackage.SHAPE__LINK:
				return getLink();
			case ModelPackage.SHAPE__TEXT_ALIGNMENT:
				return getTextAlignment();
			case ModelPackage.SHAPE__LINE_STYLE:
				return getLineStyle();
			case ModelPackage.SHAPE__SKIN:
				return getSkin();
			case ModelPackage.SHAPE__ROTATION:
				return getRotation();
			case ModelPackage.SHAPE__SHAPE_TYPE:
				return getShapeType();
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
			case ModelPackage.SHAPE__BACKGROUND:
				setBackground((ColorDesc)newValue);
				return;
			case ModelPackage.SHAPE__ALPHA:
				setAlpha((Integer)newValue);
				return;
			case ModelPackage.SHAPE__FOREGROUND:
				setForeground((ColorDesc)newValue);
				return;
			case ModelPackage.SHAPE__BORDER:
				setBorder((Boolean)newValue);
				return;
			case ModelPackage.SHAPE__ICON:
				setIcon((IconDesc)newValue);
				return;
			case ModelPackage.SHAPE__ICON_ROTATION:
				setIconRotation((Rotation90)newValue);
				return;
			case ModelPackage.SHAPE__ICON_POSITION:
				setIconPosition((Position)newValue);
				return;
			case ModelPackage.SHAPE__FONT:
				setFont((Font)newValue);
				return;
			case ModelPackage.SHAPE__LINK:
				setLink((URI)newValue);
				return;
			case ModelPackage.SHAPE__TEXT_ALIGNMENT:
				setTextAlignment((TextAlignment)newValue);
				return;
			case ModelPackage.SHAPE__LINE_STYLE:
				setLineStyle((LineStyle)newValue);
				return;
			case ModelPackage.SHAPE__SKIN:
				setSkin((URI)newValue);
				return;
			case ModelPackage.SHAPE__ROTATION:
				setRotation((Rotation90)newValue);
				return;
			case ModelPackage.SHAPE__SHAPE_TYPE:
				setShapeType((ShapeType)newValue);
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
			case ModelPackage.SHAPE__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case ModelPackage.SHAPE__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case ModelPackage.SHAPE__FOREGROUND:
				setForeground(FOREGROUND_EDEFAULT);
				return;
			case ModelPackage.SHAPE__BORDER:
				setBorder(BORDER_EDEFAULT);
				return;
			case ModelPackage.SHAPE__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case ModelPackage.SHAPE__ICON_ROTATION:
				setIconRotation(ICON_ROTATION_EDEFAULT);
				return;
			case ModelPackage.SHAPE__ICON_POSITION:
				setIconPosition(ICON_POSITION_EDEFAULT);
				return;
			case ModelPackage.SHAPE__FONT:
				setFont((Font)null);
				return;
			case ModelPackage.SHAPE__LINK:
				setLink(LINK_EDEFAULT);
				return;
			case ModelPackage.SHAPE__TEXT_ALIGNMENT:
				setTextAlignment(TEXT_ALIGNMENT_EDEFAULT);
				return;
			case ModelPackage.SHAPE__LINE_STYLE:
				setLineStyle(LINE_STYLE_EDEFAULT);
				return;
			case ModelPackage.SHAPE__SKIN:
				setSkin(SKIN_EDEFAULT);
				return;
			case ModelPackage.SHAPE__ROTATION:
				setRotation(ROTATION_EDEFAULT);
				return;
			case ModelPackage.SHAPE__SHAPE_TYPE:
				setShapeType(SHAPE_TYPE_EDEFAULT);
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
			case ModelPackage.SHAPE__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case ModelPackage.SHAPE__ALPHA:
				return alpha != ALPHA_EDEFAULT;
			case ModelPackage.SHAPE__FOREGROUND:
				return FOREGROUND_EDEFAULT == null ? foreground != null : !FOREGROUND_EDEFAULT.equals(foreground);
			case ModelPackage.SHAPE__BORDER:
				return border != BORDER_EDEFAULT;
			case ModelPackage.SHAPE__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case ModelPackage.SHAPE__ICON_ROTATION:
				return iconRotation != ICON_ROTATION_EDEFAULT;
			case ModelPackage.SHAPE__ICON_POSITION:
				return iconPosition != ICON_POSITION_EDEFAULT;
			case ModelPackage.SHAPE__FONT:
				return font != null;
			case ModelPackage.SHAPE__LINK:
				return LINK_EDEFAULT == null ? link != null : !LINK_EDEFAULT.equals(link);
			case ModelPackage.SHAPE__TEXT_ALIGNMENT:
				return textAlignment != TEXT_ALIGNMENT_EDEFAULT;
			case ModelPackage.SHAPE__LINE_STYLE:
				return lineStyle != LINE_STYLE_EDEFAULT;
			case ModelPackage.SHAPE__SKIN:
				return SKIN_EDEFAULT == null ? skin != null : !SKIN_EDEFAULT.equals(skin);
			case ModelPackage.SHAPE__ROTATION:
				return rotation != ROTATION_EDEFAULT;
			case ModelPackage.SHAPE__SHAPE_TYPE:
				return shapeType != SHAPE_TYPE_EDEFAULT;
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
				case ModelPackage.SHAPE__BACKGROUND: return ModelPackage.COLOR_BACKGROUND_SUPPORT__BACKGROUND;
				default: return -1;
			}
		}
		if (baseClass == ColorAlphaSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.SHAPE__ALPHA: return ModelPackage.COLOR_ALPHA_SUPPORT__ALPHA;
				default: return -1;
			}
		}
		if (baseClass == ColorForegroundSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.SHAPE__FOREGROUND: return ModelPackage.COLOR_FOREGROUND_SUPPORT__FOREGROUND;
				default: return -1;
			}
		}
		if (baseClass == BorderSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.SHAPE__BORDER: return ModelPackage.BORDER_SUPPORT__BORDER;
				default: return -1;
			}
		}
		if (baseClass == IconSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.SHAPE__ICON: return ModelPackage.ICON_SUPPORT__ICON;
				case ModelPackage.SHAPE__ICON_ROTATION: return ModelPackage.ICON_SUPPORT__ICON_ROTATION;
				default: return -1;
			}
		}
		if (baseClass == IconPositionSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.SHAPE__ICON_POSITION: return ModelPackage.ICON_POSITION_SUPPORT__ICON_POSITION;
				default: return -1;
			}
		}
		if (baseClass == FontSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.SHAPE__FONT: return ModelPackage.FONT_SUPPORT__FONT;
				default: return -1;
			}
		}
		if (baseClass == LinkSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.SHAPE__LINK: return ModelPackage.LINK_SUPPORT__LINK;
				default: return -1;
			}
		}
		if (baseClass == TextAlignmentSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.SHAPE__TEXT_ALIGNMENT: return ModelPackage.TEXT_ALIGNMENT_SUPPORT__TEXT_ALIGNMENT;
				default: return -1;
			}
		}
		if (baseClass == LineStyleSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.SHAPE__LINE_STYLE: return ModelPackage.LINE_STYLE_SUPPORT__LINE_STYLE;
				default: return -1;
			}
		}
		if (baseClass == SkinSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.SHAPE__SKIN: return ModelPackage.SKIN_SUPPORT__SKIN;
				default: return -1;
			}
		}
		if (baseClass == RotationSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.SHAPE__ROTATION: return ModelPackage.ROTATION_SUPPORT__ROTATION;
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
				case ModelPackage.COLOR_BACKGROUND_SUPPORT__BACKGROUND: return ModelPackage.SHAPE__BACKGROUND;
				default: return -1;
			}
		}
		if (baseClass == ColorAlphaSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.COLOR_ALPHA_SUPPORT__ALPHA: return ModelPackage.SHAPE__ALPHA;
				default: return -1;
			}
		}
		if (baseClass == ColorForegroundSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.COLOR_FOREGROUND_SUPPORT__FOREGROUND: return ModelPackage.SHAPE__FOREGROUND;
				default: return -1;
			}
		}
		if (baseClass == BorderSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.BORDER_SUPPORT__BORDER: return ModelPackage.SHAPE__BORDER;
				default: return -1;
			}
		}
		if (baseClass == IconSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.ICON_SUPPORT__ICON: return ModelPackage.SHAPE__ICON;
				case ModelPackage.ICON_SUPPORT__ICON_ROTATION: return ModelPackage.SHAPE__ICON_ROTATION;
				default: return -1;
			}
		}
		if (baseClass == IconPositionSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.ICON_POSITION_SUPPORT__ICON_POSITION: return ModelPackage.SHAPE__ICON_POSITION;
				default: return -1;
			}
		}
		if (baseClass == FontSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.FONT_SUPPORT__FONT: return ModelPackage.SHAPE__FONT;
				default: return -1;
			}
		}
		if (baseClass == LinkSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.LINK_SUPPORT__LINK: return ModelPackage.SHAPE__LINK;
				default: return -1;
			}
		}
		if (baseClass == TextAlignmentSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.TEXT_ALIGNMENT_SUPPORT__TEXT_ALIGNMENT: return ModelPackage.SHAPE__TEXT_ALIGNMENT;
				default: return -1;
			}
		}
		if (baseClass == LineStyleSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.LINE_STYLE_SUPPORT__LINE_STYLE: return ModelPackage.SHAPE__LINE_STYLE;
				default: return -1;
			}
		}
		if (baseClass == SkinSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.SKIN_SUPPORT__SKIN: return ModelPackage.SHAPE__SKIN;
				default: return -1;
			}
		}
		if (baseClass == RotationSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.ROTATION_SUPPORT__ROTATION: return ModelPackage.SHAPE__ROTATION;
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
		result.append(", iconRotation: ");
		result.append(iconRotation);
		result.append(", iconPosition: ");
		result.append(iconPosition);
		result.append(", link: ");
		result.append(link);
		result.append(", textAlignment: ");
		result.append(textAlignment);
		result.append(", lineStyle: ");
		result.append(lineStyle);
		result.append(", skin: ");
		result.append(skin);
		result.append(", rotation: ");
		result.append(rotation);
		result.append(", shapeType: ");
		result.append(shapeType);
		result.append(')');
		return result.toString();
	}

} //ShapeImpl
