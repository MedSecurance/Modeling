/**
 */
package IoMTProfile.LAN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io MT Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IoMTProfile.LAN.IoMTFunction#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @see IoMTProfile.LAN.LANPackage#getIoMTFunction()
 * @model abstract="true"
 * @generated
 */
public interface IoMTFunction extends org.eclipse.uml2.uml.Class {
	/**
	 * Returns the value of the '<em><b>Devices</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.LAN.IoMTDevice#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devices</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' reference.
	 * @see #setDevices(IoMTDevice)
	 * @see IoMTProfile.LAN.LANPackage#getIoMTFunction_Devices()
	 * @see IoMTProfile.LAN.IoMTDevice#getFunctions
	 * @model opposite="functions" required="true" ordered="false"
	 * @generated
	 */
	IoMTDevice getDevices();

	/**
	 * Sets the value of the '{@link IoMTProfile.LAN.IoMTFunction#getDevices <em>Devices</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Devices</em>' reference.
	 * @see #getDevices()
	 * @generated
	 */
	void setDevices(IoMTDevice value);

} // IoMTFunction
