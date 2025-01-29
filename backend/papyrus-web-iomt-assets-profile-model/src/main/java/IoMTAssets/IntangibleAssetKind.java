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
 * A representation of the literals of the enumeration '<em><b>Intangible Asset Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IoMTAssets.IoMTAssetsPackage#getIntangibleAssetKind()
 * @model
 * @generated
 */
public enum IntangibleAssetKind implements Enumerator, EEnumLiteral {
    /**
     * The '<em><b>Hospital Reputation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HOSPITAL_REPUTATION_VALUE
     * @generated
     * @ordered
     */
    HOSPITAL_REPUTATION(0, "HospitalReputation", "HospitalReputation"),

    /**
     * The '<em><b>Io MT Brand Equity</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IO_MT_BRAND_EQUITY_VALUE
     * @generated
     * @ordered
     */
    IO_MT_BRAND_EQUITY(1, "IoMTBrandEquity", "IoMTBrandEquity"),

    /**
     * The '<em><b>Patient Satisfaction</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PATIENT_SATISFACTION_VALUE
     * @generated
     * @ordered
     */
    PATIENT_SATISFACTION(2, "PatientSatisfaction", "PatientSatisfaction"),

    /**
     * The '<em><b>Data Privacy Security Trust</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DATA_PRIVACY_SECURITY_TRUST_VALUE
     * @generated
     * @ordered
     */
    DATA_PRIVACY_SECURITY_TRUST(3, "DataPrivacySecurityTrust", "DataPrivacySecurityTrust"),

    /**
     * The '<em><b>Intellectual Property</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INTELLECTUAL_PROPERTY_VALUE
     * @generated
     * @ordered
     */
    INTELLECTUAL_PROPERTY(4, "IntellectualProperty", "IntellectualProperty"),

    /**
     * The '<em><b>Licences</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LICENCES_VALUE
     * @generated
     * @ordered
     */
    LICENCES(5, "Licences", "Licences"),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER(6, "Other", "Other");

    /**
     * The '<em><b>Hospital Reputation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HOSPITAL_REPUTATION
     * @model name="HospitalReputation"
     * @generated
     * @ordered
     */
    public static final int HOSPITAL_REPUTATION_VALUE = 0;

    /**
     * The '<em><b>Io MT Brand Equity</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IO_MT_BRAND_EQUITY
     * @model name="IoMTBrandEquity"
     * @generated
     * @ordered
     */
    public static final int IO_MT_BRAND_EQUITY_VALUE = 1;

    /**
     * The '<em><b>Patient Satisfaction</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PATIENT_SATISFACTION
     * @model name="PatientSatisfaction"
     * @generated
     * @ordered
     */
    public static final int PATIENT_SATISFACTION_VALUE = 2;

    /**
     * The '<em><b>Data Privacy Security Trust</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DATA_PRIVACY_SECURITY_TRUST
     * @model name="DataPrivacySecurityTrust"
     * @generated
     * @ordered
     */
    public static final int DATA_PRIVACY_SECURITY_TRUST_VALUE = 3;

    /**
     * The '<em><b>Intellectual Property</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INTELLECTUAL_PROPERTY
     * @model name="IntellectualProperty"
     * @generated
     * @ordered
     */
    public static final int INTELLECTUAL_PROPERTY_VALUE = 4;

    /**
     * The '<em><b>Licences</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LICENCES
     * @model name="Licences"
     * @generated
     * @ordered
     */
    public static final int LICENCES_VALUE = 5;

    /**
     * The '<em><b>Other</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER
     * @model name="Other"
     * @generated
     * @ordered
     */
    public static final int OTHER_VALUE = 6;

    /**
     * An array of all the '<em><b>Intangible Asset Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final IntangibleAssetKind[] VALUES_ARRAY =
        new IntangibleAssetKind[] {
            HOSPITAL_REPUTATION,
            IO_MT_BRAND_EQUITY,
            PATIENT_SATISFACTION,
            DATA_PRIVACY_SECURITY_TRUST,
            INTELLECTUAL_PROPERTY,
            LICENCES,
            OTHER,
        };

    /**
     * A public read-only list of all the '<em><b>Intangible Asset Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<IntangibleAssetKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Intangible Asset Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IntangibleAssetKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            IntangibleAssetKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Intangible Asset Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IntangibleAssetKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            IntangibleAssetKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Intangible Asset Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IntangibleAssetKind get(int value) {
        switch (value) {
            case HOSPITAL_REPUTATION_VALUE: return HOSPITAL_REPUTATION;
            case IO_MT_BRAND_EQUITY_VALUE: return IO_MT_BRAND_EQUITY;
            case PATIENT_SATISFACTION_VALUE: return PATIENT_SATISFACTION;
            case DATA_PRIVACY_SECURITY_TRUST_VALUE: return DATA_PRIVACY_SECURITY_TRUST;
            case INTELLECTUAL_PROPERTY_VALUE: return INTELLECTUAL_PROPERTY;
            case LICENCES_VALUE: return LICENCES;
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
    private IntangibleAssetKind(int value, String name, String literal) {
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
    
} //IntangibleAssetKind
