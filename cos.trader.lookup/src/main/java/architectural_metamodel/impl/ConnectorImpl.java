/**
 */
package architectural_metamodel.impl;

import architectural_metamodel.Architectural_metamodelPackage;
import architectural_metamodel.ConcreteDependency;
import architectural_metamodel.Connector;
import architectural_metamodel.InputPort;
import architectural_metamodel.OutputPort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link architectural_metamodel.impl.ConnectorImpl#getConnectorID <em>Connector ID</em>}</li>
 *   <li>{@link architectural_metamodel.impl.ConnectorImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link architectural_metamodel.impl.ConnectorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link architectural_metamodel.impl.ConnectorImpl#getDependency <em>Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
	/**
	 * The default value of the '{@link #getConnectorID() <em>Connector ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorID()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectorID() <em>Connector ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorID()
	 * @generated
	 * @ordered
	 */
	protected String connectorID = CONNECTOR_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected InputPort target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected OutputPort source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Architectural_metamodelPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectorID() {
		return connectorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorID(String newConnectorID) {
		String oldConnectorID = connectorID;
		connectorID = newConnectorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.CONNECTOR__CONNECTOR_ID, oldConnectorID, connectorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (InputPort)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Architectural_metamodelPackage.CONNECTOR__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(InputPort newTarget, NotificationChain msgs) {
		InputPort oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.CONNECTOR__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(InputPort newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, Architectural_metamodelPackage.INPUT_PORT__CTARGET, InputPort.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, Architectural_metamodelPackage.INPUT_PORT__CTARGET, InputPort.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.CONNECTOR__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (OutputPort)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Architectural_metamodelPackage.CONNECTOR__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(OutputPort newSource, NotificationChain msgs) {
		OutputPort oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.CONNECTOR__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(OutputPort newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, Architectural_metamodelPackage.OUTPUT_PORT__CSOURCE, OutputPort.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, Architectural_metamodelPackage.OUTPUT_PORT__CSOURCE, OutputPort.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.CONNECTOR__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteDependency getDependency() {
		if (eContainerFeatureID() != Architectural_metamodelPackage.CONNECTOR__DEPENDENCY) return null;
		return (ConcreteDependency)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependency(ConcreteDependency newDependency, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDependency, Architectural_metamodelPackage.CONNECTOR__DEPENDENCY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependency(ConcreteDependency newDependency) {
		if (newDependency != eInternalContainer() || (eContainerFeatureID() != Architectural_metamodelPackage.CONNECTOR__DEPENDENCY && newDependency != null)) {
			if (EcoreUtil.isAncestor(this, newDependency))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDependency != null)
				msgs = ((InternalEObject)newDependency).eInverseAdd(this, Architectural_metamodelPackage.CONCRETE_DEPENDENCY__CONNECTOR, ConcreteDependency.class, msgs);
			msgs = basicSetDependency(newDependency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.CONNECTOR__DEPENDENCY, newDependency, newDependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Architectural_metamodelPackage.CONNECTOR__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, Architectural_metamodelPackage.INPUT_PORT__CTARGET, InputPort.class, msgs);
				return basicSetTarget((InputPort)otherEnd, msgs);
			case Architectural_metamodelPackage.CONNECTOR__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, Architectural_metamodelPackage.OUTPUT_PORT__CSOURCE, OutputPort.class, msgs);
				return basicSetSource((OutputPort)otherEnd, msgs);
			case Architectural_metamodelPackage.CONNECTOR__DEPENDENCY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDependency((ConcreteDependency)otherEnd, msgs);
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
			case Architectural_metamodelPackage.CONNECTOR__TARGET:
				return basicSetTarget(null, msgs);
			case Architectural_metamodelPackage.CONNECTOR__SOURCE:
				return basicSetSource(null, msgs);
			case Architectural_metamodelPackage.CONNECTOR__DEPENDENCY:
				return basicSetDependency(null, msgs);
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
			case Architectural_metamodelPackage.CONNECTOR__DEPENDENCY:
				return eInternalContainer().eInverseRemove(this, Architectural_metamodelPackage.CONCRETE_DEPENDENCY__CONNECTOR, ConcreteDependency.class, msgs);
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
			case Architectural_metamodelPackage.CONNECTOR__CONNECTOR_ID:
				return getConnectorID();
			case Architectural_metamodelPackage.CONNECTOR__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case Architectural_metamodelPackage.CONNECTOR__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Architectural_metamodelPackage.CONNECTOR__DEPENDENCY:
				return getDependency();
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
			case Architectural_metamodelPackage.CONNECTOR__CONNECTOR_ID:
				setConnectorID((String)newValue);
				return;
			case Architectural_metamodelPackage.CONNECTOR__TARGET:
				setTarget((InputPort)newValue);
				return;
			case Architectural_metamodelPackage.CONNECTOR__SOURCE:
				setSource((OutputPort)newValue);
				return;
			case Architectural_metamodelPackage.CONNECTOR__DEPENDENCY:
				setDependency((ConcreteDependency)newValue);
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
			case Architectural_metamodelPackage.CONNECTOR__CONNECTOR_ID:
				setConnectorID(CONNECTOR_ID_EDEFAULT);
				return;
			case Architectural_metamodelPackage.CONNECTOR__TARGET:
				setTarget((InputPort)null);
				return;
			case Architectural_metamodelPackage.CONNECTOR__SOURCE:
				setSource((OutputPort)null);
				return;
			case Architectural_metamodelPackage.CONNECTOR__DEPENDENCY:
				setDependency((ConcreteDependency)null);
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
			case Architectural_metamodelPackage.CONNECTOR__CONNECTOR_ID:
				return CONNECTOR_ID_EDEFAULT == null ? connectorID != null : !CONNECTOR_ID_EDEFAULT.equals(connectorID);
			case Architectural_metamodelPackage.CONNECTOR__TARGET:
				return target != null;
			case Architectural_metamodelPackage.CONNECTOR__SOURCE:
				return source != null;
			case Architectural_metamodelPackage.CONNECTOR__DEPENDENCY:
				return getDependency() != null;
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
		result.append(" (connectorID: ");
		result.append(connectorID);
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
