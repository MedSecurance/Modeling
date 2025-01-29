/**
 */
package IoMTComponentCategories.impl;

import IoMTComponentCategories.IoMTComponentCategoriesPackage;
import IoMTComponentCategories.IoMTp;
import IoMTComponentCategories.PropertyAnnotationKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Io MTp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link IoMTComponentCategories.impl.IoMTpImpl#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link IoMTComponentCategories.impl.IoMTpImpl#getSupportedFeatures <em>Supported Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IoMTpImpl extends MinimalEObjectImpl.Container implements IoMTp {
	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

	/**
	 * The default value of the '{@link #getSupportedFeatures() <em>Supported Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyAnnotationKind SUPPORTED_FEATURES_EDEFAULT = PropertyAnnotationKind.CRYPTOGRAPHIC_OPERATION;

	/**
	 * The cached value of the '{@link #getSupportedFeatures() <em>Supported Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedFeatures()
	 * @generated
	 * @ordered
	 */
	protected PropertyAnnotationKind supportedFeatures = SUPPORTED_FEATURES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoMTpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoMTComponentCategoriesPackage.Literals.IO_MTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject)base_Property;
			base_Property = (Property)eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoMTComponentCategoriesPackage.IO_MTP__BASE_PROPERTY, oldBase_Property, base_Property));
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoMTComponentCategoriesPackage.IO_MTP__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyAnnotationKind getSupportedFeatures() {
		return supportedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportedFeatures(PropertyAnnotationKind newSupportedFeatures) {
		PropertyAnnotationKind oldSupportedFeatures = supportedFeatures;
		supportedFeatures = newSupportedFeatures == null ? SUPPORTED_FEATURES_EDEFAULT : newSupportedFeatures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoMTComponentCategoriesPackage.IO_MTP__SUPPORTED_FEATURES, oldSupportedFeatures, supportedFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoMTComponentCategoriesPackage.IO_MTP__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
			case IoMTComponentCategoriesPackage.IO_MTP__SUPPORTED_FEATURES:
				return getSupportedFeatures();
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
			case IoMTComponentCategoriesPackage.IO_MTP__BASE_PROPERTY:
				setBase_Property((Property)newValue);
				return;
			case IoMTComponentCategoriesPackage.IO_MTP__SUPPORTED_FEATURES:
				setSupportedFeatures((PropertyAnnotationKind)newValue);
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
			case IoMTComponentCategoriesPackage.IO_MTP__BASE_PROPERTY:
				setBase_Property((Property)null);
				return;
			case IoMTComponentCategoriesPackage.IO_MTP__SUPPORTED_FEATURES:
				setSupportedFeatures(SUPPORTED_FEATURES_EDEFAULT);
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
			case IoMTComponentCategoriesPackage.IO_MTP__BASE_PROPERTY:
				return base_Property != null;
			case IoMTComponentCategoriesPackage.IO_MTP__SUPPORTED_FEATURES:
				return supportedFeatures != SUPPORTED_FEATURES_EDEFAULT;
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
		result.append(" (supportedFeatures: ");
		result.append(supportedFeatures);
		result.append(')');
		return result.toString();
	}

} //IoMTpImpl
