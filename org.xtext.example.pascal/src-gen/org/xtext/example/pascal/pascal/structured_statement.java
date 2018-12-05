/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>structured statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.structured_statement#getCompound <em>Compound</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.structured_statement#getWhile_stmt <em>While stmt</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getstructured_statement()
 * @model
 * @generated
 */
public interface structured_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Compound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compound</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compound</em>' containment reference.
   * @see #setCompound(compound_statement)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getstructured_statement_Compound()
   * @model containment="true"
   * @generated
   */
  compound_statement getCompound();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.structured_statement#getCompound <em>Compound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compound</em>' containment reference.
   * @see #getCompound()
   * @generated
   */
  void setCompound(compound_statement value);

  /**
   * Returns the value of the '<em><b>While stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>While stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>While stmt</em>' containment reference.
   * @see #setWhile_stmt(while_statement)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getstructured_statement_While_stmt()
   * @model containment="true"
   * @generated
   */
  while_statement getWhile_stmt();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.structured_statement#getWhile_stmt <em>While stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>While stmt</em>' containment reference.
   * @see #getWhile_stmt()
   * @generated
   */
  void setWhile_stmt(while_statement value);

} // structured_statement
