/**
 */
package IoMTComponentCategories.impl;

import IoMTComponentCategories.ComponentAnnotationKind;
import IoMTComponentCategories.IoMTComponentCategoriesFactory;
import IoMTComponentCategories.IoMTComponentCategoriesPackage;
import IoMTComponentCategories.IoMTcomponent;
import IoMTComponentCategories.IoMTp;
import IoMTComponentCategories.IoMTpkg;
import IoMTComponentCategories.PackageAnnotationKind;
import IoMTComponentCategories.PropertyAnnotationKind;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IoMTComponentCategoriesPackageImpl extends EPackageImpl implements IoMTComponentCategoriesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioMTcomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioMTpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioMTpkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentAnnotationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyAnnotationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum packageAnnotationKindEEnum = null;

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
	 * @see IoMTComponentCategories.IoMTComponentCategoriesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IoMTComponentCategoriesPackageImpl() {
		super(eNS_URI, IoMTComponentCategoriesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IoMTComponentCategoriesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IoMTComponentCategoriesPackage init() {
		if (isInited) return (IoMTComponentCategoriesPackage)EPackage.Registry.INSTANCE.getEPackage(IoMTComponentCategoriesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIoMTComponentCategoriesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IoMTComponentCategoriesPackageImpl theIoMTComponentCategoriesPackage = registeredIoMTComponentCategoriesPackage instanceof IoMTComponentCategoriesPackageImpl ? (IoMTComponentCategoriesPackageImpl)registeredIoMTComponentCategoriesPackage : new IoMTComponentCategoriesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIoMTComponentCategoriesPackage.createPackageContents();

		// Initialize created meta-data
		theIoMTComponentCategoriesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIoMTComponentCategoriesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IoMTComponentCategoriesPackage.eNS_URI, theIoMTComponentCategoriesPackage);
		return theIoMTComponentCategoriesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIoMTcomponent() {
		return ioMTcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIoMTcomponent_Base_Class() {
		return (EReference)ioMTcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIoMTcomponent_SupportedFeatures() {
		return (EAttribute)ioMTcomponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIoMTp() {
		return ioMTpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIoMTp_Base_Property() {
		return (EReference)ioMTpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIoMTp_SupportedFeatures() {
		return (EAttribute)ioMTpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIoMTpkg() {
		return ioMTpkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIoMTpkg_Base_Package() {
		return (EReference)ioMTpkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIoMTpkg_SupportedFeatures() {
		return (EAttribute)ioMTpkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComponentAnnotationKind() {
		return componentAnnotationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPropertyAnnotationKind() {
		return propertyAnnotationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPackageAnnotationKind() {
		return packageAnnotationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoMTComponentCategoriesFactory getIoMTComponentCategoriesFactory() {
		return (IoMTComponentCategoriesFactory)getEFactoryInstance();
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
		ioMTcomponentEClass = createEClass(IO_MTCOMPONENT);
		createEReference(ioMTcomponentEClass, IO_MTCOMPONENT__BASE_CLASS);
		createEAttribute(ioMTcomponentEClass, IO_MTCOMPONENT__SUPPORTED_FEATURES);

		ioMTpEClass = createEClass(IO_MTP);
		createEReference(ioMTpEClass, IO_MTP__BASE_PROPERTY);
		createEAttribute(ioMTpEClass, IO_MTP__SUPPORTED_FEATURES);

		ioMTpkgEClass = createEClass(IO_MTPKG);
		createEReference(ioMTpkgEClass, IO_MTPKG__BASE_PACKAGE);
		createEAttribute(ioMTpkgEClass, IO_MTPKG__SUPPORTED_FEATURES);

		// Create enums
		componentAnnotationKindEEnum = createEEnum(COMPONENT_ANNOTATION_KIND);
		propertyAnnotationKindEEnum = createEEnum(PROPERTY_ANNOTATION_KIND);
		packageAnnotationKindEEnum = createEEnum(PACKAGE_ANNOTATION_KIND);
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
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(ioMTcomponentEClass, IoMTcomponent.class, "IoMTcomponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIoMTcomponent_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, IoMTcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIoMTcomponent_SupportedFeatures(), this.getComponentAnnotationKind(), "supportedFeatures", null, 0, -1, IoMTcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ioMTpEClass, IoMTp.class, "IoMTp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIoMTp_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, IoMTp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIoMTp_SupportedFeatures(), this.getPropertyAnnotationKind(), "supportedFeatures", null, 1, 1, IoMTp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ioMTpkgEClass, IoMTpkg.class, "IoMTpkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIoMTpkg_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, IoMTpkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIoMTpkg_SupportedFeatures(), this.getPackageAnnotationKind(), "supportedFeatures", null, 1, 1, IoMTpkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(componentAnnotationKindEEnum, ComponentAnnotationKind.class, "ComponentAnnotationKind");
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.CONFIGURATION_CHANGE);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.ACCESS_PERMISSION);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.FACTORY);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.COLLECTOR);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.EXTERNAL_SOFTWARE);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.MUTUAL_TRUST);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.MINIMAL_FUNCTION_MODE);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.ASYMETRIC_CRYPTOGRAPHY);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.DEVICE_VULNERABILITY_MITIGATION);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.LIMITED_BUT_SAFE_OPERATION);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.FAILURE_LOGGER);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.DATA_AUTHENTICATOR);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.CERTIFICATE_WITHOUT_EXPIRE_DATA);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.UNIQUE_PRESHARED_KEY);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.BOOT_SOFTWARE);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.FACTORY_PASSWORD_GENERATOR);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.UPDATE_STATUS_MONITOR);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.REMOTE_ACCESS);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.RISK_CONTROL_MEASURE);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.ROLE_BASED_AUTHENTICATION);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.DATA_CONVERTER);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.RANDOM_NUMBER_GENERATOR);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.CRYPTOGRAPHIC_KEY_GENERATOR);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.LOCAL_ACCESS);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.BACKUP_DATA);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.SENSOR_UPDATER);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.CRITICAL_LOG_FILE_STORER);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.CRYPTOGRAPHY_PROTECTION_OF_DATA_AT_REST);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.SYMMETRIC_CRYPTOGRAPHY);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.SAFETY_EVENT_MANAMENT);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.CERTIFICATE_RECORDING);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.TEMPER_PROOF_IDENTITY_STORAGE);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.CRITICAL_ELECTRONIC_DEVICE);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.VULNERABILITY_DEVICE);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.UNAUTORIZED_USERS_PREVENTER);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.MEDICAL_IT_NETWORK);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.SECURITY_EVENT_LOG);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.CRITICAL_ACTIONS_TIMESTAMPED_LOGGER);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.COMMUNICATION_ENCRYPTED);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.GEO_LOCATED_REPORTER);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.IDENTITY_STORAGE);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.SPATIO_TEMPORAL_SYNCHORNIZER);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.NON_ESSENTIAL_PII_COLLECTOR);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.NON_NOTIFYING_SINGLE_POINT_OF_FAILURE);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.PLAIN_TEXT_PII_LOGGER);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.DOCUMENT_INFORMATION);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.REQUIRED_COMPONENT);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.UNREQUIRED_COMMUNICATION_CAPABILITY);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.PRIVACY_MANAGER);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.SECURE_SEMANTIC_INTEROPERABILITY);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.CONFIGURATION_BACKUP_DATA);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.CRITICAL_MECHANICAL_DEVICE);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.APP_DATA_STORED);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.CRITICAL_EVENTS_TIMESTAMPED_LOGGER);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.DEVICE_AUTHENTICATOR_TO_GATEWAY);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.TECHNICAL_USER_INTERFACE_VERIFICATION);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.SECURE_ASSET_STORAGE);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.SOFTWARE_IN_DEVICE);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.DEVICE_PAIRING);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.POST_MARKET_SURVEILLANCE);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.CANDIDATE_SECURITY_CAPABILITY);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.ELECTRONIC_COMPONENT);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.SECURE_DEVICE_IDENTITY_GENERATOR);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.NON_CRITICAL);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.SENSITIVE_BACKUP_OF_EXTERNAL_STORAGE);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.ACCESS_TO_EXTERNAL_WEB_SITE);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.PERSONNAL_DATA);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.CRYPTOGRAPHY_FOR_SOURCE_VALIDITY);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.OFF_LABEL_DEVICE);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.IMPLICIT_DEVICE2_DEVICE_TRUST);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.DATA_PROCESSOR);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.IDENTITY_RECORDER);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.RISK_ANALYSER);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.FAIL_SAFE_MODE);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.SECURITY_CONTROL);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.INCONSISTENT_DATA_HANDLER);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.INCONSISTENT_DEVICE_LOCATION_HANDLER);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.ENCRYPTED_DATA_STORAGE);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.CLOSED_COMMUNICATION_PROTOCOL);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.TAMPERING_PREVENTER);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.NON_TIMELY_UPDATE_DETECTOR);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.SECURE_CODE);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.SECURE_INTEROPERABILITY);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.UNIQUE_COMPONENT_LEVEL_GENERATOR);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.MOST_SECURE_COMMUNICATION_PROTOCOL);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.CRITICAL_DATA_BACKUP);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.CLONE_RESISTANT_ID);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.MODIFICATION_RESISTANT_ID);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.MA_CBASED_IDENTIFIER);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.MEDICAL_DEVICE_CONNECTION);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.MALWARE_PROTECTOR);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.CRITICAL_SOFTWARE_COMPONENT);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.BACKUP_OPTIMIZER);
		addEEnumLiteral(componentAnnotationKindEEnum, ComponentAnnotationKind.DATA_AUTHENTIFIER);

		initEEnum(propertyAnnotationKindEEnum, PropertyAnnotationKind.class, "PropertyAnnotationKind");
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.CRYPTOGRAPHIC_OPERATION);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.STRICTLY_INCREASING_FUNCTION);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.POST_DEPLOYMENT_INFORMATION);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.UNIQUE_ID);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.IDENTITITY256_LONG_AT_LEAST);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.CANDIDATE_SYMETRIC_KEY_ENCRYPTION);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.SECURITY_MAINTENANCE);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.SECURITY_SAFEGUARD);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.CRITICAL_DATA_TYPE);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.SECURITY_FEATURE);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.SOFTWARE_VERSION_NUMBER);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.LIST_AUTHORIZED_ONBOARDERS);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.TEST_INFORMATION);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.CONNECTIVITY);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.EXCHANGE_BETWEEN_DEVICE_AND_EVENT_LOGGER);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.NON_REPUDIABLE_IDENTITIES);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.DEVICE_SECURITY_BASELINE);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.UNREQUIRED_PRIVILEGE);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.CLAIM);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.DECOMMISSION_DATA);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.PATIENT_DATA);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.DATA_IN_TRANSIT);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.SECURITY_CONFIGURATION_OPTION);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.DEVICE_SECRET);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.VERSIONING_UNIQUE_IDENTIFIER);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.METADATA_FOR_DOCUMENTED_INFORMATION);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.DATA_OUTSIDE_DIRECT_STORER_CONTROL);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.CANDIDATE_CERTIFICATE);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.DEVICE_CLINICAL_BACKUP_DATA);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.RISK_CONTROL_MEASURE);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.PRIVATE_KEY);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.SECURITY_MEASURE);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.DATA_IN_MOTION);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.COLLECTED_PATIENT_PERSONNAL_DATA);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.KEY_PERFORMANCE_INDICATOR);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.CANDIDATE_SECURITY_FEATURE);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.STRICLY_INCREASING_FUNCTION);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.DEVICE_INFORMATION_DECLARATION);
		addEEnumLiteral(propertyAnnotationKindEEnum, PropertyAnnotationKind.BACKUP_DATA);

		initEEnum(packageAnnotationKindEEnum, PackageAnnotationKind.class, "PackageAnnotationKind");
		addEEnumLiteral(packageAnnotationKindEEnum, PackageAnnotationKind.DEVELOPMENT_AND_TEST_ENVIRONMENT);
		addEEnumLiteral(packageAnnotationKindEEnum, PackageAnnotationKind.DOCUMENTATION);
		addEEnumLiteral(packageAnnotationKindEEnum, PackageAnnotationKind.REGION_AND_CULTURAL_NORMS);
		addEEnumLiteral(packageAnnotationKindEEnum, PackageAnnotationKind.PHYSICAL_SECURITY);
		addEEnumLiteral(packageAnnotationKindEEnum, PackageAnnotationKind.SECURITY_CONTROL);
		addEEnumLiteral(packageAnnotationKindEEnum, PackageAnnotationKind.ACCESS_TO_SOURCE_CODE);
		addEEnumLiteral(packageAnnotationKindEEnum, PackageAnnotationKind.INFORMATION_PROCESSING_FACILITY);
		addEEnumLiteral(packageAnnotationKindEEnum, PackageAnnotationKind.INFORMATION_MANAGEMENT_SYSTEM);
		addEEnumLiteral(packageAnnotationKindEEnum, PackageAnnotationKind.HEALTHCARE_DELIVERY_ORGANISATION);
		addEEnumLiteral(packageAnnotationKindEEnum, PackageAnnotationKind.SECURY_SYSTEM);
		addEEnumLiteral(packageAnnotationKindEEnum, PackageAnnotationKind.TRUSTED_MODULE);
		addEEnumLiteral(packageAnnotationKindEEnum, PackageAnnotationKind.FINAL_PRODUCT);
		addEEnumLiteral(packageAnnotationKindEEnum, PackageAnnotationKind.SMART_DEVICE_APP);
		addEEnumLiteral(packageAnnotationKindEEnum, PackageAnnotationKind.MEDICAL_IT_NETWORK);
		addEEnumLiteral(packageAnnotationKindEEnum, PackageAnnotationKind.SECURE_COMMUNICATION_CHANNEL);
		addEEnumLiteral(packageAnnotationKindEEnum, PackageAnnotationKind.SIMILAR_MEDICAL_IT_NETWORK);

		// Create resource
		createResource(eNS_URI);
	}

} //IoMTComponentCategoriesPackageImpl
