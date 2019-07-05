/**
 */
package ccmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ccmm.Location#getRepositoryID <em>Repository ID</em>}</li>
 *   <li>{@link ccmm.Location#getRepositoryType <em>Repository Type</em>}</li>
 *   <li>{@link ccmm.Location#getRepositoryURI <em>Repository URI</em>}</li>
 *   <li>{@link ccmm.Location#getComponentURI <em>Component URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see ccmm.CcmmPackage#getLocation()
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
	 * @see ccmm.CcmmPackage#getLocation_RepositoryID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='repositoryID'"
	 * @generated
	 */
	String getRepositoryID();

	/**
	 * Sets the value of the '{@link ccmm.Location#getRepositoryID <em>Repository ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository ID</em>' attribute.
	 * @see #getRepositoryID()
	 * @generated
	 */
	void setRepositoryID(String value);

	/**
	 * Returns the value of the '<em><b>Repository Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ccmm.RepositoryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Type</em>' attribute.
	 * @see ccmm.RepositoryType
	 * @see #setRepositoryType(RepositoryType)
	 * @see ccmm.CcmmPackage#getLocation_RepositoryType()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='repositoryType'"
	 * @generated
	 */
	RepositoryType getRepositoryType();

	/**
	 * Sets the value of the '{@link ccmm.Location#getRepositoryType <em>Repository Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Type</em>' attribute.
	 * @see ccmm.RepositoryType
	 * @see #getRepositoryType()
	 * @generated
	 */
	void setRepositoryType(RepositoryType value);

	/**
	 * Returns the value of the '<em><b>Repository URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository URI</em>' attribute.
	 * @see #setRepositoryURI(String)
	 * @see ccmm.CcmmPackage#getLocation_RepositoryURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='element' name='repositoryURI'"
	 * @generated
	 */
	String getRepositoryURI();

	/**
	 * Sets the value of the '{@link ccmm.Location#getRepositoryURI <em>Repository URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository URI</em>' attribute.
	 * @see #getRepositoryURI()
	 * @generated
	 */
	void setRepositoryURI(String value);

	/**
	 * Returns the value of the '<em><b>Component URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component URI</em>' attribute.
	 * @see #setComponentURI(String)
	 * @see ccmm.CcmmPackage#getLocation_ComponentURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='element' name='componentURI'"
	 * @generated
	 */
	String getComponentURI();

	/**
	 * Sets the value of the '{@link ccmm.Location#getComponentURI <em>Component URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component URI</em>' attribute.
	 * @see #getComponentURI()
	 * @generated
	 */
	void setComponentURI(String value);

} // Location
