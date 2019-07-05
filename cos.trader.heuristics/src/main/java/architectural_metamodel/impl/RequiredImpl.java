/**
 */
package architectural_metamodel.impl;

import architectural_metamodel.AbstractDependency;
import architectural_metamodel.Architectural_metamodelPackage;
import architectural_metamodel.Required;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link architectural_metamodel.impl.RequiredImpl#getDSource <em>DSource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiredImpl extends InterfaceImpl implements Required {
	/**
	 * The cached value of the '{@link #getDSource() <em>DSource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSource()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDependency> dSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Architectural_metamodelPackage.Literals.REQUIRED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractDependency> getDSource() {
		if (dSource == null) {
			dSource = new EObjectWithInverseResolvingEList<AbstractDependency>(AbstractDependency.class, this, Architectural_metamodelPackage.REQUIRED__DSOURCE, Architectural_metamodelPackage.ABSTRACT_DEPENDENCY__SOURCE);
		}
		return dSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Architectural_metamodelPackage.REQUIRED__DSOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDSource()).basicAdd(otherEnd, msgs);
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
			case Architectural_metamodelPackage.REQUIRED__DSOURCE:
				return ((InternalEList<?>)getDSource()).basicRemove(otherEnd, msgs);
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
			case Architectural_metamodelPackage.REQUIRED__DSOURCE:
				return getDSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Architectural_metamodelPackage.REQUIRED__DSOURCE:
				getDSource().clear();
				getDSource().addAll((Collection<? extends AbstractDependency>)newValue);
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
			case Architectural_metamodelPackage.REQUIRED__DSOURCE:
				getDSource().clear();
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
			case Architectural_metamodelPackage.REQUIRED__DSOURCE:
				return dSource != null && !dSource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequiredImpl
