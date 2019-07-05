/**
 */
package acmm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see acmm.AcmmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore.xml.type='http://www.eclipse.org/emf/2003/XMLType#/'"
 * @generated
 */
public interface AcmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "acmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://acg.ual.es/definitions/abstractComponent/1.3.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "acmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AcmmPackage eINSTANCE = acmm.impl.AcmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link acmm.impl.AbstractComponentSpecificationImpl <em>Abstract Component Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.AbstractComponentSpecificationImpl
	 * @see acmm.impl.AcmmPackageImpl#getAbstractComponentSpecification()
	 * @generated
	 */
	int ABSTRACT_COMPONENT_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Component ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_SPECIFICATION__COMPONENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Component Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_SPECIFICATION__COMPONENT_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Functional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_SPECIFICATION__FUNCTIONAL = 2;

	/**
	 * The feature id for the '<em><b>Extra Functional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_SPECIFICATION__EXTRA_FUNCTIONAL = 3;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_SPECIFICATION__COMPONENT_NAME = 4;

	/**
	 * The feature id for the '<em><b>Packaging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_SPECIFICATION__PACKAGING = 5;

	/**
	 * The feature id for the '<em><b>Marketing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_SPECIFICATION__MARKETING = 6;

	/**
	 * The number of structural features of the '<em>Abstract Component Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_SPECIFICATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Abstract Component Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.impl.ContactImpl <em>Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.ContactImpl
	 * @see acmm.impl.AcmmPackageImpl#getContact()
	 * @generated
	 */
	int CONTACT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Person Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__PERSON_NAME = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__PHONE = 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__ADDRESS = 4;

	/**
	 * The number of structural features of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.impl.ContactsImpl <em>Contacts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.ContactsImpl
	 * @see acmm.impl.AcmmPackageImpl#getContacts()
	 * @generated
	 */
	int CONTACTS = 2;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTS__CONTACT = 0;

	/**
	 * The number of structural features of the '<em>Contacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Contacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.impl.FunctionalImpl <em>Functional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.FunctionalImpl
	 * @see acmm.impl.AcmmPackageImpl#getFunctional()
	 * @generated
	 */
	int FUNCTIONAL = 3;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__PROVIDED_INTERFACES = 0;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__REQUIRED_INTERFACES = 1;

	/**
	 * The number of structural features of the '<em>Functional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Functional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.impl.ImplementationImpl <em>Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.ImplementationImpl
	 * @see acmm.impl.AcmmPackageImpl#getImplementation()
	 * @generated
	 */
	int IMPLEMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Programming Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__PROGRAMMING_LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Platform Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__PLATFORM_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.LocationImpl
	 * @see acmm.impl.AcmmPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Repository ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__REPOSITORY_ID = 0;

	/**
	 * The feature id for the '<em><b>Repository Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__REPOSITORY_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.impl.MarketingImpl <em>Marketing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.MarketingImpl
	 * @see acmm.impl.AcmmPackageImpl#getMarketing()
	 * @generated
	 */
	int MARKETING = 6;

	/**
	 * The feature id for the '<em><b>Entity ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING__ENTITY_ID = 0;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING__ENTITY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Entity Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING__ENTITY_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Contacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING__CONTACTS = 3;

	/**
	 * The number of structural features of the '<em>Marketing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Marketing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.InterfaceImpl
	 * @see acmm.impl.AcmmPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Interface ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__INTERFACE_ID = 0;

	/**
	 * The feature id for the '<em><b>Interface Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__INTERFACE_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Interface Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__INTERFACE_SPECIFICATION = 2;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.impl.ProvidedInterfaceImpl <em>Provided Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.ProvidedInterfaceImpl
	 * @see acmm.impl.AcmmPackageImpl#getProvidedInterface()
	 * @generated
	 */
	int PROVIDED_INTERFACE = 8;

	/**
	 * The feature id for the '<em><b>Interface ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE__INTERFACE_ID = INTERFACE__INTERFACE_ID;

	/**
	 * The feature id for the '<em><b>Interface Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE__INTERFACE_DESCRIPTION = INTERFACE__INTERFACE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Interface Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE__INTERFACE_SPECIFICATION = INTERFACE__INTERFACE_SPECIFICATION;

	/**
	 * The number of structural features of the '<em>Provided Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link acmm.impl.RequiredInterfaceImpl <em>Required Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.RequiredInterfaceImpl
	 * @see acmm.impl.AcmmPackageImpl#getRequiredInterface()
	 * @generated
	 */
	int REQUIRED_INTERFACE = 9;

	/**
	 * The feature id for the '<em><b>Interface ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE__INTERFACE_ID = INTERFACE__INTERFACE_ID;

	/**
	 * The feature id for the '<em><b>Interface Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE__INTERFACE_DESCRIPTION = INTERFACE__INTERFACE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Interface Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE__INTERFACE_SPECIFICATION = INTERFACE__INTERFACE_SPECIFICATION;

	/**
	 * The number of structural features of the '<em>Required Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link acmm.impl.ExtraFunctionalImpl <em>Extra Functional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.ExtraFunctionalImpl
	 * @see acmm.impl.AcmmPackageImpl#getExtraFunctional()
	 * @generated
	 */
	int EXTRA_FUNCTIONAL = 10;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_FUNCTIONAL__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_FUNCTIONAL__DEPENDENCIES = 1;

	/**
	 * The number of structural features of the '<em>Extra Functional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_FUNCTIONAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Extra Functional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_FUNCTIONAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.impl.PackagingImpl <em>Packaging</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.PackagingImpl
	 * @see acmm.impl.AcmmPackageImpl#getPackaging()
	 * @generated
	 */
	int PACKAGING = 11;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGING__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGING__IMPLEMENTATION = 1;

	/**
	 * The number of structural features of the '<em>Packaging</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Packaging</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.impl.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.PropertiesImpl
	 * @see acmm.impl.AcmmPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 12;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.PropertyImpl
	 * @see acmm.impl.AcmmPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Property ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PROPERTY_ID = 0;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PROPERTY_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Property Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PROPERTY_PRIORITY = 2;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_MANDATORY = 3;

	/**
	 * The feature id for the '<em><b>Is Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_EDITABLE = 4;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.impl.DependenciesImpl <em>Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.DependenciesImpl
	 * @see acmm.impl.AcmmPackageImpl#getDependencies()
	 * @generated
	 */
	int DEPENDENCIES = 14;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES__DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.DependencyImpl
	 * @see acmm.impl.AcmmPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 15;

	/**
	 * The feature id for the '<em><b>Interface ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__INTERFACE_ID = 0;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.impl.ProvidedInterfacesImpl <em>Provided Interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.ProvidedInterfacesImpl
	 * @see acmm.impl.AcmmPackageImpl#getProvidedInterfaces()
	 * @generated
	 */
	int PROVIDED_INTERFACES = 16;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACES__INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Provided Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Provided Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.impl.RequiredInterfacesImpl <em>Required Interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.RequiredInterfacesImpl
	 * @see acmm.impl.AcmmPackageImpl#getRequiredInterfaces()
	 * @generated
	 */
	int REQUIRED_INTERFACES = 17;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACES__INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Required Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Required Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.impl.WSDLSpecificationImpl <em>WSDL Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.WSDLSpecificationImpl
	 * @see acmm.impl.AcmmPackageImpl#getWSDLSpecification()
	 * @generated
	 */
	int WSDL_SPECIFICATION = 18;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SPECIFICATION__URI = 0;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SPECIFICATION__PORT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>WSDL Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>WSDL Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.OperationImpl
	 * @see acmm.impl.AcmmPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 19;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.InputImpl
	 * @see acmm.impl.AcmmPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 20;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.OutputImpl
	 * @see acmm.impl.AcmmPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 21;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.ElementImpl
	 * @see acmm.impl.AcmmPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MIN_OCCURS = 2;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MAX_OCCURS = 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.impl.InputElementImpl <em>Input Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.InputElementImpl
	 * @see acmm.impl.AcmmPackageImpl#getInputElement()
	 * @generated
	 */
	int INPUT_ELEMENT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__TYPE = ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__MIN_OCCURS = ELEMENT__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__MAX_OCCURS = ELEMENT__MAX_OCCURS;

	/**
	 * The number of structural features of the '<em>Input Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link acmm.impl.OutputElementImpl <em>Output Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.OutputElementImpl
	 * @see acmm.impl.AcmmPackageImpl#getOutputElement()
	 * @generated
	 */
	int OUTPUT_ELEMENT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT__TYPE = ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT__MIN_OCCURS = ELEMENT__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT__MAX_OCCURS = ELEMENT__MAX_OCCURS;

	/**
	 * The number of structural features of the '<em>Output Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link acmm.impl.PortTypeImpl <em>Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.impl.PortTypeImpl
	 * @see acmm.impl.AcmmPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__OPERATION = 1;

	/**
	 * The number of structural features of the '<em>Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link acmm.RepositoryType <em>Repository Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.RepositoryType
	 * @see acmm.impl.AcmmPackageImpl#getRepositoryType()
	 * @generated
	 */
	int REPOSITORY_TYPE = 26;

	/**
	 * The meta object id for the '{@link acmm.PlatformType <em>Platform Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.PlatformType
	 * @see acmm.impl.AcmmPackageImpl#getPlatformType()
	 * @generated
	 */
	int PLATFORM_TYPE = 27;

	/**
	 * The meta object id for the '{@link acmm.PropertyID <em>Property ID</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.PropertyID
	 * @see acmm.impl.AcmmPackageImpl#getPropertyID()
	 * @generated
	 */
	int PROPERTY_ID = 28;

	/**
	 * The meta object id for the '{@link acmm.PropertyPriority <em>Property Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see acmm.PropertyPriority
	 * @see acmm.impl.AcmmPackageImpl#getPropertyPriority()
	 * @generated
	 */
	int PROPERTY_PRIORITY = 29;


	/**
	 * Returns the meta object for class '{@link acmm.AbstractComponentSpecification <em>Abstract Component Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component Specification</em>'.
	 * @see acmm.AbstractComponentSpecification
	 * @generated
	 */
	EClass getAbstractComponentSpecification();

	/**
	 * Returns the meta object for the attribute '{@link acmm.AbstractComponentSpecification#getComponentID <em>Component ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component ID</em>'.
	 * @see acmm.AbstractComponentSpecification#getComponentID()
	 * @see #getAbstractComponentSpecification()
	 * @generated
	 */
	EAttribute getAbstractComponentSpecification_ComponentID();

	/**
	 * Returns the meta object for the attribute '{@link acmm.AbstractComponentSpecification#getComponentDescription <em>Component Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Description</em>'.
	 * @see acmm.AbstractComponentSpecification#getComponentDescription()
	 * @see #getAbstractComponentSpecification()
	 * @generated
	 */
	EAttribute getAbstractComponentSpecification_ComponentDescription();

	/**
	 * Returns the meta object for the containment reference '{@link acmm.AbstractComponentSpecification#getFunctional <em>Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Functional</em>'.
	 * @see acmm.AbstractComponentSpecification#getFunctional()
	 * @see #getAbstractComponentSpecification()
	 * @generated
	 */
	EReference getAbstractComponentSpecification_Functional();

	/**
	 * Returns the meta object for the containment reference '{@link acmm.AbstractComponentSpecification#getExtraFunctional <em>Extra Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extra Functional</em>'.
	 * @see acmm.AbstractComponentSpecification#getExtraFunctional()
	 * @see #getAbstractComponentSpecification()
	 * @generated
	 */
	EReference getAbstractComponentSpecification_ExtraFunctional();

	/**
	 * Returns the meta object for the attribute '{@link acmm.AbstractComponentSpecification#getComponentName <em>Component Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Name</em>'.
	 * @see acmm.AbstractComponentSpecification#getComponentName()
	 * @see #getAbstractComponentSpecification()
	 * @generated
	 */
	EAttribute getAbstractComponentSpecification_ComponentName();

	/**
	 * Returns the meta object for the containment reference '{@link acmm.AbstractComponentSpecification#getPackaging <em>Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Packaging</em>'.
	 * @see acmm.AbstractComponentSpecification#getPackaging()
	 * @see #getAbstractComponentSpecification()
	 * @generated
	 */
	EReference getAbstractComponentSpecification_Packaging();

	/**
	 * Returns the meta object for the containment reference '{@link acmm.AbstractComponentSpecification#getMarketing <em>Marketing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marketing</em>'.
	 * @see acmm.AbstractComponentSpecification#getMarketing()
	 * @see #getAbstractComponentSpecification()
	 * @generated
	 */
	EReference getAbstractComponentSpecification_Marketing();

	/**
	 * Returns the meta object for class '{@link acmm.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact</em>'.
	 * @see acmm.Contact
	 * @generated
	 */
	EClass getContact();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Contact#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see acmm.Contact#getDescription()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Description();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Contact#getPersonName <em>Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Name</em>'.
	 * @see acmm.Contact#getPersonName()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_PersonName();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Contact#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see acmm.Contact#getEmail()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Email();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Contact#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see acmm.Contact#getPhone()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Phone();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Contact#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see acmm.Contact#getAddress()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Address();

	/**
	 * Returns the meta object for class '{@link acmm.Contacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contacts</em>'.
	 * @see acmm.Contacts
	 * @generated
	 */
	EClass getContacts();

	/**
	 * Returns the meta object for the containment reference list '{@link acmm.Contacts#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contact</em>'.
	 * @see acmm.Contacts#getContact()
	 * @see #getContacts()
	 * @generated
	 */
	EReference getContacts_Contact();

	/**
	 * Returns the meta object for class '{@link acmm.Functional <em>Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional</em>'.
	 * @see acmm.Functional
	 * @generated
	 */
	EClass getFunctional();

	/**
	 * Returns the meta object for the containment reference '{@link acmm.Functional#getProvidedInterfaces <em>Provided Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provided Interfaces</em>'.
	 * @see acmm.Functional#getProvidedInterfaces()
	 * @see #getFunctional()
	 * @generated
	 */
	EReference getFunctional_ProvidedInterfaces();

	/**
	 * Returns the meta object for the containment reference '{@link acmm.Functional#getRequiredInterfaces <em>Required Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Interfaces</em>'.
	 * @see acmm.Functional#getRequiredInterfaces()
	 * @see #getFunctional()
	 * @generated
	 */
	EReference getFunctional_RequiredInterfaces();

	/**
	 * Returns the meta object for class '{@link acmm.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation</em>'.
	 * @see acmm.Implementation
	 * @generated
	 */
	EClass getImplementation();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Implementation#getProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Programming Language</em>'.
	 * @see acmm.Implementation#getProgrammingLanguage()
	 * @see #getImplementation()
	 * @generated
	 */
	EAttribute getImplementation_ProgrammingLanguage();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Implementation#getPlatformType <em>Platform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform Type</em>'.
	 * @see acmm.Implementation#getPlatformType()
	 * @see #getImplementation()
	 * @generated
	 */
	EAttribute getImplementation_PlatformType();

	/**
	 * Returns the meta object for class '{@link acmm.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see acmm.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Location#getRepositoryID <em>Repository ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository ID</em>'.
	 * @see acmm.Location#getRepositoryID()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_RepositoryID();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Location#getRepositoryType <em>Repository Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository Type</em>'.
	 * @see acmm.Location#getRepositoryType()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_RepositoryType();

	/**
	 * Returns the meta object for class '{@link acmm.Marketing <em>Marketing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marketing</em>'.
	 * @see acmm.Marketing
	 * @generated
	 */
	EClass getMarketing();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Marketing#getEntityID <em>Entity ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity ID</em>'.
	 * @see acmm.Marketing#getEntityID()
	 * @see #getMarketing()
	 * @generated
	 */
	EAttribute getMarketing_EntityID();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Marketing#getEntityName <em>Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Name</em>'.
	 * @see acmm.Marketing#getEntityName()
	 * @see #getMarketing()
	 * @generated
	 */
	EAttribute getMarketing_EntityName();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Marketing#getEntityDescription <em>Entity Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Description</em>'.
	 * @see acmm.Marketing#getEntityDescription()
	 * @see #getMarketing()
	 * @generated
	 */
	EAttribute getMarketing_EntityDescription();

	/**
	 * Returns the meta object for the containment reference '{@link acmm.Marketing#getContacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contacts</em>'.
	 * @see acmm.Marketing#getContacts()
	 * @see #getMarketing()
	 * @generated
	 */
	EReference getMarketing_Contacts();

	/**
	 * Returns the meta object for class '{@link acmm.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see acmm.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Interface#getInterfaceID <em>Interface ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface ID</em>'.
	 * @see acmm.Interface#getInterfaceID()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_InterfaceID();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Interface#getInterfaceDescription <em>Interface Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Description</em>'.
	 * @see acmm.Interface#getInterfaceDescription()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_InterfaceDescription();

	/**
	 * Returns the meta object for the containment reference '{@link acmm.Interface#getInterfaceSpecification <em>Interface Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface Specification</em>'.
	 * @see acmm.Interface#getInterfaceSpecification()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_InterfaceSpecification();

	/**
	 * Returns the meta object for class '{@link acmm.ProvidedInterface <em>Provided Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Interface</em>'.
	 * @see acmm.ProvidedInterface
	 * @generated
	 */
	EClass getProvidedInterface();

	/**
	 * Returns the meta object for class '{@link acmm.RequiredInterface <em>Required Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Interface</em>'.
	 * @see acmm.RequiredInterface
	 * @generated
	 */
	EClass getRequiredInterface();

	/**
	 * Returns the meta object for class '{@link acmm.ExtraFunctional <em>Extra Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extra Functional</em>'.
	 * @see acmm.ExtraFunctional
	 * @generated
	 */
	EClass getExtraFunctional();

	/**
	 * Returns the meta object for the containment reference '{@link acmm.ExtraFunctional#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see acmm.ExtraFunctional#getProperties()
	 * @see #getExtraFunctional()
	 * @generated
	 */
	EReference getExtraFunctional_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link acmm.ExtraFunctional#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see acmm.ExtraFunctional#getDependencies()
	 * @see #getExtraFunctional()
	 * @generated
	 */
	EReference getExtraFunctional_Dependencies();

	/**
	 * Returns the meta object for class '{@link acmm.Packaging <em>Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packaging</em>'.
	 * @see acmm.Packaging
	 * @generated
	 */
	EClass getPackaging();

	/**
	 * Returns the meta object for the containment reference '{@link acmm.Packaging#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see acmm.Packaging#getLocation()
	 * @see #getPackaging()
	 * @generated
	 */
	EReference getPackaging_Location();

	/**
	 * Returns the meta object for the containment reference '{@link acmm.Packaging#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation</em>'.
	 * @see acmm.Packaging#getImplementation()
	 * @see #getPackaging()
	 * @generated
	 */
	EReference getPackaging_Implementation();

	/**
	 * Returns the meta object for class '{@link acmm.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see acmm.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link acmm.Properties#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see acmm.Properties#getProperty()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_Property();

	/**
	 * Returns the meta object for class '{@link acmm.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see acmm.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Property#getPropertyID <em>Property ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property ID</em>'.
	 * @see acmm.Property#getPropertyID()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_PropertyID();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Property#getPropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Value</em>'.
	 * @see acmm.Property#getPropertyValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_PropertyValue();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Property#getPropertyPriority <em>Property Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Priority</em>'.
	 * @see acmm.Property#getPropertyPriority()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_PropertyPriority();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Property#isIsMandatory <em>Is Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mandatory</em>'.
	 * @see acmm.Property#isIsMandatory()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsMandatory();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Property#isIsEditable <em>Is Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Editable</em>'.
	 * @see acmm.Property#isIsEditable()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsEditable();

	/**
	 * Returns the meta object for class '{@link acmm.Dependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencies</em>'.
	 * @see acmm.Dependencies
	 * @generated
	 */
	EClass getDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link acmm.Dependencies#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency</em>'.
	 * @see acmm.Dependencies#getDependency()
	 * @see #getDependencies()
	 * @generated
	 */
	EReference getDependencies_Dependency();

	/**
	 * Returns the meta object for class '{@link acmm.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see acmm.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Dependency#getInterfaceID <em>Interface ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface ID</em>'.
	 * @see acmm.Dependency#getInterfaceID()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_InterfaceID();

	/**
	 * Returns the meta object for class '{@link acmm.ProvidedInterfaces <em>Provided Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Interfaces</em>'.
	 * @see acmm.ProvidedInterfaces
	 * @generated
	 */
	EClass getProvidedInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link acmm.ProvidedInterfaces#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see acmm.ProvidedInterfaces#getInterface()
	 * @see #getProvidedInterfaces()
	 * @generated
	 */
	EReference getProvidedInterfaces_Interface();

	/**
	 * Returns the meta object for class '{@link acmm.RequiredInterfaces <em>Required Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Interfaces</em>'.
	 * @see acmm.RequiredInterfaces
	 * @generated
	 */
	EClass getRequiredInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link acmm.RequiredInterfaces#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see acmm.RequiredInterfaces#getInterface()
	 * @see #getRequiredInterfaces()
	 * @generated
	 */
	EReference getRequiredInterfaces_Interface();

	/**
	 * Returns the meta object for class '{@link acmm.WSDLSpecification <em>WSDL Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSDL Specification</em>'.
	 * @see acmm.WSDLSpecification
	 * @generated
	 */
	EClass getWSDLSpecification();

	/**
	 * Returns the meta object for the attribute '{@link acmm.WSDLSpecification#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see acmm.WSDLSpecification#getUri()
	 * @see #getWSDLSpecification()
	 * @generated
	 */
	EAttribute getWSDLSpecification_Uri();

	/**
	 * Returns the meta object for the containment reference '{@link acmm.WSDLSpecification#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port Type</em>'.
	 * @see acmm.WSDLSpecification#getPortType()
	 * @see #getWSDLSpecification()
	 * @generated
	 */
	EReference getWSDLSpecification_PortType();

	/**
	 * Returns the meta object for class '{@link acmm.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see acmm.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference '{@link acmm.Operation#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see acmm.Operation#getInput()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Input();

	/**
	 * Returns the meta object for the containment reference '{@link acmm.Operation#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see acmm.Operation#getOutput()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Output();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see acmm.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for class '{@link acmm.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see acmm.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the containment reference list '{@link acmm.Input#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see acmm.Input#getElement()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Element();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Input#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see acmm.Input#getName()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Name();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Input#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see acmm.Input#getType()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Type();

	/**
	 * Returns the meta object for class '{@link acmm.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see acmm.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the containment reference list '{@link acmm.Output#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see acmm.Output#getElement()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Element();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Output#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see acmm.Output#getName()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Name();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Output#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see acmm.Output#getType()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Type();

	/**
	 * Returns the meta object for class '{@link acmm.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see acmm.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see acmm.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Element#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see acmm.Element#getType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Element#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see acmm.Element#getMinOccurs()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link acmm.Element#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see acmm.Element#getMaxOccurs()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_MaxOccurs();

	/**
	 * Returns the meta object for class '{@link acmm.InputElement <em>Input Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Element</em>'.
	 * @see acmm.InputElement
	 * @generated
	 */
	EClass getInputElement();

	/**
	 * Returns the meta object for class '{@link acmm.OutputElement <em>Output Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Element</em>'.
	 * @see acmm.OutputElement
	 * @generated
	 */
	EClass getOutputElement();

	/**
	 * Returns the meta object for class '{@link acmm.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type</em>'.
	 * @see acmm.PortType
	 * @generated
	 */
	EClass getPortType();

	/**
	 * Returns the meta object for the attribute '{@link acmm.PortType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see acmm.PortType#getName()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link acmm.PortType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see acmm.PortType#getOperation()
	 * @see #getPortType()
	 * @generated
	 */
	EReference getPortType_Operation();

	/**
	 * Returns the meta object for enum '{@link acmm.RepositoryType <em>Repository Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Repository Type</em>'.
	 * @see acmm.RepositoryType
	 * @generated
	 */
	EEnum getRepositoryType();

	/**
	 * Returns the meta object for enum '{@link acmm.PlatformType <em>Platform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Platform Type</em>'.
	 * @see acmm.PlatformType
	 * @generated
	 */
	EEnum getPlatformType();

	/**
	 * Returns the meta object for enum '{@link acmm.PropertyID <em>Property ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property ID</em>'.
	 * @see acmm.PropertyID
	 * @generated
	 */
	EEnum getPropertyID();

	/**
	 * Returns the meta object for enum '{@link acmm.PropertyPriority <em>Property Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Priority</em>'.
	 * @see acmm.PropertyPriority
	 * @generated
	 */
	EEnum getPropertyPriority();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AcmmFactory getAcmmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link acmm.impl.AbstractComponentSpecificationImpl <em>Abstract Component Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.AbstractComponentSpecificationImpl
		 * @see acmm.impl.AcmmPackageImpl#getAbstractComponentSpecification()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT_SPECIFICATION = eINSTANCE.getAbstractComponentSpecification();

		/**
		 * The meta object literal for the '<em><b>Component ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMPONENT_SPECIFICATION__COMPONENT_ID = eINSTANCE.getAbstractComponentSpecification_ComponentID();

		/**
		 * The meta object literal for the '<em><b>Component Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMPONENT_SPECIFICATION__COMPONENT_DESCRIPTION = eINSTANCE.getAbstractComponentSpecification_ComponentDescription();

		/**
		 * The meta object literal for the '<em><b>Functional</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT_SPECIFICATION__FUNCTIONAL = eINSTANCE.getAbstractComponentSpecification_Functional();

		/**
		 * The meta object literal for the '<em><b>Extra Functional</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT_SPECIFICATION__EXTRA_FUNCTIONAL = eINSTANCE.getAbstractComponentSpecification_ExtraFunctional();

		/**
		 * The meta object literal for the '<em><b>Component Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMPONENT_SPECIFICATION__COMPONENT_NAME = eINSTANCE.getAbstractComponentSpecification_ComponentName();

		/**
		 * The meta object literal for the '<em><b>Packaging</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT_SPECIFICATION__PACKAGING = eINSTANCE.getAbstractComponentSpecification_Packaging();

		/**
		 * The meta object literal for the '<em><b>Marketing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT_SPECIFICATION__MARKETING = eINSTANCE.getAbstractComponentSpecification_Marketing();

		/**
		 * The meta object literal for the '{@link acmm.impl.ContactImpl <em>Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.ContactImpl
		 * @see acmm.impl.AcmmPackageImpl#getContact()
		 * @generated
		 */
		EClass CONTACT = eINSTANCE.getContact();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__DESCRIPTION = eINSTANCE.getContact_Description();

		/**
		 * The meta object literal for the '<em><b>Person Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__PERSON_NAME = eINSTANCE.getContact_PersonName();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__EMAIL = eINSTANCE.getContact_Email();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__PHONE = eINSTANCE.getContact_Phone();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__ADDRESS = eINSTANCE.getContact_Address();

		/**
		 * The meta object literal for the '{@link acmm.impl.ContactsImpl <em>Contacts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.ContactsImpl
		 * @see acmm.impl.AcmmPackageImpl#getContacts()
		 * @generated
		 */
		EClass CONTACTS = eINSTANCE.getContacts();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACTS__CONTACT = eINSTANCE.getContacts_Contact();

		/**
		 * The meta object literal for the '{@link acmm.impl.FunctionalImpl <em>Functional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.FunctionalImpl
		 * @see acmm.impl.AcmmPackageImpl#getFunctional()
		 * @generated
		 */
		EClass FUNCTIONAL = eINSTANCE.getFunctional();

		/**
		 * The meta object literal for the '<em><b>Provided Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL__PROVIDED_INTERFACES = eINSTANCE.getFunctional_ProvidedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Required Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL__REQUIRED_INTERFACES = eINSTANCE.getFunctional_RequiredInterfaces();

		/**
		 * The meta object literal for the '{@link acmm.impl.ImplementationImpl <em>Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.ImplementationImpl
		 * @see acmm.impl.AcmmPackageImpl#getImplementation()
		 * @generated
		 */
		EClass IMPLEMENTATION = eINSTANCE.getImplementation();

		/**
		 * The meta object literal for the '<em><b>Programming Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION__PROGRAMMING_LANGUAGE = eINSTANCE.getImplementation_ProgrammingLanguage();

		/**
		 * The meta object literal for the '<em><b>Platform Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION__PLATFORM_TYPE = eINSTANCE.getImplementation_PlatformType();

		/**
		 * The meta object literal for the '{@link acmm.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.LocationImpl
		 * @see acmm.impl.AcmmPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Repository ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__REPOSITORY_ID = eINSTANCE.getLocation_RepositoryID();

		/**
		 * The meta object literal for the '<em><b>Repository Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__REPOSITORY_TYPE = eINSTANCE.getLocation_RepositoryType();

		/**
		 * The meta object literal for the '{@link acmm.impl.MarketingImpl <em>Marketing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.MarketingImpl
		 * @see acmm.impl.AcmmPackageImpl#getMarketing()
		 * @generated
		 */
		EClass MARKETING = eINSTANCE.getMarketing();

		/**
		 * The meta object literal for the '<em><b>Entity ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING__ENTITY_ID = eINSTANCE.getMarketing_EntityID();

		/**
		 * The meta object literal for the '<em><b>Entity Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING__ENTITY_NAME = eINSTANCE.getMarketing_EntityName();

		/**
		 * The meta object literal for the '<em><b>Entity Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING__ENTITY_DESCRIPTION = eINSTANCE.getMarketing_EntityDescription();

		/**
		 * The meta object literal for the '<em><b>Contacts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING__CONTACTS = eINSTANCE.getMarketing_Contacts();

		/**
		 * The meta object literal for the '{@link acmm.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.InterfaceImpl
		 * @see acmm.impl.AcmmPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Interface ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__INTERFACE_ID = eINSTANCE.getInterface_InterfaceID();

		/**
		 * The meta object literal for the '<em><b>Interface Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__INTERFACE_DESCRIPTION = eINSTANCE.getInterface_InterfaceDescription();

		/**
		 * The meta object literal for the '<em><b>Interface Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__INTERFACE_SPECIFICATION = eINSTANCE.getInterface_InterfaceSpecification();

		/**
		 * The meta object literal for the '{@link acmm.impl.ProvidedInterfaceImpl <em>Provided Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.ProvidedInterfaceImpl
		 * @see acmm.impl.AcmmPackageImpl#getProvidedInterface()
		 * @generated
		 */
		EClass PROVIDED_INTERFACE = eINSTANCE.getProvidedInterface();

		/**
		 * The meta object literal for the '{@link acmm.impl.RequiredInterfaceImpl <em>Required Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.RequiredInterfaceImpl
		 * @see acmm.impl.AcmmPackageImpl#getRequiredInterface()
		 * @generated
		 */
		EClass REQUIRED_INTERFACE = eINSTANCE.getRequiredInterface();

		/**
		 * The meta object literal for the '{@link acmm.impl.ExtraFunctionalImpl <em>Extra Functional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.ExtraFunctionalImpl
		 * @see acmm.impl.AcmmPackageImpl#getExtraFunctional()
		 * @generated
		 */
		EClass EXTRA_FUNCTIONAL = eINSTANCE.getExtraFunctional();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRA_FUNCTIONAL__PROPERTIES = eINSTANCE.getExtraFunctional_Properties();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRA_FUNCTIONAL__DEPENDENCIES = eINSTANCE.getExtraFunctional_Dependencies();

		/**
		 * The meta object literal for the '{@link acmm.impl.PackagingImpl <em>Packaging</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.PackagingImpl
		 * @see acmm.impl.AcmmPackageImpl#getPackaging()
		 * @generated
		 */
		EClass PACKAGING = eINSTANCE.getPackaging();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGING__LOCATION = eINSTANCE.getPackaging_Location();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGING__IMPLEMENTATION = eINSTANCE.getPackaging_Implementation();

		/**
		 * The meta object literal for the '{@link acmm.impl.PropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.PropertiesImpl
		 * @see acmm.impl.AcmmPackageImpl#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__PROPERTY = eINSTANCE.getProperties_Property();

		/**
		 * The meta object literal for the '{@link acmm.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.PropertyImpl
		 * @see acmm.impl.AcmmPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Property ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__PROPERTY_ID = eINSTANCE.getProperty_PropertyID();

		/**
		 * The meta object literal for the '<em><b>Property Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__PROPERTY_VALUE = eINSTANCE.getProperty_PropertyValue();

		/**
		 * The meta object literal for the '<em><b>Property Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__PROPERTY_PRIORITY = eINSTANCE.getProperty_PropertyPriority();

		/**
		 * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_MANDATORY = eINSTANCE.getProperty_IsMandatory();

		/**
		 * The meta object literal for the '<em><b>Is Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_EDITABLE = eINSTANCE.getProperty_IsEditable();

		/**
		 * The meta object literal for the '{@link acmm.impl.DependenciesImpl <em>Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.DependenciesImpl
		 * @see acmm.impl.AcmmPackageImpl#getDependencies()
		 * @generated
		 */
		EClass DEPENDENCIES = eINSTANCE.getDependencies();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCIES__DEPENDENCY = eINSTANCE.getDependencies_Dependency();

		/**
		 * The meta object literal for the '{@link acmm.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.DependencyImpl
		 * @see acmm.impl.AcmmPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Interface ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__INTERFACE_ID = eINSTANCE.getDependency_InterfaceID();

		/**
		 * The meta object literal for the '{@link acmm.impl.ProvidedInterfacesImpl <em>Provided Interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.ProvidedInterfacesImpl
		 * @see acmm.impl.AcmmPackageImpl#getProvidedInterfaces()
		 * @generated
		 */
		EClass PROVIDED_INTERFACES = eINSTANCE.getProvidedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_INTERFACES__INTERFACE = eINSTANCE.getProvidedInterfaces_Interface();

		/**
		 * The meta object literal for the '{@link acmm.impl.RequiredInterfacesImpl <em>Required Interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.RequiredInterfacesImpl
		 * @see acmm.impl.AcmmPackageImpl#getRequiredInterfaces()
		 * @generated
		 */
		EClass REQUIRED_INTERFACES = eINSTANCE.getRequiredInterfaces();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_INTERFACES__INTERFACE = eINSTANCE.getRequiredInterfaces_Interface();

		/**
		 * The meta object literal for the '{@link acmm.impl.WSDLSpecificationImpl <em>WSDL Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.WSDLSpecificationImpl
		 * @see acmm.impl.AcmmPackageImpl#getWSDLSpecification()
		 * @generated
		 */
		EClass WSDL_SPECIFICATION = eINSTANCE.getWSDLSpecification();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_SPECIFICATION__URI = eINSTANCE.getWSDLSpecification_Uri();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WSDL_SPECIFICATION__PORT_TYPE = eINSTANCE.getWSDLSpecification_PortType();

		/**
		 * The meta object literal for the '{@link acmm.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.OperationImpl
		 * @see acmm.impl.AcmmPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__INPUT = eINSTANCE.getOperation_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OUTPUT = eINSTANCE.getOperation_Output();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '{@link acmm.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.InputImpl
		 * @see acmm.impl.AcmmPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__ELEMENT = eINSTANCE.getInput_Element();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__NAME = eINSTANCE.getInput_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__TYPE = eINSTANCE.getInput_Type();

		/**
		 * The meta object literal for the '{@link acmm.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.OutputImpl
		 * @see acmm.impl.AcmmPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__ELEMENT = eINSTANCE.getOutput_Element();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__NAME = eINSTANCE.getOutput_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__TYPE = eINSTANCE.getOutput_Type();

		/**
		 * The meta object literal for the '{@link acmm.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.ElementImpl
		 * @see acmm.impl.AcmmPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TYPE = eINSTANCE.getElement_Type();

		/**
		 * The meta object literal for the '<em><b>Min Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__MIN_OCCURS = eINSTANCE.getElement_MinOccurs();

		/**
		 * The meta object literal for the '<em><b>Max Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__MAX_OCCURS = eINSTANCE.getElement_MaxOccurs();

		/**
		 * The meta object literal for the '{@link acmm.impl.InputElementImpl <em>Input Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.InputElementImpl
		 * @see acmm.impl.AcmmPackageImpl#getInputElement()
		 * @generated
		 */
		EClass INPUT_ELEMENT = eINSTANCE.getInputElement();

		/**
		 * The meta object literal for the '{@link acmm.impl.OutputElementImpl <em>Output Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.OutputElementImpl
		 * @see acmm.impl.AcmmPackageImpl#getOutputElement()
		 * @generated
		 */
		EClass OUTPUT_ELEMENT = eINSTANCE.getOutputElement();

		/**
		 * The meta object literal for the '{@link acmm.impl.PortTypeImpl <em>Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.impl.PortTypeImpl
		 * @see acmm.impl.AcmmPackageImpl#getPortType()
		 * @generated
		 */
		EClass PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__NAME = eINSTANCE.getPortType_Name();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_TYPE__OPERATION = eINSTANCE.getPortType_Operation();

		/**
		 * The meta object literal for the '{@link acmm.RepositoryType <em>Repository Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.RepositoryType
		 * @see acmm.impl.AcmmPackageImpl#getRepositoryType()
		 * @generated
		 */
		EEnum REPOSITORY_TYPE = eINSTANCE.getRepositoryType();

		/**
		 * The meta object literal for the '{@link acmm.PlatformType <em>Platform Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.PlatformType
		 * @see acmm.impl.AcmmPackageImpl#getPlatformType()
		 * @generated
		 */
		EEnum PLATFORM_TYPE = eINSTANCE.getPlatformType();

		/**
		 * The meta object literal for the '{@link acmm.PropertyID <em>Property ID</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.PropertyID
		 * @see acmm.impl.AcmmPackageImpl#getPropertyID()
		 * @generated
		 */
		EEnum PROPERTY_ID = eINSTANCE.getPropertyID();

		/**
		 * The meta object literal for the '{@link acmm.PropertyPriority <em>Property Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see acmm.PropertyPriority
		 * @see acmm.impl.AcmmPackageImpl#getPropertyPriority()
		 * @generated
		 */
		EEnum PROPERTY_PRIORITY = eINSTANCE.getPropertyPriority();

	}

} //AcmmPackage
