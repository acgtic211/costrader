/**
 */
package acmm.impl;

import acmm.AcmmPackage;
import acmm.Property;
import acmm.PropertyID;
import acmm.PropertyPriority;

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
 *   <li>{@link acmm.impl.PropertyImpl#getPropertyID <em>Property ID</em>}</li>
 *   <li>{@link acmm.impl.PropertyImpl#getPropertyValue <em>Property Value</em>}</li>
 *   <li>{@link acmm.impl.PropertyImpl#getPropertyPriority <em>Property Priority</em>}</li>
 *   <li>{@link acmm.impl.PropertyImpl#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link acmm.impl.PropertyImpl#isIsEditable <em>Is Editable</em>}</li>
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
	 * The default value of the '{@link #getPropertyPriority() <em>Property Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyPriority()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyPriority PROPERTY_PRIORITY_EDEFAULT = PropertyPriority.NORMAL;

	/**
	 * The cached value of the '{@link #getPropertyPriority() <em>Property Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyPriority()
	 * @generated
	 * @ordered
	 */
	protected PropertyPriority propertyPriority = PROPERTY_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean isMandatory = IS_MANDATORY_EDEFAULT;

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
		return AcmmPackage.Literals.PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AcmmPackage.PROPERTY__PROPERTY_ID, oldPropertyID, propertyID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AcmmPackage.PROPERTY__PROPERTY_VALUE, oldPropertyValue, propertyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyPriority getPropertyPriority() {
		return propertyPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyPriority(PropertyPriority newPropertyPriority) {
		PropertyPriority oldPropertyPriority = propertyPriority;
		propertyPriority = newPropertyPriority == null ? PROPERTY_PRIORITY_EDEFAULT : newPropertyPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcmmPackage.PROPERTY__PROPERTY_PRIORITY, oldPropertyPriority, propertyPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMandatory() {
		return isMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMandatory(boolean newIsMandatory) {
		boolean oldIsMandatory = isMandatory;
		isMandatory = newIsMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcmmPackage.PROPERTY__IS_MANDATORY, oldIsMandatory, isMandatory));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AcmmPackage.PROPERTY__IS_EDITABLE, oldIsEditable, isEditable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AcmmPackage.PROPERTY__PROPERTY_ID:
				return getPropertyID();
			case AcmmPackage.PROPERTY__PROPERTY_VALUE:
				return getPropertyValue();
			case AcmmPackage.PROPERTY__PROPERTY_PRIORITY:
				return getPropertyPriority();
			case AcmmPackage.PROPERTY__IS_MANDATORY:
				return isIsMandatory();
			case AcmmPackage.PROPERTY__IS_EDITABLE:
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
			case AcmmPackage.PROPERTY__PROPERTY_ID:
				setPropertyID((PropertyID)newValue);
				return;
			case AcmmPackage.PROPERTY__PROPERTY_VALUE:
				setPropertyValue((String)newValue);
				return;
			case AcmmPackage.PROPERTY__PROPERTY_PRIORITY:
				setPropertyPriority((PropertyPriority)newValue);
				return;
			case AcmmPackage.PROPERTY__IS_MANDATORY:
				setIsMandatory((Boolean)newValue);
				return;
			case AcmmPackage.PROPERTY__IS_EDITABLE:
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
			case AcmmPackage.PROPERTY__PROPERTY_ID:
				setPropertyID(PROPERTY_ID_EDEFAULT);
				return;
			case AcmmPackage.PROPERTY__PROPERTY_VALUE:
				setPropertyValue(PROPERTY_VALUE_EDEFAULT);
				return;
			case AcmmPackage.PROPERTY__PROPERTY_PRIORITY:
				setPropertyPriority(PROPERTY_PRIORITY_EDEFAULT);
				return;
			case AcmmPackage.PROPERTY__IS_MANDATORY:
				setIsMandatory(IS_MANDATORY_EDEFAULT);
				return;
			case AcmmPackage.PROPERTY__IS_EDITABLE:
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
			case AcmmPackage.PROPERTY__PROPERTY_ID:
				return propertyID != PROPERTY_ID_EDEFAULT;
			case AcmmPackage.PROPERTY__PROPERTY_VALUE:
				return PROPERTY_VALUE_EDEFAULT == null ? propertyValue != null : !PROPERTY_VALUE_EDEFAULT.equals(propertyValue);
			case AcmmPackage.PROPERTY__PROPERTY_PRIORITY:
				return propertyPriority != PROPERTY_PRIORITY_EDEFAULT;
			case AcmmPackage.PROPERTY__IS_MANDATORY:
				return isMandatory != IS_MANDATORY_EDEFAULT;
			case AcmmPackage.PROPERTY__IS_EDITABLE:
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
		result.append(", propertyPriority: ");
		result.append(propertyPriority);
		result.append(", isMandatory: ");
		result.append(isMandatory);
		result.append(", isEditable: ");
		result.append(isEditable);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
