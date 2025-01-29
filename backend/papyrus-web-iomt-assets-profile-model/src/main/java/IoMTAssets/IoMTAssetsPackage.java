/**
 */
package IoMTAssets;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see IoMTAssets.IoMTAssetsFactory
 * @model kind="package"
 * @generated
 */
public interface IoMTAssetsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "IoMTAssets";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://iomtassets";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "IoMTAssets";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    IoMTAssetsPackage eINSTANCE = IoMTAssets.impl.IoMTAssetsPackageImpl.init();

    /**
     * The meta object id for the '{@link IoMTAssets.impl.AssetImpl <em>Asset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see IoMTAssets.impl.AssetImpl
     * @see IoMTAssets.impl.IoMTAssetsPackageImpl#getAsset()
     * @generated
     */
    int ASSET = 0;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSET__KEY = 0;

    /**
     * The feature id for the '<em><b>Mission Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSET__MISSION_NAME = 1;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSET__DESCRIPTION = 2;

    /**
     * The feature id for the '<em><b>Base Class</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSET__BASE_CLASS = 3;

    /**
     * The number of structural features of the '<em>Asset</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSET_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Asset</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSET_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link IoMTAssets.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see IoMTAssets.impl.ServiceImpl
     * @see IoMTAssets.impl.IoMTAssetsPackageImpl#getService()
     * @generated
     */
    int SERVICE = 1;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE__KEY = ASSET__KEY;

    /**
     * The feature id for the '<em><b>Mission Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE__MISSION_NAME = ASSET__MISSION_NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE__DESCRIPTION = ASSET__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Base Class</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE__BASE_CLASS = ASSET__BASE_CLASS;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE__KIND = ASSET_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Service</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Service</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link IoMTAssets.impl.InformationImpl <em>Information</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see IoMTAssets.impl.InformationImpl
     * @see IoMTAssets.impl.IoMTAssetsPackageImpl#getInformation()
     * @generated
     */
    int INFORMATION = 2;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION__KEY = ASSET__KEY;

    /**
     * The feature id for the '<em><b>Mission Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION__MISSION_NAME = ASSET__MISSION_NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION__DESCRIPTION = ASSET__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Base Class</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION__BASE_CLASS = ASSET__BASE_CLASS;

    /**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION__LOCATION = ASSET_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Record</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION__RECORD = ASSET_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION__KIND = ASSET_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Information</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_FEATURE_COUNT = ASSET_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Information</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link IoMTAssets.impl.IntangibleAssetImpl <em>Intangible Asset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see IoMTAssets.impl.IntangibleAssetImpl
     * @see IoMTAssets.impl.IoMTAssetsPackageImpl#getIntangibleAsset()
     * @generated
     */
    int INTANGIBLE_ASSET = 3;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTANGIBLE_ASSET__KEY = ASSET__KEY;

    /**
     * The feature id for the '<em><b>Mission Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTANGIBLE_ASSET__MISSION_NAME = ASSET__MISSION_NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTANGIBLE_ASSET__DESCRIPTION = ASSET__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Base Class</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTANGIBLE_ASSET__BASE_CLASS = ASSET__BASE_CLASS;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTANGIBLE_ASSET__KIND = ASSET_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Intangible Asset</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTANGIBLE_ASSET_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Intangible Asset</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTANGIBLE_ASSET_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link IoMTAssets.ServiceKind <em>Service Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see IoMTAssets.ServiceKind
     * @see IoMTAssets.impl.IoMTAssetsPackageImpl#getServiceKind()
     * @generated
     */
    int SERVICE_KIND = 4;

    /**
     * The meta object id for the '{@link IoMTAssets.InformationKind <em>Information Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see IoMTAssets.InformationKind
     * @see IoMTAssets.impl.IoMTAssetsPackageImpl#getInformationKind()
     * @generated
     */
    int INFORMATION_KIND = 5;

    /**
     * The meta object id for the '{@link IoMTAssets.IntangibleAssetKind <em>Intangible Asset Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see IoMTAssets.IntangibleAssetKind
     * @see IoMTAssets.impl.IoMTAssetsPackageImpl#getIntangibleAssetKind()
     * @generated
     */
    int INTANGIBLE_ASSET_KIND = 6;


    /**
     * Returns the meta object for class '{@link IoMTAssets.Asset <em>Asset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Asset</em>'.
     * @see IoMTAssets.Asset
     * @generated
     */
    EClass getAsset();

    /**
     * Returns the meta object for the attribute '{@link IoMTAssets.Asset#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see IoMTAssets.Asset#getKey()
     * @see #getAsset()
     * @generated
     */
    EAttribute getAsset_Key();

    /**
     * Returns the meta object for the attribute '{@link IoMTAssets.Asset#getMissionName <em>Mission Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mission Name</em>'.
     * @see IoMTAssets.Asset#getMissionName()
     * @see #getAsset()
     * @generated
     */
    EAttribute getAsset_MissionName();

    /**
     * Returns the meta object for the attribute '{@link IoMTAssets.Asset#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see IoMTAssets.Asset#getDescription()
     * @see #getAsset()
     * @generated
     */
    EAttribute getAsset_Description();

    /**
     * Returns the meta object for the reference '{@link IoMTAssets.Asset#getBase_Class <em>Base Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Base Class</em>'.
     * @see IoMTAssets.Asset#getBase_Class()
     * @see #getAsset()
     * @generated
     */
    EReference getAsset_Base_Class();

    /**
     * Returns the meta object for class '{@link IoMTAssets.Service <em>Service</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service</em>'.
     * @see IoMTAssets.Service
     * @generated
     */
    EClass getService();

    /**
     * Returns the meta object for the attribute '{@link IoMTAssets.Service#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see IoMTAssets.Service#getKind()
     * @see #getService()
     * @generated
     */
    EAttribute getService_Kind();

    /**
     * Returns the meta object for class '{@link IoMTAssets.Information <em>Information</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Information</em>'.
     * @see IoMTAssets.Information
     * @generated
     */
    EClass getInformation();

    /**
     * Returns the meta object for the attribute '{@link IoMTAssets.Information#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see IoMTAssets.Information#getLocation()
     * @see #getInformation()
     * @generated
     */
    EAttribute getInformation_Location();

    /**
     * Returns the meta object for the attribute '{@link IoMTAssets.Information#getRecord <em>Record</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Record</em>'.
     * @see IoMTAssets.Information#getRecord()
     * @see #getInformation()
     * @generated
     */
    EAttribute getInformation_Record();

    /**
     * Returns the meta object for the attribute '{@link IoMTAssets.Information#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see IoMTAssets.Information#getKind()
     * @see #getInformation()
     * @generated
     */
    EAttribute getInformation_Kind();

    /**
     * Returns the meta object for class '{@link IoMTAssets.IntangibleAsset <em>Intangible Asset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Intangible Asset</em>'.
     * @see IoMTAssets.IntangibleAsset
     * @generated
     */
    EClass getIntangibleAsset();

    /**
     * Returns the meta object for the attribute '{@link IoMTAssets.IntangibleAsset#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see IoMTAssets.IntangibleAsset#getKind()
     * @see #getIntangibleAsset()
     * @generated
     */
    EAttribute getIntangibleAsset_Kind();

    /**
     * Returns the meta object for enum '{@link IoMTAssets.ServiceKind <em>Service Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Service Kind</em>'.
     * @see IoMTAssets.ServiceKind
     * @generated
     */
    EEnum getServiceKind();

    /**
     * Returns the meta object for enum '{@link IoMTAssets.InformationKind <em>Information Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Information Kind</em>'.
     * @see IoMTAssets.InformationKind
     * @generated
     */
    EEnum getInformationKind();

    /**
     * Returns the meta object for enum '{@link IoMTAssets.IntangibleAssetKind <em>Intangible Asset Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Intangible Asset Kind</em>'.
     * @see IoMTAssets.IntangibleAssetKind
     * @generated
     */
    EEnum getIntangibleAssetKind();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    IoMTAssetsFactory getIoMTAssetsFactory();

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
         * The meta object literal for the '{@link IoMTAssets.impl.AssetImpl <em>Asset</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see IoMTAssets.impl.AssetImpl
         * @see IoMTAssets.impl.IoMTAssetsPackageImpl#getAsset()
         * @generated
         */
        EClass ASSET = eINSTANCE.getAsset();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSET__KEY = eINSTANCE.getAsset_Key();

        /**
         * The meta object literal for the '<em><b>Mission Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSET__MISSION_NAME = eINSTANCE.getAsset_MissionName();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSET__DESCRIPTION = eINSTANCE.getAsset_Description();

        /**
         * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSET__BASE_CLASS = eINSTANCE.getAsset_Base_Class();

        /**
         * The meta object literal for the '{@link IoMTAssets.impl.ServiceImpl <em>Service</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see IoMTAssets.impl.ServiceImpl
         * @see IoMTAssets.impl.IoMTAssetsPackageImpl#getService()
         * @generated
         */
        EClass SERVICE = eINSTANCE.getService();

        /**
         * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE__KIND = eINSTANCE.getService_Kind();

        /**
         * The meta object literal for the '{@link IoMTAssets.impl.InformationImpl <em>Information</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see IoMTAssets.impl.InformationImpl
         * @see IoMTAssets.impl.IoMTAssetsPackageImpl#getInformation()
         * @generated
         */
        EClass INFORMATION = eINSTANCE.getInformation();

        /**
         * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INFORMATION__LOCATION = eINSTANCE.getInformation_Location();

        /**
         * The meta object literal for the '<em><b>Record</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INFORMATION__RECORD = eINSTANCE.getInformation_Record();

        /**
         * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INFORMATION__KIND = eINSTANCE.getInformation_Kind();

        /**
         * The meta object literal for the '{@link IoMTAssets.impl.IntangibleAssetImpl <em>Intangible Asset</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see IoMTAssets.impl.IntangibleAssetImpl
         * @see IoMTAssets.impl.IoMTAssetsPackageImpl#getIntangibleAsset()
         * @generated
         */
        EClass INTANGIBLE_ASSET = eINSTANCE.getIntangibleAsset();

        /**
         * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTANGIBLE_ASSET__KIND = eINSTANCE.getIntangibleAsset_Kind();

        /**
         * The meta object literal for the '{@link IoMTAssets.ServiceKind <em>Service Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see IoMTAssets.ServiceKind
         * @see IoMTAssets.impl.IoMTAssetsPackageImpl#getServiceKind()
         * @generated
         */
        EEnum SERVICE_KIND = eINSTANCE.getServiceKind();

        /**
         * The meta object literal for the '{@link IoMTAssets.InformationKind <em>Information Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see IoMTAssets.InformationKind
         * @see IoMTAssets.impl.IoMTAssetsPackageImpl#getInformationKind()
         * @generated
         */
        EEnum INFORMATION_KIND = eINSTANCE.getInformationKind();

        /**
         * The meta object literal for the '{@link IoMTAssets.IntangibleAssetKind <em>Intangible Asset Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see IoMTAssets.IntangibleAssetKind
         * @see IoMTAssets.impl.IoMTAssetsPackageImpl#getIntangibleAssetKind()
         * @generated
         */
        EEnum INTANGIBLE_ASSET_KIND = eINSTANCE.getIntangibleAssetKind();

    }

} //IoMTAssetsPackage
