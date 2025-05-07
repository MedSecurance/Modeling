/**
 */
package tvra.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import tvra.ControlSet;
import tvra.ControlSetKind;
import tvra.ImpactLevelKind;
import tvra.Misbehaviour;
import tvra.MisbehaviourKind;
import tvra.NetworkDomain;
import tvra.NetworkDomainKind;
import tvra.TRVAAssetKind;
import tvra.TVRAAsset;
import tvra.TWASKind;
import tvra.TrustworthinessAttributeSet;
import tvra.TrustworthinessLevelKind;
import tvra.TvraFactory;
import tvra.TvraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TvraPackageImpl extends EPackageImpl implements TvraPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tvraAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass misbehaviourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trustworthinessAttributeSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum trvaAssetKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum misbehaviourKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum impactLevelKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum twasKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum trustworthinessLevelKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlSetKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum networkDomainKindEEnum = null;

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
	 * @see tvra.TvraPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TvraPackageImpl() {
		super(eNS_URI, TvraFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TvraPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TvraPackage init() {
		if (isInited) return (TvraPackage)EPackage.Registry.INSTANCE.getEPackage(TvraPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTvraPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TvraPackageImpl theTvraPackage = registeredTvraPackage instanceof TvraPackageImpl ? (TvraPackageImpl)registeredTvraPackage : new TvraPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTvraPackage.createPackageContents();

		// Initialize created meta-data
		theTvraPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTvraPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TvraPackage.eNS_URI, theTvraPackage);
		return theTvraPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTVRAAsset() {
		return tvraAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTVRAAsset_Base_Class() {
		return (EReference)tvraAssetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTVRAAsset_Kind() {
		return (EAttribute)tvraAssetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTVRAAsset_Misbehaviours() {
		return (EReference)tvraAssetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTVRAAsset_Trustworthinessattributesets() {
		return (EReference)tvraAssetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTVRAAsset_Controlsets() {
		return (EReference)tvraAssetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMisbehaviour() {
		return misbehaviourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMisbehaviour_Kind() {
		return (EAttribute)misbehaviourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMisbehaviour_Base_Class() {
		return (EReference)misbehaviourEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMisbehaviour_ImpactLevel() {
		return (EAttribute)misbehaviourEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMisbehaviour_Tvraasset() {
		return (EReference)misbehaviourEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrustworthinessAttributeSet() {
		return trustworthinessAttributeSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrustworthinessAttributeSet_Base_Class() {
		return (EReference)trustworthinessAttributeSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrustworthinessAttributeSet_Kind() {
		return (EAttribute)trustworthinessAttributeSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrustworthinessAttributeSet_TrustworthinessLevel() {
		return (EAttribute)trustworthinessAttributeSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrustworthinessAttributeSet_Tvraasset() {
		return (EReference)trustworthinessAttributeSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlSet() {
		return controlSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlSet_Kind() {
		return (EAttribute)controlSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlSet_Base_Class() {
		return (EReference)controlSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlSet_IsProposed() {
		return (EAttribute)controlSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlSet_CoverageLevel() {
		return (EAttribute)controlSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlSet_Tvraasset() {
		return (EReference)controlSetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkDomain() {
		return networkDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetworkDomain_Base_Association() {
		return (EReference)networkDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkDomain_Kind() {
		return (EAttribute)networkDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTRVAAssetKind() {
		return trvaAssetKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMisbehaviourKind() {
		return misbehaviourKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImpactLevelKind() {
		return impactLevelKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTWASKind() {
		return twasKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTrustworthinessLevelKind() {
		return trustworthinessLevelKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getControlSetKind() {
		return controlSetKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNetworkDomainKind() {
		return networkDomainKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TvraFactory getTvraFactory() {
		return (TvraFactory)getEFactoryInstance();
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
		tvraAssetEClass = createEClass(TVRA_ASSET);
		createEReference(tvraAssetEClass, TVRA_ASSET__BASE_CLASS);
		createEAttribute(tvraAssetEClass, TVRA_ASSET__KIND);
		createEReference(tvraAssetEClass, TVRA_ASSET__MISBEHAVIOURS);
		createEReference(tvraAssetEClass, TVRA_ASSET__TRUSTWORTHINESSATTRIBUTESETS);
		createEReference(tvraAssetEClass, TVRA_ASSET__CONTROLSETS);

		misbehaviourEClass = createEClass(MISBEHAVIOUR);
		createEAttribute(misbehaviourEClass, MISBEHAVIOUR__KIND);
		createEReference(misbehaviourEClass, MISBEHAVIOUR__BASE_CLASS);
		createEAttribute(misbehaviourEClass, MISBEHAVIOUR__IMPACT_LEVEL);
		createEReference(misbehaviourEClass, MISBEHAVIOUR__TVRAASSET);

		trustworthinessAttributeSetEClass = createEClass(TRUSTWORTHINESS_ATTRIBUTE_SET);
		createEReference(trustworthinessAttributeSetEClass, TRUSTWORTHINESS_ATTRIBUTE_SET__BASE_CLASS);
		createEAttribute(trustworthinessAttributeSetEClass, TRUSTWORTHINESS_ATTRIBUTE_SET__KIND);
		createEAttribute(trustworthinessAttributeSetEClass, TRUSTWORTHINESS_ATTRIBUTE_SET__TRUSTWORTHINESS_LEVEL);
		createEReference(trustworthinessAttributeSetEClass, TRUSTWORTHINESS_ATTRIBUTE_SET__TVRAASSET);

		controlSetEClass = createEClass(CONTROL_SET);
		createEAttribute(controlSetEClass, CONTROL_SET__KIND);
		createEReference(controlSetEClass, CONTROL_SET__BASE_CLASS);
		createEAttribute(controlSetEClass, CONTROL_SET__IS_PROPOSED);
		createEAttribute(controlSetEClass, CONTROL_SET__COVERAGE_LEVEL);
		createEReference(controlSetEClass, CONTROL_SET__TVRAASSET);

		networkDomainEClass = createEClass(NETWORK_DOMAIN);
		createEReference(networkDomainEClass, NETWORK_DOMAIN__BASE_ASSOCIATION);
		createEAttribute(networkDomainEClass, NETWORK_DOMAIN__KIND);

		// Create enums
		trvaAssetKindEEnum = createEEnum(TRVA_ASSET_KIND);
		misbehaviourKindEEnum = createEEnum(MISBEHAVIOUR_KIND);
		impactLevelKindEEnum = createEEnum(IMPACT_LEVEL_KIND);
		twasKindEEnum = createEEnum(TWAS_KIND);
		trustworthinessLevelKindEEnum = createEEnum(TRUSTWORTHINESS_LEVEL_KIND);
		controlSetKindEEnum = createEEnum(CONTROL_SET_KIND);
		networkDomainKindEEnum = createEEnum(NETWORK_DOMAIN_KIND);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tvraAssetEClass, TVRAAsset.class, "TVRAAsset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTVRAAsset_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, TVRAAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTVRAAsset_Kind(), this.getTRVAAssetKind(), "kind", null, 1, 1, TVRAAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTVRAAsset_Misbehaviours(), this.getMisbehaviour(), this.getMisbehaviour_Tvraasset(), "misbehaviours", null, 0, -1, TVRAAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTVRAAsset_Trustworthinessattributesets(), this.getTrustworthinessAttributeSet(), this.getTrustworthinessAttributeSet_Tvraasset(), "trustworthinessattributesets", null, 0, -1, TVRAAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTVRAAsset_Controlsets(), this.getControlSet(), this.getControlSet_Tvraasset(), "controlsets", null, 0, -1, TVRAAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(misbehaviourEClass, Misbehaviour.class, "Misbehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMisbehaviour_Kind(), this.getMisbehaviourKind(), "kind", null, 1, 1, Misbehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMisbehaviour_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Misbehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMisbehaviour_ImpactLevel(), this.getImpactLevelKind(), "impactLevel", null, 1, 1, Misbehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMisbehaviour_Tvraasset(), this.getTVRAAsset(), this.getTVRAAsset_Misbehaviours(), "tvraasset", null, 1, 1, Misbehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trustworthinessAttributeSetEClass, TrustworthinessAttributeSet.class, "TrustworthinessAttributeSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrustworthinessAttributeSet_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, TrustworthinessAttributeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTrustworthinessAttributeSet_Kind(), this.getTWASKind(), "kind", null, 1, 1, TrustworthinessAttributeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTrustworthinessAttributeSet_TrustworthinessLevel(), this.getTrustworthinessLevelKind(), "trustworthinessLevel", null, 1, 1, TrustworthinessAttributeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrustworthinessAttributeSet_Tvraasset(), this.getTVRAAsset(), this.getTVRAAsset_Trustworthinessattributesets(), "tvraasset", null, 1, 1, TrustworthinessAttributeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(controlSetEClass, ControlSet.class, "ControlSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlSet_Kind(), this.getControlSetKind(), "kind", null, 1, 1, ControlSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getControlSet_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, ControlSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getControlSet_IsProposed(), theTypesPackage.getBoolean(), "isProposed", null, 1, 1, ControlSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getControlSet_CoverageLevel(), this.getTrustworthinessLevelKind(), "coverageLevel", null, 1, 1, ControlSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getControlSet_Tvraasset(), this.getTVRAAsset(), this.getTVRAAsset_Controlsets(), "tvraasset", null, 1, 1, ControlSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(networkDomainEClass, NetworkDomain.class, "NetworkDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkDomain_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 0, 1, NetworkDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNetworkDomain_Kind(), this.getNetworkDomainKind(), "kind", null, 1, 1, NetworkDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(trvaAssetKindEEnum, TRVAAssetKind.class, "TRVAAssetKind");
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.ABSTRACT_SUBNET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.ACCESS_CONTEXT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.ADULT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.API_SERVER);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.APPLICATION_PROCESS);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.ATTACK_PATH);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.AUTH_CHANNEL);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.AUTH_CLIENT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.AUTH_SERVICE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.BASE_STATION);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.BIOMETRIC_DATA);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.BLUETOOTH_PAIR);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.BOUNDED_SPACE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CELLULAR_NETWORK);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CHILD);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CLIENT_ATTACK_PATH);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CLIENT_CHANNEL);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CLIENT_PATH);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CLOSED_CLIENT_ATTACK_PATH);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CLOSED_SEGMENT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CLOSED_SERVICE_ATTACK_PATH);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CLUSTER);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CLUSTER_HOST);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CLUSTER_IP);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CMD_LINE_PROCESS);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.COMMS_ASSET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CONNECTION_ASSET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CONNECTION_CHANNEL);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CONNECTION_PATH);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CONSOLE_HOST);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CONSOLE_PROCESS);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CONTAINER);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CONTROL_DATA);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CONTROL_PROCESS);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CONTROLLER);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CORE_NETWORK);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.CORE_ROUTER);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DB);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_ACCESS);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_ASSET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_CACHE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_CENTRE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_CHANNEL);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_CONTAINER);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_COPY);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_EXCHANGE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_FIELD);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_FLOW);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_INFERENCE_ASSET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_INPUT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_LIFECYCLE_ASSET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_OUTPUT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_PALETTE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_PATH);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_POOL);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_PROCESS);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_RELAY);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_SERVICE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_STEP);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_UPDATE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DATA_USE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DE_NAT_SEGMENT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DEBUG_MARKER);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DESKTOP_SERVICE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.DUMB_HOST);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.EDITOR);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.EMAIL_CLIENT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.EMAIL_MUA);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.EMAIL_MX);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.EMAIL_SERVICE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.FIXED_HOST);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.FREE_SEGMENT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.GDPR_ART94_DATA);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.GDPR_ART9_DATA);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.GENERAL_HOST);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.GENERAL_PROCESS);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.GENETIC_DATA);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.GOVERNANCE_ASSET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.GOVERNANCE_PALETTE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.HCONTEXT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.HEALTH_DATA);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.HEALTH_SENSOR);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.HOST);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.HOST_CHANNEL);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.HOST_CONTEXT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.HOST_LAN);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.HOST_NET_CONTEXT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.HOST_PALETTE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.HUMAN);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.INGRESS);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.INPUT_POOL);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.INTERACTIVE_APPLICATION);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.INTERACTIVE_HOST);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.INTERACTIVE_PROCESS);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.INTERFACE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.INTERNAL_SUBNET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.INTERNET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.IO_TPROCESS);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.JURISDICTION);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.L01_SUBNET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.L0_SUBNET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.L1_SUBNET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.L23_SUBNET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.L2_SUBNET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.L3_SUBNET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.LEGAL_ENTITY);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.LEGAL_ORGANISATION);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.LOGICAL_PATH);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.LOGICAL_ROUTE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.LOGICAL_SEGMENT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.LOGICAL_SUBNET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.LOGIN_SERVICE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.MASTER);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.MESH_ROUTING_SEGMENT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.MOBILE_CLIENT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.MOBILE_HOST);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.NAT_SEGMENT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.NPE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.NETWORK_ASSET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.NETWORK_INFERENCE_ASSET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.NETWORK_PALETTE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.NETWORK_PATH);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.NOTEBOOK);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.OPEN_CLIENT_ATTACK_PATH);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.OPEN_SEGMENT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.OPEN_SERVICE_ATTACK_PATH);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.ORGANISATION);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.OUTPUT_POOL);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.OVERLAY_SUBNET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.PCONTEXT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.PPE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.PERSONAL_HOST);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.PHYSICAL_HOST);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.PHYSICAL_PALETTE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.PHYSICAL_PATH);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.PHYSICAL_SUBNET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.POD);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.PRIVATE_CELLULAR_NETWORK);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.PRIVATE_SPACE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.PROC_NET_CONTEXT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.PROCESS);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.PROCESS_CONTEXT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.PROCESS_PALETTE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.PUBLIC_CELLULAR_NETWORK);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.PUBLIC_SPACE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.RAN);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.RADIO_SUBNET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.REMOTE_ACCESS_CLIENT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.REMOTE_ACCESS_SERVICE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.REMOTE_DESKTOP);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.REMOTE_TERMINAL);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.REMOTE_USER_ACCESS);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.REMOVABLE_MEDIA);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.ROUTER);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.SMS_CLIENT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.SCALABLE_HOST);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.SENSED_DATA);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.SENSITIVE_DATA);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.SENSOR);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.SENSOR_PROCESS);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.SERVER);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.SERVICE_ATTACK_PATH);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.SERVICE_CHANNEL);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.SERVICE_PROXY);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.SHELL_HOST);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.SIMPLE_HOST);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.SIMPLE_PROCESS);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.SMARTPHONE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.SMARTWATCH);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.SOCKET_LAN);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.SPACE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.SPAM_DATA);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.SPECIAL_CATEGORY_DATA);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.STAKEHOLDER);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.STORED_DATA_POOL);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.TABLET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.TEMP_DATA_RELAY);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.TETHERING_SEGMENT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.TEXT_EDITOR);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.THING);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.TRIVIAL_HOST);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.TRIVIAL_PROCESS);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.TYPE_OVERLAY_DATA);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.TYPE_OVERLAY_HOST);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.TYPE_OVERLAY_PROCESS);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.TYPE_OVERLAY_SUBNET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.USB_DEVICE);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.USB_HOST);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.USB_PAIR);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.UPDATE_POOL);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.VCLUSTER);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.VM);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.VPN);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.VROUTER);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.VXLAN);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.VIRTUAL_CHANNEL);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.VIRTUAL_HOST);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.VIRTUAL_SUBNET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.WEB_APP);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.WEB_BROWSER);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.WEB_CLIENT);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.WI_FI_LAN);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.WIRED_LAN);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.WIRED_SUBNET);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.WORKER);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.WORKSTATION);
		addEEnumLiteral(trvaAssetKindEEnum, TRVAAssetKind.WORLD);

		initEEnum(misbehaviourKindEEnum, MisbehaviourKind.class, "MisbehaviourKind");
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_ACCESSIBILITY);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_ANON_USER_TW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_ASTUTENESS);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_AUTHENTICITY);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_INTEGRITY);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_AVAILABILITY);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_BENEVOLENCE);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_CAPACITY);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_CLIENT_TW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_COMPETENCE);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_CONFIDENTIALITY);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_CONNECTIVITY);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_CONTROL);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_DEFAULT_TW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_EXPLOIT_TW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_EXTRINSIC_ATW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_EXTRINSIC_AUTW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_EXTRINSIC_CTW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_EXTRINSIC_ITW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_EXTRINSIC_MTW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_EXTRINSIC_QITW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_EXTRINSIC_UTW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_EXTRINSIC_VATW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_EXTRINSIC_VLTW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_EXTRINSIC_VNTW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_EXTRINSIC_WTW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_EXTRINSIC_XSTW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_EXTRINSIC_TW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_INTRINSIC_TW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_NETWORK_CONTROL);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_NETWORK_USER_TW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_PROXY_USER_TW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_RELIABILITY);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_RESOURCE_TW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_SERVICE_TW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_TIMELINESS);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_TRUST);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOSS_OF_USER_TW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_BANDWIDTH_UNMANAGED);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_CLIENT_IMPERSONATION);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_COMMS_SNOOPABLE);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_CONNECTIONS_ALLOWED);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_DEPUTY_CONFUSION);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_IN_SERVICE);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOCAL_LOSS_OF_CONTROL);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_LOCAL_LOSS_OF_USER_TW);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_MALWARE_INFECTION);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_NETWORK_SPOOFING);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_NOT_DECRYPTED);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_NOT_ENCRYPTED);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_OVERLOADED);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_PHYSICAL_BREACH);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_PHYSICAL_INTRUSION);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_PHYSICAL_SHUTDOWN);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_SERVICE_CHANNELS_ALLOWED);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_SERVICE_IMPERSONATION);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_THEFT);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_THEFT_OF_CONTROL);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_TOTAL_LOAD);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_TROJAN_INSERTION);
		addEEnumLiteral(misbehaviourKindEEnum, MisbehaviourKind.MS_VULNERABILITY_DISCOVERED);

		initEEnum(impactLevelKindEEnum, ImpactLevelKind.class, "ImpactLevelKind");
		addEEnumLiteral(impactLevelKindEEnum, ImpactLevelKind.NEGLIGIBLE);
		addEEnumLiteral(impactLevelKindEEnum, ImpactLevelKind.VERY_LOW);
		addEEnumLiteral(impactLevelKindEEnum, ImpactLevelKind.LOW);
		addEEnumLiteral(impactLevelKindEEnum, ImpactLevelKind.MEDIUM);
		addEEnumLiteral(impactLevelKindEEnum, ImpactLevelKind.HIGH);
		addEEnumLiteral(impactLevelKindEEnum, ImpactLevelKind.VERY_HIGH);

		initEEnum(twasKindEEnum, TWASKind.class, "TWASKind");
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_ANON_USER_TW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_ASTUTENESS);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_AUTHENTICITY);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_AVAILABILITY);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_BANDWIDTH_MANAGED);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_BENEVOLENCE);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_CAPACITY);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_CHANNEL_CONFIDENTIALITY);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_CLIENT_AUTHENTICITY);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_CLIENT_TW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_COMPETENCE);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_CONFIDENTIALITY);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_CONTROL);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_DECRYPTED);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_DEFAULT_TW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_DEPUTY_USER_TW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_ENCRYPTED);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_EXPLOIT_TW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_EXTRINSIC_ATW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_EXTRINSIC_AUTW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_EXTRINSIC_CTW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_EXTRINSIC_ITW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_EXTRINSIC_MTW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_EXTRINSIC_QITW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_EXTRINSIC_TW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_EXTRINSIC_UTW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_EXTRINSIC_VATW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_EXTRINSIC_VLTW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_EXTRINSIC_VNTW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_EXTRINSIC_WTW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_EXTRINSIC_XSTW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_HEALTH);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_INTEGRITY);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_INTRINSIC_TW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_NETWORK_AUTHENTICITY);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_NETWORK_CONTROL);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_NETWORK_USER_TW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_OCCUPANT_TW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_OUT_OF_SERVICE);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_OWNER_CONTROL);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_PHYSICAL_CONTROL);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_POSSESSION);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_PROXY_USER_TW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_RELIABILITY);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_RESOURCE_TW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_SERVICE_AUTHENTICITY);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_SERVICE_TW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_TIMELINESS);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_TROJAN_TW);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_TRUST);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_UNDERLOAD);
		addEEnumLiteral(twasKindEEnum, TWASKind.TWAS_USER_TW);

		initEEnum(trustworthinessLevelKindEEnum, TrustworthinessLevelKind.class, "TrustworthinessLevelKind");
		addEEnumLiteral(trustworthinessLevelKindEEnum, TrustworthinessLevelKind.VERY_LOW);
		addEEnumLiteral(trustworthinessLevelKindEEnum, TrustworthinessLevelKind.LOW);
		addEEnumLiteral(trustworthinessLevelKindEEnum, TrustworthinessLevelKind.MEDIUM);
		addEEnumLiteral(trustworthinessLevelKindEEnum, TrustworthinessLevelKind.HIGH);
		addEEnumLiteral(trustworthinessLevelKindEEnum, TrustworthinessLevelKind.VERY_HIGH);
		addEEnumLiteral(trustworthinessLevelKindEEnum, TrustworthinessLevelKind.SAFE);

		initEEnum(controlSetKindEEnum, ControlSetKind.class, "ControlSetKind");
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_ACCESS_CONTROL);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_ACCESS_KEY);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_ACCESS_POLICY);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_ADDRESS_RESERVATION);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_ADDRESS_WHITELISTING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_ANTI_MALWARE);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_APPLICATION_FW);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_AUTHENTICATION_LIMITS);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_AUTO_DATA_GOVERNANCE);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_AUTO_PROVISIONING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_BANDWIDTH_MANAGEMENT);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_BASIC_SECURITY_TRAINING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_BIOMETRIC_ID);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_BIOMETRIC_ID_VERIFIER);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_BIOMETRIC_LOCK);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_BREAK_THE_GLASS);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_CHIP_AND_PIN_CARD);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_CHIP_AND_PIN_LOCK);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_CHIP_AND_PIN_VERIFIER);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_CLEAR_DEPUTY);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_CLUSTERING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_CONSENT_ENFORCEMENT);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_CONSENT_INTERFACE);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_CONSENT_MANAGEMENT);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_CONTINUOUS_AUTH_N);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_CONTINUOUS_AUTH_NID);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_CONTINUOUS_AUTH_VERIFIER);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_CONTINUOUS_OCCUPATION);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CSD_DO_SFILTERING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_DEVICE_CERTIFICATION);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_DISABLE_CLIENT_ACCESS);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_DISABLE_INTERFACE);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_DISABLE_MESH_ROUTING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_DISABLE_NETWORK);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_DISABLE_NETWORK_PROVISION);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_DISABLE_SERVICE_ACCESS);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_DISABLE_SERVICE_CHANNEL);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_DISABLE_TETHERING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_DISABLED_DATA_FLOW);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_DISABLED_HOST);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_DISABLED_PROCESS);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_ENCRYPTED_COMMS);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_ENCRYPTED_PROCESSING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_ENCRYPTION);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CSFW_BLOCK);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_FORMAL_VERIFICATION);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CSGDPR_COMPLIANCE_TRAINING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CSGDPR_GOVERNANCE);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CSGDPR_PRIVACY_SHIELD);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_HOMOMORPHIC_ENCRYPTION);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_HOST_ENCRYPTION);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_HOST_MONITORING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_IGNORE_PHYSICAL_THREATS);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_IMPERSONAL_DATA);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_INCLUDE_PHYSICAL_THREATS);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_INDEPENDENT_INSTANCES);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_INFERRED_DATA_ASSET);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_INTEGRITY_PROTECTION);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_KEY_MANAGEMENT);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_LEGAL_COMPETENCE_CHECK);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_LEGAL_GUARDIAN_CONSENT);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_LOAD_MONITORING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_LOGGING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_LOW_PRIORITY);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_MANUAL_ACTION_TAKEN);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_MANUAL_INTERVENTION);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_MULTIPLE_CELL_NIC);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_MULTIPLE_WI_FI_NIC);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_MULTIPLE_WIRED_NIC);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_ONE_TIME_KEY);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_ONE_TIME_KEY_VERIFIER);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_OUT_OF_BAND_KEY);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_OUT_OF_BAND_KEY_VERIFIER);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_PARQUET_ENCRYPTION);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_PASSWORD);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_PASSWORD_QUALITY_CHECK);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_PASSWORD_RESET);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_PASSWORD_STORE);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_PASSWORD_VERIFIER);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_PENETRATION_TESTING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_PERSONAL_DEVICE);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_PHYSICAL_CHECKS);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_PHYSICAL_DEVICE_PROTECTION);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_PHYSICAL_ID);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_PHYSICAL_ID_VERIFIER);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_PHYSICAL_KEY);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_PHYSICAL_LOCK);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_PHYSICAL_PATROLS);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_PHYSICALLY_OBSERVABLE);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_PROCESS_MONITORING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_REMOTE_WIPING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_REPLICATION);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_RESTRICTED_SHELL);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CSSIM);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CSSLA);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CSSLA_ENFORCEMENT);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SAFE_CONTROL_MODE);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SAFE_CONTROL_SETTING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SAFE_IO_TCONTROLLER);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SAFETY_TRAINING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SCREEN_LOCK);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SCREENED);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SCREENING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SECURE_BIOS);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SECURE_CONFIG);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SECURE_ENCLAVE);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SECURE_EXECUTION);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SECURE_LOCATION);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SECURITY_TRAINING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SHARED_KEY);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SHARED_KEY_VERIFIER);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SIMPLE_SECURE_PAIRING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SOFTWARE_CERTIFICATION);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SOFTWARE_PATCHED);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SOFTWARE_PATCHING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SOFTWARE_TESTING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SPAM_FILTERING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_STATIC_DATA);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SUBJECT_TO_GDPR);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SUSPEND_CORRUPT_DATA_FLOW);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SUSPEND_EXCESSIVE_CLIENT_ACCESS);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SUSPEND_INFECTED_HOST);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SUSPEND_INFECTED_PROCESS);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SUSPEND_INSECURE_SERVICE_CHANNEL);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SUSPEND_OUTBOUND_FLOW);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SUSPEND_SENSITIVE_DATA_FLOW);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SUSPEND_UNAUTHENTIC_CLIENT_ACCESS);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SUSPEND_UNRELIABLE_CONTROLLER);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SUSPEND_UNTRUSTWORTHY_CLIENT_ACCESS);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SUSPEND_VULNERABLE_HOST);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SUSPEND_VULNERABLE_SERVICE);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SUSPEND_VULNERABLE_SERVICE_CHANNEL);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_SYSTEM_SECURITY_TRAINING);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CSTLS);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_TEAM_LEADERSHIP);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_TEAM_ROLE);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_UNMANAGED);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_USES_NO_EMAIL);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CS_VITAL_INTERESTS);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CSX509);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CSX509_CLIENT_VERIFIER);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CSX509_SERVICE_VERIFIER);
		addEEnumLiteral(controlSetKindEEnum, ControlSetKind.CSXSS_SANITISATION);

		initEEnum(networkDomainKindEEnum, NetworkDomainKind.class, "NetworkDomainKind");
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ABOVE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ACCESS_FROM);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ACCESS_FROM_CLIENT);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ACCESS_INTERRUPTED);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ACCESS_TO);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ACCESS_TO_SERVICE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ACCESS_UNINTERRUPTED);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ACCESS_VIA);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ACCESSES_FIELD);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ACCESSES_SERVICE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ACCESSIBLE_FROM);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ACCESSIBLE_VIA);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.AMENDS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.AMENDS_CONTROLLER);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.AMENDS_DATA);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.AMENDS_SENSOR);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.APPENDS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ASSERTED_AMENDS_DATA);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ASSERTED_INPUTS_DATA);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ASSERTED_VIEWS_DATA);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.AT_HOST);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ATTACK_PATH_FROM);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ATTACK_PATH_VIA);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.BLOCKED_PATH);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.BLOCKED_SEGMENT);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CAN_ACCESS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CAN_GET_KEYS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CAN_READ);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CAN_WRITE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CHANNEL_FROM);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CHANNEL_TO);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CHANNEL_TRIED);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CHANNEL_VIA);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CONNECTED_TO);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CONNECTS_DATA);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CONNECTS_FROM);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CONNECTS_TO);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CONTAINS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CONTAINS_FIELD);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CONTROLLED_BY);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CONTROLS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CONTROLS_CHANNEL);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CONTROLS_SENSOR);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CONTROLS_THING);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.COPY_OF);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CREATES);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CRUDC);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CRUDD);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CRUDR);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.CRUDU);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.DATA_CHANNEL_END);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.DATA_CHANNEL_FOR);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.DATA_CHANNEL_FROM);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.DATA_CHANNEL_TO);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.DATA_PATH_END);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.DATA_PATH_FOR);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.DATA_PATH_TO);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.DATA_PATH_VISITS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ENABLES_ACCESS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ENABLES_USER_ACCESS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ENABLES_USER_INPUT);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ENABLES_USER_OUTPUT);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.ENABLES_USER_UPDATE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.END);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.EXTENDS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.EXTENDS_DC);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.EXTENDS_DP);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.EXTENDS_FWD_FLOW);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.EXTENDS_REV_FLOW);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FLOWS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FLOWS_FROM);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FLOWS_FROM_DP);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FLOWS_FROM_IN);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FLOWS_IN);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FLOWS_OUT);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FLOWS_TO);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FLOWS_TO_DP);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FLOWS_TO_IN);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FLOWS_VIA);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FLOWS_VIA_CS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FLOWS_VIA_CHANNEL);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FLOWS_VIA_PROCESS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FLOWS_VIA_SC);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FROM);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FROM_INTERFACE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FROM_PHYSICAL_HOST);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FROM_PHYSICAL_INTERFACE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FROM_PROC);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FROM_SOURCE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FROM_SPACE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FROM_SUBNET);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FULFILS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FWD_PATH);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.FWD_RELAY);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.HANDLES);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.HAS_CLI);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.HAS_CONTROLLER);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.HAS_EMAIL);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.HAS_PHYSICAL_HOST);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.HOSTS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IGNORES_FIELD);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IMPERSONAL_DEVICE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IMPLEMENTS_AN);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IMPLEMENTS_CN);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IMPLEMENTS_HS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.INCLUDES_FIELD);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.INDIRECT_AUTH_Z);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.INPUTS_DATA);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.INTERACTS_REMOTELY_WITH);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.INTERACTS_WITH);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.INTERACTS_WITH_DATA);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_ABSTRACT_SUBNET);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_ADULT);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_CLUSTER);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_CONTAINER);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_DEST);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_HOST_LAN);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_HOTSPOT);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_INTERNET);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_LN_S);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_LOCAL_SUBNET);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_MHC);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_MOBILE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_NOWHERE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_PERSONAL_DEVICE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_POD);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_POOL);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_PROXY);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_ROUTER);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_SCALABLE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_SOURCE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_SPAM);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_TRIVIAL);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.IS_WORLD);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.LAST_INTERFACE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.LOCATED_IN);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.MANAGED_BY);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.MANAGES);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.MAY_BE_IN);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.NEEDS_FIELD);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.NO_AUTH_N);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.NO_DU);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.NO_DX);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.OPERATES);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.OVERLAYS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.PENDS_AT);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.PVIA);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.PAIRS_VIA_BLUETOOTH);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.PAIRS_VIA_USB);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.PATH_TO);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.POLLS_SENSOR);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.POSS_DATA_DEST);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.POSS_REV_PATH);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.PROCESSES);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.PROPAGATES_TO);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.PROVIDED_BY);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.PROVISIONED_BY);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.PROXY_AUTH_N);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.READS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.READS_SENSOR);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.RECEIVES);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.RECEIVES_FROM_SENSOR);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.RELATES_TO);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.RELAYS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.RELAYS_ACCESS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.RESPONSIBLE_FOR);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.REV_PATH);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.REV_RELAY);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.RUNS_IN);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.SENSES);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.SERVES);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.SHARES_CREDENTIALS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.SOURCE_DIRECT);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.SOURCE_VIA_NAT);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.START);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.STORES);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.STORES_COPY);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.SUBJECT_TO);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.TO);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.TO_INTERFACE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.TO_PHYSICAL_HOST);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.TO_PHYSICAL_INTERFACE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.TO_PROC);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.TO_SPACE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.TRAVERSES);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.UPDATES);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.UPDATES_CONTROLLER);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.UPDATES_SENSOR);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.USED_BY);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.USED_FOR);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.USES);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.USES_AS_PROXY);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.USES_DATA_PATH);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.USES_FOR_AUTH);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.USES_FOR_AUTH_Z);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.USES_INDIRECTLY);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.USES_LOGICAL_ROUTE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.USES_PHYSICAL_ROUTE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.USES_PHYSICAL_SUBNET);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.USES_REMOTELY);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.USES_SERVICE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.USES_VIA_DEPUTY);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.USES_VIA_PROXY);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.USES_VIA_RAS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.VALIDATES_CHANNEL);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.VIA);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.VIA_HOST_CHANNEL);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.VIA_INTERFACE);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.VIA_PHYSICAL_PATH);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.VIA_PHYSICAL_SUBNET);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.VIA_PROXY);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.VIA_SHARED_CREDENTIALS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.VIA_SUBNET);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.VIA_VIRTUAL_CHANNEL);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.VIEWS_DATA);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.VISITS);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.VISITS_GATEWAY);
		addEEnumLiteral(networkDomainKindEEnum, NetworkDomainKind.WORKS_FOR);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfAccessibility"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfAnonUserTW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfAstuteness"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfAuthenticity"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfIntegrity"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfAvailability"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfBenevolence"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfCapacity"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(8),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfClientTW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(9),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfCompetence"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(10),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfConfidentiality"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(11),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfConnectivity"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(12),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfControl"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(13),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfDefaultTW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(14),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfExploitTW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(15),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfExtrinsic-A-TW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(16),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfExtrinsic-AU-TW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(17),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfExtrinsic-C-TW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(18),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfExtrinsic-I-TW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(19),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfExtrinsic-M-TW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(20),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfExtrinsic-QI-TW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(21),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfExtrinsic-U-TW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(22),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfExtrinsic-VA-TW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(23),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfExtrinsic-VL-TW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(24),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfExtrinsic-VN-TW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(25),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfExtrinsic-W-TW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(26),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfExtrinsic-XS-TW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(27),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfExtrinsicTW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(28),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfIntrinsicTW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(29),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfNetworkControl"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(30),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfNetworkUserTW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(31),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfProxyUserTW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(32),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfReliability"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(33),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfResourceTW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(34),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfServiceTW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(35),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfTimeliness"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(36),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfTrust"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(37),
		   source,
		   new String[] {
			   "originalName", "MS-LossOfUserTW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(38),
		   source,
		   new String[] {
			   "originalName", "MS-BandwidthUnmanaged"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(39),
		   source,
		   new String[] {
			   "originalName", "MS-ClientImpersonation"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(40),
		   source,
		   new String[] {
			   "originalName", "MS-CommsSnoopable"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(41),
		   source,
		   new String[] {
			   "originalName", "MS-ConnectionsAllowed"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(42),
		   source,
		   new String[] {
			   "originalName", "MS-DeputyConfusion"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(43),
		   source,
		   new String[] {
			   "originalName", "MS-InService"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(44),
		   source,
		   new String[] {
			   "originalName", "MS-LocalLossOfControl"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(45),
		   source,
		   new String[] {
			   "originalName", "MS-LocalLossOfUserTW"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(46),
		   source,
		   new String[] {
			   "originalName", "MS-MalwareInfection"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(47),
		   source,
		   new String[] {
			   "originalName", "MS-NetworkSpoofing"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(48),
		   source,
		   new String[] {
			   "originalName", "MS-NotDecrypted"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(49),
		   source,
		   new String[] {
			   "originalName", "MS-NotEncrypted"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(50),
		   source,
		   new String[] {
			   "originalName", "MS-Overloaded"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(51),
		   source,
		   new String[] {
			   "originalName", "MS-PhysicalBreach"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(52),
		   source,
		   new String[] {
			   "originalName", "MS-PhysicalIntrusion"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(53),
		   source,
		   new String[] {
			   "originalName", "MS-PhysicalShutdown"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(54),
		   source,
		   new String[] {
			   "originalName", "MS-ServiceChannelsAllowed"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(55),
		   source,
		   new String[] {
			   "originalName", "MS-ServiceImpersonation"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(56),
		   source,
		   new String[] {
			   "originalName", "MS-Theft"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(57),
		   source,
		   new String[] {
			   "originalName", "MS-TheftOfControl"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(58),
		   source,
		   new String[] {
			   "originalName", "MS-TotalLoad"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(59),
		   source,
		   new String[] {
			   "originalName", "MS-TrojanInsertion"
		   });
		addAnnotation
		  (misbehaviourKindEEnum.getELiterals().get(60),
		   source,
		   new String[] {
			   "originalName", "MS-VulnerabilityDiscovered"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "originalName", "TWAS-AnonUserTW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "originalName", "TWAS-Astuteness"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "originalName", "TWAS-Authenticity"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "originalName", "TWAS-Availability"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "originalName", "TWAS-BandwidthManaged"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "originalName", "TWAS-Benevolence"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "originalName", "TWAS-Capacity"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "originalName", "TWAS-ChannelConfidentiality"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(8),
		   source,
		   new String[] {
			   "originalName", "TWAS-ClientAuthenticity"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(9),
		   source,
		   new String[] {
			   "originalName", "TWAS-ClientTW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(10),
		   source,
		   new String[] {
			   "originalName", "TWAS-Competence"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(11),
		   source,
		   new String[] {
			   "originalName", "TWAS-Confidentiality"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(12),
		   source,
		   new String[] {
			   "originalName", "TWAS-Control"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(13),
		   source,
		   new String[] {
			   "originalName", "TWAS-Decrypted"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(14),
		   source,
		   new String[] {
			   "originalName", "TWAS-DefaultTW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(15),
		   source,
		   new String[] {
			   "originalName", "TWAS-DeputyUserTW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(16),
		   source,
		   new String[] {
			   "originalName", "TWAS-Encrypted"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(17),
		   source,
		   new String[] {
			   "originalName", "TWAS-ExploitTW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(18),
		   source,
		   new String[] {
			   "originalName", "TWAS-Extrinsic-A-TW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(19),
		   source,
		   new String[] {
			   "originalName", "TWAS-Extrinsic-AU-TW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(20),
		   source,
		   new String[] {
			   "originalName", "TWAS-Extrinsic-C-TW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(21),
		   source,
		   new String[] {
			   "originalName", "TWAS-Extrinsic-I-TW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(22),
		   source,
		   new String[] {
			   "originalName", "TWAS-Extrinsic-M-TW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(23),
		   source,
		   new String[] {
			   "originalName", "TWAS-Extrinsic-QI-TW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(24),
		   source,
		   new String[] {
			   "originalName", "TWAS-Extrinsic-TW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(25),
		   source,
		   new String[] {
			   "originalName", "TWAS-Extrinsic-U-TW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(26),
		   source,
		   new String[] {
			   "originalName", "TWAS-Extrinsic-VA-TW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(27),
		   source,
		   new String[] {
			   "originalName", "TWAS-Extrinsic-VL-TW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(28),
		   source,
		   new String[] {
			   "originalName", "TWAS-Extrinsic-VN-TW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(29),
		   source,
		   new String[] {
			   "originalName", "TWAS-Extrinsic-W-TW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(30),
		   source,
		   new String[] {
			   "originalName", "TWAS-Extrinsic-XS-TW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(31),
		   source,
		   new String[] {
			   "originalName", "TWAS-Health"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(32),
		   source,
		   new String[] {
			   "originalName", "TWAS-Integrity"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(33),
		   source,
		   new String[] {
			   "originalName", "TWAS-IntrinsicTW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(34),
		   source,
		   new String[] {
			   "originalName", "TWAS-NetworkAuthenticity"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(35),
		   source,
		   new String[] {
			   "originalName", "TWAS-NetworkControl"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(36),
		   source,
		   new String[] {
			   "originalName", "TWAS-NetworkUserTW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(37),
		   source,
		   new String[] {
			   "originalName", "TWAS-OccupantTW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(38),
		   source,
		   new String[] {
			   "originalName", "TWAS-OutOfService"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(39),
		   source,
		   new String[] {
			   "originalName", "TWAS-OwnerControl"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(40),
		   source,
		   new String[] {
			   "originalName", "TWAS-PhysicalControl"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(41),
		   source,
		   new String[] {
			   "originalName", "TWAS-Possession"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(42),
		   source,
		   new String[] {
			   "originalName", "TWAS-ProxyUserTW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(43),
		   source,
		   new String[] {
			   "originalName", "TWAS-Reliability"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(44),
		   source,
		   new String[] {
			   "originalName", "TWAS-ResourceTW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(45),
		   source,
		   new String[] {
			   "originalName", "TWAS-ServiceAuthenticity"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(46),
		   source,
		   new String[] {
			   "originalName", "TWAS-ServiceTW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(47),
		   source,
		   new String[] {
			   "originalName", "TWAS-Timeliness"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(48),
		   source,
		   new String[] {
			   "originalName", "TWAS-TrojanTW"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(49),
		   source,
		   new String[] {
			   "originalName", "TWAS-Trust"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(50),
		   source,
		   new String[] {
			   "originalName", "TWAS-Underload"
		   });
		addAnnotation
		  (twasKindEEnum.getELiterals().get(51),
		   source,
		   new String[] {
			   "originalName", "TWAS-UserTW"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "originalName", "CS-AccessControl"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "originalName", "CS-AccessKey"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "originalName", "CS-AccessPolicy"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "originalName", "CS-AddressReservation"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "originalName", "CS-AddressWhitelisting"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "originalName", "CS-AntiMalware"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "originalName", "CS-ApplicationFW"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "originalName", "CS-AuthenticationLimits"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(8),
		   source,
		   new String[] {
			   "originalName", "CS-AutoDataGovernance"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(9),
		   source,
		   new String[] {
			   "originalName", "CS-AutoProvisioning"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(10),
		   source,
		   new String[] {
			   "originalName", "CS-BandwidthManagement"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(11),
		   source,
		   new String[] {
			   "originalName", "CS-BasicSecurityTraining"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(12),
		   source,
		   new String[] {
			   "originalName", "CS-BiometricID"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(13),
		   source,
		   new String[] {
			   "originalName", "CS-BiometricIDVerifier"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(14),
		   source,
		   new String[] {
			   "originalName", "CS-BiometricLock"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(15),
		   source,
		   new String[] {
			   "originalName", "CS-BreakTheGlass"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(16),
		   source,
		   new String[] {
			   "originalName", "CS-ChipAndPINCard"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(17),
		   source,
		   new String[] {
			   "originalName", "CS-ChipAndPINLock"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(18),
		   source,
		   new String[] {
			   "originalName", "CS-ChipAndPINVerifier"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(19),
		   source,
		   new String[] {
			   "originalName", "CS-ClearDeputy"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(20),
		   source,
		   new String[] {
			   "originalName", "CS-Clustering"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(21),
		   source,
		   new String[] {
			   "originalName", "CS-ConsentEnforcement"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(22),
		   source,
		   new String[] {
			   "originalName", "CS-ConsentInterface"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(23),
		   source,
		   new String[] {
			   "originalName", "CS-ConsentManagement"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(24),
		   source,
		   new String[] {
			   "originalName", "CS-ContinuousAuthN"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(25),
		   source,
		   new String[] {
			   "originalName", "CS-ContinuousAuthNID"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(26),
		   source,
		   new String[] {
			   "originalName", "CS-ContinuousAuthVerifier"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(27),
		   source,
		   new String[] {
			   "originalName", "CS-ContinuousOccupation"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(28),
		   source,
		   new String[] {
			   "originalName", "CS-DDoSFiltering"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(29),
		   source,
		   new String[] {
			   "originalName", "CS-DeviceCertification"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(30),
		   source,
		   new String[] {
			   "originalName", "CS-DisableClientAccess"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(31),
		   source,
		   new String[] {
			   "originalName", "CS-DisableInterface"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(32),
		   source,
		   new String[] {
			   "originalName", "CS-DisableMeshRouting"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(33),
		   source,
		   new String[] {
			   "originalName", "CS-DisableNetwork"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(34),
		   source,
		   new String[] {
			   "originalName", "CS-DisableNetworkProvision"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(35),
		   source,
		   new String[] {
			   "originalName", "CS-DisableServiceAccess"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(36),
		   source,
		   new String[] {
			   "originalName", "CS-DisableServiceChannel"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(37),
		   source,
		   new String[] {
			   "originalName", "CS-DisableTethering"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(38),
		   source,
		   new String[] {
			   "originalName", "CS-DisabledDataFlow"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(39),
		   source,
		   new String[] {
			   "originalName", "CS-DisabledHost"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(40),
		   source,
		   new String[] {
			   "originalName", "CS-DisabledProcess"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(41),
		   source,
		   new String[] {
			   "originalName", "CS-EncryptedComms"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(42),
		   source,
		   new String[] {
			   "originalName", "CS-EncryptedProcessing"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(43),
		   source,
		   new String[] {
			   "originalName", "CS-Encryption"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(44),
		   source,
		   new String[] {
			   "originalName", "CS-FWBlock"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(45),
		   source,
		   new String[] {
			   "originalName", "CS-FormalVerification"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(46),
		   source,
		   new String[] {
			   "originalName", "CS-GDPRComplianceTraining"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(47),
		   source,
		   new String[] {
			   "originalName", "CS-GDPRGovernance"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(48),
		   source,
		   new String[] {
			   "originalName", "CS-GDPRPrivacyShield"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(49),
		   source,
		   new String[] {
			   "originalName", "CS-HomomorphicEncryption"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(50),
		   source,
		   new String[] {
			   "originalName", "CS-HostEncryption"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(51),
		   source,
		   new String[] {
			   "originalName", "CS-HostMonitoring"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(52),
		   source,
		   new String[] {
			   "originalName", "CS-IgnorePhysicalThreats"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(53),
		   source,
		   new String[] {
			   "originalName", "CS-ImpersonalData"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(54),
		   source,
		   new String[] {
			   "originalName", "CS-IncludePhysicalThreats"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(55),
		   source,
		   new String[] {
			   "originalName", "CS-IndependentInstances"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(56),
		   source,
		   new String[] {
			   "originalName", "CS-InferredDataAsset"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(57),
		   source,
		   new String[] {
			   "originalName", "CS-IntegrityProtection"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(58),
		   source,
		   new String[] {
			   "originalName", "CS-KeyManagement"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(59),
		   source,
		   new String[] {
			   "originalName", "CS-LegalCompetenceCheck"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(60),
		   source,
		   new String[] {
			   "originalName", "CS-LegalGuardianConsent"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(61),
		   source,
		   new String[] {
			   "originalName", "CS-LoadMonitoring"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(62),
		   source,
		   new String[] {
			   "originalName", "CS-Logging"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(63),
		   source,
		   new String[] {
			   "originalName", "CS-LowPriority"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(64),
		   source,
		   new String[] {
			   "originalName", "CS-ManualActionTaken"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(65),
		   source,
		   new String[] {
			   "originalName", "CS-ManualIntervention"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(66),
		   source,
		   new String[] {
			   "originalName", "CS-MultipleCellNIC"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(67),
		   source,
		   new String[] {
			   "originalName", "CS-MultipleWiFiNIC"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(68),
		   source,
		   new String[] {
			   "originalName", "CS-MultipleWiredNIC"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(69),
		   source,
		   new String[] {
			   "originalName", "CS-OneTimeKey"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(70),
		   source,
		   new String[] {
			   "originalName", "CS-OneTimeKeyVerifier"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(71),
		   source,
		   new String[] {
			   "originalName", "CS-OutOfBandKey"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(72),
		   source,
		   new String[] {
			   "originalName", "CS-OutOfBandKeyVerifier"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(73),
		   source,
		   new String[] {
			   "originalName", "CS-ParquetEncryption"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(74),
		   source,
		   new String[] {
			   "originalName", "CS-Password"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(75),
		   source,
		   new String[] {
			   "originalName", "CS-PasswordQualityCheck"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(76),
		   source,
		   new String[] {
			   "originalName", "CS-PasswordReset"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(77),
		   source,
		   new String[] {
			   "originalName", "CS-PasswordStore"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(78),
		   source,
		   new String[] {
			   "originalName", "CS-PasswordVerifier"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(79),
		   source,
		   new String[] {
			   "originalName", "CS-PenetrationTesting"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(80),
		   source,
		   new String[] {
			   "originalName", "CS-PersonalDevice"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(81),
		   source,
		   new String[] {
			   "originalName", "CS-PhysicalChecks"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(82),
		   source,
		   new String[] {
			   "originalName", "CS-PhysicalDeviceProtection"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(83),
		   source,
		   new String[] {
			   "originalName", "CS-PhysicalID"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(84),
		   source,
		   new String[] {
			   "originalName", "CS-PhysicalIDVerifier"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(85),
		   source,
		   new String[] {
			   "originalName", "CS-PhysicalKey"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(86),
		   source,
		   new String[] {
			   "originalName", "CS-PhysicalLock"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(87),
		   source,
		   new String[] {
			   "originalName", "CS-PhysicalPatrols"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(88),
		   source,
		   new String[] {
			   "originalName", "CS-PhysicallyObservable"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(89),
		   source,
		   new String[] {
			   "originalName", "CS-ProcessMonitoring"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(90),
		   source,
		   new String[] {
			   "originalName", "CS-RemoteWiping"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(91),
		   source,
		   new String[] {
			   "originalName", "CS-Replication"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(92),
		   source,
		   new String[] {
			   "originalName", "CS-RestrictedShell"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(93),
		   source,
		   new String[] {
			   "originalName", "CS-SIM"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(94),
		   source,
		   new String[] {
			   "originalName", "CS-SLA"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(95),
		   source,
		   new String[] {
			   "originalName", "CS-SLAEnforcement"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(96),
		   source,
		   new String[] {
			   "originalName", "CS-SafeControlMode"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(97),
		   source,
		   new String[] {
			   "originalName", "CS-SafeControlSetting"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(98),
		   source,
		   new String[] {
			   "originalName", "CS-SafeIoTController"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(99),
		   source,
		   new String[] {
			   "originalName", "CS-SafetyTraining"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(100),
		   source,
		   new String[] {
			   "originalName", "CS-ScreenLock"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(101),
		   source,
		   new String[] {
			   "originalName", "CS-Screened"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(102),
		   source,
		   new String[] {
			   "originalName", "CS-Screening"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(103),
		   source,
		   new String[] {
			   "originalName", "CS-SecureBIOS"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(104),
		   source,
		   new String[] {
			   "originalName", "CS-SecureConfig"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(105),
		   source,
		   new String[] {
			   "originalName", "CS-SecureEnclave"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(106),
		   source,
		   new String[] {
			   "originalName", "CS-SecureExecution"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(107),
		   source,
		   new String[] {
			   "originalName", "CS-SecureLocation"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(108),
		   source,
		   new String[] {
			   "originalName", "CS-SecurityTraining"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(109),
		   source,
		   new String[] {
			   "originalName", "CS-SharedKey"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(110),
		   source,
		   new String[] {
			   "originalName", "CS-SharedKeyVerifier"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(111),
		   source,
		   new String[] {
			   "originalName", "CS-SimpleSecurePairing"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(112),
		   source,
		   new String[] {
			   "originalName", "CS-SoftwareCertification"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(113),
		   source,
		   new String[] {
			   "originalName", "CS-SoftwarePatched"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(114),
		   source,
		   new String[] {
			   "originalName", "CS-SoftwarePatching"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(115),
		   source,
		   new String[] {
			   "originalName", "CS-SoftwareTesting"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(116),
		   source,
		   new String[] {
			   "originalName", "CS-SpamFiltering"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(117),
		   source,
		   new String[] {
			   "originalName", "CS-StaticData"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(118),
		   source,
		   new String[] {
			   "originalName", "CS-SubjectToGDPR"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(119),
		   source,
		   new String[] {
			   "originalName", "CS-SuspendCorruptDataFlow"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(120),
		   source,
		   new String[] {
			   "originalName", "CS-SuspendExcessiveClientAccess"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(121),
		   source,
		   new String[] {
			   "originalName", "CS-SuspendInfectedHost"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(122),
		   source,
		   new String[] {
			   "originalName", "CS-SuspendInfectedProcess"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(123),
		   source,
		   new String[] {
			   "originalName", "CS-SuspendInsecureServiceChannel"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(124),
		   source,
		   new String[] {
			   "originalName", "CS-SuspendOutboundFlow"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(125),
		   source,
		   new String[] {
			   "originalName", "CS-SuspendSensitiveDataFlow"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(126),
		   source,
		   new String[] {
			   "originalName", "CS-SuspendUnauthenticClientAccess"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(127),
		   source,
		   new String[] {
			   "originalName", "CS-SuspendUnreliableController"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(128),
		   source,
		   new String[] {
			   "originalName", "CS-SuspendUntrustworthyClientAccess"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(129),
		   source,
		   new String[] {
			   "originalName", "CS-SuspendVulnerableHost"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(130),
		   source,
		   new String[] {
			   "originalName", "CS-SuspendVulnerableService"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(131),
		   source,
		   new String[] {
			   "originalName", "CS-SuspendVulnerableServiceChannel"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(132),
		   source,
		   new String[] {
			   "originalName", "CS-SystemSecurityTraining"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(133),
		   source,
		   new String[] {
			   "originalName", "CS-TLS"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(134),
		   source,
		   new String[] {
			   "originalName", "CS-TeamLeadership"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(135),
		   source,
		   new String[] {
			   "originalName", "CS-TeamRole"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(136),
		   source,
		   new String[] {
			   "originalName", "CS-Unmanaged"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(137),
		   source,
		   new String[] {
			   "originalName", "CS-UsesNoEmail"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(138),
		   source,
		   new String[] {
			   "originalName", "CS-VitalInterests"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(139),
		   source,
		   new String[] {
			   "originalName", "CS-X509"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(140),
		   source,
		   new String[] {
			   "originalName", "CS-X509ClientVerifier"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(141),
		   source,
		   new String[] {
			   "originalName", "CS-X509ServiceVerifier"
		   });
		addAnnotation
		  (controlSetKindEEnum.getELiterals().get(142),
		   source,
		   new String[] {
			   "originalName", "CS-XSSSanitisation"
		   });
	}

} //TvraPackageImpl
