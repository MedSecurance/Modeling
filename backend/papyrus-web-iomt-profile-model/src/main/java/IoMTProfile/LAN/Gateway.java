/**
 */
package IoMTProfile.LAN;

import IoMTProfile.IdentifiableElement;
import IoMTProfile.Interface;

import IoMTProfile.WAN.Proxy;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IoMTProfile.LAN.Gateway#getDevices <em>Devices</em>}</li>
 *   <li>{@link IoMTProfile.LAN.Gateway#getInternalInterface <em>Internal Interface</em>}</li>
 *   <li>{@link IoMTProfile.LAN.Gateway#getExternalInterface <em>External Interface</em>}</li>
 *   <li>{@link IoMTProfile.LAN.Gateway#getGatewayType <em>Gateway Type</em>}</li>
 *   <li>{@link IoMTProfile.LAN.Gateway#getProxy <em>Proxy</em>}</li>
 * </ul>
 *
 * @see IoMTProfile.LAN.LANPackage#getGateway()
 * @model
 * @generated
 */
public interface Gateway extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Devices</b></em>' reference list.
	 * The list contents are of type {@link IoMTProfile.LAN.IoMTDevice}.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.LAN.IoMTDevice#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' reference list.
	 * @see IoMTProfile.LAN.LANPackage#getGateway_Devices()
	 * @see IoMTProfile.LAN.IoMTDevice#getGateway
	 * @model opposite="gateway" ordered="false"
	 * @generated
	 */
	EList<IoMTDevice> getDevices();

	/**
	 * Returns the value of the '<em><b>Internal Interface</b></em>' attribute.
	 * The literals are from the enumeration {@link IoMTProfile.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Interface</em>' attribute.
	 * @see IoMTProfile.Interface
	 * @see #setInternalInterface(Interface)
	 * @see IoMTProfile.LAN.LANPackage#getGateway_InternalInterface()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Interface getInternalInterface();

	/**
	 * Sets the value of the '{@link IoMTProfile.LAN.Gateway#getInternalInterface <em>Internal Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Interface</em>' attribute.
	 * @see IoMTProfile.Interface
	 * @see #getInternalInterface()
	 * @generated
	 */
	void setInternalInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>External Interface</b></em>' attribute.
	 * The literals are from the enumeration {@link IoMTProfile.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Interface</em>' attribute.
	 * @see IoMTProfile.Interface
	 * @see #setExternalInterface(Interface)
	 * @see IoMTProfile.LAN.LANPackage#getGateway_ExternalInterface()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Interface getExternalInterface();

	/**
	 * Sets the value of the '{@link IoMTProfile.LAN.Gateway#getExternalInterface <em>External Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Interface</em>' attribute.
	 * @see IoMTProfile.Interface
	 * @see #getExternalInterface()
	 * @generated
	 */
	void setExternalInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Gateway Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IoMTProfile.LAN.GatewayType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Type</em>' attribute.
	 * @see IoMTProfile.LAN.GatewayType
	 * @see #setGatewayType(GatewayType)
	 * @see IoMTProfile.LAN.LANPackage#getGateway_GatewayType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GatewayType getGatewayType();

	/**
	 * Sets the value of the '{@link IoMTProfile.LAN.Gateway#getGatewayType <em>Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Type</em>' attribute.
	 * @see IoMTProfile.LAN.GatewayType
	 * @see #getGatewayType()
	 * @generated
	 */
	void setGatewayType(GatewayType value);

	/**
	 * Returns the value of the '<em><b>Proxy</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.WAN.Proxy#getGateways <em>Gateways</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy</em>' reference.
	 * @see #setProxy(Proxy)
	 * @see IoMTProfile.LAN.LANPackage#getGateway_Proxy()
	 * @see IoMTProfile.WAN.Proxy#getGateways
	 * @model opposite="gateways" required="true" ordered="false"
	 * @generated
	 */
	Proxy getProxy();

	/**
	 * Sets the value of the '{@link IoMTProfile.LAN.Gateway#getProxy <em>Proxy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy</em>' reference.
	 * @see #getProxy()
	 * @generated
	 */
	void setProxy(Proxy value);

} // Gateway
