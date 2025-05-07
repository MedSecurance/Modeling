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
package org.eclipse.papyrus.web.profile.assertions;

import java.util.List;

import org.eclipse.papyrus.web.application.pathmap.services.api.IPathMapProvider;
import org.eclipse.papyrus.web.application.pathmap.services.api.PathMapMetadata;
import org.springframework.stereotype.Service;

/**
 * Pathmap provider used for Assertions profile.
 * 
 * @author Pascal Bannerot (CEA LIST) <pascal.bannerot@cea.fr>
 */
@Service
public class AssertionsPathMapProvider implements IPathMapProvider {

    @Override
    public List<PathMapMetadata> getPathmaps() {
        return List.of(new PathMapMetadata(
                "Assertions_PROFILE/assertions.iomt.profile.uml", "assertions.iomt.profile.uml"));
    }

}
