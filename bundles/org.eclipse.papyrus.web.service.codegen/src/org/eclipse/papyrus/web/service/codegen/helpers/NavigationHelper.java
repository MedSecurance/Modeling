/*******************************************************************************

 * Copyright (c) 2006 - 2023 CEA LIST.

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

package org.eclipse.papyrus.web.service.codegen.helpers;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.designer.uml.tools.utils.ElementUtils;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;

public class NavigationHelper {

	/**
	 * 
	 * @param resource an UML model
	 * @return the first class found
	 */
	public static EObject getFirstClass(Resource resource) {
		for (TreeIterator<EObject> it = resource.getAllContents(); it.hasNext();) {
			EObject obj = it.next();
			if (obj instanceof org.eclipse.uml2.uml.Class)
				return obj;
		}
		return null;
	}

	/**
	 * 
	 * @param resource an UML model
	 * @return the first package found
	 */
	public static org.eclipse.uml2.uml.Package getFirstPackage(Resource resource) {
		for (TreeIterator<EObject> it = resource.getAllContents(); it.hasNext();) {
			EObject obj = it.next();
			if (obj instanceof org.eclipse.uml2.uml.Package)
				return (org.eclipse.uml2.uml.Package) obj;
		}
		return null;
	}

	/**
	 * returns the EObject of an UMLModel, given its XMI ID or qualifiedName.
	 * 
	 * @param umlModel
	 * @param xmiID
	 * @param qualifiedName
	 * @return
	 */
	public static EObject getElementContext(Resource umlModel, String xmiID, String qualifiedName) {
		EObject elementContext = null;
		if (xmiID != null)
			elementContext = umlModel.getEObject(xmiID);
		if (elementContext == null && qualifiedName != null)
			elementContext = NavigationHelper.getQualifiedElementFromResource(umlModel, qualifiedName);
		if (elementContext == null) {
			System.out.println("Element not found, using root model as context");
			elementContext = getFirstPackage(umlModel);
		}
		return elementContext;
	}

	/**
	 * loadPackage Get an element via its qualified name. Copied from
	 * "org.eclipse.papyrus.designer.uml.tools.utils.ElementUtils, because it was
	 * checking if it was an UMLResource, which is not the case.
	 *
	 * @param rs            a resource set
	 * @param qualifiedName the qualified name of an element
	 * @return the found element or null
	 */
	public static EObject getQualifiedElementFromResource(Resource resource, String qualifiedName) {
		if (resource.getContents().size() > 0) {
			EObject topLevelElem = resource.getContents().get(0);
			if (topLevelElem instanceof Package) {
				NamedElement ne = ElementUtils.getQualifiedElement((Package) topLevelElem, qualifiedName);
				if (ne != null) {
					return ne;
				}
			}
		}
		return null;
	}

}
