/**
 */
package ccmm.impl;

import ccmm.CcmmPackage;
import ccmm.Implementation;
import ccmm.PlatformType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ccmm.impl.ImplementationImpl#getProgrammingLanguage <em>Programming Language</em>}</li>
 *   <li>{@link ccmm.impl.ImplementationImpl#getPlatformType <em>Platform Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementationImpl extends MinimalEObjectImpl.Container implements Implementation {
	/**
	 * The default value of the '{@link #getProgrammingLanguage() <em>Programming Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammingLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAMMING_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgrammingLanguage() <em>Programming Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammingLanguage()
	 * @generated
	 * @ordered
	 */
	protected String programmingLanguage = PROGRAMMING_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlatformType() <em>Platform Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformType()
	 * @generated
	 * @ordered
	 */
	protected static final PlatformType PLATFORM_TYPE_EDEFAULT = PlatformType.WEB;

	/**
	 * The cached value of the '{@link #getPlatformType() <em>Platform Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformType()
	 * @generated
	 * @ordered
	 */
	protected PlatformType platformType = PLATFORM_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CcmmPackage.Literals.IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgrammingLanguage(String newProgrammingLanguage) {
		String oldProgrammingLanguage = programmingLanguage;
		programmingLanguage = newProgrammingLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.IMPLEMENTATION__PROGRAMMING_LANGUAGE, oldProgrammingLanguage, programmingLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformType getPlatformType() {
		return platformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatformType(PlatformType newPlatformType) {
		PlatformType oldPlatformType = platformType;
		platformType = newPlatformType == null ? PLATFORM_TYPE_EDEFAULT : newPlatformType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.IMPLEMENTATION__PLATFORM_TYPE, oldPlatformType, platformType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CcmmPackage.IMPLEMENTATION__PROGRAMMING_LANGUAGE:
				return getProgrammingLanguage();
			case CcmmPackage.IMPLEMENTATION__PLATFORM_TYPE:
				return getPlatformType();
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
			case CcmmPackage.IMPLEMENTATION__PROGRAMMING_LANGUAGE:
				setProgrammingLanguage((String)newValue);
				return;
			case CcmmPackage.IMPLEMENTATION__PLATFORM_TYPE:
				setPlatformType((PlatformType)newValue);
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
			case CcmmPackage.IMPLEMENTATION__PROGRAMMING_LANGUAGE:
				setProgrammingLanguage(PROGRAMMING_LANGUAGE_EDEFAULT);
				return;
			case CcmmPackage.IMPLEMENTATION__PLATFORM_TYPE:
				setPlatformType(PLATFORM_TYPE_EDEFAULT);
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
			case CcmmPackage.IMPLEMENTATION__PROGRAMMING_LANGUAGE:
				return PROGRAMMING_LANGUAGE_EDEFAULT == null ? programmingLanguage != null : !PROGRAMMING_LANGUAGE_EDEFAULT.equals(programmingLanguage);
			case CcmmPackage.IMPLEMENTATION__PLATFORM_TYPE:
				return platformType != PLATFORM_TYPE_EDEFAULT;
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
		result.append(" (programmingLanguage: ");
		result.append(programmingLanguage);
		result.append(", platformType: ");
		result.append(platformType);
		result.append(')');
		return result.toString();
	}

} //ImplementationImpl
