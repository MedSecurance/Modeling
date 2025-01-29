package papyrus.web.generate.medsecurance.application.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import IoMTProfile.LAN.Gateway;
import IoMTProfile.WAN.DataStore;

@Service
public class GatewayService extends CommonModelService{
	@Override
	protected HashMap<String, Object> getMapFromModel(HashMap<String, Object> map, String url, String gatewayId) throws IOException {
		ResponseEntity<String> xmlResponse = downloadModel(url);
		InputStream inputStream = new ByteArrayInputStream(xmlResponse.getBody().getBytes());
		Resource umlModel = loadUMLModel(inputStream,"IoMTProfile.profile.uml");
		inputStream.close();
		
		EObject gatewayObject = ((XMIResource) umlModel).getEObject(gatewayId);
		Gateway gateway = (Gateway) ((XMIResource) umlModel).getContents().stream()
		    .filter(eo -> eo instanceof Gateway)
		    .map(eo -> (Gateway) eo)
		    .filter(g -> g.getBase_Class().equals(gatewayObject))
		    .findFirst()
		    .orElse(null);
		
		DataStore dataStore = (gateway != null && gateway.getProxy() != null) ? 
			    gateway.getProxy().getDatastores().stream().findFirst().orElse(null) : null;
		
		if (dataStore != null) {
			Map<String, Object> dataStoreMap = new HashMap<String, Object>();

			dataStoreMap.put("baseClassName",
					dataStore.getBase_Class().getName() != null ? dataStore.getBase_Class().getName()
							: NOT_DEFINED);
			dataStoreMap.put("stereotypeName", dataStore.getName() != null ? dataStore.getName() : NOT_DEFINED);
			dataStoreMap.put("stereotypeUid", dataStore.getUid() != null ? dataStore.getUid() : NOT_DEFINED);

			map.put("dataStore", dataStoreMap);
		}
		
		return map;
	}
	
	@Override
	public void generateAppFileTree(Path rootDir, String url, String gatewayId) throws IOException {
		HashMap <String, Object> map = getMapFromModel(new HashMap<String, Object>(), url, gatewayId);
		map.put("serverPort", "8000");
		
		String pomXML = generateFromTemplate("templates/gateway/pom.xml.mustache", new HashMap<String, Object>());
		String mvnw = generateFromTemplate("templates/gateway/mvnw.mustache", new HashMap<String, Object>());
		String mvnwCMD = generateFromTemplate("templates/gateway/mvnw.cmd.mustache", new HashMap<String, Object>());
		String project = generateFromTemplate("templates/gateway/.project.mustache", new HashMap<String, Object>());
		String classpath = generateFromTemplate("templates/gateway/.classpath.mustache", new HashMap<String, Object>());
		String helpMD = generateFromTemplate("templates/gateway/HELP.md.mustache", new HashMap<String, Object>());
		
		Path mvnWrapperDir = Files.createDirectories(rootDir.resolve(".mvn/wrapper"));
		String mvnWrapper = generateFromTemplate("templates/gateway/.mvn/wrapper/maven-wrapper.properties.mustache", new HashMap<String, Object>());
		
		Path resourcesDir = Files.createDirectories(rootDir.resolve("src/main/resources"));
		String resourcesPROPERTIES = generateFromTemplate("templates/gateway/src/main/resources/application.properties.mustache", map); 
		
		Path srcMainJavaDir = Files.createDirectories(rootDir.resolve("src/main/java"));
		Path pwmigDir = Files.createDirectories(srcMainJavaDir.resolve("papyrus/web/medsecurance/iomt/gateway"));
		String pwmigPapyrusWebMedsecuranceGatewayApplicationJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/PapyrusWebMedsecuranceGatewayApplication.java.mustache", new HashMap<String, Object>()); 
		
		Path pwmigConfigurationDir = Files.createDirectories(pwmigDir.resolve("configuration"));
		String pwmigGatewayConfigurationJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/configuration/GatewayConfiguration.java.mustache", new HashMap<String, Object>()); 
		String pwmigWebConfigurationJAVA = generateFromTemplate    ("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/configuration/WebConfiguration.java.mustache", new HashMap<String, Object>()); 
		
		Path pwmigControllerDir = Files.createDirectories(pwmigDir.resolve("controller"));
		String pwmigDeviceControllerJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/controller/DeviceController.java.mustache", new HashMap<String, Object>()); 
		String pwmigGatewayControllerJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/controller/GatewayController.java.mustache", new HashMap<String, Object>()); 
		String pwmigLocationControllerJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/controller/LocationController.java.mustache", new HashMap<String, Object>()); 
		String pwmigPatientControllerJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/controller/PatientController.java.mustache", new HashMap<String, Object>()); 
		String pwmigPersonControllerJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/controller/PersonController.java.mustache", new HashMap<String, Object>()); 
		String pwmigPractitionerControllerJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/controller/PractitionerController.java.mustache", new HashMap<String, Object>()); 
		String pwmigSubscriptionControllerJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/controller/SubscriptionController.java.mustache", new HashMap<String, Object>()); 
		
		Path pwmigDtoDir = Files.createDirectories(pwmigDir.resolve("dto"));
		String pwmigDeviceDTOJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/dto/DeviceDTO.java.mustache", new HashMap<String, Object>()); 
		String pwmigGatewayDTOJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/dto/GatewayDTO.java.mustache", new HashMap<String, Object>()); 
		String pwmigLocationDTOJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/dto/LocationDTO.java.mustache", new HashMap<String, Object>()); 
		String pwmigPatientDTOJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/dto/PatientDTO.java.mustache", new HashMap<String, Object>()); 
		String pwmigPersonDTOJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/dto/PersonDTO.java.mustache", new HashMap<String, Object>()); 
		String pwmigPractitionerDTOJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/dto/PractitionerDTO.java.mustache", new HashMap<String, Object>()); 
		
		Path pwmigFhirDir = Files.createDirectories(pwmigDir.resolve("fhir/configuration"));
		String pwmigFhirClientConfigurationJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/fhir/configuration/FhirClientConfiguration.java.mustache", new HashMap<String, Object>()); 
		
		Path pwmigModelDir = Files.createDirectories(pwmigDir.resolve("model"));
		String pwmigGatewayJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/model/Gateway.java.mustache", new HashMap<String, Object>()); 
		
		Path pwmigMqttDir = Files.createDirectories(pwmigDir.resolve("mqtt/configuration"));
		String pwmigMQTTConfigurationJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/mqtt/configuration/MQTTConfiguration.java.mustache", new HashMap<String, Object>()); 
		
		Path pwmigServiceDir = Files.createDirectories(pwmigDir.resolve("service"));
		String pwmigDeviceServiceJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/service/DeviceService.java.mustache", new HashMap<String, Object>());
		String pwmigGatewayServiceJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/service/GatewayService.java.mustache", new HashMap<String, Object>());
		String pwmigLocationServiceJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/service/LocationService.java.mustache", new HashMap<String, Object>());
		String pwmigPatientServiceJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/service/PatientService.java.mustache", new HashMap<String, Object>());
		String pwmigPersonServiceJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/service/PersonService.java.mustache", new HashMap<String, Object>());
		String pwmigPractitionerServiceJAVA = generateFromTemplate("templates/gateway/src/main/java/papyrus/web/medsecurance/iomt/gateway/service/PractitionerService.java.mustache", new HashMap<String, Object>());
		
		Files.write(rootDir.resolve("pom.xml"), pomXML.getBytes());
		Files.write(rootDir.resolve("mvnw"), mvnw.getBytes());
		Files.write(rootDir.resolve("mvnw.cmd"), mvnwCMD.getBytes());
		Files.write(rootDir.resolve(".project"), project.getBytes());
		Files.write(rootDir.resolve(".classpath"), classpath.getBytes());
		Files.write(rootDir.resolve("HELP.md"), helpMD.getBytes());
		
		Files.write(mvnWrapperDir.resolve("maven-wrapper.properties"), mvnWrapper.getBytes());
		Files.write(resourcesDir.resolve("application.properties"), resourcesPROPERTIES.getBytes());
		
		Files.write(pwmigDir.resolve("PapyrusWebMedsecuranceGatewayApplication.java"), pwmigPapyrusWebMedsecuranceGatewayApplicationJAVA.getBytes());
		
		Files.write(pwmigConfigurationDir.resolve("GatewayConfiguration.java"), pwmigGatewayConfigurationJAVA.getBytes());
		Files.write(pwmigConfigurationDir.resolve("WebConfiguration.java"), pwmigWebConfigurationJAVA.getBytes());
		
		Files.write(pwmigControllerDir.resolve("DeviceController.java"), pwmigDeviceControllerJAVA.getBytes());
		Files.write(pwmigControllerDir.resolve("GatewayController.java"), pwmigGatewayControllerJAVA.getBytes());
		Files.write(pwmigControllerDir.resolve("LocationController.java"), pwmigLocationControllerJAVA.getBytes());
		Files.write(pwmigControllerDir.resolve("PatientController.java"), pwmigPatientControllerJAVA.getBytes());
		Files.write(pwmigControllerDir.resolve("PersonController.java"), pwmigPersonControllerJAVA.getBytes());
		Files.write(pwmigControllerDir.resolve("PractitionerController.java"), pwmigPractitionerControllerJAVA.getBytes());
		Files.write(pwmigControllerDir.resolve("SubscriptionController.java"), pwmigSubscriptionControllerJAVA.getBytes());
		
		Files.write(pwmigDtoDir.resolve("DeviceDTO.java"), pwmigDeviceDTOJAVA.getBytes());
		Files.write(pwmigDtoDir.resolve("GatewayDTO.java"), pwmigGatewayDTOJAVA.getBytes());
		Files.write(pwmigDtoDir.resolve("LocationDTO.java"), pwmigLocationDTOJAVA.getBytes());
		Files.write(pwmigDtoDir.resolve("PatientDTO.java"), pwmigPatientDTOJAVA.getBytes());
		Files.write(pwmigDtoDir.resolve("PersonDTO.java"), pwmigPersonDTOJAVA.getBytes());
		Files.write(pwmigDtoDir.resolve("PractitionerDTO.java"), pwmigPractitionerDTOJAVA.getBytes());
		
		Files.write(pwmigFhirDir.resolve("FhirClientConfiguration.java"), pwmigFhirClientConfigurationJAVA.getBytes());
		
		Files.write(pwmigModelDir.resolve("Gateway.java"), pwmigGatewayJAVA.getBytes());
		
		Files.write(pwmigMqttDir.resolve("MQTTConfiguration.java"), pwmigMQTTConfigurationJAVA.getBytes());
		
		Files.write(pwmigServiceDir.resolve("DeviceService.java"), pwmigDeviceServiceJAVA.getBytes());
		Files.write(pwmigServiceDir.resolve("GatewayService.java"), pwmigGatewayServiceJAVA.getBytes());
		Files.write(pwmigServiceDir.resolve("LocationService.java"), pwmigLocationServiceJAVA.getBytes());
		Files.write(pwmigServiceDir.resolve("PatientService.java"), pwmigPatientServiceJAVA.getBytes());
		Files.write(pwmigServiceDir.resolve("PersonService.java"), pwmigPersonServiceJAVA.getBytes());
		Files.write(pwmigServiceDir.resolve("PractitionerService.java"), pwmigPractitionerServiceJAVA.getBytes());
	}
}
