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

import java.util.List;

import org.eclipse.papyrus.web.application.profile.dto.UMLProfileMetadata;
import org.eclipse.papyrus.web.application.profile.services.api.IUMLProfileProvider;
import org.springframework.stereotype.Service;

/**
 * Provider of the TVRA profile.
 * 
 * @author Marcos Didonet Del Fabro
 */
@Service
public class TVRAProfileProvider implements IUMLProfileProvider {

    @Override
    public List<UMLProfileMetadata> getUMLProfiles() {
        return List.of(new UMLProfileMetadata("IoMTTVRA",
                "pathmap://IoMTTVRA_PROFILE/TVRA.profile.uml#dd3656b0-efed-4c8a-829b-ce62b54a8a8b", ""));
    }

}
