/**
 */
package IoMTProfile.WAN;

import IoMTProfile.Application.Application;

import IoMTProfile.IdentifiableElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IoMTProfile.WAN.DataStore#getProxy <em>Proxy</em>}</li>
 *   <li>{@link IoMTProfile.WAN.DataStore#getApplications <em>Applications</em>}</li>
 * </ul>
 *
 * @see IoMTProfile.WAN.WANPackage#getDataStore()
 * @model
 * @generated
 */
public interface DataStore extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Proxy</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.WAN.Proxy#getDatastores <em>Datastores</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy</em>' reference.
	 * @see #setProxy(Proxy)
	 * @see IoMTProfile.WAN.WANPackage#getDataStore_Proxy()
	 * @see IoMTProfile.WAN.Proxy#getDatastores
	 * @model opposite="datastores" ordered="false"
	 * @generated
	 */
	Proxy getProxy();

	/**
	 * Sets the value of the '{@link IoMTProfile.WAN.DataStore#getProxy <em>Proxy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy</em>' reference.
	 * @see #getProxy()
	 * @generated
	 */
	void setProxy(Proxy value);

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' reference list.
	 * The list contents are of type {@link IoMTProfile.Application.Application}.
	 * It is bidirectional and its opposite is '{@link IoMTProfile.Application.Application#getDatastore <em>Datastore</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' reference list.
	 * @see IoMTProfile.WAN.WANPackage#getDataStore_Applications()
	 * @see IoMTProfile.Application.Application#getDatastore
	 * @model opposite="datastore" ordered="false"
	 * @generated
	 */
	EList<Application> getApplications();

} // DataStore
