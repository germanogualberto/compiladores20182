package org.xtext.example.pascal.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.pascal.services.PascalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SIGNED_INTEGER_NUMBER", "RULE_INTEGER_NUMBER", "RULE_RELATIONAL_OP", "RULE_ADDITION_OP", "RULE_MULTIPLICATION_OP", "RULE_STRING", "RULE_SIGNED_REAL_NUMBER", "RULE_REAL_NUMBER", "RULE_DIGIT_SEQUENCE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "';'", "'begin'", "'end'", "':'", "':='", "','", "'in'", "'='", "'or'", "'and'", "'true'", "'false'", "'('", "')'", "'not'", "'nil'", "'function'", "'procedure'", "'var'", "'label'", "'const'", "'type'", "'record'", "'while'", "'do'"
    };
    public static final int RULE_REAL_NUMBER=12;
    public static final int T__19=19;
    public static final int RULE_ID=4;
    public static final int RULE_MULTIPLICATION_OP=9;
    public static final int RULE_SIGNED_REAL_NUMBER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=14;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_RELATIONAL_OP=7;
    public static final int T__20=20;
    public static final int RULE_INTEGER_NUMBER=6;
    public static final int T__21=21;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=16;
    public static final int RULE_DIGIT_SEQUENCE=13;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=17;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_SIGNED_INTEGER_NUMBER=5;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_ADDITION_OP=8;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPascalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPascalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPascalParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPascal.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private PascalGrammarAccess grammarAccess;

        public InternalPascalParser(TokenStream input, PascalGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "program";
       	}

       	@Override
       	protected PascalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleprogram"
    // InternalPascal.g:70:1: entryRuleprogram returns [EObject current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final EObject entryRuleprogram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram = null;


        try {
            // InternalPascal.g:70:48: (iv_ruleprogram= ruleprogram EOF )
            // InternalPascal.g:71:2: iv_ruleprogram= ruleprogram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprogram=ruleprogram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprogram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // InternalPascal.g:77:1: ruleprogram returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' ) ;
    public final EObject ruleprogram() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:83:2: ( ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' ) )
            // InternalPascal.g:84:2: ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' )
            {
            // InternalPascal.g:84:2: ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' )
            // InternalPascal.g:85:3: ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.'
            {
            // InternalPascal.g:85:3: ( (lv_heading_0_0= ruleprogram_heading_block ) )
            // InternalPascal.g:86:4: (lv_heading_0_0= ruleprogram_heading_block )
            {
            // InternalPascal.g:86:4: (lv_heading_0_0= ruleprogram_heading_block )
            // InternalPascal.g:87:5: lv_heading_0_0= ruleprogram_heading_block
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProgramAccess().getHeadingProgram_heading_blockParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_heading_0_0=ruleprogram_heading_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProgramRule());
              					}
              					set(
              						current,
              						"heading",
              						lv_heading_0_0,
              						"org.xtext.example.pascal.Pascal.program_heading_block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:104:3: ( (lv_block_1_0= ruleblock ) )
            // InternalPascal.g:105:4: (lv_block_1_0= ruleblock )
            {
            // InternalPascal.g:105:4: (lv_block_1_0= ruleblock )
            // InternalPascal.g:106:5: lv_block_1_0= ruleblock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_block_1_0=ruleblock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProgramRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_1_0,
              						"org.xtext.example.pascal.Pascal.block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getFullStopKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRuleprogram_heading_block"
    // InternalPascal.g:131:1: entryRuleprogram_heading_block returns [EObject current=null] : iv_ruleprogram_heading_block= ruleprogram_heading_block EOF ;
    public final EObject entryRuleprogram_heading_block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram_heading_block = null;


        try {
            // InternalPascal.g:131:62: (iv_ruleprogram_heading_block= ruleprogram_heading_block EOF )
            // InternalPascal.g:132:2: iv_ruleprogram_heading_block= ruleprogram_heading_block EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgram_heading_blockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprogram_heading_block=ruleprogram_heading_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprogram_heading_block; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprogram_heading_block"


    // $ANTLR start "ruleprogram_heading_block"
    // InternalPascal.g:138:1: ruleprogram_heading_block returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleprogram_heading_block() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPascal.g:144:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalPascal.g:145:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalPascal.g:145:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalPascal.g:146:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0());
              		
            }
            // InternalPascal.g:150:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:151:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:151:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:152:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getProgram_heading_blockAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProgram_heading_blockRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprogram_heading_block"


    // $ANTLR start "entryRuleblock"
    // InternalPascal.g:176:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // InternalPascal.g:176:46: (iv_ruleblock= ruleblock EOF )
            // InternalPascal.g:177:2: iv_ruleblock= ruleblock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleblock=ruleblock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleblock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleblock"


    // $ANTLR start "ruleblock"
    // InternalPascal.g:183:1: ruleblock returns [EObject current=null] : ( ( (lv_label_0_0= rulelabel_declaration ) )? ( (lv_type_1_0= ruletype_definition_part ) )? ( (lv_variable_2_0= rulevariable_declaration_part ) )? ( (lv_constant_3_0= ruleconstant_definition_part ) )? ( (lv_abstraction_4_0= rulefunction_procedure_declaration ) )? ( (lv_statement_5_0= rulestatement_part ) ) ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        EObject lv_label_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_constant_3_0 = null;

        EObject lv_abstraction_4_0 = null;

        EObject lv_statement_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:189:2: ( ( ( (lv_label_0_0= rulelabel_declaration ) )? ( (lv_type_1_0= ruletype_definition_part ) )? ( (lv_variable_2_0= rulevariable_declaration_part ) )? ( (lv_constant_3_0= ruleconstant_definition_part ) )? ( (lv_abstraction_4_0= rulefunction_procedure_declaration ) )? ( (lv_statement_5_0= rulestatement_part ) ) ) )
            // InternalPascal.g:190:2: ( ( (lv_label_0_0= rulelabel_declaration ) )? ( (lv_type_1_0= ruletype_definition_part ) )? ( (lv_variable_2_0= rulevariable_declaration_part ) )? ( (lv_constant_3_0= ruleconstant_definition_part ) )? ( (lv_abstraction_4_0= rulefunction_procedure_declaration ) )? ( (lv_statement_5_0= rulestatement_part ) ) )
            {
            // InternalPascal.g:190:2: ( ( (lv_label_0_0= rulelabel_declaration ) )? ( (lv_type_1_0= ruletype_definition_part ) )? ( (lv_variable_2_0= rulevariable_declaration_part ) )? ( (lv_constant_3_0= ruleconstant_definition_part ) )? ( (lv_abstraction_4_0= rulefunction_procedure_declaration ) )? ( (lv_statement_5_0= rulestatement_part ) ) )
            // InternalPascal.g:191:3: ( (lv_label_0_0= rulelabel_declaration ) )? ( (lv_type_1_0= ruletype_definition_part ) )? ( (lv_variable_2_0= rulevariable_declaration_part ) )? ( (lv_constant_3_0= ruleconstant_definition_part ) )? ( (lv_abstraction_4_0= rulefunction_procedure_declaration ) )? ( (lv_statement_5_0= rulestatement_part ) )
            {
            // InternalPascal.g:191:3: ( (lv_label_0_0= rulelabel_declaration ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==40) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:192:4: (lv_label_0_0= rulelabel_declaration )
                    {
                    // InternalPascal.g:192:4: (lv_label_0_0= rulelabel_declaration )
                    // InternalPascal.g:193:5: lv_label_0_0= rulelabel_declaration
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBlockAccess().getLabelLabel_declarationParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_label_0_0=rulelabel_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBlockRule());
                      					}
                      					set(
                      						current,
                      						"label",
                      						lv_label_0_0,
                      						"org.xtext.example.pascal.Pascal.label_declaration");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPascal.g:210:3: ( (lv_type_1_0= ruletype_definition_part ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==42) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPascal.g:211:4: (lv_type_1_0= ruletype_definition_part )
                    {
                    // InternalPascal.g:211:4: (lv_type_1_0= ruletype_definition_part )
                    // InternalPascal.g:212:5: lv_type_1_0= ruletype_definition_part
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBlockAccess().getTypeType_definition_partParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_type_1_0=ruletype_definition_part();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBlockRule());
                      					}
                      					set(
                      						current,
                      						"type",
                      						lv_type_1_0,
                      						"org.xtext.example.pascal.Pascal.type_definition_part");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPascal.g:229:3: ( (lv_variable_2_0= rulevariable_declaration_part ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==39) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPascal.g:230:4: (lv_variable_2_0= rulevariable_declaration_part )
                    {
                    // InternalPascal.g:230:4: (lv_variable_2_0= rulevariable_declaration_part )
                    // InternalPascal.g:231:5: lv_variable_2_0= rulevariable_declaration_part
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBlockAccess().getVariableVariable_declaration_partParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_variable_2_0=rulevariable_declaration_part();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBlockRule());
                      					}
                      					set(
                      						current,
                      						"variable",
                      						lv_variable_2_0,
                      						"org.xtext.example.pascal.Pascal.variable_declaration_part");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPascal.g:248:3: ( (lv_constant_3_0= ruleconstant_definition_part ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==41) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:249:4: (lv_constant_3_0= ruleconstant_definition_part )
                    {
                    // InternalPascal.g:249:4: (lv_constant_3_0= ruleconstant_definition_part )
                    // InternalPascal.g:250:5: lv_constant_3_0= ruleconstant_definition_part
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBlockAccess().getConstantConstant_definition_partParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_constant_3_0=ruleconstant_definition_part();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBlockRule());
                      					}
                      					set(
                      						current,
                      						"constant",
                      						lv_constant_3_0,
                      						"org.xtext.example.pascal.Pascal.constant_definition_part");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPascal.g:267:3: ( (lv_abstraction_4_0= rulefunction_procedure_declaration ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=37 && LA5_0<=38)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:268:4: (lv_abstraction_4_0= rulefunction_procedure_declaration )
                    {
                    // InternalPascal.g:268:4: (lv_abstraction_4_0= rulefunction_procedure_declaration )
                    // InternalPascal.g:269:5: lv_abstraction_4_0= rulefunction_procedure_declaration
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBlockAccess().getAbstractionFunction_procedure_declarationParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_abstraction_4_0=rulefunction_procedure_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBlockRule());
                      					}
                      					set(
                      						current,
                      						"abstraction",
                      						lv_abstraction_4_0,
                      						"org.xtext.example.pascal.Pascal.function_procedure_declaration");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPascal.g:286:3: ( (lv_statement_5_0= rulestatement_part ) )
            // InternalPascal.g:287:4: (lv_statement_5_0= rulestatement_part )
            {
            // InternalPascal.g:287:4: (lv_statement_5_0= rulestatement_part )
            // InternalPascal.g:288:5: lv_statement_5_0= rulestatement_part
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockAccess().getStatementStatement_partParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_statement_5_0=rulestatement_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBlockRule());
              					}
              					set(
              						current,
              						"statement",
              						lv_statement_5_0,
              						"org.xtext.example.pascal.Pascal.statement_part");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRulestatement_part"
    // InternalPascal.g:309:1: entryRulestatement_part returns [EObject current=null] : iv_rulestatement_part= rulestatement_part EOF ;
    public final EObject entryRulestatement_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_part = null;


        try {
            // InternalPascal.g:309:55: (iv_rulestatement_part= rulestatement_part EOF )
            // InternalPascal.g:310:2: iv_rulestatement_part= rulestatement_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_partRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestatement_part=rulestatement_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement_part; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement_part"


    // $ANTLR start "rulestatement_part"
    // InternalPascal.g:316:1: rulestatement_part returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) ;
    public final EObject rulestatement_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:322:2: ( (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:323:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:323:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            // InternalPascal.g:324:3: otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStatement_partAccess().getBeginKeyword_0());
              		
            }
            // InternalPascal.g:328:3: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // InternalPascal.g:329:4: (lv_sequence_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:329:4: (lv_sequence_1_0= rulestatement_sequence )
            // InternalPascal.g:330:5: lv_sequence_1_0= rulestatement_sequence
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStatement_partAccess().getSequenceStatement_sequenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_sequence_1_0=rulestatement_sequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStatement_partRule());
              					}
              					set(
              						current,
              						"sequence",
              						lv_sequence_1_0,
              						"org.xtext.example.pascal.Pascal.statement_sequence");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getStatement_partAccess().getEndKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement_part"


    // $ANTLR start "entryRulestatement_sequence"
    // InternalPascal.g:355:1: entryRulestatement_sequence returns [EObject current=null] : iv_rulestatement_sequence= rulestatement_sequence EOF ;
    public final EObject entryRulestatement_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_sequence = null;


        try {
            // InternalPascal.g:355:59: (iv_rulestatement_sequence= rulestatement_sequence EOF )
            // InternalPascal.g:356:2: iv_rulestatement_sequence= rulestatement_sequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_sequenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestatement_sequence=rulestatement_sequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement_sequence; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement_sequence"


    // $ANTLR start "rulestatement_sequence"
    // InternalPascal.g:362:1: rulestatement_sequence returns [EObject current=null] : ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) ;
    public final EObject rulestatement_sequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:368:2: ( ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) )
            // InternalPascal.g:369:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            {
            // InternalPascal.g:369:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            // InternalPascal.g:370:3: ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            {
            // InternalPascal.g:370:3: ( (lv_statements_0_0= rulestatement ) )
            // InternalPascal.g:371:4: (lv_statements_0_0= rulestatement )
            {
            // InternalPascal.g:371:4: (lv_statements_0_0= rulestatement )
            // InternalPascal.g:372:5: lv_statements_0_0= rulestatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_statements_0_0=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStatement_sequenceRule());
              					}
              					add(
              						current,
              						"statements",
              						lv_statements_0_0,
              						"org.xtext.example.pascal.Pascal.statement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:389:3: (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    int LA6_2 = input.LA(2);

                    if ( (synpred6_InternalPascal()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalPascal.g:390:4: otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:394:4: ( (lv_statements_2_0= rulestatement ) )
            	    // InternalPascal.g:395:5: (lv_statements_2_0= rulestatement )
            	    {
            	    // InternalPascal.g:395:5: (lv_statements_2_0= rulestatement )
            	    // InternalPascal.g:396:6: lv_statements_2_0= rulestatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_statements_2_0=rulestatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getStatement_sequenceRule());
            	      						}
            	      						add(
            	      							current,
            	      							"statements",
            	      							lv_statements_2_0,
            	      							"org.xtext.example.pascal.Pascal.statement");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement_sequence"


    // $ANTLR start "entryRulestatement"
    // InternalPascal.g:418:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // InternalPascal.g:418:50: (iv_rulestatement= rulestatement EOF )
            // InternalPascal.g:419:2: iv_rulestatement= rulestatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestatement=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // InternalPascal.g:425:1: rulestatement returns [EObject current=null] : ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_label_0_0 = null;

        EObject lv_simple_2_0 = null;

        EObject lv_structured_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:431:2: ( ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) ) )
            // InternalPascal.g:432:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) )
            {
            // InternalPascal.g:432:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) )
            // InternalPascal.g:433:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) )
            {
            // InternalPascal.g:433:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_SIGNED_INTEGER_NUMBER && LA7_0<=RULE_INTEGER_NUMBER)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPascal.g:434:4: ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':'
                    {
                    // InternalPascal.g:434:4: ( (lv_label_0_0= rulelabel ) )
                    // InternalPascal.g:435:5: (lv_label_0_0= rulelabel )
                    {
                    // InternalPascal.g:435:5: (lv_label_0_0= rulelabel )
                    // InternalPascal.g:436:6: lv_label_0_0= rulelabel
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementAccess().getLabelLabelParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_label_0_0=rulelabel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRule());
                      						}
                      						set(
                      							current,
                      							"label",
                      							lv_label_0_0,
                      							"org.xtext.example.pascal.Pascal.label");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,24,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalPascal.g:458:3: ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==EOF||LA8_0==RULE_ID||LA8_0==21||LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==22||LA8_0==44) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPascal.g:459:4: ( (lv_simple_2_0= rulesimple_statement ) )
                    {
                    // InternalPascal.g:459:4: ( (lv_simple_2_0= rulesimple_statement ) )
                    // InternalPascal.g:460:5: (lv_simple_2_0= rulesimple_statement )
                    {
                    // InternalPascal.g:460:5: (lv_simple_2_0= rulesimple_statement )
                    // InternalPascal.g:461:6: lv_simple_2_0= rulesimple_statement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementAccess().getSimpleSimple_statementParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_simple_2_0=rulesimple_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRule());
                      						}
                      						set(
                      							current,
                      							"simple",
                      							lv_simple_2_0,
                      							"org.xtext.example.pascal.Pascal.simple_statement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:479:4: ( (lv_structured_3_0= rulestructured_statement ) )
                    {
                    // InternalPascal.g:479:4: ( (lv_structured_3_0= rulestructured_statement ) )
                    // InternalPascal.g:480:5: (lv_structured_3_0= rulestructured_statement )
                    {
                    // InternalPascal.g:480:5: (lv_structured_3_0= rulestructured_statement )
                    // InternalPascal.g:481:6: lv_structured_3_0= rulestructured_statement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementAccess().getStructuredStructured_statementParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_structured_3_0=rulestructured_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRule());
                      						}
                      						set(
                      							current,
                      							"structured",
                      							lv_structured_3_0,
                      							"org.xtext.example.pascal.Pascal.structured_statement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulesimple_statement"
    // InternalPascal.g:503:1: entryRulesimple_statement returns [EObject current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final EObject entryRulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_statement = null;


        try {
            // InternalPascal.g:503:57: (iv_rulesimple_statement= rulesimple_statement EOF )
            // InternalPascal.g:504:2: iv_rulesimple_statement= rulesimple_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimple_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulesimple_statement=rulesimple_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesimple_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesimple_statement"


    // $ANTLR start "rulesimple_statement"
    // InternalPascal.g:510:1: rulesimple_statement returns [EObject current=null] : ( () ( ( (lv_assignment_1_0= ruleassignment_statement ) ) | ( (lv_function_2_0= rulefunction_designator ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )? ) ;
    public final EObject rulesimple_statement() throws RecognitionException {
        EObject current = null;

        Token lv_function_noargs_3_0=null;
        EObject lv_assignment_1_0 = null;

        EObject lv_function_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:516:2: ( ( () ( ( (lv_assignment_1_0= ruleassignment_statement ) ) | ( (lv_function_2_0= rulefunction_designator ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )? ) )
            // InternalPascal.g:517:2: ( () ( ( (lv_assignment_1_0= ruleassignment_statement ) ) | ( (lv_function_2_0= rulefunction_designator ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )? )
            {
            // InternalPascal.g:517:2: ( () ( ( (lv_assignment_1_0= ruleassignment_statement ) ) | ( (lv_function_2_0= rulefunction_designator ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )? )
            // InternalPascal.g:518:3: () ( ( (lv_assignment_1_0= ruleassignment_statement ) ) | ( (lv_function_2_0= rulefunction_designator ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )?
            {
            // InternalPascal.g:518:3: ()
            // InternalPascal.g:519:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSimple_statementAccess().getSimple_statementAction_0(),
              					current);
              			
            }

            }

            // InternalPascal.g:528:3: ( ( (lv_assignment_1_0= ruleassignment_statement ) ) | ( (lv_function_2_0= rulefunction_designator ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )?
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                    case EOF:
                    case 21:
                    case 23:
                        {
                        alt9=3;
                        }
                        break;
                    case 33:
                        {
                        alt9=2;
                        }
                        break;
                    case 25:
                        {
                        alt9=1;
                        }
                        break;
                }

            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:529:4: ( (lv_assignment_1_0= ruleassignment_statement ) )
                    {
                    // InternalPascal.g:529:4: ( (lv_assignment_1_0= ruleassignment_statement ) )
                    // InternalPascal.g:530:5: (lv_assignment_1_0= ruleassignment_statement )
                    {
                    // InternalPascal.g:530:5: (lv_assignment_1_0= ruleassignment_statement )
                    // InternalPascal.g:531:6: lv_assignment_1_0= ruleassignment_statement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_statementParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_assignment_1_0=ruleassignment_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                      						}
                      						set(
                      							current,
                      							"assignment",
                      							lv_assignment_1_0,
                      							"org.xtext.example.pascal.Pascal.assignment_statement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:549:4: ( (lv_function_2_0= rulefunction_designator ) )
                    {
                    // InternalPascal.g:549:4: ( (lv_function_2_0= rulefunction_designator ) )
                    // InternalPascal.g:550:5: (lv_function_2_0= rulefunction_designator )
                    {
                    // InternalPascal.g:550:5: (lv_function_2_0= rulefunction_designator )
                    // InternalPascal.g:551:6: lv_function_2_0= rulefunction_designator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSimple_statementAccess().getFunctionFunction_designatorParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_function_2_0=rulefunction_designator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                      						}
                      						set(
                      							current,
                      							"function",
                      							lv_function_2_0,
                      							"org.xtext.example.pascal.Pascal.function_designator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:569:4: ( (lv_function_noargs_3_0= RULE_ID ) )
                    {
                    // InternalPascal.g:569:4: ( (lv_function_noargs_3_0= RULE_ID ) )
                    // InternalPascal.g:570:5: (lv_function_noargs_3_0= RULE_ID )
                    {
                    // InternalPascal.g:570:5: (lv_function_noargs_3_0= RULE_ID )
                    // InternalPascal.g:571:6: lv_function_noargs_3_0= RULE_ID
                    {
                    lv_function_noargs_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_function_noargs_3_0, grammarAccess.getSimple_statementAccess().getFunction_noargsIDTerminalRuleCall_1_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSimple_statementRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"function_noargs",
                      							lv_function_noargs_3_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimple_statement"


    // $ANTLR start "entryRulestructured_statement"
    // InternalPascal.g:592:1: entryRulestructured_statement returns [EObject current=null] : iv_rulestructured_statement= rulestructured_statement EOF ;
    public final EObject entryRulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_statement = null;


        try {
            // InternalPascal.g:592:61: (iv_rulestructured_statement= rulestructured_statement EOF )
            // InternalPascal.g:593:2: iv_rulestructured_statement= rulestructured_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructured_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestructured_statement=rulestructured_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestructured_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestructured_statement"


    // $ANTLR start "rulestructured_statement"
    // InternalPascal.g:599:1: rulestructured_statement returns [EObject current=null] : ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_while_stmt_1_0= rulewhile_statement ) ) ) ;
    public final EObject rulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_compound_0_0 = null;

        EObject lv_while_stmt_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:605:2: ( ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_while_stmt_1_0= rulewhile_statement ) ) ) )
            // InternalPascal.g:606:2: ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_while_stmt_1_0= rulewhile_statement ) ) )
            {
            // InternalPascal.g:606:2: ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_while_stmt_1_0= rulewhile_statement ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==44) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPascal.g:607:3: ( (lv_compound_0_0= rulecompound_statement ) )
                    {
                    // InternalPascal.g:607:3: ( (lv_compound_0_0= rulecompound_statement ) )
                    // InternalPascal.g:608:4: (lv_compound_0_0= rulecompound_statement )
                    {
                    // InternalPascal.g:608:4: (lv_compound_0_0= rulecompound_statement )
                    // InternalPascal.g:609:5: lv_compound_0_0= rulecompound_statement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStructured_statementAccess().getCompoundCompound_statementParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_compound_0_0=rulecompound_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                      					}
                      					set(
                      						current,
                      						"compound",
                      						lv_compound_0_0,
                      						"org.xtext.example.pascal.Pascal.compound_statement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:627:3: ( (lv_while_stmt_1_0= rulewhile_statement ) )
                    {
                    // InternalPascal.g:627:3: ( (lv_while_stmt_1_0= rulewhile_statement ) )
                    // InternalPascal.g:628:4: (lv_while_stmt_1_0= rulewhile_statement )
                    {
                    // InternalPascal.g:628:4: (lv_while_stmt_1_0= rulewhile_statement )
                    // InternalPascal.g:629:5: lv_while_stmt_1_0= rulewhile_statement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStructured_statementAccess().getWhile_stmtWhile_statementParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_while_stmt_1_0=rulewhile_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                      					}
                      					set(
                      						current,
                      						"while_stmt",
                      						lv_while_stmt_1_0,
                      						"org.xtext.example.pascal.Pascal.while_statement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestructured_statement"


    // $ANTLR start "entryRulecompound_statement"
    // InternalPascal.g:650:1: entryRulecompound_statement returns [EObject current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final EObject entryRulecompound_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompound_statement = null;


        try {
            // InternalPascal.g:650:59: (iv_rulecompound_statement= rulecompound_statement EOF )
            // InternalPascal.g:651:2: iv_rulecompound_statement= rulecompound_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompound_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecompound_statement=rulecompound_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecompound_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecompound_statement"


    // $ANTLR start "rulecompound_statement"
    // InternalPascal.g:657:1: rulecompound_statement returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) ;
    public final EObject rulecompound_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:663:2: ( (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:664:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:664:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            // InternalPascal.g:665:3: otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCompound_statementAccess().getBeginKeyword_0());
              		
            }
            // InternalPascal.g:669:3: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // InternalPascal.g:670:4: (lv_sequence_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:670:4: (lv_sequence_1_0= rulestatement_sequence )
            // InternalPascal.g:671:5: lv_sequence_1_0= rulestatement_sequence
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCompound_statementAccess().getSequenceStatement_sequenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_sequence_1_0=rulestatement_sequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCompound_statementRule());
              					}
              					set(
              						current,
              						"sequence",
              						lv_sequence_1_0,
              						"org.xtext.example.pascal.Pascal.statement_sequence");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCompound_statementAccess().getEndKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecompound_statement"


    // $ANTLR start "entryRuleassignment_statement"
    // InternalPascal.g:696:1: entryRuleassignment_statement returns [EObject current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final EObject entryRuleassignment_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment_statement = null;


        try {
            // InternalPascal.g:696:61: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // InternalPascal.g:697:2: iv_ruleassignment_statement= ruleassignment_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignment_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleassignment_statement=ruleassignment_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleassignment_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleassignment_statement"


    // $ANTLR start "ruleassignment_statement"
    // InternalPascal.g:703:1: ruleassignment_statement returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) ;
    public final EObject ruleassignment_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:709:2: ( ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) )
            // InternalPascal.g:710:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            {
            // InternalPascal.g:710:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            // InternalPascal.g:711:3: ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) )
            {
            // InternalPascal.g:711:3: ( (lv_variable_0_0= rulevariable ) )
            // InternalPascal.g:712:4: (lv_variable_0_0= rulevariable )
            {
            // InternalPascal.g:712:4: (lv_variable_0_0= rulevariable )
            // InternalPascal.g:713:5: lv_variable_0_0= rulevariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_variable_0_0=rulevariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignment_statementRule());
              					}
              					set(
              						current,
              						"variable",
              						lv_variable_0_0,
              						"org.xtext.example.pascal.Pascal.variable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalPascal.g:734:3: ( (lv_expression_2_0= ruleexpression ) )
            // InternalPascal.g:735:4: (lv_expression_2_0= ruleexpression )
            {
            // InternalPascal.g:735:4: (lv_expression_2_0= ruleexpression )
            // InternalPascal.g:736:5: lv_expression_2_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignment_statementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.xtext.example.pascal.Pascal.expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleassignment_statement"


    // $ANTLR start "entryRulelabel"
    // InternalPascal.g:757:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // InternalPascal.g:757:46: (iv_rulelabel= rulelabel EOF )
            // InternalPascal.g:758:2: iv_rulelabel= rulelabel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulelabel=rulelabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelabel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelabel"


    // $ANTLR start "rulelabel"
    // InternalPascal.g:764:1: rulelabel returns [EObject current=null] : ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_number_1_0=null;


        	enterRule();

        try {
            // InternalPascal.g:770:2: ( ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) ) )
            // InternalPascal.g:771:2: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) )
            {
            // InternalPascal.g:771:2: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_INTEGER_NUMBER) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalPascal.g:772:3: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:772:3: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    // InternalPascal.g:773:4: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:773:4: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    // InternalPascal.g:774:5: lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    lv_number_0_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_number_0_0, grammarAccess.getLabelAccess().getNumberSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLabelRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"number",
                      						lv_number_0_0,
                      						"org.xtext.example.pascal.Pascal.SIGNED_INTEGER_NUMBER");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:791:3: ( (lv_number_1_0= RULE_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:791:3: ( (lv_number_1_0= RULE_INTEGER_NUMBER ) )
                    // InternalPascal.g:792:4: (lv_number_1_0= RULE_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:792:4: (lv_number_1_0= RULE_INTEGER_NUMBER )
                    // InternalPascal.g:793:5: lv_number_1_0= RULE_INTEGER_NUMBER
                    {
                    lv_number_1_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_number_1_0, grammarAccess.getLabelAccess().getNumberINTEGER_NUMBERTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLabelRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"number",
                      						lv_number_1_0,
                      						"org.xtext.example.pascal.Pascal.INTEGER_NUMBER");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelabel"


    // $ANTLR start "entryRulevariable"
    // InternalPascal.g:813:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // InternalPascal.g:813:49: (iv_rulevariable= rulevariable EOF )
            // InternalPascal.g:814:2: iv_rulevariable= rulevariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevariable=rulevariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable"


    // $ANTLR start "rulevariable"
    // InternalPascal.g:820:1: rulevariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulevariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPascal.g:826:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPascal.g:827:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPascal.g:827:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:828:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:828:3: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:829:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getVariableRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRuleexpression_list"
    // InternalPascal.g:848:1: entryRuleexpression_list returns [EObject current=null] : iv_ruleexpression_list= ruleexpression_list EOF ;
    public final EObject entryRuleexpression_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression_list = null;


        try {
            // InternalPascal.g:848:56: (iv_ruleexpression_list= ruleexpression_list EOF )
            // InternalPascal.g:849:2: iv_ruleexpression_list= ruleexpression_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpression_list=ruleexpression_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression_list; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression_list"


    // $ANTLR start "ruleexpression_list"
    // InternalPascal.g:855:1: ruleexpression_list returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* ) ;
    public final EObject ruleexpression_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:861:2: ( ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* ) )
            // InternalPascal.g:862:2: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* )
            {
            // InternalPascal.g:862:2: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* )
            // InternalPascal.g:863:3: ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )*
            {
            // InternalPascal.g:863:3: ( (lv_expressions_0_0= ruleexpression ) )
            // InternalPascal.g:864:4: (lv_expressions_0_0= ruleexpression )
            {
            // InternalPascal.g:864:4: (lv_expressions_0_0= ruleexpression )
            // InternalPascal.g:865:5: lv_expressions_0_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_expressions_0_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpression_listRule());
              					}
              					add(
              						current,
              						"expressions",
              						lv_expressions_0_0,
              						"org.xtext.example.pascal.Pascal.expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:882:3: (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPascal.g:883:4: otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getExpression_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:887:4: ( (lv_expressions_2_0= ruleexpression ) )
            	    // InternalPascal.g:888:5: (lv_expressions_2_0= ruleexpression )
            	    {
            	    // InternalPascal.g:888:5: (lv_expressions_2_0= ruleexpression )
            	    // InternalPascal.g:889:6: lv_expressions_2_0= ruleexpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_expressions_2_0=ruleexpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExpression_listRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expressions",
            	      							lv_expressions_2_0,
            	      							"org.xtext.example.pascal.Pascal.expression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression_list"


    // $ANTLR start "entryRuleexpression"
    // InternalPascal.g:911:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalPascal.g:911:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalPascal.g:912:2: iv_ruleexpression= ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalPascal.g:918:1: ruleexpression returns [EObject current=null] : ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:924:2: ( ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) )
            // InternalPascal.g:925:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            {
            // InternalPascal.g:925:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            // InternalPascal.g:926:3: ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            {
            // InternalPascal.g:926:3: ( (lv_expressions_0_0= rulesimple_expression ) )
            // InternalPascal.g:927:4: (lv_expressions_0_0= rulesimple_expression )
            {
            // InternalPascal.g:927:4: (lv_expressions_0_0= rulesimple_expression )
            // InternalPascal.g:928:5: lv_expressions_0_0= rulesimple_expression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_expressions_0_0=rulesimple_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionRule());
              					}
              					add(
              						current,
              						"expressions",
              						lv_expressions_0_0,
              						"org.xtext.example.pascal.Pascal.simple_expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:945:3: ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_RELATIONAL_OP||(LA14_0>=27 && LA14_0<=28)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPascal.g:946:4: ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) )
                    {
                    // InternalPascal.g:946:4: ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) )
                    int alt13=3;
                    switch ( input.LA(1) ) {
                    case RULE_RELATIONAL_OP:
                        {
                        alt13=1;
                        }
                        break;
                    case 27:
                        {
                        alt13=2;
                        }
                        break;
                    case 28:
                        {
                        alt13=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }

                    switch (alt13) {
                        case 1 :
                            // InternalPascal.g:947:5: ( (lv_operators_1_0= RULE_RELATIONAL_OP ) )
                            {
                            // InternalPascal.g:947:5: ( (lv_operators_1_0= RULE_RELATIONAL_OP ) )
                            // InternalPascal.g:948:6: (lv_operators_1_0= RULE_RELATIONAL_OP )
                            {
                            // InternalPascal.g:948:6: (lv_operators_1_0= RULE_RELATIONAL_OP )
                            // InternalPascal.g:949:7: lv_operators_1_0= RULE_RELATIONAL_OP
                            {
                            lv_operators_1_0=(Token)match(input,RULE_RELATIONAL_OP,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_operators_1_0, grammarAccess.getExpressionAccess().getOperatorsRELATIONAL_OPTerminalRuleCall_1_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getExpressionRule());
                              							}
                              							addWithLastConsumed(
                              								current,
                              								"operators",
                              								lv_operators_1_0,
                              								"org.xtext.example.pascal.Pascal.RELATIONAL_OP");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPascal.g:966:5: ( (lv_operators_2_0= 'in' ) )
                            {
                            // InternalPascal.g:966:5: ( (lv_operators_2_0= 'in' ) )
                            // InternalPascal.g:967:6: (lv_operators_2_0= 'in' )
                            {
                            // InternalPascal.g:967:6: (lv_operators_2_0= 'in' )
                            // InternalPascal.g:968:7: lv_operators_2_0= 'in'
                            {
                            lv_operators_2_0=(Token)match(input,27,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_operators_2_0, grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getExpressionRule());
                              							}
                              							addWithLastConsumed(current, "operators", lv_operators_2_0, "in");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalPascal.g:981:5: ( (lv_operators_3_0= '=' ) )
                            {
                            // InternalPascal.g:981:5: ( (lv_operators_3_0= '=' ) )
                            // InternalPascal.g:982:6: (lv_operators_3_0= '=' )
                            {
                            // InternalPascal.g:982:6: (lv_operators_3_0= '=' )
                            // InternalPascal.g:983:7: lv_operators_3_0= '='
                            {
                            lv_operators_3_0=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_operators_3_0, grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getExpressionRule());
                              							}
                              							addWithLastConsumed(current, "operators", lv_operators_3_0, "=");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalPascal.g:996:4: ( (lv_expressions_4_0= rulesimple_expression ) )
                    // InternalPascal.g:997:5: (lv_expressions_4_0= rulesimple_expression )
                    {
                    // InternalPascal.g:997:5: (lv_expressions_4_0= rulesimple_expression )
                    // InternalPascal.g:998:6: lv_expressions_4_0= rulesimple_expression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expressions_4_0=rulesimple_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						add(
                      							current,
                      							"expressions",
                      							lv_expressions_4_0,
                      							"org.xtext.example.pascal.Pascal.simple_expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulesimple_expression"
    // InternalPascal.g:1020:1: entryRulesimple_expression returns [EObject current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final EObject entryRulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_expression = null;


        try {
            // InternalPascal.g:1020:58: (iv_rulesimple_expression= rulesimple_expression EOF )
            // InternalPascal.g:1021:2: iv_rulesimple_expression= rulesimple_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimple_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulesimple_expression=rulesimple_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesimple_expression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesimple_expression"


    // $ANTLR start "rulesimple_expression"
    // InternalPascal.g:1027:1: rulesimple_expression returns [EObject current=null] : ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* ) ;
    public final EObject rulesimple_expression() throws RecognitionException {
        EObject current = null;

        Token lv_prefixOperator_0_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        EObject lv_terms_1_0 = null;

        EObject lv_terms_4_0 = null;

        EObject lv_terms_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1033:2: ( ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* ) )
            // InternalPascal.g:1034:2: ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* )
            {
            // InternalPascal.g:1034:2: ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* )
            // InternalPascal.g:1035:3: ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )*
            {
            // InternalPascal.g:1035:3: ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ADDITION_OP) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPascal.g:1036:4: (lv_prefixOperator_0_0= RULE_ADDITION_OP )
                    {
                    // InternalPascal.g:1036:4: (lv_prefixOperator_0_0= RULE_ADDITION_OP )
                    // InternalPascal.g:1037:5: lv_prefixOperator_0_0= RULE_ADDITION_OP
                    {
                    lv_prefixOperator_0_0=(Token)match(input,RULE_ADDITION_OP,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_prefixOperator_0_0, grammarAccess.getSimple_expressionAccess().getPrefixOperatorADDITION_OPTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSimple_expressionRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"prefixOperator",
                      						lv_prefixOperator_0_0,
                      						"org.xtext.example.pascal.Pascal.ADDITION_OP");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPascal.g:1053:3: ( (lv_terms_1_0= ruleterm ) )
            // InternalPascal.g:1054:4: (lv_terms_1_0= ruleterm )
            {
            // InternalPascal.g:1054:4: (lv_terms_1_0= ruleterm )
            // InternalPascal.g:1055:5: lv_terms_1_0= ruleterm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_terms_1_0=ruleterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
              					}
              					add(
              						current,
              						"terms",
              						lv_terms_1_0,
              						"org.xtext.example.pascal.Pascal.term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:1072:3: ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ADDITION_OP||LA17_0==29) ) {
                    alt17=1;
                }
                else if ( (LA17_0==RULE_INTEGER_NUMBER||LA17_0==RULE_REAL_NUMBER) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPascal.g:1073:4: ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    {
            	    // InternalPascal.g:1073:4: ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    // InternalPascal.g:1074:5: ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) )
            	    {
            	    // InternalPascal.g:1074:5: ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==RULE_ADDITION_OP) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==29) ) {
            	        alt16=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalPascal.g:1075:6: ( (lv_operators_2_0= RULE_ADDITION_OP ) )
            	            {
            	            // InternalPascal.g:1075:6: ( (lv_operators_2_0= RULE_ADDITION_OP ) )
            	            // InternalPascal.g:1076:7: (lv_operators_2_0= RULE_ADDITION_OP )
            	            {
            	            // InternalPascal.g:1076:7: (lv_operators_2_0= RULE_ADDITION_OP )
            	            // InternalPascal.g:1077:8: lv_operators_2_0= RULE_ADDITION_OP
            	            {
            	            lv_operators_2_0=(Token)match(input,RULE_ADDITION_OP,FOLLOW_12); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_operators_2_0, grammarAccess.getSimple_expressionAccess().getOperatorsADDITION_OPTerminalRuleCall_2_0_0_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getSimple_expressionRule());
            	              								}
            	              								addWithLastConsumed(
            	              									current,
            	              									"operators",
            	              									lv_operators_2_0,
            	              									"org.xtext.example.pascal.Pascal.ADDITION_OP");
            	              							
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPascal.g:1094:6: ( (lv_operators_3_0= 'or' ) )
            	            {
            	            // InternalPascal.g:1094:6: ( (lv_operators_3_0= 'or' ) )
            	            // InternalPascal.g:1095:7: (lv_operators_3_0= 'or' )
            	            {
            	            // InternalPascal.g:1095:7: (lv_operators_3_0= 'or' )
            	            // InternalPascal.g:1096:8: lv_operators_3_0= 'or'
            	            {
            	            lv_operators_3_0=(Token)match(input,29,FOLLOW_12); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_operators_3_0, grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getSimple_expressionRule());
            	              								}
            	              								addWithLastConsumed(current, "operators", lv_operators_3_0, "or");
            	              							
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalPascal.g:1109:5: ( (lv_terms_4_0= ruleterm ) )
            	    // InternalPascal.g:1110:6: (lv_terms_4_0= ruleterm )
            	    {
            	    // InternalPascal.g:1110:6: (lv_terms_4_0= ruleterm )
            	    // InternalPascal.g:1111:7: lv_terms_4_0= ruleterm
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_2_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_terms_4_0=ruleterm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            	      							}
            	      							add(
            	      								current,
            	      								"terms",
            	      								lv_terms_4_0,
            	      								"org.xtext.example.pascal.Pascal.term");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPascal.g:1130:4: ( (lv_terms_5_0= ruleunsigned_number ) )
            	    {
            	    // InternalPascal.g:1130:4: ( (lv_terms_5_0= ruleunsigned_number ) )
            	    // InternalPascal.g:1131:5: (lv_terms_5_0= ruleunsigned_number )
            	    {
            	    // InternalPascal.g:1131:5: (lv_terms_5_0= ruleunsigned_number )
            	    // InternalPascal.g:1132:6: lv_terms_5_0= ruleunsigned_number
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsUnsigned_numberParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_terms_5_0=ruleunsigned_number();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"terms",
            	      							lv_terms_5_0,
            	      							"org.xtext.example.pascal.Pascal.unsigned_number");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimple_expression"


    // $ANTLR start "entryRuleterm"
    // InternalPascal.g:1154:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // InternalPascal.g:1154:45: (iv_ruleterm= ruleterm EOF )
            // InternalPascal.g:1155:2: iv_ruleterm= ruleterm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleterm=ruleterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleterm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // InternalPascal.g:1161:1: ruleterm returns [EObject current=null] : ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'and' ) ) ) ( (lv_factors_3_0= rulefactor ) ) )* ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        Token lv_operators_2_0=null;
        EObject lv_factors_0_0 = null;

        EObject lv_factors_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1167:2: ( ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'and' ) ) ) ( (lv_factors_3_0= rulefactor ) ) )* ) )
            // InternalPascal.g:1168:2: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'and' ) ) ) ( (lv_factors_3_0= rulefactor ) ) )* )
            {
            // InternalPascal.g:1168:2: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'and' ) ) ) ( (lv_factors_3_0= rulefactor ) ) )* )
            // InternalPascal.g:1169:3: ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'and' ) ) ) ( (lv_factors_3_0= rulefactor ) ) )*
            {
            // InternalPascal.g:1169:3: ( (lv_factors_0_0= rulefactor ) )
            // InternalPascal.g:1170:4: (lv_factors_0_0= rulefactor )
            {
            // InternalPascal.g:1170:4: (lv_factors_0_0= rulefactor )
            // InternalPascal.g:1171:5: lv_factors_0_0= rulefactor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_factors_0_0=rulefactor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTermRule());
              					}
              					add(
              						current,
              						"factors",
              						lv_factors_0_0,
              						"org.xtext.example.pascal.Pascal.factor");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:1188:3: ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'and' ) ) ) ( (lv_factors_3_0= rulefactor ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_MULTIPLICATION_OP||LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPascal.g:1189:4: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'and' ) ) ) ( (lv_factors_3_0= rulefactor ) )
            	    {
            	    // InternalPascal.g:1189:4: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'and' ) ) )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==RULE_MULTIPLICATION_OP) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==30) ) {
            	        alt18=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalPascal.g:1190:5: ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) )
            	            {
            	            // InternalPascal.g:1190:5: ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) )
            	            // InternalPascal.g:1191:6: (lv_operators_1_0= RULE_MULTIPLICATION_OP )
            	            {
            	            // InternalPascal.g:1191:6: (lv_operators_1_0= RULE_MULTIPLICATION_OP )
            	            // InternalPascal.g:1192:7: lv_operators_1_0= RULE_MULTIPLICATION_OP
            	            {
            	            lv_operators_1_0=(Token)match(input,RULE_MULTIPLICATION_OP,FOLLOW_12); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operators_1_0, grammarAccess.getTermAccess().getOperatorsMULTIPLICATION_OPTerminalRuleCall_1_0_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getTermRule());
            	              							}
            	              							addWithLastConsumed(
            	              								current,
            	              								"operators",
            	              								lv_operators_1_0,
            	              								"org.xtext.example.pascal.Pascal.MULTIPLICATION_OP");
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPascal.g:1209:5: ( (lv_operators_2_0= 'and' ) )
            	            {
            	            // InternalPascal.g:1209:5: ( (lv_operators_2_0= 'and' ) )
            	            // InternalPascal.g:1210:6: (lv_operators_2_0= 'and' )
            	            {
            	            // InternalPascal.g:1210:6: (lv_operators_2_0= 'and' )
            	            // InternalPascal.g:1211:7: lv_operators_2_0= 'and'
            	            {
            	            lv_operators_2_0=(Token)match(input,30,FOLLOW_12); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operators_2_0, grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_1_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getTermRule());
            	              							}
            	              							addWithLastConsumed(current, "operators", lv_operators_2_0, "and");
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalPascal.g:1224:4: ( (lv_factors_3_0= rulefactor ) )
            	    // InternalPascal.g:1225:5: (lv_factors_3_0= rulefactor )
            	    {
            	    // InternalPascal.g:1225:5: (lv_factors_3_0= rulefactor )
            	    // InternalPascal.g:1226:6: lv_factors_3_0= rulefactor
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_factors_3_0=rulefactor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTermRule());
            	      						}
            	      						add(
            	      							current,
            	      							"factors",
            	      							lv_factors_3_0,
            	      							"org.xtext.example.pascal.Pascal.factor");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulefactor"
    // InternalPascal.g:1248:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // InternalPascal.g:1248:47: (iv_rulefactor= rulefactor EOF )
            // InternalPascal.g:1249:2: iv_rulefactor= rulefactor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFactorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefactor=rulefactor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefactor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefactor"


    // $ANTLR start "rulefactor"
    // InternalPascal.g:1255:1: rulefactor returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= 'true' ) ) | ( (lv_boolean_4_0= 'false' ) ) | ( (lv_function_5_0= rulefunction_designator ) ) | (otherlv_6= '(' ( (lv_expression_7_0= ruleexpression ) ) otherlv_8= ')' ) | (otherlv_9= 'not' ( (lv_not_10_0= rulefactor ) ) ) | ( (lv_nil_11_0= 'nil' ) ) ) ;
    public final EObject rulefactor() throws RecognitionException {
        EObject current = null;

        Token lv_string_2_0=null;
        Token lv_boolean_3_0=null;
        Token lv_boolean_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_nil_11_0=null;
        EObject lv_variable_0_0 = null;

        EObject lv_number_1_0 = null;

        EObject lv_function_5_0 = null;

        EObject lv_expression_7_0 = null;

        EObject lv_not_10_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1261:2: ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= 'true' ) ) | ( (lv_boolean_4_0= 'false' ) ) | ( (lv_function_5_0= rulefunction_designator ) ) | (otherlv_6= '(' ( (lv_expression_7_0= ruleexpression ) ) otherlv_8= ')' ) | (otherlv_9= 'not' ( (lv_not_10_0= rulefactor ) ) ) | ( (lv_nil_11_0= 'nil' ) ) ) )
            // InternalPascal.g:1262:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= 'true' ) ) | ( (lv_boolean_4_0= 'false' ) ) | ( (lv_function_5_0= rulefunction_designator ) ) | (otherlv_6= '(' ( (lv_expression_7_0= ruleexpression ) ) otherlv_8= ')' ) | (otherlv_9= 'not' ( (lv_not_10_0= rulefactor ) ) ) | ( (lv_nil_11_0= 'nil' ) ) )
            {
            // InternalPascal.g:1262:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= 'true' ) ) | ( (lv_boolean_4_0= 'false' ) ) | ( (lv_function_5_0= rulefunction_designator ) ) | (otherlv_6= '(' ( (lv_expression_7_0= ruleexpression ) ) otherlv_8= ')' ) | (otherlv_9= 'not' ( (lv_not_10_0= rulefactor ) ) ) | ( (lv_nil_11_0= 'nil' ) ) )
            int alt20=9;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalPascal.g:1263:3: ( (lv_variable_0_0= rulevariable ) )
                    {
                    // InternalPascal.g:1263:3: ( (lv_variable_0_0= rulevariable ) )
                    // InternalPascal.g:1264:4: (lv_variable_0_0= rulevariable )
                    {
                    // InternalPascal.g:1264:4: (lv_variable_0_0= rulevariable )
                    // InternalPascal.g:1265:5: lv_variable_0_0= rulevariable
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_variable_0_0=rulevariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFactorRule());
                      					}
                      					set(
                      						current,
                      						"variable",
                      						lv_variable_0_0,
                      						"org.xtext.example.pascal.Pascal.variable");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1283:3: ( (lv_number_1_0= rulenumber ) )
                    {
                    // InternalPascal.g:1283:3: ( (lv_number_1_0= rulenumber ) )
                    // InternalPascal.g:1284:4: (lv_number_1_0= rulenumber )
                    {
                    // InternalPascal.g:1284:4: (lv_number_1_0= rulenumber )
                    // InternalPascal.g:1285:5: lv_number_1_0= rulenumber
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFactorAccess().getNumberNumberParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_number_1_0=rulenumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFactorRule());
                      					}
                      					set(
                      						current,
                      						"number",
                      						lv_number_1_0,
                      						"org.xtext.example.pascal.Pascal.number");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1303:3: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalPascal.g:1303:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalPascal.g:1304:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalPascal.g:1304:4: (lv_string_2_0= RULE_STRING )
                    // InternalPascal.g:1305:5: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_string_2_0, grammarAccess.getFactorAccess().getStringSTRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFactorRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"string",
                      						lv_string_2_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1322:3: ( (lv_boolean_3_0= 'true' ) )
                    {
                    // InternalPascal.g:1322:3: ( (lv_boolean_3_0= 'true' ) )
                    // InternalPascal.g:1323:4: (lv_boolean_3_0= 'true' )
                    {
                    // InternalPascal.g:1323:4: (lv_boolean_3_0= 'true' )
                    // InternalPascal.g:1324:5: lv_boolean_3_0= 'true'
                    {
                    lv_boolean_3_0=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_boolean_3_0, grammarAccess.getFactorAccess().getBooleanTrueKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFactorRule());
                      					}
                      					setWithLastConsumed(current, "boolean", lv_boolean_3_0, "true");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:1337:3: ( (lv_boolean_4_0= 'false' ) )
                    {
                    // InternalPascal.g:1337:3: ( (lv_boolean_4_0= 'false' ) )
                    // InternalPascal.g:1338:4: (lv_boolean_4_0= 'false' )
                    {
                    // InternalPascal.g:1338:4: (lv_boolean_4_0= 'false' )
                    // InternalPascal.g:1339:5: lv_boolean_4_0= 'false'
                    {
                    lv_boolean_4_0=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_boolean_4_0, grammarAccess.getFactorAccess().getBooleanFalseKeyword_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFactorRule());
                      					}
                      					setWithLastConsumed(current, "boolean", lv_boolean_4_0, "false");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:1352:3: ( (lv_function_5_0= rulefunction_designator ) )
                    {
                    // InternalPascal.g:1352:3: ( (lv_function_5_0= rulefunction_designator ) )
                    // InternalPascal.g:1353:4: (lv_function_5_0= rulefunction_designator )
                    {
                    // InternalPascal.g:1353:4: (lv_function_5_0= rulefunction_designator )
                    // InternalPascal.g:1354:5: lv_function_5_0= rulefunction_designator
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFactorAccess().getFunctionFunction_designatorParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_function_5_0=rulefunction_designator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFactorRule());
                      					}
                      					set(
                      						current,
                      						"function",
                      						lv_function_5_0,
                      						"org.xtext.example.pascal.Pascal.function_designator");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalPascal.g:1372:3: (otherlv_6= '(' ( (lv_expression_7_0= ruleexpression ) ) otherlv_8= ')' )
                    {
                    // InternalPascal.g:1372:3: (otherlv_6= '(' ( (lv_expression_7_0= ruleexpression ) ) otherlv_8= ')' )
                    // InternalPascal.g:1373:4: otherlv_6= '(' ( (lv_expression_7_0= ruleexpression ) ) otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_6_0());
                      			
                    }
                    // InternalPascal.g:1377:4: ( (lv_expression_7_0= ruleexpression ) )
                    // InternalPascal.g:1378:5: (lv_expression_7_0= ruleexpression )
                    {
                    // InternalPascal.g:1378:5: (lv_expression_7_0= ruleexpression )
                    // InternalPascal.g:1379:6: lv_expression_7_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_expression_7_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFactorRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_7_0,
                      							"org.xtext.example.pascal.Pascal.expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getFactorAccess().getRightParenthesisKeyword_6_2());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalPascal.g:1402:3: (otherlv_9= 'not' ( (lv_not_10_0= rulefactor ) ) )
                    {
                    // InternalPascal.g:1402:3: (otherlv_9= 'not' ( (lv_not_10_0= rulefactor ) ) )
                    // InternalPascal.g:1403:4: otherlv_9= 'not' ( (lv_not_10_0= rulefactor ) )
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getFactorAccess().getNotKeyword_7_0());
                      			
                    }
                    // InternalPascal.g:1407:4: ( (lv_not_10_0= rulefactor ) )
                    // InternalPascal.g:1408:5: (lv_not_10_0= rulefactor )
                    {
                    // InternalPascal.g:1408:5: (lv_not_10_0= rulefactor )
                    // InternalPascal.g:1409:6: lv_not_10_0= rulefactor
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFactorAccess().getNotFactorParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_not_10_0=rulefactor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFactorRule());
                      						}
                      						set(
                      							current,
                      							"not",
                      							lv_not_10_0,
                      							"org.xtext.example.pascal.Pascal.factor");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalPascal.g:1428:3: ( (lv_nil_11_0= 'nil' ) )
                    {
                    // InternalPascal.g:1428:3: ( (lv_nil_11_0= 'nil' ) )
                    // InternalPascal.g:1429:4: (lv_nil_11_0= 'nil' )
                    {
                    // InternalPascal.g:1429:4: (lv_nil_11_0= 'nil' )
                    // InternalPascal.g:1430:5: lv_nil_11_0= 'nil'
                    {
                    lv_nil_11_0=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_nil_11_0, grammarAccess.getFactorAccess().getNilNilKeyword_8_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFactorRule());
                      					}
                      					setWithLastConsumed(current, "nil", true, "nil");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefactor"


    // $ANTLR start "entryRulefunction_designator"
    // InternalPascal.g:1446:1: entryRulefunction_designator returns [EObject current=null] : iv_rulefunction_designator= rulefunction_designator EOF ;
    public final EObject entryRulefunction_designator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_designator = null;


        try {
            // InternalPascal.g:1446:60: (iv_rulefunction_designator= rulefunction_designator EOF )
            // InternalPascal.g:1447:2: iv_rulefunction_designator= rulefunction_designator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_designatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefunction_designator=rulefunction_designator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction_designator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction_designator"


    // $ANTLR start "rulefunction_designator"
    // InternalPascal.g:1453:1: rulefunction_designator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' ) ;
    public final EObject rulefunction_designator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1459:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' ) )
            // InternalPascal.g:1460:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' )
            {
            // InternalPascal.g:1460:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' )
            // InternalPascal.g:1461:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')'
            {
            // InternalPascal.g:1461:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:1462:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:1462:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:1463:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getFunction_designatorAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunction_designatorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalPascal.g:1483:3: ( (lv_expressions_2_0= ruleexpression_list ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_INTEGER_NUMBER)||LA21_0==RULE_ADDITION_OP||(LA21_0>=RULE_STRING && LA21_0<=RULE_REAL_NUMBER)||(LA21_0>=31 && LA21_0<=33)||(LA21_0>=35 && LA21_0<=36)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPascal.g:1484:4: (lv_expressions_2_0= ruleexpression_list )
                    {
                    // InternalPascal.g:1484:4: (lv_expressions_2_0= ruleexpression_list )
                    // InternalPascal.g:1485:5: lv_expressions_2_0= ruleexpression_list
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFunction_designatorAccess().getExpressionsExpression_listParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
                    lv_expressions_2_0=ruleexpression_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFunction_designatorRule());
                      					}
                      					set(
                      						current,
                      						"expressions",
                      						lv_expressions_2_0,
                      						"org.xtext.example.pascal.Pascal.expression_list");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_designator"


    // $ANTLR start "entryRulefunction_procedure_declaration"
    // InternalPascal.g:1510:1: entryRulefunction_procedure_declaration returns [EObject current=null] : iv_rulefunction_procedure_declaration= rulefunction_procedure_declaration EOF ;
    public final EObject entryRulefunction_procedure_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_procedure_declaration = null;


        try {
            // InternalPascal.g:1510:71: (iv_rulefunction_procedure_declaration= rulefunction_procedure_declaration EOF )
            // InternalPascal.g:1511:2: iv_rulefunction_procedure_declaration= rulefunction_procedure_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_procedure_declarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefunction_procedure_declaration=rulefunction_procedure_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction_procedure_declaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction_procedure_declaration"


    // $ANTLR start "rulefunction_procedure_declaration"
    // InternalPascal.g:1517:1: rulefunction_procedure_declaration returns [EObject current=null] : ( ( ( (lv_functions_0_0= rulefunction_declaration ) ) | ( (lv_procedures_1_0= ruleprocedure_declaration ) ) ) otherlv_2= ';' )+ ;
    public final EObject rulefunction_procedure_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_functions_0_0 = null;

        EObject lv_procedures_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1523:2: ( ( ( ( (lv_functions_0_0= rulefunction_declaration ) ) | ( (lv_procedures_1_0= ruleprocedure_declaration ) ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:1524:2: ( ( ( (lv_functions_0_0= rulefunction_declaration ) ) | ( (lv_procedures_1_0= ruleprocedure_declaration ) ) ) otherlv_2= ';' )+
            {
            // InternalPascal.g:1524:2: ( ( ( (lv_functions_0_0= rulefunction_declaration ) ) | ( (lv_procedures_1_0= ruleprocedure_declaration ) ) ) otherlv_2= ';' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=37 && LA23_0<=38)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPascal.g:1525:3: ( ( (lv_functions_0_0= rulefunction_declaration ) ) | ( (lv_procedures_1_0= ruleprocedure_declaration ) ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:1525:3: ( ( (lv_functions_0_0= rulefunction_declaration ) ) | ( (lv_procedures_1_0= ruleprocedure_declaration ) ) )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==37) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==38) ) {
            	        alt22=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalPascal.g:1526:4: ( (lv_functions_0_0= rulefunction_declaration ) )
            	            {
            	            // InternalPascal.g:1526:4: ( (lv_functions_0_0= rulefunction_declaration ) )
            	            // InternalPascal.g:1527:5: (lv_functions_0_0= rulefunction_declaration )
            	            {
            	            // InternalPascal.g:1527:5: (lv_functions_0_0= rulefunction_declaration )
            	            // InternalPascal.g:1528:6: lv_functions_0_0= rulefunction_declaration
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getFunction_procedure_declarationAccess().getFunctionsFunction_declarationParserRuleCall_0_0_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_6);
            	            lv_functions_0_0=rulefunction_declaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getFunction_procedure_declarationRule());
            	              						}
            	              						add(
            	              							current,
            	              							"functions",
            	              							lv_functions_0_0,
            	              							"org.xtext.example.pascal.Pascal.function_declaration");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPascal.g:1546:4: ( (lv_procedures_1_0= ruleprocedure_declaration ) )
            	            {
            	            // InternalPascal.g:1546:4: ( (lv_procedures_1_0= ruleprocedure_declaration ) )
            	            // InternalPascal.g:1547:5: (lv_procedures_1_0= ruleprocedure_declaration )
            	            {
            	            // InternalPascal.g:1547:5: (lv_procedures_1_0= ruleprocedure_declaration )
            	            // InternalPascal.g:1548:6: lv_procedures_1_0= ruleprocedure_declaration
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getFunction_procedure_declarationAccess().getProceduresProcedure_declarationParserRuleCall_0_1_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_6);
            	            lv_procedures_1_0=ruleprocedure_declaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getFunction_procedure_declarationRule());
            	              						}
            	              						add(
            	              							current,
            	              							"procedures",
            	              							lv_procedures_1_0,
            	              							"org.xtext.example.pascal.Pascal.procedure_declaration");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(otherlv_2, grammarAccess.getFunction_procedure_declarationAccess().getSemicolonKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_procedure_declaration"


    // $ANTLR start "entryRulefunction_heading"
    // InternalPascal.g:1574:1: entryRulefunction_heading returns [EObject current=null] : iv_rulefunction_heading= rulefunction_heading EOF ;
    public final EObject entryRulefunction_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_heading = null;


        try {
            // InternalPascal.g:1574:57: (iv_rulefunction_heading= rulefunction_heading EOF )
            // InternalPascal.g:1575:2: iv_rulefunction_heading= rulefunction_heading EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_headingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefunction_heading=rulefunction_heading();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction_heading; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction_heading"


    // $ANTLR start "rulefunction_heading"
    // InternalPascal.g:1581:1: rulefunction_heading returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) ) ;
    public final EObject rulefunction_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_returnType_4_0=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1587:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) ) )
            // InternalPascal.g:1588:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) )
            {
            // InternalPascal.g:1588:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) )
            // InternalPascal.g:1589:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunction_headingAccess().getFunctionKeyword_0());
              		
            }
            // InternalPascal.g:1593:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:1594:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:1594:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:1595:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFunction_headingAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunction_headingRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalPascal.g:1611:3: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPascal.g:1612:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:1612:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:1613:5: lv_parameters_2_0= ruleformal_parameter_list
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFunction_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_10);
                    lv_parameters_2_0=ruleformal_parameter_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFunction_headingRule());
                      					}
                      					set(
                      						current,
                      						"parameters",
                      						lv_parameters_2_0,
                      						"org.xtext.example.pascal.Pascal.formal_parameter_list");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFunction_headingAccess().getColonKeyword_3());
              		
            }
            // InternalPascal.g:1634:3: ( (lv_returnType_4_0= RULE_ID ) )
            // InternalPascal.g:1635:4: (lv_returnType_4_0= RULE_ID )
            {
            // InternalPascal.g:1635:4: (lv_returnType_4_0= RULE_ID )
            // InternalPascal.g:1636:5: lv_returnType_4_0= RULE_ID
            {
            lv_returnType_4_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_returnType_4_0, grammarAccess.getFunction_headingAccess().getReturnTypeIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunction_headingRule());
              					}
              					setWithLastConsumed(
              						current,
              						"returnType",
              						lv_returnType_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_heading"


    // $ANTLR start "entryRulefunction_declaration"
    // InternalPascal.g:1656:1: entryRulefunction_declaration returns [EObject current=null] : iv_rulefunction_declaration= rulefunction_declaration EOF ;
    public final EObject entryRulefunction_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_declaration = null;


        try {
            // InternalPascal.g:1656:61: (iv_rulefunction_declaration= rulefunction_declaration EOF )
            // InternalPascal.g:1657:2: iv_rulefunction_declaration= rulefunction_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunction_declarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefunction_declaration=rulefunction_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction_declaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction_declaration"


    // $ANTLR start "rulefunction_declaration"
    // InternalPascal.g:1663:1: rulefunction_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) ) ;
    public final EObject rulefunction_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1669:2: ( ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) ) )
            // InternalPascal.g:1670:2: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) )
            {
            // InternalPascal.g:1670:2: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) )
            // InternalPascal.g:1671:3: ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) )
            {
            // InternalPascal.g:1671:3: ( (lv_heading_0_0= rulefunction_heading ) )
            // InternalPascal.g:1672:4: (lv_heading_0_0= rulefunction_heading )
            {
            // InternalPascal.g:1672:4: (lv_heading_0_0= rulefunction_heading )
            // InternalPascal.g:1673:5: lv_heading_0_0= rulefunction_heading
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunction_declarationAccess().getHeadingFunction_headingParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_heading_0_0=rulefunction_heading();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
              					}
              					set(
              						current,
              						"heading",
              						lv_heading_0_0,
              						"org.xtext.example.pascal.Pascal.function_heading");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_1());
              		
            }
            // InternalPascal.g:1694:3: ( (lv_block_2_0= ruleblock ) )
            // InternalPascal.g:1695:4: (lv_block_2_0= ruleblock )
            {
            // InternalPascal.g:1695:4: (lv_block_2_0= ruleblock )
            // InternalPascal.g:1696:5: lv_block_2_0= ruleblock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunction_declarationAccess().getBlockBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_2_0=ruleblock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_2_0,
              						"org.xtext.example.pascal.Pascal.block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_declaration"


    // $ANTLR start "entryRuleprocedure_declaration"
    // InternalPascal.g:1717:1: entryRuleprocedure_declaration returns [EObject current=null] : iv_ruleprocedure_declaration= ruleprocedure_declaration EOF ;
    public final EObject entryRuleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_declaration = null;


        try {
            // InternalPascal.g:1717:62: (iv_ruleprocedure_declaration= ruleprocedure_declaration EOF )
            // InternalPascal.g:1718:2: iv_ruleprocedure_declaration= ruleprocedure_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcedure_declarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_declaration=ruleprocedure_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprocedure_declaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprocedure_declaration"


    // $ANTLR start "ruleprocedure_declaration"
    // InternalPascal.g:1724:1: ruleprocedure_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) ) ;
    public final EObject ruleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1730:2: ( ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) ) )
            // InternalPascal.g:1731:2: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) )
            {
            // InternalPascal.g:1731:2: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) )
            // InternalPascal.g:1732:3: ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) )
            {
            // InternalPascal.g:1732:3: ( (lv_heading_0_0= ruleprocedure_heading ) )
            // InternalPascal.g:1733:4: (lv_heading_0_0= ruleprocedure_heading )
            {
            // InternalPascal.g:1733:4: (lv_heading_0_0= ruleprocedure_heading )
            // InternalPascal.g:1734:5: lv_heading_0_0= ruleprocedure_heading
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProcedure_declarationAccess().getHeadingProcedure_headingParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_heading_0_0=ruleprocedure_heading();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProcedure_declarationRule());
              					}
              					set(
              						current,
              						"heading",
              						lv_heading_0_0,
              						"org.xtext.example.pascal.Pascal.procedure_heading");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_1());
              		
            }
            // InternalPascal.g:1755:3: ( (lv_block_2_0= ruleblock ) )
            // InternalPascal.g:1756:4: (lv_block_2_0= ruleblock )
            {
            // InternalPascal.g:1756:4: (lv_block_2_0= ruleblock )
            // InternalPascal.g:1757:5: lv_block_2_0= ruleblock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProcedure_declarationAccess().getBlockBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_2_0=ruleblock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProcedure_declarationRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_2_0,
              						"org.xtext.example.pascal.Pascal.block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedure_declaration"


    // $ANTLR start "entryRuleprocedure_heading"
    // InternalPascal.g:1778:1: entryRuleprocedure_heading returns [EObject current=null] : iv_ruleprocedure_heading= ruleprocedure_heading EOF ;
    public final EObject entryRuleprocedure_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_heading = null;


        try {
            // InternalPascal.g:1778:58: (iv_ruleprocedure_heading= ruleprocedure_heading EOF )
            // InternalPascal.g:1779:2: iv_ruleprocedure_heading= ruleprocedure_heading EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcedure_headingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_heading=ruleprocedure_heading();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprocedure_heading; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprocedure_heading"


    // $ANTLR start "ruleprocedure_heading"
    // InternalPascal.g:1785:1: ruleprocedure_heading returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) ;
    public final EObject ruleprocedure_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1791:2: ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) )
            // InternalPascal.g:1792:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            {
            // InternalPascal.g:1792:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            // InternalPascal.g:1793:3: otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0());
              		
            }
            // InternalPascal.g:1797:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:1798:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:1798:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:1799:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getProcedure_headingAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProcedure_headingRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalPascal.g:1815:3: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPascal.g:1816:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:1816:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:1817:5: lv_parameters_2_0= ruleformal_parameter_list
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getProcedure_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_parameters_2_0=ruleformal_parameter_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getProcedure_headingRule());
                      					}
                      					set(
                      						current,
                      						"parameters",
                      						lv_parameters_2_0,
                      						"org.xtext.example.pascal.Pascal.formal_parameter_list");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedure_heading"


    // $ANTLR start "entryRuleformal_parameter_list"
    // InternalPascal.g:1838:1: entryRuleformal_parameter_list returns [EObject current=null] : iv_ruleformal_parameter_list= ruleformal_parameter_list EOF ;
    public final EObject entryRuleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_list = null;


        try {
            // InternalPascal.g:1838:62: (iv_ruleformal_parameter_list= ruleformal_parameter_list EOF )
            // InternalPascal.g:1839:2: iv_ruleformal_parameter_list= ruleformal_parameter_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormal_parameter_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleformal_parameter_list=ruleformal_parameter_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleformal_parameter_list; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleformal_parameter_list"


    // $ANTLR start "ruleformal_parameter_list"
    // InternalPascal.g:1845:1: ruleformal_parameter_list returns [EObject current=null] : (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1851:2: ( (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) )
            // InternalPascal.g:1852:2: (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            {
            // InternalPascal.g:1852:2: (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            // InternalPascal.g:1853:3: otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalPascal.g:1857:3: ( (lv_parameters_1_0= ruleformal_parameter_section ) )
            // InternalPascal.g:1858:4: (lv_parameters_1_0= ruleformal_parameter_section )
            {
            // InternalPascal.g:1858:4: (lv_parameters_1_0= ruleformal_parameter_section )
            // InternalPascal.g:1859:5: lv_parameters_1_0= ruleformal_parameter_section
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_parameters_1_0=ruleformal_parameter_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFormal_parameter_listRule());
              					}
              					add(
              						current,
              						"parameters",
              						lv_parameters_1_0,
              						"org.xtext.example.pascal.Pascal.formal_parameter_section");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:1876:3: (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==21) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPascal.g:1877:4: otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0());
            	      			
            	    }
            	    // InternalPascal.g:1881:4: ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    // InternalPascal.g:1882:5: (lv_parameters_3_0= ruleformal_parameter_section )
            	    {
            	    // InternalPascal.g:1882:5: (lv_parameters_3_0= ruleformal_parameter_section )
            	    // InternalPascal.g:1883:6: lv_parameters_3_0= ruleformal_parameter_section
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_parameters_3_0=ruleformal_parameter_section();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFormal_parameter_listRule());
            	      						}
            	      						add(
            	      							current,
            	      							"parameters",
            	      							lv_parameters_3_0,
            	      							"org.xtext.example.pascal.Pascal.formal_parameter_section");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_4=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleformal_parameter_list"


    // $ANTLR start "entryRuleformal_parameter_section"
    // InternalPascal.g:1909:1: entryRuleformal_parameter_section returns [EObject current=null] : iv_ruleformal_parameter_section= ruleformal_parameter_section EOF ;
    public final EObject entryRuleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_section = null;


        try {
            // InternalPascal.g:1909:65: (iv_ruleformal_parameter_section= ruleformal_parameter_section EOF )
            // InternalPascal.g:1910:2: iv_ruleformal_parameter_section= ruleformal_parameter_section EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormal_parameter_sectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleformal_parameter_section=ruleformal_parameter_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleformal_parameter_section; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleformal_parameter_section"


    // $ANTLR start "ruleformal_parameter_section"
    // InternalPascal.g:1916:1: ruleformal_parameter_section returns [EObject current=null] : ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) ;
    public final EObject ruleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_procedure_2_0 = null;

        EObject lv_function_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1922:2: ( ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) )
            // InternalPascal.g:1923:2: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            {
            // InternalPascal.g:1923:2: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt27=1;
                }
                break;
            case 39:
                {
                alt27=2;
                }
                break;
            case 38:
                {
                alt27=3;
                }
                break;
            case 37:
                {
                alt27=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalPascal.g:1924:3: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    {
                    // InternalPascal.g:1924:3: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    // InternalPascal.g:1925:4: (lv_value_0_0= rulevalue_parameter_section )
                    {
                    // InternalPascal.g:1925:4: (lv_value_0_0= rulevalue_parameter_section )
                    // InternalPascal.g:1926:5: lv_value_0_0= rulevalue_parameter_section
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getValueValue_parameter_sectionParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=rulevalue_parameter_section();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                      					}
                      					set(
                      						current,
                      						"value",
                      						lv_value_0_0,
                      						"org.xtext.example.pascal.Pascal.value_parameter_section");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1944:3: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    {
                    // InternalPascal.g:1944:3: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    // InternalPascal.g:1945:4: (lv_variable_1_0= rulevariable_parameter_section )
                    {
                    // InternalPascal.g:1945:4: (lv_variable_1_0= rulevariable_parameter_section )
                    // InternalPascal.g:1946:5: lv_variable_1_0= rulevariable_parameter_section
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getVariableVariable_parameter_sectionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_variable_1_0=rulevariable_parameter_section();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                      					}
                      					set(
                      						current,
                      						"variable",
                      						lv_variable_1_0,
                      						"org.xtext.example.pascal.Pascal.variable_parameter_section");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1964:3: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    {
                    // InternalPascal.g:1964:3: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    // InternalPascal.g:1965:4: (lv_procedure_2_0= ruleprocedure_heading )
                    {
                    // InternalPascal.g:1965:4: (lv_procedure_2_0= ruleprocedure_heading )
                    // InternalPascal.g:1966:5: lv_procedure_2_0= ruleprocedure_heading
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getProcedureProcedure_headingParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_procedure_2_0=ruleprocedure_heading();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                      					}
                      					set(
                      						current,
                      						"procedure",
                      						lv_procedure_2_0,
                      						"org.xtext.example.pascal.Pascal.procedure_heading");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1984:3: ( (lv_function_3_0= rulefunction_heading ) )
                    {
                    // InternalPascal.g:1984:3: ( (lv_function_3_0= rulefunction_heading ) )
                    // InternalPascal.g:1985:4: (lv_function_3_0= rulefunction_heading )
                    {
                    // InternalPascal.g:1985:4: (lv_function_3_0= rulefunction_heading )
                    // InternalPascal.g:1986:5: lv_function_3_0= rulefunction_heading
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getFunctionFunction_headingParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_function_3_0=rulefunction_heading();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                      					}
                      					set(
                      						current,
                      						"function",
                      						lv_function_3_0,
                      						"org.xtext.example.pascal.Pascal.function_heading");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleformal_parameter_section"


    // $ANTLR start "entryRulevalue_parameter_section"
    // InternalPascal.g:2007:1: entryRulevalue_parameter_section returns [EObject current=null] : iv_rulevalue_parameter_section= rulevalue_parameter_section EOF ;
    public final EObject entryRulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalue_parameter_section = null;


        try {
            // InternalPascal.g:2007:64: (iv_rulevalue_parameter_section= rulevalue_parameter_section EOF )
            // InternalPascal.g:2008:2: iv_rulevalue_parameter_section= rulevalue_parameter_section EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValue_parameter_sectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevalue_parameter_section=rulevalue_parameter_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevalue_parameter_section; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevalue_parameter_section"


    // $ANTLR start "rulevalue_parameter_section"
    // InternalPascal.g:2014:1: rulevalue_parameter_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) ) ;
    public final EObject rulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2020:2: ( ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:2021:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:2021:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) )
            // InternalPascal.g:2022:3: ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) )
            {
            // InternalPascal.g:2022:3: ( (lv_identifiers_0_0= ruleidentifier_list ) )
            // InternalPascal.g:2023:4: (lv_identifiers_0_0= ruleidentifier_list )
            {
            // InternalPascal.g:2023:4: (lv_identifiers_0_0= ruleidentifier_list )
            // InternalPascal.g:2024:5: lv_identifiers_0_0= ruleidentifier_list
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_identifiers_0_0=ruleidentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getValue_parameter_sectionRule());
              					}
              					set(
              						current,
              						"identifiers",
              						lv_identifiers_0_0,
              						"org.xtext.example.pascal.Pascal.identifier_list");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1());
              		
            }
            // InternalPascal.g:2045:3: ( (lv_type_2_0= ruleparameter_type ) )
            // InternalPascal.g:2046:4: (lv_type_2_0= ruleparameter_type )
            {
            // InternalPascal.g:2046:4: (lv_type_2_0= ruleparameter_type )
            // InternalPascal.g:2047:5: lv_type_2_0= ruleparameter_type
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleparameter_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getValue_parameter_sectionRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.xtext.example.pascal.Pascal.parameter_type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevalue_parameter_section"


    // $ANTLR start "entryRuleidentifier_list"
    // InternalPascal.g:2068:1: entryRuleidentifier_list returns [EObject current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final EObject entryRuleidentifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifier_list = null;


        try {
            // InternalPascal.g:2068:56: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // InternalPascal.g:2069:2: iv_ruleidentifier_list= ruleidentifier_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifier_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleidentifier_list=ruleidentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleidentifier_list; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleidentifier_list"


    // $ANTLR start "ruleidentifier_list"
    // InternalPascal.g:2075:1: ruleidentifier_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleidentifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;


        	enterRule();

        try {
            // InternalPascal.g:2081:2: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // InternalPascal.g:2082:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // InternalPascal.g:2082:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            // InternalPascal.g:2083:3: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // InternalPascal.g:2083:3: ( (lv_names_0_0= RULE_ID ) )
            // InternalPascal.g:2084:4: (lv_names_0_0= RULE_ID )
            {
            // InternalPascal.g:2084:4: (lv_names_0_0= RULE_ID )
            // InternalPascal.g:2085:5: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_names_0_0, grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIdentifier_listRule());
              					}
              					addWithLastConsumed(
              						current,
              						"names",
              						lv_names_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalPascal.g:2101:3: (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==26) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPascal.g:2102:4: otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:2106:4: ( (lv_names_2_0= RULE_ID ) )
            	    // InternalPascal.g:2107:5: (lv_names_2_0= RULE_ID )
            	    {
            	    // InternalPascal.g:2107:5: (lv_names_2_0= RULE_ID )
            	    // InternalPascal.g:2108:6: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_names_2_0, grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getIdentifier_listRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"names",
            	      							lv_names_2_0,
            	      							"org.eclipse.xtext.common.Terminals.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleidentifier_list"


    // $ANTLR start "entryRuleparameter_type"
    // InternalPascal.g:2129:1: entryRuleparameter_type returns [EObject current=null] : iv_ruleparameter_type= ruleparameter_type EOF ;
    public final EObject entryRuleparameter_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_type = null;


        try {
            // InternalPascal.g:2129:55: (iv_ruleparameter_type= ruleparameter_type EOF )
            // InternalPascal.g:2130:2: iv_ruleparameter_type= ruleparameter_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleparameter_type=ruleparameter_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparameter_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparameter_type"


    // $ANTLR start "ruleparameter_type"
    // InternalPascal.g:2136:1: ruleparameter_type returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleparameter_type() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPascal.g:2142:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPascal.g:2143:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPascal.g:2143:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:2144:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:2144:3: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:2145:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getParameter_typeAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getParameter_typeRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameter_type"


    // $ANTLR start "entryRulevariable_parameter_section"
    // InternalPascal.g:2164:1: entryRulevariable_parameter_section returns [EObject current=null] : iv_rulevariable_parameter_section= rulevariable_parameter_section EOF ;
    public final EObject entryRulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_parameter_section = null;


        try {
            // InternalPascal.g:2164:67: (iv_rulevariable_parameter_section= rulevariable_parameter_section EOF )
            // InternalPascal.g:2165:2: iv_rulevariable_parameter_section= rulevariable_parameter_section EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_parameter_sectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevariable_parameter_section=rulevariable_parameter_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_parameter_section; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_parameter_section"


    // $ANTLR start "rulevariable_parameter_section"
    // InternalPascal.g:2171:1: rulevariable_parameter_section returns [EObject current=null] : (otherlv_0= 'var' ( (lv_indentifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) ) ;
    public final EObject rulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_indentifiers_1_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2177:2: ( (otherlv_0= 'var' ( (lv_indentifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:2178:2: (otherlv_0= 'var' ( (lv_indentifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:2178:2: (otherlv_0= 'var' ( (lv_indentifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) )
            // InternalPascal.g:2179:3: otherlv_0= 'var' ( (lv_indentifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0());
              		
            }
            // InternalPascal.g:2183:3: ( (lv_indentifiers_1_0= ruleidentifier_list ) )
            // InternalPascal.g:2184:4: (lv_indentifiers_1_0= ruleidentifier_list )
            {
            // InternalPascal.g:2184:4: (lv_indentifiers_1_0= ruleidentifier_list )
            // InternalPascal.g:2185:5: lv_indentifiers_1_0= ruleidentifier_list
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getIndentifiersIdentifier_listParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_indentifiers_1_0=ruleidentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariable_parameter_sectionRule());
              					}
              					set(
              						current,
              						"indentifiers",
              						lv_indentifiers_1_0,
              						"org.xtext.example.pascal.Pascal.identifier_list");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2());
              		
            }
            // InternalPascal.g:2206:3: ( (lv_type_3_0= ruleparameter_type ) )
            // InternalPascal.g:2207:4: (lv_type_3_0= ruleparameter_type )
            {
            // InternalPascal.g:2207:4: (lv_type_3_0= ruleparameter_type )
            // InternalPascal.g:2208:5: lv_type_3_0= ruleparameter_type
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleparameter_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariable_parameter_sectionRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_3_0,
              						"org.xtext.example.pascal.Pascal.parameter_type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_parameter_section"


    // $ANTLR start "entryRulenumber"
    // InternalPascal.g:2229:1: entryRulenumber returns [EObject current=null] : iv_rulenumber= rulenumber EOF ;
    public final EObject entryRulenumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumber = null;


        try {
            // InternalPascal.g:2229:47: (iv_rulenumber= rulenumber EOF )
            // InternalPascal.g:2230:2: iv_rulenumber= rulenumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulenumber=rulenumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenumber; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenumber"


    // $ANTLR start "rulenumber"
    // InternalPascal.g:2236:1: rulenumber returns [EObject current=null] : ( (lv_number_0_0= ruleany_number ) ) ;
    public final EObject rulenumber() throws RecognitionException {
        EObject current = null;

        EObject lv_number_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2242:2: ( ( (lv_number_0_0= ruleany_number ) ) )
            // InternalPascal.g:2243:2: ( (lv_number_0_0= ruleany_number ) )
            {
            // InternalPascal.g:2243:2: ( (lv_number_0_0= ruleany_number ) )
            // InternalPascal.g:2244:3: (lv_number_0_0= ruleany_number )
            {
            // InternalPascal.g:2244:3: (lv_number_0_0= ruleany_number )
            // InternalPascal.g:2245:4: lv_number_0_0= ruleany_number
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNumberAccess().getNumberAny_numberParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_number_0_0=ruleany_number();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNumberRule());
              				}
              				set(
              					current,
              					"number",
              					lv_number_0_0,
              					"org.xtext.example.pascal.Pascal.any_number");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRuleany_number"
    // InternalPascal.g:2265:1: entryRuleany_number returns [EObject current=null] : iv_ruleany_number= ruleany_number EOF ;
    public final EObject entryRuleany_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleany_number = null;


        try {
            // InternalPascal.g:2265:51: (iv_ruleany_number= ruleany_number EOF )
            // InternalPascal.g:2266:2: iv_ruleany_number= ruleany_number EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAny_numberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleany_number=ruleany_number();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleany_number; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleany_number"


    // $ANTLR start "ruleany_number"
    // InternalPascal.g:2272:1: ruleany_number returns [EObject current=null] : (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) ;
    public final EObject ruleany_number() throws RecognitionException {
        EObject current = null;

        EObject this_unsigned_number_0 = null;

        EObject this_signed_number_1 = null;



        	enterRule();

        try {
            // InternalPascal.g:2278:2: ( (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) )
            // InternalPascal.g:2279:2: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            {
            // InternalPascal.g:2279:2: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INTEGER_NUMBER||LA29_0==RULE_REAL_NUMBER) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_SIGNED_INTEGER_NUMBER||LA29_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalPascal.g:2280:3: this_unsigned_number_0= ruleunsigned_number
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAny_numberAccess().getUnsigned_numberParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_unsigned_number_0=ruleunsigned_number();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_unsigned_number_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPascal.g:2292:3: this_signed_number_1= rulesigned_number
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAny_numberAccess().getSigned_numberParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_signed_number_1=rulesigned_number();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_signed_number_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleany_number"


    // $ANTLR start "entryRulelabel_declaration"
    // InternalPascal.g:2307:1: entryRulelabel_declaration returns [EObject current=null] : iv_rulelabel_declaration= rulelabel_declaration EOF ;
    public final EObject entryRulelabel_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel_declaration = null;


        try {
            // InternalPascal.g:2307:58: (iv_rulelabel_declaration= rulelabel_declaration EOF )
            // InternalPascal.g:2308:2: iv_rulelabel_declaration= rulelabel_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabel_declarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulelabel_declaration=rulelabel_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelabel_declaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelabel_declaration"


    // $ANTLR start "rulelabel_declaration"
    // InternalPascal.g:2314:1: rulelabel_declaration returns [EObject current=null] : (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' ) ;
    public final EObject rulelabel_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_labels_1_0 = null;

        EObject lv_labels_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2320:2: ( (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' ) )
            // InternalPascal.g:2321:2: (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' )
            {
            // InternalPascal.g:2321:2: (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' )
            // InternalPascal.g:2322:3: otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLabel_declarationAccess().getLabelKeyword_0());
              		
            }
            // InternalPascal.g:2326:3: ( (lv_labels_1_0= rulelabel ) )
            // InternalPascal.g:2327:4: (lv_labels_1_0= rulelabel )
            {
            // InternalPascal.g:2327:4: (lv_labels_1_0= rulelabel )
            // InternalPascal.g:2328:5: lv_labels_1_0= rulelabel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLabel_declarationAccess().getLabelsLabelParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_labels_1_0=rulelabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLabel_declarationRule());
              					}
              					add(
              						current,
              						"labels",
              						lv_labels_1_0,
              						"org.xtext.example.pascal.Pascal.label");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:2345:3: (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==26) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPascal.g:2346:4: otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getLabel_declarationAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalPascal.g:2350:4: ( (lv_labels_3_0= rulelabel ) )
            	    // InternalPascal.g:2351:5: (lv_labels_3_0= rulelabel )
            	    {
            	    // InternalPascal.g:2351:5: (lv_labels_3_0= rulelabel )
            	    // InternalPascal.g:2352:6: lv_labels_3_0= rulelabel
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLabel_declarationAccess().getLabelsLabelParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_labels_3_0=rulelabel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLabel_declarationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"labels",
            	      							lv_labels_3_0,
            	      							"org.xtext.example.pascal.Pascal.label");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLabel_declarationAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelabel_declaration"


    // $ANTLR start "entryRuleconstant"
    // InternalPascal.g:2378:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // InternalPascal.g:2378:49: (iv_ruleconstant= ruleconstant EOF )
            // InternalPascal.g:2379:2: iv_ruleconstant= ruleconstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleconstant=ruleconstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstant"


    // $ANTLR start "ruleconstant"
    // InternalPascal.g:2385:1: ruleconstant returns [EObject current=null] : ( ( ( (lv_opterator_0_0= RULE_ADDITION_OP ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) | ( (lv_nil_6_0= 'nil' ) ) ) ;
    public final EObject ruleconstant() throws RecognitionException {
        EObject current = null;

        Token lv_opterator_0_0=null;
        Token lv_name_1_0=null;
        Token lv_string_3_0=null;
        Token lv_boolLiteral_4_0=null;
        Token lv_boolLiteral_5_0=null;
        Token lv_nil_6_0=null;
        EObject lv_number_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2391:2: ( ( ( ( (lv_opterator_0_0= RULE_ADDITION_OP ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) | ( (lv_nil_6_0= 'nil' ) ) ) )
            // InternalPascal.g:2392:2: ( ( ( (lv_opterator_0_0= RULE_ADDITION_OP ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) | ( (lv_nil_6_0= 'nil' ) ) )
            {
            // InternalPascal.g:2392:2: ( ( ( (lv_opterator_0_0= RULE_ADDITION_OP ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) | ( (lv_nil_6_0= 'nil' ) ) )
            int alt33=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OP:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_REAL_NUMBER:
                {
                alt33=1;
                }
                break;
            case RULE_STRING:
                {
                alt33=2;
                }
                break;
            case 31:
                {
                alt33=3;
                }
                break;
            case 32:
                {
                alt33=4;
                }
                break;
            case 36:
                {
                alt33=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalPascal.g:2393:3: ( ( (lv_opterator_0_0= RULE_ADDITION_OP ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    {
                    // InternalPascal.g:2393:3: ( ( (lv_opterator_0_0= RULE_ADDITION_OP ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    // InternalPascal.g:2394:4: ( (lv_opterator_0_0= RULE_ADDITION_OP ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    {
                    // InternalPascal.g:2394:4: ( (lv_opterator_0_0= RULE_ADDITION_OP ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_ADDITION_OP) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalPascal.g:2395:5: (lv_opterator_0_0= RULE_ADDITION_OP )
                            {
                            // InternalPascal.g:2395:5: (lv_opterator_0_0= RULE_ADDITION_OP )
                            // InternalPascal.g:2396:6: lv_opterator_0_0= RULE_ADDITION_OP
                            {
                            lv_opterator_0_0=(Token)match(input,RULE_ADDITION_OP,FOLLOW_27); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_opterator_0_0, grammarAccess.getConstantAccess().getOpteratorADDITION_OPTerminalRuleCall_0_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getConstantRule());
                              						}
                              						setWithLastConsumed(
                              							current,
                              							"opterator",
                              							lv_opterator_0_0,
                              							"org.xtext.example.pascal.Pascal.ADDITION_OP");
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalPascal.g:2412:4: ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID) ) {
                        alt32=1;
                    }
                    else if ( ((LA32_0>=RULE_SIGNED_INTEGER_NUMBER && LA32_0<=RULE_INTEGER_NUMBER)||(LA32_0>=RULE_SIGNED_REAL_NUMBER && LA32_0<=RULE_REAL_NUMBER)) ) {
                        alt32=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalPascal.g:2413:5: ( (lv_name_1_0= RULE_ID ) )
                            {
                            // InternalPascal.g:2413:5: ( (lv_name_1_0= RULE_ID ) )
                            // InternalPascal.g:2414:6: (lv_name_1_0= RULE_ID )
                            {
                            // InternalPascal.g:2414:6: (lv_name_1_0= RULE_ID )
                            // InternalPascal.g:2415:7: lv_name_1_0= RULE_ID
                            {
                            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_name_1_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConstantRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"name",
                              								lv_name_1_0,
                              								"org.eclipse.xtext.common.Terminals.ID");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPascal.g:2432:5: ( (lv_number_2_0= rulenumber ) )
                            {
                            // InternalPascal.g:2432:5: ( (lv_number_2_0= rulenumber ) )
                            // InternalPascal.g:2433:6: (lv_number_2_0= rulenumber )
                            {
                            // InternalPascal.g:2433:6: (lv_number_2_0= rulenumber )
                            // InternalPascal.g:2434:7: lv_number_2_0= rulenumber
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getConstantAccess().getNumberNumberParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_number_2_0=rulenumber();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getConstantRule());
                              							}
                              							set(
                              								current,
                              								"number",
                              								lv_number_2_0,
                              								"org.xtext.example.pascal.Pascal.number");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2454:3: ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // InternalPascal.g:2454:3: ( (lv_string_3_0= RULE_STRING ) )
                    // InternalPascal.g:2455:4: (lv_string_3_0= RULE_STRING )
                    {
                    // InternalPascal.g:2455:4: (lv_string_3_0= RULE_STRING )
                    // InternalPascal.g:2456:5: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_string_3_0, grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConstantRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"string",
                      						lv_string_3_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2473:3: ( (lv_boolLiteral_4_0= 'true' ) )
                    {
                    // InternalPascal.g:2473:3: ( (lv_boolLiteral_4_0= 'true' ) )
                    // InternalPascal.g:2474:4: (lv_boolLiteral_4_0= 'true' )
                    {
                    // InternalPascal.g:2474:4: (lv_boolLiteral_4_0= 'true' )
                    // InternalPascal.g:2475:5: lv_boolLiteral_4_0= 'true'
                    {
                    lv_boolLiteral_4_0=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_boolLiteral_4_0, grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConstantRule());
                      					}
                      					setWithLastConsumed(current, "boolLiteral", lv_boolLiteral_4_0, "true");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:2488:3: ( (lv_boolLiteral_5_0= 'false' ) )
                    {
                    // InternalPascal.g:2488:3: ( (lv_boolLiteral_5_0= 'false' ) )
                    // InternalPascal.g:2489:4: (lv_boolLiteral_5_0= 'false' )
                    {
                    // InternalPascal.g:2489:4: (lv_boolLiteral_5_0= 'false' )
                    // InternalPascal.g:2490:5: lv_boolLiteral_5_0= 'false'
                    {
                    lv_boolLiteral_5_0=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_boolLiteral_5_0, grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConstantRule());
                      					}
                      					setWithLastConsumed(current, "boolLiteral", lv_boolLiteral_5_0, "false");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:2503:3: ( (lv_nil_6_0= 'nil' ) )
                    {
                    // InternalPascal.g:2503:3: ( (lv_nil_6_0= 'nil' ) )
                    // InternalPascal.g:2504:4: (lv_nil_6_0= 'nil' )
                    {
                    // InternalPascal.g:2504:4: (lv_nil_6_0= 'nil' )
                    // InternalPascal.g:2505:5: lv_nil_6_0= 'nil'
                    {
                    lv_nil_6_0=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_nil_6_0, grammarAccess.getConstantAccess().getNilNilKeyword_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConstantRule());
                      					}
                      					setWithLastConsumed(current, "nil", true, "nil");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant"


    // $ANTLR start "entryRuleconstant_definition_part"
    // InternalPascal.g:2521:1: entryRuleconstant_definition_part returns [EObject current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final EObject entryRuleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition_part = null;


        try {
            // InternalPascal.g:2521:65: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // InternalPascal.g:2522:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstant_definition_partRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleconstant_definition_part=ruleconstant_definition_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconstant_definition_part; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstant_definition_part"


    // $ANTLR start "ruleconstant_definition_part"
    // InternalPascal.g:2528:1: ruleconstant_definition_part returns [EObject current=null] : (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_consts_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2534:2: ( (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ ) )
            // InternalPascal.g:2535:2: (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ )
            {
            // InternalPascal.g:2535:2: (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:2536:3: otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,41,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstant_definition_partAccess().getConstKeyword_0());
              		
            }
            // InternalPascal.g:2540:3: ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalPascal.g:2541:4: ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:2541:4: ( (lv_consts_1_0= ruleconstant_definition ) )
            	    // InternalPascal.g:2542:5: (lv_consts_1_0= ruleconstant_definition )
            	    {
            	    // InternalPascal.g:2542:5: (lv_consts_1_0= ruleconstant_definition )
            	    // InternalPascal.g:2543:6: lv_consts_1_0= ruleconstant_definition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstsConstant_definitionParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_consts_1_0=ruleconstant_definition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConstant_definition_partRule());
            	      						}
            	      						add(
            	      							current,
            	      							"consts",
            	      							lv_consts_1_0,
            	      							"org.xtext.example.pascal.Pascal.constant_definition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant_definition_part"


    // $ANTLR start "entryRuleconstant_definition"
    // InternalPascal.g:2569:1: entryRuleconstant_definition returns [EObject current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final EObject entryRuleconstant_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition = null;


        try {
            // InternalPascal.g:2569:60: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // InternalPascal.g:2570:2: iv_ruleconstant_definition= ruleconstant_definition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstant_definitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleconstant_definition=ruleconstant_definition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconstant_definition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstant_definition"


    // $ANTLR start "ruleconstant_definition"
    // InternalPascal.g:2576:1: ruleconstant_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) ) ;
    public final EObject ruleconstant_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_const_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2582:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) ) )
            // InternalPascal.g:2583:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) )
            {
            // InternalPascal.g:2583:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) )
            // InternalPascal.g:2584:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) )
            {
            // InternalPascal.g:2584:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:2585:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:2585:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:2586:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getConstant_definitionAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConstant_definitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalPascal.g:2606:3: ( (lv_const_2_0= ruleconstant ) )
            // InternalPascal.g:2607:4: (lv_const_2_0= ruleconstant )
            {
            // InternalPascal.g:2607:4: (lv_const_2_0= ruleconstant )
            // InternalPascal.g:2608:5: lv_const_2_0= ruleconstant
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstant_definitionAccess().getConstConstantParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_const_2_0=ruleconstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstant_definitionRule());
              					}
              					set(
              						current,
              						"const",
              						lv_const_2_0,
              						"org.xtext.example.pascal.Pascal.constant");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant_definition"


    // $ANTLR start "entryRuletype_definition_part"
    // InternalPascal.g:2629:1: entryRuletype_definition_part returns [EObject current=null] : iv_ruletype_definition_part= ruletype_definition_part EOF ;
    public final EObject entryRuletype_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition_part = null;


        try {
            // InternalPascal.g:2629:61: (iv_ruletype_definition_part= ruletype_definition_part EOF )
            // InternalPascal.g:2630:2: iv_ruletype_definition_part= ruletype_definition_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_definition_partRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletype_definition_part=ruletype_definition_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_definition_part; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype_definition_part"


    // $ANTLR start "ruletype_definition_part"
    // InternalPascal.g:2636:1: ruletype_definition_part returns [EObject current=null] : (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruletype_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2642:2: ( (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ ) )
            // InternalPascal.g:2643:2: (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ )
            {
            // InternalPascal.g:2643:2: (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:2644:3: otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,42,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getType_definition_partAccess().getTypeKeyword_0());
              		
            }
            // InternalPascal.g:2648:3: ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalPascal.g:2649:4: ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:2649:4: ( (lv_types_1_0= ruletype_definition ) )
            	    // InternalPascal.g:2650:5: (lv_types_1_0= ruletype_definition )
            	    {
            	    // InternalPascal.g:2650:5: (lv_types_1_0= ruletype_definition )
            	    // InternalPascal.g:2651:6: lv_types_1_0= ruletype_definition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getType_definition_partAccess().getTypesType_definitionParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_types_1_0=ruletype_definition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getType_definition_partRule());
            	      						}
            	      						add(
            	      							current,
            	      							"types",
            	      							lv_types_1_0,
            	      							"org.xtext.example.pascal.Pascal.type_definition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_definition_part"


    // $ANTLR start "entryRuletype_definition"
    // InternalPascal.g:2677:1: entryRuletype_definition returns [EObject current=null] : iv_ruletype_definition= ruletype_definition EOF ;
    public final EObject entryRuletype_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition = null;


        try {
            // InternalPascal.g:2677:56: (iv_ruletype_definition= ruletype_definition EOF )
            // InternalPascal.g:2678:2: iv_ruletype_definition= ruletype_definition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_definitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletype_definition=ruletype_definition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_definition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype_definition"


    // $ANTLR start "ruletype_definition"
    // InternalPascal.g:2684:1: ruletype_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruletype_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2690:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:2691:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:2691:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:2692:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:2692:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:2693:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:2693:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:2694:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getType_definitionAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getType_definitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalPascal.g:2714:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:2715:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:2715:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:2716:5: lv_type_2_0= ruletype
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getType_definitionAccess().getTypeTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getType_definitionRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.xtext.example.pascal.Pascal.type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_definition"


    // $ANTLR start "entryRuletype"
    // InternalPascal.g:2737:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // InternalPascal.g:2737:45: (iv_ruletype= ruletype EOF )
            // InternalPascal.g:2738:2: iv_ruletype= ruletype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletype=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // InternalPascal.g:2744:1: ruletype returns [EObject current=null] : ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        EObject lv_structured_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2750:2: ( ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) ) )
            // InternalPascal.g:2751:2: ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) )
            {
            // InternalPascal.g:2751:2: ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            else if ( (LA36_0==43) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalPascal.g:2752:3: ( (lv_simple_0_0= rulesimple_type ) )
                    {
                    // InternalPascal.g:2752:3: ( (lv_simple_0_0= rulesimple_type ) )
                    // InternalPascal.g:2753:4: (lv_simple_0_0= rulesimple_type )
                    {
                    // InternalPascal.g:2753:4: (lv_simple_0_0= rulesimple_type )
                    // InternalPascal.g:2754:5: lv_simple_0_0= rulesimple_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeAccess().getSimpleSimple_typeParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_simple_0_0=rulesimple_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeRule());
                      					}
                      					set(
                      						current,
                      						"simple",
                      						lv_simple_0_0,
                      						"org.xtext.example.pascal.Pascal.simple_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2772:3: ( (lv_structured_1_0= rulestructured_type ) )
                    {
                    // InternalPascal.g:2772:3: ( (lv_structured_1_0= rulestructured_type ) )
                    // InternalPascal.g:2773:4: (lv_structured_1_0= rulestructured_type )
                    {
                    // InternalPascal.g:2773:4: (lv_structured_1_0= rulestructured_type )
                    // InternalPascal.g:2774:5: lv_structured_1_0= rulestructured_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeAccess().getStructuredStructured_typeParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_structured_1_0=rulestructured_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeRule());
                      					}
                      					set(
                      						current,
                      						"structured",
                      						lv_structured_1_0,
                      						"org.xtext.example.pascal.Pascal.structured_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRulesimple_type"
    // InternalPascal.g:2795:1: entryRulesimple_type returns [EObject current=null] : iv_rulesimple_type= rulesimple_type EOF ;
    public final EObject entryRulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_type = null;


        try {
            // InternalPascal.g:2795:52: (iv_rulesimple_type= rulesimple_type EOF )
            // InternalPascal.g:2796:2: iv_rulesimple_type= rulesimple_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimple_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulesimple_type=rulesimple_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesimple_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesimple_type"


    // $ANTLR start "rulesimple_type"
    // InternalPascal.g:2802:1: rulesimple_type returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulesimple_type() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPascal.g:2808:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPascal.g:2809:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPascal.g:2809:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:2810:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:2810:3: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:2811:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getSimple_typeAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSimple_typeRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimple_type"


    // $ANTLR start "entryRulestructured_type"
    // InternalPascal.g:2830:1: entryRulestructured_type returns [EObject current=null] : iv_rulestructured_type= rulestructured_type EOF ;
    public final EObject entryRulestructured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_type = null;


        try {
            // InternalPascal.g:2830:56: (iv_rulestructured_type= rulestructured_type EOF )
            // InternalPascal.g:2831:2: iv_rulestructured_type= rulestructured_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructured_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestructured_type=rulestructured_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestructured_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestructured_type"


    // $ANTLR start "rulestructured_type"
    // InternalPascal.g:2837:1: rulestructured_type returns [EObject current=null] : ( (lv_type_0_0= ruleunpacked_structured_type ) ) ;
    public final EObject rulestructured_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2843:2: ( ( (lv_type_0_0= ruleunpacked_structured_type ) ) )
            // InternalPascal.g:2844:2: ( (lv_type_0_0= ruleunpacked_structured_type ) )
            {
            // InternalPascal.g:2844:2: ( (lv_type_0_0= ruleunpacked_structured_type ) )
            // InternalPascal.g:2845:3: (lv_type_0_0= ruleunpacked_structured_type )
            {
            // InternalPascal.g:2845:3: (lv_type_0_0= ruleunpacked_structured_type )
            // InternalPascal.g:2846:4: lv_type_0_0= ruleunpacked_structured_type
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getStructured_typeAccess().getTypeUnpacked_structured_typeParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_type_0_0=ruleunpacked_structured_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getStructured_typeRule());
              				}
              				set(
              					current,
              					"type",
              					lv_type_0_0,
              					"org.xtext.example.pascal.Pascal.unpacked_structured_type");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestructured_type"


    // $ANTLR start "entryRuleunpacked_structured_type"
    // InternalPascal.g:2866:1: entryRuleunpacked_structured_type returns [EObject current=null] : iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF ;
    public final EObject entryRuleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_structured_type = null;


        try {
            // InternalPascal.g:2866:65: (iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF )
            // InternalPascal.g:2867:2: iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnpacked_structured_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleunpacked_structured_type=ruleunpacked_structured_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunpacked_structured_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunpacked_structured_type"


    // $ANTLR start "ruleunpacked_structured_type"
    // InternalPascal.g:2873:1: ruleunpacked_structured_type returns [EObject current=null] : ( (lv_record_0_0= rulerecord_type ) ) ;
    public final EObject ruleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject lv_record_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2879:2: ( ( (lv_record_0_0= rulerecord_type ) ) )
            // InternalPascal.g:2880:2: ( (lv_record_0_0= rulerecord_type ) )
            {
            // InternalPascal.g:2880:2: ( (lv_record_0_0= rulerecord_type ) )
            // InternalPascal.g:2881:3: (lv_record_0_0= rulerecord_type )
            {
            // InternalPascal.g:2881:3: (lv_record_0_0= rulerecord_type )
            // InternalPascal.g:2882:4: lv_record_0_0= rulerecord_type
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getRecordRecord_typeParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_record_0_0=rulerecord_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
              				}
              				set(
              					current,
              					"record",
              					lv_record_0_0,
              					"org.xtext.example.pascal.Pascal.record_type");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunpacked_structured_type"


    // $ANTLR start "entryRulerecord_type"
    // InternalPascal.g:2902:1: entryRulerecord_type returns [EObject current=null] : iv_rulerecord_type= rulerecord_type EOF ;
    public final EObject entryRulerecord_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_type = null;


        try {
            // InternalPascal.g:2902:52: (iv_rulerecord_type= rulerecord_type EOF )
            // InternalPascal.g:2903:2: iv_rulerecord_type= rulerecord_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecord_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerecord_type=rulerecord_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerecord_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerecord_type"


    // $ANTLR start "rulerecord_type"
    // InternalPascal.g:2909:1: rulerecord_type returns [EObject current=null] : ( ( (lv_recordKeyword_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= 'end' ) ) ) ;
    public final EObject rulerecord_type() throws RecognitionException {
        EObject current = null;

        Token lv_recordKeyword_0_0=null;
        Token lv_endKeyword_2_0=null;
        EObject lv_fields_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2915:2: ( ( ( (lv_recordKeyword_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= 'end' ) ) ) )
            // InternalPascal.g:2916:2: ( ( (lv_recordKeyword_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= 'end' ) ) )
            {
            // InternalPascal.g:2916:2: ( ( (lv_recordKeyword_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= 'end' ) ) )
            // InternalPascal.g:2917:3: ( (lv_recordKeyword_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= 'end' ) )
            {
            // InternalPascal.g:2917:3: ( (lv_recordKeyword_0_0= 'record' ) )
            // InternalPascal.g:2918:4: (lv_recordKeyword_0_0= 'record' )
            {
            // InternalPascal.g:2918:4: (lv_recordKeyword_0_0= 'record' )
            // InternalPascal.g:2919:5: lv_recordKeyword_0_0= 'record'
            {
            lv_recordKeyword_0_0=(Token)match(input,43,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_recordKeyword_0_0, grammarAccess.getRecord_typeAccess().getRecordKeywordRecordKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRecord_typeRule());
              					}
              					setWithLastConsumed(current, "recordKeyword", lv_recordKeyword_0_0, "record");
              				
            }

            }


            }

            // InternalPascal.g:2931:3: ( (lv_fields_1_0= rulefield_list ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPascal.g:2932:4: (lv_fields_1_0= rulefield_list )
                    {
                    // InternalPascal.g:2932:4: (lv_fields_1_0= rulefield_list )
                    // InternalPascal.g:2933:5: lv_fields_1_0= rulefield_list
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecord_typeAccess().getFieldsField_listParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    lv_fields_1_0=rulefield_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getRecord_typeRule());
                      					}
                      					set(
                      						current,
                      						"fields",
                      						lv_fields_1_0,
                      						"org.xtext.example.pascal.Pascal.field_list");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPascal.g:2950:3: ( (lv_endKeyword_2_0= 'end' ) )
            // InternalPascal.g:2951:4: (lv_endKeyword_2_0= 'end' )
            {
            // InternalPascal.g:2951:4: (lv_endKeyword_2_0= 'end' )
            // InternalPascal.g:2952:5: lv_endKeyword_2_0= 'end'
            {
            lv_endKeyword_2_0=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_endKeyword_2_0, grammarAccess.getRecord_typeAccess().getEndKeywordEndKeyword_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRecord_typeRule());
              					}
              					setWithLastConsumed(current, "endKeyword", lv_endKeyword_2_0, "end");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerecord_type"


    // $ANTLR start "entryRulefield_list"
    // InternalPascal.g:2968:1: entryRulefield_list returns [EObject current=null] : iv_rulefield_list= rulefield_list EOF ;
    public final EObject entryRulefield_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefield_list = null;


        try {
            // InternalPascal.g:2968:51: (iv_rulefield_list= rulefield_list EOF )
            // InternalPascal.g:2969:2: iv_rulefield_list= rulefield_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getField_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefield_list=rulefield_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefield_list; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefield_list"


    // $ANTLR start "rulefield_list"
    // InternalPascal.g:2975:1: rulefield_list returns [EObject current=null] : ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )* ) ;
    public final EObject rulefield_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sections_0_0 = null;

        EObject lv_sections_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2981:2: ( ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )* ) )
            // InternalPascal.g:2982:2: ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )* )
            {
            // InternalPascal.g:2982:2: ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )* )
            // InternalPascal.g:2983:3: ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )*
            {
            // InternalPascal.g:2983:3: ( (lv_sections_0_0= rulerecord_section ) )
            // InternalPascal.g:2984:4: (lv_sections_0_0= rulerecord_section )
            {
            // InternalPascal.g:2984:4: (lv_sections_0_0= rulerecord_section )
            // InternalPascal.g:2985:5: lv_sections_0_0= rulerecord_section
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getField_listAccess().getSectionsRecord_sectionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_sections_0_0=rulerecord_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getField_listRule());
              					}
              					add(
              						current,
              						"sections",
              						lv_sections_0_0,
              						"org.xtext.example.pascal.Pascal.record_section");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:3002:3: (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==21) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalPascal.g:3003:4: otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getField_listAccess().getSemicolonKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:3007:4: ( (lv_sections_2_0= rulerecord_section ) )
            	    // InternalPascal.g:3008:5: (lv_sections_2_0= rulerecord_section )
            	    {
            	    // InternalPascal.g:3008:5: (lv_sections_2_0= rulerecord_section )
            	    // InternalPascal.g:3009:6: lv_sections_2_0= rulerecord_section
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getField_listAccess().getSectionsRecord_sectionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_sections_2_0=rulerecord_section();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getField_listRule());
            	      						}
            	      						add(
            	      							current,
            	      							"sections",
            	      							lv_sections_2_0,
            	      							"org.xtext.example.pascal.Pascal.record_section");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefield_list"


    // $ANTLR start "entryRulerecord_section"
    // InternalPascal.g:3031:1: entryRulerecord_section returns [EObject current=null] : iv_rulerecord_section= rulerecord_section EOF ;
    public final EObject entryRulerecord_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_section = null;


        try {
            // InternalPascal.g:3031:55: (iv_rulerecord_section= rulerecord_section EOF )
            // InternalPascal.g:3032:2: iv_rulerecord_section= rulerecord_section EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecord_sectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerecord_section=rulerecord_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerecord_section; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerecord_section"


    // $ANTLR start "rulerecord_section"
    // InternalPascal.g:3038:1: rulerecord_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulerecord_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3044:2: ( ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:3045:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:3045:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:3046:3: ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:3046:3: ( (lv_identifiers_0_0= ruleidentifier_list ) )
            // InternalPascal.g:3047:4: (lv_identifiers_0_0= ruleidentifier_list )
            {
            // InternalPascal.g:3047:4: (lv_identifiers_0_0= ruleidentifier_list )
            // InternalPascal.g:3048:5: lv_identifiers_0_0= ruleidentifier_list
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRecord_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_identifiers_0_0=ruleidentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRecord_sectionRule());
              					}
              					set(
              						current,
              						"identifiers",
              						lv_identifiers_0_0,
              						"org.xtext.example.pascal.Pascal.identifier_list");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRecord_sectionAccess().getColonKeyword_1());
              		
            }
            // InternalPascal.g:3069:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:3070:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:3070:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:3071:5: lv_type_2_0= ruletype
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRecord_sectionAccess().getTypeTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRecord_sectionRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.xtext.example.pascal.Pascal.type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerecord_section"


    // $ANTLR start "entryRulesigned_number"
    // InternalPascal.g:3092:1: entryRulesigned_number returns [EObject current=null] : iv_rulesigned_number= rulesigned_number EOF ;
    public final EObject entryRulesigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigned_number = null;


        try {
            // InternalPascal.g:3092:54: (iv_rulesigned_number= rulesigned_number EOF )
            // InternalPascal.g:3093:2: iv_rulesigned_number= rulesigned_number EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSigned_numberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulesigned_number=rulesigned_number();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesigned_number; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesigned_number"


    // $ANTLR start "rulesigned_number"
    // InternalPascal.g:3099:1: rulesigned_number returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) ;
    public final EObject rulesigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_real_1_0=null;


        	enterRule();

        try {
            // InternalPascal.g:3105:2: ( ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) )
            // InternalPascal.g:3106:2: ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            {
            // InternalPascal.g:3106:2: ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalPascal.g:3107:3: ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:3107:3: ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    // InternalPascal.g:3108:4: (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:3108:4: (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    // InternalPascal.g:3109:5: lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    lv_integer_0_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_integer_0_0, grammarAccess.getSigned_numberAccess().getIntegerSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSigned_numberRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"integer",
                      						lv_integer_0_0,
                      						"org.xtext.example.pascal.Pascal.SIGNED_INTEGER_NUMBER");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3126:3: ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    {
                    // InternalPascal.g:3126:3: ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    // InternalPascal.g:3127:4: (lv_real_1_0= RULE_SIGNED_REAL_NUMBER )
                    {
                    // InternalPascal.g:3127:4: (lv_real_1_0= RULE_SIGNED_REAL_NUMBER )
                    // InternalPascal.g:3128:5: lv_real_1_0= RULE_SIGNED_REAL_NUMBER
                    {
                    lv_real_1_0=(Token)match(input,RULE_SIGNED_REAL_NUMBER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_real_1_0, grammarAccess.getSigned_numberAccess().getRealSIGNED_REAL_NUMBERTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSigned_numberRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"real",
                      						lv_real_1_0,
                      						"org.xtext.example.pascal.Pascal.SIGNED_REAL_NUMBER");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesigned_number"


    // $ANTLR start "entryRuleunsigned_number"
    // InternalPascal.g:3148:1: entryRuleunsigned_number returns [EObject current=null] : iv_ruleunsigned_number= ruleunsigned_number EOF ;
    public final EObject entryRuleunsigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsigned_number = null;


        try {
            // InternalPascal.g:3148:56: (iv_ruleunsigned_number= ruleunsigned_number EOF )
            // InternalPascal.g:3149:2: iv_ruleunsigned_number= ruleunsigned_number EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnsigned_numberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleunsigned_number=ruleunsigned_number();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunsigned_number; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunsigned_number"


    // $ANTLR start "ruleunsigned_number"
    // InternalPascal.g:3155:1: ruleunsigned_number returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) ;
    public final EObject ruleunsigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_real_1_0=null;


        	enterRule();

        try {
            // InternalPascal.g:3161:2: ( ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) )
            // InternalPascal.g:3162:2: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            {
            // InternalPascal.g:3162:2: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_INTEGER_NUMBER) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_REAL_NUMBER) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalPascal.g:3163:3: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:3163:3: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    // InternalPascal.g:3164:4: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:3164:4: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    // InternalPascal.g:3165:5: lv_integer_0_0= RULE_INTEGER_NUMBER
                    {
                    lv_integer_0_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_integer_0_0, grammarAccess.getUnsigned_numberAccess().getIntegerINTEGER_NUMBERTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getUnsigned_numberRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"integer",
                      						lv_integer_0_0,
                      						"org.xtext.example.pascal.Pascal.INTEGER_NUMBER");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3182:3: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    {
                    // InternalPascal.g:3182:3: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    // InternalPascal.g:3183:4: (lv_real_1_0= RULE_REAL_NUMBER )
                    {
                    // InternalPascal.g:3183:4: (lv_real_1_0= RULE_REAL_NUMBER )
                    // InternalPascal.g:3184:5: lv_real_1_0= RULE_REAL_NUMBER
                    {
                    lv_real_1_0=(Token)match(input,RULE_REAL_NUMBER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_real_1_0, grammarAccess.getUnsigned_numberAccess().getRealREAL_NUMBERTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getUnsigned_numberRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"real",
                      						lv_real_1_0,
                      						"org.xtext.example.pascal.Pascal.REAL_NUMBER");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunsigned_number"


    // $ANTLR start "entryRulevariable_declaration_part"
    // InternalPascal.g:3204:1: entryRulevariable_declaration_part returns [EObject current=null] : iv_rulevariable_declaration_part= rulevariable_declaration_part EOF ;
    public final EObject entryRulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration_part = null;


        try {
            // InternalPascal.g:3204:66: (iv_rulevariable_declaration_part= rulevariable_declaration_part EOF )
            // InternalPascal.g:3205:2: iv_rulevariable_declaration_part= rulevariable_declaration_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declaration_partRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevariable_declaration_part=rulevariable_declaration_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_declaration_part; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_declaration_part"


    // $ANTLR start "rulevariable_declaration_part"
    // InternalPascal.g:3211:1: rulevariable_declaration_part returns [EObject current=null] : (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* ) ;
    public final EObject rulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sections_1_0 = null;

        EObject lv_sections_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3217:2: ( (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* ) )
            // InternalPascal.g:3218:2: (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* )
            {
            // InternalPascal.g:3218:2: (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* )
            // InternalPascal.g:3219:3: otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )*
            {
            otherlv_0=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0());
              		
            }
            // InternalPascal.g:3223:3: ( (lv_sections_1_0= rulevariable_section ) )
            // InternalPascal.g:3224:4: (lv_sections_1_0= rulevariable_section )
            {
            // InternalPascal.g:3224:4: (lv_sections_1_0= rulevariable_section )
            // InternalPascal.g:3225:5: lv_sections_1_0= rulevariable_section
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_sections_1_0=rulevariable_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariable_declaration_partRule());
              					}
              					add(
              						current,
              						"sections",
              						lv_sections_1_0,
              						"org.xtext.example.pascal.Pascal.variable_section");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2());
              		
            }
            // InternalPascal.g:3246:3: ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPascal.g:3247:4: ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';'
            	    {
            	    // InternalPascal.g:3247:4: ( (lv_sections_3_0= rulevariable_section ) )
            	    // InternalPascal.g:3248:5: (lv_sections_3_0= rulevariable_section )
            	    {
            	    // InternalPascal.g:3248:5: (lv_sections_3_0= rulevariable_section )
            	    // InternalPascal.g:3249:6: lv_sections_3_0= rulevariable_section
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_sections_3_0=rulevariable_section();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getVariable_declaration_partRule());
            	      						}
            	      						add(
            	      							current,
            	      							"sections",
            	      							lv_sections_3_0,
            	      							"org.xtext.example.pascal.Pascal.variable_section");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,21,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_declaration_part"


    // $ANTLR start "entryRulevariable_section"
    // InternalPascal.g:3275:1: entryRulevariable_section returns [EObject current=null] : iv_rulevariable_section= rulevariable_section EOF ;
    public final EObject entryRulevariable_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_section = null;


        try {
            // InternalPascal.g:3275:57: (iv_rulevariable_section= rulevariable_section EOF )
            // InternalPascal.g:3276:2: iv_rulevariable_section= rulevariable_section EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_sectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevariable_section=rulevariable_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_section; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_section"


    // $ANTLR start "rulevariable_section"
    // InternalPascal.g:3282:1: rulevariable_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulevariable_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3288:2: ( ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:3289:2: ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:3289:2: ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:3290:3: ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:3290:3: ( (lv_identifiers_0_0= rulevariable_identifier_list ) )
            // InternalPascal.g:3291:4: (lv_identifiers_0_0= rulevariable_identifier_list )
            {
            // InternalPascal.g:3291:4: (lv_identifiers_0_0= rulevariable_identifier_list )
            // InternalPascal.g:3292:5: lv_identifiers_0_0= rulevariable_identifier_list
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariable_sectionAccess().getIdentifiersVariable_identifier_listParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_identifiers_0_0=rulevariable_identifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariable_sectionRule());
              					}
              					set(
              						current,
              						"identifiers",
              						lv_identifiers_0_0,
              						"org.xtext.example.pascal.Pascal.variable_identifier_list");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariable_sectionAccess().getColonKeyword_1());
              		
            }
            // InternalPascal.g:3313:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:3314:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:3314:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:3315:5: lv_type_2_0= ruletype
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariable_sectionAccess().getTypeTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariable_sectionRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.xtext.example.pascal.Pascal.type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_section"


    // $ANTLR start "entryRulevariable_identifier_list"
    // InternalPascal.g:3336:1: entryRulevariable_identifier_list returns [EObject current=null] : iv_rulevariable_identifier_list= rulevariable_identifier_list EOF ;
    public final EObject entryRulevariable_identifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_identifier_list = null;


        try {
            // InternalPascal.g:3336:65: (iv_rulevariable_identifier_list= rulevariable_identifier_list EOF )
            // InternalPascal.g:3337:2: iv_rulevariable_identifier_list= rulevariable_identifier_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_identifier_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevariable_identifier_list=rulevariable_identifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariable_identifier_list; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_identifier_list"


    // $ANTLR start "rulevariable_identifier_list"
    // InternalPascal.g:3343:1: rulevariable_identifier_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject rulevariable_identifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;


        	enterRule();

        try {
            // InternalPascal.g:3349:2: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // InternalPascal.g:3350:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // InternalPascal.g:3350:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            // InternalPascal.g:3351:3: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // InternalPascal.g:3351:3: ( (lv_names_0_0= RULE_ID ) )
            // InternalPascal.g:3352:4: (lv_names_0_0= RULE_ID )
            {
            // InternalPascal.g:3352:4: (lv_names_0_0= RULE_ID )
            // InternalPascal.g:3353:5: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_names_0_0, grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariable_identifier_listRule());
              					}
              					addWithLastConsumed(
              						current,
              						"names",
              						lv_names_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalPascal.g:3369:3: (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==26) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPascal.g:3370:4: otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getVariable_identifier_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:3374:4: ( (lv_names_2_0= RULE_ID ) )
            	    // InternalPascal.g:3375:5: (lv_names_2_0= RULE_ID )
            	    {
            	    // InternalPascal.g:3375:5: (lv_names_2_0= RULE_ID )
            	    // InternalPascal.g:3376:6: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_names_2_0, grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getVariable_identifier_listRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"names",
            	      							lv_names_2_0,
            	      							"org.eclipse.xtext.common.Terminals.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_identifier_list"


    // $ANTLR start "entryRulewhile_statement"
    // InternalPascal.g:3397:1: entryRulewhile_statement returns [EObject current=null] : iv_rulewhile_statement= rulewhile_statement EOF ;
    public final EObject entryRulewhile_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewhile_statement = null;


        try {
            // InternalPascal.g:3397:56: (iv_rulewhile_statement= rulewhile_statement EOF )
            // InternalPascal.g:3398:2: iv_rulewhile_statement= rulewhile_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhile_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulewhile_statement=rulewhile_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulewhile_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulewhile_statement"


    // $ANTLR start "rulewhile_statement"
    // InternalPascal.g:3404:1: rulewhile_statement returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement_sequence ) ) ) ;
    public final EObject rulewhile_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3410:2: ( (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement_sequence ) ) ) )
            // InternalPascal.g:3411:2: (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement_sequence ) ) )
            {
            // InternalPascal.g:3411:2: (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement_sequence ) ) )
            // InternalPascal.g:3412:3: otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement_sequence ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhile_statementAccess().getWhileKeyword_0());
              		
            }
            // InternalPascal.g:3416:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalPascal.g:3417:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalPascal.g:3417:4: (lv_expression_1_0= ruleexpression )
            // InternalPascal.g:3418:5: lv_expression_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhile_statementAccess().getExpressionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_expression_1_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhile_statementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_1_0,
              						"org.xtext.example.pascal.Pascal.expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhile_statementAccess().getDoKeyword_2());
              		
            }
            // InternalPascal.g:3439:3: ( (lv_statement_3_0= rulestatement_sequence ) )
            // InternalPascal.g:3440:4: (lv_statement_3_0= rulestatement_sequence )
            {
            // InternalPascal.g:3440:4: (lv_statement_3_0= rulestatement_sequence )
            // InternalPascal.g:3441:5: lv_statement_3_0= rulestatement_sequence
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhile_statementAccess().getStatementStatement_sequenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_statement_3_0=rulestatement_sequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhile_statementRule());
              					}
              					set(
              						current,
              						"statement",
              						lv_statement_3_0,
              						"org.xtext.example.pascal.Pascal.statement_sequence");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulewhile_statement"

    // $ANTLR start synpred6_InternalPascal
    public final void synpred6_InternalPascal_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_statements_2_0 = null;


        // InternalPascal.g:390:4: (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )
        // InternalPascal.g:390:4: otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) )
        {
        otherlv_1=(Token)match(input,21,FOLLOW_7); if (state.failed) return ;
        // InternalPascal.g:394:4: ( (lv_statements_2_0= rulestatement ) )
        // InternalPascal.g:395:5: (lv_statements_2_0= rulestatement )
        {
        // InternalPascal.g:395:5: (lv_statements_2_0= rulestatement )
        // InternalPascal.g:396:6: lv_statements_2_0= rulestatement
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_statements_2_0=rulestatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred6_InternalPascal

    // Delegated rules

    public final boolean synpred6_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA20 dfa20 = new DFA20(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\uffff\1\12\11\uffff";
    static final String dfa_3s = "\1\4\1\6\11\uffff";
    static final String dfa_4s = "\1\44\1\55\11\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\7\1\10\1\11\1\6\1\1";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\3\uffff\1\3\2\2\22\uffff\1\4\1\5\1\6\1\uffff\1\7\1\10",
            "\4\12\2\uffff\1\12\10\uffff\1\12\1\uffff\1\12\2\uffff\5\12\2\uffff\1\11\1\12\12\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1262:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= 'true' ) ) | ( (lv_boolean_4_0= 'false' ) ) | ( (lv_function_5_0= rulefunction_designator ) ) | (otherlv_6= '(' ( (lv_expression_7_0= ruleexpression ) ) otherlv_8= ')' ) | (otherlv_9= 'not' ( (lv_not_10_0= rulefactor ) ) ) | ( (lv_nil_11_0= 'nil' ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000007E000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000100000400070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001B80001D70L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000018000082L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020001142L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000202L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001F80001D70L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000E000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001870L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001180001D70L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});

}