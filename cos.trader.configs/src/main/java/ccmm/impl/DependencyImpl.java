/**
 */
package ccmm.impl;

import ccmm.CcmmPackage;
import ccmm.Dependency;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ccmm.impl.DependencyImpl#getInterfaceID <em>Interface ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyImpl extends MinimalEObjectImpl.Container implements Dependency {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CcmmPackage.Literals.DEPENDENCY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.DEPENDENCY__INTERFACE_ID, oldInterfaceID, interfaceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CcmmPackage.DEPENDENCY__INTERFACE_ID:
				return getInterfaceID();
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
			case CcmmPackage.DEPENDENCY__INTERFACE_ID:
				setInterfaceID((String)newValue);
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
			case CcmmPackage.DEPENDENCY__INTERFACE_ID:
				setInterfaceID(INTERFACE_ID_EDEFAULT);
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
			case CcmmPackage.DEPENDENCY__INTERFACE_ID:
				return INTERFACE_ID_EDEFAULT == null ? interfaceID != null : !INTERFACE_ID_EDEFAULT.equals(interfaceID);
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
		result.append(')');
		return result.toString();
	}

} //DependencyImpl
