/**
 */
package IoMTProfile.Application.impl;

import IoMTProfile.Application.Application;
import IoMTProfile.Application.ApplicationPackage;

import IoMTProfile.External.ExternalPackage;
import IoMTProfile.External.Person;

import IoMTProfile.WAN.DataStore;
import IoMTProfile.WAN.Proxy;
import IoMTProfile.WAN.WANPackage;

import IoMTProfile.impl.IdentifiableElementImpl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link IoMTProfile.Application.impl.ApplicationImpl#getDatastore <em>Datastore</em>}</li>
 *   <li>{@link IoMTProfile.Application.impl.ApplicationImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link IoMTProfile.Application.impl.ApplicationImpl#getProxy <em>Proxy</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ApplicationImpl extends IdentifiableElementImpl implements Application {
	/**
	 * The cached value of the '{@link #getDatastore() <em>Datastore</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatastore()
	 * @generated
	 * @ordered
	 */
	protected DataStore datastore;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Person person;

	/**
	 * The cached value of the '{@link #getProxy() <em>Proxy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxy()
	 * @generated
	 * @ordered
	 */
	protected Proxy proxy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataStore getDatastore() {
		if (datastore != null && datastore.eIsProxy()) {
			InternalEObject oldDatastore = (InternalEObject)datastore;
			datastore = (DataStore)eResolveProxy(oldDatastore);
			if (datastore != oldDatastore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.APPLICATION__DATASTORE, oldDatastore, datastore));
			}
		}
		return datastore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStore basicGetDatastore() {
		return datastore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatastore(DataStore newDatastore, NotificationChain msgs) {
		DataStore oldDatastore = datastore;
		datastore = newDatastore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__DATASTORE, oldDatastore, newDatastore);
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
	public void setDatastore(DataStore newDatastore) {
		if (newDatastore != datastore) {
			NotificationChain msgs = null;
			if (datastore != null)
				msgs = ((InternalEObject)datastore).eInverseRemove(this, WANPackage.DATA_STORE__APPLICATIONS, DataStore.class, msgs);
			if (newDatastore != null)
				msgs = ((InternalEObject)newDatastore).eInverseAdd(this, WANPackage.DATA_STORE__APPLICATIONS, DataStore.class, msgs);
			msgs = basicSetDatastore(newDatastore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__DATASTORE, newDatastore, newDatastore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getPerson() {
		if (person != null && person.eIsProxy()) {
			InternalEObject oldPerson = (InternalEObject)person;
			person = (Person)eResolveProxy(oldPerson);
			if (person != oldPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.APPLICATION__PERSON, oldPerson, person));
			}
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Person newPerson, NotificationChain msgs) {
		Person oldPerson = person;
		person = newPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__PERSON, oldPerson, newPerson);
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
	public void setPerson(Person newPerson) {
		if (newPerson != person) {
			NotificationChain msgs = null;
			if (person != null)
				msgs = ((InternalEObject)person).eInverseRemove(this, ExternalPackage.PERSON__APPLICATION, Person.class, msgs);
			if (newPerson != null)
				msgs = ((InternalEObject)newPerson).eInverseAdd(this, ExternalPackage.PERSON__APPLICATION, Person.class, msgs);
			msgs = basicSetPerson(newPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__PERSON, newPerson, newPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Proxy getProxy() {
		if (proxy != null && proxy.eIsProxy()) {
			InternalEObject oldProxy = (InternalEObject)proxy;
			proxy = (Proxy)eResolveProxy(oldProxy);
			if (proxy != oldProxy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.APPLICATION__PROXY, oldProxy, proxy));
			}
		}
		return proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proxy basicGetProxy() {
		return proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProxy(Proxy newProxy, NotificationChain msgs) {
		Proxy oldProxy = proxy;
		proxy = newProxy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__PROXY, oldProxy, newProxy);
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
	public void setProxy(Proxy newProxy) {
		if (newProxy != proxy) {
			NotificationChain msgs = null;
			if (proxy != null)
				msgs = ((InternalEObject)proxy).eInverseRemove(this, WANPackage.PROXY__APPLICATIONS, Proxy.class, msgs);
			if (newProxy != null)
				msgs = ((InternalEObject)newProxy).eInverseAdd(this, WANPackage.PROXY__APPLICATIONS, Proxy.class, msgs);
			msgs = basicSetProxy(newProxy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__PROXY, newProxy, newProxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void create() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void retrieve() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void update() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void delete() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.APPLICATION__DATASTORE:
				if (datastore != null)
					msgs = ((InternalEObject)datastore).eInverseRemove(this, WANPackage.DATA_STORE__APPLICATIONS, DataStore.class, msgs);
				return basicSetDatastore((DataStore)otherEnd, msgs);
			case ApplicationPackage.APPLICATION__PERSON:
				if (person != null)
					msgs = ((InternalEObject)person).eInverseRemove(this, ExternalPackage.PERSON__APPLICATION, Person.class, msgs);
				return basicSetPerson((Person)otherEnd, msgs);
			case ApplicationPackage.APPLICATION__PROXY:
				if (proxy != null)
					msgs = ((InternalEObject)proxy).eInverseRemove(this, WANPackage.PROXY__APPLICATIONS, Proxy.class, msgs);
				return basicSetProxy((Proxy)otherEnd, msgs);
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
			case ApplicationPackage.APPLICATION__DATASTORE:
				return basicSetDatastore(null, msgs);
			case ApplicationPackage.APPLICATION__PERSON:
				return basicSetPerson(null, msgs);
			case ApplicationPackage.APPLICATION__PROXY:
				return basicSetProxy(null, msgs);
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
			case ApplicationPackage.APPLICATION__DATASTORE:
				if (resolve) return getDatastore();
				return basicGetDatastore();
			case ApplicationPackage.APPLICATION__PERSON:
				if (resolve) return getPerson();
				return basicGetPerson();
			case ApplicationPackage.APPLICATION__PROXY:
				if (resolve) return getProxy();
				return basicGetProxy();
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
			case ApplicationPackage.APPLICATION__DATASTORE:
				setDatastore((DataStore)newValue);
				return;
			case ApplicationPackage.APPLICATION__PERSON:
				setPerson((Person)newValue);
				return;
			case ApplicationPackage.APPLICATION__PROXY:
				setProxy((Proxy)newValue);
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
			case ApplicationPackage.APPLICATION__DATASTORE:
				setDatastore((DataStore)null);
				return;
			case ApplicationPackage.APPLICATION__PERSON:
				setPerson((Person)null);
				return;
			case ApplicationPackage.APPLICATION__PROXY:
				setProxy((Proxy)null);
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
			case ApplicationPackage.APPLICATION__DATASTORE:
				return datastore != null;
			case ApplicationPackage.APPLICATION__PERSON:
				return person != null;
			case ApplicationPackage.APPLICATION__PROXY:
				return proxy != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApplicationPackage.APPLICATION___CREATE:
				create();
				return null;
			case ApplicationPackage.APPLICATION___RETRIEVE:
				retrieve();
				return null;
			case ApplicationPackage.APPLICATION___UPDATE:
				update();
				return null;
			case ApplicationPackage.APPLICATION___DELETE:
				delete();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApplicationImpl
