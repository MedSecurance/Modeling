/*******************************************************************************
 * Copyright (c) 2024 CEA
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     CEA - initial API and implementation
 *     Marcos Didonet Del Fabro
 *
 *******************************************************************************/
package org.eclipse.papyrus.web.application.configuration;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontEndConfigController {

    private final FrontEndConfigProperties frontendConfigProperties;

    public FrontEndConfigController(FrontEndConfigProperties frontendConfigProperties) {
        this.frontendConfigProperties = frontendConfigProperties;
    }

    @GetMapping("/reactenvvars")
    public Map<String, String> getConfig() {
        Map<String, String> config = new HashMap<>();

        config.put("MODEL_SERVICE_URL", this.frontendConfigProperties.getModelServiceUrl());
        config.put("CREATE_ROOM_SERVER_URL", this.frontendConfigProperties.getCreateRoomServerUrl());
        config.put("ELEMENT_URL", this.frontendConfigProperties.getElementUrl());
        config.put("ENCODER_URL", this.frontendConfigProperties.getEncoderUrl());
        config.put("GENERATOR_URL", this.frontendConfigProperties.getGeneratorUrl());
        config.put("DEFAULT_LLM_MODEL", this.frontendConfigProperties.getDefaultLLMModel());
        config.put("DEFAULT_LLM_URL", this.frontendConfigProperties.getDefaultLLMUrl());
        config.put("DEFAULT_PROMPT", this.frontendConfigProperties.getDefaultPrompt());
        config.put("DEFAULT_MSG", this.frontendConfigProperties.getDefaultMsg());
        config.put("SERVER_OPTIONS", this.frontendConfigProperties.getServerOptions());
        config.put("IOMT_GENERATOR_URL", this.frontendConfigProperties.getIomtGeneratorUrl());

        return config;
    }
}
