/**
 */
package ccmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ccmm.Version#getVersionID <em>Version ID</em>}</li>
 *   <li>{@link ccmm.Version#getVersionDate <em>Version Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see ccmm.CcmmPackage#getVersion()
 * @model extendedMetaData="name='Version' kind='elementOnly'"
 * @generated
 */
public interface Version extends EObject {
	/**
	 * Returns the value of the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version ID</em>' attribute.
	 * @see #setVersionID(String)
	 * @see ccmm.CcmmPackage#getVersion_VersionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='versionName'"
	 * @generated
	 */
	String getVersionID();

	/**
	 * Sets the value of the '{@link ccmm.Version#getVersionID <em>Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version ID</em>' attribute.
	 * @see #getVersionID()
	 * @generated
	 */
	void setVersionID(String value);

	/**
	 * Returns the value of the '<em><b>Version Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Date</em>' attribute.
	 * @see #setVersionDate(String)
	 * @see ccmm.CcmmPackage#getVersion_VersionDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='versionDate'"
	 * @generated
	 */
	String getVersionDate();

	/**
	 * Sets the value of the '{@link ccmm.Version#getVersionDate <em>Version Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Date</em>' attribute.
	 * @see #getVersionDate()
	 * @generated
	 */
	void setVersionDate(String value);

} // Version
