/**
 */
package acmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Component Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link acmm.AbstractComponentSpecification#getComponentID <em>Component ID</em>}</li>
 *   <li>{@link acmm.AbstractComponentSpecification#getComponentDescription <em>Component Description</em>}</li>
 *   <li>{@link acmm.AbstractComponentSpecification#getFunctional <em>Functional</em>}</li>
 *   <li>{@link acmm.AbstractComponentSpecification#getExtraFunctional <em>Extra Functional</em>}</li>
 *   <li>{@link acmm.AbstractComponentSpecification#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link acmm.AbstractComponentSpecification#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link acmm.AbstractComponentSpecification#getMarketing <em>Marketing</em>}</li>
 * </ul>
 * </p>
 *
 * @see acmm.AcmmPackage#getAbstractComponentSpecification()
 * @model extendedMetaData="name='AbstractComponent' kind='elementOnly'"
 * @generated
 */
public interface AbstractComponentSpecification extends EObject {
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
	 * @see acmm.AcmmPackage#getAbstractComponentSpecification_ComponentID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='componentID'"
	 * @generated
	 */
	String getComponentID();

	/**
	 * Sets the value of the '{@link acmm.AbstractComponentSpecification#getComponentID <em>Component ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component ID</em>' attribute.
	 * @see #getComponentID()
	 * @generated
	 */
	void setComponentID(String value);

	/**
	 * Returns the value of the '<em><b>Component Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Description</em>' attribute.
	 * @see #setComponentDescription(String)
	 * @see acmm.AcmmPackage#getAbstractComponentSpecification_ComponentDescription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='componentDescription'"
	 * @generated
	 */
	String getComponentDescription();

	/**
	 * Sets the value of the '{@link acmm.AbstractComponentSpecification#getComponentDescription <em>Component Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Description</em>' attribute.
	 * @see #getComponentDescription()
	 * @generated
	 */
	void setComponentDescription(String value);

	/**
	 * Returns the value of the '<em><b>Functional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional</em>' containment reference.
	 * @see #setFunctional(Functional)
	 * @see acmm.AcmmPackage#getAbstractComponentSpecification_Functional()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='functional'"
	 * @generated
	 */
	Functional getFunctional();

	/**
	 * Sets the value of the '{@link acmm.AbstractComponentSpecification#getFunctional <em>Functional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional</em>' containment reference.
	 * @see #getFunctional()
	 * @generated
	 */
	void setFunctional(Functional value);

	/**
	 * Returns the value of the '<em><b>Extra Functional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Functional</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Functional</em>' containment reference.
	 * @see #setExtraFunctional(ExtraFunctional)
	 * @see acmm.AcmmPackage#getAbstractComponentSpecification_ExtraFunctional()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nonFunctional'"
	 * @generated
	 */
	ExtraFunctional getExtraFunctional();

	/**
	 * Sets the value of the '{@link acmm.AbstractComponentSpecification#getExtraFunctional <em>Extra Functional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Functional</em>' containment reference.
	 * @see #getExtraFunctional()
	 * @generated
	 */
	void setExtraFunctional(ExtraFunctional value);

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
	 * @see acmm.AcmmPackage#getAbstractComponentSpecification_ComponentName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getComponentName();

	/**
	 * Sets the value of the '{@link acmm.AbstractComponentSpecification#getComponentName <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Name</em>' attribute.
	 * @see #getComponentName()
	 * @generated
	 */
	void setComponentName(String value);

	/**
	 * Returns the value of the '<em><b>Packaging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packaging</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packaging</em>' containment reference.
	 * @see #setPackaging(Packaging)
	 * @see acmm.AcmmPackage#getAbstractComponentSpecification_Packaging()
	 * @model containment="true"
	 * @generated
	 */
	Packaging getPackaging();

	/**
	 * Sets the value of the '{@link acmm.AbstractComponentSpecification#getPackaging <em>Packaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packaging</em>' containment reference.
	 * @see #getPackaging()
	 * @generated
	 */
	void setPackaging(Packaging value);

	/**
	 * Returns the value of the '<em><b>Marketing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marketing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marketing</em>' containment reference.
	 * @see #setMarketing(Marketing)
	 * @see acmm.AcmmPackage#getAbstractComponentSpecification_Marketing()
	 * @model containment="true"
	 * @generated
	 */
	Marketing getMarketing();

	/**
	 * Sets the value of the '{@link acmm.AbstractComponentSpecification#getMarketing <em>Marketing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marketing</em>' containment reference.
	 * @see #getMarketing()
	 * @generated
	 */
	void setMarketing(Marketing value);

} // AbstractComponentSpecification
