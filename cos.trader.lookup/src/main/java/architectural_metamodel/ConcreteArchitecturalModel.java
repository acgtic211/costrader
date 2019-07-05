/**
 */
package architectural_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Architectural Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link architectural_metamodel.ConcreteArchitecturalModel#getConcreteComponent <em>Concrete Component</em>}</li>
 *   <li>{@link architectural_metamodel.ConcreteArchitecturalModel#getAam <em>Aam</em>}</li>
 *   <li>{@link architectural_metamodel.ConcreteArchitecturalModel#getCamID <em>Cam ID</em>}</li>
 *   <li>{@link architectural_metamodel.ConcreteArchitecturalModel#getAamID <em>Aam ID</em>}</li>
 *   <li>{@link architectural_metamodel.ConcreteArchitecturalModel#getRelationship <em>Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @see architectural_metamodel.Architectural_metamodelPackage#getConcreteArchitecturalModel()
 * @model
 * @generated
 */
public interface ConcreteArchitecturalModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Concrete Component</b></em>' containment reference list.
	 * The list contents are of type {@link architectural_metamodel.ConcreteComponent}.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.ConcreteComponent#getCam <em>Cam</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Component</em>' containment reference list.
	 * @see architectural_metamodel.Architectural_metamodelPackage#getConcreteArchitecturalModel_ConcreteComponent()
	 * @see architectural_metamodel.ConcreteComponent#getCam
	 * @model opposite="cam" containment="true"
	 * @generated
	 */
	EList<ConcreteComponent> getConcreteComponent();

	/**
	 * Returns the value of the '<em><b>Aam</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aam</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aam</em>' reference.
	 * @see #setAam(AbstractArchitecturalModel)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getConcreteArchitecturalModel_Aam()
	 * @model required="true"
	 * @generated
	 */
	AbstractArchitecturalModel getAam();

	/**
	 * Sets the value of the '{@link architectural_metamodel.ConcreteArchitecturalModel#getAam <em>Aam</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aam</em>' reference.
	 * @see #getAam()
	 * @generated
	 */
	void setAam(AbstractArchitecturalModel value);

	/**
	 * Returns the value of the '<em><b>Cam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cam ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cam ID</em>' attribute.
	 * @see #setCamID(String)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getConcreteArchitecturalModel_CamID()
	 * @model required="true"
	 * @generated
	 */
	String getCamID();

	/**
	 * Sets the value of the '{@link architectural_metamodel.ConcreteArchitecturalModel#getCamID <em>Cam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cam ID</em>' attribute.
	 * @see #getCamID()
	 * @generated
	 */
	void setCamID(String value);

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
	 * @see architectural_metamodel.Architectural_metamodelPackage#getConcreteArchitecturalModel_AamID()
	 * @model required="true"
	 * @generated
	 */
	String getAamID();

	/**
	 * Sets the value of the '{@link architectural_metamodel.ConcreteArchitecturalModel#getAamID <em>Aam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aam ID</em>' attribute.
	 * @see #getAamID()
	 * @generated
	 */
	void setAamID(String value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link architectural_metamodel.Relationship}.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.Relationship#getCam <em>Cam</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference list.
	 * @see architectural_metamodel.Architectural_metamodelPackage#getConcreteArchitecturalModel_Relationship()
	 * @see architectural_metamodel.Relationship#getCam
	 * @model opposite="cam" containment="true"
	 * @generated
	 */
	EList<Relationship> getRelationship();

} // ConcreteArchitecturalModel
