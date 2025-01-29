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

package org.eclipse.papyrus.web.service.ocl.environment;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;

/**
 * Specific OCL Environment Factory to instantiate the
 * UMLEnumEvaluationEnvironment, which contains 'Sequence-based' evaluation of
 * EEnumLiterals lists
 * 
 * @author md270283
 *
 */

public class UMLEnumEnvironmentFactory extends EcoreEnvironmentFactory {
	public UMLEnumEnvironmentFactory() {
		super();
	}

	@Override
	public EvaluationEnvironment<EClassifier, EOperation, EStructuralFeature, EClass, EObject> createEvaluationEnvironment() {
		return new UMLEnumEvaluationEnvironment(this);
	}

	// implements the inherited specification
	public EvaluationEnvironment<EClassifier, EOperation, EStructuralFeature, EClass, EObject> createEvaluationEnvironment(
			EvaluationEnvironment<EClassifier, EOperation, EStructuralFeature, EClass, EObject> parent) {
		return new UMLEnumEvaluationEnvironment(parent);
	}
}