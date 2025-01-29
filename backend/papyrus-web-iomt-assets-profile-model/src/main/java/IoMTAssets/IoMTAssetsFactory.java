/**
 */
package IoMTAssets;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see IoMTAssets.IoMTAssetsPackage
 * @generated
 */
public interface IoMTAssetsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    IoMTAssetsFactory eINSTANCE = IoMTAssets.impl.IoMTAssetsFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Service</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service</em>'.
     * @generated
     */
    Service createService();

    /**
     * Returns a new object of class '<em>Information</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Information</em>'.
     * @generated
     */
    Information createInformation();

    /**
     * Returns a new object of class '<em>Intangible Asset</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Intangible Asset</em>'.
     * @generated
     */
    IntangibleAsset createIntangibleAsset();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    IoMTAssetsPackage getIoMTAssetsPackage();

} //IoMTAssetsFactory
