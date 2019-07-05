/**
 */
package ccmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WSDL Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ccmm.WSDLSpecification#getUri <em>Uri</em>}</li>
 *   <li>{@link ccmm.WSDLSpecification#getPortType <em>Port Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ccmm.CcmmPackage#getWSDLSpecification()
 * @model
 * @generated
 */
public interface WSDLSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see ccmm.CcmmPackage#getWSDLSpecification_Uri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link ccmm.WSDLSpecification#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type</em>' containment reference.
	 * @see #setPortType(PortType)
	 * @see ccmm.CcmmPackage#getWSDLSpecification_PortType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PortType getPortType();

	/**
	 * Sets the value of the '{@link ccmm.WSDLSpecification#getPortType <em>Port Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type</em>' containment reference.
	 * @see #getPortType()
	 * @generated
	 */
	void setPortType(PortType value);

} // WSDLSpecification
