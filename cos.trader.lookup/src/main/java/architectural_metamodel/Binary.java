/**
 */
package architectural_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link architectural_metamodel.Binary#getType <em>Type</em>}</li>
 *   <li>{@link architectural_metamodel.Binary#isIsBidirectional <em>Is Bidirectional</em>}</li>
 *   <li>{@link architectural_metamodel.Binary#getNaryRelationship <em>Nary Relationship</em>}</li>
 *   <li>{@link architectural_metamodel.Binary#getSource <em>Source</em>}</li>
 *   <li>{@link architectural_metamodel.Binary#getTarget <em>Target</em>}</li>
 *   <li>{@link architectural_metamodel.Binary#getDependency <em>Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @see architectural_metamodel.Architectural_metamodelPackage#getBinary()
 * @model
 * @generated
 */
public interface Binary extends Relationship {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link architectural_metamodel.BinaryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see architectural_metamodel.BinaryType
	 * @see #setType(BinaryType)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getBinary_Type()
	 * @model required="true"
	 * @generated
	 */
	BinaryType getType();

	/**
	 * Sets the value of the '{@link architectural_metamodel.Binary#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see architectural_metamodel.BinaryType
	 * @see #getType()
	 * @generated
	 */
	void setType(BinaryType value);

	/**
	 * Returns the value of the '<em><b>Is Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Bidirectional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Bidirectional</em>' attribute.
	 * @see #setIsBidirectional(boolean)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getBinary_IsBidirectional()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsBidirectional();

	/**
	 * Sets the value of the '{@link architectural_metamodel.Binary#isIsBidirectional <em>Is Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Bidirectional</em>' attribute.
	 * @see #isIsBidirectional()
	 * @generated
	 */
	void setIsBidirectional(boolean value);

	/**
	 * Returns the value of the '<em><b>Nary Relationship</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.Nary#getBRelationship <em>BRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nary Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nary Relationship</em>' reference.
	 * @see #setNaryRelationship(Nary)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getBinary_NaryRelationship()
	 * @see architectural_metamodel.Nary#getBRelationship
	 * @model opposite="bRelationship"
	 * @generated
	 */
	Nary getNaryRelationship();

	/**
	 * Sets the value of the '{@link architectural_metamodel.Binary#getNaryRelationship <em>Nary Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nary Relationship</em>' reference.
	 * @see #getNaryRelationship()
	 * @generated
	 */
	void setNaryRelationship(Nary value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.AbstractComponent#getBSource <em>BSource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(AbstractComponent)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getBinary_Source()
	 * @see architectural_metamodel.AbstractComponent#getBSource
	 * @model opposite="bSource" required="true"
	 * @generated
	 */
	AbstractComponent getSource();

	/**
	 * Sets the value of the '{@link architectural_metamodel.Binary#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AbstractComponent value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.AbstractComponent#getBTarget <em>BTarget</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AbstractComponent)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getBinary_Target()
	 * @see architectural_metamodel.AbstractComponent#getBTarget
	 * @model opposite="bTarget" required="true"
	 * @generated
	 */
	AbstractComponent getTarget();

	/**
	 * Sets the value of the '{@link architectural_metamodel.Binary#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AbstractComponent value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link architectural_metamodel.AbstractDependency}.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.AbstractDependency#getBRelationship <em>BRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference list.
	 * @see architectural_metamodel.Architectural_metamodelPackage#getBinary_Dependency()
	 * @see architectural_metamodel.AbstractDependency#getBRelationship
	 * @model opposite="bRelationship" containment="true" required="true"
	 * @generated
	 */
	EList<AbstractDependency> getDependency();

} // Binary
