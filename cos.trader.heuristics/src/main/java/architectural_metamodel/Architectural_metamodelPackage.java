/**
 */
package architectural_metamodel;

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
 * @see architectural_metamodel.Architectural_metamodelFactory
 * @model kind="package"
 * @generated
 */
public interface Architectural_metamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "architectural_metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://architectural_metamodel/1.8";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "architectural_metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Architectural_metamodelPackage eINSTANCE = architectural_metamodel.impl.Architectural_metamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link architectural_metamodel.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architectural_metamodel.impl.AbstractComponentImpl
	 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getAbstractComponent()
	 * @generated
	 */
	int ABSTRACT_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Component ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__COMPONENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__COMPONENT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__COMPONENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Aam</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__AAM = 4;

	/**
	 * The feature id for the '<em><b>BSource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__BSOURCE = 5;

	/**
	 * The feature id for the '<em><b>BTarget</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__BTARGET = 6;

	/**
	 * The number of structural features of the '<em>Abstract Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Abstract Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architectural_metamodel.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architectural_metamodel.impl.PortImpl
	 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 1;

	/**
	 * The feature id for the '<em><b>Port ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PORT_ID = 0;

	/**
	 * The feature id for the '<em><b>Cc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CC = 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architectural_metamodel.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architectural_metamodel.impl.ConnectorImpl
	 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Connector ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONNECTOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEPENDENCY = 3;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architectural_metamodel.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architectural_metamodel.impl.RelationshipImpl
	 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Relationship ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELATIONSHIP_ID = 0;

	/**
	 * The feature id for the '<em><b>Aam</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__AAM = 1;

	/**
	 * The feature id for the '<em><b>Cam</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__CAM = 2;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architectural_metamodel.impl.BinaryImpl <em>Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architectural_metamodel.impl.BinaryImpl
	 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getBinary()
	 * @generated
	 */
	int BINARY = 4;

	/**
	 * The feature id for the '<em><b>Relationship ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__RELATIONSHIP_ID = RELATIONSHIP__RELATIONSHIP_ID;

	/**
	 * The feature id for the '<em><b>Aam</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__AAM = RELATIONSHIP__AAM;

	/**
	 * The feature id for the '<em><b>Cam</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__CAM = RELATIONSHIP__CAM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__TYPE = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__IS_BIDIRECTIONAL = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nary Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__NARY_RELATIONSHIP = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__SOURCE = RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__TARGET = RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__DEPENDENCY = RELATIONSHIP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architectural_metamodel.impl.NaryImpl <em>Nary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architectural_metamodel.impl.NaryImpl
	 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getNary()
	 * @generated
	 */
	int NARY = 5;

	/**
	 * The feature id for the '<em><b>Relationship ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY__RELATIONSHIP_ID = RELATIONSHIP__RELATIONSHIP_ID;

	/**
	 * The feature id for the '<em><b>Aam</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY__AAM = RELATIONSHIP__AAM;

	/**
	 * The feature id for the '<em><b>Cam</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY__CAM = RELATIONSHIP__CAM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY__TYPE = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>BRelationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY__BRELATIONSHIP = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Nary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Nary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architectural_metamodel.impl.AbstractArchitecturalModelImpl <em>Abstract Architectural Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architectural_metamodel.impl.AbstractArchitecturalModelImpl
	 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getAbstractArchitecturalModel()
	 * @generated
	 */
	int ABSTRACT_ARCHITECTURAL_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Abstract Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARCHITECTURAL_MODEL__ABSTRACT_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARCHITECTURAL_MODEL__RELATIONSHIP = 1;

	/**
	 * The feature id for the '<em><b>Aam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARCHITECTURAL_MODEL__AAM_ID = 2;

	/**
	 * The number of structural features of the '<em>Abstract Architectural Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARCHITECTURAL_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Abstract Architectural Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARCHITECTURAL_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architectural_metamodel.impl.ConcreteArchitecturalModelImpl <em>Concrete Architectural Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architectural_metamodel.impl.ConcreteArchitecturalModelImpl
	 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getConcreteArchitecturalModel()
	 * @generated
	 */
	int CONCRETE_ARCHITECTURAL_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Concrete Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ARCHITECTURAL_MODEL__CONCRETE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Aam</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ARCHITECTURAL_MODEL__AAM = 1;

	/**
	 * The feature id for the '<em><b>Cam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ARCHITECTURAL_MODEL__CAM_ID = 2;

	/**
	 * The feature id for the '<em><b>Aam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ARCHITECTURAL_MODEL__AAM_ID = 3;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ARCHITECTURAL_MODEL__RELATIONSHIP = 4;

	/**
	 * The number of structural features of the '<em>Concrete Architectural Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ARCHITECTURAL_MODEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Concrete Architectural Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ARCHITECTURAL_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architectural_metamodel.impl.ConcreteComponentImpl <em>Concrete Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architectural_metamodel.impl.ConcreteComponentImpl
	 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getConcreteComponent()
	 * @generated
	 */
	int CONCRETE_COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Component ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT__COMPONENT_ID = ABSTRACT_COMPONENT__COMPONENT_ID;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT__INTERFACE = ABSTRACT_COMPONENT__INTERFACE;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT__COMPONENT_NAME = ABSTRACT_COMPONENT__COMPONENT_NAME;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT__COMPONENT_TYPE = ABSTRACT_COMPONENT__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Aam</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT__AAM = ABSTRACT_COMPONENT__AAM;

	/**
	 * The feature id for the '<em><b>BSource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT__BSOURCE = ABSTRACT_COMPONENT__BSOURCE;

	/**
	 * The feature id for the '<em><b>BTarget</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT__BTARGET = ABSTRACT_COMPONENT__BTARGET;

	/**
	 * The feature id for the '<em><b>Cam</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT__CAM = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Runtime Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT__RUNTIME_PROPERTY = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT__PORT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Concrete Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Concrete Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_COMPONENT_OPERATION_COUNT = ABSTRACT_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architectural_metamodel.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architectural_metamodel.impl.InputPortImpl
	 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 9;

	/**
	 * The feature id for the '<em><b>Port ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__PORT_ID = PORT__PORT_ID;

	/**
	 * The feature id for the '<em><b>Cc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__CC = PORT__CC;

	/**
	 * The feature id for the '<em><b>CTarget</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__CTARGET = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architectural_metamodel.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architectural_metamodel.impl.OutputPortImpl
	 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 10;

	/**
	 * The feature id for the '<em><b>Port ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__PORT_ID = PORT__PORT_ID;

	/**
	 * The feature id for the '<em><b>Cc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__CC = PORT__CC;

	/**
	 * The feature id for the '<em><b>CSource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__CSOURCE = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architectural_metamodel.impl.RuntimePropertyImpl <em>Runtime Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architectural_metamodel.impl.RuntimePropertyImpl
	 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getRuntimeProperty()
	 * @generated
	 */
	int RUNTIME_PROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Cc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROPERTY__CC = 0;

	/**
	 * The feature id for the '<em><b>Property ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROPERTY__PROPERTY_ID = 1;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROPERTY__PROPERTY_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Runtime Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Runtime Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architectural_metamodel.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architectural_metamodel.impl.InterfaceImpl
	 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 12;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Interface ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__INTERFACE_ID = 1;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architectural_metamodel.impl.ProvidedImpl <em>Provided</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architectural_metamodel.impl.ProvidedImpl
	 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getProvided()
	 * @generated
	 */
	int PROVIDED = 13;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED__COMPONENT = INTERFACE__COMPONENT;

	/**
	 * The feature id for the '<em><b>Interface ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED__INTERFACE_ID = INTERFACE__INTERFACE_ID;

	/**
	 * The feature id for the '<em><b>DTarget</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED__DTARGET = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provided</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Provided</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architectural_metamodel.impl.RequiredImpl <em>Required</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architectural_metamodel.impl.RequiredImpl
	 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getRequired()
	 * @generated
	 */
	int REQUIRED = 14;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__COMPONENT = INTERFACE__COMPONENT;

	/**
	 * The feature id for the '<em><b>Interface ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__INTERFACE_ID = INTERFACE__INTERFACE_ID;

	/**
	 * The feature id for the '<em><b>DSource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__DSOURCE = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architectural_metamodel.impl.AbstractDependencyImpl <em>Abstract Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architectural_metamodel.impl.AbstractDependencyImpl
	 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getAbstractDependency()
	 * @generated
	 */
	int ABSTRACT_DEPENDENCY = 15;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPENDENCY__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>BRelationship</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPENDENCY__BRELATIONSHIP = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPENDENCY__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Dependency ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPENDENCY__DEPENDENCY_ID = 3;

	/**
	 * The number of structural features of the '<em>Abstract Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPENDENCY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Abstract Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architectural_metamodel.impl.ConcreteDependencyImpl <em>Concrete Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architectural_metamodel.impl.ConcreteDependencyImpl
	 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getConcreteDependency()
	 * @generated
	 */
	int CONCRETE_DEPENDENCY = 16;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_DEPENDENCY__SOURCE = ABSTRACT_DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>BRelationship</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_DEPENDENCY__BRELATIONSHIP = ABSTRACT_DEPENDENCY__BRELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_DEPENDENCY__TARGET = ABSTRACT_DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>Dependency ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_DEPENDENCY__DEPENDENCY_ID = ABSTRACT_DEPENDENCY__DEPENDENCY_ID;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_DEPENDENCY__CONNECTOR = ABSTRACT_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concrete Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_DEPENDENCY_FEATURE_COUNT = ABSTRACT_DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Concrete Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_DEPENDENCY_OPERATION_COUNT = ABSTRACT_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architectural_metamodel.BinaryType <em>Binary Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architectural_metamodel.BinaryType
	 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getBinaryType()
	 * @generated
	 */
	int BINARY_TYPE = 17;

	/**
	 * The meta object id for the '{@link architectural_metamodel.NaryType <em>Nary Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architectural_metamodel.NaryType
	 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getNaryType()
	 * @generated
	 */
	int NARY_TYPE = 18;

	/**
	 * The meta object id for the '{@link architectural_metamodel.ComponentType <em>Component Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architectural_metamodel.ComponentType
	 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 19;


	/**
	 * Returns the meta object for class '{@link architectural_metamodel.AbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component</em>'.
	 * @see architectural_metamodel.AbstractComponent
	 * @generated
	 */
	EClass getAbstractComponent();

	/**
	 * Returns the meta object for the attribute '{@link architectural_metamodel.AbstractComponent#getComponentID <em>Component ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component ID</em>'.
	 * @see architectural_metamodel.AbstractComponent#getComponentID()
	 * @see #getAbstractComponent()
	 * @generated
	 */
	EAttribute getAbstractComponent_ComponentID();

	/**
	 * Returns the meta object for the containment reference list '{@link architectural_metamodel.AbstractComponent#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see architectural_metamodel.AbstractComponent#getInterface()
	 * @see #getAbstractComponent()
	 * @generated
	 */
	EReference getAbstractComponent_Interface();

	/**
	 * Returns the meta object for the attribute '{@link architectural_metamodel.AbstractComponent#getComponentName <em>Component Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Name</em>'.
	 * @see architectural_metamodel.AbstractComponent#getComponentName()
	 * @see #getAbstractComponent()
	 * @generated
	 */
	EAttribute getAbstractComponent_ComponentName();

	/**
	 * Returns the meta object for the attribute '{@link architectural_metamodel.AbstractComponent#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Type</em>'.
	 * @see architectural_metamodel.AbstractComponent#getComponentType()
	 * @see #getAbstractComponent()
	 * @generated
	 */
	EAttribute getAbstractComponent_ComponentType();

	/**
	 * Returns the meta object for the container reference '{@link architectural_metamodel.AbstractComponent#getAam <em>Aam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aam</em>'.
	 * @see architectural_metamodel.AbstractComponent#getAam()
	 * @see #getAbstractComponent()
	 * @generated
	 */
	EReference getAbstractComponent_Aam();

	/**
	 * Returns the meta object for the reference list '{@link architectural_metamodel.AbstractComponent#getBSource <em>BSource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>BSource</em>'.
	 * @see architectural_metamodel.AbstractComponent#getBSource()
	 * @see #getAbstractComponent()
	 * @generated
	 */
	EReference getAbstractComponent_BSource();

	/**
	 * Returns the meta object for the reference list '{@link architectural_metamodel.AbstractComponent#getBTarget <em>BTarget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>BTarget</em>'.
	 * @see architectural_metamodel.AbstractComponent#getBTarget()
	 * @see #getAbstractComponent()
	 * @generated
	 */
	EReference getAbstractComponent_BTarget();

	/**
	 * Returns the meta object for class '{@link architectural_metamodel.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see architectural_metamodel.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link architectural_metamodel.Port#getPortID <em>Port ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port ID</em>'.
	 * @see architectural_metamodel.Port#getPortID()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_PortID();

	/**
	 * Returns the meta object for the container reference '{@link architectural_metamodel.Port#getCc <em>Cc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cc</em>'.
	 * @see architectural_metamodel.Port#getCc()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Cc();

	/**
	 * Returns the meta object for class '{@link architectural_metamodel.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see architectural_metamodel.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the attribute '{@link architectural_metamodel.Connector#getConnectorID <em>Connector ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector ID</em>'.
	 * @see architectural_metamodel.Connector#getConnectorID()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_ConnectorID();

	/**
	 * Returns the meta object for the reference '{@link architectural_metamodel.Connector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see architectural_metamodel.Connector#getTarget()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Target();

	/**
	 * Returns the meta object for the reference '{@link architectural_metamodel.Connector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see architectural_metamodel.Connector#getSource()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Source();

	/**
	 * Returns the meta object for the container reference '{@link architectural_metamodel.Connector#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dependency</em>'.
	 * @see architectural_metamodel.Connector#getDependency()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Dependency();

	/**
	 * Returns the meta object for class '{@link architectural_metamodel.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see architectural_metamodel.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link architectural_metamodel.Relationship#getRelationshipID <em>Relationship ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship ID</em>'.
	 * @see architectural_metamodel.Relationship#getRelationshipID()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_RelationshipID();

	/**
	 * Returns the meta object for the container reference '{@link architectural_metamodel.Relationship#getAam <em>Aam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aam</em>'.
	 * @see architectural_metamodel.Relationship#getAam()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Aam();

	/**
	 * Returns the meta object for the container reference '{@link architectural_metamodel.Relationship#getCam <em>Cam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cam</em>'.
	 * @see architectural_metamodel.Relationship#getCam()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Cam();

	/**
	 * Returns the meta object for class '{@link architectural_metamodel.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary</em>'.
	 * @see architectural_metamodel.Binary
	 * @generated
	 */
	EClass getBinary();

	/**
	 * Returns the meta object for the attribute '{@link architectural_metamodel.Binary#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see architectural_metamodel.Binary#getType()
	 * @see #getBinary()
	 * @generated
	 */
	EAttribute getBinary_Type();

	/**
	 * Returns the meta object for the attribute '{@link architectural_metamodel.Binary#isIsBidirectional <em>Is Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Bidirectional</em>'.
	 * @see architectural_metamodel.Binary#isIsBidirectional()
	 * @see #getBinary()
	 * @generated
	 */
	EAttribute getBinary_IsBidirectional();

	/**
	 * Returns the meta object for the reference '{@link architectural_metamodel.Binary#getNaryRelationship <em>Nary Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nary Relationship</em>'.
	 * @see architectural_metamodel.Binary#getNaryRelationship()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_NaryRelationship();

	/**
	 * Returns the meta object for the reference '{@link architectural_metamodel.Binary#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see architectural_metamodel.Binary#getSource()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_Source();

	/**
	 * Returns the meta object for the reference '{@link architectural_metamodel.Binary#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see architectural_metamodel.Binary#getTarget()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link architectural_metamodel.Binary#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency</em>'.
	 * @see architectural_metamodel.Binary#getDependency()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_Dependency();

	/**
	 * Returns the meta object for class '{@link architectural_metamodel.Nary <em>Nary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nary</em>'.
	 * @see architectural_metamodel.Nary
	 * @generated
	 */
	EClass getNary();

	/**
	 * Returns the meta object for the attribute '{@link architectural_metamodel.Nary#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see architectural_metamodel.Nary#getType()
	 * @see #getNary()
	 * @generated
	 */
	EAttribute getNary_Type();

	/**
	 * Returns the meta object for the reference list '{@link architectural_metamodel.Nary#getBRelationship <em>BRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>BRelationship</em>'.
	 * @see architectural_metamodel.Nary#getBRelationship()
	 * @see #getNary()
	 * @generated
	 */
	EReference getNary_BRelationship();

	/**
	 * Returns the meta object for class '{@link architectural_metamodel.AbstractArchitecturalModel <em>Abstract Architectural Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Architectural Model</em>'.
	 * @see architectural_metamodel.AbstractArchitecturalModel
	 * @generated
	 */
	EClass getAbstractArchitecturalModel();

	/**
	 * Returns the meta object for the containment reference list '{@link architectural_metamodel.AbstractArchitecturalModel#getAbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Component</em>'.
	 * @see architectural_metamodel.AbstractArchitecturalModel#getAbstractComponent()
	 * @see #getAbstractArchitecturalModel()
	 * @generated
	 */
	EReference getAbstractArchitecturalModel_AbstractComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link architectural_metamodel.AbstractArchitecturalModel#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship</em>'.
	 * @see architectural_metamodel.AbstractArchitecturalModel#getRelationship()
	 * @see #getAbstractArchitecturalModel()
	 * @generated
	 */
	EReference getAbstractArchitecturalModel_Relationship();

	/**
	 * Returns the meta object for the attribute '{@link architectural_metamodel.AbstractArchitecturalModel#getAamID <em>Aam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aam ID</em>'.
	 * @see architectural_metamodel.AbstractArchitecturalModel#getAamID()
	 * @see #getAbstractArchitecturalModel()
	 * @generated
	 */
	EAttribute getAbstractArchitecturalModel_AamID();

	/**
	 * Returns the meta object for class '{@link architectural_metamodel.ConcreteArchitecturalModel <em>Concrete Architectural Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Architectural Model</em>'.
	 * @see architectural_metamodel.ConcreteArchitecturalModel
	 * @generated
	 */
	EClass getConcreteArchitecturalModel();

	/**
	 * Returns the meta object for the containment reference list '{@link architectural_metamodel.ConcreteArchitecturalModel#getConcreteComponent <em>Concrete Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concrete Component</em>'.
	 * @see architectural_metamodel.ConcreteArchitecturalModel#getConcreteComponent()
	 * @see #getConcreteArchitecturalModel()
	 * @generated
	 */
	EReference getConcreteArchitecturalModel_ConcreteComponent();

	/**
	 * Returns the meta object for the reference '{@link architectural_metamodel.ConcreteArchitecturalModel#getAam <em>Aam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aam</em>'.
	 * @see architectural_metamodel.ConcreteArchitecturalModel#getAam()
	 * @see #getConcreteArchitecturalModel()
	 * @generated
	 */
	EReference getConcreteArchitecturalModel_Aam();

	/**
	 * Returns the meta object for the attribute '{@link architectural_metamodel.ConcreteArchitecturalModel#getCamID <em>Cam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cam ID</em>'.
	 * @see architectural_metamodel.ConcreteArchitecturalModel#getCamID()
	 * @see #getConcreteArchitecturalModel()
	 * @generated
	 */
	EAttribute getConcreteArchitecturalModel_CamID();

	/**
	 * Returns the meta object for the attribute '{@link architectural_metamodel.ConcreteArchitecturalModel#getAamID <em>Aam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aam ID</em>'.
	 * @see architectural_metamodel.ConcreteArchitecturalModel#getAamID()
	 * @see #getConcreteArchitecturalModel()
	 * @generated
	 */
	EAttribute getConcreteArchitecturalModel_AamID();

	/**
	 * Returns the meta object for the containment reference list '{@link architectural_metamodel.ConcreteArchitecturalModel#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship</em>'.
	 * @see architectural_metamodel.ConcreteArchitecturalModel#getRelationship()
	 * @see #getConcreteArchitecturalModel()
	 * @generated
	 */
	EReference getConcreteArchitecturalModel_Relationship();

	/**
	 * Returns the meta object for class '{@link architectural_metamodel.ConcreteComponent <em>Concrete Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Component</em>'.
	 * @see architectural_metamodel.ConcreteComponent
	 * @generated
	 */
	EClass getConcreteComponent();

	/**
	 * Returns the meta object for the container reference '{@link architectural_metamodel.ConcreteComponent#getCam <em>Cam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cam</em>'.
	 * @see architectural_metamodel.ConcreteComponent#getCam()
	 * @see #getConcreteComponent()
	 * @generated
	 */
	EReference getConcreteComponent_Cam();

	/**
	 * Returns the meta object for the reference list '{@link architectural_metamodel.ConcreteComponent#getRuntimeProperty <em>Runtime Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Runtime Property</em>'.
	 * @see architectural_metamodel.ConcreteComponent#getRuntimeProperty()
	 * @see #getConcreteComponent()
	 * @generated
	 */
	EReference getConcreteComponent_RuntimeProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link architectural_metamodel.ConcreteComponent#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see architectural_metamodel.ConcreteComponent#getPort()
	 * @see #getConcreteComponent()
	 * @generated
	 */
	EReference getConcreteComponent_Port();

	/**
	 * Returns the meta object for class '{@link architectural_metamodel.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see architectural_metamodel.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for the reference list '{@link architectural_metamodel.InputPort#getCTarget <em>CTarget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CTarget</em>'.
	 * @see architectural_metamodel.InputPort#getCTarget()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_CTarget();

	/**
	 * Returns the meta object for class '{@link architectural_metamodel.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see architectural_metamodel.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for the reference list '{@link architectural_metamodel.OutputPort#getCSource <em>CSource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CSource</em>'.
	 * @see architectural_metamodel.OutputPort#getCSource()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_CSource();

	/**
	 * Returns the meta object for class '{@link architectural_metamodel.RuntimeProperty <em>Runtime Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Property</em>'.
	 * @see architectural_metamodel.RuntimeProperty
	 * @generated
	 */
	EClass getRuntimeProperty();

	/**
	 * Returns the meta object for the reference '{@link architectural_metamodel.RuntimeProperty#getCc <em>Cc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cc</em>'.
	 * @see architectural_metamodel.RuntimeProperty#getCc()
	 * @see #getRuntimeProperty()
	 * @generated
	 */
	EReference getRuntimeProperty_Cc();

	/**
	 * Returns the meta object for the attribute '{@link architectural_metamodel.RuntimeProperty#getPropertyID <em>Property ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property ID</em>'.
	 * @see architectural_metamodel.RuntimeProperty#getPropertyID()
	 * @see #getRuntimeProperty()
	 * @generated
	 */
	EAttribute getRuntimeProperty_PropertyID();

	/**
	 * Returns the meta object for the attribute '{@link architectural_metamodel.RuntimeProperty#getPropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Value</em>'.
	 * @see architectural_metamodel.RuntimeProperty#getPropertyValue()
	 * @see #getRuntimeProperty()
	 * @generated
	 */
	EAttribute getRuntimeProperty_PropertyValue();

	/**
	 * Returns the meta object for class '{@link architectural_metamodel.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see architectural_metamodel.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the container reference '{@link architectural_metamodel.Interface#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see architectural_metamodel.Interface#getComponent()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Component();

	/**
	 * Returns the meta object for the attribute '{@link architectural_metamodel.Interface#getInterfaceID <em>Interface ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface ID</em>'.
	 * @see architectural_metamodel.Interface#getInterfaceID()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_InterfaceID();

	/**
	 * Returns the meta object for class '{@link architectural_metamodel.Provided <em>Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided</em>'.
	 * @see architectural_metamodel.Provided
	 * @generated
	 */
	EClass getProvided();

	/**
	 * Returns the meta object for the reference list '{@link architectural_metamodel.Provided#getDTarget <em>DTarget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>DTarget</em>'.
	 * @see architectural_metamodel.Provided#getDTarget()
	 * @see #getProvided()
	 * @generated
	 */
	EReference getProvided_DTarget();

	/**
	 * Returns the meta object for class '{@link architectural_metamodel.Required <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required</em>'.
	 * @see architectural_metamodel.Required
	 * @generated
	 */
	EClass getRequired();

	/**
	 * Returns the meta object for the reference list '{@link architectural_metamodel.Required#getDSource <em>DSource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>DSource</em>'.
	 * @see architectural_metamodel.Required#getDSource()
	 * @see #getRequired()
	 * @generated
	 */
	EReference getRequired_DSource();

	/**
	 * Returns the meta object for class '{@link architectural_metamodel.AbstractDependency <em>Abstract Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Dependency</em>'.
	 * @see architectural_metamodel.AbstractDependency
	 * @generated
	 */
	EClass getAbstractDependency();

	/**
	 * Returns the meta object for the reference '{@link architectural_metamodel.AbstractDependency#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see architectural_metamodel.AbstractDependency#getSource()
	 * @see #getAbstractDependency()
	 * @generated
	 */
	EReference getAbstractDependency_Source();

	/**
	 * Returns the meta object for the container reference '{@link architectural_metamodel.AbstractDependency#getBRelationship <em>BRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>BRelationship</em>'.
	 * @see architectural_metamodel.AbstractDependency#getBRelationship()
	 * @see #getAbstractDependency()
	 * @generated
	 */
	EReference getAbstractDependency_BRelationship();

	/**
	 * Returns the meta object for the reference '{@link architectural_metamodel.AbstractDependency#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see architectural_metamodel.AbstractDependency#getTarget()
	 * @see #getAbstractDependency()
	 * @generated
	 */
	EReference getAbstractDependency_Target();

	/**
	 * Returns the meta object for the attribute '{@link architectural_metamodel.AbstractDependency#getDependencyID <em>Dependency ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependency ID</em>'.
	 * @see architectural_metamodel.AbstractDependency#getDependencyID()
	 * @see #getAbstractDependency()
	 * @generated
	 */
	EAttribute getAbstractDependency_DependencyID();

	/**
	 * Returns the meta object for class '{@link architectural_metamodel.ConcreteDependency <em>Concrete Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Dependency</em>'.
	 * @see architectural_metamodel.ConcreteDependency
	 * @generated
	 */
	EClass getConcreteDependency();

	/**
	 * Returns the meta object for the containment reference list '{@link architectural_metamodel.ConcreteDependency#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see architectural_metamodel.ConcreteDependency#getConnector()
	 * @see #getConcreteDependency()
	 * @generated
	 */
	EReference getConcreteDependency_Connector();

	/**
	 * Returns the meta object for enum '{@link architectural_metamodel.BinaryType <em>Binary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Type</em>'.
	 * @see architectural_metamodel.BinaryType
	 * @generated
	 */
	EEnum getBinaryType();

	/**
	 * Returns the meta object for enum '{@link architectural_metamodel.NaryType <em>Nary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nary Type</em>'.
	 * @see architectural_metamodel.NaryType
	 * @generated
	 */
	EEnum getNaryType();

	/**
	 * Returns the meta object for enum '{@link architectural_metamodel.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Type</em>'.
	 * @see architectural_metamodel.ComponentType
	 * @generated
	 */
	EEnum getComponentType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Architectural_metamodelFactory getArchitectural_metamodelFactory();

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
		 * The meta object literal for the '{@link architectural_metamodel.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architectural_metamodel.impl.AbstractComponentImpl
		 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getAbstractComponent()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT = eINSTANCE.getAbstractComponent();

		/**
		 * The meta object literal for the '<em><b>Component ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMPONENT__COMPONENT_ID = eINSTANCE.getAbstractComponent_ComponentID();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT__INTERFACE = eINSTANCE.getAbstractComponent_Interface();

		/**
		 * The meta object literal for the '<em><b>Component Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMPONENT__COMPONENT_NAME = eINSTANCE.getAbstractComponent_ComponentName();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMPONENT__COMPONENT_TYPE = eINSTANCE.getAbstractComponent_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Aam</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT__AAM = eINSTANCE.getAbstractComponent_Aam();

		/**
		 * The meta object literal for the '<em><b>BSource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT__BSOURCE = eINSTANCE.getAbstractComponent_BSource();

		/**
		 * The meta object literal for the '<em><b>BTarget</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT__BTARGET = eINSTANCE.getAbstractComponent_BTarget();

		/**
		 * The meta object literal for the '{@link architectural_metamodel.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architectural_metamodel.impl.PortImpl
		 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Port ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__PORT_ID = eINSTANCE.getPort_PortID();

		/**
		 * The meta object literal for the '<em><b>Cc</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__CC = eINSTANCE.getPort_Cc();

		/**
		 * The meta object literal for the '{@link architectural_metamodel.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architectural_metamodel.impl.ConnectorImpl
		 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Connector ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__CONNECTOR_ID = eINSTANCE.getConnector_ConnectorID();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__TARGET = eINSTANCE.getConnector_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SOURCE = eINSTANCE.getConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__DEPENDENCY = eINSTANCE.getConnector_Dependency();

		/**
		 * The meta object literal for the '{@link architectural_metamodel.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architectural_metamodel.impl.RelationshipImpl
		 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Relationship ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__RELATIONSHIP_ID = eINSTANCE.getRelationship_RelationshipID();

		/**
		 * The meta object literal for the '<em><b>Aam</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__AAM = eINSTANCE.getRelationship_Aam();

		/**
		 * The meta object literal for the '<em><b>Cam</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__CAM = eINSTANCE.getRelationship_Cam();

		/**
		 * The meta object literal for the '{@link architectural_metamodel.impl.BinaryImpl <em>Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architectural_metamodel.impl.BinaryImpl
		 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getBinary()
		 * @generated
		 */
		EClass BINARY = eINSTANCE.getBinary();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY__TYPE = eINSTANCE.getBinary_Type();

		/**
		 * The meta object literal for the '<em><b>Is Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY__IS_BIDIRECTIONAL = eINSTANCE.getBinary_IsBidirectional();

		/**
		 * The meta object literal for the '<em><b>Nary Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__NARY_RELATIONSHIP = eINSTANCE.getBinary_NaryRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__SOURCE = eINSTANCE.getBinary_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__TARGET = eINSTANCE.getBinary_Target();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__DEPENDENCY = eINSTANCE.getBinary_Dependency();

		/**
		 * The meta object literal for the '{@link architectural_metamodel.impl.NaryImpl <em>Nary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architectural_metamodel.impl.NaryImpl
		 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getNary()
		 * @generated
		 */
		EClass NARY = eINSTANCE.getNary();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NARY__TYPE = eINSTANCE.getNary_Type();

		/**
		 * The meta object literal for the '<em><b>BRelationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NARY__BRELATIONSHIP = eINSTANCE.getNary_BRelationship();

		/**
		 * The meta object literal for the '{@link architectural_metamodel.impl.AbstractArchitecturalModelImpl <em>Abstract Architectural Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architectural_metamodel.impl.AbstractArchitecturalModelImpl
		 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getAbstractArchitecturalModel()
		 * @generated
		 */
		EClass ABSTRACT_ARCHITECTURAL_MODEL = eINSTANCE.getAbstractArchitecturalModel();

		/**
		 * The meta object literal for the '<em><b>Abstract Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ARCHITECTURAL_MODEL__ABSTRACT_COMPONENT = eINSTANCE.getAbstractArchitecturalModel_AbstractComponent();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ARCHITECTURAL_MODEL__RELATIONSHIP = eINSTANCE.getAbstractArchitecturalModel_Relationship();

		/**
		 * The meta object literal for the '<em><b>Aam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ARCHITECTURAL_MODEL__AAM_ID = eINSTANCE.getAbstractArchitecturalModel_AamID();

		/**
		 * The meta object literal for the '{@link architectural_metamodel.impl.ConcreteArchitecturalModelImpl <em>Concrete Architectural Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architectural_metamodel.impl.ConcreteArchitecturalModelImpl
		 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getConcreteArchitecturalModel()
		 * @generated
		 */
		EClass CONCRETE_ARCHITECTURAL_MODEL = eINSTANCE.getConcreteArchitecturalModel();

		/**
		 * The meta object literal for the '<em><b>Concrete Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_ARCHITECTURAL_MODEL__CONCRETE_COMPONENT = eINSTANCE.getConcreteArchitecturalModel_ConcreteComponent();

		/**
		 * The meta object literal for the '<em><b>Aam</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_ARCHITECTURAL_MODEL__AAM = eINSTANCE.getConcreteArchitecturalModel_Aam();

		/**
		 * The meta object literal for the '<em><b>Cam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_ARCHITECTURAL_MODEL__CAM_ID = eINSTANCE.getConcreteArchitecturalModel_CamID();

		/**
		 * The meta object literal for the '<em><b>Aam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_ARCHITECTURAL_MODEL__AAM_ID = eINSTANCE.getConcreteArchitecturalModel_AamID();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_ARCHITECTURAL_MODEL__RELATIONSHIP = eINSTANCE.getConcreteArchitecturalModel_Relationship();

		/**
		 * The meta object literal for the '{@link architectural_metamodel.impl.ConcreteComponentImpl <em>Concrete Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architectural_metamodel.impl.ConcreteComponentImpl
		 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getConcreteComponent()
		 * @generated
		 */
		EClass CONCRETE_COMPONENT = eINSTANCE.getConcreteComponent();

		/**
		 * The meta object literal for the '<em><b>Cam</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_COMPONENT__CAM = eINSTANCE.getConcreteComponent_Cam();

		/**
		 * The meta object literal for the '<em><b>Runtime Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_COMPONENT__RUNTIME_PROPERTY = eINSTANCE.getConcreteComponent_RuntimeProperty();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_COMPONENT__PORT = eINSTANCE.getConcreteComponent_Port();

		/**
		 * The meta object literal for the '{@link architectural_metamodel.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architectural_metamodel.impl.InputPortImpl
		 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '<em><b>CTarget</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__CTARGET = eINSTANCE.getInputPort_CTarget();

		/**
		 * The meta object literal for the '{@link architectural_metamodel.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architectural_metamodel.impl.OutputPortImpl
		 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '<em><b>CSource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__CSOURCE = eINSTANCE.getOutputPort_CSource();

		/**
		 * The meta object literal for the '{@link architectural_metamodel.impl.RuntimePropertyImpl <em>Runtime Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architectural_metamodel.impl.RuntimePropertyImpl
		 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getRuntimeProperty()
		 * @generated
		 */
		EClass RUNTIME_PROPERTY = eINSTANCE.getRuntimeProperty();

		/**
		 * The meta object literal for the '<em><b>Cc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_PROPERTY__CC = eINSTANCE.getRuntimeProperty_Cc();

		/**
		 * The meta object literal for the '<em><b>Property ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_PROPERTY__PROPERTY_ID = eINSTANCE.getRuntimeProperty_PropertyID();

		/**
		 * The meta object literal for the '<em><b>Property Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_PROPERTY__PROPERTY_VALUE = eINSTANCE.getRuntimeProperty_PropertyValue();

		/**
		 * The meta object literal for the '{@link architectural_metamodel.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architectural_metamodel.impl.InterfaceImpl
		 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__COMPONENT = eINSTANCE.getInterface_Component();

		/**
		 * The meta object literal for the '<em><b>Interface ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__INTERFACE_ID = eINSTANCE.getInterface_InterfaceID();

		/**
		 * The meta object literal for the '{@link architectural_metamodel.impl.ProvidedImpl <em>Provided</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architectural_metamodel.impl.ProvidedImpl
		 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getProvided()
		 * @generated
		 */
		EClass PROVIDED = eINSTANCE.getProvided();

		/**
		 * The meta object literal for the '<em><b>DTarget</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED__DTARGET = eINSTANCE.getProvided_DTarget();

		/**
		 * The meta object literal for the '{@link architectural_metamodel.impl.RequiredImpl <em>Required</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architectural_metamodel.impl.RequiredImpl
		 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getRequired()
		 * @generated
		 */
		EClass REQUIRED = eINSTANCE.getRequired();

		/**
		 * The meta object literal for the '<em><b>DSource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED__DSOURCE = eINSTANCE.getRequired_DSource();

		/**
		 * The meta object literal for the '{@link architectural_metamodel.impl.AbstractDependencyImpl <em>Abstract Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architectural_metamodel.impl.AbstractDependencyImpl
		 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getAbstractDependency()
		 * @generated
		 */
		EClass ABSTRACT_DEPENDENCY = eINSTANCE.getAbstractDependency();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_DEPENDENCY__SOURCE = eINSTANCE.getAbstractDependency_Source();

		/**
		 * The meta object literal for the '<em><b>BRelationship</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_DEPENDENCY__BRELATIONSHIP = eINSTANCE.getAbstractDependency_BRelationship();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_DEPENDENCY__TARGET = eINSTANCE.getAbstractDependency_Target();

		/**
		 * The meta object literal for the '<em><b>Dependency ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_DEPENDENCY__DEPENDENCY_ID = eINSTANCE.getAbstractDependency_DependencyID();

		/**
		 * The meta object literal for the '{@link architectural_metamodel.impl.ConcreteDependencyImpl <em>Concrete Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architectural_metamodel.impl.ConcreteDependencyImpl
		 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getConcreteDependency()
		 * @generated
		 */
		EClass CONCRETE_DEPENDENCY = eINSTANCE.getConcreteDependency();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_DEPENDENCY__CONNECTOR = eINSTANCE.getConcreteDependency_Connector();

		/**
		 * The meta object literal for the '{@link architectural_metamodel.BinaryType <em>Binary Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architectural_metamodel.BinaryType
		 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getBinaryType()
		 * @generated
		 */
		EEnum BINARY_TYPE = eINSTANCE.getBinaryType();

		/**
		 * The meta object literal for the '{@link architectural_metamodel.NaryType <em>Nary Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architectural_metamodel.NaryType
		 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getNaryType()
		 * @generated
		 */
		EEnum NARY_TYPE = eINSTANCE.getNaryType();

		/**
		 * The meta object literal for the '{@link architectural_metamodel.ComponentType <em>Component Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architectural_metamodel.ComponentType
		 * @see architectural_metamodel.impl.Architectural_metamodelPackageImpl#getComponentType()
		 * @generated
		 */
		EEnum COMPONENT_TYPE = eINSTANCE.getComponentType();

	}

} //Architectural_metamodelPackage
