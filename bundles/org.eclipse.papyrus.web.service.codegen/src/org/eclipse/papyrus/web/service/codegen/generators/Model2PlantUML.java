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

import java.io.InputStream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.web.service.codegen.helpers.ModelLoader;
import org.eclipse.papyrus.web.service.codegen.helpers.NavigationHelper;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.StateMachine;

import net.sourceforge.plantuml.uml2.Uml2ClassDiagramIntent;
import net.sourceforge.plantuml.uml2.Uml2ComponentDiagramIntent;
import net.sourceforge.plantuml.uml2.Uml2SeqDiagramIntent;
import net.sourceforge.plantuml.uml2.Uml2StateDiagramIntent;

public class Model2PlantUML {

	public static String exportUMLClassDiagramToPlantUML(InputStream inputModel, String xmiID, String qualifiedName) {
		Resource umlModel = ModelLoader.loadUMLModel(inputModel, "fromfile");
		EObject eobj = NavigationHelper.getElementContext(umlModel, xmiID, qualifiedName);
		String model = getDiagramText(eobj);
		System.out.println("PlantUML file created");
		return model;
	}	

	/**
	 * checks the type of the input eObject and calls the appropriate conversion
	 * method
	 * 
	 * @param eObject
	 * @return
	 */
	private static String getDiagramText(EObject eObject) {
		if (eObject instanceof Package) {
			Uml2ClassDiagramIntent intentExport = new Uml2ClassDiagramIntent((Package) eObject);
			return intentExport.getDiagramText();
		} else if (eObject instanceof Interaction) {
			Uml2SeqDiagramIntent intentExport = new Uml2SeqDiagramIntent((Interaction) eObject);
			return intentExport.getDiagramText();
		} else if (eObject instanceof StateMachine) {
			Uml2StateDiagramIntent intentExport = new Uml2StateDiagramIntent((StateMachine) eObject);
			return intentExport.getDiagramText();
		} else if (eObject instanceof Component) {
			Uml2ComponentDiagramIntent intentExport = new Uml2ComponentDiagramIntent((Class) eObject);
			return intentExport.getDiagramText();
		} else if (eObject instanceof Class) {
			Uml2ClassDiagramIntent intentExport = new Uml2ClassDiagramIntent(((Class) eObject).getNearestPackage());
			return intentExport.getDiagramText();
		}
		return " -- Input type not handled -- Please select the root element of the model --";
	}	


}
