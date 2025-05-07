/**
 */
package tvra.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tvra.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tvra.TvraPackage
 * @generated
 */
public class TvraAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TvraPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TvraAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TvraPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TvraSwitch<Adapter> modelSwitch =
		new TvraSwitch<Adapter>() {
			@Override
			public Adapter caseTVRAAsset(TVRAAsset object) {
				return createTVRAAssetAdapter();
			}
			@Override
			public Adapter caseMisbehaviour(Misbehaviour object) {
				return createMisbehaviourAdapter();
			}
			@Override
			public Adapter caseTrustworthinessAttributeSet(TrustworthinessAttributeSet object) {
				return createTrustworthinessAttributeSetAdapter();
			}
			@Override
			public Adapter caseControlSet(ControlSet object) {
				return createControlSetAdapter();
			}
			@Override
			public Adapter caseNetworkDomain(NetworkDomain object) {
				return createNetworkDomainAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link tvra.TVRAAsset <em>TVRA Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tvra.TVRAAsset
	 * @generated
	 */
	public Adapter createTVRAAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tvra.Misbehaviour <em>Misbehaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tvra.Misbehaviour
	 * @generated
	 */
	public Adapter createMisbehaviourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tvra.TrustworthinessAttributeSet <em>Trustworthiness Attribute Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tvra.TrustworthinessAttributeSet
	 * @generated
	 */
	public Adapter createTrustworthinessAttributeSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tvra.ControlSet <em>Control Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tvra.ControlSet
	 * @generated
	 */
	public Adapter createControlSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tvra.NetworkDomain <em>Network Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tvra.NetworkDomain
	 * @generated
	 */
	public Adapter createNetworkDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TvraAdapterFactory
