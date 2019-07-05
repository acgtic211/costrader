/**
 */
package architectural_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link architectural_metamodel.Port#getPortID <em>Port ID</em>}</li>
 *   <li>{@link architectural_metamodel.Port#getCc <em>Cc</em>}</li>
 * </ul>
 * </p>
 *
 * @see architectural_metamodel.Architectural_metamodelPackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Port ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port ID</em>' attribute.
	 * @see #setPortID(String)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getPort_PortID()
	 * @model required="true"
	 * @generated
	 */
	String getPortID();

	/**
	 * Sets the value of the '{@link architectural_metamodel.Port#getPortID <em>Port ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port ID</em>' attribute.
	 * @see #getPortID()
	 * @generated
	 */
	void setPortID(String value);

	/**
	 * Returns the value of the '<em><b>Cc</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.ConcreteComponent#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc</em>' container reference.
	 * @see #setCc(ConcreteComponent)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getPort_Cc()
	 * @see architectural_metamodel.ConcreteComponent#getPort
	 * @model opposite="port" required="true" transient="false"
	 * @generated
	 */
	ConcreteComponent getCc();

	/**
	 * Sets the value of the '{@link architectural_metamodel.Port#getCc <em>Cc</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc</em>' container reference.
	 * @see #getCc()
	 * @generated
	 */
	void setCc(ConcreteComponent value);

} // Port
