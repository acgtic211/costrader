/**
 */
package ccmm;

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
 * @see ccmm.CcmmFactory
 * @model kind="package"
 * @generated
 */
public interface CcmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ccmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://acg.ual.es/definitions/concreteComponent/1.3.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ccmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CcmmPackage eINSTANCE = ccmm.impl.CcmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link ccmm.impl.ComponentStructureImpl <em>Component Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.ComponentStructureImpl
	 * @see ccmm.impl.CcmmPackageImpl#getComponentStructure()
	 * @generated
	 */
	int COMPONENT_STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Files Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STRUCTURE__FILES_LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Files Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STRUCTURE__FILES_ADDRESS = 1;

	/**
	 * The number of structural features of the '<em>Component Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ccmm.impl.ConcreteComponentSpecificationImpl <em>Concrete Component Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.ConcreteComponentSpecificationImpl
	 * @see ccmm.impl.CcmmPackageImpl#getConcreteComponentSpecification()
	 * @generated
	 */
	int CONCRETE_COMPONENT_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Component ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Abstract Component ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT_SPECIFICATION__ABSTRACT_COMPONENT_ID = 1;

	/**
	 * The feature id for the '<em><b>Component Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Functional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT_SPECIFICATION__FUNCTIONAL = 3;

	/**
	 * The feature id for the '<em><b>Extra Functional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT_SPECIFICATION__EXTRA_FUNCTIONAL = 4;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_NAME = 5;

	/**
	 * The feature id for the '<em><b>Packaging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT_SPECIFICATION__PACKAGING = 6;

	/**
	 * The feature id for the '<em><b>Marketing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT_SPECIFICATION__MARKETING = 7;

	/**
	 * The number of structural features of the '<em>Concrete Component Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT_SPECIFICATION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Concrete Component Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ccmm.impl.ContactImpl <em>Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.ContactImpl
	 * @see ccmm.impl.CcmmPackageImpl#getContact()
	 * @generated
	 */
	int CONTACT = 2;

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
	 * The meta object id for the '{@link ccmm.impl.ContactsImpl <em>Contacts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.ContactsImpl
	 * @see ccmm.impl.CcmmPackageImpl#getContacts()
	 * @generated
	 */
	int CONTACTS = 3;

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
	 * The meta object id for the '{@link ccmm.impl.ControllerInterfaceImpl <em>Controller Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.ControllerInterfaceImpl
	 * @see ccmm.impl.CcmmPackageImpl#getControllerInterface()
	 * @generated
	 */
	int CONTROLLER_INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Files Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INTERFACE__FILES_LANGUAGE = COMPONENT_STRUCTURE__FILES_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Files Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INTERFACE__FILES_ADDRESS = COMPONENT_STRUCTURE__FILES_ADDRESS;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INTERFACE__PROVIDED_INTERFACES = COMPONENT_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INTERFACE__REQUIRED_INTERFACES = COMPONENT_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Controller Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INTERFACE_FEATURE_COUNT = COMPONENT_STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Controller Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_INTERFACE_OPERATION_COUNT = COMPONENT_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccmm.impl.CoreContentImpl <em>Core Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.CoreContentImpl
	 * @see ccmm.impl.CcmmPackageImpl#getCoreContent()
	 * @generated
	 */
	int CORE_CONTENT = 5;

	/**
	 * The feature id for the '<em><b>Files Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_CONTENT__FILES_LANGUAGE = COMPONENT_STRUCTURE__FILES_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Files Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_CONTENT__FILES_ADDRESS = COMPONENT_STRUCTURE__FILES_ADDRESS;

	/**
	 * The number of structural features of the '<em>Core Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_CONTENT_FEATURE_COUNT = COMPONENT_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Core Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_CONTENT_OPERATION_COUNT = COMPONENT_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccmm.impl.FunctionalImpl <em>Functional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.FunctionalImpl
	 * @see ccmm.impl.CcmmPackageImpl#getFunctional()
	 * @generated
	 */
	int FUNCTIONAL = 6;

	/**
	 * The feature id for the '<em><b>Interaction Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__INTERACTION_CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Core Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__CORE_CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Controller Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__CONTROLLER_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Interaction Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__INTERACTION_INTERFACE = 3;

	/**
	 * The number of structural features of the '<em>Functional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Functional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ccmm.impl.ImplementationImpl <em>Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.ImplementationImpl
	 * @see ccmm.impl.CcmmPackageImpl#getImplementation()
	 * @generated
	 */
	int IMPLEMENTATION = 7;

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
	 * The meta object id for the '{@link ccmm.impl.InteractionContentImpl <em>Interaction Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.InteractionContentImpl
	 * @see ccmm.impl.CcmmPackageImpl#getInteractionContent()
	 * @generated
	 */
	int INTERACTION_CONTENT = 8;

	/**
	 * The feature id for the '<em><b>Files Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONTENT__FILES_LANGUAGE = COMPONENT_STRUCTURE__FILES_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Files Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONTENT__FILES_ADDRESS = COMPONENT_STRUCTURE__FILES_ADDRESS;

	/**
	 * The number of structural features of the '<em>Interaction Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONTENT_FEATURE_COUNT = COMPONENT_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interaction Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONTENT_OPERATION_COUNT = COMPONENT_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccmm.impl.InteractionInterfaceImpl <em>Interaction Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.InteractionInterfaceImpl
	 * @see ccmm.impl.CcmmPackageImpl#getInteractionInterface()
	 * @generated
	 */
	int INTERACTION_INTERFACE = 9;

	/**
	 * The feature id for the '<em><b>Files Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_INTERFACE__FILES_LANGUAGE = COMPONENT_STRUCTURE__FILES_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Files Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_INTERFACE__FILES_ADDRESS = COMPONENT_STRUCTURE__FILES_ADDRESS;

	/**
	 * The number of structural features of the '<em>Interaction Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_INTERFACE_FEATURE_COUNT = COMPONENT_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interaction Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_INTERFACE_OPERATION_COUNT = COMPONENT_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ccmm.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.LocationImpl
	 * @see ccmm.impl.CcmmPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 10;

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
	 * The feature id for the '<em><b>Repository URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__REPOSITORY_URI = 2;

	/**
	 * The feature id for the '<em><b>Component URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__COMPONENT_URI = 3;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ccmm.impl.MarketingImpl <em>Marketing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.MarketingImpl
	 * @see ccmm.impl.CcmmPackageImpl#getMarketing()
	 * @generated
	 */
	int MARKETING = 11;

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
	 * The meta object id for the '{@link ccmm.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.InterfaceImpl
	 * @see ccmm.impl.CcmmPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 12;

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
	 * The meta object id for the '{@link ccmm.impl.ProvidedInterfaceImpl <em>Provided Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.ProvidedInterfaceImpl
	 * @see ccmm.impl.CcmmPackageImpl#getProvidedInterface()
	 * @generated
	 */
	int PROVIDED_INTERFACE = 13;

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
	 * The meta object id for the '{@link ccmm.impl.RequiredInterfaceImpl <em>Required Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.RequiredInterfaceImpl
	 * @see ccmm.impl.CcmmPackageImpl#getRequiredInterface()
	 * @generated
	 */
	int REQUIRED_INTERFACE = 14;

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
	 * The meta object id for the '{@link ccmm.impl.ExtraFunctionalImpl <em>Extra Functional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.ExtraFunctionalImpl
	 * @see ccmm.impl.CcmmPackageImpl#getExtraFunctional()
	 * @generated
	 */
	int EXTRA_FUNCTIONAL = 15;

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
	 * The meta object id for the '{@link ccmm.impl.PackagingImpl <em>Packaging</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.PackagingImpl
	 * @see ccmm.impl.CcmmPackageImpl#getPackaging()
	 * @generated
	 */
	int PACKAGING = 16;

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
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGING__VERSION = 2;

	/**
	 * The number of structural features of the '<em>Packaging</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Packaging</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ccmm.impl.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.PropertiesImpl
	 * @see ccmm.impl.CcmmPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 17;

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
	 * The meta object id for the '{@link ccmm.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.VersionImpl
	 * @see ccmm.impl.CcmmPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 18;

	/**
	 * The feature id for the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__VERSION_ID = 0;

	/**
	 * The feature id for the '<em><b>Version Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__VERSION_DATE = 1;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ccmm.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.PropertyImpl
	 * @see ccmm.impl.CcmmPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 19;

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
	 * The feature id for the '<em><b>Is Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_EDITABLE = 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ccmm.impl.DependenciesImpl <em>Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.DependenciesImpl
	 * @see ccmm.impl.CcmmPackageImpl#getDependencies()
	 * @generated
	 */
	int DEPENDENCIES = 20;

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
	 * The meta object id for the '{@link ccmm.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.DependencyImpl
	 * @see ccmm.impl.CcmmPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 21;

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
	 * The meta object id for the '{@link ccmm.impl.ProvidedInterfacesImpl <em>Provided Interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.ProvidedInterfacesImpl
	 * @see ccmm.impl.CcmmPackageImpl#getProvidedInterfaces()
	 * @generated
	 */
	int PROVIDED_INTERFACES = 22;

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
	 * The meta object id for the '{@link ccmm.impl.RequiredInterfacesImpl <em>Required Interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.RequiredInterfacesImpl
	 * @see ccmm.impl.CcmmPackageImpl#getRequiredInterfaces()
	 * @generated
	 */
	int REQUIRED_INTERFACES = 23;

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
	 * The meta object id for the '{@link ccmm.impl.WSDLSpecificationImpl <em>WSDL Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.WSDLSpecificationImpl
	 * @see ccmm.impl.CcmmPackageImpl#getWSDLSpecification()
	 * @generated
	 */
	int WSDL_SPECIFICATION = 24;

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
	 * The meta object id for the '{@link ccmm.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.OperationImpl
	 * @see ccmm.impl.CcmmPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 25;

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
	 * The meta object id for the '{@link ccmm.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.InputImpl
	 * @see ccmm.impl.CcmmPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 26;

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
	 * The meta object id for the '{@link ccmm.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.OutputImpl
	 * @see ccmm.impl.CcmmPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 27;

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
	 * The meta object id for the '{@link ccmm.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.ElementImpl
	 * @see ccmm.impl.CcmmPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 28;

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
	 * The meta object id for the '{@link ccmm.impl.InputElementImpl <em>Input Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.InputElementImpl
	 * @see ccmm.impl.CcmmPackageImpl#getInputElement()
	 * @generated
	 */
	int INPUT_ELEMENT = 29;

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
	 * The meta object id for the '{@link ccmm.impl.OutputElementImpl <em>Output Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.OutputElementImpl
	 * @see ccmm.impl.CcmmPackageImpl#getOutputElement()
	 * @generated
	 */
	int OUTPUT_ELEMENT = 30;

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
	 * The meta object id for the '{@link ccmm.impl.PortTypeImpl <em>Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.impl.PortTypeImpl
	 * @see ccmm.impl.CcmmPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 31;

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
	 * The meta object id for the '{@link ccmm.RepositoryType <em>Repository Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.RepositoryType
	 * @see ccmm.impl.CcmmPackageImpl#getRepositoryType()
	 * @generated
	 */
	int REPOSITORY_TYPE = 32;

	/**
	 * The meta object id for the '{@link ccmm.PlatformType <em>Platform Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.PlatformType
	 * @see ccmm.impl.CcmmPackageImpl#getPlatformType()
	 * @generated
	 */
	int PLATFORM_TYPE = 33;

	/**
	 * The meta object id for the '{@link ccmm.PropertyID <em>Property ID</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ccmm.PropertyID
	 * @see ccmm.impl.CcmmPackageImpl#getPropertyID()
	 * @generated
	 */
	int PROPERTY_ID = 34;


	/**
	 * Returns the meta object for class '{@link ccmm.ComponentStructure <em>Component Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Structure</em>'.
	 * @see ccmm.ComponentStructure
	 * @generated
	 */
	EClass getComponentStructure();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.ComponentStructure#getFilesLanguage <em>Files Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Files Language</em>'.
	 * @see ccmm.ComponentStructure#getFilesLanguage()
	 * @see #getComponentStructure()
	 * @generated
	 */
	EAttribute getComponentStructure_FilesLanguage();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.ComponentStructure#getFilesAddress <em>Files Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Files Address</em>'.
	 * @see ccmm.ComponentStructure#getFilesAddress()
	 * @see #getComponentStructure()
	 * @generated
	 */
	EAttribute getComponentStructure_FilesAddress();

	/**
	 * Returns the meta object for class '{@link ccmm.ConcreteComponentSpecification <em>Concrete Component Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Component Specification</em>'.
	 * @see ccmm.ConcreteComponentSpecification
	 * @generated
	 */
	EClass getConcreteComponentSpecification();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.ConcreteComponentSpecification#getComponentID <em>Component ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component ID</em>'.
	 * @see ccmm.ConcreteComponentSpecification#getComponentID()
	 * @see #getConcreteComponentSpecification()
	 * @generated
	 */
	EAttribute getConcreteComponentSpecification_ComponentID();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.ConcreteComponentSpecification#getAbstractComponentID <em>Abstract Component ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Component ID</em>'.
	 * @see ccmm.ConcreteComponentSpecification#getAbstractComponentID()
	 * @see #getConcreteComponentSpecification()
	 * @generated
	 */
	EAttribute getConcreteComponentSpecification_AbstractComponentID();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.ConcreteComponentSpecification#getComponentDescription <em>Component Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Description</em>'.
	 * @see ccmm.ConcreteComponentSpecification#getComponentDescription()
	 * @see #getConcreteComponentSpecification()
	 * @generated
	 */
	EAttribute getConcreteComponentSpecification_ComponentDescription();

	/**
	 * Returns the meta object for the containment reference '{@link ccmm.ConcreteComponentSpecification#getFunctional <em>Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Functional</em>'.
	 * @see ccmm.ConcreteComponentSpecification#getFunctional()
	 * @see #getConcreteComponentSpecification()
	 * @generated
	 */
	EReference getConcreteComponentSpecification_Functional();

	/**
	 * Returns the meta object for the containment reference '{@link ccmm.ConcreteComponentSpecification#getExtraFunctional <em>Extra Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extra Functional</em>'.
	 * @see ccmm.ConcreteComponentSpecification#getExtraFunctional()
	 * @see #getConcreteComponentSpecification()
	 * @generated
	 */
	EReference getConcreteComponentSpecification_ExtraFunctional();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.ConcreteComponentSpecification#getComponentName <em>Component Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Name</em>'.
	 * @see ccmm.ConcreteComponentSpecification#getComponentName()
	 * @see #getConcreteComponentSpecification()
	 * @generated
	 */
	EAttribute getConcreteComponentSpecification_ComponentName();

	/**
	 * Returns the meta object for the containment reference '{@link ccmm.ConcreteComponentSpecification#getPackaging <em>Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Packaging</em>'.
	 * @see ccmm.ConcreteComponentSpecification#getPackaging()
	 * @see #getConcreteComponentSpecification()
	 * @generated
	 */
	EReference getConcreteComponentSpecification_Packaging();

	/**
	 * Returns the meta object for the containment reference '{@link ccmm.ConcreteComponentSpecification#getMarketing <em>Marketing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Marketing</em>'.
	 * @see ccmm.ConcreteComponentSpecification#getMarketing()
	 * @see #getConcreteComponentSpecification()
	 * @generated
	 */
	EReference getConcreteComponentSpecification_Marketing();

	/**
	 * Returns the meta object for class '{@link ccmm.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact</em>'.
	 * @see ccmm.Contact
	 * @generated
	 */
	EClass getContact();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Contact#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ccmm.Contact#getDescription()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Description();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Contact#getPersonName <em>Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Name</em>'.
	 * @see ccmm.Contact#getPersonName()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_PersonName();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Contact#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see ccmm.Contact#getEmail()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Email();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Contact#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see ccmm.Contact#getPhone()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Phone();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Contact#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see ccmm.Contact#getAddress()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Address();

	/**
	 * Returns the meta object for class '{@link ccmm.Contacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contacts</em>'.
	 * @see ccmm.Contacts
	 * @generated
	 */
	EClass getContacts();

	/**
	 * Returns the meta object for the containment reference list '{@link ccmm.Contacts#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contact</em>'.
	 * @see ccmm.Contacts#getContact()
	 * @see #getContacts()
	 * @generated
	 */
	EReference getContacts_Contact();

	/**
	 * Returns the meta object for class '{@link ccmm.ControllerInterface <em>Controller Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Interface</em>'.
	 * @see ccmm.ControllerInterface
	 * @generated
	 */
	EClass getControllerInterface();

	/**
	 * Returns the meta object for the containment reference '{@link ccmm.ControllerInterface#getProvidedInterfaces <em>Provided Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provided Interfaces</em>'.
	 * @see ccmm.ControllerInterface#getProvidedInterfaces()
	 * @see #getControllerInterface()
	 * @generated
	 */
	EReference getControllerInterface_ProvidedInterfaces();

	/**
	 * Returns the meta object for the containment reference '{@link ccmm.ControllerInterface#getRequiredInterfaces <em>Required Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Interfaces</em>'.
	 * @see ccmm.ControllerInterface#getRequiredInterfaces()
	 * @see #getControllerInterface()
	 * @generated
	 */
	EReference getControllerInterface_RequiredInterfaces();

	/**
	 * Returns the meta object for class '{@link ccmm.CoreContent <em>Core Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core Content</em>'.
	 * @see ccmm.CoreContent
	 * @generated
	 */
	EClass getCoreContent();

	/**
	 * Returns the meta object for class '{@link ccmm.Functional <em>Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional</em>'.
	 * @see ccmm.Functional
	 * @generated
	 */
	EClass getFunctional();

	/**
	 * Returns the meta object for the containment reference '{@link ccmm.Functional#getInteractionContent <em>Interaction Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interaction Content</em>'.
	 * @see ccmm.Functional#getInteractionContent()
	 * @see #getFunctional()
	 * @generated
	 */
	EReference getFunctional_InteractionContent();

	/**
	 * Returns the meta object for the containment reference '{@link ccmm.Functional#getCoreContent <em>Core Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Core Content</em>'.
	 * @see ccmm.Functional#getCoreContent()
	 * @see #getFunctional()
	 * @generated
	 */
	EReference getFunctional_CoreContent();

	/**
	 * Returns the meta object for the containment reference '{@link ccmm.Functional#getControllerInterface <em>Controller Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Controller Interface</em>'.
	 * @see ccmm.Functional#getControllerInterface()
	 * @see #getFunctional()
	 * @generated
	 */
	EReference getFunctional_ControllerInterface();

	/**
	 * Returns the meta object for the containment reference '{@link ccmm.Functional#getInteractionInterface <em>Interaction Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interaction Interface</em>'.
	 * @see ccmm.Functional#getInteractionInterface()
	 * @see #getFunctional()
	 * @generated
	 */
	EReference getFunctional_InteractionInterface();

	/**
	 * Returns the meta object for class '{@link ccmm.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation</em>'.
	 * @see ccmm.Implementation
	 * @generated
	 */
	EClass getImplementation();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Implementation#getProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Programming Language</em>'.
	 * @see ccmm.Implementation#getProgrammingLanguage()
	 * @see #getImplementation()
	 * @generated
	 */
	EAttribute getImplementation_ProgrammingLanguage();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Implementation#getPlatformType <em>Platform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform Type</em>'.
	 * @see ccmm.Implementation#getPlatformType()
	 * @see #getImplementation()
	 * @generated
	 */
	EAttribute getImplementation_PlatformType();

	/**
	 * Returns the meta object for class '{@link ccmm.InteractionContent <em>Interaction Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Content</em>'.
	 * @see ccmm.InteractionContent
	 * @generated
	 */
	EClass getInteractionContent();

	/**
	 * Returns the meta object for class '{@link ccmm.InteractionInterface <em>Interaction Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Interface</em>'.
	 * @see ccmm.InteractionInterface
	 * @generated
	 */
	EClass getInteractionInterface();

	/**
	 * Returns the meta object for class '{@link ccmm.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see ccmm.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Location#getRepositoryID <em>Repository ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository ID</em>'.
	 * @see ccmm.Location#getRepositoryID()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_RepositoryID();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Location#getRepositoryType <em>Repository Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository Type</em>'.
	 * @see ccmm.Location#getRepositoryType()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_RepositoryType();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Location#getRepositoryURI <em>Repository URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository URI</em>'.
	 * @see ccmm.Location#getRepositoryURI()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_RepositoryURI();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Location#getComponentURI <em>Component URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component URI</em>'.
	 * @see ccmm.Location#getComponentURI()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_ComponentURI();

	/**
	 * Returns the meta object for class '{@link ccmm.Marketing <em>Marketing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marketing</em>'.
	 * @see ccmm.Marketing
	 * @generated
	 */
	EClass getMarketing();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Marketing#getEntityID <em>Entity ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity ID</em>'.
	 * @see ccmm.Marketing#getEntityID()
	 * @see #getMarketing()
	 * @generated
	 */
	EAttribute getMarketing_EntityID();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Marketing#getEntityName <em>Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Name</em>'.
	 * @see ccmm.Marketing#getEntityName()
	 * @see #getMarketing()
	 * @generated
	 */
	EAttribute getMarketing_EntityName();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Marketing#getEntityDescription <em>Entity Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Description</em>'.
	 * @see ccmm.Marketing#getEntityDescription()
	 * @see #getMarketing()
	 * @generated
	 */
	EAttribute getMarketing_EntityDescription();

	/**
	 * Returns the meta object for the containment reference '{@link ccmm.Marketing#getContacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contacts</em>'.
	 * @see ccmm.Marketing#getContacts()
	 * @see #getMarketing()
	 * @generated
	 */
	EReference getMarketing_Contacts();

	/**
	 * Returns the meta object for class '{@link ccmm.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see ccmm.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Interface#getInterfaceID <em>Interface ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface ID</em>'.
	 * @see ccmm.Interface#getInterfaceID()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_InterfaceID();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Interface#getInterfaceDescription <em>Interface Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Description</em>'.
	 * @see ccmm.Interface#getInterfaceDescription()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_InterfaceDescription();

	/**
	 * Returns the meta object for the containment reference '{@link ccmm.Interface#getInterfaceSpecification <em>Interface Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface Specification</em>'.
	 * @see ccmm.Interface#getInterfaceSpecification()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_InterfaceSpecification();

	/**
	 * Returns the meta object for class '{@link ccmm.ProvidedInterface <em>Provided Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Interface</em>'.
	 * @see ccmm.ProvidedInterface
	 * @generated
	 */
	EClass getProvidedInterface();

	/**
	 * Returns the meta object for class '{@link ccmm.RequiredInterface <em>Required Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Interface</em>'.
	 * @see ccmm.RequiredInterface
	 * @generated
	 */
	EClass getRequiredInterface();

	/**
	 * Returns the meta object for class '{@link ccmm.ExtraFunctional <em>Extra Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extra Functional</em>'.
	 * @see ccmm.ExtraFunctional
	 * @generated
	 */
	EClass getExtraFunctional();

	/**
	 * Returns the meta object for the containment reference '{@link ccmm.ExtraFunctional#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see ccmm.ExtraFunctional#getProperties()
	 * @see #getExtraFunctional()
	 * @generated
	 */
	EReference getExtraFunctional_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link ccmm.ExtraFunctional#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see ccmm.ExtraFunctional#getDependencies()
	 * @see #getExtraFunctional()
	 * @generated
	 */
	EReference getExtraFunctional_Dependencies();

	/**
	 * Returns the meta object for class '{@link ccmm.Packaging <em>Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packaging</em>'.
	 * @see ccmm.Packaging
	 * @generated
	 */
	EClass getPackaging();

	/**
	 * Returns the meta object for the containment reference '{@link ccmm.Packaging#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see ccmm.Packaging#getLocation()
	 * @see #getPackaging()
	 * @generated
	 */
	EReference getPackaging_Location();

	/**
	 * Returns the meta object for the containment reference '{@link ccmm.Packaging#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation</em>'.
	 * @see ccmm.Packaging#getImplementation()
	 * @see #getPackaging()
	 * @generated
	 */
	EReference getPackaging_Implementation();

	/**
	 * Returns the meta object for the containment reference '{@link ccmm.Packaging#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see ccmm.Packaging#getVersion()
	 * @see #getPackaging()
	 * @generated
	 */
	EReference getPackaging_Version();

	/**
	 * Returns the meta object for class '{@link ccmm.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see ccmm.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link ccmm.Properties#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see ccmm.Properties#getProperty()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_Property();

	/**
	 * Returns the meta object for class '{@link ccmm.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see ccmm.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Version#getVersionID <em>Version ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version ID</em>'.
	 * @see ccmm.Version#getVersionID()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_VersionID();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Version#getVersionDate <em>Version Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Date</em>'.
	 * @see ccmm.Version#getVersionDate()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_VersionDate();

	/**
	 * Returns the meta object for class '{@link ccmm.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see ccmm.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Property#getPropertyID <em>Property ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property ID</em>'.
	 * @see ccmm.Property#getPropertyID()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_PropertyID();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Property#getPropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Value</em>'.
	 * @see ccmm.Property#getPropertyValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_PropertyValue();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Property#isIsEditable <em>Is Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Editable</em>'.
	 * @see ccmm.Property#isIsEditable()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsEditable();

	/**
	 * Returns the meta object for class '{@link ccmm.Dependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencies</em>'.
	 * @see ccmm.Dependencies
	 * @generated
	 */
	EClass getDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link ccmm.Dependencies#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency</em>'.
	 * @see ccmm.Dependencies#getDependency()
	 * @see #getDependencies()
	 * @generated
	 */
	EReference getDependencies_Dependency();

	/**
	 * Returns the meta object for class '{@link ccmm.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see ccmm.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Dependency#getInterfaceID <em>Interface ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface ID</em>'.
	 * @see ccmm.Dependency#getInterfaceID()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_InterfaceID();

	/**
	 * Returns the meta object for class '{@link ccmm.ProvidedInterfaces <em>Provided Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Interfaces</em>'.
	 * @see ccmm.ProvidedInterfaces
	 * @generated
	 */
	EClass getProvidedInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link ccmm.ProvidedInterfaces#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see ccmm.ProvidedInterfaces#getInterface()
	 * @see #getProvidedInterfaces()
	 * @generated
	 */
	EReference getProvidedInterfaces_Interface();

	/**
	 * Returns the meta object for class '{@link ccmm.RequiredInterfaces <em>Required Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Interfaces</em>'.
	 * @see ccmm.RequiredInterfaces
	 * @generated
	 */
	EClass getRequiredInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link ccmm.RequiredInterfaces#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see ccmm.RequiredInterfaces#getInterface()
	 * @see #getRequiredInterfaces()
	 * @generated
	 */
	EReference getRequiredInterfaces_Interface();

	/**
	 * Returns the meta object for class '{@link ccmm.WSDLSpecification <em>WSDL Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSDL Specification</em>'.
	 * @see ccmm.WSDLSpecification
	 * @generated
	 */
	EClass getWSDLSpecification();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.WSDLSpecification#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see ccmm.WSDLSpecification#getUri()
	 * @see #getWSDLSpecification()
	 * @generated
	 */
	EAttribute getWSDLSpecification_Uri();

	/**
	 * Returns the meta object for the containment reference '{@link ccmm.WSDLSpecification#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port Type</em>'.
	 * @see ccmm.WSDLSpecification#getPortType()
	 * @see #getWSDLSpecification()
	 * @generated
	 */
	EReference getWSDLSpecification_PortType();

	/**
	 * Returns the meta object for class '{@link ccmm.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see ccmm.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference '{@link ccmm.Operation#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see ccmm.Operation#getInput()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Input();

	/**
	 * Returns the meta object for the containment reference '{@link ccmm.Operation#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see ccmm.Operation#getOutput()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Output();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ccmm.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for class '{@link ccmm.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see ccmm.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the containment reference list '{@link ccmm.Input#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see ccmm.Input#getElement()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Element();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Input#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ccmm.Input#getName()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Name();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Input#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ccmm.Input#getType()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Type();

	/**
	 * Returns the meta object for class '{@link ccmm.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see ccmm.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the containment reference list '{@link ccmm.Output#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see ccmm.Output#getElement()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Element();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Output#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ccmm.Output#getName()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Name();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Output#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ccmm.Output#getType()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Type();

	/**
	 * Returns the meta object for class '{@link ccmm.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see ccmm.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ccmm.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Element#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ccmm.Element#getType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Element#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see ccmm.Element#getMinOccurs()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.Element#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see ccmm.Element#getMaxOccurs()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_MaxOccurs();

	/**
	 * Returns the meta object for class '{@link ccmm.InputElement <em>Input Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Element</em>'.
	 * @see ccmm.InputElement
	 * @generated
	 */
	EClass getInputElement();

	/**
	 * Returns the meta object for class '{@link ccmm.OutputElement <em>Output Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Element</em>'.
	 * @see ccmm.OutputElement
	 * @generated
	 */
	EClass getOutputElement();

	/**
	 * Returns the meta object for class '{@link ccmm.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type</em>'.
	 * @see ccmm.PortType
	 * @generated
	 */
	EClass getPortType();

	/**
	 * Returns the meta object for the attribute '{@link ccmm.PortType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ccmm.PortType#getName()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ccmm.PortType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see ccmm.PortType#getOperation()
	 * @see #getPortType()
	 * @generated
	 */
	EReference getPortType_Operation();

	/**
	 * Returns the meta object for enum '{@link ccmm.RepositoryType <em>Repository Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Repository Type</em>'.
	 * @see ccmm.RepositoryType
	 * @generated
	 */
	EEnum getRepositoryType();

	/**
	 * Returns the meta object for enum '{@link ccmm.PlatformType <em>Platform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Platform Type</em>'.
	 * @see ccmm.PlatformType
	 * @generated
	 */
	EEnum getPlatformType();

	/**
	 * Returns the meta object for enum '{@link ccmm.PropertyID <em>Property ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property ID</em>'.
	 * @see ccmm.PropertyID
	 * @generated
	 */
	EEnum getPropertyID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CcmmFactory getCcmmFactory();

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
		 * The meta object literal for the '{@link ccmm.impl.ComponentStructureImpl <em>Component Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.ComponentStructureImpl
		 * @see ccmm.impl.CcmmPackageImpl#getComponentStructure()
		 * @generated
		 */
		EClass COMPONENT_STRUCTURE = eINSTANCE.getComponentStructure();

		/**
		 * The meta object literal for the '<em><b>Files Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_STRUCTURE__FILES_LANGUAGE = eINSTANCE.getComponentStructure_FilesLanguage();

		/**
		 * The meta object literal for the '<em><b>Files Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_STRUCTURE__FILES_ADDRESS = eINSTANCE.getComponentStructure_FilesAddress();

		/**
		 * The meta object literal for the '{@link ccmm.impl.ConcreteComponentSpecificationImpl <em>Concrete Component Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.ConcreteComponentSpecificationImpl
		 * @see ccmm.impl.CcmmPackageImpl#getConcreteComponentSpecification()
		 * @generated
		 */
		EClass CONCRETE_COMPONENT_SPECIFICATION = eINSTANCE.getConcreteComponentSpecification();

		/**
		 * The meta object literal for the '<em><b>Component ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_ID = eINSTANCE.getConcreteComponentSpecification_ComponentID();

		/**
		 * The meta object literal for the '<em><b>Abstract Component ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_COMPONENT_SPECIFICATION__ABSTRACT_COMPONENT_ID = eINSTANCE.getConcreteComponentSpecification_AbstractComponentID();

		/**
		 * The meta object literal for the '<em><b>Component Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_DESCRIPTION = eINSTANCE.getConcreteComponentSpecification_ComponentDescription();

		/**
		 * The meta object literal for the '<em><b>Functional</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_COMPONENT_SPECIFICATION__FUNCTIONAL = eINSTANCE.getConcreteComponentSpecification_Functional();

		/**
		 * The meta object literal for the '<em><b>Extra Functional</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_COMPONENT_SPECIFICATION__EXTRA_FUNCTIONAL = eINSTANCE.getConcreteComponentSpecification_ExtraFunctional();

		/**
		 * The meta object literal for the '<em><b>Component Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_NAME = eINSTANCE.getConcreteComponentSpecification_ComponentName();

		/**
		 * The meta object literal for the '<em><b>Packaging</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_COMPONENT_SPECIFICATION__PACKAGING = eINSTANCE.getConcreteComponentSpecification_Packaging();

		/**
		 * The meta object literal for the '<em><b>Marketing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_COMPONENT_SPECIFICATION__MARKETING = eINSTANCE.getConcreteComponentSpecification_Marketing();

		/**
		 * The meta object literal for the '{@link ccmm.impl.ContactImpl <em>Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.ContactImpl
		 * @see ccmm.impl.CcmmPackageImpl#getContact()
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
		 * The meta object literal for the '{@link ccmm.impl.ContactsImpl <em>Contacts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.ContactsImpl
		 * @see ccmm.impl.CcmmPackageImpl#getContacts()
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
		 * The meta object literal for the '{@link ccmm.impl.ControllerInterfaceImpl <em>Controller Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.ControllerInterfaceImpl
		 * @see ccmm.impl.CcmmPackageImpl#getControllerInterface()
		 * @generated
		 */
		EClass CONTROLLER_INTERFACE = eINSTANCE.getControllerInterface();

		/**
		 * The meta object literal for the '<em><b>Provided Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_INTERFACE__PROVIDED_INTERFACES = eINSTANCE.getControllerInterface_ProvidedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Required Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_INTERFACE__REQUIRED_INTERFACES = eINSTANCE.getControllerInterface_RequiredInterfaces();

		/**
		 * The meta object literal for the '{@link ccmm.impl.CoreContentImpl <em>Core Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.CoreContentImpl
		 * @see ccmm.impl.CcmmPackageImpl#getCoreContent()
		 * @generated
		 */
		EClass CORE_CONTENT = eINSTANCE.getCoreContent();

		/**
		 * The meta object literal for the '{@link ccmm.impl.FunctionalImpl <em>Functional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.FunctionalImpl
		 * @see ccmm.impl.CcmmPackageImpl#getFunctional()
		 * @generated
		 */
		EClass FUNCTIONAL = eINSTANCE.getFunctional();

		/**
		 * The meta object literal for the '<em><b>Interaction Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL__INTERACTION_CONTENT = eINSTANCE.getFunctional_InteractionContent();

		/**
		 * The meta object literal for the '<em><b>Core Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL__CORE_CONTENT = eINSTANCE.getFunctional_CoreContent();

		/**
		 * The meta object literal for the '<em><b>Controller Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL__CONTROLLER_INTERFACE = eINSTANCE.getFunctional_ControllerInterface();

		/**
		 * The meta object literal for the '<em><b>Interaction Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL__INTERACTION_INTERFACE = eINSTANCE.getFunctional_InteractionInterface();

		/**
		 * The meta object literal for the '{@link ccmm.impl.ImplementationImpl <em>Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.ImplementationImpl
		 * @see ccmm.impl.CcmmPackageImpl#getImplementation()
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
		 * The meta object literal for the '{@link ccmm.impl.InteractionContentImpl <em>Interaction Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.InteractionContentImpl
		 * @see ccmm.impl.CcmmPackageImpl#getInteractionContent()
		 * @generated
		 */
		EClass INTERACTION_CONTENT = eINSTANCE.getInteractionContent();

		/**
		 * The meta object literal for the '{@link ccmm.impl.InteractionInterfaceImpl <em>Interaction Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.InteractionInterfaceImpl
		 * @see ccmm.impl.CcmmPackageImpl#getInteractionInterface()
		 * @generated
		 */
		EClass INTERACTION_INTERFACE = eINSTANCE.getInteractionInterface();

		/**
		 * The meta object literal for the '{@link ccmm.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.LocationImpl
		 * @see ccmm.impl.CcmmPackageImpl#getLocation()
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
		 * The meta object literal for the '<em><b>Repository URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__REPOSITORY_URI = eINSTANCE.getLocation_RepositoryURI();

		/**
		 * The meta object literal for the '<em><b>Component URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__COMPONENT_URI = eINSTANCE.getLocation_ComponentURI();

		/**
		 * The meta object literal for the '{@link ccmm.impl.MarketingImpl <em>Marketing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.MarketingImpl
		 * @see ccmm.impl.CcmmPackageImpl#getMarketing()
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
		 * The meta object literal for the '{@link ccmm.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.InterfaceImpl
		 * @see ccmm.impl.CcmmPackageImpl#getInterface()
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
		 * The meta object literal for the '{@link ccmm.impl.ProvidedInterfaceImpl <em>Provided Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.ProvidedInterfaceImpl
		 * @see ccmm.impl.CcmmPackageImpl#getProvidedInterface()
		 * @generated
		 */
		EClass PROVIDED_INTERFACE = eINSTANCE.getProvidedInterface();

		/**
		 * The meta object literal for the '{@link ccmm.impl.RequiredInterfaceImpl <em>Required Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.RequiredInterfaceImpl
		 * @see ccmm.impl.CcmmPackageImpl#getRequiredInterface()
		 * @generated
		 */
		EClass REQUIRED_INTERFACE = eINSTANCE.getRequiredInterface();

		/**
		 * The meta object literal for the '{@link ccmm.impl.ExtraFunctionalImpl <em>Extra Functional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.ExtraFunctionalImpl
		 * @see ccmm.impl.CcmmPackageImpl#getExtraFunctional()
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
		 * The meta object literal for the '{@link ccmm.impl.PackagingImpl <em>Packaging</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.PackagingImpl
		 * @see ccmm.impl.CcmmPackageImpl#getPackaging()
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
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGING__VERSION = eINSTANCE.getPackaging_Version();

		/**
		 * The meta object literal for the '{@link ccmm.impl.PropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.PropertiesImpl
		 * @see ccmm.impl.CcmmPackageImpl#getProperties()
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
		 * The meta object literal for the '{@link ccmm.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.VersionImpl
		 * @see ccmm.impl.CcmmPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Version ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__VERSION_ID = eINSTANCE.getVersion_VersionID();

		/**
		 * The meta object literal for the '<em><b>Version Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__VERSION_DATE = eINSTANCE.getVersion_VersionDate();

		/**
		 * The meta object literal for the '{@link ccmm.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.PropertyImpl
		 * @see ccmm.impl.CcmmPackageImpl#getProperty()
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
		 * The meta object literal for the '<em><b>Is Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_EDITABLE = eINSTANCE.getProperty_IsEditable();

		/**
		 * The meta object literal for the '{@link ccmm.impl.DependenciesImpl <em>Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.DependenciesImpl
		 * @see ccmm.impl.CcmmPackageImpl#getDependencies()
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
		 * The meta object literal for the '{@link ccmm.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.DependencyImpl
		 * @see ccmm.impl.CcmmPackageImpl#getDependency()
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
		 * The meta object literal for the '{@link ccmm.impl.ProvidedInterfacesImpl <em>Provided Interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.ProvidedInterfacesImpl
		 * @see ccmm.impl.CcmmPackageImpl#getProvidedInterfaces()
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
		 * The meta object literal for the '{@link ccmm.impl.RequiredInterfacesImpl <em>Required Interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.RequiredInterfacesImpl
		 * @see ccmm.impl.CcmmPackageImpl#getRequiredInterfaces()
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
		 * The meta object literal for the '{@link ccmm.impl.WSDLSpecificationImpl <em>WSDL Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.WSDLSpecificationImpl
		 * @see ccmm.impl.CcmmPackageImpl#getWSDLSpecification()
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
		 * The meta object literal for the '{@link ccmm.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.OperationImpl
		 * @see ccmm.impl.CcmmPackageImpl#getOperation()
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
		 * The meta object literal for the '{@link ccmm.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.InputImpl
		 * @see ccmm.impl.CcmmPackageImpl#getInput()
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
		 * The meta object literal for the '{@link ccmm.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.OutputImpl
		 * @see ccmm.impl.CcmmPackageImpl#getOutput()
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
		 * The meta object literal for the '{@link ccmm.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.ElementImpl
		 * @see ccmm.impl.CcmmPackageImpl#getElement()
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
		 * The meta object literal for the '{@link ccmm.impl.InputElementImpl <em>Input Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.InputElementImpl
		 * @see ccmm.impl.CcmmPackageImpl#getInputElement()
		 * @generated
		 */
		EClass INPUT_ELEMENT = eINSTANCE.getInputElement();

		/**
		 * The meta object literal for the '{@link ccmm.impl.OutputElementImpl <em>Output Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.OutputElementImpl
		 * @see ccmm.impl.CcmmPackageImpl#getOutputElement()
		 * @generated
		 */
		EClass OUTPUT_ELEMENT = eINSTANCE.getOutputElement();

		/**
		 * The meta object literal for the '{@link ccmm.impl.PortTypeImpl <em>Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.impl.PortTypeImpl
		 * @see ccmm.impl.CcmmPackageImpl#getPortType()
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
		 * The meta object literal for the '{@link ccmm.RepositoryType <em>Repository Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.RepositoryType
		 * @see ccmm.impl.CcmmPackageImpl#getRepositoryType()
		 * @generated
		 */
		EEnum REPOSITORY_TYPE = eINSTANCE.getRepositoryType();

		/**
		 * The meta object literal for the '{@link ccmm.PlatformType <em>Platform Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.PlatformType
		 * @see ccmm.impl.CcmmPackageImpl#getPlatformType()
		 * @generated
		 */
		EEnum PLATFORM_TYPE = eINSTANCE.getPlatformType();

		/**
		 * The meta object literal for the '{@link ccmm.PropertyID <em>Property ID</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ccmm.PropertyID
		 * @see ccmm.impl.CcmmPackageImpl#getPropertyID()
		 * @generated
		 */
		EEnum PROPERTY_ID = eINSTANCE.getPropertyID();

	}

} //CcmmPackage
