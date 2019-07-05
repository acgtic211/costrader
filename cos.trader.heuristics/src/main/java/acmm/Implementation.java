/**
 */
package acmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link acmm.Implementation#getProgrammingLanguage <em>Programming Language</em>}</li>
 *   <li>{@link acmm.Implementation#getPlatformType <em>Platform Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see acmm.AcmmPackage#getImplementation()
 * @model extendedMetaData="name='Implementation' kind='elementOnly'"
 * @generated
 */
public interface Implementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Programming Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Programming Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programming Language</em>' attribute.
	 * @see #setProgrammingLanguage(String)
	 * @see acmm.AcmmPackage#getImplementation_ProgrammingLanguage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='programmingLanguage'"
	 * @generated
	 */
	String getProgrammingLanguage();

	/**
	 * Sets the value of the '{@link acmm.Implementation#getProgrammingLanguage <em>Programming Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programming Language</em>' attribute.
	 * @see #getProgrammingLanguage()
	 * @generated
	 */
	void setProgrammingLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Platform Type</b></em>' attribute.
	 * The literals are from the enumeration {@link acmm.PlatformType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Type</em>' attribute.
	 * @see acmm.PlatformType
	 * @see #setPlatformType(PlatformType)
	 * @see acmm.AcmmPackage#getImplementation_PlatformType()
	 * @model extendedMetaData="kind='element' name='platform'"
	 * @generated
	 */
	PlatformType getPlatformType();

	/**
	 * Sets the value of the '{@link acmm.Implementation#getPlatformType <em>Platform Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Type</em>' attribute.
	 * @see acmm.PlatformType
	 * @see #getPlatformType()
	 * @generated
	 */
	void setPlatformType(PlatformType value);

} // Implementation
