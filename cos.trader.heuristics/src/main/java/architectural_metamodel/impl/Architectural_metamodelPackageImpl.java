/**
 */
package architectural_metamodel.impl;

import architectural_metamodel.AbstractArchitecturalModel;
import architectural_metamodel.AbstractComponent;
import architectural_metamodel.AbstractDependency;
import architectural_metamodel.Architectural_metamodelFactory;
import architectural_metamodel.Architectural_metamodelPackage;
import architectural_metamodel.Binary;
import architectural_metamodel.BinaryType;
import architectural_metamodel.ComponentType;
import architectural_metamodel.ConcreteArchitecturalModel;
import architectural_metamodel.ConcreteComponent;
import architectural_metamodel.ConcreteDependency;
import architectural_metamodel.Connector;
import architectural_metamodel.InputPort;
import architectural_metamodel.Interface;
import architectural_metamodel.Nary;
import architectural_metamodel.NaryType;
import architectural_metamodel.OutputPort;
import architectural_metamodel.Port;
import architectural_metamodel.Provided;
import architectural_metamodel.Relationship;
import architectural_metamodel.Required;
import architectural_metamodel.RuntimeProperty;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Architectural_metamodelPackageImpl extends EPackageImpl implements Architectural_metamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass naryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractArchitecturalModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteArchitecturalModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum naryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see architectural_metamodel.Architectural_metamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Architectural_metamodelPackageImpl() {
		super(eNS_URI, Architectural_metamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Architectural_metamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Architectural_metamodelPackage init() {
		if (isInited) return (Architectural_metamodelPackage)EPackage.Registry.INSTANCE.getEPackage(Architectural_metamodelPackage.eNS_URI);

		// Obtain or create and register package
		Architectural_metamodelPackageImpl theArchitectural_metamodelPackage = (Architectural_metamodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Architectural_metamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Architectural_metamodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theArchitectural_metamodelPackage.createPackageContents();

		// Initialize created meta-data
		theArchitectural_metamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArchitectural_metamodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Architectural_metamodelPackage.eNS_URI, theArchitectural_metamodelPackage);
		return theArchitectural_metamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractComponent() {
		return abstractComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractComponent_ComponentID() {
		return (EAttribute)abstractComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComponent_Interface() {
		return (EReference)abstractComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractComponent_ComponentName() {
		return (EAttribute)abstractComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractComponent_ComponentType() {
		return (EAttribute)abstractComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComponent_Aam() {
		return (EReference)abstractComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComponent_BSource() {
		return (EReference)abstractComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComponent_BTarget() {
		return (EReference)abstractComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_PortID() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Cc() {
		return (EReference)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_ConnectorID() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Target() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Source() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Dependency() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_RelationshipID() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Aam() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Cam() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinary() {
		return binaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinary_Type() {
		return (EAttribute)binaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinary_IsBidirectional() {
		return (EAttribute)binaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinary_NaryRelationship() {
		return (EReference)binaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinary_Source() {
		return (EReference)binaryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinary_Target() {
		return (EReference)binaryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinary_Dependency() {
		return (EReference)binaryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNary() {
		return naryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNary_Type() {
		return (EAttribute)naryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNary_BRelationship() {
		return (EReference)naryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractArchitecturalModel() {
		return abstractArchitecturalModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractArchitecturalModel_AbstractComponent() {
		return (EReference)abstractArchitecturalModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractArchitecturalModel_Relationship() {
		return (EReference)abstractArchitecturalModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractArchitecturalModel_AamID() {
		return (EAttribute)abstractArchitecturalModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteArchitecturalModel() {
		return concreteArchitecturalModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteArchitecturalModel_ConcreteComponent() {
		return (EReference)concreteArchitecturalModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteArchitecturalModel_Aam() {
		return (EReference)concreteArchitecturalModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteArchitecturalModel_CamID() {
		return (EAttribute)concreteArchitecturalModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteArchitecturalModel_AamID() {
		return (EAttribute)concreteArchitecturalModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteArchitecturalModel_Relationship() {
		return (EReference)concreteArchitecturalModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteComponent() {
		return concreteComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteComponent_Cam() {
		return (EReference)concreteComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteComponent_RuntimeProperty() {
		return (EReference)concreteComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteComponent_Port() {
		return (EReference)concreteComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPort() {
		return inputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_CTarget() {
		return (EReference)inputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPort() {
		return outputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPort_CSource() {
		return (EReference)outputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeProperty() {
		return runtimePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeProperty_Cc() {
		return (EReference)runtimePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeProperty_PropertyID() {
		return (EAttribute)runtimePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeProperty_PropertyValue() {
		return (EAttribute)runtimePropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Component() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_InterfaceID() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvided() {
		return providedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvided_DTarget() {
		return (EReference)providedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequired() {
		return requiredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequired_DSource() {
		return (EReference)requiredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractDependency() {
		return abstractDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractDependency_Source() {
		return (EReference)abstractDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractDependency_BRelationship() {
		return (EReference)abstractDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractDependency_Target() {
		return (EReference)abstractDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractDependency_DependencyID() {
		return (EAttribute)abstractDependencyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteDependency() {
		return concreteDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteDependency_Connector() {
		return (EReference)concreteDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryType() {
		return binaryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNaryType() {
		return naryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComponentType() {
		return componentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architectural_metamodelFactory getArchitectural_metamodelFactory() {
		return (Architectural_metamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractComponentEClass = createEClass(ABSTRACT_COMPONENT);
		createEAttribute(abstractComponentEClass, ABSTRACT_COMPONENT__COMPONENT_ID);
		createEReference(abstractComponentEClass, ABSTRACT_COMPONENT__INTERFACE);
		createEAttribute(abstractComponentEClass, ABSTRACT_COMPONENT__COMPONENT_NAME);
		createEAttribute(abstractComponentEClass, ABSTRACT_COMPONENT__COMPONENT_TYPE);
		createEReference(abstractComponentEClass, ABSTRACT_COMPONENT__AAM);
		createEReference(abstractComponentEClass, ABSTRACT_COMPONENT__BSOURCE);
		createEReference(abstractComponentEClass, ABSTRACT_COMPONENT__BTARGET);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__PORT_ID);
		createEReference(portEClass, PORT__CC);

		connectorEClass = createEClass(CONNECTOR);
		createEAttribute(connectorEClass, CONNECTOR__CONNECTOR_ID);
		createEReference(connectorEClass, CONNECTOR__TARGET);
		createEReference(connectorEClass, CONNECTOR__SOURCE);
		createEReference(connectorEClass, CONNECTOR__DEPENDENCY);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEAttribute(relationshipEClass, RELATIONSHIP__RELATIONSHIP_ID);
		createEReference(relationshipEClass, RELATIONSHIP__AAM);
		createEReference(relationshipEClass, RELATIONSHIP__CAM);

		binaryEClass = createEClass(BINARY);
		createEAttribute(binaryEClass, BINARY__TYPE);
		createEAttribute(binaryEClass, BINARY__IS_BIDIRECTIONAL);
		createEReference(binaryEClass, BINARY__NARY_RELATIONSHIP);
		createEReference(binaryEClass, BINARY__SOURCE);
		createEReference(binaryEClass, BINARY__TARGET);
		createEReference(binaryEClass, BINARY__DEPENDENCY);

		naryEClass = createEClass(NARY);
		createEAttribute(naryEClass, NARY__TYPE);
		createEReference(naryEClass, NARY__BRELATIONSHIP);

		abstractArchitecturalModelEClass = createEClass(ABSTRACT_ARCHITECTURAL_MODEL);
		createEReference(abstractArchitecturalModelEClass, ABSTRACT_ARCHITECTURAL_MODEL__ABSTRACT_COMPONENT);
		createEReference(abstractArchitecturalModelEClass, ABSTRACT_ARCHITECTURAL_MODEL__RELATIONSHIP);
		createEAttribute(abstractArchitecturalModelEClass, ABSTRACT_ARCHITECTURAL_MODEL__AAM_ID);

		concreteArchitecturalModelEClass = createEClass(CONCRETE_ARCHITECTURAL_MODEL);
		createEReference(concreteArchitecturalModelEClass, CONCRETE_ARCHITECTURAL_MODEL__CONCRETE_COMPONENT);
		createEReference(concreteArchitecturalModelEClass, CONCRETE_ARCHITECTURAL_MODEL__AAM);
		createEAttribute(concreteArchitecturalModelEClass, CONCRETE_ARCHITECTURAL_MODEL__CAM_ID);
		createEAttribute(concreteArchitecturalModelEClass, CONCRETE_ARCHITECTURAL_MODEL__AAM_ID);
		createEReference(concreteArchitecturalModelEClass, CONCRETE_ARCHITECTURAL_MODEL__RELATIONSHIP);

		concreteComponentEClass = createEClass(CONCRETE_COMPONENT);
		createEReference(concreteComponentEClass, CONCRETE_COMPONENT__CAM);
		createEReference(concreteComponentEClass, CONCRETE_COMPONENT__RUNTIME_PROPERTY);
		createEReference(concreteComponentEClass, CONCRETE_COMPONENT__PORT);

		inputPortEClass = createEClass(INPUT_PORT);
		createEReference(inputPortEClass, INPUT_PORT__CTARGET);

		outputPortEClass = createEClass(OUTPUT_PORT);
		createEReference(outputPortEClass, OUTPUT_PORT__CSOURCE);

		runtimePropertyEClass = createEClass(RUNTIME_PROPERTY);
		createEReference(runtimePropertyEClass, RUNTIME_PROPERTY__CC);
		createEAttribute(runtimePropertyEClass, RUNTIME_PROPERTY__PROPERTY_ID);
		createEAttribute(runtimePropertyEClass, RUNTIME_PROPERTY__PROPERTY_VALUE);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__COMPONENT);
		createEAttribute(interfaceEClass, INTERFACE__INTERFACE_ID);

		providedEClass = createEClass(PROVIDED);
		createEReference(providedEClass, PROVIDED__DTARGET);

		requiredEClass = createEClass(REQUIRED);
		createEReference(requiredEClass, REQUIRED__DSOURCE);

		abstractDependencyEClass = createEClass(ABSTRACT_DEPENDENCY);
		createEReference(abstractDependencyEClass, ABSTRACT_DEPENDENCY__SOURCE);
		createEReference(abstractDependencyEClass, ABSTRACT_DEPENDENCY__BRELATIONSHIP);
		createEReference(abstractDependencyEClass, ABSTRACT_DEPENDENCY__TARGET);
		createEAttribute(abstractDependencyEClass, ABSTRACT_DEPENDENCY__DEPENDENCY_ID);

		concreteDependencyEClass = createEClass(CONCRETE_DEPENDENCY);
		createEReference(concreteDependencyEClass, CONCRETE_DEPENDENCY__CONNECTOR);

		// Create enums
		binaryTypeEEnum = createEEnum(BINARY_TYPE);
		naryTypeEEnum = createEEnum(NARY_TYPE);
		componentTypeEEnum = createEEnum(COMPONENT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		binaryEClass.getESuperTypes().add(this.getRelationship());
		naryEClass.getESuperTypes().add(this.getRelationship());
		concreteComponentEClass.getESuperTypes().add(this.getAbstractComponent());
		inputPortEClass.getESuperTypes().add(this.getPort());
		outputPortEClass.getESuperTypes().add(this.getPort());
		providedEClass.getESuperTypes().add(this.getInterface());
		requiredEClass.getESuperTypes().add(this.getInterface());
		concreteDependencyEClass.getESuperTypes().add(this.getAbstractDependency());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractComponentEClass, AbstractComponent.class, "AbstractComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractComponent_ComponentID(), ecorePackage.getEString(), "componentID", null, 1, 1, AbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractComponent_Interface(), this.getInterface(), this.getInterface_Component(), "interface", null, 1, -1, AbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractComponent_ComponentName(), ecorePackage.getEString(), "componentName", null, 0, 1, AbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractComponent_ComponentType(), this.getComponentType(), "componentType", null, 1, 1, AbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractComponent_Aam(), this.getAbstractArchitecturalModel(), this.getAbstractArchitecturalModel_AbstractComponent(), "aam", null, 0, 1, AbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractComponent_BSource(), this.getBinary(), this.getBinary_Source(), "bSource", null, 0, -1, AbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractComponent_BTarget(), this.getBinary(), this.getBinary_Target(), "bTarget", null, 0, -1, AbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_PortID(), ecorePackage.getEString(), "portID", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_Cc(), this.getConcreteComponent(), this.getConcreteComponent_Port(), "cc", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnector_ConnectorID(), ecorePackage.getEString(), "connectorID", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Target(), this.getInputPort(), this.getInputPort_CTarget(), "target", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Source(), this.getOutputPort(), this.getOutputPort_CSource(), "source", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Dependency(), this.getConcreteDependency(), this.getConcreteDependency_Connector(), "dependency", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationship_RelationshipID(), ecorePackage.getEString(), "relationshipID", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Aam(), this.getAbstractArchitecturalModel(), this.getAbstractArchitecturalModel_Relationship(), "aam", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Cam(), this.getConcreteArchitecturalModel(), this.getConcreteArchitecturalModel_Relationship(), "cam", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryEClass, Binary.class, "Binary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinary_Type(), this.getBinaryType(), "type", null, 1, 1, Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinary_IsBidirectional(), ecorePackage.getEBoolean(), "isBidirectional", null, 1, 1, Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinary_NaryRelationship(), this.getNary(), this.getNary_BRelationship(), "naryRelationship", null, 0, 1, Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinary_Source(), this.getAbstractComponent(), this.getAbstractComponent_BSource(), "source", null, 1, 1, Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinary_Target(), this.getAbstractComponent(), this.getAbstractComponent_BTarget(), "target", null, 1, 1, Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinary_Dependency(), this.getAbstractDependency(), this.getAbstractDependency_BRelationship(), "dependency", null, 1, -1, Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(naryEClass, Nary.class, "Nary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNary_Type(), this.getNaryType(), "type", null, 1, 1, Nary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNary_BRelationship(), this.getBinary(), this.getBinary_NaryRelationship(), "bRelationship", null, 2, -1, Nary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractArchitecturalModelEClass, AbstractArchitecturalModel.class, "AbstractArchitecturalModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractArchitecturalModel_AbstractComponent(), this.getAbstractComponent(), this.getAbstractComponent_Aam(), "abstractComponent", null, 0, -1, AbstractArchitecturalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractArchitecturalModel_Relationship(), this.getRelationship(), this.getRelationship_Aam(), "relationship", null, 0, -1, AbstractArchitecturalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractArchitecturalModel_AamID(), ecorePackage.getEString(), "aamID", null, 1, 1, AbstractArchitecturalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concreteArchitecturalModelEClass, ConcreteArchitecturalModel.class, "ConcreteArchitecturalModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcreteArchitecturalModel_ConcreteComponent(), this.getConcreteComponent(), this.getConcreteComponent_Cam(), "concreteComponent", null, 0, -1, ConcreteArchitecturalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteArchitecturalModel_Aam(), this.getAbstractArchitecturalModel(), null, "aam", null, 1, 1, ConcreteArchitecturalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteArchitecturalModel_CamID(), ecorePackage.getEString(), "camID", null, 1, 1, ConcreteArchitecturalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteArchitecturalModel_AamID(), ecorePackage.getEString(), "aamID", null, 1, 1, ConcreteArchitecturalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteArchitecturalModel_Relationship(), this.getRelationship(), this.getRelationship_Cam(), "relationship", null, 0, -1, ConcreteArchitecturalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concreteComponentEClass, ConcreteComponent.class, "ConcreteComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcreteComponent_Cam(), this.getConcreteArchitecturalModel(), this.getConcreteArchitecturalModel_ConcreteComponent(), "cam", null, 1, 1, ConcreteComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteComponent_RuntimeProperty(), this.getRuntimeProperty(), this.getRuntimeProperty_Cc(), "runtimeProperty", null, 0, -1, ConcreteComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteComponent_Port(), this.getPort(), this.getPort_Cc(), "port", null, 1, -1, ConcreteComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputPortEClass, InputPort.class, "InputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputPort_CTarget(), this.getConnector(), this.getConnector_Target(), "cTarget", null, 0, -1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputPortEClass, OutputPort.class, "OutputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputPort_CSource(), this.getConnector(), this.getConnector_Source(), "cSource", null, 0, -1, OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimePropertyEClass, RuntimeProperty.class, "RuntimeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeProperty_Cc(), this.getConcreteComponent(), this.getConcreteComponent_RuntimeProperty(), "cc", null, 1, 1, RuntimeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuntimeProperty_PropertyID(), ecorePackage.getEString(), "propertyID", null, 1, 1, RuntimeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuntimeProperty_PropertyValue(), ecorePackage.getEString(), "propertyValue", null, 1, 1, RuntimeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Component(), this.getAbstractComponent(), this.getAbstractComponent_Interface(), "component", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_InterfaceID(), ecorePackage.getEString(), "interfaceID", null, 1, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedEClass, Provided.class, "Provided", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvided_DTarget(), this.getAbstractDependency(), this.getAbstractDependency_Target(), "dTarget", null, 0, -1, Provided.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredEClass, Required.class, "Required", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequired_DSource(), this.getAbstractDependency(), this.getAbstractDependency_Source(), "dSource", null, 0, -1, Required.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractDependencyEClass, AbstractDependency.class, "AbstractDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractDependency_Source(), this.getRequired(), this.getRequired_DSource(), "source", null, 1, 1, AbstractDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractDependency_BRelationship(), this.getBinary(), this.getBinary_Dependency(), "bRelationship", null, 1, 1, AbstractDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractDependency_Target(), this.getProvided(), this.getProvided_DTarget(), "target", null, 1, 1, AbstractDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractDependency_DependencyID(), ecorePackage.getEString(), "dependencyID", null, 1, 1, AbstractDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concreteDependencyEClass, ConcreteDependency.class, "ConcreteDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcreteDependency_Connector(), this.getConnector(), this.getConnector_Dependency(), "connector", null, 1, -1, ConcreteDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(binaryTypeEEnum, BinaryType.class, "BinaryType");
		addEEnumLiteral(binaryTypeEEnum, BinaryType.ASSOCIATION);
		addEEnumLiteral(binaryTypeEEnum, BinaryType.COMPOSITION);
		addEEnumLiteral(binaryTypeEEnum, BinaryType.DEPENDENCE);
		addEEnumLiteral(binaryTypeEEnum, BinaryType.INHERITANCE);
		addEEnumLiteral(binaryTypeEEnum, BinaryType.PRODUCERCONSUMER);
		addEEnumLiteral(binaryTypeEEnum, BinaryType._);

		initEEnum(naryTypeEEnum, NaryType.class, "NaryType");
		addEEnumLiteral(naryTypeEEnum, NaryType.SEQUENCE);
		addEEnumLiteral(naryTypeEEnum, NaryType.HIERARCHY);
		addEEnumLiteral(naryTypeEEnum, NaryType.TRADING);
		addEEnumLiteral(naryTypeEEnum, NaryType.OBSERVER);
		addEEnumLiteral(naryTypeEEnum, NaryType.CONTROLLER);
		addEEnumLiteral(naryTypeEEnum, NaryType._);

		initEEnum(componentTypeEEnum, ComponentType.class, "ComponentType");
		addEEnumLiteral(componentTypeEEnum, ComponentType.NORMAL);
		addEEnumLiteral(componentTypeEEnum, ComponentType.CONTAINER);
		addEEnumLiteral(componentTypeEEnum, ComponentType.FUNCTIONAL);
		addEEnumLiteral(componentTypeEEnum, ComponentType.USER_INTERACTION);

		// Create resource
		createResource(eNS_URI);
	}

} //Architectural_metamodelPackageImpl
