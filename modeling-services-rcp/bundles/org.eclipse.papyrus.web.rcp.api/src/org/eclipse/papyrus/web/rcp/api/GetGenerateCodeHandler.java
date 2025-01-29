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


public class GetGenerateCodeHandler implements Handler{
	
	@OpenApi(
			summary = "Generate code in a specified target language",
			description = "Receives a model and project identifiers as input and returns a generated code as output. The target language can be specified in the parameter output_language, or by applying a specific profile.",
			path = "/generateCode",
			method = HttpMethod.GET,
			queryParams = {
					@OpenApiParam(name = "tree_item_id", description = "ID of the root elemement of the model to be generated"),
					@OpenApiParam(name = "project_id", description = "ID of the parent project"),
					@OpenApiParam(name = "output_language", description =  ApiRestManager.OPENAPI_LANGUAGE_LIST_DESCRIPTION)
			},
			responses = {
					@OpenApiResponse(status = "201", content = @OpenApiContent(type = "application/octet-stream"))
			}
			)		
	@Override
	public void handle(Context ctx) throws Exception {

		Bundle bundle=FrameworkUtil.getBundle(GetGenerateCodeHandler.class);
		BundleContext bundleContext= bundle.getBundleContext();
		ICodegenService codeGenService = bundleContext.getService(bundleContext.getServiceReference(ICodegenService.class));

		ctx.res.setContentType(ApiRestManager.CONTENT_TYPE);
		ctx.res.addHeader("content-disposition", "inline; filename="+ApiRestManager.DEFAULT_PROJECT_NAME+".zip");
		ctx.res.addHeader("content-type","application/octet-stream");		
		ctx.result(codeGenService.generateCode(ctx.queryParam("project_id"),  ctx.queryParam("tree_item_id"), ctx.queryParam("output_language")));
	}


}