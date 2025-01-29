/**
 */
package IoMTComponentCategories;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io MTpkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IoMTComponentCategories.IoMTpkg#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link IoMTComponentCategories.IoMTpkg#getSupportedFeatures <em>Supported Features</em>}</li>
 * </ul>
 *
 * @see IoMTComponentCategories.IoMTComponentCategoriesPackage#getIoMTpkg()
 * @model
 * @generated
 */
public interface IoMTpkg extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' reference.
	 * @see #setBase_Package(org.eclipse.uml2.uml.Package)
	 * @see IoMTComponentCategories.IoMTComponentCategoriesPackage#getIoMTpkg_Base_Package()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getBase_Package();

	/**
	 * Sets the value of the '{@link IoMTComponentCategories.IoMTpkg#getBase_Package <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' reference.
	 * @see #getBase_Package()
	 * @generated
	 */
	void setBase_Package(org.eclipse.uml2.uml.Package value);

	/**
	 * Returns the value of the '<em><b>Supported Features</b></em>' attribute.
	 * The literals are from the enumeration {@link IoMTComponentCategories.PackageAnnotationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Features</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Features</em>' attribute.
	 * @see IoMTComponentCategories.PackageAnnotationKind
	 * @see #setSupportedFeatures(PackageAnnotationKind)
	 * @see IoMTComponentCategories.IoMTComponentCategoriesPackage#getIoMTpkg_SupportedFeatures()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PackageAnnotationKind getSupportedFeatures();

	/**
	 * Sets the value of the '{@link IoMTComponentCategories.IoMTpkg#getSupportedFeatures <em>Supported Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Features</em>' attribute.
	 * @see IoMTComponentCategories.PackageAnnotationKind
	 * @see #getSupportedFeatures()
	 * @generated
	 */
	void setSupportedFeatures(PackageAnnotationKind value);

} // IoMTpkg
