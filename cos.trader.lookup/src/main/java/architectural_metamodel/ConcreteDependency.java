/**
 */
package architectural_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link architectural_metamodel.ConcreteDependency#getConnector <em>Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see architectural_metamodel.Architectural_metamodelPackage#getConcreteDependency()
 * @model
 * @generated
 */
public interface ConcreteDependency extends AbstractDependency {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link architectural_metamodel.Connector}.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.Connector#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see architectural_metamodel.Architectural_metamodelPackage#getConcreteDependency_Connector()
	 * @see architectural_metamodel.Connector#getDependency
	 * @model opposite="dependency" containment="true" required="true"
	 * @generated
	 */
	EList<Connector> getConnector();

} // ConcreteDependency
