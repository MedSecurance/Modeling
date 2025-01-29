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
import io.javalin.plugin.openapi.annotations.OpenApiFileUpload;
import io.javalin.plugin.openapi.annotations.OpenApiResponse;


public class GetGenerateCodeFromSMFile implements Handler{
	@OpenApi(
			summary = "Generate code from a model file containting a state machine",
			description = "Receives an UML Model containting a StateMachine as input (from a local file) and returns a generated code as output. The target language is C++",
			path = "/generateCodeFromSMFile",
			method = HttpMethod.POST,
			fileUploads = {
					@OpenApiFileUpload(name = "modelfile"),
			},
			responses = {
					@OpenApiResponse(status = "201", content = @OpenApiContent(type = "application/octet-stream"))
			}
			)		

	@Override
	public void handle(Context ctx) {
		
		Bundle bundle=FrameworkUtil.getBundle(GetGenerateCodeHandler.class);
		BundleContext bundleContext= bundle.getBundleContext();
		ICodegenService codeGenService = bundleContext.getService(bundleContext.getServiceReference(ICodegenService.class));		

		ctx.res.setContentType(ApiRestManager.CONTENT_TYPE);
		ctx.res.addHeader("content-disposition", "inline; filename="+ApiRestManager.DEFAULT_PROJECT_NAME+".zip");
		ctx.res.addHeader("content-type","application/octet-stream");		
		ctx.result(codeGenService.generateCodeFromStateMachineFile(ctx.uploadedFile("modelfile").getContent()));
	}


}