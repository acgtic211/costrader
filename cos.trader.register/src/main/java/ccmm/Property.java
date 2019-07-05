/**
 */
package ccmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ccmm.Property#getPropertyID <em>Property ID</em>}</li>
 *   <li>{@link ccmm.Property#getPropertyValue <em>Property Value</em>}</li>
 *   <li>{@link ccmm.Property#isIsEditable <em>Is Editable</em>}</li>
 * </ul>
 * </p>
 *
 * @see ccmm.CcmmPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Property ID</b></em>' attribute.
	 * The literals are from the enumeration {@link ccmm.PropertyID}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property ID</em>' attribute.
	 * @see ccmm.PropertyID
	 * @see #setPropertyID(PropertyID)
	 * @see ccmm.CcmmPackage#getProperty_PropertyID()
	 * @model required="true"
	 * @generated
	 */
	PropertyID getPropertyID();

	/**
	 * Sets the value of the '{@link ccmm.Property#getPropertyID <em>Property ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property ID</em>' attribute.
	 * @see ccmm.PropertyID
	 * @see #getPropertyID()
	 * @generated
	 */
	void setPropertyID(PropertyID value);

	/**
	 * Returns the value of the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Value</em>' attribute.
	 * @see #setPropertyValue(String)
	 * @see ccmm.CcmmPackage#getProperty_PropertyValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getPropertyValue();

	/**
	 * Sets the value of the '{@link ccmm.Property#getPropertyValue <em>Property Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Value</em>' attribute.
	 * @see #getPropertyValue()
	 * @generated
	 */
	void setPropertyValue(String value);

	/**
	 * Returns the value of the '<em><b>Is Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Editable</em>' attribute.
	 * @see #setIsEditable(boolean)
	 * @see ccmm.CcmmPackage#getProperty_IsEditable()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIsEditable();

	/**
	 * Sets the value of the '{@link ccmm.Property#isIsEditable <em>Is Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Editable</em>' attribute.
	 * @see #isIsEditable()
	 * @generated
	 */
	void setIsEditable(boolean value);

} // Property
