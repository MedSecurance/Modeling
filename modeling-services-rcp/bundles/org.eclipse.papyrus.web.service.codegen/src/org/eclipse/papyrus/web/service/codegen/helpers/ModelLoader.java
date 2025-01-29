/*******************************************************************************
 * Copyright (c) 2006 - 2022 CEA LIST.


 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     CEA LIST - initial API and implementation
 *******************************************************************************/

package org.eclipse.papyrus.web.service.codegen.helpers;

import java.io.IOException;
import java.io.InputStream;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.designer.languages.common.base.TestInfo;
import org.eclipse.papyrus.web.service.codegen.Activator;
import org.eclipse.uml2.uml.UMLPackage;

public class ModelLoader {

	public static Resource loadUMLModel(InputStream inputModel, String UriString) {
		TestInfo.runHeadless();
		ResourcesPlugin.getPlugin();

		org.eclipse.uml2.uml.resources.util.UMLResourcesUtil.initGlobalRegistries();
		UMLPackage pkg = UMLPackage.eINSTANCE;

		System.out.println("UML metamodel loading(loadUMLModel): " + pkg.getName());

		ResourceSet rs = new ResourceSetImpl();

		Resource umlModel = rs.createResource(URI.createURI(UriString + ".uml"));
		IoMTProfileLoader.setPathmaps(rs);
		IoMTProfileLoader. loadIoMTProfiles();

		try {
			umlModel.load(inputModel, null);

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("UML metamodel loaded(loadUMLModel): " + pkg.getName());
		return umlModel;
	}

	/**
	 * 
	 * @param projectId  projectId in the format used in PapyrusWeb
	 * @param documentId documentId in the format used in PapyrusWeb
	 * @return returns the input stream of the XMI Model read
	 */
	public static InputStream getXMIModelFile(String projectId, String documentId) {
		// http://localhost:8080/api/editingcontexts/6443f09b-4aed-4dec-b572-1e3eccfa2ff8/documents/f34727eb-52a4-415c-b86f-405fd55788c3
		// http://162.19.54.189:32000/api/editingcontexts/f57ac6c9-a37a-4b05-8052-f0fbd2cc27e4/documents/e6f1e46d-3183-41e1-ac48-446cb91b2576
		UMLPackage pkg = UMLPackage.eINSTANCE;
		System.out.println("UML metamodel loaded(getXMIModelFile): " + pkg.getName());

		if (Activator.APPWEB_URL == null) {
			System.out.println("Envirnonment variable APPWEB_URL was not set.");
			return null;
		}
		String url;
		if (Activator.APPWEB_URL.equals("localhost")) {
			url = "http://localhost:8080/api/editingcontexts/" + projectId + "/documents/" + documentId;
		} else
			url = Activator.APPWEB_URL + "/api/editingcontexts/" + projectId + "/documents/" + documentId;
		System.out.println("Dowload model link: " + url);

		HttpRequest request = HttpRequest.newBuilder().uri(java.net.URI.create(url))
				.header("Content-Type", "application/octet-stream")
				.header("Accept", "application/xml")
				.build();		

		HttpClient client = HttpClient.newHttpClient();

		HttpResponse<InputStream> response = null;
		try {
			response = client.send(request, HttpResponse.BodyHandlers.ofInputStream());
			System.out.println("Response code: " + response.statusCode());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return response.body();
	}	

}
