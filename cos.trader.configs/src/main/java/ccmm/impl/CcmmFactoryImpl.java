/**
 */
package ccmm.impl;

import ccmm.*;

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
public class CcmmFactoryImpl extends EFactoryImpl implements CcmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CcmmFactory init() {
		try {
			CcmmFactory theCcmmFactory = (CcmmFactory)EPackage.Registry.INSTANCE.getEFactory(CcmmPackage.eNS_URI);
			if (theCcmmFactory != null) {
				return theCcmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CcmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CcmmFactoryImpl() {
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
			case CcmmPackage.CONCRETE_COMPONENT_SPECIFICATION: return createConcreteComponentSpecification();
			case CcmmPackage.CONTACT: return createContact();
			case CcmmPackage.CONTACTS: return createContacts();
			case CcmmPackage.CONTROLLER_INTERFACE: return createControllerInterface();
			case CcmmPackage.CORE_CONTENT: return createCoreContent();
			case CcmmPackage.FUNCTIONAL: return createFunctional();
			case CcmmPackage.IMPLEMENTATION: return createImplementation();
			case CcmmPackage.INTERACTION_CONTENT: return createInteractionContent();
			case CcmmPackage.INTERACTION_INTERFACE: return createInteractionInterface();
			case CcmmPackage.LOCATION: return createLocation();
			case CcmmPackage.MARKETING: return createMarketing();
			case CcmmPackage.PROVIDED_INTERFACE: return createProvidedInterface();
			case CcmmPackage.REQUIRED_INTERFACE: return createRequiredInterface();
			case CcmmPackage.EXTRA_FUNCTIONAL: return createExtraFunctional();
			case CcmmPackage.PACKAGING: return createPackaging();
			case CcmmPackage.PROPERTIES: return createProperties();
			case CcmmPackage.VERSION: return createVersion();
			case CcmmPackage.PROPERTY: return createProperty();
			case CcmmPackage.DEPENDENCIES: return createDependencies();
			case CcmmPackage.DEPENDENCY: return createDependency();
			case CcmmPackage.PROVIDED_INTERFACES: return createProvidedInterfaces();
			case CcmmPackage.REQUIRED_INTERFACES: return createRequiredInterfaces();
			case CcmmPackage.WSDL_SPECIFICATION: return createWSDLSpecification();
			case CcmmPackage.OPERATION: return createOperation();
			case CcmmPackage.INPUT: return createInput();
			case CcmmPackage.OUTPUT: return createOutput();
			case CcmmPackage.INPUT_ELEMENT: return createInputElement();
			case CcmmPackage.OUTPUT_ELEMENT: return createOutputElement();
			case CcmmPackage.PORT_TYPE: return createPortType();
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
			case CcmmPackage.REPOSITORY_TYPE:
				return createRepositoryTypeFromString(eDataType, initialValue);
			case CcmmPackage.PLATFORM_TYPE:
				return createPlatformTypeFromString(eDataType, initialValue);
			case CcmmPackage.PROPERTY_ID:
				return createPropertyIDFromString(eDataType, initialValue);
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
			case CcmmPackage.REPOSITORY_TYPE:
				return convertRepositoryTypeToString(eDataType, instanceValue);
			case CcmmPackage.PLATFORM_TYPE:
				return convertPlatformTypeToString(eDataType, instanceValue);
			case CcmmPackage.PROPERTY_ID:
				return convertPropertyIDToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteComponentSpecification createConcreteComponentSpecification() {
		ConcreteComponentSpecificationImpl concreteComponentSpecification = new ConcreteComponentSpecificationImpl();
		return concreteComponentSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contact createContact() {
		ContactImpl contact = new ContactImpl();
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contacts createContacts() {
		ContactsImpl contacts = new ContactsImpl();
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerInterface createControllerInterface() {
		ControllerInterfaceImpl controllerInterface = new ControllerInterfaceImpl();
		return controllerInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreContent createCoreContent() {
		CoreContentImpl coreContent = new CoreContentImpl();
		return coreContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functional createFunctional() {
		FunctionalImpl functional = new FunctionalImpl();
		return functional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation createImplementation() {
		ImplementationImpl implementation = new ImplementationImpl();
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionContent createInteractionContent() {
		InteractionContentImpl interactionContent = new InteractionContentImpl();
		return interactionContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionInterface createInteractionInterface() {
		InteractionInterfaceImpl interactionInterface = new InteractionInterfaceImpl();
		return interactionInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marketing createMarketing() {
		MarketingImpl marketing = new MarketingImpl();
		return marketing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedInterface createProvidedInterface() {
		ProvidedInterfaceImpl providedInterface = new ProvidedInterfaceImpl();
		return providedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredInterface createRequiredInterface() {
		RequiredInterfaceImpl requiredInterface = new RequiredInterfaceImpl();
		return requiredInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtraFunctional createExtraFunctional() {
		ExtraFunctionalImpl extraFunctional = new ExtraFunctionalImpl();
		return extraFunctional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Packaging createPackaging() {
		PackagingImpl packaging = new PackagingImpl();
		return packaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createProperties() {
		PropertiesImpl properties = new PropertiesImpl();
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependencies createDependencies() {
		DependenciesImpl dependencies = new DependenciesImpl();
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedInterfaces createProvidedInterfaces() {
		ProvidedInterfacesImpl providedInterfaces = new ProvidedInterfacesImpl();
		return providedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredInterfaces createRequiredInterfaces() {
		RequiredInterfacesImpl requiredInterfaces = new RequiredInterfacesImpl();
		return requiredInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSDLSpecification createWSDLSpecification() {
		WSDLSpecificationImpl wsdlSpecification = new WSDLSpecificationImpl();
		return wsdlSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputElement createInputElement() {
		InputElementImpl inputElement = new InputElementImpl();
		return inputElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputElement createOutputElement() {
		OutputElementImpl outputElement = new OutputElementImpl();
		return outputElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortType() {
		PortTypeImpl portType = new PortTypeImpl();
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryType createRepositoryTypeFromString(EDataType eDataType, String initialValue) {
		RepositoryType result = RepositoryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepositoryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformType createPlatformTypeFromString(EDataType eDataType, String initialValue) {
		PlatformType result = PlatformType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlatformTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyID createPropertyIDFromString(EDataType eDataType, String initialValue) {
		PropertyID result = PropertyID.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyIDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CcmmPackage getCcmmPackage() {
		return (CcmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CcmmPackage getPackage() {
		return CcmmPackage.eINSTANCE;
	}

} //CcmmFactoryImpl
