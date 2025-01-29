/**
 */
package IoMTProfile.LAN;

import IoMTProfile.Application.Location;

import IoMTProfile.IdentifiableElement;
import IoMTProfile.Interface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io MT Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IoMTProfile.LAN.IoMTDevice#getInternalInterface <em>Internal Interface</em>}</li>
 *   <li>{@link IoMTProfile.LAN.IoMTDevice#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link IoMTProfile.LAN.IoMTDevice#getLocation <em>Location</em>}</li>
 *   <li>{@link IoMTProfile.LAN.IoMTDevice#getFunctions <em>Functions</em>}</li>
 *   <li>{@link IoMTProfile.LAN.IoMTDevice#getServices <em>Services</em>}</li>
 *   <li>{@link IoMTProfile.LAN.IoMTDevice#getGateway <em>Gateway</em>}</li>
 * </ul>
 *
 * @see IoMTProfile.LAN.LANPackage#getIoMTDevice()
 * @model
 * @generated
 */
public interface IoMTDevice extends IdentifiableElement {
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
	 * @see IoMTProfile.LAN.LANPackage#getIoMTDevice_InternalInterface()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Interface getInternalInterface();

	/**
	 * Sets the value of the '{@link IoMTProfile.LAN.IoMTDevice#getInternalInterface <em>Internal Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Interface</em>' attribute.
	 * @see IoMTProfile.Interface
	 * @see #getInternalInterface()
	 * @generated
	 */
	void setInternalInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.LAN.IoMTConfiguration#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(IoMTConfiguration)
	 * @see IoMTProfile.LAN.LANPackage#getIoMTDevice_Configuration()
	 * @see IoMTProfile.LAN.IoMTConfiguration#getDevice
	 * @model opposite="device" required="true" ordered="false"
	 * @generated
	 */
	IoMTConfiguration getConfiguration();

	/**
	 * Sets the value of the '{@link IoMTProfile.LAN.IoMTDevice#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(IoMTConfiguration value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.Application.Location#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see IoMTProfile.LAN.LANPackage#getIoMTDevice_Location()
	 * @see IoMTProfile.Application.Location#getDevices
	 * @model opposite="devices" ordered="false"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link IoMTProfile.LAN.IoMTDevice#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' reference list.
	 * The list contents are of type {@link IoMTProfile.LAN.IoMTFunction}.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.LAN.IoMTFunction#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' reference list.
	 * @see IoMTProfile.LAN.LANPackage#getIoMTDevice_Functions()
	 * @see IoMTProfile.LAN.IoMTFunction#getDevices
	 * @model opposite="devices" ordered="false"
	 * @generated
	 */
	EList<IoMTFunction> getFunctions();

	/**
	 * Retrieves the first {@link IoMTProfile.LAN.IoMTFunction} with the specified '<em><b>Name</b></em>' from the '<em><b>Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link IoMTProfile.LAN.IoMTFunction} to retrieve, or <code>null</code>.
	 * @return The first {@link IoMTProfile.LAN.IoMTFunction} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFunctions()
	 * @generated
	 */
	IoMTFunction getFunctions(String name);

	/**
	 * Retrieves the first {@link IoMTProfile.LAN.IoMTFunction} with the specified '<em><b>Name</b></em>' from the '<em><b>Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link IoMTProfile.LAN.IoMTFunction} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link IoMTProfile.LAN.IoMTFunction} to retrieve, or <code>null</code>.
	 * @return The first {@link IoMTProfile.LAN.IoMTFunction} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFunctions()
	 * @generated
	 */
	IoMTFunction getFunctions(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link IoMTProfile.LAN.IoMTService}.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.LAN.IoMTService#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see IoMTProfile.LAN.LANPackage#getIoMTDevice_Services()
	 * @see IoMTProfile.LAN.IoMTService#getDevice
	 * @model opposite="device" ordered="false"
	 * @generated
	 */
	EList<IoMTService> getServices();

	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.LAN.Gateway#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway</em>' reference.
	 * @see #setGateway(Gateway)
	 * @see IoMTProfile.LAN.LANPackage#getIoMTDevice_Gateway()
	 * @see IoMTProfile.LAN.Gateway#getDevices
	 * @model opposite="devices" required="true" ordered="false"
	 * @generated
	 */
	Gateway getGateway();

	/**
	 * Sets the value of the '{@link IoMTProfile.LAN.IoMTDevice#getGateway <em>Gateway</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway</em>' reference.
	 * @see #getGateway()
	 * @generated
	 */
	void setGateway(Gateway value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void openSession();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void closeSession();

} // IoMTDevice
