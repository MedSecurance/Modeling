/**
 */
package tvra;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TWAS Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tvra.TvraPackage#getTWASKind()
 * @model
 * @generated
 */
public enum TWASKind implements Enumerator {
	/**
	 * The '<em><b>TWAS Anon User TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_ANON_USER_TW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_ANON_USER_TW(0, "TWASAnonUserTW", "TWASAnonUserTW"), /**
	 * The '<em><b>TWAS Astuteness</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_ASTUTENESS_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_ASTUTENESS(1, "TWASAstuteness", "TWASAstuteness"), /**
	 * The '<em><b>TWAS Authenticity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_AUTHENTICITY_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_AUTHENTICITY(2, "TWASAuthenticity", "TWASAuthenticity"), /**
	 * The '<em><b>TWAS Availability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_AVAILABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_AVAILABILITY(3, "TWASAvailability", "TWASAvailability"),

	/**
	 * The '<em><b>TWAS Bandwidth Managed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_BANDWIDTH_MANAGED_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_BANDWIDTH_MANAGED(4, "TWASBandwidthManaged", "TWASBandwidthManaged"), /**
	 * The '<em><b>TWAS Benevolence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_BENEVOLENCE_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_BENEVOLENCE(5, "TWASBenevolence", "TWASBenevolence"), /**
	 * The '<em><b>TWAS Capacity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_CAPACITY_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_CAPACITY(6, "TWASCapacity", "TWASCapacity"), /**
	 * The '<em><b>TWAS Channel Confidentiality</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_CHANNEL_CONFIDENTIALITY_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_CHANNEL_CONFIDENTIALITY(7, "TWASChannelConfidentiality", "TWASChannelConfidentiality"), /**
	 * The '<em><b>TWAS Client Authenticity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_CLIENT_AUTHENTICITY_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_CLIENT_AUTHENTICITY(8, "TWASClientAuthenticity", "TWASClientAuthenticity"), /**
	 * The '<em><b>TWAS Client TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_CLIENT_TW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_CLIENT_TW(9, "TWASClientTW", "TWASClientTW"), /**
	 * The '<em><b>TWAS Competence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_COMPETENCE_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_COMPETENCE(10, "TWASCompetence", "TWASCompetence"), /**
	 * The '<em><b>TWAS Confidentiality</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_CONFIDENTIALITY_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_CONFIDENTIALITY(11, "TWASConfidentiality", "TWASConfidentiality"), /**
	 * The '<em><b>TWAS Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_CONTROL(12, "TWASControl", "TWASControl"), /**
	 * The '<em><b>TWAS Decrypted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_DECRYPTED_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_DECRYPTED(13, "TWASDecrypted", "TWASDecrypted"), /**
	 * The '<em><b>TWAS Default TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_DEFAULT_TW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_DEFAULT_TW(14, "TWASDefaultTW", "TWASDefaultTW"), /**
	 * The '<em><b>TWAS Deputy User TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_DEPUTY_USER_TW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_DEPUTY_USER_TW(15, "TWASDeputyUserTW", "TWASDeputyUserTW"), /**
	 * The '<em><b>TWAS Encrypted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_ENCRYPTED_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_ENCRYPTED(16, "TWASEncrypted", "TWASEncrypted"), /**
	 * The '<em><b>TWAS Exploit TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXPLOIT_TW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_EXPLOIT_TW(17, "TWASExploitTW", "TWASExploitTW"), /**
	 * The '<em><b>TWAS Extrinsic ATW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_ATW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_EXTRINSIC_ATW(18, "TWASExtrinsicATW", "TWASExtrinsicATW"), /**
	 * The '<em><b>TWAS Extrinsic AUTW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_AUTW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_EXTRINSIC_AUTW(19, "TWASExtrinsicAUTW", "TWASExtrinsicAUTW"), /**
	 * The '<em><b>TWAS Extrinsic CTW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_CTW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_EXTRINSIC_CTW(20, "TWASExtrinsicCTW", "TWASExtrinsicCTW"), /**
	 * The '<em><b>TWAS Extrinsic ITW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_ITW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_EXTRINSIC_ITW(21, "TWASExtrinsicITW", "TWASExtrinsicITW"), /**
	 * The '<em><b>TWAS Extrinsic MTW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_MTW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_EXTRINSIC_MTW(22, "TWASExtrinsicMTW", "TWASExtrinsicMTW"), /**
	 * The '<em><b>TWAS Extrinsic QITW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_QITW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_EXTRINSIC_QITW(23, "TWASExtrinsicQITW", "TWASExtrinsicQITW"), /**
	 * The '<em><b>TWAS Extrinsic TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_TW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_EXTRINSIC_TW(24, "TWASExtrinsicTW", "TWASExtrinsicTW"), /**
	 * The '<em><b>TWAS Extrinsic UTW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_UTW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_EXTRINSIC_UTW(25, "TWASExtrinsicUTW", "TWASExtrinsicUTW"), /**
	 * The '<em><b>TWAS Extrinsic VATW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_VATW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_EXTRINSIC_VATW(26, "TWASExtrinsicVATW", "TWASExtrinsicVATW"), /**
	 * The '<em><b>TWAS Extrinsic VLTW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_VLTW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_EXTRINSIC_VLTW(27, "TWASExtrinsicVLTW", "TWASExtrinsicVLTW"), /**
	 * The '<em><b>TWAS Extrinsic VNTW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_VNTW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_EXTRINSIC_VNTW(28, "TWASExtrinsicVNTW", "TWASExtrinsicVNTW"), /**
	 * The '<em><b>TWAS Extrinsic WTW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_WTW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_EXTRINSIC_WTW(29, "TWASExtrinsicWTW", "TWASExtrinsicWTW"), /**
	 * The '<em><b>TWAS Extrinsic XSTW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_XSTW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_EXTRINSIC_XSTW(30, "TWASExtrinsicXSTW", "TWASExtrinsicXSTW"), /**
	 * The '<em><b>TWAS Health</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_HEALTH_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_HEALTH(31, "TWASHealth", "TWASHealth"), /**
	 * The '<em><b>TWAS Integrity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_INTEGRITY_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_INTEGRITY(32, "TWASIntegrity", "TWASIntegrity"), /**
	 * The '<em><b>TWAS Intrinsic TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_INTRINSIC_TW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_INTRINSIC_TW(33, "TWASIntrinsicTW", "TWASIntrinsicTW"), /**
	 * The '<em><b>TWAS Network Authenticity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_NETWORK_AUTHENTICITY_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_NETWORK_AUTHENTICITY(34, "TWASNetworkAuthenticity", "TWASNetworkAuthenticity"), /**
	 * The '<em><b>TWAS Network Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_NETWORK_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_NETWORK_CONTROL(35, "TWASNetworkControl", "TWASNetworkControl"), /**
	 * The '<em><b>TWAS Network User TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_NETWORK_USER_TW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_NETWORK_USER_TW(36, "TWASNetworkUserTW", "TWASNetworkUserTW"), /**
	 * The '<em><b>TWAS Occupant TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_OCCUPANT_TW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_OCCUPANT_TW(37, "TWASOccupantTW", "TWASOccupantTW"), /**
	 * The '<em><b>TWAS Out Of Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_OUT_OF_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_OUT_OF_SERVICE(38, "TWASOutOfService", "TWASOutOfService"), /**
	 * The '<em><b>TWAS Owner Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_OWNER_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_OWNER_CONTROL(39, "TWASOwnerControl", "TWASOwnerControl"), /**
	 * The '<em><b>TWAS Physical Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_PHYSICAL_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_PHYSICAL_CONTROL(40, "TWASPhysicalControl", "TWASPhysicalControl"), /**
	 * The '<em><b>TWAS Possession</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_POSSESSION_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_POSSESSION(41, "TWASPossession", "TWASPossession"), /**
	 * The '<em><b>TWAS Proxy User TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_PROXY_USER_TW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_PROXY_USER_TW(42, "TWASProxyUserTW", "TWASProxyUserTW"), /**
	 * The '<em><b>TWAS Reliability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_RELIABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_RELIABILITY(43, "TWASReliability", "TWASReliability"), /**
	 * The '<em><b>TWAS Resource TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_RESOURCE_TW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_RESOURCE_TW(44, "TWASResourceTW", "TWASResourceTW"), /**
	 * The '<em><b>TWAS Service Authenticity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_SERVICE_AUTHENTICITY_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_SERVICE_AUTHENTICITY(45, "TWASServiceAuthenticity", "TWASServiceAuthenticity"), /**
	 * The '<em><b>TWAS Service TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_SERVICE_TW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_SERVICE_TW(46, "TWASServiceTW", "TWASServiceTW"), /**
	 * The '<em><b>TWAS Timeliness</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_TIMELINESS_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_TIMELINESS(47, "TWASTimeliness", "TWASTimeliness"), /**
	 * The '<em><b>TWAS Trojan TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_TROJAN_TW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_TROJAN_TW(48, "TWASTrojanTW", "TWASTrojanTW"), /**
	 * The '<em><b>TWAS Trust</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_TRUST_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_TRUST(49, "TWASTrust", "TWASTrust"), /**
	 * The '<em><b>TWAS Underload</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_UNDERLOAD_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_UNDERLOAD(50, "TWASUnderload", "TWASUnderload"), /**
	 * The '<em><b>TWAS User TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_USER_TW_VALUE
	 * @generated
	 * @ordered
	 */
	TWAS_USER_TW(51, "TWASUserTW", "TWASUserTW");

	/**
	 * The '<em><b>TWAS Anon User TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_ANON_USER_TW
	 * @model name="TWASAnonUserTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-AnonUserTW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_ANON_USER_TW_VALUE = 0;

	/**
	 * The '<em><b>TWAS Astuteness</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_ASTUTENESS
	 * @model name="TWASAstuteness"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Astuteness'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_ASTUTENESS_VALUE = 1;

	/**
	 * The '<em><b>TWAS Authenticity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_AUTHENTICITY
	 * @model name="TWASAuthenticity"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Authenticity'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_AUTHENTICITY_VALUE = 2;

	/**
	 * The '<em><b>TWAS Availability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_AVAILABILITY
	 * @model name="TWASAvailability"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Availability'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_AVAILABILITY_VALUE = 3;

	/**
	 * The '<em><b>TWAS Bandwidth Managed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_BANDWIDTH_MANAGED
	 * @model name="TWASBandwidthManaged"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-BandwidthManaged'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_BANDWIDTH_MANAGED_VALUE = 4;

	/**
	 * The '<em><b>TWAS Benevolence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_BENEVOLENCE
	 * @model name="TWASBenevolence"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Benevolence'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_BENEVOLENCE_VALUE = 5;

	/**
	 * The '<em><b>TWAS Capacity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_CAPACITY
	 * @model name="TWASCapacity"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Capacity'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_CAPACITY_VALUE = 6;

	/**
	 * The '<em><b>TWAS Channel Confidentiality</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_CHANNEL_CONFIDENTIALITY
	 * @model name="TWASChannelConfidentiality"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-ChannelConfidentiality'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_CHANNEL_CONFIDENTIALITY_VALUE = 7;

	/**
	 * The '<em><b>TWAS Client Authenticity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_CLIENT_AUTHENTICITY
	 * @model name="TWASClientAuthenticity"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-ClientAuthenticity'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_CLIENT_AUTHENTICITY_VALUE = 8;

	/**
	 * The '<em><b>TWAS Client TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_CLIENT_TW
	 * @model name="TWASClientTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-ClientTW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_CLIENT_TW_VALUE = 9;

	/**
	 * The '<em><b>TWAS Competence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_COMPETENCE
	 * @model name="TWASCompetence"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Competence'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_COMPETENCE_VALUE = 10;

	/**
	 * The '<em><b>TWAS Confidentiality</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_CONFIDENTIALITY
	 * @model name="TWASConfidentiality"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Confidentiality'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_CONFIDENTIALITY_VALUE = 11;

	/**
	 * The '<em><b>TWAS Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_CONTROL
	 * @model name="TWASControl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Control'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_CONTROL_VALUE = 12;

	/**
	 * The '<em><b>TWAS Decrypted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_DECRYPTED
	 * @model name="TWASDecrypted"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Decrypted'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_DECRYPTED_VALUE = 13;

	/**
	 * The '<em><b>TWAS Default TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_DEFAULT_TW
	 * @model name="TWASDefaultTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-DefaultTW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_DEFAULT_TW_VALUE = 14;

	/**
	 * The '<em><b>TWAS Deputy User TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_DEPUTY_USER_TW
	 * @model name="TWASDeputyUserTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-DeputyUserTW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_DEPUTY_USER_TW_VALUE = 15;

	/**
	 * The '<em><b>TWAS Encrypted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_ENCRYPTED
	 * @model name="TWASEncrypted"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Encrypted'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_ENCRYPTED_VALUE = 16;

	/**
	 * The '<em><b>TWAS Exploit TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXPLOIT_TW
	 * @model name="TWASExploitTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-ExploitTW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_EXPLOIT_TW_VALUE = 17;

	/**
	 * The '<em><b>TWAS Extrinsic ATW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_ATW
	 * @model name="TWASExtrinsicATW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Extrinsic-A-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_EXTRINSIC_ATW_VALUE = 18;

	/**
	 * The '<em><b>TWAS Extrinsic AUTW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_AUTW
	 * @model name="TWASExtrinsicAUTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Extrinsic-AU-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_EXTRINSIC_AUTW_VALUE = 19;

	/**
	 * The '<em><b>TWAS Extrinsic CTW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_CTW
	 * @model name="TWASExtrinsicCTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Extrinsic-C-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_EXTRINSIC_CTW_VALUE = 20;

	/**
	 * The '<em><b>TWAS Extrinsic ITW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_ITW
	 * @model name="TWASExtrinsicITW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Extrinsic-I-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_EXTRINSIC_ITW_VALUE = 21;

	/**
	 * The '<em><b>TWAS Extrinsic MTW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_MTW
	 * @model name="TWASExtrinsicMTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Extrinsic-M-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_EXTRINSIC_MTW_VALUE = 22;

	/**
	 * The '<em><b>TWAS Extrinsic QITW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_QITW
	 * @model name="TWASExtrinsicQITW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Extrinsic-QI-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_EXTRINSIC_QITW_VALUE = 23;

	/**
	 * The '<em><b>TWAS Extrinsic TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_TW
	 * @model name="TWASExtrinsicTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Extrinsic-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_EXTRINSIC_TW_VALUE = 24;

	/**
	 * The '<em><b>TWAS Extrinsic UTW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_UTW
	 * @model name="TWASExtrinsicUTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Extrinsic-U-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_EXTRINSIC_UTW_VALUE = 25;

	/**
	 * The '<em><b>TWAS Extrinsic VATW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_VATW
	 * @model name="TWASExtrinsicVATW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Extrinsic-VA-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_EXTRINSIC_VATW_VALUE = 26;

	/**
	 * The '<em><b>TWAS Extrinsic VLTW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_VLTW
	 * @model name="TWASExtrinsicVLTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Extrinsic-VL-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_EXTRINSIC_VLTW_VALUE = 27;

	/**
	 * The '<em><b>TWAS Extrinsic VNTW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_VNTW
	 * @model name="TWASExtrinsicVNTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Extrinsic-VN-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_EXTRINSIC_VNTW_VALUE = 28;

	/**
	 * The '<em><b>TWAS Extrinsic WTW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_WTW
	 * @model name="TWASExtrinsicWTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Extrinsic-W-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_EXTRINSIC_WTW_VALUE = 29;

	/**
	 * The '<em><b>TWAS Extrinsic XSTW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_EXTRINSIC_XSTW
	 * @model name="TWASExtrinsicXSTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Extrinsic-XS-TW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_EXTRINSIC_XSTW_VALUE = 30;

	/**
	 * The '<em><b>TWAS Health</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_HEALTH
	 * @model name="TWASHealth"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Health'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_HEALTH_VALUE = 31;

	/**
	 * The '<em><b>TWAS Integrity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_INTEGRITY
	 * @model name="TWASIntegrity"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Integrity'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_INTEGRITY_VALUE = 32;

	/**
	 * The '<em><b>TWAS Intrinsic TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_INTRINSIC_TW
	 * @model name="TWASIntrinsicTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-IntrinsicTW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_INTRINSIC_TW_VALUE = 33;

	/**
	 * The '<em><b>TWAS Network Authenticity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_NETWORK_AUTHENTICITY
	 * @model name="TWASNetworkAuthenticity"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-NetworkAuthenticity'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_NETWORK_AUTHENTICITY_VALUE = 34;

	/**
	 * The '<em><b>TWAS Network Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_NETWORK_CONTROL
	 * @model name="TWASNetworkControl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-NetworkControl'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_NETWORK_CONTROL_VALUE = 35;

	/**
	 * The '<em><b>TWAS Network User TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_NETWORK_USER_TW
	 * @model name="TWASNetworkUserTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-NetworkUserTW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_NETWORK_USER_TW_VALUE = 36;

	/**
	 * The '<em><b>TWAS Occupant TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_OCCUPANT_TW
	 * @model name="TWASOccupantTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-OccupantTW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_OCCUPANT_TW_VALUE = 37;

	/**
	 * The '<em><b>TWAS Out Of Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_OUT_OF_SERVICE
	 * @model name="TWASOutOfService"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-OutOfService'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_OUT_OF_SERVICE_VALUE = 38;

	/**
	 * The '<em><b>TWAS Owner Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_OWNER_CONTROL
	 * @model name="TWASOwnerControl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-OwnerControl'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_OWNER_CONTROL_VALUE = 39;

	/**
	 * The '<em><b>TWAS Physical Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_PHYSICAL_CONTROL
	 * @model name="TWASPhysicalControl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-PhysicalControl'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_PHYSICAL_CONTROL_VALUE = 40;

	/**
	 * The '<em><b>TWAS Possession</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_POSSESSION
	 * @model name="TWASPossession"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Possession'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_POSSESSION_VALUE = 41;

	/**
	 * The '<em><b>TWAS Proxy User TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_PROXY_USER_TW
	 * @model name="TWASProxyUserTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-ProxyUserTW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_PROXY_USER_TW_VALUE = 42;

	/**
	 * The '<em><b>TWAS Reliability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_RELIABILITY
	 * @model name="TWASReliability"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Reliability'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_RELIABILITY_VALUE = 43;

	/**
	 * The '<em><b>TWAS Resource TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_RESOURCE_TW
	 * @model name="TWASResourceTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-ResourceTW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_RESOURCE_TW_VALUE = 44;

	/**
	 * The '<em><b>TWAS Service Authenticity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_SERVICE_AUTHENTICITY
	 * @model name="TWASServiceAuthenticity"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-ServiceAuthenticity'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_SERVICE_AUTHENTICITY_VALUE = 45;

	/**
	 * The '<em><b>TWAS Service TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_SERVICE_TW
	 * @model name="TWASServiceTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-ServiceTW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_SERVICE_TW_VALUE = 46;

	/**
	 * The '<em><b>TWAS Timeliness</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_TIMELINESS
	 * @model name="TWASTimeliness"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Timeliness'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_TIMELINESS_VALUE = 47;

	/**
	 * The '<em><b>TWAS Trojan TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_TROJAN_TW
	 * @model name="TWASTrojanTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-TrojanTW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_TROJAN_TW_VALUE = 48;

	/**
	 * The '<em><b>TWAS Trust</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_TRUST
	 * @model name="TWASTrust"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Trust'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_TRUST_VALUE = 49;

	/**
	 * The '<em><b>TWAS Underload</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_UNDERLOAD
	 * @model name="TWASUnderload"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-Underload'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_UNDERLOAD_VALUE = 50;

	/**
	 * The '<em><b>TWAS User TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWAS_USER_TW
	 * @model name="TWASUserTW"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TWAS-UserTW'"
	 * @generated
	 * @ordered
	 */
	public static final int TWAS_USER_TW_VALUE = 51;

	/**
	 * An array of all the '<em><b>TWAS Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TWASKind[] VALUES_ARRAY =
		new TWASKind[] {
			TWAS_ANON_USER_TW,
			TWAS_ASTUTENESS,
			TWAS_AUTHENTICITY,
			TWAS_AVAILABILITY,
			TWAS_BANDWIDTH_MANAGED,
			TWAS_BENEVOLENCE,
			TWAS_CAPACITY,
			TWAS_CHANNEL_CONFIDENTIALITY,
			TWAS_CLIENT_AUTHENTICITY,
			TWAS_CLIENT_TW,
			TWAS_COMPETENCE,
			TWAS_CONFIDENTIALITY,
			TWAS_CONTROL,
			TWAS_DECRYPTED,
			TWAS_DEFAULT_TW,
			TWAS_DEPUTY_USER_TW,
			TWAS_ENCRYPTED,
			TWAS_EXPLOIT_TW,
			TWAS_EXTRINSIC_ATW,
			TWAS_EXTRINSIC_AUTW,
			TWAS_EXTRINSIC_CTW,
			TWAS_EXTRINSIC_ITW,
			TWAS_EXTRINSIC_MTW,
			TWAS_EXTRINSIC_QITW,
			TWAS_EXTRINSIC_TW,
			TWAS_EXTRINSIC_UTW,
			TWAS_EXTRINSIC_VATW,
			TWAS_EXTRINSIC_VLTW,
			TWAS_EXTRINSIC_VNTW,
			TWAS_EXTRINSIC_WTW,
			TWAS_EXTRINSIC_XSTW,
			TWAS_HEALTH,
			TWAS_INTEGRITY,
			TWAS_INTRINSIC_TW,
			TWAS_NETWORK_AUTHENTICITY,
			TWAS_NETWORK_CONTROL,
			TWAS_NETWORK_USER_TW,
			TWAS_OCCUPANT_TW,
			TWAS_OUT_OF_SERVICE,
			TWAS_OWNER_CONTROL,
			TWAS_PHYSICAL_CONTROL,
			TWAS_POSSESSION,
			TWAS_PROXY_USER_TW,
			TWAS_RELIABILITY,
			TWAS_RESOURCE_TW,
			TWAS_SERVICE_AUTHENTICITY,
			TWAS_SERVICE_TW,
			TWAS_TIMELINESS,
			TWAS_TROJAN_TW,
			TWAS_TRUST,
			TWAS_UNDERLOAD,
			TWAS_USER_TW,
		};

	/**
	 * A public read-only list of all the '<em><b>TWAS Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TWASKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TWAS Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TWASKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TWASKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TWAS Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TWASKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TWASKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TWAS Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TWASKind get(int value) {
		switch (value) {
			case TWAS_ANON_USER_TW_VALUE: return TWAS_ANON_USER_TW;
			case TWAS_ASTUTENESS_VALUE: return TWAS_ASTUTENESS;
			case TWAS_AUTHENTICITY_VALUE: return TWAS_AUTHENTICITY;
			case TWAS_AVAILABILITY_VALUE: return TWAS_AVAILABILITY;
			case TWAS_BANDWIDTH_MANAGED_VALUE: return TWAS_BANDWIDTH_MANAGED;
			case TWAS_BENEVOLENCE_VALUE: return TWAS_BENEVOLENCE;
			case TWAS_CAPACITY_VALUE: return TWAS_CAPACITY;
			case TWAS_CHANNEL_CONFIDENTIALITY_VALUE: return TWAS_CHANNEL_CONFIDENTIALITY;
			case TWAS_CLIENT_AUTHENTICITY_VALUE: return TWAS_CLIENT_AUTHENTICITY;
			case TWAS_CLIENT_TW_VALUE: return TWAS_CLIENT_TW;
			case TWAS_COMPETENCE_VALUE: return TWAS_COMPETENCE;
			case TWAS_CONFIDENTIALITY_VALUE: return TWAS_CONFIDENTIALITY;
			case TWAS_CONTROL_VALUE: return TWAS_CONTROL;
			case TWAS_DECRYPTED_VALUE: return TWAS_DECRYPTED;
			case TWAS_DEFAULT_TW_VALUE: return TWAS_DEFAULT_TW;
			case TWAS_DEPUTY_USER_TW_VALUE: return TWAS_DEPUTY_USER_TW;
			case TWAS_ENCRYPTED_VALUE: return TWAS_ENCRYPTED;
			case TWAS_EXPLOIT_TW_VALUE: return TWAS_EXPLOIT_TW;
			case TWAS_EXTRINSIC_ATW_VALUE: return TWAS_EXTRINSIC_ATW;
			case TWAS_EXTRINSIC_AUTW_VALUE: return TWAS_EXTRINSIC_AUTW;
			case TWAS_EXTRINSIC_CTW_VALUE: return TWAS_EXTRINSIC_CTW;
			case TWAS_EXTRINSIC_ITW_VALUE: return TWAS_EXTRINSIC_ITW;
			case TWAS_EXTRINSIC_MTW_VALUE: return TWAS_EXTRINSIC_MTW;
			case TWAS_EXTRINSIC_QITW_VALUE: return TWAS_EXTRINSIC_QITW;
			case TWAS_EXTRINSIC_TW_VALUE: return TWAS_EXTRINSIC_TW;
			case TWAS_EXTRINSIC_UTW_VALUE: return TWAS_EXTRINSIC_UTW;
			case TWAS_EXTRINSIC_VATW_VALUE: return TWAS_EXTRINSIC_VATW;
			case TWAS_EXTRINSIC_VLTW_VALUE: return TWAS_EXTRINSIC_VLTW;
			case TWAS_EXTRINSIC_VNTW_VALUE: return TWAS_EXTRINSIC_VNTW;
			case TWAS_EXTRINSIC_WTW_VALUE: return TWAS_EXTRINSIC_WTW;
			case TWAS_EXTRINSIC_XSTW_VALUE: return TWAS_EXTRINSIC_XSTW;
			case TWAS_HEALTH_VALUE: return TWAS_HEALTH;
			case TWAS_INTEGRITY_VALUE: return TWAS_INTEGRITY;
			case TWAS_INTRINSIC_TW_VALUE: return TWAS_INTRINSIC_TW;
			case TWAS_NETWORK_AUTHENTICITY_VALUE: return TWAS_NETWORK_AUTHENTICITY;
			case TWAS_NETWORK_CONTROL_VALUE: return TWAS_NETWORK_CONTROL;
			case TWAS_NETWORK_USER_TW_VALUE: return TWAS_NETWORK_USER_TW;
			case TWAS_OCCUPANT_TW_VALUE: return TWAS_OCCUPANT_TW;
			case TWAS_OUT_OF_SERVICE_VALUE: return TWAS_OUT_OF_SERVICE;
			case TWAS_OWNER_CONTROL_VALUE: return TWAS_OWNER_CONTROL;
			case TWAS_PHYSICAL_CONTROL_VALUE: return TWAS_PHYSICAL_CONTROL;
			case TWAS_POSSESSION_VALUE: return TWAS_POSSESSION;
			case TWAS_PROXY_USER_TW_VALUE: return TWAS_PROXY_USER_TW;
			case TWAS_RELIABILITY_VALUE: return TWAS_RELIABILITY;
			case TWAS_RESOURCE_TW_VALUE: return TWAS_RESOURCE_TW;
			case TWAS_SERVICE_AUTHENTICITY_VALUE: return TWAS_SERVICE_AUTHENTICITY;
			case TWAS_SERVICE_TW_VALUE: return TWAS_SERVICE_TW;
			case TWAS_TIMELINESS_VALUE: return TWAS_TIMELINESS;
			case TWAS_TROJAN_TW_VALUE: return TWAS_TROJAN_TW;
			case TWAS_TRUST_VALUE: return TWAS_TRUST;
			case TWAS_UNDERLOAD_VALUE: return TWAS_UNDERLOAD;
			case TWAS_USER_TW_VALUE: return TWAS_USER_TW;
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
	private TWASKind(int value, String name, String literal) {
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
	
} //TWASKind
