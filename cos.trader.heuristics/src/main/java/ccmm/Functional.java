/**
 */
package ccmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ccmm.Functional#getInteractionContent <em>Interaction Content</em>}</li>
 *   <li>{@link ccmm.Functional#getCoreContent <em>Core Content</em>}</li>
 *   <li>{@link ccmm.Functional#getControllerInterface <em>Controller Interface</em>}</li>
 *   <li>{@link ccmm.Functional#getInteractionInterface <em>Interaction Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see ccmm.CcmmPackage#getFunctional()
 * @model extendedMetaData="name='Functional' kind='elementOnly'"
 * @generated
 */
public interface Functional extends EObject {
	/**
	 * Returns the value of the '<em><b>Interaction Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Content</em>' containment reference.
	 * @see #setInteractionContent(InteractionContent)
	 * @see ccmm.CcmmPackage#getFunctional_InteractionContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interactionContent'"
	 * @generated
	 */
	InteractionContent getInteractionContent();

	/**
	 * Sets the value of the '{@link ccmm.Functional#getInteractionContent <em>Interaction Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Content</em>' containment reference.
	 * @see #getInteractionContent()
	 * @generated
	 */
	void setInteractionContent(InteractionContent value);

	/**
	 * Returns the value of the '<em><b>Core Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Content</em>' containment reference.
	 * @see #setCoreContent(CoreContent)
	 * @see ccmm.CcmmPackage#getFunctional_CoreContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coreContent'"
	 * @generated
	 */
	CoreContent getCoreContent();

	/**
	 * Sets the value of the '{@link ccmm.Functional#getCoreContent <em>Core Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Content</em>' containment reference.
	 * @see #getCoreContent()
	 * @generated
	 */
	void setCoreContent(CoreContent value);

	/**
	 * Returns the value of the '<em><b>Controller Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Interface</em>' containment reference.
	 * @see #setControllerInterface(ControllerInterface)
	 * @see ccmm.CcmmPackage#getFunctional_ControllerInterface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controllerInterface'"
	 * @generated
	 */
	ControllerInterface getControllerInterface();

	/**
	 * Sets the value of the '{@link ccmm.Functional#getControllerInterface <em>Controller Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller Interface</em>' containment reference.
	 * @see #getControllerInterface()
	 * @generated
	 */
	void setControllerInterface(ControllerInterface value);

	/**
	 * Returns the value of the '<em><b>Interaction Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Interface</em>' containment reference.
	 * @see #setInteractionInterface(InteractionInterface)
	 * @see ccmm.CcmmPackage#getFunctional_InteractionInterface()
	 * @model containment="true"
	 * @generated
	 */
	InteractionInterface getInteractionInterface();

	/**
	 * Sets the value of the '{@link ccmm.Functional#getInteractionInterface <em>Interaction Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Interface</em>' containment reference.
	 * @see #getInteractionInterface()
	 * @generated
	 */
	void setInteractionInterface(InteractionInterface value);

} // Functional
