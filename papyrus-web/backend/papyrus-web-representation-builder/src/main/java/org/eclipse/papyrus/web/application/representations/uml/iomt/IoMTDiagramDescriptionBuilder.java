/*****************************************************************************
 * Copyright (c) 2022, 2025 CEA LIST, Obeo, Artal Technologies.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Obeo - Initial API and implementation
 *  Titouan BOUËTE-GIRAUD (Artal Technologies) - titouan.bouete-giraud@artal.fr - Issue 200, Issue 203
 *  Aurelien Didier (Artal Technologies) - Issue 199, Issue 190
 *  Marcos Didonet Del Fabro (CEA)
 *****************************************************************************/
package org.eclipse.papyrus.web.application.representations.uml.iomt;

import static org.eclipse.papyrus.web.application.representations.view.aql.Variables.CACHE;
import static org.eclipse.papyrus.web.application.representations.view.aql.Variables.GRAPHICAL_EDGE_SOURCE;
import static org.eclipse.papyrus.web.application.representations.view.aql.Variables.GRAPHICAL_EDGE_TARGET;
import static org.eclipse.papyrus.web.application.representations.view.aql.Variables.SEMANTIC_EDGE_SOURCE;
import static org.eclipse.papyrus.web.application.representations.view.aql.Variables.SEMANTIC_EDGE_TARGET;

import com.google.common.base.Predicate;

import java.util.List;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.papyrus.uml.domain.services.EMFUtils;
import org.eclipse.papyrus.web.application.representations.uml.AbstractRepresentationDescriptionBuilder;
import org.eclipse.papyrus.web.application.representations.uml.AssociationEdgeCustomStyleBuilder;
import org.eclipse.papyrus.web.application.representations.uml.ClassDiagramServices;
import org.eclipse.papyrus.web.application.representations.view.CreationToolsUtil;
import org.eclipse.papyrus.web.application.representations.view.IdBuilder;
import org.eclipse.papyrus.web.application.representations.view.aql.CallQuery;
import org.eclipse.papyrus.web.application.representations.view.aql.Services;
import org.eclipse.papyrus.web.application.representations.view.builders.CallbackAdapter;
import org.eclipse.papyrus.web.application.representations.view.builders.ViewBuilder;
import org.eclipse.sirius.components.view.ChangeContext;
import org.eclipse.sirius.components.view.FixedColor;
import org.eclipse.sirius.components.view.ViewFactory;
import org.eclipse.sirius.components.view.diagram.ArrowStyle;
import org.eclipse.sirius.components.view.diagram.ConditionalNodeStyle;
import org.eclipse.sirius.components.view.diagram.DiagramDescription;
import org.eclipse.sirius.components.view.diagram.DiagramFactory;
import org.eclipse.sirius.components.view.diagram.DiagramToolSection;
import org.eclipse.sirius.components.view.diagram.DropNodeTool;
import org.eclipse.sirius.components.view.diagram.EdgeDescription;
import org.eclipse.sirius.components.view.diagram.EdgeTool;
import org.eclipse.sirius.components.view.diagram.InsideLabelDescription;
import org.eclipse.sirius.components.view.diagram.InsideLabelPosition;
import org.eclipse.sirius.components.view.diagram.InsideLabelStyle;
import org.eclipse.sirius.components.view.diagram.LabelTextAlign;
import org.eclipse.sirius.components.view.diagram.LineStyle;
import org.eclipse.sirius.components.view.diagram.NodeDescription;
import org.eclipse.sirius.components.view.diagram.NodeTool;
import org.eclipse.sirius.components.view.diagram.RectangularNodeStyleDescription;
import org.eclipse.sirius.components.view.diagram.SynchronizationPolicy;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * Builder of the "IoMT Class Diagram " diagram representation. Adapted from CDDDiagramDescriptionBuilder
 *
 * @author Marcos Didonet Del Fabro (CEA)
 */
public class IoMTDiagramDescriptionBuilder extends AbstractRepresentationDescriptionBuilder {

    public static final String ATTRIBUTES_COMPARTMENT_SUFFIX = "Attributes";

    public static final String LITERAL_COMPARTMENT_SUFFIX = "Literals";

    public static final String NESTED_CLASSIFIERS_COMPARTMENT_SUFFIX = "NestedClassifiers";

    public static final String OPERATIONS_COMPARTMENT_SUFFIX = "Operations";

    public static final String RECEPTION_COMPARTMENT_SUFFIX = "Receptions";

    public static final String IOMT_REP_NAME = "IOMT Diagram";

    public static final String IOMT_PREFIX = "IOMT_";

    public static final String TVRA = "TVRA";

    private static final String NEW_CONTAINMENT_LINK_TOOL_LABEL = "New Containment Link";

    public static final String CLASSIFIER_CONTAINMENT_LINK_EDGE_ID = IOMT_PREFIX + "_ClassifierContainmentLink_FeatureEdge";

    public static final String PACKAGE_CONTAINMENT_LINK_EDGE_ID = IOMT_PREFIX + "_PackageContainmentLink_FeatureEdge";

    private final UMLPackage pack = UMLPackage.eINSTANCE;

    /**
     * The <i>shared</i> {@link NodeDescription} for the diagram.
     */
    private NodeDescription cdSharedDescription;

    public IoMTDiagramDescriptionBuilder() {
        super(IOMT_PREFIX, IOMT_REP_NAME, UMLPackage.eINSTANCE.getPackage());
    }

    @Override
    protected void fillDescription(DiagramDescription diagramDescription) {

        diagramDescription.setPreconditionExpression(CallQuery.queryServiceOnSelf(Services.IS_NOT_PROFILE_MODEL));
        this.createDefaultToolSectionInDiagramDescription(diagramDescription);

        this.cdSharedDescription = this.createSharedDescription(diagramDescription);
            
        this.createClassDescription(diagramDescription);
        this.createCommentTopNodeDescription(diagramDescription, NODES);
        this.createConstraintTopNodeDescription(diagramDescription, NODES);

        this.createAttributeSharedNodeDescription(diagramDescription);

        this.createCommentSubNodeDescription(diagramDescription, this.cdSharedDescription, NODES,
                 this.getIdBuilder().getSpecializedDomainNodeName(this.pack.getComment(), SHARED_SUFFIX), List.of(this.pack.getPackage()));
        this.createConstraintSubNodeDescription(diagramDescription, this.cdSharedDescription, NODES,
                 this.getIdBuilder().getSpecializedDomainNodeName(this.pack.getConstraint(), SHARED_SUFFIX), List.of(this.pack.getPackage()));

        // create shared compartments
        this.createDependencyDescription(diagramDescription);
        this.createGeneralizationDescription(diagramDescription);
        // this.createAssociationDescription(diagramDescription);
        this.createClassifierContainmentLink(diagramDescription);

        diagramDescription.getPalette().setDropTool(this.getViewBuilder().createGenericSemanticDropTool(this.getIdBuilder().getDiagramSemanticDropToolName()));

        DropNodeTool cddGraphicalDropTool = this.getViewBuilder().createGraphicalDropTool(this.getIdBuilder().getDiagramGraphicalDropToolName());
        List<EClass> children = List.of(this.pack.getModel(), this.pack.getPackage(), this.pack.getComment(), this.pack.getConstraint(), this.pack.getClass_(), this.pack.getInterface(),
                this.pack.getDataType(), this.pack.getEnumeration(), this.pack.getSignal());
        this.registerCallback(diagramDescription, () -> {
            List<NodeDescription> droppedNodeDescriptions = this.collectNodesWithDomainAndFilter(diagramDescription, children, List.of());
            cddGraphicalDropTool.getAcceptedNodeTypes().addAll(droppedNodeDescriptions);
        });
        diagramDescription.getPalette().setDropNodeTool(cddGraphicalDropTool);
    }

    /**
     * Create Class node description, and its related profile nodes
     * 
     * @param diagramDescription
     */

    private void createClassDescription(DiagramDescription diagramDescription) {
        NodeDescription classDescription = this.newNodeBuilder(this.pack.getClass_(),
                this.getViewBuilder().createRectangularNodeStyle())
                .layoutStrategyDescription(DiagramFactory.eINSTANCE.createListLayoutStrategyDescription())
                .semanticCandidateExpression(this.getQueryBuilder().queryAllReachable(this.pack.getClass_()))
                .synchronizationPolicy(SynchronizationPolicy.UNSYNCHRONIZED)
                .insideLabelDescription(this.getViewBuilder().createDefaultInsideLabelDescription(true, true))
                .labelEditTool(this.getViewBuilder().createDirectEditTool(this.pack.getClass_().getName()))
                .deleteTool(this.getViewBuilder().createNodeDeleteTool(this.pack.getClass_().getName()))
                .build();

        diagramDescription.getNodeDescriptions().add(classDescription);

        createProfiledNodeElements(diagramDescription);
        createStereotypedAssociation(diagramDescription, "New tvra:NetworkDomain", "tvra::NetworkDomain");
        createElementsStyles(classDescription);
    }

    private void createElementsStyles(NodeDescription classDescription) {
        ConditionalNodeStyle elementConditionalStyle = DiagramFactory.eINSTANCE.createConditionalNodeStyle();
        //goalConditionalStyle.setCondition("aql:self.getAppliedStereotypes()->exists(s | s.qualifiedName = 'gsn::Core::Goal')");
        elementConditionalStyle.setCondition("aql:self");
        RectangularNodeStyleDescription nodeStyle = this.getViewBuilder().createRectangularNodeStyle();
        FixedColor bgColor = ViewFactory.eINSTANCE.createFixedColor();
        bgColor.setValue("#E3F2FD"); // Light blue background
        nodeStyle.setBackground(bgColor);
        nodeStyle.setBorderRadius(10);
        elementConditionalStyle.setStyle(nodeStyle);
        classDescription.getConditionalStyles().add(elementConditionalStyle);

    }   

    /**
     * Create new node tools that apply profiles to specific classes
     * 
     * 
     * PROMPT used to generate the elements.
     * 
     * Consider this file.
     *
     * For a Sensor Classifier, I would like to produce the following line: {"New Sensor", "IoMTProfile::LAN::Sensor"},
     * For a IoMTDevice classifier, this line: {"New IOMT Device", "IoMTProfile::LAN::IoMTDevice"}, It creates the
     * qualified name of the classifier, taking the corresponding root packages as well. Could you extract all the
     * classifiers and produce the corresponding lines ?
     */

    private void createProfiledNodeElements(DiagramDescription diagramDescription) {
        // Define a two-dimensional array to hold the toolName and stereotypeName pairs
        String[][] tools = {
                { "New Sensor", "IoMTProfile::LAN::Sensor" },
                { "New Device", "IoMTProfile::LAN::IoMTDevice" },
                { "New Configuration", "IoMTProfile::LAN::IoMTConfiguration" },
                { "New External Function", "IoMTProfile::LAN::ExternalFunction" },
                { "New Gateway", "IoMTProfile::LAN::Gateway" },
                { "New Actuator", "IoMTProfile::LAN::Actuator" },
                { "New Local Management App", "IoMTProfile::LAN::LocalManagementApp" },
                { "New DataStore", "IoMTProfile::WAN::DataStore" },
                { "New Proxy", "IoMTProfile::WAN::Proxy" },
                { "New MedicalApp", "IoMTProfile::Application::MedicalApp" },
                { "New AdministrationApp", "IoMTProfile::Application::AdministrationApp" },
                { "New PatientApp", "IoMTProfile::Application::PatientApp" },
                { "New Person", "IoMTProfile::External::Person" }
        };

        String[][] toolsTVRA = {
                { "New TVRA Asset", "tvra::TVRAAsset" },
                { "New ControlSet", "tvra::ControlSet" },
                { "New Misbehaviour", "tvra::Misbehaviour" },
                { "New TWAS", "tvra::TrustworthinessAttributeSet" },
        };

        for (String[] tool : tools) {
            this.createStereotypedNodeTool(diagramDescription, tool[0], tool[1], NODES);
        }
        DiagramToolSection iomtToolSection = this.getViewBuilder().createDiagramToolSection(TVRA);
        diagramDescription.getPalette().getToolSections().addAll(List.of(iomtToolSection));
        for (String[] tool : toolsTVRA) {
            this.createStereotypedNodeTool(diagramDescription, tool[0], tool[1], TVRA);
        }
    }

    /** Create the tool sections for the profile applications */
    private void createProfiledToolSections(DiagramDescription diagramDescription, NodeTool creationTool, String menuGroup) {
        addDiagramToolInToolSection(diagramDescription, creationTool, menuGroup);
    }

    /**
     * Creates a stereotyped node tool with the given parameters.
     */
    protected void createStereotypedNodeTool(DiagramDescription diagramDescription,
            String toolName,
            String stereotypeName,
            String menuGroup) {

        EClass classEClass = this.pack.getClass_();
        NodeTool creationTool = this.getViewBuilder().createCreationTool(
                this.pack.getPackage_PackagedElement(),
                classEClass);
        creationTool.setName(toolName);

        ChangeContext createContext = (ChangeContext) creationTool.getBody().get(0);
        ChangeContext applyStereotypeContext = ViewFactory.eINSTANCE.createChangeContext();

        String aqlExpression = "aql:let stereotype = self.getApplicableStereotype('" + stereotypeName + "') in " +
                "if (stereotype <> null) then " +
                "self.applyStereotype(stereotype) " +
                "else self " +
                "endif";

        applyStereotypeContext.setExpression(aqlExpression);
        createContext.getChildren().add(applyStereotypeContext);
        creationTool.getBody().clear();
        creationTool.getBody().add(createContext);

        createProfiledToolSections(diagramDescription, creationTool, menuGroup);
    }

    private void createStereotypedAssociation(DiagramDescription diagramDescription,
            String toolName,
            String stereotypeName) {
        Supplier<List<NodeDescription>> sourceAndTargetDescriptionsSupplier = () -> this.collectNodesWithDomain(diagramDescription, this.pack.getClassifier());

        EClass association = this.pack.getAssociation();

        // Filter to only show associations with the specific stereotype
        String filterExpr = "aql:self.eAllContents()->filter(uml::Association)->select(a | a.getAppliedStereotypes()->exists(s | s.qualifiedName = '" + stereotypeName + "'))";

        EdgeDescription associationEdge = this.getViewBuilder().createDefaultSynchonizedDomainBaseEdgeDescription(
                association,
                filterExpr,
                sourceAndTargetDescriptionsSupplier,
                sourceAndTargetDescriptionsSupplier);

        associationEdge.setName(toolName + "EdgeMapping");

        // Style for relationships
        associationEdge.getStyle().setLineStyle(LineStyle.SOLID);
        associationEdge.getStyle().setTargetArrowStyle(ArrowStyle.NONE);
        associationEdge.getStyle().setSourceArrowStyle(ArrowStyle.NONE);

        EdgeTool edgeCreationTool = this.getViewBuilder().createDefaultDomainBasedEdgeTool(
                associationEdge,
                this.pack.getPackage_PackagedElement());
        edgeCreationTool.setName(toolName);

        // Apply the stereotype
        ChangeContext createContext = (ChangeContext) edgeCreationTool.getBody().get(0);
        ChangeContext applyStereotypeContext = ViewFactory.eINSTANCE.createChangeContext();
        applyStereotypeContext.setExpression(
                "aql:self.applyStereotype(self.getApplicableStereotype('" + stereotypeName + "'))");

        createContext.getChildren().add(applyStereotypeContext);
        edgeCreationTool.getBody().clear();
        edgeCreationTool.getBody().add(createContext);

        this.registerCallback(associationEdge, () -> {
            CreationToolsUtil.addEdgeCreationTool(sourceAndTargetDescriptionsSupplier, edgeCreationTool);
        });

        //the center expression is the value of the kind attribute of TVRA::NetworkDomain
        associationEdge.setCenterLabelExpression(
                                    "aql:let stereotype = self.getAppliedStereotypes()->first() in " +
                                            "if (stereotype <> null) then " +
                                            "  self.getValue(stereotype, 'kind')  " +
                                            "else " +
                                            "  self.name " +
                                            "endif");

        new AssociationEdgeCustomStyleBuilder(associationEdge).addCustomArowStyles();
        
        diagramDescription.getEdgeDescriptions().add(associationEdge);
        this.getViewBuilder().addDefaultReconnectionTools(associationEdge);
    }

    /**
     * Creates a <i>Property</i> child reused by <i>Attributes</i> compartments.
     *
     * @param diagramDescription
     *            the {@link DiagramDescription} containing the created {@link NodeDescription}
     */
    private void createAttributeSharedNodeDescription(DiagramDescription diagramDescription) {
        List<EClass> owners = List.of(this.pack.getClass_(), this.pack.getDataType(), this.pack.getPrimitiveType(), this.pack.getInterface(), this.pack.getSignal());
        List<EClass> forbiddenOwners = List.of();
        NodeDescription attributeInCompartmentSharedNodeDescription = this.createSubNodeDescriptionInCompartmentDescription(diagramDescription, this.cdSharedDescription,
                this.pack.getProperty(), ATTRIBUTES_COMPARTMENT_SUFFIX, CallQuery.queryOperationOnSelf(this.pack.getClassifier__GetAllAttributes()),
                this.pack.getInterface_OwnedAttribute(), owners, forbiddenOwners, nodeDescription -> nodeDescription != null);
        attributeInCompartmentSharedNodeDescription.setName(attributeInCompartmentSharedNodeDescription.getName() + UNDERSCORE + SHARED_SUFFIX);
    }

    /**
     * Creates a {@link NodeDescription} reused in a {@link NodeDescription} compartment.
     * <p>
     * The created {@link NodeDescription} is added to the provided {@code parentNodeDescription}
     * {@link NodeDescription} and reused by the {@code owners} {@link NodeDescription}s.
     * <p>
     *
     * @param diagramDescription
     *            the {@link DiagramDescription} containing the created {@link NodeDescription}
     * @param parentNodeDescription
     *            the {@link NodeDescription} used to contain the created {@link NodeDescription}
     * @param domainType
     *            the domain type used to define the new {@link NodeDescription}
     * @param compartmentName
     *            the name of the compartment which contain the child {@link NodeDescription} to create
     * @param semanticQuery
     *            the semantic candidate expression to get semantic element
     * @param semanticRefTool
     *            the containment reference to used for the creation
     * @param owners
     *            the semantic types that can contain this {@link NodeDescription}
     * @param forbiddenOwners
     *            the list of domain types to exclude
     * @param forbiddenNodeDescriptionPredicate
     *            predicate on the {@link NodeDescription} to exclude
     * @return the created {@link NodeDescription}
     */
    // CHECKSTYLE:OFF
    protected NodeDescription createNestedClassifierSubNodeDescriptionInCompartmentDescription(DiagramDescription diagramDescription, NodeDescription parentNodeDescription, EClass domainType,
            String compartmentName,
            String semanticQuery, EReference semanticRefTool, List<EClass> owners, List<EClass> forbiddenOwners, Predicate<NodeDescription> forbiddenNodeDescriptionPredicate) {
        // CHECKSTYLE:ON
        String nodeDescriptionName = this.getIdBuilder().getDomainNodeName(domainType);

        InsideLabelDescription insideLabelDescription = DiagramFactory.eINSTANCE.createInsideLabelDescription();
        insideLabelDescription.setLabelExpression(CallQuery.queryServiceOnSelf(Services.RENDER_LABEL_ONE_LINE, "false", "true"));
        insideLabelDescription.setTextAlign(LabelTextAlign.LEFT);
        insideLabelDescription.setPosition(InsideLabelPosition.MIDDLE_LEFT);
        InsideLabelStyle style = this.getViewBuilder().createDefaultInsideLabelStyleIcon();
        insideLabelDescription.setStyle(style);

        NodeDescription createNodeDescriptionInCompartmentDescription = this.newNodeBuilder(domainType, DiagramFactory.eINSTANCE.createIconLabelNodeStyleDescription())//
                .name(nodeDescriptionName) //
                .layoutStrategyDescription(DiagramFactory.eINSTANCE.createListLayoutStrategyDescription())//
                .semanticCandidateExpression(semanticQuery)//
                .synchronizationPolicy(SynchronizationPolicy.UNSYNCHRONIZED)//
                .labelEditTool(this.getViewBuilder().createDirectEditTool(domainType.getName()))//
                .deleteTool(this.getViewBuilder().createNodeDeleteTool(domainType.getName())) //
                .insideLabelDescription(insideLabelDescription)
                .build();
        parentNodeDescription.getChildrenDescriptions().add(createNodeDescriptionInCompartmentDescription);

        // Tool used to create Node Description in Compartment from the compartment
        NodeTool classNodeDescriptionCreationTool = this.getViewBuilder().createCreationTool(this.pack.getInterface_NestedClassifier(), this.pack.getClass_());
        NodeTool dataTypeNodeDescriptionCreationTool = this.getViewBuilder().createCreationTool(this.pack.getInterface_NestedClassifier(), this.pack.getDataType());
        NodeTool enumerationNodeDescriptionCreationTool = this.getViewBuilder().createCreationTool(semanticRefTool, this.pack.getEnumeration());
        NodeTool primitiveTypeNodeDescriptionCreationTool = this.getViewBuilder().createCreationTool(semanticRefTool, this.pack.getPrimitiveType());
        NodeTool interfaceNodeDescriptionCreationTool = this.getViewBuilder().createCreationTool(semanticRefTool, this.pack.getInterface());
        NodeTool signalNodeDescriptionCreationTool = this.getViewBuilder().createCreationTool(semanticRefTool, this.pack.getSignal());
        this.registerCallback(createNodeDescriptionInCompartmentDescription, () -> {
            List<NodeDescription> ownerCompartmentNodeDescriptions = EMFUtils.allContainedObjectOfType(diagramDescription, NodeDescription.class) //
                    .filter(node -> IdBuilder.isCompartmentNode(node) && node.getName().contains(compartmentName)) //
                    .toList();
            this.addNodeToolInToolSection(ownerCompartmentNodeDescriptions, classNodeDescriptionCreationTool, NODES);
            this.addNodeToolInToolSection(ownerCompartmentNodeDescriptions, dataTypeNodeDescriptionCreationTool, NODES);
            this.addNodeToolInToolSection(ownerCompartmentNodeDescriptions, enumerationNodeDescriptionCreationTool, NODES);
            this.addNodeToolInToolSection(ownerCompartmentNodeDescriptions, primitiveTypeNodeDescriptionCreationTool, NODES);
            this.addNodeToolInToolSection(ownerCompartmentNodeDescriptions, interfaceNodeDescriptionCreationTool, NODES);
            this.addNodeToolInToolSection(ownerCompartmentNodeDescriptions, signalNodeDescriptionCreationTool, NODES);
            this.reusedNodeDescriptionInOwners(createNodeDescriptionInCompartmentDescription, ownerCompartmentNodeDescriptions);
        });

        return createNodeDescriptionInCompartmentDescription;
    }

    private void createClassifierContainmentLink(DiagramDescription diagramDescription) {

        Supplier<List<NodeDescription>> sourceProvider = () -> this.collectNodesWithDomain(diagramDescription, this.pack.getClass_());
        Supplier<List<NodeDescription>> targetProvider = () -> this.collectNodesWithDomain(diagramDescription, this.pack.getClassifier());

        EdgeDescription containmentLinkEdge = this.getViewBuilder().createFeatureEdgeDescription(//
                CLASSIFIER_CONTAINMENT_LINK_EDGE_ID, //
                this.getQueryBuilder().emptyString(), //
                CallQuery.queryAttributeOnSelf(this.pack.getClass_NestedClassifier()), //
                sourceProvider, //
                targetProvider);

        containmentLinkEdge.setPreconditionExpression(new CallQuery(GRAPHICAL_EDGE_SOURCE).callService(Services.IS_NOT_VISUAL_DESCENDANT, GRAPHICAL_EDGE_TARGET, CACHE));

        containmentLinkEdge.getStyle().setSourceArrowStyle(ArrowStyle.CROSSED_CIRCLE);

        diagramDescription.getEdgeDescriptions().add(containmentLinkEdge);

        // Create containment Link tool
        EdgeTool tool = DiagramFactory.eINSTANCE.createEdgeTool();
        tool.setName(NEW_CONTAINMENT_LINK_TOOL_LABEL); //
        tool.setIconURLsExpression(ViewBuilder.getIconPathFromString("ContainmentLink"));

        String toolQuery = new CallQuery(SEMANTIC_EDGE_TARGET).callService(Services.MOVE_IN, SEMANTIC_EDGE_SOURCE, this.getQueryBuilder().aqlString(this.pack.getClass_NestedClassifier().getName()));

        ChangeContext changeContext = this.getViewBuilder().createChangeContextOperation(toolQuery);
        containmentLinkEdge.eAdapters().add(new CallbackAdapter(() -> {
            List<NodeDescription> targetNodeDescriptions = containmentLinkEdge.getTargetNodeDescriptions();
            tool.getTargetElementDescriptions().addAll(targetNodeDescriptions);
        }));
        tool.getBody().add(changeContext);
        this.registerCallback(containmentLinkEdge, () -> {
            CreationToolsUtil.addEdgeCreationTool(sourceProvider, tool);
        });
    }

    private void createDependencyDescription(DiagramDescription diagramDescription) {
        Supplier<List<NodeDescription>> namedElementDescriptions = () -> this.collectNodesWithDomain(diagramDescription, this.pack.getNamedElement());
        EdgeDescription cdDependency = this.getViewBuilder().createDefaultSynchonizedDomainBaseEdgeDescription(this.pack.getDependency(),
                this.getQueryBuilder().queryAllReachableExactType(this.pack.getDependency()), namedElementDescriptions, namedElementDescriptions);
        cdDependency.getStyle().setLineStyle(LineStyle.DASH);
        cdDependency.getStyle().setTargetArrowStyle(ArrowStyle.INPUT_ARROW);
        EdgeTool creationTool = this.getViewBuilder().createDefaultDomainBasedEdgeTool(cdDependency, this.pack.getPackage_PackagedElement());
        this.registerCallback(cdDependency, () -> {
            CreationToolsUtil.addEdgeCreationTool(namedElementDescriptions, creationTool);
        });
        diagramDescription.getEdgeDescriptions().add(cdDependency);

        this.getViewBuilder().addDefaultReconnectionTools(cdDependency);
    }

    private void createGeneralizationDescription(DiagramDescription diagramDescription) {
        Supplier<List<NodeDescription>> sourceAndTargetDescriptionsSupplier = () -> this.collectNodesWithDomain(diagramDescription, this.pack.getClassifier());

        EClass generalization = this.pack.getGeneralization();
        EdgeDescription cdGeneralization = this.getViewBuilder().createDefaultSynchonizedDomainBaseEdgeDescription(generalization, this.getQueryBuilder().queryAllReachableExactType(generalization),
                sourceAndTargetDescriptionsSupplier, sourceAndTargetDescriptionsSupplier);
        cdGeneralization.getStyle().setLineStyle(LineStyle.SOLID);
        cdGeneralization.getStyle().setTargetArrowStyle(ArrowStyle.INPUT_CLOSED_ARROW);
        EdgeTool cdGeneralizationCreationTool = this.getViewBuilder().createDefaultDomainBasedEdgeTool(cdGeneralization, this.pack.getClassifier_Generalization());
        this.registerCallback(cdGeneralization, () -> {
            CreationToolsUtil.addEdgeCreationTool(sourceAndTargetDescriptionsSupplier, cdGeneralizationCreationTool);
        });

        diagramDescription.getEdgeDescriptions().add(cdGeneralization);

        this.getViewBuilder().addDefaultReconnectionTools(cdGeneralization);
    }

    /*
    TODO to be removed
    */
    private void createAssociationDescription(DiagramDescription diagramDescription) {
        Supplier<List<NodeDescription>> sourceAndTargetDescriptionsSupplier = () -> this.collectNodesWithDomain(diagramDescription, this.pack.getClassifier());

        EClass association = this.pack.getAssociation();
        EdgeDescription cdAssociation = this.getViewBuilder().createDefaultSynchonizedDomainBaseEdgeDescription(association, this.getQueryBuilder().queryAllReachableExactType(association),
                sourceAndTargetDescriptionsSupplier, sourceAndTargetDescriptionsSupplier);
        cdAssociation.getStyle().setLineStyle(LineStyle.SOLID);
        cdAssociation.getStyle().setTargetArrowStyle(ArrowStyle.NONE);
        cdAssociation.getStyle().setSourceArrowStyle(ArrowStyle.NONE);

        EdgeTool associationTool = this.getViewBuilder().createDefaultDomainBasedEdgeTool(cdAssociation, this.pack.getPackage_PackagedElement());
        this.registerCallback(cdAssociation, () -> {
            CreationToolsUtil.addEdgeCreationTool(sourceAndTargetDescriptionsSupplier, associationTool);
        });

        cdAssociation.setBeginLabelExpression(this.getQueryBuilder().createDomainBaseEdgeSourceLabelExpression());
        cdAssociation.getPalette().setBeginLabelEditTool(this.getViewBuilder().createDirectEditTool(CallQuery.queryServiceOnSelf(ClassDiagramServices.GET_ASSOCIATION_TARGET)));

        cdAssociation.setEndLabelExpression(this.getQueryBuilder().createDomainBaseEdgeTargetLabelExpression());
        cdAssociation.getPalette().setEndLabelEditTool(this.getViewBuilder().createDirectEditTool(CallQuery.queryServiceOnSelf(ClassDiagramServices.GET_ASSOCIATION_SOURCE)));

        // Can be improve once https://github.com/PapyrusSirius/papyrus-web/issues/208 is closed
        new AssociationEdgeCustomStyleBuilder(cdAssociation).addCustomArowStyles();

        diagramDescription.getEdgeDescriptions().add(cdAssociation);

        this.getViewBuilder().addDefaultReconnectionTools(cdAssociation);
    }

}
