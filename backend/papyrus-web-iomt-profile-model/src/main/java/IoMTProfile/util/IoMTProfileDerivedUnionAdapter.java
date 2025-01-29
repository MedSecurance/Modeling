/**
 */
package IoMTProfile.util;

import IoMTProfile.InternalFunction;
import IoMTProfile.IoMTProfilePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An adapter that propagates notifications for derived unions.
 * <!-- end-user-doc -->
 * @see IoMTProfile.IoMTProfilePackage
 * @generated
 */
public class IoMTProfileDerivedUnionAdapter extends AdapterImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IoMTProfilePackage modelPackage;

	/**
	 * Creates an instance of the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoMTProfileDerivedUnionAdapter() {
		if (modelPackage == null) {
			modelPackage = IoMTProfilePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> with the appropriate model class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		Object notifier = notification.getNotifier();
		if (notifier instanceof EObject) {
			EClass eClass = ((EObject)notifier).eClass();
			if (eClass.eContainer() == modelPackage) {
				notifyChanged(notification, eClass);
			}
		}
	}

	/**
	 * Calls <code>notifyXXXChanged</code> for the corresponding class of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyChanged(Notification notification, EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IoMTProfilePackage.INTERNAL_FUNCTION:
				notifyInternalFunctionChanged(notification, eClass);
				break;
		}
	}

	/**
	 * Does nothing; clients may override so that it does something.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @param derivedUnion the derived union affected by the change.
	 * @generated
	 */
	public void notifyChanged(Notification notification, EClass eClass, EStructuralFeature derivedUnion) {
		// Do nothing.
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInternalFunctionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(InternalFunction.class)) {
			case IoMTProfilePackage.INTERNAL_FUNCTION__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__OWNED_RULE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__ELEMENT_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__PACKAGE_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__OWNED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__IMPORTED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__OWNING_TEMPLATE_PARAMETER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__PACKAGE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__TEMPLATE_BINDING:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__OWNED_TEMPLATE_SIGNATURE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__FEATURE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__ATTRIBUTE:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__COLLABORATION_USE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__GENERALIZATION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__INHERITED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__OWNED_USE_CASE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__REDEFINED_CLASSIFIER:
				notifyChanged(notification, eClass, UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__REPRESENTATION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__SUBSTITUTION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__OWNED_ATTRIBUTE:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__OWNED_CONNECTOR:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__ROLE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__OWNED_PORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__CLASSIFIER_BEHAVIOR:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__INTERFACE_REALIZATION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__OWNED_BEHAVIOR:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__OWNED_OPERATION:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__NESTED_CLASSIFIER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case IoMTProfilePackage.INTERNAL_FUNCTION__OWNED_RECEPTION:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

} //IoMTProfileDerivedUnionAdapter
