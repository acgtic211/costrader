/**
 */
package architectural_metamodel.impl;

import architectural_metamodel.AbstractArchitecturalModel;
import architectural_metamodel.AbstractComponent;
import architectural_metamodel.Architectural_metamodelPackage;
import architectural_metamodel.Binary;
import architectural_metamodel.ComponentType;
import architectural_metamodel.Interface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link architectural_metamodel.impl.AbstractComponentImpl#getComponentID <em>Component ID</em>}</li>
 *   <li>{@link architectural_metamodel.impl.AbstractComponentImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link architectural_metamodel.impl.AbstractComponentImpl#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link architectural_metamodel.impl.AbstractComponentImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link architectural_metamodel.impl.AbstractComponentImpl#getAam <em>Aam</em>}</li>
 *   <li>{@link architectural_metamodel.impl.AbstractComponentImpl#getBSource <em>BSource</em>}</li>
 *   <li>{@link architectural_metamodel.impl.AbstractComponentImpl#getBTarget <em>BTarget</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractComponentImpl extends MinimalEObjectImpl.Container implements AbstractComponent {
	/**
	 * The default value of the '{@link #getComponentID() <em>Component ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentID()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentID() <em>Component ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentID()
	 * @generated
	 * @ordered
	 */
	protected String componentID = COMPONENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interface_;

	/**
	 * The default value of the '{@link #getComponentName() <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentName() <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentName()
	 * @generated
	 * @ordered
	 */
	protected String componentName = COMPONENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentType COMPONENT_TYPE_EDEFAULT = ComponentType.NORMAL;

	/**
	 * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected ComponentType componentType = COMPONENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBSource() <em>BSource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Binary> bSource;

	/**
	 * The cached value of the '{@link #getBTarget() <em>BTarget</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Binary> bTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Architectural_metamodelPackage.Literals.ABSTRACT_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentID() {
		return componentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentID(String newComponentID) {
		String oldComponentID = componentID;
		componentID = newComponentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.ABSTRACT_COMPONENT__COMPONENT_ID, oldComponentID, componentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectContainmentWithInverseEList<Interface>(Interface.class, this, Architectural_metamodelPackage.ABSTRACT_COMPONENT__INTERFACE, Architectural_metamodelPackage.INTERFACE__COMPONENT);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentName() {
		return componentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentName(String newComponentName) {
		String oldComponentName = componentName;
		componentName = newComponentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.ABSTRACT_COMPONENT__COMPONENT_NAME, oldComponentName, componentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getComponentType() {
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentType(ComponentType newComponentType) {
		ComponentType oldComponentType = componentType;
		componentType = newComponentType == null ? COMPONENT_TYPE_EDEFAULT : newComponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.ABSTRACT_COMPONENT__COMPONENT_TYPE, oldComponentType, componentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractArchitecturalModel getAam() {
		if (eContainerFeatureID() != Architectural_metamodelPackage.ABSTRACT_COMPONENT__AAM) return null;
		return (AbstractArchitecturalModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAam(AbstractArchitecturalModel newAam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAam, Architectural_metamodelPackage.ABSTRACT_COMPONENT__AAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAam(AbstractArchitecturalModel newAam) {
		if (newAam != eInternalContainer() || (eContainerFeatureID() != Architectural_metamodelPackage.ABSTRACT_COMPONENT__AAM && newAam != null)) {
			if (EcoreUtil.isAncestor(this, newAam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAam != null)
				msgs = ((InternalEObject)newAam).eInverseAdd(this, Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__ABSTRACT_COMPONENT, AbstractArchitecturalModel.class, msgs);
			msgs = basicSetAam(newAam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architectural_metamodelPackage.ABSTRACT_COMPONENT__AAM, newAam, newAam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binary> getBSource() {
		if (bSource == null) {
			bSource = new EObjectWithInverseResolvingEList<Binary>(Binary.class, this, Architectural_metamodelPackage.ABSTRACT_COMPONENT__BSOURCE, Architectural_metamodelPackage.BINARY__SOURCE);
		}
		return bSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binary> getBTarget() {
		if (bTarget == null) {
			bTarget = new EObjectWithInverseResolvingEList<Binary>(Binary.class, this, Architectural_metamodelPackage.ABSTRACT_COMPONENT__BTARGET, Architectural_metamodelPackage.BINARY__TARGET);
		}
		return bTarget;
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
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__INTERFACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterface()).basicAdd(otherEnd, msgs);
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__AAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAam((AbstractArchitecturalModel)otherEnd, msgs);
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__BSOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBSource()).basicAdd(otherEnd, msgs);
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__BTARGET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBTarget()).basicAdd(otherEnd, msgs);
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
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__INTERFACE:
				return ((InternalEList<?>)getInterface()).basicRemove(otherEnd, msgs);
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__AAM:
				return basicSetAam(null, msgs);
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__BSOURCE:
				return ((InternalEList<?>)getBSource()).basicRemove(otherEnd, msgs);
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__BTARGET:
				return ((InternalEList<?>)getBTarget()).basicRemove(otherEnd, msgs);
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
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__AAM:
				return eInternalContainer().eInverseRemove(this, Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL__ABSTRACT_COMPONENT, AbstractArchitecturalModel.class, msgs);
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
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__COMPONENT_ID:
				return getComponentID();
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__INTERFACE:
				return getInterface();
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__COMPONENT_NAME:
				return getComponentName();
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__COMPONENT_TYPE:
				return getComponentType();
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__AAM:
				return getAam();
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__BSOURCE:
				return getBSource();
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__BTARGET:
				return getBTarget();
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
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__COMPONENT_ID:
				setComponentID((String)newValue);
				return;
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends Interface>)newValue);
				return;
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__COMPONENT_NAME:
				setComponentName((String)newValue);
				return;
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__COMPONENT_TYPE:
				setComponentType((ComponentType)newValue);
				return;
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__AAM:
				setAam((AbstractArchitecturalModel)newValue);
				return;
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__BSOURCE:
				getBSource().clear();
				getBSource().addAll((Collection<? extends Binary>)newValue);
				return;
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__BTARGET:
				getBTarget().clear();
				getBTarget().addAll((Collection<? extends Binary>)newValue);
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
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__COMPONENT_ID:
				setComponentID(COMPONENT_ID_EDEFAULT);
				return;
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__INTERFACE:
				getInterface().clear();
				return;
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__COMPONENT_NAME:
				setComponentName(COMPONENT_NAME_EDEFAULT);
				return;
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__COMPONENT_TYPE:
				setComponentType(COMPONENT_TYPE_EDEFAULT);
				return;
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__AAM:
				setAam((AbstractArchitecturalModel)null);
				return;
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__BSOURCE:
				getBSource().clear();
				return;
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__BTARGET:
				getBTarget().clear();
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
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__COMPONENT_ID:
				return COMPONENT_ID_EDEFAULT == null ? componentID != null : !COMPONENT_ID_EDEFAULT.equals(componentID);
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__COMPONENT_NAME:
				return COMPONENT_NAME_EDEFAULT == null ? componentName != null : !COMPONENT_NAME_EDEFAULT.equals(componentName);
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__COMPONENT_TYPE:
				return componentType != COMPONENT_TYPE_EDEFAULT;
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__AAM:
				return getAam() != null;
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__BSOURCE:
				return bSource != null && !bSource.isEmpty();
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT__BTARGET:
				return bTarget != null && !bTarget.isEmpty();
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
		result.append(" (componentID: ");
		result.append(componentID);
		result.append(", componentName: ");
		result.append(componentName);
		result.append(", componentType: ");
		result.append(componentType);
		result.append(')');
		return result.toString();
	}

} //AbstractComponentImpl
