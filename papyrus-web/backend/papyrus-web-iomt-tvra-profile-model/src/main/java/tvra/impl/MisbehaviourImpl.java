/**
 */
package tvra.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tvra.ImpactLevelKind;
import tvra.Misbehaviour;
import tvra.MisbehaviourKind;
import tvra.TVRAAsset;
import tvra.TvraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Misbehaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tvra.impl.MisbehaviourImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link tvra.impl.MisbehaviourImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link tvra.impl.MisbehaviourImpl#getImpactLevel <em>Impact Level</em>}</li>
 *   <li>{@link tvra.impl.MisbehaviourImpl#getTvraasset <em>Tvraasset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MisbehaviourImpl extends MinimalEObjectImpl.Container implements Misbehaviour {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final MisbehaviourKind KIND_EDEFAULT = MisbehaviourKind.MS_LOSS_OF_ACCESSIBILITY;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected MisbehaviourKind kind = KIND_EDEFAULT;

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
	 * The default value of the '{@link #getImpactLevel() <em>Impact Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactLevel()
	 * @generated
	 * @ordered
	 */
	protected static final ImpactLevelKind IMPACT_LEVEL_EDEFAULT = ImpactLevelKind.NEGLIGIBLE;

	/**
	 * The cached value of the '{@link #getImpactLevel() <em>Impact Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactLevel()
	 * @generated
	 * @ordered
	 */
	protected ImpactLevelKind impactLevel = IMPACT_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTvraasset() <em>Tvraasset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTvraasset()
	 * @generated
	 * @ordered
	 */
	protected TVRAAsset tvraasset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MisbehaviourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TvraPackage.Literals.MISBEHAVIOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MisbehaviourKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(MisbehaviourKind newKind) {
		MisbehaviourKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TvraPackage.MISBEHAVIOUR__KIND, oldKind, kind));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TvraPackage.MISBEHAVIOUR__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TvraPackage.MISBEHAVIOUR__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImpactLevelKind getImpactLevel() {
		return impactLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImpactLevel(ImpactLevelKind newImpactLevel) {
		ImpactLevelKind oldImpactLevel = impactLevel;
		impactLevel = newImpactLevel == null ? IMPACT_LEVEL_EDEFAULT : newImpactLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TvraPackage.MISBEHAVIOUR__IMPACT_LEVEL, oldImpactLevel, impactLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TVRAAsset getTvraasset() {
		if (tvraasset != null && tvraasset.eIsProxy()) {
			InternalEObject oldTvraasset = (InternalEObject)tvraasset;
			tvraasset = (TVRAAsset)eResolveProxy(oldTvraasset);
			if (tvraasset != oldTvraasset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TvraPackage.MISBEHAVIOUR__TVRAASSET, oldTvraasset, tvraasset));
			}
		}
		return tvraasset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVRAAsset basicGetTvraasset() {
		return tvraasset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTvraasset(TVRAAsset newTvraasset, NotificationChain msgs) {
		TVRAAsset oldTvraasset = tvraasset;
		tvraasset = newTvraasset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TvraPackage.MISBEHAVIOUR__TVRAASSET, oldTvraasset, newTvraasset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTvraasset(TVRAAsset newTvraasset) {
		if (newTvraasset != tvraasset) {
			NotificationChain msgs = null;
			if (tvraasset != null)
				msgs = ((InternalEObject)tvraasset).eInverseRemove(this, TvraPackage.TVRA_ASSET__MISBEHAVIOURS, TVRAAsset.class, msgs);
			if (newTvraasset != null)
				msgs = ((InternalEObject)newTvraasset).eInverseAdd(this, TvraPackage.TVRA_ASSET__MISBEHAVIOURS, TVRAAsset.class, msgs);
			msgs = basicSetTvraasset(newTvraasset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TvraPackage.MISBEHAVIOUR__TVRAASSET, newTvraasset, newTvraasset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TvraPackage.MISBEHAVIOUR__TVRAASSET:
				if (tvraasset != null)
					msgs = ((InternalEObject)tvraasset).eInverseRemove(this, TvraPackage.TVRA_ASSET__MISBEHAVIOURS, TVRAAsset.class, msgs);
				return basicSetTvraasset((TVRAAsset)otherEnd, msgs);
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
			case TvraPackage.MISBEHAVIOUR__TVRAASSET:
				return basicSetTvraasset(null, msgs);
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
			case TvraPackage.MISBEHAVIOUR__KIND:
				return getKind();
			case TvraPackage.MISBEHAVIOUR__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case TvraPackage.MISBEHAVIOUR__IMPACT_LEVEL:
				return getImpactLevel();
			case TvraPackage.MISBEHAVIOUR__TVRAASSET:
				if (resolve) return getTvraasset();
				return basicGetTvraasset();
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
			case TvraPackage.MISBEHAVIOUR__KIND:
				setKind((MisbehaviourKind)newValue);
				return;
			case TvraPackage.MISBEHAVIOUR__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case TvraPackage.MISBEHAVIOUR__IMPACT_LEVEL:
				setImpactLevel((ImpactLevelKind)newValue);
				return;
			case TvraPackage.MISBEHAVIOUR__TVRAASSET:
				setTvraasset((TVRAAsset)newValue);
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
			case TvraPackage.MISBEHAVIOUR__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case TvraPackage.MISBEHAVIOUR__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case TvraPackage.MISBEHAVIOUR__IMPACT_LEVEL:
				setImpactLevel(IMPACT_LEVEL_EDEFAULT);
				return;
			case TvraPackage.MISBEHAVIOUR__TVRAASSET:
				setTvraasset((TVRAAsset)null);
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
			case TvraPackage.MISBEHAVIOUR__KIND:
				return kind != KIND_EDEFAULT;
			case TvraPackage.MISBEHAVIOUR__BASE_CLASS:
				return base_Class != null;
			case TvraPackage.MISBEHAVIOUR__IMPACT_LEVEL:
				return impactLevel != IMPACT_LEVEL_EDEFAULT;
			case TvraPackage.MISBEHAVIOUR__TVRAASSET:
				return tvraasset != null;
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
		result.append(", impactLevel: ");
		result.append(impactLevel);
		result.append(')');
		return result.toString();
	}

} //MisbehaviourImpl
