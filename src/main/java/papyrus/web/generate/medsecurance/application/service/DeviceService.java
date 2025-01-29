package papyrus.web.generate.medsecurance.application.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import IoMTComponentCategories.ComponentAnnotationKind;
import IoMTComponentCategories.IoMTcomponent;
import IoMTProfile.IdentifiableElement;
import IoMTProfile.LAN.Actuator;
import IoMTProfile.LAN.GatewayType;
import IoMTProfile.LAN.IoMTDevice;
import IoMTProfile.LAN.Sensor;

@Service
public class DeviceService extends CommonModelService {
	private boolean iomtComponentAccessPermission = false;
	private Map<String, Object> createMapFromObject(EObject obj) {
		Map<String, Object> objMap = new HashMap<>();
		objMap.put("baseClassName",
				((IdentifiableElement) obj).getBase_Class().getName() != null
						? ((IdentifiableElement) obj).getBase_Class().getName()
						: NOT_DEFINED);
		objMap.put("stereotypeName",
				((IdentifiableElement) obj).getName() != null ? ((IdentifiableElement) obj).getName() : NOT_DEFINED);
		objMap.put("stereotypeUid",
				((IdentifiableElement) obj).getUid() != null ? ((IdentifiableElement) obj).getUid() : NOT_DEFINED);
		return objMap;
	}

	@Override
	protected HashMap<String, Object> getMapFromModel(HashMap<String, Object> map, String url, String deviceId)
			throws IOException {
		ResponseEntity<String> xmlResponse = downloadModel(url);
		InputStream inputStream = new ByteArrayInputStream(xmlResponse.getBody().getBytes());
		Resource umlModel = loadUMLModel(inputStream, "IoMTProfile.profile.uml");
		inputStream.close();

		List<Object> devices = new ArrayList<Object>();
		List<Object> actuators = new ArrayList<Object>();
		List<Object> sensors = new ArrayList<Object>();

		EObject deviceObject = ((XMIResource) umlModel).getEObject(deviceId);
		IoMTDevice ioMTDevice = ((XMIResource) umlModel).getContents().stream().filter(eo -> eo instanceof IoMTDevice)
				.map(eo -> (IoMTDevice) eo).filter(g -> g.getBase_Class().equals(deviceObject)).findFirst()
				.orElse(null);

		if (ioMTDevice != null) {
			devices.add(createMapFromObject(ioMTDevice));
			setAccessPermission(umlModel, ioMTDevice);

			for (EObject eobj : deviceObject.eContents()) {
				((XMIResource) umlModel).getContents().stream().filter(eo -> eo instanceof Actuator)
						.map(eo -> (Actuator) eo).filter(g -> g.getBase_Class().equals(eobj)).findFirst()
						.map(this::createMapFromObject).ifPresent(actuators::add);

				((XMIResource) umlModel).getContents().stream().filter(eo -> eo instanceof Sensor)
				.map(eo -> (Sensor) eo).filter(g -> g.getBase_Class().equals(eobj)).findFirst()
				.map(this::createMapFromObject).ifPresent(sensors::add);
			}

			Optional.ofNullable(ioMTDevice.getGateway())
		    .filter(gateway -> gateway.getGatewayType().equals(GatewayType.MQTT))
		    .map(gateway -> {
		        map.put("gateway", createMapFromObject(gateway));
		        return gateway.getProxy();
		    })
		    .ifPresent(proxy -> {
		        map.put("proxy", createMapFromObject(proxy));
		        Optional.ofNullable(proxy.getDatastores().stream().findFirst().orElse(null))
		            .ifPresent(dataStore -> map.put("dataStore", createMapFromObject(dataStore)));
		    });
		}
		
		map.put("devices", devices);
		map.put("actuators", actuators);
		map.put("sensors", sensors);

		return map;
	}

	private void setAccessPermission(Resource umlModel, IoMTDevice ioMTDevice) {
		iomtComponentAccessPermission = false;
//		for (EObject eo : ((XMIResource) umlModel).getContents()) {
//			if (eo instanceof IoMTcomponent ioMTcomponent) {
//				System.err.println(ioMTcomponent);
//				if (ioMTcomponent.getBase_Class().equals(ioMTDevice.getBase_Class())) {
//					if (!ioMTcomponent.getSupportedFeatures().isEmpty()) {
//						EList <ComponentAnnotationKind> f = ioMTcomponent.getSupportedFeatures();
//						iomtComponentAccessPermission = ioMTcomponent.getSupportedFeatures().contains(ComponentAnnotationKind.ACCESS_PERMISSION);
//					}
//				}
//			}
//		}
	    ((XMIResource) umlModel).getContents().stream()
	        .filter(eo -> eo instanceof IoMTcomponent)
	        .map(eo -> (IoMTcomponent) eo)
	        .filter(ioMTcomponent -> ioMTcomponent.getBase_Class().equals(ioMTDevice.getBase_Class()))
	        .filter(ioMTcomponent -> !ioMTcomponent.getSupportedFeatures().isEmpty())
	        .forEach(ioMTcomponent -> iomtComponentAccessPermission = ioMTcomponent.getSupportedFeatures().contains(ComponentAnnotationKind.ACCESS_PERMISSION));
	}
	
	private boolean getAccessPermission() {
		return iomtComponentAccessPermission;
	}

	@Override
	public void generateAppFileTree(Path rootDir, String url, String deviceId) throws IOException {
		HashMap<String, Object> map = getMapFromModel(new HashMap<String, Object>(), url, deviceId);
		map.put("serverPort", "8001");
		if (getAccessPermission()) {
			map.put("accessPermission", "This device is marked with required access permission");
		}

		String pomXML = generateFromTemplate("templates/device/pom.xml.mustache", new HashMap<String, Object>());
		String mvnw = generateFromTemplate("templates/device/mvnw.mustache", new HashMap<String, Object>());
		String mvnwCMD = generateFromTemplate("templates/device/mvnw.cmd.mustache", new HashMap<String, Object>());
		String project = generateFromTemplate("templates/device/.project.mustache", new HashMap<String, Object>());
		String classpath = generateFromTemplate("templates/device/.classpath.mustache", new HashMap<String, Object>());
		String helpMD = generateFromTemplate("templates/device/HELP.md.mustache", new HashMap<String, Object>());

		Path mvnWrapperDir = Files.createDirectories(rootDir.resolve(".mvn/wrapper"));
		String mvnWrapper = generateFromTemplate("templates/device/.mvn/wrapper/maven-wrapper.properties.mustache",
				new HashMap<String, Object>());

		Path resourcesDir = Files.createDirectories(rootDir.resolve("src/main/resources"));
		String resourcesPROPERTIES = generateFromTemplate(
				"templates/device/src/main/resources/application.properties.mustache", map);

		Path srcMainJavaDir = Files.createDirectories(rootDir.resolve("src/main/java"));
		Path pwmidDir = Files.createDirectories(srcMainJavaDir.resolve("papyrus/web/medsecurance/iomt/device"));
		String pwmidPapyrusWebMedsecuranceIomtDeviceApplicationJAVA = generateFromTemplate(
				"templates/device/src/main/java/papyrus/web/medsecurance/iomt/device/PapyrusWebMedsecuranceIomtDeviceApplication.java.mustache",
				new HashMap<String, Object>());
		String pwmidWebConfigurationJAVA = generateFromTemplate(
				"templates/device/src/main/java/papyrus/web/medsecurance/iomt/device/WebConfiguration.java.mustache",
				new HashMap<String, Object>());

		Path pwmidaDir = Files.createDirectories(pwmidDir.resolve("action"));
		String pwmidaIActionJAVA = generateFromTemplate(
				"templates/device/src/main/java/papyrus/web/medsecurance/iomt/device/action/IAction.java.mustache",
				new HashMap<String, Object>());

		Path pwmidConfigurationDir = Files.createDirectories(pwmidDir.resolve("configuration"));
		String pwmidcDeviceConfigurationJAVA = generateFromTemplate(
				"templates/device/src/main/java/papyrus/web/medsecurance/iomt/device/configuration/DeviceConfiguration.java.mustache",
				new HashMap<String, Object>());
		String pwmidcMQTTConfigurationJAVA = generateFromTemplate(
				"templates/device/src/main/java/papyrus/web/medsecurance/iomt/device/configuration/MQTTConfiguration.java.mustache",
				new HashMap<String, Object>());

		Path pwmidControllerDir = Files.createDirectories(pwmidDir.resolve("controller"));
		String pwmidcMQTTControllerJAVA = generateFromTemplate(
				"templates/device/src/main/java/papyrus/web/medsecurance/iomt/device/controller/MQTTController.java.mustache",
				new HashMap<String, Object>());

		Path pwmiddDir = Files.createDirectories(pwmidDir.resolve("dto"));
		String pwmiddAbstractActuatorJAVA = generateFromTemplate(
				"templates/device/src/main/java/papyrus/web/medsecurance/iomt/device/dto/AbstractActuator.java.mustache",
				new HashMap<String, Object>());
		String pwmiddAbstractSensorJAVA = generateFromTemplate(
				"templates/device/src/main/java/papyrus/web/medsecurance/iomt/device/dto/AbstractSensor.java.mustache",
				new HashMap<String, Object>());
		String pwmiddDeviceJAVA = generateFromTemplate(
				"templates/device/src/main/java/papyrus/web/medsecurance/iomt/device/dto/Device.java.mustache",
				new HashMap<String, Object>());

		List<Object> sensors = (List<Object>) map.get("sensors");
		for (Object sensor : sensors) {
			Map<String, Object> sensorMap = (Map<String, Object>) sensor;
			String pwmiddGenericSensorJAVA = generateFromTemplate(
					"templates/device/src/main/java/papyrus/web/medsecurance/iomt/device/dto/GenericSensor.java.mustache",
					sensorMap);
			Files.write(pwmiddDir.resolve(sensorMap.get("baseClassName") + ".java"),
					pwmiddGenericSensorJAVA.getBytes());

			String pwmidaReadMessageGenericSensorActionJAVA = generateFromTemplate(
					"templates/device/src/main/java/papyrus/web/medsecurance/iomt/device/action/ReadMessageGenericSensorAction.java.mustache",
					sensorMap);
			Files.write(pwmidaDir.resolve("ReadMessage" + sensorMap.get("baseClassName") + "Action.java"),
					pwmidaReadMessageGenericSensorActionJAVA.getBytes());

			String pwmidaSendMessageGenericSensorActionJAVA = generateFromTemplate(
					"templates/device/src/main/java/papyrus/web/medsecurance/iomt/device/action/SendMessageGenericSensorAction.java.mustache",
					sensorMap);
			Files.write(pwmidaDir.resolve("SendMessage" + sensorMap.get("baseClassName") + "Action.java"),
					pwmidaSendMessageGenericSensorActionJAVA.getBytes());
		}

		List<Object> actuators = (List<Object>) map.get("actuators");
		for (Object actuator : actuators) {
			Map<String, Object> actuatorMap = (Map<String, Object>) actuator;
			String pwmiddGenericActuatorJAVA = generateFromTemplate(
					"templates/device/src/main/java/papyrus/web/medsecurance/iomt/device/dto/GenericActuator.java.mustache",
					actuatorMap);
			Files.write(pwmiddDir.resolve(actuatorMap.get("baseClassName") + ".java"),
					pwmiddGenericActuatorJAVA.getBytes());

			String pwmidaReadMessageGenericActuatorActionJAVA = generateFromTemplate(
					"templates/device/src/main/java/papyrus/web/medsecurance/iomt/device/action/ReadMessageGenericActuatorAction.java.mustache",
					actuatorMap);
			Files.write(pwmidaDir.resolve("ReadMessage" + actuatorMap.get("baseClassName") + "Action.java"),
					pwmidaReadMessageGenericActuatorActionJAVA.getBytes());

			String pwmidaWriteCommandGenericActuatorActionJAVA = generateFromTemplate(
					"templates/device/src/main/java/papyrus/web/medsecurance/iomt/device/action/WriteCommandGenericActuatorAction.java.mustache",
					actuatorMap);
			Files.write(pwmidaDir.resolve("WriteCommand" + actuatorMap.get("baseClassName") + "Action.java"),
					pwmidaWriteCommandGenericActuatorActionJAVA.getBytes());
		}

		Path pwmidsDir = Files.createDirectories(pwmidDir.resolve("service"));
		String pwmidsMQTTMessagingServiceJAVA = generateFromTemplate(
				"templates/device/src/main/java/papyrus/web/medsecurance/iomt/device/service/MQTTMessagingService.java.mustache",
				map);

		Files.write(rootDir.resolve("pom.xml"), pomXML.getBytes());
		Files.write(rootDir.resolve("mvnw"), mvnw.getBytes());
		Files.write(rootDir.resolve("mvnw.cmd"), mvnwCMD.getBytes());
		Files.write(rootDir.resolve(".project"), project.getBytes());
		Files.write(rootDir.resolve(".classpath"), classpath.getBytes());
		Files.write(rootDir.resolve("HELP.md"), helpMD.getBytes());
		Files.write(mvnWrapperDir.resolve("maven-wrapper.properties"), mvnWrapper.getBytes());
		Files.write(pwmidDir.resolve("PapyrusWebMedsecuranceIomtDeviceApplication.java"),
				pwmidPapyrusWebMedsecuranceIomtDeviceApplicationJAVA.getBytes());
		Files.write(pwmidDir.resolve("WebConfiguration.java"), pwmidWebConfigurationJAVA.getBytes());

		Files.write(pwmidaDir.resolve("IAction.java"), pwmidaIActionJAVA.getBytes());

		Files.write(pwmidConfigurationDir.resolve("DeviceConfiguration.java"),
				pwmidcDeviceConfigurationJAVA.getBytes());
		Files.write(pwmidConfigurationDir.resolve("MQTTConfiguration.java"), pwmidcMQTTConfigurationJAVA.getBytes());

		Files.write(pwmidControllerDir.resolve("MQTTController.java"), pwmidcMQTTControllerJAVA.getBytes());

		Files.write(pwmiddDir.resolve("AbstractActuator.java"), pwmiddAbstractActuatorJAVA.getBytes());
		Files.write(pwmiddDir.resolve("AbstractSensor.java"), pwmiddAbstractSensorJAVA.getBytes());
		Files.write(pwmiddDir.resolve("Device.java"), pwmiddDeviceJAVA.getBytes());

		Files.write(pwmidsDir.resolve("MQTTMessagingService.java"), pwmidsMQTTMessagingServiceJAVA.getBytes());

		Files.write(resourcesDir.resolve("application.properties"), resourcesPROPERTIES.getBytes());
	}

}
