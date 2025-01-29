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
import {
  Button,
  Dialog,
  DialogActions,
  DialogContent,
  DialogTitle,
  TextField,
  MenuItem,
  ListItemIcon,
  ListItemText,
} from '@mui/material/';
import AddIcon from '@mui/icons-material/Add';
import React, { useState } from 'react';
import { forwardRef, Fragment } from 'react';
import { getConfigVars } from '../config-variables/ConfigVar';

export const ExportPlantUMLTreeItemContextMenuContribution = forwardRef(
  (
    { editingContextId, item, treeId, onClose }: TreeItemContextMenuComponentProps,
    ref: React.ForwardedRef<HTMLLIElement>
  ) => {
    if (treeId.startsWith('explorer://') && item.kind.startsWith('siriusWeb://document')) {
      const [open, setOpen] = useState(false);
      const handleClickOpen = () => {
        setOpen(true);
      };
      const [message, setMessage] = useState(null);

      const handleClose = () => {
        setOpen(false);
      };

      const handleInputChange = (event) => {
        setMessage(event.target.value);
        //setInputText(event.target.value);
      };

      return (
        <Fragment key="export-plantuml-tree-item-context-menu-contribution">
          <br />
          <MenuItem
            key="exportplantuml"
            onClick={() => {
              exportPlantUML(editingContextId, item.id, '', handleClickOpen, setMessage);
            }}
            ref={ref}
            data-testid="exportplantuml"
            aria-disabled>
            <ListItemIcon>
              <AddIcon fontSize="small" />
            </ListItemIcon>
            <ListItemText primary="Export to PlantUML" aria-disabled />
          </MenuItem>
          <div>
            <ModalComponent
              open={open}
              onClose={handleClose}
              inputText={message}
              handleInputChange={handleInputChange}
            />{' '}
            {/* Pass state and handleClose */}
          </div>
        </Fragment>
      );
    } else {
      return null;
    }
  }
);

function ModalComponent({ open, onClose, inputText, handleInputChange }) {
  const modalContent = (
    <DialogContent>
      <ListItemText primary="Generated PlanUML:" aria-disabled />
      <TextField
        autoFocus
        multiline
        fullWidth
        value={inputText} // State variable for input value
        onChange={handleInputChange} //  {(event) => setInputText(event.target.value)} // Update state on change
      />
    </DialogContent>
  );

  return (
    <Dialog open={open} onClose={onClose}>
      <DialogTitle>Generated PlantUML code</DialogTitle>
      {modalContent}
      <DialogActions>
        <Button onClick={onClose}>Close</Button>
      </DialogActions>
    </Dialog>
  );
}

//export default ModalComponent;

export const exportPlantUML = (
  editingContextId: String,
  document_id: String,
  qualified_name: String,
  handleClickOpen,
  setMessage
) => {
  const configVars = getConfigVars();
  console.log('exportPlantUML', editingContextId, document_id, qualified_name);
  fetch(
    configVars.MODEL_SERVICE_URL +
      '/exportUMLClassDiagramToPlantUML?project_id=' +
      editingContextId +
      '&document_id=' +
      document_id +
      '&qualified_name=' +
      qualified_name
  )
    .then((response) => {
      return response.text();
    })
    .then(async (text) => {
      console.log('Response from the GET call: \n' + text);
      handleClickOpen();
      setMessage(text);
    });
};
