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

export const GenerateDeviceAppTreeItemContextMenuContribution = forwardRef(
  (
    { editingContextId, item, treeId, onClose }: TreeItemContextMenuComponentProps,
    ref: React.ForwardedRef<HTMLLIElement>
  ) => {
    if (
      treeId.startsWith('explorer://') &&
      item.kind === 'siriusComponents://semantic?domain=uml&entity=Class' &&
      item.label.styledStringFragments.some((fragment) => fragment.text.includes('IoMTDevice'))
    ) {
      return (
        <Fragment key="generate-iomt-device-tree-item-context-menu-contribution">
          <MenuItem
            key="generateIomtDeviceApp"
            onClick={() => {
              generateDeviceApp(editingContextId, item, 'deviceApp', item.label);
            }}
            ref={ref}
            data-testid="generateiomtdeviceapp"
            aria-disabled>
            <ListItemIcon>
              <AddIcon fontSize="small" />
            </ListItemIcon>
            <ListItemText primary="Generate IoMT Device Application" aria-disabled />
          </MenuItem>
        </Fragment>
      );
    } else {
      return null;
    }
  }
);

export const generateDeviceApp = (editingContextId, item, outputLanguage, projectName) => {
  const configVars = getConfigVars();
  console.log('generateDeviceApp', editingContextId, item, outputLanguage, projectName, configVars.IOMT_GENERATOR_URL);
  // code adapted from https://gist.github.com/raymondpittman/11cc82788422d1bddfaa62e60e5ec9aa
  fetch(
    configVars.IOMT_GENERATOR_URL +
      '/generate/deviceApp?' +
      'edCtx=' +
      editingContextId +
      '&doc=' +
      getDocumentId(item.id) +
      '&deviceId=' +
      item.id
  )
    .then((response) => {
      return response.blob();
    })
    .then((bytes) => {
      let element = document.createElement('a');
      element.href = URL.createObjectURL(bytes);
      element.setAttribute('Download', 'deviceApp.zip');
      element.click();
      console.log('generate device application', element);
    });
};
