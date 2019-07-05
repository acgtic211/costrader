/**
 */
package acmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link acmm.Location#getRepositoryID <em>Repository ID</em>}</li>
 *   <li>{@link acmm.Location#getRepositoryType <em>Repository Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see acmm.AcmmPackage#getLocation()
 * @model extendedMetaData="name='Location' kind='elementOnly'"
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Repository ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository ID</em>' attribute.
	 * @see #setRepositoryID(String)
	 * @see acmm.AcmmPackage#getLocation_RepositoryID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='repositoryID'"
	 * @generated
	 */
	String getRepositoryID();

	/**
	 * Sets the value of the '{@link acmm.Location#getRepositoryID <em>Repository ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository ID</em>' attribute.
	 * @see #getRepositoryID()
	 * @generated
	 */
	void setRepositoryID(String value);

	/**
	 * Returns the value of the '<em><b>Repository Type</b></em>' attribute.
	 * The literals are from the enumeration {@link acmm.RepositoryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Type</em>' attribute.
	 * @see acmm.RepositoryType
	 * @see #setRepositoryType(RepositoryType)
	 * @see acmm.AcmmPackage#getLocation_RepositoryType()
	 * @model extendedMetaData="kind='element' name='repositoryType'"
	 * @generated
	 */
	RepositoryType getRepositoryType();

	/**
	 * Sets the value of the '{@link acmm.Location#getRepositoryType <em>Repository Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Type</em>' attribute.
	 * @see acmm.RepositoryType
	 * @see #getRepositoryType()
	 * @generated
	 */
	void setRepositoryType(RepositoryType value);

} // Location
