/**
 */
package IoMTComponentCategories;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Property Annotation Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IoMTComponentCategories.IoMTComponentCategoriesPackage#getPropertyAnnotationKind()
 * @model
 * @generated
 */
public enum PropertyAnnotationKind implements Enumerator, EEnumLiteral {
	/**
	 * The '<em><b>Cryptographic Operation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRYPTOGRAPHIC_OPERATION_VALUE
	 * @generated
	 * @ordered
	 */
	CRYPTOGRAPHIC_OPERATION(0, "cryptographicOperation", "cryptographicOperation"),

	/**
	 * The '<em><b>Strictly Increasing Function</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRICTLY_INCREASING_FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	STRICTLY_INCREASING_FUNCTION(1, "strictlyIncreasingFunction", "strictlyIncreasingFunction"),

	/**
	 * The '<em><b>Post Deployment Information</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_DEPLOYMENT_INFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	POST_DEPLOYMENT_INFORMATION(2, "postDeploymentInformation", "postDeploymentInformation"),

	/**
	 * The '<em><b>Unique ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIQUE_ID_VALUE
	 * @generated
	 * @ordered
	 */
	UNIQUE_ID(3, "uniqueID", "uniqueID"),

	/**
	 * The '<em><b>Identitity256 Long At Least</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTITITY256_LONG_AT_LEAST_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTITITY256_LONG_AT_LEAST(4, "identitity256LongAtLeast", "identitity256LongAtLeast"),

	/**
	 * The '<em><b>Candidate Symetric Key Encryption</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANDIDATE_SYMETRIC_KEY_ENCRYPTION_VALUE
	 * @generated
	 * @ordered
	 */
	CANDIDATE_SYMETRIC_KEY_ENCRYPTION(5, "candidateSymetricKeyEncryption", "candidateSymetricKeyEncryption"),

	/**
	 * The '<em><b>Security Maintenance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_MAINTENANCE_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY_MAINTENANCE(6, "securityMaintenance", "securityMaintenance"),

	/**
	 * The '<em><b>Security Safeguard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_SAFEGUARD_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY_SAFEGUARD(7, "securitySafeguard", "securitySafeguard"),

	/**
	 * The '<em><b>Critical Data Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_DATA_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CRITICAL_DATA_TYPE(8, "criticalDataType", "criticalDataType"),

	/**
	 * The '<em><b>Security Feature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_FEATURE_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY_FEATURE(9, "securityFeature", "securityFeature"),

	/**
	 * The '<em><b>Software Version Number</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_VERSION_NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTWARE_VERSION_NUMBER(10, "softwareVersionNumber", "softwareVersionNumber"),

	/**
	 * The '<em><b>List Authorized Onboarders</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_AUTHORIZED_ONBOARDERS_VALUE
	 * @generated
	 * @ordered
	 */
	LIST_AUTHORIZED_ONBOARDERS(11, "listAuthorizedOnboarders", "listAuthorizedOnboarders"),

	/**
	 * The '<em><b>Test Information</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_INFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	TEST_INFORMATION(12, "testInformation", "testInformation"),

	/**
	 * The '<em><b>Connectivity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTIVITY_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTIVITY(13, "connectivity", "connectivity"),

	/**
	 * The '<em><b>Exchange Between Device And Event Logger</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCHANGE_BETWEEN_DEVICE_AND_EVENT_LOGGER_VALUE
	 * @generated
	 * @ordered
	 */
	EXCHANGE_BETWEEN_DEVICE_AND_EVENT_LOGGER(14, "exchangeBetweenDeviceAndEventLogger", "exchangeBetweenDeviceAndEventLogger"),

	/**
	 * The '<em><b>Non Repudiable Identities</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_REPUDIABLE_IDENTITIES_VALUE
	 * @generated
	 * @ordered
	 */
	NON_REPUDIABLE_IDENTITIES(15, "nonRepudiableIdentities", "nonRepudiableIdentities"),

	/**
	 * The '<em><b>Device Security Baseline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_SECURITY_BASELINE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_SECURITY_BASELINE(16, "deviceSecurityBaseline", "deviceSecurityBaseline"),

	/**
	 * The '<em><b>Unrequired Privilege</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNREQUIRED_PRIVILEGE_VALUE
	 * @generated
	 * @ordered
	 */
	UNREQUIRED_PRIVILEGE(17, "unrequiredPrivilege", "unrequiredPrivilege"),

	/**
	 * The '<em><b>Claim</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLAIM_VALUE
	 * @generated
	 * @ordered
	 */
	CLAIM(18, "claim", "claim"),

	/**
	 * The '<em><b>Decommission Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECOMMISSION_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	DECOMMISSION_DATA(19, "decommissionData", "decommissionData"),

	/**
	 * The '<em><b>Patient Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENT_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENT_DATA(20, "patientData", "patientData"),

	/**
	 * The '<em><b>Data In Transit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_IN_TRANSIT_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_IN_TRANSIT(21, "dataInTransit", "dataInTransit"),

	/**
	 * The '<em><b>Security Configuration Option</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_CONFIGURATION_OPTION_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY_CONFIGURATION_OPTION(22, "securityConfigurationOption", "securityConfigurationOption"),

	/**
	 * The '<em><b>Device Secret</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_SECRET_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_SECRET(23, "deviceSecret", "deviceSecret"),

	/**
	 * The '<em><b>Versioning Unique Identifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSIONING_UNIQUE_IDENTIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	VERSIONING_UNIQUE_IDENTIFIER(24, "versioningUniqueIdentifier", "versioningUniqueIdentifier"),

	/**
	 * The '<em><b>Metadata For Documented Information</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METADATA_FOR_DOCUMENTED_INFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	METADATA_FOR_DOCUMENTED_INFORMATION(25, "metadataForDocumentedInformation", "metadataForDocumentedInformation"),

	/**
	 * The '<em><b>Data Outside Direct Storer Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_OUTSIDE_DIRECT_STORER_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_OUTSIDE_DIRECT_STORER_CONTROL(26, "dataOutsideDirectStorerControl", "dataOutsideDirectStorerControl"),

	/**
	 * The '<em><b>Candidate Certificate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANDIDATE_CERTIFICATE_VALUE
	 * @generated
	 * @ordered
	 */
	CANDIDATE_CERTIFICATE(27, "candidateCertificate", "candidateCertificate"),

	/**
	 * The '<em><b>Device Clinical Backup Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_CLINICAL_BACKUP_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_CLINICAL_BACKUP_DATA(28, "deviceClinicalBackupData", "deviceClinicalBackupData"),

	/**
	 * The '<em><b>Risk Control Measure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RISK_CONTROL_MEASURE_VALUE
	 * @generated
	 * @ordered
	 */
	RISK_CONTROL_MEASURE(29, "riskControlMeasure", "riskControlMeasure"),

	/**
	 * The '<em><b>Private Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVATE_KEY(30, "privateKey", "privateKey"),

	/**
	 * The '<em><b>Security Measure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_MEASURE_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY_MEASURE(31, "securityMeasure", "securityMeasure"),

	/**
	 * The '<em><b>Data In Motion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_IN_MOTION_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_IN_MOTION(32, "dataInMotion", "dataInMotion"),

	/**
	 * The '<em><b>Collected Patient Personnal Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTED_PATIENT_PERSONNAL_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTED_PATIENT_PERSONNAL_DATA(33, "collectedPatientPersonnalData", "collectedPatientPersonnalData"),

	/**
	 * The '<em><b>Key Performance Indicator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_PERFORMANCE_INDICATOR_VALUE
	 * @generated
	 * @ordered
	 */
	KEY_PERFORMANCE_INDICATOR(34, "keyPerformanceIndicator", "keyPerformanceIndicator"),

	/**
	 * The '<em><b>Candidate Security Feature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANDIDATE_SECURITY_FEATURE_VALUE
	 * @generated
	 * @ordered
	 */
	CANDIDATE_SECURITY_FEATURE(35, "candidateSecurityFeature", "candidateSecurityFeature"),

	/**
	 * The '<em><b>Stricly Increasing Function</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRICLY_INCREASING_FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	STRICLY_INCREASING_FUNCTION(36, "striclyIncreasingFunction", "striclyIncreasingFunction"),

	/**
	 * The '<em><b>Device Information Declaration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_INFORMATION_DECLARATION_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_INFORMATION_DECLARATION(37, "deviceInformationDeclaration", "deviceInformationDeclaration"),

	/**
	 * The '<em><b>Backup Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKUP_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	BACKUP_DATA(38, "backupData", "backupData");

	/**
	 * The '<em><b>Cryptographic Operation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRYPTOGRAPHIC_OPERATION
	 * @model name="cryptographicOperation"
	 * @generated
	 * @ordered
	 */
	public static final int CRYPTOGRAPHIC_OPERATION_VALUE = 0;

	/**
	 * The '<em><b>Strictly Increasing Function</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRICTLY_INCREASING_FUNCTION
	 * @model name="strictlyIncreasingFunction"
	 * @generated
	 * @ordered
	 */
	public static final int STRICTLY_INCREASING_FUNCTION_VALUE = 1;

	/**
	 * The '<em><b>Post Deployment Information</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_DEPLOYMENT_INFORMATION
	 * @model name="postDeploymentInformation"
	 * @generated
	 * @ordered
	 */
	public static final int POST_DEPLOYMENT_INFORMATION_VALUE = 2;

	/**
	 * The '<em><b>Unique ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIQUE_ID
	 * @model name="uniqueID"
	 * @generated
	 * @ordered
	 */
	public static final int UNIQUE_ID_VALUE = 3;

	/**
	 * The '<em><b>Identitity256 Long At Least</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTITITY256_LONG_AT_LEAST
	 * @model name="identitity256LongAtLeast"
	 * @generated
	 * @ordered
	 */
	public static final int IDENTITITY256_LONG_AT_LEAST_VALUE = 4;

	/**
	 * The '<em><b>Candidate Symetric Key Encryption</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANDIDATE_SYMETRIC_KEY_ENCRYPTION
	 * @model name="candidateSymetricKeyEncryption"
	 * @generated
	 * @ordered
	 */
	public static final int CANDIDATE_SYMETRIC_KEY_ENCRYPTION_VALUE = 5;

	/**
	 * The '<em><b>Security Maintenance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_MAINTENANCE
	 * @model name="securityMaintenance"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MAINTENANCE_VALUE = 6;

	/**
	 * The '<em><b>Security Safeguard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_SAFEGUARD
	 * @model name="securitySafeguard"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_SAFEGUARD_VALUE = 7;

	/**
	 * The '<em><b>Critical Data Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_DATA_TYPE
	 * @model name="criticalDataType"
	 * @generated
	 * @ordered
	 */
	public static final int CRITICAL_DATA_TYPE_VALUE = 8;

	/**
	 * The '<em><b>Security Feature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_FEATURE
	 * @model name="securityFeature"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_FEATURE_VALUE = 9;

	/**
	 * The '<em><b>Software Version Number</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_VERSION_NUMBER
	 * @model name="softwareVersionNumber"
	 * @generated
	 * @ordered
	 */
	public static final int SOFTWARE_VERSION_NUMBER_VALUE = 10;

	/**
	 * The '<em><b>List Authorized Onboarders</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_AUTHORIZED_ONBOARDERS
	 * @model name="listAuthorizedOnboarders"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_AUTHORIZED_ONBOARDERS_VALUE = 11;

	/**
	 * The '<em><b>Test Information</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_INFORMATION
	 * @model name="testInformation"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_INFORMATION_VALUE = 12;

	/**
	 * The '<em><b>Connectivity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTIVITY
	 * @model name="connectivity"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_VALUE = 13;

	/**
	 * The '<em><b>Exchange Between Device And Event Logger</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCHANGE_BETWEEN_DEVICE_AND_EVENT_LOGGER
	 * @model name="exchangeBetweenDeviceAndEventLogger"
	 * @generated
	 * @ordered
	 */
	public static final int EXCHANGE_BETWEEN_DEVICE_AND_EVENT_LOGGER_VALUE = 14;

	/**
	 * The '<em><b>Non Repudiable Identities</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_REPUDIABLE_IDENTITIES
	 * @model name="nonRepudiableIdentities"
	 * @generated
	 * @ordered
	 */
	public static final int NON_REPUDIABLE_IDENTITIES_VALUE = 15;

	/**
	 * The '<em><b>Device Security Baseline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_SECURITY_BASELINE
	 * @model name="deviceSecurityBaseline"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_SECURITY_BASELINE_VALUE = 16;

	/**
	 * The '<em><b>Unrequired Privilege</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNREQUIRED_PRIVILEGE
	 * @model name="unrequiredPrivilege"
	 * @generated
	 * @ordered
	 */
	public static final int UNREQUIRED_PRIVILEGE_VALUE = 17;

	/**
	 * The '<em><b>Claim</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLAIM
	 * @model name="claim"
	 * @generated
	 * @ordered
	 */
	public static final int CLAIM_VALUE = 18;

	/**
	 * The '<em><b>Decommission Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECOMMISSION_DATA
	 * @model name="decommissionData"
	 * @generated
	 * @ordered
	 */
	public static final int DECOMMISSION_DATA_VALUE = 19;

	/**
	 * The '<em><b>Patient Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENT_DATA
	 * @model name="patientData"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENT_DATA_VALUE = 20;

	/**
	 * The '<em><b>Data In Transit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_IN_TRANSIT
	 * @model name="dataInTransit"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_IN_TRANSIT_VALUE = 21;

	/**
	 * The '<em><b>Security Configuration Option</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_CONFIGURATION_OPTION
	 * @model name="securityConfigurationOption"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_CONFIGURATION_OPTION_VALUE = 22;

	/**
	 * The '<em><b>Device Secret</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_SECRET
	 * @model name="deviceSecret"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_SECRET_VALUE = 23;

	/**
	 * The '<em><b>Versioning Unique Identifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSIONING_UNIQUE_IDENTIFIER
	 * @model name="versioningUniqueIdentifier"
	 * @generated
	 * @ordered
	 */
	public static final int VERSIONING_UNIQUE_IDENTIFIER_VALUE = 24;

	/**
	 * The '<em><b>Metadata For Documented Information</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METADATA_FOR_DOCUMENTED_INFORMATION
	 * @model name="metadataForDocumentedInformation"
	 * @generated
	 * @ordered
	 */
	public static final int METADATA_FOR_DOCUMENTED_INFORMATION_VALUE = 25;

	/**
	 * The '<em><b>Data Outside Direct Storer Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_OUTSIDE_DIRECT_STORER_CONTROL
	 * @model name="dataOutsideDirectStorerControl"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_OUTSIDE_DIRECT_STORER_CONTROL_VALUE = 26;

	/**
	 * The '<em><b>Candidate Certificate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANDIDATE_CERTIFICATE
	 * @model name="candidateCertificate"
	 * @generated
	 * @ordered
	 */
	public static final int CANDIDATE_CERTIFICATE_VALUE = 27;

	/**
	 * The '<em><b>Device Clinical Backup Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_CLINICAL_BACKUP_DATA
	 * @model name="deviceClinicalBackupData"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_CLINICAL_BACKUP_DATA_VALUE = 28;

	/**
	 * The '<em><b>Risk Control Measure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RISK_CONTROL_MEASURE
	 * @model name="riskControlMeasure"
	 * @generated
	 * @ordered
	 */
	public static final int RISK_CONTROL_MEASURE_VALUE = 29;

	/**
	 * The '<em><b>Private Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_KEY
	 * @model name="privateKey"
	 * @generated
	 * @ordered
	 */
	public static final int PRIVATE_KEY_VALUE = 30;

	/**
	 * The '<em><b>Security Measure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_MEASURE
	 * @model name="securityMeasure"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MEASURE_VALUE = 31;

	/**
	 * The '<em><b>Data In Motion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_IN_MOTION
	 * @model name="dataInMotion"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_IN_MOTION_VALUE = 32;

	/**
	 * The '<em><b>Collected Patient Personnal Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTED_PATIENT_PERSONNAL_DATA
	 * @model name="collectedPatientPersonnalData"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTED_PATIENT_PERSONNAL_DATA_VALUE = 33;

	/**
	 * The '<em><b>Key Performance Indicator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_PERFORMANCE_INDICATOR
	 * @model name="keyPerformanceIndicator"
	 * @generated
	 * @ordered
	 */
	public static final int KEY_PERFORMANCE_INDICATOR_VALUE = 34;

	/**
	 * The '<em><b>Candidate Security Feature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANDIDATE_SECURITY_FEATURE
	 * @model name="candidateSecurityFeature"
	 * @generated
	 * @ordered
	 */
	public static final int CANDIDATE_SECURITY_FEATURE_VALUE = 35;

	/**
	 * The '<em><b>Stricly Increasing Function</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRICLY_INCREASING_FUNCTION
	 * @model name="striclyIncreasingFunction"
	 * @generated
	 * @ordered
	 */
	public static final int STRICLY_INCREASING_FUNCTION_VALUE = 36;

	/**
	 * The '<em><b>Device Information Declaration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_INFORMATION_DECLARATION
	 * @model name="deviceInformationDeclaration"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_INFORMATION_DECLARATION_VALUE = 37;

	/**
	 * The '<em><b>Backup Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKUP_DATA
	 * @model name="backupData"
	 * @generated
	 * @ordered
	 */
	public static final int BACKUP_DATA_VALUE = 38;

	/**
	 * An array of all the '<em><b>Property Annotation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PropertyAnnotationKind[] VALUES_ARRAY =
		new PropertyAnnotationKind[] {
			CRYPTOGRAPHIC_OPERATION,
			STRICTLY_INCREASING_FUNCTION,
			POST_DEPLOYMENT_INFORMATION,
			UNIQUE_ID,
			IDENTITITY256_LONG_AT_LEAST,
			CANDIDATE_SYMETRIC_KEY_ENCRYPTION,
			SECURITY_MAINTENANCE,
			SECURITY_SAFEGUARD,
			CRITICAL_DATA_TYPE,
			SECURITY_FEATURE,
			SOFTWARE_VERSION_NUMBER,
			LIST_AUTHORIZED_ONBOARDERS,
			TEST_INFORMATION,
			CONNECTIVITY,
			EXCHANGE_BETWEEN_DEVICE_AND_EVENT_LOGGER,
			NON_REPUDIABLE_IDENTITIES,
			DEVICE_SECURITY_BASELINE,
			UNREQUIRED_PRIVILEGE,
			CLAIM,
			DECOMMISSION_DATA,
			PATIENT_DATA,
			DATA_IN_TRANSIT,
			SECURITY_CONFIGURATION_OPTION,
			DEVICE_SECRET,
			VERSIONING_UNIQUE_IDENTIFIER,
			METADATA_FOR_DOCUMENTED_INFORMATION,
			DATA_OUTSIDE_DIRECT_STORER_CONTROL,
			CANDIDATE_CERTIFICATE,
			DEVICE_CLINICAL_BACKUP_DATA,
			RISK_CONTROL_MEASURE,
			PRIVATE_KEY,
			SECURITY_MEASURE,
			DATA_IN_MOTION,
			COLLECTED_PATIENT_PERSONNAL_DATA,
			KEY_PERFORMANCE_INDICATOR,
			CANDIDATE_SECURITY_FEATURE,
			STRICLY_INCREASING_FUNCTION,
			DEVICE_INFORMATION_DECLARATION,
			BACKUP_DATA,
		};

	/**
	 * A public read-only list of all the '<em><b>Property Annotation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PropertyAnnotationKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Property Annotation Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyAnnotationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyAnnotationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property Annotation Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyAnnotationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyAnnotationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property Annotation Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyAnnotationKind get(int value) {
		switch (value) {
			case CRYPTOGRAPHIC_OPERATION_VALUE: return CRYPTOGRAPHIC_OPERATION;
			case STRICTLY_INCREASING_FUNCTION_VALUE: return STRICTLY_INCREASING_FUNCTION;
			case POST_DEPLOYMENT_INFORMATION_VALUE: return POST_DEPLOYMENT_INFORMATION;
			case UNIQUE_ID_VALUE: return UNIQUE_ID;
			case IDENTITITY256_LONG_AT_LEAST_VALUE: return IDENTITITY256_LONG_AT_LEAST;
			case CANDIDATE_SYMETRIC_KEY_ENCRYPTION_VALUE: return CANDIDATE_SYMETRIC_KEY_ENCRYPTION;
			case SECURITY_MAINTENANCE_VALUE: return SECURITY_MAINTENANCE;
			case SECURITY_SAFEGUARD_VALUE: return SECURITY_SAFEGUARD;
			case CRITICAL_DATA_TYPE_VALUE: return CRITICAL_DATA_TYPE;
			case SECURITY_FEATURE_VALUE: return SECURITY_FEATURE;
			case SOFTWARE_VERSION_NUMBER_VALUE: return SOFTWARE_VERSION_NUMBER;
			case LIST_AUTHORIZED_ONBOARDERS_VALUE: return LIST_AUTHORIZED_ONBOARDERS;
			case TEST_INFORMATION_VALUE: return TEST_INFORMATION;
			case CONNECTIVITY_VALUE: return CONNECTIVITY;
			case EXCHANGE_BETWEEN_DEVICE_AND_EVENT_LOGGER_VALUE: return EXCHANGE_BETWEEN_DEVICE_AND_EVENT_LOGGER;
			case NON_REPUDIABLE_IDENTITIES_VALUE: return NON_REPUDIABLE_IDENTITIES;
			case DEVICE_SECURITY_BASELINE_VALUE: return DEVICE_SECURITY_BASELINE;
			case UNREQUIRED_PRIVILEGE_VALUE: return UNREQUIRED_PRIVILEGE;
			case CLAIM_VALUE: return CLAIM;
			case DECOMMISSION_DATA_VALUE: return DECOMMISSION_DATA;
			case PATIENT_DATA_VALUE: return PATIENT_DATA;
			case DATA_IN_TRANSIT_VALUE: return DATA_IN_TRANSIT;
			case SECURITY_CONFIGURATION_OPTION_VALUE: return SECURITY_CONFIGURATION_OPTION;
			case DEVICE_SECRET_VALUE: return DEVICE_SECRET;
			case VERSIONING_UNIQUE_IDENTIFIER_VALUE: return VERSIONING_UNIQUE_IDENTIFIER;
			case METADATA_FOR_DOCUMENTED_INFORMATION_VALUE: return METADATA_FOR_DOCUMENTED_INFORMATION;
			case DATA_OUTSIDE_DIRECT_STORER_CONTROL_VALUE: return DATA_OUTSIDE_DIRECT_STORER_CONTROL;
			case CANDIDATE_CERTIFICATE_VALUE: return CANDIDATE_CERTIFICATE;
			case DEVICE_CLINICAL_BACKUP_DATA_VALUE: return DEVICE_CLINICAL_BACKUP_DATA;
			case RISK_CONTROL_MEASURE_VALUE: return RISK_CONTROL_MEASURE;
			case PRIVATE_KEY_VALUE: return PRIVATE_KEY;
			case SECURITY_MEASURE_VALUE: return SECURITY_MEASURE;
			case DATA_IN_MOTION_VALUE: return DATA_IN_MOTION;
			case COLLECTED_PATIENT_PERSONNAL_DATA_VALUE: return COLLECTED_PATIENT_PERSONNAL_DATA;
			case KEY_PERFORMANCE_INDICATOR_VALUE: return KEY_PERFORMANCE_INDICATOR;
			case CANDIDATE_SECURITY_FEATURE_VALUE: return CANDIDATE_SECURITY_FEATURE;
			case STRICLY_INCREASING_FUNCTION_VALUE: return STRICLY_INCREASING_FUNCTION;
			case DEVICE_INFORMATION_DECLARATION_VALUE: return DEVICE_INFORMATION_DECLARATION;
			case BACKUP_DATA_VALUE: return BACKUP_DATA;
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
	private PropertyAnnotationKind(int value, String name, String literal) {
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

	@Override
	public void setName(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EList<EAnnotation> getEAnnotations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EAnnotation getEAnnotation(String source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EClass eClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resource eResource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EObject eContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EReference eContainmentFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<EObject> eContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeIterator<EObject> eAllContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eIsProxy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<EObject> eCrossReferences() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature feature, boolean resolve) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eSet(EStructuralFeature feature, Object newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean eIsSet(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eUnset(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Adapter> eAdapters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eDeliver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eNotify(Notification notification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setValue(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Enumerator getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInstance(Enumerator value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLiteral(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EEnum getEEnum() {
		// TODO Auto-generated method stub
		return null;
	}
	
} //PropertyAnnotationKind
