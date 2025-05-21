/*****************************************************************************
 * Copyright (c) 2025 CEA LIST
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.web.application.controller;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.components.core.api.IEditingContextSearchService;
import org.eclipse.sirius.components.emf.ResourceMetadataAdapter;
import org.eclipse.sirius.components.emf.services.api.IEMFEditingContext;
import org.eclipse.sirius.web.application.UUIDParser;
import org.eclipse.sirius.web.application.document.services.api.IDocumentExporter;
import org.eclipse.sirius.web.application.editingcontext.services.api.IEditingContextPersistenceFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Add an exportJSON GET endpoint: 
 * /api/export/editingcontexts/{editingContextId}/documents/{documentId}.
 * 
 * @author Pascal Bannerot (CEA LIST) <pascal.bannerot@cea.fr>
 */
@RestController
public class ExportModelController {
    @Autowired
    private IEditingContextSearchService editingContextSearchService;
    
    private final List<IDocumentExporter> documentExporters;
    private final List<IEditingContextPersistenceFilter> persistenceFilters;
    
    public ExportModelController(List<IDocumentExporter> documentExporter,
            List<IEditingContextPersistenceFilter> editingContextPersistenceFilter) {
        this.documentExporters = documentExporter;
        this.persistenceFilters = editingContextPersistenceFilter;
    }
    
    @GetMapping(value = "/api/export/editingcontexts/{editingContextId}/documents/{documentId}", 
           produces = {"application/json" })
    public String exportJSON(@PathVariable(value = "editingContextId") String editingContextId,
            @PathVariable(value = "documentId") String documentId) {
        Optional<IEMFEditingContext> oec = editingContextSearchService.findById(editingContextId)
                .filter(IEMFEditingContext.class::isInstance)
                .map(IEMFEditingContext.class::cast);
        if (oec.isPresent()) {
            IEMFEditingContext editingContext = oec.get();
            
            List<Resource> resources = editingContext.getDomain().getResourceSet().getResources().stream()
                    .filter(resource -> this.persistenceFilters.stream().allMatch(filter -> filter.shouldPersist(resource)))
                    .toList();
            
            for (var resource: resources) {
                var resourceId = resource.getURI().path().substring(1);
                var optionalDocumentId = new UUIDParser().parse(resourceId);

                var optionalDocumentName = resource.eAdapters().stream()
                        .filter(ResourceMetadataAdapter.class::isInstance)
                        .map(ResourceMetadataAdapter.class::cast)
                        .map(ResourceMetadataAdapter::getName)
                        .findFirst();

                var optionalContent = this.documentExporters.stream()
                        .filter(documentExporter -> documentExporter.canHandle(resource, MediaType.APPLICATION_JSON_VALUE))
                        .findFirst()
                        .flatMap(documentExporter -> documentExporter.getBytes(resource, MediaType.APPLICATION_JSON_VALUE));
                if (optionalDocumentId.isPresent() && optionalDocumentName.isPresent() && optionalContent.isPresent()) {
                    var documentUUid = optionalDocumentId.get();
//                    var documentName = optionalDocumentName.get();
                    var content = optionalContent.get();
                    
                    if (documentUUid.compareTo(UUID.fromString(documentId)) == 0) { 
                        return new String(content, StandardCharsets.UTF_8);
                    }
                }
            }
        }
        return "";
    }
}

