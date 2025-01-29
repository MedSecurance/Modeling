/**
 */
package IoMTComponentCategories.impl;

import IoMTComponentCategories.IoMTComponentCategoriesPackage;
import IoMTComponentCategories.IoMTpkg;
import IoMTComponentCategories.PackageAnnotationKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Io MTpkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link IoMTComponentCategories.impl.IoMTpkgImpl#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link IoMTComponentCategories.impl.IoMTpkgImpl#getSupportedFeatures <em>Supported Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IoMTpkgImpl extends MinimalEObjectImpl.Container implements IoMTpkg {
	/**
	 * The cached value of the '{@link #getBase_Package() <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Package()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Package base_Package;

	/**
	 * The default value of the '{@link #getSupportedFeatures() <em>Supported Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final PackageAnnotationKind SUPPORTED_FEATURES_EDEFAULT = PackageAnnotationKind.DEVELOPMENT_AND_TEST_ENVIRONMENT;

	/**
	 * The cached value of the '{@link #getSupportedFeatures() <em>Supported Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedFeatures()
	 * @generated
	 * @ordered
	 */
	protected PackageAnnotationKind supportedFeatures = SUPPORTED_FEATURES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoMTpkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoMTComponentCategoriesPackage.Literals.IO_MTPKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.uml2.uml.Package getBase_Package() {
		if (base_Package != null && base_Package.eIsProxy()) {
			InternalEObject oldBase_Package = (InternalEObject)base_Package;
			base_Package = (org.eclipse.uml2.uml.Package)eResolveProxy(oldBase_Package);
			if (base_Package != oldBase_Package) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoMTComponentCategoriesPackage.IO_MTPKG__BASE_PACKAGE, oldBase_Package, base_Package));
			}
		}
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetBase_Package() {
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Package(org.eclipse.uml2.uml.Package newBase_Package) {
		org.eclipse.uml2.uml.Package oldBase_Package = base_Package;
		base_Package = newBase_Package;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoMTComponentCategoriesPackage.IO_MTPKG__BASE_PACKAGE, oldBase_Package, base_Package));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageAnnotationKind getSupportedFeatures() {
		return supportedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportedFeatures(PackageAnnotationKind newSupportedFeatures) {
		PackageAnnotationKind oldSupportedFeatures = supportedFeatures;
		supportedFeatures = newSupportedFeatures == null ? SUPPORTED_FEATURES_EDEFAULT : newSupportedFeatures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoMTComponentCategoriesPackage.IO_MTPKG__SUPPORTED_FEATURES, oldSupportedFeatures, supportedFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoMTComponentCategoriesPackage.IO_MTPKG__BASE_PACKAGE:
				if (resolve) return getBase_Package();
				return basicGetBase_Package();
			case IoMTComponentCategoriesPackage.IO_MTPKG__SUPPORTED_FEATURES:
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
			case IoMTComponentCategoriesPackage.IO_MTPKG__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)newValue);
				return;
			case IoMTComponentCategoriesPackage.IO_MTPKG__SUPPORTED_FEATURES:
				setSupportedFeatures((PackageAnnotationKind)newValue);
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
			case IoMTComponentCategoriesPackage.IO_MTPKG__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)null);
				return;
			case IoMTComponentCategoriesPackage.IO_MTPKG__SUPPORTED_FEATURES:
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
			case IoMTComponentCategoriesPackage.IO_MTPKG__BASE_PACKAGE:
				return base_Package != null;
			case IoMTComponentCategoriesPackage.IO_MTPKG__SUPPORTED_FEATURES:
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

} //IoMTpkgImpl
