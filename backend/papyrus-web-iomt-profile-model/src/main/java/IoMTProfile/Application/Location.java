/**
 */
package IoMTProfile.Application;

import IoMTProfile.LAN.IoMTDevice;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IoMTProfile.Application.Location#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @see IoMTProfile.Application.ApplicationPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Devices</b></em>' reference list.
	 * The list contents are of type {@link IoMTProfile.LAN.IoMTDevice}.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.LAN.IoMTDevice#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' reference list.
	 * @see IoMTProfile.Application.ApplicationPackage#getLocation_Devices()
	 * @see IoMTProfile.LAN.IoMTDevice#getLocation
	 * @model opposite="location" ordered="false"
	 * @generated
	 */
	EList<IoMTDevice> getDevices();

} // Location
