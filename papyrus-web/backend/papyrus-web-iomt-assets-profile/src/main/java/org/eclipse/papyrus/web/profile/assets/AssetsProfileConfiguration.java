/*****************************************************************************
 * Copyright (c) 2024 CEA LIST
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.web.profile.assets;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import IoMTAssets.IoMTAssetsPackage;
import jakarta.annotation.PostConstruct;

/**
 * Configuration of the Assets profile.
 * 
 * @author Pascal Bannerot (CEA LIST) <pascal.bannerot@cea.fr>
 */
@Configuration
public class AssetsProfileConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(AssetsProfileConfiguration.class);
    
    @PostConstruct
    public void init() {
        LOGGER.info("Initializing EPackage Registry for Assets profile");
        Map<String, URI> ePackageNsURIToProfileLocationMap = UMLPlugin.getEPackageNsURIToProfileLocationMap();
        ePackageNsURIToProfileLocationMap.put("http://iomtassets",
                URI.createURI("pathmap://IoMTAssets_PROFILE/IoMTAssets.profile.uml#_JDM8UBwAEe-2GI5f1LdWww"));
    }


    @Bean
    EPackage ioMTAssetsProfile() {
//        //return IoMTAssetsPackage.eINSTANCE;
//        ResourceSet resourceSet = new ResourceSetImpl();
//        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
//
//        // Step 2: Load the UML Profile
//        String profilePath = "../papyrus-web-iomt-assets-profile/src/main/resources/IoMTAssets.profile.uml"; // Update the path to your UML Profile
//        Resource profileResource = resourceSet.getResource(org.eclipse.emf.common.util.URI.createURI(profilePath), true);
//
//        // Step 3: Get the Profile from the resource
//        Profile profile = null;
//        if (profileResource.getContents().get(0) instanceof Profile) {
//            profile = (Profile) profileResource.getContents().get(0);
//        } else {
//            System.out.println("The file does not contain a UML Profile.");
//        }
//
//        // Step 4: Initialize the EPackage
//        EPackage ePackage = (EPackage) profile.getDefinition();
//
//        // Step 5: Register the EPackage
//        EPackage.Registry.INSTANCE.put(ePackage.getNsURI(), ePackage);
        
        return IoMTAssetsPackage.eINSTANCE;
    }
}
