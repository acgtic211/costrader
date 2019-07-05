/**
 */
package ccmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marketing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ccmm.Marketing#getEntityID <em>Entity ID</em>}</li>
 *   <li>{@link ccmm.Marketing#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link ccmm.Marketing#getEntityDescription <em>Entity Description</em>}</li>
 *   <li>{@link ccmm.Marketing#getContacts <em>Contacts</em>}</li>
 * </ul>
 * </p>
 *
 * @see ccmm.CcmmPackage#getMarketing()
 * @model extendedMetaData="name='Marketing' kind='elementOnly'"
 * @generated
 */
public interface Marketing extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity ID</em>' attribute.
	 * @see #setEntityID(String)
	 * @see ccmm.CcmmPackage#getMarketing_EntityID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='entityID'"
	 * @generated
	 */
	String getEntityID();

	/**
	 * Sets the value of the '{@link ccmm.Marketing#getEntityID <em>Entity ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity ID</em>' attribute.
	 * @see #getEntityID()
	 * @generated
	 */
	void setEntityID(String value);

	/**
	 * Returns the value of the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Name</em>' attribute.
	 * @see #setEntityName(String)
	 * @see ccmm.CcmmPackage#getMarketing_EntityName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='entityName'"
	 * @generated
	 */
	String getEntityName();

	/**
	 * Sets the value of the '{@link ccmm.Marketing#getEntityName <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Name</em>' attribute.
	 * @see #getEntityName()
	 * @generated
	 */
	void setEntityName(String value);

	/**
	 * Returns the value of the '<em><b>Entity Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Description</em>' attribute.
	 * @see #setEntityDescription(String)
	 * @see ccmm.CcmmPackage#getMarketing_EntityDescription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='entityDescription'"
	 * @generated
	 */
	String getEntityDescription();

	/**
	 * Sets the value of the '{@link ccmm.Marketing#getEntityDescription <em>Entity Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Description</em>' attribute.
	 * @see #getEntityDescription()
	 * @generated
	 */
	void setEntityDescription(String value);

	/**
	 * Returns the value of the '<em><b>Contacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contacts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contacts</em>' containment reference.
	 * @see #setContacts(Contacts)
	 * @see ccmm.CcmmPackage#getMarketing_Contacts()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contacts'"
	 * @generated
	 */
	Contacts getContacts();

	/**
	 * Sets the value of the '{@link ccmm.Marketing#getContacts <em>Contacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contacts</em>' containment reference.
	 * @see #getContacts()
	 * @generated
	 */
	void setContacts(Contacts value);

} // Marketing
