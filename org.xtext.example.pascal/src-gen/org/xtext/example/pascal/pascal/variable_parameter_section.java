/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable parameter section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.variable_parameter_section#getIndentifiers <em>Indentifiers</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.variable_parameter_section#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getvariable_parameter_section()
 * @model
 * @generated
 */
public interface variable_parameter_section extends EObject
{
  /**
   * Returns the value of the '<em><b>Indentifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Indentifiers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indentifiers</em>' containment reference.
   * @see #setIndentifiers(identifier_list)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getvariable_parameter_section_Indentifiers()
   * @model containment="true"
   * @generated
   */
  identifier_list getIndentifiers();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.variable_parameter_section#getIndentifiers <em>Indentifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Indentifiers</em>' containment reference.
   * @see #getIndentifiers()
   * @generated
   */
  void setIndentifiers(identifier_list value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(parameter_type)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getvariable_parameter_section_Type()
   * @model containment="true"
   * @generated
   */
  parameter_type getType();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.variable_parameter_section#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(parameter_type value);

} // variable_parameter_section