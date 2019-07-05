/**
 */
package ccmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ccmm.Interface#getInterfaceID <em>Interface ID</em>}</li>
 *   <li>{@link ccmm.Interface#getInterfaceDescription <em>Interface Description</em>}</li>
 *   <li>{@link ccmm.Interface#getInterfaceSpecification <em>Interface Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see ccmm.CcmmPackage#getInterface()
 * @model abstract="true"
 *        extendedMetaData="name='MessagePort' kind='elementOnly'"
 * @generated
 */
public interface Interface extends EObject {
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
	 * @see ccmm.CcmmPackage#getInterface_InterfaceID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getInterfaceID();

	/**
	 * Sets the value of the '{@link ccmm.Interface#getInterfaceID <em>Interface ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface ID</em>' attribute.
	 * @see #getInterfaceID()
	 * @generated
	 */
	void setInterfaceID(String value);

	/**
	 * Returns the value of the '<em><b>Interface Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Description</em>' attribute.
	 * @see #setInterfaceDescription(String)
	 * @see ccmm.CcmmPackage#getInterface_InterfaceDescription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getInterfaceDescription();

	/**
	 * Sets the value of the '{@link ccmm.Interface#getInterfaceDescription <em>Interface Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Description</em>' attribute.
	 * @see #getInterfaceDescription()
	 * @generated
	 */
	void setInterfaceDescription(String value);

	/**
	 * Returns the value of the '<em><b>Interface Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Specification</em>' containment reference.
	 * @see #setInterfaceSpecification(WSDLSpecification)
	 * @see ccmm.CcmmPackage#getInterface_InterfaceSpecification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	WSDLSpecification getInterfaceSpecification();

	/**
	 * Sets the value of the '{@link ccmm.Interface#getInterfaceSpecification <em>Interface Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Specification</em>' containment reference.
	 * @see #getInterfaceSpecification()
	 * @generated
	 */
	void setInterfaceSpecification(WSDLSpecification value);

} // Interface
