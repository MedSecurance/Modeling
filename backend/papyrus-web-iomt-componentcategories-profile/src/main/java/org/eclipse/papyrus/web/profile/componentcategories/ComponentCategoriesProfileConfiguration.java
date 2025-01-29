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
package org.eclipse.papyrus.web.profile.componentcategories;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import IoMTComponentCategories.IoMTComponentCategoriesPackage;
import jakarta.annotation.PostConstruct;

/**
 * Configuration of the Component Categories profile.
 * 
 * @author Pascal Bannerot (CEA LIST) <pascal.bannerot@cea.fr>
 */
@Configuration
public class ComponentCategoriesProfileConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(ComponentCategoriesProfileConfiguration.class);

    @PostConstruct
    public void init() {
        LOGGER.info("Initializing EPackage Registry for Component Categories profile");
        Map<String, URI> ePackageNsURIToProfileLocationMap = UMLPlugin.getEPackageNsURIToProfileLocationMap();
        ePackageNsURIToProfileLocationMap.put("http://IoMTComponentCategories", URI.createURI(
                "pathmap://IoMTComponentCategories_PROFILE/IoMTComponentCategories.profile.uml#_KrJKgBwAEe-2GI5f1LdWww"));
    }

    @Bean
    EPackage ioMTComponentCategoriesProfile() {
        return IoMTComponentCategoriesPackage.eINSTANCE;
    }
}
