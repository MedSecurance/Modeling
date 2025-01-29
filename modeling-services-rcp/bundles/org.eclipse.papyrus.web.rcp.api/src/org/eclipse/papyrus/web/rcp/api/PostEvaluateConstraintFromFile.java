/*******************************************************************************
 * Copyright (c) 2006 - 2024 CEA LIST.

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
import io.javalin.plugin.openapi.annotations.OpenApiFileUpload;
import io.javalin.plugin.openapi.annotations.OpenApiParam;
import io.javalin.plugin.openapi.annotations.OpenApiResponse;


public class PostEvaluateConstraintFromFile implements Handler{
	
	@OpenApi(
			summary = "Evaluates an OCL constraint",
			description = "Evaluates an OCL constraint, given an UML model in XMI containing a Class diagram, and the constraint ID (XMI ID or qualified name)",
			path = "/evaluateConstraintFromFile",
			method = HttpMethod.POST,
			queryParams = {
					@OpenApiParam(name = "xmi_id", description = "XMI ID of the context element"),
					@OpenApiParam(name = "qualified_name", description = "Qualified name of the constraint")
			},
			
			fileUploads = {
					@OpenApiFileUpload(name = "modelfile"),
			},
			responses = {
					@OpenApiResponse(status = "201", content = @OpenApiContent(type = "application/octet-stream"))
			}
			)		
	@Override
	public void handle(Context ctx) throws Exception {

		Bundle bundle=FrameworkUtil.getBundle(PostEvaluateConstraintFromFile.class);
		BundleContext bundleContext= bundle.getBundleContext();
		ICodegenService codeGenService = bundleContext.getService(bundleContext.getServiceReference(ICodegenService.class));

		ctx.res.setContentType("text/plain");
		ctx.result(codeGenService.evaluateConstraintFromFile(ctx.uploadedFile("modelfile").getContent(),  ctx.queryParam("xmi_id"),ctx.queryParam("qualified_name")));
	}


}