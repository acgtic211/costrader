/**
 */
package architectural_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link architectural_metamodel.AbstractComponent#getComponentID <em>Component ID</em>}</li>
 *   <li>{@link architectural_metamodel.AbstractComponent#getInterface <em>Interface</em>}</li>
 *   <li>{@link architectural_metamodel.AbstractComponent#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link architectural_metamodel.AbstractComponent#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link architectural_metamodel.AbstractComponent#getAam <em>Aam</em>}</li>
 *   <li>{@link architectural_metamodel.AbstractComponent#getBSource <em>BSource</em>}</li>
 *   <li>{@link architectural_metamodel.AbstractComponent#getBTarget <em>BTarget</em>}</li>
 * </ul>
 * </p>
 *
 * @see architectural_metamodel.Architectural_metamodelPackage#getAbstractComponent()
 * @model
 * @generated
 */
public interface AbstractComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Component ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component ID</em>' attribute.
	 * @see #setComponentID(String)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getAbstractComponent_ComponentID()
	 * @model required="true"
	 * @generated
	 */
	String getComponentID();

	/**
	 * Sets the value of the '{@link architectural_metamodel.AbstractComponent#getComponentID <em>Component ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component ID</em>' attribute.
	 * @see #getComponentID()
	 * @generated
	 */
	void setComponentID(String value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link architectural_metamodel.Interface}.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.Interface#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see architectural_metamodel.Architectural_metamodelPackage#getAbstractComponent_Interface()
	 * @see architectural_metamodel.Interface#getComponent
	 * @model opposite="component" containment="true" required="true"
	 * @generated
	 */
	EList<Interface> getInterface();

	/**
	 * Returns the value of the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Name</em>' attribute.
	 * @see #setComponentName(String)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getAbstractComponent_ComponentName()
	 * @model
	 * @generated
	 */
	String getComponentName();

	/**
	 * Sets the value of the '{@link architectural_metamodel.AbstractComponent#getComponentName <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Name</em>' attribute.
	 * @see #getComponentName()
	 * @generated
	 */
	void setComponentName(String value);

	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' attribute.
	 * The literals are from the enumeration {@link architectural_metamodel.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' attribute.
	 * @see architectural_metamodel.ComponentType
	 * @see #setComponentType(ComponentType)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getAbstractComponent_ComponentType()
	 * @model required="true"
	 * @generated
	 */
	ComponentType getComponentType();

	/**
	 * Sets the value of the '{@link architectural_metamodel.AbstractComponent#getComponentType <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' attribute.
	 * @see architectural_metamodel.ComponentType
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Aam</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.AbstractArchitecturalModel#getAbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aam</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aam</em>' container reference.
	 * @see #setAam(AbstractArchitecturalModel)
	 * @see architectural_metamodel.Architectural_metamodelPackage#getAbstractComponent_Aam()
	 * @see architectural_metamodel.AbstractArchitecturalModel#getAbstractComponent
	 * @model opposite="abstractComponent" transient="false"
	 * @generated
	 */
	AbstractArchitecturalModel getAam();

	/**
	 * Sets the value of the '{@link architectural_metamodel.AbstractComponent#getAam <em>Aam</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aam</em>' container reference.
	 * @see #getAam()
	 * @generated
	 */
	void setAam(AbstractArchitecturalModel value);

	/**
	 * Returns the value of the '<em><b>BSource</b></em>' reference list.
	 * The list contents are of type {@link architectural_metamodel.Binary}.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.Binary#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BSource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BSource</em>' reference list.
	 * @see architectural_metamodel.Architectural_metamodelPackage#getAbstractComponent_BSource()
	 * @see architectural_metamodel.Binary#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Binary> getBSource();

	/**
	 * Returns the value of the '<em><b>BTarget</b></em>' reference list.
	 * The list contents are of type {@link architectural_metamodel.Binary}.
	 * It is bidirectional and its opposite is '{@link architectural_metamodel.Binary#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BTarget</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BTarget</em>' reference list.
	 * @see architectural_metamodel.Architectural_metamodelPackage#getAbstractComponent_BTarget()
	 * @see architectural_metamodel.Binary#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Binary> getBTarget();

} // AbstractComponent
