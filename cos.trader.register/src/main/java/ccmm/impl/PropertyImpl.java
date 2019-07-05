/**
 */
package ccmm.impl;

import ccmm.CcmmPackage;
import ccmm.Property;
import ccmm.PropertyID;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ccmm.impl.PropertyImpl#getPropertyID <em>Property ID</em>}</li>
 *   <li>{@link ccmm.impl.PropertyImpl#getPropertyValue <em>Property Value</em>}</li>
 *   <li>{@link ccmm.impl.PropertyImpl#isIsEditable <em>Is Editable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property {
	/**
	 * The default value of the '{@link #getPropertyID() <em>Property ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyID()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyID PROPERTY_ID_EDEFAULT = PropertyID.WIDTH;

	/**
	 * The cached value of the '{@link #getPropertyID() <em>Property ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyID()
	 * @generated
	 * @ordered
	 */
	protected PropertyID propertyID = PROPERTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyValue() <em>Property Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyValue()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyValue() <em>Property Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyValue()
	 * @generated
	 * @ordered
	 */
	protected String propertyValue = PROPERTY_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsEditable() <em>Is Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EDITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEditable() <em>Is Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean isEditable = IS_EDITABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CcmmPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyID getPropertyID() {
		return propertyID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyID(PropertyID newPropertyID) {
		PropertyID oldPropertyID = propertyID;
		propertyID = newPropertyID == null ? PROPERTY_ID_EDEFAULT : newPropertyID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.PROPERTY__PROPERTY_ID, oldPropertyID, propertyID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyValue() {
		return propertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyValue(String newPropertyValue) {
		String oldPropertyValue = propertyValue;
		propertyValue = newPropertyValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.PROPERTY__PROPERTY_VALUE, oldPropertyValue, propertyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEditable() {
		return isEditable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEditable(boolean newIsEditable) {
		boolean oldIsEditable = isEditable;
		isEditable = newIsEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.PROPERTY__IS_EDITABLE, oldIsEditable, isEditable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CcmmPackage.PROPERTY__PROPERTY_ID:
				return getPropertyID();
			case CcmmPackage.PROPERTY__PROPERTY_VALUE:
				return getPropertyValue();
			case CcmmPackage.PROPERTY__IS_EDITABLE:
				return isIsEditable();
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
			case CcmmPackage.PROPERTY__PROPERTY_ID:
				setPropertyID((PropertyID)newValue);
				return;
			case CcmmPackage.PROPERTY__PROPERTY_VALUE:
				setPropertyValue((String)newValue);
				return;
			case CcmmPackage.PROPERTY__IS_EDITABLE:
				setIsEditable((Boolean)newValue);
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
			case CcmmPackage.PROPERTY__PROPERTY_ID:
				setPropertyID(PROPERTY_ID_EDEFAULT);
				return;
			case CcmmPackage.PROPERTY__PROPERTY_VALUE:
				setPropertyValue(PROPERTY_VALUE_EDEFAULT);
				return;
			case CcmmPackage.PROPERTY__IS_EDITABLE:
				setIsEditable(IS_EDITABLE_EDEFAULT);
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
			case CcmmPackage.PROPERTY__PROPERTY_ID:
				return propertyID != PROPERTY_ID_EDEFAULT;
			case CcmmPackage.PROPERTY__PROPERTY_VALUE:
				return PROPERTY_VALUE_EDEFAULT == null ? propertyValue != null : !PROPERTY_VALUE_EDEFAULT.equals(propertyValue);
			case CcmmPackage.PROPERTY__IS_EDITABLE:
				return isEditable != IS_EDITABLE_EDEFAULT;
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
		result.append(" (propertyID: ");
		result.append(propertyID);
		result.append(", propertyValue: ");
		result.append(propertyValue);
		result.append(", isEditable: ");
		result.append(isEditable);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
