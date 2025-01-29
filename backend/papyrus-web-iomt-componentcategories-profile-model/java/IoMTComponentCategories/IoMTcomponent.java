/**
 */
package IoMTComponentCategories;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io MTcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IoMTComponentCategories.IoMTcomponent#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link IoMTComponentCategories.IoMTcomponent#getSupportedFeatures <em>Supported Features</em>}</li>
 * </ul>
 *
 * @see IoMTComponentCategories.IoMTComponentCategoriesPackage#getIoMTcomponent()
 * @model
 * @generated
 */
public interface IoMTcomponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see IoMTComponentCategories.IoMTComponentCategoriesPackage#getIoMTcomponent_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link IoMTComponentCategories.IoMTcomponent#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Supported Features</b></em>' attribute list.
	 * The list contents are of type {@link IoMTComponentCategories.ComponentAnnotationKind}.
	 * The literals are from the enumeration {@link IoMTComponentCategories.ComponentAnnotationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Features</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Features</em>' attribute list.
	 * @see IoMTComponentCategories.ComponentAnnotationKind
	 * @see IoMTComponentCategories.IoMTComponentCategoriesPackage#getIoMTcomponent_SupportedFeatures()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ComponentAnnotationKind> getSupportedFeatures();

} // IoMTcomponent
