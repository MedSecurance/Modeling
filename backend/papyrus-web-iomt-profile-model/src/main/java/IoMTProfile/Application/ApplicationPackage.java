/**
 */
package IoMTProfile.Application;

import IoMTProfile.IoMTProfilePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see IoMTProfile.Application.ApplicationFactory
 * @model kind="package"
 * @generated
 */
public interface ApplicationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Application";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///IoMTProfile/Application.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IoMTProfile.Application";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApplicationPackage eINSTANCE = IoMTProfile.Application.impl.ApplicationPackageImpl.init();

	/**
	 * The meta object id for the '{@link IoMTProfile.Application.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoMTProfile.Application.impl.ApplicationImpl
	 * @see IoMTProfile.Application.impl.ApplicationPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__BASE_CLASS = IoMTProfilePackage.IDENTIFIABLE_ELEMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = IoMTProfilePackage.IDENTIFIABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__UID = IoMTProfilePackage.IDENTIFIABLE_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Datastore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DATASTORE = IoMTProfilePackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PERSON = IoMTProfilePackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PROXY = IoMTProfilePackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = IoMTProfilePackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___CREATE = IoMTProfilePackage.IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___RETRIEVE = IoMTProfilePackage.IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___UPDATE = IoMTProfilePackage.IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___DELETE = IoMTProfilePackage.IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = IoMTProfilePackage.IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link IoMTProfile.Application.impl.MedicalAppImpl <em>Medical App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoMTProfile.Application.impl.MedicalAppImpl
	 * @see IoMTProfile.Application.impl.ApplicationPackageImpl#getMedicalApp()
	 * @generated
	 */
	int MEDICAL_APP = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_APP__BASE_CLASS = APPLICATION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_APP__NAME = APPLICATION__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_APP__UID = APPLICATION__UID;

	/**
	 * The feature id for the '<em><b>Datastore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_APP__DATASTORE = APPLICATION__DATASTORE;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_APP__PERSON = APPLICATION__PERSON;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_APP__PROXY = APPLICATION__PROXY;

	/**
	 * The number of structural features of the '<em>Medical App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_APP_FEATURE_COUNT = APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_APP___CREATE = APPLICATION___CREATE;

	/**
	 * The operation id for the '<em>Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_APP___RETRIEVE = APPLICATION___RETRIEVE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_APP___UPDATE = APPLICATION___UPDATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_APP___DELETE = APPLICATION___DELETE;

	/**
	 * The number of operations of the '<em>Medical App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_APP_OPERATION_COUNT = APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoMTProfile.Application.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoMTProfile.Application.impl.LocationImpl
	 * @see IoMTProfile.Application.impl.ApplicationPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DEVICES = 0;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link IoMTProfile.Application.impl.PatientAppImpl <em>Patient App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoMTProfile.Application.impl.PatientAppImpl
	 * @see IoMTProfile.Application.impl.ApplicationPackageImpl#getPatientApp()
	 * @generated
	 */
	int PATIENT_APP = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_APP__BASE_CLASS = APPLICATION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_APP__NAME = APPLICATION__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_APP__UID = APPLICATION__UID;

	/**
	 * The feature id for the '<em><b>Datastore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_APP__DATASTORE = APPLICATION__DATASTORE;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_APP__PERSON = APPLICATION__PERSON;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_APP__PROXY = APPLICATION__PROXY;

	/**
	 * The number of structural features of the '<em>Patient App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_APP_FEATURE_COUNT = APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_APP___CREATE = APPLICATION___CREATE;

	/**
	 * The operation id for the '<em>Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_APP___RETRIEVE = APPLICATION___RETRIEVE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_APP___UPDATE = APPLICATION___UPDATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_APP___DELETE = APPLICATION___DELETE;

	/**
	 * The number of operations of the '<em>Patient App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_APP_OPERATION_COUNT = APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoMTProfile.Application.impl.AdministrationAppImpl <em>Administration App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoMTProfile.Application.impl.AdministrationAppImpl
	 * @see IoMTProfile.Application.impl.ApplicationPackageImpl#getAdministrationApp()
	 * @generated
	 */
	int ADMINISTRATION_APP = 4;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_APP__BASE_CLASS = APPLICATION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_APP__NAME = APPLICATION__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_APP__UID = APPLICATION__UID;

	/**
	 * The feature id for the '<em><b>Datastore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_APP__DATASTORE = APPLICATION__DATASTORE;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_APP__PERSON = APPLICATION__PERSON;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_APP__PROXY = APPLICATION__PROXY;

	/**
	 * The number of structural features of the '<em>Administration App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_APP_FEATURE_COUNT = APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_APP___CREATE = APPLICATION___CREATE;

	/**
	 * The operation id for the '<em>Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_APP___RETRIEVE = APPLICATION___RETRIEVE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_APP___UPDATE = APPLICATION___UPDATE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_APP___DELETE = APPLICATION___DELETE;

	/**
	 * The number of operations of the '<em>Administration App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_APP_OPERATION_COUNT = APPLICATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link IoMTProfile.Application.MedicalApp <em>Medical App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medical App</em>'.
	 * @see IoMTProfile.Application.MedicalApp
	 * @generated
	 */
	EClass getMedicalApp();

	/**
	 * Returns the meta object for class '{@link IoMTProfile.Application.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see IoMTProfile.Application.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the reference '{@link IoMTProfile.Application.Application#getDatastore <em>Datastore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datastore</em>'.
	 * @see IoMTProfile.Application.Application#getDatastore()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Datastore();

	/**
	 * Returns the meta object for the reference '{@link IoMTProfile.Application.Application#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see IoMTProfile.Application.Application#getPerson()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Person();

	/**
	 * Returns the meta object for the reference '{@link IoMTProfile.Application.Application#getProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Proxy</em>'.
	 * @see IoMTProfile.Application.Application#getProxy()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Proxy();

	/**
	 * Returns the meta object for the '{@link IoMTProfile.Application.Application#create() <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see IoMTProfile.Application.Application#create()
	 * @generated
	 */
	EOperation getApplication__Create();

	/**
	 * Returns the meta object for the '{@link IoMTProfile.Application.Application#retrieve() <em>Retrieve</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Retrieve</em>' operation.
	 * @see IoMTProfile.Application.Application#retrieve()
	 * @generated
	 */
	EOperation getApplication__Retrieve();

	/**
	 * Returns the meta object for the '{@link IoMTProfile.Application.Application#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see IoMTProfile.Application.Application#update()
	 * @generated
	 */
	EOperation getApplication__Update();

	/**
	 * Returns the meta object for the '{@link IoMTProfile.Application.Application#delete() <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see IoMTProfile.Application.Application#delete()
	 * @generated
	 */
	EOperation getApplication__Delete();

	/**
	 * Returns the meta object for class '{@link IoMTProfile.Application.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see IoMTProfile.Application.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the reference list '{@link IoMTProfile.Application.Location#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Devices</em>'.
	 * @see IoMTProfile.Application.Location#getDevices()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Devices();

	/**
	 * Returns the meta object for class '{@link IoMTProfile.Application.PatientApp <em>Patient App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient App</em>'.
	 * @see IoMTProfile.Application.PatientApp
	 * @generated
	 */
	EClass getPatientApp();

	/**
	 * Returns the meta object for class '{@link IoMTProfile.Application.AdministrationApp <em>Administration App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administration App</em>'.
	 * @see IoMTProfile.Application.AdministrationApp
	 * @generated
	 */
	EClass getAdministrationApp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApplicationFactory getApplicationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link IoMTProfile.Application.impl.MedicalAppImpl <em>Medical App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoMTProfile.Application.impl.MedicalAppImpl
		 * @see IoMTProfile.Application.impl.ApplicationPackageImpl#getMedicalApp()
		 * @generated
		 */
		EClass MEDICAL_APP = eINSTANCE.getMedicalApp();

		/**
		 * The meta object literal for the '{@link IoMTProfile.Application.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoMTProfile.Application.impl.ApplicationImpl
		 * @see IoMTProfile.Application.impl.ApplicationPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Datastore</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__DATASTORE = eINSTANCE.getApplication_Datastore();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__PERSON = eINSTANCE.getApplication_Person();

		/**
		 * The meta object literal for the '<em><b>Proxy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__PROXY = eINSTANCE.getApplication_Proxy();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___CREATE = eINSTANCE.getApplication__Create();

		/**
		 * The meta object literal for the '<em><b>Retrieve</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___RETRIEVE = eINSTANCE.getApplication__Retrieve();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___UPDATE = eINSTANCE.getApplication__Update();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___DELETE = eINSTANCE.getApplication__Delete();

		/**
		 * The meta object literal for the '{@link IoMTProfile.Application.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoMTProfile.Application.impl.LocationImpl
		 * @see IoMTProfile.Application.impl.ApplicationPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__DEVICES = eINSTANCE.getLocation_Devices();

		/**
		 * The meta object literal for the '{@link IoMTProfile.Application.impl.PatientAppImpl <em>Patient App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoMTProfile.Application.impl.PatientAppImpl
		 * @see IoMTProfile.Application.impl.ApplicationPackageImpl#getPatientApp()
		 * @generated
		 */
		EClass PATIENT_APP = eINSTANCE.getPatientApp();

		/**
		 * The meta object literal for the '{@link IoMTProfile.Application.impl.AdministrationAppImpl <em>Administration App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoMTProfile.Application.impl.AdministrationAppImpl
		 * @see IoMTProfile.Application.impl.ApplicationPackageImpl#getAdministrationApp()
		 * @generated
		 */
		EClass ADMINISTRATION_APP = eINSTANCE.getAdministrationApp();

	}

} //ApplicationPackage
