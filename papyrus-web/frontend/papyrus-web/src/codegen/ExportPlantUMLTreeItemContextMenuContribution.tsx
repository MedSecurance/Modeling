/*******************************************************************************
 * Copyright (c) 2021, 2025 CEA.
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

/*******************************************************************************
 * Copyright (c) 2025 CEA-LIST.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Marcos Didonet Del Fabro
 *******************************************************************************/
import { TreeItemContextMenuComponentProps } from '@eclipse-sirius/sirius-components-trees';
import GetAppIcon from '@mui/icons-material/GetApp';
import ListItemIcon from '@mui/material/ListItemIcon';
import ListItemText from '@mui/material/ListItemText';
import MenuItem from '@mui/material/MenuItem';
import { Fragment, forwardRef } from 'react';
import { getConfigVars } from '../config-variables/ConfigVar';

export const ExportPlantUMLTreeItemContextMenuContribution = forwardRef(
  (
    { editingContextId, treeId, item, onClose }: TreeItemContextMenuComponentProps,
    ref: React.ForwardedRef<HTMLLIElement>
  ) => {
    if (!treeId.startsWith('explorer://') || !item.kind.startsWith('siriusWeb://document')) {
      return null;
    }

    return (
      <Fragment key="export-plantuml-tree-item-context-menu-contribution">
        <MenuItem
          key="exportplanuml"
          onClick={(e) => {
            e.preventDefault();
            onClose();
            const link = document.createElement('a');
            link.href = `${
              getConfigVars().MODEL_SERVICE_URL
            }/exportUMLClassDiagramToPlantUML?project_id=${editingContextId}&document_id=${item.id}&qualified_name=`;
            link.download = `${item.id}.puml`;
            document.body.appendChild(link);
            link.click();
            document.body.removeChild(link);
          }}
          component="a"
          data-testid="download"
          aria-disabled>
          <ListItemIcon>
            <GetAppIcon fontSize="small" />
          </ListItemIcon>
          <ListItemText primary="Download PlantUML" aria-disabled />
        </MenuItem>
      </Fragment>
    );
  }
);
