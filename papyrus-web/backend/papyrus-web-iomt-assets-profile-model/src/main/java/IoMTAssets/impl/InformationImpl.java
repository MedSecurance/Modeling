/**
 */
package IoMTAssets.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EEnumLiteralImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import IoMTAssets.Information;
import IoMTAssets.InformationKind;
import IoMTAssets.IoMTAssetsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link IoMTAssets.impl.InformationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link IoMTAssets.impl.InformationImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link IoMTAssets.impl.InformationImpl#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InformationImpl extends AssetImpl implements Information {
    /**
     * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected static final String LOCATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected String location = LOCATION_EDEFAULT;

    /**
     * The default value of the '{@link #getRecord() <em>Record</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRecord()
     * @generated
     * @ordered
     */
    protected static final String RECORD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRecord() <em>Record</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRecord()
     * @generated
     * @ordered
     */
    protected String record = RECORD_EDEFAULT;

    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final InformationKind KIND_EDEFAULT = InformationKind.PATIENT_PERSONAL_DATA;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected InformationKind kind = KIND_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InformationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IoMTAssetsPackage.Literals.INFORMATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLocation() {
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLocation(String newLocation) {
        String oldLocation = location;
        location = newLocation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IoMTAssetsPackage.INFORMATION__LOCATION, oldLocation, location));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRecord() {
        return record;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRecord(String newRecord) {
        String oldRecord = record;
        record = newRecord;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IoMTAssetsPackage.INFORMATION__RECORD, oldRecord, record));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InformationKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind(InformationKind newKind) {
        InformationKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IoMTAssetsPackage.INFORMATION__KIND, oldKind, kind));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case IoMTAssetsPackage.INFORMATION__LOCATION:
                return getLocation();
            case IoMTAssetsPackage.INFORMATION__RECORD:
                return getRecord();
            case IoMTAssetsPackage.INFORMATION__KIND:
                return getKind();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case IoMTAssetsPackage.INFORMATION__LOCATION:
                setLocation((String)newValue);
                return;
            case IoMTAssetsPackage.INFORMATION__RECORD:
                setRecord((String)newValue);
                return;
            case IoMTAssetsPackage.INFORMATION__KIND:
            	if (newValue instanceof InformationKind)
            		setKind((InformationKind)newValue);
            	else 
            		setKind(InformationKind.get(((EEnumLiteralImpl)newValue).getValue()));
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case IoMTAssetsPackage.INFORMATION__LOCATION:
                setLocation(LOCATION_EDEFAULT);
                return;
            case IoMTAssetsPackage.INFORMATION__RECORD:
                setRecord(RECORD_EDEFAULT);
                return;
            case IoMTAssetsPackage.INFORMATION__KIND:
                setKind(KIND_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case IoMTAssetsPackage.INFORMATION__LOCATION:
                return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
            case IoMTAssetsPackage.INFORMATION__RECORD:
                return RECORD_EDEFAULT == null ? record != null : !RECORD_EDEFAULT.equals(record);
            case IoMTAssetsPackage.INFORMATION__KIND:
                return kind != KIND_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (location: ");
        result.append(location);
        result.append(", record: ");
        result.append(record);
        result.append(", kind: ");
        result.append(kind);
        result.append(')');
        return result.toString();
    }

} //InformationImpl
