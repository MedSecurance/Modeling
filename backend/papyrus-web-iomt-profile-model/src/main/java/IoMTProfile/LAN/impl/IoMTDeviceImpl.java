/**
 */
package IoMTProfile.LAN.impl;

import IoMTProfile.Application.ApplicationPackage;
import IoMTProfile.Application.Location;

import IoMTProfile.Interface;

import IoMTProfile.LAN.Gateway;
import IoMTProfile.LAN.IoMTConfiguration;
import IoMTProfile.LAN.IoMTDevice;
import IoMTProfile.LAN.IoMTFunction;
import IoMTProfile.LAN.IoMTService;
import IoMTProfile.LAN.LANPackage;

import IoMTProfile.impl.IdentifiableElementImpl;

import java.lang.reflect.InvocationTargetException;

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
 * An implementation of the model object '<em><b>Io MT Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link IoMTProfile.LAN.impl.IoMTDeviceImpl#getInternalInterface <em>Internal Interface</em>}</li>
 *   <li>{@link IoMTProfile.LAN.impl.IoMTDeviceImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link IoMTProfile.LAN.impl.IoMTDeviceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link IoMTProfile.LAN.impl.IoMTDeviceImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link IoMTProfile.LAN.impl.IoMTDeviceImpl#getServices <em>Services</em>}</li>
 *   <li>{@link IoMTProfile.LAN.impl.IoMTDeviceImpl#getGateway <em>Gateway</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IoMTDeviceImpl extends IdentifiableElementImpl implements IoMTDevice {
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
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected IoMTConfiguration configuration;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<IoMTFunction> functions;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<IoMTService> services;

	/**
	 * The cached value of the '{@link #getGateway() <em>Gateway</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected Gateway gateway;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoMTDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LANPackage.Literals.IO_MT_DEVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LANPackage.IO_MT_DEVICE__INTERNAL_INTERFACE, oldInternalInterface, internalInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoMTConfiguration getConfiguration() {
		if (configuration != null && configuration.eIsProxy()) {
			InternalEObject oldConfiguration = (InternalEObject)configuration;
			configuration = (IoMTConfiguration)eResolveProxy(oldConfiguration);
			if (configuration != oldConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LANPackage.IO_MT_DEVICE__CONFIGURATION, oldConfiguration, configuration));
			}
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoMTConfiguration basicGetConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(IoMTConfiguration newConfiguration, NotificationChain msgs) {
		IoMTConfiguration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LANPackage.IO_MT_DEVICE__CONFIGURATION, oldConfiguration, newConfiguration);
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
	public void setConfiguration(IoMTConfiguration newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, LANPackage.IO_MT_CONFIGURATION__DEVICE, IoMTConfiguration.class, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, LANPackage.IO_MT_CONFIGURATION__DEVICE, IoMTConfiguration.class, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LANPackage.IO_MT_DEVICE__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LANPackage.IO_MT_DEVICE__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LANPackage.IO_MT_DEVICE__LOCATION, oldLocation, newLocation);
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
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, ApplicationPackage.LOCATION__DEVICES, Location.class, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, ApplicationPackage.LOCATION__DEVICES, Location.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LANPackage.IO_MT_DEVICE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IoMTFunction> getFunctions() {
		if (functions == null) {
			functions = new EObjectWithInverseResolvingEList<IoMTFunction>(IoMTFunction.class, this, LANPackage.IO_MT_DEVICE__FUNCTIONS, LANPackage.IO_MT_FUNCTION__DEVICES);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoMTFunction getFunctions(String name) {
		return getFunctions(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoMTFunction getFunctions(String name, boolean ignoreCase, EClass eClass) {
		functionsLoop: for (IoMTFunction functions : getFunctions()) {
			if (eClass != null && !eClass.isInstance(functions))
				continue functionsLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(functions.getName()) : name.equals(functions.getName())))
				continue functionsLoop;
			return functions;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IoMTService> getServices() {
		if (services == null) {
			services = new EObjectWithInverseResolvingEList<IoMTService>(IoMTService.class, this, LANPackage.IO_MT_DEVICE__SERVICES, LANPackage.IO_MT_SERVICE__DEVICE);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gateway getGateway() {
		if (gateway != null && gateway.eIsProxy()) {
			InternalEObject oldGateway = (InternalEObject)gateway;
			gateway = (Gateway)eResolveProxy(oldGateway);
			if (gateway != oldGateway) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LANPackage.IO_MT_DEVICE__GATEWAY, oldGateway, gateway));
			}
		}
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gateway basicGetGateway() {
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGateway(Gateway newGateway, NotificationChain msgs) {
		Gateway oldGateway = gateway;
		gateway = newGateway;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LANPackage.IO_MT_DEVICE__GATEWAY, oldGateway, newGateway);
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
	public void setGateway(Gateway newGateway) {
		if (newGateway != gateway) {
			NotificationChain msgs = null;
			if (gateway != null)
				msgs = ((InternalEObject)gateway).eInverseRemove(this, LANPackage.GATEWAY__DEVICES, Gateway.class, msgs);
			if (newGateway != null)
				msgs = ((InternalEObject)newGateway).eInverseAdd(this, LANPackage.GATEWAY__DEVICES, Gateway.class, msgs);
			msgs = basicSetGateway(newGateway, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LANPackage.IO_MT_DEVICE__GATEWAY, newGateway, newGateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void openSession() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void closeSession() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case LANPackage.IO_MT_DEVICE__CONFIGURATION:
				if (configuration != null)
					msgs = ((InternalEObject)configuration).eInverseRemove(this, LANPackage.IO_MT_CONFIGURATION__DEVICE, IoMTConfiguration.class, msgs);
				return basicSetConfiguration((IoMTConfiguration)otherEnd, msgs);
			case LANPackage.IO_MT_DEVICE__LOCATION:
				if (location != null)
					msgs = ((InternalEObject)location).eInverseRemove(this, ApplicationPackage.LOCATION__DEVICES, Location.class, msgs);
				return basicSetLocation((Location)otherEnd, msgs);
			case LANPackage.IO_MT_DEVICE__FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFunctions()).basicAdd(otherEnd, msgs);
			case LANPackage.IO_MT_DEVICE__SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServices()).basicAdd(otherEnd, msgs);
			case LANPackage.IO_MT_DEVICE__GATEWAY:
				if (gateway != null)
					msgs = ((InternalEObject)gateway).eInverseRemove(this, LANPackage.GATEWAY__DEVICES, Gateway.class, msgs);
				return basicSetGateway((Gateway)otherEnd, msgs);
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
			case LANPackage.IO_MT_DEVICE__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
			case LANPackage.IO_MT_DEVICE__LOCATION:
				return basicSetLocation(null, msgs);
			case LANPackage.IO_MT_DEVICE__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
			case LANPackage.IO_MT_DEVICE__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case LANPackage.IO_MT_DEVICE__GATEWAY:
				return basicSetGateway(null, msgs);
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
			case LANPackage.IO_MT_DEVICE__INTERNAL_INTERFACE:
				return getInternalInterface();
			case LANPackage.IO_MT_DEVICE__CONFIGURATION:
				if (resolve) return getConfiguration();
				return basicGetConfiguration();
			case LANPackage.IO_MT_DEVICE__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case LANPackage.IO_MT_DEVICE__FUNCTIONS:
				return getFunctions();
			case LANPackage.IO_MT_DEVICE__SERVICES:
				return getServices();
			case LANPackage.IO_MT_DEVICE__GATEWAY:
				if (resolve) return getGateway();
				return basicGetGateway();
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
			case LANPackage.IO_MT_DEVICE__INTERNAL_INTERFACE:
				setInternalInterface((Interface)newValue);
				return;
			case LANPackage.IO_MT_DEVICE__CONFIGURATION:
				setConfiguration((IoMTConfiguration)newValue);
				return;
			case LANPackage.IO_MT_DEVICE__LOCATION:
				setLocation((Location)newValue);
				return;
			case LANPackage.IO_MT_DEVICE__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends IoMTFunction>)newValue);
				return;
			case LANPackage.IO_MT_DEVICE__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends IoMTService>)newValue);
				return;
			case LANPackage.IO_MT_DEVICE__GATEWAY:
				setGateway((Gateway)newValue);
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
			case LANPackage.IO_MT_DEVICE__INTERNAL_INTERFACE:
				setInternalInterface(INTERNAL_INTERFACE_EDEFAULT);
				return;
			case LANPackage.IO_MT_DEVICE__CONFIGURATION:
				setConfiguration((IoMTConfiguration)null);
				return;
			case LANPackage.IO_MT_DEVICE__LOCATION:
				setLocation((Location)null);
				return;
			case LANPackage.IO_MT_DEVICE__FUNCTIONS:
				getFunctions().clear();
				return;
			case LANPackage.IO_MT_DEVICE__SERVICES:
				getServices().clear();
				return;
			case LANPackage.IO_MT_DEVICE__GATEWAY:
				setGateway((Gateway)null);
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
			case LANPackage.IO_MT_DEVICE__INTERNAL_INTERFACE:
				return internalInterface != INTERNAL_INTERFACE_EDEFAULT;
			case LANPackage.IO_MT_DEVICE__CONFIGURATION:
				return configuration != null;
			case LANPackage.IO_MT_DEVICE__LOCATION:
				return location != null;
			case LANPackage.IO_MT_DEVICE__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case LANPackage.IO_MT_DEVICE__SERVICES:
				return services != null && !services.isEmpty();
			case LANPackage.IO_MT_DEVICE__GATEWAY:
				return gateway != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LANPackage.IO_MT_DEVICE___OPEN_SESSION:
				openSession();
				return null;
			case LANPackage.IO_MT_DEVICE___CLOSE_SESSION:
				closeSession();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(')');
		return result.toString();
	}

} //IoMTDeviceImpl
