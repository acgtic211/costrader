/**
 */
package architectural_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link architectural_metamodel.AbstractDependency#getSource <em>Source</em>}</li>
 *   <li>{@link architectural_metamodel.AbstractDependency#getBRelationship <em>BRelationship</em>}</li>
 *   <li>{@link architectural_metamodel.AbstractDependency#getTarget <em>Target</em>}</li>
 *   <li>{@link architectural_metamodel.AbstractDependency#getDependencyID <em>Dependency ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see architectural_metamodel.Architectural_metamodelPackage#getAbstractDependency()
 * @model
 * @generated
 */
public interface AbstractDependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.Required#getDSource <em>DSource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Required)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getAbstractDependency_Source()
	 * @see architectural_metamodel.Required#getDSource
	 * @model opposite="dSource" required="true"
	 * @generated
	 */
	Required getSource();

	/**
	 * Sets the value of the '{@link architectural_metamodel.AbstractDependency#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Required value);

	/**
	 * Returns the value of the '<em><b>BRelationship</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.Binary#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BRelationship</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BRelationship</em>' container reference.
	 * @see #setBRelationship(Binary)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getAbstractDependency_BRelationship()
	 * @see architectural_metamodel.Binary#getDependency
	 * @model opposite="dependency" required="true" transient="false"
	 * @generated
	 */
	Binary getBRelationship();

	/**
	 * Sets the value of the '{@link architectural_metamodel.AbstractDependency#getBRelationship <em>BRelationship</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BRelationship</em>' container reference.
	 * @see #getBRelationship()
	 * @generated
	 */
	void setBRelationship(Binary value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.Provided#getDTarget <em>DTarget</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Provided)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getAbstractDependency_Target()
	 * @see architectural_metamodel.Provided#getDTarget
	 * @model opposite="dTarget" required="true"
	 * @generated
	 */
	Provided getTarget();

	/**
	 * Sets the value of the '{@link architectural_metamodel.AbstractDependency#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Provided value);

	/**
	 * Returns the value of the '<em><b>Dependency ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency ID</em>' attribute.
	 * @see #setDependencyID(String)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getAbstractDependency_DependencyID()
	 * @model required="true"
	 * @generated
	 */
	String getDependencyID();

	/**
	 * Sets the value of the '{@link architectural_metamodel.AbstractDependency#getDependencyID <em>Dependency ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency ID</em>' attribute.
	 * @see #getDependencyID()
	 * @generated
	 */
	void setDependencyID(String value);

} // AbstractDependency
