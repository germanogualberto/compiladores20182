/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.pascal.pascal.PascalPackage
 * @generated
 */
public interface PascalFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PascalFactory eINSTANCE = org.xtext.example.pascal.pascal.impl.PascalFactoryImpl.init();

  /**
   * Returns a new object of class '<em>program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>program</em>'.
   * @generated
   */
  program createprogram();

  /**
   * Returns a new object of class '<em>variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>variable</em>'.
   * @generated
   */
  variable createvariable();

  /**
   * Returns a new object of class '<em>var </em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>var </em>'.
   * @generated
   */
  var_ createvar_();

  /**
   * Returns a new object of class '<em>expression list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expression list</em>'.
   * @generated
   */
  expression_list createexpression_list();

  /**
   * Returns a new object of class '<em>expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expression</em>'.
   * @generated
   */
  expression createexpression();

  /**
   * Returns a new object of class '<em>simple expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>simple expression</em>'.
   * @generated
   */
  simple_expression createsimple_expression();

  /**
   * Returns a new object of class '<em>term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>term</em>'.
   * @generated
   */
  term createterm();

  /**
   * Returns a new object of class '<em>factor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>factor</em>'.
   * @generated
   */
  factor createfactor();

  /**
   * Returns a new object of class '<em>function designator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>function designator</em>'.
   * @generated
   */
  function_designator createfunction_designator();

  /**
   * Returns a new object of class '<em>set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>set</em>'.
   * @generated
   */
  set createset();

  /**
   * Returns a new object of class '<em>number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>number</em>'.
   * @generated
   */
  number createnumber();

  /**
   * Returns a new object of class '<em>any number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>any number</em>'.
   * @generated
   */
  any_number createany_number();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PascalPackage getPascalPackage();

} //PascalFactory
