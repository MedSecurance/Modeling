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

import { httpOrigin } from '../core/URL';

export interface ConfigVar {
  MODEL_SERVICE_URL: string;
  CREATE_ROOM_SERVER_URL: string;
  ELEMENT_URL: string;
  ENCODER_URL: string;
  GENERATOR_URL: string;
  DEFAULT_LLM_MODEL: string;
  DEFAULT_LLM_URL: string;
  DEFAULT_PROMPT: string;
  DEFAULT_MSG: string;
  SERVER_OPTIONS: string;
  IOMT_GENERATOR_URL: string;
}

let configVars: ConfigVar = {
  MODEL_SERVICE_URL: '',
  CREATE_ROOM_SERVER_URL: '',
  ELEMENT_URL: '',
  ENCODER_URL: '',
  GENERATOR_URL: '',
  DEFAULT_LLM_MODEL: '',
  DEFAULT_LLM_URL: '',
  DEFAULT_PROMPT: '',
  DEFAULT_MSG: '',
  SERVER_OPTIONS: '',
  IOMT_GENERATOR_URL: '',
};

export const loadConfigVars = async () => {
  try {
    const response = await fetch(httpOrigin + '/reactenvvars');
    if (!response.ok) {
      throw new Error(`Failed to fetch environment variables: ${response.statusText}`);
    }
    configVars = await response.json();
  } catch (error) {
    console.error('Error loading react environment variables:', error);
  }
};

export const getConfigVars = () => configVars;
