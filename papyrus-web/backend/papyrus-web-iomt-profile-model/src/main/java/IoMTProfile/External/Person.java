/**
 */
package IoMTProfile.External;

import IoMTProfile.Application.Application;

import IoMTProfile.LAN.IoMTService;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IoMTProfile.External.Person#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link IoMTProfile.External.Person#getApplication <em>Application</em>}</li>
 *   <li>{@link IoMTProfile.External.Person#getIomtservice <em>Iomtservice</em>}</li>
 * </ul>
 *
 * @see IoMTProfile.External.ExternalPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
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
	 * @see IoMTProfile.External.ExternalPackage#getPerson_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link IoMTProfile.External.Person#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.Application.Application#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' reference.
	 * @see #setApplication(Application)
	 * @see IoMTProfile.External.ExternalPackage#getPerson_Application()
	 * @see IoMTProfile.Application.Application#getPerson
	 * @model opposite="person" required="true" ordered="false"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link IoMTProfile.External.Person#getApplication <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Iomtservice</b></em>' reference list.
	 * The list contents are of type {@link IoMTProfile.LAN.IoMTService}.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.LAN.IoMTService#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iomtservice</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iomtservice</em>' reference list.
	 * @see IoMTProfile.External.ExternalPackage#getPerson_Iomtservice()
	 * @see IoMTProfile.LAN.IoMTService#getPerson
	 * @model opposite="person" ordered="false"
	 * @generated
	 */
	EList<IoMTService> getIomtservice();

} // Person
