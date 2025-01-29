/**
 */
package IoMTProfile.LAN.impl;

import IoMTProfile.Application.ApplicationPackage;

import IoMTProfile.Application.impl.ApplicationPackageImpl;

import IoMTProfile.External.ExternalPackage;

import IoMTProfile.External.impl.ExternalPackageImpl;

import IoMTProfile.IoMTProfilePackage;

import IoMTProfile.LAN.Actuator;
import IoMTProfile.LAN.ExternalFunction;
import IoMTProfile.LAN.Gateway;
import IoMTProfile.LAN.GatewayType;
import IoMTProfile.LAN.IoMTConfiguration;
import IoMTProfile.LAN.IoMTDevice;
import IoMTProfile.LAN.IoMTFunction;
import IoMTProfile.LAN.IoMTService;
import IoMTProfile.LAN.LANFactory;
import IoMTProfile.LAN.LANPackage;
import IoMTProfile.LAN.Sensor;

import IoMTProfile.WAN.WANPackage;

import IoMTProfile.WAN.impl.WANPackageImpl;

import IoMTProfile.impl.IoMTProfilePackageImpl;

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
public class LANPackageImpl extends EPackageImpl implements LANPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioMTDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioMTConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioMTFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioMTServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayEClass = null;

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
	 * @see IoMTProfile.LAN.LANPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LANPackageImpl() {
		super(eNS_URI, LANFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LANPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LANPackage init() {
		if (isInited) return (LANPackage)EPackage.Registry.INSTANCE.getEPackage(LANPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLANPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LANPackageImpl theLANPackage = registeredLANPackage instanceof LANPackageImpl ? (LANPackageImpl)registeredLANPackage : new LANPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IoMTProfilePackage.eNS_URI);
		IoMTProfilePackageImpl theIoMTProfilePackage = (IoMTProfilePackageImpl)(registeredPackage instanceof IoMTProfilePackageImpl ? registeredPackage : IoMTProfilePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(registeredPackage instanceof ApplicationPackageImpl ? registeredPackage : ApplicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WANPackage.eNS_URI);
		WANPackageImpl theWANPackage = (WANPackageImpl)(registeredPackage instanceof WANPackageImpl ? registeredPackage : WANPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExternalPackage.eNS_URI);
		ExternalPackageImpl theExternalPackage = (ExternalPackageImpl)(registeredPackage instanceof ExternalPackageImpl ? registeredPackage : ExternalPackage.eINSTANCE);

		// Create package meta-data objects
		theLANPackage.createPackageContents();
		theIoMTProfilePackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theWANPackage.createPackageContents();
		theExternalPackage.createPackageContents();

		// Initialize created meta-data
		theLANPackage.initializePackageContents();
		theIoMTProfilePackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theWANPackage.initializePackageContents();
		theExternalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLANPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LANPackage.eNS_URI, theLANPackage);
		return theLANPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIoMTDevice() {
		return ioMTDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIoMTDevice_InternalInterface() {
		return (EAttribute)ioMTDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIoMTDevice_Configuration() {
		return (EReference)ioMTDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIoMTDevice_Location() {
		return (EReference)ioMTDeviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIoMTDevice_Functions() {
		return (EReference)ioMTDeviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIoMTDevice_Services() {
		return (EReference)ioMTDeviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIoMTDevice_Gateway() {
		return (EReference)ioMTDeviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIoMTDevice__OpenSession() {
		return ioMTDeviceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIoMTDevice__CloseSession() {
		return ioMTDeviceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIoMTConfiguration() {
		return ioMTConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIoMTConfiguration_Base_Class() {
		return (EReference)ioMTConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIoMTConfiguration_Device() {
		return (EReference)ioMTConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIoMTFunction() {
		return ioMTFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIoMTFunction_Devices() {
		return (EReference)ioMTFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIoMTService() {
		return ioMTServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIoMTService_Person() {
		return (EReference)ioMTServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIoMTService_Device() {
		return (EReference)ioMTServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalFunction() {
		return externalFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGateway() {
		return gatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGateway_Devices() {
		return (EReference)gatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGateway_InternalInterface() {
		return (EAttribute)gatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGateway_ExternalInterface() {
		return (EAttribute)gatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGateway_GatewayType() {
		return (EAttribute)gatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGateway_Proxy() {
		return (EReference)gatewayEClass.getEStructuralFeatures().get(4);
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
	public LANFactory getLANFactory() {
		return (LANFactory)getEFactoryInstance();
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
		ioMTDeviceEClass = createEClass(IO_MT_DEVICE);
		createEAttribute(ioMTDeviceEClass, IO_MT_DEVICE__INTERNAL_INTERFACE);
		createEReference(ioMTDeviceEClass, IO_MT_DEVICE__CONFIGURATION);
		createEReference(ioMTDeviceEClass, IO_MT_DEVICE__LOCATION);
		createEReference(ioMTDeviceEClass, IO_MT_DEVICE__FUNCTIONS);
		createEReference(ioMTDeviceEClass, IO_MT_DEVICE__SERVICES);
		createEReference(ioMTDeviceEClass, IO_MT_DEVICE__GATEWAY);
		createEOperation(ioMTDeviceEClass, IO_MT_DEVICE___OPEN_SESSION);
		createEOperation(ioMTDeviceEClass, IO_MT_DEVICE___CLOSE_SESSION);

		ioMTConfigurationEClass = createEClass(IO_MT_CONFIGURATION);
		createEReference(ioMTConfigurationEClass, IO_MT_CONFIGURATION__BASE_CLASS);
		createEReference(ioMTConfigurationEClass, IO_MT_CONFIGURATION__DEVICE);

		ioMTFunctionEClass = createEClass(IO_MT_FUNCTION);
		createEReference(ioMTFunctionEClass, IO_MT_FUNCTION__DEVICES);

		ioMTServiceEClass = createEClass(IO_MT_SERVICE);
		createEReference(ioMTServiceEClass, IO_MT_SERVICE__PERSON);
		createEReference(ioMTServiceEClass, IO_MT_SERVICE__DEVICE);

		externalFunctionEClass = createEClass(EXTERNAL_FUNCTION);

		actuatorEClass = createEClass(ACTUATOR);

		sensorEClass = createEClass(SENSOR);

		gatewayEClass = createEClass(GATEWAY);
		createEReference(gatewayEClass, GATEWAY__DEVICES);
		createEAttribute(gatewayEClass, GATEWAY__INTERNAL_INTERFACE);
		createEAttribute(gatewayEClass, GATEWAY__EXTERNAL_INTERFACE);
		createEAttribute(gatewayEClass, GATEWAY__GATEWAY_TYPE);
		createEReference(gatewayEClass, GATEWAY__PROXY);

		// Create enums
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
		IoMTProfilePackage theIoMTProfilePackage = (IoMTProfilePackage)EPackage.Registry.INSTANCE.getEPackage(IoMTProfilePackage.eNS_URI);
		ApplicationPackage theApplicationPackage = (ApplicationPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		ExternalPackage theExternalPackage = (ExternalPackage)EPackage.Registry.INSTANCE.getEPackage(ExternalPackage.eNS_URI);
		WANPackage theWANPackage = (WANPackage)EPackage.Registry.INSTANCE.getEPackage(WANPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ioMTDeviceEClass.getESuperTypes().add(theIoMTProfilePackage.getIdentifiableElement());
		ioMTFunctionEClass.getESuperTypes().add(theUMLPackage.getClass_());
		ioMTServiceEClass.getESuperTypes().add(theIoMTProfilePackage.getIdentifiableElement());
		externalFunctionEClass.getESuperTypes().add(this.getIoMTFunction());
		actuatorEClass.getESuperTypes().add(this.getIoMTService());
		sensorEClass.getESuperTypes().add(this.getIoMTService());
		gatewayEClass.getESuperTypes().add(theIoMTProfilePackage.getIdentifiableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(ioMTDeviceEClass, IoMTDevice.class, "IoMTDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIoMTDevice_InternalInterface(), theIoMTProfilePackage.getInterface(), "InternalInterface", null, 1, 1, IoMTDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIoMTDevice_Configuration(), this.getIoMTConfiguration(), this.getIoMTConfiguration_Device(), "configuration", null, 1, 1, IoMTDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIoMTDevice_Location(), theApplicationPackage.getLocation(), theApplicationPackage.getLocation_Devices(), "location", null, 0, 1, IoMTDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIoMTDevice_Functions(), this.getIoMTFunction(), this.getIoMTFunction_Devices(), "functions", null, 0, -1, IoMTDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIoMTDevice_Services(), this.getIoMTService(), this.getIoMTService_Device(), "services", null, 0, -1, IoMTDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIoMTDevice_Gateway(), this.getGateway(), this.getGateway_Devices(), "gateway", null, 1, 1, IoMTDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getIoMTDevice__OpenSession(), null, "openSession", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIoMTDevice__CloseSession(), null, "closeSession", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(ioMTConfigurationEClass, IoMTConfiguration.class, "IoMTConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIoMTConfiguration_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, IoMTConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIoMTConfiguration_Device(), this.getIoMTDevice(), this.getIoMTDevice_Configuration(), "device", null, 1, 1, IoMTConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ioMTFunctionEClass, IoMTFunction.class, "IoMTFunction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIoMTFunction_Devices(), this.getIoMTDevice(), this.getIoMTDevice_Functions(), "devices", null, 1, 1, IoMTFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ioMTServiceEClass, IoMTService.class, "IoMTService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIoMTService_Person(), theExternalPackage.getPerson(), theExternalPackage.getPerson_Iomtservice(), "person", null, 1, 1, IoMTService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIoMTService_Device(), this.getIoMTDevice(), this.getIoMTDevice_Services(), "device", null, 1, 1, IoMTService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(externalFunctionEClass, ExternalFunction.class, "ExternalFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gatewayEClass, Gateway.class, "Gateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGateway_Devices(), this.getIoMTDevice(), this.getIoMTDevice_Gateway(), "devices", null, 0, -1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGateway_InternalInterface(), theIoMTProfilePackage.getInterface(), "InternalInterface", null, 1, 1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGateway_ExternalInterface(), theIoMTProfilePackage.getInterface(), "ExternalInterface", null, 1, 1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGateway_GatewayType(), this.getGatewayType(), "gatewayType", null, 1, 1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGateway_Proxy(), theWANPackage.getProxy(), theWANPackage.getProxy_Gateways(), "proxy", null, 1, 1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gatewayTypeEEnum, GatewayType.class, "GatewayType");
		addEEnumLiteral(gatewayTypeEEnum, GatewayType.REST);
		addEEnumLiteral(gatewayTypeEEnum, GatewayType.MQTT);
		addEEnumLiteral(gatewayTypeEEnum, GatewayType.WEB_SOCKET);
	}

} //LANPackageImpl
