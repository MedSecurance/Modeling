/**
 */
package IoMTAssets.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.impl.EcorePackageImpl;
import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.types.internal.impl.TypesPackageImpl;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.impl.UMLPackageImpl;

import IoMTAssets.Asset;
import IoMTAssets.Information;
import IoMTAssets.InformationKind;
import IoMTAssets.IntangibleAsset;
import IoMTAssets.IntangibleAssetKind;
import IoMTAssets.IoMTAssetsFactory;
import IoMTAssets.IoMTAssetsPackage;
import IoMTAssets.Service;
import IoMTAssets.ServiceKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IoMTAssetsPackageImpl extends EPackageImpl implements IoMTAssetsPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass informationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass intangibleAssetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum serviceKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum informationKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum intangibleAssetKindEEnum = null;

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
     * @see IoMTAssets.IoMTAssetsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private IoMTAssetsPackageImpl() {
        super(eNS_URI, IoMTAssetsFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link IoMTAssetsPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static IoMTAssetsPackage init() {
        if (isInited) return (IoMTAssetsPackage)EPackage.Registry.INSTANCE.getEPackage(IoMTAssetsPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredIoMTAssetsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        IoMTAssetsPackageImpl theIoMTAssetsPackage = registeredIoMTAssetsPackage instanceof IoMTAssetsPackageImpl ? (IoMTAssetsPackageImpl)registeredIoMTAssetsPackage : new IoMTAssetsPackageImpl();

        isInited = true;

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
        TypesPackageImpl theTypesPackage = (TypesPackageImpl)(registeredPackage instanceof TypesPackageImpl ? registeredPackage : TypesPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
        UMLPackageImpl theUMLPackage = (UMLPackageImpl)(registeredPackage instanceof UMLPackageImpl ? registeredPackage : UMLPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
        EcorePackageImpl theEcorePackage = (EcorePackageImpl)(registeredPackage instanceof EcorePackageImpl ? registeredPackage : EcorePackage.eINSTANCE);

        // Load packages
        theUMLPackage.loadPackage();

        // Create package meta-data objects
        theIoMTAssetsPackage.createPackageContents();
        theTypesPackage.createPackageContents();
        theEcorePackage.createPackageContents();

        // Initialize created meta-data
        theIoMTAssetsPackage.initializePackageContents();
        theTypesPackage.initializePackageContents();
        theEcorePackage.initializePackageContents();

        // Fix loaded packages
        theUMLPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        //theIoMTAssetsPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(IoMTAssetsPackage.eNS_URI, theIoMTAssetsPackage);
        return theIoMTAssetsPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAsset() {
        return assetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAsset_Key() {
        return (EAttribute)assetEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAsset_MissionName() {
        return (EAttribute)assetEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAsset_Description() {
        return (EAttribute)assetEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAsset_Base_Class() {
        return (EReference)assetEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getService() {
        return serviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getService_Kind() {
        return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getInformation() {
        return informationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getInformation_Location() {
        return (EAttribute)informationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getInformation_Record() {
        return (EAttribute)informationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getInformation_Kind() {
        return (EAttribute)informationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getIntangibleAsset() {
        return intangibleAssetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIntangibleAsset_Kind() {
        return (EAttribute)intangibleAssetEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getServiceKind() {
        return serviceKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getInformationKind() {
        return informationKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getIntangibleAssetKind() {
        return intangibleAssetKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IoMTAssetsFactory getIoMTAssetsFactory() {
        return (IoMTAssetsFactory)getEFactoryInstance();
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
        assetEClass = createEClass(ASSET);
        createEAttribute(assetEClass, ASSET__KEY);
        createEAttribute(assetEClass, ASSET__MISSION_NAME);
        createEAttribute(assetEClass, ASSET__DESCRIPTION);
        createEReference(assetEClass, ASSET__BASE_CLASS);

        serviceEClass = createEClass(SERVICE);
        createEAttribute(serviceEClass, SERVICE__KIND);

        informationEClass = createEClass(INFORMATION);
        createEAttribute(informationEClass, INFORMATION__LOCATION);
        createEAttribute(informationEClass, INFORMATION__RECORD);
        createEAttribute(informationEClass, INFORMATION__KIND);

        intangibleAssetEClass = createEClass(INTANGIBLE_ASSET);
        createEAttribute(intangibleAssetEClass, INTANGIBLE_ASSET__KIND);

        // Create enums
        serviceKindEEnum = createEEnum(SERVICE_KIND);
        informationKindEEnum = createEEnum(INFORMATION_KIND);
        intangibleAssetKindEEnum = createEEnum(INTANGIBLE_ASSET_KIND);
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
        TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
        UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        serviceEClass.getESuperTypes().add(this.getAsset());
        informationEClass.getESuperTypes().add(this.getAsset());
        intangibleAssetEClass.getESuperTypes().add(this.getAsset());

        // Initialize classes, features, and operations; add parameters
        initEClass(assetEClass, Asset.class, "Asset", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAsset_Key(), theTypesPackage.getString(), "key", null, 1, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getAsset_MissionName(), theTypesPackage.getString(), "missionName", null, 1, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getAsset_Description(), theTypesPackage.getString(), "description", null, 1, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getAsset_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getService_Kind(), this.getServiceKind(), "kind", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(informationEClass, Information.class, "Information", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getInformation_Location(), theTypesPackage.getString(), "location", null, 1, 1, Information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getInformation_Record(), theTypesPackage.getString(), "record", null, 1, 1, Information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getInformation_Kind(), this.getInformationKind(), "kind", null, 1, 1, Information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(intangibleAssetEClass, IntangibleAsset.class, "IntangibleAsset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIntangibleAsset_Kind(), this.getIntangibleAssetKind(), "kind", null, 1, 1, IntangibleAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(serviceKindEEnum, ServiceKind.class, "ServiceKind");
        addEEnumLiteral(serviceKindEEnum, ServiceKind.REMOTE_PATIENT_MONITORING);
        addEEnumLiteral(serviceKindEEnum, ServiceKind.INFUSION_PUMP);
        addEEnumLiteral(serviceKindEEnum, ServiceKind.STRESS_MONITORING);
        addEEnumLiteral(serviceKindEEnum, ServiceKind.OXIGEN_LEVEL_MONITORING);
        addEEnumLiteral(serviceKindEEnum, ServiceKind.HEART_RATE_MONITORING);
        addEEnumLiteral(serviceKindEEnum, ServiceKind.GLUCOSE_MONITORING);
        addEEnumLiteral(serviceKindEEnum, ServiceKind.THERMOMETER_MONITORING);
        addEEnumLiteral(serviceKindEEnum, ServiceKind.DATA_STORAGE);
        addEEnumLiteral(serviceKindEEnum, ServiceKind.DATA_ANALYSIS);
        addEEnumLiteral(serviceKindEEnum, ServiceKind.EMERGENCY_RESPONSE);
        addEEnumLiteral(serviceKindEEnum, ServiceKind.VOICE_BASED_HEALTH_ASSITANTS);
        addEEnumLiteral(serviceKindEEnum, ServiceKind.SURGICAL_NAVIGATION);
        addEEnumLiteral(serviceKindEEnum, ServiceKind.MEDICAL_IMAGE_ANALYSIS);
        addEEnumLiteral(serviceKindEEnum, ServiceKind.IO_MT_CYBERSECURITY);
        addEEnumLiteral(serviceKindEEnum, ServiceKind.OTHER);

        initEEnum(informationKindEEnum, InformationKind.class, "InformationKind");
        addEEnumLiteral(informationKindEEnum, InformationKind.PATIENT_PERSONAL_DATA);
        addEEnumLiteral(informationKindEEnum, InformationKind.PATIENT_HEALTH_RECORDS);
        addEEnumLiteral(informationKindEEnum, InformationKind.REAL_TIME_PATIENT_DATA);
        addEEnumLiteral(informationKindEEnum, InformationKind.INSURANCE_AND_BILLING);
        addEEnumLiteral(informationKindEEnum, InformationKind.DEVICE_SENSOR_DATA);
        addEEnumLiteral(informationKindEEnum, InformationKind.STAFF_USER_DATA);
        addEEnumLiteral(informationKindEEnum, InformationKind.THIRD_PARTY_DATA);
        addEEnumLiteral(informationKindEEnum, InformationKind.OTHER);

        initEEnum(intangibleAssetKindEEnum, IntangibleAssetKind.class, "IntangibleAssetKind");
        addEEnumLiteral(intangibleAssetKindEEnum, IntangibleAssetKind.HOSPITAL_REPUTATION);
        addEEnumLiteral(intangibleAssetKindEEnum, IntangibleAssetKind.IO_MT_BRAND_EQUITY);
        addEEnumLiteral(intangibleAssetKindEEnum, IntangibleAssetKind.PATIENT_SATISFACTION);
        addEEnumLiteral(intangibleAssetKindEEnum, IntangibleAssetKind.DATA_PRIVACY_SECURITY_TRUST);
        addEEnumLiteral(intangibleAssetKindEEnum, IntangibleAssetKind.INTELLECTUAL_PROPERTY);
        addEEnumLiteral(intangibleAssetKindEEnum, IntangibleAssetKind.LICENCES);
        addEEnumLiteral(intangibleAssetKindEEnum, IntangibleAssetKind.OTHER);

        // Create resource
        createResource(eNS_URI);
    }

} //IoMTAssetsPackageImpl
