/**
 */
package architectural_metamodel.impl;

import architectural_metamodel.AbstractArchitecturalModel;
import architectural_metamodel.Architectural_metamodelPackage;
import architectural_metamodel.ConcreteArchitecturalModel;
import architectural_metamodel.ConcreteComponent;
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
 * An implementation of the model object '<em><b>Concrete Architectural Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link architectural_metamodel.impl.ConcreteArchitecturalModelImpl#getConcreteComponent <em>Concrete Component</em>}</li>
 *   <li>{@link architectural_metamodel.impl.ConcreteArchitecturalModelImpl#getAam <em>Aam</em>}</li>
 *   <li>{@link architectural_metamodel.impl.ConcreteArchitecturalModelImpl#getCamID <em>Cam ID</em>}</li>
 *   <li>{@link architectural_metamodel.impl.ConcreteArchitecturalModelImpl#getAamID <em>Aam ID</em>}</li>
 *   <li>{@link architectural_metamodel.impl.ConcreteArchitecturalModelImpl#getRelationship <em>Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcreteArchitecturalModelImpl extends MinimalEObjectImpl.Container implements ConcreteArchitecturalModel {
	/**
	 * The cached value of the '{@link #getConcreteComponent() <em>Concrete Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcreteComponent> concreteComponent;

	/**
	 * The cached value of the '{@link #getAam() <em>Aam</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAam()
	 * @generated
	 * @ordered
	 */
	protected AbstractArchitecturalModel aam;

	/**
	 * The default value of the '{@link #getCamID() <em>Cam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCamID()
	 * @generated
	 * @ordered
	 */
	protected static final String CAM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCamID() <em>Cam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCamID()
	 * @generated
	 * @ordered
	 */
	protected String camID = CAM_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> relationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteArchitecturalModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Architectural_metamodelPackage.Literals.CONCRETE_ARCHITECTURAL_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteComponent> getConcreteComponent() {
		if (concreteComponent == null) {
			concreteComponent = new EObjectContainmentWithInverseEList<ConcreteComponent>(ConcreteComponent.class, this, Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__CONCRETE_COMPONENT, Architectural_metamodelPackage.CONCRETE_COMPONENT__CAM);
		}
		return concreteComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractArchitecturalModel getAam() {
		if (aam != null && aam.eIsProxy()) {
			InternalEObject oldAam = (InternalEObject)aam;
			aam = (AbstractArchitecturalModel)eResolveProxy(oldAam);
			if (aam != oldAam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__AAM, oldAam, aam));
			}
		}
		return aam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractArchitecturalModel basicGetAam() {
		return aam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAam(AbstractArchitecturalModel newAam) {
		AbstractArchitecturalModel oldAam = aam;
		aam = newAam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__AAM, oldAam, aam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCamID() {
		return camID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCamID(String newCamID) {
		String oldCamID = camID;
		camID = newCamID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__CAM_ID, oldCamID, camID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__AAM_ID, oldAamID, aamID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRelationship() {
		if (relationship == null) {
			relationship = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__RELATIONSHIP, Architectural_metamodelPackage.RELATIONSHIP__CAM);
		}
		return relationship;
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
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__CONCRETE_COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConcreteComponent()).basicAdd(otherEnd, msgs);
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__RELATIONSHIP:
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
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__CONCRETE_COMPONENT:
				return ((InternalEList<?>)getConcreteComponent()).basicRemove(otherEnd, msgs);
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__RELATIONSHIP:
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
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__CONCRETE_COMPONENT:
				return getConcreteComponent();
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__AAM:
				if (resolve) return getAam();
				return basicGetAam();
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__CAM_ID:
				return getCamID();
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__AAM_ID:
				return getAamID();
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__RELATIONSHIP:
				return getRelationship();
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
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__CONCRETE_COMPONENT:
				getConcreteComponent().clear();
				getConcreteComponent().addAll((Collection<? extends ConcreteComponent>)newValue);
				return;
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__AAM:
				setAam((AbstractArchitecturalModel)newValue);
				return;
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__CAM_ID:
				setCamID((String)newValue);
				return;
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__AAM_ID:
				setAamID((String)newValue);
				return;
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__RELATIONSHIP:
				getRelationship().clear();
				getRelationship().addAll((Collection<? extends Relationship>)newValue);
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
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__CONCRETE_COMPONENT:
				getConcreteComponent().clear();
				return;
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__AAM:
				setAam((AbstractArchitecturalModel)null);
				return;
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__CAM_ID:
				setCamID(CAM_ID_EDEFAULT);
				return;
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__AAM_ID:
				setAamID(AAM_ID_EDEFAULT);
				return;
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__RELATIONSHIP:
				getRelationship().clear();
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
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__CONCRETE_COMPONENT:
				return concreteComponent != null && !concreteComponent.isEmpty();
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__AAM:
				return aam != null;
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__CAM_ID:
				return CAM_ID_EDEFAULT == null ? camID != null : !CAM_ID_EDEFAULT.equals(camID);
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__AAM_ID:
				return AAM_ID_EDEFAULT == null ? aamID != null : !AAM_ID_EDEFAULT.equals(aamID);
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__RELATIONSHIP:
				return relationship != null && !relationship.isEmpty();
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
		result.append(" (camID: ");
		result.append(camID);
		result.append(", aamID: ");
		result.append(aamID);
		result.append(')');
		return result.toString();
	}

} //ConcreteArchitecturalModelImpl
