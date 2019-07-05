/**
 */
package architectural_metamodel.impl;

import architectural_metamodel.Architectural_metamodelPackage;
import architectural_metamodel.ConcreteComponent;
import architectural_metamodel.RuntimeProperty;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link architectural_metamodel.impl.RuntimePropertyImpl#getCc <em>Cc</em>}</li>
 *   <li>{@link architectural_metamodel.impl.RuntimePropertyImpl#getPropertyID <em>Property ID</em>}</li>
 *   <li>{@link architectural_metamodel.impl.RuntimePropertyImpl#getPropertyValue <em>Property Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuntimePropertyImpl extends MinimalEObjectImpl.Container implements RuntimeProperty {
	/**
	 * The cached value of the '{@link #getCc() <em>Cc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCc()
	 * @generated
	 * @ordered
	 */
	protected ConcreteComponent cc;

	/**
	 * The default value of the '{@link #getPropertyID() <em>Property ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyID()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyID() <em>Property ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyID()
	 * @generated
	 * @ordered
	 */
	protected String propertyID = PROPERTY_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Architectural_metamodelPackage.Literals.RUNTIME_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteComponent getCc() {
		if (cc != null && cc.eIsProxy()) {
			InternalEObject oldCc = (InternalEObject)cc;
			cc = (ConcreteComponent)eResolveProxy(oldCc);
			if (cc != oldCc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Architectural_metamodelPackage.RUNTIME_PROPERTY__CC, oldCc, cc));
			}
		}
		return cc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteComponent basicGetCc() {
		return cc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCc(ConcreteComponent newCc, NotificationChain msgs) {
		ConcreteComponent oldCc = cc;
		cc = newCc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.RUNTIME_PROPERTY__CC, oldCc, newCc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCc(ConcreteComponent newCc) {
		if (newCc != cc) {
			NotificationChain msgs = null;
			if (cc != null)
				msgs = ((InternalEObject)cc).eInverseRemove(this, Architectural_metamodelPackage.CONCRETE_COMPONENT__RUNTIME_PROPERTY, ConcreteComponent.class, msgs);
			if (newCc != null)
				msgs = ((InternalEObject)newCc).eInverseAdd(this, Architectural_metamodelPackage.CONCRETE_COMPONENT__RUNTIME_PROPERTY, ConcreteComponent.class, msgs);
			msgs = basicSetCc(newCc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.RUNTIME_PROPERTY__CC, newCc, newCc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyID() {
		return propertyID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyID(String newPropertyID) {
		String oldPropertyID = propertyID;
		propertyID = newPropertyID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.RUNTIME_PROPERTY__PROPERTY_ID, oldPropertyID, propertyID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.RUNTIME_PROPERTY__PROPERTY_VALUE, oldPropertyValue, propertyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Architectural_metamodelPackage.RUNTIME_PROPERTY__CC:
				if (cc != null)
					msgs = ((InternalEObject)cc).eInverseRemove(this, Architectural_metamodelPackage.CONCRETE_COMPONENT__RUNTIME_PROPERTY, ConcreteComponent.class, msgs);
				return basicSetCc((ConcreteComponent)otherEnd, msgs);
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
			case Architectural_metamodelPackage.RUNTIME_PROPERTY__CC:
				return basicSetCc(null, msgs);
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
			case Architectural_metamodelPackage.RUNTIME_PROPERTY__CC:
				if (resolve) return getCc();
				return basicGetCc();
			case Architectural_metamodelPackage.RUNTIME_PROPERTY__PROPERTY_ID:
				return getPropertyID();
			case Architectural_metamodelPackage.RUNTIME_PROPERTY__PROPERTY_VALUE:
				return getPropertyValue();
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
			case Architectural_metamodelPackage.RUNTIME_PROPERTY__CC:
				setCc((ConcreteComponent)newValue);
				return;
			case Architectural_metamodelPackage.RUNTIME_PROPERTY__PROPERTY_ID:
				setPropertyID((String)newValue);
				return;
			case Architectural_metamodelPackage.RUNTIME_PROPERTY__PROPERTY_VALUE:
				setPropertyValue((String)newValue);
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
			case Architectural_metamodelPackage.RUNTIME_PROPERTY__CC:
				setCc((ConcreteComponent)null);
				return;
			case Architectural_metamodelPackage.RUNTIME_PROPERTY__PROPERTY_ID:
				setPropertyID(PROPERTY_ID_EDEFAULT);
				return;
			case Architectural_metamodelPackage.RUNTIME_PROPERTY__PROPERTY_VALUE:
				setPropertyValue(PROPERTY_VALUE_EDEFAULT);
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
			case Architectural_metamodelPackage.RUNTIME_PROPERTY__CC:
				return cc != null;
			case Architectural_metamodelPackage.RUNTIME_PROPERTY__PROPERTY_ID:
				return PROPERTY_ID_EDEFAULT == null ? propertyID != null : !PROPERTY_ID_EDEFAULT.equals(propertyID);
			case Architectural_metamodelPackage.RUNTIME_PROPERTY__PROPERTY_VALUE:
				return PROPERTY_VALUE_EDEFAULT == null ? propertyValue != null : !PROPERTY_VALUE_EDEFAULT.equals(propertyValue);
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
		result.append(')');
		return result.toString();
	}

} //RuntimePropertyImpl
