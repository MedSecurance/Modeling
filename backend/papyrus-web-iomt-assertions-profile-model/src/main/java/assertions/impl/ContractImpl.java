/**
 */
package assertions.impl;

import assertions.Assertion;
import assertions.AssertionsPackage;
import assertions.Contract;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assertions.impl.ContractImpl#getName <em>Name</em>}</li>
 *   <li>{@link assertions.impl.ContractImpl#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link assertions.impl.ContractImpl#getGuarantees <em>Guarantees</em>}</li>
 *   <li>{@link assertions.impl.ContractImpl#getBase_Comment <em>Base Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractImpl extends MinimalEObjectImpl.Container implements Contract {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getAssumptions() <em>Assumptions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssumptions()
     * @generated
     * @ordered
     */
    protected EList<Assertion> assumptions;

    /**
     * The cached value of the '{@link #getGuarantees() <em>Guarantees</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGuarantees()
     * @generated
     * @ordered
     */
    protected EList<Assertion> guarantees;

    /**
     * The cached value of the '{@link #getBase_Comment() <em>Base Comment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBase_Comment()
     * @generated
     * @ordered
     */
    protected Comment base_Comment;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContractImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AssertionsPackage.Literals.CONTRACT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AssertionsPackage.CONTRACT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Assertion> getAssumptions() {
        if (assumptions == null) {
            assumptions = new EObjectResolvingEList<Assertion>(Assertion.class, this, AssertionsPackage.CONTRACT__ASSUMPTIONS);
        }
        return assumptions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Assertion> getGuarantees() {
        if (guarantees == null) {
            guarantees = new EObjectResolvingEList<Assertion>(Assertion.class, this, AssertionsPackage.CONTRACT__GUARANTEES);
        }
        return guarantees;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Comment getBase_Comment() {
        if (base_Comment != null && base_Comment.eIsProxy()) {
            InternalEObject oldBase_Comment = (InternalEObject)base_Comment;
            base_Comment = (Comment)eResolveProxy(oldBase_Comment);
            if (base_Comment != oldBase_Comment) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssertionsPackage.CONTRACT__BASE_COMMENT, oldBase_Comment, base_Comment));
            }
        }
        return base_Comment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Comment basicGetBase_Comment() {
        return base_Comment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBase_Comment(Comment newBase_Comment) {
        Comment oldBase_Comment = base_Comment;
        base_Comment = newBase_Comment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AssertionsPackage.CONTRACT__BASE_COMMENT, oldBase_Comment, base_Comment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AssertionsPackage.CONTRACT__NAME:
                return getName();
            case AssertionsPackage.CONTRACT__ASSUMPTIONS:
                return getAssumptions();
            case AssertionsPackage.CONTRACT__GUARANTEES:
                return getGuarantees();
            case AssertionsPackage.CONTRACT__BASE_COMMENT:
                if (resolve) return getBase_Comment();
                return basicGetBase_Comment();
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
            case AssertionsPackage.CONTRACT__NAME:
                setName((String)newValue);
                return;
            case AssertionsPackage.CONTRACT__ASSUMPTIONS:
                getAssumptions().clear();
                getAssumptions().addAll((Collection<? extends Assertion>)newValue);
                return;
            case AssertionsPackage.CONTRACT__GUARANTEES:
                getGuarantees().clear();
                getGuarantees().addAll((Collection<? extends Assertion>)newValue);
                return;
            case AssertionsPackage.CONTRACT__BASE_COMMENT:
                setBase_Comment((Comment)newValue);
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
            case AssertionsPackage.CONTRACT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case AssertionsPackage.CONTRACT__ASSUMPTIONS:
                getAssumptions().clear();
                return;
            case AssertionsPackage.CONTRACT__GUARANTEES:
                getGuarantees().clear();
                return;
            case AssertionsPackage.CONTRACT__BASE_COMMENT:
                setBase_Comment((Comment)null);
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
            case AssertionsPackage.CONTRACT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case AssertionsPackage.CONTRACT__ASSUMPTIONS:
                return assumptions != null && !assumptions.isEmpty();
            case AssertionsPackage.CONTRACT__GUARANTEES:
                return guarantees != null && !guarantees.isEmpty();
            case AssertionsPackage.CONTRACT__BASE_COMMENT:
                return base_Comment != null;
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
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //ContractImpl
