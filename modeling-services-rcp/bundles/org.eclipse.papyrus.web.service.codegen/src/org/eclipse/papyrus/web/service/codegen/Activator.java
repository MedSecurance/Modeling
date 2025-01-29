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

package org.eclipse.papyrus.web.service.codegen;


import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	final public static String APPWEB_URL = System.getenv("APPWEB_URL");
	public static BundleContext ctx;

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Code generation service is running: ");
		System.out.println("Bundle org.eclipse.papyrus.web.service.codegen has started at port.");
		ctx = context;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
	}

}
