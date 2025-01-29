/**
 */
package assertions;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see assertions.AssertionsFactory
 * @model kind="package"
 * @generated
 */
public interface AssertionsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "assertions";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.eclipse.org/papyrus/robotics/assertions/1";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "assertions";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AssertionsPackage eINSTANCE = assertions.impl.AssertionsPackageImpl.init();

    /**
     * The meta object id for the '{@link assertions.impl.AssertionImpl <em>Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see assertions.impl.AssertionImpl
     * @see assertions.impl.AssertionsPackageImpl#getAssertion()
     * @generated
     */
    int ASSERTION = 0;

    /**
     * The feature id for the '<em><b>Base Constraint</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSERTION__BASE_CONSTRAINT = 0;

    /**
     * The number of structural features of the '<em>Assertion</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSERTION_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Assertion</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSERTION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link assertions.impl.ContractImpl <em>Contract</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see assertions.impl.ContractImpl
     * @see assertions.impl.AssertionsPackageImpl#getContract()
     * @generated
     */
    int CONTRACT = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTRACT__NAME = 0;

    /**
     * The feature id for the '<em><b>Assumptions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTRACT__ASSUMPTIONS = 1;

    /**
     * The feature id for the '<em><b>Guarantees</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTRACT__GUARANTEES = 2;

    /**
     * The feature id for the '<em><b>Base Comment</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTRACT__BASE_COMMENT = 3;

    /**
     * The number of structural features of the '<em>Contract</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTRACT_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Contract</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTRACT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link assertions.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see assertions.impl.PropertyImpl
     * @see assertions.impl.AssertionsPackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 2;

    /**
     * The feature id for the '<em><b>Base Property</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__BASE_PROPERTY = 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__EXPRESSION = 1;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link assertions.Assertion <em>Assertion</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assertion</em>'.
     * @see assertions.Assertion
     * @generated
     */
    EClass getAssertion();

    /**
     * Returns the meta object for the reference '{@link assertions.Assertion#getBase_Constraint <em>Base Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Base Constraint</em>'.
     * @see assertions.Assertion#getBase_Constraint()
     * @see #getAssertion()
     * @generated
     */
    EReference getAssertion_Base_Constraint();

    /**
     * Returns the meta object for class '{@link assertions.Contract <em>Contract</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Contract</em>'.
     * @see assertions.Contract
     * @generated
     */
    EClass getContract();

    /**
     * Returns the meta object for the attribute '{@link assertions.Contract#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see assertions.Contract#getName()
     * @see #getContract()
     * @generated
     */
    EAttribute getContract_Name();

    /**
     * Returns the meta object for the reference list '{@link assertions.Contract#getAssumptions <em>Assumptions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Assumptions</em>'.
     * @see assertions.Contract#getAssumptions()
     * @see #getContract()
     * @generated
     */
    EReference getContract_Assumptions();

    /**
     * Returns the meta object for the reference list '{@link assertions.Contract#getGuarantees <em>Guarantees</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Guarantees</em>'.
     * @see assertions.Contract#getGuarantees()
     * @see #getContract()
     * @generated
     */
    EReference getContract_Guarantees();

    /**
     * Returns the meta object for the reference '{@link assertions.Contract#getBase_Comment <em>Base Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Base Comment</em>'.
     * @see assertions.Contract#getBase_Comment()
     * @see #getContract()
     * @generated
     */
    EReference getContract_Base_Comment();

    /**
     * Returns the meta object for class '{@link assertions.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see assertions.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for the reference '{@link assertions.Property#getBase_Property <em>Base Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Base Property</em>'.
     * @see assertions.Property#getBase_Property()
     * @see #getProperty()
     * @generated
     */
    EReference getProperty_Base_Property();

    /**
     * Returns the meta object for the reference '{@link assertions.Property#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Expression</em>'.
     * @see assertions.Property#getExpression()
     * @see #getProperty()
     * @generated
     */
    EReference getProperty_Expression();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    AssertionsFactory getAssertionsFactory();

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
         * The meta object literal for the '{@link assertions.impl.AssertionImpl <em>Assertion</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see assertions.impl.AssertionImpl
         * @see assertions.impl.AssertionsPackageImpl#getAssertion()
         * @generated
         */
        EClass ASSERTION = eINSTANCE.getAssertion();

        /**
         * The meta object literal for the '<em><b>Base Constraint</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSERTION__BASE_CONSTRAINT = eINSTANCE.getAssertion_Base_Constraint();

        /**
         * The meta object literal for the '{@link assertions.impl.ContractImpl <em>Contract</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see assertions.impl.ContractImpl
         * @see assertions.impl.AssertionsPackageImpl#getContract()
         * @generated
         */
        EClass CONTRACT = eINSTANCE.getContract();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTRACT__NAME = eINSTANCE.getContract_Name();

        /**
         * The meta object literal for the '<em><b>Assumptions</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTRACT__ASSUMPTIONS = eINSTANCE.getContract_Assumptions();

        /**
         * The meta object literal for the '<em><b>Guarantees</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTRACT__GUARANTEES = eINSTANCE.getContract_Guarantees();

        /**
         * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTRACT__BASE_COMMENT = eINSTANCE.getContract_Base_Comment();

        /**
         * The meta object literal for the '{@link assertions.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see assertions.impl.PropertyImpl
         * @see assertions.impl.AssertionsPackageImpl#getProperty()
         * @generated
         */
        EClass PROPERTY = eINSTANCE.getProperty();

        /**
         * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY__BASE_PROPERTY = eINSTANCE.getProperty_Base_Property();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY__EXPRESSION = eINSTANCE.getProperty_Expression();

    }

} //AssertionsPackage
