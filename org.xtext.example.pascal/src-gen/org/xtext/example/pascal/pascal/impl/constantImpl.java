/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.pascal.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.constant;
import org.xtext.example.pascal.pascal.number;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.constantImpl#getOpterator <em>Opterator</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.constantImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.constantImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.constantImpl#getString <em>String</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.constantImpl#getBoolLiteral <em>Bool Literal</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.constantImpl#isNil <em>Nil</em>}</li>
 * </ul>
 *
 * @generated
 */
public class constantImpl extends MinimalEObjectImpl.Container implements constant
{
  /**
   * The default value of the '{@link #getOpterator() <em>Opterator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpterator()
   * @generated
   * @ordered
   */
  protected static final String OPTERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpterator() <em>Opterator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpterator()
   * @generated
   * @ordered
   */
  protected String opterator = OPTERATOR_EDEFAULT;

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
   * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected number number;

  /**
   * The default value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected static final String STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected String string = STRING_EDEFAULT;

  /**
   * The default value of the '{@link #getBoolLiteral() <em>Bool Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolLiteral()
   * @generated
   * @ordered
   */
  protected static final String BOOL_LITERAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBoolLiteral() <em>Bool Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolLiteral()
   * @generated
   * @ordered
   */
  protected String boolLiteral = BOOL_LITERAL_EDEFAULT;

  /**
   * The default value of the '{@link #isNil() <em>Nil</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNil()
   * @generated
   * @ordered
   */
  protected static final boolean NIL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNil() <em>Nil</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNil()
   * @generated
   * @ordered
   */
  protected boolean nil = NIL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected constantImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PascalPackage.Literals.CONSTANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOpterator()
  {
    return opterator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpterator(String newOpterator)
  {
    String oldOpterator = opterator;
    opterator = newOpterator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__OPTERATOR, oldOpterator, opterator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public number getNumber()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumber(number newNumber, NotificationChain msgs)
  {
    number oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__NUMBER, oldNumber, newNumber);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumber(number newNumber)
  {
    if (newNumber != number)
    {
      NotificationChain msgs = null;
      if (number != null)
        msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__NUMBER, null, msgs);
      if (newNumber != null)
        msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONSTANT__NUMBER, null, msgs);
      msgs = basicSetNumber(newNumber, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__NUMBER, newNumber, newNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getString()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setString(String newString)
  {
    String oldString = string;
    string = newString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__STRING, oldString, string));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBoolLiteral()
  {
    return boolLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBoolLiteral(String newBoolLiteral)
  {
    String oldBoolLiteral = boolLiteral;
    boolLiteral = newBoolLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__BOOL_LITERAL, oldBoolLiteral, boolLiteral));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNil()
  {
    return nil;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNil(boolean newNil)
  {
    boolean oldNil = nil;
    nil = newNil;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONSTANT__NIL, oldNil, nil));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PascalPackage.CONSTANT__NUMBER:
        return basicSetNumber(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PascalPackage.CONSTANT__OPTERATOR:
        return getOpterator();
      case PascalPackage.CONSTANT__NAME:
        return getName();
      case PascalPackage.CONSTANT__NUMBER:
        return getNumber();
      case PascalPackage.CONSTANT__STRING:
        return getString();
      case PascalPackage.CONSTANT__BOOL_LITERAL:
        return getBoolLiteral();
      case PascalPackage.CONSTANT__NIL:
        return isNil();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.CONSTANT__OPTERATOR:
        setOpterator((String)newValue);
        return;
      case PascalPackage.CONSTANT__NAME:
        setName((String)newValue);
        return;
      case PascalPackage.CONSTANT__NUMBER:
        setNumber((number)newValue);
        return;
      case PascalPackage.CONSTANT__STRING:
        setString((String)newValue);
        return;
      case PascalPackage.CONSTANT__BOOL_LITERAL:
        setBoolLiteral((String)newValue);
        return;
      case PascalPackage.CONSTANT__NIL:
        setNil((Boolean)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.CONSTANT__OPTERATOR:
        setOpterator(OPTERATOR_EDEFAULT);
        return;
      case PascalPackage.CONSTANT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PascalPackage.CONSTANT__NUMBER:
        setNumber((number)null);
        return;
      case PascalPackage.CONSTANT__STRING:
        setString(STRING_EDEFAULT);
        return;
      case PascalPackage.CONSTANT__BOOL_LITERAL:
        setBoolLiteral(BOOL_LITERAL_EDEFAULT);
        return;
      case PascalPackage.CONSTANT__NIL:
        setNil(NIL_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.CONSTANT__OPTERATOR:
        return OPTERATOR_EDEFAULT == null ? opterator != null : !OPTERATOR_EDEFAULT.equals(opterator);
      case PascalPackage.CONSTANT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PascalPackage.CONSTANT__NUMBER:
        return number != null;
      case PascalPackage.CONSTANT__STRING:
        return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
      case PascalPackage.CONSTANT__BOOL_LITERAL:
        return BOOL_LITERAL_EDEFAULT == null ? boolLiteral != null : !BOOL_LITERAL_EDEFAULT.equals(boolLiteral);
      case PascalPackage.CONSTANT__NIL:
        return nil != NIL_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (opterator: ");
    result.append(opterator);
    result.append(", name: ");
    result.append(name);
    result.append(", string: ");
    result.append(string);
    result.append(", boolLiteral: ");
    result.append(boolLiteral);
    result.append(", nil: ");
    result.append(nil);
    result.append(')');
    return result.toString();
  }

} //constantImpl
