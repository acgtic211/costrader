/**
 */
package architectural_metamodel.impl;

import architectural_metamodel.AbstractArchitecturalModel;
import architectural_metamodel.Architectural_metamodelPackage;
import architectural_metamodel.ConcreteArchitecturalModel;
import architectural_metamodel.Relationship;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link architectural_metamodel.impl.RelationshipImpl#getRelationshipID <em>Relationship ID</em>}</li>
 *   <li>{@link architectural_metamodel.impl.RelationshipImpl#getAam <em>Aam</em>}</li>
 *   <li>{@link architectural_metamodel.impl.RelationshipImpl#getCam <em>Cam</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RelationshipImpl extends MinimalEObjectImpl.Container implements Relationship {
	/**
	 * The default value of the '{@link #getRelationshipID() <em>Relationship ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipID()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIONSHIP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelationshipID() <em>Relationship ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipID()
	 * @generated
	 * @ordered
	 */
	protected String relationshipID = RELATIONSHIP_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Architectural_metamodelPackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelationshipID() {
		return relationshipID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipID(String newRelationshipID) {
		String oldRelationshipID = relationshipID;
		relationshipID = newRelationshipID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.RELATIONSHIP__RELATIONSHIP_ID, oldRelationshipID, relationshipID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractArchitecturalModel getAam() {
		if (eContainerFeatureID() != Architectural_metamodelPackage.RELATIONSHIP__AAM) return null;
		return (AbstractArchitecturalModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAam(AbstractArchitecturalModel newAam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAam, Architectural_metamodelPackage.RELATIONSHIP__AAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAam(AbstractArchitecturalModel newAam) {
		if (newAam != eInternalContainer() || (eContainerFeatureID() != Architectural_metamodelPackage.RELATIONSHIP__AAM && newAam != null)) {
			if (EcoreUtil.isAncestor(this, newAam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAam != null)
				msgs = ((InternalEObject)newAam).eInverseAdd(this, Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__RELATIONSHIP, AbstractArchitecturalModel.class, msgs);
			msgs = basicSetAam(newAam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.RELATIONSHIP__AAM, newAam, newAam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteArchitecturalModel getCam() {
		if (eContainerFeatureID() != Architectural_metamodelPackage.RELATIONSHIP__CAM) return null;
		return (ConcreteArchitecturalModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCam(ConcreteArchitecturalModel newCam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCam, Architectural_metamodelPackage.RELATIONSHIP__CAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCam(ConcreteArchitecturalModel newCam) {
		if (newCam != eInternalContainer() || (eContainerFeatureID() != Architectural_metamodelPackage.RELATIONSHIP__CAM && newCam != null)) {
			if (EcoreUtil.isAncestor(this, newCam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCam != null)
				msgs = ((InternalEObject)newCam).eInverseAdd(this, Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__RELATIONSHIP, ConcreteArchitecturalModel.class, msgs);
			msgs = basicSetCam(newCam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.RELATIONSHIP__CAM, newCam, newCam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Architectural_metamodelPackage.RELATIONSHIP__AAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAam((AbstractArchitecturalModel)otherEnd, msgs);
			case Architectural_metamodelPackage.RELATIONSHIP__CAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCam((ConcreteArchitecturalModel)otherEnd, msgs);
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
			case Architectural_metamodelPackage.RELATIONSHIP__AAM:
				return basicSetAam(null, msgs);
			case Architectural_metamodelPackage.RELATIONSHIP__CAM:
				return basicSetCam(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Architectural_metamodelPackage.RELATIONSHIP__AAM:
				return eInternalContainer().eInverseRemove(this, Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__RELATIONSHIP, AbstractArchitecturalModel.class, msgs);
			case Architectural_metamodelPackage.RELATIONSHIP__CAM:
				return eInternalContainer().eInverseRemove(this, Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__RELATIONSHIP, ConcreteArchitecturalModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Architectural_metamodelPackage.RELATIONSHIP__RELATIONSHIP_ID:
				return getRelationshipID();
			case Architectural_metamodelPackage.RELATIONSHIP__AAM:
				return getAam();
			case Architectural_metamodelPackage.RELATIONSHIP__CAM:
				return getCam();
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
			case Architectural_metamodelPackage.RELATIONSHIP__RELATIONSHIP_ID:
				setRelationshipID((String)newValue);
				return;
			case Architectural_metamodelPackage.RELATIONSHIP__AAM:
				setAam((AbstractArchitecturalModel)newValue);
				return;
			case Architectural_metamodelPackage.RELATIONSHIP__CAM:
				setCam((ConcreteArchitecturalModel)newValue);
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
			case Architectural_metamodelPackage.RELATIONSHIP__RELATIONSHIP_ID:
				setRelationshipID(RELATIONSHIP_ID_EDEFAULT);
				return;
			case Architectural_metamodelPackage.RELATIONSHIP__AAM:
				setAam((AbstractArchitecturalModel)null);
				return;
			case Architectural_metamodelPackage.RELATIONSHIP__CAM:
				setCam((ConcreteArchitecturalModel)null);
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
			case Architectural_metamodelPackage.RELATIONSHIP__RELATIONSHIP_ID:
				return RELATIONSHIP_ID_EDEFAULT == null ? relationshipID != null : !RELATIONSHIP_ID_EDEFAULT.equals(relationshipID);
			case Architectural_metamodelPackage.RELATIONSHIP__AAM:
				return getAam() != null;
			case Architectural_metamodelPackage.RELATIONSHIP__CAM:
				return getCam() != null;
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
		result.append(" (relationshipID: ");
		result.append(relationshipID);
		result.append(')');
		return result.toString();
	}

} //RelationshipImpl
