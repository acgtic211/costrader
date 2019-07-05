/**
 */
package architectural_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link architectural_metamodel.RuntimeProperty#getCc <em>Cc</em>}</li>
 *   <li>{@link architectural_metamodel.RuntimeProperty#getPropertyID <em>Property ID</em>}</li>
 *   <li>{@link architectural_metamodel.RuntimeProperty#getPropertyValue <em>Property Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see architectural_metamodel.Architectural_metamodelPackage#getRuntimeProperty()
 * @model
 * @generated
 */
public interface RuntimeProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Cc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.ConcreteComponent#getRuntimeProperty <em>Runtime Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc</em>' reference.
	 * @see #setCc(ConcreteComponent)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getRuntimeProperty_Cc()
	 * @see architectural_metamodel.ConcreteComponent#getRuntimeProperty
	 * @model opposite="runtimeProperty" required="true"
	 * @generated
	 */
	ConcreteComponent getCc();

	/**
	 * Sets the value of the '{@link architectural_metamodel.RuntimeProperty#getCc <em>Cc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc</em>' reference.
	 * @see #getCc()
	 * @generated
	 */
	void setCc(ConcreteComponent value);

	/**
	 * Returns the value of the '<em><b>Property ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property ID</em>' attribute.
	 * @see #setPropertyID(String)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getRuntimeProperty_PropertyID()
	 * @model required="true"
	 * @generated
	 */
	String getPropertyID();

	/**
	 * Sets the value of the '{@link architectural_metamodel.RuntimeProperty#getPropertyID <em>Property ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property ID</em>' attribute.
	 * @see #getPropertyID()
	 * @generated
	 */
	void setPropertyID(String value);

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
	 * @see architectural_metamodel.Architectural_metamodelPackage#getRuntimeProperty_PropertyValue()
	 * @model required="true"
	 * @generated
	 */
	String getPropertyValue();

	/**
	 * Sets the value of the '{@link architectural_metamodel.RuntimeProperty#getPropertyValue <em>Property Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Value</em>' attribute.
	 * @see #getPropertyValue()
	 * @generated
	 */
	void setPropertyValue(String value);

} // RuntimeProperty
