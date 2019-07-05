/**
 */
package ccmm.impl;

import ccmm.CcmmPackage;
import ccmm.ConcreteComponentSpecification;
import ccmm.ExtraFunctional;
import ccmm.Functional;
import ccmm.Marketing;
import ccmm.Packaging;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Component Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ccmm.impl.ConcreteComponentSpecificationImpl#getComponentID <em>Component ID</em>}</li>
 *   <li>{@link ccmm.impl.ConcreteComponentSpecificationImpl#getAbstractComponentID <em>Abstract Component ID</em>}</li>
 *   <li>{@link ccmm.impl.ConcreteComponentSpecificationImpl#getComponentDescription <em>Component Description</em>}</li>
 *   <li>{@link ccmm.impl.ConcreteComponentSpecificationImpl#getFunctional <em>Functional</em>}</li>
 *   <li>{@link ccmm.impl.ConcreteComponentSpecificationImpl#getExtraFunctional <em>Extra Functional</em>}</li>
 *   <li>{@link ccmm.impl.ConcreteComponentSpecificationImpl#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link ccmm.impl.ConcreteComponentSpecificationImpl#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link ccmm.impl.ConcreteComponentSpecificationImpl#getMarketing <em>Marketing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcreteComponentSpecificationImpl extends MinimalEObjectImpl.Container implements ConcreteComponentSpecification {
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
	 * The default value of the '{@link #getAbstractComponentID() <em>Abstract Component ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractComponentID()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_COMPONENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstractComponentID() <em>Abstract Component ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractComponentID()
	 * @generated
	 * @ordered
	 */
	protected String abstractComponentID = ABSTRACT_COMPONENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponentDescription() <em>Component Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentDescription() <em>Component Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentDescription()
	 * @generated
	 * @ordered
	 */
	protected String componentDescription = COMPONENT_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFunctional() <em>Functional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctional()
	 * @generated
	 * @ordered
	 */
	protected Functional functional;

	/**
	 * The cached value of the '{@link #getExtraFunctional() <em>Extra Functional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraFunctional()
	 * @generated
	 * @ordered
	 */
	protected ExtraFunctional extraFunctional;

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
	 * The cached value of the '{@link #getPackaging() <em>Packaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackaging()
	 * @generated
	 * @ordered
	 */
	protected Packaging packaging;

	/**
	 * The cached value of the '{@link #getMarketing() <em>Marketing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketing()
	 * @generated
	 * @ordered
	 */
	protected Marketing marketing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteComponentSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CcmmPackage.Literals.CONCRETE_COMPONENT_SPECIFICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_ID, oldComponentID, componentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbstractComponentID() {
		return abstractComponentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractComponentID(String newAbstractComponentID) {
		String oldAbstractComponentID = abstractComponentID;
		abstractComponentID = newAbstractComponentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__ABSTRACT_COMPONENT_ID, oldAbstractComponentID, abstractComponentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentDescription() {
		return componentDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentDescription(String newComponentDescription) {
		String oldComponentDescription = componentDescription;
		componentDescription = newComponentDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_DESCRIPTION, oldComponentDescription, componentDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functional getFunctional() {
		return functional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctional(Functional newFunctional, NotificationChain msgs) {
		Functional oldFunctional = functional;
		functional = newFunctional;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__FUNCTIONAL, oldFunctional, newFunctional);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctional(Functional newFunctional) {
		if (newFunctional != functional) {
			NotificationChain msgs = null;
			if (functional != null)
				msgs = ((InternalEObject)functional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__FUNCTIONAL, null, msgs);
			if (newFunctional != null)
				msgs = ((InternalEObject)newFunctional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__FUNCTIONAL, null, msgs);
			msgs = basicSetFunctional(newFunctional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__FUNCTIONAL, newFunctional, newFunctional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtraFunctional getExtraFunctional() {
		return extraFunctional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtraFunctional(ExtraFunctional newExtraFunctional, NotificationChain msgs) {
		ExtraFunctional oldExtraFunctional = extraFunctional;
		extraFunctional = newExtraFunctional;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__EXTRA_FUNCTIONAL, oldExtraFunctional, newExtraFunctional);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraFunctional(ExtraFunctional newExtraFunctional) {
		if (newExtraFunctional != extraFunctional) {
			NotificationChain msgs = null;
			if (extraFunctional != null)
				msgs = ((InternalEObject)extraFunctional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__EXTRA_FUNCTIONAL, null, msgs);
			if (newExtraFunctional != null)
				msgs = ((InternalEObject)newExtraFunctional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__EXTRA_FUNCTIONAL, null, msgs);
			msgs = basicSetExtraFunctional(newExtraFunctional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__EXTRA_FUNCTIONAL, newExtraFunctional, newExtraFunctional));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_NAME, oldComponentName, componentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Packaging getPackaging() {
		return packaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackaging(Packaging newPackaging, NotificationChain msgs) {
		Packaging oldPackaging = packaging;
		packaging = newPackaging;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__PACKAGING, oldPackaging, newPackaging);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackaging(Packaging newPackaging) {
		if (newPackaging != packaging) {
			NotificationChain msgs = null;
			if (packaging != null)
				msgs = ((InternalEObject)packaging).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__PACKAGING, null, msgs);
			if (newPackaging != null)
				msgs = ((InternalEObject)newPackaging).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__PACKAGING, null, msgs);
			msgs = basicSetPackaging(newPackaging, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__PACKAGING, newPackaging, newPackaging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marketing getMarketing() {
		return marketing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarketing(Marketing newMarketing, NotificationChain msgs) {
		Marketing oldMarketing = marketing;
		marketing = newMarketing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__MARKETING, oldMarketing, newMarketing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarketing(Marketing newMarketing) {
		if (newMarketing != marketing) {
			NotificationChain msgs = null;
			if (marketing != null)
				msgs = ((InternalEObject)marketing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__MARKETING, null, msgs);
			if (newMarketing != null)
				msgs = ((InternalEObject)newMarketing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__MARKETING, null, msgs);
			msgs = basicSetMarketing(newMarketing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__MARKETING, newMarketing, newMarketing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__FUNCTIONAL:
				return basicSetFunctional(null, msgs);
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__EXTRA_FUNCTIONAL:
				return basicSetExtraFunctional(null, msgs);
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__PACKAGING:
				return basicSetPackaging(null, msgs);
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__MARKETING:
				return basicSetMarketing(null, msgs);
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
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_ID:
				return getComponentID();
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__ABSTRACT_COMPONENT_ID:
				return getAbstractComponentID();
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_DESCRIPTION:
				return getComponentDescription();
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__FUNCTIONAL:
				return getFunctional();
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__EXTRA_FUNCTIONAL:
				return getExtraFunctional();
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_NAME:
				return getComponentName();
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__PACKAGING:
				return getPackaging();
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__MARKETING:
				return getMarketing();
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
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_ID:
				setComponentID((String)newValue);
				return;
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__ABSTRACT_COMPONENT_ID:
				setAbstractComponentID((String)newValue);
				return;
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_DESCRIPTION:
				setComponentDescription((String)newValue);
				return;
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__FUNCTIONAL:
				setFunctional((Functional)newValue);
				return;
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__EXTRA_FUNCTIONAL:
				setExtraFunctional((ExtraFunctional)newValue);
				return;
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_NAME:
				setComponentName((String)newValue);
				return;
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__PACKAGING:
				setPackaging((Packaging)newValue);
				return;
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__MARKETING:
				setMarketing((Marketing)newValue);
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
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_ID:
				setComponentID(COMPONENT_ID_EDEFAULT);
				return;
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__ABSTRACT_COMPONENT_ID:
				setAbstractComponentID(ABSTRACT_COMPONENT_ID_EDEFAULT);
				return;
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_DESCRIPTION:
				setComponentDescription(COMPONENT_DESCRIPTION_EDEFAULT);
				return;
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__FUNCTIONAL:
				setFunctional((Functional)null);
				return;
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__EXTRA_FUNCTIONAL:
				setExtraFunctional((ExtraFunctional)null);
				return;
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_NAME:
				setComponentName(COMPONENT_NAME_EDEFAULT);
				return;
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__PACKAGING:
				setPackaging((Packaging)null);
				return;
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__MARKETING:
				setMarketing((Marketing)null);
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
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_ID:
				return COMPONENT_ID_EDEFAULT == null ? componentID != null : !COMPONENT_ID_EDEFAULT.equals(componentID);
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__ABSTRACT_COMPONENT_ID:
				return ABSTRACT_COMPONENT_ID_EDEFAULT == null ? abstractComponentID != null : !ABSTRACT_COMPONENT_ID_EDEFAULT.equals(abstractComponentID);
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_DESCRIPTION:
				return COMPONENT_DESCRIPTION_EDEFAULT == null ? componentDescription != null : !COMPONENT_DESCRIPTION_EDEFAULT.equals(componentDescription);
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__FUNCTIONAL:
				return functional != null;
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__EXTRA_FUNCTIONAL:
				return extraFunctional != null;
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_NAME:
				return COMPONENT_NAME_EDEFAULT == null ? componentName != null : !COMPONENT_NAME_EDEFAULT.equals(componentName);
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__PACKAGING:
				return packaging != null;
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION__MARKETING:
				return marketing != null;
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
		result.append(", abstractComponentID: ");
		result.append(abstractComponentID);
		result.append(", componentDescription: ");
		result.append(componentDescription);
		result.append(", componentName: ");
		result.append(componentName);
		result.append(')');
		return result.toString();
	}

} //ConcreteComponentSpecificationImpl
