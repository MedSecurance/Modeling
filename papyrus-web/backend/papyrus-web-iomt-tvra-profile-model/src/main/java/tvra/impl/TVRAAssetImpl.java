/**
 */
package tvra.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tvra.ControlSet;
import tvra.Misbehaviour;
import tvra.TRVAAssetKind;
import tvra.TVRAAsset;
import tvra.TrustworthinessAttributeSet;
import tvra.TvraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TVRA Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tvra.impl.TVRAAssetImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link tvra.impl.TVRAAssetImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link tvra.impl.TVRAAssetImpl#getMisbehaviours <em>Misbehaviours</em>}</li>
 *   <li>{@link tvra.impl.TVRAAssetImpl#getTrustworthinessattributesets <em>Trustworthinessattributesets</em>}</li>
 *   <li>{@link tvra.impl.TVRAAssetImpl#getControlsets <em>Controlsets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TVRAAssetImpl extends MinimalEObjectImpl.Container implements TVRAAsset {
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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final TRVAAssetKind KIND_EDEFAULT = TRVAAssetKind.ABSTRACT_SUBNET;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected TRVAAssetKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMisbehaviours() <em>Misbehaviours</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMisbehaviours()
	 * @generated
	 * @ordered
	 */
	protected EList<Misbehaviour> misbehaviours;

	/**
	 * The cached value of the '{@link #getTrustworthinessattributesets() <em>Trustworthinessattributesets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustworthinessattributesets()
	 * @generated
	 * @ordered
	 */
	protected EList<TrustworthinessAttributeSet> trustworthinessattributesets;

	/**
	 * The cached value of the '{@link #getControlsets() <em>Controlsets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlsets()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlSet> controlsets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TVRAAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TvraPackage.Literals.TVRA_ASSET;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TvraPackage.TVRA_ASSET__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TvraPackage.TVRA_ASSET__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRVAAssetKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(TRVAAssetKind newKind) {
		TRVAAssetKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TvraPackage.TVRA_ASSET__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Misbehaviour> getMisbehaviours() {
		if (misbehaviours == null) {
			misbehaviours = new EObjectWithInverseResolvingEList<Misbehaviour>(Misbehaviour.class, this, TvraPackage.TVRA_ASSET__MISBEHAVIOURS, TvraPackage.MISBEHAVIOUR__TVRAASSET);
		}
		return misbehaviours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrustworthinessAttributeSet> getTrustworthinessattributesets() {
		if (trustworthinessattributesets == null) {
			trustworthinessattributesets = new EObjectWithInverseResolvingEList<TrustworthinessAttributeSet>(TrustworthinessAttributeSet.class, this, TvraPackage.TVRA_ASSET__TRUSTWORTHINESSATTRIBUTESETS, TvraPackage.TRUSTWORTHINESS_ATTRIBUTE_SET__TVRAASSET);
		}
		return trustworthinessattributesets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlSet> getControlsets() {
		if (controlsets == null) {
			controlsets = new EObjectWithInverseResolvingEList<ControlSet>(ControlSet.class, this, TvraPackage.TVRA_ASSET__CONTROLSETS, TvraPackage.CONTROL_SET__TVRAASSET);
		}
		return controlsets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TvraPackage.TVRA_ASSET__MISBEHAVIOURS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMisbehaviours()).basicAdd(otherEnd, msgs);
			case TvraPackage.TVRA_ASSET__TRUSTWORTHINESSATTRIBUTESETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTrustworthinessattributesets()).basicAdd(otherEnd, msgs);
			case TvraPackage.TVRA_ASSET__CONTROLSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlsets()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TvraPackage.TVRA_ASSET__MISBEHAVIOURS:
				return ((InternalEList<?>)getMisbehaviours()).basicRemove(otherEnd, msgs);
			case TvraPackage.TVRA_ASSET__TRUSTWORTHINESSATTRIBUTESETS:
				return ((InternalEList<?>)getTrustworthinessattributesets()).basicRemove(otherEnd, msgs);
			case TvraPackage.TVRA_ASSET__CONTROLSETS:
				return ((InternalEList<?>)getControlsets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TvraPackage.TVRA_ASSET__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case TvraPackage.TVRA_ASSET__KIND:
				return getKind();
			case TvraPackage.TVRA_ASSET__MISBEHAVIOURS:
				return getMisbehaviours();
			case TvraPackage.TVRA_ASSET__TRUSTWORTHINESSATTRIBUTESETS:
				return getTrustworthinessattributesets();
			case TvraPackage.TVRA_ASSET__CONTROLSETS:
				return getControlsets();
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
			case TvraPackage.TVRA_ASSET__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case TvraPackage.TVRA_ASSET__KIND:
				setKind((TRVAAssetKind)newValue);
				return;
			case TvraPackage.TVRA_ASSET__MISBEHAVIOURS:
				getMisbehaviours().clear();
				getMisbehaviours().addAll((Collection<? extends Misbehaviour>)newValue);
				return;
			case TvraPackage.TVRA_ASSET__TRUSTWORTHINESSATTRIBUTESETS:
				getTrustworthinessattributesets().clear();
				getTrustworthinessattributesets().addAll((Collection<? extends TrustworthinessAttributeSet>)newValue);
				return;
			case TvraPackage.TVRA_ASSET__CONTROLSETS:
				getControlsets().clear();
				getControlsets().addAll((Collection<? extends ControlSet>)newValue);
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
			case TvraPackage.TVRA_ASSET__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case TvraPackage.TVRA_ASSET__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case TvraPackage.TVRA_ASSET__MISBEHAVIOURS:
				getMisbehaviours().clear();
				return;
			case TvraPackage.TVRA_ASSET__TRUSTWORTHINESSATTRIBUTESETS:
				getTrustworthinessattributesets().clear();
				return;
			case TvraPackage.TVRA_ASSET__CONTROLSETS:
				getControlsets().clear();
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
			case TvraPackage.TVRA_ASSET__BASE_CLASS:
				return base_Class != null;
			case TvraPackage.TVRA_ASSET__KIND:
				return kind != KIND_EDEFAULT;
			case TvraPackage.TVRA_ASSET__MISBEHAVIOURS:
				return misbehaviours != null && !misbehaviours.isEmpty();
			case TvraPackage.TVRA_ASSET__TRUSTWORTHINESSATTRIBUTESETS:
				return trustworthinessattributesets != null && !trustworthinessattributesets.isEmpty();
			case TvraPackage.TVRA_ASSET__CONTROLSETS:
				return controlsets != null && !controlsets.isEmpty();
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //TVRAAssetImpl
