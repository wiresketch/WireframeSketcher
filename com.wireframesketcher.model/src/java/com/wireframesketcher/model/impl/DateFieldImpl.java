/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import com.wireframesketcher.model.ColorAlphaSupport;
import com.wireframesketcher.model.ColorBackgroundSupport;
import com.wireframesketcher.model.ColorBorderSupport;
import com.wireframesketcher.model.ColorDesc;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.wireframesketcher.model.DateField;
import com.wireframesketcher.model.ModelFactory;
import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.SkinSupport;
import com.wireframesketcher.model.ResizeMode;
import com.wireframesketcher.model.State;
import com.wireframesketcher.model.StateSupport;
import com.wireframesketcher.model.WidgetDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.wireframesketcher.model.impl.DateFieldImpl#getState <em>State</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.DateFieldImpl#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.DateFieldImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.DateFieldImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link com.wireframesketcher.model.impl.DateFieldImpl#getSkin <em>Skin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateFieldImpl extends WidgetImpl implements DateField {
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
	 * The default value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected static final ColorDesc BORDER_COLOR_EDEFAULT = (ColorDesc)ModelFactory.eINSTANCE.createFromString(ModelPackage.eINSTANCE.getColorDataType(), "black");

	/**
	 * The cached value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected ColorDesc borderColor = BORDER_COLOR_EDEFAULT;

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

	private static final WidgetDescriptor DESCRIPTOR = describe("Date Field", ResizeMode.HORIZONTAL_LITERAL);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected DateFieldImpl() {
		super();
		descriptor = DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DATE_FIELD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DATE_FIELD__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorDesc getBorderColor() {
		return borderColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderColor(ColorDesc newBorderColor) {
		ColorDesc oldBorderColor = borderColor;
		borderColor = newBorderColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DATE_FIELD__BORDER_COLOR, oldBorderColor, borderColor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DATE_FIELD__BACKGROUND, oldBackground, background));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DATE_FIELD__ALPHA, oldAlpha, alpha));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DATE_FIELD__SKIN, oldSkin, skin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isValidState(State state) {
		return state == State.NORMAL || state == State.DISABLED || state == State.FOCUSED; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.DATE_FIELD__STATE:
				return getState();
			case ModelPackage.DATE_FIELD__BORDER_COLOR:
				return getBorderColor();
			case ModelPackage.DATE_FIELD__BACKGROUND:
				return getBackground();
			case ModelPackage.DATE_FIELD__ALPHA:
				return getAlpha();
			case ModelPackage.DATE_FIELD__SKIN:
				return getSkin();
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
			case ModelPackage.DATE_FIELD__STATE:
				setState((State)newValue);
				return;
			case ModelPackage.DATE_FIELD__BORDER_COLOR:
				setBorderColor((ColorDesc)newValue);
				return;
			case ModelPackage.DATE_FIELD__BACKGROUND:
				setBackground((ColorDesc)newValue);
				return;
			case ModelPackage.DATE_FIELD__ALPHA:
				setAlpha((Integer)newValue);
				return;
			case ModelPackage.DATE_FIELD__SKIN:
				setSkin((URI)newValue);
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
			case ModelPackage.DATE_FIELD__STATE:
				setState(STATE_EDEFAULT);
				return;
			case ModelPackage.DATE_FIELD__BORDER_COLOR:
				setBorderColor(BORDER_COLOR_EDEFAULT);
				return;
			case ModelPackage.DATE_FIELD__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case ModelPackage.DATE_FIELD__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case ModelPackage.DATE_FIELD__SKIN:
				setSkin(SKIN_EDEFAULT);
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
			case ModelPackage.DATE_FIELD__STATE:
				return state != STATE_EDEFAULT;
			case ModelPackage.DATE_FIELD__BORDER_COLOR:
				return BORDER_COLOR_EDEFAULT == null ? borderColor != null : !BORDER_COLOR_EDEFAULT.equals(borderColor);
			case ModelPackage.DATE_FIELD__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case ModelPackage.DATE_FIELD__ALPHA:
				return alpha != ALPHA_EDEFAULT;
			case ModelPackage.DATE_FIELD__SKIN:
				return SKIN_EDEFAULT == null ? skin != null : !SKIN_EDEFAULT.equals(skin);
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
				case ModelPackage.DATE_FIELD__STATE: return ModelPackage.STATE_SUPPORT__STATE;
				default: return -1;
			}
		}
		if (baseClass == ColorBorderSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.DATE_FIELD__BORDER_COLOR: return ModelPackage.COLOR_BORDER_SUPPORT__BORDER_COLOR;
				default: return -1;
			}
		}
		if (baseClass == ColorBackgroundSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.DATE_FIELD__BACKGROUND: return ModelPackage.COLOR_BACKGROUND_SUPPORT__BACKGROUND;
				default: return -1;
			}
		}
		if (baseClass == ColorAlphaSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.DATE_FIELD__ALPHA: return ModelPackage.COLOR_ALPHA_SUPPORT__ALPHA;
				default: return -1;
			}
		}
		if (baseClass == SkinSupport.class) {
			switch (derivedFeatureID) {
				case ModelPackage.DATE_FIELD__SKIN: return ModelPackage.SKIN_SUPPORT__SKIN;
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
				case ModelPackage.STATE_SUPPORT__STATE: return ModelPackage.DATE_FIELD__STATE;
				default: return -1;
			}
		}
		if (baseClass == ColorBorderSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.COLOR_BORDER_SUPPORT__BORDER_COLOR: return ModelPackage.DATE_FIELD__BORDER_COLOR;
				default: return -1;
			}
		}
		if (baseClass == ColorBackgroundSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.COLOR_BACKGROUND_SUPPORT__BACKGROUND: return ModelPackage.DATE_FIELD__BACKGROUND;
				default: return -1;
			}
		}
		if (baseClass == ColorAlphaSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.COLOR_ALPHA_SUPPORT__ALPHA: return ModelPackage.DATE_FIELD__ALPHA;
				default: return -1;
			}
		}
		if (baseClass == SkinSupport.class) {
			switch (baseFeatureID) {
				case ModelPackage.SKIN_SUPPORT__SKIN: return ModelPackage.DATE_FIELD__SKIN;
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
		result.append(", borderColor: ");
		result.append(borderColor);
		result.append(", background: ");
		result.append(background);
		result.append(", alpha: ");
		result.append(alpha);
		result.append(", skin: ");
		result.append(skin);
		result.append(')');
		return result.toString();
	}

} //DateFieldImpl
