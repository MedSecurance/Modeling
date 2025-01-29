/**
 */
package assertions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see assertions.AssertionsPackage
 * @generated
 */
public interface AssertionsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AssertionsFactory eINSTANCE = assertions.impl.AssertionsFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Assertion</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Assertion</em>'.
     * @generated
     */
    Assertion createAssertion();

    /**
     * Returns a new object of class '<em>Contract</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Contract</em>'.
     * @generated
     */
    Contract createContract();

    /**
     * Returns a new object of class '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property</em>'.
     * @generated
     */
    Property createProperty();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    AssertionsPackage getAssertionsPackage();

} //AssertionsFactory
