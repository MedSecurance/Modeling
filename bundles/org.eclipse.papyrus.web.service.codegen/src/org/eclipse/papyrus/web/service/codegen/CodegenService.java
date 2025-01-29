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

package org.eclipse.papyrus.web.service.codegen;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.designer.languages.common.extensionpoints.ILangCodegen;
import org.eclipse.papyrus.designer.languages.common.extensionpoints.LanguageCodegen;
import org.eclipse.papyrus.web.service.codegen.generators.ClassDiagram2Code;
import org.eclipse.papyrus.web.service.codegen.generators.Model2PlantUML;
import org.eclipse.papyrus.web.service.codegen.generators.StateMachine2Code;
import org.eclipse.papyrus.web.service.codegen.helpers.ModelLoader;
import org.eclipse.papyrus.web.service.codegen.helpers.NavigationHelper;
import org.eclipse.papyrus.web.service.ocl.evaluator.OCLEvaluator;
import org.eclipse.uml2.uml.PackageableElement;

/**
 * Wrapper class to call different generation services
 * @author md270283
 *
 */

public class CodegenService implements ICodegenService {

	protected static final String DEFAULT_LANG = "Java";
	public static EObject eobj;	

	@Override
	public FileInputStream generateCode(String projectId, String treeItemId, String outputLanguage) {
		return generateCodeFromFile(ModelLoader.getXMIModelFile(projectId, treeItemId), outputLanguage);
	}

	@Override
	public FileInputStream generateCodeFromFile(InputStream inputModel, String outputLanguage) {
		return ClassDiagram2Code.generateCodeFromFile(inputModel, outputLanguage);
	}

	@Override
	public FileInputStream generateCodeFromStateMachine(String projectId, String treeItemId, String outputLanguage) {
		return StateMachine2Code.generateCodeFromStateMachine(ModelLoader.getXMIModelFile(projectId, treeItemId), outputLanguage);
	}

	@Override
	public String exportUMLClassDiagramToPlantUML(String projectId, String documentId, String xmiID,
			String qualifiedName) {
		return exportUMLClassDiagramToPlantUML(ModelLoader.getXMIModelFile(projectId, documentId), xmiID, qualifiedName);
	}



	@Override
	public String exportUMLClassDiagramToPlantUML(InputStream inputModel, String xmiID, String qualifiedName) {
		return Model2PlantUML.exportUMLClassDiagramToPlantUML(inputModel, xmiID, qualifiedName);
	}

	@Override
	public String evaluateConstraint(String projectId, String documentId, String xmiID, String qualifiedName) {
		return evaluateConstraintFromFile(ModelLoader.getXMIModelFile(projectId, documentId), xmiID, qualifiedName);
	}


	/**
	 * creates a target project and adds a suffix to it, to avoid duplicated project
	 * names. UNDER CONSTRUCTION
	 * 
	 * @param codeGen
	 * @param obj
	 * @return
	 */
	public static IProject getTargetProject(ILangCodegen codeGen, EObject obj) {
		IProject genProject = codeGen.getTargetProject((PackageableElement) eobj, true);
		return genProject;
	}

	public static ILangCodegen getDefaultCodeGen(String outputLanguage) {
		ILangCodegen codeGen;
		if (outputLanguage == null)
			codeGen = LanguageCodegen.getGenerator(DEFAULT_LANG);
		else {
			codeGen = LanguageCodegen.getGenerator(outputLanguage);
		}
		return codeGen;
	}

	public static IProject generateTargetProjectFromModel(InputStream inputModel, String outputLanguage) {
		Resource umlModel = ModelLoader.loadUMLModel(inputModel, "fromfile");
		eobj = NavigationHelper.getFirstClass(umlModel);
		ILangCodegen codeGen = getDefaultCodeGen(outputLanguage);
		IProject project = getTargetProject(codeGen, eobj);
		System.out.println("Returned project: " + project.getName());
		return project;
	}

	@Override
	public String evaluateConstraintFromFile(InputStream inputModel, String xmiID, String qualifiedName) {
		return OCLEvaluator.evaluateConstraintFromFile(inputModel, xmiID, qualifiedName);
	}

	@Override
	public FileInputStream generateCodeFromStateMachineFile(InputStream inputModel) {
		return StateMachine2Code.generateCodeFromStateMachine(inputModel, "C++");
	}

	/*
	 * UNDER CONSTRUCTION
	 */
	@Override
	public FileInputStream reverseArchiveFile(InputStream inputModel, String projectName) {
		return null;
	}

	private static void untar(InputStream inputStream, String destinationPath) throws IOException {
		System.out.println("Extraction not implemented.");
	}

}
