/**
 */
package tvra;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tvra.TvraFactory
 * @model kind="package"
 * @generated
 */
public interface TvraPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tvra";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iomt.tvra";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tvra";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TvraPackage eINSTANCE = tvra.impl.TvraPackageImpl.init();

	/**
	 * The meta object id for the '{@link tvra.impl.TVRAAssetImpl <em>TVRA Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tvra.impl.TVRAAssetImpl
	 * @see tvra.impl.TvraPackageImpl#getTVRAAsset()
	 * @generated
	 */
	int TVRA_ASSET = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVRA_ASSET__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVRA_ASSET__KIND = 1;

	/**
	 * The feature id for the '<em><b>Misbehaviours</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVRA_ASSET__MISBEHAVIOURS = 2;

	/**
	 * The feature id for the '<em><b>Trustworthinessattributesets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVRA_ASSET__TRUSTWORTHINESSATTRIBUTESETS = 3;

	/**
	 * The feature id for the '<em><b>Controlsets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVRA_ASSET__CONTROLSETS = 4;

	/**
	 * The number of structural features of the '<em>TVRA Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVRA_ASSET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>TVRA Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVRA_ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tvra.impl.MisbehaviourImpl <em>Misbehaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tvra.impl.MisbehaviourImpl
	 * @see tvra.impl.TvraPackageImpl#getMisbehaviour()
	 * @generated
	 */
	int MISBEHAVIOUR = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISBEHAVIOUR__KIND = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISBEHAVIOUR__BASE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Impact Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISBEHAVIOUR__IMPACT_LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Tvraasset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISBEHAVIOUR__TVRAASSET = 3;

	/**
	 * The number of structural features of the '<em>Misbehaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISBEHAVIOUR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Misbehaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISBEHAVIOUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tvra.impl.TrustworthinessAttributeSetImpl <em>Trustworthiness Attribute Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tvra.impl.TrustworthinessAttributeSetImpl
	 * @see tvra.impl.TvraPackageImpl#getTrustworthinessAttributeSet()
	 * @generated
	 */
	int TRUSTWORTHINESS_ATTRIBUTE_SET = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTWORTHINESS_ATTRIBUTE_SET__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTWORTHINESS_ATTRIBUTE_SET__KIND = 1;

	/**
	 * The feature id for the '<em><b>Trustworthiness Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTWORTHINESS_ATTRIBUTE_SET__TRUSTWORTHINESS_LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Tvraasset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTWORTHINESS_ATTRIBUTE_SET__TVRAASSET = 3;

	/**
	 * The number of structural features of the '<em>Trustworthiness Attribute Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTWORTHINESS_ATTRIBUTE_SET_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Trustworthiness Attribute Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTWORTHINESS_ATTRIBUTE_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tvra.impl.ControlSetImpl <em>Control Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tvra.impl.ControlSetImpl
	 * @see tvra.impl.TvraPackageImpl#getControlSet()
	 * @generated
	 */
	int CONTROL_SET = 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SET__KIND = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SET__BASE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Is Proposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SET__IS_PROPOSED = 2;

	/**
	 * The feature id for the '<em><b>Coverage Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SET__COVERAGE_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Tvraasset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SET__TVRAASSET = 4;

	/**
	 * The number of structural features of the '<em>Control Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Control Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tvra.impl.NetworkDomainImpl <em>Network Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tvra.impl.NetworkDomainImpl
	 * @see tvra.impl.TvraPackageImpl#getNetworkDomain()
	 * @generated
	 */
	int NETWORK_DOMAIN = 4;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DOMAIN__BASE_ASSOCIATION = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DOMAIN__KIND = 1;

	/**
	 * The number of structural features of the '<em>Network Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DOMAIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Network Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tvra.TRVAAssetKind <em>TRVA Asset Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tvra.TRVAAssetKind
	 * @see tvra.impl.TvraPackageImpl#getTRVAAssetKind()
	 * @generated
	 */
	int TRVA_ASSET_KIND = 5;

	/**
	 * The meta object id for the '{@link tvra.MisbehaviourKind <em>Misbehaviour Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tvra.MisbehaviourKind
	 * @see tvra.impl.TvraPackageImpl#getMisbehaviourKind()
	 * @generated
	 */
	int MISBEHAVIOUR_KIND = 6;

	/**
	 * The meta object id for the '{@link tvra.ImpactLevelKind <em>Impact Level Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tvra.ImpactLevelKind
	 * @see tvra.impl.TvraPackageImpl#getImpactLevelKind()
	 * @generated
	 */
	int IMPACT_LEVEL_KIND = 7;

	/**
	 * The meta object id for the '{@link tvra.TWASKind <em>TWAS Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tvra.TWASKind
	 * @see tvra.impl.TvraPackageImpl#getTWASKind()
	 * @generated
	 */
	int TWAS_KIND = 8;

	/**
	 * The meta object id for the '{@link tvra.TrustworthinessLevelKind <em>Trustworthiness Level Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tvra.TrustworthinessLevelKind
	 * @see tvra.impl.TvraPackageImpl#getTrustworthinessLevelKind()
	 * @generated
	 */
	int TRUSTWORTHINESS_LEVEL_KIND = 9;

	/**
	 * The meta object id for the '{@link tvra.ControlSetKind <em>Control Set Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tvra.ControlSetKind
	 * @see tvra.impl.TvraPackageImpl#getControlSetKind()
	 * @generated
	 */
	int CONTROL_SET_KIND = 10;

	/**
	 * The meta object id for the '{@link tvra.NetworkDomainKind <em>Network Domain Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tvra.NetworkDomainKind
	 * @see tvra.impl.TvraPackageImpl#getNetworkDomainKind()
	 * @generated
	 */
	int NETWORK_DOMAIN_KIND = 11;


	/**
	 * Returns the meta object for class '{@link tvra.TVRAAsset <em>TVRA Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TVRA Asset</em>'.
	 * @see tvra.TVRAAsset
	 * @generated
	 */
	EClass getTVRAAsset();

	/**
	 * Returns the meta object for the reference '{@link tvra.TVRAAsset#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see tvra.TVRAAsset#getBase_Class()
	 * @see #getTVRAAsset()
	 * @generated
	 */
	EReference getTVRAAsset_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link tvra.TVRAAsset#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see tvra.TVRAAsset#getKind()
	 * @see #getTVRAAsset()
	 * @generated
	 */
	EAttribute getTVRAAsset_Kind();

	/**
	 * Returns the meta object for the reference list '{@link tvra.TVRAAsset#getMisbehaviours <em>Misbehaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Misbehaviours</em>'.
	 * @see tvra.TVRAAsset#getMisbehaviours()
	 * @see #getTVRAAsset()
	 * @generated
	 */
	EReference getTVRAAsset_Misbehaviours();

	/**
	 * Returns the meta object for the reference list '{@link tvra.TVRAAsset#getTrustworthinessattributesets <em>Trustworthinessattributesets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trustworthinessattributesets</em>'.
	 * @see tvra.TVRAAsset#getTrustworthinessattributesets()
	 * @see #getTVRAAsset()
	 * @generated
	 */
	EReference getTVRAAsset_Trustworthinessattributesets();

	/**
	 * Returns the meta object for the reference list '{@link tvra.TVRAAsset#getControlsets <em>Controlsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controlsets</em>'.
	 * @see tvra.TVRAAsset#getControlsets()
	 * @see #getTVRAAsset()
	 * @generated
	 */
	EReference getTVRAAsset_Controlsets();

	/**
	 * Returns the meta object for class '{@link tvra.Misbehaviour <em>Misbehaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Misbehaviour</em>'.
	 * @see tvra.Misbehaviour
	 * @generated
	 */
	EClass getMisbehaviour();

	/**
	 * Returns the meta object for the attribute '{@link tvra.Misbehaviour#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see tvra.Misbehaviour#getKind()
	 * @see #getMisbehaviour()
	 * @generated
	 */
	EAttribute getMisbehaviour_Kind();

	/**
	 * Returns the meta object for the reference '{@link tvra.Misbehaviour#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see tvra.Misbehaviour#getBase_Class()
	 * @see #getMisbehaviour()
	 * @generated
	 */
	EReference getMisbehaviour_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link tvra.Misbehaviour#getImpactLevel <em>Impact Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impact Level</em>'.
	 * @see tvra.Misbehaviour#getImpactLevel()
	 * @see #getMisbehaviour()
	 * @generated
	 */
	EAttribute getMisbehaviour_ImpactLevel();

	/**
	 * Returns the meta object for the reference '{@link tvra.Misbehaviour#getTvraasset <em>Tvraasset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tvraasset</em>'.
	 * @see tvra.Misbehaviour#getTvraasset()
	 * @see #getMisbehaviour()
	 * @generated
	 */
	EReference getMisbehaviour_Tvraasset();

	/**
	 * Returns the meta object for class '{@link tvra.TrustworthinessAttributeSet <em>Trustworthiness Attribute Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trustworthiness Attribute Set</em>'.
	 * @see tvra.TrustworthinessAttributeSet
	 * @generated
	 */
	EClass getTrustworthinessAttributeSet();

	/**
	 * Returns the meta object for the reference '{@link tvra.TrustworthinessAttributeSet#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see tvra.TrustworthinessAttributeSet#getBase_Class()
	 * @see #getTrustworthinessAttributeSet()
	 * @generated
	 */
	EReference getTrustworthinessAttributeSet_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link tvra.TrustworthinessAttributeSet#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see tvra.TrustworthinessAttributeSet#getKind()
	 * @see #getTrustworthinessAttributeSet()
	 * @generated
	 */
	EAttribute getTrustworthinessAttributeSet_Kind();

	/**
	 * Returns the meta object for the attribute '{@link tvra.TrustworthinessAttributeSet#getTrustworthinessLevel <em>Trustworthiness Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trustworthiness Level</em>'.
	 * @see tvra.TrustworthinessAttributeSet#getTrustworthinessLevel()
	 * @see #getTrustworthinessAttributeSet()
	 * @generated
	 */
	EAttribute getTrustworthinessAttributeSet_TrustworthinessLevel();

	/**
	 * Returns the meta object for the reference '{@link tvra.TrustworthinessAttributeSet#getTvraasset <em>Tvraasset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tvraasset</em>'.
	 * @see tvra.TrustworthinessAttributeSet#getTvraasset()
	 * @see #getTrustworthinessAttributeSet()
	 * @generated
	 */
	EReference getTrustworthinessAttributeSet_Tvraasset();

	/**
	 * Returns the meta object for class '{@link tvra.ControlSet <em>Control Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Set</em>'.
	 * @see tvra.ControlSet
	 * @generated
	 */
	EClass getControlSet();

	/**
	 * Returns the meta object for the attribute '{@link tvra.ControlSet#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see tvra.ControlSet#getKind()
	 * @see #getControlSet()
	 * @generated
	 */
	EAttribute getControlSet_Kind();

	/**
	 * Returns the meta object for the reference '{@link tvra.ControlSet#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see tvra.ControlSet#getBase_Class()
	 * @see #getControlSet()
	 * @generated
	 */
	EReference getControlSet_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link tvra.ControlSet#isProposed <em>Is Proposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Proposed</em>'.
	 * @see tvra.ControlSet#isProposed()
	 * @see #getControlSet()
	 * @generated
	 */
	EAttribute getControlSet_IsProposed();

	/**
	 * Returns the meta object for the attribute '{@link tvra.ControlSet#getCoverageLevel <em>Coverage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coverage Level</em>'.
	 * @see tvra.ControlSet#getCoverageLevel()
	 * @see #getControlSet()
	 * @generated
	 */
	EAttribute getControlSet_CoverageLevel();

	/**
	 * Returns the meta object for the reference '{@link tvra.ControlSet#getTvraasset <em>Tvraasset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tvraasset</em>'.
	 * @see tvra.ControlSet#getTvraasset()
	 * @see #getControlSet()
	 * @generated
	 */
	EReference getControlSet_Tvraasset();

	/**
	 * Returns the meta object for class '{@link tvra.NetworkDomain <em>Network Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Domain</em>'.
	 * @see tvra.NetworkDomain
	 * @generated
	 */
	EClass getNetworkDomain();

	/**
	 * Returns the meta object for the reference '{@link tvra.NetworkDomain#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see tvra.NetworkDomain#getBase_Association()
	 * @see #getNetworkDomain()
	 * @generated
	 */
	EReference getNetworkDomain_Base_Association();

	/**
	 * Returns the meta object for the attribute '{@link tvra.NetworkDomain#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see tvra.NetworkDomain#getKind()
	 * @see #getNetworkDomain()
	 * @generated
	 */
	EAttribute getNetworkDomain_Kind();

	/**
	 * Returns the meta object for enum '{@link tvra.TRVAAssetKind <em>TRVA Asset Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TRVA Asset Kind</em>'.
	 * @see tvra.TRVAAssetKind
	 * @generated
	 */
	EEnum getTRVAAssetKind();

	/**
	 * Returns the meta object for enum '{@link tvra.MisbehaviourKind <em>Misbehaviour Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Misbehaviour Kind</em>'.
	 * @see tvra.MisbehaviourKind
	 * @generated
	 */
	EEnum getMisbehaviourKind();

	/**
	 * Returns the meta object for enum '{@link tvra.ImpactLevelKind <em>Impact Level Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Impact Level Kind</em>'.
	 * @see tvra.ImpactLevelKind
	 * @generated
	 */
	EEnum getImpactLevelKind();

	/**
	 * Returns the meta object for enum '{@link tvra.TWASKind <em>TWAS Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TWAS Kind</em>'.
	 * @see tvra.TWASKind
	 * @generated
	 */
	EEnum getTWASKind();

	/**
	 * Returns the meta object for enum '{@link tvra.TrustworthinessLevelKind <em>Trustworthiness Level Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trustworthiness Level Kind</em>'.
	 * @see tvra.TrustworthinessLevelKind
	 * @generated
	 */
	EEnum getTrustworthinessLevelKind();

	/**
	 * Returns the meta object for enum '{@link tvra.ControlSetKind <em>Control Set Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Set Kind</em>'.
	 * @see tvra.ControlSetKind
	 * @generated
	 */
	EEnum getControlSetKind();

	/**
	 * Returns the meta object for enum '{@link tvra.NetworkDomainKind <em>Network Domain Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Network Domain Kind</em>'.
	 * @see tvra.NetworkDomainKind
	 * @generated
	 */
	EEnum getNetworkDomainKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TvraFactory getTvraFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tvra.impl.TVRAAssetImpl <em>TVRA Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tvra.impl.TVRAAssetImpl
		 * @see tvra.impl.TvraPackageImpl#getTVRAAsset()
		 * @generated
		 */
		EClass TVRA_ASSET = eINSTANCE.getTVRAAsset();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TVRA_ASSET__BASE_CLASS = eINSTANCE.getTVRAAsset_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TVRA_ASSET__KIND = eINSTANCE.getTVRAAsset_Kind();

		/**
		 * The meta object literal for the '<em><b>Misbehaviours</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TVRA_ASSET__MISBEHAVIOURS = eINSTANCE.getTVRAAsset_Misbehaviours();

		/**
		 * The meta object literal for the '<em><b>Trustworthinessattributesets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TVRA_ASSET__TRUSTWORTHINESSATTRIBUTESETS = eINSTANCE.getTVRAAsset_Trustworthinessattributesets();

		/**
		 * The meta object literal for the '<em><b>Controlsets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TVRA_ASSET__CONTROLSETS = eINSTANCE.getTVRAAsset_Controlsets();

		/**
		 * The meta object literal for the '{@link tvra.impl.MisbehaviourImpl <em>Misbehaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tvra.impl.MisbehaviourImpl
		 * @see tvra.impl.TvraPackageImpl#getMisbehaviour()
		 * @generated
		 */
		EClass MISBEHAVIOUR = eINSTANCE.getMisbehaviour();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISBEHAVIOUR__KIND = eINSTANCE.getMisbehaviour_Kind();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISBEHAVIOUR__BASE_CLASS = eINSTANCE.getMisbehaviour_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Impact Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISBEHAVIOUR__IMPACT_LEVEL = eINSTANCE.getMisbehaviour_ImpactLevel();

		/**
		 * The meta object literal for the '<em><b>Tvraasset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISBEHAVIOUR__TVRAASSET = eINSTANCE.getMisbehaviour_Tvraasset();

		/**
		 * The meta object literal for the '{@link tvra.impl.TrustworthinessAttributeSetImpl <em>Trustworthiness Attribute Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tvra.impl.TrustworthinessAttributeSetImpl
		 * @see tvra.impl.TvraPackageImpl#getTrustworthinessAttributeSet()
		 * @generated
		 */
		EClass TRUSTWORTHINESS_ATTRIBUTE_SET = eINSTANCE.getTrustworthinessAttributeSet();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRUSTWORTHINESS_ATTRIBUTE_SET__BASE_CLASS = eINSTANCE.getTrustworthinessAttributeSet_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRUSTWORTHINESS_ATTRIBUTE_SET__KIND = eINSTANCE.getTrustworthinessAttributeSet_Kind();

		/**
		 * The meta object literal for the '<em><b>Trustworthiness Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRUSTWORTHINESS_ATTRIBUTE_SET__TRUSTWORTHINESS_LEVEL = eINSTANCE.getTrustworthinessAttributeSet_TrustworthinessLevel();

		/**
		 * The meta object literal for the '<em><b>Tvraasset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRUSTWORTHINESS_ATTRIBUTE_SET__TVRAASSET = eINSTANCE.getTrustworthinessAttributeSet_Tvraasset();

		/**
		 * The meta object literal for the '{@link tvra.impl.ControlSetImpl <em>Control Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tvra.impl.ControlSetImpl
		 * @see tvra.impl.TvraPackageImpl#getControlSet()
		 * @generated
		 */
		EClass CONTROL_SET = eINSTANCE.getControlSet();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_SET__KIND = eINSTANCE.getControlSet_Kind();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_SET__BASE_CLASS = eINSTANCE.getControlSet_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Is Proposed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_SET__IS_PROPOSED = eINSTANCE.getControlSet_IsProposed();

		/**
		 * The meta object literal for the '<em><b>Coverage Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_SET__COVERAGE_LEVEL = eINSTANCE.getControlSet_CoverageLevel();

		/**
		 * The meta object literal for the '<em><b>Tvraasset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_SET__TVRAASSET = eINSTANCE.getControlSet_Tvraasset();

		/**
		 * The meta object literal for the '{@link tvra.impl.NetworkDomainImpl <em>Network Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tvra.impl.NetworkDomainImpl
		 * @see tvra.impl.TvraPackageImpl#getNetworkDomain()
		 * @generated
		 */
		EClass NETWORK_DOMAIN = eINSTANCE.getNetworkDomain();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_DOMAIN__BASE_ASSOCIATION = eINSTANCE.getNetworkDomain_Base_Association();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_DOMAIN__KIND = eINSTANCE.getNetworkDomain_Kind();

		/**
		 * The meta object literal for the '{@link tvra.TRVAAssetKind <em>TRVA Asset Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tvra.TRVAAssetKind
		 * @see tvra.impl.TvraPackageImpl#getTRVAAssetKind()
		 * @generated
		 */
		EEnum TRVA_ASSET_KIND = eINSTANCE.getTRVAAssetKind();

		/**
		 * The meta object literal for the '{@link tvra.MisbehaviourKind <em>Misbehaviour Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tvra.MisbehaviourKind
		 * @see tvra.impl.TvraPackageImpl#getMisbehaviourKind()
		 * @generated
		 */
		EEnum MISBEHAVIOUR_KIND = eINSTANCE.getMisbehaviourKind();

		/**
		 * The meta object literal for the '{@link tvra.ImpactLevelKind <em>Impact Level Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tvra.ImpactLevelKind
		 * @see tvra.impl.TvraPackageImpl#getImpactLevelKind()
		 * @generated
		 */
		EEnum IMPACT_LEVEL_KIND = eINSTANCE.getImpactLevelKind();

		/**
		 * The meta object literal for the '{@link tvra.TWASKind <em>TWAS Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tvra.TWASKind
		 * @see tvra.impl.TvraPackageImpl#getTWASKind()
		 * @generated
		 */
		EEnum TWAS_KIND = eINSTANCE.getTWASKind();

		/**
		 * The meta object literal for the '{@link tvra.TrustworthinessLevelKind <em>Trustworthiness Level Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tvra.TrustworthinessLevelKind
		 * @see tvra.impl.TvraPackageImpl#getTrustworthinessLevelKind()
		 * @generated
		 */
		EEnum TRUSTWORTHINESS_LEVEL_KIND = eINSTANCE.getTrustworthinessLevelKind();

		/**
		 * The meta object literal for the '{@link tvra.ControlSetKind <em>Control Set Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tvra.ControlSetKind
		 * @see tvra.impl.TvraPackageImpl#getControlSetKind()
		 * @generated
		 */
		EEnum CONTROL_SET_KIND = eINSTANCE.getControlSetKind();

		/**
		 * The meta object literal for the '{@link tvra.NetworkDomainKind <em>Network Domain Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tvra.NetworkDomainKind
		 * @see tvra.impl.TvraPackageImpl#getNetworkDomainKind()
		 * @generated
		 */
		EEnum NETWORK_DOMAIN_KIND = eINSTANCE.getNetworkDomainKind();

	}

} //TvraPackage
