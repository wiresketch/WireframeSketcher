/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.wireframesketcher.model.Arrow;
import com.wireframesketcher.model.ColorAlphaSupport;
import com.wireframesketcher.model.ColorDesc;
import com.wireframesketcher.model.ColorForegroundSupport;
import com.wireframesketcher.model.LineStyle;
import com.wireframesketcher.model.LineStyleSupport;
import com.wireframesketcher.model.ModelFactory;
import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.Position;
import com.wireframesketcher.model.ResizeMode;
import com.wireframesketcher.model.WidgetDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arrow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.impl.ArrowImpl#getForeground <em>Foreground</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ArrowImpl#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ArrowImpl#isLeft <em>Left</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ArrowImpl#isRight <em>Right</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.ArrowImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrowImpl extends WidgetImpl implements Arrow {
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
	 * The default value of the '{@link #isLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeft()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEFT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeft()
	 * @generated
	 * @ordered
	 */
	protected boolean left = LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #isRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRight()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RIGHT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRight()
	 * @generated
	 * @ordered
	 */
	protected boolean right = RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Position DIRECTION_EDEFAULT = Position.TOP;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Position direction = DIRECTION_EDEFAULT;

	private static final WidgetDescriptor DESCRIPTOR = describe("Arrow", ResizeMode.BOTH_LITERAL, false, false);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ArrowImpl() {
		super();
		setAnnotation(true);
		descriptor = DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ARROW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ARROW__FOREGROUND, oldForeground, foreground));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ARROW__LINE_STYLE, oldLineStyle, lineStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(boolean newLeft) {
		boolean oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ARROW__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(boolean newRight) {
		boolean oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ARROW__RIGHT, oldRight, right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Position newDirection) {
		Position oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ARROW__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ARROW__FOREGROUND:
				return getForeground();
			case ModelPackage.ARROW__LINE_STYLE:
				return getLineStyle();
			case ModelPackage.ARROW__LEFT:
				return isLeft();
			case ModelPackage.ARROW__RIGHT:
				return isRight();
			case ModelPackage.ARROW__DIRECTION:
				return getDirection();
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
			case ModelPackage.ARROW__FOREGROUND:
				setForeground((ColorDesc)newValue);
				return;
			case ModelPackage.ARROW__LINE_STYLE:
				setLineStyle((LineStyle)newValue);
				return;
			case ModelPackage.ARROW__LEFT:
				setLeft((Boolean)newValue);
				return;
			case ModelPackage.ARROW__RIGHT:
				setRight((Boolean)newValue);
				return;
			case ModelPackage.ARROW__DIRECTION:
				setDirection((Position)newValue);
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
			case ModelPackage.ARROW__FOREGROUND:
				setForeground(FOREGROUND_EDEFAULT);
				return;
			case ModelPackage.ARROW__LINE_STYLE:
				setLineStyle(LINE_STYLE_EDEFAULT);
				return;
			case ModelPackage.ARROW__LEFT:
				setLeft(LEFT_EDEFAULT);
				return;
			case ModelPackage.ARROW__RIGHT:
				setRight(RIGHT_EDEFAULT);
				return;
			case ModelPackage.ARROW__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
			case ModelPackage.ARROW__FOREGROUND:
				return FOREGROUND_EDEFAULT == null ? foreground != null : !FOREGROUND_EDEFAULT.equals(foreground);
			case ModelPackage.ARROW__LINE_STYLE:
				return lineStyle != LINE_STYLE_EDEFAULT;
			case ModelPackage.ARROW__LEFT:
				return left != LEFT_EDEFAULT;
			case ModelPackage.ARROW__RIGHT:
				return right != RIGHT_EDEFAULT;
			case ModelPackage.ARROW__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
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
		if (baseClass == ColorForegroundSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.ARROW__FOREGROUND: return ModelPackage.COLOR_FOREGROUND_SUPPORT__FOREGROUND;
				default: return -1;
			}
		}
		if (baseClass == LineStyleSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.ARROW__LINE_STYLE: return ModelPackage.LINE_STYLE_SUPPORT__LINE_STYLE;
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
		if (baseClass == ColorForegroundSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.COLOR_FOREGROUND_SUPPORT__FOREGROUND: return ModelPackage.ARROW__FOREGROUND;
				default: return -1;
			}
		}
		if (baseClass == LineStyleSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.LINE_STYLE_SUPPORT__LINE_STYLE: return ModelPackage.ARROW__LINE_STYLE;
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
		result.append(" (foreground: ");
		result.append(foreground);
		result.append(", lineStyle: ");
		result.append(lineStyle);
		result.append(", left: ");
		result.append(left);
		result.append(", right: ");
		result.append(right);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //ArrowImpl
