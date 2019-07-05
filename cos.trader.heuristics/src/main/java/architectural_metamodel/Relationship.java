/**
 */
package architectural_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link architectural_metamodel.Relationship#getRelationshipID <em>Relationship ID</em>}</li>
 *   <li>{@link architectural_metamodel.Relationship#getAam <em>Aam</em>}</li>
 *   <li>{@link architectural_metamodel.Relationship#getCam <em>Cam</em>}</li>
 * </ul>
 * </p>
 *
 * @see architectural_metamodel.Architectural_metamodelPackage#getRelationship()
 * @model abstract="true"
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Relationship ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship ID</em>' attribute.
	 * @see #setRelationshipID(String)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getRelationship_RelationshipID()
	 * @model required="true"
	 * @generated
	 */
	String getRelationshipID();

	/**
	 * Sets the value of the '{@link architectural_metamodel.Relationship#getRelationshipID <em>Relationship ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship ID</em>' attribute.
	 * @see #getRelationshipID()
	 * @generated
	 */
	void setRelationshipID(String value);

	/**
	 * Returns the value of the '<em><b>Aam</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.AbstractArchitecturalModel#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aam</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aam</em>' container reference.
	 * @see #setAam(AbstractArchitecturalModel)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getRelationship_Aam()
	 * @see architectural_metamodel.AbstractArchitecturalModel#getRelationship
	 * @model opposite="relationship" transient="false"
	 * @generated
	 */
	AbstractArchitecturalModel getAam();

	/**
	 * Sets the value of the '{@link architectural_metamodel.Relationship#getAam <em>Aam</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aam</em>' container reference.
	 * @see #getAam()
	 * @generated
	 */
	void setAam(AbstractArchitecturalModel value);

	/**
	 * Returns the value of the '<em><b>Cam</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.ConcreteArchitecturalModel#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cam</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cam</em>' container reference.
	 * @see #setCam(ConcreteArchitecturalModel)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getRelationship_Cam()
	 * @see architectural_metamodel.ConcreteArchitecturalModel#getRelationship
	 * @model opposite="relationship" transient="false"
	 * @generated
	 */
	ConcreteArchitecturalModel getCam();

	/**
	 * Sets the value of the '{@link architectural_metamodel.Relationship#getCam <em>Cam</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cam</em>' container reference.
	 * @see #getCam()
	 * @generated
	 */
	void setCam(ConcreteArchitecturalModel value);

} // Relationship
