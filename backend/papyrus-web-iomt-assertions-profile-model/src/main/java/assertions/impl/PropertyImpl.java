/**
 */
package assertions.impl;

import assertions.AssertionsPackage;
import assertions.Property;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.OpaqueExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assertions.impl.PropertyImpl#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link assertions.impl.PropertyImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property {
    /**
     * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBase_Property()
     * @generated
     * @ordered
     */
    protected org.eclipse.uml2.uml.Property base_Property;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AssertionsPackage.Literals.PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public org.eclipse.uml2.uml.Property getBase_Property() {
        if (base_Property != null && base_Property.eIsProxy()) {
            InternalEObject oldBase_Property = (InternalEObject)base_Property;
            base_Property = (org.eclipse.uml2.uml.Property)eResolveProxy(oldBase_Property);
            if (base_Property != oldBase_Property) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssertionsPackage.PROPERTY__BASE_PROPERTY, oldBase_Property, base_Property));
            }
        }
        return base_Property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.uml2.uml.Property basicGetBase_Property() {
        return base_Property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBase_Property(org.eclipse.uml2.uml.Property newBase_Property) {
        org.eclipse.uml2.uml.Property oldBase_Property = base_Property;
        base_Property = newBase_Property;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AssertionsPackage.PROPERTY__BASE_PROPERTY, oldBase_Property, base_Property));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OpaqueExpression getExpression() {
        OpaqueExpression expression = basicGetExpression();
        return expression != null && expression.eIsProxy() ? (OpaqueExpression)eResolveProxy((InternalEObject)expression) : expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpaqueExpression basicGetExpression() {
        // TODO: implement this method to return the 'Expression' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AssertionsPackage.PROPERTY__BASE_PROPERTY:
                if (resolve) return getBase_Property();
                return basicGetBase_Property();
            case AssertionsPackage.PROPERTY__EXPRESSION:
                if (resolve) return getExpression();
                return basicGetExpression();
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
            case AssertionsPackage.PROPERTY__BASE_PROPERTY:
                setBase_Property((org.eclipse.uml2.uml.Property)newValue);
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
            case AssertionsPackage.PROPERTY__BASE_PROPERTY:
                setBase_Property((org.eclipse.uml2.uml.Property)null);
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
            case AssertionsPackage.PROPERTY__BASE_PROPERTY:
                return base_Property != null;
            case AssertionsPackage.PROPERTY__EXPRESSION:
                return basicGetExpression() != null;
        }
        return super.eIsSet(featureID);
    }

} //PropertyImpl
