/**
 */
package IoMTAssets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IoMTAssets.Service#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see IoMTAssets.IoMTAssetsPackage#getService()
 * @model
 * @generated
 */
public interface Service extends Asset {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link IoMTAssets.ServiceKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see IoMTAssets.ServiceKind
     * @see #setKind(ServiceKind)
     * @see IoMTAssets.IoMTAssetsPackage#getService_Kind()
     * @model required="true" ordered="false"
     * @generated
     */
    ServiceKind getKind();

    /**
     * Sets the value of the '{@link IoMTAssets.Service#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see IoMTAssets.ServiceKind
     * @see #getKind()
     * @generated
     */
    void setKind(ServiceKind value);

} // Service
