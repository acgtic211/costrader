/**
 */
package architectural_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link architectural_metamodel.Provided#getDTarget <em>DTarget</em>}</li>
 * </ul>
 * </p>
 *
 * @see architectural_metamodel.Architectural_metamodelPackage#getProvided()
 * @model
 * @generated
 */
public interface Provided extends Interface {
	/**
	 * Returns the value of the '<em><b>DTarget</b></em>' reference list.
	 * The list contents are of type {@link architectural_metamodel.AbstractDependency}.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.AbstractDependency#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DTarget</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DTarget</em>' reference list.
	 * @see architectural_metamodel.Architectural_metamodelPackage#getProvided_DTarget()
	 * @see architectural_metamodel.AbstractDependency#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<AbstractDependency> getDTarget();

} // Provided
