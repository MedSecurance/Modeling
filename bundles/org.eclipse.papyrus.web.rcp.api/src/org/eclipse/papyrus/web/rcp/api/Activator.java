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

import java.util.Hashtable;

import org.eclipse.papyrus.web.service.codegen.CodegenService;
import org.eclipse.papyrus.web.service.codegen.ICodegenService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Papyrus Web RCP server is running: ");
		System.out.println("Bundle org.eclipse.papyrus.web.rcp.api has started at port: "+ApiRestManager.HOST_PORT);

		
		Hashtable<String, String> props = new Hashtable<String, String>();
		props.put("description", "This service is used to generate code from an input model");
		ICodegenService codeGenService= new CodegenService();		
		context.registerService(ICodegenService.class, codeGenService, props);		
		
		ApiRestManager apiRestLauncher= new ApiRestManager();
		apiRestLauncher.launch();		
		
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Papyrus Web RCP has stopped");
		ServiceReference<ICodegenService> serviceRef=context.getServiceReference(ICodegenService.class);
		context.ungetService(serviceRef);		
	}

}
