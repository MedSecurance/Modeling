/**
 */
package IoMTProfile.LAN.impl;

import IoMTProfile.LAN.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LANFactoryImpl extends EFactoryImpl implements LANFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LANFactory init() {
		try {
			LANFactory theLANFactory = (LANFactory)EPackage.Registry.INSTANCE.getEFactory(LANPackage.eNS_URI);
			if (theLANFactory != null) {
				return theLANFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LANFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LANFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LANPackage.IO_MT_DEVICE: return createIoMTDevice();
			case LANPackage.IO_MT_CONFIGURATION: return createIoMTConfiguration();
			case LANPackage.EXTERNAL_FUNCTION: return createExternalFunction();
			case LANPackage.ACTUATOR: return createActuator();
			case LANPackage.SENSOR: return createSensor();
			case LANPackage.GATEWAY: return createGateway();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoMTDevice createIoMTDevice() {
		IoMTDeviceImpl ioMTDevice = new IoMTDeviceImpl();
		return ioMTDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoMTConfiguration createIoMTConfiguration() {
		IoMTConfigurationImpl ioMTConfiguration = new IoMTConfigurationImpl();
		return ioMTConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalFunction createExternalFunction() {
		ExternalFunctionImpl externalFunction = new ExternalFunctionImpl();
		return externalFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gateway createGateway() {
		GatewayImpl gateway = new GatewayImpl();
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LANPackage getLANPackage() {
		return (LANPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LANPackage getPackage() {
		return LANPackage.eINSTANCE;
	}

} //LANFactoryImpl
