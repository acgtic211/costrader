/**
 */
package ccmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Interfaces</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ccmm.ProvidedInterfaces#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see ccmm.CcmmPackage#getProvidedInterfaces()
 * @model
 * @generated
 */
public interface ProvidedInterfaces extends EObject {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link ccmm.ProvidedInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see ccmm.CcmmPackage#getProvidedInterfaces_Interface()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProvidedInterface> getInterface();

} // ProvidedInterfaces
