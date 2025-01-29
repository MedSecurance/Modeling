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
import InputLabel from '@mui/material/InputLabel';
import ListItemIcon from '@mui/material/ListItemIcon';
import ListItemText from '@mui/material/ListItemText';
import MenuItem from '@mui/material/MenuItem';
import AddIcon from '@mui/icons-material/Add';
import { forwardRef, Fragment } from 'react';
import { getConfigVars } from '../config-variables/ConfigVar';

export const ModelCodeGenTreeItemContextMenuContribution = forwardRef(
  (
    { editingContextId, item, treeId, onClose }: TreeItemContextMenuComponentProps,
    ref: React.ForwardedRef<HTMLLIElement>
  ) => {
    if (treeId.startsWith('explorer://') && item.kind.startsWith('siriusWeb://document')) {
      return (
        <Fragment key="modelcodegen-tree-item-context-menu-contribution">
          <br />
          <InputLabel id="generateCodeLabel">Generate code in: </InputLabel>
          <MenuItem
            key="generateJava"
            onClick={() => {
              generateCode(editingContextId, item, 'Java', item.label);
            }}
            ref={ref}
            data-testid="generatejava"
            aria-disabled>
            <ListItemIcon>
              <AddIcon fontSize="small" />
            </ListItemIcon>
            <ListItemText primary="Java" aria-disabled />
          </MenuItem>
          <MenuItem
            key="generateCpp"
            onClick={() => {
              generateCode(editingContextId, item, 'C%2B%2B', item.label);
            }}
            ref={ref}
            data-testid="generatecpp"
            aria-disabled>
            <ListItemIcon>
              <AddIcon fontSize="small" />
            </ListItemIcon>
            <ListItemText primary="C++" aria-disabled />
          </MenuItem>
          <MenuItem
            key="generateC"
            onClick={() => {
              generateCode(editingContextId, item, 'C', item.label);
            }}
            data-testid="generatec"
            aria-disabled>
            <ListItemIcon>
              <AddIcon fontSize="small" />
            </ListItemIcon>
            <ListItemText primary="C" aria-disabled />
          </MenuItem>
          <MenuItem
            key="generatepython"
            divider
            onClick={() => {
              generateCode(editingContextId, item, 'Python', item.label);
            }}
            ref={ref}
            data-testid="generatepython"
            aria-disabled>
            <ListItemIcon>
              <AddIcon fontSize="small" />
            </ListItemIcon>
            <ListItemText primary="Python" aria-disabled />
          </MenuItem>
        </Fragment>
      );
    } else {
      return null;
    }
  }
);

export const generateCode = (editingContextId, item, outputLanguage, projectName) => {
  const configVars = getConfigVars();
  console.log('generateCode', editingContextId, item, outputLanguage, projectName);
  // code adapted from https://gist.github.com/raymondpittman/11cc82788422d1bddfaa62e60e5ec9aa
  fetch(
    configVars.MODEL_SERVICE_URL +
      '/generateCode?project_id=' +
      editingContextId +
      '&tree_item_id=' +
      item.id +
      '&output_language=' +
      outputLanguage,
    item
  )
    .then((response) => {
      return response.blob();
    })
    .then((bytes) => {
      let element = document.createElement('a');
      element.href = URL.createObjectURL(bytes);
      element.setAttribute('Download', projectName + '.zip');
      element.click();
      console.log('generateCode element', element);
    });
};
