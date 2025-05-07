/**
 */
package tvra.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tvra.ControlSet;
import tvra.ControlSetKind;
import tvra.TVRAAsset;
import tvra.TrustworthinessLevelKind;
import tvra.TvraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tvra.impl.ControlSetImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link tvra.impl.ControlSetImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link tvra.impl.ControlSetImpl#isProposed <em>Is Proposed</em>}</li>
 *   <li>{@link tvra.impl.ControlSetImpl#getCoverageLevel <em>Coverage Level</em>}</li>
 *   <li>{@link tvra.impl.ControlSetImpl#getTvraasset <em>Tvraasset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSetImpl extends MinimalEObjectImpl.Container implements ControlSet {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ControlSetKind KIND_EDEFAULT = ControlSetKind.CS_ACCESS_CONTROL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ControlSetKind kind = KIND_EDEFAULT;

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
	 * The default value of the '{@link #isProposed() <em>Is Proposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProposed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PROPOSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProposed() <em>Is Proposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProposed()
	 * @generated
	 * @ordered
	 */
	protected boolean isProposed = IS_PROPOSED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoverageLevel() <em>Coverage Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageLevel()
	 * @generated
	 * @ordered
	 */
	protected static final TrustworthinessLevelKind COVERAGE_LEVEL_EDEFAULT = TrustworthinessLevelKind.VERY_LOW;

	/**
	 * The cached value of the '{@link #getCoverageLevel() <em>Coverage Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageLevel()
	 * @generated
	 * @ordered
	 */
	protected TrustworthinessLevelKind coverageLevel = COVERAGE_LEVEL_EDEFAULT;

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
	protected ControlSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TvraPackage.Literals.CONTROL_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSetKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(ControlSetKind newKind) {
		ControlSetKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TvraPackage.CONTROL_SET__KIND, oldKind, kind));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TvraPackage.CONTROL_SET__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TvraPackage.CONTROL_SET__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isProposed() {
		return isProposed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsProposed(boolean newIsProposed) {
		boolean oldIsProposed = isProposed;
		isProposed = newIsProposed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TvraPackage.CONTROL_SET__IS_PROPOSED, oldIsProposed, isProposed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrustworthinessLevelKind getCoverageLevel() {
		return coverageLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoverageLevel(TrustworthinessLevelKind newCoverageLevel) {
		TrustworthinessLevelKind oldCoverageLevel = coverageLevel;
		coverageLevel = newCoverageLevel == null ? COVERAGE_LEVEL_EDEFAULT : newCoverageLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TvraPackage.CONTROL_SET__COVERAGE_LEVEL, oldCoverageLevel, coverageLevel));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TvraPackage.CONTROL_SET__TVRAASSET, oldTvraasset, tvraasset));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TvraPackage.CONTROL_SET__TVRAASSET, oldTvraasset, newTvraasset);
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
				msgs = ((InternalEObject)tvraasset).eInverseRemove(this, TvraPackage.TVRA_ASSET__CONTROLSETS, TVRAAsset.class, msgs);
			if (newTvraasset != null)
				msgs = ((InternalEObject)newTvraasset).eInverseAdd(this, TvraPackage.TVRA_ASSET__CONTROLSETS, TVRAAsset.class, msgs);
			msgs = basicSetTvraasset(newTvraasset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TvraPackage.CONTROL_SET__TVRAASSET, newTvraasset, newTvraasset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TvraPackage.CONTROL_SET__TVRAASSET:
				if (tvraasset != null)
					msgs = ((InternalEObject)tvraasset).eInverseRemove(this, TvraPackage.TVRA_ASSET__CONTROLSETS, TVRAAsset.class, msgs);
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
			case TvraPackage.CONTROL_SET__TVRAASSET:
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
			case TvraPackage.CONTROL_SET__KIND:
				return getKind();
			case TvraPackage.CONTROL_SET__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case TvraPackage.CONTROL_SET__IS_PROPOSED:
				return isProposed();
			case TvraPackage.CONTROL_SET__COVERAGE_LEVEL:
				return getCoverageLevel();
			case TvraPackage.CONTROL_SET__TVRAASSET:
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
			case TvraPackage.CONTROL_SET__KIND:
				setKind((ControlSetKind)newValue);
				return;
			case TvraPackage.CONTROL_SET__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case TvraPackage.CONTROL_SET__IS_PROPOSED:
				setIsProposed((Boolean)newValue);
				return;
			case TvraPackage.CONTROL_SET__COVERAGE_LEVEL:
				setCoverageLevel((TrustworthinessLevelKind)newValue);
				return;
			case TvraPackage.CONTROL_SET__TVRAASSET:
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
			case TvraPackage.CONTROL_SET__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case TvraPackage.CONTROL_SET__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case TvraPackage.CONTROL_SET__IS_PROPOSED:
				setIsProposed(IS_PROPOSED_EDEFAULT);
				return;
			case TvraPackage.CONTROL_SET__COVERAGE_LEVEL:
				setCoverageLevel(COVERAGE_LEVEL_EDEFAULT);
				return;
			case TvraPackage.CONTROL_SET__TVRAASSET:
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
			case TvraPackage.CONTROL_SET__KIND:
				return kind != KIND_EDEFAULT;
			case TvraPackage.CONTROL_SET__BASE_CLASS:
				return base_Class != null;
			case TvraPackage.CONTROL_SET__IS_PROPOSED:
				return isProposed != IS_PROPOSED_EDEFAULT;
			case TvraPackage.CONTROL_SET__COVERAGE_LEVEL:
				return coverageLevel != COVERAGE_LEVEL_EDEFAULT;
			case TvraPackage.CONTROL_SET__TVRAASSET:
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
		result.append(", isProposed: ");
		result.append(isProposed);
		result.append(", coverageLevel: ");
		result.append(coverageLevel);
		result.append(')');
		return result.toString();
	}

} //ControlSetImpl
