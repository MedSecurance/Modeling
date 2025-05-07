/*******************************************************************************
 * Copyright (c) 2025 CEA.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Marcos Didonet Del Fabro
 *******************************************************************************/
package org.eclipse.papyrus.web;

import org.eclipse.sirius.web.infrastructure.configuration.mvc.IBackendPathPredicate;
import org.springframework.stereotype.Service;

/**
 * Ensure the server Environment variables are available for the front end.
 *
 * @author marcos.didonetdelfabro@¢ea.fr
 */
@Service
public class EnvVarPathPredicate implements IBackendPathPredicate {
    @Override
    public boolean isBackendPath(String path) {
        return path != null && path.contains("reactenvvars");
    }
}