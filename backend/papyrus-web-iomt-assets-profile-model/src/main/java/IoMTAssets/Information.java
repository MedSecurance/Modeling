/**
 */
package IoMTAssets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IoMTAssets.Information#getLocation <em>Location</em>}</li>
 *   <li>{@link IoMTAssets.Information#getRecord <em>Record</em>}</li>
 *   <li>{@link IoMTAssets.Information#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see IoMTAssets.IoMTAssetsPackage#getInformation()
 * @model
 * @generated
 */
public interface Information extends Asset {
    /**
     * Returns the value of the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location</em>' attribute.
     * @see #setLocation(String)
     * @see IoMTAssets.IoMTAssetsPackage#getInformation_Location()
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     */
    String getLocation();

    /**
     * Sets the value of the '{@link IoMTAssets.Information#getLocation <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' attribute.
     * @see #getLocation()
     * @generated
     */
    void setLocation(String value);

    /**
     * Returns the value of the '<em><b>Record</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Record</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Record</em>' attribute.
     * @see #setRecord(String)
     * @see IoMTAssets.IoMTAssetsPackage#getInformation_Record()
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     */
    String getRecord();

    /**
     * Sets the value of the '{@link IoMTAssets.Information#getRecord <em>Record</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Record</em>' attribute.
     * @see #getRecord()
     * @generated
     */
    void setRecord(String value);

    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link IoMTAssets.InformationKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see IoMTAssets.InformationKind
     * @see #setKind(InformationKind)
     * @see IoMTAssets.IoMTAssetsPackage#getInformation_Kind()
     * @model required="true" ordered="false"
     * @generated
     */
    InformationKind getKind();

    /**
     * Sets the value of the '{@link IoMTAssets.Information#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see IoMTAssets.InformationKind
     * @see #getKind()
     * @generated
     */
    void setKind(InformationKind value);

} // Information
