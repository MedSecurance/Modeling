/**
 */
package IoMTProfile.LAN.impl;

import IoMTProfile.LAN.IoMTDevice;
import IoMTProfile.LAN.IoMTFunction;
import IoMTProfile.LAN.LANPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.internal.impl.ClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Io MT Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link IoMTProfile.LAN.impl.IoMTFunctionImpl#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IoMTFunctionImpl extends ClassImpl implements IoMTFunction {
	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected IoMTDevice devices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoMTFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LANPackage.Literals.IO_MT_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoMTDevice getDevices() {
		if (devices != null && devices.eIsProxy()) {
			InternalEObject oldDevices = (InternalEObject)devices;
			devices = (IoMTDevice)eResolveProxy(oldDevices);
			if (devices != oldDevices) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LANPackage.IO_MT_FUNCTION__DEVICES, oldDevices, devices));
			}
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoMTDevice basicGetDevices() {
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevices(IoMTDevice newDevices, NotificationChain msgs) {
		IoMTDevice oldDevices = devices;
		devices = newDevices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LANPackage.IO_MT_FUNCTION__DEVICES, oldDevices, newDevices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDevices(IoMTDevice newDevices) {
		if (newDevices != devices) {
			NotificationChain msgs = null;
			if (devices != null)
				msgs = ((InternalEObject)devices).eInverseRemove(this, LANPackage.IO_MT_DEVICE__FUNCTIONS, IoMTDevice.class, msgs);
			if (newDevices != null)
				msgs = ((InternalEObject)newDevices).eInverseAdd(this, LANPackage.IO_MT_DEVICE__FUNCTIONS, IoMTDevice.class, msgs);
			msgs = basicSetDevices(newDevices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LANPackage.IO_MT_FUNCTION__DEVICES, newDevices, newDevices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LANPackage.IO_MT_FUNCTION__DEVICES:
				if (devices != null)
					msgs = ((InternalEObject)devices).eInverseRemove(this, LANPackage.IO_MT_DEVICE__FUNCTIONS, IoMTDevice.class, msgs);
				return basicSetDevices((IoMTDevice)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LANPackage.IO_MT_FUNCTION__DEVICES:
				return basicSetDevices(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LANPackage.IO_MT_FUNCTION__DEVICES:
				if (resolve) return getDevices();
				return basicGetDevices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LANPackage.IO_MT_FUNCTION__DEVICES:
				setDevices((IoMTDevice)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LANPackage.IO_MT_FUNCTION__DEVICES:
				setDevices((IoMTDevice)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LANPackage.IO_MT_FUNCTION__DEVICES:
				return devices != null;
		}
		return super.eIsSet(featureID);
	}

} //IoMTFunctionImpl
