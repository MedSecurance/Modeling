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

package org.eclipse.papyrus.web.rcp.api;

import java.io.InputStream;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.eclipse.papyrus.web.service.codegen.ICodegenService;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;

import io.javalin.http.Context;
import io.javalin.http.Handler;
import io.javalin.plugin.openapi.annotations.HttpMethod;
import io.javalin.plugin.openapi.annotations.OpenApi;
import io.javalin.plugin.openapi.annotations.OpenApiContent;
import io.javalin.plugin.openapi.annotations.OpenApiParam;
import io.javalin.plugin.openapi.annotations.OpenApiResponse;


public class GetGenerateCodeFromURL implements Handler{
	@OpenApi(
			summary = "Generate code in a specified target language from an input model specified by an URL",
			description = "Receives an UML Model in XMI as input (from a URL) and returns a generated code as output. The target language can be specified in the parameter output_language, or by applying a specific profile.",
			path = "/generateCodeFromURL",
			method = HttpMethod.GET,
			queryParams = {
					@OpenApiParam(name = "output_language", description =  ApiRestManager.OPENAPI_LANGUAGE_LIST_DESCRIPTION),
					@OpenApiParam(name = "model_url", description = "The URL of the UML model to generate code")
			},
			responses = {
					@OpenApiResponse(status = "201", content = @OpenApiContent(type = "application/octet-stream"))
			}
			)		

	@Override
	public void handle(Context ctx) throws Exception {
		//SAMPLE URL for testing
		//http://localhost:31000/generateCodeFromURL?output_language=C%2B%2B&model_url=https%3A%2F%2Fgit.eclipse.org%2Fc%2Fpapyrus%2Forg.eclipse.papyrus.git%2Fplain%2Fexamples%2Fuml%2Forg.eclipse.papyrus.examples.uml.diagrams%2Fmodels%2FClassDiagram_AbstractFactoryDesignPattern%2FClassDiagram_AbstractFactoryDesignPattern.uml		

		Bundle bundle=FrameworkUtil.getBundle(GetGenerateCodeHandler.class);
		BundleContext bundleContext= bundle.getBundleContext();
		ICodegenService codeGenService = bundleContext.getService(bundleContext.getServiceReference(ICodegenService.class));		

		HttpRequest request = HttpRequest.newBuilder()
				.uri(java.net.URI.create(ctx.queryParam("model_url")))
				.build();

		HttpClient client = HttpClient.newHttpClient();
		HttpResponse<InputStream> response = null;
		response = client.send(request, HttpResponse.BodyHandlers.ofInputStream());

		ctx.res.setContentType(ApiRestManager.CONTENT_TYPE);
		ctx.res.addHeader("content-disposition", "inline; filename="+ApiRestManager.DEFAULT_PROJECT_NAME+".zip");
		ctx.res.addHeader("content-type","application/octet-stream");				

		ctx.result(codeGenService.generateCodeFromFile(response.body(), ctx.queryParam("output_language")));
	}


}