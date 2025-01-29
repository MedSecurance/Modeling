/**
 */
package IoMTAssets.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IoMTAssetsFactoryImpl extends EFactoryImpl implements IoMTAssetsFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static IoMTAssetsFactory init() {
        try {
            IoMTAssetsFactory theIoMTAssetsFactory = (IoMTAssetsFactory)EPackage.Registry.INSTANCE.getEFactory(IoMTAssetsPackage.eNS_URI);
            if (theIoMTAssetsFactory != null) {
                return theIoMTAssetsFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new IoMTAssetsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IoMTAssetsFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case IoMTAssetsPackage.SERVICE: return createService();
            case IoMTAssetsPackage.INFORMATION: return createInformation();
            case IoMTAssetsPackage.INTANGIBLE_ASSET: return createIntangibleAsset();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case IoMTAssetsPackage.SERVICE_KIND:
                return createServiceKindFromString(eDataType, initialValue);
            case IoMTAssetsPackage.INFORMATION_KIND:
                return createInformationKindFromString(eDataType, initialValue);
            case IoMTAssetsPackage.INTANGIBLE_ASSET_KIND:
                return createIntangibleAssetKindFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case IoMTAssetsPackage.SERVICE_KIND:
                return convertServiceKindToString(eDataType, instanceValue);
            case IoMTAssetsPackage.INFORMATION_KIND:
                return convertInformationKindToString(eDataType, instanceValue);
            case IoMTAssetsPackage.INTANGIBLE_ASSET_KIND:
                return convertIntangibleAssetKindToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Service createService() {
        ServiceImpl service = new ServiceImpl();
        return service;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Information createInformation() {
        InformationImpl information = new InformationImpl();
        return information;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IntangibleAsset createIntangibleAsset() {
        IntangibleAssetImpl intangibleAsset = new IntangibleAssetImpl();
        return intangibleAsset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceKind createServiceKindFromString(EDataType eDataType, String initialValue) {
        ServiceKind result = ServiceKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertServiceKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InformationKind createInformationKindFromString(EDataType eDataType, String initialValue) {
        InformationKind result = InformationKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertInformationKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntangibleAssetKind createIntangibleAssetKindFromString(EDataType eDataType, String initialValue) {
        IntangibleAssetKind result = IntangibleAssetKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIntangibleAssetKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IoMTAssetsPackage getIoMTAssetsPackage() {
        return (IoMTAssetsPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static IoMTAssetsPackage getPackage() {
        return IoMTAssetsPackage.eINSTANCE;
    }

} //IoMTAssetsFactoryImpl
