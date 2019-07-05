/**
 */
package acmm.impl;

import acmm.AcmmPackage;
import acmm.Functional;
import acmm.ProvidedInterfaces;
import acmm.RequiredInterfaces;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link acmm.impl.FunctionalImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link acmm.impl.FunctionalImpl#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionalImpl extends MinimalEObjectImpl.Container implements Functional {
	/**
	 * The cached value of the '{@link #getProvidedInterfaces() <em>Provided Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected ProvidedInterfaces providedInterfaces;

	/**
	 * The cached value of the '{@link #getRequiredInterfaces() <em>Required Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInterfaces()
	 * @generated
	 * @ordered
	 */
	protected RequiredInterfaces requiredInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcmmPackage.Literals.FUNCTIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedInterfaces getProvidedInterfaces() {
		return providedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidedInterfaces(ProvidedInterfaces newProvidedInterfaces, NotificationChain msgs) {
		ProvidedInterfaces oldProvidedInterfaces = providedInterfaces;
		providedInterfaces = newProvidedInterfaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcmmPackage.FUNCTIONAL__PROVIDED_INTERFACES, oldProvidedInterfaces, newProvidedInterfaces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedInterfaces(ProvidedInterfaces newProvidedInterfaces) {
		if (newProvidedInterfaces != providedInterfaces) {
			NotificationChain msgs = null;
			if (providedInterfaces != null)
				msgs = ((InternalEObject)providedInterfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcmmPackage.FUNCTIONAL__PROVIDED_INTERFACES, null, msgs);
			if (newProvidedInterfaces != null)
				msgs = ((InternalEObject)newProvidedInterfaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcmmPackage.FUNCTIONAL__PROVIDED_INTERFACES, null, msgs);
			msgs = basicSetProvidedInterfaces(newProvidedInterfaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcmmPackage.FUNCTIONAL__PROVIDED_INTERFACES, newProvidedInterfaces, newProvidedInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredInterfaces getRequiredInterfaces() {
		return requiredInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredInterfaces(RequiredInterfaces newRequiredInterfaces, NotificationChain msgs) {
		RequiredInterfaces oldRequiredInterfaces = requiredInterfaces;
		requiredInterfaces = newRequiredInterfaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcmmPackage.FUNCTIONAL__REQUIRED_INTERFACES, oldRequiredInterfaces, newRequiredInterfaces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredInterfaces(RequiredInterfaces newRequiredInterfaces) {
		if (newRequiredInterfaces != requiredInterfaces) {
			NotificationChain msgs = null;
			if (requiredInterfaces != null)
				msgs = ((InternalEObject)requiredInterfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcmmPackage.FUNCTIONAL__REQUIRED_INTERFACES, null, msgs);
			if (newRequiredInterfaces != null)
				msgs = ((InternalEObject)newRequiredInterfaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcmmPackage.FUNCTIONAL__REQUIRED_INTERFACES, null, msgs);
			msgs = basicSetRequiredInterfaces(newRequiredInterfaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcmmPackage.FUNCTIONAL__REQUIRED_INTERFACES, newRequiredInterfaces, newRequiredInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AcmmPackage.FUNCTIONAL__PROVIDED_INTERFACES:
				return basicSetProvidedInterfaces(null, msgs);
			case AcmmPackage.FUNCTIONAL__REQUIRED_INTERFACES:
				return basicSetRequiredInterfaces(null, msgs);
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
			case AcmmPackage.FUNCTIONAL__PROVIDED_INTERFACES:
				return getProvidedInterfaces();
			case AcmmPackage.FUNCTIONAL__REQUIRED_INTERFACES:
				return getRequiredInterfaces();
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
			case AcmmPackage.FUNCTIONAL__PROVIDED_INTERFACES:
				setProvidedInterfaces((ProvidedInterfaces)newValue);
				return;
			case AcmmPackage.FUNCTIONAL__REQUIRED_INTERFACES:
				setRequiredInterfaces((RequiredInterfaces)newValue);
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
			case AcmmPackage.FUNCTIONAL__PROVIDED_INTERFACES:
				setProvidedInterfaces((ProvidedInterfaces)null);
				return;
			case AcmmPackage.FUNCTIONAL__REQUIRED_INTERFACES:
				setRequiredInterfaces((RequiredInterfaces)null);
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
			case AcmmPackage.FUNCTIONAL__PROVIDED_INTERFACES:
				return providedInterfaces != null;
			case AcmmPackage.FUNCTIONAL__REQUIRED_INTERFACES:
				return requiredInterfaces != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionalImpl
