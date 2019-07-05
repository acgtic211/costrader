/**
 */
package ccmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ccmm.ControllerInterface#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link ccmm.ControllerInterface#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see ccmm.CcmmPackage#getControllerInterface()
 * @model extendedMetaData="name='ControllerInterface' kind='elementOnly'"
 * @generated
 */
public interface ControllerInterface extends ComponentStructure {
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
	 * @see ccmm.CcmmPackage#getControllerInterface_ProvidedInterfaces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProvidedInterfaces getProvidedInterfaces();

	/**
	 * Sets the value of the '{@link ccmm.ControllerInterface#getProvidedInterfaces <em>Provided Interfaces</em>}' containment reference.
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
	 * @see ccmm.CcmmPackage#getControllerInterface_RequiredInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	RequiredInterfaces getRequiredInterfaces();

	/**
	 * Sets the value of the '{@link ccmm.ControllerInterface#getRequiredInterfaces <em>Required Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Interfaces</em>' containment reference.
	 * @see #getRequiredInterfaces()
	 * @generated
	 */
	void setRequiredInterfaces(RequiredInterfaces value);

} // ControllerInterface
