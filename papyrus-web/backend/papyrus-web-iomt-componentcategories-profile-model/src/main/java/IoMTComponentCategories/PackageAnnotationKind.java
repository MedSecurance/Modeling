/**
 */
package IoMTComponentCategories;

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
 * A representation of the literals of the enumeration '<em><b>Package Annotation Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IoMTComponentCategories.IoMTComponentCategoriesPackage#getPackageAnnotationKind()
 * @model
 * @generated
 */
public enum PackageAnnotationKind implements Enumerator, EEnumLiteral {
	/**
	 * The '<em><b>Development And Test Environment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPMENT_AND_TEST_ENVIRONMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEVELOPMENT_AND_TEST_ENVIRONMENT(0, "developmentAndTestEnvironment", "developmentAndTestEnvironment"),

	/**
	 * The '<em><b>Documentation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENTATION(1, "documentation", "documentation"),

	/**
	 * The '<em><b>Region And Cultural Norms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGION_AND_CULTURAL_NORMS_VALUE
	 * @generated
	 * @ordered
	 */
	REGION_AND_CULTURAL_NORMS(2, "regionAndCulturalNorms", "regionAndCulturalNorms"),

	/**
	 * The '<em><b>Physical Security</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	PHYSICAL_SECURITY(3, "physicalSecurity", "physicalSecurity"),

	/**
	 * The '<em><b>Security Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY_CONTROL(4, "securityControl", "securityControl"),

	/**
	 * The '<em><b>Access To Source Code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_TO_SOURCE_CODE_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS_TO_SOURCE_CODE(5, "accessToSourceCode", "accessToSourceCode"),

	/**
	 * The '<em><b>Information Processing Facility</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATION_PROCESSING_FACILITY_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMATION_PROCESSING_FACILITY(6, "informationProcessingFacility", "informationProcessingFacility"),

	/**
	 * The '<em><b>Information Management System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATION_MANAGEMENT_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMATION_MANAGEMENT_SYSTEM(7, "informationManagementSystem", "informationManagementSystem"),

	/**
	 * The '<em><b>Healthcare Delivery Organisation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEALTHCARE_DELIVERY_ORGANISATION_VALUE
	 * @generated
	 * @ordered
	 */
	HEALTHCARE_DELIVERY_ORGANISATION(8, "healthcareDeliveryOrganisation", "healthcareDeliveryOrganisation"),

	/**
	 * The '<em><b>Secury System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURY_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	SECURY_SYSTEM(9, "securySystem", "securySystem"),

	/**
	 * The '<em><b>Trusted Module</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUSTED_MODULE_VALUE
	 * @generated
	 * @ordered
	 */
	TRUSTED_MODULE(10, "trustedModule", "trustedModule"),

	/**
	 * The '<em><b>Final Product</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINAL_PRODUCT_VALUE
	 * @generated
	 * @ordered
	 */
	FINAL_PRODUCT(11, "finalProduct", "finalProduct"),

	/**
	 * The '<em><b>Smart Device App</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMART_DEVICE_APP_VALUE
	 * @generated
	 * @ordered
	 */
	SMART_DEVICE_APP(12, "smartDeviceApp", "smartDeviceApp"),

	/**
	 * The '<em><b>Medical IT Network</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICAL_IT_NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICAL_IT_NETWORK(13, "medicalITNetwork", "medicalITNetwork"),

	/**
	 * The '<em><b>Secure Communication Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_COMMUNICATION_CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	SECURE_COMMUNICATION_CHANNEL(14, "secureCommunicationChannel", "secureCommunicationChannel"),

	/**
	 * The '<em><b>Similar Medical IT Network</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMILAR_MEDICAL_IT_NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	SIMILAR_MEDICAL_IT_NETWORK(15, "similarMedicalITNetwork", "similarMedicalITNetwork");

	/**
	 * The '<em><b>Development And Test Environment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPMENT_AND_TEST_ENVIRONMENT
	 * @model name="developmentAndTestEnvironment"
	 * @generated
	 * @ordered
	 */
	public static final int DEVELOPMENT_AND_TEST_ENVIRONMENT_VALUE = 0;

	/**
	 * The '<em><b>Documentation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENTATION
	 * @model name="documentation"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENTATION_VALUE = 1;

	/**
	 * The '<em><b>Region And Cultural Norms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGION_AND_CULTURAL_NORMS
	 * @model name="regionAndCulturalNorms"
	 * @generated
	 * @ordered
	 */
	public static final int REGION_AND_CULTURAL_NORMS_VALUE = 2;

	/**
	 * The '<em><b>Physical Security</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_SECURITY
	 * @model name="physicalSecurity"
	 * @generated
	 * @ordered
	 */
	public static final int PHYSICAL_SECURITY_VALUE = 3;

	/**
	 * The '<em><b>Security Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_CONTROL
	 * @model name="securityControl"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_CONTROL_VALUE = 4;

	/**
	 * The '<em><b>Access To Source Code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_TO_SOURCE_CODE
	 * @model name="accessToSourceCode"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_TO_SOURCE_CODE_VALUE = 5;

	/**
	 * The '<em><b>Information Processing Facility</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATION_PROCESSING_FACILITY
	 * @model name="informationProcessingFacility"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMATION_PROCESSING_FACILITY_VALUE = 6;

	/**
	 * The '<em><b>Information Management System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATION_MANAGEMENT_SYSTEM
	 * @model name="informationManagementSystem"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMATION_MANAGEMENT_SYSTEM_VALUE = 7;

	/**
	 * The '<em><b>Healthcare Delivery Organisation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEALTHCARE_DELIVERY_ORGANISATION
	 * @model name="healthcareDeliveryOrganisation"
	 * @generated
	 * @ordered
	 */
	public static final int HEALTHCARE_DELIVERY_ORGANISATION_VALUE = 8;

	/**
	 * The '<em><b>Secury System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURY_SYSTEM
	 * @model name="securySystem"
	 * @generated
	 * @ordered
	 */
	public static final int SECURY_SYSTEM_VALUE = 9;

	/**
	 * The '<em><b>Trusted Module</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUSTED_MODULE
	 * @model name="trustedModule"
	 * @generated
	 * @ordered
	 */
	public static final int TRUSTED_MODULE_VALUE = 10;

	/**
	 * The '<em><b>Final Product</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINAL_PRODUCT
	 * @model name="finalProduct"
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_PRODUCT_VALUE = 11;

	/**
	 * The '<em><b>Smart Device App</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMART_DEVICE_APP
	 * @model name="smartDeviceApp"
	 * @generated
	 * @ordered
	 */
	public static final int SMART_DEVICE_APP_VALUE = 12;

	/**
	 * The '<em><b>Medical IT Network</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICAL_IT_NETWORK
	 * @model name="medicalITNetwork"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICAL_IT_NETWORK_VALUE = 13;

	/**
	 * The '<em><b>Secure Communication Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_COMMUNICATION_CHANNEL
	 * @model name="secureCommunicationChannel"
	 * @generated
	 * @ordered
	 */
	public static final int SECURE_COMMUNICATION_CHANNEL_VALUE = 14;

	/**
	 * The '<em><b>Similar Medical IT Network</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMILAR_MEDICAL_IT_NETWORK
	 * @model name="similarMedicalITNetwork"
	 * @generated
	 * @ordered
	 */
	public static final int SIMILAR_MEDICAL_IT_NETWORK_VALUE = 15;

	/**
	 * An array of all the '<em><b>Package Annotation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PackageAnnotationKind[] VALUES_ARRAY =
		new PackageAnnotationKind[] {
			DEVELOPMENT_AND_TEST_ENVIRONMENT,
			DOCUMENTATION,
			REGION_AND_CULTURAL_NORMS,
			PHYSICAL_SECURITY,
			SECURITY_CONTROL,
			ACCESS_TO_SOURCE_CODE,
			INFORMATION_PROCESSING_FACILITY,
			INFORMATION_MANAGEMENT_SYSTEM,
			HEALTHCARE_DELIVERY_ORGANISATION,
			SECURY_SYSTEM,
			TRUSTED_MODULE,
			FINAL_PRODUCT,
			SMART_DEVICE_APP,
			MEDICAL_IT_NETWORK,
			SECURE_COMMUNICATION_CHANNEL,
			SIMILAR_MEDICAL_IT_NETWORK,
		};

	/**
	 * A public read-only list of all the '<em><b>Package Annotation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PackageAnnotationKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Package Annotation Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PackageAnnotationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PackageAnnotationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Package Annotation Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PackageAnnotationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PackageAnnotationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Package Annotation Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PackageAnnotationKind get(int value) {
		switch (value) {
			case DEVELOPMENT_AND_TEST_ENVIRONMENT_VALUE: return DEVELOPMENT_AND_TEST_ENVIRONMENT;
			case DOCUMENTATION_VALUE: return DOCUMENTATION;
			case REGION_AND_CULTURAL_NORMS_VALUE: return REGION_AND_CULTURAL_NORMS;
			case PHYSICAL_SECURITY_VALUE: return PHYSICAL_SECURITY;
			case SECURITY_CONTROL_VALUE: return SECURITY_CONTROL;
			case ACCESS_TO_SOURCE_CODE_VALUE: return ACCESS_TO_SOURCE_CODE;
			case INFORMATION_PROCESSING_FACILITY_VALUE: return INFORMATION_PROCESSING_FACILITY;
			case INFORMATION_MANAGEMENT_SYSTEM_VALUE: return INFORMATION_MANAGEMENT_SYSTEM;
			case HEALTHCARE_DELIVERY_ORGANISATION_VALUE: return HEALTHCARE_DELIVERY_ORGANISATION;
			case SECURY_SYSTEM_VALUE: return SECURY_SYSTEM;
			case TRUSTED_MODULE_VALUE: return TRUSTED_MODULE;
			case FINAL_PRODUCT_VALUE: return FINAL_PRODUCT;
			case SMART_DEVICE_APP_VALUE: return SMART_DEVICE_APP;
			case MEDICAL_IT_NETWORK_VALUE: return MEDICAL_IT_NETWORK;
			case SECURE_COMMUNICATION_CHANNEL_VALUE: return SECURE_COMMUNICATION_CHANNEL;
			case SIMILAR_MEDICAL_IT_NETWORK_VALUE: return SIMILAR_MEDICAL_IT_NETWORK;
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
	private PackageAnnotationKind(int value, String name, String literal) {
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
	
} //PackageAnnotationKind
