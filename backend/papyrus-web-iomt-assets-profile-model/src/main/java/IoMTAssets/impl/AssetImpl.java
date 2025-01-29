/**
 */
package IoMTAssets.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import IoMTAssets.Asset;
import IoMTAssets.IoMTAssetsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link IoMTAssets.impl.AssetImpl#getKey <em>Key</em>}</li>
 *   <li>{@link IoMTAssets.impl.AssetImpl#getMissionName <em>Mission Name</em>}</li>
 *   <li>{@link IoMTAssets.impl.AssetImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link IoMTAssets.impl.AssetImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssetImpl extends MinimalEObjectImpl.Container implements Asset {
    /**
     * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKey()
     * @generated
     * @ordered
     */
    protected static final String KEY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKey()
     * @generated
     * @ordered
     */
    protected String key = KEY_EDEFAULT;

    /**
     * The default value of the '{@link #getMissionName() <em>Mission Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMissionName()
     * @generated
     * @ordered
     */
    protected static final String MISSION_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMissionName() <em>Mission Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMissionName()
     * @generated
     * @ordered
     */
    protected String missionName = MISSION_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBase_Class()
     * @generated
     * @ordered
     */
    protected org.eclipse.uml2.uml.Class base_Class;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IoMTAssetsPackage.Literals.ASSET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getKey() {
        return key;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKey(String newKey) {
        String oldKey = key;
        key = newKey;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IoMTAssetsPackage.ASSET__KEY, oldKey, key));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMissionName() {
        return missionName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMissionName(String newMissionName) {
        String oldMissionName = missionName;
        missionName = newMissionName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IoMTAssetsPackage.ASSET__MISSION_NAME, oldMissionName, missionName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IoMTAssetsPackage.ASSET__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public org.eclipse.uml2.uml.Class getBase_Class() {
        if (base_Class != null && base_Class.eIsProxy()) {
            InternalEObject oldBase_Class = (InternalEObject)base_Class;
            base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
            if (base_Class != oldBase_Class) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoMTAssetsPackage.ASSET__BASE_CLASS, oldBase_Class, base_Class));
            }
        }
        return base_Class;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.uml2.uml.Class basicGetBase_Class() {
        return base_Class;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
        org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
        base_Class = newBase_Class;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IoMTAssetsPackage.ASSET__BASE_CLASS, oldBase_Class, base_Class));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case IoMTAssetsPackage.ASSET__KEY:
                return getKey();
            case IoMTAssetsPackage.ASSET__MISSION_NAME:
                return getMissionName();
            case IoMTAssetsPackage.ASSET__DESCRIPTION:
                return getDescription();
            case IoMTAssetsPackage.ASSET__BASE_CLASS:
                if (resolve) return getBase_Class();
                return basicGetBase_Class();
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
            case IoMTAssetsPackage.ASSET__KEY:
                setKey((String)newValue);
                return;
            case IoMTAssetsPackage.ASSET__MISSION_NAME:
                setMissionName((String)newValue);
                return;
            case IoMTAssetsPackage.ASSET__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case IoMTAssetsPackage.ASSET__BASE_CLASS:
                setBase_Class((org.eclipse.uml2.uml.Class)newValue);
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
            case IoMTAssetsPackage.ASSET__KEY:
                setKey(KEY_EDEFAULT);
                return;
            case IoMTAssetsPackage.ASSET__MISSION_NAME:
                setMissionName(MISSION_NAME_EDEFAULT);
                return;
            case IoMTAssetsPackage.ASSET__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case IoMTAssetsPackage.ASSET__BASE_CLASS:
                setBase_Class((org.eclipse.uml2.uml.Class)null);
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
            case IoMTAssetsPackage.ASSET__KEY:
                return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
            case IoMTAssetsPackage.ASSET__MISSION_NAME:
                return MISSION_NAME_EDEFAULT == null ? missionName != null : !MISSION_NAME_EDEFAULT.equals(missionName);
            case IoMTAssetsPackage.ASSET__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case IoMTAssetsPackage.ASSET__BASE_CLASS:
                return base_Class != null;
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
        result.append(" (key: ");
        result.append(key);
        result.append(", missionName: ");
        result.append(missionName);
        result.append(", description: ");
        result.append(description);
        result.append(')');
        return result.toString();
    }

} //AssetImpl
