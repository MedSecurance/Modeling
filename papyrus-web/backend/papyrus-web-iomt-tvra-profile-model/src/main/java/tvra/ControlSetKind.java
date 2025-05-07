/**
 */
package tvra;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Control Set Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tvra.TvraPackage#getControlSetKind()
 * @model
 * @generated
 */
public enum ControlSetKind implements Enumerator {
	/**
	 * The '<em><b>CS Access Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ACCESS_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	CS_ACCESS_CONTROL(0, "CSAccessControl", "CSAccessControl"), /**
	 * The '<em><b>CS Access Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ACCESS_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	CS_ACCESS_KEY(1, "CSAccessKey", "CSAccessKey"), /**
	 * The '<em><b>CS Access Policy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ACCESS_POLICY_VALUE
	 * @generated
	 * @ordered
	 */
	CS_ACCESS_POLICY(2, "CSAccessPolicy", "CSAccessPolicy"),

	/**
	 * The '<em><b>CS Address Reservation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ADDRESS_RESERVATION_VALUE
	 * @generated
	 * @ordered
	 */
	CS_ADDRESS_RESERVATION(3, "CSAddressReservation", "CSAddressReservation"), /**
	 * The '<em><b>CS Address Whitelisting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ADDRESS_WHITELISTING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_ADDRESS_WHITELISTING(4, "CSAddressWhitelisting", "CSAddressWhitelisting"), /**
	 * The '<em><b>CS Anti Malware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ANTI_MALWARE_VALUE
	 * @generated
	 * @ordered
	 */
	CS_ANTI_MALWARE(5, "CSAntiMalware", "CSAntiMalware"),

	/**
	 * The '<em><b>CS Application FW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_APPLICATION_FW_VALUE
	 * @generated
	 * @ordered
	 */
	CS_APPLICATION_FW(6, "CSApplicationFW", "CSApplicationFW"), /**
	 * The '<em><b>CS Authentication Limits</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_AUTHENTICATION_LIMITS_VALUE
	 * @generated
	 * @ordered
	 */
	CS_AUTHENTICATION_LIMITS(7, "CSAuthenticationLimits", "CSAuthenticationLimits"),

	/**
	 * The '<em><b>CS Auto Data Governance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_AUTO_DATA_GOVERNANCE_VALUE
	 * @generated
	 * @ordered
	 */
	CS_AUTO_DATA_GOVERNANCE(8, "CSAutoDataGovernance", "CSAutoDataGovernance"), /**
	 * The '<em><b>CS Auto Provisioning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_AUTO_PROVISIONING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_AUTO_PROVISIONING(9, "CSAutoProvisioning", "CSAutoProvisioning"), /**
	 * The '<em><b>CS Bandwidth Management</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_BANDWIDTH_MANAGEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CS_BANDWIDTH_MANAGEMENT(10, "CSBandwidthManagement", "CSBandwidthManagement"), /**
	 * The '<em><b>CS Basic Security Training</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_BASIC_SECURITY_TRAINING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_BASIC_SECURITY_TRAINING(11, "CSBasicSecurityTraining", "CSBasicSecurityTraining"), /**
	 * The '<em><b>CS Biometric ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_BIOMETRIC_ID_VALUE
	 * @generated
	 * @ordered
	 */
	CS_BIOMETRIC_ID(12, "CSBiometricID", "CSBiometricID"), /**
	 * The '<em><b>CS Biometric ID Verifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_BIOMETRIC_ID_VERIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	CS_BIOMETRIC_ID_VERIFIER(13, "CSBiometricIDVerifier", "CSBiometricIDVerifier"), /**
	 * The '<em><b>CS Biometric Lock</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_BIOMETRIC_LOCK_VALUE
	 * @generated
	 * @ordered
	 */
	CS_BIOMETRIC_LOCK(14, "CSBiometricLock", "CSBiometricLock"), /**
	 * The '<em><b>CS Break The Glass</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_BREAK_THE_GLASS_VALUE
	 * @generated
	 * @ordered
	 */
	CS_BREAK_THE_GLASS(15, "CSBreakTheGlass", "CSBreakTheGlass"), /**
	 * The '<em><b>CS Chip And PIN Card</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CHIP_AND_PIN_CARD_VALUE
	 * @generated
	 * @ordered
	 */
	CS_CHIP_AND_PIN_CARD(16, "CSChipAndPINCard", "CSChipAndPINCard"), /**
	 * The '<em><b>CS Chip And PIN Lock</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CHIP_AND_PIN_LOCK_VALUE
	 * @generated
	 * @ordered
	 */
	CS_CHIP_AND_PIN_LOCK(17, "CSChipAndPINLock", "CSChipAndPINLock"), /**
	 * The '<em><b>CS Chip And PIN Verifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CHIP_AND_PIN_VERIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	CS_CHIP_AND_PIN_VERIFIER(18, "CSChipAndPINVerifier", "CSChipAndPINVerifier"), /**
	 * The '<em><b>CS Clear Deputy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CLEAR_DEPUTY_VALUE
	 * @generated
	 * @ordered
	 */
	CS_CLEAR_DEPUTY(19, "CSClearDeputy", "CSClearDeputy"), /**
	 * The '<em><b>CS Clustering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CLUSTERING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_CLUSTERING(20, "CSClustering", "CSClustering"), /**
	 * The '<em><b>CS Consent Enforcement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CONSENT_ENFORCEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CS_CONSENT_ENFORCEMENT(21, "CSConsentEnforcement", "CSConsentEnforcement"), /**
	 * The '<em><b>CS Consent Interface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CONSENT_INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	CS_CONSENT_INTERFACE(22, "CSConsentInterface", "CSConsentInterface"), /**
	 * The '<em><b>CS Consent Management</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CONSENT_MANAGEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CS_CONSENT_MANAGEMENT(23, "CSConsentManagement", "CSConsentManagement"), /**
	 * The '<em><b>CS Continuous Auth N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CONTINUOUS_AUTH_N_VALUE
	 * @generated
	 * @ordered
	 */
	CS_CONTINUOUS_AUTH_N(24, "CSContinuousAuthN", "CSContinuousAuthN"), /**
	 * The '<em><b>CS Continuous Auth NID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CONTINUOUS_AUTH_NID_VALUE
	 * @generated
	 * @ordered
	 */
	CS_CONTINUOUS_AUTH_NID(25, "CSContinuousAuthNID", "CSContinuousAuthNID"), /**
	 * The '<em><b>CS Continuous Auth Verifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CONTINUOUS_AUTH_VERIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	CS_CONTINUOUS_AUTH_VERIFIER(26, "CSContinuousAuthVerifier", "CSContinuousAuthVerifier"), /**
	 * The '<em><b>CS Continuous Occupation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CONTINUOUS_OCCUPATION_VALUE
	 * @generated
	 * @ordered
	 */
	CS_CONTINUOUS_OCCUPATION(27, "CSContinuousOccupation", "CSContinuousOccupation"), /**
	 * The '<em><b>CSD Do SFiltering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSD_DO_SFILTERING_VALUE
	 * @generated
	 * @ordered
	 */
	CSD_DO_SFILTERING(28, "CSDDoSFiltering", "CSDDoSFiltering"), /**
	 * The '<em><b>CS Device Certification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DEVICE_CERTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	CS_DEVICE_CERTIFICATION(29, "CSDeviceCertification", "CSDeviceCertification"), /**
	 * The '<em><b>CS Disable Client Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLE_CLIENT_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	CS_DISABLE_CLIENT_ACCESS(30, "CSDisableClientAccess", "CSDisableClientAccess"), /**
	 * The '<em><b>CS Disable Interface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLE_INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	CS_DISABLE_INTERFACE(31, "CSDisableInterface", "CSDisableInterface"), /**
	 * The '<em><b>CS Disable Mesh Routing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLE_MESH_ROUTING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_DISABLE_MESH_ROUTING(32, "CSDisableMeshRouting", "CSDisableMeshRouting"), /**
	 * The '<em><b>CS Disable Network</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLE_NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	CS_DISABLE_NETWORK(33, "CSDisableNetwork", "CSDisableNetwork"), /**
	 * The '<em><b>CS Disable Network Provision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLE_NETWORK_PROVISION_VALUE
	 * @generated
	 * @ordered
	 */
	CS_DISABLE_NETWORK_PROVISION(34, "CSDisableNetworkProvision", "CSDisableNetworkProvision"), /**
	 * The '<em><b>CS Disable Service Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLE_SERVICE_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	CS_DISABLE_SERVICE_ACCESS(35, "CSDisableServiceAccess", "CSDisableServiceAccess"), /**
	 * The '<em><b>CS Disable Service Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLE_SERVICE_CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	CS_DISABLE_SERVICE_CHANNEL(36, "CSDisableServiceChannel", "CSDisableServiceChannel"), /**
	 * The '<em><b>CS Disable Tethering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLE_TETHERING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_DISABLE_TETHERING(37, "CSDisableTethering", "CSDisableTethering"), /**
	 * The '<em><b>CS Disabled Data Flow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLED_DATA_FLOW_VALUE
	 * @generated
	 * @ordered
	 */
	CS_DISABLED_DATA_FLOW(38, "CSDisabledDataFlow", "CSDisabledDataFlow"), /**
	 * The '<em><b>CS Disabled Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLED_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	CS_DISABLED_HOST(39, "CSDisabledHost", "CSDisabledHost"), /**
	 * The '<em><b>CS Disabled Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLED_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	CS_DISABLED_PROCESS(40, "CSDisabledProcess", "CSDisabledProcess"), /**
	 * The '<em><b>CS Encrypted Comms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ENCRYPTED_COMMS_VALUE
	 * @generated
	 * @ordered
	 */
	CS_ENCRYPTED_COMMS(41, "CSEncryptedComms", "CSEncryptedComms"), /**
	 * The '<em><b>CS Encrypted Processing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ENCRYPTED_PROCESSING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_ENCRYPTED_PROCESSING(42, "CSEncryptedProcessing", "CSEncryptedProcessing"), /**
	 * The '<em><b>CS Encryption</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ENCRYPTION_VALUE
	 * @generated
	 * @ordered
	 */
	CS_ENCRYPTION(43, "CSEncryption", "CSEncryption"),

	/**
	 * The '<em><b>CSFW Block</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSFW_BLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	CSFW_BLOCK(44, "CSFWBlock", "CSFWBlock"), /**
	 * The '<em><b>CS Formal Verification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_FORMAL_VERIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	CS_FORMAL_VERIFICATION(45, "CSFormalVerification", "CSFormalVerification"), /**
	 * The '<em><b>CSGDPR Compliance Training</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSGDPR_COMPLIANCE_TRAINING_VALUE
	 * @generated
	 * @ordered
	 */
	CSGDPR_COMPLIANCE_TRAINING(46, "CSGDPRComplianceTraining", "CSGDPRComplianceTraining"), /**
	 * The '<em><b>CSGDPR Governance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSGDPR_GOVERNANCE_VALUE
	 * @generated
	 * @ordered
	 */
	CSGDPR_GOVERNANCE(47, "CSGDPRGovernance", "CSGDPRGovernance"), /**
	 * The '<em><b>CSGDPR Privacy Shield</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSGDPR_PRIVACY_SHIELD_VALUE
	 * @generated
	 * @ordered
	 */
	CSGDPR_PRIVACY_SHIELD(48, "CSGDPRPrivacyShield", "CSGDPRPrivacyShield"), /**
	 * The '<em><b>CS Homomorphic Encryption</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_HOMOMORPHIC_ENCRYPTION_VALUE
	 * @generated
	 * @ordered
	 */
	CS_HOMOMORPHIC_ENCRYPTION(49, "CSHomomorphicEncryption", "CSHomomorphicEncryption"), /**
	 * The '<em><b>CS Host Encryption</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_HOST_ENCRYPTION_VALUE
	 * @generated
	 * @ordered
	 */
	CS_HOST_ENCRYPTION(50, "CSHostEncryption", "CSHostEncryption"), /**
	 * The '<em><b>CS Host Monitoring</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_HOST_MONITORING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_HOST_MONITORING(51, "CSHostMonitoring", "CSHostMonitoring"), /**
	 * The '<em><b>CS Ignore Physical Threats</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_IGNORE_PHYSICAL_THREATS_VALUE
	 * @generated
	 * @ordered
	 */
	CS_IGNORE_PHYSICAL_THREATS(52, "CSIgnorePhysicalThreats", "CSIgnorePhysicalThreats"), /**
	 * The '<em><b>CS Impersonal Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_IMPERSONAL_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	CS_IMPERSONAL_DATA(53, "CSImpersonalData", "CSImpersonalData"), /**
	 * The '<em><b>CS Include Physical Threats</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_INCLUDE_PHYSICAL_THREATS_VALUE
	 * @generated
	 * @ordered
	 */
	CS_INCLUDE_PHYSICAL_THREATS(54, "CSIncludePhysicalThreats", "CSIncludePhysicalThreats"), /**
	 * The '<em><b>CS Independent Instances</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_INDEPENDENT_INSTANCES_VALUE
	 * @generated
	 * @ordered
	 */
	CS_INDEPENDENT_INSTANCES(55, "CSIndependentInstances", "CSIndependentInstances"), /**
	 * The '<em><b>CS Inferred Data Asset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_INFERRED_DATA_ASSET_VALUE
	 * @generated
	 * @ordered
	 */
	CS_INFERRED_DATA_ASSET(56, "CSInferredDataAsset", "CSInferredDataAsset"), /**
	 * The '<em><b>CS Integrity Protection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_INTEGRITY_PROTECTION_VALUE
	 * @generated
	 * @ordered
	 */
	CS_INTEGRITY_PROTECTION(57, "CSIntegrityProtection", "CSIntegrityProtection"),

	/**
	 * The '<em><b>CS Key Management</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_KEY_MANAGEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CS_KEY_MANAGEMENT(58, "CSKeyManagement", "CSKeyManagement"), /**
	 * The '<em><b>CS Legal Competence Check</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_LEGAL_COMPETENCE_CHECK_VALUE
	 * @generated
	 * @ordered
	 */
	CS_LEGAL_COMPETENCE_CHECK(59, "CSLegalCompetenceCheck", "CSLegalCompetenceCheck"), /**
	 * The '<em><b>CS Legal Guardian Consent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_LEGAL_GUARDIAN_CONSENT_VALUE
	 * @generated
	 * @ordered
	 */
	CS_LEGAL_GUARDIAN_CONSENT(60, "CSLegalGuardianConsent", "CSLegalGuardianConsent"), /**
	 * The '<em><b>CS Load Monitoring</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_LOAD_MONITORING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_LOAD_MONITORING(61, "CSLoadMonitoring", "CSLoadMonitoring"), /**
	 * The '<em><b>CS Logging</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_LOGGING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_LOGGING(62, "CSLogging", "CSLogging"), /**
	 * The '<em><b>CS Low Priority</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_LOW_PRIORITY_VALUE
	 * @generated
	 * @ordered
	 */
	CS_LOW_PRIORITY(63, "CSLowPriority", "CSLowPriority"), /**
	 * The '<em><b>CS Manual Action Taken</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_MANUAL_ACTION_TAKEN_VALUE
	 * @generated
	 * @ordered
	 */
	CS_MANUAL_ACTION_TAKEN(64, "CSManualActionTaken", "CSManualActionTaken"), /**
	 * The '<em><b>CS Manual Intervention</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_MANUAL_INTERVENTION_VALUE
	 * @generated
	 * @ordered
	 */
	CS_MANUAL_INTERVENTION(65, "CSManualIntervention", "CSManualIntervention"), /**
	 * The '<em><b>CS Multiple Cell NIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_MULTIPLE_CELL_NIC_VALUE
	 * @generated
	 * @ordered
	 */
	CS_MULTIPLE_CELL_NIC(66, "CSMultipleCellNIC", "CSMultipleCellNIC"), /**
	 * The '<em><b>CS Multiple Wi Fi NIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_MULTIPLE_WI_FI_NIC_VALUE
	 * @generated
	 * @ordered
	 */
	CS_MULTIPLE_WI_FI_NIC(67, "CSMultipleWiFiNIC", "CSMultipleWiFiNIC"), /**
	 * The '<em><b>CS Multiple Wired NIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_MULTIPLE_WIRED_NIC_VALUE
	 * @generated
	 * @ordered
	 */
	CS_MULTIPLE_WIRED_NIC(68, "CSMultipleWiredNIC", "CSMultipleWiredNIC"), /**
	 * The '<em><b>CS One Time Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ONE_TIME_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	CS_ONE_TIME_KEY(69, "CSOneTimeKey", "CSOneTimeKey"), /**
	 * The '<em><b>CS One Time Key Verifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ONE_TIME_KEY_VERIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	CS_ONE_TIME_KEY_VERIFIER(70, "CSOneTimeKeyVerifier", "CSOneTimeKeyVerifier"), /**
	 * The '<em><b>CS Out Of Band Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_OUT_OF_BAND_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	CS_OUT_OF_BAND_KEY(71, "CSOutOfBandKey", "CSOutOfBandKey"), /**
	 * The '<em><b>CS Out Of Band Key Verifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_OUT_OF_BAND_KEY_VERIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	CS_OUT_OF_BAND_KEY_VERIFIER(72, "CSOutOfBandKeyVerifier", "CSOutOfBandKeyVerifier"), /**
	 * The '<em><b>CS Parquet Encryption</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PARQUET_ENCRYPTION_VALUE
	 * @generated
	 * @ordered
	 */
	CS_PARQUET_ENCRYPTION(73, "CSParquetEncryption", "CSParquetEncryption"), /**
	 * The '<em><b>CS Password</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PASSWORD_VALUE
	 * @generated
	 * @ordered
	 */
	CS_PASSWORD(74, "CSPassword", "CSPassword"),

	/**
	 * The '<em><b>CS Password Quality Check</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PASSWORD_QUALITY_CHECK_VALUE
	 * @generated
	 * @ordered
	 */
	CS_PASSWORD_QUALITY_CHECK(75, "CSPasswordQualityCheck", "CSPasswordQualityCheck"), /**
	 * The '<em><b>CS Password Reset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PASSWORD_RESET_VALUE
	 * @generated
	 * @ordered
	 */
	CS_PASSWORD_RESET(76, "CSPasswordReset", "CSPasswordReset"), /**
	 * The '<em><b>CS Password Store</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PASSWORD_STORE_VALUE
	 * @generated
	 * @ordered
	 */
	CS_PASSWORD_STORE(77, "CSPasswordStore", "CSPasswordStore"), /**
	 * The '<em><b>CS Password Verifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PASSWORD_VERIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	CS_PASSWORD_VERIFIER(78, "CSPasswordVerifier", "CSPasswordVerifier"),

	/**
	 * The '<em><b>CS Penetration Testing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PENETRATION_TESTING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_PENETRATION_TESTING(79, "CSPenetrationTesting", "CSPenetrationTesting"), /**
	 * The '<em><b>CS Personal Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PERSONAL_DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	CS_PERSONAL_DEVICE(80, "CSPersonalDevice", "CSPersonalDevice"),

	/**
	 * The '<em><b>CS Physical Checks</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PHYSICAL_CHECKS_VALUE
	 * @generated
	 * @ordered
	 */
	CS_PHYSICAL_CHECKS(81, "CSPhysicalChecks", "CSPhysicalChecks"), /**
	 * The '<em><b>CS Physical Device Protection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PHYSICAL_DEVICE_PROTECTION_VALUE
	 * @generated
	 * @ordered
	 */
	CS_PHYSICAL_DEVICE_PROTECTION(82, "CSPhysicalDeviceProtection", "CSPhysicalDeviceProtection"), /**
	 * The '<em><b>CS Physical ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PHYSICAL_ID_VALUE
	 * @generated
	 * @ordered
	 */
	CS_PHYSICAL_ID(83, "CSPhysicalID", "CSPhysicalID"), /**
	 * The '<em><b>CS Physical ID Verifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PHYSICAL_ID_VERIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	CS_PHYSICAL_ID_VERIFIER(84, "CSPhysicalIDVerifier", "CSPhysicalIDVerifier"), /**
	 * The '<em><b>CS Physical Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PHYSICAL_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	CS_PHYSICAL_KEY(85, "CSPhysicalKey", "CSPhysicalKey"),

	/**
	 * The '<em><b>CS Physical Lock</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PHYSICAL_LOCK_VALUE
	 * @generated
	 * @ordered
	 */
	CS_PHYSICAL_LOCK(86, "CSPhysicalLock", "CSPhysicalLock"),

	/**
	 * The '<em><b>CS Physical Patrols</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PHYSICAL_PATROLS_VALUE
	 * @generated
	 * @ordered
	 */
	CS_PHYSICAL_PATROLS(87, "CSPhysicalPatrols", "CSPhysicalPatrols"), /**
	 * The '<em><b>CS Physically Observable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PHYSICALLY_OBSERVABLE_VALUE
	 * @generated
	 * @ordered
	 */
	CS_PHYSICALLY_OBSERVABLE(88, "CSPhysicallyObservable", "CSPhysicallyObservable"), /**
	 * The '<em><b>CS Process Monitoring</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PROCESS_MONITORING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_PROCESS_MONITORING(89, "CSProcessMonitoring", "CSProcessMonitoring"), /**
	 * The '<em><b>CS Remote Wiping</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_REMOTE_WIPING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_REMOTE_WIPING(90, "CSRemoteWiping", "CSRemoteWiping"), /**
	 * The '<em><b>CS Replication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_REPLICATION_VALUE
	 * @generated
	 * @ordered
	 */
	CS_REPLICATION(91, "CSReplication", "CSReplication"), /**
	 * The '<em><b>CS Restricted Shell</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_RESTRICTED_SHELL_VALUE
	 * @generated
	 * @ordered
	 */
	CS_RESTRICTED_SHELL(92, "CSRestrictedShell", "CSRestrictedShell"), /**
	 * The '<em><b>CSSIM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSSIM_VALUE
	 * @generated
	 * @ordered
	 */
	CSSIM(93, "CSSIM", "CSSIM"), /**
	 * The '<em><b>CSSLA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSSLA_VALUE
	 * @generated
	 * @ordered
	 */
	CSSLA(94, "CSSLA", "CSSLA"), /**
	 * The '<em><b>CSSLA Enforcement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSSLA_ENFORCEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CSSLA_ENFORCEMENT(95, "CSSLAEnforcement", "CSSLAEnforcement"), /**
	 * The '<em><b>CS Safe Control Mode</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SAFE_CONTROL_MODE_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SAFE_CONTROL_MODE(96, "CSSafeControlMode", "CSSafeControlMode"), /**
	 * The '<em><b>CS Safe Control Setting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SAFE_CONTROL_SETTING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SAFE_CONTROL_SETTING(97, "CSSafeControlSetting", "CSSafeControlSetting"), /**
	 * The '<em><b>CS Safe Io TController</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SAFE_IO_TCONTROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SAFE_IO_TCONTROLLER(98, "CSSafeIoTController", "CSSafeIoTController"), /**
	 * The '<em><b>CS Safety Training</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SAFETY_TRAINING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SAFETY_TRAINING(99, "CSSafetyTraining", "CSSafetyTraining"), /**
	 * The '<em><b>CS Screen Lock</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SCREEN_LOCK_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SCREEN_LOCK(100, "CSScreenLock", "CSScreenLock"), /**
	 * The '<em><b>CS Screened</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SCREENED_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SCREENED(101, "CSScreened", "CSScreened"), /**
	 * The '<em><b>CS Screening</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SCREENING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SCREENING(102, "CSScreening", "CSScreening"), /**
	 * The '<em><b>CS Secure BIOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SECURE_BIOS_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SECURE_BIOS(103, "CSSecureBIOS", "CSSecureBIOS"), /**
	 * The '<em><b>CS Secure Config</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SECURE_CONFIG_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SECURE_CONFIG(104, "CSSecureConfig", "CSSecureConfig"),

	/**
	 * The '<em><b>CS Secure Enclave</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SECURE_ENCLAVE_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SECURE_ENCLAVE(105, "CSSecureEnclave", "CSSecureEnclave"), /**
	 * The '<em><b>CS Secure Execution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SECURE_EXECUTION_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SECURE_EXECUTION(106, "CSSecureExecution", "CSSecureExecution"), /**
	 * The '<em><b>CS Secure Location</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SECURE_LOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SECURE_LOCATION(107, "CSSecureLocation", "CSSecureLocation"), /**
	 * The '<em><b>CS Security Training</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SECURITY_TRAINING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SECURITY_TRAINING(108, "CSSecurityTraining", "CSSecurityTraining"), /**
	 * The '<em><b>CS Shared Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SHARED_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SHARED_KEY(109, "CSSharedKey", "CSSharedKey"),

	/**
	 * The '<em><b>CS Shared Key Verifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SHARED_KEY_VERIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SHARED_KEY_VERIFIER(110, "CSSharedKeyVerifier", "CSSharedKeyVerifier"),

	/**
	 * The '<em><b>CS Simple Secure Pairing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SIMPLE_SECURE_PAIRING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SIMPLE_SECURE_PAIRING(111, "CSSimpleSecurePairing", "CSSimpleSecurePairing"), /**
	 * The '<em><b>CS Software Certification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SOFTWARE_CERTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SOFTWARE_CERTIFICATION(112, "CSSoftwareCertification", "CSSoftwareCertification"), /**
	 * The '<em><b>CS Software Patched</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SOFTWARE_PATCHED_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SOFTWARE_PATCHED(113, "CSSoftwarePatched", "CSSoftwarePatched"), /**
	 * The '<em><b>CS Software Patching</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SOFTWARE_PATCHING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SOFTWARE_PATCHING(114, "CSSoftwarePatching", "CSSoftwarePatching"),

	/**
	 * The '<em><b>CS Software Testing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SOFTWARE_TESTING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SOFTWARE_TESTING(115, "CSSoftwareTesting", "CSSoftwareTesting"), /**
	 * The '<em><b>CS Spam Filtering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SPAM_FILTERING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SPAM_FILTERING(116, "CSSpamFiltering", "CSSpamFiltering"), /**
	 * The '<em><b>CS Static Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_STATIC_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	CS_STATIC_DATA(117, "CSStaticData", "CSStaticData"), /**
	 * The '<em><b>CS Subject To GDPR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUBJECT_TO_GDPR_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SUBJECT_TO_GDPR(118, "CSSubjectToGDPR", "CSSubjectToGDPR"), /**
	 * The '<em><b>CS Suspend Corrupt Data Flow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_CORRUPT_DATA_FLOW_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SUSPEND_CORRUPT_DATA_FLOW(119, "CSSuspendCorruptDataFlow", "CSSuspendCorruptDataFlow"), /**
	 * The '<em><b>CS Suspend Excessive Client Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_EXCESSIVE_CLIENT_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SUSPEND_EXCESSIVE_CLIENT_ACCESS(120, "CSSuspendExcessiveClientAccess", "CSSuspendExcessiveClientAccess"), /**
	 * The '<em><b>CS Suspend Infected Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_INFECTED_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SUSPEND_INFECTED_HOST(121, "CSSuspendInfectedHost", "CSSuspendInfectedHost"), /**
	 * The '<em><b>CS Suspend Infected Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_INFECTED_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SUSPEND_INFECTED_PROCESS(122, "CSSuspendInfectedProcess", "CSSuspendInfectedProcess"), /**
	 * The '<em><b>CS Suspend Insecure Service Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_INSECURE_SERVICE_CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SUSPEND_INSECURE_SERVICE_CHANNEL(123, "CSSuspendInsecureServiceChannel", "CSSuspendInsecureServiceChannel"), /**
	 * The '<em><b>CS Suspend Outbound Flow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_OUTBOUND_FLOW_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SUSPEND_OUTBOUND_FLOW(124, "CSSuspendOutboundFlow", "CSSuspendOutboundFlow"), /**
	 * The '<em><b>CS Suspend Sensitive Data Flow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_SENSITIVE_DATA_FLOW_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SUSPEND_SENSITIVE_DATA_FLOW(125, "CSSuspendSensitiveDataFlow", "CSSuspendSensitiveDataFlow"), /**
	 * The '<em><b>CS Suspend Unauthentic Client Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_UNAUTHENTIC_CLIENT_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SUSPEND_UNAUTHENTIC_CLIENT_ACCESS(126, "CSSuspendUnauthenticClientAccess", "CSSuspendUnauthenticClientAccess"), /**
	 * The '<em><b>CS Suspend Unreliable Controller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_UNRELIABLE_CONTROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SUSPEND_UNRELIABLE_CONTROLLER(127, "CSSuspendUnreliableController", "CSSuspendUnreliableController"), /**
	 * The '<em><b>CS Suspend Untrustworthy Client Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_UNTRUSTWORTHY_CLIENT_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SUSPEND_UNTRUSTWORTHY_CLIENT_ACCESS(128, "CSSuspendUntrustworthyClientAccess", "CSSuspendUntrustworthyClientAccess"), /**
	 * The '<em><b>CS Suspend Vulnerable Host</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_VULNERABLE_HOST_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SUSPEND_VULNERABLE_HOST(129, "CSSuspendVulnerableHost", "CSSuspendVulnerableHost"), /**
	 * The '<em><b>CS Suspend Vulnerable Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_VULNERABLE_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SUSPEND_VULNERABLE_SERVICE(130, "CSSuspendVulnerableService", "CSSuspendVulnerableService"), /**
	 * The '<em><b>CS Suspend Vulnerable Service Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_VULNERABLE_SERVICE_CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SUSPEND_VULNERABLE_SERVICE_CHANNEL(131, "CSSuspendVulnerableServiceChannel", "CSSuspendVulnerableServiceChannel"), /**
	 * The '<em><b>CS System Security Training</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SYSTEM_SECURITY_TRAINING_VALUE
	 * @generated
	 * @ordered
	 */
	CS_SYSTEM_SECURITY_TRAINING(132, "CSSystemSecurityTraining", "CSSystemSecurityTraining"), /**
	 * The '<em><b>CSTLS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSTLS_VALUE
	 * @generated
	 * @ordered
	 */
	CSTLS(133, "CSTLS", "CSTLS"), /**
	 * The '<em><b>CS Team Leadership</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_TEAM_LEADERSHIP_VALUE
	 * @generated
	 * @ordered
	 */
	CS_TEAM_LEADERSHIP(134, "CSTeamLeadership", "CSTeamLeadership"), /**
	 * The '<em><b>CS Team Role</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_TEAM_ROLE_VALUE
	 * @generated
	 * @ordered
	 */
	CS_TEAM_ROLE(135, "CSTeamRole", "CSTeamRole"), /**
	 * The '<em><b>CS Unmanaged</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_UNMANAGED_VALUE
	 * @generated
	 * @ordered
	 */
	CS_UNMANAGED(136, "CSUnmanaged", "CSUnmanaged"),

	/**
	 * The '<em><b>CS Uses No Email</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_USES_NO_EMAIL_VALUE
	 * @generated
	 * @ordered
	 */
	CS_USES_NO_EMAIL(137, "CSUsesNoEmail", "CSUsesNoEmail"), /**
	 * The '<em><b>CS Vital Interests</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_VITAL_INTERESTS_VALUE
	 * @generated
	 * @ordered
	 */
	CS_VITAL_INTERESTS(138, "CSVitalInterests", "CSVitalInterests"), /**
	 * The '<em><b>CSX509</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSX509_VALUE
	 * @generated
	 * @ordered
	 */
	CSX509(139, "CSX509", "CSX509"), /**
	 * The '<em><b>CSX509 Client Verifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSX509_CLIENT_VERIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	CSX509_CLIENT_VERIFIER(140, "CSX509ClientVerifier", "CSX509ClientVerifier"), /**
	 * The '<em><b>CSX509 Service Verifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSX509_SERVICE_VERIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	CSX509_SERVICE_VERIFIER(141, "CSX509ServiceVerifier", "CSX509ServiceVerifier"), /**
	 * The '<em><b>CSXSS Sanitisation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSXSS_SANITISATION_VALUE
	 * @generated
	 * @ordered
	 */
	CSXSS_SANITISATION(142, "CSXSSSanitisation", "CSXSSSanitisation");

	/**
	 * The '<em><b>CS Access Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ACCESS_CONTROL
	 * @model name="CSAccessControl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-AccessControl'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_ACCESS_CONTROL_VALUE = 0;

	/**
	 * The '<em><b>CS Access Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ACCESS_KEY
	 * @model name="CSAccessKey"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-AccessKey'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_ACCESS_KEY_VALUE = 1;

	/**
	 * The '<em><b>CS Access Policy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ACCESS_POLICY
	 * @model name="CSAccessPolicy"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-AccessPolicy'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_ACCESS_POLICY_VALUE = 2;

	/**
	 * The '<em><b>CS Address Reservation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ADDRESS_RESERVATION
	 * @model name="CSAddressReservation"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-AddressReservation'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_ADDRESS_RESERVATION_VALUE = 3;

	/**
	 * The '<em><b>CS Address Whitelisting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ADDRESS_WHITELISTING
	 * @model name="CSAddressWhitelisting"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-AddressWhitelisting'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_ADDRESS_WHITELISTING_VALUE = 4;

	/**
	 * The '<em><b>CS Anti Malware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ANTI_MALWARE
	 * @model name="CSAntiMalware"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-AntiMalware'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_ANTI_MALWARE_VALUE = 5;

	/**
	 * The '<em><b>CS Application FW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_APPLICATION_FW
	 * @model name="CSApplicationFW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-ApplicationFW'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_APPLICATION_FW_VALUE = 6;

	/**
	 * The '<em><b>CS Authentication Limits</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_AUTHENTICATION_LIMITS
	 * @model name="CSAuthenticationLimits"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-AuthenticationLimits'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_AUTHENTICATION_LIMITS_VALUE = 7;

	/**
	 * The '<em><b>CS Auto Data Governance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_AUTO_DATA_GOVERNANCE
	 * @model name="CSAutoDataGovernance"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-AutoDataGovernance'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_AUTO_DATA_GOVERNANCE_VALUE = 8;

	/**
	 * The '<em><b>CS Auto Provisioning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_AUTO_PROVISIONING
	 * @model name="CSAutoProvisioning"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-AutoProvisioning'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_AUTO_PROVISIONING_VALUE = 9;

	/**
	 * The '<em><b>CS Bandwidth Management</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_BANDWIDTH_MANAGEMENT
	 * @model name="CSBandwidthManagement"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-BandwidthManagement'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_BANDWIDTH_MANAGEMENT_VALUE = 10;

	/**
	 * The '<em><b>CS Basic Security Training</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_BASIC_SECURITY_TRAINING
	 * @model name="CSBasicSecurityTraining"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-BasicSecurityTraining'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_BASIC_SECURITY_TRAINING_VALUE = 11;

	/**
	 * The '<em><b>CS Biometric ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_BIOMETRIC_ID
	 * @model name="CSBiometricID"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-BiometricID'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_BIOMETRIC_ID_VALUE = 12;

	/**
	 * The '<em><b>CS Biometric ID Verifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_BIOMETRIC_ID_VERIFIER
	 * @model name="CSBiometricIDVerifier"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-BiometricIDVerifier'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_BIOMETRIC_ID_VERIFIER_VALUE = 13;

	/**
	 * The '<em><b>CS Biometric Lock</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_BIOMETRIC_LOCK
	 * @model name="CSBiometricLock"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-BiometricLock'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_BIOMETRIC_LOCK_VALUE = 14;

	/**
	 * The '<em><b>CS Break The Glass</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_BREAK_THE_GLASS
	 * @model name="CSBreakTheGlass"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-BreakTheGlass'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_BREAK_THE_GLASS_VALUE = 15;

	/**
	 * The '<em><b>CS Chip And PIN Card</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CHIP_AND_PIN_CARD
	 * @model name="CSChipAndPINCard"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-ChipAndPINCard'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_CHIP_AND_PIN_CARD_VALUE = 16;

	/**
	 * The '<em><b>CS Chip And PIN Lock</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CHIP_AND_PIN_LOCK
	 * @model name="CSChipAndPINLock"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-ChipAndPINLock'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_CHIP_AND_PIN_LOCK_VALUE = 17;

	/**
	 * The '<em><b>CS Chip And PIN Verifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CHIP_AND_PIN_VERIFIER
	 * @model name="CSChipAndPINVerifier"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-ChipAndPINVerifier'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_CHIP_AND_PIN_VERIFIER_VALUE = 18;

	/**
	 * The '<em><b>CS Clear Deputy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CLEAR_DEPUTY
	 * @model name="CSClearDeputy"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-ClearDeputy'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_CLEAR_DEPUTY_VALUE = 19;

	/**
	 * The '<em><b>CS Clustering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CLUSTERING
	 * @model name="CSClustering"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-Clustering'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_CLUSTERING_VALUE = 20;

	/**
	 * The '<em><b>CS Consent Enforcement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CONSENT_ENFORCEMENT
	 * @model name="CSConsentEnforcement"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-ConsentEnforcement'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_CONSENT_ENFORCEMENT_VALUE = 21;

	/**
	 * The '<em><b>CS Consent Interface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CONSENT_INTERFACE
	 * @model name="CSConsentInterface"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-ConsentInterface'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_CONSENT_INTERFACE_VALUE = 22;

	/**
	 * The '<em><b>CS Consent Management</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CONSENT_MANAGEMENT
	 * @model name="CSConsentManagement"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-ConsentManagement'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_CONSENT_MANAGEMENT_VALUE = 23;

	/**
	 * The '<em><b>CS Continuous Auth N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CONTINUOUS_AUTH_N
	 * @model name="CSContinuousAuthN"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-ContinuousAuthN'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_CONTINUOUS_AUTH_N_VALUE = 24;

	/**
	 * The '<em><b>CS Continuous Auth NID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CONTINUOUS_AUTH_NID
	 * @model name="CSContinuousAuthNID"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-ContinuousAuthNID'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_CONTINUOUS_AUTH_NID_VALUE = 25;

	/**
	 * The '<em><b>CS Continuous Auth Verifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CONTINUOUS_AUTH_VERIFIER
	 * @model name="CSContinuousAuthVerifier"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-ContinuousAuthVerifier'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_CONTINUOUS_AUTH_VERIFIER_VALUE = 26;

	/**
	 * The '<em><b>CS Continuous Occupation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_CONTINUOUS_OCCUPATION
	 * @model name="CSContinuousOccupation"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-ContinuousOccupation'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_CONTINUOUS_OCCUPATION_VALUE = 27;

	/**
	 * The '<em><b>CSD Do SFiltering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSD_DO_SFILTERING
	 * @model name="CSDDoSFiltering"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-DDoSFiltering'"
	 * @generated
	 * @ordered
	 */
	public static final int CSD_DO_SFILTERING_VALUE = 28;

	/**
	 * The '<em><b>CS Device Certification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DEVICE_CERTIFICATION
	 * @model name="CSDeviceCertification"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-DeviceCertification'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_DEVICE_CERTIFICATION_VALUE = 29;

	/**
	 * The '<em><b>CS Disable Client Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLE_CLIENT_ACCESS
	 * @model name="CSDisableClientAccess"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-DisableClientAccess'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_DISABLE_CLIENT_ACCESS_VALUE = 30;

	/**
	 * The '<em><b>CS Disable Interface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLE_INTERFACE
	 * @model name="CSDisableInterface"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-DisableInterface'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_DISABLE_INTERFACE_VALUE = 31;

	/**
	 * The '<em><b>CS Disable Mesh Routing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLE_MESH_ROUTING
	 * @model name="CSDisableMeshRouting"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-DisableMeshRouting'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_DISABLE_MESH_ROUTING_VALUE = 32;

	/**
	 * The '<em><b>CS Disable Network</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLE_NETWORK
	 * @model name="CSDisableNetwork"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-DisableNetwork'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_DISABLE_NETWORK_VALUE = 33;

	/**
	 * The '<em><b>CS Disable Network Provision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLE_NETWORK_PROVISION
	 * @model name="CSDisableNetworkProvision"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-DisableNetworkProvision'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_DISABLE_NETWORK_PROVISION_VALUE = 34;

	/**
	 * The '<em><b>CS Disable Service Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLE_SERVICE_ACCESS
	 * @model name="CSDisableServiceAccess"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-DisableServiceAccess'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_DISABLE_SERVICE_ACCESS_VALUE = 35;

	/**
	 * The '<em><b>CS Disable Service Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLE_SERVICE_CHANNEL
	 * @model name="CSDisableServiceChannel"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-DisableServiceChannel'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_DISABLE_SERVICE_CHANNEL_VALUE = 36;

	/**
	 * The '<em><b>CS Disable Tethering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLE_TETHERING
	 * @model name="CSDisableTethering"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-DisableTethering'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_DISABLE_TETHERING_VALUE = 37;

	/**
	 * The '<em><b>CS Disabled Data Flow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLED_DATA_FLOW
	 * @model name="CSDisabledDataFlow"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-DisabledDataFlow'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_DISABLED_DATA_FLOW_VALUE = 38;

	/**
	 * The '<em><b>CS Disabled Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLED_HOST
	 * @model name="CSDisabledHost"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-DisabledHost'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_DISABLED_HOST_VALUE = 39;

	/**
	 * The '<em><b>CS Disabled Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_DISABLED_PROCESS
	 * @model name="CSDisabledProcess"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-DisabledProcess'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_DISABLED_PROCESS_VALUE = 40;

	/**
	 * The '<em><b>CS Encrypted Comms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ENCRYPTED_COMMS
	 * @model name="CSEncryptedComms"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-EncryptedComms'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_ENCRYPTED_COMMS_VALUE = 41;

	/**
	 * The '<em><b>CS Encrypted Processing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ENCRYPTED_PROCESSING
	 * @model name="CSEncryptedProcessing"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-EncryptedProcessing'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_ENCRYPTED_PROCESSING_VALUE = 42;

	/**
	 * The '<em><b>CS Encryption</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ENCRYPTION
	 * @model name="CSEncryption"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-Encryption'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_ENCRYPTION_VALUE = 43;

	/**
	 * The '<em><b>CSFW Block</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSFW_BLOCK
	 * @model name="CSFWBlock"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-FWBlock'"
	 * @generated
	 * @ordered
	 */
	public static final int CSFW_BLOCK_VALUE = 44;

	/**
	 * The '<em><b>CS Formal Verification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_FORMAL_VERIFICATION
	 * @model name="CSFormalVerification"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-FormalVerification'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_FORMAL_VERIFICATION_VALUE = 45;

	/**
	 * The '<em><b>CSGDPR Compliance Training</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSGDPR_COMPLIANCE_TRAINING
	 * @model name="CSGDPRComplianceTraining"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-GDPRComplianceTraining'"
	 * @generated
	 * @ordered
	 */
	public static final int CSGDPR_COMPLIANCE_TRAINING_VALUE = 46;

	/**
	 * The '<em><b>CSGDPR Governance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSGDPR_GOVERNANCE
	 * @model name="CSGDPRGovernance"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-GDPRGovernance'"
	 * @generated
	 * @ordered
	 */
	public static final int CSGDPR_GOVERNANCE_VALUE = 47;

	/**
	 * The '<em><b>CSGDPR Privacy Shield</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSGDPR_PRIVACY_SHIELD
	 * @model name="CSGDPRPrivacyShield"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-GDPRPrivacyShield'"
	 * @generated
	 * @ordered
	 */
	public static final int CSGDPR_PRIVACY_SHIELD_VALUE = 48;

	/**
	 * The '<em><b>CS Homomorphic Encryption</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_HOMOMORPHIC_ENCRYPTION
	 * @model name="CSHomomorphicEncryption"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-HomomorphicEncryption'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_HOMOMORPHIC_ENCRYPTION_VALUE = 49;

	/**
	 * The '<em><b>CS Host Encryption</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_HOST_ENCRYPTION
	 * @model name="CSHostEncryption"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-HostEncryption'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_HOST_ENCRYPTION_VALUE = 50;

	/**
	 * The '<em><b>CS Host Monitoring</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_HOST_MONITORING
	 * @model name="CSHostMonitoring"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-HostMonitoring'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_HOST_MONITORING_VALUE = 51;

	/**
	 * The '<em><b>CS Ignore Physical Threats</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_IGNORE_PHYSICAL_THREATS
	 * @model name="CSIgnorePhysicalThreats"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-IgnorePhysicalThreats'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_IGNORE_PHYSICAL_THREATS_VALUE = 52;

	/**
	 * The '<em><b>CS Impersonal Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_IMPERSONAL_DATA
	 * @model name="CSImpersonalData"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-ImpersonalData'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_IMPERSONAL_DATA_VALUE = 53;

	/**
	 * The '<em><b>CS Include Physical Threats</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_INCLUDE_PHYSICAL_THREATS
	 * @model name="CSIncludePhysicalThreats"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-IncludePhysicalThreats'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_INCLUDE_PHYSICAL_THREATS_VALUE = 54;

	/**
	 * The '<em><b>CS Independent Instances</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_INDEPENDENT_INSTANCES
	 * @model name="CSIndependentInstances"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-IndependentInstances'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_INDEPENDENT_INSTANCES_VALUE = 55;

	/**
	 * The '<em><b>CS Inferred Data Asset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_INFERRED_DATA_ASSET
	 * @model name="CSInferredDataAsset"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-InferredDataAsset'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_INFERRED_DATA_ASSET_VALUE = 56;

	/**
	 * The '<em><b>CS Integrity Protection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_INTEGRITY_PROTECTION
	 * @model name="CSIntegrityProtection"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-IntegrityProtection'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_INTEGRITY_PROTECTION_VALUE = 57;

	/**
	 * The '<em><b>CS Key Management</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_KEY_MANAGEMENT
	 * @model name="CSKeyManagement"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-KeyManagement'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_KEY_MANAGEMENT_VALUE = 58;

	/**
	 * The '<em><b>CS Legal Competence Check</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_LEGAL_COMPETENCE_CHECK
	 * @model name="CSLegalCompetenceCheck"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-LegalCompetenceCheck'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_LEGAL_COMPETENCE_CHECK_VALUE = 59;

	/**
	 * The '<em><b>CS Legal Guardian Consent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_LEGAL_GUARDIAN_CONSENT
	 * @model name="CSLegalGuardianConsent"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-LegalGuardianConsent'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_LEGAL_GUARDIAN_CONSENT_VALUE = 60;

	/**
	 * The '<em><b>CS Load Monitoring</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_LOAD_MONITORING
	 * @model name="CSLoadMonitoring"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-LoadMonitoring'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_LOAD_MONITORING_VALUE = 61;

	/**
	 * The '<em><b>CS Logging</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_LOGGING
	 * @model name="CSLogging"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-Logging'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_LOGGING_VALUE = 62;

	/**
	 * The '<em><b>CS Low Priority</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_LOW_PRIORITY
	 * @model name="CSLowPriority"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-LowPriority'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_LOW_PRIORITY_VALUE = 63;

	/**
	 * The '<em><b>CS Manual Action Taken</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_MANUAL_ACTION_TAKEN
	 * @model name="CSManualActionTaken"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-ManualActionTaken'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_MANUAL_ACTION_TAKEN_VALUE = 64;

	/**
	 * The '<em><b>CS Manual Intervention</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_MANUAL_INTERVENTION
	 * @model name="CSManualIntervention"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-ManualIntervention'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_MANUAL_INTERVENTION_VALUE = 65;

	/**
	 * The '<em><b>CS Multiple Cell NIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_MULTIPLE_CELL_NIC
	 * @model name="CSMultipleCellNIC"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-MultipleCellNIC'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_MULTIPLE_CELL_NIC_VALUE = 66;

	/**
	 * The '<em><b>CS Multiple Wi Fi NIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_MULTIPLE_WI_FI_NIC
	 * @model name="CSMultipleWiFiNIC"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-MultipleWiFiNIC'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_MULTIPLE_WI_FI_NIC_VALUE = 67;

	/**
	 * The '<em><b>CS Multiple Wired NIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_MULTIPLE_WIRED_NIC
	 * @model name="CSMultipleWiredNIC"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-MultipleWiredNIC'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_MULTIPLE_WIRED_NIC_VALUE = 68;

	/**
	 * The '<em><b>CS One Time Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ONE_TIME_KEY
	 * @model name="CSOneTimeKey"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-OneTimeKey'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_ONE_TIME_KEY_VALUE = 69;

	/**
	 * The '<em><b>CS One Time Key Verifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_ONE_TIME_KEY_VERIFIER
	 * @model name="CSOneTimeKeyVerifier"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-OneTimeKeyVerifier'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_ONE_TIME_KEY_VERIFIER_VALUE = 70;

	/**
	 * The '<em><b>CS Out Of Band Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_OUT_OF_BAND_KEY
	 * @model name="CSOutOfBandKey"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-OutOfBandKey'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_OUT_OF_BAND_KEY_VALUE = 71;

	/**
	 * The '<em><b>CS Out Of Band Key Verifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_OUT_OF_BAND_KEY_VERIFIER
	 * @model name="CSOutOfBandKeyVerifier"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-OutOfBandKeyVerifier'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_OUT_OF_BAND_KEY_VERIFIER_VALUE = 72;

	/**
	 * The '<em><b>CS Parquet Encryption</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PARQUET_ENCRYPTION
	 * @model name="CSParquetEncryption"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-ParquetEncryption'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_PARQUET_ENCRYPTION_VALUE = 73;

	/**
	 * The '<em><b>CS Password</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PASSWORD
	 * @model name="CSPassword"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-Password'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_PASSWORD_VALUE = 74;

	/**
	 * The '<em><b>CS Password Quality Check</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PASSWORD_QUALITY_CHECK
	 * @model name="CSPasswordQualityCheck"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-PasswordQualityCheck'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_PASSWORD_QUALITY_CHECK_VALUE = 75;

	/**
	 * The '<em><b>CS Password Reset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PASSWORD_RESET
	 * @model name="CSPasswordReset"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-PasswordReset'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_PASSWORD_RESET_VALUE = 76;

	/**
	 * The '<em><b>CS Password Store</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PASSWORD_STORE
	 * @model name="CSPasswordStore"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-PasswordStore'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_PASSWORD_STORE_VALUE = 77;

	/**
	 * The '<em><b>CS Password Verifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PASSWORD_VERIFIER
	 * @model name="CSPasswordVerifier"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-PasswordVerifier'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_PASSWORD_VERIFIER_VALUE = 78;

	/**
	 * The '<em><b>CS Penetration Testing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PENETRATION_TESTING
	 * @model name="CSPenetrationTesting"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-PenetrationTesting'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_PENETRATION_TESTING_VALUE = 79;

	/**
	 * The '<em><b>CS Personal Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PERSONAL_DEVICE
	 * @model name="CSPersonalDevice"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-PersonalDevice'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_PERSONAL_DEVICE_VALUE = 80;

	/**
	 * The '<em><b>CS Physical Checks</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PHYSICAL_CHECKS
	 * @model name="CSPhysicalChecks"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-PhysicalChecks'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_PHYSICAL_CHECKS_VALUE = 81;

	/**
	 * The '<em><b>CS Physical Device Protection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PHYSICAL_DEVICE_PROTECTION
	 * @model name="CSPhysicalDeviceProtection"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-PhysicalDeviceProtection'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_PHYSICAL_DEVICE_PROTECTION_VALUE = 82;

	/**
	 * The '<em><b>CS Physical ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PHYSICAL_ID
	 * @model name="CSPhysicalID"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-PhysicalID'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_PHYSICAL_ID_VALUE = 83;

	/**
	 * The '<em><b>CS Physical ID Verifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PHYSICAL_ID_VERIFIER
	 * @model name="CSPhysicalIDVerifier"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-PhysicalIDVerifier'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_PHYSICAL_ID_VERIFIER_VALUE = 84;

	/**
	 * The '<em><b>CS Physical Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PHYSICAL_KEY
	 * @model name="CSPhysicalKey"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-PhysicalKey'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_PHYSICAL_KEY_VALUE = 85;

	/**
	 * The '<em><b>CS Physical Lock</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PHYSICAL_LOCK
	 * @model name="CSPhysicalLock"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-PhysicalLock'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_PHYSICAL_LOCK_VALUE = 86;

	/**
	 * The '<em><b>CS Physical Patrols</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PHYSICAL_PATROLS
	 * @model name="CSPhysicalPatrols"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-PhysicalPatrols'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_PHYSICAL_PATROLS_VALUE = 87;

	/**
	 * The '<em><b>CS Physically Observable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PHYSICALLY_OBSERVABLE
	 * @model name="CSPhysicallyObservable"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-PhysicallyObservable'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_PHYSICALLY_OBSERVABLE_VALUE = 88;

	/**
	 * The '<em><b>CS Process Monitoring</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_PROCESS_MONITORING
	 * @model name="CSProcessMonitoring"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-ProcessMonitoring'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_PROCESS_MONITORING_VALUE = 89;

	/**
	 * The '<em><b>CS Remote Wiping</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_REMOTE_WIPING
	 * @model name="CSRemoteWiping"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-RemoteWiping'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_REMOTE_WIPING_VALUE = 90;

	/**
	 * The '<em><b>CS Replication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_REPLICATION
	 * @model name="CSReplication"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-Replication'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_REPLICATION_VALUE = 91;

	/**
	 * The '<em><b>CS Restricted Shell</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_RESTRICTED_SHELL
	 * @model name="CSRestrictedShell"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-RestrictedShell'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_RESTRICTED_SHELL_VALUE = 92;

	/**
	 * The '<em><b>CSSIM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSSIM
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SIM'"
	 * @generated
	 * @ordered
	 */
	public static final int CSSIM_VALUE = 93;

	/**
	 * The '<em><b>CSSLA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSSLA
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SLA'"
	 * @generated
	 * @ordered
	 */
	public static final int CSSLA_VALUE = 94;

	/**
	 * The '<em><b>CSSLA Enforcement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSSLA_ENFORCEMENT
	 * @model name="CSSLAEnforcement"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SLAEnforcement'"
	 * @generated
	 * @ordered
	 */
	public static final int CSSLA_ENFORCEMENT_VALUE = 95;

	/**
	 * The '<em><b>CS Safe Control Mode</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SAFE_CONTROL_MODE
	 * @model name="CSSafeControlMode"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SafeControlMode'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SAFE_CONTROL_MODE_VALUE = 96;

	/**
	 * The '<em><b>CS Safe Control Setting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SAFE_CONTROL_SETTING
	 * @model name="CSSafeControlSetting"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SafeControlSetting'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SAFE_CONTROL_SETTING_VALUE = 97;

	/**
	 * The '<em><b>CS Safe Io TController</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SAFE_IO_TCONTROLLER
	 * @model name="CSSafeIoTController"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SafeIoTController'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SAFE_IO_TCONTROLLER_VALUE = 98;

	/**
	 * The '<em><b>CS Safety Training</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SAFETY_TRAINING
	 * @model name="CSSafetyTraining"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SafetyTraining'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SAFETY_TRAINING_VALUE = 99;

	/**
	 * The '<em><b>CS Screen Lock</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SCREEN_LOCK
	 * @model name="CSScreenLock"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-ScreenLock'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SCREEN_LOCK_VALUE = 100;

	/**
	 * The '<em><b>CS Screened</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SCREENED
	 * @model name="CSScreened"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-Screened'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SCREENED_VALUE = 101;

	/**
	 * The '<em><b>CS Screening</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SCREENING
	 * @model name="CSScreening"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-Screening'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SCREENING_VALUE = 102;

	/**
	 * The '<em><b>CS Secure BIOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SECURE_BIOS
	 * @model name="CSSecureBIOS"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SecureBIOS'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SECURE_BIOS_VALUE = 103;

	/**
	 * The '<em><b>CS Secure Config</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SECURE_CONFIG
	 * @model name="CSSecureConfig"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SecureConfig'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SECURE_CONFIG_VALUE = 104;

	/**
	 * The '<em><b>CS Secure Enclave</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SECURE_ENCLAVE
	 * @model name="CSSecureEnclave"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SecureEnclave'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SECURE_ENCLAVE_VALUE = 105;

	/**
	 * The '<em><b>CS Secure Execution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SECURE_EXECUTION
	 * @model name="CSSecureExecution"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SecureExecution'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SECURE_EXECUTION_VALUE = 106;

	/**
	 * The '<em><b>CS Secure Location</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SECURE_LOCATION
	 * @model name="CSSecureLocation"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SecureLocation'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SECURE_LOCATION_VALUE = 107;

	/**
	 * The '<em><b>CS Security Training</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SECURITY_TRAINING
	 * @model name="CSSecurityTraining"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SecurityTraining'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SECURITY_TRAINING_VALUE = 108;

	/**
	 * The '<em><b>CS Shared Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SHARED_KEY
	 * @model name="CSSharedKey"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SharedKey'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SHARED_KEY_VALUE = 109;

	/**
	 * The '<em><b>CS Shared Key Verifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SHARED_KEY_VERIFIER
	 * @model name="CSSharedKeyVerifier"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SharedKeyVerifier'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SHARED_KEY_VERIFIER_VALUE = 110;

	/**
	 * The '<em><b>CS Simple Secure Pairing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SIMPLE_SECURE_PAIRING
	 * @model name="CSSimpleSecurePairing"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SimpleSecurePairing'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SIMPLE_SECURE_PAIRING_VALUE = 111;

	/**
	 * The '<em><b>CS Software Certification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SOFTWARE_CERTIFICATION
	 * @model name="CSSoftwareCertification"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SoftwareCertification'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SOFTWARE_CERTIFICATION_VALUE = 112;

	/**
	 * The '<em><b>CS Software Patched</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SOFTWARE_PATCHED
	 * @model name="CSSoftwarePatched"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SoftwarePatched'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SOFTWARE_PATCHED_VALUE = 113;

	/**
	 * The '<em><b>CS Software Patching</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SOFTWARE_PATCHING
	 * @model name="CSSoftwarePatching"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SoftwarePatching'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SOFTWARE_PATCHING_VALUE = 114;

	/**
	 * The '<em><b>CS Software Testing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SOFTWARE_TESTING
	 * @model name="CSSoftwareTesting"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SoftwareTesting'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SOFTWARE_TESTING_VALUE = 115;

	/**
	 * The '<em><b>CS Spam Filtering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SPAM_FILTERING
	 * @model name="CSSpamFiltering"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SpamFiltering'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SPAM_FILTERING_VALUE = 116;

	/**
	 * The '<em><b>CS Static Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_STATIC_DATA
	 * @model name="CSStaticData"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-StaticData'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_STATIC_DATA_VALUE = 117;

	/**
	 * The '<em><b>CS Subject To GDPR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUBJECT_TO_GDPR
	 * @model name="CSSubjectToGDPR"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SubjectToGDPR'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SUBJECT_TO_GDPR_VALUE = 118;

	/**
	 * The '<em><b>CS Suspend Corrupt Data Flow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_CORRUPT_DATA_FLOW
	 * @model name="CSSuspendCorruptDataFlow"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SuspendCorruptDataFlow'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SUSPEND_CORRUPT_DATA_FLOW_VALUE = 119;

	/**
	 * The '<em><b>CS Suspend Excessive Client Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_EXCESSIVE_CLIENT_ACCESS
	 * @model name="CSSuspendExcessiveClientAccess"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SuspendExcessiveClientAccess'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SUSPEND_EXCESSIVE_CLIENT_ACCESS_VALUE = 120;

	/**
	 * The '<em><b>CS Suspend Infected Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_INFECTED_HOST
	 * @model name="CSSuspendInfectedHost"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SuspendInfectedHost'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SUSPEND_INFECTED_HOST_VALUE = 121;

	/**
	 * The '<em><b>CS Suspend Infected Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_INFECTED_PROCESS
	 * @model name="CSSuspendInfectedProcess"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SuspendInfectedProcess'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SUSPEND_INFECTED_PROCESS_VALUE = 122;

	/**
	 * The '<em><b>CS Suspend Insecure Service Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_INSECURE_SERVICE_CHANNEL
	 * @model name="CSSuspendInsecureServiceChannel"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SuspendInsecureServiceChannel'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SUSPEND_INSECURE_SERVICE_CHANNEL_VALUE = 123;

	/**
	 * The '<em><b>CS Suspend Outbound Flow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_OUTBOUND_FLOW
	 * @model name="CSSuspendOutboundFlow"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SuspendOutboundFlow'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SUSPEND_OUTBOUND_FLOW_VALUE = 124;

	/**
	 * The '<em><b>CS Suspend Sensitive Data Flow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_SENSITIVE_DATA_FLOW
	 * @model name="CSSuspendSensitiveDataFlow"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SuspendSensitiveDataFlow'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SUSPEND_SENSITIVE_DATA_FLOW_VALUE = 125;

	/**
	 * The '<em><b>CS Suspend Unauthentic Client Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_UNAUTHENTIC_CLIENT_ACCESS
	 * @model name="CSSuspendUnauthenticClientAccess"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SuspendUnauthenticClientAccess'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SUSPEND_UNAUTHENTIC_CLIENT_ACCESS_VALUE = 126;

	/**
	 * The '<em><b>CS Suspend Unreliable Controller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_UNRELIABLE_CONTROLLER
	 * @model name="CSSuspendUnreliableController"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SuspendUnreliableController'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SUSPEND_UNRELIABLE_CONTROLLER_VALUE = 127;

	/**
	 * The '<em><b>CS Suspend Untrustworthy Client Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_UNTRUSTWORTHY_CLIENT_ACCESS
	 * @model name="CSSuspendUntrustworthyClientAccess"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SuspendUntrustworthyClientAccess'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SUSPEND_UNTRUSTWORTHY_CLIENT_ACCESS_VALUE = 128;

	/**
	 * The '<em><b>CS Suspend Vulnerable Host</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_VULNERABLE_HOST
	 * @model name="CSSuspendVulnerableHost"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SuspendVulnerableHost'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SUSPEND_VULNERABLE_HOST_VALUE = 129;

	/**
	 * The '<em><b>CS Suspend Vulnerable Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_VULNERABLE_SERVICE
	 * @model name="CSSuspendVulnerableService"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SuspendVulnerableService'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SUSPEND_VULNERABLE_SERVICE_VALUE = 130;

	/**
	 * The '<em><b>CS Suspend Vulnerable Service Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SUSPEND_VULNERABLE_SERVICE_CHANNEL
	 * @model name="CSSuspendVulnerableServiceChannel"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SuspendVulnerableServiceChannel'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SUSPEND_VULNERABLE_SERVICE_CHANNEL_VALUE = 131;

	/**
	 * The '<em><b>CS System Security Training</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_SYSTEM_SECURITY_TRAINING
	 * @model name="CSSystemSecurityTraining"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-SystemSecurityTraining'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_SYSTEM_SECURITY_TRAINING_VALUE = 132;

	/**
	 * The '<em><b>CSTLS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSTLS
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-TLS'"
	 * @generated
	 * @ordered
	 */
	public static final int CSTLS_VALUE = 133;

	/**
	 * The '<em><b>CS Team Leadership</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_TEAM_LEADERSHIP
	 * @model name="CSTeamLeadership"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-TeamLeadership'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_TEAM_LEADERSHIP_VALUE = 134;

	/**
	 * The '<em><b>CS Team Role</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_TEAM_ROLE
	 * @model name="CSTeamRole"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-TeamRole'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_TEAM_ROLE_VALUE = 135;

	/**
	 * The '<em><b>CS Unmanaged</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_UNMANAGED
	 * @model name="CSUnmanaged"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-Unmanaged'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_UNMANAGED_VALUE = 136;

	/**
	 * The '<em><b>CS Uses No Email</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_USES_NO_EMAIL
	 * @model name="CSUsesNoEmail"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-UsesNoEmail'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_USES_NO_EMAIL_VALUE = 137;

	/**
	 * The '<em><b>CS Vital Interests</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_VITAL_INTERESTS
	 * @model name="CSVitalInterests"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-VitalInterests'"
	 * @generated
	 * @ordered
	 */
	public static final int CS_VITAL_INTERESTS_VALUE = 138;

	/**
	 * The '<em><b>CSX509</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSX509
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-X509'"
	 * @generated
	 * @ordered
	 */
	public static final int CSX509_VALUE = 139;

	/**
	 * The '<em><b>CSX509 Client Verifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSX509_CLIENT_VERIFIER
	 * @model name="CSX509ClientVerifier"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-X509ClientVerifier'"
	 * @generated
	 * @ordered
	 */
	public static final int CSX509_CLIENT_VERIFIER_VALUE = 140;

	/**
	 * The '<em><b>CSX509 Service Verifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSX509_SERVICE_VERIFIER
	 * @model name="CSX509ServiceVerifier"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-X509ServiceVerifier'"
	 * @generated
	 * @ordered
	 */
	public static final int CSX509_SERVICE_VERIFIER_VALUE = 141;

	/**
	 * The '<em><b>CSXSS Sanitisation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSXSS_SANITISATION
	 * @model name="CSXSSSanitisation"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CS-XSSSanitisation'"
	 * @generated
	 * @ordered
	 */
	public static final int CSXSS_SANITISATION_VALUE = 142;

	/**
	 * An array of all the '<em><b>Control Set Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ControlSetKind[] VALUES_ARRAY =
		new ControlSetKind[] {
			CS_ACCESS_CONTROL,
			CS_ACCESS_KEY,
			CS_ACCESS_POLICY,
			CS_ADDRESS_RESERVATION,
			CS_ADDRESS_WHITELISTING,
			CS_ANTI_MALWARE,
			CS_APPLICATION_FW,
			CS_AUTHENTICATION_LIMITS,
			CS_AUTO_DATA_GOVERNANCE,
			CS_AUTO_PROVISIONING,
			CS_BANDWIDTH_MANAGEMENT,
			CS_BASIC_SECURITY_TRAINING,
			CS_BIOMETRIC_ID,
			CS_BIOMETRIC_ID_VERIFIER,
			CS_BIOMETRIC_LOCK,
			CS_BREAK_THE_GLASS,
			CS_CHIP_AND_PIN_CARD,
			CS_CHIP_AND_PIN_LOCK,
			CS_CHIP_AND_PIN_VERIFIER,
			CS_CLEAR_DEPUTY,
			CS_CLUSTERING,
			CS_CONSENT_ENFORCEMENT,
			CS_CONSENT_INTERFACE,
			CS_CONSENT_MANAGEMENT,
			CS_CONTINUOUS_AUTH_N,
			CS_CONTINUOUS_AUTH_NID,
			CS_CONTINUOUS_AUTH_VERIFIER,
			CS_CONTINUOUS_OCCUPATION,
			CSD_DO_SFILTERING,
			CS_DEVICE_CERTIFICATION,
			CS_DISABLE_CLIENT_ACCESS,
			CS_DISABLE_INTERFACE,
			CS_DISABLE_MESH_ROUTING,
			CS_DISABLE_NETWORK,
			CS_DISABLE_NETWORK_PROVISION,
			CS_DISABLE_SERVICE_ACCESS,
			CS_DISABLE_SERVICE_CHANNEL,
			CS_DISABLE_TETHERING,
			CS_DISABLED_DATA_FLOW,
			CS_DISABLED_HOST,
			CS_DISABLED_PROCESS,
			CS_ENCRYPTED_COMMS,
			CS_ENCRYPTED_PROCESSING,
			CS_ENCRYPTION,
			CSFW_BLOCK,
			CS_FORMAL_VERIFICATION,
			CSGDPR_COMPLIANCE_TRAINING,
			CSGDPR_GOVERNANCE,
			CSGDPR_PRIVACY_SHIELD,
			CS_HOMOMORPHIC_ENCRYPTION,
			CS_HOST_ENCRYPTION,
			CS_HOST_MONITORING,
			CS_IGNORE_PHYSICAL_THREATS,
			CS_IMPERSONAL_DATA,
			CS_INCLUDE_PHYSICAL_THREATS,
			CS_INDEPENDENT_INSTANCES,
			CS_INFERRED_DATA_ASSET,
			CS_INTEGRITY_PROTECTION,
			CS_KEY_MANAGEMENT,
			CS_LEGAL_COMPETENCE_CHECK,
			CS_LEGAL_GUARDIAN_CONSENT,
			CS_LOAD_MONITORING,
			CS_LOGGING,
			CS_LOW_PRIORITY,
			CS_MANUAL_ACTION_TAKEN,
			CS_MANUAL_INTERVENTION,
			CS_MULTIPLE_CELL_NIC,
			CS_MULTIPLE_WI_FI_NIC,
			CS_MULTIPLE_WIRED_NIC,
			CS_ONE_TIME_KEY,
			CS_ONE_TIME_KEY_VERIFIER,
			CS_OUT_OF_BAND_KEY,
			CS_OUT_OF_BAND_KEY_VERIFIER,
			CS_PARQUET_ENCRYPTION,
			CS_PASSWORD,
			CS_PASSWORD_QUALITY_CHECK,
			CS_PASSWORD_RESET,
			CS_PASSWORD_STORE,
			CS_PASSWORD_VERIFIER,
			CS_PENETRATION_TESTING,
			CS_PERSONAL_DEVICE,
			CS_PHYSICAL_CHECKS,
			CS_PHYSICAL_DEVICE_PROTECTION,
			CS_PHYSICAL_ID,
			CS_PHYSICAL_ID_VERIFIER,
			CS_PHYSICAL_KEY,
			CS_PHYSICAL_LOCK,
			CS_PHYSICAL_PATROLS,
			CS_PHYSICALLY_OBSERVABLE,
			CS_PROCESS_MONITORING,
			CS_REMOTE_WIPING,
			CS_REPLICATION,
			CS_RESTRICTED_SHELL,
			CSSIM,
			CSSLA,
			CSSLA_ENFORCEMENT,
			CS_SAFE_CONTROL_MODE,
			CS_SAFE_CONTROL_SETTING,
			CS_SAFE_IO_TCONTROLLER,
			CS_SAFETY_TRAINING,
			CS_SCREEN_LOCK,
			CS_SCREENED,
			CS_SCREENING,
			CS_SECURE_BIOS,
			CS_SECURE_CONFIG,
			CS_SECURE_ENCLAVE,
			CS_SECURE_EXECUTION,
			CS_SECURE_LOCATION,
			CS_SECURITY_TRAINING,
			CS_SHARED_KEY,
			CS_SHARED_KEY_VERIFIER,
			CS_SIMPLE_SECURE_PAIRING,
			CS_SOFTWARE_CERTIFICATION,
			CS_SOFTWARE_PATCHED,
			CS_SOFTWARE_PATCHING,
			CS_SOFTWARE_TESTING,
			CS_SPAM_FILTERING,
			CS_STATIC_DATA,
			CS_SUBJECT_TO_GDPR,
			CS_SUSPEND_CORRUPT_DATA_FLOW,
			CS_SUSPEND_EXCESSIVE_CLIENT_ACCESS,
			CS_SUSPEND_INFECTED_HOST,
			CS_SUSPEND_INFECTED_PROCESS,
			CS_SUSPEND_INSECURE_SERVICE_CHANNEL,
			CS_SUSPEND_OUTBOUND_FLOW,
			CS_SUSPEND_SENSITIVE_DATA_FLOW,
			CS_SUSPEND_UNAUTHENTIC_CLIENT_ACCESS,
			CS_SUSPEND_UNRELIABLE_CONTROLLER,
			CS_SUSPEND_UNTRUSTWORTHY_CLIENT_ACCESS,
			CS_SUSPEND_VULNERABLE_HOST,
			CS_SUSPEND_VULNERABLE_SERVICE,
			CS_SUSPEND_VULNERABLE_SERVICE_CHANNEL,
			CS_SYSTEM_SECURITY_TRAINING,
			CSTLS,
			CS_TEAM_LEADERSHIP,
			CS_TEAM_ROLE,
			CS_UNMANAGED,
			CS_USES_NO_EMAIL,
			CS_VITAL_INTERESTS,
			CSX509,
			CSX509_CLIENT_VERIFIER,
			CSX509_SERVICE_VERIFIER,
			CSXSS_SANITISATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Control Set Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ControlSetKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Control Set Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlSetKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlSetKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Set Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlSetKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlSetKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Set Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlSetKind get(int value) {
		switch (value) {
			case CS_ACCESS_CONTROL_VALUE: return CS_ACCESS_CONTROL;
			case CS_ACCESS_KEY_VALUE: return CS_ACCESS_KEY;
			case CS_ACCESS_POLICY_VALUE: return CS_ACCESS_POLICY;
			case CS_ADDRESS_RESERVATION_VALUE: return CS_ADDRESS_RESERVATION;
			case CS_ADDRESS_WHITELISTING_VALUE: return CS_ADDRESS_WHITELISTING;
			case CS_ANTI_MALWARE_VALUE: return CS_ANTI_MALWARE;
			case CS_APPLICATION_FW_VALUE: return CS_APPLICATION_FW;
			case CS_AUTHENTICATION_LIMITS_VALUE: return CS_AUTHENTICATION_LIMITS;
			case CS_AUTO_DATA_GOVERNANCE_VALUE: return CS_AUTO_DATA_GOVERNANCE;
			case CS_AUTO_PROVISIONING_VALUE: return CS_AUTO_PROVISIONING;
			case CS_BANDWIDTH_MANAGEMENT_VALUE: return CS_BANDWIDTH_MANAGEMENT;
			case CS_BASIC_SECURITY_TRAINING_VALUE: return CS_BASIC_SECURITY_TRAINING;
			case CS_BIOMETRIC_ID_VALUE: return CS_BIOMETRIC_ID;
			case CS_BIOMETRIC_ID_VERIFIER_VALUE: return CS_BIOMETRIC_ID_VERIFIER;
			case CS_BIOMETRIC_LOCK_VALUE: return CS_BIOMETRIC_LOCK;
			case CS_BREAK_THE_GLASS_VALUE: return CS_BREAK_THE_GLASS;
			case CS_CHIP_AND_PIN_CARD_VALUE: return CS_CHIP_AND_PIN_CARD;
			case CS_CHIP_AND_PIN_LOCK_VALUE: return CS_CHIP_AND_PIN_LOCK;
			case CS_CHIP_AND_PIN_VERIFIER_VALUE: return CS_CHIP_AND_PIN_VERIFIER;
			case CS_CLEAR_DEPUTY_VALUE: return CS_CLEAR_DEPUTY;
			case CS_CLUSTERING_VALUE: return CS_CLUSTERING;
			case CS_CONSENT_ENFORCEMENT_VALUE: return CS_CONSENT_ENFORCEMENT;
			case CS_CONSENT_INTERFACE_VALUE: return CS_CONSENT_INTERFACE;
			case CS_CONSENT_MANAGEMENT_VALUE: return CS_CONSENT_MANAGEMENT;
			case CS_CONTINUOUS_AUTH_N_VALUE: return CS_CONTINUOUS_AUTH_N;
			case CS_CONTINUOUS_AUTH_NID_VALUE: return CS_CONTINUOUS_AUTH_NID;
			case CS_CONTINUOUS_AUTH_VERIFIER_VALUE: return CS_CONTINUOUS_AUTH_VERIFIER;
			case CS_CONTINUOUS_OCCUPATION_VALUE: return CS_CONTINUOUS_OCCUPATION;
			case CSD_DO_SFILTERING_VALUE: return CSD_DO_SFILTERING;
			case CS_DEVICE_CERTIFICATION_VALUE: return CS_DEVICE_CERTIFICATION;
			case CS_DISABLE_CLIENT_ACCESS_VALUE: return CS_DISABLE_CLIENT_ACCESS;
			case CS_DISABLE_INTERFACE_VALUE: return CS_DISABLE_INTERFACE;
			case CS_DISABLE_MESH_ROUTING_VALUE: return CS_DISABLE_MESH_ROUTING;
			case CS_DISABLE_NETWORK_VALUE: return CS_DISABLE_NETWORK;
			case CS_DISABLE_NETWORK_PROVISION_VALUE: return CS_DISABLE_NETWORK_PROVISION;
			case CS_DISABLE_SERVICE_ACCESS_VALUE: return CS_DISABLE_SERVICE_ACCESS;
			case CS_DISABLE_SERVICE_CHANNEL_VALUE: return CS_DISABLE_SERVICE_CHANNEL;
			case CS_DISABLE_TETHERING_VALUE: return CS_DISABLE_TETHERING;
			case CS_DISABLED_DATA_FLOW_VALUE: return CS_DISABLED_DATA_FLOW;
			case CS_DISABLED_HOST_VALUE: return CS_DISABLED_HOST;
			case CS_DISABLED_PROCESS_VALUE: return CS_DISABLED_PROCESS;
			case CS_ENCRYPTED_COMMS_VALUE: return CS_ENCRYPTED_COMMS;
			case CS_ENCRYPTED_PROCESSING_VALUE: return CS_ENCRYPTED_PROCESSING;
			case CS_ENCRYPTION_VALUE: return CS_ENCRYPTION;
			case CSFW_BLOCK_VALUE: return CSFW_BLOCK;
			case CS_FORMAL_VERIFICATION_VALUE: return CS_FORMAL_VERIFICATION;
			case CSGDPR_COMPLIANCE_TRAINING_VALUE: return CSGDPR_COMPLIANCE_TRAINING;
			case CSGDPR_GOVERNANCE_VALUE: return CSGDPR_GOVERNANCE;
			case CSGDPR_PRIVACY_SHIELD_VALUE: return CSGDPR_PRIVACY_SHIELD;
			case CS_HOMOMORPHIC_ENCRYPTION_VALUE: return CS_HOMOMORPHIC_ENCRYPTION;
			case CS_HOST_ENCRYPTION_VALUE: return CS_HOST_ENCRYPTION;
			case CS_HOST_MONITORING_VALUE: return CS_HOST_MONITORING;
			case CS_IGNORE_PHYSICAL_THREATS_VALUE: return CS_IGNORE_PHYSICAL_THREATS;
			case CS_IMPERSONAL_DATA_VALUE: return CS_IMPERSONAL_DATA;
			case CS_INCLUDE_PHYSICAL_THREATS_VALUE: return CS_INCLUDE_PHYSICAL_THREATS;
			case CS_INDEPENDENT_INSTANCES_VALUE: return CS_INDEPENDENT_INSTANCES;
			case CS_INFERRED_DATA_ASSET_VALUE: return CS_INFERRED_DATA_ASSET;
			case CS_INTEGRITY_PROTECTION_VALUE: return CS_INTEGRITY_PROTECTION;
			case CS_KEY_MANAGEMENT_VALUE: return CS_KEY_MANAGEMENT;
			case CS_LEGAL_COMPETENCE_CHECK_VALUE: return CS_LEGAL_COMPETENCE_CHECK;
			case CS_LEGAL_GUARDIAN_CONSENT_VALUE: return CS_LEGAL_GUARDIAN_CONSENT;
			case CS_LOAD_MONITORING_VALUE: return CS_LOAD_MONITORING;
			case CS_LOGGING_VALUE: return CS_LOGGING;
			case CS_LOW_PRIORITY_VALUE: return CS_LOW_PRIORITY;
			case CS_MANUAL_ACTION_TAKEN_VALUE: return CS_MANUAL_ACTION_TAKEN;
			case CS_MANUAL_INTERVENTION_VALUE: return CS_MANUAL_INTERVENTION;
			case CS_MULTIPLE_CELL_NIC_VALUE: return CS_MULTIPLE_CELL_NIC;
			case CS_MULTIPLE_WI_FI_NIC_VALUE: return CS_MULTIPLE_WI_FI_NIC;
			case CS_MULTIPLE_WIRED_NIC_VALUE: return CS_MULTIPLE_WIRED_NIC;
			case CS_ONE_TIME_KEY_VALUE: return CS_ONE_TIME_KEY;
			case CS_ONE_TIME_KEY_VERIFIER_VALUE: return CS_ONE_TIME_KEY_VERIFIER;
			case CS_OUT_OF_BAND_KEY_VALUE: return CS_OUT_OF_BAND_KEY;
			case CS_OUT_OF_BAND_KEY_VERIFIER_VALUE: return CS_OUT_OF_BAND_KEY_VERIFIER;
			case CS_PARQUET_ENCRYPTION_VALUE: return CS_PARQUET_ENCRYPTION;
			case CS_PASSWORD_VALUE: return CS_PASSWORD;
			case CS_PASSWORD_QUALITY_CHECK_VALUE: return CS_PASSWORD_QUALITY_CHECK;
			case CS_PASSWORD_RESET_VALUE: return CS_PASSWORD_RESET;
			case CS_PASSWORD_STORE_VALUE: return CS_PASSWORD_STORE;
			case CS_PASSWORD_VERIFIER_VALUE: return CS_PASSWORD_VERIFIER;
			case CS_PENETRATION_TESTING_VALUE: return CS_PENETRATION_TESTING;
			case CS_PERSONAL_DEVICE_VALUE: return CS_PERSONAL_DEVICE;
			case CS_PHYSICAL_CHECKS_VALUE: return CS_PHYSICAL_CHECKS;
			case CS_PHYSICAL_DEVICE_PROTECTION_VALUE: return CS_PHYSICAL_DEVICE_PROTECTION;
			case CS_PHYSICAL_ID_VALUE: return CS_PHYSICAL_ID;
			case CS_PHYSICAL_ID_VERIFIER_VALUE: return CS_PHYSICAL_ID_VERIFIER;
			case CS_PHYSICAL_KEY_VALUE: return CS_PHYSICAL_KEY;
			case CS_PHYSICAL_LOCK_VALUE: return CS_PHYSICAL_LOCK;
			case CS_PHYSICAL_PATROLS_VALUE: return CS_PHYSICAL_PATROLS;
			case CS_PHYSICALLY_OBSERVABLE_VALUE: return CS_PHYSICALLY_OBSERVABLE;
			case CS_PROCESS_MONITORING_VALUE: return CS_PROCESS_MONITORING;
			case CS_REMOTE_WIPING_VALUE: return CS_REMOTE_WIPING;
			case CS_REPLICATION_VALUE: return CS_REPLICATION;
			case CS_RESTRICTED_SHELL_VALUE: return CS_RESTRICTED_SHELL;
			case CSSIM_VALUE: return CSSIM;
			case CSSLA_VALUE: return CSSLA;
			case CSSLA_ENFORCEMENT_VALUE: return CSSLA_ENFORCEMENT;
			case CS_SAFE_CONTROL_MODE_VALUE: return CS_SAFE_CONTROL_MODE;
			case CS_SAFE_CONTROL_SETTING_VALUE: return CS_SAFE_CONTROL_SETTING;
			case CS_SAFE_IO_TCONTROLLER_VALUE: return CS_SAFE_IO_TCONTROLLER;
			case CS_SAFETY_TRAINING_VALUE: return CS_SAFETY_TRAINING;
			case CS_SCREEN_LOCK_VALUE: return CS_SCREEN_LOCK;
			case CS_SCREENED_VALUE: return CS_SCREENED;
			case CS_SCREENING_VALUE: return CS_SCREENING;
			case CS_SECURE_BIOS_VALUE: return CS_SECURE_BIOS;
			case CS_SECURE_CONFIG_VALUE: return CS_SECURE_CONFIG;
			case CS_SECURE_ENCLAVE_VALUE: return CS_SECURE_ENCLAVE;
			case CS_SECURE_EXECUTION_VALUE: return CS_SECURE_EXECUTION;
			case CS_SECURE_LOCATION_VALUE: return CS_SECURE_LOCATION;
			case CS_SECURITY_TRAINING_VALUE: return CS_SECURITY_TRAINING;
			case CS_SHARED_KEY_VALUE: return CS_SHARED_KEY;
			case CS_SHARED_KEY_VERIFIER_VALUE: return CS_SHARED_KEY_VERIFIER;
			case CS_SIMPLE_SECURE_PAIRING_VALUE: return CS_SIMPLE_SECURE_PAIRING;
			case CS_SOFTWARE_CERTIFICATION_VALUE: return CS_SOFTWARE_CERTIFICATION;
			case CS_SOFTWARE_PATCHED_VALUE: return CS_SOFTWARE_PATCHED;
			case CS_SOFTWARE_PATCHING_VALUE: return CS_SOFTWARE_PATCHING;
			case CS_SOFTWARE_TESTING_VALUE: return CS_SOFTWARE_TESTING;
			case CS_SPAM_FILTERING_VALUE: return CS_SPAM_FILTERING;
			case CS_STATIC_DATA_VALUE: return CS_STATIC_DATA;
			case CS_SUBJECT_TO_GDPR_VALUE: return CS_SUBJECT_TO_GDPR;
			case CS_SUSPEND_CORRUPT_DATA_FLOW_VALUE: return CS_SUSPEND_CORRUPT_DATA_FLOW;
			case CS_SUSPEND_EXCESSIVE_CLIENT_ACCESS_VALUE: return CS_SUSPEND_EXCESSIVE_CLIENT_ACCESS;
			case CS_SUSPEND_INFECTED_HOST_VALUE: return CS_SUSPEND_INFECTED_HOST;
			case CS_SUSPEND_INFECTED_PROCESS_VALUE: return CS_SUSPEND_INFECTED_PROCESS;
			case CS_SUSPEND_INSECURE_SERVICE_CHANNEL_VALUE: return CS_SUSPEND_INSECURE_SERVICE_CHANNEL;
			case CS_SUSPEND_OUTBOUND_FLOW_VALUE: return CS_SUSPEND_OUTBOUND_FLOW;
			case CS_SUSPEND_SENSITIVE_DATA_FLOW_VALUE: return CS_SUSPEND_SENSITIVE_DATA_FLOW;
			case CS_SUSPEND_UNAUTHENTIC_CLIENT_ACCESS_VALUE: return CS_SUSPEND_UNAUTHENTIC_CLIENT_ACCESS;
			case CS_SUSPEND_UNRELIABLE_CONTROLLER_VALUE: return CS_SUSPEND_UNRELIABLE_CONTROLLER;
			case CS_SUSPEND_UNTRUSTWORTHY_CLIENT_ACCESS_VALUE: return CS_SUSPEND_UNTRUSTWORTHY_CLIENT_ACCESS;
			case CS_SUSPEND_VULNERABLE_HOST_VALUE: return CS_SUSPEND_VULNERABLE_HOST;
			case CS_SUSPEND_VULNERABLE_SERVICE_VALUE: return CS_SUSPEND_VULNERABLE_SERVICE;
			case CS_SUSPEND_VULNERABLE_SERVICE_CHANNEL_VALUE: return CS_SUSPEND_VULNERABLE_SERVICE_CHANNEL;
			case CS_SYSTEM_SECURITY_TRAINING_VALUE: return CS_SYSTEM_SECURITY_TRAINING;
			case CSTLS_VALUE: return CSTLS;
			case CS_TEAM_LEADERSHIP_VALUE: return CS_TEAM_LEADERSHIP;
			case CS_TEAM_ROLE_VALUE: return CS_TEAM_ROLE;
			case CS_UNMANAGED_VALUE: return CS_UNMANAGED;
			case CS_USES_NO_EMAIL_VALUE: return CS_USES_NO_EMAIL;
			case CS_VITAL_INTERESTS_VALUE: return CS_VITAL_INTERESTS;
			case CSX509_VALUE: return CSX509;
			case CSX509_CLIENT_VERIFIER_VALUE: return CSX509_CLIENT_VERIFIER;
			case CSX509_SERVICE_VERIFIER_VALUE: return CSX509_SERVICE_VERIFIER;
			case CSXSS_SANITISATION_VALUE: return CSXSS_SANITISATION;
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
	private ControlSetKind(int value, String name, String literal) {
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
	
} //ControlSetKind
