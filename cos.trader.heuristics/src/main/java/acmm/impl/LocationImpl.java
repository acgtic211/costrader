/**
 */
package acmm.impl;

import acmm.AcmmPackage;
import acmm.Location;
import acmm.RepositoryType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link acmm.impl.LocationImpl#getRepositoryID <em>Repository ID</em>}</li>
 *   <li>{@link acmm.impl.LocationImpl#getRepositoryType <em>Repository Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationImpl extends MinimalEObjectImpl.Container implements Location {
	/**
	 * The default value of the '{@link #getRepositoryID() <em>Repository ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryID()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOSITORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepositoryID() <em>Repository ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryID()
	 * @generated
	 * @ordered
	 */
	protected String repositoryID = REPOSITORY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepositoryType() <em>Repository Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryType()
	 * @generated
	 * @ordered
	 */
	protected static final RepositoryType REPOSITORY_TYPE_EDEFAULT = RepositoryType.APACHE_WOOKIE_013_1;

	/**
	 * The cached value of the '{@link #getRepositoryType() <em>Repository Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryType()
	 * @generated
	 * @ordered
	 */
	protected RepositoryType repositoryType = REPOSITORY_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcmmPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepositoryID() {
		return repositoryID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepositoryID(String newRepositoryID) {
		String oldRepositoryID = repositoryID;
		repositoryID = newRepositoryID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcmmPackage.LOCATION__REPOSITORY_ID, oldRepositoryID, repositoryID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryType getRepositoryType() {
		return repositoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepositoryType(RepositoryType newRepositoryType) {
		RepositoryType oldRepositoryType = repositoryType;
		repositoryType = newRepositoryType == null ? REPOSITORY_TYPE_EDEFAULT : newRepositoryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcmmPackage.LOCATION__REPOSITORY_TYPE, oldRepositoryType, repositoryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AcmmPackage.LOCATION__REPOSITORY_ID:
				return getRepositoryID();
			case AcmmPackage.LOCATION__REPOSITORY_TYPE:
				return getRepositoryType();
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
			case AcmmPackage.LOCATION__REPOSITORY_ID:
				setRepositoryID((String)newValue);
				return;
			case AcmmPackage.LOCATION__REPOSITORY_TYPE:
				setRepositoryType((RepositoryType)newValue);
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
			case AcmmPackage.LOCATION__REPOSITORY_ID:
				setRepositoryID(REPOSITORY_ID_EDEFAULT);
				return;
			case AcmmPackage.LOCATION__REPOSITORY_TYPE:
				setRepositoryType(REPOSITORY_TYPE_EDEFAULT);
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
			case AcmmPackage.LOCATION__REPOSITORY_ID:
				return REPOSITORY_ID_EDEFAULT == null ? repositoryID != null : !REPOSITORY_ID_EDEFAULT.equals(repositoryID);
			case AcmmPackage.LOCATION__REPOSITORY_TYPE:
				return repositoryType != REPOSITORY_TYPE_EDEFAULT;
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
		result.append(" (repositoryID: ");
		result.append(repositoryID);
		result.append(", repositoryType: ");
		result.append(repositoryType);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
