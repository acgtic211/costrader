/**
 */
package ccmm.impl;

import ccmm.CcmmPackage;
import ccmm.Interface;
import ccmm.WSDLSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ccmm.impl.InterfaceImpl#getInterfaceID <em>Interface ID</em>}</li>
 *   <li>{@link ccmm.impl.InterfaceImpl#getInterfaceDescription <em>Interface Description</em>}</li>
 *   <li>{@link ccmm.impl.InterfaceImpl#getInterfaceSpecification <em>Interface Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InterfaceImpl extends MinimalEObjectImpl.Container implements Interface {
	/**
	 * The default value of the '{@link #getInterfaceID() <em>Interface ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceID()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterfaceID() <em>Interface ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceID()
	 * @generated
	 * @ordered
	 */
	protected String interfaceID = INTERFACE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterfaceDescription() <em>Interface Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterfaceDescription() <em>Interface Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceDescription()
	 * @generated
	 * @ordered
	 */
	protected String interfaceDescription = INTERFACE_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterfaceSpecification() <em>Interface Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceSpecification()
	 * @generated
	 * @ordered
	 */
	protected WSDLSpecification interfaceSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CcmmPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterfaceID() {
		return interfaceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceID(String newInterfaceID) {
		String oldInterfaceID = interfaceID;
		interfaceID = newInterfaceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.INTERFACE__INTERFACE_ID, oldInterfaceID, interfaceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterfaceDescription() {
		return interfaceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceDescription(String newInterfaceDescription) {
		String oldInterfaceDescription = interfaceDescription;
		interfaceDescription = newInterfaceDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.INTERFACE__INTERFACE_DESCRIPTION, oldInterfaceDescription, interfaceDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSDLSpecification getInterfaceSpecification() {
		return interfaceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaceSpecification(WSDLSpecification newInterfaceSpecification, NotificationChain msgs) {
		WSDLSpecification oldInterfaceSpecification = interfaceSpecification;
		interfaceSpecification = newInterfaceSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CcmmPackage.INTERFACE__INTERFACE_SPECIFICATION, oldInterfaceSpecification, newInterfaceSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceSpecification(WSDLSpecification newInterfaceSpecification) {
		if (newInterfaceSpecification != interfaceSpecification) {
			NotificationChain msgs = null;
			if (interfaceSpecification != null)
				msgs = ((InternalEObject)interfaceSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CcmmPackage.INTERFACE__INTERFACE_SPECIFICATION, null, msgs);
			if (newInterfaceSpecification != null)
				msgs = ((InternalEObject)newInterfaceSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CcmmPackage.INTERFACE__INTERFACE_SPECIFICATION, null, msgs);
			msgs = basicSetInterfaceSpecification(newInterfaceSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.INTERFACE__INTERFACE_SPECIFICATION, newInterfaceSpecification, newInterfaceSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CcmmPackage.INTERFACE__INTERFACE_SPECIFICATION:
				return basicSetInterfaceSpecification(null, msgs);
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
			case CcmmPackage.INTERFACE__INTERFACE_ID:
				return getInterfaceID();
			case CcmmPackage.INTERFACE__INTERFACE_DESCRIPTION:
				return getInterfaceDescription();
			case CcmmPackage.INTERFACE__INTERFACE_SPECIFICATION:
				return getInterfaceSpecification();
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
			case CcmmPackage.INTERFACE__INTERFACE_ID:
				setInterfaceID((String)newValue);
				return;
			case CcmmPackage.INTERFACE__INTERFACE_DESCRIPTION:
				setInterfaceDescription((String)newValue);
				return;
			case CcmmPackage.INTERFACE__INTERFACE_SPECIFICATION:
				setInterfaceSpecification((WSDLSpecification)newValue);
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
			case CcmmPackage.INTERFACE__INTERFACE_ID:
				setInterfaceID(INTERFACE_ID_EDEFAULT);
				return;
			case CcmmPackage.INTERFACE__INTERFACE_DESCRIPTION:
				setInterfaceDescription(INTERFACE_DESCRIPTION_EDEFAULT);
				return;
			case CcmmPackage.INTERFACE__INTERFACE_SPECIFICATION:
				setInterfaceSpecification((WSDLSpecification)null);
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
			case CcmmPackage.INTERFACE__INTERFACE_ID:
				return INTERFACE_ID_EDEFAULT == null ? interfaceID != null : !INTERFACE_ID_EDEFAULT.equals(interfaceID);
			case CcmmPackage.INTERFACE__INTERFACE_DESCRIPTION:
				return INTERFACE_DESCRIPTION_EDEFAULT == null ? interfaceDescription != null : !INTERFACE_DESCRIPTION_EDEFAULT.equals(interfaceDescription);
			case CcmmPackage.INTERFACE__INTERFACE_SPECIFICATION:
				return interfaceSpecification != null;
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
		result.append(" (interfaceID: ");
		result.append(interfaceID);
		result.append(", interfaceDescription: ");
		result.append(interfaceDescription);
		result.append(')');
		return result.toString();
	}

} //InterfaceImpl
