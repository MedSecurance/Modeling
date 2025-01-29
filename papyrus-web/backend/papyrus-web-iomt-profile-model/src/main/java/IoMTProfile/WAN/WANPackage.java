/**
 */
package IoMTProfile.WAN;

import IoMTProfile.IoMTProfilePackage;

import org.eclipse.emf.ecore.EClass;
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
 * @see IoMTProfile.WAN.WANFactory
 * @model kind="package"
 * @generated
 */
public interface WANPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "WAN";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///IoMTProfile/WAN.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IoMTProfile.WAN";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WANPackage eINSTANCE = IoMTProfile.WAN.impl.WANPackageImpl.init();

	/**
	 * The meta object id for the '{@link IoMTProfile.WAN.impl.ProxyImpl <em>Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoMTProfile.WAN.impl.ProxyImpl
	 * @see IoMTProfile.WAN.impl.WANPackageImpl#getProxy()
	 * @generated
	 */
	int PROXY = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__BASE_CLASS = IoMTProfilePackage.IDENTIFIABLE_ELEMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__NAME = IoMTProfilePackage.IDENTIFIABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__UID = IoMTProfilePackage.IDENTIFIABLE_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Gateways</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__GATEWAYS = IoMTProfilePackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datastores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__DATASTORES = IoMTProfilePackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__APPLICATIONS = IoMTProfilePackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Local Management Apps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__LOCAL_MANAGEMENT_APPS = IoMTProfilePackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FEATURE_COUNT = IoMTProfilePackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_OPERATION_COUNT = IoMTProfilePackage.IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoMTProfile.WAN.impl.DataStoreImpl <em>Data Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoMTProfile.WAN.impl.DataStoreImpl
	 * @see IoMTProfile.WAN.impl.WANPackageImpl#getDataStore()
	 * @generated
	 */
	int DATA_STORE = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__BASE_CLASS = IoMTProfilePackage.IDENTIFIABLE_ELEMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__NAME = IoMTProfilePackage.IDENTIFIABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__UID = IoMTProfilePackage.IDENTIFIABLE_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__PROXY = IoMTProfilePackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__APPLICATIONS = IoMTProfilePackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_FEATURE_COUNT = IoMTProfilePackage.IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_OPERATION_COUNT = IoMTProfilePackage.IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link IoMTProfile.WAN.Proxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy</em>'.
	 * @see IoMTProfile.WAN.Proxy
	 * @generated
	 */
	EClass getProxy();

	/**
	 * Returns the meta object for the reference list '{@link IoMTProfile.WAN.Proxy#getGateways <em>Gateways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gateways</em>'.
	 * @see IoMTProfile.WAN.Proxy#getGateways()
	 * @see #getProxy()
	 * @generated
	 */
	EReference getProxy_Gateways();

	/**
	 * Returns the meta object for the reference list '{@link IoMTProfile.WAN.Proxy#getDatastores <em>Datastores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Datastores</em>'.
	 * @see IoMTProfile.WAN.Proxy#getDatastores()
	 * @see #getProxy()
	 * @generated
	 */
	EReference getProxy_Datastores();

	/**
	 * Returns the meta object for the reference list '{@link IoMTProfile.WAN.Proxy#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications</em>'.
	 * @see IoMTProfile.WAN.Proxy#getApplications()
	 * @see #getProxy()
	 * @generated
	 */
	EReference getProxy_Applications();

	/**
	 * Returns the meta object for the reference list '{@link IoMTProfile.WAN.Proxy#getLocalManagementApps <em>Local Management Apps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Local Management Apps</em>'.
	 * @see IoMTProfile.WAN.Proxy#getLocalManagementApps()
	 * @see #getProxy()
	 * @generated
	 */
	EReference getProxy_LocalManagementApps();

	/**
	 * Returns the meta object for class '{@link IoMTProfile.WAN.DataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Store</em>'.
	 * @see IoMTProfile.WAN.DataStore
	 * @generated
	 */
	EClass getDataStore();

	/**
	 * Returns the meta object for the reference '{@link IoMTProfile.WAN.DataStore#getProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Proxy</em>'.
	 * @see IoMTProfile.WAN.DataStore#getProxy()
	 * @see #getDataStore()
	 * @generated
	 */
	EReference getDataStore_Proxy();

	/**
	 * Returns the meta object for the reference list '{@link IoMTProfile.WAN.DataStore#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications</em>'.
	 * @see IoMTProfile.WAN.DataStore#getApplications()
	 * @see #getDataStore()
	 * @generated
	 */
	EReference getDataStore_Applications();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WANFactory getWANFactory();

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
		 * The meta object literal for the '{@link IoMTProfile.WAN.impl.ProxyImpl <em>Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoMTProfile.WAN.impl.ProxyImpl
		 * @see IoMTProfile.WAN.impl.WANPackageImpl#getProxy()
		 * @generated
		 */
		EClass PROXY = eINSTANCE.getProxy();

		/**
		 * The meta object literal for the '<em><b>Gateways</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY__GATEWAYS = eINSTANCE.getProxy_Gateways();

		/**
		 * The meta object literal for the '<em><b>Datastores</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY__DATASTORES = eINSTANCE.getProxy_Datastores();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY__APPLICATIONS = eINSTANCE.getProxy_Applications();

		/**
		 * The meta object literal for the '<em><b>Local Management Apps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY__LOCAL_MANAGEMENT_APPS = eINSTANCE.getProxy_LocalManagementApps();

		/**
		 * The meta object literal for the '{@link IoMTProfile.WAN.impl.DataStoreImpl <em>Data Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoMTProfile.WAN.impl.DataStoreImpl
		 * @see IoMTProfile.WAN.impl.WANPackageImpl#getDataStore()
		 * @generated
		 */
		EClass DATA_STORE = eINSTANCE.getDataStore();

		/**
		 * The meta object literal for the '<em><b>Proxy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STORE__PROXY = eINSTANCE.getDataStore_Proxy();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STORE__APPLICATIONS = eINSTANCE.getDataStore_Applications();

	}

} //WANPackage
