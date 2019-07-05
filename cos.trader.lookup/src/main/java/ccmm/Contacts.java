/**
 */
package ccmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contacts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ccmm.Contacts#getContact <em>Contact</em>}</li>
 * </ul>
 * </p>
 *
 * @see ccmm.CcmmPackage#getContacts()
 * @model extendedMetaData="name='Contacts' kind='elementOnly'"
 * @generated
 */
public interface Contacts extends EObject {
	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link ccmm.Contact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see ccmm.CcmmPackage#getContacts_Contact()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contact'"
	 * @generated
	 */
	EList<Contact> getContact();

} // Contacts
