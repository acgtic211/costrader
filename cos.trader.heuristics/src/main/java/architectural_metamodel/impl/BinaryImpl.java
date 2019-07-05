/**
 */
package architectural_metamodel.impl;

import architectural_metamodel.AbstractComponent;
import architectural_metamodel.AbstractDependency;
import architectural_metamodel.Architectural_metamodelPackage;
import architectural_metamodel.Binary;
import architectural_metamodel.BinaryType;
import architectural_metamodel.Nary;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link architectural_metamodel.impl.BinaryImpl#getType <em>Type</em>}</li>
 *   <li>{@link architectural_metamodel.impl.BinaryImpl#isIsBidirectional <em>Is Bidirectional</em>}</li>
 *   <li>{@link architectural_metamodel.impl.BinaryImpl#getNaryRelationship <em>Nary Relationship</em>}</li>
 *   <li>{@link architectural_metamodel.impl.BinaryImpl#getSource <em>Source</em>}</li>
 *   <li>{@link architectural_metamodel.impl.BinaryImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link architectural_metamodel.impl.BinaryImpl#getDependency <em>Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryImpl extends RelationshipImpl implements Binary {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final BinaryType TYPE_EDEFAULT = BinaryType.ASSOCIATION;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected BinaryType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsBidirectional() <em>Is Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BIDIRECTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBidirectional() <em>Is Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBidirectional()
	 * @generated
	 * @ordered
	 */
	protected boolean isBidirectional = IS_BIDIRECTIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNaryRelationship() <em>Nary Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaryRelationship()
	 * @generated
	 * @ordered
	 */
	protected Nary naryRelationship;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected AbstractComponent source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected AbstractComponent target;

	/**
	 * The cached value of the '{@link #getDependency() <em>Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDependency> dependency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Architectural_metamodelPackage.Literals.BINARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(BinaryType newType) {
		BinaryType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.BINARY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBidirectional() {
		return isBidirectional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBidirectional(boolean newIsBidirectional) {
		boolean oldIsBidirectional = isBidirectional;
		isBidirectional = newIsBidirectional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.BINARY__IS_BIDIRECTIONAL, oldIsBidirectional, isBidirectional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nary getNaryRelationship() {
		if (naryRelationship != null && naryRelationship.eIsProxy()) {
			InternalEObject oldNaryRelationship = (InternalEObject)naryRelationship;
			naryRelationship = (Nary)eResolveProxy(oldNaryRelationship);
			if (naryRelationship != oldNaryRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Architectural_metamodelPackage.BINARY__NARY_RELATIONSHIP, oldNaryRelationship, naryRelationship));
			}
		}
		return naryRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nary basicGetNaryRelationship() {
		return naryRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaryRelationship(Nary newNaryRelationship, NotificationChain msgs) {
		Nary oldNaryRelationship = naryRelationship;
		naryRelationship = newNaryRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.BINARY__NARY_RELATIONSHIP, oldNaryRelationship, newNaryRelationship);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNaryRelationship(Nary newNaryRelationship) {
		if (newNaryRelationship != naryRelationship) {
			NotificationChain msgs = null;
			if (naryRelationship != null)
				msgs = ((InternalEObject)naryRelationship).eInverseRemove(this, Architectural_metamodelPackage.NARY__BRELATIONSHIP, Nary.class, msgs);
			if (newNaryRelationship != null)
				msgs = ((InternalEObject)newNaryRelationship).eInverseAdd(this, Architectural_metamodelPackage.NARY__BRELATIONSHIP, Nary.class, msgs);
			msgs = basicSetNaryRelationship(newNaryRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.BINARY__NARY_RELATIONSHIP, newNaryRelationship, newNaryRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractComponent getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (AbstractComponent)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Architectural_metamodelPackage.BINARY__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractComponent basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(AbstractComponent newSource, NotificationChain msgs) {
		AbstractComponent oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.BINARY__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(AbstractComponent newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, Architectural_metamodelPackage.ABSTRACT_COMPONENT__BSOURCE, AbstractComponent.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, Architectural_metamodelPackage.ABSTRACT_COMPONENT__BSOURCE, AbstractComponent.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.BINARY__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractComponent getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (AbstractComponent)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Architectural_metamodelPackage.BINARY__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractComponent basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(AbstractComponent newTarget, NotificationChain msgs) {
		AbstractComponent oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.BINARY__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(AbstractComponent newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, Architectural_metamodelPackage.ABSTRACT_COMPONENT__BTARGET, AbstractComponent.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, Architectural_metamodelPackage.ABSTRACT_COMPONENT__BTARGET, AbstractComponent.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.BINARY__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractDependency> getDependency() {
		if (dependency == null) {
			dependency = new EObjectContainmentWithInverseEList<AbstractDependency>(AbstractDependency.class, this, Architectural_metamodelPackage.BINARY__DEPENDENCY, Architectural_metamodelPackage.ABSTRACT_DEPENDENCY__BRELATIONSHIP);
		}
		return dependency;
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
			case Architectural_metamodelPackage.BINARY__NARY_RELATIONSHIP:
				if (naryRelationship != null)
					msgs = ((InternalEObject)naryRelationship).eInverseRemove(this, Architectural_metamodelPackage.NARY__BRELATIONSHIP, Nary.class, msgs);
				return basicSetNaryRelationship((Nary)otherEnd, msgs);
			case Architectural_metamodelPackage.BINARY__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, Architectural_metamodelPackage.ABSTRACT_COMPONENT__BSOURCE, AbstractComponent.class, msgs);
				return basicSetSource((AbstractComponent)otherEnd, msgs);
			case Architectural_metamodelPackage.BINARY__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, Architectural_metamodelPackage.ABSTRACT_COMPONENT__BTARGET, AbstractComponent.class, msgs);
				return basicSetTarget((AbstractComponent)otherEnd, msgs);
			case Architectural_metamodelPackage.BINARY__DEPENDENCY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependency()).basicAdd(otherEnd, msgs);
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
			case Architectural_metamodelPackage.BINARY__NARY_RELATIONSHIP:
				return basicSetNaryRelationship(null, msgs);
			case Architectural_metamodelPackage.BINARY__SOURCE:
				return basicSetSource(null, msgs);
			case Architectural_metamodelPackage.BINARY__TARGET:
				return basicSetTarget(null, msgs);
			case Architectural_metamodelPackage.BINARY__DEPENDENCY:
				return ((InternalEList<?>)getDependency()).basicRemove(otherEnd, msgs);
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
			case Architectural_metamodelPackage.BINARY__TYPE:
				return getType();
			case Architectural_metamodelPackage.BINARY__IS_BIDIRECTIONAL:
				return isIsBidirectional();
			case Architectural_metamodelPackage.BINARY__NARY_RELATIONSHIP:
				if (resolve) return getNaryRelationship();
				return basicGetNaryRelationship();
			case Architectural_metamodelPackage.BINARY__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Architectural_metamodelPackage.BINARY__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case Architectural_metamodelPackage.BINARY__DEPENDENCY:
				return getDependency();
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
			case Architectural_metamodelPackage.BINARY__TYPE:
				setType((BinaryType)newValue);
				return;
			case Architectural_metamodelPackage.BINARY__IS_BIDIRECTIONAL:
				setIsBidirectional((Boolean)newValue);
				return;
			case Architectural_metamodelPackage.BINARY__NARY_RELATIONSHIP:
				setNaryRelationship((Nary)newValue);
				return;
			case Architectural_metamodelPackage.BINARY__SOURCE:
				setSource((AbstractComponent)newValue);
				return;
			case Architectural_metamodelPackage.BINARY__TARGET:
				setTarget((AbstractComponent)newValue);
				return;
			case Architectural_metamodelPackage.BINARY__DEPENDENCY:
				getDependency().clear();
				getDependency().addAll((Collection<? extends AbstractDependency>)newValue);
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
			case Architectural_metamodelPackage.BINARY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Architectural_metamodelPackage.BINARY__IS_BIDIRECTIONAL:
				setIsBidirectional(IS_BIDIRECTIONAL_EDEFAULT);
				return;
			case Architectural_metamodelPackage.BINARY__NARY_RELATIONSHIP:
				setNaryRelationship((Nary)null);
				return;
			case Architectural_metamodelPackage.BINARY__SOURCE:
				setSource((AbstractComponent)null);
				return;
			case Architectural_metamodelPackage.BINARY__TARGET:
				setTarget((AbstractComponent)null);
				return;
			case Architectural_metamodelPackage.BINARY__DEPENDENCY:
				getDependency().clear();
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
			case Architectural_metamodelPackage.BINARY__TYPE:
				return type != TYPE_EDEFAULT;
			case Architectural_metamodelPackage.BINARY__IS_BIDIRECTIONAL:
				return isBidirectional != IS_BIDIRECTIONAL_EDEFAULT;
			case Architectural_metamodelPackage.BINARY__NARY_RELATIONSHIP:
				return naryRelationship != null;
			case Architectural_metamodelPackage.BINARY__SOURCE:
				return source != null;
			case Architectural_metamodelPackage.BINARY__TARGET:
				return target != null;
			case Architectural_metamodelPackage.BINARY__DEPENDENCY:
				return dependency != null && !dependency.isEmpty();
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
		result.append(", isBidirectional: ");
		result.append(isBidirectional);
		result.append(')');
		return result.toString();
	}

} //BinaryImpl
