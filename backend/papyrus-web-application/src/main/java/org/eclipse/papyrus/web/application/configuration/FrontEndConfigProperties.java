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

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "react.app")
public class FrontEndConfigProperties {

    private String modelServiceUrl;

    private String createRoomServerUrl;

    private String elementUrl;

    private String encoderUrl;

    private String generatorUrl;

    private String defaultLLMModel;

    private String defaultLLMUrl;

    private String defaultPrompt;

    private String defaultMsg;

    private String serverOptions;

    private String iomtGeneratorUrl;

    /**
     * Gets the Model Service URL.
     *
     * @return the modelServiceUrl
     */
    public String getModelServiceUrl() {
        return this.modelServiceUrl;
    }

    /**
     * Sets the Model Service URL.
     *
     * @param modelServiceUrl
     *            the modelServiceUrl to set
     */
    public void setModelServiceUrl(String modelServiceUrl) {
        this.modelServiceUrl = modelServiceUrl;
    }

    /**
     * Gets the Create Room Server URL.
     *
     * @return the createRoomServerUrl
     */
    public String getCreateRoomServerUrl() {
        return this.createRoomServerUrl;
    }

    /**
     * Sets the Create Room Server URL.
     *
     * @param createRoomServerUrl
     *            the createRoomServerUrl to set
     */
    public void setCreateRoomServerUrl(String createRoomServerUrl) {
        this.createRoomServerUrl = createRoomServerUrl;
    }

    /**
     * Gets the Element URL.
     *
     * @return the elementUrl
     */
    public String getElementUrl() {
        return this.elementUrl;
    }

    /**
     * Sets the Element URL.
     *
     * @param elementUrl
     *            the elementUrl to set
     */
    public void setElementUrl(String elementUrl) {
        this.elementUrl = elementUrl;
    }

    /**
     * Gets the Encoder URL.
     *
     * @return the encoderUrl
     */
    public String getEncoderUrl() {
        return this.encoderUrl;
    }

    /**
     * Sets the Encoder URL.
     *
     * @param encoderUrl
     *            the encoderUrl to set
     */
    public void setEncoderUrl(String encoderUrl) {
        this.encoderUrl = encoderUrl;
    }

    /**
     * Gets the Generator URL.
     *
     * @return the generatorUrl
     */
    public String getGeneratorUrl() {
        return this.generatorUrl;
    }

    /**
     * Sets the Generator URL.
     *
     * @param generatorUrl
     *            the generatorUrl to set
     */
    public void setGeneratorUrl(String generatorUrl) {
        this.generatorUrl = generatorUrl;
    }

    /**
     * Gets the Default LLM Name.
     *
     * @return the defaultLLMModel
     */
    public String getDefaultLLMModel() {
        return this.defaultLLMModel;
    }

    /**
     * Sets the Default LLM Name.
     *
     * @param defaultLLMModel
     *            the defaultLLMModel to set
     */
    public void setDefaultLLMModel(String defaultLLMModel) {
        this.defaultLLMModel = defaultLLMModel;
    }

    /**
     * Gets the Default LLM URL.
     *
     * @return the defaultLLMUrl
     */
    public String getDefaultLLMUrl() {
        return this.defaultLLMUrl;
    }

    /**
     * Sets the Default LLM URL.
     *
     * @param defaultLLMUrl
     *            the defaultLLMUrl to set
     */
    public void setDefaultLLMUrl(String defaultLLMUrl) {
        this.defaultLLMUrl = defaultLLMUrl;
    }

    /**
     * Gets the Default Prompt.
     *
     * @return the defaultPrompt
     */
    public String getDefaultPrompt() {
        return this.defaultPrompt;
    }

    /**
     * Sets the Default Prompt.
     *
     * @param defaultPrompt
     *            the defaultPrompt to set
     */
    public void setDefaultPrompt(String defaultPrompt) {
        this.defaultPrompt = defaultPrompt;
    }

    /**
     * Gets the Default Message.
     *
     * @return the defaultMsg
     */
    public String getDefaultMsg() {
        return this.defaultMsg;
    }

    /**
     * Sets the Default Message.
     *
     * @param defaultMsg
     *            the defaultMsg to set
     */
    public void setDefaultMsg(String defaultMsg) {
        this.defaultMsg = defaultMsg;
    }

    /**
     * Gets the Server Options.
     *
     * @return the serverOptions
     */
    public String getServerOptions() {
        return this.serverOptions;
    }

    /**
     * Sets the Server Options.
     *
     * @param serverOptions
     *            the serverOptions to set
     */
    public void setServerOptions(String serverOptions) {
        this.serverOptions = serverOptions;
    }

    /**
     * @return
     */
    public String getIomtGeneratorUrl() {
        return this.iomtGeneratorUrl;
    }

    public void setIomtGeneratorUrl(String iomtGeneratorUrl) {
        this.iomtGeneratorUrl = iomtGeneratorUrl;
    }
}
