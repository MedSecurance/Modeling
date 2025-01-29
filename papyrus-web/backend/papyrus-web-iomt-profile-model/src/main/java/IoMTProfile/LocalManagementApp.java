/**
 */
package IoMTProfile;

import IoMTProfile.WAN.Proxy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Management App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IoMTProfile.LocalManagementApp#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link IoMTProfile.LocalManagementApp#getProxy <em>Proxy</em>}</li>
 * </ul>
 *
 * @see IoMTProfile.IoMTProfilePackage#getLocalManagementApp()
 * @model
 * @generated
 */
public interface LocalManagementApp extends EObject {
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
	 * @see IoMTProfile.IoMTProfilePackage#getLocalManagementApp_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link IoMTProfile.LocalManagementApp#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Proxy</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.WAN.Proxy#getLocalManagementApps <em>Local Management Apps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy</em>' reference.
	 * @see #setProxy(Proxy)
	 * @see IoMTProfile.IoMTProfilePackage#getLocalManagementApp_Proxy()
	 * @see IoMTProfile.WAN.Proxy#getLocalManagementApps
	 * @model opposite="localManagementApps" required="true" ordered="false"
	 * @generated
	 */
	Proxy getProxy();

	/**
	 * Sets the value of the '{@link IoMTProfile.LocalManagementApp#getProxy <em>Proxy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy</em>' reference.
	 * @see #getProxy()
	 * @generated
	 */
	void setProxy(Proxy value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void pairing();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void disapairing();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void create();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void retrieve();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void update();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void delete();

} // LocalManagementApp
