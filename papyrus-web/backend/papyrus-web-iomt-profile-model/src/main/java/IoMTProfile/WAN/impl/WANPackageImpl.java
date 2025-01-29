/**
 */
package IoMTProfile.WAN.impl;

import IoMTProfile.Application.ApplicationPackage;

import IoMTProfile.Application.impl.ApplicationPackageImpl;

import IoMTProfile.External.ExternalPackage;

import IoMTProfile.External.impl.ExternalPackageImpl;

import IoMTProfile.IoMTProfilePackage;

import IoMTProfile.LAN.LANPackage;

import IoMTProfile.LAN.impl.LANPackageImpl;

import IoMTProfile.WAN.DataStore;
import IoMTProfile.WAN.Proxy;
import IoMTProfile.WAN.WANFactory;
import IoMTProfile.WAN.WANPackage;

import IoMTProfile.impl.IoMTProfilePackageImpl;

import org.eclipse.emf.ecore.EClass;
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
public class WANPackageImpl extends EPackageImpl implements WANPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStoreEClass = null;

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
	 * @see IoMTProfile.WAN.WANPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WANPackageImpl() {
		super(eNS_URI, WANFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WANPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WANPackage init() {
		if (isInited) return (WANPackage)EPackage.Registry.INSTANCE.getEPackage(WANPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWANPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WANPackageImpl theWANPackage = registeredWANPackage instanceof WANPackageImpl ? (WANPackageImpl)registeredWANPackage : new WANPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LANPackage.eNS_URI);
		LANPackageImpl theLANPackage = (LANPackageImpl)(registeredPackage instanceof LANPackageImpl ? registeredPackage : LANPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExternalPackage.eNS_URI);
		ExternalPackageImpl theExternalPackage = (ExternalPackageImpl)(registeredPackage instanceof ExternalPackageImpl ? registeredPackage : ExternalPackage.eINSTANCE);

		// Create package meta-data objects
		theWANPackage.createPackageContents();
		theIoMTProfilePackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theLANPackage.createPackageContents();
		theExternalPackage.createPackageContents();

		// Initialize created meta-data
		theWANPackage.initializePackageContents();
		theIoMTProfilePackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theLANPackage.initializePackageContents();
		theExternalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWANPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WANPackage.eNS_URI, theWANPackage);
		return theWANPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProxy() {
		return proxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProxy_Gateways() {
		return (EReference)proxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProxy_Datastores() {
		return (EReference)proxyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProxy_Applications() {
		return (EReference)proxyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProxy_LocalManagementApps() {
		return (EReference)proxyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataStore() {
		return dataStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataStore_Proxy() {
		return (EReference)dataStoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataStore_Applications() {
		return (EReference)dataStoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WANFactory getWANFactory() {
		return (WANFactory)getEFactoryInstance();
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
		proxyEClass = createEClass(PROXY);
		createEReference(proxyEClass, PROXY__GATEWAYS);
		createEReference(proxyEClass, PROXY__DATASTORES);
		createEReference(proxyEClass, PROXY__APPLICATIONS);
		createEReference(proxyEClass, PROXY__LOCAL_MANAGEMENT_APPS);

		dataStoreEClass = createEClass(DATA_STORE);
		createEReference(dataStoreEClass, DATA_STORE__PROXY);
		createEReference(dataStoreEClass, DATA_STORE__APPLICATIONS);
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
		LANPackage theLANPackage = (LANPackage)EPackage.Registry.INSTANCE.getEPackage(LANPackage.eNS_URI);
		ApplicationPackage theApplicationPackage = (ApplicationPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		proxyEClass.getESuperTypes().add(theIoMTProfilePackage.getIdentifiableElement());
		dataStoreEClass.getESuperTypes().add(theIoMTProfilePackage.getIdentifiableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(proxyEClass, Proxy.class, "Proxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProxy_Gateways(), theLANPackage.getGateway(), theLANPackage.getGateway_Proxy(), "gateways", null, 0, -1, Proxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProxy_Datastores(), this.getDataStore(), this.getDataStore_Proxy(), "datastores", null, 0, -1, Proxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProxy_Applications(), theApplicationPackage.getApplication(), theApplicationPackage.getApplication_Proxy(), "applications", null, 0, -1, Proxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProxy_LocalManagementApps(), theIoMTProfilePackage.getLocalManagementApp(), theIoMTProfilePackage.getLocalManagementApp_Proxy(), "localManagementApps", null, 0, -1, Proxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataStoreEClass, DataStore.class, "DataStore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataStore_Proxy(), this.getProxy(), this.getProxy_Datastores(), "proxy", null, 0, 1, DataStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataStore_Applications(), theApplicationPackage.getApplication(), theApplicationPackage.getApplication_Datastore(), "applications", null, 0, -1, DataStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //WANPackageImpl
