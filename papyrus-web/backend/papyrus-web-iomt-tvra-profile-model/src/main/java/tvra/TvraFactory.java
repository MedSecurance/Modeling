/**
 */
package tvra;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tvra.TvraPackage
 * @generated
 */
public interface TvraFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TvraFactory eINSTANCE = tvra.impl.TvraFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TVRA Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TVRA Asset</em>'.
	 * @generated
	 */
	TVRAAsset createTVRAAsset();

	/**
	 * Returns a new object of class '<em>Misbehaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Misbehaviour</em>'.
	 * @generated
	 */
	Misbehaviour createMisbehaviour();

	/**
	 * Returns a new object of class '<em>Trustworthiness Attribute Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trustworthiness Attribute Set</em>'.
	 * @generated
	 */
	TrustworthinessAttributeSet createTrustworthinessAttributeSet();

	/**
	 * Returns a new object of class '<em>Control Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Set</em>'.
	 * @generated
	 */
	ControlSet createControlSet();

	/**
	 * Returns a new object of class '<em>Network Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Domain</em>'.
	 * @generated
	 */
	NetworkDomain createNetworkDomain();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TvraPackage getTvraPackage();

} //TvraFactory
