package papyrus.web.generate.medsecurance.application.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import papyrus.web.generate.medsecurance.application.service.DeviceService;
import papyrus.web.generate.medsecurance.application.service.GatewayService;

@RestController
@RequestMapping("/generate")
public class GenerateController {
	@Value("${APPWEB_URL}")
	private String appweb_url;

	@Autowired
	GatewayService gatewayService;

	@Autowired
	DeviceService deviceService;

	@GetMapping("/deviceApp")
	public ResponseEntity<InputStreamResource> generateDeviceAppZip(@RequestParam("edCtx") String edCtx,
			@RequestParam("doc") String doc, @RequestParam("deviceId") String deviceId) throws IOException {
		Path tempDir = Files.createTempDirectory("mustache-template");

		String url = appweb_url + "/api" + "/editingcontexts/" + edCtx + "/documents/" + doc;

		deviceService.generateAppFileTree(tempDir, url, deviceId);
		File zipFile = deviceService.createZip(tempDir);

		InputStreamResource resource = new InputStreamResource(new FileInputStream(zipFile));
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachement; filename=\"deviceApp.zip\"")
				.contentType(MediaType.APPLICATION_OCTET_STREAM).contentLength(zipFile.length()).body(resource);
	}

	@GetMapping("/gatewayApp")
	public ResponseEntity<InputStreamResource> generateGatewayAppZip(@RequestParam("edCtx") String edCtx,
			@RequestParam("doc") String doc, @RequestParam("gatewayId") String gatewayId) throws IOException {
		Path tempDir = Files.createTempDirectory("mustache-template");

		String url = appweb_url + "/api" + "/editingcontexts/" + edCtx + "/documents/" + doc;

		gatewayService.generateAppFileTree(tempDir, url, gatewayId);
		File zipFile = gatewayService.createZip(tempDir);

		InputStreamResource resource = new InputStreamResource(new FileInputStream(zipFile));
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachement; filename=\"gatewayApp.zip\"")
				.contentType(MediaType.APPLICATION_OCTET_STREAM).contentLength(zipFile.length()).body(resource);
	}

}
