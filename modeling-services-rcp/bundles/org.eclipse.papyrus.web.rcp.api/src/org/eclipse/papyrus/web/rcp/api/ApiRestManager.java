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

import io.javalin.Javalin;
import io.javalin.plugin.openapi.OpenApiOptions;
import io.javalin.plugin.openapi.OpenApiPlugin;
import io.javalin.plugin.openapi.ui.SwaggerOptions;
import io.swagger.v3.oas.models.info.Info;

/**
 * Exposes REST API methods for code generation services.
 * 
 * @author Marcos Didonet Del Fabro
 *
 */
public class ApiRestManager {
	
	final static String HOST_URL = "0.0.0.0";
	final static int HOST_PORT = Integer.valueOf(System.getenv("RCP_SERVER_PORT"));
	static final String DEFAULT_PROJECT_NAME = "GencodeProject";
	static final String CONTENT_TYPE = "application/zip";
	static final String OPENAPI_LANGUAGE_LIST_DESCRIPTION = "The target language for code generation. <br/> Supported languages: Java, C++ , C and Python (use escape characters for ++: C%2B%2B)";	
	
	Javalin app=null;

	public ApiRestManager() {
		//get the OSGI context
	}

/**
 * Set inicial configuration for starting the Javalin web server
 * @return
 */
	private static OpenApiPlugin getConfiguredOpenApiPlugin() {
        Info info = new Info().version("0.1").title("Code generation services").description("Code generation services");
        OpenApiOptions options = new OpenApiOptions(info)
                .activateAnnotationScanningFor("org.eclipse.papyrus.web.rcp.api")
                .path("/swagger-docs") 
                .swagger(new SwaggerOptions("/swagger-ui"))
                ;
        return new OpenApiPlugin(options);
    }	

/**
 * Launches the Javalin server and sets the appropriate handlers for each endpoint
 */
	public void launch() {
		app = Javalin.create(config-> {
			config.contextPath = "/";
			config.enableCorsForAllOrigins();			
			config.registerPlugin(getConfiguredOpenApiPlugin());			
		}
		);
		app.before(ctx -> {
            ctx.header("Access-Control-Allow-Origin", "*");
		});
		app.start(HOST_URL,HOST_PORT);
		app.get("/", ctx -> {
			ctx.result("PapyrusWeb root page. Please try the following path: /swagger-ui");
		} );

		app.get("generateCode", new GetGenerateCodeHandler());
	
		app.post("generateCodeFromModel",new GetGenerateCodeFromFile());	
		
		app.get("generateCodeFromStateMachine",new GetGenerateCodeHandlerFromStateMachine());
		
		app.get("generateCodeFromURL",new GetGenerateCodeFromURL());
		
		app.post("generateCodeFromStateMachineFile", new GetGenerateCodeFromSMFile());
		
		app.get("exportUMLClassDiagramToPlantUML", new GetExportUMLtoPlantUML());
		
		app.post("exportUMLClassDiagramToPlantUMLFromFile", new PostExportUMLtoPlantUMLFromFile());
		
		app.get("evaluateConstraint", new GetEvaluateConstraint());
		
		app.post("evaluateConstraintFromFile", new PostEvaluateConstraintFromFile());		
		
//		app.post("reverseArchiveFile", new GetReverseArchiveFile());
		
		System.out.println("The Javalin web server has started");
		
	}

}
