/**
 */
package IoMTComponentCategories.impl;

import IoMTComponentCategories.ComponentAnnotationKind;
import IoMTComponentCategories.IoMTComponentCategoriesPackage;
import IoMTComponentCategories.IoMTcomponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Io MTcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link IoMTComponentCategories.impl.IoMTcomponentImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link IoMTComponentCategories.impl.IoMTcomponentImpl#getSupportedFeatures <em>Supported Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IoMTcomponentImpl extends MinimalEObjectImpl.Container implements IoMTcomponent {
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
	 * The cached value of the '{@link #getSupportedFeatures() <em>Supported Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentAnnotationKind> supportedFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoMTcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoMTComponentCategoriesPackage.Literals.IO_MTCOMPONENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoMTComponentCategoriesPackage.IO_MTCOMPONENT__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IoMTComponentCategoriesPackage.IO_MTCOMPONENT__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentAnnotationKind> getSupportedFeatures() {
		if (supportedFeatures == null) {
			supportedFeatures = new EDataTypeUniqueEList<ComponentAnnotationKind>(ComponentAnnotationKind.class, this, IoMTComponentCategoriesPackage.IO_MTCOMPONENT__SUPPORTED_FEATURES);
		}
		return supportedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoMTComponentCategoriesPackage.IO_MTCOMPONENT__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case IoMTComponentCategoriesPackage.IO_MTCOMPONENT__SUPPORTED_FEATURES:
				return getSupportedFeatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IoMTComponentCategoriesPackage.IO_MTCOMPONENT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case IoMTComponentCategoriesPackage.IO_MTCOMPONENT__SUPPORTED_FEATURES:
				getSupportedFeatures().clear();
				getSupportedFeatures().addAll((Collection<? extends ComponentAnnotationKind>)newValue);
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
			case IoMTComponentCategoriesPackage.IO_MTCOMPONENT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case IoMTComponentCategoriesPackage.IO_MTCOMPONENT__SUPPORTED_FEATURES:
				getSupportedFeatures().clear();
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
			case IoMTComponentCategoriesPackage.IO_MTCOMPONENT__BASE_CLASS:
				return base_Class != null;
			case IoMTComponentCategoriesPackage.IO_MTCOMPONENT__SUPPORTED_FEATURES:
				return supportedFeatures != null && !supportedFeatures.isEmpty();
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

} //IoMTcomponentImpl
