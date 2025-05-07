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

import org.eclipse.papyrus.web.application.pathmap.services.api.IPathMapProvider;
import org.eclipse.papyrus.web.application.pathmap.services.api.PathMapMetadata;

import org.springframework.stereotype.Service;

/**
 * Pathmap provider used for TVRA profile.
 * 
 * @author Marcos Didonet Del Fabro
 */
@Service
public class TVRAPathMapProvider implements IPathMapProvider {

    @Override
    public List<PathMapMetadata> getPathmaps() {
        return List.of(new PathMapMetadata("IoMTTVRA_PROFILE/TVRA.profile.uml", "TVRA.profile.uml"));
    }

}
