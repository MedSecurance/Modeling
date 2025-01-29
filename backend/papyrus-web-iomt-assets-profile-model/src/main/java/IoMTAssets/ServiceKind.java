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
 * A representation of the literals of the enumeration '<em><b>Service Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IoMTAssets.IoMTAssetsPackage#getServiceKind()
 * @model
 * @generated
 */
public enum ServiceKind implements Enumerator, EEnumLiteral{
    /**
     * The '<em><b>Remote Patient Monitoring</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REMOTE_PATIENT_MONITORING_VALUE
     * @generated
     * @ordered
     */
    REMOTE_PATIENT_MONITORING(0, "RemotePatientMonitoring", "RemotePatientMonitoring"),

    /**
     * The '<em><b>Infusion Pump</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INFUSION_PUMP_VALUE
     * @generated
     * @ordered
     */
    INFUSION_PUMP(1, "InfusionPump", "InfusionPump"),

    /**
     * The '<em><b>Stress Monitoring</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STRESS_MONITORING_VALUE
     * @generated
     * @ordered
     */
    STRESS_MONITORING(2, "StressMonitoring", "StressMonitoring"),

    /**
     * The '<em><b>Oxigen Level Monitoring</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OXIGEN_LEVEL_MONITORING_VALUE
     * @generated
     * @ordered
     */
    OXIGEN_LEVEL_MONITORING(3, "OxigenLevelMonitoring", "OxigenLevelMonitoring"),

    /**
     * The '<em><b>Heart Rate Monitoring</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HEART_RATE_MONITORING_VALUE
     * @generated
     * @ordered
     */
    HEART_RATE_MONITORING(4, "HeartRateMonitoring", "HeartRateMonitoring"),

    /**
     * The '<em><b>Glucose Monitoring</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GLUCOSE_MONITORING_VALUE
     * @generated
     * @ordered
     */
    GLUCOSE_MONITORING(5, "GlucoseMonitoring", "GlucoseMonitoring"),

    /**
     * The '<em><b>Thermometer Monitoring</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #THERMOMETER_MONITORING_VALUE
     * @generated
     * @ordered
     */
    THERMOMETER_MONITORING(6, "ThermometerMonitoring", "ThermometerMonitoring"),

    /**
     * The '<em><b>Data Storage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DATA_STORAGE_VALUE
     * @generated
     * @ordered
     */
    DATA_STORAGE(7, "DataStorage", "DataStorage"),

    /**
     * The '<em><b>Data Analysis</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DATA_ANALYSIS_VALUE
     * @generated
     * @ordered
     */
    DATA_ANALYSIS(8, "DataAnalysis", "DataAnalysis"),

    /**
     * The '<em><b>Emergency Response</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EMERGENCY_RESPONSE_VALUE
     * @generated
     * @ordered
     */
    EMERGENCY_RESPONSE(9, "EmergencyResponse", "EmergencyResponse"),

    /**
     * The '<em><b>Voice Based Health Assitants</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VOICE_BASED_HEALTH_ASSITANTS_VALUE
     * @generated
     * @ordered
     */
    VOICE_BASED_HEALTH_ASSITANTS(10, "VoiceBasedHealthAssitants", "VoiceBasedHealthAssitants"),

    /**
     * The '<em><b>Surgical Navigation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SURGICAL_NAVIGATION_VALUE
     * @generated
     * @ordered
     */
    SURGICAL_NAVIGATION(11, "SurgicalNavigation", "SurgicalNavigation"),

    /**
     * The '<em><b>Medical Image Analysis</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MEDICAL_IMAGE_ANALYSIS_VALUE
     * @generated
     * @ordered
     */
    MEDICAL_IMAGE_ANALYSIS(12, "MedicalImageAnalysis", "MedicalImageAnalysis"),

    /**
     * The '<em><b>Io MT Cybersecurity</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IO_MT_CYBERSECURITY_VALUE
     * @generated
     * @ordered
     */
    IO_MT_CYBERSECURITY(13, "IoMTCybersecurity", "IoMTCybersecurity"),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER(14, "Other", "Other");

    /**
     * The '<em><b>Remote Patient Monitoring</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REMOTE_PATIENT_MONITORING
     * @model name="RemotePatientMonitoring"
     * @generated
     * @ordered
     */
    public static final int REMOTE_PATIENT_MONITORING_VALUE = 0;

    /**
     * The '<em><b>Infusion Pump</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INFUSION_PUMP
     * @model name="InfusionPump"
     * @generated
     * @ordered
     */
    public static final int INFUSION_PUMP_VALUE = 1;

    /**
     * The '<em><b>Stress Monitoring</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STRESS_MONITORING
     * @model name="StressMonitoring"
     * @generated
     * @ordered
     */
    public static final int STRESS_MONITORING_VALUE = 2;

    /**
     * The '<em><b>Oxigen Level Monitoring</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OXIGEN_LEVEL_MONITORING
     * @model name="OxigenLevelMonitoring"
     * @generated
     * @ordered
     */
    public static final int OXIGEN_LEVEL_MONITORING_VALUE = 3;

    /**
     * The '<em><b>Heart Rate Monitoring</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HEART_RATE_MONITORING
     * @model name="HeartRateMonitoring"
     * @generated
     * @ordered
     */
    public static final int HEART_RATE_MONITORING_VALUE = 4;

    /**
     * The '<em><b>Glucose Monitoring</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GLUCOSE_MONITORING
     * @model name="GlucoseMonitoring"
     * @generated
     * @ordered
     */
    public static final int GLUCOSE_MONITORING_VALUE = 5;

    /**
     * The '<em><b>Thermometer Monitoring</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #THERMOMETER_MONITORING
     * @model name="ThermometerMonitoring"
     * @generated
     * @ordered
     */
    public static final int THERMOMETER_MONITORING_VALUE = 6;

    /**
     * The '<em><b>Data Storage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DATA_STORAGE
     * @model name="DataStorage"
     * @generated
     * @ordered
     */
    public static final int DATA_STORAGE_VALUE = 7;

    /**
     * The '<em><b>Data Analysis</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DATA_ANALYSIS
     * @model name="DataAnalysis"
     * @generated
     * @ordered
     */
    public static final int DATA_ANALYSIS_VALUE = 8;

    /**
     * The '<em><b>Emergency Response</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EMERGENCY_RESPONSE
     * @model name="EmergencyResponse"
     * @generated
     * @ordered
     */
    public static final int EMERGENCY_RESPONSE_VALUE = 9;

    /**
     * The '<em><b>Voice Based Health Assitants</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VOICE_BASED_HEALTH_ASSITANTS
     * @model name="VoiceBasedHealthAssitants"
     * @generated
     * @ordered
     */
    public static final int VOICE_BASED_HEALTH_ASSITANTS_VALUE = 10;

    /**
     * The '<em><b>Surgical Navigation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SURGICAL_NAVIGATION
     * @model name="SurgicalNavigation"
     * @generated
     * @ordered
     */
    public static final int SURGICAL_NAVIGATION_VALUE = 11;

    /**
     * The '<em><b>Medical Image Analysis</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MEDICAL_IMAGE_ANALYSIS
     * @model name="MedicalImageAnalysis"
     * @generated
     * @ordered
     */
    public static final int MEDICAL_IMAGE_ANALYSIS_VALUE = 12;

    /**
     * The '<em><b>Io MT Cybersecurity</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IO_MT_CYBERSECURITY
     * @model name="IoMTCybersecurity"
     * @generated
     * @ordered
     */
    public static final int IO_MT_CYBERSECURITY_VALUE = 13;

    /**
     * The '<em><b>Other</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER
     * @model name="Other"
     * @generated
     * @ordered
     */
    public static final int OTHER_VALUE = 14;

    /**
     * An array of all the '<em><b>Service Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ServiceKind[] VALUES_ARRAY =
        new ServiceKind[] {
            REMOTE_PATIENT_MONITORING,
            INFUSION_PUMP,
            STRESS_MONITORING,
            OXIGEN_LEVEL_MONITORING,
            HEART_RATE_MONITORING,
            GLUCOSE_MONITORING,
            THERMOMETER_MONITORING,
            DATA_STORAGE,
            DATA_ANALYSIS,
            EMERGENCY_RESPONSE,
            VOICE_BASED_HEALTH_ASSITANTS,
            SURGICAL_NAVIGATION,
            MEDICAL_IMAGE_ANALYSIS,
            IO_MT_CYBERSECURITY,
            OTHER,
        };

    /**
     * A public read-only list of all the '<em><b>Service Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ServiceKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Service Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ServiceKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ServiceKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Service Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ServiceKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ServiceKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Service Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ServiceKind get(int value) {
        switch (value) {
            case REMOTE_PATIENT_MONITORING_VALUE: return REMOTE_PATIENT_MONITORING;
            case INFUSION_PUMP_VALUE: return INFUSION_PUMP;
            case STRESS_MONITORING_VALUE: return STRESS_MONITORING;
            case OXIGEN_LEVEL_MONITORING_VALUE: return OXIGEN_LEVEL_MONITORING;
            case HEART_RATE_MONITORING_VALUE: return HEART_RATE_MONITORING;
            case GLUCOSE_MONITORING_VALUE: return GLUCOSE_MONITORING;
            case THERMOMETER_MONITORING_VALUE: return THERMOMETER_MONITORING;
            case DATA_STORAGE_VALUE: return DATA_STORAGE;
            case DATA_ANALYSIS_VALUE: return DATA_ANALYSIS;
            case EMERGENCY_RESPONSE_VALUE: return EMERGENCY_RESPONSE;
            case VOICE_BASED_HEALTH_ASSITANTS_VALUE: return VOICE_BASED_HEALTH_ASSITANTS;
            case SURGICAL_NAVIGATION_VALUE: return SURGICAL_NAVIGATION;
            case MEDICAL_IMAGE_ANALYSIS_VALUE: return MEDICAL_IMAGE_ANALYSIS;
            case IO_MT_CYBERSECURITY_VALUE: return IO_MT_CYBERSECURITY;
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
    private ServiceKind(int value, String name, String literal) {
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
	
    
} //ServiceKind
