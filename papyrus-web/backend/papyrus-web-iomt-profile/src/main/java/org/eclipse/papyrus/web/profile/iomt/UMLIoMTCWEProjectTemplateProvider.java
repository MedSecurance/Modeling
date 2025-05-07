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
package org.eclipse.papyrus.web.profile.iomt;

import java.util.List;

import org.eclipse.sirius.web.application.project.services.api.IProjectTemplateProvider;
import org.eclipse.sirius.web.application.project.services.api.ProjectTemplate;
import org.eclipse.sirius.web.application.project.services.api.ProjectTemplateNature;
import org.springframework.context.annotation.Configuration;

/**
 * Provides IoMT project template with CWE compatible constraints in OCL.
 * 
 * @author Marcos Didonet Del Fabro (CEA LIST) <marcos.didonetdelfabro@cea.fr>
 */
@Configuration
public class UMLIoMTCWEProjectTemplateProvider implements IProjectTemplateProvider {
    public static final String UML_IOMT_CWE_TEMPLATE_ID = "UMLIoMTCWETemplate";

    @Override
    public List<ProjectTemplate> getProjectTemplates() {
        var umlWithPrimitivesTemplate = new ProjectTemplate(
                UML_IOMT_CWE_TEMPLATE_ID,"IoMT CWE","/images/IoMTTemplate.png",
                List.of(new ProjectTemplateNature("papyrusweb://nature?kind=uml")));
        return List.of(umlWithPrimitivesTemplate);
    }

}
