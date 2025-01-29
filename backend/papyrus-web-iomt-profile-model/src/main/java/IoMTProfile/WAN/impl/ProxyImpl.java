/**
 */
package IoMTProfile.WAN.impl;

import IoMTProfile.Application.Application;
import IoMTProfile.Application.ApplicationPackage;

import IoMTProfile.IoMTProfilePackage;

import IoMTProfile.LAN.Gateway;
import IoMTProfile.LAN.LANPackage;

import IoMTProfile.LocalManagementApp;

import IoMTProfile.WAN.DataStore;
import IoMTProfile.WAN.Proxy;
import IoMTProfile.WAN.WANPackage;

import IoMTProfile.impl.IdentifiableElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proxy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link IoMTProfile.WAN.impl.ProxyImpl#getGateways <em>Gateways</em>}</li>
 *   <li>{@link IoMTProfile.WAN.impl.ProxyImpl#getDatastores <em>Datastores</em>}</li>
 *   <li>{@link IoMTProfile.WAN.impl.ProxyImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link IoMTProfile.WAN.impl.ProxyImpl#getLocalManagementApps <em>Local Management Apps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProxyImpl extends IdentifiableElementImpl implements Proxy {
	/**
	 * The cached value of the '{@link #getGateways() <em>Gateways</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateways()
	 * @generated
	 * @ordered
	 */
	protected EList<Gateway> gateways;

	/**
	 * The cached value of the '{@link #getDatastores() <em>Datastores</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatastores()
	 * @generated
	 * @ordered
	 */
	protected EList<DataStore> datastores;

	/**
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<Application> applications;

	/**
	 * The cached value of the '{@link #getLocalManagementApps() <em>Local Management Apps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalManagementApps()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalManagementApp> localManagementApps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProxyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WANPackage.Literals.PROXY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Gateway> getGateways() {
		if (gateways == null) {
			gateways = new EObjectWithInverseResolvingEList<Gateway>(Gateway.class, this, WANPackage.PROXY__GATEWAYS, LANPackage.GATEWAY__PROXY);
		}
		return gateways;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataStore> getDatastores() {
		if (datastores == null) {
			datastores = new EObjectWithInverseResolvingEList<DataStore>(DataStore.class, this, WANPackage.PROXY__DATASTORES, WANPackage.DATA_STORE__PROXY);
		}
		return datastores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Application> getApplications() {
		if (applications == null) {
			applications = new EObjectWithInverseResolvingEList<Application>(Application.class, this, WANPackage.PROXY__APPLICATIONS, ApplicationPackage.APPLICATION__PROXY);
		}
		return applications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LocalManagementApp> getLocalManagementApps() {
		if (localManagementApps == null) {
			localManagementApps = new EObjectWithInverseResolvingEList<LocalManagementApp>(LocalManagementApp.class, this, WANPackage.PROXY__LOCAL_MANAGEMENT_APPS, IoMTProfilePackage.LOCAL_MANAGEMENT_APP__PROXY);
		}
		return localManagementApps;
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
			case WANPackage.PROXY__GATEWAYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGateways()).basicAdd(otherEnd, msgs);
			case WANPackage.PROXY__DATASTORES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDatastores()).basicAdd(otherEnd, msgs);
			case WANPackage.PROXY__APPLICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getApplications()).basicAdd(otherEnd, msgs);
			case WANPackage.PROXY__LOCAL_MANAGEMENT_APPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocalManagementApps()).basicAdd(otherEnd, msgs);
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
			case WANPackage.PROXY__GATEWAYS:
				return ((InternalEList<?>)getGateways()).basicRemove(otherEnd, msgs);
			case WANPackage.PROXY__DATASTORES:
				return ((InternalEList<?>)getDatastores()).basicRemove(otherEnd, msgs);
			case WANPackage.PROXY__APPLICATIONS:
				return ((InternalEList<?>)getApplications()).basicRemove(otherEnd, msgs);
			case WANPackage.PROXY__LOCAL_MANAGEMENT_APPS:
				return ((InternalEList<?>)getLocalManagementApps()).basicRemove(otherEnd, msgs);
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
			case WANPackage.PROXY__GATEWAYS:
				return getGateways();
			case WANPackage.PROXY__DATASTORES:
				return getDatastores();
			case WANPackage.PROXY__APPLICATIONS:
				return getApplications();
			case WANPackage.PROXY__LOCAL_MANAGEMENT_APPS:
				return getLocalManagementApps();
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
			case WANPackage.PROXY__GATEWAYS:
				getGateways().clear();
				getGateways().addAll((Collection<? extends Gateway>)newValue);
				return;
			case WANPackage.PROXY__DATASTORES:
				getDatastores().clear();
				getDatastores().addAll((Collection<? extends DataStore>)newValue);
				return;
			case WANPackage.PROXY__APPLICATIONS:
				getApplications().clear();
				getApplications().addAll((Collection<? extends Application>)newValue);
				return;
			case WANPackage.PROXY__LOCAL_MANAGEMENT_APPS:
				getLocalManagementApps().clear();
				getLocalManagementApps().addAll((Collection<? extends LocalManagementApp>)newValue);
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
			case WANPackage.PROXY__GATEWAYS:
				getGateways().clear();
				return;
			case WANPackage.PROXY__DATASTORES:
				getDatastores().clear();
				return;
			case WANPackage.PROXY__APPLICATIONS:
				getApplications().clear();
				return;
			case WANPackage.PROXY__LOCAL_MANAGEMENT_APPS:
				getLocalManagementApps().clear();
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
			case WANPackage.PROXY__GATEWAYS:
				return gateways != null && !gateways.isEmpty();
			case WANPackage.PROXY__DATASTORES:
				return datastores != null && !datastores.isEmpty();
			case WANPackage.PROXY__APPLICATIONS:
				return applications != null && !applications.isEmpty();
			case WANPackage.PROXY__LOCAL_MANAGEMENT_APPS:
				return localManagementApps != null && !localManagementApps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProxyImpl
