/**
 */
package IoMTProfile.Application;

import IoMTProfile.External.Person;

import IoMTProfile.IdentifiableElement;

import IoMTProfile.WAN.DataStore;
import IoMTProfile.WAN.Proxy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IoMTProfile.Application.Application#getDatastore <em>Datastore</em>}</li>
 *   <li>{@link IoMTProfile.Application.Application#getPerson <em>Person</em>}</li>
 *   <li>{@link IoMTProfile.Application.Application#getProxy <em>Proxy</em>}</li>
 * </ul>
 *
 * @see IoMTProfile.Application.ApplicationPackage#getApplication()
 * @model abstract="true"
 * @generated
 */
public interface Application extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Datastore</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.WAN.DataStore#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datastore</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datastore</em>' reference.
	 * @see #setDatastore(DataStore)
	 * @see IoMTProfile.Application.ApplicationPackage#getApplication_Datastore()
	 * @see IoMTProfile.WAN.DataStore#getApplications
	 * @model opposite="applications" required="true" ordered="false"
	 * @generated
	 */
	DataStore getDatastore();

	/**
	 * Sets the value of the '{@link IoMTProfile.Application.Application#getDatastore <em>Datastore</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datastore</em>' reference.
	 * @see #getDatastore()
	 * @generated
	 */
	void setDatastore(DataStore value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.External.Person#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see IoMTProfile.Application.ApplicationPackage#getApplication_Person()
	 * @see IoMTProfile.External.Person#getApplication
	 * @model opposite="application" ordered="false"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link IoMTProfile.Application.Application#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Proxy</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.WAN.Proxy#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy</em>' reference.
	 * @see #setProxy(Proxy)
	 * @see IoMTProfile.Application.ApplicationPackage#getApplication_Proxy()
	 * @see IoMTProfile.WAN.Proxy#getApplications
	 * @model opposite="applications" ordered="false"
	 * @generated
	 */
	Proxy getProxy();

	/**
	 * Sets the value of the '{@link IoMTProfile.Application.Application#getProxy <em>Proxy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy</em>' reference.
	 * @see #getProxy()
	 * @generated
	 */
	void setProxy(Proxy value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void create();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void retrieve();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void update();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void delete();

} // Application
