/**
 */
package tvra.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tvra.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TvraFactoryImpl extends EFactoryImpl implements TvraFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TvraFactory init() {
		try {
			TvraFactory theTvraFactory = (TvraFactory)EPackage.Registry.INSTANCE.getEFactory(TvraPackage.eNS_URI);
			if (theTvraFactory != null) {
				return theTvraFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TvraFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TvraFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TvraPackage.TVRA_ASSET: return createTVRAAsset();
			case TvraPackage.MISBEHAVIOUR: return createMisbehaviour();
			case TvraPackage.TRUSTWORTHINESS_ATTRIBUTE_SET: return createTrustworthinessAttributeSet();
			case TvraPackage.CONTROL_SET: return createControlSet();
			case TvraPackage.NETWORK_DOMAIN: return createNetworkDomain();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TvraPackage.TRVA_ASSET_KIND:
				return createTRVAAssetKindFromString(eDataType, initialValue);
			case TvraPackage.MISBEHAVIOUR_KIND:
				return createMisbehaviourKindFromString(eDataType, initialValue);
			case TvraPackage.IMPACT_LEVEL_KIND:
				return createImpactLevelKindFromString(eDataType, initialValue);
			case TvraPackage.TWAS_KIND:
				return createTWASKindFromString(eDataType, initialValue);
			case TvraPackage.TRUSTWORTHINESS_LEVEL_KIND:
				return createTrustworthinessLevelKindFromString(eDataType, initialValue);
			case TvraPackage.CONTROL_SET_KIND:
				return createControlSetKindFromString(eDataType, initialValue);
			case TvraPackage.NETWORK_DOMAIN_KIND:
				return createNetworkDomainKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TvraPackage.TRVA_ASSET_KIND:
				return convertTRVAAssetKindToString(eDataType, instanceValue);
			case TvraPackage.MISBEHAVIOUR_KIND:
				return convertMisbehaviourKindToString(eDataType, instanceValue);
			case TvraPackage.IMPACT_LEVEL_KIND:
				return convertImpactLevelKindToString(eDataType, instanceValue);
			case TvraPackage.TWAS_KIND:
				return convertTWASKindToString(eDataType, instanceValue);
			case TvraPackage.TRUSTWORTHINESS_LEVEL_KIND:
				return convertTrustworthinessLevelKindToString(eDataType, instanceValue);
			case TvraPackage.CONTROL_SET_KIND:
				return convertControlSetKindToString(eDataType, instanceValue);
			case TvraPackage.NETWORK_DOMAIN_KIND:
				return convertNetworkDomainKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TVRAAsset createTVRAAsset() {
		TVRAAssetImpl tvraAsset = new TVRAAssetImpl();
		return tvraAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Misbehaviour createMisbehaviour() {
		MisbehaviourImpl misbehaviour = new MisbehaviourImpl();
		return misbehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrustworthinessAttributeSet createTrustworthinessAttributeSet() {
		TrustworthinessAttributeSetImpl trustworthinessAttributeSet = new TrustworthinessAttributeSetImpl();
		return trustworthinessAttributeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSet createControlSet() {
		ControlSetImpl controlSet = new ControlSetImpl();
		return controlSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkDomain createNetworkDomain() {
		NetworkDomainImpl networkDomain = new NetworkDomainImpl();
		return networkDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRVAAssetKind createTRVAAssetKindFromString(EDataType eDataType, String initialValue) {
		TRVAAssetKind result = TRVAAssetKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRVAAssetKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MisbehaviourKind createMisbehaviourKindFromString(EDataType eDataType, String initialValue) {
		MisbehaviourKind result = MisbehaviourKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMisbehaviourKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactLevelKind createImpactLevelKindFromString(EDataType eDataType, String initialValue) {
		ImpactLevelKind result = ImpactLevelKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImpactLevelKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TWASKind createTWASKindFromString(EDataType eDataType, String initialValue) {
		TWASKind result = TWASKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTWASKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustworthinessLevelKind createTrustworthinessLevelKindFromString(EDataType eDataType, String initialValue) {
		TrustworthinessLevelKind result = TrustworthinessLevelKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrustworthinessLevelKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlSetKind createControlSetKindFromString(EDataType eDataType, String initialValue) {
		ControlSetKind result = ControlSetKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlSetKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkDomainKind createNetworkDomainKindFromString(EDataType eDataType, String initialValue) {
		NetworkDomainKind result = NetworkDomainKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNetworkDomainKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TvraPackage getTvraPackage() {
		return (TvraPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TvraPackage getPackage() {
		return TvraPackage.eINSTANCE;
	}

} //TvraFactoryImpl
