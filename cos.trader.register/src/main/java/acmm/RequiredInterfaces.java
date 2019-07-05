/**
 */
package acmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Interfaces</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link acmm.RequiredInterfaces#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see acmm.AcmmPackage#getRequiredInterfaces()
 * @model
 * @generated
 */
public interface RequiredInterfaces extends EObject {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link acmm.RequiredInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see acmm.AcmmPackage#getRequiredInterfaces_Interface()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredInterface> getInterface();

} // RequiredInterfaces
