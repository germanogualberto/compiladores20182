/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.pascal.pascal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.pascal.pascal.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PascalFactoryImpl extends EFactoryImpl implements PascalFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PascalFactory init()
  {
    try
    {
      PascalFactory thePascalFactory = (PascalFactory)EPackage.Registry.INSTANCE.getEFactory(PascalPackage.eNS_URI);
      if (thePascalFactory != null)
      {
        return thePascalFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PascalFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PascalFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PascalPackage.PASCAL: return createpascal();
      case PascalPackage.PROGRAM: return createprogram();
      case PascalPackage.PROGRAM_HEADING_BLOCK: return createprogram_heading_block();
      case PascalPackage.BLOCK: return createblock();
      case PascalPackage.STATEMENT_PART: return createstatement_part();
      case PascalPackage.STATEMENT_SEQUENCE: return createstatement_sequence();
      case PascalPackage.STATEMENT: return createstatement();
      case PascalPackage.SIMPLE_STATEMENT: return createsimple_statement();
      case PascalPackage.ASSIGNMENT_STATEMENT: return createassignment_statement();
      case PascalPackage.LABEL: return createlabel();
      case PascalPackage.VARIABLE: return createvariable();
      case PascalPackage.VAR_: return createvar_();
      case PascalPackage.EXPRESSION_LIST: return createexpression_list();
      case PascalPackage.EXPRESSION: return createexpression();
      case PascalPackage.SIMPLE_EXPRESSION: return createsimple_expression();
      case PascalPackage.TERM: return createterm();
      case PascalPackage.FACTOR: return createfactor();
      case PascalPackage.FUNCTION_DESIGNATOR: return createfunction_designator();
      case PascalPackage.FUNCTION_PROCEDURE_DECLARATION: return createfunction_procedure_declaration();
      case PascalPackage.FUNCTION_HEADING: return createfunction_heading();
      case PascalPackage.FUNCTION_DECLARATION: return createfunction_declaration();
      case PascalPackage.FORMAL_PARAMETER_LIST: return createformal_parameter_list();
      case PascalPackage.FORMAL_PARAMETER_SECTION: return createformal_parameter_section();
      case PascalPackage.VALUE_PARAMETER_SECTION: return createvalue_parameter_section();
      case PascalPackage.IDENTIFIER_LIST: return createidentifier_list();
      case PascalPackage.PARAMETER_TYPE: return createparameter_type();
      case PascalPackage.VARIABLE_PARAMETER_SECTION: return createvariable_parameter_section();
      case PascalPackage.PROCEDURE_DECLARATION: return createprocedure_declaration();
      case PascalPackage.PROCEDURE_HEADING: return createprocedure_heading();
      case PascalPackage.SET: return createset();
      case PascalPackage.NUMBER: return createnumber();
      case PascalPackage.ANY_NUMBER: return createany_number();
      case PascalPackage.LABEL_DECLARATION: return createlabel_declaration();
      case PascalPackage.CONSTANT: return createconstant();
      case PascalPackage.CONSTANT_DEFINITION_PART: return createconstant_definition_part();
      case PascalPackage.CONSTANT_DEFINITION: return createconstant_definition();
      case PascalPackage.TYPE_DEFINITION_PART: return createtype_definition_part();
      case PascalPackage.TYPE_DEFINITION: return createtype_definition();
      case PascalPackage.TYPE: return createtype();
      case PascalPackage.SIMPLE_TYPE: return createsimple_type();
      case PascalPackage.SUBRANGE_TYPE: return createsubrange_type();
      case PascalPackage.ENUMERATED_TYPE: return createenumerated_type();
      case PascalPackage.STRUTURED_TYPE: return createstrutured_type();
      case PascalPackage.UNPACKED_STRUTURED_TYPE: return createunpacked_strutured_type();
      case PascalPackage.SET_TYPE: return createset_type();
      case PascalPackage.POINTER_TYPE: return createpointer_type();
      case PascalPackage.VARIABLE_DECLARATION_PART: return createvariable_declaration_part();
      case PascalPackage.VARIABLE_SECTION: return createvariable_section();
      case PascalPackage.VARIABLE_IDENTIFIER_LIST: return createvariable_identifier_list();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pascal createpascal()
  {
    pascalImpl pascal = new pascalImpl();
    return pascal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public program createprogram()
  {
    programImpl program = new programImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public program_heading_block createprogram_heading_block()
  {
    program_heading_blockImpl program_heading_block = new program_heading_blockImpl();
    return program_heading_block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block createblock()
  {
    blockImpl block = new blockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_part createstatement_part()
  {
    statement_partImpl statement_part = new statement_partImpl();
    return statement_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_sequence createstatement_sequence()
  {
    statement_sequenceImpl statement_sequence = new statement_sequenceImpl();
    return statement_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement createstatement()
  {
    statementImpl statement = new statementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_statement createsimple_statement()
  {
    simple_statementImpl simple_statement = new simple_statementImpl();
    return simple_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assignment_statement createassignment_statement()
  {
    assignment_statementImpl assignment_statement = new assignment_statementImpl();
    return assignment_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public label createlabel()
  {
    labelImpl label = new labelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable createvariable()
  {
    variableImpl variable = new variableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public var_ createvar_()
  {
    var_Impl var_ = new var_Impl();
    return var_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression_list createexpression_list()
  {
    expression_listImpl expression_list = new expression_listImpl();
    return expression_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression createexpression()
  {
    expressionImpl expression = new expressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_expression createsimple_expression()
  {
    simple_expressionImpl simple_expression = new simple_expressionImpl();
    return simple_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public term createterm()
  {
    termImpl term = new termImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public factor createfactor()
  {
    factorImpl factor = new factorImpl();
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_designator createfunction_designator()
  {
    function_designatorImpl function_designator = new function_designatorImpl();
    return function_designator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_procedure_declaration createfunction_procedure_declaration()
  {
    function_procedure_declarationImpl function_procedure_declaration = new function_procedure_declarationImpl();
    return function_procedure_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_heading createfunction_heading()
  {
    function_headingImpl function_heading = new function_headingImpl();
    return function_heading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_declaration createfunction_declaration()
  {
    function_declarationImpl function_declaration = new function_declarationImpl();
    return function_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public formal_parameter_list createformal_parameter_list()
  {
    formal_parameter_listImpl formal_parameter_list = new formal_parameter_listImpl();
    return formal_parameter_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public formal_parameter_section createformal_parameter_section()
  {
    formal_parameter_sectionImpl formal_parameter_section = new formal_parameter_sectionImpl();
    return formal_parameter_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public value_parameter_section createvalue_parameter_section()
  {
    value_parameter_sectionImpl value_parameter_section = new value_parameter_sectionImpl();
    return value_parameter_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier_list createidentifier_list()
  {
    identifier_listImpl identifier_list = new identifier_listImpl();
    return identifier_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_type createparameter_type()
  {
    parameter_typeImpl parameter_type = new parameter_typeImpl();
    return parameter_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_parameter_section createvariable_parameter_section()
  {
    variable_parameter_sectionImpl variable_parameter_section = new variable_parameter_sectionImpl();
    return variable_parameter_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedure_declaration createprocedure_declaration()
  {
    procedure_declarationImpl procedure_declaration = new procedure_declarationImpl();
    return procedure_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedure_heading createprocedure_heading()
  {
    procedure_headingImpl procedure_heading = new procedure_headingImpl();
    return procedure_heading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public set createset()
  {
    setImpl set = new setImpl();
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public number createnumber()
  {
    numberImpl number = new numberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public any_number createany_number()
  {
    any_numberImpl any_number = new any_numberImpl();
    return any_number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public label_declaration createlabel_declaration()
  {
    label_declarationImpl label_declaration = new label_declarationImpl();
    return label_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant createconstant()
  {
    constantImpl constant = new constantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant_definition_part createconstant_definition_part()
  {
    constant_definition_partImpl constant_definition_part = new constant_definition_partImpl();
    return constant_definition_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant_definition createconstant_definition()
  {
    constant_definitionImpl constant_definition = new constant_definitionImpl();
    return constant_definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_definition_part createtype_definition_part()
  {
    type_definition_partImpl type_definition_part = new type_definition_partImpl();
    return type_definition_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_definition createtype_definition()
  {
    type_definitionImpl type_definition = new type_definitionImpl();
    return type_definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type createtype()
  {
    typeImpl type = new typeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_type createsimple_type()
  {
    simple_typeImpl simple_type = new simple_typeImpl();
    return simple_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public subrange_type createsubrange_type()
  {
    subrange_typeImpl subrange_type = new subrange_typeImpl();
    return subrange_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public enumerated_type createenumerated_type()
  {
    enumerated_typeImpl enumerated_type = new enumerated_typeImpl();
    return enumerated_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public strutured_type createstrutured_type()
  {
    strutured_typeImpl strutured_type = new strutured_typeImpl();
    return strutured_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unpacked_strutured_type createunpacked_strutured_type()
  {
    unpacked_strutured_typeImpl unpacked_strutured_type = new unpacked_strutured_typeImpl();
    return unpacked_strutured_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public set_type createset_type()
  {
    set_typeImpl set_type = new set_typeImpl();
    return set_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pointer_type createpointer_type()
  {
    pointer_typeImpl pointer_type = new pointer_typeImpl();
    return pointer_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_declaration_part createvariable_declaration_part()
  {
    variable_declaration_partImpl variable_declaration_part = new variable_declaration_partImpl();
    return variable_declaration_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_section createvariable_section()
  {
    variable_sectionImpl variable_section = new variable_sectionImpl();
    return variable_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_identifier_list createvariable_identifier_list()
  {
    variable_identifier_listImpl variable_identifier_list = new variable_identifier_listImpl();
    return variable_identifier_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PascalPackage getPascalPackage()
  {
    return (PascalPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PascalPackage getPackage()
  {
    return PascalPackage.eINSTANCE;
  }

} //PascalFactoryImpl
