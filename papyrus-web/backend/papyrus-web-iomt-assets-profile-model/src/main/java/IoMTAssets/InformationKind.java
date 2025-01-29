/**
 */
package IoMTAssets;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Information Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IoMTAssets.IoMTAssetsPackage#getInformationKind()
 * @model
 * @generated
 */
public enum InformationKind implements Enumerator, EEnumLiteral {
    /**
     * The '<em><b>Patient Personal Data</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PATIENT_PERSONAL_DATA_VALUE
     * @generated
     * @ordered
     */
    PATIENT_PERSONAL_DATA(0, "PatientPersonalData", "PatientPersonalData"),

    /**
     * The '<em><b>Patient Health Records</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PATIENT_HEALTH_RECORDS_VALUE
     * @generated
     * @ordered
     */
    PATIENT_HEALTH_RECORDS(1, "PatientHealthRecords", "PatientHealthRecords"),

    /**
     * The '<em><b>Real Time Patient Data</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REAL_TIME_PATIENT_DATA_VALUE
     * @generated
     * @ordered
     */
    REAL_TIME_PATIENT_DATA(2, "RealTimePatientData", "RealTimePatientData"),

    /**
     * The '<em><b>Insurance And Billing</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INSURANCE_AND_BILLING_VALUE
     * @generated
     * @ordered
     */
    INSURANCE_AND_BILLING(3, "InsuranceAndBilling", "InsuranceAndBilling"),

    /**
     * The '<em><b>Device Sensor Data</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEVICE_SENSOR_DATA_VALUE
     * @generated
     * @ordered
     */
    DEVICE_SENSOR_DATA(4, "DeviceSensorData", "DeviceSensorData"),

    /**
     * The '<em><b>Staff User Data</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STAFF_USER_DATA_VALUE
     * @generated
     * @ordered
     */
    STAFF_USER_DATA(5, "StaffUserData", "StaffUserData"),

    /**
     * The '<em><b>Third Party Data</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #THIRD_PARTY_DATA_VALUE
     * @generated
     * @ordered
     */
    THIRD_PARTY_DATA(6, "ThirdPartyData", "ThirdPartyData"),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER(7, "Other", "Other");

    /**
     * The '<em><b>Patient Personal Data</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PATIENT_PERSONAL_DATA
     * @model name="PatientPersonalData"
     * @generated
     * @ordered
     */
    public static final int PATIENT_PERSONAL_DATA_VALUE = 0;

    /**
     * The '<em><b>Patient Health Records</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PATIENT_HEALTH_RECORDS
     * @model name="PatientHealthRecords"
     * @generated
     * @ordered
     */
    public static final int PATIENT_HEALTH_RECORDS_VALUE = 1;

    /**
     * The '<em><b>Real Time Patient Data</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REAL_TIME_PATIENT_DATA
     * @model name="RealTimePatientData"
     * @generated
     * @ordered
     */
    public static final int REAL_TIME_PATIENT_DATA_VALUE = 2;

    /**
     * The '<em><b>Insurance And Billing</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INSURANCE_AND_BILLING
     * @model name="InsuranceAndBilling"
     * @generated
     * @ordered
     */
    public static final int INSURANCE_AND_BILLING_VALUE = 3;

    /**
     * The '<em><b>Device Sensor Data</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEVICE_SENSOR_DATA
     * @model name="DeviceSensorData"
     * @generated
     * @ordered
     */
    public static final int DEVICE_SENSOR_DATA_VALUE = 4;

    /**
     * The '<em><b>Staff User Data</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STAFF_USER_DATA
     * @model name="StaffUserData"
     * @generated
     * @ordered
     */
    public static final int STAFF_USER_DATA_VALUE = 5;

    /**
     * The '<em><b>Third Party Data</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #THIRD_PARTY_DATA
     * @model name="ThirdPartyData"
     * @generated
     * @ordered
     */
    public static final int THIRD_PARTY_DATA_VALUE = 6;

    /**
     * The '<em><b>Other</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER
     * @model name="Other"
     * @generated
     * @ordered
     */
    public static final int OTHER_VALUE = 7;

    /**
     * An array of all the '<em><b>Information Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final InformationKind[] VALUES_ARRAY =
        new InformationKind[] {
            PATIENT_PERSONAL_DATA,
            PATIENT_HEALTH_RECORDS,
            REAL_TIME_PATIENT_DATA,
            INSURANCE_AND_BILLING,
            DEVICE_SENSOR_DATA,
            STAFF_USER_DATA,
            THIRD_PARTY_DATA,
            OTHER,
        };

    /**
     * A public read-only list of all the '<em><b>Information Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<InformationKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Information Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InformationKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            InformationKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Information Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InformationKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            InformationKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Information Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InformationKind get(int value) {
        switch (value) {
            case PATIENT_PERSONAL_DATA_VALUE: return PATIENT_PERSONAL_DATA;
            case PATIENT_HEALTH_RECORDS_VALUE: return PATIENT_HEALTH_RECORDS;
            case REAL_TIME_PATIENT_DATA_VALUE: return REAL_TIME_PATIENT_DATA;
            case INSURANCE_AND_BILLING_VALUE: return INSURANCE_AND_BILLING;
            case DEVICE_SENSOR_DATA_VALUE: return DEVICE_SENSOR_DATA;
            case STAFF_USER_DATA_VALUE: return STAFF_USER_DATA;
            case THIRD_PARTY_DATA_VALUE: return THIRD_PARTY_DATA;
            case OTHER_VALUE: return OTHER;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private InformationKind(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

	@Override
	public void setName(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EList<EAnnotation> getEAnnotations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EAnnotation getEAnnotation(String source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EClass eClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resource eResource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EObject eContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EReference eContainmentFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<EObject> eContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeIterator<EObject> eAllContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eIsProxy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<EObject> eCrossReferences() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature feature, boolean resolve) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eSet(EStructuralFeature feature, Object newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean eIsSet(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eUnset(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Adapter> eAdapters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eDeliver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eNotify(Notification notification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setValue(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Enumerator getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInstance(Enumerator value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLiteral(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EEnum getEEnum() {
		// TODO Auto-generated method stub
		return null;
	}

	
    
} //InformationKind
