/**
 */
package assertions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assertions.Contract#getName <em>Name</em>}</li>
 *   <li>{@link assertions.Contract#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link assertions.Contract#getGuarantees <em>Guarantees</em>}</li>
 *   <li>{@link assertions.Contract#getBase_Comment <em>Base Comment</em>}</li>
 * </ul>
 *
 * @see assertions.AssertionsPackage#getContract()
 * @model
 * @generated
 */
public interface Contract extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see assertions.AssertionsPackage#getContract_Name()
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link assertions.Contract#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Assumptions</b></em>' reference list.
     * The list contents are of type {@link assertions.Assertion}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assumptions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assumptions</em>' reference list.
     * @see assertions.AssertionsPackage#getContract_Assumptions()
     * @model ordered="false"
     * @generated
     */
    EList<Assertion> getAssumptions();

    /**
     * Returns the value of the '<em><b>Guarantees</b></em>' reference list.
     * The list contents are of type {@link assertions.Assertion}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Guarantees</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Guarantees</em>' reference list.
     * @see assertions.AssertionsPackage#getContract_Guarantees()
     * @model ordered="false"
     * @generated
     */
    EList<Assertion> getGuarantees();

    /**
     * Returns the value of the '<em><b>Base Comment</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Comment</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Comment</em>' reference.
     * @see #setBase_Comment(Comment)
     * @see assertions.AssertionsPackage#getContract_Base_Comment()
     * @model ordered="false"
     * @generated
     */
    Comment getBase_Comment();

    /**
     * Sets the value of the '{@link assertions.Contract#getBase_Comment <em>Base Comment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Comment</em>' reference.
     * @see #getBase_Comment()
     * @generated
     */
    void setBase_Comment(Comment value);

} // Contract
