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
import org.xtext.example.pascal.pascal.expression;
import org.xtext.example.pascal.pascal.expression_list;
import org.xtext.example.pascal.pascal.factor;
import org.xtext.example.pascal.pascal.function_designator;
import org.xtext.example.pascal.pascal.number;
import org.xtext.example.pascal.pascal.program;
import org.xtext.example.pascal.pascal.set;
import org.xtext.example.pascal.pascal.simple_expression;
import org.xtext.example.pascal.pascal.term;
import org.xtext.example.pascal.pascal.var_;
import org.xtext.example.pascal.pascal.variable;
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
			case PascalPackage.EXPRESSION:
				sequence_expression(context, (expression) semanticObject); 
				return; 
			case PascalPackage.EXPRESSION_LIST:
				sequence_expression_list(context, (expression_list) semanticObject); 
				return; 
			case PascalPackage.FACTOR:
				sequence_factor(context, (factor) semanticObject); 
				return; 
			case PascalPackage.FUNCTION_DESIGNATOR:
				sequence_function_designator(context, (function_designator) semanticObject); 
				return; 
			case PascalPackage.NUMBER:
				sequence_number(context, (number) semanticObject); 
				return; 
			case PascalPackage.PROGRAM:
				sequence_program(context, (program) semanticObject); 
				return; 
			case PascalPackage.SET:
				sequence_set(context, (set) semanticObject); 
				return; 
			case PascalPackage.SIMPLE_EXPRESSION:
				sequence_simple_expression(context, (simple_expression) semanticObject); 
				return; 
			case PascalPackage.TERM:
				sequence_term(context, (term) semanticObject); 
				return; 
			case PascalPackage.VAR_:
				sequence_var_(context, (var_) semanticObject); 
				return; 
			case PascalPackage.VARIABLE:
				sequence_variable(context, (variable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
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
	 *     program returns program
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_program(ISerializationContext context, program semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PascalPackage.Literals.PROGRAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.PROGRAM__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
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
