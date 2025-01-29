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
import java.io.InputStream;

public interface ICodegenService {

	/**
	 * 	
	 * @param projectId the ID of the project to generate the model. Expects an UUID format used in PapyrusWeb
	 * @param treeItemId the ID of document to generate the model. Expects an UUID format used in PapyrusWeb
	 * @param outputLanguage The identification of the target language, such as Java or C++. Uses Java if the parameter is 'null'. 
	 * @return a zip file with an Eclipse project containing the generated code.
	 */
	public FileInputStream generateCode (String projectId, String treeItemId, String outputLanguage);

	/**
	 * 
	 * @param inputModel The UML2 input model used to generate code.
	 * @param outputLanguage The identification of the target language, such as Java or C++. Uses Java if the parameter is 'null'.
	 * @return a zip file with an Eclipse project containing the generated code.
	 */
	public FileInputStream generateCodeFromFile (InputStream inputModel, String outputLanguage);

	/**
	 * 
	 * @param projectId the ID of the project to generate the model. Expects an UUID format used in PapyrusWeb
	 * @param treeItemId the ID of document to generate the model. Expects an UUID format used in PapyrusWeb
	 * @param outputLanguage The identification of the target language, such as Java or C++. Uses Java if the parameter is 'null'. 
	 * @return a zip file with an Eclipse project containing the generated code.
	 */
	public FileInputStream generateCodeFromStateMachine (String projectId, String treeItemId, String outputLanguage);

	/**
	 * 
	 * @param inputModel a UML model in XMI containing a state machine
	 * @return
	 */
	public FileInputStream generateCodeFromStateMachineFile (InputStream inputModel);	

	/**
	 * 
	 * @param inputModel 
	 * @param projectName
	 * @return
	 */
	public FileInputStream reverseArchiveFile (InputStream inputModel, String projectName);

	/**
	 * Produces a plantUML model excerpt after given a root model element ID, its containing project and the context element, if any
	 * @param projectId
	 * @param treeItemId
	 * @return
	 */
	public String exportUMLClassDiagramToPlantUML (String projectId, String documentId, String xmiID, String qualifiedName);


	/**
	 * Produces a plantUML model excerpt after an input XMI file and the context element, if any
	 * 
	 * @param inputModel
	 * @param xmiID
	 * @param qualifiedName
	 * @return
	 */
	public String exportUMLClassDiagramToPlantUML (InputStream inputModel, String xmiID, String qualifiedName);


	/**
	 * 
	 * @param inputModel
	 * @param expression
	 * @param xmiID
	 * @param qualifiedName
	 * @return
	 */
	public String evaluateConstraintFromFile(InputStream inputModel, String xmiID, String qualifiedName);

	/**
	 * 
	 * @param projectId
	 * @param treeItemId
	 * @param xmiID
	 * @param qualifiedName
	 * @return
	 */
	public String evaluateConstraint(String projectId, String treeItemId, String xmiID, String qualifiedName);


}
