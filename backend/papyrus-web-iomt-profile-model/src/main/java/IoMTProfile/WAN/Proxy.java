/**
 */
package IoMTProfile.WAN;

import IoMTProfile.Application.Application;

import IoMTProfile.IdentifiableElement;

import IoMTProfile.LAN.Gateway;

import IoMTProfile.LocalManagementApp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IoMTProfile.WAN.Proxy#getGateways <em>Gateways</em>}</li>
 *   <li>{@link IoMTProfile.WAN.Proxy#getDatastores <em>Datastores</em>}</li>
 *   <li>{@link IoMTProfile.WAN.Proxy#getApplications <em>Applications</em>}</li>
 *   <li>{@link IoMTProfile.WAN.Proxy#getLocalManagementApps <em>Local Management Apps</em>}</li>
 * </ul>
 *
 * @see IoMTProfile.WAN.WANPackage#getProxy()
 * @model
 * @generated
 */
public interface Proxy extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Gateways</b></em>' reference list.
	 * The list contents are of type {@link IoMTProfile.LAN.Gateway}.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.LAN.Gateway#getProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateways</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateways</em>' reference list.
	 * @see IoMTProfile.WAN.WANPackage#getProxy_Gateways()
	 * @see IoMTProfile.LAN.Gateway#getProxy
	 * @model opposite="proxy" ordered="false"
	 * @generated
	 */
	EList<Gateway> getGateways();

	/**
	 * Returns the value of the '<em><b>Datastores</b></em>' reference list.
	 * The list contents are of type {@link IoMTProfile.WAN.DataStore}.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.WAN.DataStore#getProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datastores</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datastores</em>' reference list.
	 * @see IoMTProfile.WAN.WANPackage#getProxy_Datastores()
	 * @see IoMTProfile.WAN.DataStore#getProxy
	 * @model opposite="proxy" ordered="false"
	 * @generated
	 */
	EList<DataStore> getDatastores();

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' reference list.
	 * The list contents are of type {@link IoMTProfile.Application.Application}.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.Application.Application#getProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' reference list.
	 * @see IoMTProfile.WAN.WANPackage#getProxy_Applications()
	 * @see IoMTProfile.Application.Application#getProxy
	 * @model opposite="proxy" ordered="false"
	 * @generated
	 */
	EList<Application> getApplications();

	/**
	 * Returns the value of the '<em><b>Local Management Apps</b></em>' reference list.
	 * The list contents are of type {@link IoMTProfile.LocalManagementApp}.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.LocalManagementApp#getProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Management Apps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Management Apps</em>' reference list.
	 * @see IoMTProfile.WAN.WANPackage#getProxy_LocalManagementApps()
	 * @see IoMTProfile.LocalManagementApp#getProxy
	 * @model opposite="proxy" ordered="false"
	 * @generated
	 */
	EList<LocalManagementApp> getLocalManagementApps();

} // Proxy
