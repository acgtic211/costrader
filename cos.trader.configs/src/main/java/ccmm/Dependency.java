/**
 */
package ccmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ccmm.Dependency#getInterfaceID <em>Interface ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see ccmm.CcmmPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Interface ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface ID</em>' attribute.
	 * @see #setInterfaceID(String)
	 * @see ccmm.CcmmPackage#getDependency_InterfaceID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getInterfaceID();

	/**
	 * Sets the value of the '{@link ccmm.Dependency#getInterfaceID <em>Interface ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface ID</em>' attribute.
	 * @see #getInterfaceID()
	 * @generated
	 */
	void setInterfaceID(String value);

} // Dependency
