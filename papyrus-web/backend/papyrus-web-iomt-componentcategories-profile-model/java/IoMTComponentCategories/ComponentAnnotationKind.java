/**
 */
package IoMTComponentCategories;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Component Annotation Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IoMTComponentCategories.IoMTComponentCategoriesPackage#getComponentAnnotationKind()
 * @model
 * @generated
 */
public enum ComponentAnnotationKind implements Enumerator {
	/**
	 * The '<em><b>Configuration Change</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATION_CHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURATION_CHANGE(0, "configurationChange", "configurationChange"),

	/**
	 * The '<em><b>Access Permission</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_PERMISSION_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS_PERMISSION(1, "accessPermission", "accessPermission"),

	/**
	 * The '<em><b>Factory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACTORY_VALUE
	 * @generated
	 * @ordered
	 */
	FACTORY(2, "factory", "factory"),

	/**
	 * The '<em><b>Collector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTOR(3, "collector", "collector"),

	/**
	 * The '<em><b>External Software</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_SOFTWARE_VALUE
	 * @generated
	 * @ordered
	 */
	EXTERNAL_SOFTWARE(4, "externalSoftware", "externalSoftware"),

	/**
	 * The '<em><b>Mutual Trust</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUTUAL_TRUST_VALUE
	 * @generated
	 * @ordered
	 */
	MUTUAL_TRUST(5, "mutualTrust", "mutualTrust"),

	/**
	 * The '<em><b>Minimal Function Mode</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINIMAL_FUNCTION_MODE_VALUE
	 * @generated
	 * @ordered
	 */
	MINIMAL_FUNCTION_MODE(6, "minimalFunctionMode", "minimalFunctionMode"),

	/**
	 * The '<em><b>Asymetric Cryptography</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASYMETRIC_CRYPTOGRAPHY_VALUE
	 * @generated
	 * @ordered
	 */
	ASYMETRIC_CRYPTOGRAPHY(7, "asymetricCryptography", "asymetricCryptography"),

	/**
	 * The '<em><b>Device Vulnerability Mitigation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_VULNERABILITY_MITIGATION_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_VULNERABILITY_MITIGATION(8, "deviceVulnerabilityMitigation", "deviceVulnerabilityMitigation"),

	/**
	 * The '<em><b>Limited But Safe Operation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIMITED_BUT_SAFE_OPERATION_VALUE
	 * @generated
	 * @ordered
	 */
	LIMITED_BUT_SAFE_OPERATION(9, "limitedButSafeOperation", "limitedButSafeOperation"),

	/**
	 * The '<em><b>Failure Logger</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILURE_LOGGER_VALUE
	 * @generated
	 * @ordered
	 */
	FAILURE_LOGGER(10, "failureLogger", "failureLogger"),

	/**
	 * The '<em><b>Data Authenticator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_AUTHENTICATOR_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_AUTHENTICATOR(11, "dataAuthenticator", "dataAuthenticator"),

	/**
	 * The '<em><b>Certificate Without Expire Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERTIFICATE_WITHOUT_EXPIRE_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	CERTIFICATE_WITHOUT_EXPIRE_DATA(12, "certificateWithoutExpireData", "certificateWithoutExpireData"),

	/**
	 * The '<em><b>Unique Preshared Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIQUE_PRESHARED_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	UNIQUE_PRESHARED_KEY(13, "uniquePresharedKey", "uniquePresharedKey"),

	/**
	 * The '<em><b>Boot Software</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOT_SOFTWARE_VALUE
	 * @generated
	 * @ordered
	 */
	BOOT_SOFTWARE(14, "bootSoftware", "bootSoftware"),

	/**
	 * The '<em><b>Factory Password Generator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACTORY_PASSWORD_GENERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	FACTORY_PASSWORD_GENERATOR(15, "factoryPasswordGenerator", "factoryPasswordGenerator"),

	/**
	 * The '<em><b>Update Status Monitor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_STATUS_MONITOR_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE_STATUS_MONITOR(16, "updateStatusMonitor", "updateStatusMonitor"),

	/**
	 * The '<em><b>Remote Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE_ACCESS(17, "remoteAccess", "remoteAccess"),

	/**
	 * The '<em><b>Risk Control Measure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RISK_CONTROL_MEASURE_VALUE
	 * @generated
	 * @ordered
	 */
	RISK_CONTROL_MEASURE(18, "riskControlMeasure", "riskControlMeasure"),

	/**
	 * The '<em><b>Role Based Authentication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLE_BASED_AUTHENTICATION_VALUE
	 * @generated
	 * @ordered
	 */
	ROLE_BASED_AUTHENTICATION(19, "roleBasedAuthentication", "roleBasedAuthentication"),

	/**
	 * The '<em><b>Data Converter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_CONVERTER_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_CONVERTER(20, "dataConverter", "dataConverter"),

	/**
	 * The '<em><b>Random Number Generator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM_NUMBER_GENERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	RANDOM_NUMBER_GENERATOR(21, "randomNumberGenerator", "randomNumberGenerator"),

	/**
	 * The '<em><b>Cryptographic Key Generator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRYPTOGRAPHIC_KEY_GENERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	CRYPTOGRAPHIC_KEY_GENERATOR(22, "cryptographicKeyGenerator", "cryptographicKeyGenerator"),

	/**
	 * The '<em><b>Local Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_ACCESS(23, "localAccess", "localAccess"),

	/**
	 * The '<em><b>Backup Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKUP_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	BACKUP_DATA(24, "backupData", "backupData"),

	/**
	 * The '<em><b>Sensor Updater</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSOR_UPDATER_VALUE
	 * @generated
	 * @ordered
	 */
	SENSOR_UPDATER(25, "sensorUpdater", "sensorUpdater"),

	/**
	 * The '<em><b>Critical Log File Storer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_LOG_FILE_STORER_VALUE
	 * @generated
	 * @ordered
	 */
	CRITICAL_LOG_FILE_STORER(26, "criticalLogFileStorer", "criticalLogFileStorer"),

	/**
	 * The '<em><b>Cryptography Protection Of Data At Rest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRYPTOGRAPHY_PROTECTION_OF_DATA_AT_REST_VALUE
	 * @generated
	 * @ordered
	 */
	CRYPTOGRAPHY_PROTECTION_OF_DATA_AT_REST(27, "cryptographyProtectionOfDataAtRest", "cryptographyProtectionOfDataAtRest"),

	/**
	 * The '<em><b>Symmetric Cryptography</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYMMETRIC_CRYPTOGRAPHY_VALUE
	 * @generated
	 * @ordered
	 */
	SYMMETRIC_CRYPTOGRAPHY(28, "symmetricCryptography", "symmetricCryptography"),

	/**
	 * The '<em><b>Safety Event Manament</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFETY_EVENT_MANAMENT_VALUE
	 * @generated
	 * @ordered
	 */
	SAFETY_EVENT_MANAMENT(29, "safetyEventManament", "safetyEventManament"),

	/**
	 * The '<em><b>Certificate Recording</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERTIFICATE_RECORDING_VALUE
	 * @generated
	 * @ordered
	 */
	CERTIFICATE_RECORDING(30, "certificateRecording", "certificateRecording"),

	/**
	 * The '<em><b>Temper Proof Identity Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPER_PROOF_IDENTITY_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPER_PROOF_IDENTITY_STORAGE(31, "temperProofIdentityStorage", "temperProofIdentityStorage"),

	/**
	 * The '<em><b>Critical Electronic Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_ELECTRONIC_DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	CRITICAL_ELECTRONIC_DEVICE(32, "criticalElectronicDevice", "criticalElectronicDevice"),

	/**
	 * The '<em><b>Vulnerability Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VULNERABILITY_DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	VULNERABILITY_DEVICE(33, "vulnerabilityDevice", "vulnerabilityDevice"),

	/**
	 * The '<em><b>Unautorized Users Preventer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNAUTORIZED_USERS_PREVENTER_VALUE
	 * @generated
	 * @ordered
	 */
	UNAUTORIZED_USERS_PREVENTER(34, "unautorizedUsersPreventer", "unautorizedUsersPreventer"),

	/**
	 * The '<em><b>Medical IT Network</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICAL_IT_NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICAL_IT_NETWORK(35, "medicalITNetwork", "medicalITNetwork"),

	/**
	 * The '<em><b>Security Event Log</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_EVENT_LOG_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY_EVENT_LOG(36, "securityEventLog", "securityEventLog"),

	/**
	 * The '<em><b>Critical Actions Timestamped Logger</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_ACTIONS_TIMESTAMPED_LOGGER_VALUE
	 * @generated
	 * @ordered
	 */
	CRITICAL_ACTIONS_TIMESTAMPED_LOGGER(37, "criticalActionsTimestampedLogger", "criticalActionsTimestampedLogger"),

	/**
	 * The '<em><b>Communication Encrypted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_ENCRYPTED_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION_ENCRYPTED(38, "communicationEncrypted", "communicationEncrypted"),

	/**
	 * The '<em><b>Geo Located Reporter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEO_LOCATED_REPORTER_VALUE
	 * @generated
	 * @ordered
	 */
	GEO_LOCATED_REPORTER(39, "geoLocatedReporter", "geoLocatedReporter"),

	/**
	 * The '<em><b>Identity Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTITY_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTITY_STORAGE(40, "identityStorage", "identityStorage"),

	/**
	 * The '<em><b>Spatio Temporal Synchornizer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPATIO_TEMPORAL_SYNCHORNIZER_VALUE
	 * @generated
	 * @ordered
	 */
	SPATIO_TEMPORAL_SYNCHORNIZER(41, "spatioTemporalSynchornizer", "spatioTemporalSynchornizer"),

	/**
	 * The '<em><b>Non Essential PII Collector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_ESSENTIAL_PII_COLLECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	NON_ESSENTIAL_PII_COLLECTOR(42, "nonEssentialPIICollector", "nonEssentialPIICollector"),

	/**
	 * The '<em><b>Non Notifying Single Point Of Failure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_NOTIFYING_SINGLE_POINT_OF_FAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	NON_NOTIFYING_SINGLE_POINT_OF_FAILURE(43, "nonNotifyingSinglePointOfFailure", "nonNotifyingSinglePointOfFailure"),

	/**
	 * The '<em><b>Plain Text PII Logger</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAIN_TEXT_PII_LOGGER_VALUE
	 * @generated
	 * @ordered
	 */
	PLAIN_TEXT_PII_LOGGER(44, "plainTextPIILogger", "plainTextPIILogger"),

	/**
	 * The '<em><b>Document Information</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_INFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT_INFORMATION(45, "documentInformation", "documentInformation"),

	/**
	 * The '<em><b>Required Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRED_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIRED_COMPONENT(46, "requiredComponent", "requiredComponent"),

	/**
	 * The '<em><b>Unrequired Communication Capability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNREQUIRED_COMMUNICATION_CAPABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	UNREQUIRED_COMMUNICATION_CAPABILITY(47, "unrequiredCommunicationCapability", "unrequiredCommunicationCapability"),

	/**
	 * The '<em><b>Privacy Manager</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVACY_MANAGER_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVACY_MANAGER(48, "privacyManager", "privacyManager"),

	/**
	 * The '<em><b>Secure Semantic Interoperability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_SEMANTIC_INTEROPERABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	SECURE_SEMANTIC_INTEROPERABILITY(49, "secureSemanticInteroperability", "secureSemanticInteroperability"),

	/**
	 * The '<em><b>Configuration Backup Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATION_BACKUP_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURATION_BACKUP_DATA(50, "configurationBackupData", "configurationBackupData"),

	/**
	 * The '<em><b>Critical Mechanical Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_MECHANICAL_DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	CRITICAL_MECHANICAL_DEVICE(51, "criticalMechanicalDevice", "criticalMechanicalDevice"),

	/**
	 * The '<em><b>App Data Stored</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APP_DATA_STORED_VALUE
	 * @generated
	 * @ordered
	 */
	APP_DATA_STORED(52, "appDataStored", "appDataStored"),

	/**
	 * The '<em><b>Critical Events Timestamped Logger</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_EVENTS_TIMESTAMPED_LOGGER_VALUE
	 * @generated
	 * @ordered
	 */
	CRITICAL_EVENTS_TIMESTAMPED_LOGGER(53, "criticalEventsTimestampedLogger", "criticalEventsTimestampedLogger"),

	/**
	 * The '<em><b>Device Authenticator To Gateway</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_AUTHENTICATOR_TO_GATEWAY_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_AUTHENTICATOR_TO_GATEWAY(54, "deviceAuthenticatorToGateway", "deviceAuthenticatorToGateway"),

	/**
	 * The '<em><b>Technical User Interface Verification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNICAL_USER_INTERFACE_VERIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	TECHNICAL_USER_INTERFACE_VERIFICATION(55, "technicalUserInterfaceVerification", "technicalUserInterfaceVerification"),

	/**
	 * The '<em><b>Secure Asset Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_ASSET_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SECURE_ASSET_STORAGE(56, "secureAssetStorage", "secureAssetStorage"),

	/**
	 * The '<em><b>Software In Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_IN_DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTWARE_IN_DEVICE(57, "softwareInDevice", "softwareInDevice"),

	/**
	 * The '<em><b>Device Pairing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_PAIRING_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_PAIRING(58, "devicePairing", "devicePairing"),

	/**
	 * The '<em><b>Post Market Surveillance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_MARKET_SURVEILLANCE_VALUE
	 * @generated
	 * @ordered
	 */
	POST_MARKET_SURVEILLANCE(59, "postMarketSurveillance", "postMarketSurveillance"),

	/**
	 * The '<em><b>Candidate Security Capability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANDIDATE_SECURITY_CAPABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	CANDIDATE_SECURITY_CAPABILITY(60, "candidateSecurityCapability", "candidateSecurityCapability"),

	/**
	 * The '<em><b>Electronic Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRONIC_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRONIC_COMPONENT(61, "electronicComponent", "electronicComponent"),

	/**
	 * The '<em><b>Secure Device Identity Generator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_DEVICE_IDENTITY_GENERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	SECURE_DEVICE_IDENTITY_GENERATOR(62, "secureDeviceIdentityGenerator", "secureDeviceIdentityGenerator"),

	/**
	 * The '<em><b>Non Critical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_CRITICAL_VALUE
	 * @generated
	 * @ordered
	 */
	NON_CRITICAL(63, "nonCritical", "nonCritical"),

	/**
	 * The '<em><b>Sensitive Backup Of External Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSITIVE_BACKUP_OF_EXTERNAL_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SENSITIVE_BACKUP_OF_EXTERNAL_STORAGE(64, "sensitiveBackupOfExternalStorage", "sensitiveBackupOfExternalStorage"),

	/**
	 * The '<em><b>Access To External Web Site</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_TO_EXTERNAL_WEB_SITE_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS_TO_EXTERNAL_WEB_SITE(65, "accessToExternalWebSite", "accessToExternalWebSite"),

	/**
	 * The '<em><b>Personnal Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSONNAL_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	PERSONNAL_DATA(66, "personnalData", "personnalData"),

	/**
	 * The '<em><b>Cryptography For Source Validity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRYPTOGRAPHY_FOR_SOURCE_VALIDITY_VALUE
	 * @generated
	 * @ordered
	 */
	CRYPTOGRAPHY_FOR_SOURCE_VALIDITY(67, "cryptographyForSourceValidity", "cryptographyForSourceValidity"),

	/**
	 * The '<em><b>Off Label Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFF_LABEL_DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	OFF_LABEL_DEVICE(68, "offLabelDevice", "offLabelDevice"),

	/**
	 * The '<em><b>Implicit Device2 Device Trust</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLICIT_DEVICE2_DEVICE_TRUST_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLICIT_DEVICE2_DEVICE_TRUST(69, "implicitDevice2DeviceTrust", "implicitDevice2DeviceTrust"),

	/**
	 * The '<em><b>Data Processor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PROCESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_PROCESSOR(70, "dataProcessor", "dataProcessor"),

	/**
	 * The '<em><b>Identity Recorder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTITY_RECORDER_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTITY_RECORDER(71, "identityRecorder", "identityRecorder"),

	/**
	 * The '<em><b>Risk Analyser</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RISK_ANALYSER_VALUE
	 * @generated
	 * @ordered
	 */
	RISK_ANALYSER(72, "riskAnalyser", "riskAnalyser"),

	/**
	 * The '<em><b>Fail Safe Mode</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAIL_SAFE_MODE_VALUE
	 * @generated
	 * @ordered
	 */
	FAIL_SAFE_MODE(73, "failSafeMode", "failSafeMode"),

	/**
	 * The '<em><b>Security Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY_CONTROL(74, "securityControl", "securityControl"),

	/**
	 * The '<em><b>Inconsistent Data Handler</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCONSISTENT_DATA_HANDLER_VALUE
	 * @generated
	 * @ordered
	 */
	INCONSISTENT_DATA_HANDLER(75, "inconsistentDataHandler", "inconsistentDataHandler"),

	/**
	 * The '<em><b>Inconsistent Device Location Handler</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCONSISTENT_DEVICE_LOCATION_HANDLER_VALUE
	 * @generated
	 * @ordered
	 */
	INCONSISTENT_DEVICE_LOCATION_HANDLER(76, "inconsistentDeviceLocationHandler", "inconsistentDeviceLocationHandler"),

	/**
	 * The '<em><b>Encrypted Data Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENCRYPTED_DATA_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENCRYPTED_DATA_STORAGE(77, "encryptedDataStorage", "encryptedDataStorage"),

	/**
	 * The '<em><b>Closed Communication Protocol</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_COMMUNICATION_PROTOCOL_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED_COMMUNICATION_PROTOCOL(78, "closedCommunicationProtocol", "closedCommunicationProtocol"),

	/**
	 * The '<em><b>Tampering Preventer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAMPERING_PREVENTER_VALUE
	 * @generated
	 * @ordered
	 */
	TAMPERING_PREVENTER(79, "tamperingPreventer", "tamperingPreventer"),

	/**
	 * The '<em><b>Non Timely Update Detector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_TIMELY_UPDATE_DETECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	NON_TIMELY_UPDATE_DETECTOR(80, "nonTimelyUpdateDetector", "nonTimelyUpdateDetector"),

	/**
	 * The '<em><b>Secure Code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_CODE_VALUE
	 * @generated
	 * @ordered
	 */
	SECURE_CODE(81, "secureCode", "secureCode"),

	/**
	 * The '<em><b>Secure Interoperability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_INTEROPERABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	SECURE_INTEROPERABILITY(82, "secureInteroperability", "secureInteroperability"),

	/**
	 * The '<em><b>Unique Component Level Generator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIQUE_COMPONENT_LEVEL_GENERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	UNIQUE_COMPONENT_LEVEL_GENERATOR(83, "uniqueComponentLevelGenerator", "uniqueComponentLevelGenerator"),

	/**
	 * The '<em><b>Most Secure Communication Protocol</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOST_SECURE_COMMUNICATION_PROTOCOL_VALUE
	 * @generated
	 * @ordered
	 */
	MOST_SECURE_COMMUNICATION_PROTOCOL(84, "mostSecureCommunicationProtocol", "mostSecureCommunicationProtocol"),

	/**
	 * The '<em><b>Critical Data Backup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_DATA_BACKUP_VALUE
	 * @generated
	 * @ordered
	 */
	CRITICAL_DATA_BACKUP(85, "criticalDataBackup", "criticalDataBackup"),

	/**
	 * The '<em><b>Clone Resistant ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLONE_RESISTANT_ID_VALUE
	 * @generated
	 * @ordered
	 */
	CLONE_RESISTANT_ID(86, "cloneResistantID", "cloneResistantID"),

	/**
	 * The '<em><b>Modification Resistant ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODIFICATION_RESISTANT_ID_VALUE
	 * @generated
	 * @ordered
	 */
	MODIFICATION_RESISTANT_ID(87, "modificationResistantID", "modificationResistantID"),

	/**
	 * The '<em><b>MA Cbased Identifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MA_CBASED_IDENTIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	MA_CBASED_IDENTIFIER(88, "MACbasedIdentifier", "MACbasedIdentifier"),

	/**
	 * The '<em><b>Medical Device Connection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICAL_DEVICE_CONNECTION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICAL_DEVICE_CONNECTION(89, "medicalDeviceConnection", "medicalDeviceConnection"),

	/**
	 * The '<em><b>Malware Protector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MALWARE_PROTECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	MALWARE_PROTECTOR(90, "malwareProtector", "malwareProtector"),

	/**
	 * The '<em><b>Critical Software Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_SOFTWARE_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	CRITICAL_SOFTWARE_COMPONENT(91, "criticalSoftwareComponent", "criticalSoftwareComponent"),

	/**
	 * The '<em><b>Backup Optimizer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKUP_OPTIMIZER_VALUE
	 * @generated
	 * @ordered
	 */
	BACKUP_OPTIMIZER(92, "backupOptimizer", "backupOptimizer"),

	/**
	 * The '<em><b>Data Authentifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_AUTHENTIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_AUTHENTIFIER(93, "dataAuthentifier", "dataAuthentifier");

	/**
	 * The '<em><b>Configuration Change</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATION_CHANGE
	 * @model name="configurationChange"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION_CHANGE_VALUE = 0;

	/**
	 * The '<em><b>Access Permission</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_PERMISSION
	 * @model name="accessPermission"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMISSION_VALUE = 1;

	/**
	 * The '<em><b>Factory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACTORY
	 * @model name="factory"
	 * @generated
	 * @ordered
	 */
	public static final int FACTORY_VALUE = 2;

	/**
	 * The '<em><b>Collector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTOR
	 * @model name="collector"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTOR_VALUE = 3;

	/**
	 * The '<em><b>External Software</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_SOFTWARE
	 * @model name="externalSoftware"
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_SOFTWARE_VALUE = 4;

	/**
	 * The '<em><b>Mutual Trust</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUTUAL_TRUST
	 * @model name="mutualTrust"
	 * @generated
	 * @ordered
	 */
	public static final int MUTUAL_TRUST_VALUE = 5;

	/**
	 * The '<em><b>Minimal Function Mode</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINIMAL_FUNCTION_MODE
	 * @model name="minimalFunctionMode"
	 * @generated
	 * @ordered
	 */
	public static final int MINIMAL_FUNCTION_MODE_VALUE = 6;

	/**
	 * The '<em><b>Asymetric Cryptography</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASYMETRIC_CRYPTOGRAPHY
	 * @model name="asymetricCryptography"
	 * @generated
	 * @ordered
	 */
	public static final int ASYMETRIC_CRYPTOGRAPHY_VALUE = 7;

	/**
	 * The '<em><b>Device Vulnerability Mitigation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_VULNERABILITY_MITIGATION
	 * @model name="deviceVulnerabilityMitigation"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_VULNERABILITY_MITIGATION_VALUE = 8;

	/**
	 * The '<em><b>Limited But Safe Operation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIMITED_BUT_SAFE_OPERATION
	 * @model name="limitedButSafeOperation"
	 * @generated
	 * @ordered
	 */
	public static final int LIMITED_BUT_SAFE_OPERATION_VALUE = 9;

	/**
	 * The '<em><b>Failure Logger</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILURE_LOGGER
	 * @model name="failureLogger"
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_LOGGER_VALUE = 10;

	/**
	 * The '<em><b>Data Authenticator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_AUTHENTICATOR
	 * @model name="dataAuthenticator"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_AUTHENTICATOR_VALUE = 11;

	/**
	 * The '<em><b>Certificate Without Expire Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERTIFICATE_WITHOUT_EXPIRE_DATA
	 * @model name="certificateWithoutExpireData"
	 * @generated
	 * @ordered
	 */
	public static final int CERTIFICATE_WITHOUT_EXPIRE_DATA_VALUE = 12;

	/**
	 * The '<em><b>Unique Preshared Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIQUE_PRESHARED_KEY
	 * @model name="uniquePresharedKey"
	 * @generated
	 * @ordered
	 */
	public static final int UNIQUE_PRESHARED_KEY_VALUE = 13;

	/**
	 * The '<em><b>Boot Software</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOT_SOFTWARE
	 * @model name="bootSoftware"
	 * @generated
	 * @ordered
	 */
	public static final int BOOT_SOFTWARE_VALUE = 14;

	/**
	 * The '<em><b>Factory Password Generator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACTORY_PASSWORD_GENERATOR
	 * @model name="factoryPasswordGenerator"
	 * @generated
	 * @ordered
	 */
	public static final int FACTORY_PASSWORD_GENERATOR_VALUE = 15;

	/**
	 * The '<em><b>Update Status Monitor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_STATUS_MONITOR
	 * @model name="updateStatusMonitor"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_STATUS_MONITOR_VALUE = 16;

	/**
	 * The '<em><b>Remote Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_ACCESS
	 * @model name="remoteAccess"
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_ACCESS_VALUE = 17;

	/**
	 * The '<em><b>Risk Control Measure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RISK_CONTROL_MEASURE
	 * @model name="riskControlMeasure"
	 * @generated
	 * @ordered
	 */
	public static final int RISK_CONTROL_MEASURE_VALUE = 18;

	/**
	 * The '<em><b>Role Based Authentication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLE_BASED_AUTHENTICATION
	 * @model name="roleBasedAuthentication"
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_BASED_AUTHENTICATION_VALUE = 19;

	/**
	 * The '<em><b>Data Converter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_CONVERTER
	 * @model name="dataConverter"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_CONVERTER_VALUE = 20;

	/**
	 * The '<em><b>Random Number Generator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM_NUMBER_GENERATOR
	 * @model name="randomNumberGenerator"
	 * @generated
	 * @ordered
	 */
	public static final int RANDOM_NUMBER_GENERATOR_VALUE = 21;

	/**
	 * The '<em><b>Cryptographic Key Generator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRYPTOGRAPHIC_KEY_GENERATOR
	 * @model name="cryptographicKeyGenerator"
	 * @generated
	 * @ordered
	 */
	public static final int CRYPTOGRAPHIC_KEY_GENERATOR_VALUE = 22;

	/**
	 * The '<em><b>Local Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_ACCESS
	 * @model name="localAccess"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_ACCESS_VALUE = 23;

	/**
	 * The '<em><b>Backup Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKUP_DATA
	 * @model name="backupData"
	 * @generated
	 * @ordered
	 */
	public static final int BACKUP_DATA_VALUE = 24;

	/**
	 * The '<em><b>Sensor Updater</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSOR_UPDATER
	 * @model name="sensorUpdater"
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR_UPDATER_VALUE = 25;

	/**
	 * The '<em><b>Critical Log File Storer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_LOG_FILE_STORER
	 * @model name="criticalLogFileStorer"
	 * @generated
	 * @ordered
	 */
	public static final int CRITICAL_LOG_FILE_STORER_VALUE = 26;

	/**
	 * The '<em><b>Cryptography Protection Of Data At Rest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRYPTOGRAPHY_PROTECTION_OF_DATA_AT_REST
	 * @model name="cryptographyProtectionOfDataAtRest"
	 * @generated
	 * @ordered
	 */
	public static final int CRYPTOGRAPHY_PROTECTION_OF_DATA_AT_REST_VALUE = 27;

	/**
	 * The '<em><b>Symmetric Cryptography</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYMMETRIC_CRYPTOGRAPHY
	 * @model name="symmetricCryptography"
	 * @generated
	 * @ordered
	 */
	public static final int SYMMETRIC_CRYPTOGRAPHY_VALUE = 28;

	/**
	 * The '<em><b>Safety Event Manament</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFETY_EVENT_MANAMENT
	 * @model name="safetyEventManament"
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_EVENT_MANAMENT_VALUE = 29;

	/**
	 * The '<em><b>Certificate Recording</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERTIFICATE_RECORDING
	 * @model name="certificateRecording"
	 * @generated
	 * @ordered
	 */
	public static final int CERTIFICATE_RECORDING_VALUE = 30;

	/**
	 * The '<em><b>Temper Proof Identity Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPER_PROOF_IDENTITY_STORAGE
	 * @model name="temperProofIdentityStorage"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPER_PROOF_IDENTITY_STORAGE_VALUE = 31;

	/**
	 * The '<em><b>Critical Electronic Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_ELECTRONIC_DEVICE
	 * @model name="criticalElectronicDevice"
	 * @generated
	 * @ordered
	 */
	public static final int CRITICAL_ELECTRONIC_DEVICE_VALUE = 32;

	/**
	 * The '<em><b>Vulnerability Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VULNERABILITY_DEVICE
	 * @model name="vulnerabilityDevice"
	 * @generated
	 * @ordered
	 */
	public static final int VULNERABILITY_DEVICE_VALUE = 33;

	/**
	 * The '<em><b>Unautorized Users Preventer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNAUTORIZED_USERS_PREVENTER
	 * @model name="unautorizedUsersPreventer"
	 * @generated
	 * @ordered
	 */
	public static final int UNAUTORIZED_USERS_PREVENTER_VALUE = 34;

	/**
	 * The '<em><b>Medical IT Network</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICAL_IT_NETWORK
	 * @model name="medicalITNetwork"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICAL_IT_NETWORK_VALUE = 35;

	/**
	 * The '<em><b>Security Event Log</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_EVENT_LOG
	 * @model name="securityEventLog"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_EVENT_LOG_VALUE = 36;

	/**
	 * The '<em><b>Critical Actions Timestamped Logger</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_ACTIONS_TIMESTAMPED_LOGGER
	 * @model name="criticalActionsTimestampedLogger"
	 * @generated
	 * @ordered
	 */
	public static final int CRITICAL_ACTIONS_TIMESTAMPED_LOGGER_VALUE = 37;

	/**
	 * The '<em><b>Communication Encrypted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_ENCRYPTED
	 * @model name="communicationEncrypted"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_ENCRYPTED_VALUE = 38;

	/**
	 * The '<em><b>Geo Located Reporter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEO_LOCATED_REPORTER
	 * @model name="geoLocatedReporter"
	 * @generated
	 * @ordered
	 */
	public static final int GEO_LOCATED_REPORTER_VALUE = 39;

	/**
	 * The '<em><b>Identity Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTITY_STORAGE
	 * @model name="identityStorage"
	 * @generated
	 * @ordered
	 */
	public static final int IDENTITY_STORAGE_VALUE = 40;

	/**
	 * The '<em><b>Spatio Temporal Synchornizer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPATIO_TEMPORAL_SYNCHORNIZER
	 * @model name="spatioTemporalSynchornizer"
	 * @generated
	 * @ordered
	 */
	public static final int SPATIO_TEMPORAL_SYNCHORNIZER_VALUE = 41;

	/**
	 * The '<em><b>Non Essential PII Collector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_ESSENTIAL_PII_COLLECTOR
	 * @model name="nonEssentialPIICollector"
	 * @generated
	 * @ordered
	 */
	public static final int NON_ESSENTIAL_PII_COLLECTOR_VALUE = 42;

	/**
	 * The '<em><b>Non Notifying Single Point Of Failure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_NOTIFYING_SINGLE_POINT_OF_FAILURE
	 * @model name="nonNotifyingSinglePointOfFailure"
	 * @generated
	 * @ordered
	 */
	public static final int NON_NOTIFYING_SINGLE_POINT_OF_FAILURE_VALUE = 43;

	/**
	 * The '<em><b>Plain Text PII Logger</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAIN_TEXT_PII_LOGGER
	 * @model name="plainTextPIILogger"
	 * @generated
	 * @ordered
	 */
	public static final int PLAIN_TEXT_PII_LOGGER_VALUE = 44;

	/**
	 * The '<em><b>Document Information</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_INFORMATION
	 * @model name="documentInformation"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_INFORMATION_VALUE = 45;

	/**
	 * The '<em><b>Required Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRED_COMPONENT
	 * @model name="requiredComponent"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRED_COMPONENT_VALUE = 46;

	/**
	 * The '<em><b>Unrequired Communication Capability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNREQUIRED_COMMUNICATION_CAPABILITY
	 * @model name="unrequiredCommunicationCapability"
	 * @generated
	 * @ordered
	 */
	public static final int UNREQUIRED_COMMUNICATION_CAPABILITY_VALUE = 47;

	/**
	 * The '<em><b>Privacy Manager</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVACY_MANAGER
	 * @model name="privacyManager"
	 * @generated
	 * @ordered
	 */
	public static final int PRIVACY_MANAGER_VALUE = 48;

	/**
	 * The '<em><b>Secure Semantic Interoperability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_SEMANTIC_INTEROPERABILITY
	 * @model name="secureSemanticInteroperability"
	 * @generated
	 * @ordered
	 */
	public static final int SECURE_SEMANTIC_INTEROPERABILITY_VALUE = 49;

	/**
	 * The '<em><b>Configuration Backup Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATION_BACKUP_DATA
	 * @model name="configurationBackupData"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION_BACKUP_DATA_VALUE = 50;

	/**
	 * The '<em><b>Critical Mechanical Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_MECHANICAL_DEVICE
	 * @model name="criticalMechanicalDevice"
	 * @generated
	 * @ordered
	 */
	public static final int CRITICAL_MECHANICAL_DEVICE_VALUE = 51;

	/**
	 * The '<em><b>App Data Stored</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APP_DATA_STORED
	 * @model name="appDataStored"
	 * @generated
	 * @ordered
	 */
	public static final int APP_DATA_STORED_VALUE = 52;

	/**
	 * The '<em><b>Critical Events Timestamped Logger</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_EVENTS_TIMESTAMPED_LOGGER
	 * @model name="criticalEventsTimestampedLogger"
	 * @generated
	 * @ordered
	 */
	public static final int CRITICAL_EVENTS_TIMESTAMPED_LOGGER_VALUE = 53;

	/**
	 * The '<em><b>Device Authenticator To Gateway</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_AUTHENTICATOR_TO_GATEWAY
	 * @model name="deviceAuthenticatorToGateway"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_AUTHENTICATOR_TO_GATEWAY_VALUE = 54;

	/**
	 * The '<em><b>Technical User Interface Verification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNICAL_USER_INTERFACE_VERIFICATION
	 * @model name="technicalUserInterfaceVerification"
	 * @generated
	 * @ordered
	 */
	public static final int TECHNICAL_USER_INTERFACE_VERIFICATION_VALUE = 55;

	/**
	 * The '<em><b>Secure Asset Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_ASSET_STORAGE
	 * @model name="secureAssetStorage"
	 * @generated
	 * @ordered
	 */
	public static final int SECURE_ASSET_STORAGE_VALUE = 56;

	/**
	 * The '<em><b>Software In Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_IN_DEVICE
	 * @model name="softwareInDevice"
	 * @generated
	 * @ordered
	 */
	public static final int SOFTWARE_IN_DEVICE_VALUE = 57;

	/**
	 * The '<em><b>Device Pairing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_PAIRING
	 * @model name="devicePairing"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_PAIRING_VALUE = 58;

	/**
	 * The '<em><b>Post Market Surveillance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_MARKET_SURVEILLANCE
	 * @model name="postMarketSurveillance"
	 * @generated
	 * @ordered
	 */
	public static final int POST_MARKET_SURVEILLANCE_VALUE = 59;

	/**
	 * The '<em><b>Candidate Security Capability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANDIDATE_SECURITY_CAPABILITY
	 * @model name="candidateSecurityCapability"
	 * @generated
	 * @ordered
	 */
	public static final int CANDIDATE_SECURITY_CAPABILITY_VALUE = 60;

	/**
	 * The '<em><b>Electronic Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRONIC_COMPONENT
	 * @model name="electronicComponent"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRONIC_COMPONENT_VALUE = 61;

	/**
	 * The '<em><b>Secure Device Identity Generator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_DEVICE_IDENTITY_GENERATOR
	 * @model name="secureDeviceIdentityGenerator"
	 * @generated
	 * @ordered
	 */
	public static final int SECURE_DEVICE_IDENTITY_GENERATOR_VALUE = 62;

	/**
	 * The '<em><b>Non Critical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_CRITICAL
	 * @model name="nonCritical"
	 * @generated
	 * @ordered
	 */
	public static final int NON_CRITICAL_VALUE = 63;

	/**
	 * The '<em><b>Sensitive Backup Of External Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSITIVE_BACKUP_OF_EXTERNAL_STORAGE
	 * @model name="sensitiveBackupOfExternalStorage"
	 * @generated
	 * @ordered
	 */
	public static final int SENSITIVE_BACKUP_OF_EXTERNAL_STORAGE_VALUE = 64;

	/**
	 * The '<em><b>Access To External Web Site</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_TO_EXTERNAL_WEB_SITE
	 * @model name="accessToExternalWebSite"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_TO_EXTERNAL_WEB_SITE_VALUE = 65;

	/**
	 * The '<em><b>Personnal Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSONNAL_DATA
	 * @model name="personnalData"
	 * @generated
	 * @ordered
	 */
	public static final int PERSONNAL_DATA_VALUE = 66;

	/**
	 * The '<em><b>Cryptography For Source Validity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRYPTOGRAPHY_FOR_SOURCE_VALIDITY
	 * @model name="cryptographyForSourceValidity"
	 * @generated
	 * @ordered
	 */
	public static final int CRYPTOGRAPHY_FOR_SOURCE_VALIDITY_VALUE = 67;

	/**
	 * The '<em><b>Off Label Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFF_LABEL_DEVICE
	 * @model name="offLabelDevice"
	 * @generated
	 * @ordered
	 */
	public static final int OFF_LABEL_DEVICE_VALUE = 68;

	/**
	 * The '<em><b>Implicit Device2 Device Trust</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLICIT_DEVICE2_DEVICE_TRUST
	 * @model name="implicitDevice2DeviceTrust"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLICIT_DEVICE2_DEVICE_TRUST_VALUE = 69;

	/**
	 * The '<em><b>Data Processor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PROCESSOR
	 * @model name="dataProcessor"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_PROCESSOR_VALUE = 70;

	/**
	 * The '<em><b>Identity Recorder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTITY_RECORDER
	 * @model name="identityRecorder"
	 * @generated
	 * @ordered
	 */
	public static final int IDENTITY_RECORDER_VALUE = 71;

	/**
	 * The '<em><b>Risk Analyser</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RISK_ANALYSER
	 * @model name="riskAnalyser"
	 * @generated
	 * @ordered
	 */
	public static final int RISK_ANALYSER_VALUE = 72;

	/**
	 * The '<em><b>Fail Safe Mode</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAIL_SAFE_MODE
	 * @model name="failSafeMode"
	 * @generated
	 * @ordered
	 */
	public static final int FAIL_SAFE_MODE_VALUE = 73;

	/**
	 * The '<em><b>Security Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_CONTROL
	 * @model name="securityControl"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_CONTROL_VALUE = 74;

	/**
	 * The '<em><b>Inconsistent Data Handler</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCONSISTENT_DATA_HANDLER
	 * @model name="inconsistentDataHandler"
	 * @generated
	 * @ordered
	 */
	public static final int INCONSISTENT_DATA_HANDLER_VALUE = 75;

	/**
	 * The '<em><b>Inconsistent Device Location Handler</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCONSISTENT_DEVICE_LOCATION_HANDLER
	 * @model name="inconsistentDeviceLocationHandler"
	 * @generated
	 * @ordered
	 */
	public static final int INCONSISTENT_DEVICE_LOCATION_HANDLER_VALUE = 76;

	/**
	 * The '<em><b>Encrypted Data Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENCRYPTED_DATA_STORAGE
	 * @model name="encryptedDataStorage"
	 * @generated
	 * @ordered
	 */
	public static final int ENCRYPTED_DATA_STORAGE_VALUE = 77;

	/**
	 * The '<em><b>Closed Communication Protocol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_COMMUNICATION_PROTOCOL
	 * @model name="closedCommunicationProtocol"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_COMMUNICATION_PROTOCOL_VALUE = 78;

	/**
	 * The '<em><b>Tampering Preventer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAMPERING_PREVENTER
	 * @model name="tamperingPreventer"
	 * @generated
	 * @ordered
	 */
	public static final int TAMPERING_PREVENTER_VALUE = 79;

	/**
	 * The '<em><b>Non Timely Update Detector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_TIMELY_UPDATE_DETECTOR
	 * @model name="nonTimelyUpdateDetector"
	 * @generated
	 * @ordered
	 */
	public static final int NON_TIMELY_UPDATE_DETECTOR_VALUE = 80;

	/**
	 * The '<em><b>Secure Code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_CODE
	 * @model name="secureCode"
	 * @generated
	 * @ordered
	 */
	public static final int SECURE_CODE_VALUE = 81;

	/**
	 * The '<em><b>Secure Interoperability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_INTEROPERABILITY
	 * @model name="secureInteroperability"
	 * @generated
	 * @ordered
	 */
	public static final int SECURE_INTEROPERABILITY_VALUE = 82;

	/**
	 * The '<em><b>Unique Component Level Generator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIQUE_COMPONENT_LEVEL_GENERATOR
	 * @model name="uniqueComponentLevelGenerator"
	 * @generated
	 * @ordered
	 */
	public static final int UNIQUE_COMPONENT_LEVEL_GENERATOR_VALUE = 83;

	/**
	 * The '<em><b>Most Secure Communication Protocol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOST_SECURE_COMMUNICATION_PROTOCOL
	 * @model name="mostSecureCommunicationProtocol"
	 * @generated
	 * @ordered
	 */
	public static final int MOST_SECURE_COMMUNICATION_PROTOCOL_VALUE = 84;

	/**
	 * The '<em><b>Critical Data Backup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_DATA_BACKUP
	 * @model name="criticalDataBackup"
	 * @generated
	 * @ordered
	 */
	public static final int CRITICAL_DATA_BACKUP_VALUE = 85;

	/**
	 * The '<em><b>Clone Resistant ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLONE_RESISTANT_ID
	 * @model name="cloneResistantID"
	 * @generated
	 * @ordered
	 */
	public static final int CLONE_RESISTANT_ID_VALUE = 86;

	/**
	 * The '<em><b>Modification Resistant ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODIFICATION_RESISTANT_ID
	 * @model name="modificationResistantID"
	 * @generated
	 * @ordered
	 */
	public static final int MODIFICATION_RESISTANT_ID_VALUE = 87;

	/**
	 * The '<em><b>MA Cbased Identifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MA_CBASED_IDENTIFIER
	 * @model name="MACbasedIdentifier"
	 * @generated
	 * @ordered
	 */
	public static final int MA_CBASED_IDENTIFIER_VALUE = 88;

	/**
	 * The '<em><b>Medical Device Connection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICAL_DEVICE_CONNECTION
	 * @model name="medicalDeviceConnection"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICAL_DEVICE_CONNECTION_VALUE = 89;

	/**
	 * The '<em><b>Malware Protector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MALWARE_PROTECTOR
	 * @model name="malwareProtector"
	 * @generated
	 * @ordered
	 */
	public static final int MALWARE_PROTECTOR_VALUE = 90;

	/**
	 * The '<em><b>Critical Software Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_SOFTWARE_COMPONENT
	 * @model name="criticalSoftwareComponent"
	 * @generated
	 * @ordered
	 */
	public static final int CRITICAL_SOFTWARE_COMPONENT_VALUE = 91;

	/**
	 * The '<em><b>Backup Optimizer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKUP_OPTIMIZER
	 * @model name="backupOptimizer"
	 * @generated
	 * @ordered
	 */
	public static final int BACKUP_OPTIMIZER_VALUE = 92;

	/**
	 * The '<em><b>Data Authentifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_AUTHENTIFIER
	 * @model name="dataAuthentifier"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_AUTHENTIFIER_VALUE = 93;

	/**
	 * An array of all the '<em><b>Component Annotation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComponentAnnotationKind[] VALUES_ARRAY =
		new ComponentAnnotationKind[] {
			CONFIGURATION_CHANGE,
			ACCESS_PERMISSION,
			FACTORY,
			COLLECTOR,
			EXTERNAL_SOFTWARE,
			MUTUAL_TRUST,
			MINIMAL_FUNCTION_MODE,
			ASYMETRIC_CRYPTOGRAPHY,
			DEVICE_VULNERABILITY_MITIGATION,
			LIMITED_BUT_SAFE_OPERATION,
			FAILURE_LOGGER,
			DATA_AUTHENTICATOR,
			CERTIFICATE_WITHOUT_EXPIRE_DATA,
			UNIQUE_PRESHARED_KEY,
			BOOT_SOFTWARE,
			FACTORY_PASSWORD_GENERATOR,
			UPDATE_STATUS_MONITOR,
			REMOTE_ACCESS,
			RISK_CONTROL_MEASURE,
			ROLE_BASED_AUTHENTICATION,
			DATA_CONVERTER,
			RANDOM_NUMBER_GENERATOR,
			CRYPTOGRAPHIC_KEY_GENERATOR,
			LOCAL_ACCESS,
			BACKUP_DATA,
			SENSOR_UPDATER,
			CRITICAL_LOG_FILE_STORER,
			CRYPTOGRAPHY_PROTECTION_OF_DATA_AT_REST,
			SYMMETRIC_CRYPTOGRAPHY,
			SAFETY_EVENT_MANAMENT,
			CERTIFICATE_RECORDING,
			TEMPER_PROOF_IDENTITY_STORAGE,
			CRITICAL_ELECTRONIC_DEVICE,
			VULNERABILITY_DEVICE,
			UNAUTORIZED_USERS_PREVENTER,
			MEDICAL_IT_NETWORK,
			SECURITY_EVENT_LOG,
			CRITICAL_ACTIONS_TIMESTAMPED_LOGGER,
			COMMUNICATION_ENCRYPTED,
			GEO_LOCATED_REPORTER,
			IDENTITY_STORAGE,
			SPATIO_TEMPORAL_SYNCHORNIZER,
			NON_ESSENTIAL_PII_COLLECTOR,
			NON_NOTIFYING_SINGLE_POINT_OF_FAILURE,
			PLAIN_TEXT_PII_LOGGER,
			DOCUMENT_INFORMATION,
			REQUIRED_COMPONENT,
			UNREQUIRED_COMMUNICATION_CAPABILITY,
			PRIVACY_MANAGER,
			SECURE_SEMANTIC_INTEROPERABILITY,
			CONFIGURATION_BACKUP_DATA,
			CRITICAL_MECHANICAL_DEVICE,
			APP_DATA_STORED,
			CRITICAL_EVENTS_TIMESTAMPED_LOGGER,
			DEVICE_AUTHENTICATOR_TO_GATEWAY,
			TECHNICAL_USER_INTERFACE_VERIFICATION,
			SECURE_ASSET_STORAGE,
			SOFTWARE_IN_DEVICE,
			DEVICE_PAIRING,
			POST_MARKET_SURVEILLANCE,
			CANDIDATE_SECURITY_CAPABILITY,
			ELECTRONIC_COMPONENT,
			SECURE_DEVICE_IDENTITY_GENERATOR,
			NON_CRITICAL,
			SENSITIVE_BACKUP_OF_EXTERNAL_STORAGE,
			ACCESS_TO_EXTERNAL_WEB_SITE,
			PERSONNAL_DATA,
			CRYPTOGRAPHY_FOR_SOURCE_VALIDITY,
			OFF_LABEL_DEVICE,
			IMPLICIT_DEVICE2_DEVICE_TRUST,
			DATA_PROCESSOR,
			IDENTITY_RECORDER,
			RISK_ANALYSER,
			FAIL_SAFE_MODE,
			SECURITY_CONTROL,
			INCONSISTENT_DATA_HANDLER,
			INCONSISTENT_DEVICE_LOCATION_HANDLER,
			ENCRYPTED_DATA_STORAGE,
			CLOSED_COMMUNICATION_PROTOCOL,
			TAMPERING_PREVENTER,
			NON_TIMELY_UPDATE_DETECTOR,
			SECURE_CODE,
			SECURE_INTEROPERABILITY,
			UNIQUE_COMPONENT_LEVEL_GENERATOR,
			MOST_SECURE_COMMUNICATION_PROTOCOL,
			CRITICAL_DATA_BACKUP,
			CLONE_RESISTANT_ID,
			MODIFICATION_RESISTANT_ID,
			MA_CBASED_IDENTIFIER,
			MEDICAL_DEVICE_CONNECTION,
			MALWARE_PROTECTOR,
			CRITICAL_SOFTWARE_COMPONENT,
			BACKUP_OPTIMIZER,
			DATA_AUTHENTIFIER,
		};

	/**
	 * A public read-only list of all the '<em><b>Component Annotation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComponentAnnotationKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Component Annotation Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentAnnotationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentAnnotationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Annotation Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentAnnotationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentAnnotationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Annotation Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentAnnotationKind get(int value) {
		switch (value) {
			case CONFIGURATION_CHANGE_VALUE: return CONFIGURATION_CHANGE;
			case ACCESS_PERMISSION_VALUE: return ACCESS_PERMISSION;
			case FACTORY_VALUE: return FACTORY;
			case COLLECTOR_VALUE: return COLLECTOR;
			case EXTERNAL_SOFTWARE_VALUE: return EXTERNAL_SOFTWARE;
			case MUTUAL_TRUST_VALUE: return MUTUAL_TRUST;
			case MINIMAL_FUNCTION_MODE_VALUE: return MINIMAL_FUNCTION_MODE;
			case ASYMETRIC_CRYPTOGRAPHY_VALUE: return ASYMETRIC_CRYPTOGRAPHY;
			case DEVICE_VULNERABILITY_MITIGATION_VALUE: return DEVICE_VULNERABILITY_MITIGATION;
			case LIMITED_BUT_SAFE_OPERATION_VALUE: return LIMITED_BUT_SAFE_OPERATION;
			case FAILURE_LOGGER_VALUE: return FAILURE_LOGGER;
			case DATA_AUTHENTICATOR_VALUE: return DATA_AUTHENTICATOR;
			case CERTIFICATE_WITHOUT_EXPIRE_DATA_VALUE: return CERTIFICATE_WITHOUT_EXPIRE_DATA;
			case UNIQUE_PRESHARED_KEY_VALUE: return UNIQUE_PRESHARED_KEY;
			case BOOT_SOFTWARE_VALUE: return BOOT_SOFTWARE;
			case FACTORY_PASSWORD_GENERATOR_VALUE: return FACTORY_PASSWORD_GENERATOR;
			case UPDATE_STATUS_MONITOR_VALUE: return UPDATE_STATUS_MONITOR;
			case REMOTE_ACCESS_VALUE: return REMOTE_ACCESS;
			case RISK_CONTROL_MEASURE_VALUE: return RISK_CONTROL_MEASURE;
			case ROLE_BASED_AUTHENTICATION_VALUE: return ROLE_BASED_AUTHENTICATION;
			case DATA_CONVERTER_VALUE: return DATA_CONVERTER;
			case RANDOM_NUMBER_GENERATOR_VALUE: return RANDOM_NUMBER_GENERATOR;
			case CRYPTOGRAPHIC_KEY_GENERATOR_VALUE: return CRYPTOGRAPHIC_KEY_GENERATOR;
			case LOCAL_ACCESS_VALUE: return LOCAL_ACCESS;
			case BACKUP_DATA_VALUE: return BACKUP_DATA;
			case SENSOR_UPDATER_VALUE: return SENSOR_UPDATER;
			case CRITICAL_LOG_FILE_STORER_VALUE: return CRITICAL_LOG_FILE_STORER;
			case CRYPTOGRAPHY_PROTECTION_OF_DATA_AT_REST_VALUE: return CRYPTOGRAPHY_PROTECTION_OF_DATA_AT_REST;
			case SYMMETRIC_CRYPTOGRAPHY_VALUE: return SYMMETRIC_CRYPTOGRAPHY;
			case SAFETY_EVENT_MANAMENT_VALUE: return SAFETY_EVENT_MANAMENT;
			case CERTIFICATE_RECORDING_VALUE: return CERTIFICATE_RECORDING;
			case TEMPER_PROOF_IDENTITY_STORAGE_VALUE: return TEMPER_PROOF_IDENTITY_STORAGE;
			case CRITICAL_ELECTRONIC_DEVICE_VALUE: return CRITICAL_ELECTRONIC_DEVICE;
			case VULNERABILITY_DEVICE_VALUE: return VULNERABILITY_DEVICE;
			case UNAUTORIZED_USERS_PREVENTER_VALUE: return UNAUTORIZED_USERS_PREVENTER;
			case MEDICAL_IT_NETWORK_VALUE: return MEDICAL_IT_NETWORK;
			case SECURITY_EVENT_LOG_VALUE: return SECURITY_EVENT_LOG;
			case CRITICAL_ACTIONS_TIMESTAMPED_LOGGER_VALUE: return CRITICAL_ACTIONS_TIMESTAMPED_LOGGER;
			case COMMUNICATION_ENCRYPTED_VALUE: return COMMUNICATION_ENCRYPTED;
			case GEO_LOCATED_REPORTER_VALUE: return GEO_LOCATED_REPORTER;
			case IDENTITY_STORAGE_VALUE: return IDENTITY_STORAGE;
			case SPATIO_TEMPORAL_SYNCHORNIZER_VALUE: return SPATIO_TEMPORAL_SYNCHORNIZER;
			case NON_ESSENTIAL_PII_COLLECTOR_VALUE: return NON_ESSENTIAL_PII_COLLECTOR;
			case NON_NOTIFYING_SINGLE_POINT_OF_FAILURE_VALUE: return NON_NOTIFYING_SINGLE_POINT_OF_FAILURE;
			case PLAIN_TEXT_PII_LOGGER_VALUE: return PLAIN_TEXT_PII_LOGGER;
			case DOCUMENT_INFORMATION_VALUE: return DOCUMENT_INFORMATION;
			case REQUIRED_COMPONENT_VALUE: return REQUIRED_COMPONENT;
			case UNREQUIRED_COMMUNICATION_CAPABILITY_VALUE: return UNREQUIRED_COMMUNICATION_CAPABILITY;
			case PRIVACY_MANAGER_VALUE: return PRIVACY_MANAGER;
			case SECURE_SEMANTIC_INTEROPERABILITY_VALUE: return SECURE_SEMANTIC_INTEROPERABILITY;
			case CONFIGURATION_BACKUP_DATA_VALUE: return CONFIGURATION_BACKUP_DATA;
			case CRITICAL_MECHANICAL_DEVICE_VALUE: return CRITICAL_MECHANICAL_DEVICE;
			case APP_DATA_STORED_VALUE: return APP_DATA_STORED;
			case CRITICAL_EVENTS_TIMESTAMPED_LOGGER_VALUE: return CRITICAL_EVENTS_TIMESTAMPED_LOGGER;
			case DEVICE_AUTHENTICATOR_TO_GATEWAY_VALUE: return DEVICE_AUTHENTICATOR_TO_GATEWAY;
			case TECHNICAL_USER_INTERFACE_VERIFICATION_VALUE: return TECHNICAL_USER_INTERFACE_VERIFICATION;
			case SECURE_ASSET_STORAGE_VALUE: return SECURE_ASSET_STORAGE;
			case SOFTWARE_IN_DEVICE_VALUE: return SOFTWARE_IN_DEVICE;
			case DEVICE_PAIRING_VALUE: return DEVICE_PAIRING;
			case POST_MARKET_SURVEILLANCE_VALUE: return POST_MARKET_SURVEILLANCE;
			case CANDIDATE_SECURITY_CAPABILITY_VALUE: return CANDIDATE_SECURITY_CAPABILITY;
			case ELECTRONIC_COMPONENT_VALUE: return ELECTRONIC_COMPONENT;
			case SECURE_DEVICE_IDENTITY_GENERATOR_VALUE: return SECURE_DEVICE_IDENTITY_GENERATOR;
			case NON_CRITICAL_VALUE: return NON_CRITICAL;
			case SENSITIVE_BACKUP_OF_EXTERNAL_STORAGE_VALUE: return SENSITIVE_BACKUP_OF_EXTERNAL_STORAGE;
			case ACCESS_TO_EXTERNAL_WEB_SITE_VALUE: return ACCESS_TO_EXTERNAL_WEB_SITE;
			case PERSONNAL_DATA_VALUE: return PERSONNAL_DATA;
			case CRYPTOGRAPHY_FOR_SOURCE_VALIDITY_VALUE: return CRYPTOGRAPHY_FOR_SOURCE_VALIDITY;
			case OFF_LABEL_DEVICE_VALUE: return OFF_LABEL_DEVICE;
			case IMPLICIT_DEVICE2_DEVICE_TRUST_VALUE: return IMPLICIT_DEVICE2_DEVICE_TRUST;
			case DATA_PROCESSOR_VALUE: return DATA_PROCESSOR;
			case IDENTITY_RECORDER_VALUE: return IDENTITY_RECORDER;
			case RISK_ANALYSER_VALUE: return RISK_ANALYSER;
			case FAIL_SAFE_MODE_VALUE: return FAIL_SAFE_MODE;
			case SECURITY_CONTROL_VALUE: return SECURITY_CONTROL;
			case INCONSISTENT_DATA_HANDLER_VALUE: return INCONSISTENT_DATA_HANDLER;
			case INCONSISTENT_DEVICE_LOCATION_HANDLER_VALUE: return INCONSISTENT_DEVICE_LOCATION_HANDLER;
			case ENCRYPTED_DATA_STORAGE_VALUE: return ENCRYPTED_DATA_STORAGE;
			case CLOSED_COMMUNICATION_PROTOCOL_VALUE: return CLOSED_COMMUNICATION_PROTOCOL;
			case TAMPERING_PREVENTER_VALUE: return TAMPERING_PREVENTER;
			case NON_TIMELY_UPDATE_DETECTOR_VALUE: return NON_TIMELY_UPDATE_DETECTOR;
			case SECURE_CODE_VALUE: return SECURE_CODE;
			case SECURE_INTEROPERABILITY_VALUE: return SECURE_INTEROPERABILITY;
			case UNIQUE_COMPONENT_LEVEL_GENERATOR_VALUE: return UNIQUE_COMPONENT_LEVEL_GENERATOR;
			case MOST_SECURE_COMMUNICATION_PROTOCOL_VALUE: return MOST_SECURE_COMMUNICATION_PROTOCOL;
			case CRITICAL_DATA_BACKUP_VALUE: return CRITICAL_DATA_BACKUP;
			case CLONE_RESISTANT_ID_VALUE: return CLONE_RESISTANT_ID;
			case MODIFICATION_RESISTANT_ID_VALUE: return MODIFICATION_RESISTANT_ID;
			case MA_CBASED_IDENTIFIER_VALUE: return MA_CBASED_IDENTIFIER;
			case MEDICAL_DEVICE_CONNECTION_VALUE: return MEDICAL_DEVICE_CONNECTION;
			case MALWARE_PROTECTOR_VALUE: return MALWARE_PROTECTOR;
			case CRITICAL_SOFTWARE_COMPONENT_VALUE: return CRITICAL_SOFTWARE_COMPONENT;
			case BACKUP_OPTIMIZER_VALUE: return BACKUP_OPTIMIZER;
			case DATA_AUTHENTIFIER_VALUE: return DATA_AUTHENTIFIER;
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
	private ComponentAnnotationKind(int value, String name, String literal) {
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
	
} //ComponentAnnotationKind
