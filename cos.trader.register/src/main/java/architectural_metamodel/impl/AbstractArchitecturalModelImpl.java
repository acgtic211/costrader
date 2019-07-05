/**
 */
package architectural_metamodel.impl;

import architectural_metamodel.AbstractArchitecturalModel;
import architectural_metamodel.AbstractComponent;
import architectural_metamodel.Architectural_metamodelPackage;
import architectural_metamodel.Relationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Architectural Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link architectural_metamodel.impl.AbstractArchitecturalModelImpl#getAbstractComponent <em>Abstract Component</em>}</li>
 *   <li>{@link architectural_metamodel.impl.AbstractArchitecturalModelImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link architectural_metamodel.impl.AbstractArchitecturalModelImpl#getAamID <em>Aam ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractArchitecturalModelImpl extends MinimalEObjectImpl.Container implements AbstractArchitecturalModel {
	/**
	 * The cached value of the '{@link #getAbstractComponent() <em>Abstract Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractComponent> abstractComponent;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> relationship;

	/**
	 * The default value of the '{@link #getAamID() <em>Aam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAamID()
	 * @generated
	 * @ordered
	 */
	protected static final String AAM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAamID() <em>Aam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAamID()
	 * @generated
	 * @ordered
	 */
	protected String aamID = AAM_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractArchitecturalModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Architectural_metamodelPackage.Literals.ABSTRACT_ARCHITECTURAL_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractComponent> getAbstractComponent() {
		if (abstractComponent == null) {
			abstractComponent = new EObjectContainmentWithInverseEList<AbstractComponent>(AbstractComponent.class, this, Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__ABSTRACT_COMPONENT, Architectural_metamodelPackage.ABSTRACT_COMPONENT__AAM);
		}
		return abstractComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRelationship() {
		if (relationship == null) {
			relationship = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__RELATIONSHIP, Architectural_metamodelPackage.RELATIONSHIP__AAM);
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAamID() {
		return aamID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAamID(String newAamID) {
		String oldAamID = aamID;
		aamID = newAamID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__AAM_ID, oldAamID, aamID));
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
			case Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__ABSTRACT_COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAbstractComponent()).basicAdd(otherEnd, msgs);
			case Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__RELATIONSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelationship()).basicAdd(otherEnd, msgs);
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
			case Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__ABSTRACT_COMPONENT:
				return ((InternalEList<?>)getAbstractComponent()).basicRemove(otherEnd, msgs);
			case Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__RELATIONSHIP:
				return ((InternalEList<?>)getRelationship()).basicRemove(otherEnd, msgs);
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
			case Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__ABSTRACT_COMPONENT:
				return getAbstractComponent();
			case Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__RELATIONSHIP:
				return getRelationship();
			case Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__AAM_ID:
				return getAamID();
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
			case Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__ABSTRACT_COMPONENT:
				getAbstractComponent().clear();
				getAbstractComponent().addAll((Collection<? extends AbstractComponent>)newValue);
				return;
			case Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__RELATIONSHIP:
				getRelationship().clear();
				getRelationship().addAll((Collection<? extends Relationship>)newValue);
				return;
			case Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__AAM_ID:
				setAamID((String)newValue);
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
			case Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__ABSTRACT_COMPONENT:
				getAbstractComponent().clear();
				return;
			case Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__RELATIONSHIP:
				getRelationship().clear();
				return;
			case Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__AAM_ID:
				setAamID(AAM_ID_EDEFAULT);
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
			case Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__ABSTRACT_COMPONENT:
				return abstractComponent != null && !abstractComponent.isEmpty();
			case Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__RELATIONSHIP:
				return relationship != null && !relationship.isEmpty();
			case Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__AAM_ID:
				return AAM_ID_EDEFAULT == null ? aamID != null : !AAM_ID_EDEFAULT.equals(aamID);
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
		result.append(" (aamID: ");
		result.append(aamID);
		result.append(')');
		return result.toString();
	}

} //AbstractArchitecturalModelImpl
