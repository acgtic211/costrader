/**
 */
package ccmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ccmm.ComponentStructure#getFilesLanguage <em>Files Language</em>}</li>
 *   <li>{@link ccmm.ComponentStructure#getFilesAddress <em>Files Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see ccmm.CcmmPackage#getComponentStructure()
 * @model abstract="true"
 *        extendedMetaData="name='ComponentStructure' kind='elementOnly'"
 * @generated
 */
public interface ComponentStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Files Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files Language</em>' attribute.
	 * @see #setFilesLanguage(String)
	 * @see ccmm.CcmmPackage#getComponentStructure_FilesLanguage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='filesLanguage'"
	 * @generated
	 */
	String getFilesLanguage();

	/**
	 * Sets the value of the '{@link ccmm.ComponentStructure#getFilesLanguage <em>Files Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Files Language</em>' attribute.
	 * @see #getFilesLanguage()
	 * @generated
	 */
	void setFilesLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Files Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files Address</em>' attribute.
	 * @see #setFilesAddress(String)
	 * @see ccmm.CcmmPackage#getComponentStructure_FilesAddress()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='filesAddress'"
	 * @generated
	 */
	String getFilesAddress();

	/**
	 * Sets the value of the '{@link ccmm.ComponentStructure#getFilesAddress <em>Files Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Files Address</em>' attribute.
	 * @see #getFilesAddress()
	 * @generated
	 */
	void setFilesAddress(String value);

} // ComponentStructure
