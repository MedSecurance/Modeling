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

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.EcoreEvaluationEnvironment;
import org.eclipse.ocl.expressions.CollectionKind;
import org.eclipse.ocl.util.CollectionUtil;

public class UMLEnumEvaluationEnvironment extends EcoreEvaluationEnvironment {
	@Override
	protected Object coerceValue(ETypedElement element, Object value, boolean copy) {
		CollectionKind kind = getCollectionKind(element);

		if (kind != null) {
			if (value instanceof Collection<?>) {
				return copy
						? CollectionUtil.createNewCollection(kind,
								(Collection<?>) value)
								: value;
			} else {
				Collection<Object> result = CollectionUtil
						.createNewCollection(kind);
				result.add(value);
				return result;
			}
		} else {
			if (value instanceof Collection<?>) {
				Collection<?> collection = (Collection<?>) value;
				//				return collection.isEmpty() //Original code from OCL library parent class
				//						? null
				//							: collection.iterator().next();
				if (collection.isEmpty())
					return null;
				else {
					Collection<Object> result = CollectionUtil
							.createNewSequence();
					result.addAll(Arrays.asList(value.toString().substring(1, value.toString().length() - 1).split("\\s*,\\s*")));;
					return result;
				}
			} else {
				return value;
			}
		}
	}
	public UMLEnumEvaluationEnvironment(EcoreEnvironmentFactory factory) {
		super(factory);
	}
	public UMLEnumEvaluationEnvironment(
			EvaluationEnvironment<EClassifier, EOperation, EStructuralFeature, EClass, EObject> parent) {
		super(parent);
	}
}