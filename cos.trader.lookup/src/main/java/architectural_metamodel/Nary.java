/**
 */
package architectural_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link architectural_metamodel.Nary#getType <em>Type</em>}</li>
 *   <li>{@link architectural_metamodel.Nary#getBRelationship <em>BRelationship</em>}</li>
 * </ul>
 * </p>
 *
 * @see architectural_metamodel.Architectural_metamodelPackage#getNary()
 * @model
 * @generated
 */
public interface Nary extends Relationship {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link architectural_metamodel.NaryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see architectural_metamodel.NaryType
	 * @see #setType(NaryType)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getNary_Type()
	 * @model required="true"
	 * @generated
	 */
	NaryType getType();

	/**
	 * Sets the value of the '{@link architectural_metamodel.Nary#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see architectural_metamodel.NaryType
	 * @see #getType()
	 * @generated
	 */
	void setType(NaryType value);

	/**
	 * Returns the value of the '<em><b>BRelationship</b></em>' reference list.
	 * The list contents are of type {@link architectural_metamodel.Binary}.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.Binary#getNaryRelationship <em>Nary Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BRelationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BRelationship</em>' reference list.
	 * @see architectural_metamodel.Architectural_metamodelPackage#getNary_BRelationship()
	 * @see architectural_metamodel.Binary#getNaryRelationship
	 * @model opposite="naryRelationship" lower="2"
	 * @generated
	 */
	EList<Binary> getBRelationship();

} // Nary
