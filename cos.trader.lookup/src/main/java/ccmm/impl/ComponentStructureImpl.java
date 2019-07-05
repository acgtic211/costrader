/**
 */
package ccmm.impl;

import ccmm.CcmmPackage;
import ccmm.ComponentStructure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ccmm.impl.ComponentStructureImpl#getFilesLanguage <em>Files Language</em>}</li>
 *   <li>{@link ccmm.impl.ComponentStructureImpl#getFilesAddress <em>Files Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComponentStructureImpl extends MinimalEObjectImpl.Container implements ComponentStructure {
	/**
	 * The default value of the '{@link #getFilesLanguage() <em>Files Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilesLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String FILES_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilesLanguage() <em>Files Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilesLanguage()
	 * @generated
	 * @ordered
	 */
	protected String filesLanguage = FILES_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilesAddress() <em>Files Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilesAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String FILES_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilesAddress() <em>Files Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilesAddress()
	 * @generated
	 * @ordered
	 */
	protected String filesAddress = FILES_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CcmmPackage.Literals.COMPONENT_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilesLanguage() {
		return filesLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilesLanguage(String newFilesLanguage) {
		String oldFilesLanguage = filesLanguage;
		filesLanguage = newFilesLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.COMPONENT_STRUCTURE__FILES_LANGUAGE, oldFilesLanguage, filesLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilesAddress() {
		return filesAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilesAddress(String newFilesAddress) {
		String oldFilesAddress = filesAddress;
		filesAddress = newFilesAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.COMPONENT_STRUCTURE__FILES_ADDRESS, oldFilesAddress, filesAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CcmmPackage.COMPONENT_STRUCTURE__FILES_LANGUAGE:
				return getFilesLanguage();
			case CcmmPackage.COMPONENT_STRUCTURE__FILES_ADDRESS:
				return getFilesAddress();
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
			case CcmmPackage.COMPONENT_STRUCTURE__FILES_LANGUAGE:
				setFilesLanguage((String)newValue);
				return;
			case CcmmPackage.COMPONENT_STRUCTURE__FILES_ADDRESS:
				setFilesAddress((String)newValue);
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
			case CcmmPackage.COMPONENT_STRUCTURE__FILES_LANGUAGE:
				setFilesLanguage(FILES_LANGUAGE_EDEFAULT);
				return;
			case CcmmPackage.COMPONENT_STRUCTURE__FILES_ADDRESS:
				setFilesAddress(FILES_ADDRESS_EDEFAULT);
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
			case CcmmPackage.COMPONENT_STRUCTURE__FILES_LANGUAGE:
				return FILES_LANGUAGE_EDEFAULT == null ? filesLanguage != null : !FILES_LANGUAGE_EDEFAULT.equals(filesLanguage);
			case CcmmPackage.COMPONENT_STRUCTURE__FILES_ADDRESS:
				return FILES_ADDRESS_EDEFAULT == null ? filesAddress != null : !FILES_ADDRESS_EDEFAULT.equals(filesAddress);
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
		result.append(" (filesLanguage: ");
		result.append(filesLanguage);
		result.append(", filesAddress: ");
		result.append(filesAddress);
		result.append(')');
		return result.toString();
	}

} //ComponentStructureImpl
