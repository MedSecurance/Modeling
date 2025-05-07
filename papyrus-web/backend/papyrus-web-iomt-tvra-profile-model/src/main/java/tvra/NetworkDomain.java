/**
 */
package tvra;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tvra.NetworkDomain#getBase_Association <em>Base Association</em>}</li>
 *   <li>{@link tvra.NetworkDomain#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see tvra.TvraPackage#getNetworkDomain()
 * @model
 * @generated
 */
public interface NetworkDomain extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Association</em>' reference.
	 * @see #setBase_Association(Association)
	 * @see tvra.TvraPackage#getNetworkDomain_Base_Association()
	 * @model ordered="false"
	 * @generated
	 */
	Association getBase_Association();

	/**
	 * Sets the value of the '{@link tvra.NetworkDomain#getBase_Association <em>Base Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Association</em>' reference.
	 * @see #getBase_Association()
	 * @generated
	 */
	void setBase_Association(Association value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link tvra.NetworkDomainKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see tvra.NetworkDomainKind
	 * @see #setKind(NetworkDomainKind)
	 * @see tvra.TvraPackage#getNetworkDomain_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NetworkDomainKind getKind();

	/**
	 * Sets the value of the '{@link tvra.NetworkDomain#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see tvra.NetworkDomainKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(NetworkDomainKind value);

} // NetworkDomain
