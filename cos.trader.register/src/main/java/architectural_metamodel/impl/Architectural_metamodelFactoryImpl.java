/**
 */
package architectural_metamodel.impl;

import architectural_metamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Architectural_metamodelFactoryImpl extends EFactoryImpl implements Architectural_metamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Architectural_metamodelFactory init() {
		try {
			Architectural_metamodelFactory theArchitectural_metamodelFactory = (Architectural_metamodelFactory)EPackage.Registry.INSTANCE.getEFactory(Architectural_metamodelPackage.eNS_URI);
			if (theArchitectural_metamodelFactory != null) {
				return theArchitectural_metamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Architectural_metamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architectural_metamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Architectural_metamodelPackage.ABSTRACT_COMPONENT: return createAbstractComponent();
			case Architectural_metamodelPackage.CONNECTOR: return createConnector();
			case Architectural_metamodelPackage.BINARY: return createBinary();
			case Architectural_metamodelPackage.NARY: return createNary();
			case Architectural_metamodelPackage.ABSTRACT_ARCHITECTURAL_MODEL: return createAbstractArchitecturalModel();
			case Architectural_metamodelPackage.CONCRETE_ARCHITECTURAL_MODEL: return createConcreteArchitecturalModel();
			case Architectural_metamodelPackage.CONCRETE_COMPONENT: return createConcreteComponent();
			case Architectural_metamodelPackage.INPUT_PORT: return createInputPort();
			case Architectural_metamodelPackage.OUTPUT_PORT: return createOutputPort();
			case Architectural_metamodelPackage.RUNTIME_PROPERTY: return createRuntimeProperty();
			case Architectural_metamodelPackage.PROVIDED: return createProvided();
			case Architectural_metamodelPackage.REQUIRED: return createRequired();
			case Architectural_metamodelPackage.ABSTRACT_DEPENDENCY: return createAbstractDependency();
			case Architectural_metamodelPackage.CONCRETE_DEPENDENCY: return createConcreteDependency();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Architectural_metamodelPackage.BINARY_TYPE:
				return createBinaryTypeFromString(eDataType, initialValue);
			case Architectural_metamodelPackage.NARY_TYPE:
				return createNaryTypeFromString(eDataType, initialValue);
			case Architectural_metamodelPackage.COMPONENT_TYPE:
				return createComponentTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Architectural_metamodelPackage.BINARY_TYPE:
				return convertBinaryTypeToString(eDataType, instanceValue);
			case Architectural_metamodelPackage.NARY_TYPE:
				return convertNaryTypeToString(eDataType, instanceValue);
			case Architectural_metamodelPackage.COMPONENT_TYPE:
				return convertComponentTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractComponent createAbstractComponent() {
		AbstractComponentImpl abstractComponent = new AbstractComponentImpl();
		return abstractComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binary createBinary() {
		BinaryImpl binary = new BinaryImpl();
		return binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nary createNary() {
		NaryImpl nary = new NaryImpl();
		return nary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractArchitecturalModel createAbstractArchitecturalModel() {
		AbstractArchitecturalModelImpl abstractArchitecturalModel = new AbstractArchitecturalModelImpl();
		return abstractArchitecturalModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteArchitecturalModel createConcreteArchitecturalModel() {
		ConcreteArchitecturalModelImpl concreteArchitecturalModel = new ConcreteArchitecturalModelImpl();
		return concreteArchitecturalModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteComponent createConcreteComponent() {
		ConcreteComponentImpl concreteComponent = new ConcreteComponentImpl();
		return concreteComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort createInputPort() {
		InputPortImpl inputPort = new InputPortImpl();
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort createOutputPort() {
		OutputPortImpl outputPort = new OutputPortImpl();
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeProperty createRuntimeProperty() {
		RuntimePropertyImpl runtimeProperty = new RuntimePropertyImpl();
		return runtimeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provided createProvided() {
		ProvidedImpl provided = new ProvidedImpl();
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Required createRequired() {
		RequiredImpl required = new RequiredImpl();
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractDependency createAbstractDependency() {
		AbstractDependencyImpl abstractDependency = new AbstractDependencyImpl();
		return abstractDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteDependency createConcreteDependency() {
		ConcreteDependencyImpl concreteDependency = new ConcreteDependencyImpl();
		return concreteDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryType createBinaryTypeFromString(EDataType eDataType, String initialValue) {
		BinaryType result = BinaryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaryType createNaryTypeFromString(EDataType eDataType, String initialValue) {
		NaryType result = NaryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNaryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType createComponentTypeFromString(EDataType eDataType, String initialValue) {
		ComponentType result = ComponentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architectural_metamodelPackage getArchitectural_metamodelPackage() {
		return (Architectural_metamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Architectural_metamodelPackage getPackage() {
		return Architectural_metamodelPackage.eINSTANCE;
	}

} //Architectural_metamodelFactoryImpl
