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
package org.eclipse.papyrus.web.profile.tvra;

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
 * Initializes the contents of projects created from a TVRA project template.
 * 
 * @author Marcos Didonet Del Fabro (CEA LIST) <marcos.didonetdelfabro@cea.fr>
 */
@Configuration
public class TVRATProjectTemplateInitializer implements IProjectTemplateInitializer {
    private static final String UML_MODEL_TITLE = "TVRATemplate.uml";

    private final Logger logger = LoggerFactory.getLogger(TVRATProjectTemplateInitializer.class);


    private final TemplateInitializer initializerHelper;

    private final IDiagramBuilderService diagramBuilderService;

    private final GenericDiagramService classDiagramService;

    private final PapyrusRepresentationDescriptionRegistry papyrusRepresentationRegistry;

    private final IDiagramNavigationService diagramNavigationService;

    private final IRepresentationPersistenceService representationPersistenceService;

    private final IRepresentationDescriptionSearchService representationDescriptionSearchService;

    private final IRepresentationMetadataPersistenceService representationMetadataPersistenceService;

    public TVRATProjectTemplateInitializer(TemplateInitializer initializerHelper, //
            IDiagramBuilderService diagramBuilderService, //
            IDiagramNavigationService diagramNavigationService, //
            PapyrusRepresentationDescriptionRegistry papyrusRepresentationRegistry, //
            GenericDiagramService classDiagramService, //
            PapyrusProjectTemplateInitializerParameters papyrusProjectTemplateInitializerParameters) {
        this.initializerHelper = Objects.requireNonNull(initializerHelper);
        this.diagramBuilderService = Objects.requireNonNull(diagramBuilderService);
        this.diagramNavigationService = Objects.requireNonNull(diagramNavigationService);
        this.papyrusRepresentationRegistry = Objects.requireNonNull(papyrusRepresentationRegistry);
        this.classDiagramService = Objects.requireNonNull(classDiagramService);
        this.representationPersistenceService = papyrusProjectTemplateInitializerParameters.representationPersistenceService();
        this.representationDescriptionSearchService = papyrusProjectTemplateInitializerParameters.representationDescriptionSearchService();
        this.representationMetadataPersistenceService = papyrusProjectTemplateInitializerParameters.representationMetadataPersistenceService();
    }

    @Override
    public boolean canHandle(String templateId) {
        return List.of(TVRAProjectTemplateProvider.UML_TVRA_TEMPLATE_ID).contains(templateId);
    }

    @Override
    public Optional<RepresentationMetadata> handle(ICause cause, String templateId, IEditingContext editingContext) {
        Optional<RepresentationMetadata> result = Optional.empty();
        if (TVRAProjectTemplateProvider.UML_TVRA_TEMPLATE_ID.equals(templateId)) {
            result = this.initializeUMLIoMTProjectContents(editingContext, cause);
        }
        return result;
    }

    /**
     * @param editingContext
     * @return
     */
    private Optional<RepresentationMetadata> initializeUMLIoMTProjectContents(IEditingContext editingContext, ICause cause) {
        try {
            Optional<Resource> resource = this.initializerHelper.initializeResourceFromClasspathFile(editingContext, UML_MODEL_TITLE, "TVRATemplate.uml", cause);
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
        return this.diagramBuilderService.createDiagram(editingContext, diagramDescription -> IoMTDiagramDescriptionBuilder.IOMT_REP_NAME.equals(diagramDescription.getLabel()), model, "RateMonitor")
                .flatMap(diagram -> this.semanticDropClass(editingContext, convertedNodes, model, diagram));
    }    
    
    private Optional<Diagram> semanticDropClass(IEditingContext editingContext,
            Map<NodeDescription, org.eclipse.sirius.components.diagrams.description.NodeDescription> convertedNodes,
            Model model, Diagram diagram) {
        Class sensor = (Class) model.getOwnedMembers().stream()
                .filter(m -> m instanceof Class && "Sensor".equals(m.getName())).findFirst().orElse(null);
        Class patient = (Class) model.getOwnedMembers().stream()
                .filter(m -> m instanceof Class && "Patient".equals(m.getName())).findFirst().orElse(null);
        Class patientsPhone = (Class) model.getOwnedMembers().stream()
                .filter(m -> m instanceof Class && "Patients_Phone".equals(m.getName())).findFirst().orElse(null);
        Class sensorApp = (Class) model.getOwnedMembers().stream()
                .filter(m -> m instanceof Class && "Sensor_App".equals(m.getName())).findFirst().orElse(null);
        Class publicClass = (Class) model.getOwnedMembers().stream()
                .filter(m -> m instanceof Class && "Public".equals(m.getName())).findFirst().orElse(null);
        Class patientsWork = (Class) model.getOwnedMembers().stream()
                .filter(m -> m instanceof Class && "Patients_Work".equals(m.getName())).findFirst().orElse(null);
        Class patientsHouse = (Class) model.getOwnedMembers().stream()
                .filter(m -> m instanceof Class && "Patients_House".equals(m.getName())).findFirst().orElse(null);
        Class patientsWifi = (Class) model.getOwnedMembers().stream()
                .filter(m -> m instanceof Class && "Patients_Wifi".equals(m.getName())).findFirst().orElse(null);
        Class patientsRouter = (Class) model.getOwnedMembers().stream()
                .filter(m -> m instanceof Class && "Patients_Router".equals(m.getName())).findFirst().orElse(null);
        Class internet = (Class) model.getOwnedMembers().stream()
                .filter(m -> m instanceof Class && "Internet".equals(m.getName())).findFirst().orElse(null);
        Class publicCellularNetwork = (Class) model.getOwnedMembers().stream()
                .filter(m -> m instanceof Class && "PublicCellularNetwork".equals(m.getName())).findFirst().orElse(null);
        Class cellularNetworkProvider = (Class) model.getOwnedMembers().stream()
                .filter(m -> m instanceof Class && "CellularNetworkProvider".equals(m.getName())).findFirst().orElse(null);
        Class dataRepo = (Class) model.getOwnedMembers().stream()
                .filter(m -> m instanceof Class && "DataRepo".equals(m.getName())).findFirst().orElse(null);
        Class repoProvider = (Class) model.getOwnedMembers().stream()
                .filter(m -> m instanceof Class && "RepoProvider".equals(m.getName())).findFirst().orElse(null);
        Class treatment = (Class) model.getOwnedMembers().stream()
                .filter(m -> m instanceof Class && "Treatment".equals(m.getName())).findFirst().orElse(null);
        Class patientsMeasurement = (Class) model.getOwnedMembers().stream()
                .filter(m -> m instanceof Class && "Patients_measurement".equals(m.getName())).findFirst().orElse(null);
        Class healthCareProvider = (Class) model.getOwnedMembers().stream()
                .filter(m -> m instanceof Class && "HealthCareProvider".equals(m.getName())).findFirst().orElse(null);

                
        return this.diagramBuilderService.updateDiagram(diagram, editingContext, diagramContext -> {
            this.classDiagramService.semanticDrop(sensor, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(patient, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(patientsPhone, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(sensorApp, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(publicClass, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(patientsWork, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(patientsHouse, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(patientsWifi, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(patientsRouter, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(internet, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(publicCellularNetwork, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(cellularNetworkProvider, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(dataRepo, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(repoProvider, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(treatment, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(patientsMeasurement, null, editingContext, diagramContext, convertedNodes);
            this.classDiagramService.semanticDrop(healthCareProvider, null, editingContext, diagramContext, convertedNodes);
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
