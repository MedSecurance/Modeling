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
package org.eclipse.papyrus.web.profile.tvra;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tvra.TvraPackage;
import jakarta.annotation.PostConstruct;

/**
 * Configuration of the TVRA profile.
 * 
 * @author Marcos Didonet Del Fabro (CEA LIST) <marcos.didonetdelfabro@cea.fr>
 */
@Configuration
public class TVRAProfileConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(TVRAProfileConfiguration.class);
    
    @PostConstruct
    public void init() {
        LOGGER.info("Initializing EPackage Registry for Assets profile");
        Map<String, URI> ePackageNsURIToProfileLocationMap = UMLPlugin.getEPackageNsURIToProfileLocationMap();
        ePackageNsURIToProfileLocationMap.put("http://iomt.tvra",
                URI.createURI("pathmap://IoMTTVRA_PROFILE/TVRA.profile.uml#dd3656b0-efed-4c8a-829b-ce62b54a8a8b"));
    }


    @Bean
    EPackage TVRAProfile() {
        return TvraPackage.eINSTANCE;
    }
}
