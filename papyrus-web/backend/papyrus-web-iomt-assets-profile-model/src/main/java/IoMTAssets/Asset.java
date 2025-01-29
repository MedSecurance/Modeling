/**
 */
package IoMTAssets;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IoMTAssets.Asset#getKey <em>Key</em>}</li>
 *   <li>{@link IoMTAssets.Asset#getMissionName <em>Mission Name</em>}</li>
 *   <li>{@link IoMTAssets.Asset#getDescription <em>Description</em>}</li>
 *   <li>{@link IoMTAssets.Asset#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see IoMTAssets.IoMTAssetsPackage#getAsset()
 * @model abstract="true"
 * @generated
 */
public interface Asset extends EObject {
    /**
     * Returns the value of the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Key</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Key</em>' attribute.
     * @see #setKey(String)
     * @see IoMTAssets.IoMTAssetsPackage#getAsset_Key()
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     */
    String getKey();

    /**
     * Sets the value of the '{@link IoMTAssets.Asset#getKey <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key</em>' attribute.
     * @see #getKey()
     * @generated
     */
    void setKey(String value);

    /**
     * Returns the value of the '<em><b>Mission Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mission Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mission Name</em>' attribute.
     * @see #setMissionName(String)
     * @see IoMTAssets.IoMTAssetsPackage#getAsset_MissionName()
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     */
    String getMissionName();

    /**
     * Sets the value of the '{@link IoMTAssets.Asset#getMissionName <em>Mission Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mission Name</em>' attribute.
     * @see #getMissionName()
     * @generated
     */
    void setMissionName(String value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see IoMTAssets.IoMTAssetsPackage#getAsset_Description()
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link IoMTAssets.Asset#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

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
     * @see IoMTAssets.IoMTAssetsPackage#getAsset_Base_Class()
     * @model ordered="false"
     * @generated
     */
    org.eclipse.uml2.uml.Class getBase_Class();

    /**
     * Sets the value of the '{@link IoMTAssets.Asset#getBase_Class <em>Base Class</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Class</em>' reference.
     * @see #getBase_Class()
     * @generated
     */
    void setBase_Class(org.eclipse.uml2.uml.Class value);

} // Asset
