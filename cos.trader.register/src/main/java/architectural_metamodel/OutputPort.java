/**
 */
package architectural_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link architectural_metamodel.OutputPort#getCSource <em>CSource</em>}</li>
 * </ul>
 * </p>
 *
 * @see architectural_metamodel.Architectural_metamodelPackage#getOutputPort()
 * @model
 * @generated
 */
public interface OutputPort extends Port {
	/**
	 * Returns the value of the '<em><b>CSource</b></em>' reference list.
	 * The list contents are of type {@link architectural_metamodel.Connector}.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.Connector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSource</em>' reference list.
	 * @see architectural_metamodel.Architectural_metamodelPackage#getOutputPort_CSource()
	 * @see architectural_metamodel.Connector#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Connector> getCSource();

} // OutputPort
