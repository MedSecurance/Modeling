/**
 */
package IoMTProfile.LAN;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io MT Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IoMTProfile.LAN.IoMTConfiguration#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link IoMTProfile.LAN.IoMTConfiguration#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @see IoMTProfile.LAN.LANPackage#getIoMTConfiguration()
 * @model
 * @generated
 */
public interface IoMTConfiguration extends EObject {
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
	 * @see IoMTProfile.LAN.LANPackage#getIoMTConfiguration_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link IoMTProfile.LAN.IoMTConfiguration#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.LAN.IoMTDevice#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' reference.
	 * @see #setDevice(IoMTDevice)
	 * @see IoMTProfile.LAN.LANPackage#getIoMTConfiguration_Device()
	 * @see IoMTProfile.LAN.IoMTDevice#getConfiguration
	 * @model opposite="configuration" required="true" ordered="false"
	 * @generated
	 */
	IoMTDevice getDevice();

	/**
	 * Sets the value of the '{@link IoMTProfile.LAN.IoMTConfiguration#getDevice <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(IoMTDevice value);

} // IoMTConfiguration
