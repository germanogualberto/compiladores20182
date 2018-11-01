/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.pascal.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.pascal.ide.contentassist.antlr.internal.InternalPascalParser;
import org.xtext.example.pascal.services.PascalGrammarAccess;

public class PascalParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(PascalGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, PascalGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSimple_statementAccess().getAlternatives(), "rule__Simple_statement__Alternatives");
			builder.put(grammarAccess.getLabelAccess().getAlternatives(), "rule__Label__Alternatives");
			builder.put(grammarAccess.getVar_Access().getAlternatives(), "rule__Var___Alternatives");
			builder.put(grammarAccess.getExpressionAccess().getAlternatives_1_0(), "rule__Expression__Alternatives_1_0");
			builder.put(grammarAccess.getSimple_expressionAccess().getAlternatives_2(), "rule__Simple_expression__Alternatives_2");
			builder.put(grammarAccess.getSimple_expressionAccess().getAlternatives_2_0_0(), "rule__Simple_expression__Alternatives_2_0_0");
			builder.put(grammarAccess.getTermAccess().getAlternatives_1_0(), "rule__Term__Alternatives_1_0");
			builder.put(grammarAccess.getFactorAccess().getAlternatives(), "rule__Factor__Alternatives");
			builder.put(grammarAccess.getAny_numberAccess().getAlternatives(), "rule__Any_number__Alternatives");
			builder.put(grammarAccess.getSigned_numberAccess().getAlternatives(), "rule__Signed_number__Alternatives");
			builder.put(grammarAccess.getUnsigned_numberAccess().getAlternatives(), "rule__Unsigned_number__Alternatives");
			builder.put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
			builder.put(grammarAccess.getProgram_heading_blockAccess().getGroup(), "rule__Program_heading_block__Group__0");
			builder.put(grammarAccess.getStatement_partAccess().getGroup(), "rule__Statement_part__Group__0");
			builder.put(grammarAccess.getStatement_sequenceAccess().getGroup(), "rule__Statement_sequence__Group__0");
			builder.put(grammarAccess.getStatement_sequenceAccess().getGroup_1(), "rule__Statement_sequence__Group_1__0");
			builder.put(grammarAccess.getStatementAccess().getGroup(), "rule__Statement__Group__0");
			builder.put(grammarAccess.getStatementAccess().getGroup_0(), "rule__Statement__Group_0__0");
			builder.put(grammarAccess.getAssignment_statementAccess().getGroup(), "rule__Assignment_statement__Group__0");
			builder.put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
			builder.put(grammarAccess.getVar_Access().getGroup_0(), "rule__Var___Group_0__0");
			builder.put(grammarAccess.getVar_Access().getGroup_1(), "rule__Var___Group_1__0");
			builder.put(grammarAccess.getVar_Access().getGroup_2(), "rule__Var___Group_2__0");
			builder.put(grammarAccess.getExpression_listAccess().getGroup(), "rule__Expression_list__Group__0");
			builder.put(grammarAccess.getExpression_listAccess().getGroup_1(), "rule__Expression_list__Group_1__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
			builder.put(grammarAccess.getSimple_expressionAccess().getGroup(), "rule__Simple_expression__Group__0");
			builder.put(grammarAccess.getSimple_expressionAccess().getGroup_2_0(), "rule__Simple_expression__Group_2_0__0");
			builder.put(grammarAccess.getTermAccess().getGroup(), "rule__Term__Group__0");
			builder.put(grammarAccess.getTermAccess().getGroup_1(), "rule__Term__Group_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_8(), "rule__Factor__Group_8__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_9(), "rule__Factor__Group_9__0");
			builder.put(grammarAccess.getFunction_designatorAccess().getGroup(), "rule__Function_designator__Group__0");
			builder.put(grammarAccess.getSetAccess().getGroup(), "rule__Set__Group__0");
			builder.put(grammarAccess.getPascalAccess().getProgramAssignment(), "rule__Pascal__ProgramAssignment");
			builder.put(grammarAccess.getProgramAccess().getHeadingAssignment_0(), "rule__Program__HeadingAssignment_0");
			builder.put(grammarAccess.getProgramAccess().getBlockAssignment_1(), "rule__Program__BlockAssignment_1");
			builder.put(grammarAccess.getProgram_heading_blockAccess().getNameAssignment_1(), "rule__Program_heading_block__NameAssignment_1");
			builder.put(grammarAccess.getBlockAccess().getStatementAssignment(), "rule__Block__StatementAssignment");
			builder.put(grammarAccess.getStatement_partAccess().getSequenceAssignment_1(), "rule__Statement_part__SequenceAssignment_1");
			builder.put(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_0(), "rule__Statement_sequence__StatementsAssignment_0");
			builder.put(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_1_1(), "rule__Statement_sequence__StatementsAssignment_1_1");
			builder.put(grammarAccess.getStatementAccess().getLabelAssignment_0_0(), "rule__Statement__LabelAssignment_0_0");
			builder.put(grammarAccess.getStatementAccess().getSimpleAssignment_1(), "rule__Statement__SimpleAssignment_1");
			builder.put(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_0(), "rule__Simple_statement__AssignmentAssignment_0");
			builder.put(grammarAccess.getSimple_statementAccess().getFunctionAssignment_1(), "rule__Simple_statement__FunctionAssignment_1");
			builder.put(grammarAccess.getSimple_statementAccess().getFunction_noargsAssignment_2(), "rule__Simple_statement__Function_noargsAssignment_2");
			builder.put(grammarAccess.getAssignment_statementAccess().getVariableAssignment_0(), "rule__Assignment_statement__VariableAssignment_0");
			builder.put(grammarAccess.getAssignment_statementAccess().getExpressionAssignment_2(), "rule__Assignment_statement__ExpressionAssignment_2");
			builder.put(grammarAccess.getLabelAccess().getNumberAssignment_0(), "rule__Label__NumberAssignment_0");
			builder.put(grammarAccess.getLabelAccess().getNumberAssignment_1(), "rule__Label__NumberAssignment_1");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_0(), "rule__Variable__NameAssignment_0");
			builder.put(grammarAccess.getVariableAccess().getVariableAssignment_1(), "rule__Variable__VariableAssignment_1");
			builder.put(grammarAccess.getVar_Access().getExpressionsAssignment_0_1(), "rule__Var___ExpressionsAssignment_0_1");
			builder.put(grammarAccess.getVar_Access().getArrayAssignment_0_3(), "rule__Var___ArrayAssignment_0_3");
			builder.put(grammarAccess.getVar_Access().getAccessorAssignment_1_0(), "rule__Var___AccessorAssignment_1_0");
			builder.put(grammarAccess.getVar_Access().getNameAssignment_1_1(), "rule__Var___NameAssignment_1_1");
			builder.put(grammarAccess.getVar_Access().getVariableAssignment_1_2(), "rule__Var___VariableAssignment_1_2");
			builder.put(grammarAccess.getVar_Access().getPointerAssignment_2_1(), "rule__Var___PointerAssignment_2_1");
			builder.put(grammarAccess.getExpression_listAccess().getExpressionsAssignment_0(), "rule__Expression_list__ExpressionsAssignment_0");
			builder.put(grammarAccess.getExpression_listAccess().getExpressionsAssignment_1_1(), "rule__Expression_list__ExpressionsAssignment_1_1");
			builder.put(grammarAccess.getExpressionAccess().getExpressionsAssignment_0(), "rule__Expression__ExpressionsAssignment_0");
			builder.put(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_0(), "rule__Expression__OperatorsAssignment_1_0_0");
			builder.put(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_1(), "rule__Expression__OperatorsAssignment_1_0_1");
			builder.put(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_2(), "rule__Expression__OperatorsAssignment_1_0_2");
			builder.put(grammarAccess.getExpressionAccess().getExpressionsAssignment_1_1(), "rule__Expression__ExpressionsAssignment_1_1");
			builder.put(grammarAccess.getSimple_expressionAccess().getPrefixOperatorAssignment_0(), "rule__Simple_expression__PrefixOperatorAssignment_0");
			builder.put(grammarAccess.getSimple_expressionAccess().getTermsAssignment_1(), "rule__Simple_expression__TermsAssignment_1");
			builder.put(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_0(), "rule__Simple_expression__OperatorsAssignment_2_0_0_0");
			builder.put(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_1(), "rule__Simple_expression__OperatorsAssignment_2_0_0_1");
			builder.put(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_0_1(), "rule__Simple_expression__TermsAssignment_2_0_1");
			builder.put(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_1(), "rule__Simple_expression__TermsAssignment_2_1");
			builder.put(grammarAccess.getTermAccess().getFactorsAssignment_0(), "rule__Term__FactorsAssignment_0");
			builder.put(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_0(), "rule__Term__OperatorsAssignment_1_0_0");
			builder.put(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_1(), "rule__Term__OperatorsAssignment_1_0_1");
			builder.put(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_2(), "rule__Term__OperatorsAssignment_1_0_2");
			builder.put(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_3(), "rule__Term__OperatorsAssignment_1_0_3");
			builder.put(grammarAccess.getTermAccess().getFactorsAssignment_1_1(), "rule__Term__FactorsAssignment_1_1");
			builder.put(grammarAccess.getFactorAccess().getVariableAssignment_0(), "rule__Factor__VariableAssignment_0");
			builder.put(grammarAccess.getFactorAccess().getNumberAssignment_1(), "rule__Factor__NumberAssignment_1");
			builder.put(grammarAccess.getFactorAccess().getStringAssignment_2(), "rule__Factor__StringAssignment_2");
			builder.put(grammarAccess.getFactorAccess().getSetAssignment_3(), "rule__Factor__SetAssignment_3");
			builder.put(grammarAccess.getFactorAccess().getNilAssignment_4(), "rule__Factor__NilAssignment_4");
			builder.put(grammarAccess.getFactorAccess().getBooleanAssignment_5(), "rule__Factor__BooleanAssignment_5");
			builder.put(grammarAccess.getFactorAccess().getBooleanAssignment_6(), "rule__Factor__BooleanAssignment_6");
			builder.put(grammarAccess.getFactorAccess().getFunctionAssignment_7(), "rule__Factor__FunctionAssignment_7");
			builder.put(grammarAccess.getFactorAccess().getExpressionAssignment_8_1(), "rule__Factor__ExpressionAssignment_8_1");
			builder.put(grammarAccess.getFactorAccess().getNotAssignment_9_1(), "rule__Factor__NotAssignment_9_1");
			builder.put(grammarAccess.getFunction_designatorAccess().getNameAssignment_0(), "rule__Function_designator__NameAssignment_0");
			builder.put(grammarAccess.getFunction_designatorAccess().getExpressionsAssignment_2(), "rule__Function_designator__ExpressionsAssignment_2");
			builder.put(grammarAccess.getSetAccess().getBracketsAssignment_0(), "rule__Set__BracketsAssignment_0");
			builder.put(grammarAccess.getSetAccess().getExpressionsAssignment_1(), "rule__Set__ExpressionsAssignment_1");
			builder.put(grammarAccess.getSetAccess().getBracketsAssignment_2(), "rule__Set__BracketsAssignment_2");
			builder.put(grammarAccess.getNumberAccess().getNumberAssignment(), "rule__Number__NumberAssignment");
			builder.put(grammarAccess.getSigned_numberAccess().getIntegerAssignment_0(), "rule__Signed_number__IntegerAssignment_0");
			builder.put(grammarAccess.getSigned_numberAccess().getRealAssignment_1(), "rule__Signed_number__RealAssignment_1");
			builder.put(grammarAccess.getUnsigned_numberAccess().getIntegerAssignment_0(), "rule__Unsigned_number__IntegerAssignment_0");
			builder.put(grammarAccess.getUnsigned_numberAccess().getRealAssignment_1(), "rule__Unsigned_number__RealAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private PascalGrammarAccess grammarAccess;

	@Override
	protected InternalPascalParser createParser() {
		InternalPascalParser result = new InternalPascalParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PascalGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PascalGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
