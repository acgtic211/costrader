/**
 */
package architectural_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link architectural_metamodel.Connector#getConnectorID <em>Connector ID</em>}</li>
 *   <li>{@link architectural_metamodel.Connector#getTarget <em>Target</em>}</li>
 *   <li>{@link architectural_metamodel.Connector#getSource <em>Source</em>}</li>
 *   <li>{@link architectural_metamodel.Connector#getDependency <em>Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @see architectural_metamodel.Architectural_metamodelPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector ID</em>' attribute.
	 * @see #setConnectorID(String)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getConnector_ConnectorID()
	 * @model required="true"
	 * @generated
	 */
	String getConnectorID();

	/**
	 * Sets the value of the '{@link architectural_metamodel.Connector#getConnectorID <em>Connector ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector ID</em>' attribute.
	 * @see #getConnectorID()
	 * @generated
	 */
	void setConnectorID(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.InputPort#getCTarget <em>CTarget</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(InputPort)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getConnector_Target()
	 * @see architectural_metamodel.InputPort#getCTarget
	 * @model opposite="cTarget" required="true"
	 * @generated
	 */
	InputPort getTarget();

	/**
	 * Sets the value of the '{@link architectural_metamodel.Connector#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InputPort value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.OutputPort#getCSource <em>CSource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(OutputPort)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getConnector_Source()
	 * @see architectural_metamodel.OutputPort#getCSource
	 * @model opposite="cSource" required="true"
	 * @generated
	 */
	OutputPort getSource();

	/**
	 * Sets the value of the '{@link architectural_metamodel.Connector#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OutputPort value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.ConcreteDependency#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' container reference.
	 * @see #setDependency(ConcreteDependency)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getConnector_Dependency()
	 * @see architectural_metamodel.ConcreteDependency#getConnector
	 * @model opposite="connector" required="true" transient="false"
	 * @generated
	 */
	ConcreteDependency getDependency();

	/**
	 * Sets the value of the '{@link architectural_metamodel.Connector#getDependency <em>Dependency</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency</em>' container reference.
	 * @see #getDependency()
	 * @generated
	 */
	void setDependency(ConcreteDependency value);

} // Connector
