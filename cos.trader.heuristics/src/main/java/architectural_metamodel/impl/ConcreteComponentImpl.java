/**
 */
package architectural_metamodel.impl;

import architectural_metamodel.Architectural_metamodelPackage;
import architectural_metamodel.ConcreteArchitecturalModel;
import architectural_metamodel.ConcreteComponent;
import architectural_metamodel.Port;
import architectural_metamodel.RuntimeProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link architectural_metamodel.impl.ConcreteComponentImpl#getCam <em>Cam</em>}</li>
 *   <li>{@link architectural_metamodel.impl.ConcreteComponentImpl#getRuntimeProperty <em>Runtime Property</em>}</li>
 *   <li>{@link architectural_metamodel.impl.ConcreteComponentImpl#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcreteComponentImpl extends AbstractComponentImpl implements ConcreteComponent {
	/**
	 * The cached value of the '{@link #getRuntimeProperty() <em>Runtime Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeProperty> runtimeProperty;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Architectural_metamodelPackage.Literals.CONCRETE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteArchitecturalModel getCam() {
		if (eContainerFeatureID() != Architectural_metamodelPackage.CONCRETE_COMPONENT__CAM) return null;
		return (ConcreteArchitecturalModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCam(ConcreteArchitecturalModel newCam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCam, Architectural_metamodelPackage.CONCRETE_COMPONENT__CAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCam(ConcreteArchitecturalModel newCam) {
		if (newCam != eInternalContainer() || (eContainerFeatureID() != Architectural_metamodelPackage.CONCRETE_COMPONENT__CAM && newCam != null)) {
			if (EcoreUtil.isAncestor(this, newCam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCam != null)
				msgs = ((InternalEObject)newCam).eInverseAdd(this, Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__CONCRETE_COMPONENT, ConcreteArchitecturalModel.class, msgs);
			msgs = basicSetCam(newCam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.CONCRETE_COMPONENT__CAM, newCam, newCam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeProperty> getRuntimeProperty() {
		if (runtimeProperty == null) {
			runtimeProperty = new EObjectWithInverseResolvingEList<RuntimeProperty>(RuntimeProperty.class, this, Architectural_metamodelPackage.CONCRETE_COMPONENT__RUNTIME_PROPERTY, Architectural_metamodelPackage.RUNTIME_PROPERTY__CC);
		}
		return runtimeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectContainmentWithInverseEList<Port>(Port.class, this, Architectural_metamodelPackage.CONCRETE_COMPONENT__PORT, Architectural_metamodelPackage.PORT__CC);
		}
		return port;
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
			case Architectural_metamodelPackage.CONCRETE_COMPONENT__CAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCam((ConcreteArchitecturalModel)otherEnd, msgs);
			case Architectural_metamodelPackage.CONCRETE_COMPONENT__RUNTIME_PROPERTY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRuntimeProperty()).basicAdd(otherEnd, msgs);
			case Architectural_metamodelPackage.CONCRETE_COMPONENT__PORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPort()).basicAdd(otherEnd, msgs);
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
			case Architectural_metamodelPackage.CONCRETE_COMPONENT__CAM:
				return basicSetCam(null, msgs);
			case Architectural_metamodelPackage.CONCRETE_COMPONENT__RUNTIME_PROPERTY:
				return ((InternalEList<?>)getRuntimeProperty()).basicRemove(otherEnd, msgs);
			case Architectural_metamodelPackage.CONCRETE_COMPONENT__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
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
			case Architectural_metamodelPackage.CONCRETE_COMPONENT__CAM:
				return eInternalContainer().eInverseRemove(this, Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL__CONCRETE_COMPONENT, ConcreteArchitecturalModel.class, msgs);
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
			case Architectural_metamodelPackage.CONCRETE_COMPONENT__CAM:
				return getCam();
			case Architectural_metamodelPackage.CONCRETE_COMPONENT__RUNTIME_PROPERTY:
				return getRuntimeProperty();
			case Architectural_metamodelPackage.CONCRETE_COMPONENT__PORT:
				return getPort();
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
			case Architectural_metamodelPackage.CONCRETE_COMPONENT__CAM:
				setCam((ConcreteArchitecturalModel)newValue);
				return;
			case Architectural_metamodelPackage.CONCRETE_COMPONENT__RUNTIME_PROPERTY:
				getRuntimeProperty().clear();
				getRuntimeProperty().addAll((Collection<? extends RuntimeProperty>)newValue);
				return;
			case Architectural_metamodelPackage.CONCRETE_COMPONENT__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends Port>)newValue);
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
			case Architectural_metamodelPackage.CONCRETE_COMPONENT__CAM:
				setCam((ConcreteArchitecturalModel)null);
				return;
			case Architectural_metamodelPackage.CONCRETE_COMPONENT__RUNTIME_PROPERTY:
				getRuntimeProperty().clear();
				return;
			case Architectural_metamodelPackage.CONCRETE_COMPONENT__PORT:
				getPort().clear();
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
			case Architectural_metamodelPackage.CONCRETE_COMPONENT__CAM:
				return getCam() != null;
			case Architectural_metamodelPackage.CONCRETE_COMPONENT__RUNTIME_PROPERTY:
				return runtimeProperty != null && !runtimeProperty.isEmpty();
			case Architectural_metamodelPackage.CONCRETE_COMPONENT__PORT:
				return port != null && !port.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConcreteComponentImpl
