/**
 */
package assertions;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.OpaqueExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assertions.Property#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link assertions.Property#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see assertions.AssertionsPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject {
    /**
     * Returns the value of the '<em><b>Base Property</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Property</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Property</em>' reference.
     * @see #setBase_Property(org.eclipse.uml2.uml.Property)
     * @see assertions.AssertionsPackage#getProperty_Base_Property()
     * @model ordered="false"
     * @generated
     */
    org.eclipse.uml2.uml.Property getBase_Property();

    /**
     * Sets the value of the '{@link assertions.Property#getBase_Property <em>Base Property</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Property</em>' reference.
     * @see #getBase_Property()
     * @generated
     */
    void setBase_Property(org.eclipse.uml2.uml.Property value);

    /**
     * Returns the value of the '<em><b>Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' reference.
     * @see assertions.AssertionsPackage#getProperty_Expression()
     * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    OpaqueExpression getExpression();

} // Property
