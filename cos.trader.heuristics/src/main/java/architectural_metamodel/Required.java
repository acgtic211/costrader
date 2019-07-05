/**
 */
package architectural_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link architectural_metamodel.Required#getDSource <em>DSource</em>}</li>
 * </ul>
 * </p>
 *
 * @see architectural_metamodel.Architectural_metamodelPackage#getRequired()
 * @model
 * @generated
 */
public interface Required extends Interface {
	/**
	 * Returns the value of the '<em><b>DSource</b></em>' reference list.
	 * The list contents are of type {@link architectural_metamodel.AbstractDependency}.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.AbstractDependency#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSource</em>' reference list.
	 * @see architectural_metamodel.Architectural_metamodelPackage#getRequired_DSource()
	 * @see architectural_metamodel.AbstractDependency#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<AbstractDependency> getDSource();

} // Required
