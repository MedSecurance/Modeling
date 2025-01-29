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

package org.eclipse.papyrus.web.service.ocl.evaluator;

import java.io.InputStream;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.papyrus.web.service.codegen.helpers.IoMTProfileLoader;
import org.eclipse.papyrus.web.service.codegen.helpers.ModelLoader;
import org.eclipse.papyrus.web.service.codegen.helpers.NavigationHelper;
import org.eclipse.papyrus.web.service.ocl.environment.UMLEnumEnvironmentFactory;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.internal.impl.OpaqueExpressionImpl;

public class OCLEvaluator {

	public static String evaluateConstraintFromFile(InputStream inputModel, String xmiID, String qualifiedName) {

		IoMTProfileLoader.loadIoMTProfiles();
		Resource umlModel = ModelLoader.loadUMLModel(inputModel, "fromfile");
		// OCL.newInstance(new IoMTEvaluationEnvironment());
		// OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCL ocl = OCL.newInstance(new UMLEnumEnvironmentFactory());
		OCLHelper helper = ocl.createOCLHelper();

		String expression = null;
		// receives a constraint, get its containing element and the opaqueexpression to
		// be evaluated
		EObject elementContext = null;
		EObject constraint = NavigationHelper.getElementContext(umlModel, xmiID, qualifiedName);
		ValueSpecification specification = null;
		if (constraint instanceof org.eclipse.uml2.uml.Constraint) {
			specification = ((org.eclipse.uml2.uml.Constraint) constraint).getSpecification();
			elementContext = constraint.eContainer(); // the context is the containing element;
		} else if (constraint instanceof OpaqueExpressionImpl) {
			specification = (OpaqueExpressionImpl) constraint;
			elementContext = constraint.eContainer().eContainer(); // the context is the containter of the containing
			// constraint;
		}
		expression = ((OpaqueExpressionImpl) specification).getBodies().get(0);
		if (elementContext == null)
			return "Context element not found";
		if (expression == null)
			return "Expression could not be parsed.";

		helper.setContext(elementContext.eClass());
		Constraint invariant = null;
		expression = parseExpression(expression);
		boolean isConstraint = true;
		try {
			invariant = (Constraint) helper.createInvariant(expression);
		} catch (ParserException e) {
			isConstraint = !(e.getMessage().indexOf("Constraint must be boolean-valued") >= 0);
		}

		OCLExpression query = null;
		if (!isConstraint) {
			try {
				query = helper.createQuery(expression);
			} catch (ParserException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return e.getMessage();
			}
		}
		if (isConstraint) {
			try {
				boolean evalTrue = ((org.eclipse.ocl.Query<EClassifier, EClass, EObject>) ocl.createQuery(invariant))
						.check(elementContext);
				if (evalTrue)
					return "Constraint evaluated to TRUE";
				else
					return "Constraint evaluated to FALSE";
			} catch (Exception e) {
				System.out.println(e.getMessage());
				return e.getMessage();
			}

		} else {
			Object result = ((org.eclipse.ocl.Query<EClassifier, EClass, EObject>) ocl.createQuery(query))
					.evaluate(elementContext);
			if (result != null)
				System.out.println(result.toString());
			else
				result = "Returned a null value";
			return result.toString();
		}
	}

	/*
	 * removes the 'context ABC def :' part of the OCL expression, if specified.
	 */
	private static String parseExpression(String expression) {
		if (expression.indexOf(":") >= 0)
			return (expression.substring(expression.indexOf(":") + 1)).trim();
		return expression;
	}	

}
