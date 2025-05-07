/**
 */
package tvra;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Misbehaviour Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tvra.TvraPackage#getMisbehaviourKind()
 * @model
 * @generated
 */
public enum MisbehaviourKind implements Enumerator {
	/**
	 * The '<em><b>MS Loss Of Accessibility</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_ACCESSIBILITY_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_ACCESSIBILITY(0, "MSLossOfAccessibility", "MSLossOfAccessibility"),

	/**
	 * The '<em><b>MS Loss Of Anon User TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_ANON_USER_TW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_ANON_USER_TW(1, "MSLossOfAnonUserTW", "MSLossOfAnonUserTW"), /**
	 * The '<em><b>MS Loss Of Astuteness</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_ASTUTENESS_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_ASTUTENESS(2, "MSLossOfAstuteness", "MSLossOfAstuteness"), /**
	 * The '<em><b>MS Loss Of Authenticity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_AUTHENTICITY_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_AUTHENTICITY(3, "MSLossOfAuthenticity", "MSLossOfAuthenticity"), /**
	 * The '<em><b>MS Loss Of Integrity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_INTEGRITY_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_INTEGRITY(4, "MSLossOfIntegrity", "MSLossOfIntegrity"),

	/**
	 * The '<em><b>MS Loss Of Availability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_AVAILABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_AVAILABILITY(5, "MSLossOfAvailability", "MSLossOfAvailability"), /**
	 * The '<em><b>MS Loss Of Benevolence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_BENEVOLENCE_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_BENEVOLENCE(6, "MSLossOfBenevolence", "MSLossOfBenevolence"), /**
	 * The '<em><b>MS Loss Of Capacity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_CAPACITY_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_CAPACITY(7, "MSLossOfCapacity", "MSLossOfCapacity"), /**
	 * The '<em><b>MS Loss Of Client TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_CLIENT_TW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_CLIENT_TW(8, "MSLossOfClientTW", "MSLossOfClientTW"), /**
	 * The '<em><b>MS Loss Of Competence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_COMPETENCE_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_COMPETENCE(9, "MSLossOfCompetence", "MSLossOfCompetence"), /**
	 * The '<em><b>MS Loss Of Confidentiality</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_CONFIDENTIALITY_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_CONFIDENTIALITY(10, "MSLossOfConfidentiality", "MSLossOfConfidentiality"), /**
	 * The '<em><b>MS Loss Of Connectivity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_CONNECTIVITY_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_CONNECTIVITY(11, "MSLossOfConnectivity", "MSLossOfConnectivity"), /**
	 * The '<em><b>MS Loss Of Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_CONTROL(12, "MSLossOfControl", "MSLossOfControl"), /**
	 * The '<em><b>MS Loss Of Default TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_DEFAULT_TW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_DEFAULT_TW(13, "MSLossOfDefaultTW", "MSLossOfDefaultTW"), /**
	 * The '<em><b>MS Loss Of Exploit TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXPLOIT_TW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_EXPLOIT_TW(14, "MSLossOfExploitTW", "MSLossOfExploitTW"), /**
	 * The '<em><b>MS Loss Of Extrinsic ATW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_ATW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_EXTRINSIC_ATW(15, "MSLossOfExtrinsicATW", "MSLossOfExtrinsicATW"), /**
	 * The '<em><b>MS Loss Of Extrinsic AUTW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_AUTW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_EXTRINSIC_AUTW(16, "MSLossOfExtrinsicAUTW", "MSLossOfExtrinsicAUTW"), /**
	 * The '<em><b>MS Loss Of Extrinsic CTW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_CTW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_EXTRINSIC_CTW(17, "MSLossOfExtrinsicCTW", "MSLossOfExtrinsicCTW"), /**
	 * The '<em><b>MS Loss Of Extrinsic ITW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_ITW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_EXTRINSIC_ITW(18, "MSLossOfExtrinsicITW", "MSLossOfExtrinsicITW"), /**
	 * The '<em><b>MS Loss Of Extrinsic MTW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_MTW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_EXTRINSIC_MTW(19, "MSLossOfExtrinsicMTW", "MSLossOfExtrinsicMTW"), /**
	 * The '<em><b>MS Loss Of Extrinsic QITW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_QITW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_EXTRINSIC_QITW(20, "MSLossOfExtrinsicQITW", "MSLossOfExtrinsicQITW"), /**
	 * The '<em><b>MS Loss Of Extrinsic UTW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_UTW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_EXTRINSIC_UTW(21, "MSLossOfExtrinsicUTW", "MSLossOfExtrinsicUTW"), /**
	 * The '<em><b>MS Loss Of Extrinsic VATW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_VATW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_EXTRINSIC_VATW(22, "MSLossOfExtrinsicVATW", "MSLossOfExtrinsicVATW"), /**
	 * The '<em><b>MS Loss Of Extrinsic VLTW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_VLTW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_EXTRINSIC_VLTW(23, "MSLossOfExtrinsicVLTW", "MSLossOfExtrinsicVLTW"), /**
	 * The '<em><b>MS Loss Of Extrinsic VNTW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_VNTW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_EXTRINSIC_VNTW(24, "MSLossOfExtrinsicVNTW", "MSLossOfExtrinsicVNTW"), /**
	 * The '<em><b>MS Loss Of Extrinsic WTW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_WTW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_EXTRINSIC_WTW(25, "MSLossOfExtrinsicWTW", "MSLossOfExtrinsicWTW"), /**
	 * The '<em><b>MS Loss Of Extrinsic XSTW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_XSTW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_EXTRINSIC_XSTW(26, "MSLossOfExtrinsicXSTW", "MSLossOfExtrinsicXSTW"), /**
	 * The '<em><b>MS Loss Of Extrinsic TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_TW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_EXTRINSIC_TW(27, "MSLossOfExtrinsicTW", "MSLossOfExtrinsicTW"), /**
	 * The '<em><b>MS Loss Of Intrinsic TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_INTRINSIC_TW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_INTRINSIC_TW(28, "MSLossOfIntrinsicTW", "MSLossOfIntrinsicTW"), /**
	 * The '<em><b>MS Loss Of Network Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_NETWORK_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_NETWORK_CONTROL(29, "MSLossOfNetworkControl", "MSLossOfNetworkControl"), /**
	 * The '<em><b>MS Loss Of Network User TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_NETWORK_USER_TW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_NETWORK_USER_TW(30, "MSLossOfNetworkUserTW", "MSLossOfNetworkUserTW"), /**
	 * The '<em><b>MS Loss Of Proxy User TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_PROXY_USER_TW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_PROXY_USER_TW(31, "MSLossOfProxyUserTW", "MSLossOfProxyUserTW"), /**
	 * The '<em><b>MS Loss Of Reliability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_RELIABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_RELIABILITY(32, "MSLossOfReliability", "MSLossOfReliability"), /**
	 * The '<em><b>MS Loss Of Resource TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_RESOURCE_TW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_RESOURCE_TW(33, "MSLossOfResourceTW", "MSLossOfResourceTW"), /**
	 * The '<em><b>MS Loss Of Service TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_SERVICE_TW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_SERVICE_TW(34, "MSLossOfServiceTW", "MSLossOfServiceTW"), /**
	 * The '<em><b>MS Loss Of Timeliness</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_TIMELINESS_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_TIMELINESS(35, "MSLossOfTimeliness", "MSLossOfTimeliness"), /**
	 * The '<em><b>MS Loss Of Trust</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_TRUST_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_TRUST(36, "MSLossOfTrust", "MSLossOfTrust"), /**
	 * The '<em><b>MS Loss Of User TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_USER_TW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOSS_OF_USER_TW(37, "MSLossOfUserTW", "MSLossOfUserTW"), /**
	 * The '<em><b>MS Bandwidth Unmanaged</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_BANDWIDTH_UNMANAGED_VALUE
	 * @generated
	 * @ordered
	 */
	MS_BANDWIDTH_UNMANAGED(38, "MSBandwidthUnmanaged", "MSBandwidthUnmanaged"), /**
	 * The '<em><b>MS Client Impersonation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_CLIENT_IMPERSONATION_VALUE
	 * @generated
	 * @ordered
	 */
	MS_CLIENT_IMPERSONATION(39, "MSClientImpersonation", "MSClientImpersonation"), /**
	 * The '<em><b>MS Comms Snoopable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_COMMS_SNOOPABLE_VALUE
	 * @generated
	 * @ordered
	 */
	MS_COMMS_SNOOPABLE(40, "MSCommsSnoopable", "MSCommsSnoopable"), /**
	 * The '<em><b>MS Connections Allowed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_CONNECTIONS_ALLOWED_VALUE
	 * @generated
	 * @ordered
	 */
	MS_CONNECTIONS_ALLOWED(41, "MSConnectionsAllowed", "MSConnectionsAllowed"), /**
	 * The '<em><b>MS Deputy Confusion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_DEPUTY_CONFUSION_VALUE
	 * @generated
	 * @ordered
	 */
	MS_DEPUTY_CONFUSION(42, "MSDeputyConfusion", "MSDeputyConfusion"), /**
	 * The '<em><b>MS In Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_IN_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	MS_IN_SERVICE(43, "MSInService", "MSInService"), /**
	 * The '<em><b>MS Local Loss Of Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOCAL_LOSS_OF_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOCAL_LOSS_OF_CONTROL(44, "MSLocalLossOfControl", "MSLocalLossOfControl"), /**
	 * The '<em><b>MS Local Loss Of User TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOCAL_LOSS_OF_USER_TW_VALUE
	 * @generated
	 * @ordered
	 */
	MS_LOCAL_LOSS_OF_USER_TW(45, "MSLocalLossOfUserTW", "MSLocalLossOfUserTW"), /**
	 * The '<em><b>MS Malware Infection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_MALWARE_INFECTION_VALUE
	 * @generated
	 * @ordered
	 */
	MS_MALWARE_INFECTION(46, "MSMalwareInfection", "MSMalwareInfection"), /**
	 * The '<em><b>MS Network Spoofing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_NETWORK_SPOOFING_VALUE
	 * @generated
	 * @ordered
	 */
	MS_NETWORK_SPOOFING(47, "MSNetworkSpoofing", "MSNetworkSpoofing"), /**
	 * The '<em><b>MS Not Decrypted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_NOT_DECRYPTED_VALUE
	 * @generated
	 * @ordered
	 */
	MS_NOT_DECRYPTED(48, "MSNotDecrypted", "MSNotDecrypted"), /**
	 * The '<em><b>MS Not Encrypted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_NOT_ENCRYPTED_VALUE
	 * @generated
	 * @ordered
	 */
	MS_NOT_ENCRYPTED(49, "MSNotEncrypted", "MSNotEncrypted"), /**
	 * The '<em><b>MS Overloaded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_OVERLOADED_VALUE
	 * @generated
	 * @ordered
	 */
	MS_OVERLOADED(50, "MSOverloaded", "MSOverloaded"), /**
	 * The '<em><b>MS Physical Breach</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_PHYSICAL_BREACH_VALUE
	 * @generated
	 * @ordered
	 */
	MS_PHYSICAL_BREACH(51, "MSPhysicalBreach", "MSPhysicalBreach"), /**
	 * The '<em><b>MS Physical Intrusion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_PHYSICAL_INTRUSION_VALUE
	 * @generated
	 * @ordered
	 */
	MS_PHYSICAL_INTRUSION(52, "MSPhysicalIntrusion", "MSPhysicalIntrusion"), /**
	 * The '<em><b>MS Physical Shutdown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_PHYSICAL_SHUTDOWN_VALUE
	 * @generated
	 * @ordered
	 */
	MS_PHYSICAL_SHUTDOWN(53, "MSPhysicalShutdown", "MSPhysicalShutdown"), /**
	 * The '<em><b>MS Service Channels Allowed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_SERVICE_CHANNELS_ALLOWED_VALUE
	 * @generated
	 * @ordered
	 */
	MS_SERVICE_CHANNELS_ALLOWED(54, "MSServiceChannelsAllowed", "MSServiceChannelsAllowed"), /**
	 * The '<em><b>MS Service Impersonation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_SERVICE_IMPERSONATION_VALUE
	 * @generated
	 * @ordered
	 */
	MS_SERVICE_IMPERSONATION(55, "MSServiceImpersonation", "MSServiceImpersonation"), /**
	 * The '<em><b>MS Theft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_THEFT_VALUE
	 * @generated
	 * @ordered
	 */
	MS_THEFT(56, "MSTheft", "MSTheft"), /**
	 * The '<em><b>MS Theft Of Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_THEFT_OF_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	MS_THEFT_OF_CONTROL(57, "MSTheftOfControl", "MSTheftOfControl"), /**
	 * The '<em><b>MS Total Load</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_TOTAL_LOAD_VALUE
	 * @generated
	 * @ordered
	 */
	MS_TOTAL_LOAD(58, "MSTotalLoad", "MSTotalLoad"), /**
	 * The '<em><b>MS Trojan Insertion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_TROJAN_INSERTION_VALUE
	 * @generated
	 * @ordered
	 */
	MS_TROJAN_INSERTION(59, "MSTrojanInsertion", "MSTrojanInsertion"), /**
	 * The '<em><b>MS Vulnerability Discovered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_VULNERABILITY_DISCOVERED_VALUE
	 * @generated
	 * @ordered
	 */
	MS_VULNERABILITY_DISCOVERED(60, "MSVulnerabilityDiscovered", "MSVulnerabilityDiscovered");

	/**
	 * The '<em><b>MS Loss Of Accessibility</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_ACCESSIBILITY
	 * @model name="MSLossOfAccessibility"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfAccessibility'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_ACCESSIBILITY_VALUE = 0;

	/**
	 * The '<em><b>MS Loss Of Anon User TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_ANON_USER_TW
	 * @model name="MSLossOfAnonUserTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfAnonUserTW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_ANON_USER_TW_VALUE = 1;

	/**
	 * The '<em><b>MS Loss Of Astuteness</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_ASTUTENESS
	 * @model name="MSLossOfAstuteness"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfAstuteness'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_ASTUTENESS_VALUE = 2;

	/**
	 * The '<em><b>MS Loss Of Authenticity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_AUTHENTICITY
	 * @model name="MSLossOfAuthenticity"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfAuthenticity'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_AUTHENTICITY_VALUE = 3;

	/**
	 * The '<em><b>MS Loss Of Integrity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_INTEGRITY
	 * @model name="MSLossOfIntegrity"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfIntegrity'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_INTEGRITY_VALUE = 4;

	/**
	 * The '<em><b>MS Loss Of Availability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_AVAILABILITY
	 * @model name="MSLossOfAvailability"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfAvailability'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_AVAILABILITY_VALUE = 5;

	/**
	 * The '<em><b>MS Loss Of Benevolence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_BENEVOLENCE
	 * @model name="MSLossOfBenevolence"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfBenevolence'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_BENEVOLENCE_VALUE = 6;

	/**
	 * The '<em><b>MS Loss Of Capacity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_CAPACITY
	 * @model name="MSLossOfCapacity"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfCapacity'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_CAPACITY_VALUE = 7;

	/**
	 * The '<em><b>MS Loss Of Client TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_CLIENT_TW
	 * @model name="MSLossOfClientTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfClientTW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_CLIENT_TW_VALUE = 8;

	/**
	 * The '<em><b>MS Loss Of Competence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_COMPETENCE
	 * @model name="MSLossOfCompetence"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfCompetence'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_COMPETENCE_VALUE = 9;

	/**
	 * The '<em><b>MS Loss Of Confidentiality</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_CONFIDENTIALITY
	 * @model name="MSLossOfConfidentiality"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfConfidentiality'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_CONFIDENTIALITY_VALUE = 10;

	/**
	 * The '<em><b>MS Loss Of Connectivity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_CONNECTIVITY
	 * @model name="MSLossOfConnectivity"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfConnectivity'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_CONNECTIVITY_VALUE = 11;

	/**
	 * The '<em><b>MS Loss Of Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_CONTROL
	 * @model name="MSLossOfControl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfControl'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_CONTROL_VALUE = 12;

	/**
	 * The '<em><b>MS Loss Of Default TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_DEFAULT_TW
	 * @model name="MSLossOfDefaultTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfDefaultTW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_DEFAULT_TW_VALUE = 13;

	/**
	 * The '<em><b>MS Loss Of Exploit TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXPLOIT_TW
	 * @model name="MSLossOfExploitTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfExploitTW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_EXPLOIT_TW_VALUE = 14;

	/**
	 * The '<em><b>MS Loss Of Extrinsic ATW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_ATW
	 * @model name="MSLossOfExtrinsicATW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfExtrinsic-A-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_EXTRINSIC_ATW_VALUE = 15;

	/**
	 * The '<em><b>MS Loss Of Extrinsic AUTW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_AUTW
	 * @model name="MSLossOfExtrinsicAUTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfExtrinsic-AU-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_EXTRINSIC_AUTW_VALUE = 16;

	/**
	 * The '<em><b>MS Loss Of Extrinsic CTW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_CTW
	 * @model name="MSLossOfExtrinsicCTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfExtrinsic-C-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_EXTRINSIC_CTW_VALUE = 17;

	/**
	 * The '<em><b>MS Loss Of Extrinsic ITW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_ITW
	 * @model name="MSLossOfExtrinsicITW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfExtrinsic-I-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_EXTRINSIC_ITW_VALUE = 18;

	/**
	 * The '<em><b>MS Loss Of Extrinsic MTW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_MTW
	 * @model name="MSLossOfExtrinsicMTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfExtrinsic-M-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_EXTRINSIC_MTW_VALUE = 19;

	/**
	 * The '<em><b>MS Loss Of Extrinsic QITW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_QITW
	 * @model name="MSLossOfExtrinsicQITW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfExtrinsic-QI-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_EXTRINSIC_QITW_VALUE = 20;

	/**
	 * The '<em><b>MS Loss Of Extrinsic UTW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_UTW
	 * @model name="MSLossOfExtrinsicUTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfExtrinsic-U-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_EXTRINSIC_UTW_VALUE = 21;

	/**
	 * The '<em><b>MS Loss Of Extrinsic VATW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_VATW
	 * @model name="MSLossOfExtrinsicVATW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfExtrinsic-VA-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_EXTRINSIC_VATW_VALUE = 22;

	/**
	 * The '<em><b>MS Loss Of Extrinsic VLTW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_VLTW
	 * @model name="MSLossOfExtrinsicVLTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfExtrinsic-VL-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_EXTRINSIC_VLTW_VALUE = 23;

	/**
	 * The '<em><b>MS Loss Of Extrinsic VNTW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_VNTW
	 * @model name="MSLossOfExtrinsicVNTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfExtrinsic-VN-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_EXTRINSIC_VNTW_VALUE = 24;

	/**
	 * The '<em><b>MS Loss Of Extrinsic WTW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_WTW
	 * @model name="MSLossOfExtrinsicWTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfExtrinsic-W-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_EXTRINSIC_WTW_VALUE = 25;

	/**
	 * The '<em><b>MS Loss Of Extrinsic XSTW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_XSTW
	 * @model name="MSLossOfExtrinsicXSTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfExtrinsic-XS-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_EXTRINSIC_XSTW_VALUE = 26;

	/**
	 * The '<em><b>MS Loss Of Extrinsic TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_EXTRINSIC_TW
	 * @model name="MSLossOfExtrinsicTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfExtrinsicTW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_EXTRINSIC_TW_VALUE = 27;

	/**
	 * The '<em><b>MS Loss Of Intrinsic TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_INTRINSIC_TW
	 * @model name="MSLossOfIntrinsicTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfIntrinsicTW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_INTRINSIC_TW_VALUE = 28;

	/**
	 * The '<em><b>MS Loss Of Network Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_NETWORK_CONTROL
	 * @model name="MSLossOfNetworkControl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfNetworkControl'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_NETWORK_CONTROL_VALUE = 29;

	/**
	 * The '<em><b>MS Loss Of Network User TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_NETWORK_USER_TW
	 * @model name="MSLossOfNetworkUserTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfNetworkUserTW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_NETWORK_USER_TW_VALUE = 30;

	/**
	 * The '<em><b>MS Loss Of Proxy User TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_PROXY_USER_TW
	 * @model name="MSLossOfProxyUserTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfProxyUserTW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_PROXY_USER_TW_VALUE = 31;

	/**
	 * The '<em><b>MS Loss Of Reliability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_RELIABILITY
	 * @model name="MSLossOfReliability"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfReliability'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_RELIABILITY_VALUE = 32;

	/**
	 * The '<em><b>MS Loss Of Resource TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_RESOURCE_TW
	 * @model name="MSLossOfResourceTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfResourceTW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_RESOURCE_TW_VALUE = 33;

	/**
	 * The '<em><b>MS Loss Of Service TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_SERVICE_TW
	 * @model name="MSLossOfServiceTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfServiceTW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_SERVICE_TW_VALUE = 34;

	/**
	 * The '<em><b>MS Loss Of Timeliness</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_TIMELINESS
	 * @model name="MSLossOfTimeliness"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfTimeliness'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_TIMELINESS_VALUE = 35;

	/**
	 * The '<em><b>MS Loss Of Trust</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_TRUST
	 * @model name="MSLossOfTrust"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfTrust'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_TRUST_VALUE = 36;

	/**
	 * The '<em><b>MS Loss Of User TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOSS_OF_USER_TW
	 * @model name="MSLossOfUserTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LossOfUserTW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOSS_OF_USER_TW_VALUE = 37;

	/**
	 * The '<em><b>MS Bandwidth Unmanaged</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_BANDWIDTH_UNMANAGED
	 * @model name="MSBandwidthUnmanaged"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-BandwidthUnmanaged'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_BANDWIDTH_UNMANAGED_VALUE = 38;

	/**
	 * The '<em><b>MS Client Impersonation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_CLIENT_IMPERSONATION
	 * @model name="MSClientImpersonation"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-ClientImpersonation'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_CLIENT_IMPERSONATION_VALUE = 39;

	/**
	 * The '<em><b>MS Comms Snoopable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_COMMS_SNOOPABLE
	 * @model name="MSCommsSnoopable"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-CommsSnoopable'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_COMMS_SNOOPABLE_VALUE = 40;

	/**
	 * The '<em><b>MS Connections Allowed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_CONNECTIONS_ALLOWED
	 * @model name="MSConnectionsAllowed"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-ConnectionsAllowed'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_CONNECTIONS_ALLOWED_VALUE = 41;

	/**
	 * The '<em><b>MS Deputy Confusion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_DEPUTY_CONFUSION
	 * @model name="MSDeputyConfusion"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-DeputyConfusion'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_DEPUTY_CONFUSION_VALUE = 42;

	/**
	 * The '<em><b>MS In Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_IN_SERVICE
	 * @model name="MSInService"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-InService'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_IN_SERVICE_VALUE = 43;

	/**
	 * The '<em><b>MS Local Loss Of Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOCAL_LOSS_OF_CONTROL
	 * @model name="MSLocalLossOfControl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LocalLossOfControl'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOCAL_LOSS_OF_CONTROL_VALUE = 44;

	/**
	 * The '<em><b>MS Local Loss Of User TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_LOCAL_LOSS_OF_USER_TW
	 * @model name="MSLocalLossOfUserTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-LocalLossOfUserTW'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_LOCAL_LOSS_OF_USER_TW_VALUE = 45;

	/**
	 * The '<em><b>MS Malware Infection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_MALWARE_INFECTION
	 * @model name="MSMalwareInfection"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-MalwareInfection'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_MALWARE_INFECTION_VALUE = 46;

	/**
	 * The '<em><b>MS Network Spoofing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_NETWORK_SPOOFING
	 * @model name="MSNetworkSpoofing"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-NetworkSpoofing'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_NETWORK_SPOOFING_VALUE = 47;

	/**
	 * The '<em><b>MS Not Decrypted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_NOT_DECRYPTED
	 * @model name="MSNotDecrypted"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-NotDecrypted'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_NOT_DECRYPTED_VALUE = 48;

	/**
	 * The '<em><b>MS Not Encrypted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_NOT_ENCRYPTED
	 * @model name="MSNotEncrypted"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-NotEncrypted'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_NOT_ENCRYPTED_VALUE = 49;

	/**
	 * The '<em><b>MS Overloaded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_OVERLOADED
	 * @model name="MSOverloaded"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-Overloaded'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_OVERLOADED_VALUE = 50;

	/**
	 * The '<em><b>MS Physical Breach</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_PHYSICAL_BREACH
	 * @model name="MSPhysicalBreach"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-PhysicalBreach'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_PHYSICAL_BREACH_VALUE = 51;

	/**
	 * The '<em><b>MS Physical Intrusion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_PHYSICAL_INTRUSION
	 * @model name="MSPhysicalIntrusion"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-PhysicalIntrusion'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_PHYSICAL_INTRUSION_VALUE = 52;

	/**
	 * The '<em><b>MS Physical Shutdown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_PHYSICAL_SHUTDOWN
	 * @model name="MSPhysicalShutdown"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-PhysicalShutdown'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_PHYSICAL_SHUTDOWN_VALUE = 53;

	/**
	 * The '<em><b>MS Service Channels Allowed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_SERVICE_CHANNELS_ALLOWED
	 * @model name="MSServiceChannelsAllowed"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-ServiceChannelsAllowed'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_SERVICE_CHANNELS_ALLOWED_VALUE = 54;

	/**
	 * The '<em><b>MS Service Impersonation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_SERVICE_IMPERSONATION
	 * @model name="MSServiceImpersonation"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-ServiceImpersonation'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_SERVICE_IMPERSONATION_VALUE = 55;

	/**
	 * The '<em><b>MS Theft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_THEFT
	 * @model name="MSTheft"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-Theft'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_THEFT_VALUE = 56;

	/**
	 * The '<em><b>MS Theft Of Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_THEFT_OF_CONTROL
	 * @model name="MSTheftOfControl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-TheftOfControl'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_THEFT_OF_CONTROL_VALUE = 57;

	/**
	 * The '<em><b>MS Total Load</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_TOTAL_LOAD
	 * @model name="MSTotalLoad"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-TotalLoad'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_TOTAL_LOAD_VALUE = 58;

	/**
	 * The '<em><b>MS Trojan Insertion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_TROJAN_INSERTION
	 * @model name="MSTrojanInsertion"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-TrojanInsertion'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_TROJAN_INSERTION_VALUE = 59;

	/**
	 * The '<em><b>MS Vulnerability Discovered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_VULNERABILITY_DISCOVERED
	 * @model name="MSVulnerabilityDiscovered"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MS-VulnerabilityDiscovered'"
	 * @generated
	 * @ordered
	 */
	public static final int MS_VULNERABILITY_DISCOVERED_VALUE = 60;

	/**
	 * An array of all the '<em><b>Misbehaviour Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MisbehaviourKind[] VALUES_ARRAY =
		new MisbehaviourKind[] {
			MS_LOSS_OF_ACCESSIBILITY,
			MS_LOSS_OF_ANON_USER_TW,
			MS_LOSS_OF_ASTUTENESS,
			MS_LOSS_OF_AUTHENTICITY,
			MS_LOSS_OF_INTEGRITY,
			MS_LOSS_OF_AVAILABILITY,
			MS_LOSS_OF_BENEVOLENCE,
			MS_LOSS_OF_CAPACITY,
			MS_LOSS_OF_CLIENT_TW,
			MS_LOSS_OF_COMPETENCE,
			MS_LOSS_OF_CONFIDENTIALITY,
			MS_LOSS_OF_CONNECTIVITY,
			MS_LOSS_OF_CONTROL,
			MS_LOSS_OF_DEFAULT_TW,
			MS_LOSS_OF_EXPLOIT_TW,
			MS_LOSS_OF_EXTRINSIC_ATW,
			MS_LOSS_OF_EXTRINSIC_AUTW,
			MS_LOSS_OF_EXTRINSIC_CTW,
			MS_LOSS_OF_EXTRINSIC_ITW,
			MS_LOSS_OF_EXTRINSIC_MTW,
			MS_LOSS_OF_EXTRINSIC_QITW,
			MS_LOSS_OF_EXTRINSIC_UTW,
			MS_LOSS_OF_EXTRINSIC_VATW,
			MS_LOSS_OF_EXTRINSIC_VLTW,
			MS_LOSS_OF_EXTRINSIC_VNTW,
			MS_LOSS_OF_EXTRINSIC_WTW,
			MS_LOSS_OF_EXTRINSIC_XSTW,
			MS_LOSS_OF_EXTRINSIC_TW,
			MS_LOSS_OF_INTRINSIC_TW,
			MS_LOSS_OF_NETWORK_CONTROL,
			MS_LOSS_OF_NETWORK_USER_TW,
			MS_LOSS_OF_PROXY_USER_TW,
			MS_LOSS_OF_RELIABILITY,
			MS_LOSS_OF_RESOURCE_TW,
			MS_LOSS_OF_SERVICE_TW,
			MS_LOSS_OF_TIMELINESS,
			MS_LOSS_OF_TRUST,
			MS_LOSS_OF_USER_TW,
			MS_BANDWIDTH_UNMANAGED,
			MS_CLIENT_IMPERSONATION,
			MS_COMMS_SNOOPABLE,
			MS_CONNECTIONS_ALLOWED,
			MS_DEPUTY_CONFUSION,
			MS_IN_SERVICE,
			MS_LOCAL_LOSS_OF_CONTROL,
			MS_LOCAL_LOSS_OF_USER_TW,
			MS_MALWARE_INFECTION,
			MS_NETWORK_SPOOFING,
			MS_NOT_DECRYPTED,
			MS_NOT_ENCRYPTED,
			MS_OVERLOADED,
			MS_PHYSICAL_BREACH,
			MS_PHYSICAL_INTRUSION,
			MS_PHYSICAL_SHUTDOWN,
			MS_SERVICE_CHANNELS_ALLOWED,
			MS_SERVICE_IMPERSONATION,
			MS_THEFT,
			MS_THEFT_OF_CONTROL,
			MS_TOTAL_LOAD,
			MS_TROJAN_INSERTION,
			MS_VULNERABILITY_DISCOVERED,
		};

	/**
	 * A public read-only list of all the '<em><b>Misbehaviour Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MisbehaviourKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Misbehaviour Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MisbehaviourKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MisbehaviourKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Misbehaviour Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MisbehaviourKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MisbehaviourKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Misbehaviour Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MisbehaviourKind get(int value) {
		switch (value) {
			case MS_LOSS_OF_ACCESSIBILITY_VALUE: return MS_LOSS_OF_ACCESSIBILITY;
			case MS_LOSS_OF_ANON_USER_TW_VALUE: return MS_LOSS_OF_ANON_USER_TW;
			case MS_LOSS_OF_ASTUTENESS_VALUE: return MS_LOSS_OF_ASTUTENESS;
			case MS_LOSS_OF_AUTHENTICITY_VALUE: return MS_LOSS_OF_AUTHENTICITY;
			case MS_LOSS_OF_INTEGRITY_VALUE: return MS_LOSS_OF_INTEGRITY;
			case MS_LOSS_OF_AVAILABILITY_VALUE: return MS_LOSS_OF_AVAILABILITY;
			case MS_LOSS_OF_BENEVOLENCE_VALUE: return MS_LOSS_OF_BENEVOLENCE;
			case MS_LOSS_OF_CAPACITY_VALUE: return MS_LOSS_OF_CAPACITY;
			case MS_LOSS_OF_CLIENT_TW_VALUE: return MS_LOSS_OF_CLIENT_TW;
			case MS_LOSS_OF_COMPETENCE_VALUE: return MS_LOSS_OF_COMPETENCE;
			case MS_LOSS_OF_CONFIDENTIALITY_VALUE: return MS_LOSS_OF_CONFIDENTIALITY;
			case MS_LOSS_OF_CONNECTIVITY_VALUE: return MS_LOSS_OF_CONNECTIVITY;
			case MS_LOSS_OF_CONTROL_VALUE: return MS_LOSS_OF_CONTROL;
			case MS_LOSS_OF_DEFAULT_TW_VALUE: return MS_LOSS_OF_DEFAULT_TW;
			case MS_LOSS_OF_EXPLOIT_TW_VALUE: return MS_LOSS_OF_EXPLOIT_TW;
			case MS_LOSS_OF_EXTRINSIC_ATW_VALUE: return MS_LOSS_OF_EXTRINSIC_ATW;
			case MS_LOSS_OF_EXTRINSIC_AUTW_VALUE: return MS_LOSS_OF_EXTRINSIC_AUTW;
			case MS_LOSS_OF_EXTRINSIC_CTW_VALUE: return MS_LOSS_OF_EXTRINSIC_CTW;
			case MS_LOSS_OF_EXTRINSIC_ITW_VALUE: return MS_LOSS_OF_EXTRINSIC_ITW;
			case MS_LOSS_OF_EXTRINSIC_MTW_VALUE: return MS_LOSS_OF_EXTRINSIC_MTW;
			case MS_LOSS_OF_EXTRINSIC_QITW_VALUE: return MS_LOSS_OF_EXTRINSIC_QITW;
			case MS_LOSS_OF_EXTRINSIC_UTW_VALUE: return MS_LOSS_OF_EXTRINSIC_UTW;
			case MS_LOSS_OF_EXTRINSIC_VATW_VALUE: return MS_LOSS_OF_EXTRINSIC_VATW;
			case MS_LOSS_OF_EXTRINSIC_VLTW_VALUE: return MS_LOSS_OF_EXTRINSIC_VLTW;
			case MS_LOSS_OF_EXTRINSIC_VNTW_VALUE: return MS_LOSS_OF_EXTRINSIC_VNTW;
			case MS_LOSS_OF_EXTRINSIC_WTW_VALUE: return MS_LOSS_OF_EXTRINSIC_WTW;
			case MS_LOSS_OF_EXTRINSIC_XSTW_VALUE: return MS_LOSS_OF_EXTRINSIC_XSTW;
			case MS_LOSS_OF_EXTRINSIC_TW_VALUE: return MS_LOSS_OF_EXTRINSIC_TW;
			case MS_LOSS_OF_INTRINSIC_TW_VALUE: return MS_LOSS_OF_INTRINSIC_TW;
			case MS_LOSS_OF_NETWORK_CONTROL_VALUE: return MS_LOSS_OF_NETWORK_CONTROL;
			case MS_LOSS_OF_NETWORK_USER_TW_VALUE: return MS_LOSS_OF_NETWORK_USER_TW;
			case MS_LOSS_OF_PROXY_USER_TW_VALUE: return MS_LOSS_OF_PROXY_USER_TW;
			case MS_LOSS_OF_RELIABILITY_VALUE: return MS_LOSS_OF_RELIABILITY;
			case MS_LOSS_OF_RESOURCE_TW_VALUE: return MS_LOSS_OF_RESOURCE_TW;
			case MS_LOSS_OF_SERVICE_TW_VALUE: return MS_LOSS_OF_SERVICE_TW;
			case MS_LOSS_OF_TIMELINESS_VALUE: return MS_LOSS_OF_TIMELINESS;
			case MS_LOSS_OF_TRUST_VALUE: return MS_LOSS_OF_TRUST;
			case MS_LOSS_OF_USER_TW_VALUE: return MS_LOSS_OF_USER_TW;
			case MS_BANDWIDTH_UNMANAGED_VALUE: return MS_BANDWIDTH_UNMANAGED;
			case MS_CLIENT_IMPERSONATION_VALUE: return MS_CLIENT_IMPERSONATION;
			case MS_COMMS_SNOOPABLE_VALUE: return MS_COMMS_SNOOPABLE;
			case MS_CONNECTIONS_ALLOWED_VALUE: return MS_CONNECTIONS_ALLOWED;
			case MS_DEPUTY_CONFUSION_VALUE: return MS_DEPUTY_CONFUSION;
			case MS_IN_SERVICE_VALUE: return MS_IN_SERVICE;
			case MS_LOCAL_LOSS_OF_CONTROL_VALUE: return MS_LOCAL_LOSS_OF_CONTROL;
			case MS_LOCAL_LOSS_OF_USER_TW_VALUE: return MS_LOCAL_LOSS_OF_USER_TW;
			case MS_MALWARE_INFECTION_VALUE: return MS_MALWARE_INFECTION;
			case MS_NETWORK_SPOOFING_VALUE: return MS_NETWORK_SPOOFING;
			case MS_NOT_DECRYPTED_VALUE: return MS_NOT_DECRYPTED;
			case MS_NOT_ENCRYPTED_VALUE: return MS_NOT_ENCRYPTED;
			case MS_OVERLOADED_VALUE: return MS_OVERLOADED;
			case MS_PHYSICAL_BREACH_VALUE: return MS_PHYSICAL_BREACH;
			case MS_PHYSICAL_INTRUSION_VALUE: return MS_PHYSICAL_INTRUSION;
			case MS_PHYSICAL_SHUTDOWN_VALUE: return MS_PHYSICAL_SHUTDOWN;
			case MS_SERVICE_CHANNELS_ALLOWED_VALUE: return MS_SERVICE_CHANNELS_ALLOWED;
			case MS_SERVICE_IMPERSONATION_VALUE: return MS_SERVICE_IMPERSONATION;
			case MS_THEFT_VALUE: return MS_THEFT;
			case MS_THEFT_OF_CONTROL_VALUE: return MS_THEFT_OF_CONTROL;
			case MS_TOTAL_LOAD_VALUE: return MS_TOTAL_LOAD;
			case MS_TROJAN_INSERTION_VALUE: return MS_TROJAN_INSERTION;
			case MS_VULNERABILITY_DISCOVERED_VALUE: return MS_VULNERABILITY_DISCOVERED;
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
	private MisbehaviourKind(int value, String name, String literal) {
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
	
} //MisbehaviourKind
