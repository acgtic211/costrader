/**
 */
package architectural_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Architectural Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link architectural_metamodel.AbstractArchitecturalModel#getAbstractComponent <em>Abstract Component</em>}</li>
 *   <li>{@link architectural_metamodel.AbstractArchitecturalModel#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link architectural_metamodel.AbstractArchitecturalModel#getAamID <em>Aam ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see architectural_metamodel.Architectural_metamodelPackage#getAbstractArchitecturalModel()
 * @model
 * @generated
 */
public interface AbstractArchitecturalModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstract Component</b></em>' containment reference list.
	 * The list contents are of type {@link architectural_metamodel.AbstractComponent}.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.AbstractComponent#getAam <em>Aam</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Component</em>' containment reference list.
	 * @see architectural_metamodel.Architectural_metamodelPackage#getAbstractArchitecturalModel_AbstractComponent()
	 * @see architectural_metamodel.AbstractComponent#getAam
	 * @model opposite="aam" containment="true"
	 * @generated
	 */
	EList<AbstractComponent> getAbstractComponent();

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link architectural_metamodel.Relationship}.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.Relationship#getAam <em>Aam</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference list.
	 * @see architectural_metamodel.Architectural_metamodelPackage#getAbstractArchitecturalModel_Relationship()
	 * @see architectural_metamodel.Relationship#getAam
	 * @model opposite="aam" containment="true"
	 * @generated
	 */
	EList<Relationship> getRelationship();

	/**
	 * Returns the value of the '<em><b>Aam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aam ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aam ID</em>' attribute.
	 * @see #setAamID(String)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getAbstractArchitecturalModel_AamID()
	 * @model required="true"
	 * @generated
	 */
	String getAamID();

	/**
	 * Sets the value of the '{@link architectural_metamodel.AbstractArchitecturalModel#getAamID <em>Aam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aam ID</em>' attribute.
	 * @see #getAamID()
	 * @generated
	 */
	void setAamID(String value);

} // AbstractArchitecturalModel
