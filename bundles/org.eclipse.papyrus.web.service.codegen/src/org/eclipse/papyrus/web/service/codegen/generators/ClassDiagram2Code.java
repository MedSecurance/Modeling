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

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.papyrus.designer.languages.common.codegen.ui.handlers.GenerateCodeHandler;
import org.eclipse.papyrus.designer.languages.common.extensionpoints.ILangCodegen;
import org.eclipse.papyrus.web.service.codegen.CodegenService;
import org.eclipse.papyrus.web.service.codegen.helpers.ZipCreator;
import org.eclipse.uml2.uml.PackageableElement;

/** simple class that enables setting a specific selected element **/
class SelectionGenerateCodeHandler extends GenerateCodeHandler {

	@Override
	public void updateSelectedEObject() {
		selectedEObject = CodegenService.eobj;
	}

	@Override
	public boolean isEnabled() {
		updateSelectedEObject();
		return true;
	}
};

public class ClassDiagram2Code {

	public static FileInputStream generateCodeFromFile(InputStream inputModel, String outputLanguage) {

		System.out.println("generateCodeFromFile");
		ILangCodegen codeGen = CodegenService.getDefaultCodeGen(outputLanguage);
		IProject genProject = CodegenService.generateTargetProjectFromModel(inputModel, outputLanguage);
		SelectionGenerateCodeHandler sgch = new SelectionGenerateCodeHandler();
		sgch.isEnabled();
		sgch.generate(codeGen, genProject, (PackageableElement) CodegenService.eobj, new BasicEList<PackageableElement>(), true);

		if (outputLanguage.equals("Java"))
			createVSCodeConfigFile(genProject);
		String rootPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toPortableString();
		// WebDavUtility.uploadNextcloud(genProject, rootPath);

		return ZipCreator.zipProjectFromPath(rootPath + "/" + genProject.getName());	
	}
	/**
	 * creates a settings file to obtain a VSCode Java project
	 * 
	 * @param genProject
	 */
	private static void createVSCodeConfigFile(IProject genProject) {
		IFolder folder = genProject.getFolder(".vscode");
		if (!folder.exists()) {
			try {
				folder.create(true, true, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
			}
		}

		String content = "{\n" + "    \"java.project.sourcePaths\": [\"src\"],\n"
				+ "    \"java.project.outputPath\": \"bin\",\n" + "    \"java.project.referencedLibraries\": [\n"
				+ "        \"lib/**/*.jar\"\n" + "    ]\n" + "}";

		IFile settingsFile = genProject.getFile(".vscode/settings.json");

		if (!settingsFile.exists()) {
			try {
				settingsFile.create(null, false, null);
				settingsFile.setContents(new ByteArrayInputStream(content.getBytes()), IFile.FORCE,
						new NullProgressMonitor());
				genProject.refreshLocal(IProject.DEPTH_INFINITE, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}


	//	/**
	//	 * removes the generated files after the zip is created
	//	 * 
	//	 * @param folder
	//	 */
	//	private void deleteCodeGenFolder(String folder) {
	//		Path dir = Paths.get(folder); // path to the directory
	//		try {
	//			Files.walk(dir) // Traverse the file tree in depth-first order
	//			.sorted(Comparator.reverseOrder()).forEach(path -> {
	//				try {
	//					Files.delete(path); // delete each file or directory
	//				} catch (IOException e) {
	//					e.printStackTrace();
	//				}
	//			});
	//		} catch (IOException e) {
	//			e.printStackTrace();
	//		}
	//	}




}
