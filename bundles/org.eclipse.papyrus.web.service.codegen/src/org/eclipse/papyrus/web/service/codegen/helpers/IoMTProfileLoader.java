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

package org.eclipse.papyrus.web.service.codegen.helpers;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.web.service.codegen.Activator;
import org.eclipse.uml2.uml.UMLPlugin;

import IoMTAssets.IoMTAssetsPackage;
import IoMTComponentCategories.IoMTComponentCategoriesPackage;
import IoMTProfile.IoMTProfilePackage;
import IoMTProfile.Application.ApplicationPackage;
import IoMTProfile.External.ExternalPackage;
import IoMTProfile.LAN.LANPackage;
import IoMTProfile.WAN.WANPackage;
import assertions.AssertionsPackage;

public class IoMTProfileLoader {
	/**
	 * Set the pathmpas of the IoMT profiles
	 * 
	 * @param rs
	 */
	public static void setPathmaps(ResourceSet rs) {

		URL bundleRootURL = Activator.ctx.getBundle().getEntry("/");
		URL fileURL = null;
		try {
			fileURL = FileLocator.toFileURL(bundleRootURL);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Map uriMap = rs.getURIConverter().getURIMap();
		URI uri = URI.createURI(fileURL.toString());// createURI("");
		uriMap.put(URI.createURI("pathmap://Assertions_PROFILE/"), uri.appendSegment("resources").appendSegment(""));
		uriMap.put(URI.createURI("pathmap://IoMTAssets_PROFILE/"), uri.appendSegment("resources").appendSegment(""));
		uriMap.put(URI.createURI("pathmap://IoMTComponentCategories_PROFILE/"),
				uri.appendSegment("resources").appendSegment(""));
		uriMap.put(URI.createURI("pathmap://IoMT_PROFILE/"), uri.appendSegment("resources").appendSegment(""));
	}

	public static void loadIoMTProfiles() {
		Map<String, URI> ePackageNsURIToProfileLocationMap = UMLPlugin.getEPackageNsURIToProfileLocationMap();

		ePackageNsURIToProfileLocationMap.put("http://www.eclipse.org/papyrus/robotics/assertions/1",
				URI.createURI("pathmap://Assertions_PROFILE/assertions.profile.uml#_IGRaABwAEe-2GI5f1LdWww"));
		AssertionsPackage.eINSTANCE.getName();
		ePackageNsURIToProfileLocationMap = UMLPlugin.getEPackageNsURIToProfileLocationMap();
		ePackageNsURIToProfileLocationMap.put("http://iomtassets",
				URI.createURI("pathmap://IoMTAssets_PROFILE/IoMTAssets.profile.uml#_JDM8UBwAEe-2GI5f1LdWww"));
		IoMTAssetsPackage.eINSTANCE.getName();
		ePackageNsURIToProfileLocationMap.put("http://IoMTComponentCategories", URI.createURI(
				"pathmap://IoMTComponentCategories_PROFILE/IoMTComponentCategories.profile.uml#_KrJKgBwAEe-2GI5f1LdWww"));
		IoMTComponentCategoriesPackage.eINSTANCE.getName();
		// Needs to register the subpackages
		// ePackageNsURIToProfileLocationMap.put("http://iomtprofile",
		// URI.createURI("pathmap://IoMT_PROFILE/IoMT.profile.uml#_4Z1kABzIEe-2GI5f1LdWww"));
		ePackageNsURIToProfileLocationMap.put("http:///IoMTProfile/LAN.ecore",
				URI.createURI("pathmap://IoMT_PROFILE/IoMT.profile.uml#_4Z1kABzIEe-2GI5f1LdWww"));
		ePackageNsURIToProfileLocationMap.put("http:///IoMTProfile/Application.ecore",
				URI.createURI("pathmap://IoMT_PROFILE/IoMT.profile.uml#_4Z1kABzIEe-2GI5f1LdWww"));
		ePackageNsURIToProfileLocationMap.put("http:///IoMTProfile/WAN.ecore",
				URI.createURI("pathmap://IoMT_PROFILE/IoMT.profile.uml#_4Z1kABzIEe-2GI5f1LdWww"));
		ePackageNsURIToProfileLocationMap.put("http:///IoMTProfile/External.ecore",
				URI.createURI("pathmap://IoMT_PROFILE/IoMT.profile.uml#_4Z1kABzIEe-2GI5f1LdWww"));
		IoMTProfilePackage.eINSTANCE.getName();
		LANPackage.eINSTANCE.getNsURI();
		WANPackage.eINSTANCE.getName();
		ApplicationPackage.eINSTANCE.getName();
		ExternalPackage.eINSTANCE.getNsURI();
	}	


}
