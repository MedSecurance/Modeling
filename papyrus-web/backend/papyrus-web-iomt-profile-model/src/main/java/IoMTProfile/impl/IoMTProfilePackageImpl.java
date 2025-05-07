/**
 */
package IoMTProfile.impl;

import IoMTProfile.Application.ApplicationPackage;

import IoMTProfile.Application.impl.ApplicationPackageImpl;

import IoMTProfile.External.ExternalPackage;

import IoMTProfile.External.impl.ExternalPackageImpl;

import IoMTProfile.GatewayType;
import IoMTProfile.IdentifiableElement;
import IoMTProfile.Interface;
import IoMTProfile.InternalFunction;
import IoMTProfile.IoMTProfileFactory;
import IoMTProfile.IoMTProfilePackage;

import IoMTProfile.LAN.LANPackage;

import IoMTProfile.LAN.impl.LANPackageImpl;

import IoMTProfile.LocalManagementApp;

import IoMTProfile.WAN.WANPackage;

import IoMTProfile.WAN.impl.WANPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
public class IoMTProfilePackageImpl extends EPackageImpl implements IoMTProfilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localManagementAppEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interfaceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gatewayTypeEEnum = null;

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
	 * @see IoMTProfile.IoMTProfilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IoMTProfilePackageImpl() {
		super(eNS_URI, IoMTProfileFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IoMTProfilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IoMTProfilePackage init() {
		if (isInited) return (IoMTProfilePackage)EPackage.Registry.INSTANCE.getEPackage(IoMTProfilePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIoMTProfilePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IoMTProfilePackageImpl theIoMTProfilePackage = registeredIoMTProfilePackage instanceof IoMTProfilePackageImpl ? (IoMTProfilePackageImpl)registeredIoMTProfilePackage : new IoMTProfilePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(registeredPackage instanceof ApplicationPackageImpl ? registeredPackage : ApplicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WANPackage.eNS_URI);
		WANPackageImpl theWANPackage = (WANPackageImpl)(registeredPackage instanceof WANPackageImpl ? registeredPackage : WANPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LANPackage.eNS_URI);
		LANPackageImpl theLANPackage = (LANPackageImpl)(registeredPackage instanceof LANPackageImpl ? registeredPackage : LANPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExternalPackage.eNS_URI);
		ExternalPackageImpl theExternalPackage = (ExternalPackageImpl)(registeredPackage instanceof ExternalPackageImpl ? registeredPackage : ExternalPackage.eINSTANCE);

		// Create package meta-data objects
		theIoMTProfilePackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theWANPackage.createPackageContents();
		theLANPackage.createPackageContents();
		theExternalPackage.createPackageContents();

		// Initialize created meta-data
		theIoMTProfilePackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theWANPackage.initializePackageContents();
		theLANPackage.initializePackageContents();
		theExternalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIoMTProfilePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IoMTProfilePackage.eNS_URI, theIoMTProfilePackage);
		return theIoMTProfilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifiableElement() {
		return identifiableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifiableElement_Base_Class() {
		return (EReference)identifiableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiableElement_Name() {
		return (EAttribute)identifiableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiableElement_Uid() {
		return (EAttribute)identifiableElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocalManagementApp() {
		return localManagementAppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocalManagementApp_Base_Class() {
		return (EReference)localManagementAppEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocalManagementApp_Proxy() {
		return (EReference)localManagementAppEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLocalManagementApp__Pairing() {
		return localManagementAppEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLocalManagementApp__Disapairing() {
		return localManagementAppEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLocalManagementApp__Create() {
		return localManagementAppEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLocalManagementApp__Retrieve() {
		return localManagementAppEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLocalManagementApp__Update() {
		return localManagementAppEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLocalManagementApp__Delete() {
		return localManagementAppEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalFunction() {
		return internalFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getInterface() {
		return interfaceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGatewayType() {
		return gatewayTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoMTProfileFactory getIoMTProfileFactory() {
		return (IoMTProfileFactory)getEFactoryInstance();
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
		identifiableElementEClass = createEClass(IDENTIFIABLE_ELEMENT);
		createEReference(identifiableElementEClass, IDENTIFIABLE_ELEMENT__BASE_CLASS);
		createEAttribute(identifiableElementEClass, IDENTIFIABLE_ELEMENT__NAME);
		createEAttribute(identifiableElementEClass, IDENTIFIABLE_ELEMENT__UID);

		localManagementAppEClass = createEClass(LOCAL_MANAGEMENT_APP);
		createEReference(localManagementAppEClass, LOCAL_MANAGEMENT_APP__BASE_CLASS);
		createEReference(localManagementAppEClass, LOCAL_MANAGEMENT_APP__PROXY);
		createEOperation(localManagementAppEClass, LOCAL_MANAGEMENT_APP___PAIRING);
		createEOperation(localManagementAppEClass, LOCAL_MANAGEMENT_APP___DISAPAIRING);
		createEOperation(localManagementAppEClass, LOCAL_MANAGEMENT_APP___CREATE);
		createEOperation(localManagementAppEClass, LOCAL_MANAGEMENT_APP___RETRIEVE);
		createEOperation(localManagementAppEClass, LOCAL_MANAGEMENT_APP___UPDATE);
		createEOperation(localManagementAppEClass, LOCAL_MANAGEMENT_APP___DELETE);

		internalFunctionEClass = createEClass(INTERNAL_FUNCTION);

		// Create enums
		interfaceEEnum = createEEnum(INTERFACE);
		gatewayTypeEEnum = createEEnum(GATEWAY_TYPE);
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
		ApplicationPackage theApplicationPackage = (ApplicationPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);
		WANPackage theWANPackage = (WANPackage)EPackage.Registry.INSTANCE.getEPackage(WANPackage.eNS_URI);
		LANPackage theLANPackage = (LANPackage)EPackage.Registry.INSTANCE.getEPackage(LANPackage.eNS_URI);
		ExternalPackage theExternalPackage = (ExternalPackage)EPackage.Registry.INSTANCE.getEPackage(ExternalPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theApplicationPackage);
		getESubpackages().add(theWANPackage);
		getESubpackages().add(theLANPackage);
		getESubpackages().add(theExternalPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		internalFunctionEClass.getESuperTypes().add(theLANPackage.getIoMTFunction());

		// Initialize classes, features, and operations; add parameters
		initEClass(identifiableElementEClass, IdentifiableElement.class, "IdentifiableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdentifiableElement_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, IdentifiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIdentifiableElement_Name(), theTypesPackage.getString(), "name", null, 1, 1, IdentifiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIdentifiableElement_Uid(), theTypesPackage.getString(), "uid", null, 1, 1, IdentifiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(localManagementAppEClass, LocalManagementApp.class, "LocalManagementApp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalManagementApp_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, LocalManagementApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalManagementApp_Proxy(), theWANPackage.getProxy(), theWANPackage.getProxy_LocalManagementApps(), "proxy", null, 1, 1, LocalManagementApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getLocalManagementApp__Pairing(), null, "pairing", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getLocalManagementApp__Disapairing(), null, "disapairing", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getLocalManagementApp__Create(), null, "create", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getLocalManagementApp__Retrieve(), null, "retrieve", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getLocalManagementApp__Update(), null, "update", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getLocalManagementApp__Delete(), null, "delete", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(internalFunctionEClass, InternalFunction.class, "InternalFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(interfaceEEnum, Interface.class, "Interface");
		addEEnumLiteral(interfaceEEnum, Interface.RFID);
		addEEnumLiteral(interfaceEEnum, Interface.BLE);
		addEEnumLiteral(interfaceEEnum, Interface.BLUE_TOOTH);
		addEEnumLiteral(interfaceEEnum, Interface.WIFI);
		addEEnumLiteral(interfaceEEnum, Interface._4G);
		addEEnumLiteral(interfaceEEnum, Interface.ETHERNET);
		addEEnumLiteral(interfaceEEnum, Interface.LO_RA);
		addEEnumLiteral(interfaceEEnum, Interface.ZWAVE);
		addEEnumLiteral(interfaceEEnum, Interface.ZIGBEE);
		addEEnumLiteral(interfaceEEnum, Interface.SERIAL);
		addEEnumLiteral(interfaceEEnum, Interface.SIX_LO_WPAN);

		initEEnum(gatewayTypeEEnum, GatewayType.class, "GatewayType");
		addEEnumLiteral(gatewayTypeEEnum, GatewayType.REST);
		addEEnumLiteral(gatewayTypeEEnum, GatewayType.MQTT);
		addEEnumLiteral(gatewayTypeEEnum, GatewayType.WEB_SOCKET);

		// Create resource
		createResource(eNS_URI);
	}

} //IoMTProfilePackageImpl
