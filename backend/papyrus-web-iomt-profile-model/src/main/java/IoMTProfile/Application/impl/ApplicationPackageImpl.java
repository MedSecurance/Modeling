/**
 */
package IoMTProfile.Application.impl;

import IoMTProfile.Application.AdministrationApp;
import IoMTProfile.Application.Application;
import IoMTProfile.Application.ApplicationFactory;
import IoMTProfile.Application.ApplicationPackage;
import IoMTProfile.Application.Location;
import IoMTProfile.Application.MedicalApp;
import IoMTProfile.Application.PatientApp;

import IoMTProfile.External.ExternalPackage;

import IoMTProfile.External.impl.ExternalPackageImpl;

import IoMTProfile.IoMTProfilePackage;

import IoMTProfile.LAN.LANPackage;

import IoMTProfile.LAN.impl.LANPackageImpl;

import IoMTProfile.WAN.WANPackage;

import IoMTProfile.WAN.impl.WANPackageImpl;

import IoMTProfile.impl.IoMTProfilePackageImpl;

import org.eclipse.emf.ecore.EClass;
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
public class ApplicationPackageImpl extends EPackageImpl implements ApplicationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicalAppEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

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
	private EClass patientAppEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administrationAppEClass = null;

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
	 * @see IoMTProfile.Application.ApplicationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApplicationPackageImpl() {
		super(eNS_URI, ApplicationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApplicationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApplicationPackage init() {
		if (isInited) return (ApplicationPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredApplicationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ApplicationPackageImpl theApplicationPackage = registeredApplicationPackage instanceof ApplicationPackageImpl ? (ApplicationPackageImpl)registeredApplicationPackage : new ApplicationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IoMTProfilePackage.eNS_URI);
		IoMTProfilePackageImpl theIoMTProfilePackage = (IoMTProfilePackageImpl)(registeredPackage instanceof IoMTProfilePackageImpl ? registeredPackage : IoMTProfilePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WANPackage.eNS_URI);
		WANPackageImpl theWANPackage = (WANPackageImpl)(registeredPackage instanceof WANPackageImpl ? registeredPackage : WANPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LANPackage.eNS_URI);
		LANPackageImpl theLANPackage = (LANPackageImpl)(registeredPackage instanceof LANPackageImpl ? registeredPackage : LANPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExternalPackage.eNS_URI);
		ExternalPackageImpl theExternalPackage = (ExternalPackageImpl)(registeredPackage instanceof ExternalPackageImpl ? registeredPackage : ExternalPackage.eINSTANCE);

		// Create package meta-data objects
		theApplicationPackage.createPackageContents();
		theIoMTProfilePackage.createPackageContents();
		theWANPackage.createPackageContents();
		theLANPackage.createPackageContents();
		theExternalPackage.createPackageContents();

		// Initialize created meta-data
		theApplicationPackage.initializePackageContents();
		theIoMTProfilePackage.initializePackageContents();
		theWANPackage.initializePackageContents();
		theLANPackage.initializePackageContents();
		theExternalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApplicationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApplicationPackage.eNS_URI, theApplicationPackage);
		return theApplicationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicalApp() {
		return medicalAppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Datastore() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Person() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Proxy() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getApplication__Create() {
		return applicationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getApplication__Retrieve() {
		return applicationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getApplication__Update() {
		return applicationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getApplication__Delete() {
		return applicationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocation_Devices() {
		return (EReference)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatientApp() {
		return patientAppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdministrationApp() {
		return administrationAppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationFactory getApplicationFactory() {
		return (ApplicationFactory)getEFactoryInstance();
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
		medicalAppEClass = createEClass(MEDICAL_APP);

		applicationEClass = createEClass(APPLICATION);
		createEReference(applicationEClass, APPLICATION__DATASTORE);
		createEReference(applicationEClass, APPLICATION__PERSON);
		createEReference(applicationEClass, APPLICATION__PROXY);
		createEOperation(applicationEClass, APPLICATION___CREATE);
		createEOperation(applicationEClass, APPLICATION___RETRIEVE);
		createEOperation(applicationEClass, APPLICATION___UPDATE);
		createEOperation(applicationEClass, APPLICATION___DELETE);

		locationEClass = createEClass(LOCATION);
		createEReference(locationEClass, LOCATION__DEVICES);

		patientAppEClass = createEClass(PATIENT_APP);

		administrationAppEClass = createEClass(ADMINISTRATION_APP);
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
		WANPackage theWANPackage = (WANPackage)EPackage.Registry.INSTANCE.getEPackage(WANPackage.eNS_URI);
		ExternalPackage theExternalPackage = (ExternalPackage)EPackage.Registry.INSTANCE.getEPackage(ExternalPackage.eNS_URI);
		LANPackage theLANPackage = (LANPackage)EPackage.Registry.INSTANCE.getEPackage(LANPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		medicalAppEClass.getESuperTypes().add(this.getApplication());
		applicationEClass.getESuperTypes().add(theIoMTProfilePackage.getIdentifiableElement());
		patientAppEClass.getESuperTypes().add(this.getApplication());
		administrationAppEClass.getESuperTypes().add(this.getApplication());

		// Initialize classes, features, and operations; add parameters
		initEClass(medicalAppEClass, MedicalApp.class, "MedicalApp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationEClass, Application.class, "Application", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplication_Datastore(), theWANPackage.getDataStore(), theWANPackage.getDataStore_Applications(), "datastore", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getApplication_Person(), theExternalPackage.getPerson(), theExternalPackage.getPerson_Application(), "person", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getApplication_Proxy(), theWANPackage.getProxy(), theWANPackage.getProxy_Applications(), "proxy", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getApplication__Create(), null, "create", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getApplication__Retrieve(), null, "retrieve", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getApplication__Update(), null, "update", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getApplication__Delete(), null, "delete", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocation_Devices(), theLANPackage.getIoMTDevice(), theLANPackage.getIoMTDevice_Location(), "devices", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(patientAppEClass, PatientApp.class, "PatientApp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(administrationAppEClass, AdministrationApp.class, "AdministrationApp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ApplicationPackageImpl
