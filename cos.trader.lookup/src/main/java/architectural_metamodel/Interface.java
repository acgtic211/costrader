/**
 */
package architectural_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link architectural_metamodel.Interface#getComponent <em>Component</em>}</li>
 *   <li>{@link architectural_metamodel.Interface#getInterfaceID <em>Interface ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see architectural_metamodel.Architectural_metamodelPackage#getInterface()
 * @model abstract="true"
 * @generated
 */
public interface Interface extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.AbstractComponent#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(AbstractComponent)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getInterface_Component()
	 * @see architectural_metamodel.AbstractComponent#getInterface
	 * @model opposite="interface" transient="false"
	 * @generated
	 */
	AbstractComponent getComponent();

	/**
	 * Sets the value of the '{@link architectural_metamodel.Interface#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(AbstractComponent value);

	/**
	 * Returns the value of the '<em><b>Interface ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface ID</em>' attribute.
	 * @see #setInterfaceID(String)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getInterface_InterfaceID()
	 * @model required="true"
	 * @generated
	 */
	String getInterfaceID();

	/**
	 * Sets the value of the '{@link architectural_metamodel.Interface#getInterfaceID <em>Interface ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface ID</em>' attribute.
	 * @see #getInterfaceID()
	 * @generated
	 */
	void setInterfaceID(String value);

} // Interface
