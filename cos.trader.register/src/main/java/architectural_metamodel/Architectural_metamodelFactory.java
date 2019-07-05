/**
 */
package architectural_metamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see architectural_metamodel.Architectural_metamodelPackage
 * @generated
 */
public interface Architectural_metamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Architectural_metamodelFactory eINSTANCE = architectural_metamodel.impl.Architectural_metamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Abstract Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Component</em>'.
	 * @generated
	 */
	AbstractComponent createAbstractComponent();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>Binary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary</em>'.
	 * @generated
	 */
	Binary createBinary();

	/**
	 * Returns a new object of class '<em>Nary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nary</em>'.
	 * @generated
	 */
	Nary createNary();

	/**
	 * Returns a new object of class '<em>Abstract Architectural Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Architectural Model</em>'.
	 * @generated
	 */
	AbstractArchitecturalModel createAbstractArchitecturalModel();

	/**
	 * Returns a new object of class '<em>Concrete Architectural Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Architectural Model</em>'.
	 * @generated
	 */
	ConcreteArchitecturalModel createConcreteArchitecturalModel();

	/**
	 * Returns a new object of class '<em>Concrete Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Component</em>'.
	 * @generated
	 */
	ConcreteComponent createConcreteComponent();

	/**
	 * Returns a new object of class '<em>Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Port</em>'.
	 * @generated
	 */
	InputPort createInputPort();

	/**
	 * Returns a new object of class '<em>Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Port</em>'.
	 * @generated
	 */
	OutputPort createOutputPort();

	/**
	 * Returns a new object of class '<em>Runtime Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Property</em>'.
	 * @generated
	 */
	RuntimeProperty createRuntimeProperty();

	/**
	 * Returns a new object of class '<em>Provided</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided</em>'.
	 * @generated
	 */
	Provided createProvided();

	/**
	 * Returns a new object of class '<em>Required</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required</em>'.
	 * @generated
	 */
	Required createRequired();

	/**
	 * Returns a new object of class '<em>Abstract Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Dependency</em>'.
	 * @generated
	 */
	AbstractDependency createAbstractDependency();

	/**
	 * Returns a new object of class '<em>Concrete Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Dependency</em>'.
	 * @generated
	 */
	ConcreteDependency createConcreteDependency();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Architectural_metamodelPackage getArchitectural_metamodelPackage();

} //Architectural_metamodelFactory
