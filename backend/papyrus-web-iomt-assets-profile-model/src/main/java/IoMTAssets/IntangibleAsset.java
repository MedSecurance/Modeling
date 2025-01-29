/**
 */
package IoMTAssets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intangible Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IoMTAssets.IntangibleAsset#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see IoMTAssets.IoMTAssetsPackage#getIntangibleAsset()
 * @model
 * @generated
 */
public interface IntangibleAsset extends Asset {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link IoMTAssets.IntangibleAssetKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see IoMTAssets.IntangibleAssetKind
     * @see #setKind(IntangibleAssetKind)
     * @see IoMTAssets.IoMTAssetsPackage#getIntangibleAsset_Kind()
     * @model required="true" ordered="false"
     * @generated
     */
    IntangibleAssetKind getKind();

    /**
     * Sets the value of the '{@link IoMTAssets.IntangibleAsset#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see IoMTAssets.IntangibleAssetKind
     * @see #getKind()
     * @generated
     */
    void setKind(IntangibleAssetKind value);

} // IntangibleAsset
