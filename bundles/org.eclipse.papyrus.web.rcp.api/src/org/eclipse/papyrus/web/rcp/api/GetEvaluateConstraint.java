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
import io.javalin.plugin.openapi.annotations.OpenApiParam;
import io.javalin.plugin.openapi.annotations.OpenApiResponse;


public class GetEvaluateConstraint implements Handler{
	
	@OpenApi(
			summary = "Evaluate OCL constraint",
			description = "Evaluates an OCL Constraint, given a root element from the UML model, its containing project identifiers and the constraint ID (XMI ID or qualified name)",
			path = "/evaluateConstraint",
			method = HttpMethod.GET,
			queryParams = {
					@OpenApiParam(name = "document_id", description = "ID of the document root elemement "),
					@OpenApiParam(name = "project_id", description = "ID of the parent project"),
					@OpenApiParam(name = "xmi_id", description = "XMI ID of the context element"),
					@OpenApiParam(name = "qualified_name", description = "Qualified name of the constraint")
			},
			responses = {
					@OpenApiResponse(status = "201", content = @OpenApiContent(type = "text/plain"))
			}
			)		
	@Override
	public void handle(Context ctx) throws Exception { 

		Bundle bundle=FrameworkUtil.getBundle(GetEvaluateConstraint.class);
		BundleContext bundleContext= bundle.getBundleContext();
		ICodegenService codeGenService = bundleContext.getService(bundleContext.getServiceReference(ICodegenService.class));
 
		ctx.res.setContentType("text/plain");
		ctx.result(codeGenService.evaluateConstraint(ctx.queryParam("project_id"),  ctx.queryParam("document_id"), ctx.queryParam("xmi_id"), ctx.queryParam("qualified_name")));
	}


}