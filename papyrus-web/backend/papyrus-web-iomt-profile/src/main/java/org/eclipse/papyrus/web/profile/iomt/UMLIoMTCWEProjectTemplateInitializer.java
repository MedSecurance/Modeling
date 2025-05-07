/*****************************************************************************
 * Copyright (c) 2024, 2025 CEA LIST
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
package org.eclipse.papyrus.web.profile.iomt;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.web.application.representations.PapyrusRepresentationDescriptionRegistry;
import org.eclipse.papyrus.web.application.representations.aqlservices.utils.GenericDiagramService;
import org.eclipse.papyrus.web.application.representations.uml.iomt.IoMTDiagramDescriptionBuilder;
import org.eclipse.papyrus.web.application.templates.projects.PapyrusProjectTemplateInitializerParameters;
import org.eclipse.papyrus.web.application.templates.projects.TemplateInitializer;
import org.eclipse.papyrus.web.sirius.contributions.IDiagramBuilderService;
import org.eclipse.papyrus.web.sirius.contributions.IDiagramNavigationService;
import org.eclipse.sirius.components.collaborative.api.IRepresentationMetadataPersistenceService;
import org.eclipse.sirius.components.collaborative.api.IRepresentationPersistenceService;
import org.eclipse.sirius.components.core.RepresentationMetadata;
import org.eclipse.sirius.components.core.api.IEditingContext;
import org.eclipse.sirius.components.core.api.IRepresentationDescriptionSearchService;
import org.eclipse.sirius.components.diagrams.Diagram;
import org.eclipse.sirius.components.diagrams.description.DiagramDescription;
import org.eclipse.sirius.components.events.ICause;
import org.eclipse.sirius.components.representations.VariableManager;
import org.eclipse.sirius.components.view.diagram.NodeDescription;
import org.eclipse.sirius.web.application.project.services.api.IProjectTemplateInitializer;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


/**
 * Initializes the contents of projects created from a IoMT CWE project template.
 * 
 * @author Marcos Didonet Del Fabro (CEA LIST) <marcos.didonetdelfabro@cea.fr>
 */
@Configuration
public class UMLIoMTCWEProjectTemplateInitializer implements IProjectTemplateInitializer {
    private static final String CWE_MODEL_TITLE = "IoMTCWETemplate.uml";

    private final Logger logger = LoggerFactory.getLogger(UMLIoMTCWEProjectTemplateInitializer.class);


    private final TemplateInitializer initializerHelper;

    private final IDiagramBuilderService diagramBuilderService;

    private final GenericDiagramService classDiagramService;

    private final PapyrusRepresentationDescriptionRegistry papyrusRepresentationRegistry;

    private final IDiagramNavigationService diagramNavigationService;

    private final IRepresentationPersistenceService representationPersistenceService;

    private final IRepresentationDescriptionSearchService representationDescriptionSearchService;

    private final IRepresentationMetadataPersistenceService representationMetadataPersistenceService;

    public UMLIoMTCWEProjectTemplateInitializer(TemplateInitializer initializerHelper, //
            IDiagramBuilderService diagramBuilderService, //
            IDiagramNavigationService diagramNavigationService, //
            PapyrusRepresentationDescriptionRegistry papyrusRepresentationRegistry, //
            GenericDiagramService classDiagramService, //
            PapyrusProjectTemplateInitializerParameters papyrusProjectTemplateInitializerParameters) {
        this.initializerHelper = Objects.requireNonNull(initializerHelper);
        this.diagramBuilderService = Objects.requireNonNull(diagramBuilderService);
        this.papyrusRepresentationRegistry = Objects.requireNonNull(papyrusRepresentationRegistry);
        this.diagramNavigationService = Objects.requireNonNull(diagramNavigationService);
        this.classDiagramService = Objects.requireNonNull(classDiagramService);
        this.representationPersistenceService = papyrusProjectTemplateInitializerParameters.representationPersistenceService();
        this.representationDescriptionSearchService = papyrusProjectTemplateInitializerParameters.representationDescriptionSearchService();
        this.representationMetadataPersistenceService = papyrusProjectTemplateInitializerParameters.representationMetadataPersistenceService();
    }

    @Override
    public boolean canHandle(String templateId) {
        return List.of(UMLIoMTCWEProjectTemplateProvider.UML_IOMT_CWE_TEMPLATE_ID).contains(templateId);
    }

    @Override
    public Optional<RepresentationMetadata> handle(ICause cause, String templateId, IEditingContext editingContext) {
        Optional<RepresentationMetadata> result = Optional.empty();
        if (UMLIoMTCWEProjectTemplateProvider.UML_IOMT_CWE_TEMPLATE_ID.equals(templateId)) {
            result = this.initializeUMLIoMTCWEProjectContents(editingContext, cause);
        }
        return result;
    }

    /**
     * @param editingContext
     * @return
     */
    private Optional<RepresentationMetadata> initializeUMLIoMTCWEProjectContents(IEditingContext editingContext, ICause cause) {
        try {
            Optional<Resource> resource = this.initializerHelper.initializeResourceFromClasspathFile(editingContext, CWE_MODEL_TITLE, CWE_MODEL_TITLE, cause);
            var optionalDiagram = resource.flatMap(r -> this.createMainClassDiagram(editingContext, r, cause));
            if (optionalDiagram.isPresent()) {
                var diagram = optionalDiagram.get();
                Object semanticTarget = resource.map(r -> r.getContents().get(0)).orElse(null);
                var optionalRepresentationMetadata = this.createRepresentationMetadata(editingContext, diagram, semanticTarget);
                optionalRepresentationMetadata.ifPresent(rm -> {
                    this.representationMetadataPersistenceService.save(cause, editingContext, rm, diagram.getTargetObjectId());
                    this.representationPersistenceService.save(cause, editingContext, diagram);
                });
                return optionalRepresentationMetadata;
            }
        } catch (IOException e) {
            this.logger.error("Error while creating template", e);
        }
        return Optional.empty();
    }

    private Optional<Diagram> createMainClassDiagram(IEditingContext editingContext, Resource r, ICause cause) {
        Map<NodeDescription, org.eclipse.sirius.components.diagrams.description.NodeDescription> convertedNodes = this.papyrusRepresentationRegistry
                .getConvertedNode(IoMTDiagramDescriptionBuilder.IOMT_REP_NAME);
        Model model = (Model) r.getContents().get(0);
        return this.diagramBuilderService.createDiagram(editingContext, diagramDescription -> IoMTDiagramDescriptionBuilder.IOMT_REP_NAME.equals(diagramDescription.getLabel()), model, "HeartMonitoring")
                .flatMap(diagram -> this.semanticDropClass(editingContext, convertedNodes, model, diagram));
    }    
    
    private Optional<Diagram> semanticDropClass(IEditingContext editingContext,
            Map<NodeDescription, org.eclipse.sirius.components.diagrams.description.NodeDescription> convertedNodes, Model model, Diagram diagram) {
        Class heartMonitoring = (Class) model.getOwnedMembers().stream().filter(m -> m instanceof Class && "HeartMonitoring".equals(m.getName())).findFirst().orElse(null);
        Class thermometer = (Class) heartMonitoring.getNestedClassifier("Thermometer");
        Class mqttGateway = (Class) model.getOwnedMembers().stream().filter(m -> m instanceof Class && "MQTTGateway".equals(m.getName())).findFirst().get();
        Class proxy = (Class) model.getOwnedMembers().stream().filter(m -> m instanceof Class && "Proxy".equals(m.getName())).findFirst().get();
        Class fhirDatabase = (Class) model.getOwnedMembers().stream().filter(m -> m instanceof Class && "FHIRDatabase".equals(m.getName())).findFirst().get();
        Class patient = (Class) model.getOwnedMembers().stream().filter(m -> m instanceof Class && "Patient".equals(m.getName())).findFirst().get();
        Class patientApp = (Class) model.getOwnedMembers().stream().filter(m -> m instanceof Class && "PatientMonitoringApp".equals(m.getName())).findFirst().get();
        Class adminApp = (Class) model.getOwnedMembers().stream().filter(m -> m instanceof Class && "AdminApplication".equals(m.getName())).findFirst().get();
        Constraint constraint = (Constraint) fhirDatabase.getOwnedRules().stream().filter(m -> m instanceof Constraint && "CWE89_200_SQLInjection".equals(m.getName())).findFirst().get();

        return this.diagramBuilderService.updateDiagram(diagram, editingContext, diagramContext -> {
            this.classDiagramService.semanticDrop(thermometer, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(heartMonitoring, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(mqttGateway, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(proxy, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(fhirDatabase, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(patient, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(patientApp, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(adminApp, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(constraint, null, editingContext, diagramContext, convertedNodes);
        });
    }


    private Optional<RepresentationMetadata> createRepresentationMetadata(IEditingContext editingContext, Diagram diagram, Object semanticTarget) {
        return this.representationDescriptionSearchService.findById(editingContext, diagram.getDescriptionId())
                .filter(DiagramDescription.class::isInstance)
                .map(DiagramDescription.class::cast)
                .map(diagramDescription -> {
                    var variableManager = new VariableManager();
                    variableManager.put(VariableManager.SELF, semanticTarget);
                    variableManager.put(DiagramDescription.LABEL, diagramDescription.getLabel());
                    String label = diagramDescription.getLabelProvider().apply(variableManager);
                    List<String> iconURLs = diagramDescription.getIconURLsProvider().apply(variableManager);
                    return RepresentationMetadata.newRepresentationMetadata(diagram.getId())
                            .kind(diagram.getKind())
                            .label(label)
                            .descriptionId(diagram.getDescriptionId())
                            .iconURLs(iconURLs)
                            .build();
                });
    }    
    
}

