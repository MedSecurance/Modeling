/**
 */
package IoMTProfile.LAN;

import IoMTProfile.External.Person;

import IoMTProfile.IdentifiableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io MT Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IoMTProfile.LAN.IoMTService#getPerson <em>Person</em>}</li>
 *   <li>{@link IoMTProfile.LAN.IoMTService#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @see IoMTProfile.LAN.LANPackage#getIoMTService()
 * @model abstract="true"
 * @generated
 */
public interface IoMTService extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.External.Person#getIomtservice <em>Iomtservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see IoMTProfile.LAN.LANPackage#getIoMTService_Person()
	 * @see IoMTProfile.External.Person#getIomtservice
	 * @model opposite="iomtservice" required="true" ordered="false"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link IoMTProfile.LAN.IoMTService#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.LAN.IoMTDevice#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' reference.
	 * @see #setDevice(IoMTDevice)
	 * @see IoMTProfile.LAN.LANPackage#getIoMTService_Device()
	 * @see IoMTProfile.LAN.IoMTDevice#getServices
	 * @model opposite="services" required="true" ordered="false"
	 * @generated
	 */
	IoMTDevice getDevice();

	/**
	 * Sets the value of the '{@link IoMTProfile.LAN.IoMTService#getDevice <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(IoMTDevice value);

} // IoMTService
