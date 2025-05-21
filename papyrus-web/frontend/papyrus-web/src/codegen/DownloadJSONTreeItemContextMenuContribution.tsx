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
import { ServerContext, ServerContextValue } from '@eclipse-sirius/sirius-components-core';
import { TreeItemContextMenuComponentProps } from '@eclipse-sirius/sirius-components-trees';
import GetAppIcon from '@mui/icons-material/GetApp';
import ListItemIcon from '@mui/material/ListItemIcon';
import ListItemText from '@mui/material/ListItemText';
import MenuItem from '@mui/material/MenuItem';
import { Fragment, forwardRef, useContext } from 'react';


export const DownloadJSONTreeItemContextMenuContribution = forwardRef(
  (
    { editingContextId, treeId, item, readOnly, expandItem, onClose }: TreeItemContextMenuComponentProps,
    ref: React.ForwardedRef<HTMLLIElement>
  ) => {
    const { httpOrigin } = useContext<ServerContextValue>(ServerContext);

    if (!treeId.startsWith('explorer://') || !item.kind.startsWith('siriusWeb://document')) {
      return null;
    }

    return (
      <Fragment key="download_json-tree-item-context-menu-contribution">
        <MenuItem
          key="download_json"
          onClick={onClose}
          component="a"
          download={`${item.id}.json`}
          href={`${httpOrigin}/api/export/editingcontexts/${editingContextId}/documents/${item.id}`}
          type="application/json"
          data-testid="download"
          aria-disabled>
          <ListItemIcon>
            <GetAppIcon fontSize="small" />
          </ListItemIcon>
          <ListItemText primary="Download JSON" aria-disabled />
        </MenuItem>
      </Fragment>
    );
  }
);
