/**
 */
package IoMTProfile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see IoMTProfile.IoMTProfilePackage
 * @generated
 */
public interface IoMTProfileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IoMTProfileFactory eINSTANCE = IoMTProfile.impl.IoMTProfileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Local Management App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Management App</em>'.
	 * @generated
	 */
	LocalManagementApp createLocalManagementApp();

	/**
	 * Returns a new object of class '<em>Internal Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Function</em>'.
	 * @generated
	 */
	InternalFunction createInternalFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IoMTProfilePackage getIoMTProfilePackage();

} //IoMTProfileFactory
