/**
 */
package tvra;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Misbehaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tvra.Misbehaviour#getKind <em>Kind</em>}</li>
 *   <li>{@link tvra.Misbehaviour#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link tvra.Misbehaviour#getImpactLevel <em>Impact Level</em>}</li>
 *   <li>{@link tvra.Misbehaviour#getTvraasset <em>Tvraasset</em>}</li>
 * </ul>
 *
 * @see tvra.TvraPackage#getMisbehaviour()
 * @model
 * @generated
 */
public interface Misbehaviour extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link tvra.MisbehaviourKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see tvra.MisbehaviourKind
	 * @see #setKind(MisbehaviourKind)
	 * @see tvra.TvraPackage#getMisbehaviour_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MisbehaviourKind getKind();

	/**
	 * Sets the value of the '{@link tvra.Misbehaviour#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see tvra.MisbehaviourKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(MisbehaviourKind value);

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see tvra.TvraPackage#getMisbehaviour_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link tvra.Misbehaviour#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Impact Level</b></em>' attribute.
	 * The literals are from the enumeration {@link tvra.ImpactLevelKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impact Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact Level</em>' attribute.
	 * @see tvra.ImpactLevelKind
	 * @see #setImpactLevel(ImpactLevelKind)
	 * @see tvra.TvraPackage#getMisbehaviour_ImpactLevel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ImpactLevelKind getImpactLevel();

	/**
	 * Sets the value of the '{@link tvra.Misbehaviour#getImpactLevel <em>Impact Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact Level</em>' attribute.
	 * @see tvra.ImpactLevelKind
	 * @see #getImpactLevel()
	 * @generated
	 */
	void setImpactLevel(ImpactLevelKind value);

	/**
	 * Returns the value of the '<em><b>Tvraasset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tvra.TVRAAsset#getMisbehaviours <em>Misbehaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tvraasset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tvraasset</em>' reference.
	 * @see #setTvraasset(TVRAAsset)
	 * @see tvra.TvraPackage#getMisbehaviour_Tvraasset()
	 * @see tvra.TVRAAsset#getMisbehaviours
	 * @model opposite="misbehaviours" required="true" ordered="false"
	 * @generated
	 */
	TVRAAsset getTvraasset();

	/**
	 * Sets the value of the '{@link tvra.Misbehaviour#getTvraasset <em>Tvraasset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tvraasset</em>' reference.
	 * @see #getTvraasset()
	 * @generated
	 */
	void setTvraasset(TVRAAsset value);

} // Misbehaviour
