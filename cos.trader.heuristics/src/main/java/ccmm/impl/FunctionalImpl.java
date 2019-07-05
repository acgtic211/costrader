/**
 */
package ccmm.impl;

import ccmm.CcmmPackage;
import ccmm.ControllerInterface;
import ccmm.CoreContent;
import ccmm.Functional;
import ccmm.InteractionContent;
import ccmm.InteractionInterface;

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
 *   <li>{@link ccmm.impl.FunctionalImpl#getInteractionContent <em>Interaction Content</em>}</li>
 *   <li>{@link ccmm.impl.FunctionalImpl#getCoreContent <em>Core Content</em>}</li>
 *   <li>{@link ccmm.impl.FunctionalImpl#getControllerInterface <em>Controller Interface</em>}</li>
 *   <li>{@link ccmm.impl.FunctionalImpl#getInteractionInterface <em>Interaction Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionalImpl extends MinimalEObjectImpl.Container implements Functional {
	/**
	 * The cached value of the '{@link #getInteractionContent() <em>Interaction Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionContent()
	 * @generated
	 * @ordered
	 */
	protected InteractionContent interactionContent;

	/**
	 * The cached value of the '{@link #getCoreContent() <em>Core Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreContent()
	 * @generated
	 * @ordered
	 */
	protected CoreContent coreContent;

	/**
	 * The cached value of the '{@link #getControllerInterface() <em>Controller Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerInterface()
	 * @generated
	 * @ordered
	 */
	protected ControllerInterface controllerInterface;

	/**
	 * The cached value of the '{@link #getInteractionInterface() <em>Interaction Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionInterface()
	 * @generated
	 * @ordered
	 */
	protected InteractionInterface interactionInterface;

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
		return CcmmPackage.Literals.FUNCTIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionContent getInteractionContent() {
		return interactionContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteractionContent(InteractionContent newInteractionContent, NotificationChain msgs) {
		InteractionContent oldInteractionContent = interactionContent;
		interactionContent = newInteractionContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CcmmPackage.FUNCTIONAL__INTERACTION_CONTENT, oldInteractionContent, newInteractionContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionContent(InteractionContent newInteractionContent) {
		if (newInteractionContent != interactionContent) {
			NotificationChain msgs = null;
			if (interactionContent != null)
				msgs = ((InternalEObject)interactionContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CcmmPackage.FUNCTIONAL__INTERACTION_CONTENT, null, msgs);
			if (newInteractionContent != null)
				msgs = ((InternalEObject)newInteractionContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CcmmPackage.FUNCTIONAL__INTERACTION_CONTENT, null, msgs);
			msgs = basicSetInteractionContent(newInteractionContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.FUNCTIONAL__INTERACTION_CONTENT, newInteractionContent, newInteractionContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreContent getCoreContent() {
		return coreContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoreContent(CoreContent newCoreContent, NotificationChain msgs) {
		CoreContent oldCoreContent = coreContent;
		coreContent = newCoreContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CcmmPackage.FUNCTIONAL__CORE_CONTENT, oldCoreContent, newCoreContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreContent(CoreContent newCoreContent) {
		if (newCoreContent != coreContent) {
			NotificationChain msgs = null;
			if (coreContent != null)
				msgs = ((InternalEObject)coreContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CcmmPackage.FUNCTIONAL__CORE_CONTENT, null, msgs);
			if (newCoreContent != null)
				msgs = ((InternalEObject)newCoreContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CcmmPackage.FUNCTIONAL__CORE_CONTENT, null, msgs);
			msgs = basicSetCoreContent(newCoreContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.FUNCTIONAL__CORE_CONTENT, newCoreContent, newCoreContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerInterface getControllerInterface() {
		return controllerInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControllerInterface(ControllerInterface newControllerInterface, NotificationChain msgs) {
		ControllerInterface oldControllerInterface = controllerInterface;
		controllerInterface = newControllerInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CcmmPackage.FUNCTIONAL__CONTROLLER_INTERFACE, oldControllerInterface, newControllerInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControllerInterface(ControllerInterface newControllerInterface) {
		if (newControllerInterface != controllerInterface) {
			NotificationChain msgs = null;
			if (controllerInterface != null)
				msgs = ((InternalEObject)controllerInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CcmmPackage.FUNCTIONAL__CONTROLLER_INTERFACE, null, msgs);
			if (newControllerInterface != null)
				msgs = ((InternalEObject)newControllerInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CcmmPackage.FUNCTIONAL__CONTROLLER_INTERFACE, null, msgs);
			msgs = basicSetControllerInterface(newControllerInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.FUNCTIONAL__CONTROLLER_INTERFACE, newControllerInterface, newControllerInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionInterface getInteractionInterface() {
		return interactionInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteractionInterface(InteractionInterface newInteractionInterface, NotificationChain msgs) {
		InteractionInterface oldInteractionInterface = interactionInterface;
		interactionInterface = newInteractionInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CcmmPackage.FUNCTIONAL__INTERACTION_INTERFACE, oldInteractionInterface, newInteractionInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionInterface(InteractionInterface newInteractionInterface) {
		if (newInteractionInterface != interactionInterface) {
			NotificationChain msgs = null;
			if (interactionInterface != null)
				msgs = ((InternalEObject)interactionInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CcmmPackage.FUNCTIONAL__INTERACTION_INTERFACE, null, msgs);
			if (newInteractionInterface != null)
				msgs = ((InternalEObject)newInteractionInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CcmmPackage.FUNCTIONAL__INTERACTION_INTERFACE, null, msgs);
			msgs = basicSetInteractionInterface(newInteractionInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.FUNCTIONAL__INTERACTION_INTERFACE, newInteractionInterface, newInteractionInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CcmmPackage.FUNCTIONAL__INTERACTION_CONTENT:
				return basicSetInteractionContent(null, msgs);
			case CcmmPackage.FUNCTIONAL__CORE_CONTENT:
				return basicSetCoreContent(null, msgs);
			case CcmmPackage.FUNCTIONAL__CONTROLLER_INTERFACE:
				return basicSetControllerInterface(null, msgs);
			case CcmmPackage.FUNCTIONAL__INTERACTION_INTERFACE:
				return basicSetInteractionInterface(null, msgs);
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
			case CcmmPackage.FUNCTIONAL__INTERACTION_CONTENT:
				return getInteractionContent();
			case CcmmPackage.FUNCTIONAL__CORE_CONTENT:
				return getCoreContent();
			case CcmmPackage.FUNCTIONAL__CONTROLLER_INTERFACE:
				return getControllerInterface();
			case CcmmPackage.FUNCTIONAL__INTERACTION_INTERFACE:
				return getInteractionInterface();
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
			case CcmmPackage.FUNCTIONAL__INTERACTION_CONTENT:
				setInteractionContent((InteractionContent)newValue);
				return;
			case CcmmPackage.FUNCTIONAL__CORE_CONTENT:
				setCoreContent((CoreContent)newValue);
				return;
			case CcmmPackage.FUNCTIONAL__CONTROLLER_INTERFACE:
				setControllerInterface((ControllerInterface)newValue);
				return;
			case CcmmPackage.FUNCTIONAL__INTERACTION_INTERFACE:
				setInteractionInterface((InteractionInterface)newValue);
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
			case CcmmPackage.FUNCTIONAL__INTERACTION_CONTENT:
				setInteractionContent((InteractionContent)null);
				return;
			case CcmmPackage.FUNCTIONAL__CORE_CONTENT:
				setCoreContent((CoreContent)null);
				return;
			case CcmmPackage.FUNCTIONAL__CONTROLLER_INTERFACE:
				setControllerInterface((ControllerInterface)null);
				return;
			case CcmmPackage.FUNCTIONAL__INTERACTION_INTERFACE:
				setInteractionInterface((InteractionInterface)null);
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
			case CcmmPackage.FUNCTIONAL__INTERACTION_CONTENT:
				return interactionContent != null;
			case CcmmPackage.FUNCTIONAL__CORE_CONTENT:
				return coreContent != null;
			case CcmmPackage.FUNCTIONAL__CONTROLLER_INTERFACE:
				return controllerInterface != null;
			case CcmmPackage.FUNCTIONAL__INTERACTION_INTERFACE:
				return interactionInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionalImpl
