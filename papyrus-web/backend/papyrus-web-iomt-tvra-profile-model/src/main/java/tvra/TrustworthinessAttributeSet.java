/**
 */
package tvra;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trustworthiness Attribute Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tvra.TrustworthinessAttributeSet#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link tvra.TrustworthinessAttributeSet#getKind <em>Kind</em>}</li>
 *   <li>{@link tvra.TrustworthinessAttributeSet#getTrustworthinessLevel <em>Trustworthiness Level</em>}</li>
 *   <li>{@link tvra.TrustworthinessAttributeSet#getTvraasset <em>Tvraasset</em>}</li>
 * </ul>
 *
 * @see tvra.TvraPackage#getTrustworthinessAttributeSet()
 * @model
 * @generated
 */
public interface TrustworthinessAttributeSet extends EObject {
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
	 * @see tvra.TvraPackage#getTrustworthinessAttributeSet_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link tvra.TrustworthinessAttributeSet#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link tvra.TWASKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see tvra.TWASKind
	 * @see #setKind(TWASKind)
	 * @see tvra.TvraPackage#getTrustworthinessAttributeSet_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TWASKind getKind();

	/**
	 * Sets the value of the '{@link tvra.TrustworthinessAttributeSet#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see tvra.TWASKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TWASKind value);

	/**
	 * Returns the value of the '<em><b>Trustworthiness Level</b></em>' attribute.
	 * The literals are from the enumeration {@link tvra.TrustworthinessLevelKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trustworthiness Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trustworthiness Level</em>' attribute.
	 * @see tvra.TrustworthinessLevelKind
	 * @see #setTrustworthinessLevel(TrustworthinessLevelKind)
	 * @see tvra.TvraPackage#getTrustworthinessAttributeSet_TrustworthinessLevel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TrustworthinessLevelKind getTrustworthinessLevel();

	/**
	 * Sets the value of the '{@link tvra.TrustworthinessAttributeSet#getTrustworthinessLevel <em>Trustworthiness Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trustworthiness Level</em>' attribute.
	 * @see tvra.TrustworthinessLevelKind
	 * @see #getTrustworthinessLevel()
	 * @generated
	 */
	void setTrustworthinessLevel(TrustworthinessLevelKind value);

	/**
	 * Returns the value of the '<em><b>Tvraasset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tvra.TVRAAsset#getTrustworthinessattributesets <em>Trustworthinessattributesets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tvraasset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tvraasset</em>' reference.
	 * @see #setTvraasset(TVRAAsset)
	 * @see tvra.TvraPackage#getTrustworthinessAttributeSet_Tvraasset()
	 * @see tvra.TVRAAsset#getTrustworthinessattributesets
	 * @model opposite="trustworthinessattributesets" required="true" ordered="false"
	 * @generated
	 */
	TVRAAsset getTvraasset();

	/**
	 * Sets the value of the '{@link tvra.TrustworthinessAttributeSet#getTvraasset <em>Tvraasset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tvraasset</em>' reference.
	 * @see #getTvraasset()
	 * @generated
	 */
	void setTvraasset(TVRAAsset value);

} // TrustworthinessAttributeSet
