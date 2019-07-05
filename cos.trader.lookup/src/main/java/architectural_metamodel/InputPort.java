/**
 */
package architectural_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link architectural_metamodel.InputPort#getCTarget <em>CTarget</em>}</li>
 * </ul>
 * </p>
 *
 * @see architectural_metamodel.Architectural_metamodelPackage#getInputPort()
 * @model
 * @generated
 */
public interface InputPort extends Port {
	/**
	 * Returns the value of the '<em><b>CTarget</b></em>' reference list.
	 * The list contents are of type {@link architectural_metamodel.Connector}.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.Connector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTarget</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTarget</em>' reference list.
	 * @see architectural_metamodel.Architectural_metamodelPackage#getInputPort_CTarget()
	 * @see architectural_metamodel.Connector#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Connector> getCTarget();

} // InputPort
