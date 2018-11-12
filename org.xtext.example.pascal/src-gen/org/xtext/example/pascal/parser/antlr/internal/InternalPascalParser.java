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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SIGNED_INTEGER_NUMBER", "RULE_INTEGER_NUMBER", "RULE_RELATIONAL_OP", "RULE_ADDITION_OP", "RULE_MULTIPLICATION_OP", "RULE_STRING", "RULE_NUMERIC_SUBRANGE", "RULE_SIGNED_REAL_NUMBER", "RULE_REAL_NUMBER", "RULE_DIGIT_SEQUENCE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "';'", "'begin'", "'end'", "':'", "':='", "'['", "']'", "'^'", "','", "'in'", "'='", "'or'", "'div'", "'mod'", "'and'", "'nil'", "'true'", "'false'", "'('", "')'", "'not'", "'function'", "'var'", "'procedure'", "'label'", "'const'", "'type'", "'..'", "'packed'", "'record'", "'case'", "'of'", "'while'", "'do'"
    };
    public static final int T__50=50;
    public static final int RULE_REAL_NUMBER=13;
    public static final int T__55=55;
    public static final int T__51=51;
    public static final int RULE_NUMERIC_SUBRANGE=11;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int RULE_MULTIPLICATION_OP=9;
    public static final int RULE_SIGNED_REAL_NUMBER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=15;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=16;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_RELATIONAL_OP=7;
    public static final int T__20=20;
    public static final int RULE_INTEGER_NUMBER=6;
    public static final int T__21=21;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=17;
    public static final int RULE_DIGIT_SEQUENCE=14;
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
    public static final int RULE_WS=18;
    public static final int RULE_ANY_OTHER=19;
    public static final int RULE_SIGNED_INTEGER_NUMBER=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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
        	return "pascal";
       	}

       	@Override
       	protected PascalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulepascal"
    // InternalPascal.g:70:1: entryRulepascal returns [EObject current=null] : iv_rulepascal= rulepascal EOF ;
    public final EObject entryRulepascal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepascal = null;


        try {
            // InternalPascal.g:70:47: (iv_rulepascal= rulepascal EOF )
            // InternalPascal.g:71:2: iv_rulepascal= rulepascal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPascalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulepascal=rulepascal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepascal; 
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
    // $ANTLR end "entryRulepascal"


    // $ANTLR start "rulepascal"
    // InternalPascal.g:77:1: rulepascal returns [EObject current=null] : ( (lv_program_0_0= ruleprogram ) ) ;
    public final EObject rulepascal() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:83:2: ( ( (lv_program_0_0= ruleprogram ) ) )
            // InternalPascal.g:84:2: ( (lv_program_0_0= ruleprogram ) )
            {
            // InternalPascal.g:84:2: ( (lv_program_0_0= ruleprogram ) )
            // InternalPascal.g:85:3: (lv_program_0_0= ruleprogram )
            {
            // InternalPascal.g:85:3: (lv_program_0_0= ruleprogram )
            // InternalPascal.g:86:4: lv_program_0_0= ruleprogram
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_program_0_0=ruleprogram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPascalRule());
              				}
              				add(
              					current,
              					"program",
              					lv_program_0_0,
              					"org.xtext.example.pascal.Pascal.program");
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
    // $ANTLR end "rulepascal"


    // $ANTLR start "entryRuleprogram"
    // InternalPascal.g:106:1: entryRuleprogram returns [EObject current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final EObject entryRuleprogram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram = null;


        try {
            // InternalPascal.g:106:48: (iv_ruleprogram= ruleprogram EOF )
            // InternalPascal.g:107:2: iv_ruleprogram= ruleprogram EOF
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
    // InternalPascal.g:113:1: ruleprogram returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' ) ;
    public final EObject ruleprogram() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:119:2: ( ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' ) )
            // InternalPascal.g:120:2: ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' )
            {
            // InternalPascal.g:120:2: ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' )
            // InternalPascal.g:121:3: ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.'
            {
            // InternalPascal.g:121:3: ( (lv_heading_0_0= ruleprogram_heading_block ) )
            // InternalPascal.g:122:4: (lv_heading_0_0= ruleprogram_heading_block )
            {
            // InternalPascal.g:122:4: (lv_heading_0_0= ruleprogram_heading_block )
            // InternalPascal.g:123:5: lv_heading_0_0= ruleprogram_heading_block
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

            // InternalPascal.g:140:3: ( (lv_block_1_0= ruleblock ) )
            // InternalPascal.g:141:4: (lv_block_1_0= ruleblock )
            {
            // InternalPascal.g:141:4: (lv_block_1_0= ruleblock )
            // InternalPascal.g:142:5: lv_block_1_0= ruleblock
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

            otherlv_2=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:167:1: entryRuleprogram_heading_block returns [EObject current=null] : iv_ruleprogram_heading_block= ruleprogram_heading_block EOF ;
    public final EObject entryRuleprogram_heading_block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram_heading_block = null;


        try {
            // InternalPascal.g:167:62: (iv_ruleprogram_heading_block= ruleprogram_heading_block EOF )
            // InternalPascal.g:168:2: iv_ruleprogram_heading_block= ruleprogram_heading_block EOF
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
    // InternalPascal.g:174:1: ruleprogram_heading_block returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleprogram_heading_block() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPascal.g:180:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalPascal.g:181:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalPascal.g:181:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalPascal.g:182:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0());
              		
            }
            // InternalPascal.g:186:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:187:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:187:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:188:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:212:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // InternalPascal.g:212:46: (iv_ruleblock= ruleblock EOF )
            // InternalPascal.g:213:2: iv_ruleblock= ruleblock EOF
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
    // InternalPascal.g:219:1: ruleblock returns [EObject current=null] : ( ( (lv_label_0_0= rulelabel_declaration ) )? ( (lv_type_1_0= ruletype_definition_part ) )? ( (lv_variable_2_0= rulevariable_declaration_part ) )? ( (lv_constant_3_0= ruleconstant_definition_part ) )? ( (lv_abstraction_4_0= rulefunction_procedure_declaration ) )? ( (lv_statement_5_0= rulestatement_part ) ) ) ;
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
            // InternalPascal.g:225:2: ( ( ( (lv_label_0_0= rulelabel_declaration ) )? ( (lv_type_1_0= ruletype_definition_part ) )? ( (lv_variable_2_0= rulevariable_declaration_part ) )? ( (lv_constant_3_0= ruleconstant_definition_part ) )? ( (lv_abstraction_4_0= rulefunction_procedure_declaration ) )? ( (lv_statement_5_0= rulestatement_part ) ) ) )
            // InternalPascal.g:226:2: ( ( (lv_label_0_0= rulelabel_declaration ) )? ( (lv_type_1_0= ruletype_definition_part ) )? ( (lv_variable_2_0= rulevariable_declaration_part ) )? ( (lv_constant_3_0= ruleconstant_definition_part ) )? ( (lv_abstraction_4_0= rulefunction_procedure_declaration ) )? ( (lv_statement_5_0= rulestatement_part ) ) )
            {
            // InternalPascal.g:226:2: ( ( (lv_label_0_0= rulelabel_declaration ) )? ( (lv_type_1_0= ruletype_definition_part ) )? ( (lv_variable_2_0= rulevariable_declaration_part ) )? ( (lv_constant_3_0= ruleconstant_definition_part ) )? ( (lv_abstraction_4_0= rulefunction_procedure_declaration ) )? ( (lv_statement_5_0= rulestatement_part ) ) )
            // InternalPascal.g:227:3: ( (lv_label_0_0= rulelabel_declaration ) )? ( (lv_type_1_0= ruletype_definition_part ) )? ( (lv_variable_2_0= rulevariable_declaration_part ) )? ( (lv_constant_3_0= ruleconstant_definition_part ) )? ( (lv_abstraction_4_0= rulefunction_procedure_declaration ) )? ( (lv_statement_5_0= rulestatement_part ) )
            {
            // InternalPascal.g:227:3: ( (lv_label_0_0= rulelabel_declaration ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==46) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:228:4: (lv_label_0_0= rulelabel_declaration )
                    {
                    // InternalPascal.g:228:4: (lv_label_0_0= rulelabel_declaration )
                    // InternalPascal.g:229:5: lv_label_0_0= rulelabel_declaration
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

            // InternalPascal.g:246:3: ( (lv_type_1_0= ruletype_definition_part ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==48) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPascal.g:247:4: (lv_type_1_0= ruletype_definition_part )
                    {
                    // InternalPascal.g:247:4: (lv_type_1_0= ruletype_definition_part )
                    // InternalPascal.g:248:5: lv_type_1_0= ruletype_definition_part
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

            // InternalPascal.g:265:3: ( (lv_variable_2_0= rulevariable_declaration_part ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==44) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPascal.g:266:4: (lv_variable_2_0= rulevariable_declaration_part )
                    {
                    // InternalPascal.g:266:4: (lv_variable_2_0= rulevariable_declaration_part )
                    // InternalPascal.g:267:5: lv_variable_2_0= rulevariable_declaration_part
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

            // InternalPascal.g:284:3: ( (lv_constant_3_0= ruleconstant_definition_part ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==47) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:285:4: (lv_constant_3_0= ruleconstant_definition_part )
                    {
                    // InternalPascal.g:285:4: (lv_constant_3_0= ruleconstant_definition_part )
                    // InternalPascal.g:286:5: lv_constant_3_0= ruleconstant_definition_part
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

            // InternalPascal.g:303:3: ( (lv_abstraction_4_0= rulefunction_procedure_declaration ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==43||LA5_0==45) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:304:4: (lv_abstraction_4_0= rulefunction_procedure_declaration )
                    {
                    // InternalPascal.g:304:4: (lv_abstraction_4_0= rulefunction_procedure_declaration )
                    // InternalPascal.g:305:5: lv_abstraction_4_0= rulefunction_procedure_declaration
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

            // InternalPascal.g:322:3: ( (lv_statement_5_0= rulestatement_part ) )
            // InternalPascal.g:323:4: (lv_statement_5_0= rulestatement_part )
            {
            // InternalPascal.g:323:4: (lv_statement_5_0= rulestatement_part )
            // InternalPascal.g:324:5: lv_statement_5_0= rulestatement_part
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
    // InternalPascal.g:345:1: entryRulestatement_part returns [EObject current=null] : iv_rulestatement_part= rulestatement_part EOF ;
    public final EObject entryRulestatement_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_part = null;


        try {
            // InternalPascal.g:345:55: (iv_rulestatement_part= rulestatement_part EOF )
            // InternalPascal.g:346:2: iv_rulestatement_part= rulestatement_part EOF
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
    // InternalPascal.g:352:1: rulestatement_part returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) ;
    public final EObject rulestatement_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:358:2: ( (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:359:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:359:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            // InternalPascal.g:360:3: otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStatement_partAccess().getBeginKeyword_0());
              		
            }
            // InternalPascal.g:364:3: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // InternalPascal.g:365:4: (lv_sequence_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:365:4: (lv_sequence_1_0= rulestatement_sequence )
            // InternalPascal.g:366:5: lv_sequence_1_0= rulestatement_sequence
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

            otherlv_2=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:391:1: entryRulestatement_sequence returns [EObject current=null] : iv_rulestatement_sequence= rulestatement_sequence EOF ;
    public final EObject entryRulestatement_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_sequence = null;


        try {
            // InternalPascal.g:391:59: (iv_rulestatement_sequence= rulestatement_sequence EOF )
            // InternalPascal.g:392:2: iv_rulestatement_sequence= rulestatement_sequence EOF
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
    // InternalPascal.g:398:1: rulestatement_sequence returns [EObject current=null] : ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) ;
    public final EObject rulestatement_sequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:404:2: ( ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) )
            // InternalPascal.g:405:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            {
            // InternalPascal.g:405:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            // InternalPascal.g:406:3: ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            {
            // InternalPascal.g:406:3: ( (lv_statements_0_0= rulestatement ) )
            // InternalPascal.g:407:4: (lv_statements_0_0= rulestatement )
            {
            // InternalPascal.g:407:4: (lv_statements_0_0= rulestatement )
            // InternalPascal.g:408:5: lv_statements_0_0= rulestatement
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

            // InternalPascal.g:425:3: (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    int LA6_2 = input.LA(2);

                    if ( (synpred6_InternalPascal()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalPascal.g:426:4: otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:430:4: ( (lv_statements_2_0= rulestatement ) )
            	    // InternalPascal.g:431:5: (lv_statements_2_0= rulestatement )
            	    {
            	    // InternalPascal.g:431:5: (lv_statements_2_0= rulestatement )
            	    // InternalPascal.g:432:6: lv_statements_2_0= rulestatement
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
    // InternalPascal.g:454:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // InternalPascal.g:454:50: (iv_rulestatement= rulestatement EOF )
            // InternalPascal.g:455:2: iv_rulestatement= rulestatement EOF
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
    // InternalPascal.g:461:1: rulestatement returns [EObject current=null] : ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_label_0_0 = null;

        EObject lv_simple_2_0 = null;

        EObject lv_structured_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:467:2: ( ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) ) )
            // InternalPascal.g:468:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) )
            {
            // InternalPascal.g:468:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) )
            // InternalPascal.g:469:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) )
            {
            // InternalPascal.g:469:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_SIGNED_INTEGER_NUMBER && LA7_0<=RULE_INTEGER_NUMBER)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPascal.g:470:4: ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':'
                    {
                    // InternalPascal.g:470:4: ( (lv_label_0_0= rulelabel ) )
                    // InternalPascal.g:471:5: (lv_label_0_0= rulelabel )
                    {
                    // InternalPascal.g:471:5: (lv_label_0_0= rulelabel )
                    // InternalPascal.g:472:6: lv_label_0_0= rulelabel
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

                    otherlv_1=(Token)match(input,25,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalPascal.g:494:3: ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==EOF||LA8_0==RULE_ID||LA8_0==22||LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==23||LA8_0==54) ) {
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
                    // InternalPascal.g:495:4: ( (lv_simple_2_0= rulesimple_statement ) )
                    {
                    // InternalPascal.g:495:4: ( (lv_simple_2_0= rulesimple_statement ) )
                    // InternalPascal.g:496:5: (lv_simple_2_0= rulesimple_statement )
                    {
                    // InternalPascal.g:496:5: (lv_simple_2_0= rulesimple_statement )
                    // InternalPascal.g:497:6: lv_simple_2_0= rulesimple_statement
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
                    // InternalPascal.g:515:4: ( (lv_structured_3_0= rulestructured_statement ) )
                    {
                    // InternalPascal.g:515:4: ( (lv_structured_3_0= rulestructured_statement ) )
                    // InternalPascal.g:516:5: (lv_structured_3_0= rulestructured_statement )
                    {
                    // InternalPascal.g:516:5: (lv_structured_3_0= rulestructured_statement )
                    // InternalPascal.g:517:6: lv_structured_3_0= rulestructured_statement
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
    // InternalPascal.g:539:1: entryRulesimple_statement returns [EObject current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final EObject entryRulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_statement = null;


        try {
            // InternalPascal.g:539:57: (iv_rulesimple_statement= rulesimple_statement EOF )
            // InternalPascal.g:540:2: iv_rulesimple_statement= rulesimple_statement EOF
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
    // InternalPascal.g:546:1: rulesimple_statement returns [EObject current=null] : ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_function_noargs_2_0= RULE_ID ) ) )? ;
    public final EObject rulesimple_statement() throws RecognitionException {
        EObject current = null;

        Token lv_function_noargs_2_0=null;
        EObject lv_assignment_0_0 = null;

        EObject lv_function_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:552:2: ( ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_function_noargs_2_0= RULE_ID ) ) )? )
            // InternalPascal.g:553:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_function_noargs_2_0= RULE_ID ) ) )?
            {
            // InternalPascal.g:553:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_function_noargs_2_0= RULE_ID ) ) )?
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                    case EOF:
                    case 22:
                    case 24:
                        {
                        alt9=3;
                        }
                        break;
                    case 40:
                        {
                        alt9=2;
                        }
                        break;
                    case 20:
                    case 26:
                    case 27:
                    case 29:
                        {
                        alt9=1;
                        }
                        break;
                }

            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:554:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    {
                    // InternalPascal.g:554:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    // InternalPascal.g:555:4: (lv_assignment_0_0= ruleassignment_statement )
                    {
                    // InternalPascal.g:555:4: (lv_assignment_0_0= ruleassignment_statement )
                    // InternalPascal.g:556:5: lv_assignment_0_0= ruleassignment_statement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_statementParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_assignment_0_0=ruleassignment_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                      					}
                      					set(
                      						current,
                      						"assignment",
                      						lv_assignment_0_0,
                      						"org.xtext.example.pascal.Pascal.assignment_statement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:574:3: ( (lv_function_1_0= rulefunction_designator ) )
                    {
                    // InternalPascal.g:574:3: ( (lv_function_1_0= rulefunction_designator ) )
                    // InternalPascal.g:575:4: (lv_function_1_0= rulefunction_designator )
                    {
                    // InternalPascal.g:575:4: (lv_function_1_0= rulefunction_designator )
                    // InternalPascal.g:576:5: lv_function_1_0= rulefunction_designator
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimple_statementAccess().getFunctionFunction_designatorParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_function_1_0=rulefunction_designator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                      					}
                      					set(
                      						current,
                      						"function",
                      						lv_function_1_0,
                      						"org.xtext.example.pascal.Pascal.function_designator");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:594:3: ( (lv_function_noargs_2_0= RULE_ID ) )
                    {
                    // InternalPascal.g:594:3: ( (lv_function_noargs_2_0= RULE_ID ) )
                    // InternalPascal.g:595:4: (lv_function_noargs_2_0= RULE_ID )
                    {
                    // InternalPascal.g:595:4: (lv_function_noargs_2_0= RULE_ID )
                    // InternalPascal.g:596:5: lv_function_noargs_2_0= RULE_ID
                    {
                    lv_function_noargs_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_function_noargs_2_0, grammarAccess.getSimple_statementAccess().getFunction_noargsIDTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSimple_statementRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"function_noargs",
                      						lv_function_noargs_2_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
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
    // $ANTLR end "rulesimple_statement"


    // $ANTLR start "entryRulestructured_statement"
    // InternalPascal.g:616:1: entryRulestructured_statement returns [EObject current=null] : iv_rulestructured_statement= rulestructured_statement EOF ;
    public final EObject entryRulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_statement = null;


        try {
            // InternalPascal.g:616:61: (iv_rulestructured_statement= rulestructured_statement EOF )
            // InternalPascal.g:617:2: iv_rulestructured_statement= rulestructured_statement EOF
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
    // InternalPascal.g:623:1: rulestructured_statement returns [EObject current=null] : ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_while_stmt_1_0= rulewhile_statement ) ) ) ;
    public final EObject rulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_compound_0_0 = null;

        EObject lv_while_stmt_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:629:2: ( ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_while_stmt_1_0= rulewhile_statement ) ) ) )
            // InternalPascal.g:630:2: ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_while_stmt_1_0= rulewhile_statement ) ) )
            {
            // InternalPascal.g:630:2: ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_while_stmt_1_0= rulewhile_statement ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            else if ( (LA10_0==54) ) {
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
                    // InternalPascal.g:631:3: ( (lv_compound_0_0= rulecompound_statement ) )
                    {
                    // InternalPascal.g:631:3: ( (lv_compound_0_0= rulecompound_statement ) )
                    // InternalPascal.g:632:4: (lv_compound_0_0= rulecompound_statement )
                    {
                    // InternalPascal.g:632:4: (lv_compound_0_0= rulecompound_statement )
                    // InternalPascal.g:633:5: lv_compound_0_0= rulecompound_statement
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
                    // InternalPascal.g:651:3: ( (lv_while_stmt_1_0= rulewhile_statement ) )
                    {
                    // InternalPascal.g:651:3: ( (lv_while_stmt_1_0= rulewhile_statement ) )
                    // InternalPascal.g:652:4: (lv_while_stmt_1_0= rulewhile_statement )
                    {
                    // InternalPascal.g:652:4: (lv_while_stmt_1_0= rulewhile_statement )
                    // InternalPascal.g:653:5: lv_while_stmt_1_0= rulewhile_statement
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
    // InternalPascal.g:674:1: entryRulecompound_statement returns [EObject current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final EObject entryRulecompound_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompound_statement = null;


        try {
            // InternalPascal.g:674:59: (iv_rulecompound_statement= rulecompound_statement EOF )
            // InternalPascal.g:675:2: iv_rulecompound_statement= rulecompound_statement EOF
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
    // InternalPascal.g:681:1: rulecompound_statement returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) ;
    public final EObject rulecompound_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:687:2: ( (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:688:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:688:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            // InternalPascal.g:689:3: otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCompound_statementAccess().getBeginKeyword_0());
              		
            }
            // InternalPascal.g:693:3: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // InternalPascal.g:694:4: (lv_sequence_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:694:4: (lv_sequence_1_0= rulestatement_sequence )
            // InternalPascal.g:695:5: lv_sequence_1_0= rulestatement_sequence
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

            otherlv_2=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:720:1: entryRuleassignment_statement returns [EObject current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final EObject entryRuleassignment_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment_statement = null;


        try {
            // InternalPascal.g:720:61: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // InternalPascal.g:721:2: iv_ruleassignment_statement= ruleassignment_statement EOF
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
    // InternalPascal.g:727:1: ruleassignment_statement returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) ;
    public final EObject ruleassignment_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:733:2: ( ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) )
            // InternalPascal.g:734:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            {
            // InternalPascal.g:734:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            // InternalPascal.g:735:3: ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) )
            {
            // InternalPascal.g:735:3: ( (lv_variable_0_0= rulevariable ) )
            // InternalPascal.g:736:4: (lv_variable_0_0= rulevariable )
            {
            // InternalPascal.g:736:4: (lv_variable_0_0= rulevariable )
            // InternalPascal.g:737:5: lv_variable_0_0= rulevariable
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

            otherlv_1=(Token)match(input,26,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalPascal.g:758:3: ( (lv_expression_2_0= ruleexpression ) )
            // InternalPascal.g:759:4: (lv_expression_2_0= ruleexpression )
            {
            // InternalPascal.g:759:4: (lv_expression_2_0= ruleexpression )
            // InternalPascal.g:760:5: lv_expression_2_0= ruleexpression
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
    // InternalPascal.g:781:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // InternalPascal.g:781:46: (iv_rulelabel= rulelabel EOF )
            // InternalPascal.g:782:2: iv_rulelabel= rulelabel EOF
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
    // InternalPascal.g:788:1: rulelabel returns [EObject current=null] : ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_number_1_0=null;


        	enterRule();

        try {
            // InternalPascal.g:794:2: ( ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) ) )
            // InternalPascal.g:795:2: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) )
            {
            // InternalPascal.g:795:2: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) )
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
                    // InternalPascal.g:796:3: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:796:3: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    // InternalPascal.g:797:4: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:797:4: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    // InternalPascal.g:798:5: lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER
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
                    // InternalPascal.g:815:3: ( (lv_number_1_0= RULE_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:815:3: ( (lv_number_1_0= RULE_INTEGER_NUMBER ) )
                    // InternalPascal.g:816:4: (lv_number_1_0= RULE_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:816:4: (lv_number_1_0= RULE_INTEGER_NUMBER )
                    // InternalPascal.g:817:5: lv_number_1_0= RULE_INTEGER_NUMBER
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
    // InternalPascal.g:837:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // InternalPascal.g:837:49: (iv_rulevariable= rulevariable EOF )
            // InternalPascal.g:838:2: iv_rulevariable= rulevariable EOF
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
    // InternalPascal.g:844:1: rulevariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) ) ;
    public final EObject rulevariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:850:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) ) )
            // InternalPascal.g:851:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) )
            {
            // InternalPascal.g:851:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) )
            // InternalPascal.g:852:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) )
            {
            // InternalPascal.g:852:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:853:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:853:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:854:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
              				
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

            // InternalPascal.g:870:3: ( (lv_variable_1_0= rulevar_ ) )
            // InternalPascal.g:871:4: (lv_variable_1_0= rulevar_ )
            {
            // InternalPascal.g:871:4: (lv_variable_1_0= rulevar_ )
            // InternalPascal.g:872:5: lv_variable_1_0= rulevar_
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableAccess().getVariableVar_ParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_variable_1_0=rulevar_();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableRule());
              					}
              					set(
              						current,
              						"variable",
              						lv_variable_1_0,
              						"org.xtext.example.pascal.Pascal.var_");
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
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRulevar_"
    // InternalPascal.g:893:1: entryRulevar_ returns [EObject current=null] : iv_rulevar_= rulevar_ EOF ;
    public final EObject entryRulevar_() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevar_ = null;


        try {
            // InternalPascal.g:893:45: (iv_rulevar_= rulevar_ EOF )
            // InternalPascal.g:894:2: iv_rulevar_= rulevar_ EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVar_Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevar_=rulevar_();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevar_; 
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
    // $ANTLR end "entryRulevar_"


    // $ANTLR start "rulevar_"
    // InternalPascal.g:900:1: rulevar_ returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )? ;
    public final EObject rulevar_() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_accessor_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_7=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_array_3_0 = null;

        EObject lv_variable_6_0 = null;

        EObject lv_pointer_8_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:906:2: ( ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )? )
            // InternalPascal.g:907:2: ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )?
            {
            // InternalPascal.g:907:2: ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )?
            int alt12=4;
            switch ( input.LA(1) ) {
                case 27:
                    {
                    alt12=1;
                    }
                    break;
                case 20:
                    {
                    alt12=2;
                    }
                    break;
                case 29:
                    {
                    alt12=3;
                    }
                    break;
            }

            switch (alt12) {
                case 1 :
                    // InternalPascal.g:908:3: (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) )
                    {
                    // InternalPascal.g:908:3: (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) )
                    // InternalPascal.g:909:4: otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) )
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getVar_Access().getLeftSquareBracketKeyword_0_0());
                      			
                    }
                    // InternalPascal.g:913:4: ( (lv_expressions_1_0= ruleexpression_list ) )
                    // InternalPascal.g:914:5: (lv_expressions_1_0= ruleexpression_list )
                    {
                    // InternalPascal.g:914:5: (lv_expressions_1_0= ruleexpression_list )
                    // InternalPascal.g:915:6: lv_expressions_1_0= ruleexpression_list
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVar_Access().getExpressionsExpression_listParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_expressions_1_0=ruleexpression_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVar_Rule());
                      						}
                      						set(
                      							current,
                      							"expressions",
                      							lv_expressions_1_0,
                      							"org.xtext.example.pascal.Pascal.expression_list");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getVar_Access().getRightSquareBracketKeyword_0_2());
                      			
                    }
                    // InternalPascal.g:936:4: ( (lv_array_3_0= rulevar_ ) )
                    // InternalPascal.g:937:5: (lv_array_3_0= rulevar_ )
                    {
                    // InternalPascal.g:937:5: (lv_array_3_0= rulevar_ )
                    // InternalPascal.g:938:6: lv_array_3_0= rulevar_
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVar_Access().getArrayVar_ParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_array_3_0=rulevar_();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVar_Rule());
                      						}
                      						set(
                      							current,
                      							"array",
                      							lv_array_3_0,
                      							"org.xtext.example.pascal.Pascal.var_");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:957:3: ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) )
                    {
                    // InternalPascal.g:957:3: ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) )
                    // InternalPascal.g:958:4: ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) )
                    {
                    // InternalPascal.g:958:4: ( (lv_accessor_4_0= '.' ) )
                    // InternalPascal.g:959:5: (lv_accessor_4_0= '.' )
                    {
                    // InternalPascal.g:959:5: (lv_accessor_4_0= '.' )
                    // InternalPascal.g:960:6: lv_accessor_4_0= '.'
                    {
                    lv_accessor_4_0=(Token)match(input,20,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_accessor_4_0, grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVar_Rule());
                      						}
                      						setWithLastConsumed(current, "accessor", true, ".");
                      					
                    }

                    }


                    }

                    // InternalPascal.g:972:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalPascal.g:973:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalPascal.g:973:5: (lv_name_5_0= RULE_ID )
                    // InternalPascal.g:974:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_5_0, grammarAccess.getVar_Access().getNameIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVar_Rule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_5_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalPascal.g:990:4: ( (lv_variable_6_0= rulevar_ ) )
                    // InternalPascal.g:991:5: (lv_variable_6_0= rulevar_ )
                    {
                    // InternalPascal.g:991:5: (lv_variable_6_0= rulevar_ )
                    // InternalPascal.g:992:6: lv_variable_6_0= rulevar_
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVar_Access().getVariableVar_ParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_variable_6_0=rulevar_();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVar_Rule());
                      						}
                      						set(
                      							current,
                      							"variable",
                      							lv_variable_6_0,
                      							"org.xtext.example.pascal.Pascal.var_");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1011:3: (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) )
                    {
                    // InternalPascal.g:1011:3: (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) )
                    // InternalPascal.g:1012:4: otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getVar_Access().getCircumflexAccentKeyword_2_0());
                      			
                    }
                    // InternalPascal.g:1016:4: ( (lv_pointer_8_0= rulevar_ ) )
                    // InternalPascal.g:1017:5: (lv_pointer_8_0= rulevar_ )
                    {
                    // InternalPascal.g:1017:5: (lv_pointer_8_0= rulevar_ )
                    // InternalPascal.g:1018:6: lv_pointer_8_0= rulevar_
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVar_Access().getPointerVar_ParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_pointer_8_0=rulevar_();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVar_Rule());
                      						}
                      						set(
                      							current,
                      							"pointer",
                      							lv_pointer_8_0,
                      							"org.xtext.example.pascal.Pascal.var_");
                      						afterParserOrEnumRuleCall();
                      					
                    }

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
    // $ANTLR end "rulevar_"


    // $ANTLR start "entryRuleexpression_list"
    // InternalPascal.g:1040:1: entryRuleexpression_list returns [EObject current=null] : iv_ruleexpression_list= ruleexpression_list EOF ;
    public final EObject entryRuleexpression_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression_list = null;


        try {
            // InternalPascal.g:1040:56: (iv_ruleexpression_list= ruleexpression_list EOF )
            // InternalPascal.g:1041:2: iv_ruleexpression_list= ruleexpression_list EOF
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
    // InternalPascal.g:1047:1: ruleexpression_list returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* ) ;
    public final EObject ruleexpression_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1053:2: ( ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* ) )
            // InternalPascal.g:1054:2: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* )
            {
            // InternalPascal.g:1054:2: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* )
            // InternalPascal.g:1055:3: ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )*
            {
            // InternalPascal.g:1055:3: ( (lv_expressions_0_0= ruleexpression ) )
            // InternalPascal.g:1056:4: (lv_expressions_0_0= ruleexpression )
            {
            // InternalPascal.g:1056:4: (lv_expressions_0_0= ruleexpression )
            // InternalPascal.g:1057:5: lv_expressions_0_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_15);
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

            // InternalPascal.g:1074:3: (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPascal.g:1075:4: otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getExpression_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:1079:4: ( (lv_expressions_2_0= ruleexpression ) )
            	    // InternalPascal.g:1080:5: (lv_expressions_2_0= ruleexpression )
            	    {
            	    // InternalPascal.g:1080:5: (lv_expressions_2_0= ruleexpression )
            	    // InternalPascal.g:1081:6: lv_expressions_2_0= ruleexpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
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
            	    break loop13;
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
    // InternalPascal.g:1103:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalPascal.g:1103:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalPascal.g:1104:2: iv_ruleexpression= ruleexpression EOF
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
    // InternalPascal.g:1110:1: ruleexpression returns [EObject current=null] : ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1116:2: ( ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) )
            // InternalPascal.g:1117:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            {
            // InternalPascal.g:1117:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            // InternalPascal.g:1118:3: ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            {
            // InternalPascal.g:1118:3: ( (lv_expressions_0_0= rulesimple_expression ) )
            // InternalPascal.g:1119:4: (lv_expressions_0_0= rulesimple_expression )
            {
            // InternalPascal.g:1119:4: (lv_expressions_0_0= rulesimple_expression )
            // InternalPascal.g:1120:5: lv_expressions_0_0= rulesimple_expression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_16);
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

            // InternalPascal.g:1137:3: ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_RELATIONAL_OP||(LA15_0>=31 && LA15_0<=32)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPascal.g:1138:4: ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) )
                    {
                    // InternalPascal.g:1138:4: ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) )
                    int alt14=3;
                    switch ( input.LA(1) ) {
                    case RULE_RELATIONAL_OP:
                        {
                        alt14=1;
                        }
                        break;
                    case 31:
                        {
                        alt14=2;
                        }
                        break;
                    case 32:
                        {
                        alt14=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }

                    switch (alt14) {
                        case 1 :
                            // InternalPascal.g:1139:5: ( (lv_operators_1_0= RULE_RELATIONAL_OP ) )
                            {
                            // InternalPascal.g:1139:5: ( (lv_operators_1_0= RULE_RELATIONAL_OP ) )
                            // InternalPascal.g:1140:6: (lv_operators_1_0= RULE_RELATIONAL_OP )
                            {
                            // InternalPascal.g:1140:6: (lv_operators_1_0= RULE_RELATIONAL_OP )
                            // InternalPascal.g:1141:7: lv_operators_1_0= RULE_RELATIONAL_OP
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
                            // InternalPascal.g:1158:5: ( (lv_operators_2_0= 'in' ) )
                            {
                            // InternalPascal.g:1158:5: ( (lv_operators_2_0= 'in' ) )
                            // InternalPascal.g:1159:6: (lv_operators_2_0= 'in' )
                            {
                            // InternalPascal.g:1159:6: (lv_operators_2_0= 'in' )
                            // InternalPascal.g:1160:7: lv_operators_2_0= 'in'
                            {
                            lv_operators_2_0=(Token)match(input,31,FOLLOW_12); if (state.failed) return current;
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
                            // InternalPascal.g:1173:5: ( (lv_operators_3_0= '=' ) )
                            {
                            // InternalPascal.g:1173:5: ( (lv_operators_3_0= '=' ) )
                            // InternalPascal.g:1174:6: (lv_operators_3_0= '=' )
                            {
                            // InternalPascal.g:1174:6: (lv_operators_3_0= '=' )
                            // InternalPascal.g:1175:7: lv_operators_3_0= '='
                            {
                            lv_operators_3_0=(Token)match(input,32,FOLLOW_12); if (state.failed) return current;
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

                    // InternalPascal.g:1188:4: ( (lv_expressions_4_0= rulesimple_expression ) )
                    // InternalPascal.g:1189:5: (lv_expressions_4_0= rulesimple_expression )
                    {
                    // InternalPascal.g:1189:5: (lv_expressions_4_0= rulesimple_expression )
                    // InternalPascal.g:1190:6: lv_expressions_4_0= rulesimple_expression
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
    // InternalPascal.g:1212:1: entryRulesimple_expression returns [EObject current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final EObject entryRulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_expression = null;


        try {
            // InternalPascal.g:1212:58: (iv_rulesimple_expression= rulesimple_expression EOF )
            // InternalPascal.g:1213:2: iv_rulesimple_expression= rulesimple_expression EOF
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
    // InternalPascal.g:1219:1: rulesimple_expression returns [EObject current=null] : ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* ) ;
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
            // InternalPascal.g:1225:2: ( ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* ) )
            // InternalPascal.g:1226:2: ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* )
            {
            // InternalPascal.g:1226:2: ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* )
            // InternalPascal.g:1227:3: ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )*
            {
            // InternalPascal.g:1227:3: ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ADDITION_OP) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPascal.g:1228:4: (lv_prefixOperator_0_0= RULE_ADDITION_OP )
                    {
                    // InternalPascal.g:1228:4: (lv_prefixOperator_0_0= RULE_ADDITION_OP )
                    // InternalPascal.g:1229:5: lv_prefixOperator_0_0= RULE_ADDITION_OP
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

            // InternalPascal.g:1245:3: ( (lv_terms_1_0= ruleterm ) )
            // InternalPascal.g:1246:4: (lv_terms_1_0= ruleterm )
            {
            // InternalPascal.g:1246:4: (lv_terms_1_0= ruleterm )
            // InternalPascal.g:1247:5: lv_terms_1_0= ruleterm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            // InternalPascal.g:1264:3: ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ADDITION_OP||LA18_0==33) ) {
                    alt18=1;
                }
                else if ( (LA18_0==RULE_INTEGER_NUMBER||LA18_0==RULE_REAL_NUMBER) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPascal.g:1265:4: ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    {
            	    // InternalPascal.g:1265:4: ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    // InternalPascal.g:1266:5: ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) )
            	    {
            	    // InternalPascal.g:1266:5: ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==RULE_ADDITION_OP) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==33) ) {
            	        alt17=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalPascal.g:1267:6: ( (lv_operators_2_0= RULE_ADDITION_OP ) )
            	            {
            	            // InternalPascal.g:1267:6: ( (lv_operators_2_0= RULE_ADDITION_OP ) )
            	            // InternalPascal.g:1268:7: (lv_operators_2_0= RULE_ADDITION_OP )
            	            {
            	            // InternalPascal.g:1268:7: (lv_operators_2_0= RULE_ADDITION_OP )
            	            // InternalPascal.g:1269:8: lv_operators_2_0= RULE_ADDITION_OP
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
            	            // InternalPascal.g:1286:6: ( (lv_operators_3_0= 'or' ) )
            	            {
            	            // InternalPascal.g:1286:6: ( (lv_operators_3_0= 'or' ) )
            	            // InternalPascal.g:1287:7: (lv_operators_3_0= 'or' )
            	            {
            	            // InternalPascal.g:1287:7: (lv_operators_3_0= 'or' )
            	            // InternalPascal.g:1288:8: lv_operators_3_0= 'or'
            	            {
            	            lv_operators_3_0=(Token)match(input,33,FOLLOW_12); if (state.failed) return current;
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

            	    // InternalPascal.g:1301:5: ( (lv_terms_4_0= ruleterm ) )
            	    // InternalPascal.g:1302:6: (lv_terms_4_0= ruleterm )
            	    {
            	    // InternalPascal.g:1302:6: (lv_terms_4_0= ruleterm )
            	    // InternalPascal.g:1303:7: lv_terms_4_0= ruleterm
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_2_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_17);
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
            	    // InternalPascal.g:1322:4: ( (lv_terms_5_0= ruleunsigned_number ) )
            	    {
            	    // InternalPascal.g:1322:4: ( (lv_terms_5_0= ruleunsigned_number ) )
            	    // InternalPascal.g:1323:5: (lv_terms_5_0= ruleunsigned_number )
            	    {
            	    // InternalPascal.g:1323:5: (lv_terms_5_0= ruleunsigned_number )
            	    // InternalPascal.g:1324:6: lv_terms_5_0= ruleunsigned_number
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsUnsigned_numberParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_17);
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
            	    break loop18;
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
    // InternalPascal.g:1346:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // InternalPascal.g:1346:45: (iv_ruleterm= ruleterm EOF )
            // InternalPascal.g:1347:2: iv_ruleterm= ruleterm EOF
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
    // InternalPascal.g:1353:1: ruleterm returns [EObject current=null] : ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        Token lv_operators_4_0=null;
        EObject lv_factors_0_0 = null;

        EObject lv_factors_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1359:2: ( ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* ) )
            // InternalPascal.g:1360:2: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* )
            {
            // InternalPascal.g:1360:2: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* )
            // InternalPascal.g:1361:3: ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )*
            {
            // InternalPascal.g:1361:3: ( (lv_factors_0_0= rulefactor ) )
            // InternalPascal.g:1362:4: (lv_factors_0_0= rulefactor )
            {
            // InternalPascal.g:1362:4: (lv_factors_0_0= rulefactor )
            // InternalPascal.g:1363:5: lv_factors_0_0= rulefactor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_18);
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

            // InternalPascal.g:1380:3: ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_MULTIPLICATION_OP||(LA20_0>=34 && LA20_0<=36)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPascal.g:1381:4: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) )
            	    {
            	    // InternalPascal.g:1381:4: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) )
            	    int alt19=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_MULTIPLICATION_OP:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt19=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // InternalPascal.g:1382:5: ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) )
            	            {
            	            // InternalPascal.g:1382:5: ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) )
            	            // InternalPascal.g:1383:6: (lv_operators_1_0= RULE_MULTIPLICATION_OP )
            	            {
            	            // InternalPascal.g:1383:6: (lv_operators_1_0= RULE_MULTIPLICATION_OP )
            	            // InternalPascal.g:1384:7: lv_operators_1_0= RULE_MULTIPLICATION_OP
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
            	            // InternalPascal.g:1401:5: ( (lv_operators_2_0= 'div' ) )
            	            {
            	            // InternalPascal.g:1401:5: ( (lv_operators_2_0= 'div' ) )
            	            // InternalPascal.g:1402:6: (lv_operators_2_0= 'div' )
            	            {
            	            // InternalPascal.g:1402:6: (lv_operators_2_0= 'div' )
            	            // InternalPascal.g:1403:7: lv_operators_2_0= 'div'
            	            {
            	            lv_operators_2_0=(Token)match(input,34,FOLLOW_12); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operators_2_0, grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getTermRule());
            	              							}
            	              							addWithLastConsumed(current, "operators", lv_operators_2_0, "div");
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalPascal.g:1416:5: ( (lv_operators_3_0= 'mod' ) )
            	            {
            	            // InternalPascal.g:1416:5: ( (lv_operators_3_0= 'mod' ) )
            	            // InternalPascal.g:1417:6: (lv_operators_3_0= 'mod' )
            	            {
            	            // InternalPascal.g:1417:6: (lv_operators_3_0= 'mod' )
            	            // InternalPascal.g:1418:7: lv_operators_3_0= 'mod'
            	            {
            	            lv_operators_3_0=(Token)match(input,35,FOLLOW_12); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operators_3_0, grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getTermRule());
            	              							}
            	              							addWithLastConsumed(current, "operators", lv_operators_3_0, "mod");
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalPascal.g:1431:5: ( (lv_operators_4_0= 'and' ) )
            	            {
            	            // InternalPascal.g:1431:5: ( (lv_operators_4_0= 'and' ) )
            	            // InternalPascal.g:1432:6: (lv_operators_4_0= 'and' )
            	            {
            	            // InternalPascal.g:1432:6: (lv_operators_4_0= 'and' )
            	            // InternalPascal.g:1433:7: lv_operators_4_0= 'and'
            	            {
            	            lv_operators_4_0=(Token)match(input,36,FOLLOW_12); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operators_4_0, grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getTermRule());
            	              							}
            	              							addWithLastConsumed(current, "operators", lv_operators_4_0, "and");
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalPascal.g:1446:4: ( (lv_factors_5_0= rulefactor ) )
            	    // InternalPascal.g:1447:5: (lv_factors_5_0= rulefactor )
            	    {
            	    // InternalPascal.g:1447:5: (lv_factors_5_0= rulefactor )
            	    // InternalPascal.g:1448:6: lv_factors_5_0= rulefactor
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_factors_5_0=rulefactor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTermRule());
            	      						}
            	      						add(
            	      							current,
            	      							"factors",
            	      							lv_factors_5_0,
            	      							"org.xtext.example.pascal.Pascal.factor");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalPascal.g:1470:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // InternalPascal.g:1470:47: (iv_rulefactor= rulefactor EOF )
            // InternalPascal.g:1471:2: iv_rulefactor= rulefactor EOF
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
    // InternalPascal.g:1477:1: rulefactor returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) ) ;
    public final EObject rulefactor() throws RecognitionException {
        EObject current = null;

        Token lv_string_2_0=null;
        Token lv_nil_4_0=null;
        Token lv_boolean_5_0=null;
        Token lv_boolean_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_variable_0_0 = null;

        EObject lv_number_1_0 = null;

        EObject lv_set_3_0 = null;

        EObject lv_function_7_0 = null;

        EObject lv_expression_9_0 = null;

        EObject lv_not_12_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1483:2: ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) ) )
            // InternalPascal.g:1484:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) )
            {
            // InternalPascal.g:1484:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) )
            int alt21=10;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalPascal.g:1485:3: ( (lv_variable_0_0= rulevariable ) )
                    {
                    // InternalPascal.g:1485:3: ( (lv_variable_0_0= rulevariable ) )
                    // InternalPascal.g:1486:4: (lv_variable_0_0= rulevariable )
                    {
                    // InternalPascal.g:1486:4: (lv_variable_0_0= rulevariable )
                    // InternalPascal.g:1487:5: lv_variable_0_0= rulevariable
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
                    // InternalPascal.g:1505:3: ( (lv_number_1_0= rulenumber ) )
                    {
                    // InternalPascal.g:1505:3: ( (lv_number_1_0= rulenumber ) )
                    // InternalPascal.g:1506:4: (lv_number_1_0= rulenumber )
                    {
                    // InternalPascal.g:1506:4: (lv_number_1_0= rulenumber )
                    // InternalPascal.g:1507:5: lv_number_1_0= rulenumber
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
                    // InternalPascal.g:1525:3: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalPascal.g:1525:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalPascal.g:1526:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalPascal.g:1526:4: (lv_string_2_0= RULE_STRING )
                    // InternalPascal.g:1527:5: lv_string_2_0= RULE_STRING
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
                    // InternalPascal.g:1544:3: ( (lv_set_3_0= ruleset ) )
                    {
                    // InternalPascal.g:1544:3: ( (lv_set_3_0= ruleset ) )
                    // InternalPascal.g:1545:4: (lv_set_3_0= ruleset )
                    {
                    // InternalPascal.g:1545:4: (lv_set_3_0= ruleset )
                    // InternalPascal.g:1546:5: lv_set_3_0= ruleset
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFactorAccess().getSetSetParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_set_3_0=ruleset();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFactorRule());
                      					}
                      					set(
                      						current,
                      						"set",
                      						lv_set_3_0,
                      						"org.xtext.example.pascal.Pascal.set");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:1564:3: ( (lv_nil_4_0= 'nil' ) )
                    {
                    // InternalPascal.g:1564:3: ( (lv_nil_4_0= 'nil' ) )
                    // InternalPascal.g:1565:4: (lv_nil_4_0= 'nil' )
                    {
                    // InternalPascal.g:1565:4: (lv_nil_4_0= 'nil' )
                    // InternalPascal.g:1566:5: lv_nil_4_0= 'nil'
                    {
                    lv_nil_4_0=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_nil_4_0, grammarAccess.getFactorAccess().getNilNilKeyword_4_0());
                      				
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
                case 6 :
                    // InternalPascal.g:1579:3: ( (lv_boolean_5_0= 'true' ) )
                    {
                    // InternalPascal.g:1579:3: ( (lv_boolean_5_0= 'true' ) )
                    // InternalPascal.g:1580:4: (lv_boolean_5_0= 'true' )
                    {
                    // InternalPascal.g:1580:4: (lv_boolean_5_0= 'true' )
                    // InternalPascal.g:1581:5: lv_boolean_5_0= 'true'
                    {
                    lv_boolean_5_0=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_boolean_5_0, grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFactorRule());
                      					}
                      					setWithLastConsumed(current, "boolean", lv_boolean_5_0, "true");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalPascal.g:1594:3: ( (lv_boolean_6_0= 'false' ) )
                    {
                    // InternalPascal.g:1594:3: ( (lv_boolean_6_0= 'false' ) )
                    // InternalPascal.g:1595:4: (lv_boolean_6_0= 'false' )
                    {
                    // InternalPascal.g:1595:4: (lv_boolean_6_0= 'false' )
                    // InternalPascal.g:1596:5: lv_boolean_6_0= 'false'
                    {
                    lv_boolean_6_0=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_boolean_6_0, grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFactorRule());
                      					}
                      					setWithLastConsumed(current, "boolean", lv_boolean_6_0, "false");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalPascal.g:1609:3: ( (lv_function_7_0= rulefunction_designator ) )
                    {
                    // InternalPascal.g:1609:3: ( (lv_function_7_0= rulefunction_designator ) )
                    // InternalPascal.g:1610:4: (lv_function_7_0= rulefunction_designator )
                    {
                    // InternalPascal.g:1610:4: (lv_function_7_0= rulefunction_designator )
                    // InternalPascal.g:1611:5: lv_function_7_0= rulefunction_designator
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFactorAccess().getFunctionFunction_designatorParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_function_7_0=rulefunction_designator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFactorRule());
                      					}
                      					set(
                      						current,
                      						"function",
                      						lv_function_7_0,
                      						"org.xtext.example.pascal.Pascal.function_designator");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalPascal.g:1629:3: (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' )
                    {
                    // InternalPascal.g:1629:3: (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' )
                    // InternalPascal.g:1630:4: otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,40,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_8_0());
                      			
                    }
                    // InternalPascal.g:1634:4: ( (lv_expression_9_0= ruleexpression ) )
                    // InternalPascal.g:1635:5: (lv_expression_9_0= ruleexpression )
                    {
                    // InternalPascal.g:1635:5: (lv_expression_9_0= ruleexpression )
                    // InternalPascal.g:1636:6: lv_expression_9_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_expression_9_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFactorRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_9_0,
                      							"org.xtext.example.pascal.Pascal.expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getFactorAccess().getRightParenthesisKeyword_8_2());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalPascal.g:1659:3: (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) )
                    {
                    // InternalPascal.g:1659:3: (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) )
                    // InternalPascal.g:1660:4: otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) )
                    {
                    otherlv_11=(Token)match(input,42,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getFactorAccess().getNotKeyword_9_0());
                      			
                    }
                    // InternalPascal.g:1664:4: ( (lv_not_12_0= rulefactor ) )
                    // InternalPascal.g:1665:5: (lv_not_12_0= rulefactor )
                    {
                    // InternalPascal.g:1665:5: (lv_not_12_0= rulefactor )
                    // InternalPascal.g:1666:6: lv_not_12_0= rulefactor
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFactorAccess().getNotFactorParserRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_not_12_0=rulefactor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFactorRule());
                      						}
                      						set(
                      							current,
                      							"not",
                      							lv_not_12_0,
                      							"org.xtext.example.pascal.Pascal.factor");
                      						afterParserOrEnumRuleCall();
                      					
                    }

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
    // InternalPascal.g:1688:1: entryRulefunction_designator returns [EObject current=null] : iv_rulefunction_designator= rulefunction_designator EOF ;
    public final EObject entryRulefunction_designator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_designator = null;


        try {
            // InternalPascal.g:1688:60: (iv_rulefunction_designator= rulefunction_designator EOF )
            // InternalPascal.g:1689:2: iv_rulefunction_designator= rulefunction_designator EOF
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
    // InternalPascal.g:1695:1: rulefunction_designator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' ) ;
    public final EObject rulefunction_designator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1701:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' ) )
            // InternalPascal.g:1702:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' )
            {
            // InternalPascal.g:1702:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' )
            // InternalPascal.g:1703:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')'
            {
            // InternalPascal.g:1703:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:1704:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:1704:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:1705:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,40,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalPascal.g:1725:3: ( (lv_expressions_2_0= ruleexpression_list ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_INTEGER_NUMBER)||LA22_0==RULE_ADDITION_OP||LA22_0==RULE_STRING||(LA22_0>=RULE_SIGNED_REAL_NUMBER && LA22_0<=RULE_REAL_NUMBER)||LA22_0==27||(LA22_0>=37 && LA22_0<=40)||LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPascal.g:1726:4: (lv_expressions_2_0= ruleexpression_list )
                    {
                    // InternalPascal.g:1726:4: (lv_expressions_2_0= ruleexpression_list )
                    // InternalPascal.g:1727:5: lv_expressions_2_0= ruleexpression_list
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFunction_designatorAccess().getExpressionsExpression_listParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_19);
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

            otherlv_3=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:1752:1: entryRulefunction_procedure_declaration returns [EObject current=null] : iv_rulefunction_procedure_declaration= rulefunction_procedure_declaration EOF ;
    public final EObject entryRulefunction_procedure_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_procedure_declaration = null;


        try {
            // InternalPascal.g:1752:71: (iv_rulefunction_procedure_declaration= rulefunction_procedure_declaration EOF )
            // InternalPascal.g:1753:2: iv_rulefunction_procedure_declaration= rulefunction_procedure_declaration EOF
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
    // InternalPascal.g:1759:1: rulefunction_procedure_declaration returns [EObject current=null] : ( ( ( (lv_procedures_0_0= rulefunction_declaration ) ) | ( (lv_functions_1_0= ruleprocedure_declaration ) ) ) otherlv_2= ';' )+ ;
    public final EObject rulefunction_procedure_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_procedures_0_0 = null;

        EObject lv_functions_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1765:2: ( ( ( ( (lv_procedures_0_0= rulefunction_declaration ) ) | ( (lv_functions_1_0= ruleprocedure_declaration ) ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:1766:2: ( ( ( (lv_procedures_0_0= rulefunction_declaration ) ) | ( (lv_functions_1_0= ruleprocedure_declaration ) ) ) otherlv_2= ';' )+
            {
            // InternalPascal.g:1766:2: ( ( ( (lv_procedures_0_0= rulefunction_declaration ) ) | ( (lv_functions_1_0= ruleprocedure_declaration ) ) ) otherlv_2= ';' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==43||LA24_0==45) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPascal.g:1767:3: ( ( (lv_procedures_0_0= rulefunction_declaration ) ) | ( (lv_functions_1_0= ruleprocedure_declaration ) ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:1767:3: ( ( (lv_procedures_0_0= rulefunction_declaration ) ) | ( (lv_functions_1_0= ruleprocedure_declaration ) ) )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==43) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==45) ) {
            	        alt23=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalPascal.g:1768:4: ( (lv_procedures_0_0= rulefunction_declaration ) )
            	            {
            	            // InternalPascal.g:1768:4: ( (lv_procedures_0_0= rulefunction_declaration ) )
            	            // InternalPascal.g:1769:5: (lv_procedures_0_0= rulefunction_declaration )
            	            {
            	            // InternalPascal.g:1769:5: (lv_procedures_0_0= rulefunction_declaration )
            	            // InternalPascal.g:1770:6: lv_procedures_0_0= rulefunction_declaration
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getFunction_procedure_declarationAccess().getProceduresFunction_declarationParserRuleCall_0_0_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_6);
            	            lv_procedures_0_0=rulefunction_declaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getFunction_procedure_declarationRule());
            	              						}
            	              						add(
            	              							current,
            	              							"procedures",
            	              							lv_procedures_0_0,
            	              							"org.xtext.example.pascal.Pascal.function_declaration");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPascal.g:1788:4: ( (lv_functions_1_0= ruleprocedure_declaration ) )
            	            {
            	            // InternalPascal.g:1788:4: ( (lv_functions_1_0= ruleprocedure_declaration ) )
            	            // InternalPascal.g:1789:5: (lv_functions_1_0= ruleprocedure_declaration )
            	            {
            	            // InternalPascal.g:1789:5: (lv_functions_1_0= ruleprocedure_declaration )
            	            // InternalPascal.g:1790:6: lv_functions_1_0= ruleprocedure_declaration
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getFunction_procedure_declarationAccess().getFunctionsProcedure_declarationParserRuleCall_0_1_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_6);
            	            lv_functions_1_0=ruleprocedure_declaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getFunction_procedure_declarationRule());
            	              						}
            	              						add(
            	              							current,
            	              							"functions",
            	              							lv_functions_1_0,
            	              							"org.xtext.example.pascal.Pascal.procedure_declaration");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(otherlv_2, grammarAccess.getFunction_procedure_declarationAccess().getSemicolonKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
    // InternalPascal.g:1816:1: entryRulefunction_heading returns [EObject current=null] : iv_rulefunction_heading= rulefunction_heading EOF ;
    public final EObject entryRulefunction_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_heading = null;


        try {
            // InternalPascal.g:1816:57: (iv_rulefunction_heading= rulefunction_heading EOF )
            // InternalPascal.g:1817:2: iv_rulefunction_heading= rulefunction_heading EOF
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
    // InternalPascal.g:1823:1: rulefunction_heading returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) ) ;
    public final EObject rulefunction_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_returnType_4_0=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1829:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) ) )
            // InternalPascal.g:1830:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) )
            {
            // InternalPascal.g:1830:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) )
            // InternalPascal.g:1831:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunction_headingAccess().getFunctionKeyword_0());
              		
            }
            // InternalPascal.g:1835:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:1836:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:1836:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:1837:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
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

            // InternalPascal.g:1853:3: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPascal.g:1854:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:1854:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:1855:5: lv_parameters_2_0= ruleformal_parameter_list
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

            otherlv_3=(Token)match(input,25,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFunction_headingAccess().getColonKeyword_3());
              		
            }
            // InternalPascal.g:1876:3: ( (lv_returnType_4_0= RULE_ID ) )
            // InternalPascal.g:1877:4: (lv_returnType_4_0= RULE_ID )
            {
            // InternalPascal.g:1877:4: (lv_returnType_4_0= RULE_ID )
            // InternalPascal.g:1878:5: lv_returnType_4_0= RULE_ID
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
    // InternalPascal.g:1898:1: entryRulefunction_declaration returns [EObject current=null] : iv_rulefunction_declaration= rulefunction_declaration EOF ;
    public final EObject entryRulefunction_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_declaration = null;


        try {
            // InternalPascal.g:1898:61: (iv_rulefunction_declaration= rulefunction_declaration EOF )
            // InternalPascal.g:1899:2: iv_rulefunction_declaration= rulefunction_declaration EOF
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
    // InternalPascal.g:1905:1: rulefunction_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) ) ;
    public final EObject rulefunction_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1911:2: ( ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) ) )
            // InternalPascal.g:1912:2: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) )
            {
            // InternalPascal.g:1912:2: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) )
            // InternalPascal.g:1913:3: ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) )
            {
            // InternalPascal.g:1913:3: ( (lv_heading_0_0= rulefunction_heading ) )
            // InternalPascal.g:1914:4: (lv_heading_0_0= rulefunction_heading )
            {
            // InternalPascal.g:1914:4: (lv_heading_0_0= rulefunction_heading )
            // InternalPascal.g:1915:5: lv_heading_0_0= rulefunction_heading
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

            otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_1());
              		
            }
            // InternalPascal.g:1936:3: ( (lv_block_2_0= ruleblock ) )
            // InternalPascal.g:1937:4: (lv_block_2_0= ruleblock )
            {
            // InternalPascal.g:1937:4: (lv_block_2_0= ruleblock )
            // InternalPascal.g:1938:5: lv_block_2_0= ruleblock
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


    // $ANTLR start "entryRuleformal_parameter_list"
    // InternalPascal.g:1959:1: entryRuleformal_parameter_list returns [EObject current=null] : iv_ruleformal_parameter_list= ruleformal_parameter_list EOF ;
    public final EObject entryRuleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_list = null;


        try {
            // InternalPascal.g:1959:62: (iv_ruleformal_parameter_list= ruleformal_parameter_list EOF )
            // InternalPascal.g:1960:2: iv_ruleformal_parameter_list= ruleformal_parameter_list EOF
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
    // InternalPascal.g:1966:1: ruleformal_parameter_list returns [EObject current=null] : (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1972:2: ( (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) )
            // InternalPascal.g:1973:2: (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            {
            // InternalPascal.g:1973:2: (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            // InternalPascal.g:1974:3: otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalPascal.g:1978:3: ( (lv_parameters_1_0= ruleformal_parameter_section ) )
            // InternalPascal.g:1979:4: (lv_parameters_1_0= ruleformal_parameter_section )
            {
            // InternalPascal.g:1979:4: (lv_parameters_1_0= ruleformal_parameter_section )
            // InternalPascal.g:1980:5: lv_parameters_1_0= ruleformal_parameter_section
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_25);
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

            // InternalPascal.g:1997:3: (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==22) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPascal.g:1998:4: otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0());
            	      			
            	    }
            	    // InternalPascal.g:2002:4: ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    // InternalPascal.g:2003:5: (lv_parameters_3_0= ruleformal_parameter_section )
            	    {
            	    // InternalPascal.g:2003:5: (lv_parameters_3_0= ruleformal_parameter_section )
            	    // InternalPascal.g:2004:6: lv_parameters_3_0= ruleformal_parameter_section
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
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

            otherlv_4=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:2030:1: entryRuleformal_parameter_section returns [EObject current=null] : iv_ruleformal_parameter_section= ruleformal_parameter_section EOF ;
    public final EObject entryRuleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_section = null;


        try {
            // InternalPascal.g:2030:65: (iv_ruleformal_parameter_section= ruleformal_parameter_section EOF )
            // InternalPascal.g:2031:2: iv_ruleformal_parameter_section= ruleformal_parameter_section EOF
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
    // InternalPascal.g:2037:1: ruleformal_parameter_section returns [EObject current=null] : ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) ;
    public final EObject ruleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_procedure_2_0 = null;

        EObject lv_function_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2043:2: ( ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) )
            // InternalPascal.g:2044:2: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            {
            // InternalPascal.g:2044:2: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt27=1;
                }
                break;
            case 44:
                {
                alt27=2;
                }
                break;
            case 45:
                {
                alt27=3;
                }
                break;
            case 43:
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
                    // InternalPascal.g:2045:3: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    {
                    // InternalPascal.g:2045:3: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    // InternalPascal.g:2046:4: (lv_value_0_0= rulevalue_parameter_section )
                    {
                    // InternalPascal.g:2046:4: (lv_value_0_0= rulevalue_parameter_section )
                    // InternalPascal.g:2047:5: lv_value_0_0= rulevalue_parameter_section
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
                    // InternalPascal.g:2065:3: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    {
                    // InternalPascal.g:2065:3: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    // InternalPascal.g:2066:4: (lv_variable_1_0= rulevariable_parameter_section )
                    {
                    // InternalPascal.g:2066:4: (lv_variable_1_0= rulevariable_parameter_section )
                    // InternalPascal.g:2067:5: lv_variable_1_0= rulevariable_parameter_section
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
                    // InternalPascal.g:2085:3: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    {
                    // InternalPascal.g:2085:3: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    // InternalPascal.g:2086:4: (lv_procedure_2_0= ruleprocedure_heading )
                    {
                    // InternalPascal.g:2086:4: (lv_procedure_2_0= ruleprocedure_heading )
                    // InternalPascal.g:2087:5: lv_procedure_2_0= ruleprocedure_heading
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
                    // InternalPascal.g:2105:3: ( (lv_function_3_0= rulefunction_heading ) )
                    {
                    // InternalPascal.g:2105:3: ( (lv_function_3_0= rulefunction_heading ) )
                    // InternalPascal.g:2106:4: (lv_function_3_0= rulefunction_heading )
                    {
                    // InternalPascal.g:2106:4: (lv_function_3_0= rulefunction_heading )
                    // InternalPascal.g:2107:5: lv_function_3_0= rulefunction_heading
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
    // InternalPascal.g:2128:1: entryRulevalue_parameter_section returns [EObject current=null] : iv_rulevalue_parameter_section= rulevalue_parameter_section EOF ;
    public final EObject entryRulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalue_parameter_section = null;


        try {
            // InternalPascal.g:2128:64: (iv_rulevalue_parameter_section= rulevalue_parameter_section EOF )
            // InternalPascal.g:2129:2: iv_rulevalue_parameter_section= rulevalue_parameter_section EOF
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
    // InternalPascal.g:2135:1: rulevalue_parameter_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) ) ;
    public final EObject rulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2141:2: ( ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:2142:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:2142:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) )
            // InternalPascal.g:2143:3: ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) )
            {
            // InternalPascal.g:2143:3: ( (lv_identifiers_0_0= ruleidentifier_list ) )
            // InternalPascal.g:2144:4: (lv_identifiers_0_0= ruleidentifier_list )
            {
            // InternalPascal.g:2144:4: (lv_identifiers_0_0= ruleidentifier_list )
            // InternalPascal.g:2145:5: lv_identifiers_0_0= ruleidentifier_list
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

            otherlv_1=(Token)match(input,25,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1());
              		
            }
            // InternalPascal.g:2166:3: ( (lv_type_2_0= ruleparameter_type ) )
            // InternalPascal.g:2167:4: (lv_type_2_0= ruleparameter_type )
            {
            // InternalPascal.g:2167:4: (lv_type_2_0= ruleparameter_type )
            // InternalPascal.g:2168:5: lv_type_2_0= ruleparameter_type
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
    // InternalPascal.g:2189:1: entryRuleidentifier_list returns [EObject current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final EObject entryRuleidentifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifier_list = null;


        try {
            // InternalPascal.g:2189:56: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // InternalPascal.g:2190:2: iv_ruleidentifier_list= ruleidentifier_list EOF
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
    // InternalPascal.g:2196:1: ruleidentifier_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleidentifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;


        	enterRule();

        try {
            // InternalPascal.g:2202:2: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // InternalPascal.g:2203:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // InternalPascal.g:2203:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            // InternalPascal.g:2204:3: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // InternalPascal.g:2204:3: ( (lv_names_0_0= RULE_ID ) )
            // InternalPascal.g:2205:4: (lv_names_0_0= RULE_ID )
            {
            // InternalPascal.g:2205:4: (lv_names_0_0= RULE_ID )
            // InternalPascal.g:2206:5: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
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

            // InternalPascal.g:2222:3: (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==30) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPascal.g:2223:4: otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:2227:4: ( (lv_names_2_0= RULE_ID ) )
            	    // InternalPascal.g:2228:5: (lv_names_2_0= RULE_ID )
            	    {
            	    // InternalPascal.g:2228:5: (lv_names_2_0= RULE_ID )
            	    // InternalPascal.g:2229:6: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
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
    // InternalPascal.g:2250:1: entryRuleparameter_type returns [EObject current=null] : iv_ruleparameter_type= ruleparameter_type EOF ;
    public final EObject entryRuleparameter_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_type = null;


        try {
            // InternalPascal.g:2250:55: (iv_ruleparameter_type= ruleparameter_type EOF )
            // InternalPascal.g:2251:2: iv_ruleparameter_type= ruleparameter_type EOF
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
    // InternalPascal.g:2257:1: ruleparameter_type returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleparameter_type() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPascal.g:2263:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPascal.g:2264:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPascal.g:2264:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:2265:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:2265:3: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:2266:4: lv_name_0_0= RULE_ID
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
    // InternalPascal.g:2285:1: entryRulevariable_parameter_section returns [EObject current=null] : iv_rulevariable_parameter_section= rulevariable_parameter_section EOF ;
    public final EObject entryRulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_parameter_section = null;


        try {
            // InternalPascal.g:2285:67: (iv_rulevariable_parameter_section= rulevariable_parameter_section EOF )
            // InternalPascal.g:2286:2: iv_rulevariable_parameter_section= rulevariable_parameter_section EOF
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
    // InternalPascal.g:2292:1: rulevariable_parameter_section returns [EObject current=null] : (otherlv_0= 'var' ( (lv_indentifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) ) ;
    public final EObject rulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_indentifiers_1_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2298:2: ( (otherlv_0= 'var' ( (lv_indentifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:2299:2: (otherlv_0= 'var' ( (lv_indentifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:2299:2: (otherlv_0= 'var' ( (lv_indentifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) )
            // InternalPascal.g:2300:3: otherlv_0= 'var' ( (lv_indentifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0());
              		
            }
            // InternalPascal.g:2304:3: ( (lv_indentifiers_1_0= ruleidentifier_list ) )
            // InternalPascal.g:2305:4: (lv_indentifiers_1_0= ruleidentifier_list )
            {
            // InternalPascal.g:2305:4: (lv_indentifiers_1_0= ruleidentifier_list )
            // InternalPascal.g:2306:5: lv_indentifiers_1_0= ruleidentifier_list
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

            otherlv_2=(Token)match(input,25,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2());
              		
            }
            // InternalPascal.g:2327:3: ( (lv_type_3_0= ruleparameter_type ) )
            // InternalPascal.g:2328:4: (lv_type_3_0= ruleparameter_type )
            {
            // InternalPascal.g:2328:4: (lv_type_3_0= ruleparameter_type )
            // InternalPascal.g:2329:5: lv_type_3_0= ruleparameter_type
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


    // $ANTLR start "entryRuleprocedure_declaration"
    // InternalPascal.g:2350:1: entryRuleprocedure_declaration returns [EObject current=null] : iv_ruleprocedure_declaration= ruleprocedure_declaration EOF ;
    public final EObject entryRuleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_declaration = null;


        try {
            // InternalPascal.g:2350:62: (iv_ruleprocedure_declaration= ruleprocedure_declaration EOF )
            // InternalPascal.g:2351:2: iv_ruleprocedure_declaration= ruleprocedure_declaration EOF
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
    // InternalPascal.g:2357:1: ruleprocedure_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) ) ;
    public final EObject ruleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2363:2: ( ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) ) )
            // InternalPascal.g:2364:2: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) )
            {
            // InternalPascal.g:2364:2: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) )
            // InternalPascal.g:2365:3: ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) )
            {
            // InternalPascal.g:2365:3: ( (lv_heading_0_0= ruleprocedure_heading ) )
            // InternalPascal.g:2366:4: (lv_heading_0_0= ruleprocedure_heading )
            {
            // InternalPascal.g:2366:4: (lv_heading_0_0= ruleprocedure_heading )
            // InternalPascal.g:2367:5: lv_heading_0_0= ruleprocedure_heading
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

            otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_1());
              		
            }
            // InternalPascal.g:2388:3: ( (lv_block_2_0= ruleblock ) )
            // InternalPascal.g:2389:4: (lv_block_2_0= ruleblock )
            {
            // InternalPascal.g:2389:4: (lv_block_2_0= ruleblock )
            // InternalPascal.g:2390:5: lv_block_2_0= ruleblock
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
    // InternalPascal.g:2411:1: entryRuleprocedure_heading returns [EObject current=null] : iv_ruleprocedure_heading= ruleprocedure_heading EOF ;
    public final EObject entryRuleprocedure_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_heading = null;


        try {
            // InternalPascal.g:2411:58: (iv_ruleprocedure_heading= ruleprocedure_heading EOF )
            // InternalPascal.g:2412:2: iv_ruleprocedure_heading= ruleprocedure_heading EOF
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
    // InternalPascal.g:2418:1: ruleprocedure_heading returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) ;
    public final EObject ruleprocedure_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2424:2: ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) )
            // InternalPascal.g:2425:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            {
            // InternalPascal.g:2425:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            // InternalPascal.g:2426:3: otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0());
              		
            }
            // InternalPascal.g:2430:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:2431:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:2431:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:2432:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
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

            // InternalPascal.g:2448:3: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPascal.g:2449:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:2449:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:2450:5: lv_parameters_2_0= ruleformal_parameter_list
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


    // $ANTLR start "entryRuleset"
    // InternalPascal.g:2471:1: entryRuleset returns [EObject current=null] : iv_ruleset= ruleset EOF ;
    public final EObject entryRuleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset = null;


        try {
            // InternalPascal.g:2471:44: (iv_ruleset= ruleset EOF )
            // InternalPascal.g:2472:2: iv_ruleset= ruleset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleset=ruleset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleset; 
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
    // $ANTLR end "entryRuleset"


    // $ANTLR start "ruleset"
    // InternalPascal.g:2478:1: ruleset returns [EObject current=null] : ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) ) ;
    public final EObject ruleset() throws RecognitionException {
        EObject current = null;

        Token lv_brackets_0_0=null;
        Token lv_brackets_2_0=null;
        EObject lv_expressions_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2484:2: ( ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) ) )
            // InternalPascal.g:2485:2: ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) )
            {
            // InternalPascal.g:2485:2: ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) )
            // InternalPascal.g:2486:3: ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) )
            {
            // InternalPascal.g:2486:3: ( (lv_brackets_0_0= '[' ) )
            // InternalPascal.g:2487:4: (lv_brackets_0_0= '[' )
            {
            // InternalPascal.g:2487:4: (lv_brackets_0_0= '[' )
            // InternalPascal.g:2488:5: lv_brackets_0_0= '['
            {
            lv_brackets_0_0=(Token)match(input,27,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_brackets_0_0, grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSetRule());
              					}
              					addWithLastConsumed(current, "brackets", lv_brackets_0_0, "[");
              				
            }

            }


            }

            // InternalPascal.g:2500:3: ( (lv_expressions_1_0= ruleexpression_list ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_INTEGER_NUMBER)||LA30_0==RULE_ADDITION_OP||LA30_0==RULE_STRING||(LA30_0>=RULE_SIGNED_REAL_NUMBER && LA30_0<=RULE_REAL_NUMBER)||LA30_0==27||(LA30_0>=37 && LA30_0<=40)||LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPascal.g:2501:4: (lv_expressions_1_0= ruleexpression_list )
                    {
                    // InternalPascal.g:2501:4: (lv_expressions_1_0= ruleexpression_list )
                    // InternalPascal.g:2502:5: lv_expressions_1_0= ruleexpression_list
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSetAccess().getExpressionsExpression_listParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
                    lv_expressions_1_0=ruleexpression_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSetRule());
                      					}
                      					set(
                      						current,
                      						"expressions",
                      						lv_expressions_1_0,
                      						"org.xtext.example.pascal.Pascal.expression_list");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPascal.g:2519:3: ( (lv_brackets_2_0= ']' ) )
            // InternalPascal.g:2520:4: (lv_brackets_2_0= ']' )
            {
            // InternalPascal.g:2520:4: (lv_brackets_2_0= ']' )
            // InternalPascal.g:2521:5: lv_brackets_2_0= ']'
            {
            lv_brackets_2_0=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_brackets_2_0, grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSetRule());
              					}
              					addWithLastConsumed(current, "brackets", lv_brackets_2_0, "]");
              				
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
    // $ANTLR end "ruleset"


    // $ANTLR start "entryRulenumber"
    // InternalPascal.g:2537:1: entryRulenumber returns [EObject current=null] : iv_rulenumber= rulenumber EOF ;
    public final EObject entryRulenumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumber = null;


        try {
            // InternalPascal.g:2537:47: (iv_rulenumber= rulenumber EOF )
            // InternalPascal.g:2538:2: iv_rulenumber= rulenumber EOF
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
    // InternalPascal.g:2544:1: rulenumber returns [EObject current=null] : ( (lv_number_0_0= ruleany_number ) ) ;
    public final EObject rulenumber() throws RecognitionException {
        EObject current = null;

        EObject lv_number_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2550:2: ( ( (lv_number_0_0= ruleany_number ) ) )
            // InternalPascal.g:2551:2: ( (lv_number_0_0= ruleany_number ) )
            {
            // InternalPascal.g:2551:2: ( (lv_number_0_0= ruleany_number ) )
            // InternalPascal.g:2552:3: (lv_number_0_0= ruleany_number )
            {
            // InternalPascal.g:2552:3: (lv_number_0_0= ruleany_number )
            // InternalPascal.g:2553:4: lv_number_0_0= ruleany_number
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
    // InternalPascal.g:2573:1: entryRuleany_number returns [EObject current=null] : iv_ruleany_number= ruleany_number EOF ;
    public final EObject entryRuleany_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleany_number = null;


        try {
            // InternalPascal.g:2573:51: (iv_ruleany_number= ruleany_number EOF )
            // InternalPascal.g:2574:2: iv_ruleany_number= ruleany_number EOF
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
    // InternalPascal.g:2580:1: ruleany_number returns [EObject current=null] : (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) ;
    public final EObject ruleany_number() throws RecognitionException {
        EObject current = null;

        EObject this_unsigned_number_0 = null;

        EObject this_signed_number_1 = null;



        	enterRule();

        try {
            // InternalPascal.g:2586:2: ( (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) )
            // InternalPascal.g:2587:2: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            {
            // InternalPascal.g:2587:2: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INTEGER_NUMBER||LA31_0==RULE_REAL_NUMBER) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_SIGNED_INTEGER_NUMBER||LA31_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalPascal.g:2588:3: this_unsigned_number_0= ruleunsigned_number
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
                    // InternalPascal.g:2600:3: this_signed_number_1= rulesigned_number
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
    // InternalPascal.g:2615:1: entryRulelabel_declaration returns [EObject current=null] : iv_rulelabel_declaration= rulelabel_declaration EOF ;
    public final EObject entryRulelabel_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel_declaration = null;


        try {
            // InternalPascal.g:2615:58: (iv_rulelabel_declaration= rulelabel_declaration EOF )
            // InternalPascal.g:2616:2: iv_rulelabel_declaration= rulelabel_declaration EOF
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
    // InternalPascal.g:2622:1: rulelabel_declaration returns [EObject current=null] : (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' ) ;
    public final EObject rulelabel_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_labels_1_0 = null;

        EObject lv_labels_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2628:2: ( (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' ) )
            // InternalPascal.g:2629:2: (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' )
            {
            // InternalPascal.g:2629:2: (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' )
            // InternalPascal.g:2630:3: otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLabel_declarationAccess().getLabelKeyword_0());
              		
            }
            // InternalPascal.g:2634:3: ( (lv_labels_1_0= rulelabel ) )
            // InternalPascal.g:2635:4: (lv_labels_1_0= rulelabel )
            {
            // InternalPascal.g:2635:4: (lv_labels_1_0= rulelabel )
            // InternalPascal.g:2636:5: lv_labels_1_0= rulelabel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLabel_declarationAccess().getLabelsLabelParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            // InternalPascal.g:2653:3: (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==30) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPascal.g:2654:4: otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getLabel_declarationAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalPascal.g:2658:4: ( (lv_labels_3_0= rulelabel ) )
            	    // InternalPascal.g:2659:5: (lv_labels_3_0= rulelabel )
            	    {
            	    // InternalPascal.g:2659:5: (lv_labels_3_0= rulelabel )
            	    // InternalPascal.g:2660:6: lv_labels_3_0= rulelabel
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLabel_declarationAccess().getLabelsLabelParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    break loop32;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:2686:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // InternalPascal.g:2686:49: (iv_ruleconstant= ruleconstant EOF )
            // InternalPascal.g:2687:2: iv_ruleconstant= ruleconstant EOF
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
    // InternalPascal.g:2693:1: ruleconstant returns [EObject current=null] : ( ( ( (lv_opterator_0_0= RULE_ADDITION_OP ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) ) ;
    public final EObject ruleconstant() throws RecognitionException {
        EObject current = null;

        Token lv_opterator_0_0=null;
        Token lv_name_1_0=null;
        Token lv_string_3_0=null;
        Token lv_boolLiteral_4_0=null;
        Token lv_boolLiteral_5_0=null;
        EObject lv_number_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2699:2: ( ( ( ( (lv_opterator_0_0= RULE_ADDITION_OP ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) ) )
            // InternalPascal.g:2700:2: ( ( ( (lv_opterator_0_0= RULE_ADDITION_OP ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) )
            {
            // InternalPascal.g:2700:2: ( ( ( (lv_opterator_0_0= RULE_ADDITION_OP ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OP:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_REAL_NUMBER:
                {
                alt35=1;
                }
                break;
            case RULE_STRING:
                {
                alt35=2;
                }
                break;
            case 38:
                {
                alt35=3;
                }
                break;
            case 39:
                {
                alt35=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalPascal.g:2701:3: ( ( (lv_opterator_0_0= RULE_ADDITION_OP ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    {
                    // InternalPascal.g:2701:3: ( ( (lv_opterator_0_0= RULE_ADDITION_OP ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    // InternalPascal.g:2702:4: ( (lv_opterator_0_0= RULE_ADDITION_OP ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    {
                    // InternalPascal.g:2702:4: ( (lv_opterator_0_0= RULE_ADDITION_OP ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ADDITION_OP) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalPascal.g:2703:5: (lv_opterator_0_0= RULE_ADDITION_OP )
                            {
                            // InternalPascal.g:2703:5: (lv_opterator_0_0= RULE_ADDITION_OP )
                            // InternalPascal.g:2704:6: lv_opterator_0_0= RULE_ADDITION_OP
                            {
                            lv_opterator_0_0=(Token)match(input,RULE_ADDITION_OP,FOLLOW_30); if (state.failed) return current;
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

                    // InternalPascal.g:2720:4: ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_ID) ) {
                        alt34=1;
                    }
                    else if ( ((LA34_0>=RULE_SIGNED_INTEGER_NUMBER && LA34_0<=RULE_INTEGER_NUMBER)||(LA34_0>=RULE_SIGNED_REAL_NUMBER && LA34_0<=RULE_REAL_NUMBER)) ) {
                        alt34=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalPascal.g:2721:5: ( (lv_name_1_0= RULE_ID ) )
                            {
                            // InternalPascal.g:2721:5: ( (lv_name_1_0= RULE_ID ) )
                            // InternalPascal.g:2722:6: (lv_name_1_0= RULE_ID )
                            {
                            // InternalPascal.g:2722:6: (lv_name_1_0= RULE_ID )
                            // InternalPascal.g:2723:7: lv_name_1_0= RULE_ID
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
                            // InternalPascal.g:2740:5: ( (lv_number_2_0= rulenumber ) )
                            {
                            // InternalPascal.g:2740:5: ( (lv_number_2_0= rulenumber ) )
                            // InternalPascal.g:2741:6: (lv_number_2_0= rulenumber )
                            {
                            // InternalPascal.g:2741:6: (lv_number_2_0= rulenumber )
                            // InternalPascal.g:2742:7: lv_number_2_0= rulenumber
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
                    // InternalPascal.g:2762:3: ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // InternalPascal.g:2762:3: ( (lv_string_3_0= RULE_STRING ) )
                    // InternalPascal.g:2763:4: (lv_string_3_0= RULE_STRING )
                    {
                    // InternalPascal.g:2763:4: (lv_string_3_0= RULE_STRING )
                    // InternalPascal.g:2764:5: lv_string_3_0= RULE_STRING
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
                    // InternalPascal.g:2781:3: ( (lv_boolLiteral_4_0= 'true' ) )
                    {
                    // InternalPascal.g:2781:3: ( (lv_boolLiteral_4_0= 'true' ) )
                    // InternalPascal.g:2782:4: (lv_boolLiteral_4_0= 'true' )
                    {
                    // InternalPascal.g:2782:4: (lv_boolLiteral_4_0= 'true' )
                    // InternalPascal.g:2783:5: lv_boolLiteral_4_0= 'true'
                    {
                    lv_boolLiteral_4_0=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
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
                    // InternalPascal.g:2796:3: ( (lv_boolLiteral_5_0= 'false' ) )
                    {
                    // InternalPascal.g:2796:3: ( (lv_boolLiteral_5_0= 'false' ) )
                    // InternalPascal.g:2797:4: (lv_boolLiteral_5_0= 'false' )
                    {
                    // InternalPascal.g:2797:4: (lv_boolLiteral_5_0= 'false' )
                    // InternalPascal.g:2798:5: lv_boolLiteral_5_0= 'false'
                    {
                    lv_boolLiteral_5_0=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:2814:1: entryRuleconstant_definition_part returns [EObject current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final EObject entryRuleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition_part = null;


        try {
            // InternalPascal.g:2814:65: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // InternalPascal.g:2815:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
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
    // InternalPascal.g:2821:1: ruleconstant_definition_part returns [EObject current=null] : (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_consts_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2827:2: ( (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ ) )
            // InternalPascal.g:2828:2: (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ )
            {
            // InternalPascal.g:2828:2: (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:2829:3: otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,47,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstant_definition_partAccess().getConstKeyword_0());
              		
            }
            // InternalPascal.g:2833:3: ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPascal.g:2834:4: ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:2834:4: ( (lv_consts_1_0= ruleconstant_definition ) )
            	    // InternalPascal.g:2835:5: (lv_consts_1_0= ruleconstant_definition )
            	    {
            	    // InternalPascal.g:2835:5: (lv_consts_1_0= ruleconstant_definition )
            	    // InternalPascal.g:2836:6: lv_consts_1_0= ruleconstant_definition
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

            	    otherlv_2=(Token)match(input,22,FOLLOW_31); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
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
    // InternalPascal.g:2862:1: entryRuleconstant_definition returns [EObject current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final EObject entryRuleconstant_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition = null;


        try {
            // InternalPascal.g:2862:60: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // InternalPascal.g:2863:2: iv_ruleconstant_definition= ruleconstant_definition EOF
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
    // InternalPascal.g:2869:1: ruleconstant_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) ) ;
    public final EObject ruleconstant_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_const_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2875:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) ) )
            // InternalPascal.g:2876:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) )
            {
            // InternalPascal.g:2876:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) )
            // InternalPascal.g:2877:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) )
            {
            // InternalPascal.g:2877:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:2878:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:2878:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:2879:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,32,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalPascal.g:2899:3: ( (lv_const_2_0= ruleconstant ) )
            // InternalPascal.g:2900:4: (lv_const_2_0= ruleconstant )
            {
            // InternalPascal.g:2900:4: (lv_const_2_0= ruleconstant )
            // InternalPascal.g:2901:5: lv_const_2_0= ruleconstant
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
    // InternalPascal.g:2922:1: entryRuletype_definition_part returns [EObject current=null] : iv_ruletype_definition_part= ruletype_definition_part EOF ;
    public final EObject entryRuletype_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition_part = null;


        try {
            // InternalPascal.g:2922:61: (iv_ruletype_definition_part= ruletype_definition_part EOF )
            // InternalPascal.g:2923:2: iv_ruletype_definition_part= ruletype_definition_part EOF
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
    // InternalPascal.g:2929:1: ruletype_definition_part returns [EObject current=null] : (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruletype_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2935:2: ( (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ ) )
            // InternalPascal.g:2936:2: (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ )
            {
            // InternalPascal.g:2936:2: (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:2937:3: otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,48,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getType_definition_partAccess().getTypeKeyword_0());
              		
            }
            // InternalPascal.g:2941:3: ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPascal.g:2942:4: ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:2942:4: ( (lv_types_1_0= ruletype_definition ) )
            	    // InternalPascal.g:2943:5: (lv_types_1_0= ruletype_definition )
            	    {
            	    // InternalPascal.g:2943:5: (lv_types_1_0= ruletype_definition )
            	    // InternalPascal.g:2944:6: lv_types_1_0= ruletype_definition
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

            	    otherlv_2=(Token)match(input,22,FOLLOW_31); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
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
    // InternalPascal.g:2970:1: entryRuletype_definition returns [EObject current=null] : iv_ruletype_definition= ruletype_definition EOF ;
    public final EObject entryRuletype_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition = null;


        try {
            // InternalPascal.g:2970:56: (iv_ruletype_definition= ruletype_definition EOF )
            // InternalPascal.g:2971:2: iv_ruletype_definition= ruletype_definition EOF
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
    // InternalPascal.g:2977:1: ruletype_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruletype_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2983:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:2984:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:2984:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:2985:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:2985:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:2986:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:2986:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:2987:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,32,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalPascal.g:3007:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:3008:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:3008:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:3009:5: lv_type_2_0= ruletype
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
    // InternalPascal.g:3030:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // InternalPascal.g:3030:45: (iv_ruletype= ruletype EOF )
            // InternalPascal.g:3031:2: iv_ruletype= ruletype EOF
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
    // InternalPascal.g:3037:1: ruletype returns [EObject current=null] : ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        EObject lv_structured_1_0 = null;

        EObject lv_pointer_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3043:2: ( ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) ) )
            // InternalPascal.g:3044:2: ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) )
            {
            // InternalPascal.g:3044:2: ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OP:
            case RULE_STRING:
            case RULE_NUMERIC_SUBRANGE:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_REAL_NUMBER:
            case 38:
            case 39:
            case 40:
                {
                alt38=1;
                }
                break;
            case 50:
            case 51:
                {
                alt38=2;
                }
                break;
            case 29:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalPascal.g:3045:3: ( (lv_simple_0_0= rulesimple_type ) )
                    {
                    // InternalPascal.g:3045:3: ( (lv_simple_0_0= rulesimple_type ) )
                    // InternalPascal.g:3046:4: (lv_simple_0_0= rulesimple_type )
                    {
                    // InternalPascal.g:3046:4: (lv_simple_0_0= rulesimple_type )
                    // InternalPascal.g:3047:5: lv_simple_0_0= rulesimple_type
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
                    // InternalPascal.g:3065:3: ( (lv_structured_1_0= rulestructured_type ) )
                    {
                    // InternalPascal.g:3065:3: ( (lv_structured_1_0= rulestructured_type ) )
                    // InternalPascal.g:3066:4: (lv_structured_1_0= rulestructured_type )
                    {
                    // InternalPascal.g:3066:4: (lv_structured_1_0= rulestructured_type )
                    // InternalPascal.g:3067:5: lv_structured_1_0= rulestructured_type
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
                case 3 :
                    // InternalPascal.g:3085:3: ( (lv_pointer_2_0= rulepointer_type ) )
                    {
                    // InternalPascal.g:3085:3: ( (lv_pointer_2_0= rulepointer_type ) )
                    // InternalPascal.g:3086:4: (lv_pointer_2_0= rulepointer_type )
                    {
                    // InternalPascal.g:3086:4: (lv_pointer_2_0= rulepointer_type )
                    // InternalPascal.g:3087:5: lv_pointer_2_0= rulepointer_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeAccess().getPointerPointer_typeParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_pointer_2_0=rulepointer_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeRule());
                      					}
                      					set(
                      						current,
                      						"pointer",
                      						lv_pointer_2_0,
                      						"org.xtext.example.pascal.Pascal.pointer_type");
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
    // InternalPascal.g:3108:1: entryRulesimple_type returns [EObject current=null] : iv_rulesimple_type= rulesimple_type EOF ;
    public final EObject entryRulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_type = null;


        try {
            // InternalPascal.g:3108:52: (iv_rulesimple_type= rulesimple_type EOF )
            // InternalPascal.g:3109:2: iv_rulesimple_type= rulesimple_type EOF
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
    // InternalPascal.g:3115:1: rulesimple_type returns [EObject current=null] : ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulesimple_type() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_subrange_0_0 = null;

        EObject lv_enumerated_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3121:2: ( ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalPascal.g:3122:2: ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalPascal.g:3122:2: ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OP:
            case RULE_STRING:
            case RULE_NUMERIC_SUBRANGE:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_REAL_NUMBER:
            case 38:
            case 39:
                {
                alt39=1;
                }
                break;
            case RULE_ID:
                {
                int LA39_2 = input.LA(2);

                if ( (LA39_2==49) ) {
                    alt39=1;
                }
                else if ( (LA39_2==EOF||LA39_2==22||LA39_2==24||LA39_2==41) ) {
                    alt39=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 2, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt39=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalPascal.g:3123:3: ( (lv_subrange_0_0= rulesubrange_type ) )
                    {
                    // InternalPascal.g:3123:3: ( (lv_subrange_0_0= rulesubrange_type ) )
                    // InternalPascal.g:3124:4: (lv_subrange_0_0= rulesubrange_type )
                    {
                    // InternalPascal.g:3124:4: (lv_subrange_0_0= rulesubrange_type )
                    // InternalPascal.g:3125:5: lv_subrange_0_0= rulesubrange_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimple_typeAccess().getSubrangeSubrange_typeParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_subrange_0_0=rulesubrange_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                      					}
                      					set(
                      						current,
                      						"subrange",
                      						lv_subrange_0_0,
                      						"org.xtext.example.pascal.Pascal.subrange_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3143:3: ( (lv_enumerated_1_0= ruleenumerated_type ) )
                    {
                    // InternalPascal.g:3143:3: ( (lv_enumerated_1_0= ruleenumerated_type ) )
                    // InternalPascal.g:3144:4: (lv_enumerated_1_0= ruleenumerated_type )
                    {
                    // InternalPascal.g:3144:4: (lv_enumerated_1_0= ruleenumerated_type )
                    // InternalPascal.g:3145:5: lv_enumerated_1_0= ruleenumerated_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimple_typeAccess().getEnumeratedEnumerated_typeParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_enumerated_1_0=ruleenumerated_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                      					}
                      					set(
                      						current,
                      						"enumerated",
                      						lv_enumerated_1_0,
                      						"org.xtext.example.pascal.Pascal.enumerated_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:3163:3: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // InternalPascal.g:3163:3: ( (lv_name_2_0= RULE_ID ) )
                    // InternalPascal.g:3164:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalPascal.g:3164:4: (lv_name_2_0= RULE_ID )
                    // InternalPascal.g:3165:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_2_0, grammarAccess.getSimple_typeAccess().getNameIDTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSimple_typeRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_2_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
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
    // $ANTLR end "rulesimple_type"


    // $ANTLR start "entryRulesubrange_type"
    // InternalPascal.g:3185:1: entryRulesubrange_type returns [EObject current=null] : iv_rulesubrange_type= rulesubrange_type EOF ;
    public final EObject entryRulesubrange_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubrange_type = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalPascal.g:3187:2: (iv_rulesubrange_type= rulesubrange_type EOF )
            // InternalPascal.g:3188:2: iv_rulesubrange_type= rulesubrange_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubrange_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulesubrange_type=rulesubrange_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesubrange_type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulesubrange_type"


    // $ANTLR start "rulesubrange_type"
    // InternalPascal.g:3197:1: rulesubrange_type returns [EObject current=null] : ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) ) ;
    public final EObject rulesubrange_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_subrange_3_0=null;
        EObject lv_initialConst_0_0 = null;

        EObject lv_finalConst_2_0 = null;

        EObject lv_const_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalPascal.g:3204:2: ( ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) ) )
            // InternalPascal.g:3205:2: ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) )
            {
            // InternalPascal.g:3205:2: ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_INTEGER_NUMBER)||LA40_0==RULE_ADDITION_OP||LA40_0==RULE_STRING||(LA40_0>=RULE_SIGNED_REAL_NUMBER && LA40_0<=RULE_REAL_NUMBER)||(LA40_0>=38 && LA40_0<=39)) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_NUMERIC_SUBRANGE) ) {
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
                    // InternalPascal.g:3206:3: ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) )
                    {
                    // InternalPascal.g:3206:3: ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) )
                    // InternalPascal.g:3207:4: ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) )
                    {
                    // InternalPascal.g:3207:4: ( (lv_initialConst_0_0= ruleconstant ) )
                    // InternalPascal.g:3208:5: (lv_initialConst_0_0= ruleconstant )
                    {
                    // InternalPascal.g:3208:5: (lv_initialConst_0_0= ruleconstant )
                    // InternalPascal.g:3209:6: lv_initialConst_0_0= ruleconstant
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSubrange_typeAccess().getInitialConstConstantParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
                    lv_initialConst_0_0=ruleconstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
                      						}
                      						set(
                      							current,
                      							"initialConst",
                      							lv_initialConst_0_0,
                      							"org.xtext.example.pascal.Pascal.constant");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,49,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_0_1());
                      			
                    }
                    // InternalPascal.g:3230:4: ( (lv_finalConst_2_0= ruleconstant ) )
                    // InternalPascal.g:3231:5: (lv_finalConst_2_0= ruleconstant )
                    {
                    // InternalPascal.g:3231:5: (lv_finalConst_2_0= ruleconstant )
                    // InternalPascal.g:3232:6: lv_finalConst_2_0= ruleconstant
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSubrange_typeAccess().getFinalConstConstantParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_finalConst_2_0=ruleconstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
                      						}
                      						set(
                      							current,
                      							"finalConst",
                      							lv_finalConst_2_0,
                      							"org.xtext.example.pascal.Pascal.constant");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3251:3: ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) )
                    {
                    // InternalPascal.g:3251:3: ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) )
                    // InternalPascal.g:3252:4: ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) )
                    {
                    // InternalPascal.g:3252:4: ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) )
                    // InternalPascal.g:3253:5: (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE )
                    {
                    // InternalPascal.g:3253:5: (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE )
                    // InternalPascal.g:3254:6: lv_subrange_3_0= RULE_NUMERIC_SUBRANGE
                    {
                    lv_subrange_3_0=(Token)match(input,RULE_NUMERIC_SUBRANGE,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_subrange_3_0, grammarAccess.getSubrange_typeAccess().getSubrangeNUMERIC_SUBRANGETerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSubrange_typeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"subrange",
                      							lv_subrange_3_0,
                      							"org.xtext.example.pascal.Pascal.NUMERIC_SUBRANGE");
                      					
                    }

                    }


                    }

                    // InternalPascal.g:3270:4: ( (lv_const_4_0= ruleconstant ) )
                    // InternalPascal.g:3271:5: (lv_const_4_0= ruleconstant )
                    {
                    // InternalPascal.g:3271:5: (lv_const_4_0= ruleconstant )
                    // InternalPascal.g:3272:6: lv_const_4_0= ruleconstant
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstConstantParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_const_4_0=ruleconstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
                      						}
                      						set(
                      							current,
                      							"const",
                      							lv_const_4_0,
                      							"org.xtext.example.pascal.Pascal.constant");
                      						afterParserOrEnumRuleCall();
                      					
                    }

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulesubrange_type"


    // $ANTLR start "entryRuleenumerated_type"
    // InternalPascal.g:3297:1: entryRuleenumerated_type returns [EObject current=null] : iv_ruleenumerated_type= ruleenumerated_type EOF ;
    public final EObject entryRuleenumerated_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenumerated_type = null;


        try {
            // InternalPascal.g:3297:56: (iv_ruleenumerated_type= ruleenumerated_type EOF )
            // InternalPascal.g:3298:2: iv_ruleenumerated_type= ruleenumerated_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerated_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleenumerated_type=ruleenumerated_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenumerated_type; 
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
    // $ANTLR end "entryRuleenumerated_type"


    // $ANTLR start "ruleenumerated_type"
    // InternalPascal.g:3304:1: ruleenumerated_type returns [EObject current=null] : (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' ) ;
    public final EObject ruleenumerated_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifiers_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3310:2: ( (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' ) )
            // InternalPascal.g:3311:2: (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' )
            {
            // InternalPascal.g:3311:2: (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' )
            // InternalPascal.g:3312:3: otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalPascal.g:3316:3: ( (lv_identifiers_1_0= ruleidentifier_list ) )
            // InternalPascal.g:3317:4: (lv_identifiers_1_0= ruleidentifier_list )
            {
            // InternalPascal.g:3317:4: (lv_identifiers_1_0= ruleidentifier_list )
            // InternalPascal.g:3318:5: lv_identifiers_1_0= ruleidentifier_list
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumerated_typeAccess().getIdentifiersIdentifier_listParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_identifiers_1_0=ruleidentifier_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumerated_typeRule());
              					}
              					set(
              						current,
              						"identifiers",
              						lv_identifiers_1_0,
              						"org.xtext.example.pascal.Pascal.identifier_list");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEnumerated_typeAccess().getRightParenthesisKeyword_2());
              		
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
    // $ANTLR end "ruleenumerated_type"


    // $ANTLR start "entryRulestructured_type"
    // InternalPascal.g:3343:1: entryRulestructured_type returns [EObject current=null] : iv_rulestructured_type= rulestructured_type EOF ;
    public final EObject entryRulestructured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_type = null;


        try {
            // InternalPascal.g:3343:56: (iv_rulestructured_type= rulestructured_type EOF )
            // InternalPascal.g:3344:2: iv_rulestructured_type= rulestructured_type EOF
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
    // InternalPascal.g:3350:1: rulestructured_type returns [EObject current=null] : ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) ) ;
    public final EObject rulestructured_type() throws RecognitionException {
        EObject current = null;

        Token lv_packed_0_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3356:2: ( ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) ) )
            // InternalPascal.g:3357:2: ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) )
            {
            // InternalPascal.g:3357:2: ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) )
            // InternalPascal.g:3358:3: ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) )
            {
            // InternalPascal.g:3358:3: ( (lv_packed_0_0= 'packed' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==50) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalPascal.g:3359:4: (lv_packed_0_0= 'packed' )
                    {
                    // InternalPascal.g:3359:4: (lv_packed_0_0= 'packed' )
                    // InternalPascal.g:3360:5: lv_packed_0_0= 'packed'
                    {
                    lv_packed_0_0=(Token)match(input,50,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_packed_0_0, grammarAccess.getStructured_typeAccess().getPackedPackedKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getStructured_typeRule());
                      					}
                      					setWithLastConsumed(current, "packed", true, "packed");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPascal.g:3372:3: ( (lv_type_1_0= ruleunpacked_structured_type ) )
            // InternalPascal.g:3373:4: (lv_type_1_0= ruleunpacked_structured_type )
            {
            // InternalPascal.g:3373:4: (lv_type_1_0= ruleunpacked_structured_type )
            // InternalPascal.g:3374:5: lv_type_1_0= ruleunpacked_structured_type
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStructured_typeAccess().getTypeUnpacked_structured_typeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleunpacked_structured_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStructured_typeRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"org.xtext.example.pascal.Pascal.unpacked_structured_type");
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
    // $ANTLR end "rulestructured_type"


    // $ANTLR start "entryRuleunpacked_structured_type"
    // InternalPascal.g:3395:1: entryRuleunpacked_structured_type returns [EObject current=null] : iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF ;
    public final EObject entryRuleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_structured_type = null;


        try {
            // InternalPascal.g:3395:65: (iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF )
            // InternalPascal.g:3396:2: iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF
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
    // InternalPascal.g:3402:1: ruleunpacked_structured_type returns [EObject current=null] : ( (lv_record_0_0= rulerecord_type ) ) ;
    public final EObject ruleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject lv_record_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3408:2: ( ( (lv_record_0_0= rulerecord_type ) ) )
            // InternalPascal.g:3409:2: ( (lv_record_0_0= rulerecord_type ) )
            {
            // InternalPascal.g:3409:2: ( (lv_record_0_0= rulerecord_type ) )
            // InternalPascal.g:3410:3: (lv_record_0_0= rulerecord_type )
            {
            // InternalPascal.g:3410:3: (lv_record_0_0= rulerecord_type )
            // InternalPascal.g:3411:4: lv_record_0_0= rulerecord_type
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
    // InternalPascal.g:3431:1: entryRulerecord_type returns [EObject current=null] : iv_rulerecord_type= rulerecord_type EOF ;
    public final EObject entryRulerecord_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_type = null;


        try {
            // InternalPascal.g:3431:52: (iv_rulerecord_type= rulerecord_type EOF )
            // InternalPascal.g:3432:2: iv_rulerecord_type= rulerecord_type EOF
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
    // InternalPascal.g:3438:1: rulerecord_type returns [EObject current=null] : ( ( (lv_recordKeyword_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= 'end' ) ) ) ;
    public final EObject rulerecord_type() throws RecognitionException {
        EObject current = null;

        Token lv_recordKeyword_0_0=null;
        Token lv_endKeyword_2_0=null;
        EObject lv_fields_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3444:2: ( ( ( (lv_recordKeyword_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= 'end' ) ) ) )
            // InternalPascal.g:3445:2: ( ( (lv_recordKeyword_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= 'end' ) ) )
            {
            // InternalPascal.g:3445:2: ( ( (lv_recordKeyword_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= 'end' ) ) )
            // InternalPascal.g:3446:3: ( (lv_recordKeyword_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= 'end' ) )
            {
            // InternalPascal.g:3446:3: ( (lv_recordKeyword_0_0= 'record' ) )
            // InternalPascal.g:3447:4: (lv_recordKeyword_0_0= 'record' )
            {
            // InternalPascal.g:3447:4: (lv_recordKeyword_0_0= 'record' )
            // InternalPascal.g:3448:5: lv_recordKeyword_0_0= 'record'
            {
            lv_recordKeyword_0_0=(Token)match(input,51,FOLLOW_37); if (state.failed) return current;
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

            // InternalPascal.g:3460:3: ( (lv_fields_1_0= rulefield_list ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID||LA42_0==52) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalPascal.g:3461:4: (lv_fields_1_0= rulefield_list )
                    {
                    // InternalPascal.g:3461:4: (lv_fields_1_0= rulefield_list )
                    // InternalPascal.g:3462:5: lv_fields_1_0= rulefield_list
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

            // InternalPascal.g:3479:3: ( (lv_endKeyword_2_0= 'end' ) )
            // InternalPascal.g:3480:4: (lv_endKeyword_2_0= 'end' )
            {
            // InternalPascal.g:3480:4: (lv_endKeyword_2_0= 'end' )
            // InternalPascal.g:3481:5: lv_endKeyword_2_0= 'end'
            {
            lv_endKeyword_2_0=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalPascal.g:3497:1: entryRulefield_list returns [EObject current=null] : iv_rulefield_list= rulefield_list EOF ;
    public final EObject entryRulefield_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefield_list = null;


        try {
            // InternalPascal.g:3497:51: (iv_rulefield_list= rulefield_list EOF )
            // InternalPascal.g:3498:2: iv_rulefield_list= rulefield_list EOF
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
    // InternalPascal.g:3504:1: rulefield_list returns [EObject current=null] : ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= ';' )? ) ;
    public final EObject rulefield_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_fixed_0_0 = null;

        EObject lv_variants_2_0 = null;

        EObject lv_variants_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3510:2: ( ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= ';' )? ) )
            // InternalPascal.g:3511:2: ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= ';' )? )
            {
            // InternalPascal.g:3511:2: ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= ';' )? )
            // InternalPascal.g:3512:3: ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= ';' )?
            {
            // InternalPascal.g:3512:3: ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==52) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalPascal.g:3513:4: ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? )
                    {
                    // InternalPascal.g:3513:4: ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? )
                    // InternalPascal.g:3514:5: ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )?
                    {
                    // InternalPascal.g:3514:5: ( (lv_fixed_0_0= rulefixed_part ) )
                    // InternalPascal.g:3515:6: (lv_fixed_0_0= rulefixed_part )
                    {
                    // InternalPascal.g:3515:6: (lv_fixed_0_0= rulefixed_part )
                    // InternalPascal.g:3516:7: lv_fixed_0_0= rulefixed_part
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getField_listAccess().getFixedFixed_partParserRuleCall_0_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_9);
                    lv_fixed_0_0=rulefixed_part();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getField_listRule());
                      							}
                      							set(
                      								current,
                      								"fixed",
                      								lv_fixed_0_0,
                      								"org.xtext.example.pascal.Pascal.fixed_part");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalPascal.g:3533:5: (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==22) ) {
                        int LA43_1 = input.LA(2);

                        if ( (LA43_1==52) ) {
                            alt43=1;
                        }
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalPascal.g:3534:6: otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) )
                            {
                            otherlv_1=(Token)match(input,22,FOLLOW_38); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_1, grammarAccess.getField_listAccess().getSemicolonKeyword_0_0_1_0());
                              					
                            }
                            // InternalPascal.g:3538:6: ( (lv_variants_2_0= rulevariant_part ) )
                            // InternalPascal.g:3539:7: (lv_variants_2_0= rulevariant_part )
                            {
                            // InternalPascal.g:3539:7: (lv_variants_2_0= rulevariant_part )
                            // InternalPascal.g:3540:8: lv_variants_2_0= rulevariant_part
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getField_listAccess().getVariantsVariant_partParserRuleCall_0_0_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_9);
                            lv_variants_2_0=rulevariant_part();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getField_listRule());
                              								}
                              								add(
                              									current,
                              									"variants",
                              									lv_variants_2_0,
                              									"org.xtext.example.pascal.Pascal.variant_part");
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
                    // InternalPascal.g:3560:4: ( (lv_variants_3_0= rulevariant_part ) )
                    {
                    // InternalPascal.g:3560:4: ( (lv_variants_3_0= rulevariant_part ) )
                    // InternalPascal.g:3561:5: (lv_variants_3_0= rulevariant_part )
                    {
                    // InternalPascal.g:3561:5: (lv_variants_3_0= rulevariant_part )
                    // InternalPascal.g:3562:6: lv_variants_3_0= rulevariant_part
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getField_listAccess().getVariantsVariant_partParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_variants_3_0=rulevariant_part();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getField_listRule());
                      						}
                      						add(
                      							current,
                      							"variants",
                      							lv_variants_3_0,
                      							"org.xtext.example.pascal.Pascal.variant_part");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalPascal.g:3580:3: (otherlv_4= ';' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==22) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalPascal.g:3581:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getField_listAccess().getSemicolonKeyword_1());
                      			
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
    // $ANTLR end "rulefield_list"


    // $ANTLR start "entryRulefixed_part"
    // InternalPascal.g:3590:1: entryRulefixed_part returns [EObject current=null] : iv_rulefixed_part= rulefixed_part EOF ;
    public final EObject entryRulefixed_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefixed_part = null;


        try {
            // InternalPascal.g:3590:51: (iv_rulefixed_part= rulefixed_part EOF )
            // InternalPascal.g:3591:2: iv_rulefixed_part= rulefixed_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFixed_partRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefixed_part=rulefixed_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefixed_part; 
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
    // $ANTLR end "entryRulefixed_part"


    // $ANTLR start "rulefixed_part"
    // InternalPascal.g:3597:1: rulefixed_part returns [EObject current=null] : ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )* ) ;
    public final EObject rulefixed_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sections_0_0 = null;

        EObject lv_sections_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3603:2: ( ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )* ) )
            // InternalPascal.g:3604:2: ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )* )
            {
            // InternalPascal.g:3604:2: ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )* )
            // InternalPascal.g:3605:3: ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )*
            {
            // InternalPascal.g:3605:3: ( (lv_sections_0_0= rulerecord_section ) )
            // InternalPascal.g:3606:4: (lv_sections_0_0= rulerecord_section )
            {
            // InternalPascal.g:3606:4: (lv_sections_0_0= rulerecord_section )
            // InternalPascal.g:3607:5: lv_sections_0_0= rulerecord_section
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFixed_partAccess().getSectionsRecord_sectionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_sections_0_0=rulerecord_section();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFixed_partRule());
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

            // InternalPascal.g:3624:3: (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==22) ) {
                    int LA46_1 = input.LA(2);

                    if ( (LA46_1==RULE_ID) ) {
                        alt46=1;
                    }


                }


                switch (alt46) {
            	case 1 :
            	    // InternalPascal.g:3625:4: otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getFixed_partAccess().getSemicolonKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:3629:4: ( (lv_sections_2_0= rulerecord_section ) )
            	    // InternalPascal.g:3630:5: (lv_sections_2_0= rulerecord_section )
            	    {
            	    // InternalPascal.g:3630:5: (lv_sections_2_0= rulerecord_section )
            	    // InternalPascal.g:3631:6: lv_sections_2_0= rulerecord_section
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFixed_partAccess().getSectionsRecord_sectionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_sections_2_0=rulerecord_section();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFixed_partRule());
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
            	    break loop46;
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
    // $ANTLR end "rulefixed_part"


    // $ANTLR start "entryRulerecord_section"
    // InternalPascal.g:3653:1: entryRulerecord_section returns [EObject current=null] : iv_rulerecord_section= rulerecord_section EOF ;
    public final EObject entryRulerecord_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_section = null;


        try {
            // InternalPascal.g:3653:55: (iv_rulerecord_section= rulerecord_section EOF )
            // InternalPascal.g:3654:2: iv_rulerecord_section= rulerecord_section EOF
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
    // InternalPascal.g:3660:1: rulerecord_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulerecord_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3666:2: ( ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:3667:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:3667:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:3668:3: ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:3668:3: ( (lv_identifiers_0_0= ruleidentifier_list ) )
            // InternalPascal.g:3669:4: (lv_identifiers_0_0= ruleidentifier_list )
            {
            // InternalPascal.g:3669:4: (lv_identifiers_0_0= ruleidentifier_list )
            // InternalPascal.g:3670:5: lv_identifiers_0_0= ruleidentifier_list
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

            otherlv_1=(Token)match(input,25,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRecord_sectionAccess().getColonKeyword_1());
              		
            }
            // InternalPascal.g:3691:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:3692:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:3692:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:3693:5: lv_type_2_0= ruletype
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


    // $ANTLR start "entryRulevariant_part"
    // InternalPascal.g:3714:1: entryRulevariant_part returns [EObject current=null] : iv_rulevariant_part= rulevariant_part EOF ;
    public final EObject entryRulevariant_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant_part = null;


        try {
            // InternalPascal.g:3714:53: (iv_rulevariant_part= rulevariant_part EOF )
            // InternalPascal.g:3715:2: iv_rulevariant_part= rulevariant_part EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariant_partRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevariant_part=rulevariant_part();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariant_part; 
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
    // $ANTLR end "entryRulevariant_part"


    // $ANTLR start "rulevariant_part"
    // InternalPascal.g:3721:1: rulevariant_part returns [EObject current=null] : (otherlv_0= 'case' ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )* ) ;
    public final EObject rulevariant_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_tag_1_0 = null;

        EObject lv_variants_4_0 = null;

        EObject lv_variants_6_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3727:2: ( (otherlv_0= 'case' ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )* ) )
            // InternalPascal.g:3728:2: (otherlv_0= 'case' ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )* )
            {
            // InternalPascal.g:3728:2: (otherlv_0= 'case' ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )* )
            // InternalPascal.g:3729:3: otherlv_0= 'case' ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )*
            {
            otherlv_0=(Token)match(input,52,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariant_partAccess().getCaseKeyword_0());
              		
            }
            // InternalPascal.g:3733:3: ( (lv_tag_1_0= ruletag_field ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==25) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // InternalPascal.g:3734:4: (lv_tag_1_0= ruletag_field )
                    {
                    // InternalPascal.g:3734:4: (lv_tag_1_0= ruletag_field )
                    // InternalPascal.g:3735:5: lv_tag_1_0= ruletag_field
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVariant_partAccess().getTagTag_fieldParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_tag_1_0=ruletag_field();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVariant_partRule());
                      					}
                      					set(
                      						current,
                      						"tag",
                      						lv_tag_1_0,
                      						"org.xtext.example.pascal.Pascal.tag_field");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPascal.g:3752:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPascal.g:3753:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPascal.g:3753:4: (lv_name_2_0= RULE_ID )
            // InternalPascal.g:3754:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVariant_partAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariant_partRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,53,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVariant_partAccess().getOfKeyword_3());
              		
            }
            // InternalPascal.g:3774:3: ( (lv_variants_4_0= rulevariant ) )
            // InternalPascal.g:3775:4: (lv_variants_4_0= rulevariant )
            {
            // InternalPascal.g:3775:4: (lv_variants_4_0= rulevariant )
            // InternalPascal.g:3776:5: lv_variants_4_0= rulevariant
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariant_partAccess().getVariantsVariantParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_variants_4_0=rulevariant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariant_partRule());
              					}
              					add(
              						current,
              						"variants",
              						lv_variants_4_0,
              						"org.xtext.example.pascal.Pascal.variant");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:3793:3: (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==22) ) {
                    int LA48_1 = input.LA(2);

                    if ( ((LA48_1>=RULE_ID && LA48_1<=RULE_INTEGER_NUMBER)||LA48_1==RULE_ADDITION_OP||LA48_1==RULE_STRING||(LA48_1>=RULE_SIGNED_REAL_NUMBER && LA48_1<=RULE_REAL_NUMBER)||(LA48_1>=38 && LA48_1<=39)) ) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // InternalPascal.g:3794:4: otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) )
            	    {
            	    otherlv_5=(Token)match(input,22,FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getVariant_partAccess().getSemicolonKeyword_5_0());
            	      			
            	    }
            	    // InternalPascal.g:3798:4: ( (lv_variants_6_0= rulevariant ) )
            	    // InternalPascal.g:3799:5: (lv_variants_6_0= rulevariant )
            	    {
            	    // InternalPascal.g:3799:5: (lv_variants_6_0= rulevariant )
            	    // InternalPascal.g:3800:6: lv_variants_6_0= rulevariant
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getVariant_partAccess().getVariantsVariantParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_variants_6_0=rulevariant();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getVariant_partRule());
            	      						}
            	      						add(
            	      							current,
            	      							"variants",
            	      							lv_variants_6_0,
            	      							"org.xtext.example.pascal.Pascal.variant");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // $ANTLR end "rulevariant_part"


    // $ANTLR start "entryRuletag_field"
    // InternalPascal.g:3822:1: entryRuletag_field returns [EObject current=null] : iv_ruletag_field= ruletag_field EOF ;
    public final EObject entryRuletag_field() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletag_field = null;


        try {
            // InternalPascal.g:3822:50: (iv_ruletag_field= ruletag_field EOF )
            // InternalPascal.g:3823:2: iv_ruletag_field= ruletag_field EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTag_fieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletag_field=ruletag_field();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletag_field; 
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
    // $ANTLR end "entryRuletag_field"


    // $ANTLR start "ruletag_field"
    // InternalPascal.g:3829:1: ruletag_field returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) ;
    public final EObject ruletag_field() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPascal.g:3835:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) )
            // InternalPascal.g:3836:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            {
            // InternalPascal.g:3836:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            // InternalPascal.g:3837:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':'
            {
            // InternalPascal.g:3837:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:3838:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:3838:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:3839:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getTag_fieldAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTag_fieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTag_fieldAccess().getColonKeyword_1());
              		
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
    // $ANTLR end "ruletag_field"


    // $ANTLR start "entryRulevariant"
    // InternalPascal.g:3863:1: entryRulevariant returns [EObject current=null] : iv_rulevariant= rulevariant EOF ;
    public final EObject entryRulevariant() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant = null;


        try {
            // InternalPascal.g:3863:48: (iv_rulevariant= rulevariant EOF )
            // InternalPascal.g:3864:2: iv_rulevariant= rulevariant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevariant=rulevariant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariant; 
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
    // $ANTLR end "entryRulevariant"


    // $ANTLR start "rulevariant"
    // InternalPascal.g:3870:1: rulevariant returns [EObject current=null] : ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= ')' ) ;
    public final EObject rulevariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_labels_0_0 = null;

        EObject lv_fields_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3876:2: ( ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= ')' ) )
            // InternalPascal.g:3877:2: ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= ')' )
            {
            // InternalPascal.g:3877:2: ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= ')' )
            // InternalPascal.g:3878:3: ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= ')'
            {
            // InternalPascal.g:3878:3: ( (lv_labels_0_0= rulecase_label_list ) )
            // InternalPascal.g:3879:4: (lv_labels_0_0= rulecase_label_list )
            {
            // InternalPascal.g:3879:4: (lv_labels_0_0= rulecase_label_list )
            // InternalPascal.g:3880:5: lv_labels_0_0= rulecase_label_list
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariantAccess().getLabelsCase_label_listParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_labels_0_0=rulecase_label_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariantRule());
              					}
              					set(
              						current,
              						"labels",
              						lv_labels_0_0,
              						"org.xtext.example.pascal.Pascal.case_label_list");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariantAccess().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVariantAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPascal.g:3905:3: ( (lv_fields_3_0= rulefield_list ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID||LA49_0==52) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalPascal.g:3906:4: (lv_fields_3_0= rulefield_list )
                    {
                    // InternalPascal.g:3906:4: (lv_fields_3_0= rulefield_list )
                    // InternalPascal.g:3907:5: lv_fields_3_0= rulefield_list
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVariantAccess().getFieldsField_listParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_19);
                    lv_fields_3_0=rulefield_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVariantRule());
                      					}
                      					set(
                      						current,
                      						"fields",
                      						lv_fields_3_0,
                      						"org.xtext.example.pascal.Pascal.field_list");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getVariantAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "rulevariant"


    // $ANTLR start "entryRulecase_label_list"
    // InternalPascal.g:3932:1: entryRulecase_label_list returns [EObject current=null] : iv_rulecase_label_list= rulecase_label_list EOF ;
    public final EObject entryRulecase_label_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_label_list = null;


        try {
            // InternalPascal.g:3932:56: (iv_rulecase_label_list= rulecase_label_list EOF )
            // InternalPascal.g:3933:2: iv_rulecase_label_list= rulecase_label_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCase_label_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecase_label_list=rulecase_label_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecase_label_list; 
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
    // $ANTLR end "entryRulecase_label_list"


    // $ANTLR start "rulecase_label_list"
    // InternalPascal.g:3939:1: rulecase_label_list returns [EObject current=null] : ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )* ) ;
    public final EObject rulecase_label_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constants_0_0 = null;

        EObject lv_constants_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3945:2: ( ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )* ) )
            // InternalPascal.g:3946:2: ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )* )
            {
            // InternalPascal.g:3946:2: ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )* )
            // InternalPascal.g:3947:3: ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )*
            {
            // InternalPascal.g:3947:3: ( (lv_constants_0_0= ruleconstant ) )
            // InternalPascal.g:3948:4: (lv_constants_0_0= ruleconstant )
            {
            // InternalPascal.g:3948:4: (lv_constants_0_0= ruleconstant )
            // InternalPascal.g:3949:5: lv_constants_0_0= ruleconstant
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantsConstantParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_constants_0_0=ruleconstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCase_label_listRule());
              					}
              					add(
              						current,
              						"constants",
              						lv_constants_0_0,
              						"org.xtext.example.pascal.Pascal.constant");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPascal.g:3966:3: (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==30) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalPascal.g:3967:4: otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getCase_label_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:3971:4: ( (lv_constants_2_0= ruleconstant ) )
            	    // InternalPascal.g:3972:5: (lv_constants_2_0= ruleconstant )
            	    {
            	    // InternalPascal.g:3972:5: (lv_constants_2_0= ruleconstant )
            	    // InternalPascal.g:3973:6: lv_constants_2_0= ruleconstant
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantsConstantParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_constants_2_0=ruleconstant();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCase_label_listRule());
            	      						}
            	      						add(
            	      							current,
            	      							"constants",
            	      							lv_constants_2_0,
            	      							"org.xtext.example.pascal.Pascal.constant");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // $ANTLR end "rulecase_label_list"


    // $ANTLR start "entryRulepointer_type"
    // InternalPascal.g:3995:1: entryRulepointer_type returns [EObject current=null] : iv_rulepointer_type= rulepointer_type EOF ;
    public final EObject entryRulepointer_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepointer_type = null;


        try {
            // InternalPascal.g:3995:53: (iv_rulepointer_type= rulepointer_type EOF )
            // InternalPascal.g:3996:2: iv_rulepointer_type= rulepointer_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPointer_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulepointer_type=rulepointer_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepointer_type; 
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
    // $ANTLR end "entryRulepointer_type"


    // $ANTLR start "rulepointer_type"
    // InternalPascal.g:4002:1: rulepointer_type returns [EObject current=null] : (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) ) ;
    public final EObject rulepointer_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4008:2: ( (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) ) )
            // InternalPascal.g:4009:2: (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) )
            {
            // InternalPascal.g:4009:2: (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) )
            // InternalPascal.g:4010:3: otherlv_0= '^' ( (lv_type_1_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0());
              		
            }
            // InternalPascal.g:4014:3: ( (lv_type_1_0= ruletype ) )
            // InternalPascal.g:4015:4: (lv_type_1_0= ruletype )
            {
            // InternalPascal.g:4015:4: (lv_type_1_0= ruletype )
            // InternalPascal.g:4016:5: lv_type_1_0= ruletype
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPointer_typeAccess().getTypeTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPointer_typeRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
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
    // $ANTLR end "rulepointer_type"


    // $ANTLR start "entryRulesigned_number"
    // InternalPascal.g:4037:1: entryRulesigned_number returns [EObject current=null] : iv_rulesigned_number= rulesigned_number EOF ;
    public final EObject entryRulesigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigned_number = null;


        try {
            // InternalPascal.g:4037:54: (iv_rulesigned_number= rulesigned_number EOF )
            // InternalPascal.g:4038:2: iv_rulesigned_number= rulesigned_number EOF
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
    // InternalPascal.g:4044:1: rulesigned_number returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) ;
    public final EObject rulesigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_real_1_0=null;


        	enterRule();

        try {
            // InternalPascal.g:4050:2: ( ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) )
            // InternalPascal.g:4051:2: ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            {
            // InternalPascal.g:4051:2: ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalPascal.g:4052:3: ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:4052:3: ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    // InternalPascal.g:4053:4: (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:4053:4: (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    // InternalPascal.g:4054:5: lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER
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
                    // InternalPascal.g:4071:3: ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    {
                    // InternalPascal.g:4071:3: ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    // InternalPascal.g:4072:4: (lv_real_1_0= RULE_SIGNED_REAL_NUMBER )
                    {
                    // InternalPascal.g:4072:4: (lv_real_1_0= RULE_SIGNED_REAL_NUMBER )
                    // InternalPascal.g:4073:5: lv_real_1_0= RULE_SIGNED_REAL_NUMBER
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
    // InternalPascal.g:4093:1: entryRuleunsigned_number returns [EObject current=null] : iv_ruleunsigned_number= ruleunsigned_number EOF ;
    public final EObject entryRuleunsigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsigned_number = null;


        try {
            // InternalPascal.g:4093:56: (iv_ruleunsigned_number= ruleunsigned_number EOF )
            // InternalPascal.g:4094:2: iv_ruleunsigned_number= ruleunsigned_number EOF
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
    // InternalPascal.g:4100:1: ruleunsigned_number returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) ;
    public final EObject ruleunsigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_real_1_0=null;


        	enterRule();

        try {
            // InternalPascal.g:4106:2: ( ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) )
            // InternalPascal.g:4107:2: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            {
            // InternalPascal.g:4107:2: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_INTEGER_NUMBER) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_REAL_NUMBER) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalPascal.g:4108:3: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:4108:3: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    // InternalPascal.g:4109:4: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:4109:4: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    // InternalPascal.g:4110:5: lv_integer_0_0= RULE_INTEGER_NUMBER
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
                    // InternalPascal.g:4127:3: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    {
                    // InternalPascal.g:4127:3: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    // InternalPascal.g:4128:4: (lv_real_1_0= RULE_REAL_NUMBER )
                    {
                    // InternalPascal.g:4128:4: (lv_real_1_0= RULE_REAL_NUMBER )
                    // InternalPascal.g:4129:5: lv_real_1_0= RULE_REAL_NUMBER
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
    // InternalPascal.g:4149:1: entryRulevariable_declaration_part returns [EObject current=null] : iv_rulevariable_declaration_part= rulevariable_declaration_part EOF ;
    public final EObject entryRulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration_part = null;


        try {
            // InternalPascal.g:4149:66: (iv_rulevariable_declaration_part= rulevariable_declaration_part EOF )
            // InternalPascal.g:4150:2: iv_rulevariable_declaration_part= rulevariable_declaration_part EOF
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
    // InternalPascal.g:4156:1: rulevariable_declaration_part returns [EObject current=null] : (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* ) ;
    public final EObject rulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sections_1_0 = null;

        EObject lv_sections_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4162:2: ( (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* ) )
            // InternalPascal.g:4163:2: (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* )
            {
            // InternalPascal.g:4163:2: (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* )
            // InternalPascal.g:4164:3: otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )*
            {
            otherlv_0=(Token)match(input,44,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0());
              		
            }
            // InternalPascal.g:4168:3: ( (lv_sections_1_0= rulevariable_section ) )
            // InternalPascal.g:4169:4: (lv_sections_1_0= rulevariable_section )
            {
            // InternalPascal.g:4169:4: (lv_sections_1_0= rulevariable_section )
            // InternalPascal.g:4170:5: lv_sections_1_0= rulevariable_section
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

            otherlv_2=(Token)match(input,22,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2());
              		
            }
            // InternalPascal.g:4191:3: ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_ID) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalPascal.g:4192:4: ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';'
            	    {
            	    // InternalPascal.g:4192:4: ( (lv_sections_3_0= rulevariable_section ) )
            	    // InternalPascal.g:4193:5: (lv_sections_3_0= rulevariable_section )
            	    {
            	    // InternalPascal.g:4193:5: (lv_sections_3_0= rulevariable_section )
            	    // InternalPascal.g:4194:6: lv_sections_3_0= rulevariable_section
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

            	    otherlv_4=(Token)match(input,22,FOLLOW_31); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalPascal.g:4220:1: entryRulevariable_section returns [EObject current=null] : iv_rulevariable_section= rulevariable_section EOF ;
    public final EObject entryRulevariable_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_section = null;


        try {
            // InternalPascal.g:4220:57: (iv_rulevariable_section= rulevariable_section EOF )
            // InternalPascal.g:4221:2: iv_rulevariable_section= rulevariable_section EOF
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
    // InternalPascal.g:4227:1: rulevariable_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulevariable_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4233:2: ( ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:4234:2: ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:4234:2: ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:4235:3: ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:4235:3: ( (lv_identifiers_0_0= rulevariable_identifier_list ) )
            // InternalPascal.g:4236:4: (lv_identifiers_0_0= rulevariable_identifier_list )
            {
            // InternalPascal.g:4236:4: (lv_identifiers_0_0= rulevariable_identifier_list )
            // InternalPascal.g:4237:5: lv_identifiers_0_0= rulevariable_identifier_list
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

            otherlv_1=(Token)match(input,25,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariable_sectionAccess().getColonKeyword_1());
              		
            }
            // InternalPascal.g:4258:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:4259:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:4259:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:4260:5: lv_type_2_0= ruletype
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
    // InternalPascal.g:4281:1: entryRulevariable_identifier_list returns [EObject current=null] : iv_rulevariable_identifier_list= rulevariable_identifier_list EOF ;
    public final EObject entryRulevariable_identifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_identifier_list = null;


        try {
            // InternalPascal.g:4281:65: (iv_rulevariable_identifier_list= rulevariable_identifier_list EOF )
            // InternalPascal.g:4282:2: iv_rulevariable_identifier_list= rulevariable_identifier_list EOF
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
    // InternalPascal.g:4288:1: rulevariable_identifier_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject rulevariable_identifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;


        	enterRule();

        try {
            // InternalPascal.g:4294:2: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // InternalPascal.g:4295:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // InternalPascal.g:4295:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            // InternalPascal.g:4296:3: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // InternalPascal.g:4296:3: ( (lv_names_0_0= RULE_ID ) )
            // InternalPascal.g:4297:4: (lv_names_0_0= RULE_ID )
            {
            // InternalPascal.g:4297:4: (lv_names_0_0= RULE_ID )
            // InternalPascal.g:4298:5: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
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

            // InternalPascal.g:4314:3: (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==30) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalPascal.g:4315:4: otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getVariable_identifier_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPascal.g:4319:4: ( (lv_names_2_0= RULE_ID ) )
            	    // InternalPascal.g:4320:5: (lv_names_2_0= RULE_ID )
            	    {
            	    // InternalPascal.g:4320:5: (lv_names_2_0= RULE_ID )
            	    // InternalPascal.g:4321:6: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
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
            	    break loop54;
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
    // InternalPascal.g:4342:1: entryRulewhile_statement returns [EObject current=null] : iv_rulewhile_statement= rulewhile_statement EOF ;
    public final EObject entryRulewhile_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewhile_statement = null;


        try {
            // InternalPascal.g:4342:56: (iv_rulewhile_statement= rulewhile_statement EOF )
            // InternalPascal.g:4343:2: iv_rulewhile_statement= rulewhile_statement EOF
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
    // InternalPascal.g:4349:1: rulewhile_statement returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement_sequence ) ) ) ;
    public final EObject rulewhile_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4355:2: ( (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement_sequence ) ) ) )
            // InternalPascal.g:4356:2: (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement_sequence ) ) )
            {
            // InternalPascal.g:4356:2: (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement_sequence ) ) )
            // InternalPascal.g:4357:3: otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement_sequence ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhile_statementAccess().getWhileKeyword_0());
              		
            }
            // InternalPascal.g:4361:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalPascal.g:4362:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalPascal.g:4362:4: (lv_expression_1_0= ruleexpression )
            // InternalPascal.g:4363:5: lv_expression_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhile_statementAccess().getExpressionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_41);
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

            otherlv_2=(Token)match(input,55,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhile_statementAccess().getDoKeyword_2());
              		
            }
            // InternalPascal.g:4384:3: ( (lv_statement_3_0= rulestatement_sequence ) )
            // InternalPascal.g:4385:4: (lv_statement_3_0= rulestatement_sequence )
            {
            // InternalPascal.g:4385:4: (lv_statement_3_0= rulestatement_sequence )
            // InternalPascal.g:4386:5: lv_statement_3_0= rulestatement_sequence
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


        // InternalPascal.g:426:4: (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )
        // InternalPascal.g:426:4: otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) )
        {
        otherlv_1=(Token)match(input,22,FOLLOW_7); if (state.failed) return ;
        // InternalPascal.g:430:4: ( (lv_statements_2_0= rulestatement ) )
        // InternalPascal.g:431:5: (lv_statements_2_0= rulestatement )
        {
        // InternalPascal.g:431:5: (lv_statements_2_0= rulestatement )
        // InternalPascal.g:432:6: lv_statements_2_0= rulestatement
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


    protected DFA21 dfa21 = new DFA21(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\12\12\uffff";
    static final String dfa_3s = "\1\4\1\6\12\uffff";
    static final String dfa_4s = "\1\52\1\67\12\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\1\1\10";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\3\uffff\1\3\1\uffff\2\2\15\uffff\1\4\11\uffff\1\5\1\6\1\7\1\10\1\uffff\1\11",
            "\4\12\3\uffff\1\12\6\uffff\1\12\1\uffff\1\12\1\uffff\1\12\2\uffff\12\12\3\uffff\1\13\1\12\15\uffff\1\12",
            "",
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

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1484:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0001F80000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0040000000800070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000005E008003570L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000028100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000180000082L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200002142L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001C00000202L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000007E008003570L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000280000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000380000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000005E018003570L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000003070L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000C000003570L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000C01C020003D70L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0010000001000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010020000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0080000000000000L});

}