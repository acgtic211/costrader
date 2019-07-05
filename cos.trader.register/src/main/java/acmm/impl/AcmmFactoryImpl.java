/**
 */
package acmm.impl;

import acmm.*;

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
public class AcmmFactoryImpl extends EFactoryImpl implements AcmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AcmmFactory init() {
		try {
			AcmmFactory theAcmmFactory = (AcmmFactory)EPackage.Registry.INSTANCE.getEFactory(AcmmPackage.eNS_URI);
			if (theAcmmFactory != null) {
				return theAcmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AcmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcmmFactoryImpl() {
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
			case AcmmPackage.ABSTRACT_COMPONENT_SPECIFICATION: return createAbstractComponentSpecification();
			case AcmmPackage.CONTACT: return createContact();
			case AcmmPackage.CONTACTS: return createContacts();
			case AcmmPackage.FUNCTIONAL: return createFunctional();
			case AcmmPackage.IMPLEMENTATION: return createImplementation();
			case AcmmPackage.LOCATION: return createLocation();
			case AcmmPackage.MARKETING: return createMarketing();
			case AcmmPackage.PROVIDED_INTERFACE: return createProvidedInterface();
			case AcmmPackage.REQUIRED_INTERFACE: return createRequiredInterface();
			case AcmmPackage.EXTRA_FUNCTIONAL: return createExtraFunctional();
			case AcmmPackage.PACKAGING: return createPackaging();
			case AcmmPackage.PROPERTIES: return createProperties();
			case AcmmPackage.PROPERTY: return createProperty();
			case AcmmPackage.DEPENDENCIES: return createDependencies();
			case AcmmPackage.DEPENDENCY: return createDependency();
			case AcmmPackage.PROVIDED_INTERFACES: return createProvidedInterfaces();
			case AcmmPackage.REQUIRED_INTERFACES: return createRequiredInterfaces();
			case AcmmPackage.WSDL_SPECIFICATION: return createWSDLSpecification();
			case AcmmPackage.OPERATION: return createOperation();
			case AcmmPackage.INPUT: return createInput();
			case AcmmPackage.OUTPUT: return createOutput();
			case AcmmPackage.INPUT_ELEMENT: return createInputElement();
			case AcmmPackage.OUTPUT_ELEMENT: return createOutputElement();
			case AcmmPackage.PORT_TYPE: return createPortType();
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
			case AcmmPackage.REPOSITORY_TYPE:
				return createRepositoryTypeFromString(eDataType, initialValue);
			case AcmmPackage.PLATFORM_TYPE:
				return createPlatformTypeFromString(eDataType, initialValue);
			case AcmmPackage.PROPERTY_ID:
				return createPropertyIDFromString(eDataType, initialValue);
			case AcmmPackage.PROPERTY_PRIORITY:
				return createPropertyPriorityFromString(eDataType, initialValue);
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
			case AcmmPackage.REPOSITORY_TYPE:
				return convertRepositoryTypeToString(eDataType, instanceValue);
			case AcmmPackage.PLATFORM_TYPE:
				return convertPlatformTypeToString(eDataType, instanceValue);
			case AcmmPackage.PROPERTY_ID:
				return convertPropertyIDToString(eDataType, instanceValue);
			case AcmmPackage.PROPERTY_PRIORITY:
				return convertPropertyPriorityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractComponentSpecification createAbstractComponentSpecification() {
		AbstractComponentSpecificationImpl abstractComponentSpecification = new AbstractComponentSpecificationImpl();
		return abstractComponentSpecification;
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
	public PropertyPriority createPropertyPriorityFromString(EDataType eDataType, String initialValue) {
		PropertyPriority result = PropertyPriority.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyPriorityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcmmPackage getAcmmPackage() {
		return (AcmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AcmmPackage getPackage() {
		return AcmmPackage.eINSTANCE;
	}

} //AcmmFactoryImpl
