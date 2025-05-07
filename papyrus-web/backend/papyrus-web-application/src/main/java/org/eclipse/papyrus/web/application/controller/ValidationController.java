/*****************************************************************************
 * Copyright (c) 2025 CEA LIST.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Pascal Bannerot (CEA LIST) <pascal.bannerot@cea.fr> - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.web.application.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.eclipse.sirius.components.collaborative.validation.dto.ValidationEventInput;
import org.eclipse.sirius.components.collaborative.validation.dto.ValidationRefreshedEventPayload;
import org.eclipse.sirius.components.graphql.api.IEventProcessorSubscriptionProvider;
import org.eclipse.sirius.components.graphql.api.IExceptionWrapper;
import org.eclipse.sirius.components.validation.Diagnostic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.Disposable;

/**
 * Add a validation GET endpoint: /api/validate/{editingContextId}
 *
 * Subscribe to validation event, handle the payload and retrieve diagnotics. Unsubscribe immediatly.
 *
 * @author Pascal Bannerot (CEA LIST) <pascal.bannerot@cea.fr>
 */
@RestController
public class ValidationController {
    @Autowired
    private IExceptionWrapper exceptionWrapper;

    @Autowired
    private IEventProcessorSubscriptionProvider eventProcessorSubscriptionProvider;

    @GetMapping("/api/validate/{editingContextId}")
    public List<Diagnostic> validation(@PathVariable(value = "editingContextId") String editingContextId) {
        ValidationEventInput validationEventInput = new ValidationEventInput(UUID.randomUUID(), editingContextId, "validation://");

        List<Diagnostic> diagnotics = new ArrayList<>();
        Disposable disposable = this.exceptionWrapper
                .wrapFlux(() -> this.eventProcessorSubscriptionProvider.getSubscription(validationEventInput.editingContextId(), validationEventInput.representationId(), validationEventInput),
                        validationEventInput)
                .map(payload -> (ValidationRefreshedEventPayload) payload)
                .flatMapIterable(payload -> payload.validation().getDiagnostics())
                .subscribe(diagnotics::add);
        disposable.dispose();

        return diagnotics;
    }
}
