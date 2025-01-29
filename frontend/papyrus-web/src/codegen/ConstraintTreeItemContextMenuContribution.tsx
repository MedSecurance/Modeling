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
import React, { useState } from 'react';
import { forwardRef, Fragment } from 'react';
import { Toast } from '@eclipse-sirius/sirius-components-core';
import { getDocumentId } from '../iagen/GetQualifiedName';
import { getQualifiedName } from '../iagen/GetQualifiedName';
import { getConfigVars } from '../config-variables/ConfigVar';

export const ConstraintTreeItemContextMenuContribution = forwardRef(
  (
    { editingContextId, item, treeId, onClose }: TreeItemContextMenuComponentProps,

    ref: React.ForwardedRef<HTMLLIElement>
  ) => {
    if (treeId.startsWith('explorer://') && item.kind === 'siriusComponents://semantic?domain=uml&entity=Constraint') {
      const [openToast, setOpen] = useState(false);

      const handleOpenToast = () => {
        setOpen(true);
      };

      const handleClose = () => {
        onClose();
        setOpen(false);
      };

      const [message, setMessage] = useState(null);

      return (
        <Fragment key="modelcodegen-tree-item-context-menu-contribution">
          <MenuItem
            key="generateJava"
            onClick={() => {
              evaluateOCLConstraint(editingContextId, item, handleOpenToast, setMessage);
            }}
            ref={ref}
            data-testid="generatejava"
            aria-disabled>
            <ListItemIcon>
              <AddIcon fontSize="small" />
            </ListItemIcon>
            <ListItemText primary="Evaluate OCL Constraint" aria-disabled />
          </MenuItem>
          <Toast message={message} open={openToast} onClose={handleClose} />
        </Fragment>
      );
    } else {
      return null;
    }
  }
);

export const evaluateOCLConstraint = (editingContextId, item, handleOpenToast, setMessage) => {
  const configVars = getConfigVars();
  // code adapted from https://gist.github.com/raymondpittman/11cc82788422d1bddfaa62e60e5ec9aa
  // 'http://localhost:8083/evaluateConstraintFromFile?expression=name&qualified_name=JavaRootTest' \
  fetch(
    configVars.MODEL_SERVICE_URL +
      '/evaluateConstraint?project_id=' +
      editingContextId +
      '&document_id=' +
      getDocumentId(item.id) +
      '&qualified_name=' +
      getQualifiedName(item.id),
    item
  )
    .then((response) => {
      return response.text();
    })
    .then((text) => {
      console.log(text);
      setMessage('Constraint evaluation result: ' + text);
      handleOpenToast();
    });
};
