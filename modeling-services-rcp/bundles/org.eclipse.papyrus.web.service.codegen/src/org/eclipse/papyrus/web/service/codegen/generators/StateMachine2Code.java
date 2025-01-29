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


package org.eclipse.papyrus.web.service.codegen.generators;

import java.io.FileInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.designer.languages.common.extensionpoints.ILangCodegen;
import org.eclipse.papyrus.designer.transformation.core.transformations.ExecuteTransformationChain;
import org.eclipse.papyrus.web.service.codegen.CodegenService;
import org.eclipse.papyrus.web.service.codegen.helpers.ModelLoader;
import org.eclipse.papyrus.web.service.codegen.helpers.NavigationHelper;
import org.eclipse.papyrus.web.service.codegen.helpers.ZipCreator;

public class StateMachine2Code {

	public static FileInputStream generateCodeFromStateMachine(InputStream inputModel, String outputLanguage) {

		Resource umlModel = ModelLoader.loadUMLModel(inputModel, "fromfile");
		CodegenService.eobj = NavigationHelper.getFirstClass(umlModel);

		ILangCodegen codeGen = CodegenService.getDefaultCodeGen(outputLanguage);

		IProject genProject = CodegenService.getTargetProject(codeGen, CodegenService.eobj);

		String rootPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toPortableString();
		new ExecuteTransformationChain(NavigationHelper.getFirstPackage(umlModel), genProject)
		.executeTransformation(new NullProgressMonitor(), 0);

		return ZipCreator.zipProjectFromPath(rootPath + "/" + genProject.getName());

	}

}
