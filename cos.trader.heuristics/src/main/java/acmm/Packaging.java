/**
 */
package acmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packaging</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link acmm.Packaging#getLocation <em>Location</em>}</li>
 *   <li>{@link acmm.Packaging#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see acmm.AcmmPackage#getPackaging()
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
	 * @see acmm.AcmmPackage#getPackaging_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location'"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link acmm.Packaging#getLocation <em>Location</em>}' containment reference.
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
	 * @see acmm.AcmmPackage#getPackaging_Implementation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='implementation'"
	 * @generated
	 */
	Implementation getImplementation();

	/**
	 * Sets the value of the '{@link acmm.Packaging#getImplementation <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' containment reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(Implementation value);

} // Packaging
