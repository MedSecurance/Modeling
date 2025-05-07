/**
 */
package tvra;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TRVA Asset Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tvra.TvraPackage#getTRVAAssetKind()
 * @model
 * @generated
 */
public enum TRVAAssetKind implements Enumerator {
	/**
	 * The '<em><b>Abstract Subnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT_SUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	ABSTRACT_SUBNET(0, "AbstractSubnet", "AbstractSubnet"),

	/**
	 * The '<em><b>Access Context</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_CONTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS_CONTEXT(1, "AccessContext", "AccessContext"),

	/**
	 * The '<em><b>Adult</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADULT_VALUE
	 * @generated
	 * @ordered
	 */
	ADULT(2, "Adult", "Adult"),

	/**
	 * The '<em><b>API Server</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #API_SERVER_VALUE
	 * @generated
	 * @ordered
	 */
	API_SERVER(3, "APIServer", "APIServer"), /**
	 * The '<em><b>Application Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_PROCESS(4, "ApplicationProcess", "ApplicationProcess"), /**
	 * The '<em><b>Attack Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACK_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	ATTACK_PATH(5, "AttackPath", "AttackPath"), /**
	 * The '<em><b>Auth Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTH_CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	AUTH_CHANNEL(6, "AuthChannel", "AuthChannel"), /**
	 * The '<em><b>Auth Client</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTH_CLIENT_VALUE
	 * @generated
	 * @ordered
	 */
	AUTH_CLIENT(7, "AuthClient", "AuthClient"), /**
	 * The '<em><b>Auth Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTH_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	AUTH_SERVICE(8, "AuthService", "AuthService"), /**
	 * The '<em><b>Base Station</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE_STATION_VALUE
	 * @generated
	 * @ordered
	 */
	BASE_STATION(9, "BaseStation", "BaseStation"), /**
	 * The '<em><b>Biometric Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIOMETRIC_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	BIOMETRIC_DATA(10, "BiometricData", "BiometricData"), /**
	 * The '<em><b>Bluetooth Pair</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUETOOTH_PAIR_VALUE
	 * @generated
	 * @ordered
	 */
	BLUETOOTH_PAIR(11, "BluetoothPair", "BluetoothPair"), /**
	 * The '<em><b>Bounded Space</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOUNDED_SPACE_VALUE
	 * @generated
	 * @ordered
	 */
	BOUNDED_SPACE(12, "BoundedSpace", "BoundedSpace"), /**
	 * The '<em><b>Cellular Network</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELLULAR_NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	CELLULAR_NETWORK(13, "CellularNetwork", "CellularNetwork"), /**
	 * The '<em><b>Child</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD_VALUE
	 * @generated
	 * @ordered
	 */
	CHILD(14, "Child", "Child"), /**
	 * The '<em><b>Client Attack Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT_ATTACK_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	CLIENT_ATTACK_PATH(15, "ClientAttackPath", "ClientAttackPath"), /**
	 * The '<em><b>Client Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT_CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	CLIENT_CHANNEL(16, "ClientChannel", "ClientChannel"), /**
	 * The '<em><b>Client Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	CLIENT_PATH(17, "ClientPath", "ClientPath"), /**
	 * The '<em><b>Closed Client Attack Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_CLIENT_ATTACK_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED_CLIENT_ATTACK_PATH(18, "ClosedClientAttackPath", "ClosedClientAttackPath"), /**
	 * The '<em><b>Closed Segment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_SEGMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED_SEGMENT(19, "ClosedSegment", "ClosedSegment"), /**
	 * The '<em><b>Closed Service Attack Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_SERVICE_ATTACK_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED_SERVICE_ATTACK_PATH(20, "ClosedServiceAttackPath", "ClosedServiceAttackPath"), /**
	 * The '<em><b>Cluster</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_VALUE
	 * @generated
	 * @ordered
	 */
	CLUSTER(21, "Cluster", "Cluster"), /**
	 * The '<em><b>Cluster Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	CLUSTER_HOST(22, "ClusterHost", "ClusterHost"), /**
	 * The '<em><b>Cluster IP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_IP_VALUE
	 * @generated
	 * @ordered
	 */
	CLUSTER_IP(23, "ClusterIP", "ClusterIP"), /**
	 * The '<em><b>Cmd Line Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CMD_LINE_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	CMD_LINE_PROCESS(24, "CmdLineProcess", "CmdLineProcess"), /**
	 * The '<em><b>Comms Asset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMS_ASSET_VALUE
	 * @generated
	 * @ordered
	 */
	COMMS_ASSET(25, "CommsAsset", "CommsAsset"), /**
	 * The '<em><b>Connection Asset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTION_ASSET_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTION_ASSET(26, "ConnectionAsset", "ConnectionAsset"), /**
	 * The '<em><b>Connection Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTION_CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTION_CHANNEL(27, "ConnectionChannel", "ConnectionChannel"), /**
	 * The '<em><b>Connection Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTION_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTION_PATH(28, "ConnectionPath", "ConnectionPath"), /**
	 * The '<em><b>Console Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSOLE_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	CONSOLE_HOST(29, "ConsoleHost", "ConsoleHost"), /**
	 * The '<em><b>Console Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSOLE_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	CONSOLE_PROCESS(30, "ConsoleProcess", "ConsoleProcess"), /**
	 * The '<em><b>Container</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINER_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINER(31, "Container", "Container"), /**
	 * The '<em><b>Control Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROL_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROL_DATA(32, "ControlData", "ControlData"), /**
	 * The '<em><b>Control Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROL_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROL_PROCESS(33, "ControlProcess", "ControlProcess"), /**
	 * The '<em><b>Controller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROLLER(34, "Controller", "Controller"), /**
	 * The '<em><b>Core Network</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORE_NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	CORE_NETWORK(35, "CoreNetwork", "CoreNetwork"), /**
	 * The '<em><b>Core Router</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORE_ROUTER_VALUE
	 * @generated
	 * @ordered
	 */
	CORE_ROUTER(36, "CoreRouter", "CoreRouter"), /**
	 * The '<em><b>DB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DB_VALUE
	 * @generated
	 * @ordered
	 */
	DB(37, "DB", "DB"), /**
	 * The '<em><b>Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_VALUE
	 * @generated
	 * @ordered
	 */
	DATA(38, "Data", "Data"), /**
	 * The '<em><b>Data Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_ACCESS(39, "DataAccess", "DataAccess"), /**
	 * The '<em><b>Data Asset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_ASSET_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_ASSET(40, "DataAsset", "DataAsset"), /**
	 * The '<em><b>Data Cache</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_CACHE_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_CACHE(41, "DataCache", "DataCache"), /**
	 * The '<em><b>Data Centre</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_CENTRE_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_CENTRE(42, "DataCentre", "DataCentre"), /**
	 * The '<em><b>Data Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_CHANNEL(43, "DataChannel", "DataChannel"), /**
	 * The '<em><b>Data Container</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_CONTAINER_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_CONTAINER(44, "DataContainer", "DataContainer"), /**
	 * The '<em><b>Data Copy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_COPY_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_COPY(45, "DataCopy", "DataCopy"), /**
	 * The '<em><b>Data Exchange</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_EXCHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_EXCHANGE(46, "DataExchange", "DataExchange"), /**
	 * The '<em><b>Data Field</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_FIELD_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_FIELD(47, "DataField", "DataField"), /**
	 * The '<em><b>Data Flow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_FLOW_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_FLOW(48, "DataFlow", "DataFlow"), /**
	 * The '<em><b>Data Inference Asset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_INFERENCE_ASSET_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_INFERENCE_ASSET(49, "DataInferenceAsset", "DataInferenceAsset"), /**
	 * The '<em><b>Data Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_INPUT(50, "DataInput", "DataInput"), /**
	 * The '<em><b>Data Lifecycle Asset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_LIFECYCLE_ASSET_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_LIFECYCLE_ASSET(51, "DataLifecycleAsset", "DataLifecycleAsset"), /**
	 * The '<em><b>Data Output</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_OUTPUT_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_OUTPUT(52, "DataOutput", "DataOutput"), /**
	 * The '<em><b>Data Palette</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PALETTE_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_PALETTE(53, "DataPalette", "DataPalette"), /**
	 * The '<em><b>Data Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_PATH(54, "DataPath", "DataPath"), /**
	 * The '<em><b>Data Pool</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_POOL_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_POOL(55, "DataPool", "DataPool"), /**
	 * The '<em><b>Data Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_PROCESS(56, "DataProcess", "DataProcess"), /**
	 * The '<em><b>Data Relay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_RELAY_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_RELAY(57, "DataRelay", "DataRelay"), /**
	 * The '<em><b>Data Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_SERVICE(58, "DataService", "DataService"), /**
	 * The '<em><b>Data Step</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_STEP_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_STEP(59, "DataStep", "DataStep"), /**
	 * The '<em><b>Data Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_UPDATE(60, "DataUpdate", "DataUpdate"), /**
	 * The '<em><b>Data Use</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_USE_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_USE(61, "DataUse", "DataUse"), /**
	 * The '<em><b>De NAT Segment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DE_NAT_SEGMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DE_NAT_SEGMENT(62, "DeNATSegment", "DeNATSegment"), /**
	 * The '<em><b>Debug Marker</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBUG_MARKER_VALUE
	 * @generated
	 * @ordered
	 */
	DEBUG_MARKER(63, "DebugMarker", "DebugMarker"), /**
	 * The '<em><b>Desktop Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESKTOP_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DESKTOP_SERVICE(64, "DesktopService", "DesktopService"), /**
	 * The '<em><b>Dumb Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUMB_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	DUMB_HOST(65, "DumbHost", "DumbHost"), /**
	 * The '<em><b>Editor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDITOR_VALUE
	 * @generated
	 * @ordered
	 */
	EDITOR(66, "Editor", "Editor"), /**
	 * The '<em><b>Email Client</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL_CLIENT_VALUE
	 * @generated
	 * @ordered
	 */
	EMAIL_CLIENT(67, "EmailClient", "EmailClient"), /**
	 * The '<em><b>Email MUA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL_MUA_VALUE
	 * @generated
	 * @ordered
	 */
	EMAIL_MUA(68, "EmailMUA", "EmailMUA"), /**
	 * The '<em><b>Email MX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL_MX_VALUE
	 * @generated
	 * @ordered
	 */
	EMAIL_MX(69, "EmailMX", "EmailMX"), /**
	 * The '<em><b>Email Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	EMAIL_SERVICE(70, "EmailService", "EmailService"), /**
	 * The '<em><b>Fixed Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	FIXED_HOST(71, "FixedHost", "FixedHost"), /**
	 * The '<em><b>Free Segment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_SEGMENT_VALUE
	 * @generated
	 * @ordered
	 */
	FREE_SEGMENT(72, "FreeSegment", "FreeSegment"), /**
	 * The '<em><b>GDPR Art94 Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GDPR_ART94_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	GDPR_ART94_DATA(73, "GDPRArt94Data", "GDPRArt94Data"), /**
	 * The '<em><b>GDPR Art9 Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GDPR_ART9_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	GDPR_ART9_DATA(74, "GDPRArt9Data", "GDPRArt9Data"), /**
	 * The '<em><b>General Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	GENERAL_HOST(75, "GeneralHost", "GeneralHost"), /**
	 * The '<em><b>General Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	GENERAL_PROCESS(76, "GeneralProcess", "GeneralProcess"), /**
	 * The '<em><b>Genetic Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENETIC_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	GENETIC_DATA(77, "GeneticData", "GeneticData"), /**
	 * The '<em><b>Governance Asset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOVERNANCE_ASSET_VALUE
	 * @generated
	 * @ordered
	 */
	GOVERNANCE_ASSET(78, "GovernanceAsset", "GovernanceAsset"), /**
	 * The '<em><b>Governance Palette</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOVERNANCE_PALETTE_VALUE
	 * @generated
	 * @ordered
	 */
	GOVERNANCE_PALETTE(79, "GovernancePalette", "GovernancePalette"), /**
	 * The '<em><b>HContext</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCONTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	HCONTEXT(80, "HContext", "HContext"), /**
	 * The '<em><b>Health Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEALTH_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	HEALTH_DATA(81, "HealthData", "HealthData"), /**
	 * The '<em><b>Health Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEALTH_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	HEALTH_SENSOR(82, "HealthSensor", "HealthSensor"), /**
	 * The '<em><b>Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOST_VALUE
	 * @generated
	 * @ordered
	 */
	HOST(83, "Host", "Host"), /**
	 * The '<em><b>Host Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOST_CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	HOST_CHANNEL(84, "HostChannel", "HostChannel"), /**
	 * The '<em><b>Host Context</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOST_CONTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	HOST_CONTEXT(85, "HostContext", "HostContext"), /**
	 * The '<em><b>Host LAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOST_LAN_VALUE
	 * @generated
	 * @ordered
	 */
	HOST_LAN(86, "HostLAN", "HostLAN"), /**
	 * The '<em><b>Host Net Context</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOST_NET_CONTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	HOST_NET_CONTEXT(87, "HostNetContext", "HostNetContext"), /**
	 * The '<em><b>Host Palette</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOST_PALETTE_VALUE
	 * @generated
	 * @ordered
	 */
	HOST_PALETTE(88, "HostPalette", "HostPalette"), /**
	 * The '<em><b>Human</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMAN_VALUE
	 * @generated
	 * @ordered
	 */
	HUMAN(89, "Human", "Human"), /**
	 * The '<em><b>Ingress</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INGRESS_VALUE
	 * @generated
	 * @ordered
	 */
	INGRESS(90, "Ingress", "Ingress"), /**
	 * The '<em><b>Input Pool</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_POOL_VALUE
	 * @generated
	 * @ordered
	 */
	INPUT_POOL(91, "InputPool", "InputPool"), /**
	 * The '<em><b>Interactive Application</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERACTIVE_APPLICATION_VALUE
	 * @generated
	 * @ordered
	 */
	INTERACTIVE_APPLICATION(92, "InteractiveApplication", "InteractiveApplication"), /**
	 * The '<em><b>Interactive Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERACTIVE_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	INTERACTIVE_HOST(93, "InteractiveHost", "InteractiveHost"), /**
	 * The '<em><b>Interactive Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERACTIVE_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	INTERACTIVE_PROCESS(94, "InteractiveProcess", "InteractiveProcess"), /**
	 * The '<em><b>Interface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERFACE(95, "Interface", "Interface"), /**
	 * The '<em><b>Internal Subnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_SUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNAL_SUBNET(96, "InternalSubnet", "InternalSubnet"), /**
	 * The '<em><b>Internet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNET_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNET(97, "Internet", "Internet"), /**
	 * The '<em><b>Io TProcess</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IO_TPROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	IO_TPROCESS(98, "IoTProcess", "IoTProcess"), /**
	 * The '<em><b>Jurisdiction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JURISDICTION_VALUE
	 * @generated
	 * @ordered
	 */
	JURISDICTION(99, "Jurisdiction", "Jurisdiction"), /**
	 * The '<em><b>L01 Subnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L01_SUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	L01_SUBNET(100, "L01Subnet", "L01Subnet"), /**
	 * The '<em><b>L0 Subnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L0_SUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	L0_SUBNET(101, "L0Subnet", "L0Subnet"), /**
	 * The '<em><b>L1 Subnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L1_SUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	L1_SUBNET(102, "L1Subnet", "L1Subnet"), /**
	 * The '<em><b>L23 Subnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L23_SUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	L23_SUBNET(103, "L23Subnet", "L23Subnet"), /**
	 * The '<em><b>L2 Subnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L2_SUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	L2_SUBNET(104, "L2Subnet", "L2Subnet"), /**
	 * The '<em><b>L3 Subnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L3_SUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	L3_SUBNET(105, "L3Subnet", "L3Subnet"), /**
	 * The '<em><b>Legal Entity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGAL_ENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	LEGAL_ENTITY(106, "LegalEntity", "LegalEntity"), /**
	 * The '<em><b>Legal Organisation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGAL_ORGANISATION_VALUE
	 * @generated
	 * @ordered
	 */
	LEGAL_ORGANISATION(107, "LegalOrganisation", "LegalOrganisation"), /**
	 * The '<em><b>Logical Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGICAL_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	LOGICAL_PATH(108, "LogicalPath", "LogicalPath"), /**
	 * The '<em><b>Logical Route</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGICAL_ROUTE_VALUE
	 * @generated
	 * @ordered
	 */
	LOGICAL_ROUTE(109, "LogicalRoute", "LogicalRoute"), /**
	 * The '<em><b>Logical Segment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGICAL_SEGMENT_VALUE
	 * @generated
	 * @ordered
	 */
	LOGICAL_SEGMENT(110, "LogicalSegment", "LogicalSegment"), /**
	 * The '<em><b>Logical Subnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGICAL_SUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	LOGICAL_SUBNET(111, "LogicalSubnet", "LogicalSubnet"), /**
	 * The '<em><b>Login Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIN_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIN_SERVICE(112, "LoginService", "LoginService"), /**
	 * The '<em><b>Master</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER(113, "Master", "Master"), /**
	 * The '<em><b>Mesh Routing Segment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESH_ROUTING_SEGMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MESH_ROUTING_SEGMENT(114, "MeshRoutingSegment", "MeshRoutingSegment"), /**
	 * The '<em><b>Mobile Client</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOBILE_CLIENT_VALUE
	 * @generated
	 * @ordered
	 */
	MOBILE_CLIENT(115, "MobileClient", "MobileClient"), /**
	 * The '<em><b>Mobile Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOBILE_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	MOBILE_HOST(116, "MobileHost", "MobileHost"), /**
	 * The '<em><b>NAT Segment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAT_SEGMENT_VALUE
	 * @generated
	 * @ordered
	 */
	NAT_SEGMENT(117, "NATSegment", "NATSegment"), /**
	 * The '<em><b>NPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NPE_VALUE
	 * @generated
	 * @ordered
	 */
	NPE(118, "NPE", "NPE"), /**
	 * The '<em><b>Network Asset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_ASSET_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK_ASSET(119, "NetworkAsset", "NetworkAsset"), /**
	 * The '<em><b>Network Inference Asset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_INFERENCE_ASSET_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK_INFERENCE_ASSET(120, "NetworkInferenceAsset", "NetworkInferenceAsset"), /**
	 * The '<em><b>Network Palette</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_PALETTE_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK_PALETTE(121, "NetworkPalette", "NetworkPalette"), /**
	 * The '<em><b>Network Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK_PATH(122, "NetworkPath", "NetworkPath"), /**
	 * The '<em><b>Notebook</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTEBOOK_VALUE
	 * @generated
	 * @ordered
	 */
	NOTEBOOK(123, "Notebook", "Notebook"), /**
	 * The '<em><b>Open Client Attack Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_CLIENT_ATTACK_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_CLIENT_ATTACK_PATH(124, "OpenClientAttackPath", "OpenClientAttackPath"), /**
	 * The '<em><b>Open Segment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_SEGMENT_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_SEGMENT(125, "OpenSegment", "OpenSegment"), /**
	 * The '<em><b>Open Service Attack Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_SERVICE_ATTACK_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_SERVICE_ATTACK_PATH(126, "OpenServiceAttackPath", "OpenServiceAttackPath"), /**
	 * The '<em><b>Organisation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGANISATION_VALUE
	 * @generated
	 * @ordered
	 */
	ORGANISATION(127, "Organisation", "Organisation"), /**
	 * The '<em><b>Output Pool</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPUT_POOL_VALUE
	 * @generated
	 * @ordered
	 */
	OUTPUT_POOL(128, "OutputPool", "OutputPool"), /**
	 * The '<em><b>Overlay Subnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERLAY_SUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	OVERLAY_SUBNET(129, "OverlaySubnet", "OverlaySubnet"), /**
	 * The '<em><b>PContext</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PCONTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	PCONTEXT(130, "PContext", "PContext"), /**
	 * The '<em><b>PPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PPE_VALUE
	 * @generated
	 * @ordered
	 */
	PPE(131, "PPE", "PPE"), /**
	 * The '<em><b>Personal Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSONAL_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	PERSONAL_HOST(132, "PersonalHost", "PersonalHost"), /**
	 * The '<em><b>Physical Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	PHYSICAL_HOST(133, "PhysicalHost", "PhysicalHost"), /**
	 * The '<em><b>Physical Palette</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_PALETTE_VALUE
	 * @generated
	 * @ordered
	 */
	PHYSICAL_PALETTE(134, "PhysicalPalette", "PhysicalPalette"), /**
	 * The '<em><b>Physical Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	PHYSICAL_PATH(135, "PhysicalPath", "PhysicalPath"), /**
	 * The '<em><b>Physical Subnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_SUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	PHYSICAL_SUBNET(136, "PhysicalSubnet", "PhysicalSubnet"), /**
	 * The '<em><b>Pod</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POD_VALUE
	 * @generated
	 * @ordered
	 */
	POD(137, "Pod", "Pod"), /**
	 * The '<em><b>Private Cellular Network</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_CELLULAR_NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVATE_CELLULAR_NETWORK(138, "PrivateCellularNetwork", "PrivateCellularNetwork"), /**
	 * The '<em><b>Private Space</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_SPACE_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVATE_SPACE(139, "PrivateSpace", "PrivateSpace"), /**
	 * The '<em><b>Proc Net Context</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROC_NET_CONTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	PROC_NET_CONTEXT(140, "ProcNetContext", "ProcNetContext"), /**
	 * The '<em><b>Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESS(141, "Process", "Process"), /**
	 * The '<em><b>Process Context</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS_CONTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESS_CONTEXT(142, "ProcessContext", "ProcessContext"), /**
	 * The '<em><b>Process Palette</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS_PALETTE_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESS_PALETTE(143, "ProcessPalette", "ProcessPalette"), /**
	 * The '<em><b>Public Cellular Network</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_CELLULAR_NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLIC_CELLULAR_NETWORK(144, "PublicCellularNetwork", "PublicCellularNetwork"), /**
	 * The '<em><b>Public Space</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_SPACE_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLIC_SPACE(145, "PublicSpace", "PublicSpace"), /**
	 * The '<em><b>RAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAN_VALUE
	 * @generated
	 * @ordered
	 */
	RAN(146, "RAN", "RAN"), /**
	 * The '<em><b>Radio Subnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIO_SUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	RADIO_SUBNET(147, "RadioSubnet", "RadioSubnet"), /**
	 * The '<em><b>Remote Access Client</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_ACCESS_CLIENT_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE_ACCESS_CLIENT(148, "RemoteAccessClient", "RemoteAccessClient"), /**
	 * The '<em><b>Remote Access Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_ACCESS_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE_ACCESS_SERVICE(149, "RemoteAccessService", "RemoteAccessService"), /**
	 * The '<em><b>Remote Desktop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_DESKTOP_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE_DESKTOP(150, "RemoteDesktop", "RemoteDesktop"), /**
	 * The '<em><b>Remote Terminal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_TERMINAL_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE_TERMINAL(151, "RemoteTerminal", "RemoteTerminal"), /**
	 * The '<em><b>Remote User Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_USER_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE_USER_ACCESS(152, "RemoteUserAccess", "RemoteUserAccess"), /**
	 * The '<em><b>Removable Media</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVABLE_MEDIA_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVABLE_MEDIA(153, "RemovableMedia", "RemovableMedia"), /**
	 * The '<em><b>Router</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUTER_VALUE
	 * @generated
	 * @ordered
	 */
	ROUTER(154, "Router", "Router"), /**
	 * The '<em><b>SMS Client</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMS_CLIENT_VALUE
	 * @generated
	 * @ordered
	 */
	SMS_CLIENT(155, "SMSClient", "SMSClient"), /**
	 * The '<em><b>Scalable Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCALABLE_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	SCALABLE_HOST(156, "ScalableHost", "ScalableHost"), /**
	 * The '<em><b>Sensed Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSED_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	SENSED_DATA(157, "SensedData", "SensedData"), /**
	 * The '<em><b>Sensitive Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSITIVE_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	SENSITIVE_DATA(158, "SensitiveData", "SensitiveData"), /**
	 * The '<em><b>Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	SENSOR(159, "Sensor", "Sensor"), /**
	 * The '<em><b>Sensor Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSOR_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	SENSOR_PROCESS(160, "SensorProcess", "SensorProcess"), /**
	 * The '<em><b>Server</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVER_VALUE
	 * @generated
	 * @ordered
	 */
	SERVER(161, "Server", "Server"), /**
	 * The '<em><b>Service Attack Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_ATTACK_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_ATTACK_PATH(162, "ServiceAttackPath", "ServiceAttackPath"), /**
	 * The '<em><b>Service Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_CHANNEL(163, "ServiceChannel", "ServiceChannel"), /**
	 * The '<em><b>Service Proxy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_PROXY_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_PROXY(164, "ServiceProxy", "ServiceProxy"), /**
	 * The '<em><b>Shell Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHELL_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	SHELL_HOST(165, "ShellHost", "ShellHost"), /**
	 * The '<em><b>Simple Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE_HOST(166, "SimpleHost", "SimpleHost"), /**
	 * The '<em><b>Simple Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE_PROCESS(167, "SimpleProcess", "SimpleProcess"), /**
	 * The '<em><b>Smartphone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMARTPHONE_VALUE
	 * @generated
	 * @ordered
	 */
	SMARTPHONE(168, "Smartphone", "Smartphone"), /**
	 * The '<em><b>Smartwatch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMARTWATCH_VALUE
	 * @generated
	 * @ordered
	 */
	SMARTWATCH(169, "Smartwatch", "Smartwatch"), /**
	 * The '<em><b>Socket LAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCKET_LAN_VALUE
	 * @generated
	 * @ordered
	 */
	SOCKET_LAN(170, "SocketLAN", "SocketLAN"), /**
	 * The '<em><b>Space</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPACE_VALUE
	 * @generated
	 * @ordered
	 */
	SPACE(171, "Space", "Space"), /**
	 * The '<em><b>Spam Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPAM_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	SPAM_DATA(172, "SpamData", "SpamData"), /**
	 * The '<em><b>Special Category Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_CATEGORY_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIAL_CATEGORY_DATA(173, "SpecialCategoryData", "SpecialCategoryData"), /**
	 * The '<em><b>Stakeholder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STAKEHOLDER_VALUE
	 * @generated
	 * @ordered
	 */
	STAKEHOLDER(174, "Stakeholder", "Stakeholder"), /**
	 * The '<em><b>Stored Data Pool</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORED_DATA_POOL_VALUE
	 * @generated
	 * @ordered
	 */
	STORED_DATA_POOL(175, "StoredDataPool", "StoredDataPool"), /**
	 * The '<em><b>Tablet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLET_VALUE
	 * @generated
	 * @ordered
	 */
	TABLET(176, "Tablet", "Tablet"), /**
	 * The '<em><b>Temp Data Relay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMP_DATA_RELAY_VALUE
	 * @generated
	 * @ordered
	 */
	TEMP_DATA_RELAY(177, "TempDataRelay", "TempDataRelay"), /**
	 * The '<em><b>Tethering Segment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TETHERING_SEGMENT_VALUE
	 * @generated
	 * @ordered
	 */
	TETHERING_SEGMENT(178, "TetheringSegment", "TetheringSegment"), /**
	 * The '<em><b>Text Editor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_EDITOR_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_EDITOR(179, "TextEditor", "TextEditor"), /**
	 * The '<em><b>Thing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THING_VALUE
	 * @generated
	 * @ordered
	 */
	THING(180, "Thing", "Thing"), /**
	 * The '<em><b>Trivial Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIVIAL_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	TRIVIAL_HOST(181, "TrivialHost", "TrivialHost"), /**
	 * The '<em><b>Trivial Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIVIAL_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	TRIVIAL_PROCESS(182, "TrivialProcess", "TrivialProcess"), /**
	 * The '<em><b>Type Overlay Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_OVERLAY_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE_OVERLAY_DATA(183, "TypeOverlayData", "TypeOverlayData"), /**
	 * The '<em><b>Type Overlay Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_OVERLAY_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE_OVERLAY_HOST(184, "TypeOverlayHost", "TypeOverlayHost"), /**
	 * The '<em><b>Type Overlay Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_OVERLAY_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE_OVERLAY_PROCESS(185, "TypeOverlayProcess", "TypeOverlayProcess"), /**
	 * The '<em><b>Type Overlay Subnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_OVERLAY_SUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE_OVERLAY_SUBNET(186, "TypeOverlaySubnet", "TypeOverlaySubnet"), /**
	 * The '<em><b>USB Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USB_DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	USB_DEVICE(187, "USBDevice", "USBDevice"), /**
	 * The '<em><b>USB Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USB_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	USB_HOST(188, "USBHost", "USBHost"), /**
	 * The '<em><b>USB Pair</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USB_PAIR_VALUE
	 * @generated
	 * @ordered
	 */
	USB_PAIR(189, "USBPair", "USBPair"), /**
	 * The '<em><b>Update Pool</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_POOL_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE_POOL(190, "UpdatePool", "UpdatePool"), /**
	 * The '<em><b>VCluster</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VCLUSTER_VALUE
	 * @generated
	 * @ordered
	 */
	VCLUSTER(191, "VCluster", "VCluster"), /**
	 * The '<em><b>VM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VM_VALUE
	 * @generated
	 * @ordered
	 */
	VM(192, "VM", "VM"), /**
	 * The '<em><b>VPN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VPN_VALUE
	 * @generated
	 * @ordered
	 */
	VPN(193, "VPN", "VPN"), /**
	 * The '<em><b>VRouter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VROUTER_VALUE
	 * @generated
	 * @ordered
	 */
	VROUTER(194, "VRouter", "VRouter"), /**
	 * The '<em><b>VXLAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VXLAN_VALUE
	 * @generated
	 * @ordered
	 */
	VXLAN(195, "VXLAN", "VXLAN"), /**
	 * The '<em><b>Virtual Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUAL_CHANNEL(196, "VirtualChannel", "VirtualChannel"), /**
	 * The '<em><b>Virtual Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUAL_HOST(197, "VirtualHost", "VirtualHost"), /**
	 * The '<em><b>Virtual Subnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_SUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUAL_SUBNET(198, "VirtualSubnet", "VirtualSubnet"), /**
	 * The '<em><b>Web App</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_APP_VALUE
	 * @generated
	 * @ordered
	 */
	WEB_APP(199, "WebApp", "WebApp"), /**
	 * The '<em><b>Web Browser</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_BROWSER_VALUE
	 * @generated
	 * @ordered
	 */
	WEB_BROWSER(200, "WebBrowser", "WebBrowser"), /**
	 * The '<em><b>Web Client</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_CLIENT_VALUE
	 * @generated
	 * @ordered
	 */
	WEB_CLIENT(201, "WebClient", "WebClient"), /**
	 * The '<em><b>Wi Fi LAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WI_FI_LAN_VALUE
	 * @generated
	 * @ordered
	 */
	WI_FI_LAN(202, "WiFiLAN", "WiFiLAN"), /**
	 * The '<em><b>Wired LAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIRED_LAN_VALUE
	 * @generated
	 * @ordered
	 */
	WIRED_LAN(203, "WiredLAN", "WiredLAN"), /**
	 * The '<em><b>Wired Subnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIRED_SUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	WIRED_SUBNET(204, "WiredSubnet", "WiredSubnet"), /**
	 * The '<em><b>Worker</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKER_VALUE
	 * @generated
	 * @ordered
	 */
	WORKER(205, "Worker", "Worker"), /**
	 * The '<em><b>Workstation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKSTATION_VALUE
	 * @generated
	 * @ordered
	 */
	WORKSTATION(206, "Workstation", "Workstation"), /**
	 * The '<em><b>World</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORLD_VALUE
	 * @generated
	 * @ordered
	 */
	WORLD(207, "World", "World");

	/**
	 * The '<em><b>Abstract Subnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT_SUBNET
	 * @model name="AbstractSubnet"
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_SUBNET_VALUE = 0;

	/**
	 * The '<em><b>Access Context</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_CONTEXT
	 * @model name="AccessContext"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_CONTEXT_VALUE = 1;

	/**
	 * The '<em><b>Adult</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADULT
	 * @model name="Adult"
	 * @generated
	 * @ordered
	 */
	public static final int ADULT_VALUE = 2;

	/**
	 * The '<em><b>API Server</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #API_SERVER
	 * @model name="APIServer"
	 * @generated
	 * @ordered
	 */
	public static final int API_SERVER_VALUE = 3;

	/**
	 * The '<em><b>Application Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_PROCESS
	 * @model name="ApplicationProcess"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_PROCESS_VALUE = 4;

	/**
	 * The '<em><b>Attack Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACK_PATH
	 * @model name="AttackPath"
	 * @generated
	 * @ordered
	 */
	public static final int ATTACK_PATH_VALUE = 5;

	/**
	 * The '<em><b>Auth Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTH_CHANNEL
	 * @model name="AuthChannel"
	 * @generated
	 * @ordered
	 */
	public static final int AUTH_CHANNEL_VALUE = 6;

	/**
	 * The '<em><b>Auth Client</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTH_CLIENT
	 * @model name="AuthClient"
	 * @generated
	 * @ordered
	 */
	public static final int AUTH_CLIENT_VALUE = 7;

	/**
	 * The '<em><b>Auth Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTH_SERVICE
	 * @model name="AuthService"
	 * @generated
	 * @ordered
	 */
	public static final int AUTH_SERVICE_VALUE = 8;

	/**
	 * The '<em><b>Base Station</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE_STATION
	 * @model name="BaseStation"
	 * @generated
	 * @ordered
	 */
	public static final int BASE_STATION_VALUE = 9;

	/**
	 * The '<em><b>Biometric Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIOMETRIC_DATA
	 * @model name="BiometricData"
	 * @generated
	 * @ordered
	 */
	public static final int BIOMETRIC_DATA_VALUE = 10;

	/**
	 * The '<em><b>Bluetooth Pair</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUETOOTH_PAIR
	 * @model name="BluetoothPair"
	 * @generated
	 * @ordered
	 */
	public static final int BLUETOOTH_PAIR_VALUE = 11;

	/**
	 * The '<em><b>Bounded Space</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOUNDED_SPACE
	 * @model name="BoundedSpace"
	 * @generated
	 * @ordered
	 */
	public static final int BOUNDED_SPACE_VALUE = 12;

	/**
	 * The '<em><b>Cellular Network</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELLULAR_NETWORK
	 * @model name="CellularNetwork"
	 * @generated
	 * @ordered
	 */
	public static final int CELLULAR_NETWORK_VALUE = 13;

	/**
	 * The '<em><b>Child</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD
	 * @model name="Child"
	 * @generated
	 * @ordered
	 */
	public static final int CHILD_VALUE = 14;

	/**
	 * The '<em><b>Client Attack Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT_ATTACK_PATH
	 * @model name="ClientAttackPath"
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_ATTACK_PATH_VALUE = 15;

	/**
	 * The '<em><b>Client Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT_CHANNEL
	 * @model name="ClientChannel"
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_CHANNEL_VALUE = 16;

	/**
	 * The '<em><b>Client Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT_PATH
	 * @model name="ClientPath"
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_PATH_VALUE = 17;

	/**
	 * The '<em><b>Closed Client Attack Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_CLIENT_ATTACK_PATH
	 * @model name="ClosedClientAttackPath"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_CLIENT_ATTACK_PATH_VALUE = 18;

	/**
	 * The '<em><b>Closed Segment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_SEGMENT
	 * @model name="ClosedSegment"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_SEGMENT_VALUE = 19;

	/**
	 * The '<em><b>Closed Service Attack Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_SERVICE_ATTACK_PATH
	 * @model name="ClosedServiceAttackPath"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_SERVICE_ATTACK_PATH_VALUE = 20;

	/**
	 * The '<em><b>Cluster</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER
	 * @model name="Cluster"
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTER_VALUE = 21;

	/**
	 * The '<em><b>Cluster Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_HOST
	 * @model name="ClusterHost"
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTER_HOST_VALUE = 22;

	/**
	 * The '<em><b>Cluster IP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_IP
	 * @model name="ClusterIP"
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTER_IP_VALUE = 23;

	/**
	 * The '<em><b>Cmd Line Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CMD_LINE_PROCESS
	 * @model name="CmdLineProcess"
	 * @generated
	 * @ordered
	 */
	public static final int CMD_LINE_PROCESS_VALUE = 24;

	/**
	 * The '<em><b>Comms Asset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMS_ASSET
	 * @model name="CommsAsset"
	 * @generated
	 * @ordered
	 */
	public static final int COMMS_ASSET_VALUE = 25;

	/**
	 * The '<em><b>Connection Asset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTION_ASSET
	 * @model name="ConnectionAsset"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_ASSET_VALUE = 26;

	/**
	 * The '<em><b>Connection Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTION_CHANNEL
	 * @model name="ConnectionChannel"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_CHANNEL_VALUE = 27;

	/**
	 * The '<em><b>Connection Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTION_PATH
	 * @model name="ConnectionPath"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_PATH_VALUE = 28;

	/**
	 * The '<em><b>Console Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSOLE_HOST
	 * @model name="ConsoleHost"
	 * @generated
	 * @ordered
	 */
	public static final int CONSOLE_HOST_VALUE = 29;

	/**
	 * The '<em><b>Console Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSOLE_PROCESS
	 * @model name="ConsoleProcess"
	 * @generated
	 * @ordered
	 */
	public static final int CONSOLE_PROCESS_VALUE = 30;

	/**
	 * The '<em><b>Container</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINER
	 * @model name="Container"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER_VALUE = 31;

	/**
	 * The '<em><b>Control Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROL_DATA
	 * @model name="ControlData"
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_DATA_VALUE = 32;

	/**
	 * The '<em><b>Control Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROL_PROCESS
	 * @model name="ControlProcess"
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_PROCESS_VALUE = 33;

	/**
	 * The '<em><b>Controller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLLER
	 * @model name="Controller"
	 * @generated
	 * @ordered
	 */
	public static final int CONTROLLER_VALUE = 34;

	/**
	 * The '<em><b>Core Network</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORE_NETWORK
	 * @model name="CoreNetwork"
	 * @generated
	 * @ordered
	 */
	public static final int CORE_NETWORK_VALUE = 35;

	/**
	 * The '<em><b>Core Router</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORE_ROUTER
	 * @model name="CoreRouter"
	 * @generated
	 * @ordered
	 */
	public static final int CORE_ROUTER_VALUE = 36;

	/**
	 * The '<em><b>DB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DB_VALUE = 37;

	/**
	 * The '<em><b>Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA
	 * @model name="Data"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_VALUE = 38;

	/**
	 * The '<em><b>Data Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_ACCESS
	 * @model name="DataAccess"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_ACCESS_VALUE = 39;

	/**
	 * The '<em><b>Data Asset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_ASSET
	 * @model name="DataAsset"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_ASSET_VALUE = 40;

	/**
	 * The '<em><b>Data Cache</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_CACHE
	 * @model name="DataCache"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_CACHE_VALUE = 41;

	/**
	 * The '<em><b>Data Centre</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_CENTRE
	 * @model name="DataCentre"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_CENTRE_VALUE = 42;

	/**
	 * The '<em><b>Data Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_CHANNEL
	 * @model name="DataChannel"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_CHANNEL_VALUE = 43;

	/**
	 * The '<em><b>Data Container</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_CONTAINER
	 * @model name="DataContainer"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_CONTAINER_VALUE = 44;

	/**
	 * The '<em><b>Data Copy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_COPY
	 * @model name="DataCopy"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_COPY_VALUE = 45;

	/**
	 * The '<em><b>Data Exchange</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_EXCHANGE
	 * @model name="DataExchange"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_EXCHANGE_VALUE = 46;

	/**
	 * The '<em><b>Data Field</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_FIELD
	 * @model name="DataField"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_FIELD_VALUE = 47;

	/**
	 * The '<em><b>Data Flow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_FLOW
	 * @model name="DataFlow"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_FLOW_VALUE = 48;

	/**
	 * The '<em><b>Data Inference Asset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_INFERENCE_ASSET
	 * @model name="DataInferenceAsset"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_INFERENCE_ASSET_VALUE = 49;

	/**
	 * The '<em><b>Data Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_INPUT
	 * @model name="DataInput"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_INPUT_VALUE = 50;

	/**
	 * The '<em><b>Data Lifecycle Asset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_LIFECYCLE_ASSET
	 * @model name="DataLifecycleAsset"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_LIFECYCLE_ASSET_VALUE = 51;

	/**
	 * The '<em><b>Data Output</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_OUTPUT
	 * @model name="DataOutput"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_OUTPUT_VALUE = 52;

	/**
	 * The '<em><b>Data Palette</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PALETTE
	 * @model name="DataPalette"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_PALETTE_VALUE = 53;

	/**
	 * The '<em><b>Data Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PATH
	 * @model name="DataPath"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_PATH_VALUE = 54;

	/**
	 * The '<em><b>Data Pool</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_POOL
	 * @model name="DataPool"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_POOL_VALUE = 55;

	/**
	 * The '<em><b>Data Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PROCESS
	 * @model name="DataProcess"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_PROCESS_VALUE = 56;

	/**
	 * The '<em><b>Data Relay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_RELAY
	 * @model name="DataRelay"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_RELAY_VALUE = 57;

	/**
	 * The '<em><b>Data Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_SERVICE
	 * @model name="DataService"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_SERVICE_VALUE = 58;

	/**
	 * The '<em><b>Data Step</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_STEP
	 * @model name="DataStep"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_STEP_VALUE = 59;

	/**
	 * The '<em><b>Data Update</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_UPDATE
	 * @model name="DataUpdate"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_UPDATE_VALUE = 60;

	/**
	 * The '<em><b>Data Use</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_USE
	 * @model name="DataUse"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_USE_VALUE = 61;

	/**
	 * The '<em><b>De NAT Segment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DE_NAT_SEGMENT
	 * @model name="DeNATSegment"
	 * @generated
	 * @ordered
	 */
	public static final int DE_NAT_SEGMENT_VALUE = 62;

	/**
	 * The '<em><b>Debug Marker</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBUG_MARKER
	 * @model name="DebugMarker"
	 * @generated
	 * @ordered
	 */
	public static final int DEBUG_MARKER_VALUE = 63;

	/**
	 * The '<em><b>Desktop Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESKTOP_SERVICE
	 * @model name="DesktopService"
	 * @generated
	 * @ordered
	 */
	public static final int DESKTOP_SERVICE_VALUE = 64;

	/**
	 * The '<em><b>Dumb Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUMB_HOST
	 * @model name="DumbHost"
	 * @generated
	 * @ordered
	 */
	public static final int DUMB_HOST_VALUE = 65;

	/**
	 * The '<em><b>Editor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDITOR
	 * @model name="Editor"
	 * @generated
	 * @ordered
	 */
	public static final int EDITOR_VALUE = 66;

	/**
	 * The '<em><b>Email Client</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL_CLIENT
	 * @model name="EmailClient"
	 * @generated
	 * @ordered
	 */
	public static final int EMAIL_CLIENT_VALUE = 67;

	/**
	 * The '<em><b>Email MUA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL_MUA
	 * @model name="EmailMUA"
	 * @generated
	 * @ordered
	 */
	public static final int EMAIL_MUA_VALUE = 68;

	/**
	 * The '<em><b>Email MX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL_MX
	 * @model name="EmailMX"
	 * @generated
	 * @ordered
	 */
	public static final int EMAIL_MX_VALUE = 69;

	/**
	 * The '<em><b>Email Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL_SERVICE
	 * @model name="EmailService"
	 * @generated
	 * @ordered
	 */
	public static final int EMAIL_SERVICE_VALUE = 70;

	/**
	 * The '<em><b>Fixed Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED_HOST
	 * @model name="FixedHost"
	 * @generated
	 * @ordered
	 */
	public static final int FIXED_HOST_VALUE = 71;

	/**
	 * The '<em><b>Free Segment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_SEGMENT
	 * @model name="FreeSegment"
	 * @generated
	 * @ordered
	 */
	public static final int FREE_SEGMENT_VALUE = 72;

	/**
	 * The '<em><b>GDPR Art94 Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GDPR_ART94_DATA
	 * @model name="GDPRArt94Data"
	 * @generated
	 * @ordered
	 */
	public static final int GDPR_ART94_DATA_VALUE = 73;

	/**
	 * The '<em><b>GDPR Art9 Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GDPR_ART9_DATA
	 * @model name="GDPRArt9Data"
	 * @generated
	 * @ordered
	 */
	public static final int GDPR_ART9_DATA_VALUE = 74;

	/**
	 * The '<em><b>General Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL_HOST
	 * @model name="GeneralHost"
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL_HOST_VALUE = 75;

	/**
	 * The '<em><b>General Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL_PROCESS
	 * @model name="GeneralProcess"
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL_PROCESS_VALUE = 76;

	/**
	 * The '<em><b>Genetic Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENETIC_DATA
	 * @model name="GeneticData"
	 * @generated
	 * @ordered
	 */
	public static final int GENETIC_DATA_VALUE = 77;

	/**
	 * The '<em><b>Governance Asset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOVERNANCE_ASSET
	 * @model name="GovernanceAsset"
	 * @generated
	 * @ordered
	 */
	public static final int GOVERNANCE_ASSET_VALUE = 78;

	/**
	 * The '<em><b>Governance Palette</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOVERNANCE_PALETTE
	 * @model name="GovernancePalette"
	 * @generated
	 * @ordered
	 */
	public static final int GOVERNANCE_PALETTE_VALUE = 79;

	/**
	 * The '<em><b>HContext</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HCONTEXT
	 * @model name="HContext"
	 * @generated
	 * @ordered
	 */
	public static final int HCONTEXT_VALUE = 80;

	/**
	 * The '<em><b>Health Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEALTH_DATA
	 * @model name="HealthData"
	 * @generated
	 * @ordered
	 */
	public static final int HEALTH_DATA_VALUE = 81;

	/**
	 * The '<em><b>Health Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEALTH_SENSOR
	 * @model name="HealthSensor"
	 * @generated
	 * @ordered
	 */
	public static final int HEALTH_SENSOR_VALUE = 82;

	/**
	 * The '<em><b>Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOST
	 * @model name="Host"
	 * @generated
	 * @ordered
	 */
	public static final int HOST_VALUE = 83;

	/**
	 * The '<em><b>Host Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOST_CHANNEL
	 * @model name="HostChannel"
	 * @generated
	 * @ordered
	 */
	public static final int HOST_CHANNEL_VALUE = 84;

	/**
	 * The '<em><b>Host Context</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOST_CONTEXT
	 * @model name="HostContext"
	 * @generated
	 * @ordered
	 */
	public static final int HOST_CONTEXT_VALUE = 85;

	/**
	 * The '<em><b>Host LAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOST_LAN
	 * @model name="HostLAN"
	 * @generated
	 * @ordered
	 */
	public static final int HOST_LAN_VALUE = 86;

	/**
	 * The '<em><b>Host Net Context</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOST_NET_CONTEXT
	 * @model name="HostNetContext"
	 * @generated
	 * @ordered
	 */
	public static final int HOST_NET_CONTEXT_VALUE = 87;

	/**
	 * The '<em><b>Host Palette</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOST_PALETTE
	 * @model name="HostPalette"
	 * @generated
	 * @ordered
	 */
	public static final int HOST_PALETTE_VALUE = 88;

	/**
	 * The '<em><b>Human</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMAN
	 * @model name="Human"
	 * @generated
	 * @ordered
	 */
	public static final int HUMAN_VALUE = 89;

	/**
	 * The '<em><b>Ingress</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INGRESS
	 * @model name="Ingress"
	 * @generated
	 * @ordered
	 */
	public static final int INGRESS_VALUE = 90;

	/**
	 * The '<em><b>Input Pool</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_POOL
	 * @model name="InputPool"
	 * @generated
	 * @ordered
	 */
	public static final int INPUT_POOL_VALUE = 91;

	/**
	 * The '<em><b>Interactive Application</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERACTIVE_APPLICATION
	 * @model name="InteractiveApplication"
	 * @generated
	 * @ordered
	 */
	public static final int INTERACTIVE_APPLICATION_VALUE = 92;

	/**
	 * The '<em><b>Interactive Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERACTIVE_HOST
	 * @model name="InteractiveHost"
	 * @generated
	 * @ordered
	 */
	public static final int INTERACTIVE_HOST_VALUE = 93;

	/**
	 * The '<em><b>Interactive Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERACTIVE_PROCESS
	 * @model name="InteractiveProcess"
	 * @generated
	 * @ordered
	 */
	public static final int INTERACTIVE_PROCESS_VALUE = 94;

	/**
	 * The '<em><b>Interface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE
	 * @model name="Interface"
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE_VALUE = 95;

	/**
	 * The '<em><b>Internal Subnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_SUBNET
	 * @model name="InternalSubnet"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNAL_SUBNET_VALUE = 96;

	/**
	 * The '<em><b>Internet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNET
	 * @model name="Internet"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNET_VALUE = 97;

	/**
	 * The '<em><b>Io TProcess</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IO_TPROCESS
	 * @model name="IoTProcess"
	 * @generated
	 * @ordered
	 */
	public static final int IO_TPROCESS_VALUE = 98;

	/**
	 * The '<em><b>Jurisdiction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JURISDICTION
	 * @model name="Jurisdiction"
	 * @generated
	 * @ordered
	 */
	public static final int JURISDICTION_VALUE = 99;

	/**
	 * The '<em><b>L01 Subnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L01_SUBNET
	 * @model name="L01Subnet"
	 * @generated
	 * @ordered
	 */
	public static final int L01_SUBNET_VALUE = 100;

	/**
	 * The '<em><b>L0 Subnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L0_SUBNET
	 * @model name="L0Subnet"
	 * @generated
	 * @ordered
	 */
	public static final int L0_SUBNET_VALUE = 101;

	/**
	 * The '<em><b>L1 Subnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L1_SUBNET
	 * @model name="L1Subnet"
	 * @generated
	 * @ordered
	 */
	public static final int L1_SUBNET_VALUE = 102;

	/**
	 * The '<em><b>L23 Subnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L23_SUBNET
	 * @model name="L23Subnet"
	 * @generated
	 * @ordered
	 */
	public static final int L23_SUBNET_VALUE = 103;

	/**
	 * The '<em><b>L2 Subnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L2_SUBNET
	 * @model name="L2Subnet"
	 * @generated
	 * @ordered
	 */
	public static final int L2_SUBNET_VALUE = 104;

	/**
	 * The '<em><b>L3 Subnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L3_SUBNET
	 * @model name="L3Subnet"
	 * @generated
	 * @ordered
	 */
	public static final int L3_SUBNET_VALUE = 105;

	/**
	 * The '<em><b>Legal Entity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGAL_ENTITY
	 * @model name="LegalEntity"
	 * @generated
	 * @ordered
	 */
	public static final int LEGAL_ENTITY_VALUE = 106;

	/**
	 * The '<em><b>Legal Organisation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGAL_ORGANISATION
	 * @model name="LegalOrganisation"
	 * @generated
	 * @ordered
	 */
	public static final int LEGAL_ORGANISATION_VALUE = 107;

	/**
	 * The '<em><b>Logical Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGICAL_PATH
	 * @model name="LogicalPath"
	 * @generated
	 * @ordered
	 */
	public static final int LOGICAL_PATH_VALUE = 108;

	/**
	 * The '<em><b>Logical Route</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGICAL_ROUTE
	 * @model name="LogicalRoute"
	 * @generated
	 * @ordered
	 */
	public static final int LOGICAL_ROUTE_VALUE = 109;

	/**
	 * The '<em><b>Logical Segment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGICAL_SEGMENT
	 * @model name="LogicalSegment"
	 * @generated
	 * @ordered
	 */
	public static final int LOGICAL_SEGMENT_VALUE = 110;

	/**
	 * The '<em><b>Logical Subnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGICAL_SUBNET
	 * @model name="LogicalSubnet"
	 * @generated
	 * @ordered
	 */
	public static final int LOGICAL_SUBNET_VALUE = 111;

	/**
	 * The '<em><b>Login Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIN_SERVICE
	 * @model name="LoginService"
	 * @generated
	 * @ordered
	 */
	public static final int LOGIN_SERVICE_VALUE = 112;

	/**
	 * The '<em><b>Master</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER
	 * @model name="Master"
	 * @generated
	 * @ordered
	 */
	public static final int MASTER_VALUE = 113;

	/**
	 * The '<em><b>Mesh Routing Segment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESH_ROUTING_SEGMENT
	 * @model name="MeshRoutingSegment"
	 * @generated
	 * @ordered
	 */
	public static final int MESH_ROUTING_SEGMENT_VALUE = 114;

	/**
	 * The '<em><b>Mobile Client</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOBILE_CLIENT
	 * @model name="MobileClient"
	 * @generated
	 * @ordered
	 */
	public static final int MOBILE_CLIENT_VALUE = 115;

	/**
	 * The '<em><b>Mobile Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOBILE_HOST
	 * @model name="MobileHost"
	 * @generated
	 * @ordered
	 */
	public static final int MOBILE_HOST_VALUE = 116;

	/**
	 * The '<em><b>NAT Segment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAT_SEGMENT
	 * @model name="NATSegment"
	 * @generated
	 * @ordered
	 */
	public static final int NAT_SEGMENT_VALUE = 117;

	/**
	 * The '<em><b>NPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NPE_VALUE = 118;

	/**
	 * The '<em><b>Network Asset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_ASSET
	 * @model name="NetworkAsset"
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_ASSET_VALUE = 119;

	/**
	 * The '<em><b>Network Inference Asset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_INFERENCE_ASSET
	 * @model name="NetworkInferenceAsset"
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_INFERENCE_ASSET_VALUE = 120;

	/**
	 * The '<em><b>Network Palette</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_PALETTE
	 * @model name="NetworkPalette"
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_PALETTE_VALUE = 121;

	/**
	 * The '<em><b>Network Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_PATH
	 * @model name="NetworkPath"
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_PATH_VALUE = 122;

	/**
	 * The '<em><b>Notebook</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTEBOOK
	 * @model name="Notebook"
	 * @generated
	 * @ordered
	 */
	public static final int NOTEBOOK_VALUE = 123;

	/**
	 * The '<em><b>Open Client Attack Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_CLIENT_ATTACK_PATH
	 * @model name="OpenClientAttackPath"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_CLIENT_ATTACK_PATH_VALUE = 124;

	/**
	 * The '<em><b>Open Segment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_SEGMENT
	 * @model name="OpenSegment"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_SEGMENT_VALUE = 125;

	/**
	 * The '<em><b>Open Service Attack Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_SERVICE_ATTACK_PATH
	 * @model name="OpenServiceAttackPath"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_SERVICE_ATTACK_PATH_VALUE = 126;

	/**
	 * The '<em><b>Organisation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGANISATION
	 * @model name="Organisation"
	 * @generated
	 * @ordered
	 */
	public static final int ORGANISATION_VALUE = 127;

	/**
	 * The '<em><b>Output Pool</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPUT_POOL
	 * @model name="OutputPool"
	 * @generated
	 * @ordered
	 */
	public static final int OUTPUT_POOL_VALUE = 128;

	/**
	 * The '<em><b>Overlay Subnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERLAY_SUBNET
	 * @model name="OverlaySubnet"
	 * @generated
	 * @ordered
	 */
	public static final int OVERLAY_SUBNET_VALUE = 129;

	/**
	 * The '<em><b>PContext</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PCONTEXT
	 * @model name="PContext"
	 * @generated
	 * @ordered
	 */
	public static final int PCONTEXT_VALUE = 130;

	/**
	 * The '<em><b>PPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PPE_VALUE = 131;

	/**
	 * The '<em><b>Personal Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSONAL_HOST
	 * @model name="PersonalHost"
	 * @generated
	 * @ordered
	 */
	public static final int PERSONAL_HOST_VALUE = 132;

	/**
	 * The '<em><b>Physical Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_HOST
	 * @model name="PhysicalHost"
	 * @generated
	 * @ordered
	 */
	public static final int PHYSICAL_HOST_VALUE = 133;

	/**
	 * The '<em><b>Physical Palette</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_PALETTE
	 * @model name="PhysicalPalette"
	 * @generated
	 * @ordered
	 */
	public static final int PHYSICAL_PALETTE_VALUE = 134;

	/**
	 * The '<em><b>Physical Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_PATH
	 * @model name="PhysicalPath"
	 * @generated
	 * @ordered
	 */
	public static final int PHYSICAL_PATH_VALUE = 135;

	/**
	 * The '<em><b>Physical Subnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_SUBNET
	 * @model name="PhysicalSubnet"
	 * @generated
	 * @ordered
	 */
	public static final int PHYSICAL_SUBNET_VALUE = 136;

	/**
	 * The '<em><b>Pod</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POD
	 * @model name="Pod"
	 * @generated
	 * @ordered
	 */
	public static final int POD_VALUE = 137;

	/**
	 * The '<em><b>Private Cellular Network</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_CELLULAR_NETWORK
	 * @model name="PrivateCellularNetwork"
	 * @generated
	 * @ordered
	 */
	public static final int PRIVATE_CELLULAR_NETWORK_VALUE = 138;

	/**
	 * The '<em><b>Private Space</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_SPACE
	 * @model name="PrivateSpace"
	 * @generated
	 * @ordered
	 */
	public static final int PRIVATE_SPACE_VALUE = 139;

	/**
	 * The '<em><b>Proc Net Context</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROC_NET_CONTEXT
	 * @model name="ProcNetContext"
	 * @generated
	 * @ordered
	 */
	public static final int PROC_NET_CONTEXT_VALUE = 140;

	/**
	 * The '<em><b>Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS
	 * @model name="Process"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESS_VALUE = 141;

	/**
	 * The '<em><b>Process Context</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS_CONTEXT
	 * @model name="ProcessContext"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESS_CONTEXT_VALUE = 142;

	/**
	 * The '<em><b>Process Palette</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS_PALETTE
	 * @model name="ProcessPalette"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESS_PALETTE_VALUE = 143;

	/**
	 * The '<em><b>Public Cellular Network</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_CELLULAR_NETWORK
	 * @model name="PublicCellularNetwork"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIC_CELLULAR_NETWORK_VALUE = 144;

	/**
	 * The '<em><b>Public Space</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_SPACE
	 * @model name="PublicSpace"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIC_SPACE_VALUE = 145;

	/**
	 * The '<em><b>RAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RAN_VALUE = 146;

	/**
	 * The '<em><b>Radio Subnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIO_SUBNET
	 * @model name="RadioSubnet"
	 * @generated
	 * @ordered
	 */
	public static final int RADIO_SUBNET_VALUE = 147;

	/**
	 * The '<em><b>Remote Access Client</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_ACCESS_CLIENT
	 * @model name="RemoteAccessClient"
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_ACCESS_CLIENT_VALUE = 148;

	/**
	 * The '<em><b>Remote Access Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_ACCESS_SERVICE
	 * @model name="RemoteAccessService"
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_ACCESS_SERVICE_VALUE = 149;

	/**
	 * The '<em><b>Remote Desktop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_DESKTOP
	 * @model name="RemoteDesktop"
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_DESKTOP_VALUE = 150;

	/**
	 * The '<em><b>Remote Terminal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_TERMINAL
	 * @model name="RemoteTerminal"
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_TERMINAL_VALUE = 151;

	/**
	 * The '<em><b>Remote User Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_USER_ACCESS
	 * @model name="RemoteUserAccess"
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_USER_ACCESS_VALUE = 152;

	/**
	 * The '<em><b>Removable Media</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVABLE_MEDIA
	 * @model name="RemovableMedia"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVABLE_MEDIA_VALUE = 153;

	/**
	 * The '<em><b>Router</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUTER
	 * @model name="Router"
	 * @generated
	 * @ordered
	 */
	public static final int ROUTER_VALUE = 154;

	/**
	 * The '<em><b>SMS Client</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMS_CLIENT
	 * @model name="SMSClient"
	 * @generated
	 * @ordered
	 */
	public static final int SMS_CLIENT_VALUE = 155;

	/**
	 * The '<em><b>Scalable Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCALABLE_HOST
	 * @model name="ScalableHost"
	 * @generated
	 * @ordered
	 */
	public static final int SCALABLE_HOST_VALUE = 156;

	/**
	 * The '<em><b>Sensed Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSED_DATA
	 * @model name="SensedData"
	 * @generated
	 * @ordered
	 */
	public static final int SENSED_DATA_VALUE = 157;

	/**
	 * The '<em><b>Sensitive Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSITIVE_DATA
	 * @model name="SensitiveData"
	 * @generated
	 * @ordered
	 */
	public static final int SENSITIVE_DATA_VALUE = 158;

	/**
	 * The '<em><b>Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSOR
	 * @model name="Sensor"
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR_VALUE = 159;

	/**
	 * The '<em><b>Sensor Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSOR_PROCESS
	 * @model name="SensorProcess"
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR_PROCESS_VALUE = 160;

	/**
	 * The '<em><b>Server</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVER
	 * @model name="Server"
	 * @generated
	 * @ordered
	 */
	public static final int SERVER_VALUE = 161;

	/**
	 * The '<em><b>Service Attack Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_ATTACK_PATH
	 * @model name="ServiceAttackPath"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_ATTACK_PATH_VALUE = 162;

	/**
	 * The '<em><b>Service Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_CHANNEL
	 * @model name="ServiceChannel"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_CHANNEL_VALUE = 163;

	/**
	 * The '<em><b>Service Proxy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_PROXY
	 * @model name="ServiceProxy"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_PROXY_VALUE = 164;

	/**
	 * The '<em><b>Shell Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHELL_HOST
	 * @model name="ShellHost"
	 * @generated
	 * @ordered
	 */
	public static final int SHELL_HOST_VALUE = 165;

	/**
	 * The '<em><b>Simple Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_HOST
	 * @model name="SimpleHost"
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_HOST_VALUE = 166;

	/**
	 * The '<em><b>Simple Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_PROCESS
	 * @model name="SimpleProcess"
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_PROCESS_VALUE = 167;

	/**
	 * The '<em><b>Smartphone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMARTPHONE
	 * @model name="Smartphone"
	 * @generated
	 * @ordered
	 */
	public static final int SMARTPHONE_VALUE = 168;

	/**
	 * The '<em><b>Smartwatch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMARTWATCH
	 * @model name="Smartwatch"
	 * @generated
	 * @ordered
	 */
	public static final int SMARTWATCH_VALUE = 169;

	/**
	 * The '<em><b>Socket LAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCKET_LAN
	 * @model name="SocketLAN"
	 * @generated
	 * @ordered
	 */
	public static final int SOCKET_LAN_VALUE = 170;

	/**
	 * The '<em><b>Space</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPACE
	 * @model name="Space"
	 * @generated
	 * @ordered
	 */
	public static final int SPACE_VALUE = 171;

	/**
	 * The '<em><b>Spam Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPAM_DATA
	 * @model name="SpamData"
	 * @generated
	 * @ordered
	 */
	public static final int SPAM_DATA_VALUE = 172;

	/**
	 * The '<em><b>Special Category Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_CATEGORY_DATA
	 * @model name="SpecialCategoryData"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIAL_CATEGORY_DATA_VALUE = 173;

	/**
	 * The '<em><b>Stakeholder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STAKEHOLDER
	 * @model name="Stakeholder"
	 * @generated
	 * @ordered
	 */
	public static final int STAKEHOLDER_VALUE = 174;

	/**
	 * The '<em><b>Stored Data Pool</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORED_DATA_POOL
	 * @model name="StoredDataPool"
	 * @generated
	 * @ordered
	 */
	public static final int STORED_DATA_POOL_VALUE = 175;

	/**
	 * The '<em><b>Tablet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLET
	 * @model name="Tablet"
	 * @generated
	 * @ordered
	 */
	public static final int TABLET_VALUE = 176;

	/**
	 * The '<em><b>Temp Data Relay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMP_DATA_RELAY
	 * @model name="TempDataRelay"
	 * @generated
	 * @ordered
	 */
	public static final int TEMP_DATA_RELAY_VALUE = 177;

	/**
	 * The '<em><b>Tethering Segment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TETHERING_SEGMENT
	 * @model name="TetheringSegment"
	 * @generated
	 * @ordered
	 */
	public static final int TETHERING_SEGMENT_VALUE = 178;

	/**
	 * The '<em><b>Text Editor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_EDITOR
	 * @model name="TextEditor"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_EDITOR_VALUE = 179;

	/**
	 * The '<em><b>Thing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THING
	 * @model name="Thing"
	 * @generated
	 * @ordered
	 */
	public static final int THING_VALUE = 180;

	/**
	 * The '<em><b>Trivial Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIVIAL_HOST
	 * @model name="TrivialHost"
	 * @generated
	 * @ordered
	 */
	public static final int TRIVIAL_HOST_VALUE = 181;

	/**
	 * The '<em><b>Trivial Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIVIAL_PROCESS
	 * @model name="TrivialProcess"
	 * @generated
	 * @ordered
	 */
	public static final int TRIVIAL_PROCESS_VALUE = 182;

	/**
	 * The '<em><b>Type Overlay Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_OVERLAY_DATA
	 * @model name="TypeOverlayData"
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_OVERLAY_DATA_VALUE = 183;

	/**
	 * The '<em><b>Type Overlay Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_OVERLAY_HOST
	 * @model name="TypeOverlayHost"
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_OVERLAY_HOST_VALUE = 184;

	/**
	 * The '<em><b>Type Overlay Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_OVERLAY_PROCESS
	 * @model name="TypeOverlayProcess"
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_OVERLAY_PROCESS_VALUE = 185;

	/**
	 * The '<em><b>Type Overlay Subnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_OVERLAY_SUBNET
	 * @model name="TypeOverlaySubnet"
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_OVERLAY_SUBNET_VALUE = 186;

	/**
	 * The '<em><b>USB Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USB_DEVICE
	 * @model name="USBDevice"
	 * @generated
	 * @ordered
	 */
	public static final int USB_DEVICE_VALUE = 187;

	/**
	 * The '<em><b>USB Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USB_HOST
	 * @model name="USBHost"
	 * @generated
	 * @ordered
	 */
	public static final int USB_HOST_VALUE = 188;

	/**
	 * The '<em><b>USB Pair</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USB_PAIR
	 * @model name="USBPair"
	 * @generated
	 * @ordered
	 */
	public static final int USB_PAIR_VALUE = 189;

	/**
	 * The '<em><b>Update Pool</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_POOL
	 * @model name="UpdatePool"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_POOL_VALUE = 190;

	/**
	 * The '<em><b>VCluster</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VCLUSTER
	 * @model name="VCluster"
	 * @generated
	 * @ordered
	 */
	public static final int VCLUSTER_VALUE = 191;

	/**
	 * The '<em><b>VM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VM_VALUE = 192;

	/**
	 * The '<em><b>VPN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VPN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VPN_VALUE = 193;

	/**
	 * The '<em><b>VRouter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VROUTER
	 * @model name="VRouter"
	 * @generated
	 * @ordered
	 */
	public static final int VROUTER_VALUE = 194;

	/**
	 * The '<em><b>VXLAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VXLAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VXLAN_VALUE = 195;

	/**
	 * The '<em><b>Virtual Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_CHANNEL
	 * @model name="VirtualChannel"
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUAL_CHANNEL_VALUE = 196;

	/**
	 * The '<em><b>Virtual Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_HOST
	 * @model name="VirtualHost"
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUAL_HOST_VALUE = 197;

	/**
	 * The '<em><b>Virtual Subnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_SUBNET
	 * @model name="VirtualSubnet"
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUAL_SUBNET_VALUE = 198;

	/**
	 * The '<em><b>Web App</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_APP
	 * @model name="WebApp"
	 * @generated
	 * @ordered
	 */
	public static final int WEB_APP_VALUE = 199;

	/**
	 * The '<em><b>Web Browser</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_BROWSER
	 * @model name="WebBrowser"
	 * @generated
	 * @ordered
	 */
	public static final int WEB_BROWSER_VALUE = 200;

	/**
	 * The '<em><b>Web Client</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_CLIENT
	 * @model name="WebClient"
	 * @generated
	 * @ordered
	 */
	public static final int WEB_CLIENT_VALUE = 201;

	/**
	 * The '<em><b>Wi Fi LAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WI_FI_LAN
	 * @model name="WiFiLAN"
	 * @generated
	 * @ordered
	 */
	public static final int WI_FI_LAN_VALUE = 202;

	/**
	 * The '<em><b>Wired LAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIRED_LAN
	 * @model name="WiredLAN"
	 * @generated
	 * @ordered
	 */
	public static final int WIRED_LAN_VALUE = 203;

	/**
	 * The '<em><b>Wired Subnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIRED_SUBNET
	 * @model name="WiredSubnet"
	 * @generated
	 * @ordered
	 */
	public static final int WIRED_SUBNET_VALUE = 204;

	/**
	 * The '<em><b>Worker</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKER
	 * @model name="Worker"
	 * @generated
	 * @ordered
	 */
	public static final int WORKER_VALUE = 205;

	/**
	 * The '<em><b>Workstation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKSTATION
	 * @model name="Workstation"
	 * @generated
	 * @ordered
	 */
	public static final int WORKSTATION_VALUE = 206;

	/**
	 * The '<em><b>World</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORLD
	 * @model name="World"
	 * @generated
	 * @ordered
	 */
	public static final int WORLD_VALUE = 207;

	/**
	 * An array of all the '<em><b>TRVA Asset Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TRVAAssetKind[] VALUES_ARRAY =
		new TRVAAssetKind[] {
			ABSTRACT_SUBNET,
			ACCESS_CONTEXT,
			ADULT,
			API_SERVER,
			APPLICATION_PROCESS,
			ATTACK_PATH,
			AUTH_CHANNEL,
			AUTH_CLIENT,
			AUTH_SERVICE,
			BASE_STATION,
			BIOMETRIC_DATA,
			BLUETOOTH_PAIR,
			BOUNDED_SPACE,
			CELLULAR_NETWORK,
			CHILD,
			CLIENT_ATTACK_PATH,
			CLIENT_CHANNEL,
			CLIENT_PATH,
			CLOSED_CLIENT_ATTACK_PATH,
			CLOSED_SEGMENT,
			CLOSED_SERVICE_ATTACK_PATH,
			CLUSTER,
			CLUSTER_HOST,
			CLUSTER_IP,
			CMD_LINE_PROCESS,
			COMMS_ASSET,
			CONNECTION_ASSET,
			CONNECTION_CHANNEL,
			CONNECTION_PATH,
			CONSOLE_HOST,
			CONSOLE_PROCESS,
			CONTAINER,
			CONTROL_DATA,
			CONTROL_PROCESS,
			CONTROLLER,
			CORE_NETWORK,
			CORE_ROUTER,
			DB,
			DATA,
			DATA_ACCESS,
			DATA_ASSET,
			DATA_CACHE,
			DATA_CENTRE,
			DATA_CHANNEL,
			DATA_CONTAINER,
			DATA_COPY,
			DATA_EXCHANGE,
			DATA_FIELD,
			DATA_FLOW,
			DATA_INFERENCE_ASSET,
			DATA_INPUT,
			DATA_LIFECYCLE_ASSET,
			DATA_OUTPUT,
			DATA_PALETTE,
			DATA_PATH,
			DATA_POOL,
			DATA_PROCESS,
			DATA_RELAY,
			DATA_SERVICE,
			DATA_STEP,
			DATA_UPDATE,
			DATA_USE,
			DE_NAT_SEGMENT,
			DEBUG_MARKER,
			DESKTOP_SERVICE,
			DUMB_HOST,
			EDITOR,
			EMAIL_CLIENT,
			EMAIL_MUA,
			EMAIL_MX,
			EMAIL_SERVICE,
			FIXED_HOST,
			FREE_SEGMENT,
			GDPR_ART94_DATA,
			GDPR_ART9_DATA,
			GENERAL_HOST,
			GENERAL_PROCESS,
			GENETIC_DATA,
			GOVERNANCE_ASSET,
			GOVERNANCE_PALETTE,
			HCONTEXT,
			HEALTH_DATA,
			HEALTH_SENSOR,
			HOST,
			HOST_CHANNEL,
			HOST_CONTEXT,
			HOST_LAN,
			HOST_NET_CONTEXT,
			HOST_PALETTE,
			HUMAN,
			INGRESS,
			INPUT_POOL,
			INTERACTIVE_APPLICATION,
			INTERACTIVE_HOST,
			INTERACTIVE_PROCESS,
			INTERFACE,
			INTERNAL_SUBNET,
			INTERNET,
			IO_TPROCESS,
			JURISDICTION,
			L01_SUBNET,
			L0_SUBNET,
			L1_SUBNET,
			L23_SUBNET,
			L2_SUBNET,
			L3_SUBNET,
			LEGAL_ENTITY,
			LEGAL_ORGANISATION,
			LOGICAL_PATH,
			LOGICAL_ROUTE,
			LOGICAL_SEGMENT,
			LOGICAL_SUBNET,
			LOGIN_SERVICE,
			MASTER,
			MESH_ROUTING_SEGMENT,
			MOBILE_CLIENT,
			MOBILE_HOST,
			NAT_SEGMENT,
			NPE,
			NETWORK_ASSET,
			NETWORK_INFERENCE_ASSET,
			NETWORK_PALETTE,
			NETWORK_PATH,
			NOTEBOOK,
			OPEN_CLIENT_ATTACK_PATH,
			OPEN_SEGMENT,
			OPEN_SERVICE_ATTACK_PATH,
			ORGANISATION,
			OUTPUT_POOL,
			OVERLAY_SUBNET,
			PCONTEXT,
			PPE,
			PERSONAL_HOST,
			PHYSICAL_HOST,
			PHYSICAL_PALETTE,
			PHYSICAL_PATH,
			PHYSICAL_SUBNET,
			POD,
			PRIVATE_CELLULAR_NETWORK,
			PRIVATE_SPACE,
			PROC_NET_CONTEXT,
			PROCESS,
			PROCESS_CONTEXT,
			PROCESS_PALETTE,
			PUBLIC_CELLULAR_NETWORK,
			PUBLIC_SPACE,
			RAN,
			RADIO_SUBNET,
			REMOTE_ACCESS_CLIENT,
			REMOTE_ACCESS_SERVICE,
			REMOTE_DESKTOP,
			REMOTE_TERMINAL,
			REMOTE_USER_ACCESS,
			REMOVABLE_MEDIA,
			ROUTER,
			SMS_CLIENT,
			SCALABLE_HOST,
			SENSED_DATA,
			SENSITIVE_DATA,
			SENSOR,
			SENSOR_PROCESS,
			SERVER,
			SERVICE_ATTACK_PATH,
			SERVICE_CHANNEL,
			SERVICE_PROXY,
			SHELL_HOST,
			SIMPLE_HOST,
			SIMPLE_PROCESS,
			SMARTPHONE,
			SMARTWATCH,
			SOCKET_LAN,
			SPACE,
			SPAM_DATA,
			SPECIAL_CATEGORY_DATA,
			STAKEHOLDER,
			STORED_DATA_POOL,
			TABLET,
			TEMP_DATA_RELAY,
			TETHERING_SEGMENT,
			TEXT_EDITOR,
			THING,
			TRIVIAL_HOST,
			TRIVIAL_PROCESS,
			TYPE_OVERLAY_DATA,
			TYPE_OVERLAY_HOST,
			TYPE_OVERLAY_PROCESS,
			TYPE_OVERLAY_SUBNET,
			USB_DEVICE,
			USB_HOST,
			USB_PAIR,
			UPDATE_POOL,
			VCLUSTER,
			VM,
			VPN,
			VROUTER,
			VXLAN,
			VIRTUAL_CHANNEL,
			VIRTUAL_HOST,
			VIRTUAL_SUBNET,
			WEB_APP,
			WEB_BROWSER,
			WEB_CLIENT,
			WI_FI_LAN,
			WIRED_LAN,
			WIRED_SUBNET,
			WORKER,
			WORKSTATION,
			WORLD,
		};

	/**
	 * A public read-only list of all the '<em><b>TRVA Asset Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TRVAAssetKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TRVA Asset Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TRVAAssetKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TRVAAssetKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TRVA Asset Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TRVAAssetKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TRVAAssetKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TRVA Asset Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TRVAAssetKind get(int value) {
		switch (value) {
			case ABSTRACT_SUBNET_VALUE: return ABSTRACT_SUBNET;
			case ACCESS_CONTEXT_VALUE: return ACCESS_CONTEXT;
			case ADULT_VALUE: return ADULT;
			case API_SERVER_VALUE: return API_SERVER;
			case APPLICATION_PROCESS_VALUE: return APPLICATION_PROCESS;
			case ATTACK_PATH_VALUE: return ATTACK_PATH;
			case AUTH_CHANNEL_VALUE: return AUTH_CHANNEL;
			case AUTH_CLIENT_VALUE: return AUTH_CLIENT;
			case AUTH_SERVICE_VALUE: return AUTH_SERVICE;
			case BASE_STATION_VALUE: return BASE_STATION;
			case BIOMETRIC_DATA_VALUE: return BIOMETRIC_DATA;
			case BLUETOOTH_PAIR_VALUE: return BLUETOOTH_PAIR;
			case BOUNDED_SPACE_VALUE: return BOUNDED_SPACE;
			case CELLULAR_NETWORK_VALUE: return CELLULAR_NETWORK;
			case CHILD_VALUE: return CHILD;
			case CLIENT_ATTACK_PATH_VALUE: return CLIENT_ATTACK_PATH;
			case CLIENT_CHANNEL_VALUE: return CLIENT_CHANNEL;
			case CLIENT_PATH_VALUE: return CLIENT_PATH;
			case CLOSED_CLIENT_ATTACK_PATH_VALUE: return CLOSED_CLIENT_ATTACK_PATH;
			case CLOSED_SEGMENT_VALUE: return CLOSED_SEGMENT;
			case CLOSED_SERVICE_ATTACK_PATH_VALUE: return CLOSED_SERVICE_ATTACK_PATH;
			case CLUSTER_VALUE: return CLUSTER;
			case CLUSTER_HOST_VALUE: return CLUSTER_HOST;
			case CLUSTER_IP_VALUE: return CLUSTER_IP;
			case CMD_LINE_PROCESS_VALUE: return CMD_LINE_PROCESS;
			case COMMS_ASSET_VALUE: return COMMS_ASSET;
			case CONNECTION_ASSET_VALUE: return CONNECTION_ASSET;
			case CONNECTION_CHANNEL_VALUE: return CONNECTION_CHANNEL;
			case CONNECTION_PATH_VALUE: return CONNECTION_PATH;
			case CONSOLE_HOST_VALUE: return CONSOLE_HOST;
			case CONSOLE_PROCESS_VALUE: return CONSOLE_PROCESS;
			case CONTAINER_VALUE: return CONTAINER;
			case CONTROL_DATA_VALUE: return CONTROL_DATA;
			case CONTROL_PROCESS_VALUE: return CONTROL_PROCESS;
			case CONTROLLER_VALUE: return CONTROLLER;
			case CORE_NETWORK_VALUE: return CORE_NETWORK;
			case CORE_ROUTER_VALUE: return CORE_ROUTER;
			case DB_VALUE: return DB;
			case DATA_VALUE: return DATA;
			case DATA_ACCESS_VALUE: return DATA_ACCESS;
			case DATA_ASSET_VALUE: return DATA_ASSET;
			case DATA_CACHE_VALUE: return DATA_CACHE;
			case DATA_CENTRE_VALUE: return DATA_CENTRE;
			case DATA_CHANNEL_VALUE: return DATA_CHANNEL;
			case DATA_CONTAINER_VALUE: return DATA_CONTAINER;
			case DATA_COPY_VALUE: return DATA_COPY;
			case DATA_EXCHANGE_VALUE: return DATA_EXCHANGE;
			case DATA_FIELD_VALUE: return DATA_FIELD;
			case DATA_FLOW_VALUE: return DATA_FLOW;
			case DATA_INFERENCE_ASSET_VALUE: return DATA_INFERENCE_ASSET;
			case DATA_INPUT_VALUE: return DATA_INPUT;
			case DATA_LIFECYCLE_ASSET_VALUE: return DATA_LIFECYCLE_ASSET;
			case DATA_OUTPUT_VALUE: return DATA_OUTPUT;
			case DATA_PALETTE_VALUE: return DATA_PALETTE;
			case DATA_PATH_VALUE: return DATA_PATH;
			case DATA_POOL_VALUE: return DATA_POOL;
			case DATA_PROCESS_VALUE: return DATA_PROCESS;
			case DATA_RELAY_VALUE: return DATA_RELAY;
			case DATA_SERVICE_VALUE: return DATA_SERVICE;
			case DATA_STEP_VALUE: return DATA_STEP;
			case DATA_UPDATE_VALUE: return DATA_UPDATE;
			case DATA_USE_VALUE: return DATA_USE;
			case DE_NAT_SEGMENT_VALUE: return DE_NAT_SEGMENT;
			case DEBUG_MARKER_VALUE: return DEBUG_MARKER;
			case DESKTOP_SERVICE_VALUE: return DESKTOP_SERVICE;
			case DUMB_HOST_VALUE: return DUMB_HOST;
			case EDITOR_VALUE: return EDITOR;
			case EMAIL_CLIENT_VALUE: return EMAIL_CLIENT;
			case EMAIL_MUA_VALUE: return EMAIL_MUA;
			case EMAIL_MX_VALUE: return EMAIL_MX;
			case EMAIL_SERVICE_VALUE: return EMAIL_SERVICE;
			case FIXED_HOST_VALUE: return FIXED_HOST;
			case FREE_SEGMENT_VALUE: return FREE_SEGMENT;
			case GDPR_ART94_DATA_VALUE: return GDPR_ART94_DATA;
			case GDPR_ART9_DATA_VALUE: return GDPR_ART9_DATA;
			case GENERAL_HOST_VALUE: return GENERAL_HOST;
			case GENERAL_PROCESS_VALUE: return GENERAL_PROCESS;
			case GENETIC_DATA_VALUE: return GENETIC_DATA;
			case GOVERNANCE_ASSET_VALUE: return GOVERNANCE_ASSET;
			case GOVERNANCE_PALETTE_VALUE: return GOVERNANCE_PALETTE;
			case HCONTEXT_VALUE: return HCONTEXT;
			case HEALTH_DATA_VALUE: return HEALTH_DATA;
			case HEALTH_SENSOR_VALUE: return HEALTH_SENSOR;
			case HOST_VALUE: return HOST;
			case HOST_CHANNEL_VALUE: return HOST_CHANNEL;
			case HOST_CONTEXT_VALUE: return HOST_CONTEXT;
			case HOST_LAN_VALUE: return HOST_LAN;
			case HOST_NET_CONTEXT_VALUE: return HOST_NET_CONTEXT;
			case HOST_PALETTE_VALUE: return HOST_PALETTE;
			case HUMAN_VALUE: return HUMAN;
			case INGRESS_VALUE: return INGRESS;
			case INPUT_POOL_VALUE: return INPUT_POOL;
			case INTERACTIVE_APPLICATION_VALUE: return INTERACTIVE_APPLICATION;
			case INTERACTIVE_HOST_VALUE: return INTERACTIVE_HOST;
			case INTERACTIVE_PROCESS_VALUE: return INTERACTIVE_PROCESS;
			case INTERFACE_VALUE: return INTERFACE;
			case INTERNAL_SUBNET_VALUE: return INTERNAL_SUBNET;
			case INTERNET_VALUE: return INTERNET;
			case IO_TPROCESS_VALUE: return IO_TPROCESS;
			case JURISDICTION_VALUE: return JURISDICTION;
			case L01_SUBNET_VALUE: return L01_SUBNET;
			case L0_SUBNET_VALUE: return L0_SUBNET;
			case L1_SUBNET_VALUE: return L1_SUBNET;
			case L23_SUBNET_VALUE: return L23_SUBNET;
			case L2_SUBNET_VALUE: return L2_SUBNET;
			case L3_SUBNET_VALUE: return L3_SUBNET;
			case LEGAL_ENTITY_VALUE: return LEGAL_ENTITY;
			case LEGAL_ORGANISATION_VALUE: return LEGAL_ORGANISATION;
			case LOGICAL_PATH_VALUE: return LOGICAL_PATH;
			case LOGICAL_ROUTE_VALUE: return LOGICAL_ROUTE;
			case LOGICAL_SEGMENT_VALUE: return LOGICAL_SEGMENT;
			case LOGICAL_SUBNET_VALUE: return LOGICAL_SUBNET;
			case LOGIN_SERVICE_VALUE: return LOGIN_SERVICE;
			case MASTER_VALUE: return MASTER;
			case MESH_ROUTING_SEGMENT_VALUE: return MESH_ROUTING_SEGMENT;
			case MOBILE_CLIENT_VALUE: return MOBILE_CLIENT;
			case MOBILE_HOST_VALUE: return MOBILE_HOST;
			case NAT_SEGMENT_VALUE: return NAT_SEGMENT;
			case NPE_VALUE: return NPE;
			case NETWORK_ASSET_VALUE: return NETWORK_ASSET;
			case NETWORK_INFERENCE_ASSET_VALUE: return NETWORK_INFERENCE_ASSET;
			case NETWORK_PALETTE_VALUE: return NETWORK_PALETTE;
			case NETWORK_PATH_VALUE: return NETWORK_PATH;
			case NOTEBOOK_VALUE: return NOTEBOOK;
			case OPEN_CLIENT_ATTACK_PATH_VALUE: return OPEN_CLIENT_ATTACK_PATH;
			case OPEN_SEGMENT_VALUE: return OPEN_SEGMENT;
			case OPEN_SERVICE_ATTACK_PATH_VALUE: return OPEN_SERVICE_ATTACK_PATH;
			case ORGANISATION_VALUE: return ORGANISATION;
			case OUTPUT_POOL_VALUE: return OUTPUT_POOL;
			case OVERLAY_SUBNET_VALUE: return OVERLAY_SUBNET;
			case PCONTEXT_VALUE: return PCONTEXT;
			case PPE_VALUE: return PPE;
			case PERSONAL_HOST_VALUE: return PERSONAL_HOST;
			case PHYSICAL_HOST_VALUE: return PHYSICAL_HOST;
			case PHYSICAL_PALETTE_VALUE: return PHYSICAL_PALETTE;
			case PHYSICAL_PATH_VALUE: return PHYSICAL_PATH;
			case PHYSICAL_SUBNET_VALUE: return PHYSICAL_SUBNET;
			case POD_VALUE: return POD;
			case PRIVATE_CELLULAR_NETWORK_VALUE: return PRIVATE_CELLULAR_NETWORK;
			case PRIVATE_SPACE_VALUE: return PRIVATE_SPACE;
			case PROC_NET_CONTEXT_VALUE: return PROC_NET_CONTEXT;
			case PROCESS_VALUE: return PROCESS;
			case PROCESS_CONTEXT_VALUE: return PROCESS_CONTEXT;
			case PROCESS_PALETTE_VALUE: return PROCESS_PALETTE;
			case PUBLIC_CELLULAR_NETWORK_VALUE: return PUBLIC_CELLULAR_NETWORK;
			case PUBLIC_SPACE_VALUE: return PUBLIC_SPACE;
			case RAN_VALUE: return RAN;
			case RADIO_SUBNET_VALUE: return RADIO_SUBNET;
			case REMOTE_ACCESS_CLIENT_VALUE: return REMOTE_ACCESS_CLIENT;
			case REMOTE_ACCESS_SERVICE_VALUE: return REMOTE_ACCESS_SERVICE;
			case REMOTE_DESKTOP_VALUE: return REMOTE_DESKTOP;
			case REMOTE_TERMINAL_VALUE: return REMOTE_TERMINAL;
			case REMOTE_USER_ACCESS_VALUE: return REMOTE_USER_ACCESS;
			case REMOVABLE_MEDIA_VALUE: return REMOVABLE_MEDIA;
			case ROUTER_VALUE: return ROUTER;
			case SMS_CLIENT_VALUE: return SMS_CLIENT;
			case SCALABLE_HOST_VALUE: return SCALABLE_HOST;
			case SENSED_DATA_VALUE: return SENSED_DATA;
			case SENSITIVE_DATA_VALUE: return SENSITIVE_DATA;
			case SENSOR_VALUE: return SENSOR;
			case SENSOR_PROCESS_VALUE: return SENSOR_PROCESS;
			case SERVER_VALUE: return SERVER;
			case SERVICE_ATTACK_PATH_VALUE: return SERVICE_ATTACK_PATH;
			case SERVICE_CHANNEL_VALUE: return SERVICE_CHANNEL;
			case SERVICE_PROXY_VALUE: return SERVICE_PROXY;
			case SHELL_HOST_VALUE: return SHELL_HOST;
			case SIMPLE_HOST_VALUE: return SIMPLE_HOST;
			case SIMPLE_PROCESS_VALUE: return SIMPLE_PROCESS;
			case SMARTPHONE_VALUE: return SMARTPHONE;
			case SMARTWATCH_VALUE: return SMARTWATCH;
			case SOCKET_LAN_VALUE: return SOCKET_LAN;
			case SPACE_VALUE: return SPACE;
			case SPAM_DATA_VALUE: return SPAM_DATA;
			case SPECIAL_CATEGORY_DATA_VALUE: return SPECIAL_CATEGORY_DATA;
			case STAKEHOLDER_VALUE: return STAKEHOLDER;
			case STORED_DATA_POOL_VALUE: return STORED_DATA_POOL;
			case TABLET_VALUE: return TABLET;
			case TEMP_DATA_RELAY_VALUE: return TEMP_DATA_RELAY;
			case TETHERING_SEGMENT_VALUE: return TETHERING_SEGMENT;
			case TEXT_EDITOR_VALUE: return TEXT_EDITOR;
			case THING_VALUE: return THING;
			case TRIVIAL_HOST_VALUE: return TRIVIAL_HOST;
			case TRIVIAL_PROCESS_VALUE: return TRIVIAL_PROCESS;
			case TYPE_OVERLAY_DATA_VALUE: return TYPE_OVERLAY_DATA;
			case TYPE_OVERLAY_HOST_VALUE: return TYPE_OVERLAY_HOST;
			case TYPE_OVERLAY_PROCESS_VALUE: return TYPE_OVERLAY_PROCESS;
			case TYPE_OVERLAY_SUBNET_VALUE: return TYPE_OVERLAY_SUBNET;
			case USB_DEVICE_VALUE: return USB_DEVICE;
			case USB_HOST_VALUE: return USB_HOST;
			case USB_PAIR_VALUE: return USB_PAIR;
			case UPDATE_POOL_VALUE: return UPDATE_POOL;
			case VCLUSTER_VALUE: return VCLUSTER;
			case VM_VALUE: return VM;
			case VPN_VALUE: return VPN;
			case VROUTER_VALUE: return VROUTER;
			case VXLAN_VALUE: return VXLAN;
			case VIRTUAL_CHANNEL_VALUE: return VIRTUAL_CHANNEL;
			case VIRTUAL_HOST_VALUE: return VIRTUAL_HOST;
			case VIRTUAL_SUBNET_VALUE: return VIRTUAL_SUBNET;
			case WEB_APP_VALUE: return WEB_APP;
			case WEB_BROWSER_VALUE: return WEB_BROWSER;
			case WEB_CLIENT_VALUE: return WEB_CLIENT;
			case WI_FI_LAN_VALUE: return WI_FI_LAN;
			case WIRED_LAN_VALUE: return WIRED_LAN;
			case WIRED_SUBNET_VALUE: return WIRED_SUBNET;
			case WORKER_VALUE: return WORKER;
			case WORKSTATION_VALUE: return WORKSTATION;
			case WORLD_VALUE: return WORLD;
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
	private TRVAAssetKind(int value, String name, String literal) {
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
	
} //TRVAAssetKind
