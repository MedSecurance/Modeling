/**
 */
package IoMTComponentCategories.impl;

import IoMTComponentCategories.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IoMTComponentCategoriesFactoryImpl extends EFactoryImpl implements IoMTComponentCategoriesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IoMTComponentCategoriesFactory init() {
		try {
			IoMTComponentCategoriesFactory theIoMTComponentCategoriesFactory = (IoMTComponentCategoriesFactory)EPackage.Registry.INSTANCE.getEFactory(IoMTComponentCategoriesPackage.eNS_URI);
			if (theIoMTComponentCategoriesFactory != null) {
				return theIoMTComponentCategoriesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IoMTComponentCategoriesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoMTComponentCategoriesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IoMTComponentCategoriesPackage.IO_MTCOMPONENT: return createIoMTcomponent();
			case IoMTComponentCategoriesPackage.IO_MTP: return createIoMTp();
			case IoMTComponentCategoriesPackage.IO_MTPKG: return createIoMTpkg();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IoMTComponentCategoriesPackage.COMPONENT_ANNOTATION_KIND:
				return createComponentAnnotationKindFromString(eDataType, initialValue);
			case IoMTComponentCategoriesPackage.PROPERTY_ANNOTATION_KIND:
				return createPropertyAnnotationKindFromString(eDataType, initialValue);
			case IoMTComponentCategoriesPackage.PACKAGE_ANNOTATION_KIND:
				return createPackageAnnotationKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IoMTComponentCategoriesPackage.COMPONENT_ANNOTATION_KIND:
				return convertComponentAnnotationKindToString(eDataType, instanceValue);
			case IoMTComponentCategoriesPackage.PROPERTY_ANNOTATION_KIND:
				return convertPropertyAnnotationKindToString(eDataType, instanceValue);
			case IoMTComponentCategoriesPackage.PACKAGE_ANNOTATION_KIND:
				return convertPackageAnnotationKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoMTcomponent createIoMTcomponent() {
		IoMTcomponentImpl ioMTcomponent = new IoMTcomponentImpl();
		return ioMTcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoMTp createIoMTp() {
		IoMTpImpl ioMTp = new IoMTpImpl();
		return ioMTp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoMTpkg createIoMTpkg() {
		IoMTpkgImpl ioMTpkg = new IoMTpkgImpl();
		return ioMTpkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentAnnotationKind createComponentAnnotationKindFromString(EDataType eDataType, String initialValue) {
		ComponentAnnotationKind result = ComponentAnnotationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentAnnotationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyAnnotationKind createPropertyAnnotationKindFromString(EDataType eDataType, String initialValue) {
		PropertyAnnotationKind result = PropertyAnnotationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyAnnotationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageAnnotationKind createPackageAnnotationKindFromString(EDataType eDataType, String initialValue) {
		PackageAnnotationKind result = PackageAnnotationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPackageAnnotationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoMTComponentCategoriesPackage getIoMTComponentCategoriesPackage() {
		return (IoMTComponentCategoriesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IoMTComponentCategoriesPackage getPackage() {
		return IoMTComponentCategoriesPackage.eINSTANCE;
	}

} //IoMTComponentCategoriesFactoryImpl
