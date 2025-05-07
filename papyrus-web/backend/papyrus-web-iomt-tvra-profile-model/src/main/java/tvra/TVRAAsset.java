/**
 */
package tvra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TVRA Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tvra.TVRAAsset#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link tvra.TVRAAsset#getKind <em>Kind</em>}</li>
 *   <li>{@link tvra.TVRAAsset#getMisbehaviours <em>Misbehaviours</em>}</li>
 *   <li>{@link tvra.TVRAAsset#getTrustworthinessattributesets <em>Trustworthinessattributesets</em>}</li>
 *   <li>{@link tvra.TVRAAsset#getControlsets <em>Controlsets</em>}</li>
 * </ul>
 *
 * @see tvra.TvraPackage#getTVRAAsset()
 * @model
 * @generated
 */
public interface TVRAAsset extends EObject {
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
	 * @see tvra.TvraPackage#getTVRAAsset_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link tvra.TVRAAsset#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link tvra.TRVAAssetKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see tvra.TRVAAssetKind
	 * @see #setKind(TRVAAssetKind)
	 * @see tvra.TvraPackage#getTVRAAsset_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TRVAAssetKind getKind();

	/**
	 * Sets the value of the '{@link tvra.TVRAAsset#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see tvra.TRVAAssetKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TRVAAssetKind value);

	/**
	 * Returns the value of the '<em><b>Misbehaviours</b></em>' reference list.
	 * The list contents are of type {@link tvra.Misbehaviour}.
	 * It is bidirectional and its opposite is '{@link tvra.Misbehaviour#getTvraasset <em>Tvraasset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Misbehaviours</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Misbehaviours</em>' reference list.
	 * @see tvra.TvraPackage#getTVRAAsset_Misbehaviours()
	 * @see tvra.Misbehaviour#getTvraasset
	 * @model opposite="tvraasset" ordered="false"
	 * @generated
	 */
	EList<Misbehaviour> getMisbehaviours();

	/**
	 * Returns the value of the '<em><b>Trustworthinessattributesets</b></em>' reference list.
	 * The list contents are of type {@link tvra.TrustworthinessAttributeSet}.
	 * It is bidirectional and its opposite is '{@link tvra.TrustworthinessAttributeSet#getTvraasset <em>Tvraasset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trustworthinessattributesets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trustworthinessattributesets</em>' reference list.
	 * @see tvra.TvraPackage#getTVRAAsset_Trustworthinessattributesets()
	 * @see tvra.TrustworthinessAttributeSet#getTvraasset
	 * @model opposite="tvraasset" ordered="false"
	 * @generated
	 */
	EList<TrustworthinessAttributeSet> getTrustworthinessattributesets();

	/**
	 * Returns the value of the '<em><b>Controlsets</b></em>' reference list.
	 * The list contents are of type {@link tvra.ControlSet}.
	 * It is bidirectional and its opposite is '{@link tvra.ControlSet#getTvraasset <em>Tvraasset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlsets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlsets</em>' reference list.
	 * @see tvra.TvraPackage#getTVRAAsset_Controlsets()
	 * @see tvra.ControlSet#getTvraasset
	 * @model opposite="tvraasset" ordered="false"
	 * @generated
	 */
	EList<ControlSet> getControlsets();

} // TVRAAsset
