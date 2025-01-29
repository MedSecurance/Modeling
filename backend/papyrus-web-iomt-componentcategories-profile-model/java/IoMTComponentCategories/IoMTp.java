/**
 */
package IoMTComponentCategories;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io MTp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IoMTComponentCategories.IoMTp#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link IoMTComponentCategories.IoMTp#getSupportedFeatures <em>Supported Features</em>}</li>
 * </ul>
 *
 * @see IoMTComponentCategories.IoMTComponentCategoriesPackage#getIoMTp()
 * @model
 * @generated
 */
public interface IoMTp extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see IoMTComponentCategories.IoMTComponentCategoriesPackage#getIoMTp_Base_Property()
	 * @model ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link IoMTComponentCategories.IoMTp#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Supported Features</b></em>' attribute.
	 * The literals are from the enumeration {@link IoMTComponentCategories.PropertyAnnotationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Features</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Features</em>' attribute.
	 * @see IoMTComponentCategories.PropertyAnnotationKind
	 * @see #setSupportedFeatures(PropertyAnnotationKind)
	 * @see IoMTComponentCategories.IoMTComponentCategoriesPackage#getIoMTp_SupportedFeatures()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PropertyAnnotationKind getSupportedFeatures();

	/**
	 * Sets the value of the '{@link IoMTComponentCategories.IoMTp#getSupportedFeatures <em>Supported Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Features</em>' attribute.
	 * @see IoMTComponentCategories.PropertyAnnotationKind
	 * @see #getSupportedFeatures()
	 * @generated
	 */
	void setSupportedFeatures(PropertyAnnotationKind value);

} // IoMTp
