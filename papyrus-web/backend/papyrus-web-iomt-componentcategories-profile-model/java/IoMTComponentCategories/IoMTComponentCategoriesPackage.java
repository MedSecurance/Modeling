/**
 */
package IoMTComponentCategories;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see IoMTComponentCategories.IoMTComponentCategoriesFactory
 * @model kind="package"
 * @generated
 */
public interface IoMTComponentCategoriesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IoMTComponentCategories";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://IoMTComponentCategories";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IoMTComponentCategories";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IoMTComponentCategoriesPackage eINSTANCE = IoMTComponentCategories.impl.IoMTComponentCategoriesPackageImpl.init();

	/**
	 * The meta object id for the '{@link IoMTComponentCategories.impl.IoMTcomponentImpl <em>Io MTcomponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoMTComponentCategories.impl.IoMTcomponentImpl
	 * @see IoMTComponentCategories.impl.IoMTComponentCategoriesPackageImpl#getIoMTcomponent()
	 * @generated
	 */
	int IO_MTCOMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MTCOMPONENT__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Supported Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MTCOMPONENT__SUPPORTED_FEATURES = 1;

	/**
	 * The number of structural features of the '<em>Io MTcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MTCOMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Io MTcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MTCOMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link IoMTComponentCategories.impl.IoMTpImpl <em>Io MTp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoMTComponentCategories.impl.IoMTpImpl
	 * @see IoMTComponentCategories.impl.IoMTComponentCategoriesPackageImpl#getIoMTp()
	 * @generated
	 */
	int IO_MTP = 1;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MTP__BASE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Supported Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MTP__SUPPORTED_FEATURES = 1;

	/**
	 * The number of structural features of the '<em>Io MTp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MTP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Io MTp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MTP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link IoMTComponentCategories.impl.IoMTpkgImpl <em>Io MTpkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoMTComponentCategories.impl.IoMTpkgImpl
	 * @see IoMTComponentCategories.impl.IoMTComponentCategoriesPackageImpl#getIoMTpkg()
	 * @generated
	 */
	int IO_MTPKG = 2;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MTPKG__BASE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Supported Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MTPKG__SUPPORTED_FEATURES = 1;

	/**
	 * The number of structural features of the '<em>Io MTpkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MTPKG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Io MTpkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MTPKG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link IoMTComponentCategories.ComponentAnnotationKind <em>Component Annotation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoMTComponentCategories.ComponentAnnotationKind
	 * @see IoMTComponentCategories.impl.IoMTComponentCategoriesPackageImpl#getComponentAnnotationKind()
	 * @generated
	 */
	int COMPONENT_ANNOTATION_KIND = 3;

	/**
	 * The meta object id for the '{@link IoMTComponentCategories.PropertyAnnotationKind <em>Property Annotation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoMTComponentCategories.PropertyAnnotationKind
	 * @see IoMTComponentCategories.impl.IoMTComponentCategoriesPackageImpl#getPropertyAnnotationKind()
	 * @generated
	 */
	int PROPERTY_ANNOTATION_KIND = 4;

	/**
	 * The meta object id for the '{@link IoMTComponentCategories.PackageAnnotationKind <em>Package Annotation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoMTComponentCategories.PackageAnnotationKind
	 * @see IoMTComponentCategories.impl.IoMTComponentCategoriesPackageImpl#getPackageAnnotationKind()
	 * @generated
	 */
	int PACKAGE_ANNOTATION_KIND = 5;


	/**
	 * Returns the meta object for class '{@link IoMTComponentCategories.IoMTcomponent <em>Io MTcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io MTcomponent</em>'.
	 * @see IoMTComponentCategories.IoMTcomponent
	 * @generated
	 */
	EClass getIoMTcomponent();

	/**
	 * Returns the meta object for the reference '{@link IoMTComponentCategories.IoMTcomponent#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see IoMTComponentCategories.IoMTcomponent#getBase_Class()
	 * @see #getIoMTcomponent()
	 * @generated
	 */
	EReference getIoMTcomponent_Base_Class();

	/**
	 * Returns the meta object for the attribute list '{@link IoMTComponentCategories.IoMTcomponent#getSupportedFeatures <em>Supported Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Features</em>'.
	 * @see IoMTComponentCategories.IoMTcomponent#getSupportedFeatures()
	 * @see #getIoMTcomponent()
	 * @generated
	 */
	EAttribute getIoMTcomponent_SupportedFeatures();

	/**
	 * Returns the meta object for class '{@link IoMTComponentCategories.IoMTp <em>Io MTp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io MTp</em>'.
	 * @see IoMTComponentCategories.IoMTp
	 * @generated
	 */
	EClass getIoMTp();

	/**
	 * Returns the meta object for the reference '{@link IoMTComponentCategories.IoMTp#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see IoMTComponentCategories.IoMTp#getBase_Property()
	 * @see #getIoMTp()
	 * @generated
	 */
	EReference getIoMTp_Base_Property();

	/**
	 * Returns the meta object for the attribute '{@link IoMTComponentCategories.IoMTp#getSupportedFeatures <em>Supported Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supported Features</em>'.
	 * @see IoMTComponentCategories.IoMTp#getSupportedFeatures()
	 * @see #getIoMTp()
	 * @generated
	 */
	EAttribute getIoMTp_SupportedFeatures();

	/**
	 * Returns the meta object for class '{@link IoMTComponentCategories.IoMTpkg <em>Io MTpkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io MTpkg</em>'.
	 * @see IoMTComponentCategories.IoMTpkg
	 * @generated
	 */
	EClass getIoMTpkg();

	/**
	 * Returns the meta object for the reference '{@link IoMTComponentCategories.IoMTpkg#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see IoMTComponentCategories.IoMTpkg#getBase_Package()
	 * @see #getIoMTpkg()
	 * @generated
	 */
	EReference getIoMTpkg_Base_Package();

	/**
	 * Returns the meta object for the attribute '{@link IoMTComponentCategories.IoMTpkg#getSupportedFeatures <em>Supported Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supported Features</em>'.
	 * @see IoMTComponentCategories.IoMTpkg#getSupportedFeatures()
	 * @see #getIoMTpkg()
	 * @generated
	 */
	EAttribute getIoMTpkg_SupportedFeatures();

	/**
	 * Returns the meta object for enum '{@link IoMTComponentCategories.ComponentAnnotationKind <em>Component Annotation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Annotation Kind</em>'.
	 * @see IoMTComponentCategories.ComponentAnnotationKind
	 * @generated
	 */
	EEnum getComponentAnnotationKind();

	/**
	 * Returns the meta object for enum '{@link IoMTComponentCategories.PropertyAnnotationKind <em>Property Annotation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Annotation Kind</em>'.
	 * @see IoMTComponentCategories.PropertyAnnotationKind
	 * @generated
	 */
	EEnum getPropertyAnnotationKind();

	/**
	 * Returns the meta object for enum '{@link IoMTComponentCategories.PackageAnnotationKind <em>Package Annotation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Package Annotation Kind</em>'.
	 * @see IoMTComponentCategories.PackageAnnotationKind
	 * @generated
	 */
	EEnum getPackageAnnotationKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IoMTComponentCategoriesFactory getIoMTComponentCategoriesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link IoMTComponentCategories.impl.IoMTcomponentImpl <em>Io MTcomponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoMTComponentCategories.impl.IoMTcomponentImpl
		 * @see IoMTComponentCategories.impl.IoMTComponentCategoriesPackageImpl#getIoMTcomponent()
		 * @generated
		 */
		EClass IO_MTCOMPONENT = eINSTANCE.getIoMTcomponent();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_MTCOMPONENT__BASE_CLASS = eINSTANCE.getIoMTcomponent_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Supported Features</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_MTCOMPONENT__SUPPORTED_FEATURES = eINSTANCE.getIoMTcomponent_SupportedFeatures();

		/**
		 * The meta object literal for the '{@link IoMTComponentCategories.impl.IoMTpImpl <em>Io MTp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoMTComponentCategories.impl.IoMTpImpl
		 * @see IoMTComponentCategories.impl.IoMTComponentCategoriesPackageImpl#getIoMTp()
		 * @generated
		 */
		EClass IO_MTP = eINSTANCE.getIoMTp();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_MTP__BASE_PROPERTY = eINSTANCE.getIoMTp_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Supported Features</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_MTP__SUPPORTED_FEATURES = eINSTANCE.getIoMTp_SupportedFeatures();

		/**
		 * The meta object literal for the '{@link IoMTComponentCategories.impl.IoMTpkgImpl <em>Io MTpkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoMTComponentCategories.impl.IoMTpkgImpl
		 * @see IoMTComponentCategories.impl.IoMTComponentCategoriesPackageImpl#getIoMTpkg()
		 * @generated
		 */
		EClass IO_MTPKG = eINSTANCE.getIoMTpkg();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_MTPKG__BASE_PACKAGE = eINSTANCE.getIoMTpkg_Base_Package();

		/**
		 * The meta object literal for the '<em><b>Supported Features</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_MTPKG__SUPPORTED_FEATURES = eINSTANCE.getIoMTpkg_SupportedFeatures();

		/**
		 * The meta object literal for the '{@link IoMTComponentCategories.ComponentAnnotationKind <em>Component Annotation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoMTComponentCategories.ComponentAnnotationKind
		 * @see IoMTComponentCategories.impl.IoMTComponentCategoriesPackageImpl#getComponentAnnotationKind()
		 * @generated
		 */
		EEnum COMPONENT_ANNOTATION_KIND = eINSTANCE.getComponentAnnotationKind();

		/**
		 * The meta object literal for the '{@link IoMTComponentCategories.PropertyAnnotationKind <em>Property Annotation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoMTComponentCategories.PropertyAnnotationKind
		 * @see IoMTComponentCategories.impl.IoMTComponentCategoriesPackageImpl#getPropertyAnnotationKind()
		 * @generated
		 */
		EEnum PROPERTY_ANNOTATION_KIND = eINSTANCE.getPropertyAnnotationKind();

		/**
		 * The meta object literal for the '{@link IoMTComponentCategories.PackageAnnotationKind <em>Package Annotation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoMTComponentCategories.PackageAnnotationKind
		 * @see IoMTComponentCategories.impl.IoMTComponentCategoriesPackageImpl#getPackageAnnotationKind()
		 * @generated
		 */
		EEnum PACKAGE_ANNOTATION_KIND = eINSTANCE.getPackageAnnotationKind();

	}

} //IoMTComponentCategoriesPackage
