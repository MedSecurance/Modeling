/**
 */
package IoMTComponentCategories;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see IoMTComponentCategories.IoMTComponentCategoriesPackage
 * @generated
 */
public interface IoMTComponentCategoriesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IoMTComponentCategoriesFactory eINSTANCE = IoMTComponentCategories.impl.IoMTComponentCategoriesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Io MTcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io MTcomponent</em>'.
	 * @generated
	 */
	IoMTcomponent createIoMTcomponent();

	/**
	 * Returns a new object of class '<em>Io MTp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io MTp</em>'.
	 * @generated
	 */
	IoMTp createIoMTp();

	/**
	 * Returns a new object of class '<em>Io MTpkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io MTpkg</em>'.
	 * @generated
	 */
	IoMTpkg createIoMTpkg();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IoMTComponentCategoriesPackage getIoMTComponentCategoriesPackage();

} //IoMTComponentCategoriesFactory
