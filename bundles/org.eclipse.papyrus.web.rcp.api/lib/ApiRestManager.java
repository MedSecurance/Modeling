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

import io.javalin.Javalin;
import io.javalin.plugin.openapi.OpenApiOptions;
import io.javalin.plugin.openapi.OpenApiPlugin;
import io.javalin.plugin.openapi.ui.SwaggerOptions;
import io.swagger.v3.oas.models.info.Info;

public class ApiRestManager {
	
	final static String HOST_URL = "0.0.0.0";
	final static int HOST_PORT = 8083;//Integer.valueOf(System.getenv("RCP_SERVER_PORT"));
	static final String DEFAULT_PROJECT_NAME = "GencodeProject";
	static final String CONTENT_TYPE = "application/zip";	
	
	Javalin app=null;

	public ApiRestManager() {
		//get the OSGI context
	}

/**
 * Set inicial configuration for starting the Javalin web server
 * @return
 */
	private static OpenApiPlugin getConfiguredOpenApiPlugin() {
        Info info = new Info().version("0.1").title("Papyrus Web API").description("Papyrus Web API");
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
			config.enableCorsForAllOrigins();
			config.registerPlugin(getConfiguredOpenApiPlugin());
		}
		).start(HOST_URL,HOST_PORT);
		app.get("/", ctx -> {
			ctx.result("Hello World - PWeb");
		} );
		
		
		app.get("generateCode", new GetGenerateCodeHandler());
	
		app.post("generateCodeFromModel",new GetGenerateCodeFromFile());	
		
		app.get("generateCodeFromURL",new GetGenerateCodeFromURL());
		
		System.out.print("The Javalin web server has started");
		
	}

}
