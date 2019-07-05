/**
 */
package acmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link acmm.Functional#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link acmm.Functional#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see acmm.AcmmPackage#getFunctional()
 * @model extendedMetaData="name='Functional' kind='elementOnly'"
 * @generated
 */
public interface Functional extends EObject {
	/**
	 * Returns the value of the '<em><b>Provided Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Interfaces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interfaces</em>' containment reference.
	 * @see #setProvidedInterfaces(ProvidedInterfaces)
	 * @see acmm.AcmmPackage#getFunctional_ProvidedInterfaces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProvidedInterfaces getProvidedInterfaces();

	/**
	 * Sets the value of the '{@link acmm.Functional#getProvidedInterfaces <em>Provided Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Interfaces</em>' containment reference.
	 * @see #getProvidedInterfaces()
	 * @generated
	 */
	void setProvidedInterfaces(ProvidedInterfaces value);

	/**
	 * Returns the value of the '<em><b>Required Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Interfaces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interfaces</em>' containment reference.
	 * @see #setRequiredInterfaces(RequiredInterfaces)
	 * @see acmm.AcmmPackage#getFunctional_RequiredInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	RequiredInterfaces getRequiredInterfaces();

	/**
	 * Sets the value of the '{@link acmm.Functional#getRequiredInterfaces <em>Required Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Interfaces</em>' containment reference.
	 * @see #getRequiredInterfaces()
	 * @generated
	 */
	void setRequiredInterfaces(RequiredInterfaces value);

} // Functional
