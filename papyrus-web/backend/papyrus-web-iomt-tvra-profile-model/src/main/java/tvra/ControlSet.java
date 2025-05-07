/**
 */
package tvra;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tvra.ControlSet#getKind <em>Kind</em>}</li>
 *   <li>{@link tvra.ControlSet#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link tvra.ControlSet#isProposed <em>Is Proposed</em>}</li>
 *   <li>{@link tvra.ControlSet#getCoverageLevel <em>Coverage Level</em>}</li>
 *   <li>{@link tvra.ControlSet#getTvraasset <em>Tvraasset</em>}</li>
 * </ul>
 *
 * @see tvra.TvraPackage#getControlSet()
 * @model
 * @generated
 */
public interface ControlSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link tvra.ControlSetKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see tvra.ControlSetKind
	 * @see #setKind(ControlSetKind)
	 * @see tvra.TvraPackage#getControlSet_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ControlSetKind getKind();

	/**
	 * Sets the value of the '{@link tvra.ControlSet#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see tvra.ControlSetKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ControlSetKind value);

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
	 * @see tvra.TvraPackage#getControlSet_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link tvra.ControlSet#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Is Proposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Proposed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Proposed</em>' attribute.
	 * @see #setIsProposed(boolean)
	 * @see tvra.TvraPackage#getControlSet_IsProposed()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isProposed();

	/**
	 * Sets the value of the '{@link tvra.ControlSet#isProposed <em>Is Proposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Proposed</em>' attribute.
	 * @see #isProposed()
	 * @generated
	 */
	void setIsProposed(boolean value);

	/**
	 * Returns the value of the '<em><b>Coverage Level</b></em>' attribute.
	 * The literals are from the enumeration {@link tvra.TrustworthinessLevelKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coverage Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage Level</em>' attribute.
	 * @see tvra.TrustworthinessLevelKind
	 * @see #setCoverageLevel(TrustworthinessLevelKind)
	 * @see tvra.TvraPackage#getControlSet_CoverageLevel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TrustworthinessLevelKind getCoverageLevel();

	/**
	 * Sets the value of the '{@link tvra.ControlSet#getCoverageLevel <em>Coverage Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Level</em>' attribute.
	 * @see tvra.TrustworthinessLevelKind
	 * @see #getCoverageLevel()
	 * @generated
	 */
	void setCoverageLevel(TrustworthinessLevelKind value);

	/**
	 * Returns the value of the '<em><b>Tvraasset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tvra.TVRAAsset#getControlsets <em>Controlsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tvraasset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tvraasset</em>' reference.
	 * @see #setTvraasset(TVRAAsset)
	 * @see tvra.TvraPackage#getControlSet_Tvraasset()
	 * @see tvra.TVRAAsset#getControlsets
	 * @model opposite="controlsets" required="true" ordered="false"
	 * @generated
	 */
	TVRAAsset getTvraasset();

	/**
	 * Sets the value of the '{@link tvra.ControlSet#getTvraasset <em>Tvraasset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tvraasset</em>' reference.
	 * @see #getTvraasset()
	 * @generated
	 */
	void setTvraasset(TVRAAsset value);

} // ControlSet
