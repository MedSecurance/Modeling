package papyrus.web.generate.medsecurance.application.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.uml.UMLPackage;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import IoMTAssets.IoMTAssetsPackage;
import IoMTComponentCategories.IoMTComponentCategoriesPackage;
import IoMTProfile.IoMTProfilePackage;
import assertions.AssertionsPackage;

public abstract class CommonModelService {
	protected final static String NOT_DEFINED = "###value_not_set###";
	
	protected abstract HashMap<String, Object> getMapFromModel(HashMap<String, Object> map, String url, String componentId) throws IOException;
	protected abstract void generateAppFileTree(Path rootDir, String url, String gatewayId) throws IOException;
	
	protected ResponseEntity<String> downloadModel(String url) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/xml");
		HttpEntity<String> entity = new HttpEntity<>(headers);

		return restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
	}

	protected Resource loadUMLModel(InputStream inputModel, String uriString) throws IOException {
		org.eclipse.uml2.uml.resources.util.UMLResourcesUtil.initGlobalRegistries();
		UMLPackage.eINSTANCE.eClass();
		IoMTProfilePackage.eINSTANCE.eClass();
		IoMTComponentCategoriesPackage.eINSTANCE.eClass();
		AssertionsPackage.eINSTANCE.eClass();
		IoMTAssetsPackage.eINSTANCE.eClass();

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("uml", new XMIResourceFactoryImpl());

		Resource umlModel = resourceSet.createResource(org.eclipse.emf.common.util.URI.createURI("model.uml"));
		umlModel.load(inputModel, Collections.EMPTY_MAP);

		return umlModel;
	}

	protected String generateFromTemplate(String templateName, Map<String, Object> data) {
		MustacheFactory mf = new DefaultMustacheFactory();
		Mustache mustache = mf.compile(templateName);

		StringWriter writer = new StringWriter();
		mustache.execute(writer, data);

		return writer.toString();
	}

	public File createZip(Path srcDirPath) throws IOException {
		File zipFile = Files.createTempFile("deviceAppTree", "zip").toFile();
		try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFile))) {
			Files.walk(srcDirPath).filter(path -> !Files.isDirectory(path)).forEach(path -> {
				ZipEntry zipEntry = new ZipEntry(srcDirPath.relativize(path).toString());

				try {
					zos.putNextEntry(zipEntry);
					Files.copy(path, zos);
					zos.closeEntry();
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		}
		return zipFile;
	}
}
