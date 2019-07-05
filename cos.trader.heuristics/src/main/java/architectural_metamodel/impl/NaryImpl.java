/**
 */
package architectural_metamodel.impl;

import architectural_metamodel.Architectural_metamodelPackage;
import architectural_metamodel.Binary;
import architectural_metamodel.Nary;
import architectural_metamodel.NaryType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link architectural_metamodel.impl.NaryImpl#getType <em>Type</em>}</li>
 *   <li>{@link architectural_metamodel.impl.NaryImpl#getBRelationship <em>BRelationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NaryImpl extends RelationshipImpl implements Nary {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final NaryType TYPE_EDEFAULT = NaryType.SEQUENCE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NaryType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBRelationship() <em>BRelationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Binary> bRelationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Architectural_metamodelPackage.Literals.NARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaryType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(NaryType newType) {
		NaryType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.NARY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binary> getBRelationship() {
		if (bRelationship == null) {
			bRelationship = new EObjectWithInverseResolvingEList<Binary>(Binary.class, this, Architectural_metamodelPackage.NARY__BRELATIONSHIP, Architectural_metamodelPackage.BINARY__NARY_RELATIONSHIP);
		}
		return bRelationship;
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
			case Architectural_metamodelPackage.NARY__BRELATIONSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBRelationship()).basicAdd(otherEnd, msgs);
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
			case Architectural_metamodelPackage.NARY__BRELATIONSHIP:
				return ((InternalEList<?>)getBRelationship()).basicRemove(otherEnd, msgs);
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
			case Architectural_metamodelPackage.NARY__TYPE:
				return getType();
			case Architectural_metamodelPackage.NARY__BRELATIONSHIP:
				return getBRelationship();
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
			case Architectural_metamodelPackage.NARY__TYPE:
				setType((NaryType)newValue);
				return;
			case Architectural_metamodelPackage.NARY__BRELATIONSHIP:
				getBRelationship().clear();
				getBRelationship().addAll((Collection<? extends Binary>)newValue);
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
			case Architectural_metamodelPackage.NARY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Architectural_metamodelPackage.NARY__BRELATIONSHIP:
				getBRelationship().clear();
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
			case Architectural_metamodelPackage.NARY__TYPE:
				return type != TYPE_EDEFAULT;
			case Architectural_metamodelPackage.NARY__BRELATIONSHIP:
				return bRelationship != null && !bRelationship.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //NaryImpl
