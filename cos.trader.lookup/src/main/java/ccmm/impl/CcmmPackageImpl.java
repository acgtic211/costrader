/**
 */
package ccmm.impl;

import ccmm.CcmmFactory;
import ccmm.CcmmPackage;
import ccmm.ComponentStructure;
import ccmm.ConcreteComponentSpecification;
import ccmm.Contact;
import ccmm.Contacts;
import ccmm.ControllerInterface;
import ccmm.CoreContent;
import ccmm.Dependencies;
import ccmm.Dependency;
import ccmm.Element;
import ccmm.ExtraFunctional;
import ccmm.Functional;
import ccmm.Implementation;
import ccmm.Input;
import ccmm.InputElement;
import ccmm.InteractionContent;
import ccmm.InteractionInterface;
import ccmm.Interface;
import ccmm.Location;
import ccmm.Marketing;
import ccmm.Operation;
import ccmm.Output;
import ccmm.OutputElement;
import ccmm.Packaging;
import ccmm.PlatformType;
import ccmm.PortType;
import ccmm.Properties;
import ccmm.Property;
import ccmm.PropertyID;
import ccmm.ProvidedInterface;
import ccmm.ProvidedInterfaces;
import ccmm.RepositoryType;
import ccmm.RequiredInterface;
import ccmm.RequiredInterfaces;
import ccmm.Version;
import ccmm.WSDLSpecification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CcmmPackageImpl extends EPackageImpl implements CcmmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteComponentSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass marketingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extraFunctionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packagingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependenciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedInterfacesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredInterfacesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsdlSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum repositoryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum platformTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyIDEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ccmm.CcmmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CcmmPackageImpl() {
		super(eNS_URI, CcmmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CcmmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CcmmPackage init() {
		if (isInited) return (CcmmPackage)EPackage.Registry.INSTANCE.getEPackage(CcmmPackage.eNS_URI);

		// Obtain or create and register package
		CcmmPackageImpl theCcmmPackage = (CcmmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CcmmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CcmmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCcmmPackage.createPackageContents();

		// Initialize created meta-data
		theCcmmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCcmmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CcmmPackage.eNS_URI, theCcmmPackage);
		return theCcmmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentStructure() {
		return componentStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentStructure_FilesLanguage() {
		return (EAttribute)componentStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentStructure_FilesAddress() {
		return (EAttribute)componentStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteComponentSpecification() {
		return concreteComponentSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteComponentSpecification_ComponentID() {
		return (EAttribute)concreteComponentSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteComponentSpecification_AbstractComponentID() {
		return (EAttribute)concreteComponentSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteComponentSpecification_ComponentDescription() {
		return (EAttribute)concreteComponentSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteComponentSpecification_Functional() {
		return (EReference)concreteComponentSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteComponentSpecification_ExtraFunctional() {
		return (EReference)concreteComponentSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteComponentSpecification_ComponentName() {
		return (EAttribute)concreteComponentSpecificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteComponentSpecification_Packaging() {
		return (EReference)concreteComponentSpecificationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteComponentSpecification_Marketing() {
		return (EReference)concreteComponentSpecificationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContact() {
		return contactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Description() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_PersonName() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Email() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Phone() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Address() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContacts() {
		return contactsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContacts_Contact() {
		return (EReference)contactsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerInterface() {
		return controllerInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerInterface_ProvidedInterfaces() {
		return (EReference)controllerInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerInterface_RequiredInterfaces() {
		return (EReference)controllerInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoreContent() {
		return coreContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctional() {
		return functionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctional_InteractionContent() {
		return (EReference)functionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctional_CoreContent() {
		return (EReference)functionalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctional_ControllerInterface() {
		return (EReference)functionalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctional_InteractionInterface() {
		return (EReference)functionalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementation() {
		return implementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementation_ProgrammingLanguage() {
		return (EAttribute)implementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementation_PlatformType() {
		return (EAttribute)implementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionContent() {
		return interactionContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionInterface() {
		return interactionInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_RepositoryID() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_RepositoryType() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_RepositoryURI() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_ComponentURI() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarketing() {
		return marketingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarketing_EntityID() {
		return (EAttribute)marketingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarketing_EntityName() {
		return (EAttribute)marketingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarketing_EntityDescription() {
		return (EAttribute)marketingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarketing_Contacts() {
		return (EReference)marketingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_InterfaceID() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_InterfaceDescription() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_InterfaceSpecification() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedInterface() {
		return providedInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredInterface() {
		return requiredInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtraFunctional() {
		return extraFunctionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtraFunctional_Properties() {
		return (EReference)extraFunctionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtraFunctional_Dependencies() {
		return (EReference)extraFunctionalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackaging() {
		return packagingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackaging_Location() {
		return (EReference)packagingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackaging_Implementation() {
		return (EReference)packagingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackaging_Version() {
		return (EReference)packagingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperties() {
		return propertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperties_Property() {
		return (EReference)propertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_VersionID() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_VersionDate() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_PropertyID() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_PropertyValue() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsEditable() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependencies() {
		return dependenciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependencies_Dependency() {
		return (EReference)dependenciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependency_InterfaceID() {
		return (EAttribute)dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedInterfaces() {
		return providedInterfacesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedInterfaces_Interface() {
		return (EReference)providedInterfacesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredInterfaces() {
		return requiredInterfacesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredInterfaces_Interface() {
		return (EReference)requiredInterfacesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWSDLSpecification() {
		return wsdlSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWSDLSpecification_Uri() {
		return (EAttribute)wsdlSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWSDLSpecification_PortType() {
		return (EReference)wsdlSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Input() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Output() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Name() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_Element() {
		return (EReference)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Name() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Type() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutput_Element() {
		return (EReference)outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutput_Name() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutput_Type() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Type() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_MinOccurs() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_MaxOccurs() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputElement() {
		return inputElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputElement() {
		return outputElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortType() {
		return portTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortType_Name() {
		return (EAttribute)portTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortType_Operation() {
		return (EReference)portTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRepositoryType() {
		return repositoryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlatformType() {
		return platformTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyID() {
		return propertyIDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CcmmFactory getCcmmFactory() {
		return (CcmmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		componentStructureEClass = createEClass(COMPONENT_STRUCTURE);
		createEAttribute(componentStructureEClass, COMPONENT_STRUCTURE__FILES_LANGUAGE);
		createEAttribute(componentStructureEClass, COMPONENT_STRUCTURE__FILES_ADDRESS);

		concreteComponentSpecificationEClass = createEClass(CONCRETE_COMPONENT_SPECIFICATION);
		createEAttribute(concreteComponentSpecificationEClass, CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_ID);
		createEAttribute(concreteComponentSpecificationEClass, CONCRETE_COMPONENT_SPECIFICATION__ABSTRACT_COMPONENT_ID);
		createEAttribute(concreteComponentSpecificationEClass, CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_DESCRIPTION);
		createEReference(concreteComponentSpecificationEClass, CONCRETE_COMPONENT_SPECIFICATION__FUNCTIONAL);
		createEReference(concreteComponentSpecificationEClass, CONCRETE_COMPONENT_SPECIFICATION__EXTRA_FUNCTIONAL);
		createEAttribute(concreteComponentSpecificationEClass, CONCRETE_COMPONENT_SPECIFICATION__COMPONENT_NAME);
		createEReference(concreteComponentSpecificationEClass, CONCRETE_COMPONENT_SPECIFICATION__PACKAGING);
		createEReference(concreteComponentSpecificationEClass, CONCRETE_COMPONENT_SPECIFICATION__MARKETING);

		contactEClass = createEClass(CONTACT);
		createEAttribute(contactEClass, CONTACT__DESCRIPTION);
		createEAttribute(contactEClass, CONTACT__PERSON_NAME);
		createEAttribute(contactEClass, CONTACT__EMAIL);
		createEAttribute(contactEClass, CONTACT__PHONE);
		createEAttribute(contactEClass, CONTACT__ADDRESS);

		contactsEClass = createEClass(CONTACTS);
		createEReference(contactsEClass, CONTACTS__CONTACT);

		controllerInterfaceEClass = createEClass(CONTROLLER_INTERFACE);
		createEReference(controllerInterfaceEClass, CONTROLLER_INTERFACE__PROVIDED_INTERFACES);
		createEReference(controllerInterfaceEClass, CONTROLLER_INTERFACE__REQUIRED_INTERFACES);

		coreContentEClass = createEClass(CORE_CONTENT);

		functionalEClass = createEClass(FUNCTIONAL);
		createEReference(functionalEClass, FUNCTIONAL__INTERACTION_CONTENT);
		createEReference(functionalEClass, FUNCTIONAL__CORE_CONTENT);
		createEReference(functionalEClass, FUNCTIONAL__CONTROLLER_INTERFACE);
		createEReference(functionalEClass, FUNCTIONAL__INTERACTION_INTERFACE);

		implementationEClass = createEClass(IMPLEMENTATION);
		createEAttribute(implementationEClass, IMPLEMENTATION__PROGRAMMING_LANGUAGE);
		createEAttribute(implementationEClass, IMPLEMENTATION__PLATFORM_TYPE);

		interactionContentEClass = createEClass(INTERACTION_CONTENT);

		interactionInterfaceEClass = createEClass(INTERACTION_INTERFACE);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__REPOSITORY_ID);
		createEAttribute(locationEClass, LOCATION__REPOSITORY_TYPE);
		createEAttribute(locationEClass, LOCATION__REPOSITORY_URI);
		createEAttribute(locationEClass, LOCATION__COMPONENT_URI);

		marketingEClass = createEClass(MARKETING);
		createEAttribute(marketingEClass, MARKETING__ENTITY_ID);
		createEAttribute(marketingEClass, MARKETING__ENTITY_NAME);
		createEAttribute(marketingEClass, MARKETING__ENTITY_DESCRIPTION);
		createEReference(marketingEClass, MARKETING__CONTACTS);

		interfaceEClass = createEClass(INTERFACE);
		createEAttribute(interfaceEClass, INTERFACE__INTERFACE_ID);
		createEAttribute(interfaceEClass, INTERFACE__INTERFACE_DESCRIPTION);
		createEReference(interfaceEClass, INTERFACE__INTERFACE_SPECIFICATION);

		providedInterfaceEClass = createEClass(PROVIDED_INTERFACE);

		requiredInterfaceEClass = createEClass(REQUIRED_INTERFACE);

		extraFunctionalEClass = createEClass(EXTRA_FUNCTIONAL);
		createEReference(extraFunctionalEClass, EXTRA_FUNCTIONAL__PROPERTIES);
		createEReference(extraFunctionalEClass, EXTRA_FUNCTIONAL__DEPENDENCIES);

		packagingEClass = createEClass(PACKAGING);
		createEReference(packagingEClass, PACKAGING__LOCATION);
		createEReference(packagingEClass, PACKAGING__IMPLEMENTATION);
		createEReference(packagingEClass, PACKAGING__VERSION);

		propertiesEClass = createEClass(PROPERTIES);
		createEReference(propertiesEClass, PROPERTIES__PROPERTY);

		versionEClass = createEClass(VERSION);
		createEAttribute(versionEClass, VERSION__VERSION_ID);
		createEAttribute(versionEClass, VERSION__VERSION_DATE);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__PROPERTY_ID);
		createEAttribute(propertyEClass, PROPERTY__PROPERTY_VALUE);
		createEAttribute(propertyEClass, PROPERTY__IS_EDITABLE);

		dependenciesEClass = createEClass(DEPENDENCIES);
		createEReference(dependenciesEClass, DEPENDENCIES__DEPENDENCY);

		dependencyEClass = createEClass(DEPENDENCY);
		createEAttribute(dependencyEClass, DEPENDENCY__INTERFACE_ID);

		providedInterfacesEClass = createEClass(PROVIDED_INTERFACES);
		createEReference(providedInterfacesEClass, PROVIDED_INTERFACES__INTERFACE);

		requiredInterfacesEClass = createEClass(REQUIRED_INTERFACES);
		createEReference(requiredInterfacesEClass, REQUIRED_INTERFACES__INTERFACE);

		wsdlSpecificationEClass = createEClass(WSDL_SPECIFICATION);
		createEAttribute(wsdlSpecificationEClass, WSDL_SPECIFICATION__URI);
		createEReference(wsdlSpecificationEClass, WSDL_SPECIFICATION__PORT_TYPE);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__INPUT);
		createEReference(operationEClass, OPERATION__OUTPUT);
		createEAttribute(operationEClass, OPERATION__NAME);

		inputEClass = createEClass(INPUT);
		createEReference(inputEClass, INPUT__ELEMENT);
		createEAttribute(inputEClass, INPUT__NAME);
		createEAttribute(inputEClass, INPUT__TYPE);

		outputEClass = createEClass(OUTPUT);
		createEReference(outputEClass, OUTPUT__ELEMENT);
		createEAttribute(outputEClass, OUTPUT__NAME);
		createEAttribute(outputEClass, OUTPUT__TYPE);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEAttribute(elementEClass, ELEMENT__TYPE);
		createEAttribute(elementEClass, ELEMENT__MIN_OCCURS);
		createEAttribute(elementEClass, ELEMENT__MAX_OCCURS);

		inputElementEClass = createEClass(INPUT_ELEMENT);

		outputElementEClass = createEClass(OUTPUT_ELEMENT);

		portTypeEClass = createEClass(PORT_TYPE);
		createEAttribute(portTypeEClass, PORT_TYPE__NAME);
		createEReference(portTypeEClass, PORT_TYPE__OPERATION);

		// Create enums
		repositoryTypeEEnum = createEEnum(REPOSITORY_TYPE);
		platformTypeEEnum = createEEnum(PLATFORM_TYPE);
		propertyIDEEnum = createEEnum(PROPERTY_ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		controllerInterfaceEClass.getESuperTypes().add(this.getComponentStructure());
		coreContentEClass.getESuperTypes().add(this.getComponentStructure());
		interactionContentEClass.getESuperTypes().add(this.getComponentStructure());
		interactionInterfaceEClass.getESuperTypes().add(this.getComponentStructure());
		providedInterfaceEClass.getESuperTypes().add(this.getInterface());
		requiredInterfaceEClass.getESuperTypes().add(this.getInterface());
		inputElementEClass.getESuperTypes().add(this.getElement());
		outputElementEClass.getESuperTypes().add(this.getElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentStructureEClass, ComponentStructure.class, "ComponentStructure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentStructure_FilesLanguage(), theXMLTypePackage.getString(), "filesLanguage", null, 1, 1, ComponentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentStructure_FilesAddress(), theXMLTypePackage.getString(), "filesAddress", null, 1, 1, ComponentStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concreteComponentSpecificationEClass, ConcreteComponentSpecification.class, "ConcreteComponentSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcreteComponentSpecification_ComponentID(), theXMLTypePackage.getString(), "componentID", null, 1, 1, ConcreteComponentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteComponentSpecification_AbstractComponentID(), theXMLTypePackage.getString(), "abstractComponentID", null, 1, 1, ConcreteComponentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteComponentSpecification_ComponentDescription(), theXMLTypePackage.getString(), "componentDescription", null, 1, 1, ConcreteComponentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteComponentSpecification_Functional(), this.getFunctional(), null, "functional", null, 1, 1, ConcreteComponentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteComponentSpecification_ExtraFunctional(), this.getExtraFunctional(), null, "extraFunctional", null, 0, 1, ConcreteComponentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteComponentSpecification_ComponentName(), theXMLTypePackage.getString(), "componentName", null, 1, 1, ConcreteComponentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteComponentSpecification_Packaging(), this.getPackaging(), null, "packaging", null, 1, 1, ConcreteComponentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteComponentSpecification_Marketing(), this.getMarketing(), null, "marketing", null, 1, 1, ConcreteComponentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactEClass, Contact.class, "Contact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContact_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_PersonName(), theXMLTypePackage.getString(), "personName", null, 1, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_Email(), theXMLTypePackage.getString(), "email", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_Phone(), theXMLTypePackage.getString(), "phone", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_Address(), theXMLTypePackage.getString(), "address", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactsEClass, Contacts.class, "Contacts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContacts_Contact(), this.getContact(), null, "contact", null, 1, -1, Contacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerInterfaceEClass, ControllerInterface.class, "ControllerInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllerInterface_ProvidedInterfaces(), this.getProvidedInterfaces(), null, "providedInterfaces", null, 1, 1, ControllerInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllerInterface_RequiredInterfaces(), this.getRequiredInterfaces(), null, "requiredInterfaces", null, 0, 1, ControllerInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreContentEClass, CoreContent.class, "CoreContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionalEClass, Functional.class, "Functional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctional_InteractionContent(), this.getInteractionContent(), null, "interactionContent", null, 0, 1, Functional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctional_CoreContent(), this.getCoreContent(), null, "coreContent", null, 0, 1, Functional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctional_ControllerInterface(), this.getControllerInterface(), null, "controllerInterface", null, 1, 1, Functional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctional_InteractionInterface(), this.getInteractionInterface(), null, "interactionInterface", null, 0, 1, Functional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationEClass, Implementation.class, "Implementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplementation_ProgrammingLanguage(), theXMLTypePackage.getString(), "programmingLanguage", null, 1, 1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementation_PlatformType(), this.getPlatformType(), "platformType", null, 1, 1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionContentEClass, InteractionContent.class, "InteractionContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionInterfaceEClass, InteractionInterface.class, "InteractionInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_RepositoryID(), theXMLTypePackage.getString(), "repositoryID", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_RepositoryType(), this.getRepositoryType(), "repositoryType", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_RepositoryURI(), theXMLTypePackage.getAnyURI(), "repositoryURI", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_ComponentURI(), theXMLTypePackage.getAnyURI(), "componentURI", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(marketingEClass, Marketing.class, "Marketing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarketing_EntityID(), theXMLTypePackage.getString(), "entityID", null, 1, 1, Marketing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarketing_EntityName(), theXMLTypePackage.getString(), "entityName", null, 1, 1, Marketing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarketing_EntityDescription(), theXMLTypePackage.getString(), "entityDescription", null, 0, 1, Marketing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarketing_Contacts(), this.getContacts(), null, "contacts", null, 1, 1, Marketing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterface_InterfaceID(), theXMLTypePackage.getString(), "interfaceID", null, 1, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_InterfaceDescription(), theXMLTypePackage.getString(), "interfaceDescription", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_InterfaceSpecification(), this.getWSDLSpecification(), null, "interfaceSpecification", null, 1, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedInterfaceEClass, ProvidedInterface.class, "ProvidedInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requiredInterfaceEClass, RequiredInterface.class, "RequiredInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extraFunctionalEClass, ExtraFunctional.class, "ExtraFunctional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtraFunctional_Properties(), this.getProperties(), null, "properties", null, 0, 1, ExtraFunctional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtraFunctional_Dependencies(), this.getDependencies(), null, "dependencies", null, 0, 1, ExtraFunctional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packagingEClass, Packaging.class, "Packaging", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackaging_Location(), this.getLocation(), null, "location", null, 1, 1, Packaging.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackaging_Implementation(), this.getImplementation(), null, "implementation", null, 1, 1, Packaging.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackaging_Version(), this.getVersion(), null, "version", null, 1, 1, Packaging.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesEClass, Properties.class, "Properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperties_Property(), this.getProperty(), null, "property", null, 1, -1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersion_VersionID(), theXMLTypePackage.getString(), "versionID", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_VersionDate(), theXMLTypePackage.getString(), "versionDate", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_PropertyID(), this.getPropertyID(), "propertyID", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_PropertyValue(), theXMLTypePackage.getString(), "propertyValue", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsEditable(), theXMLTypePackage.getBoolean(), "isEditable", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependenciesEClass, Dependencies.class, "Dependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependencies_Dependency(), this.getDependency(), null, "dependency", null, 1, -1, Dependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependency_InterfaceID(), theXMLTypePackage.getString(), "interfaceID", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedInterfacesEClass, ProvidedInterfaces.class, "ProvidedInterfaces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedInterfaces_Interface(), this.getProvidedInterface(), null, "interface", null, 1, -1, ProvidedInterfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredInterfacesEClass, RequiredInterfaces.class, "RequiredInterfaces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredInterfaces_Interface(), this.getRequiredInterface(), null, "interface", null, 0, -1, RequiredInterfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wsdlSpecificationEClass, WSDLSpecification.class, "WSDLSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWSDLSpecification_Uri(), theXMLTypePackage.getAnyURI(), "uri", null, 1, 1, WSDLSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWSDLSpecification_PortType(), this.getPortType(), null, "portType", null, 1, 1, WSDLSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Input(), this.getInput(), null, "input", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Output(), this.getOutput(), null, "output", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_Element(), this.getInputElement(), null, "element", null, 0, -1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutput_Element(), this.getOutputElement(), null, "element", null, 1, -1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutput_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutput_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_MinOccurs(), theXMLTypePackage.getInt(), "minOccurs", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_MaxOccurs(), theXMLTypePackage.getInt(), "maxOccurs", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputElementEClass, InputElement.class, "InputElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputElementEClass, OutputElement.class, "OutputElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portTypeEClass, PortType.class, "PortType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortType_Operation(), this.getOperation(), null, "operation", null, 1, -1, PortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(repositoryTypeEEnum, RepositoryType.class, "RepositoryType");
		addEEnumLiteral(repositoryTypeEEnum, RepositoryType.APACHE_WOOKIE_013_1);
		addEEnumLiteral(repositoryTypeEEnum, RepositoryType.APACHE_WOOKIE_014_0);
		addEEnumLiteral(repositoryTypeEEnum, RepositoryType.APACHE_WOOKIE_015_0);
		addEEnumLiteral(repositoryTypeEEnum, RepositoryType.APACHE_WOOKIE_100);
		addEEnumLiteral(repositoryTypeEEnum, RepositoryType._);

		initEEnum(platformTypeEEnum, PlatformType.class, "PlatformType");
		addEEnumLiteral(platformTypeEEnum, PlatformType.WEB);
		addEEnumLiteral(platformTypeEEnum, PlatformType.KNX);
		addEEnumLiteral(platformTypeEEnum, PlatformType.NATIVE_WINDOWS32);
		addEEnumLiteral(platformTypeEEnum, PlatformType._);

		initEEnum(propertyIDEEnum, PropertyID.class, "PropertyID");
		addEEnumLiteral(propertyIDEEnum, PropertyID.WIDTH);
		addEEnumLiteral(propertyIDEEnum, PropertyID.HEIGHT);
		addEEnumLiteral(propertyIDEEnum, PropertyID.IS_RESIZABLE);
		addEEnumLiteral(propertyIDEEnum, PropertyID.MINIMUM_SIZE);
		addEEnumLiteral(propertyIDEEnum, PropertyID.MAXIMUM_SIZE);
		addEEnumLiteral(propertyIDEEnum, PropertyID._);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (componentStructureEClass, 
		   source, 
		   new String[] {
			 "name", "ComponentStructure",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getComponentStructure_FilesLanguage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "filesLanguage"
		   });		
		addAnnotation
		  (getComponentStructure_FilesAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "filesAddress"
		   });		
		addAnnotation
		  (concreteComponentSpecificationEClass, 
		   source, 
		   new String[] {
			 "name", "ConcreteComponentSpecification",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConcreteComponentSpecification_ComponentID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "componentID"
		   });		
		addAnnotation
		  (getConcreteComponentSpecification_AbstractComponentID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abstractComponentID"
		   });		
		addAnnotation
		  (getConcreteComponentSpecification_ComponentDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "componentDescription"
		   });		
		addAnnotation
		  (getConcreteComponentSpecification_Functional(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "functional"
		   });		
		addAnnotation
		  (getConcreteComponentSpecification_ExtraFunctional(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extraFunctional"
		   });		
		addAnnotation
		  (contactEClass, 
		   source, 
		   new String[] {
			 "name", "Contact",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getContact_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description"
		   });		
		addAnnotation
		  (getContact_PersonName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "personName"
		   });		
		addAnnotation
		  (getContact_Email(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "email"
		   });		
		addAnnotation
		  (getContact_Phone(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phone"
		   });		
		addAnnotation
		  (getContact_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address"
		   });		
		addAnnotation
		  (contactsEClass, 
		   source, 
		   new String[] {
			 "name", "Contacts",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getContacts_Contact(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "contact"
		   });		
		addAnnotation
		  (controllerInterfaceEClass, 
		   source, 
		   new String[] {
			 "name", "ControllerInterface",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (coreContentEClass, 
		   source, 
		   new String[] {
			 "name", "CoreContent",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (functionalEClass, 
		   source, 
		   new String[] {
			 "name", "Functional",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFunctional_InteractionContent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "interactionContent"
		   });		
		addAnnotation
		  (getFunctional_CoreContent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "coreContent"
		   });		
		addAnnotation
		  (getFunctional_ControllerInterface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "controllerInterface"
		   });		
		addAnnotation
		  (implementationEClass, 
		   source, 
		   new String[] {
			 "name", "Implementation",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getImplementation_ProgrammingLanguage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "programmingLanguage"
		   });		
		addAnnotation
		  (getImplementation_PlatformType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "platform"
		   });		
		addAnnotation
		  (interactionContentEClass, 
		   source, 
		   new String[] {
			 "name", "InteractionContent",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (interactionInterfaceEClass, 
		   source, 
		   new String[] {
			 "name", "InteractionInterface",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (locationEClass, 
		   source, 
		   new String[] {
			 "name", "Location",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLocation_RepositoryID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "repositoryID"
		   });		
		addAnnotation
		  (getLocation_RepositoryType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "repositoryType"
		   });		
		addAnnotation
		  (getLocation_RepositoryURI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "repositoryURI"
		   });		
		addAnnotation
		  (getLocation_ComponentURI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "componentURI"
		   });		
		addAnnotation
		  (marketingEClass, 
		   source, 
		   new String[] {
			 "name", "Marketing",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMarketing_EntityID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entityID"
		   });		
		addAnnotation
		  (getMarketing_EntityName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entityName"
		   });		
		addAnnotation
		  (getMarketing_EntityDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entityDescription"
		   });		
		addAnnotation
		  (getMarketing_Contacts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "contacts"
		   });		
		addAnnotation
		  (interfaceEClass, 
		   source, 
		   new String[] {
			 "name", "MessagePort",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (providedInterfaceEClass, 
		   source, 
		   new String[] {
			 "name", "MessageSink",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (requiredInterfaceEClass, 
		   source, 
		   new String[] {
			 "name", "MessageSource",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (extraFunctionalEClass, 
		   source, 
		   new String[] {
			 "name", "ExtraFunctional",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getExtraFunctional_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties"
		   });		
		addAnnotation
		  (packagingEClass, 
		   source, 
		   new String[] {
			 "name", "Packaging",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPackaging_Location(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "location"
		   });		
		addAnnotation
		  (getPackaging_Implementation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "implementation"
		   });		
		addAnnotation
		  (getPackaging_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "version"
		   });		
		addAnnotation
		  (propertiesEClass, 
		   source, 
		   new String[] {
			 "name", "Properties",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (versionEClass, 
		   source, 
		   new String[] {
			 "name", "Version",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getVersion_VersionID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "versionName"
		   });		
		addAnnotation
		  (getVersion_VersionDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "versionDate"
		   });
	}

} //CcmmPackageImpl
