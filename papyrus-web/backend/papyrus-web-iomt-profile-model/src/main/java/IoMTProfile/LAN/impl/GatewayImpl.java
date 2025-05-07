/**
 */
package IoMTProfile.LAN.impl;

import IoMTProfile.GatewayType;
import IoMTProfile.Interface;

import IoMTProfile.LAN.Gateway;
import IoMTProfile.LAN.IoMTDevice;
import IoMTProfile.LAN.LANPackage;

import IoMTProfile.WAN.Proxy;
import IoMTProfile.WAN.WANPackage;

import IoMTProfile.impl.IdentifiableElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link IoMTProfile.LAN.impl.GatewayImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link IoMTProfile.LAN.impl.GatewayImpl#getInternalInterface <em>Internal Interface</em>}</li>
 *   <li>{@link IoMTProfile.LAN.impl.GatewayImpl#getExternalInterface <em>External Interface</em>}</li>
 *   <li>{@link IoMTProfile.LAN.impl.GatewayImpl#getGatewayType <em>Gateway Type</em>}</li>
 *   <li>{@link IoMTProfile.LAN.impl.GatewayImpl#getProxy <em>Proxy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GatewayImpl extends IdentifiableElementImpl implements Gateway {
	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<IoMTDevice> devices;

	/**
	 * The default value of the '{@link #getInternalInterface() <em>Internal Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalInterface()
	 * @generated
	 * @ordered
	 */
	protected static final Interface INTERNAL_INTERFACE_EDEFAULT = Interface.RFID;

	/**
	 * The cached value of the '{@link #getInternalInterface() <em>Internal Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface internalInterface = INTERNAL_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalInterface() <em>External Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalInterface()
	 * @generated
	 * @ordered
	 */
	protected static final Interface EXTERNAL_INTERFACE_EDEFAULT = Interface.RFID;

	/**
	 * The cached value of the '{@link #getExternalInterface() <em>External Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface externalInterface = EXTERNAL_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGatewayType() <em>Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayType()
	 * @generated
	 * @ordered
	 */
	protected static final GatewayType GATEWAY_TYPE_EDEFAULT = GatewayType.REST;

	/**
	 * The cached value of the '{@link #getGatewayType() <em>Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayType()
	 * @generated
	 * @ordered
	 */
	protected GatewayType gatewayType = GATEWAY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProxy() <em>Proxy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxy()
	 * @generated
	 * @ordered
	 */
	protected Proxy proxy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LANPackage.Literals.GATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IoMTDevice> getDevices() {
		if (devices == null) {
			devices = new EObjectWithInverseResolvingEList<IoMTDevice>(IoMTDevice.class, this, LANPackage.GATEWAY__DEVICES, LANPackage.IO_MT_DEVICE__GATEWAY);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface getInternalInterface() {
		return internalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalInterface(Interface newInternalInterface) {
		Interface oldInternalInterface = internalInterface;
		internalInterface = newInternalInterface == null ? INTERNAL_INTERFACE_EDEFAULT : newInternalInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LANPackage.GATEWAY__INTERNAL_INTERFACE, oldInternalInterface, internalInterface));
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface getExternalInterface() {
		return externalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalInterface(Interface newExternalInterface) {
		Interface oldExternalInterface = externalInterface;
		externalInterface = newExternalInterface == null ? EXTERNAL_INTERFACE_EDEFAULT : newExternalInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LANPackage.GATEWAY__EXTERNAL_INTERFACE, oldExternalInterface, externalInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GatewayType getGatewayType() {
		return gatewayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayType(GatewayType newGatewayType) {
		GatewayType oldGatewayType = gatewayType;
		gatewayType = newGatewayType == null ? GATEWAY_TYPE_EDEFAULT : newGatewayType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LANPackage.GATEWAY__GATEWAY_TYPE, oldGatewayType, gatewayType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Proxy getProxy() {
		if (proxy != null && proxy.eIsProxy()) {
			InternalEObject oldProxy = (InternalEObject)proxy;
			proxy = (Proxy)eResolveProxy(oldProxy);
			if (proxy != oldProxy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LANPackage.GATEWAY__PROXY, oldProxy, proxy));
			}
		}
		return proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proxy basicGetProxy() {
		return proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProxy(Proxy newProxy, NotificationChain msgs) {
		Proxy oldProxy = proxy;
		proxy = newProxy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LANPackage.GATEWAY__PROXY, oldProxy, newProxy);
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
	public void setProxy(Proxy newProxy) {
		if (newProxy != proxy) {
			NotificationChain msgs = null;
			if (proxy != null)
				msgs = ((InternalEObject)proxy).eInverseRemove(this, WANPackage.PROXY__GATEWAYS, Proxy.class, msgs);
			if (newProxy != null)
				msgs = ((InternalEObject)newProxy).eInverseAdd(this, WANPackage.PROXY__GATEWAYS, Proxy.class, msgs);
			msgs = basicSetProxy(newProxy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LANPackage.GATEWAY__PROXY, newProxy, newProxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LANPackage.GATEWAY__DEVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDevices()).basicAdd(otherEnd, msgs);
			case LANPackage.GATEWAY__PROXY:
				if (proxy != null)
					msgs = ((InternalEObject)proxy).eInverseRemove(this, WANPackage.PROXY__GATEWAYS, Proxy.class, msgs);
				return basicSetProxy((Proxy)otherEnd, msgs);
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
			case LANPackage.GATEWAY__DEVICES:
				return ((InternalEList<?>)getDevices()).basicRemove(otherEnd, msgs);
			case LANPackage.GATEWAY__PROXY:
				return basicSetProxy(null, msgs);
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
			case LANPackage.GATEWAY__DEVICES:
				return getDevices();
			case LANPackage.GATEWAY__INTERNAL_INTERFACE:
				return getInternalInterface();
			case LANPackage.GATEWAY__EXTERNAL_INTERFACE:
				return getExternalInterface();
			case LANPackage.GATEWAY__GATEWAY_TYPE:
				return getGatewayType();
			case LANPackage.GATEWAY__PROXY:
				if (resolve) return getProxy();
				return basicGetProxy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LANPackage.GATEWAY__DEVICES:
				getDevices().clear();
				getDevices().addAll((Collection<? extends IoMTDevice>)newValue);
				return;
			case LANPackage.GATEWAY__INTERNAL_INTERFACE:
				setInternalInterface((Interface)newValue);
				return;
			case LANPackage.GATEWAY__EXTERNAL_INTERFACE:
				setExternalInterface((Interface)newValue);
				return;
			case LANPackage.GATEWAY__GATEWAY_TYPE:
				setGatewayType((GatewayType)newValue);
				return;
			case LANPackage.GATEWAY__PROXY:
				setProxy((Proxy)newValue);
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
			case LANPackage.GATEWAY__DEVICES:
				getDevices().clear();
				return;
			case LANPackage.GATEWAY__INTERNAL_INTERFACE:
				setInternalInterface(INTERNAL_INTERFACE_EDEFAULT);
				return;
			case LANPackage.GATEWAY__EXTERNAL_INTERFACE:
				setExternalInterface(EXTERNAL_INTERFACE_EDEFAULT);
				return;
			case LANPackage.GATEWAY__GATEWAY_TYPE:
				setGatewayType(GATEWAY_TYPE_EDEFAULT);
				return;
			case LANPackage.GATEWAY__PROXY:
				setProxy((Proxy)null);
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
			case LANPackage.GATEWAY__DEVICES:
				return devices != null && !devices.isEmpty();
			case LANPackage.GATEWAY__INTERNAL_INTERFACE:
				return internalInterface != INTERNAL_INTERFACE_EDEFAULT;
			case LANPackage.GATEWAY__EXTERNAL_INTERFACE:
				return externalInterface != EXTERNAL_INTERFACE_EDEFAULT;
			case LANPackage.GATEWAY__GATEWAY_TYPE:
				return gatewayType != GATEWAY_TYPE_EDEFAULT;
			case LANPackage.GATEWAY__PROXY:
				return proxy != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (InternalInterface: ");
		result.append(internalInterface);
		result.append(", ExternalInterface: ");
		result.append(externalInterface);
		result.append(", gatewayType: ");
		result.append(gatewayType);
		result.append(')');
		return result.toString();
	}

} //GatewayImpl
