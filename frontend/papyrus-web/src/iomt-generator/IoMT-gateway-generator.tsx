/*******************************************************************************
 * Copyright (c) 2021, 2024 CEA.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     CEA - initial API and implementation
 *******************************************************************************/

import { TreeItemContextMenuComponentProps } from '@eclipse-sirius/sirius-components-trees';
import ListItemIcon from '@mui/material/ListItemIcon';
import ListItemText from '@mui/material/ListItemText';
import MenuItem from '@mui/material/MenuItem';
import AddIcon from '@mui/icons-material/Add';
import { forwardRef, Fragment } from 'react';
import { getConfigVars } from '../config-variables/ConfigVar';
import { getDocumentId } from '../iagen/GetQualifiedName';

export const GenerateGatewayAppTreeItemContextMenuContribution = forwardRef(
  (
    { editingContextId, item, treeId, onClose }: TreeItemContextMenuComponentProps,
    ref: React.ForwardedRef<HTMLLIElement>
  ) => {
    if (
      treeId.startsWith('explorer://') &&
      item.kind === 'siriusComponents://semantic?domain=uml&entity=Class' &&
      item.label.styledStringFragments.some((fragment) => fragment.text.includes('Gateway'))
    ) {
      console.log('<<<<<<');
      console.log(editingContextId);
      console.log(item.id);
      console.log(treeId);
      console.log(item);
      console.log('>>>>>>');
      return (
        <Fragment key="generate-iomt-gateway-tree-item-context-menu-contribution">
          <MenuItem
            key="generateIomtGatewayeApp"
            onClick={() => {
              generateGatewayApp(editingContextId, item, 'gatewayApp', item.label);
            }}
            ref={ref}
            data-testid="generateiomtgatewayapp"
            aria-disabled>
            <ListItemIcon>
              <AddIcon fontSize="small" />
            </ListItemIcon>
            <ListItemText primary="Generate IoMT Gateway Application" aria-disabled />
          </MenuItem>
        </Fragment>
      );
    } else {
      return null;
    }
  }
);

export const generateGatewayApp = (editingContextId, item, outputLanguage, projectName) => {
  const configVars = getConfigVars();
  console.log('generateGatewayApp', editingContextId, item, outputLanguage, projectName, configVars.IOMT_GENERATOR_URL);
  // code adapted from https://gist.github.com/raymondpittman/11cc82788422d1bddfaa62e60e5ec9aa
  fetch(
    configVars.IOMT_GENERATOR_URL +
      '/generate/gatewayApp?' +
      'edCtx=' +
      editingContextId +
      '&doc=' +
      getDocumentId(item.id) +
      '&gatewayId=' +
      item.id
  )
    .then((response) => {
      return response.blob();
    })
    .then((bytes) => {
      let element = document.createElement('a');
      element.href = URL.createObjectURL(bytes);
      element.setAttribute('Download', 'gatewayApp.zip');
      element.click();
      console.log('generate gateway application', element);
    });
};
