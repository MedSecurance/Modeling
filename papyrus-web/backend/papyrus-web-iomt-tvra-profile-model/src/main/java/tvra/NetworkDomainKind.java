/**
 */
package tvra;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Network Domain Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tvra.TvraPackage#getNetworkDomainKind()
 * @model
 * @generated
 */
public enum NetworkDomainKind implements Enumerator {
	/**
	 * The '<em><b>Above</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABOVE_VALUE
	 * @generated
	 * @ordered
	 */
	ABOVE(0, "above", "above"), /**
	 * The '<em><b>Access From</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_FROM_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS_FROM(1, "accessFrom", "accessFrom"), /**
	 * The '<em><b>Access From Client</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_FROM_CLIENT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS_FROM_CLIENT(2, "accessFromClient", "accessFromClient"), /**
	 * The '<em><b>Access Interrupted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_INTERRUPTED_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS_INTERRUPTED(3, "accessInterrupted", "accessInterrupted"), /**
	 * The '<em><b>Access To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_TO_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS_TO(4, "accessTo", "accessTo"), /**
	 * The '<em><b>Access To Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_TO_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS_TO_SERVICE(5, "accessToService", "accessToService"), /**
	 * The '<em><b>Access Uninterrupted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_UNINTERRUPTED_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS_UNINTERRUPTED(6, "accessUninterrupted", "accessUninterrupted"), /**
	 * The '<em><b>Access Via</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_VIA_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS_VIA(7, "accessVia", "accessVia"), /**
	 * The '<em><b>Accesses Field</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESSES_FIELD_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESSES_FIELD(8, "accessesField", "accessesField"), /**
	 * The '<em><b>Accesses Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESSES_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESSES_SERVICE(9, "accessesService", "accessesService"), /**
	 * The '<em><b>Accessible From</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESSIBLE_FROM_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESSIBLE_FROM(10, "accessibleFrom", "accessibleFrom"), /**
	 * The '<em><b>Accessible Via</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESSIBLE_VIA_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESSIBLE_VIA(11, "accessibleVia", "accessibleVia"), /**
	 * The '<em><b>Amends</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMENDS_VALUE
	 * @generated
	 * @ordered
	 */
	AMENDS(12, "amends", "amends"),

	/**
	 * The '<em><b>Amends Controller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMENDS_CONTROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	AMENDS_CONTROLLER(13, "amendsController", "amendsController"), /**
	 * The '<em><b>Amends Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMENDS_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	AMENDS_DATA(14, "amendsData", "amendsData"),

	/**
	 * The '<em><b>Amends Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMENDS_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	AMENDS_SENSOR(15, "amendsSensor", "amendsSensor"), /**
	 * The '<em><b>Appends</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPENDS_VALUE
	 * @generated
	 * @ordered
	 */
	APPENDS(16, "appends", "appends"),

	/**
	 * The '<em><b>Asserted Amends Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSERTED_AMENDS_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	ASSERTED_AMENDS_DATA(17, "assertedAmendsData", "assertedAmendsData"), /**
	 * The '<em><b>Asserted Inputs Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSERTED_INPUTS_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	ASSERTED_INPUTS_DATA(18, "assertedInputsData", "assertedInputsData"), /**
	 * The '<em><b>Asserted Views Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSERTED_VIEWS_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	ASSERTED_VIEWS_DATA(19, "assertedViewsData", "assertedViewsData"), /**
	 * The '<em><b>At Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	AT_HOST(20, "atHost", "atHost"), /**
	 * The '<em><b>Attack Path From</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACK_PATH_FROM_VALUE
	 * @generated
	 * @ordered
	 */
	ATTACK_PATH_FROM(21, "attackPathFrom", "attackPathFrom"), /**
	 * The '<em><b>Attack Path Via</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACK_PATH_VIA_VALUE
	 * @generated
	 * @ordered
	 */
	ATTACK_PATH_VIA(22, "attackPathVia", "attackPathVia"), /**
	 * The '<em><b>Blocked Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCKED_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	BLOCKED_PATH(23, "blockedPath", "blockedPath"), /**
	 * The '<em><b>Blocked Segment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCKED_SEGMENT_VALUE
	 * @generated
	 * @ordered
	 */
	BLOCKED_SEGMENT(24, "blockedSegment", "blockedSegment"), /**
	 * The '<em><b>Can Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAN_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	CAN_ACCESS(25, "canAccess", "canAccess"), /**
	 * The '<em><b>Can Get Keys</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAN_GET_KEYS_VALUE
	 * @generated
	 * @ordered
	 */
	CAN_GET_KEYS(26, "canGetKeys", "canGetKeys"), /**
	 * The '<em><b>Can Read</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAN_READ_VALUE
	 * @generated
	 * @ordered
	 */
	CAN_READ(27, "canRead", "canRead"), /**
	 * The '<em><b>Can Write</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAN_WRITE_VALUE
	 * @generated
	 * @ordered
	 */
	CAN_WRITE(28, "canWrite", "canWrite"), /**
	 * The '<em><b>Channel From</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANNEL_FROM_VALUE
	 * @generated
	 * @ordered
	 */
	CHANNEL_FROM(29, "channelFrom", "channelFrom"), /**
	 * The '<em><b>Channel To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANNEL_TO_VALUE
	 * @generated
	 * @ordered
	 */
	CHANNEL_TO(30, "channelTo", "channelTo"), /**
	 * The '<em><b>Channel Tried</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANNEL_TRIED_VALUE
	 * @generated
	 * @ordered
	 */
	CHANNEL_TRIED(31, "channelTried", "channelTried"), /**
	 * The '<em><b>Channel Via</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANNEL_VIA_VALUE
	 * @generated
	 * @ordered
	 */
	CHANNEL_VIA(32, "channelVia", "channelVia"), /**
	 * The '<em><b>Connected To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTED_TO_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTED_TO(33, "connectedTo", "connectedTo"), /**
	 * The '<em><b>Connects Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTS_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTS_DATA(34, "connectsData", "connectsData"), /**
	 * The '<em><b>Connects From</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTS_FROM_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTS_FROM(35, "connectsFrom", "connectsFrom"), /**
	 * The '<em><b>Connects To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTS_TO_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTS_TO(36, "connectsTo", "connectsTo"), /**
	 * The '<em><b>Contains</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINS(37, "contains", "contains"), /**
	 * The '<em><b>Contains Field</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS_FIELD_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINS_FIELD(38, "containsField", "containsField"), /**
	 * The '<em><b>Controlled By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLLED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROLLED_BY(39, "controlledBy", "controlledBy"), /**
	 * The '<em><b>Controls</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROLS(40, "controls", "controls"), /**
	 * The '<em><b>Controls Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLS_CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROLS_CHANNEL(41, "controlsChannel", "controlsChannel"), /**
	 * The '<em><b>Controls Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLS_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROLS_SENSOR(42, "controlsSensor", "controlsSensor"), /**
	 * The '<em><b>Controls Thing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLS_THING_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROLS_THING(43, "controlsThing", "controlsThing"), /**
	 * The '<em><b>Copy Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COPY_OF_VALUE
	 * @generated
	 * @ordered
	 */
	COPY_OF(44, "copyOf", "copyOf"), /**
	 * The '<em><b>Creates</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATES_VALUE
	 * @generated
	 * @ordered
	 */
	CREATES(45, "creates", "creates"), /**
	 * The '<em><b>Crudc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRUDC_VALUE
	 * @generated
	 * @ordered
	 */
	CRUDC(46, "crudc", "crudc"), /**
	 * The '<em><b>Crudd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRUDD_VALUE
	 * @generated
	 * @ordered
	 */
	CRUDD(47, "crudd", "crudd"), /**
	 * The '<em><b>Crudr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRUDR_VALUE
	 * @generated
	 * @ordered
	 */
	CRUDR(48, "crudr", "crudr"), /**
	 * The '<em><b>Crudu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRUDU_VALUE
	 * @generated
	 * @ordered
	 */
	CRUDU(49, "crudu", "crudu"), /**
	 * The '<em><b>Data Channel End</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_CHANNEL_END_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_CHANNEL_END(50, "dataChannelEnd", "dataChannelEnd"), /**
	 * The '<em><b>Data Channel For</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_CHANNEL_FOR_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_CHANNEL_FOR(51, "dataChannelFor", "dataChannelFor"), /**
	 * The '<em><b>Data Channel From</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_CHANNEL_FROM_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_CHANNEL_FROM(52, "dataChannelFrom", "dataChannelFrom"), /**
	 * The '<em><b>Data Channel To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_CHANNEL_TO_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_CHANNEL_TO(53, "dataChannelTo", "dataChannelTo"), /**
	 * The '<em><b>Data Path End</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PATH_END_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_PATH_END(54, "dataPathEnd", "dataPathEnd"), /**
	 * The '<em><b>Data Path For</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PATH_FOR_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_PATH_FOR(55, "dataPathFor", "dataPathFor"), /**
	 * The '<em><b>Data Path To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PATH_TO_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_PATH_TO(56, "dataPathTo", "dataPathTo"), /**
	 * The '<em><b>Data Path Visits</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PATH_VISITS_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_PATH_VISITS(57, "dataPathVisits", "dataPathVisits"), /**
	 * The '<em><b>Enables Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLES_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	ENABLES_ACCESS(58, "enablesAccess", "enablesAccess"), /**
	 * The '<em><b>Enables User Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLES_USER_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	ENABLES_USER_ACCESS(59, "enablesUserAccess", "enablesUserAccess"), /**
	 * The '<em><b>Enables User Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLES_USER_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	ENABLES_USER_INPUT(60, "enablesUserInput", "enablesUserInput"), /**
	 * The '<em><b>Enables User Output</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLES_USER_OUTPUT_VALUE
	 * @generated
	 * @ordered
	 */
	ENABLES_USER_OUTPUT(61, "enablesUserOutput", "enablesUserOutput"), /**
	 * The '<em><b>Enables User Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLES_USER_UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	ENABLES_USER_UPDATE(62, "enablesUserUpdate", "enablesUserUpdate"), /**
	 * The '<em><b>End</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_VALUE
	 * @generated
	 * @ordered
	 */
	END(63, "end", "end"), /**
	 * The '<em><b>Extends</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENDS_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENDS(64, "extends", "extends"), /**
	 * The '<em><b>Extends DC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENDS_DC_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENDS_DC(65, "extendsDC", "extendsDC"), /**
	 * The '<em><b>Extends DP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENDS_DP_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENDS_DP(66, "extendsDP", "extendsDP"), /**
	 * The '<em><b>Extends Fwd Flow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENDS_FWD_FLOW_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENDS_FWD_FLOW(67, "extendsFwdFlow", "extendsFwdFlow"), /**
	 * The '<em><b>Extends Rev Flow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENDS_REV_FLOW_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENDS_REV_FLOW(68, "extendsRevFlow", "extendsRevFlow"), /**
	 * The '<em><b>Flows</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWS(69, "flows", "flows"), /**
	 * The '<em><b>Flows From</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_FROM_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWS_FROM(70, "flowsFrom", "flowsFrom"), /**
	 * The '<em><b>Flows From DP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_FROM_DP_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWS_FROM_DP(71, "flowsFromDP", "flowsFromDP"), /**
	 * The '<em><b>Flows From In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_FROM_IN_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWS_FROM_IN(72, "flowsFromIn", "flowsFromIn"), /**
	 * The '<em><b>Flows In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_IN_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWS_IN(73, "flowsIn", "flowsIn"), /**
	 * The '<em><b>Flows Out</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWS_OUT(74, "flowsOut", "flowsOut"), /**
	 * The '<em><b>Flows To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_TO_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWS_TO(75, "flowsTo", "flowsTo"), /**
	 * The '<em><b>Flows To DP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_TO_DP_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWS_TO_DP(76, "flowsToDP", "flowsToDP"), /**
	 * The '<em><b>Flows To In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_TO_IN_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWS_TO_IN(77, "flowsToIn", "flowsToIn"), /**
	 * The '<em><b>Flows Via</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_VIA_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWS_VIA(78, "flowsVia", "flowsVia"), /**
	 * The '<em><b>Flows Via CS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_VIA_CS_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWS_VIA_CS(79, "flowsViaCS", "flowsViaCS"), /**
	 * The '<em><b>Flows Via Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_VIA_CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWS_VIA_CHANNEL(80, "flowsViaChannel", "flowsViaChannel"), /**
	 * The '<em><b>Flows Via Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_VIA_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWS_VIA_PROCESS(81, "flowsViaProcess", "flowsViaProcess"), /**
	 * The '<em><b>Flows Via SC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_VIA_SC_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWS_VIA_SC(82, "flowsViaSC", "flowsViaSC"), /**
	 * The '<em><b>From</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_VALUE
	 * @generated
	 * @ordered
	 */
	FROM(83, "from", "from"), /**
	 * The '<em><b>From Interface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_INTERFACE(84, "fromInterface", "fromInterface"), /**
	 * The '<em><b>From Physical Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_PHYSICAL_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_PHYSICAL_HOST(85, "fromPhysicalHost", "fromPhysicalHost"), /**
	 * The '<em><b>From Physical Interface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_PHYSICAL_INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_PHYSICAL_INTERFACE(86, "fromPhysicalInterface", "fromPhysicalInterface"), /**
	 * The '<em><b>From Proc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_PROC_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_PROC(87, "fromProc", "fromProc"), /**
	 * The '<em><b>From Source</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_SOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_SOURCE(88, "fromSource", "fromSource"), /**
	 * The '<em><b>From Space</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_SPACE_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_SPACE(89, "fromSpace", "fromSpace"), /**
	 * The '<em><b>From Subnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_SUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	FROM_SUBNET(90, "fromSubnet", "fromSubnet"), /**
	 * The '<em><b>Fulfils</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULFILS_VALUE
	 * @generated
	 * @ordered
	 */
	FULFILS(91, "fulfils", "fulfils"), /**
	 * The '<em><b>Fwd Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FWD_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	FWD_PATH(92, "fwdPath", "fwdPath"), /**
	 * The '<em><b>Fwd Relay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FWD_RELAY_VALUE
	 * @generated
	 * @ordered
	 */
	FWD_RELAY(93, "fwdRelay", "fwdRelay"), /**
	 * The '<em><b>Handles</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HANDLES_VALUE
	 * @generated
	 * @ordered
	 */
	HANDLES(94, "handles", "handles"), /**
	 * The '<em><b>Has CLI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_CLI_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_CLI(95, "hasCLI", "hasCLI"), /**
	 * The '<em><b>Has Controller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_CONTROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_CONTROLLER(96, "hasController", "hasController"), /**
	 * The '<em><b>Has Email</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_EMAIL_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_EMAIL(97, "hasEmail", "hasEmail"), /**
	 * The '<em><b>Has Physical Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_PHYSICAL_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_PHYSICAL_HOST(98, "hasPhysicalHost", "hasPhysicalHost"), /**
	 * The '<em><b>Hosts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOSTS_VALUE
	 * @generated
	 * @ordered
	 */
	HOSTS(99, "hosts", "hosts"),

	/**
	 * The '<em><b>Ignores Field</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORES_FIELD_VALUE
	 * @generated
	 * @ordered
	 */
	IGNORES_FIELD(100, "ignoresField", "ignoresField"), /**
	 * The '<em><b>Impersonal Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPERSONAL_DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	IMPERSONAL_DEVICE(101, "impersonalDevice", "impersonalDevice"), /**
	 * The '<em><b>Implements AN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTS_AN_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLEMENTS_AN(102, "implementsAN", "implementsAN"), /**
	 * The '<em><b>Implements CN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTS_CN_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLEMENTS_CN(103, "implementsCN", "implementsCN"), /**
	 * The '<em><b>Implements HS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTS_HS_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLEMENTS_HS(104, "implementsHS", "implementsHS"), /**
	 * The '<em><b>Includes Field</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUDES_FIELD_VALUE
	 * @generated
	 * @ordered
	 */
	INCLUDES_FIELD(105, "includesField", "includesField"), /**
	 * The '<em><b>Indirect Auth Z</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDIRECT_AUTH_Z_VALUE
	 * @generated
	 * @ordered
	 */
	INDIRECT_AUTH_Z(106, "indirectAuthZ", "indirectAuthZ"), /**
	 * The '<em><b>Inputs Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUTS_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	INPUTS_DATA(107, "inputsData", "inputsData"), /**
	 * The '<em><b>Interacts Remotely With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERACTS_REMOTELY_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	INTERACTS_REMOTELY_WITH(108, "interactsRemotelyWith", "interactsRemotelyWith"), /**
	 * The '<em><b>Interacts With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERACTS_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	INTERACTS_WITH(109, "interactsWith", "interactsWith"),

	/**
	 * The '<em><b>Interacts With Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERACTS_WITH_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	INTERACTS_WITH_DATA(110, "interactsWithData", "interactsWithData"), /**
	 * The '<em><b>Is Abstract Subnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_ABSTRACT_SUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	IS_ABSTRACT_SUBNET(111, "isAbstractSubnet", "isAbstractSubnet"), /**
	 * The '<em><b>Is Adult</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_ADULT_VALUE
	 * @generated
	 * @ordered
	 */
	IS_ADULT(112, "isAdult", "isAdult"), /**
	 * The '<em><b>Is Cluster</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_CLUSTER_VALUE
	 * @generated
	 * @ordered
	 */
	IS_CLUSTER(113, "isCluster", "isCluster"), /**
	 * The '<em><b>Is Container</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_CONTAINER_VALUE
	 * @generated
	 * @ordered
	 */
	IS_CONTAINER(114, "isContainer", "isContainer"), /**
	 * The '<em><b>Is Dest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_DEST_VALUE
	 * @generated
	 * @ordered
	 */
	IS_DEST(115, "isDest", "isDest"), /**
	 * The '<em><b>Is Host LAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_HOST_LAN_VALUE
	 * @generated
	 * @ordered
	 */
	IS_HOST_LAN(116, "isHostLAN", "isHostLAN"), /**
	 * The '<em><b>Is Hotspot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_HOTSPOT_VALUE
	 * @generated
	 * @ordered
	 */
	IS_HOTSPOT(117, "isHotspot", "isHotspot"), /**
	 * The '<em><b>Is Internet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_INTERNET_VALUE
	 * @generated
	 * @ordered
	 */
	IS_INTERNET(118, "isInternet", "isInternet"), /**
	 * The '<em><b>Is Ln S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_LN_S_VALUE
	 * @generated
	 * @ordered
	 */
	IS_LN_S(119, "isLnS", "isLnS"), /**
	 * The '<em><b>Is Local Subnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_LOCAL_SUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	IS_LOCAL_SUBNET(120, "isLocalSubnet", "isLocalSubnet"), /**
	 * The '<em><b>Is MHC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_MHC_VALUE
	 * @generated
	 * @ordered
	 */
	IS_MHC(121, "isMHC", "isMHC"), /**
	 * The '<em><b>Is Mobile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_MOBILE_VALUE
	 * @generated
	 * @ordered
	 */
	IS_MOBILE(122, "isMobile", "isMobile"), /**
	 * The '<em><b>Is Nowhere</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_NOWHERE_VALUE
	 * @generated
	 * @ordered
	 */
	IS_NOWHERE(123, "isNowhere", "isNowhere"), /**
	 * The '<em><b>Is Personal Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_PERSONAL_DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	IS_PERSONAL_DEVICE(124, "isPersonalDevice", "isPersonalDevice"), /**
	 * The '<em><b>Is Pod</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_POD_VALUE
	 * @generated
	 * @ordered
	 */
	IS_POD(125, "isPod", "isPod"), /**
	 * The '<em><b>Is Pool</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_POOL_VALUE
	 * @generated
	 * @ordered
	 */
	IS_POOL(126, "isPool", "isPool"), /**
	 * The '<em><b>Is Proxy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_PROXY_VALUE
	 * @generated
	 * @ordered
	 */
	IS_PROXY(127, "isProxy", "isProxy"), /**
	 * The '<em><b>Is Router</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_ROUTER_VALUE
	 * @generated
	 * @ordered
	 */
	IS_ROUTER(128, "isRouter", "isRouter"), /**
	 * The '<em><b>Is Scalable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_SCALABLE_VALUE
	 * @generated
	 * @ordered
	 */
	IS_SCALABLE(129, "isScalable", "isScalable"), /**
	 * The '<em><b>Is Source</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_SOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	IS_SOURCE(130, "isSource", "isSource"), /**
	 * The '<em><b>Is Spam</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_SPAM_VALUE
	 * @generated
	 * @ordered
	 */
	IS_SPAM(131, "isSpam", "isSpam"), /**
	 * The '<em><b>Is Trivial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_TRIVIAL_VALUE
	 * @generated
	 * @ordered
	 */
	IS_TRIVIAL(132, "isTrivial", "isTrivial"), /**
	 * The '<em><b>Is World</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_WORLD_VALUE
	 * @generated
	 * @ordered
	 */
	IS_WORLD(133, "isWorld", "isWorld"), /**
	 * The '<em><b>Last Interface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	LAST_INTERFACE(134, "lastInterface", "lastInterface"), /**
	 * The '<em><b>Located In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCATED_IN_VALUE
	 * @generated
	 * @ordered
	 */
	LOCATED_IN(135, "locatedIn", "locatedIn"),

	/**
	 * The '<em><b>Managed By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	MANAGED_BY(136, "managedBy", "managedBy"),

	/**
	 * The '<em><b>Manages</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGES_VALUE
	 * @generated
	 * @ordered
	 */
	MANAGES(137, "manages", "manages"),

	/**
	 * The '<em><b>May Be In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAY_BE_IN_VALUE
	 * @generated
	 * @ordered
	 */
	MAY_BE_IN(138, "mayBeIn", "mayBeIn"), /**
	 * The '<em><b>Needs Field</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEEDS_FIELD_VALUE
	 * @generated
	 * @ordered
	 */
	NEEDS_FIELD(139, "needsField", "needsField"), /**
	 * The '<em><b>No Auth N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_AUTH_N_VALUE
	 * @generated
	 * @ordered
	 */
	NO_AUTH_N(140, "noAuthN", "noAuthN"), /**
	 * The '<em><b>No DU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_DU_VALUE
	 * @generated
	 * @ordered
	 */
	NO_DU(141, "noDU", "noDU"), /**
	 * The '<em><b>No DX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_DX_VALUE
	 * @generated
	 * @ordered
	 */
	NO_DX(142, "noDX", "noDX"), /**
	 * The '<em><b>Operates</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATES_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATES(143, "operates", "operates"),

	/**
	 * The '<em><b>Overlays</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERLAYS_VALUE
	 * @generated
	 * @ordered
	 */
	OVERLAYS(144, "overlays", "overlays"), /**
	 * The '<em><b>PEnds At</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENDS_AT_VALUE
	 * @generated
	 * @ordered
	 */
	PENDS_AT(145, "pEndsAt", "pEndsAt"), /**
	 * The '<em><b>PVia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PVIA_VALUE
	 * @generated
	 * @ordered
	 */
	PVIA(146, "pVia", "pVia"), /**
	 * The '<em><b>Pairs Via Bluetooth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAIRS_VIA_BLUETOOTH_VALUE
	 * @generated
	 * @ordered
	 */
	PAIRS_VIA_BLUETOOTH(147, "pairsViaBluetooth", "pairsViaBluetooth"), /**
	 * The '<em><b>Pairs Via USB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAIRS_VIA_USB_VALUE
	 * @generated
	 * @ordered
	 */
	PAIRS_VIA_USB(148, "pairsViaUSB", "pairsViaUSB"), /**
	 * The '<em><b>Path To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATH_TO_VALUE
	 * @generated
	 * @ordered
	 */
	PATH_TO(149, "pathTo", "pathTo"), /**
	 * The '<em><b>Polls Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLLS_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	POLLS_SENSOR(150, "pollsSensor", "pollsSensor"),

	/**
	 * The '<em><b>Poss Data Dest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSS_DATA_DEST_VALUE
	 * @generated
	 * @ordered
	 */
	POSS_DATA_DEST(151, "possDataDest", "possDataDest"), /**
	 * The '<em><b>Poss Rev Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSS_REV_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	POSS_REV_PATH(152, "possRevPath", "possRevPath"), /**
	 * The '<em><b>Processes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSES_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESSES(153, "processes", "processes"), /**
	 * The '<em><b>Propagates To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPAGATES_TO_VALUE
	 * @generated
	 * @ordered
	 */
	PROPAGATES_TO(154, "propagatesTo", "propagatesTo"), /**
	 * The '<em><b>Provided By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVIDED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	PROVIDED_BY(155, "providedBy", "providedBy"),

	/**
	 * The '<em><b>Provisioned By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVISIONED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	PROVISIONED_BY(156, "provisionedBy", "provisionedBy"), /**
	 * The '<em><b>Proxy Auth N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROXY_AUTH_N_VALUE
	 * @generated
	 * @ordered
	 */
	PROXY_AUTH_N(157, "proxyAuthN", "proxyAuthN"), /**
	 * The '<em><b>Reads</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READS_VALUE
	 * @generated
	 * @ordered
	 */
	READS(158, "reads", "reads"),

	/**
	 * The '<em><b>Reads Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READS_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	READS_SENSOR(159, "readsSensor", "readsSensor"), /**
	 * The '<em><b>Receives</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVES_VALUE
	 * @generated
	 * @ordered
	 */
	RECEIVES(160, "receives", "receives"),

	/**
	 * The '<em><b>Receives From Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVES_FROM_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	RECEIVES_FROM_SENSOR(161, "receivesFromSensor", "receivesFromSensor"), /**
	 * The '<em><b>Relates To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATES_TO_VALUE
	 * @generated
	 * @ordered
	 */
	RELATES_TO(162, "relatesTo", "relatesTo"),

	/**
	 * The '<em><b>Relays</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELAYS_VALUE
	 * @generated
	 * @ordered
	 */
	RELAYS(163, "relays", "relays"), /**
	 * The '<em><b>Relays Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELAYS_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	RELAYS_ACCESS(164, "relaysAccess", "relaysAccess"), /**
	 * The '<em><b>Responsible For</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSIBLE_FOR_VALUE
	 * @generated
	 * @ordered
	 */
	RESPONSIBLE_FOR(165, "responsibleFor", "responsibleFor"), /**
	 * The '<em><b>Rev Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REV_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	REV_PATH(166, "revPath", "revPath"), /**
	 * The '<em><b>Rev Relay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REV_RELAY_VALUE
	 * @generated
	 * @ordered
	 */
	REV_RELAY(167, "revRelay", "revRelay"), /**
	 * The '<em><b>Runs In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNS_IN_VALUE
	 * @generated
	 * @ordered
	 */
	RUNS_IN(168, "runsIn", "runsIn"), /**
	 * The '<em><b>Senses</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSES_VALUE
	 * @generated
	 * @ordered
	 */
	SENSES(169, "senses", "senses"), /**
	 * The '<em><b>Serves</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVES_VALUE
	 * @generated
	 * @ordered
	 */
	SERVES(170, "serves", "serves"),

	/**
	 * The '<em><b>Shares Credentials</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARES_CREDENTIALS_VALUE
	 * @generated
	 * @ordered
	 */
	SHARES_CREDENTIALS(171, "sharesCredentials", "sharesCredentials"), /**
	 * The '<em><b>Source Direct</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE_DIRECT_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE_DIRECT(172, "sourceDirect", "sourceDirect"), /**
	 * The '<em><b>Source Via NAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE_VIA_NAT_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE_VIA_NAT(173, "sourceViaNAT", "sourceViaNAT"), /**
	 * The '<em><b>Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_VALUE
	 * @generated
	 * @ordered
	 */
	START(174, "start", "start"), /**
	 * The '<em><b>Stores</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORES_VALUE
	 * @generated
	 * @ordered
	 */
	STORES(175, "stores", "stores"),

	/**
	 * The '<em><b>Stores Copy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORES_COPY_VALUE
	 * @generated
	 * @ordered
	 */
	STORES_COPY(176, "storesCopy", "storesCopy"), /**
	 * The '<em><b>Subject To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBJECT_TO_VALUE
	 * @generated
	 * @ordered
	 */
	SUBJECT_TO(177, "subjectTo", "subjectTo"), /**
	 * The '<em><b>To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_VALUE
	 * @generated
	 * @ordered
	 */
	TO(178, "to", "to"), /**
	 * The '<em><b>To Interface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	TO_INTERFACE(179, "toInterface", "toInterface"), /**
	 * The '<em><b>To Physical Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_PHYSICAL_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	TO_PHYSICAL_HOST(180, "toPhysicalHost", "toPhysicalHost"), /**
	 * The '<em><b>To Physical Interface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_PHYSICAL_INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	TO_PHYSICAL_INTERFACE(181, "toPhysicalInterface", "toPhysicalInterface"), /**
	 * The '<em><b>To Proc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_PROC_VALUE
	 * @generated
	 * @ordered
	 */
	TO_PROC(182, "toProc", "toProc"), /**
	 * The '<em><b>To Space</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_SPACE_VALUE
	 * @generated
	 * @ordered
	 */
	TO_SPACE(183, "toSpace", "toSpace"), /**
	 * The '<em><b>Traverses</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVERSES_VALUE
	 * @generated
	 * @ordered
	 */
	TRAVERSES(184, "traverses", "traverses"), /**
	 * The '<em><b>Updates</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATES_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATES(185, "updates", "updates"), /**
	 * The '<em><b>Updates Controller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATES_CONTROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATES_CONTROLLER(186, "updatesController", "updatesController"), /**
	 * The '<em><b>Updates Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATES_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATES_SENSOR(187, "updatesSensor", "updatesSensor"), /**
	 * The '<em><b>Used By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	USED_BY(188, "usedBy", "usedBy"), /**
	 * The '<em><b>Used For</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USED_FOR_VALUE
	 * @generated
	 * @ordered
	 */
	USED_FOR(189, "usedFor", "usedFor"), /**
	 * The '<em><b>Uses</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_VALUE
	 * @generated
	 * @ordered
	 */
	USES(190, "uses", "uses"), /**
	 * The '<em><b>Uses As Proxy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_AS_PROXY_VALUE
	 * @generated
	 * @ordered
	 */
	USES_AS_PROXY(191, "usesAsProxy", "usesAsProxy"), /**
	 * The '<em><b>Uses Data Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_DATA_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	USES_DATA_PATH(192, "usesDataPath", "usesDataPath"), /**
	 * The '<em><b>Uses For Auth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_FOR_AUTH_VALUE
	 * @generated
	 * @ordered
	 */
	USES_FOR_AUTH(193, "usesForAuth", "usesForAuth"), /**
	 * The '<em><b>Uses For Auth Z</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_FOR_AUTH_Z_VALUE
	 * @generated
	 * @ordered
	 */
	USES_FOR_AUTH_Z(194, "usesForAuthZ", "usesForAuthZ"), /**
	 * The '<em><b>Uses Indirectly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_INDIRECTLY_VALUE
	 * @generated
	 * @ordered
	 */
	USES_INDIRECTLY(195, "usesIndirectly", "usesIndirectly"), /**
	 * The '<em><b>Uses Logical Route</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_LOGICAL_ROUTE_VALUE
	 * @generated
	 * @ordered
	 */
	USES_LOGICAL_ROUTE(196, "usesLogicalRoute", "usesLogicalRoute"), /**
	 * The '<em><b>Uses Physical Route</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_PHYSICAL_ROUTE_VALUE
	 * @generated
	 * @ordered
	 */
	USES_PHYSICAL_ROUTE(197, "usesPhysicalRoute", "usesPhysicalRoute"), /**
	 * The '<em><b>Uses Physical Subnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_PHYSICAL_SUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	USES_PHYSICAL_SUBNET(198, "usesPhysicalSubnet", "usesPhysicalSubnet"), /**
	 * The '<em><b>Uses Remotely</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_REMOTELY_VALUE
	 * @generated
	 * @ordered
	 */
	USES_REMOTELY(199, "usesRemotely", "usesRemotely"), /**
	 * The '<em><b>Uses Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	USES_SERVICE(200, "usesService", "usesService"), /**
	 * The '<em><b>Uses Via Deputy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_VIA_DEPUTY_VALUE
	 * @generated
	 * @ordered
	 */
	USES_VIA_DEPUTY(201, "usesViaDeputy", "usesViaDeputy"), /**
	 * The '<em><b>Uses Via Proxy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_VIA_PROXY_VALUE
	 * @generated
	 * @ordered
	 */
	USES_VIA_PROXY(202, "usesViaProxy", "usesViaProxy"), /**
	 * The '<em><b>Uses Via RAS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_VIA_RAS_VALUE
	 * @generated
	 * @ordered
	 */
	USES_VIA_RAS(203, "usesViaRAS", "usesViaRAS"), /**
	 * The '<em><b>Validates Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALIDATES_CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	VALIDATES_CHANNEL(204, "validatesChannel", "validatesChannel"), /**
	 * The '<em><b>Via</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIA_VALUE
	 * @generated
	 * @ordered
	 */
	VIA(205, "via", "via"), /**
	 * The '<em><b>Via Host Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIA_HOST_CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	VIA_HOST_CHANNEL(206, "viaHostChannel", "viaHostChannel"), /**
	 * The '<em><b>Via Interface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIA_INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	VIA_INTERFACE(207, "viaInterface", "viaInterface"), /**
	 * The '<em><b>Via Physical Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIA_PHYSICAL_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	VIA_PHYSICAL_PATH(208, "viaPhysicalPath", "viaPhysicalPath"), /**
	 * The '<em><b>Via Physical Subnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIA_PHYSICAL_SUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	VIA_PHYSICAL_SUBNET(209, "viaPhysicalSubnet", "viaPhysicalSubnet"), /**
	 * The '<em><b>Via Proxy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIA_PROXY_VALUE
	 * @generated
	 * @ordered
	 */
	VIA_PROXY(210, "viaProxy", "viaProxy"), /**
	 * The '<em><b>Via Shared Credentials</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIA_SHARED_CREDENTIALS_VALUE
	 * @generated
	 * @ordered
	 */
	VIA_SHARED_CREDENTIALS(211, "viaSharedCredentials", "viaSharedCredentials"), /**
	 * The '<em><b>Via Subnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIA_SUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	VIA_SUBNET(212, "viaSubnet", "viaSubnet"), /**
	 * The '<em><b>Via Virtual Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIA_VIRTUAL_CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	VIA_VIRTUAL_CHANNEL(213, "viaVirtualChannel", "viaVirtualChannel"), /**
	 * The '<em><b>Views Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIEWS_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	VIEWS_DATA(214, "viewsData", "viewsData"), /**
	 * The '<em><b>Visits</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISITS_VALUE
	 * @generated
	 * @ordered
	 */
	VISITS(215, "visits", "visits"), /**
	 * The '<em><b>Visits Gateway</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISITS_GATEWAY_VALUE
	 * @generated
	 * @ordered
	 */
	VISITS_GATEWAY(216, "visitsGateway", "visitsGateway"), /**
	 * The '<em><b>Works For</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKS_FOR_VALUE
	 * @generated
	 * @ordered
	 */
	WORKS_FOR(217, "worksFor", "worksFor");

	/**
	 * The '<em><b>Above</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABOVE
	 * @model name="above"
	 * @generated
	 * @ordered
	 */
	public static final int ABOVE_VALUE = 0;

	/**
	 * The '<em><b>Access From</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_FROM
	 * @model name="accessFrom"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_FROM_VALUE = 1;

	/**
	 * The '<em><b>Access From Client</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_FROM_CLIENT
	 * @model name="accessFromClient"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_FROM_CLIENT_VALUE = 2;

	/**
	 * The '<em><b>Access Interrupted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_INTERRUPTED
	 * @model name="accessInterrupted"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_INTERRUPTED_VALUE = 3;

	/**
	 * The '<em><b>Access To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_TO
	 * @model name="accessTo"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_TO_VALUE = 4;

	/**
	 * The '<em><b>Access To Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_TO_SERVICE
	 * @model name="accessToService"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_TO_SERVICE_VALUE = 5;

	/**
	 * The '<em><b>Access Uninterrupted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_UNINTERRUPTED
	 * @model name="accessUninterrupted"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_UNINTERRUPTED_VALUE = 6;

	/**
	 * The '<em><b>Access Via</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_VIA
	 * @model name="accessVia"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_VIA_VALUE = 7;

	/**
	 * The '<em><b>Accesses Field</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESSES_FIELD
	 * @model name="accessesField"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESSES_FIELD_VALUE = 8;

	/**
	 * The '<em><b>Accesses Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESSES_SERVICE
	 * @model name="accessesService"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESSES_SERVICE_VALUE = 9;

	/**
	 * The '<em><b>Accessible From</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESSIBLE_FROM
	 * @model name="accessibleFrom"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESSIBLE_FROM_VALUE = 10;

	/**
	 * The '<em><b>Accessible Via</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESSIBLE_VIA
	 * @model name="accessibleVia"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESSIBLE_VIA_VALUE = 11;

	/**
	 * The '<em><b>Amends</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMENDS
	 * @model name="amends"
	 * @generated
	 * @ordered
	 */
	public static final int AMENDS_VALUE = 12;

	/**
	 * The '<em><b>Amends Controller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMENDS_CONTROLLER
	 * @model name="amendsController"
	 * @generated
	 * @ordered
	 */
	public static final int AMENDS_CONTROLLER_VALUE = 13;

	/**
	 * The '<em><b>Amends Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMENDS_DATA
	 * @model name="amendsData"
	 * @generated
	 * @ordered
	 */
	public static final int AMENDS_DATA_VALUE = 14;

	/**
	 * The '<em><b>Amends Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMENDS_SENSOR
	 * @model name="amendsSensor"
	 * @generated
	 * @ordered
	 */
	public static final int AMENDS_SENSOR_VALUE = 15;

	/**
	 * The '<em><b>Appends</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPENDS
	 * @model name="appends"
	 * @generated
	 * @ordered
	 */
	public static final int APPENDS_VALUE = 16;

	/**
	 * The '<em><b>Asserted Amends Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSERTED_AMENDS_DATA
	 * @model name="assertedAmendsData"
	 * @generated
	 * @ordered
	 */
	public static final int ASSERTED_AMENDS_DATA_VALUE = 17;

	/**
	 * The '<em><b>Asserted Inputs Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSERTED_INPUTS_DATA
	 * @model name="assertedInputsData"
	 * @generated
	 * @ordered
	 */
	public static final int ASSERTED_INPUTS_DATA_VALUE = 18;

	/**
	 * The '<em><b>Asserted Views Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSERTED_VIEWS_DATA
	 * @model name="assertedViewsData"
	 * @generated
	 * @ordered
	 */
	public static final int ASSERTED_VIEWS_DATA_VALUE = 19;

	/**
	 * The '<em><b>At Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_HOST
	 * @model name="atHost"
	 * @generated
	 * @ordered
	 */
	public static final int AT_HOST_VALUE = 20;

	/**
	 * The '<em><b>Attack Path From</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACK_PATH_FROM
	 * @model name="attackPathFrom"
	 * @generated
	 * @ordered
	 */
	public static final int ATTACK_PATH_FROM_VALUE = 21;

	/**
	 * The '<em><b>Attack Path Via</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACK_PATH_VIA
	 * @model name="attackPathVia"
	 * @generated
	 * @ordered
	 */
	public static final int ATTACK_PATH_VIA_VALUE = 22;

	/**
	 * The '<em><b>Blocked Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCKED_PATH
	 * @model name="blockedPath"
	 * @generated
	 * @ordered
	 */
	public static final int BLOCKED_PATH_VALUE = 23;

	/**
	 * The '<em><b>Blocked Segment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCKED_SEGMENT
	 * @model name="blockedSegment"
	 * @generated
	 * @ordered
	 */
	public static final int BLOCKED_SEGMENT_VALUE = 24;

	/**
	 * The '<em><b>Can Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAN_ACCESS
	 * @model name="canAccess"
	 * @generated
	 * @ordered
	 */
	public static final int CAN_ACCESS_VALUE = 25;

	/**
	 * The '<em><b>Can Get Keys</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAN_GET_KEYS
	 * @model name="canGetKeys"
	 * @generated
	 * @ordered
	 */
	public static final int CAN_GET_KEYS_VALUE = 26;

	/**
	 * The '<em><b>Can Read</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAN_READ
	 * @model name="canRead"
	 * @generated
	 * @ordered
	 */
	public static final int CAN_READ_VALUE = 27;

	/**
	 * The '<em><b>Can Write</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAN_WRITE
	 * @model name="canWrite"
	 * @generated
	 * @ordered
	 */
	public static final int CAN_WRITE_VALUE = 28;

	/**
	 * The '<em><b>Channel From</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANNEL_FROM
	 * @model name="channelFrom"
	 * @generated
	 * @ordered
	 */
	public static final int CHANNEL_FROM_VALUE = 29;

	/**
	 * The '<em><b>Channel To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANNEL_TO
	 * @model name="channelTo"
	 * @generated
	 * @ordered
	 */
	public static final int CHANNEL_TO_VALUE = 30;

	/**
	 * The '<em><b>Channel Tried</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANNEL_TRIED
	 * @model name="channelTried"
	 * @generated
	 * @ordered
	 */
	public static final int CHANNEL_TRIED_VALUE = 31;

	/**
	 * The '<em><b>Channel Via</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANNEL_VIA
	 * @model name="channelVia"
	 * @generated
	 * @ordered
	 */
	public static final int CHANNEL_VIA_VALUE = 32;

	/**
	 * The '<em><b>Connected To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTED_TO
	 * @model name="connectedTo"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTED_TO_VALUE = 33;

	/**
	 * The '<em><b>Connects Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTS_DATA
	 * @model name="connectsData"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTS_DATA_VALUE = 34;

	/**
	 * The '<em><b>Connects From</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTS_FROM
	 * @model name="connectsFrom"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTS_FROM_VALUE = 35;

	/**
	 * The '<em><b>Connects To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTS_TO
	 * @model name="connectsTo"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTS_TO_VALUE = 36;

	/**
	 * The '<em><b>Contains</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS
	 * @model name="contains"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINS_VALUE = 37;

	/**
	 * The '<em><b>Contains Field</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS_FIELD
	 * @model name="containsField"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINS_FIELD_VALUE = 38;

	/**
	 * The '<em><b>Controlled By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLLED_BY
	 * @model name="controlledBy"
	 * @generated
	 * @ordered
	 */
	public static final int CONTROLLED_BY_VALUE = 39;

	/**
	 * The '<em><b>Controls</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLS
	 * @model name="controls"
	 * @generated
	 * @ordered
	 */
	public static final int CONTROLS_VALUE = 40;

	/**
	 * The '<em><b>Controls Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLS_CHANNEL
	 * @model name="controlsChannel"
	 * @generated
	 * @ordered
	 */
	public static final int CONTROLS_CHANNEL_VALUE = 41;

	/**
	 * The '<em><b>Controls Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLS_SENSOR
	 * @model name="controlsSensor"
	 * @generated
	 * @ordered
	 */
	public static final int CONTROLS_SENSOR_VALUE = 42;

	/**
	 * The '<em><b>Controls Thing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLS_THING
	 * @model name="controlsThing"
	 * @generated
	 * @ordered
	 */
	public static final int CONTROLS_THING_VALUE = 43;

	/**
	 * The '<em><b>Copy Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COPY_OF
	 * @model name="copyOf"
	 * @generated
	 * @ordered
	 */
	public static final int COPY_OF_VALUE = 44;

	/**
	 * The '<em><b>Creates</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATES
	 * @model name="creates"
	 * @generated
	 * @ordered
	 */
	public static final int CREATES_VALUE = 45;

	/**
	 * The '<em><b>Crudc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRUDC
	 * @model name="crudc"
	 * @generated
	 * @ordered
	 */
	public static final int CRUDC_VALUE = 46;

	/**
	 * The '<em><b>Crudd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRUDD
	 * @model name="crudd"
	 * @generated
	 * @ordered
	 */
	public static final int CRUDD_VALUE = 47;

	/**
	 * The '<em><b>Crudr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRUDR
	 * @model name="crudr"
	 * @generated
	 * @ordered
	 */
	public static final int CRUDR_VALUE = 48;

	/**
	 * The '<em><b>Crudu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRUDU
	 * @model name="crudu"
	 * @generated
	 * @ordered
	 */
	public static final int CRUDU_VALUE = 49;

	/**
	 * The '<em><b>Data Channel End</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_CHANNEL_END
	 * @model name="dataChannelEnd"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_CHANNEL_END_VALUE = 50;

	/**
	 * The '<em><b>Data Channel For</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_CHANNEL_FOR
	 * @model name="dataChannelFor"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_CHANNEL_FOR_VALUE = 51;

	/**
	 * The '<em><b>Data Channel From</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_CHANNEL_FROM
	 * @model name="dataChannelFrom"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_CHANNEL_FROM_VALUE = 52;

	/**
	 * The '<em><b>Data Channel To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_CHANNEL_TO
	 * @model name="dataChannelTo"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_CHANNEL_TO_VALUE = 53;

	/**
	 * The '<em><b>Data Path End</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PATH_END
	 * @model name="dataPathEnd"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_PATH_END_VALUE = 54;

	/**
	 * The '<em><b>Data Path For</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PATH_FOR
	 * @model name="dataPathFor"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_PATH_FOR_VALUE = 55;

	/**
	 * The '<em><b>Data Path To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PATH_TO
	 * @model name="dataPathTo"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_PATH_TO_VALUE = 56;

	/**
	 * The '<em><b>Data Path Visits</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PATH_VISITS
	 * @model name="dataPathVisits"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_PATH_VISITS_VALUE = 57;

	/**
	 * The '<em><b>Enables Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLES_ACCESS
	 * @model name="enablesAccess"
	 * @generated
	 * @ordered
	 */
	public static final int ENABLES_ACCESS_VALUE = 58;

	/**
	 * The '<em><b>Enables User Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLES_USER_ACCESS
	 * @model name="enablesUserAccess"
	 * @generated
	 * @ordered
	 */
	public static final int ENABLES_USER_ACCESS_VALUE = 59;

	/**
	 * The '<em><b>Enables User Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLES_USER_INPUT
	 * @model name="enablesUserInput"
	 * @generated
	 * @ordered
	 */
	public static final int ENABLES_USER_INPUT_VALUE = 60;

	/**
	 * The '<em><b>Enables User Output</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLES_USER_OUTPUT
	 * @model name="enablesUserOutput"
	 * @generated
	 * @ordered
	 */
	public static final int ENABLES_USER_OUTPUT_VALUE = 61;

	/**
	 * The '<em><b>Enables User Update</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLES_USER_UPDATE
	 * @model name="enablesUserUpdate"
	 * @generated
	 * @ordered
	 */
	public static final int ENABLES_USER_UPDATE_VALUE = 62;

	/**
	 * The '<em><b>End</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END
	 * @model name="end"
	 * @generated
	 * @ordered
	 */
	public static final int END_VALUE = 63;

	/**
	 * The '<em><b>Extends</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENDS
	 * @model name="extends"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENDS_VALUE = 64;

	/**
	 * The '<em><b>Extends DC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENDS_DC
	 * @model name="extendsDC"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENDS_DC_VALUE = 65;

	/**
	 * The '<em><b>Extends DP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENDS_DP
	 * @model name="extendsDP"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENDS_DP_VALUE = 66;

	/**
	 * The '<em><b>Extends Fwd Flow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENDS_FWD_FLOW
	 * @model name="extendsFwdFlow"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENDS_FWD_FLOW_VALUE = 67;

	/**
	 * The '<em><b>Extends Rev Flow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENDS_REV_FLOW
	 * @model name="extendsRevFlow"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENDS_REV_FLOW_VALUE = 68;

	/**
	 * The '<em><b>Flows</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS
	 * @model name="flows"
	 * @generated
	 * @ordered
	 */
	public static final int FLOWS_VALUE = 69;

	/**
	 * The '<em><b>Flows From</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_FROM
	 * @model name="flowsFrom"
	 * @generated
	 * @ordered
	 */
	public static final int FLOWS_FROM_VALUE = 70;

	/**
	 * The '<em><b>Flows From DP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_FROM_DP
	 * @model name="flowsFromDP"
	 * @generated
	 * @ordered
	 */
	public static final int FLOWS_FROM_DP_VALUE = 71;

	/**
	 * The '<em><b>Flows From In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_FROM_IN
	 * @model name="flowsFromIn"
	 * @generated
	 * @ordered
	 */
	public static final int FLOWS_FROM_IN_VALUE = 72;

	/**
	 * The '<em><b>Flows In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_IN
	 * @model name="flowsIn"
	 * @generated
	 * @ordered
	 */
	public static final int FLOWS_IN_VALUE = 73;

	/**
	 * The '<em><b>Flows Out</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_OUT
	 * @model name="flowsOut"
	 * @generated
	 * @ordered
	 */
	public static final int FLOWS_OUT_VALUE = 74;

	/**
	 * The '<em><b>Flows To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_TO
	 * @model name="flowsTo"
	 * @generated
	 * @ordered
	 */
	public static final int FLOWS_TO_VALUE = 75;

	/**
	 * The '<em><b>Flows To DP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_TO_DP
	 * @model name="flowsToDP"
	 * @generated
	 * @ordered
	 */
	public static final int FLOWS_TO_DP_VALUE = 76;

	/**
	 * The '<em><b>Flows To In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_TO_IN
	 * @model name="flowsToIn"
	 * @generated
	 * @ordered
	 */
	public static final int FLOWS_TO_IN_VALUE = 77;

	/**
	 * The '<em><b>Flows Via</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_VIA
	 * @model name="flowsVia"
	 * @generated
	 * @ordered
	 */
	public static final int FLOWS_VIA_VALUE = 78;

	/**
	 * The '<em><b>Flows Via CS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_VIA_CS
	 * @model name="flowsViaCS"
	 * @generated
	 * @ordered
	 */
	public static final int FLOWS_VIA_CS_VALUE = 79;

	/**
	 * The '<em><b>Flows Via Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_VIA_CHANNEL
	 * @model name="flowsViaChannel"
	 * @generated
	 * @ordered
	 */
	public static final int FLOWS_VIA_CHANNEL_VALUE = 80;

	/**
	 * The '<em><b>Flows Via Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_VIA_PROCESS
	 * @model name="flowsViaProcess"
	 * @generated
	 * @ordered
	 */
	public static final int FLOWS_VIA_PROCESS_VALUE = 81;

	/**
	 * The '<em><b>Flows Via SC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWS_VIA_SC
	 * @model name="flowsViaSC"
	 * @generated
	 * @ordered
	 */
	public static final int FLOWS_VIA_SC_VALUE = 82;

	/**
	 * The '<em><b>From</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM
	 * @model name="from"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_VALUE = 83;

	/**
	 * The '<em><b>From Interface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_INTERFACE
	 * @model name="fromInterface"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_INTERFACE_VALUE = 84;

	/**
	 * The '<em><b>From Physical Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_PHYSICAL_HOST
	 * @model name="fromPhysicalHost"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_PHYSICAL_HOST_VALUE = 85;

	/**
	 * The '<em><b>From Physical Interface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_PHYSICAL_INTERFACE
	 * @model name="fromPhysicalInterface"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_PHYSICAL_INTERFACE_VALUE = 86;

	/**
	 * The '<em><b>From Proc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_PROC
	 * @model name="fromProc"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_PROC_VALUE = 87;

	/**
	 * The '<em><b>From Source</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_SOURCE
	 * @model name="fromSource"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_SOURCE_VALUE = 88;

	/**
	 * The '<em><b>From Space</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_SPACE
	 * @model name="fromSpace"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_SPACE_VALUE = 89;

	/**
	 * The '<em><b>From Subnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROM_SUBNET
	 * @model name="fromSubnet"
	 * @generated
	 * @ordered
	 */
	public static final int FROM_SUBNET_VALUE = 90;

	/**
	 * The '<em><b>Fulfils</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULFILS
	 * @model name="fulfils"
	 * @generated
	 * @ordered
	 */
	public static final int FULFILS_VALUE = 91;

	/**
	 * The '<em><b>Fwd Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FWD_PATH
	 * @model name="fwdPath"
	 * @generated
	 * @ordered
	 */
	public static final int FWD_PATH_VALUE = 92;

	/**
	 * The '<em><b>Fwd Relay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FWD_RELAY
	 * @model name="fwdRelay"
	 * @generated
	 * @ordered
	 */
	public static final int FWD_RELAY_VALUE = 93;

	/**
	 * The '<em><b>Handles</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HANDLES
	 * @model name="handles"
	 * @generated
	 * @ordered
	 */
	public static final int HANDLES_VALUE = 94;

	/**
	 * The '<em><b>Has CLI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_CLI
	 * @model name="hasCLI"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_CLI_VALUE = 95;

	/**
	 * The '<em><b>Has Controller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_CONTROLLER
	 * @model name="hasController"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_CONTROLLER_VALUE = 96;

	/**
	 * The '<em><b>Has Email</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_EMAIL
	 * @model name="hasEmail"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_EMAIL_VALUE = 97;

	/**
	 * The '<em><b>Has Physical Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_PHYSICAL_HOST
	 * @model name="hasPhysicalHost"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_PHYSICAL_HOST_VALUE = 98;

	/**
	 * The '<em><b>Hosts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOSTS
	 * @model name="hosts"
	 * @generated
	 * @ordered
	 */
	public static final int HOSTS_VALUE = 99;

	/**
	 * The '<em><b>Ignores Field</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORES_FIELD
	 * @model name="ignoresField"
	 * @generated
	 * @ordered
	 */
	public static final int IGNORES_FIELD_VALUE = 100;

	/**
	 * The '<em><b>Impersonal Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPERSONAL_DEVICE
	 * @model name="impersonalDevice"
	 * @generated
	 * @ordered
	 */
	public static final int IMPERSONAL_DEVICE_VALUE = 101;

	/**
	 * The '<em><b>Implements AN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTS_AN
	 * @model name="implementsAN"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLEMENTS_AN_VALUE = 102;

	/**
	 * The '<em><b>Implements CN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTS_CN
	 * @model name="implementsCN"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLEMENTS_CN_VALUE = 103;

	/**
	 * The '<em><b>Implements HS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTS_HS
	 * @model name="implementsHS"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLEMENTS_HS_VALUE = 104;

	/**
	 * The '<em><b>Includes Field</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUDES_FIELD
	 * @model name="includesField"
	 * @generated
	 * @ordered
	 */
	public static final int INCLUDES_FIELD_VALUE = 105;

	/**
	 * The '<em><b>Indirect Auth Z</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDIRECT_AUTH_Z
	 * @model name="indirectAuthZ"
	 * @generated
	 * @ordered
	 */
	public static final int INDIRECT_AUTH_Z_VALUE = 106;

	/**
	 * The '<em><b>Inputs Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUTS_DATA
	 * @model name="inputsData"
	 * @generated
	 * @ordered
	 */
	public static final int INPUTS_DATA_VALUE = 107;

	/**
	 * The '<em><b>Interacts Remotely With</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERACTS_REMOTELY_WITH
	 * @model name="interactsRemotelyWith"
	 * @generated
	 * @ordered
	 */
	public static final int INTERACTS_REMOTELY_WITH_VALUE = 108;

	/**
	 * The '<em><b>Interacts With</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERACTS_WITH
	 * @model name="interactsWith"
	 * @generated
	 * @ordered
	 */
	public static final int INTERACTS_WITH_VALUE = 109;

	/**
	 * The '<em><b>Interacts With Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERACTS_WITH_DATA
	 * @model name="interactsWithData"
	 * @generated
	 * @ordered
	 */
	public static final int INTERACTS_WITH_DATA_VALUE = 110;

	/**
	 * The '<em><b>Is Abstract Subnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_ABSTRACT_SUBNET
	 * @model name="isAbstractSubnet"
	 * @generated
	 * @ordered
	 */
	public static final int IS_ABSTRACT_SUBNET_VALUE = 111;

	/**
	 * The '<em><b>Is Adult</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_ADULT
	 * @model name="isAdult"
	 * @generated
	 * @ordered
	 */
	public static final int IS_ADULT_VALUE = 112;

	/**
	 * The '<em><b>Is Cluster</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_CLUSTER
	 * @model name="isCluster"
	 * @generated
	 * @ordered
	 */
	public static final int IS_CLUSTER_VALUE = 113;

	/**
	 * The '<em><b>Is Container</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_CONTAINER
	 * @model name="isContainer"
	 * @generated
	 * @ordered
	 */
	public static final int IS_CONTAINER_VALUE = 114;

	/**
	 * The '<em><b>Is Dest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_DEST
	 * @model name="isDest"
	 * @generated
	 * @ordered
	 */
	public static final int IS_DEST_VALUE = 115;

	/**
	 * The '<em><b>Is Host LAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_HOST_LAN
	 * @model name="isHostLAN"
	 * @generated
	 * @ordered
	 */
	public static final int IS_HOST_LAN_VALUE = 116;

	/**
	 * The '<em><b>Is Hotspot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_HOTSPOT
	 * @model name="isHotspot"
	 * @generated
	 * @ordered
	 */
	public static final int IS_HOTSPOT_VALUE = 117;

	/**
	 * The '<em><b>Is Internet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_INTERNET
	 * @model name="isInternet"
	 * @generated
	 * @ordered
	 */
	public static final int IS_INTERNET_VALUE = 118;

	/**
	 * The '<em><b>Is Ln S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_LN_S
	 * @model name="isLnS"
	 * @generated
	 * @ordered
	 */
	public static final int IS_LN_S_VALUE = 119;

	/**
	 * The '<em><b>Is Local Subnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_LOCAL_SUBNET
	 * @model name="isLocalSubnet"
	 * @generated
	 * @ordered
	 */
	public static final int IS_LOCAL_SUBNET_VALUE = 120;

	/**
	 * The '<em><b>Is MHC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_MHC
	 * @model name="isMHC"
	 * @generated
	 * @ordered
	 */
	public static final int IS_MHC_VALUE = 121;

	/**
	 * The '<em><b>Is Mobile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_MOBILE
	 * @model name="isMobile"
	 * @generated
	 * @ordered
	 */
	public static final int IS_MOBILE_VALUE = 122;

	/**
	 * The '<em><b>Is Nowhere</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_NOWHERE
	 * @model name="isNowhere"
	 * @generated
	 * @ordered
	 */
	public static final int IS_NOWHERE_VALUE = 123;

	/**
	 * The '<em><b>Is Personal Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_PERSONAL_DEVICE
	 * @model name="isPersonalDevice"
	 * @generated
	 * @ordered
	 */
	public static final int IS_PERSONAL_DEVICE_VALUE = 124;

	/**
	 * The '<em><b>Is Pod</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_POD
	 * @model name="isPod"
	 * @generated
	 * @ordered
	 */
	public static final int IS_POD_VALUE = 125;

	/**
	 * The '<em><b>Is Pool</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_POOL
	 * @model name="isPool"
	 * @generated
	 * @ordered
	 */
	public static final int IS_POOL_VALUE = 126;

	/**
	 * The '<em><b>Is Proxy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_PROXY
	 * @model name="isProxy"
	 * @generated
	 * @ordered
	 */
	public static final int IS_PROXY_VALUE = 127;

	/**
	 * The '<em><b>Is Router</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_ROUTER
	 * @model name="isRouter"
	 * @generated
	 * @ordered
	 */
	public static final int IS_ROUTER_VALUE = 128;

	/**
	 * The '<em><b>Is Scalable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_SCALABLE
	 * @model name="isScalable"
	 * @generated
	 * @ordered
	 */
	public static final int IS_SCALABLE_VALUE = 129;

	/**
	 * The '<em><b>Is Source</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_SOURCE
	 * @model name="isSource"
	 * @generated
	 * @ordered
	 */
	public static final int IS_SOURCE_VALUE = 130;

	/**
	 * The '<em><b>Is Spam</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_SPAM
	 * @model name="isSpam"
	 * @generated
	 * @ordered
	 */
	public static final int IS_SPAM_VALUE = 131;

	/**
	 * The '<em><b>Is Trivial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_TRIVIAL
	 * @model name="isTrivial"
	 * @generated
	 * @ordered
	 */
	public static final int IS_TRIVIAL_VALUE = 132;

	/**
	 * The '<em><b>Is World</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_WORLD
	 * @model name="isWorld"
	 * @generated
	 * @ordered
	 */
	public static final int IS_WORLD_VALUE = 133;

	/**
	 * The '<em><b>Last Interface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_INTERFACE
	 * @model name="lastInterface"
	 * @generated
	 * @ordered
	 */
	public static final int LAST_INTERFACE_VALUE = 134;

	/**
	 * The '<em><b>Located In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCATED_IN
	 * @model name="locatedIn"
	 * @generated
	 * @ordered
	 */
	public static final int LOCATED_IN_VALUE = 135;

	/**
	 * The '<em><b>Managed By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGED_BY
	 * @model name="managedBy"
	 * @generated
	 * @ordered
	 */
	public static final int MANAGED_BY_VALUE = 136;

	/**
	 * The '<em><b>Manages</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGES
	 * @model name="manages"
	 * @generated
	 * @ordered
	 */
	public static final int MANAGES_VALUE = 137;

	/**
	 * The '<em><b>May Be In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAY_BE_IN
	 * @model name="mayBeIn"
	 * @generated
	 * @ordered
	 */
	public static final int MAY_BE_IN_VALUE = 138;

	/**
	 * The '<em><b>Needs Field</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEEDS_FIELD
	 * @model name="needsField"
	 * @generated
	 * @ordered
	 */
	public static final int NEEDS_FIELD_VALUE = 139;

	/**
	 * The '<em><b>No Auth N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_AUTH_N
	 * @model name="noAuthN"
	 * @generated
	 * @ordered
	 */
	public static final int NO_AUTH_N_VALUE = 140;

	/**
	 * The '<em><b>No DU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_DU
	 * @model name="noDU"
	 * @generated
	 * @ordered
	 */
	public static final int NO_DU_VALUE = 141;

	/**
	 * The '<em><b>No DX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_DX
	 * @model name="noDX"
	 * @generated
	 * @ordered
	 */
	public static final int NO_DX_VALUE = 142;

	/**
	 * The '<em><b>Operates</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATES
	 * @model name="operates"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATES_VALUE = 143;

	/**
	 * The '<em><b>Overlays</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERLAYS
	 * @model name="overlays"
	 * @generated
	 * @ordered
	 */
	public static final int OVERLAYS_VALUE = 144;

	/**
	 * The '<em><b>PEnds At</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENDS_AT
	 * @model name="pEndsAt"
	 * @generated
	 * @ordered
	 */
	public static final int PENDS_AT_VALUE = 145;

	/**
	 * The '<em><b>PVia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PVIA
	 * @model name="pVia"
	 * @generated
	 * @ordered
	 */
	public static final int PVIA_VALUE = 146;

	/**
	 * The '<em><b>Pairs Via Bluetooth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAIRS_VIA_BLUETOOTH
	 * @model name="pairsViaBluetooth"
	 * @generated
	 * @ordered
	 */
	public static final int PAIRS_VIA_BLUETOOTH_VALUE = 147;

	/**
	 * The '<em><b>Pairs Via USB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAIRS_VIA_USB
	 * @model name="pairsViaUSB"
	 * @generated
	 * @ordered
	 */
	public static final int PAIRS_VIA_USB_VALUE = 148;

	/**
	 * The '<em><b>Path To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATH_TO
	 * @model name="pathTo"
	 * @generated
	 * @ordered
	 */
	public static final int PATH_TO_VALUE = 149;

	/**
	 * The '<em><b>Polls Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLLS_SENSOR
	 * @model name="pollsSensor"
	 * @generated
	 * @ordered
	 */
	public static final int POLLS_SENSOR_VALUE = 150;

	/**
	 * The '<em><b>Poss Data Dest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSS_DATA_DEST
	 * @model name="possDataDest"
	 * @generated
	 * @ordered
	 */
	public static final int POSS_DATA_DEST_VALUE = 151;

	/**
	 * The '<em><b>Poss Rev Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSS_REV_PATH
	 * @model name="possRevPath"
	 * @generated
	 * @ordered
	 */
	public static final int POSS_REV_PATH_VALUE = 152;

	/**
	 * The '<em><b>Processes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSES
	 * @model name="processes"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESSES_VALUE = 153;

	/**
	 * The '<em><b>Propagates To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPAGATES_TO
	 * @model name="propagatesTo"
	 * @generated
	 * @ordered
	 */
	public static final int PROPAGATES_TO_VALUE = 154;

	/**
	 * The '<em><b>Provided By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVIDED_BY
	 * @model name="providedBy"
	 * @generated
	 * @ordered
	 */
	public static final int PROVIDED_BY_VALUE = 155;

	/**
	 * The '<em><b>Provisioned By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVISIONED_BY
	 * @model name="provisionedBy"
	 * @generated
	 * @ordered
	 */
	public static final int PROVISIONED_BY_VALUE = 156;

	/**
	 * The '<em><b>Proxy Auth N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROXY_AUTH_N
	 * @model name="proxyAuthN"
	 * @generated
	 * @ordered
	 */
	public static final int PROXY_AUTH_N_VALUE = 157;

	/**
	 * The '<em><b>Reads</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READS
	 * @model name="reads"
	 * @generated
	 * @ordered
	 */
	public static final int READS_VALUE = 158;

	/**
	 * The '<em><b>Reads Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READS_SENSOR
	 * @model name="readsSensor"
	 * @generated
	 * @ordered
	 */
	public static final int READS_SENSOR_VALUE = 159;

	/**
	 * The '<em><b>Receives</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVES
	 * @model name="receives"
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVES_VALUE = 160;

	/**
	 * The '<em><b>Receives From Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVES_FROM_SENSOR
	 * @model name="receivesFromSensor"
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVES_FROM_SENSOR_VALUE = 161;

	/**
	 * The '<em><b>Relates To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATES_TO
	 * @model name="relatesTo"
	 * @generated
	 * @ordered
	 */
	public static final int RELATES_TO_VALUE = 162;

	/**
	 * The '<em><b>Relays</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELAYS
	 * @model name="relays"
	 * @generated
	 * @ordered
	 */
	public static final int RELAYS_VALUE = 163;

	/**
	 * The '<em><b>Relays Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELAYS_ACCESS
	 * @model name="relaysAccess"
	 * @generated
	 * @ordered
	 */
	public static final int RELAYS_ACCESS_VALUE = 164;

	/**
	 * The '<em><b>Responsible For</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSIBLE_FOR
	 * @model name="responsibleFor"
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSIBLE_FOR_VALUE = 165;

	/**
	 * The '<em><b>Rev Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REV_PATH
	 * @model name="revPath"
	 * @generated
	 * @ordered
	 */
	public static final int REV_PATH_VALUE = 166;

	/**
	 * The '<em><b>Rev Relay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REV_RELAY
	 * @model name="revRelay"
	 * @generated
	 * @ordered
	 */
	public static final int REV_RELAY_VALUE = 167;

	/**
	 * The '<em><b>Runs In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNS_IN
	 * @model name="runsIn"
	 * @generated
	 * @ordered
	 */
	public static final int RUNS_IN_VALUE = 168;

	/**
	 * The '<em><b>Senses</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSES
	 * @model name="senses"
	 * @generated
	 * @ordered
	 */
	public static final int SENSES_VALUE = 169;

	/**
	 * The '<em><b>Serves</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVES
	 * @model name="serves"
	 * @generated
	 * @ordered
	 */
	public static final int SERVES_VALUE = 170;

	/**
	 * The '<em><b>Shares Credentials</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARES_CREDENTIALS
	 * @model name="sharesCredentials"
	 * @generated
	 * @ordered
	 */
	public static final int SHARES_CREDENTIALS_VALUE = 171;

	/**
	 * The '<em><b>Source Direct</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE_DIRECT
	 * @model name="sourceDirect"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_DIRECT_VALUE = 172;

	/**
	 * The '<em><b>Source Via NAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE_VIA_NAT
	 * @model name="sourceViaNAT"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_VIA_NAT_VALUE = 173;

	/**
	 * The '<em><b>Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START
	 * @model name="start"
	 * @generated
	 * @ordered
	 */
	public static final int START_VALUE = 174;

	/**
	 * The '<em><b>Stores</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORES
	 * @model name="stores"
	 * @generated
	 * @ordered
	 */
	public static final int STORES_VALUE = 175;

	/**
	 * The '<em><b>Stores Copy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORES_COPY
	 * @model name="storesCopy"
	 * @generated
	 * @ordered
	 */
	public static final int STORES_COPY_VALUE = 176;

	/**
	 * The '<em><b>Subject To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBJECT_TO
	 * @model name="subjectTo"
	 * @generated
	 * @ordered
	 */
	public static final int SUBJECT_TO_VALUE = 177;

	/**
	 * The '<em><b>To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO
	 * @model name="to"
	 * @generated
	 * @ordered
	 */
	public static final int TO_VALUE = 178;

	/**
	 * The '<em><b>To Interface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_INTERFACE
	 * @model name="toInterface"
	 * @generated
	 * @ordered
	 */
	public static final int TO_INTERFACE_VALUE = 179;

	/**
	 * The '<em><b>To Physical Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_PHYSICAL_HOST
	 * @model name="toPhysicalHost"
	 * @generated
	 * @ordered
	 */
	public static final int TO_PHYSICAL_HOST_VALUE = 180;

	/**
	 * The '<em><b>To Physical Interface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_PHYSICAL_INTERFACE
	 * @model name="toPhysicalInterface"
	 * @generated
	 * @ordered
	 */
	public static final int TO_PHYSICAL_INTERFACE_VALUE = 181;

	/**
	 * The '<em><b>To Proc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_PROC
	 * @model name="toProc"
	 * @generated
	 * @ordered
	 */
	public static final int TO_PROC_VALUE = 182;

	/**
	 * The '<em><b>To Space</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_SPACE
	 * @model name="toSpace"
	 * @generated
	 * @ordered
	 */
	public static final int TO_SPACE_VALUE = 183;

	/**
	 * The '<em><b>Traverses</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVERSES
	 * @model name="traverses"
	 * @generated
	 * @ordered
	 */
	public static final int TRAVERSES_VALUE = 184;

	/**
	 * The '<em><b>Updates</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATES
	 * @model name="updates"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATES_VALUE = 185;

	/**
	 * The '<em><b>Updates Controller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATES_CONTROLLER
	 * @model name="updatesController"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATES_CONTROLLER_VALUE = 186;

	/**
	 * The '<em><b>Updates Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATES_SENSOR
	 * @model name="updatesSensor"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATES_SENSOR_VALUE = 187;

	/**
	 * The '<em><b>Used By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USED_BY
	 * @model name="usedBy"
	 * @generated
	 * @ordered
	 */
	public static final int USED_BY_VALUE = 188;

	/**
	 * The '<em><b>Used For</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USED_FOR
	 * @model name="usedFor"
	 * @generated
	 * @ordered
	 */
	public static final int USED_FOR_VALUE = 189;

	/**
	 * The '<em><b>Uses</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES
	 * @model name="uses"
	 * @generated
	 * @ordered
	 */
	public static final int USES_VALUE = 190;

	/**
	 * The '<em><b>Uses As Proxy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_AS_PROXY
	 * @model name="usesAsProxy"
	 * @generated
	 * @ordered
	 */
	public static final int USES_AS_PROXY_VALUE = 191;

	/**
	 * The '<em><b>Uses Data Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_DATA_PATH
	 * @model name="usesDataPath"
	 * @generated
	 * @ordered
	 */
	public static final int USES_DATA_PATH_VALUE = 192;

	/**
	 * The '<em><b>Uses For Auth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_FOR_AUTH
	 * @model name="usesForAuth"
	 * @generated
	 * @ordered
	 */
	public static final int USES_FOR_AUTH_VALUE = 193;

	/**
	 * The '<em><b>Uses For Auth Z</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_FOR_AUTH_Z
	 * @model name="usesForAuthZ"
	 * @generated
	 * @ordered
	 */
	public static final int USES_FOR_AUTH_Z_VALUE = 194;

	/**
	 * The '<em><b>Uses Indirectly</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_INDIRECTLY
	 * @model name="usesIndirectly"
	 * @generated
	 * @ordered
	 */
	public static final int USES_INDIRECTLY_VALUE = 195;

	/**
	 * The '<em><b>Uses Logical Route</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_LOGICAL_ROUTE
	 * @model name="usesLogicalRoute"
	 * @generated
	 * @ordered
	 */
	public static final int USES_LOGICAL_ROUTE_VALUE = 196;

	/**
	 * The '<em><b>Uses Physical Route</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_PHYSICAL_ROUTE
	 * @model name="usesPhysicalRoute"
	 * @generated
	 * @ordered
	 */
	public static final int USES_PHYSICAL_ROUTE_VALUE = 197;

	/**
	 * The '<em><b>Uses Physical Subnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_PHYSICAL_SUBNET
	 * @model name="usesPhysicalSubnet"
	 * @generated
	 * @ordered
	 */
	public static final int USES_PHYSICAL_SUBNET_VALUE = 198;

	/**
	 * The '<em><b>Uses Remotely</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_REMOTELY
	 * @model name="usesRemotely"
	 * @generated
	 * @ordered
	 */
	public static final int USES_REMOTELY_VALUE = 199;

	/**
	 * The '<em><b>Uses Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_SERVICE
	 * @model name="usesService"
	 * @generated
	 * @ordered
	 */
	public static final int USES_SERVICE_VALUE = 200;

	/**
	 * The '<em><b>Uses Via Deputy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_VIA_DEPUTY
	 * @model name="usesViaDeputy"
	 * @generated
	 * @ordered
	 */
	public static final int USES_VIA_DEPUTY_VALUE = 201;

	/**
	 * The '<em><b>Uses Via Proxy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_VIA_PROXY
	 * @model name="usesViaProxy"
	 * @generated
	 * @ordered
	 */
	public static final int USES_VIA_PROXY_VALUE = 202;

	/**
	 * The '<em><b>Uses Via RAS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USES_VIA_RAS
	 * @model name="usesViaRAS"
	 * @generated
	 * @ordered
	 */
	public static final int USES_VIA_RAS_VALUE = 203;

	/**
	 * The '<em><b>Validates Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALIDATES_CHANNEL
	 * @model name="validatesChannel"
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATES_CHANNEL_VALUE = 204;

	/**
	 * The '<em><b>Via</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIA
	 * @model name="via"
	 * @generated
	 * @ordered
	 */
	public static final int VIA_VALUE = 205;

	/**
	 * The '<em><b>Via Host Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIA_HOST_CHANNEL
	 * @model name="viaHostChannel"
	 * @generated
	 * @ordered
	 */
	public static final int VIA_HOST_CHANNEL_VALUE = 206;

	/**
	 * The '<em><b>Via Interface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIA_INTERFACE
	 * @model name="viaInterface"
	 * @generated
	 * @ordered
	 */
	public static final int VIA_INTERFACE_VALUE = 207;

	/**
	 * The '<em><b>Via Physical Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIA_PHYSICAL_PATH
	 * @model name="viaPhysicalPath"
	 * @generated
	 * @ordered
	 */
	public static final int VIA_PHYSICAL_PATH_VALUE = 208;

	/**
	 * The '<em><b>Via Physical Subnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIA_PHYSICAL_SUBNET
	 * @model name="viaPhysicalSubnet"
	 * @generated
	 * @ordered
	 */
	public static final int VIA_PHYSICAL_SUBNET_VALUE = 209;

	/**
	 * The '<em><b>Via Proxy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIA_PROXY
	 * @model name="viaProxy"
	 * @generated
	 * @ordered
	 */
	public static final int VIA_PROXY_VALUE = 210;

	/**
	 * The '<em><b>Via Shared Credentials</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIA_SHARED_CREDENTIALS
	 * @model name="viaSharedCredentials"
	 * @generated
	 * @ordered
	 */
	public static final int VIA_SHARED_CREDENTIALS_VALUE = 211;

	/**
	 * The '<em><b>Via Subnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIA_SUBNET
	 * @model name="viaSubnet"
	 * @generated
	 * @ordered
	 */
	public static final int VIA_SUBNET_VALUE = 212;

	/**
	 * The '<em><b>Via Virtual Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIA_VIRTUAL_CHANNEL
	 * @model name="viaVirtualChannel"
	 * @generated
	 * @ordered
	 */
	public static final int VIA_VIRTUAL_CHANNEL_VALUE = 213;

	/**
	 * The '<em><b>Views Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIEWS_DATA
	 * @model name="viewsData"
	 * @generated
	 * @ordered
	 */
	public static final int VIEWS_DATA_VALUE = 214;

	/**
	 * The '<em><b>Visits</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISITS
	 * @model name="visits"
	 * @generated
	 * @ordered
	 */
	public static final int VISITS_VALUE = 215;

	/**
	 * The '<em><b>Visits Gateway</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISITS_GATEWAY
	 * @model name="visitsGateway"
	 * @generated
	 * @ordered
	 */
	public static final int VISITS_GATEWAY_VALUE = 216;

	/**
	 * The '<em><b>Works For</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKS_FOR
	 * @model name="worksFor"
	 * @generated
	 * @ordered
	 */
	public static final int WORKS_FOR_VALUE = 217;

	/**
	 * An array of all the '<em><b>Network Domain Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NetworkDomainKind[] VALUES_ARRAY =
		new NetworkDomainKind[] {
			ABOVE,
			ACCESS_FROM,
			ACCESS_FROM_CLIENT,
			ACCESS_INTERRUPTED,
			ACCESS_TO,
			ACCESS_TO_SERVICE,
			ACCESS_UNINTERRUPTED,
			ACCESS_VIA,
			ACCESSES_FIELD,
			ACCESSES_SERVICE,
			ACCESSIBLE_FROM,
			ACCESSIBLE_VIA,
			AMENDS,
			AMENDS_CONTROLLER,
			AMENDS_DATA,
			AMENDS_SENSOR,
			APPENDS,
			ASSERTED_AMENDS_DATA,
			ASSERTED_INPUTS_DATA,
			ASSERTED_VIEWS_DATA,
			AT_HOST,
			ATTACK_PATH_FROM,
			ATTACK_PATH_VIA,
			BLOCKED_PATH,
			BLOCKED_SEGMENT,
			CAN_ACCESS,
			CAN_GET_KEYS,
			CAN_READ,
			CAN_WRITE,
			CHANNEL_FROM,
			CHANNEL_TO,
			CHANNEL_TRIED,
			CHANNEL_VIA,
			CONNECTED_TO,
			CONNECTS_DATA,
			CONNECTS_FROM,
			CONNECTS_TO,
			CONTAINS,
			CONTAINS_FIELD,
			CONTROLLED_BY,
			CONTROLS,
			CONTROLS_CHANNEL,
			CONTROLS_SENSOR,
			CONTROLS_THING,
			COPY_OF,
			CREATES,
			CRUDC,
			CRUDD,
			CRUDR,
			CRUDU,
			DATA_CHANNEL_END,
			DATA_CHANNEL_FOR,
			DATA_CHANNEL_FROM,
			DATA_CHANNEL_TO,
			DATA_PATH_END,
			DATA_PATH_FOR,
			DATA_PATH_TO,
			DATA_PATH_VISITS,
			ENABLES_ACCESS,
			ENABLES_USER_ACCESS,
			ENABLES_USER_INPUT,
			ENABLES_USER_OUTPUT,
			ENABLES_USER_UPDATE,
			END,
			EXTENDS,
			EXTENDS_DC,
			EXTENDS_DP,
			EXTENDS_FWD_FLOW,
			EXTENDS_REV_FLOW,
			FLOWS,
			FLOWS_FROM,
			FLOWS_FROM_DP,
			FLOWS_FROM_IN,
			FLOWS_IN,
			FLOWS_OUT,
			FLOWS_TO,
			FLOWS_TO_DP,
			FLOWS_TO_IN,
			FLOWS_VIA,
			FLOWS_VIA_CS,
			FLOWS_VIA_CHANNEL,
			FLOWS_VIA_PROCESS,
			FLOWS_VIA_SC,
			FROM,
			FROM_INTERFACE,
			FROM_PHYSICAL_HOST,
			FROM_PHYSICAL_INTERFACE,
			FROM_PROC,
			FROM_SOURCE,
			FROM_SPACE,
			FROM_SUBNET,
			FULFILS,
			FWD_PATH,
			FWD_RELAY,
			HANDLES,
			HAS_CLI,
			HAS_CONTROLLER,
			HAS_EMAIL,
			HAS_PHYSICAL_HOST,
			HOSTS,
			IGNORES_FIELD,
			IMPERSONAL_DEVICE,
			IMPLEMENTS_AN,
			IMPLEMENTS_CN,
			IMPLEMENTS_HS,
			INCLUDES_FIELD,
			INDIRECT_AUTH_Z,
			INPUTS_DATA,
			INTERACTS_REMOTELY_WITH,
			INTERACTS_WITH,
			INTERACTS_WITH_DATA,
			IS_ABSTRACT_SUBNET,
			IS_ADULT,
			IS_CLUSTER,
			IS_CONTAINER,
			IS_DEST,
			IS_HOST_LAN,
			IS_HOTSPOT,
			IS_INTERNET,
			IS_LN_S,
			IS_LOCAL_SUBNET,
			IS_MHC,
			IS_MOBILE,
			IS_NOWHERE,
			IS_PERSONAL_DEVICE,
			IS_POD,
			IS_POOL,
			IS_PROXY,
			IS_ROUTER,
			IS_SCALABLE,
			IS_SOURCE,
			IS_SPAM,
			IS_TRIVIAL,
			IS_WORLD,
			LAST_INTERFACE,
			LOCATED_IN,
			MANAGED_BY,
			MANAGES,
			MAY_BE_IN,
			NEEDS_FIELD,
			NO_AUTH_N,
			NO_DU,
			NO_DX,
			OPERATES,
			OVERLAYS,
			PENDS_AT,
			PVIA,
			PAIRS_VIA_BLUETOOTH,
			PAIRS_VIA_USB,
			PATH_TO,
			POLLS_SENSOR,
			POSS_DATA_DEST,
			POSS_REV_PATH,
			PROCESSES,
			PROPAGATES_TO,
			PROVIDED_BY,
			PROVISIONED_BY,
			PROXY_AUTH_N,
			READS,
			READS_SENSOR,
			RECEIVES,
			RECEIVES_FROM_SENSOR,
			RELATES_TO,
			RELAYS,
			RELAYS_ACCESS,
			RESPONSIBLE_FOR,
			REV_PATH,
			REV_RELAY,
			RUNS_IN,
			SENSES,
			SERVES,
			SHARES_CREDENTIALS,
			SOURCE_DIRECT,
			SOURCE_VIA_NAT,
			START,
			STORES,
			STORES_COPY,
			SUBJECT_TO,
			TO,
			TO_INTERFACE,
			TO_PHYSICAL_HOST,
			TO_PHYSICAL_INTERFACE,
			TO_PROC,
			TO_SPACE,
			TRAVERSES,
			UPDATES,
			UPDATES_CONTROLLER,
			UPDATES_SENSOR,
			USED_BY,
			USED_FOR,
			USES,
			USES_AS_PROXY,
			USES_DATA_PATH,
			USES_FOR_AUTH,
			USES_FOR_AUTH_Z,
			USES_INDIRECTLY,
			USES_LOGICAL_ROUTE,
			USES_PHYSICAL_ROUTE,
			USES_PHYSICAL_SUBNET,
			USES_REMOTELY,
			USES_SERVICE,
			USES_VIA_DEPUTY,
			USES_VIA_PROXY,
			USES_VIA_RAS,
			VALIDATES_CHANNEL,
			VIA,
			VIA_HOST_CHANNEL,
			VIA_INTERFACE,
			VIA_PHYSICAL_PATH,
			VIA_PHYSICAL_SUBNET,
			VIA_PROXY,
			VIA_SHARED_CREDENTIALS,
			VIA_SUBNET,
			VIA_VIRTUAL_CHANNEL,
			VIEWS_DATA,
			VISITS,
			VISITS_GATEWAY,
			WORKS_FOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Network Domain Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NetworkDomainKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Network Domain Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NetworkDomainKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NetworkDomainKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Network Domain Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NetworkDomainKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NetworkDomainKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Network Domain Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NetworkDomainKind get(int value) {
		switch (value) {
			case ABOVE_VALUE: return ABOVE;
			case ACCESS_FROM_VALUE: return ACCESS_FROM;
			case ACCESS_FROM_CLIENT_VALUE: return ACCESS_FROM_CLIENT;
			case ACCESS_INTERRUPTED_VALUE: return ACCESS_INTERRUPTED;
			case ACCESS_TO_VALUE: return ACCESS_TO;
			case ACCESS_TO_SERVICE_VALUE: return ACCESS_TO_SERVICE;
			case ACCESS_UNINTERRUPTED_VALUE: return ACCESS_UNINTERRUPTED;
			case ACCESS_VIA_VALUE: return ACCESS_VIA;
			case ACCESSES_FIELD_VALUE: return ACCESSES_FIELD;
			case ACCESSES_SERVICE_VALUE: return ACCESSES_SERVICE;
			case ACCESSIBLE_FROM_VALUE: return ACCESSIBLE_FROM;
			case ACCESSIBLE_VIA_VALUE: return ACCESSIBLE_VIA;
			case AMENDS_VALUE: return AMENDS;
			case AMENDS_CONTROLLER_VALUE: return AMENDS_CONTROLLER;
			case AMENDS_DATA_VALUE: return AMENDS_DATA;
			case AMENDS_SENSOR_VALUE: return AMENDS_SENSOR;
			case APPENDS_VALUE: return APPENDS;
			case ASSERTED_AMENDS_DATA_VALUE: return ASSERTED_AMENDS_DATA;
			case ASSERTED_INPUTS_DATA_VALUE: return ASSERTED_INPUTS_DATA;
			case ASSERTED_VIEWS_DATA_VALUE: return ASSERTED_VIEWS_DATA;
			case AT_HOST_VALUE: return AT_HOST;
			case ATTACK_PATH_FROM_VALUE: return ATTACK_PATH_FROM;
			case ATTACK_PATH_VIA_VALUE: return ATTACK_PATH_VIA;
			case BLOCKED_PATH_VALUE: return BLOCKED_PATH;
			case BLOCKED_SEGMENT_VALUE: return BLOCKED_SEGMENT;
			case CAN_ACCESS_VALUE: return CAN_ACCESS;
			case CAN_GET_KEYS_VALUE: return CAN_GET_KEYS;
			case CAN_READ_VALUE: return CAN_READ;
			case CAN_WRITE_VALUE: return CAN_WRITE;
			case CHANNEL_FROM_VALUE: return CHANNEL_FROM;
			case CHANNEL_TO_VALUE: return CHANNEL_TO;
			case CHANNEL_TRIED_VALUE: return CHANNEL_TRIED;
			case CHANNEL_VIA_VALUE: return CHANNEL_VIA;
			case CONNECTED_TO_VALUE: return CONNECTED_TO;
			case CONNECTS_DATA_VALUE: return CONNECTS_DATA;
			case CONNECTS_FROM_VALUE: return CONNECTS_FROM;
			case CONNECTS_TO_VALUE: return CONNECTS_TO;
			case CONTAINS_VALUE: return CONTAINS;
			case CONTAINS_FIELD_VALUE: return CONTAINS_FIELD;
			case CONTROLLED_BY_VALUE: return CONTROLLED_BY;
			case CONTROLS_VALUE: return CONTROLS;
			case CONTROLS_CHANNEL_VALUE: return CONTROLS_CHANNEL;
			case CONTROLS_SENSOR_VALUE: return CONTROLS_SENSOR;
			case CONTROLS_THING_VALUE: return CONTROLS_THING;
			case COPY_OF_VALUE: return COPY_OF;
			case CREATES_VALUE: return CREATES;
			case CRUDC_VALUE: return CRUDC;
			case CRUDD_VALUE: return CRUDD;
			case CRUDR_VALUE: return CRUDR;
			case CRUDU_VALUE: return CRUDU;
			case DATA_CHANNEL_END_VALUE: return DATA_CHANNEL_END;
			case DATA_CHANNEL_FOR_VALUE: return DATA_CHANNEL_FOR;
			case DATA_CHANNEL_FROM_VALUE: return DATA_CHANNEL_FROM;
			case DATA_CHANNEL_TO_VALUE: return DATA_CHANNEL_TO;
			case DATA_PATH_END_VALUE: return DATA_PATH_END;
			case DATA_PATH_FOR_VALUE: return DATA_PATH_FOR;
			case DATA_PATH_TO_VALUE: return DATA_PATH_TO;
			case DATA_PATH_VISITS_VALUE: return DATA_PATH_VISITS;
			case ENABLES_ACCESS_VALUE: return ENABLES_ACCESS;
			case ENABLES_USER_ACCESS_VALUE: return ENABLES_USER_ACCESS;
			case ENABLES_USER_INPUT_VALUE: return ENABLES_USER_INPUT;
			case ENABLES_USER_OUTPUT_VALUE: return ENABLES_USER_OUTPUT;
			case ENABLES_USER_UPDATE_VALUE: return ENABLES_USER_UPDATE;
			case END_VALUE: return END;
			case EXTENDS_VALUE: return EXTENDS;
			case EXTENDS_DC_VALUE: return EXTENDS_DC;
			case EXTENDS_DP_VALUE: return EXTENDS_DP;
			case EXTENDS_FWD_FLOW_VALUE: return EXTENDS_FWD_FLOW;
			case EXTENDS_REV_FLOW_VALUE: return EXTENDS_REV_FLOW;
			case FLOWS_VALUE: return FLOWS;
			case FLOWS_FROM_VALUE: return FLOWS_FROM;
			case FLOWS_FROM_DP_VALUE: return FLOWS_FROM_DP;
			case FLOWS_FROM_IN_VALUE: return FLOWS_FROM_IN;
			case FLOWS_IN_VALUE: return FLOWS_IN;
			case FLOWS_OUT_VALUE: return FLOWS_OUT;
			case FLOWS_TO_VALUE: return FLOWS_TO;
			case FLOWS_TO_DP_VALUE: return FLOWS_TO_DP;
			case FLOWS_TO_IN_VALUE: return FLOWS_TO_IN;
			case FLOWS_VIA_VALUE: return FLOWS_VIA;
			case FLOWS_VIA_CS_VALUE: return FLOWS_VIA_CS;
			case FLOWS_VIA_CHANNEL_VALUE: return FLOWS_VIA_CHANNEL;
			case FLOWS_VIA_PROCESS_VALUE: return FLOWS_VIA_PROCESS;
			case FLOWS_VIA_SC_VALUE: return FLOWS_VIA_SC;
			case FROM_VALUE: return FROM;
			case FROM_INTERFACE_VALUE: return FROM_INTERFACE;
			case FROM_PHYSICAL_HOST_VALUE: return FROM_PHYSICAL_HOST;
			case FROM_PHYSICAL_INTERFACE_VALUE: return FROM_PHYSICAL_INTERFACE;
			case FROM_PROC_VALUE: return FROM_PROC;
			case FROM_SOURCE_VALUE: return FROM_SOURCE;
			case FROM_SPACE_VALUE: return FROM_SPACE;
			case FROM_SUBNET_VALUE: return FROM_SUBNET;
			case FULFILS_VALUE: return FULFILS;
			case FWD_PATH_VALUE: return FWD_PATH;
			case FWD_RELAY_VALUE: return FWD_RELAY;
			case HANDLES_VALUE: return HANDLES;
			case HAS_CLI_VALUE: return HAS_CLI;
			case HAS_CONTROLLER_VALUE: return HAS_CONTROLLER;
			case HAS_EMAIL_VALUE: return HAS_EMAIL;
			case HAS_PHYSICAL_HOST_VALUE: return HAS_PHYSICAL_HOST;
			case HOSTS_VALUE: return HOSTS;
			case IGNORES_FIELD_VALUE: return IGNORES_FIELD;
			case IMPERSONAL_DEVICE_VALUE: return IMPERSONAL_DEVICE;
			case IMPLEMENTS_AN_VALUE: return IMPLEMENTS_AN;
			case IMPLEMENTS_CN_VALUE: return IMPLEMENTS_CN;
			case IMPLEMENTS_HS_VALUE: return IMPLEMENTS_HS;
			case INCLUDES_FIELD_VALUE: return INCLUDES_FIELD;
			case INDIRECT_AUTH_Z_VALUE: return INDIRECT_AUTH_Z;
			case INPUTS_DATA_VALUE: return INPUTS_DATA;
			case INTERACTS_REMOTELY_WITH_VALUE: return INTERACTS_REMOTELY_WITH;
			case INTERACTS_WITH_VALUE: return INTERACTS_WITH;
			case INTERACTS_WITH_DATA_VALUE: return INTERACTS_WITH_DATA;
			case IS_ABSTRACT_SUBNET_VALUE: return IS_ABSTRACT_SUBNET;
			case IS_ADULT_VALUE: return IS_ADULT;
			case IS_CLUSTER_VALUE: return IS_CLUSTER;
			case IS_CONTAINER_VALUE: return IS_CONTAINER;
			case IS_DEST_VALUE: return IS_DEST;
			case IS_HOST_LAN_VALUE: return IS_HOST_LAN;
			case IS_HOTSPOT_VALUE: return IS_HOTSPOT;
			case IS_INTERNET_VALUE: return IS_INTERNET;
			case IS_LN_S_VALUE: return IS_LN_S;
			case IS_LOCAL_SUBNET_VALUE: return IS_LOCAL_SUBNET;
			case IS_MHC_VALUE: return IS_MHC;
			case IS_MOBILE_VALUE: return IS_MOBILE;
			case IS_NOWHERE_VALUE: return IS_NOWHERE;
			case IS_PERSONAL_DEVICE_VALUE: return IS_PERSONAL_DEVICE;
			case IS_POD_VALUE: return IS_POD;
			case IS_POOL_VALUE: return IS_POOL;
			case IS_PROXY_VALUE: return IS_PROXY;
			case IS_ROUTER_VALUE: return IS_ROUTER;
			case IS_SCALABLE_VALUE: return IS_SCALABLE;
			case IS_SOURCE_VALUE: return IS_SOURCE;
			case IS_SPAM_VALUE: return IS_SPAM;
			case IS_TRIVIAL_VALUE: return IS_TRIVIAL;
			case IS_WORLD_VALUE: return IS_WORLD;
			case LAST_INTERFACE_VALUE: return LAST_INTERFACE;
			case LOCATED_IN_VALUE: return LOCATED_IN;
			case MANAGED_BY_VALUE: return MANAGED_BY;
			case MANAGES_VALUE: return MANAGES;
			case MAY_BE_IN_VALUE: return MAY_BE_IN;
			case NEEDS_FIELD_VALUE: return NEEDS_FIELD;
			case NO_AUTH_N_VALUE: return NO_AUTH_N;
			case NO_DU_VALUE: return NO_DU;
			case NO_DX_VALUE: return NO_DX;
			case OPERATES_VALUE: return OPERATES;
			case OVERLAYS_VALUE: return OVERLAYS;
			case PENDS_AT_VALUE: return PENDS_AT;
			case PVIA_VALUE: return PVIA;
			case PAIRS_VIA_BLUETOOTH_VALUE: return PAIRS_VIA_BLUETOOTH;
			case PAIRS_VIA_USB_VALUE: return PAIRS_VIA_USB;
			case PATH_TO_VALUE: return PATH_TO;
			case POLLS_SENSOR_VALUE: return POLLS_SENSOR;
			case POSS_DATA_DEST_VALUE: return POSS_DATA_DEST;
			case POSS_REV_PATH_VALUE: return POSS_REV_PATH;
			case PROCESSES_VALUE: return PROCESSES;
			case PROPAGATES_TO_VALUE: return PROPAGATES_TO;
			case PROVIDED_BY_VALUE: return PROVIDED_BY;
			case PROVISIONED_BY_VALUE: return PROVISIONED_BY;
			case PROXY_AUTH_N_VALUE: return PROXY_AUTH_N;
			case READS_VALUE: return READS;
			case READS_SENSOR_VALUE: return READS_SENSOR;
			case RECEIVES_VALUE: return RECEIVES;
			case RECEIVES_FROM_SENSOR_VALUE: return RECEIVES_FROM_SENSOR;
			case RELATES_TO_VALUE: return RELATES_TO;
			case RELAYS_VALUE: return RELAYS;
			case RELAYS_ACCESS_VALUE: return RELAYS_ACCESS;
			case RESPONSIBLE_FOR_VALUE: return RESPONSIBLE_FOR;
			case REV_PATH_VALUE: return REV_PATH;
			case REV_RELAY_VALUE: return REV_RELAY;
			case RUNS_IN_VALUE: return RUNS_IN;
			case SENSES_VALUE: return SENSES;
			case SERVES_VALUE: return SERVES;
			case SHARES_CREDENTIALS_VALUE: return SHARES_CREDENTIALS;
			case SOURCE_DIRECT_VALUE: return SOURCE_DIRECT;
			case SOURCE_VIA_NAT_VALUE: return SOURCE_VIA_NAT;
			case START_VALUE: return START;
			case STORES_VALUE: return STORES;
			case STORES_COPY_VALUE: return STORES_COPY;
			case SUBJECT_TO_VALUE: return SUBJECT_TO;
			case TO_VALUE: return TO;
			case TO_INTERFACE_VALUE: return TO_INTERFACE;
			case TO_PHYSICAL_HOST_VALUE: return TO_PHYSICAL_HOST;
			case TO_PHYSICAL_INTERFACE_VALUE: return TO_PHYSICAL_INTERFACE;
			case TO_PROC_VALUE: return TO_PROC;
			case TO_SPACE_VALUE: return TO_SPACE;
			case TRAVERSES_VALUE: return TRAVERSES;
			case UPDATES_VALUE: return UPDATES;
			case UPDATES_CONTROLLER_VALUE: return UPDATES_CONTROLLER;
			case UPDATES_SENSOR_VALUE: return UPDATES_SENSOR;
			case USED_BY_VALUE: return USED_BY;
			case USED_FOR_VALUE: return USED_FOR;
			case USES_VALUE: return USES;
			case USES_AS_PROXY_VALUE: return USES_AS_PROXY;
			case USES_DATA_PATH_VALUE: return USES_DATA_PATH;
			case USES_FOR_AUTH_VALUE: return USES_FOR_AUTH;
			case USES_FOR_AUTH_Z_VALUE: return USES_FOR_AUTH_Z;
			case USES_INDIRECTLY_VALUE: return USES_INDIRECTLY;
			case USES_LOGICAL_ROUTE_VALUE: return USES_LOGICAL_ROUTE;
			case USES_PHYSICAL_ROUTE_VALUE: return USES_PHYSICAL_ROUTE;
			case USES_PHYSICAL_SUBNET_VALUE: return USES_PHYSICAL_SUBNET;
			case USES_REMOTELY_VALUE: return USES_REMOTELY;
			case USES_SERVICE_VALUE: return USES_SERVICE;
			case USES_VIA_DEPUTY_VALUE: return USES_VIA_DEPUTY;
			case USES_VIA_PROXY_VALUE: return USES_VIA_PROXY;
			case USES_VIA_RAS_VALUE: return USES_VIA_RAS;
			case VALIDATES_CHANNEL_VALUE: return VALIDATES_CHANNEL;
			case VIA_VALUE: return VIA;
			case VIA_HOST_CHANNEL_VALUE: return VIA_HOST_CHANNEL;
			case VIA_INTERFACE_VALUE: return VIA_INTERFACE;
			case VIA_PHYSICAL_PATH_VALUE: return VIA_PHYSICAL_PATH;
			case VIA_PHYSICAL_SUBNET_VALUE: return VIA_PHYSICAL_SUBNET;
			case VIA_PROXY_VALUE: return VIA_PROXY;
			case VIA_SHARED_CREDENTIALS_VALUE: return VIA_SHARED_CREDENTIALS;
			case VIA_SUBNET_VALUE: return VIA_SUBNET;
			case VIA_VIRTUAL_CHANNEL_VALUE: return VIA_VIRTUAL_CHANNEL;
			case VIEWS_DATA_VALUE: return VIEWS_DATA;
			case VISITS_VALUE: return VISITS;
			case VISITS_GATEWAY_VALUE: return VISITS_GATEWAY;
			case WORKS_FOR_VALUE: return WORKS_FOR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NetworkDomainKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //NetworkDomainKind
