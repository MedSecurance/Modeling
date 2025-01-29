/*******************************************************************************
 * Copyright (c) 2021, 2023 CEA, Obeo.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
import { TreeItemContextMenuComponentProps } from '@eclipse-sirius/sirius-components-trees';
import ListItemIcon from '@mui/material/ListItemIcon';
import ListItemText from '@mui/material/ListItemText';
import MenuItem from '@mui/material/MenuItem';
import AddIcon from '@mui/icons-material/Add';
import { forwardRef, Fragment } from 'react';
import { getConfigVars } from '../config-variables/ConfigVar';

export const StateMachineTreeItemContextMenuContribution = forwardRef(
  (
    { editingContextId, item, readOnly, expandItem, treeId, onClose }: TreeItemContextMenuComponentProps,
    ref: React.ForwardedRef<HTMLLIElement>
  ) => {
    if (
      treeId.startsWith('explorer://') &&
      item.kind === 'siriusComponents://semantic?domain=uml&entity=StateMachine'
    ) {
      return (
        <Fragment key="document-tree-item-context-menu-contribution">
          <MenuItem
            key="generateJava"
            onClick={() => {
              generateStateMachineCode(editingContextId, item, item.id, onClose);
            }}
            data-testid="generatesmcode"
            aria-disabled>
            <ListItemIcon>
              <AddIcon fontSize="small" />
            </ListItemIcon>
            <ListItemText primary="Generate Code from state machine" aria-disabled />
          </MenuItem>
        </Fragment>
      );
    } else {
      return null;
    }
  }
);

export const generateStateMachineCode = (editingContextId, item, treeId, onClose) => {
  const configVars = getConfigVars();
  fetch(
    configVars.MODEL_SERVICE_URL +
      '/generateCodeFromStateMachine?tree_item_id=' +
      item.id +
      '&project_id=' +
      editingContextId +
      '&output_language=C%2B%2B',
    item
  )
    .then((response) => {
      return response.blob();
    })
    .then((bytes) => {
      let element = document.createElement('a');
      element.href = URL.createObjectURL(bytes);
      element.setAttribute('Download', item.label + '.zip');
      element.click();
    });
};
