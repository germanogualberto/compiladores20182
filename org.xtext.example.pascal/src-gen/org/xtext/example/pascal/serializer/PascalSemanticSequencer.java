/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.pascal.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.any_number;
import org.xtext.example.pascal.pascal.assignment_statement;
import org.xtext.example.pascal.pascal.block;
import org.xtext.example.pascal.pascal.expression;
import org.xtext.example.pascal.pascal.expression_list;
import org.xtext.example.pascal.pascal.factor;
import org.xtext.example.pascal.pascal.formal_parameter_list;
import org.xtext.example.pascal.pascal.formal_parameter_section;
import org.xtext.example.pascal.pascal.function_declaration;
import org.xtext.example.pascal.pascal.function_designator;
import org.xtext.example.pascal.pascal.function_heading;
import org.xtext.example.pascal.pascal.function_procedure_declaration;
import org.xtext.example.pascal.pascal.identifier_list;
import org.xtext.example.pascal.pascal.label;
import org.xtext.example.pascal.pascal.number;
import org.xtext.example.pascal.pascal.parameter_type;
import org.xtext.example.pascal.pascal.pascal;
import org.xtext.example.pascal.pascal.procedure_declaration;
import org.xtext.example.pascal.pascal.procedure_heading;
import org.xtext.example.pascal.pascal.program;
import org.xtext.example.pascal.pascal.program_heading_block;
import org.xtext.example.pascal.pascal.set;
import org.xtext.example.pascal.pascal.simple_expression;
import org.xtext.example.pascal.pascal.simple_statement;
import org.xtext.example.pascal.pascal.statement;
import org.xtext.example.pascal.pascal.statement_part;
import org.xtext.example.pascal.pascal.statement_sequence;
import org.xtext.example.pascal.pascal.term;
import org.xtext.example.pascal.pascal.value_parameter_section;
import org.xtext.example.pascal.pascal.var_;
import org.xtext.example.pascal.pascal.variable;
import org.xtext.example.pascal.pascal.variable_parameter_section;
import org.xtext.example.pascal.services.PascalGrammarAccess;

@SuppressWarnings("all")
public class PascalSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PascalGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PascalPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PascalPackage.ANY_NUMBER:
				if (rule == grammarAccess.getSigned_numberRule()) {
					sequence_signed_number(context, (any_number) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAny_numberRule()) {
					sequence_signed_number_unsigned_number(context, (any_number) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getUnsigned_numberRule()) {
					sequence_unsigned_number(context, (any_number) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.ASSIGNMENT_STATEMENT:
				sequence_assignment_statement(context, (assignment_statement) semanticObject); 
				return; 
			case PascalPackage.BLOCK:
				sequence_block(context, (block) semanticObject); 
				return; 
			case PascalPackage.EXPRESSION:
				sequence_expression(context, (expression) semanticObject); 
				return; 
			case PascalPackage.EXPRESSION_LIST:
				sequence_expression_list(context, (expression_list) semanticObject); 
				return; 
			case PascalPackage.FACTOR:
				sequence_factor(context, (factor) semanticObject); 
				return; 
			case PascalPackage.FORMAL_PARAMETER_LIST:
				sequence_formal_parameter_list(context, (formal_parameter_list) semanticObject); 
				return; 
			case PascalPackage.FORMAL_PARAMETER_SECTION:
				sequence_formal_parameter_section(context, (formal_parameter_section) semanticObject); 
				return; 
			case PascalPackage.FUNCTION_DECLARATION:
				sequence_function_declaration(context, (function_declaration) semanticObject); 
				return; 
			case PascalPackage.FUNCTION_DESIGNATOR:
				sequence_function_designator(context, (function_designator) semanticObject); 
				return; 
			case PascalPackage.FUNCTION_HEADING:
				sequence_function_heading(context, (function_heading) semanticObject); 
				return; 
			case PascalPackage.FUNCTION_PROCEDURE_DECLARATION:
				sequence_function_procedure_declaration(context, (function_procedure_declaration) semanticObject); 
				return; 
			case PascalPackage.IDENTIFIER_LIST:
				sequence_identifier_list(context, (identifier_list) semanticObject); 
				return; 
			case PascalPackage.LABEL:
				sequence_label(context, (label) semanticObject); 
				return; 
			case PascalPackage.NUMBER:
				sequence_number(context, (number) semanticObject); 
				return; 
			case PascalPackage.PARAMETER_TYPE:
				sequence_parameter_type(context, (parameter_type) semanticObject); 
				return; 
			case PascalPackage.PASCAL:
				sequence_pascal(context, (pascal) semanticObject); 
				return; 
			case PascalPackage.PROCEDURE_DECLARATION:
				sequence_procedure_declaration(context, (procedure_declaration) semanticObject); 
				return; 
			case PascalPackage.PROCEDURE_HEADING:
				sequence_procedure_heading(context, (procedure_heading) semanticObject); 
				return; 
			case PascalPackage.PROGRAM:
				sequence_program(context, (program) semanticObject); 
				return; 
			case PascalPackage.PROGRAM_HEADING_BLOCK:
				sequence_program_heading_block(context, (program_heading_block) semanticObject); 
				return; 
			case PascalPackage.SET:
				sequence_set(context, (set) semanticObject); 
				return; 
			case PascalPackage.SIMPLE_EXPRESSION:
				sequence_simple_expression(context, (simple_expression) semanticObject); 
				return; 
			case PascalPackage.SIMPLE_STATEMENT:
				sequence_simple_statement(context, (simple_statement) semanticObject); 
				return; 
			case PascalPackage.STATEMENT:
				sequence_statement(context, (statement) semanticObject); 
				return; 
			case PascalPackage.STATEMENT_PART:
				sequence_statement_part(context, (statement_part) semanticObject); 
				return; 
			case PascalPackage.STATEMENT_SEQUENCE:
				sequence_statement_sequence(context, (statement_sequence) semanticObject); 
				return; 
			case PascalPackage.TERM:
				sequence_term(context, (term) semanticObject); 
				return; 
			case PascalPackage.VALUE_PARAMETER_SECTION:
				sequence_value_parameter_section(context, (value_parameter_section) semanticObject); 
				return; 
			case PascalPackage.VAR_:
				sequence_var_(context, (var_) semanticObject); 
				return; 
			case PascalPackage.VARIABLE:
				sequence_variable(context, (variable) semanticObject); 
				return; 
			case PascalPackage.VARIABLE_PARAMETER_SECTION:
				sequence_variable_parameter_section(context, (variable_parameter_section) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     assignment_statement returns assignment_statement
	 *
	 * Constraint:
	 *     (variable=variable expression=expression)
	 */
	protected void sequence_assignment_statement(ISerializationContext context, assignment_statement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.ASSIGNMENT_STATEMENT__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.ASSIGNMENT_STATEMENT__VARIABLE));
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.ASSIGNMENT_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.ASSIGNMENT_STATEMENT__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     block returns block
	 *
	 * Constraint:
	 *     (abstraction=function_procedure_declaration? statement=statement_part)
	 */
	protected void sequence_block(ISerializationContext context, block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     expression returns expression
	 *
	 * Constraint:
	 *     (expressions+=simple_expression ((operators+=RELATIONAL_OP | operators+='in' | operators+='=') expressions+=simple_expression)?)
	 */
	protected void sequence_expression(ISerializationContext context, expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     expression_list returns expression_list
	 *
	 * Constraint:
	 *     (expressions+=expression expressions+=expression*)
	 */
	protected void sequence_expression_list(ISerializationContext context, expression_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     factor returns factor
	 *
	 * Constraint:
	 *     (
	 *         variable=variable | 
	 *         number=number | 
	 *         string=STRING | 
	 *         set=set | 
	 *         nil?='nil' | 
	 *         boolean='true' | 
	 *         boolean='false' | 
	 *         function=function_designator | 
	 *         expression=expression | 
	 *         not=factor
	 *     )
	 */
	protected void sequence_factor(ISerializationContext context, factor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     formal_parameter_list returns formal_parameter_list
	 *
	 * Constraint:
	 *     (parameters+=formal_parameter_section parameters+=formal_parameter_section*)
	 */
	protected void sequence_formal_parameter_list(ISerializationContext context, formal_parameter_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     formal_parameter_section returns formal_parameter_section
	 *
	 * Constraint:
	 *     (value=value_parameter_section | variable=variable_parameter_section | procedure=procedure_heading | function=function_heading)
	 */
	protected void sequence_formal_parameter_section(ISerializationContext context, formal_parameter_section semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     function_declaration returns function_declaration
	 *
	 * Constraint:
	 *     (heading=function_heading block=block)
	 */
	protected void sequence_function_declaration(ISerializationContext context, function_declaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.FUNCTION_DECLARATION__HEADING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.FUNCTION_DECLARATION__HEADING));
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.FUNCTION_DECLARATION__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.FUNCTION_DECLARATION__BLOCK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFunction_declarationAccess().getHeadingFunction_headingParserRuleCall_0_0(), semanticObject.getHeading());
		feeder.accept(grammarAccess.getFunction_declarationAccess().getBlockBlockParserRuleCall_2_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     function_designator returns function_designator
	 *
	 * Constraint:
	 *     (name=ID expressions=expression_list?)
	 */
	protected void sequence_function_designator(ISerializationContext context, function_designator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     function_heading returns function_heading
	 *
	 * Constraint:
	 *     (name=ID parameters=formal_parameter_list? returnType=ID)
	 */
	protected void sequence_function_heading(ISerializationContext context, function_heading semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     function_procedure_declaration returns function_procedure_declaration
	 *
	 * Constraint:
	 *     (procedures+=function_declaration | functions+=procedure_declaration)+
	 */
	protected void sequence_function_procedure_declaration(ISerializationContext context, function_procedure_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     identifier_list returns identifier_list
	 *
	 * Constraint:
	 *     (names+=ID names+=ID*)
	 */
	protected void sequence_identifier_list(ISerializationContext context, identifier_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     label returns label
	 *
	 * Constraint:
	 *     (number=SIGNED_INTEGER_NUMBER | number=INTEGER_NUMBER)
	 */
	protected void sequence_label(ISerializationContext context, label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     number returns number
	 *
	 * Constraint:
	 *     number=any_number
	 */
	protected void sequence_number(ISerializationContext context, number semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.NUMBER__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.NUMBER__NUMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberAccess().getNumberAny_numberParserRuleCall_0(), semanticObject.getNumber());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     parameter_type returns parameter_type
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_parameter_type(ISerializationContext context, parameter_type semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.PARAMETER_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.PARAMETER_TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameter_typeAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     pascal returns pascal
	 *
	 * Constraint:
	 *     program+=program
	 */
	protected void sequence_pascal(ISerializationContext context, pascal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     procedure_declaration returns procedure_declaration
	 *
	 * Constraint:
	 *     (heading=procedure_heading block=block)
	 */
	protected void sequence_procedure_declaration(ISerializationContext context, procedure_declaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.PROCEDURE_DECLARATION__HEADING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.PROCEDURE_DECLARATION__HEADING));
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.PROCEDURE_DECLARATION__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.PROCEDURE_DECLARATION__BLOCK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProcedure_declarationAccess().getHeadingProcedure_headingParserRuleCall_0_0(), semanticObject.getHeading());
		feeder.accept(grammarAccess.getProcedure_declarationAccess().getBlockBlockParserRuleCall_2_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     procedure_heading returns procedure_heading
	 *
	 * Constraint:
	 *     (name=ID parameters=formal_parameter_list?)
	 */
	protected void sequence_procedure_heading(ISerializationContext context, procedure_heading semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     program_heading_block returns program_heading_block
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_program_heading_block(ISerializationContext context, program_heading_block semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.PROGRAM_HEADING_BLOCK__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.PROGRAM_HEADING_BLOCK__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProgram_heading_blockAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     program returns program
	 *
	 * Constraint:
	 *     (heading=program_heading_block block=block)
	 */
	protected void sequence_program(ISerializationContext context, program semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.PROGRAM__HEADING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.PROGRAM__HEADING));
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.PROGRAM__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.PROGRAM__BLOCK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProgramAccess().getHeadingProgram_heading_blockParserRuleCall_0_0(), semanticObject.getHeading());
		feeder.accept(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     set returns set
	 *
	 * Constraint:
	 *     (brackets+='[' expressions=expression_list? brackets+=']')
	 */
	protected void sequence_set(ISerializationContext context, set semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     signed_number returns any_number
	 *
	 * Constraint:
	 *     (integer=SIGNED_INTEGER_NUMBER | real=SIGNED_REAL_NUMBER)
	 */
	protected void sequence_signed_number(ISerializationContext context, any_number semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     any_number returns any_number
	 *
	 * Constraint:
	 *     (integer=SIGNED_INTEGER_NUMBER | real=SIGNED_REAL_NUMBER | integer=INTEGER_NUMBER | real=REAL_NUMBER)
	 */
	protected void sequence_signed_number_unsigned_number(ISerializationContext context, any_number semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     simple_expression returns simple_expression
	 *
	 * Constraint:
	 *     (prefixOperator=ADDITION_OP? terms+=term (terms+=unsigned_number? ((operators+=ADDITION_OP | operators+='or') terms+=term)?)+)
	 */
	protected void sequence_simple_expression(ISerializationContext context, simple_expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     simple_statement returns simple_statement
	 *
	 * Constraint:
	 *     (assignment=assignment_statement | function=function_designator | function_noargs=ID)
	 */
	protected void sequence_simple_statement(ISerializationContext context, simple_statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     statement_part returns statement_part
	 *
	 * Constraint:
	 *     sequence=statement_sequence
	 */
	protected void sequence_statement_part(ISerializationContext context, statement_part semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.STATEMENT_PART__SEQUENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.STATEMENT_PART__SEQUENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStatement_partAccess().getSequenceStatement_sequenceParserRuleCall_1_0(), semanticObject.getSequence());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     statement_sequence returns statement_sequence
	 *
	 * Constraint:
	 *     (statements+=statement statements+=statement*)
	 */
	protected void sequence_statement_sequence(ISerializationContext context, statement_sequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     statement returns statement
	 *
	 * Constraint:
	 *     (label=label? simple=simple_statement)
	 */
	protected void sequence_statement(ISerializationContext context, statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     term returns term
	 *
	 * Constraint:
	 *     (factors+=factor ((operators+=MULTIPLICATION_OP | operators+='div' | operators+='mod' | operators+='and') factors+=factor)*)
	 */
	protected void sequence_term(ISerializationContext context, term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     unsigned_number returns any_number
	 *
	 * Constraint:
	 *     (integer=INTEGER_NUMBER | real=REAL_NUMBER)
	 */
	protected void sequence_unsigned_number(ISerializationContext context, any_number semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     value_parameter_section returns value_parameter_section
	 *
	 * Constraint:
	 *     (identifiers=identifier_list type=parameter_type)
	 */
	protected void sequence_value_parameter_section(ISerializationContext context, value_parameter_section semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VALUE_PARAMETER_SECTION__IDENTIFIERS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VALUE_PARAMETER_SECTION__IDENTIFIERS));
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VALUE_PARAMETER_SECTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VALUE_PARAMETER_SECTION__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0(), semanticObject.getIdentifiers());
		feeder.accept(grammarAccess.getValue_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     var_ returns var_
	 *
	 * Constraint:
	 *     ((expressions=expression_list array=var_) | (accessor?='.' name=ID variable=var_) | pointer=var_)
	 */
	protected void sequence_var_(ISerializationContext context, var_ semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     variable_parameter_section returns variable_parameter_section
	 *
	 * Constraint:
	 *     (indentifiers=identifier_list type=parameter_type)
	 */
	protected void sequence_variable_parameter_section(ISerializationContext context, variable_parameter_section semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VARIABLE_PARAMETER_SECTION__INDENTIFIERS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VARIABLE_PARAMETER_SECTION__INDENTIFIERS));
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VARIABLE_PARAMETER_SECTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VARIABLE_PARAMETER_SECTION__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariable_parameter_sectionAccess().getIndentifiersIdentifier_listParserRuleCall_1_0(), semanticObject.getIndentifiers());
		feeder.accept(grammarAccess.getVariable_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     variable returns variable
	 *
	 * Constraint:
	 *     (name=ID variable=var_)
	 */
	protected void sequence_variable(ISerializationContext context, variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VARIABLE__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VARIABLE__VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableAccess().getVariableVar_ParserRuleCall_1_0(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
}
