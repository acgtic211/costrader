/**
 */
package ccmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packaging</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ccmm.Packaging#getLocation <em>Location</em>}</li>
 *   <li>{@link ccmm.Packaging#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link ccmm.Packaging#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see ccmm.CcmmPackage#getPackaging()
 * @model extendedMetaData="name='Packaging' kind='elementOnly'"
 * @generated
 */
public interface Packaging extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see ccmm.CcmmPackage#getPackaging_Location()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='location'"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link ccmm.Packaging#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference.
	 * @see #setImplementation(Implementation)
	 * @see ccmm.CcmmPackage#getPackaging_Implementation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='implementation'"
	 * @generated
	 */
	Implementation getImplementation();

	/**
	 * Sets the value of the '{@link ccmm.Packaging#getImplementation <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' containment reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(Implementation value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(Version)
	 * @see ccmm.CcmmPackage#getPackaging_Version()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='version'"
	 * @generated
	 */
	Version getVersion();

	/**
	 * Sets the value of the '{@link ccmm.Packaging#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Version value);

} // Packaging
