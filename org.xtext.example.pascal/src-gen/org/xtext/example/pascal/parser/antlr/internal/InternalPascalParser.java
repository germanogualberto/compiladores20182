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

@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SIGNED_INTEGER_NUMBER", "RULE_INTEGER_NUMBER", "RULE_RELATIONAL_OP", "RULE_ADDITION_OP", "RULE_MULTIPLICATION_OP", "RULE_STRING", "RULE_NUMERIC_SUBRANGE", "RULE_SIGNED_REAL_NUMBER", "RULE_REAL_NUMBER", "RULE_PARENTHESES_COMMENT", "RULE_CURLY_BRACKETS_COMMENT", "RULE_DIGIT_SEQUENCE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "';'", "'begin'", "'end'", "':'", "':='", "'['", "']'", "'^'", "','", "'in'", "'='", "'or'", "'div'", "'mod'", "'and'", "'nil'", "'true'", "'false'", "'('", "')'", "'not'", "'function'", "'var'", "'procedure'", "'label'", "'const'", "'type'", "'..'", "'packed'", "'set'", "'of'"
    };
    public static final int RULE_PARENTHESES_COMMENT=14;
    public static final int T__50=50;
    public static final int RULE_REAL_NUMBER=13;
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
    public static final int RULE_INT=17;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_RELATIONAL_OP=7;
    public static final int RULE_INTEGER_NUMBER=6;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_DIGIT_SEQUENCE=16;
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
    public static final int RULE_WS=20;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_SIGNED_INTEGER_NUMBER=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int RULE_CURLY_BRACKETS_COMMENT=15;
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
    // InternalPascal.g:64:1: entryRulepascal returns [EObject current=null] : iv_rulepascal= rulepascal EOF ;
    public final EObject entryRulepascal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepascal = null;


        try {
            // InternalPascal.g:64:47: (iv_rulepascal= rulepascal EOF )
            // InternalPascal.g:65:2: iv_rulepascal= rulepascal EOF
            {
             newCompositeNode(grammarAccess.getPascalRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepascal=rulepascal();

            state._fsp--;

             current =iv_rulepascal; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:71:1: rulepascal returns [EObject current=null] : ( (lv_program_0_0= ruleprogram ) ) ;
    public final EObject rulepascal() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:77:2: ( ( (lv_program_0_0= ruleprogram ) ) )
            // InternalPascal.g:78:2: ( (lv_program_0_0= ruleprogram ) )
            {
            // InternalPascal.g:78:2: ( (lv_program_0_0= ruleprogram ) )
            // InternalPascal.g:79:3: (lv_program_0_0= ruleprogram )
            {
            // InternalPascal.g:79:3: (lv_program_0_0= ruleprogram )
            // InternalPascal.g:80:4: lv_program_0_0= ruleprogram
            {

            				newCompositeNode(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_program_0_0=ruleprogram();

            state._fsp--;


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


            	leaveRule();

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
    // InternalPascal.g:100:1: entryRuleprogram returns [EObject current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final EObject entryRuleprogram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram = null;


        try {
            // InternalPascal.g:100:48: (iv_ruleprogram= ruleprogram EOF )
            // InternalPascal.g:101:2: iv_ruleprogram= ruleprogram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprogram=ruleprogram();

            state._fsp--;

             current =iv_ruleprogram; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:107:1: ruleprogram returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' ) ;
    public final EObject ruleprogram() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:113:2: ( ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' ) )
            // InternalPascal.g:114:2: ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' )
            {
            // InternalPascal.g:114:2: ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' )
            // InternalPascal.g:115:3: ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.'
            {
            // InternalPascal.g:115:3: ( (lv_heading_0_0= ruleprogram_heading_block ) )
            // InternalPascal.g:116:4: (lv_heading_0_0= ruleprogram_heading_block )
            {
            // InternalPascal.g:116:4: (lv_heading_0_0= ruleprogram_heading_block )
            // InternalPascal.g:117:5: lv_heading_0_0= ruleprogram_heading_block
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getHeadingProgram_heading_blockParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_heading_0_0=ruleprogram_heading_block();

            state._fsp--;


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

            // InternalPascal.g:134:3: ( (lv_block_1_0= ruleblock ) )
            // InternalPascal.g:135:4: (lv_block_1_0= ruleblock )
            {
            // InternalPascal.g:135:4: (lv_block_1_0= ruleblock )
            // InternalPascal.g:136:5: lv_block_1_0= ruleblock
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_block_1_0=ruleblock();

            state._fsp--;


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

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getFullStopKeyword_2());
            		

            }


            }


            	leaveRule();

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
    // InternalPascal.g:161:1: entryRuleprogram_heading_block returns [EObject current=null] : iv_ruleprogram_heading_block= ruleprogram_heading_block EOF ;
    public final EObject entryRuleprogram_heading_block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram_heading_block = null;


        try {
            // InternalPascal.g:161:62: (iv_ruleprogram_heading_block= ruleprogram_heading_block EOF )
            // InternalPascal.g:162:2: iv_ruleprogram_heading_block= ruleprogram_heading_block EOF
            {
             newCompositeNode(grammarAccess.getProgram_heading_blockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprogram_heading_block=ruleprogram_heading_block();

            state._fsp--;

             current =iv_ruleprogram_heading_block; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:168:1: ruleprogram_heading_block returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleprogram_heading_block() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPascal.g:174:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalPascal.g:175:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalPascal.g:175:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalPascal.g:176:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0());
            		
            // InternalPascal.g:180:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:181:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:181:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:182:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgram_heading_blockAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

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
    // InternalPascal.g:206:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // InternalPascal.g:206:46: (iv_ruleblock= ruleblock EOF )
            // InternalPascal.g:207:2: iv_ruleblock= ruleblock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleblock=ruleblock();

            state._fsp--;

             current =iv_ruleblock; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:213:1: ruleblock returns [EObject current=null] : ( ( (lv_label_0_0= rulelabel_declaration ) )? ( (lv_type_1_0= ruletype_definition_part ) )? ( (lv_variable_2_0= rulevariable_declaration_part ) )? ( (lv_constant_3_0= ruleconstant_definition_part ) )? ( (lv_abstraction_4_0= rulefunction_procedure_declaration ) )? ( (lv_statement_5_0= rulestatement_part ) ) ) ;
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
            // InternalPascal.g:219:2: ( ( ( (lv_label_0_0= rulelabel_declaration ) )? ( (lv_type_1_0= ruletype_definition_part ) )? ( (lv_variable_2_0= rulevariable_declaration_part ) )? ( (lv_constant_3_0= ruleconstant_definition_part ) )? ( (lv_abstraction_4_0= rulefunction_procedure_declaration ) )? ( (lv_statement_5_0= rulestatement_part ) ) ) )
            // InternalPascal.g:220:2: ( ( (lv_label_0_0= rulelabel_declaration ) )? ( (lv_type_1_0= ruletype_definition_part ) )? ( (lv_variable_2_0= rulevariable_declaration_part ) )? ( (lv_constant_3_0= ruleconstant_definition_part ) )? ( (lv_abstraction_4_0= rulefunction_procedure_declaration ) )? ( (lv_statement_5_0= rulestatement_part ) ) )
            {
            // InternalPascal.g:220:2: ( ( (lv_label_0_0= rulelabel_declaration ) )? ( (lv_type_1_0= ruletype_definition_part ) )? ( (lv_variable_2_0= rulevariable_declaration_part ) )? ( (lv_constant_3_0= ruleconstant_definition_part ) )? ( (lv_abstraction_4_0= rulefunction_procedure_declaration ) )? ( (lv_statement_5_0= rulestatement_part ) ) )
            // InternalPascal.g:221:3: ( (lv_label_0_0= rulelabel_declaration ) )? ( (lv_type_1_0= ruletype_definition_part ) )? ( (lv_variable_2_0= rulevariable_declaration_part ) )? ( (lv_constant_3_0= ruleconstant_definition_part ) )? ( (lv_abstraction_4_0= rulefunction_procedure_declaration ) )? ( (lv_statement_5_0= rulestatement_part ) )
            {
            // InternalPascal.g:221:3: ( (lv_label_0_0= rulelabel_declaration ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==48) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:222:4: (lv_label_0_0= rulelabel_declaration )
                    {
                    // InternalPascal.g:222:4: (lv_label_0_0= rulelabel_declaration )
                    // InternalPascal.g:223:5: lv_label_0_0= rulelabel_declaration
                    {

                    					newCompositeNode(grammarAccess.getBlockAccess().getLabelLabel_declarationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_label_0_0=rulelabel_declaration();

                    state._fsp--;


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
                    break;

            }

            // InternalPascal.g:240:3: ( (lv_type_1_0= ruletype_definition_part ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==50) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPascal.g:241:4: (lv_type_1_0= ruletype_definition_part )
                    {
                    // InternalPascal.g:241:4: (lv_type_1_0= ruletype_definition_part )
                    // InternalPascal.g:242:5: lv_type_1_0= ruletype_definition_part
                    {

                    					newCompositeNode(grammarAccess.getBlockAccess().getTypeType_definition_partParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_type_1_0=ruletype_definition_part();

                    state._fsp--;


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
                    break;

            }

            // InternalPascal.g:259:3: ( (lv_variable_2_0= rulevariable_declaration_part ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==46) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPascal.g:260:4: (lv_variable_2_0= rulevariable_declaration_part )
                    {
                    // InternalPascal.g:260:4: (lv_variable_2_0= rulevariable_declaration_part )
                    // InternalPascal.g:261:5: lv_variable_2_0= rulevariable_declaration_part
                    {

                    					newCompositeNode(grammarAccess.getBlockAccess().getVariableVariable_declaration_partParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_variable_2_0=rulevariable_declaration_part();

                    state._fsp--;


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
                    break;

            }

            // InternalPascal.g:278:3: ( (lv_constant_3_0= ruleconstant_definition_part ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==49) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:279:4: (lv_constant_3_0= ruleconstant_definition_part )
                    {
                    // InternalPascal.g:279:4: (lv_constant_3_0= ruleconstant_definition_part )
                    // InternalPascal.g:280:5: lv_constant_3_0= ruleconstant_definition_part
                    {

                    					newCompositeNode(grammarAccess.getBlockAccess().getConstantConstant_definition_partParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_constant_3_0=ruleconstant_definition_part();

                    state._fsp--;


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
                    break;

            }

            // InternalPascal.g:297:3: ( (lv_abstraction_4_0= rulefunction_procedure_declaration ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==45||LA5_0==47) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:298:4: (lv_abstraction_4_0= rulefunction_procedure_declaration )
                    {
                    // InternalPascal.g:298:4: (lv_abstraction_4_0= rulefunction_procedure_declaration )
                    // InternalPascal.g:299:5: lv_abstraction_4_0= rulefunction_procedure_declaration
                    {

                    					newCompositeNode(grammarAccess.getBlockAccess().getAbstractionFunction_procedure_declarationParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_abstraction_4_0=rulefunction_procedure_declaration();

                    state._fsp--;


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
                    break;

            }

            // InternalPascal.g:316:3: ( (lv_statement_5_0= rulestatement_part ) )
            // InternalPascal.g:317:4: (lv_statement_5_0= rulestatement_part )
            {
            // InternalPascal.g:317:4: (lv_statement_5_0= rulestatement_part )
            // InternalPascal.g:318:5: lv_statement_5_0= rulestatement_part
            {

            					newCompositeNode(grammarAccess.getBlockAccess().getStatementStatement_partParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_5_0=rulestatement_part();

            state._fsp--;


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


            	leaveRule();

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
    // InternalPascal.g:339:1: entryRulestatement_part returns [EObject current=null] : iv_rulestatement_part= rulestatement_part EOF ;
    public final EObject entryRulestatement_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_part = null;


        try {
            // InternalPascal.g:339:55: (iv_rulestatement_part= rulestatement_part EOF )
            // InternalPascal.g:340:2: iv_rulestatement_part= rulestatement_part EOF
            {
             newCompositeNode(grammarAccess.getStatement_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatement_part=rulestatement_part();

            state._fsp--;

             current =iv_rulestatement_part; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:346:1: rulestatement_part returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) ;
    public final EObject rulestatement_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:352:2: ( (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:353:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:353:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            // InternalPascal.g:354:3: otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getStatement_partAccess().getBeginKeyword_0());
            		
            // InternalPascal.g:358:3: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // InternalPascal.g:359:4: (lv_sequence_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:359:4: (lv_sequence_1_0= rulestatement_sequence )
            // InternalPascal.g:360:5: lv_sequence_1_0= rulestatement_sequence
            {

            					newCompositeNode(grammarAccess.getStatement_partAccess().getSequenceStatement_sequenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_sequence_1_0=rulestatement_sequence();

            state._fsp--;


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

            otherlv_2=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getStatement_partAccess().getEndKeyword_2());
            		

            }


            }


            	leaveRule();

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
    // InternalPascal.g:385:1: entryRulestatement_sequence returns [EObject current=null] : iv_rulestatement_sequence= rulestatement_sequence EOF ;
    public final EObject entryRulestatement_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_sequence = null;


        try {
            // InternalPascal.g:385:59: (iv_rulestatement_sequence= rulestatement_sequence EOF )
            // InternalPascal.g:386:2: iv_rulestatement_sequence= rulestatement_sequence EOF
            {
             newCompositeNode(grammarAccess.getStatement_sequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatement_sequence=rulestatement_sequence();

            state._fsp--;

             current =iv_rulestatement_sequence; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:392:1: rulestatement_sequence returns [EObject current=null] : ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) ;
    public final EObject rulestatement_sequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:398:2: ( ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) )
            // InternalPascal.g:399:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            {
            // InternalPascal.g:399:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            // InternalPascal.g:400:3: ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            {
            // InternalPascal.g:400:3: ( (lv_statements_0_0= rulestatement ) )
            // InternalPascal.g:401:4: (lv_statements_0_0= rulestatement )
            {
            // InternalPascal.g:401:4: (lv_statements_0_0= rulestatement )
            // InternalPascal.g:402:5: lv_statements_0_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_statements_0_0=rulestatement();

            state._fsp--;


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

            // InternalPascal.g:419:3: (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPascal.g:420:4: otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalPascal.g:424:4: ( (lv_statements_2_0= rulestatement ) )
            	    // InternalPascal.g:425:5: (lv_statements_2_0= rulestatement )
            	    {
            	    // InternalPascal.g:425:5: (lv_statements_2_0= rulestatement )
            	    // InternalPascal.g:426:6: lv_statements_2_0= rulestatement
            	    {

            	    						newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_statements_2_0=rulestatement();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalPascal.g:448:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // InternalPascal.g:448:50: (iv_rulestatement= rulestatement EOF )
            // InternalPascal.g:449:2: iv_rulestatement= rulestatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatement=rulestatement();

            state._fsp--;

             current =iv_rulestatement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:455:1: rulestatement returns [EObject current=null] : ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( (lv_simple_2_0= rulesimple_statement ) ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_label_0_0 = null;

        EObject lv_simple_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:461:2: ( ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( (lv_simple_2_0= rulesimple_statement ) ) ) )
            // InternalPascal.g:462:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( (lv_simple_2_0= rulesimple_statement ) ) )
            {
            // InternalPascal.g:462:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( (lv_simple_2_0= rulesimple_statement ) ) )
            // InternalPascal.g:463:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( (lv_simple_2_0= rulesimple_statement ) )
            {
            // InternalPascal.g:463:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_SIGNED_INTEGER_NUMBER && LA7_0<=RULE_INTEGER_NUMBER)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPascal.g:464:4: ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':'
                    {
                    // InternalPascal.g:464:4: ( (lv_label_0_0= rulelabel ) )
                    // InternalPascal.g:465:5: (lv_label_0_0= rulelabel )
                    {
                    // InternalPascal.g:465:5: (lv_label_0_0= rulelabel )
                    // InternalPascal.g:466:6: lv_label_0_0= rulelabel
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getLabelLabelParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_label_0_0=rulelabel();

                    state._fsp--;


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

                    otherlv_1=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalPascal.g:488:3: ( (lv_simple_2_0= rulesimple_statement ) )
            // InternalPascal.g:489:4: (lv_simple_2_0= rulesimple_statement )
            {
            // InternalPascal.g:489:4: (lv_simple_2_0= rulesimple_statement )
            // InternalPascal.g:490:5: lv_simple_2_0= rulesimple_statement
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getSimpleSimple_statementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_simple_2_0=rulesimple_statement();

            state._fsp--;


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


            	leaveRule();

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
    // InternalPascal.g:511:1: entryRulesimple_statement returns [EObject current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final EObject entryRulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_statement = null;


        try {
            // InternalPascal.g:511:57: (iv_rulesimple_statement= rulesimple_statement EOF )
            // InternalPascal.g:512:2: iv_rulesimple_statement= rulesimple_statement EOF
            {
             newCompositeNode(grammarAccess.getSimple_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimple_statement=rulesimple_statement();

            state._fsp--;

             current =iv_rulesimple_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:518:1: rulesimple_statement returns [EObject current=null] : ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_function_noargs_2_0= RULE_ID ) ) )? ;
    public final EObject rulesimple_statement() throws RecognitionException {
        EObject current = null;

        Token lv_function_noargs_2_0=null;
        EObject lv_assignment_0_0 = null;

        EObject lv_function_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:524:2: ( ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_function_noargs_2_0= RULE_ID ) ) )? )
            // InternalPascal.g:525:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_function_noargs_2_0= RULE_ID ) ) )?
            {
            // InternalPascal.g:525:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_function_noargs_2_0= RULE_ID ) ) )?
            int alt8=4;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                    case EOF:
                    case 24:
                    case 26:
                        {
                        alt8=3;
                        }
                        break;
                    case 42:
                        {
                        alt8=2;
                        }
                        break;
                    case 22:
                    case 28:
                    case 29:
                    case 31:
                        {
                        alt8=1;
                        }
                        break;
                }

            }
            switch (alt8) {
                case 1 :
                    // InternalPascal.g:526:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    {
                    // InternalPascal.g:526:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    // InternalPascal.g:527:4: (lv_assignment_0_0= ruleassignment_statement )
                    {
                    // InternalPascal.g:527:4: (lv_assignment_0_0= ruleassignment_statement )
                    // InternalPascal.g:528:5: lv_assignment_0_0= ruleassignment_statement
                    {

                    					newCompositeNode(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_statementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_assignment_0_0=ruleassignment_statement();

                    state._fsp--;


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
                    break;
                case 2 :
                    // InternalPascal.g:546:3: ( (lv_function_1_0= rulefunction_designator ) )
                    {
                    // InternalPascal.g:546:3: ( (lv_function_1_0= rulefunction_designator ) )
                    // InternalPascal.g:547:4: (lv_function_1_0= rulefunction_designator )
                    {
                    // InternalPascal.g:547:4: (lv_function_1_0= rulefunction_designator )
                    // InternalPascal.g:548:5: lv_function_1_0= rulefunction_designator
                    {

                    					newCompositeNode(grammarAccess.getSimple_statementAccess().getFunctionFunction_designatorParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_function_1_0=rulefunction_designator();

                    state._fsp--;


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
                    break;
                case 3 :
                    // InternalPascal.g:566:3: ( (lv_function_noargs_2_0= RULE_ID ) )
                    {
                    // InternalPascal.g:566:3: ( (lv_function_noargs_2_0= RULE_ID ) )
                    // InternalPascal.g:567:4: (lv_function_noargs_2_0= RULE_ID )
                    {
                    // InternalPascal.g:567:4: (lv_function_noargs_2_0= RULE_ID )
                    // InternalPascal.g:568:5: lv_function_noargs_2_0= RULE_ID
                    {
                    lv_function_noargs_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_function_noargs_2_0, grammarAccess.getSimple_statementAccess().getFunction_noargsIDTerminalRuleCall_2_0());
                    				

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
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleassignment_statement"
    // InternalPascal.g:588:1: entryRuleassignment_statement returns [EObject current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final EObject entryRuleassignment_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment_statement = null;


        try {
            // InternalPascal.g:588:61: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // InternalPascal.g:589:2: iv_ruleassignment_statement= ruleassignment_statement EOF
            {
             newCompositeNode(grammarAccess.getAssignment_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleassignment_statement=ruleassignment_statement();

            state._fsp--;

             current =iv_ruleassignment_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:595:1: ruleassignment_statement returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) ;
    public final EObject ruleassignment_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:601:2: ( ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) )
            // InternalPascal.g:602:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            {
            // InternalPascal.g:602:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            // InternalPascal.g:603:3: ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) )
            {
            // InternalPascal.g:603:3: ( (lv_variable_0_0= rulevariable ) )
            // InternalPascal.g:604:4: (lv_variable_0_0= rulevariable )
            {
            // InternalPascal.g:604:4: (lv_variable_0_0= rulevariable )
            // InternalPascal.g:605:5: lv_variable_0_0= rulevariable
            {

            					newCompositeNode(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_variable_0_0=rulevariable();

            state._fsp--;


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

            otherlv_1=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1());
            		
            // InternalPascal.g:626:3: ( (lv_expression_2_0= ruleexpression ) )
            // InternalPascal.g:627:4: (lv_expression_2_0= ruleexpression )
            {
            // InternalPascal.g:627:4: (lv_expression_2_0= ruleexpression )
            // InternalPascal.g:628:5: lv_expression_2_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleexpression();

            state._fsp--;


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


            	leaveRule();

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
    // InternalPascal.g:649:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // InternalPascal.g:649:46: (iv_rulelabel= rulelabel EOF )
            // InternalPascal.g:650:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:656:1: rulelabel returns [EObject current=null] : ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_number_1_0=null;


        	enterRule();

        try {
            // InternalPascal.g:662:2: ( ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) ) )
            // InternalPascal.g:663:2: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) )
            {
            // InternalPascal.g:663:2: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INTEGER_NUMBER) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:664:3: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:664:3: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    // InternalPascal.g:665:4: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:665:4: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    // InternalPascal.g:666:5: lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    lv_number_0_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_number_0_0, grammarAccess.getLabelAccess().getNumberSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0());
                    				

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
                    break;
                case 2 :
                    // InternalPascal.g:683:3: ( (lv_number_1_0= RULE_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:683:3: ( (lv_number_1_0= RULE_INTEGER_NUMBER ) )
                    // InternalPascal.g:684:4: (lv_number_1_0= RULE_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:684:4: (lv_number_1_0= RULE_INTEGER_NUMBER )
                    // InternalPascal.g:685:5: lv_number_1_0= RULE_INTEGER_NUMBER
                    {
                    lv_number_1_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_number_1_0, grammarAccess.getLabelAccess().getNumberINTEGER_NUMBERTerminalRuleCall_1_0());
                    				

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
                    break;

            }


            }


            	leaveRule();

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
    // InternalPascal.g:705:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // InternalPascal.g:705:49: (iv_rulevariable= rulevariable EOF )
            // InternalPascal.g:706:2: iv_rulevariable= rulevariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable=rulevariable();

            state._fsp--;

             current =iv_rulevariable; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:712:1: rulevariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) ) ;
    public final EObject rulevariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:718:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) ) )
            // InternalPascal.g:719:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) )
            {
            // InternalPascal.g:719:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) )
            // InternalPascal.g:720:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) )
            {
            // InternalPascal.g:720:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:721:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:721:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:722:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            // InternalPascal.g:738:3: ( (lv_variable_1_0= rulevar_ ) )
            // InternalPascal.g:739:4: (lv_variable_1_0= rulevar_ )
            {
            // InternalPascal.g:739:4: (lv_variable_1_0= rulevar_ )
            // InternalPascal.g:740:5: lv_variable_1_0= rulevar_
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getVariableVar_ParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_variable_1_0=rulevar_();

            state._fsp--;


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


            	leaveRule();

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
    // InternalPascal.g:761:1: entryRulevar_ returns [EObject current=null] : iv_rulevar_= rulevar_ EOF ;
    public final EObject entryRulevar_() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevar_ = null;


        try {
            // InternalPascal.g:761:45: (iv_rulevar_= rulevar_ EOF )
            // InternalPascal.g:762:2: iv_rulevar_= rulevar_ EOF
            {
             newCompositeNode(grammarAccess.getVar_Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulevar_=rulevar_();

            state._fsp--;

             current =iv_rulevar_; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:768:1: rulevar_ returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )? ;
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
            // InternalPascal.g:774:2: ( ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )? )
            // InternalPascal.g:775:2: ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )?
            {
            // InternalPascal.g:775:2: ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )?
            int alt10=4;
            switch ( input.LA(1) ) {
                case 29:
                    {
                    alt10=1;
                    }
                    break;
                case 22:
                    {
                    alt10=2;
                    }
                    break;
                case 31:
                    {
                    alt10=3;
                    }
                    break;
            }

            switch (alt10) {
                case 1 :
                    // InternalPascal.g:776:3: (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) )
                    {
                    // InternalPascal.g:776:3: (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) )
                    // InternalPascal.g:777:4: otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) )
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getVar_Access().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalPascal.g:781:4: ( (lv_expressions_1_0= ruleexpression_list ) )
                    // InternalPascal.g:782:5: (lv_expressions_1_0= ruleexpression_list )
                    {
                    // InternalPascal.g:782:5: (lv_expressions_1_0= ruleexpression_list )
                    // InternalPascal.g:783:6: lv_expressions_1_0= ruleexpression_list
                    {

                    						newCompositeNode(grammarAccess.getVar_Access().getExpressionsExpression_listParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_expressions_1_0=ruleexpression_list();

                    state._fsp--;


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

                    otherlv_2=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getVar_Access().getRightSquareBracketKeyword_0_2());
                    			
                    // InternalPascal.g:804:4: ( (lv_array_3_0= rulevar_ ) )
                    // InternalPascal.g:805:5: (lv_array_3_0= rulevar_ )
                    {
                    // InternalPascal.g:805:5: (lv_array_3_0= rulevar_ )
                    // InternalPascal.g:806:6: lv_array_3_0= rulevar_
                    {

                    						newCompositeNode(grammarAccess.getVar_Access().getArrayVar_ParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_array_3_0=rulevar_();

                    state._fsp--;


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
                    break;
                case 2 :
                    // InternalPascal.g:825:3: ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) )
                    {
                    // InternalPascal.g:825:3: ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) )
                    // InternalPascal.g:826:4: ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) )
                    {
                    // InternalPascal.g:826:4: ( (lv_accessor_4_0= '.' ) )
                    // InternalPascal.g:827:5: (lv_accessor_4_0= '.' )
                    {
                    // InternalPascal.g:827:5: (lv_accessor_4_0= '.' )
                    // InternalPascal.g:828:6: lv_accessor_4_0= '.'
                    {
                    lv_accessor_4_0=(Token)match(input,22,FOLLOW_5); 

                    						newLeafNode(lv_accessor_4_0, grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVar_Rule());
                    						}
                    						setWithLastConsumed(current, "accessor", true, ".");
                    					

                    }


                    }

                    // InternalPascal.g:840:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalPascal.g:841:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalPascal.g:841:5: (lv_name_5_0= RULE_ID )
                    // InternalPascal.g:842:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getVar_Access().getNameIDTerminalRuleCall_1_1_0());
                    					

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

                    // InternalPascal.g:858:4: ( (lv_variable_6_0= rulevar_ ) )
                    // InternalPascal.g:859:5: (lv_variable_6_0= rulevar_ )
                    {
                    // InternalPascal.g:859:5: (lv_variable_6_0= rulevar_ )
                    // InternalPascal.g:860:6: lv_variable_6_0= rulevar_
                    {

                    						newCompositeNode(grammarAccess.getVar_Access().getVariableVar_ParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_variable_6_0=rulevar_();

                    state._fsp--;


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
                    break;
                case 3 :
                    // InternalPascal.g:879:3: (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) )
                    {
                    // InternalPascal.g:879:3: (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) )
                    // InternalPascal.g:880:4: otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) )
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getVar_Access().getCircumflexAccentKeyword_2_0());
                    			
                    // InternalPascal.g:884:4: ( (lv_pointer_8_0= rulevar_ ) )
                    // InternalPascal.g:885:5: (lv_pointer_8_0= rulevar_ )
                    {
                    // InternalPascal.g:885:5: (lv_pointer_8_0= rulevar_ )
                    // InternalPascal.g:886:6: lv_pointer_8_0= rulevar_
                    {

                    						newCompositeNode(grammarAccess.getVar_Access().getPointerVar_ParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_pointer_8_0=rulevar_();

                    state._fsp--;


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
                    break;

            }


            }


            	leaveRule();

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
    // InternalPascal.g:908:1: entryRuleexpression_list returns [EObject current=null] : iv_ruleexpression_list= ruleexpression_list EOF ;
    public final EObject entryRuleexpression_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression_list = null;


        try {
            // InternalPascal.g:908:56: (iv_ruleexpression_list= ruleexpression_list EOF )
            // InternalPascal.g:909:2: iv_ruleexpression_list= ruleexpression_list EOF
            {
             newCompositeNode(grammarAccess.getExpression_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexpression_list=ruleexpression_list();

            state._fsp--;

             current =iv_ruleexpression_list; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:915:1: ruleexpression_list returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* ) ;
    public final EObject ruleexpression_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:921:2: ( ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* ) )
            // InternalPascal.g:922:2: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* )
            {
            // InternalPascal.g:922:2: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* )
            // InternalPascal.g:923:3: ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )*
            {
            // InternalPascal.g:923:3: ( (lv_expressions_0_0= ruleexpression ) )
            // InternalPascal.g:924:4: (lv_expressions_0_0= ruleexpression )
            {
            // InternalPascal.g:924:4: (lv_expressions_0_0= ruleexpression )
            // InternalPascal.g:925:5: lv_expressions_0_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_expressions_0_0=ruleexpression();

            state._fsp--;


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

            // InternalPascal.g:942:3: (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPascal.g:943:4: otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) )
            	    {
            	    otherlv_1=(Token)match(input,32,FOLLOW_12); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExpression_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:947:4: ( (lv_expressions_2_0= ruleexpression ) )
            	    // InternalPascal.g:948:5: (lv_expressions_2_0= ruleexpression )
            	    {
            	    // InternalPascal.g:948:5: (lv_expressions_2_0= ruleexpression )
            	    // InternalPascal.g:949:6: lv_expressions_2_0= ruleexpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_expressions_2_0=ruleexpression();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalPascal.g:971:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalPascal.g:971:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalPascal.g:972:2: iv_ruleexpression= ruleexpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;

             current =iv_ruleexpression; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:978:1: ruleexpression returns [EObject current=null] : ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:984:2: ( ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) )
            // InternalPascal.g:985:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            {
            // InternalPascal.g:985:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            // InternalPascal.g:986:3: ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            {
            // InternalPascal.g:986:3: ( (lv_expressions_0_0= rulesimple_expression ) )
            // InternalPascal.g:987:4: (lv_expressions_0_0= rulesimple_expression )
            {
            // InternalPascal.g:987:4: (lv_expressions_0_0= rulesimple_expression )
            // InternalPascal.g:988:5: lv_expressions_0_0= rulesimple_expression
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_expressions_0_0=rulesimple_expression();

            state._fsp--;


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

            // InternalPascal.g:1005:3: ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_RELATIONAL_OP||(LA13_0>=33 && LA13_0<=34)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPascal.g:1006:4: ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) )
                    {
                    // InternalPascal.g:1006:4: ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) )
                    int alt12=3;
                    switch ( input.LA(1) ) {
                    case RULE_RELATIONAL_OP:
                        {
                        alt12=1;
                        }
                        break;
                    case 33:
                        {
                        alt12=2;
                        }
                        break;
                    case 34:
                        {
                        alt12=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }

                    switch (alt12) {
                        case 1 :
                            // InternalPascal.g:1007:5: ( (lv_operators_1_0= RULE_RELATIONAL_OP ) )
                            {
                            // InternalPascal.g:1007:5: ( (lv_operators_1_0= RULE_RELATIONAL_OP ) )
                            // InternalPascal.g:1008:6: (lv_operators_1_0= RULE_RELATIONAL_OP )
                            {
                            // InternalPascal.g:1008:6: (lv_operators_1_0= RULE_RELATIONAL_OP )
                            // InternalPascal.g:1009:7: lv_operators_1_0= RULE_RELATIONAL_OP
                            {
                            lv_operators_1_0=(Token)match(input,RULE_RELATIONAL_OP,FOLLOW_12); 

                            							newLeafNode(lv_operators_1_0, grammarAccess.getExpressionAccess().getOperatorsRELATIONAL_OPTerminalRuleCall_1_0_0_0());
                            						

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
                            break;
                        case 2 :
                            // InternalPascal.g:1026:5: ( (lv_operators_2_0= 'in' ) )
                            {
                            // InternalPascal.g:1026:5: ( (lv_operators_2_0= 'in' ) )
                            // InternalPascal.g:1027:6: (lv_operators_2_0= 'in' )
                            {
                            // InternalPascal.g:1027:6: (lv_operators_2_0= 'in' )
                            // InternalPascal.g:1028:7: lv_operators_2_0= 'in'
                            {
                            lv_operators_2_0=(Token)match(input,33,FOLLOW_12); 

                            							newLeafNode(lv_operators_2_0, grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpressionRule());
                            							}
                            							addWithLastConsumed(current, "operators", lv_operators_2_0, "in");
                            						

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalPascal.g:1041:5: ( (lv_operators_3_0= '=' ) )
                            {
                            // InternalPascal.g:1041:5: ( (lv_operators_3_0= '=' ) )
                            // InternalPascal.g:1042:6: (lv_operators_3_0= '=' )
                            {
                            // InternalPascal.g:1042:6: (lv_operators_3_0= '=' )
                            // InternalPascal.g:1043:7: lv_operators_3_0= '='
                            {
                            lv_operators_3_0=(Token)match(input,34,FOLLOW_12); 

                            							newLeafNode(lv_operators_3_0, grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpressionRule());
                            							}
                            							addWithLastConsumed(current, "operators", lv_operators_3_0, "=");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalPascal.g:1056:4: ( (lv_expressions_4_0= rulesimple_expression ) )
                    // InternalPascal.g:1057:5: (lv_expressions_4_0= rulesimple_expression )
                    {
                    // InternalPascal.g:1057:5: (lv_expressions_4_0= rulesimple_expression )
                    // InternalPascal.g:1058:6: lv_expressions_4_0= rulesimple_expression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expressions_4_0=rulesimple_expression();

                    state._fsp--;


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
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalPascal.g:1080:1: entryRulesimple_expression returns [EObject current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final EObject entryRulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_expression = null;


        try {
            // InternalPascal.g:1080:58: (iv_rulesimple_expression= rulesimple_expression EOF )
            // InternalPascal.g:1081:2: iv_rulesimple_expression= rulesimple_expression EOF
            {
             newCompositeNode(grammarAccess.getSimple_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimple_expression=rulesimple_expression();

            state._fsp--;

             current =iv_rulesimple_expression; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:1087:1: rulesimple_expression returns [EObject current=null] : ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* ) ;
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
            // InternalPascal.g:1093:2: ( ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* ) )
            // InternalPascal.g:1094:2: ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* )
            {
            // InternalPascal.g:1094:2: ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* )
            // InternalPascal.g:1095:3: ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )*
            {
            // InternalPascal.g:1095:3: ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ADDITION_OP) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPascal.g:1096:4: (lv_prefixOperator_0_0= RULE_ADDITION_OP )
                    {
                    // InternalPascal.g:1096:4: (lv_prefixOperator_0_0= RULE_ADDITION_OP )
                    // InternalPascal.g:1097:5: lv_prefixOperator_0_0= RULE_ADDITION_OP
                    {
                    lv_prefixOperator_0_0=(Token)match(input,RULE_ADDITION_OP,FOLLOW_12); 

                    					newLeafNode(lv_prefixOperator_0_0, grammarAccess.getSimple_expressionAccess().getPrefixOperatorADDITION_OPTerminalRuleCall_0_0());
                    				

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
                    break;

            }

            // InternalPascal.g:1113:3: ( (lv_terms_1_0= ruleterm ) )
            // InternalPascal.g:1114:4: (lv_terms_1_0= ruleterm )
            {
            // InternalPascal.g:1114:4: (lv_terms_1_0= ruleterm )
            // InternalPascal.g:1115:5: lv_terms_1_0= ruleterm
            {

            					newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_terms_1_0=ruleterm();

            state._fsp--;


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

            // InternalPascal.g:1132:3: ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ADDITION_OP||LA16_0==35) ) {
                    alt16=1;
                }
                else if ( (LA16_0==RULE_INTEGER_NUMBER||LA16_0==RULE_REAL_NUMBER) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPascal.g:1133:4: ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    {
            	    // InternalPascal.g:1133:4: ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    // InternalPascal.g:1134:5: ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) )
            	    {
            	    // InternalPascal.g:1134:5: ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==RULE_ADDITION_OP) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==35) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalPascal.g:1135:6: ( (lv_operators_2_0= RULE_ADDITION_OP ) )
            	            {
            	            // InternalPascal.g:1135:6: ( (lv_operators_2_0= RULE_ADDITION_OP ) )
            	            // InternalPascal.g:1136:7: (lv_operators_2_0= RULE_ADDITION_OP )
            	            {
            	            // InternalPascal.g:1136:7: (lv_operators_2_0= RULE_ADDITION_OP )
            	            // InternalPascal.g:1137:8: lv_operators_2_0= RULE_ADDITION_OP
            	            {
            	            lv_operators_2_0=(Token)match(input,RULE_ADDITION_OP,FOLLOW_12); 

            	            								newLeafNode(lv_operators_2_0, grammarAccess.getSimple_expressionAccess().getOperatorsADDITION_OPTerminalRuleCall_2_0_0_0_0());
            	            							

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
            	            break;
            	        case 2 :
            	            // InternalPascal.g:1154:6: ( (lv_operators_3_0= 'or' ) )
            	            {
            	            // InternalPascal.g:1154:6: ( (lv_operators_3_0= 'or' ) )
            	            // InternalPascal.g:1155:7: (lv_operators_3_0= 'or' )
            	            {
            	            // InternalPascal.g:1155:7: (lv_operators_3_0= 'or' )
            	            // InternalPascal.g:1156:8: lv_operators_3_0= 'or'
            	            {
            	            lv_operators_3_0=(Token)match(input,35,FOLLOW_12); 

            	            								newLeafNode(lv_operators_3_0, grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getSimple_expressionRule());
            	            								}
            	            								addWithLastConsumed(current, "operators", lv_operators_3_0, "or");
            	            							

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalPascal.g:1169:5: ( (lv_terms_4_0= ruleterm ) )
            	    // InternalPascal.g:1170:6: (lv_terms_4_0= ruleterm )
            	    {
            	    // InternalPascal.g:1170:6: (lv_terms_4_0= ruleterm )
            	    // InternalPascal.g:1171:7: lv_terms_4_0= ruleterm
            	    {

            	    							newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_2_0_1_0());
            	    						
            	    pushFollow(FOLLOW_17);
            	    lv_terms_4_0=ruleterm();

            	    state._fsp--;


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
            	    break;
            	case 2 :
            	    // InternalPascal.g:1190:4: ( (lv_terms_5_0= ruleunsigned_number ) )
            	    {
            	    // InternalPascal.g:1190:4: ( (lv_terms_5_0= ruleunsigned_number ) )
            	    // InternalPascal.g:1191:5: (lv_terms_5_0= ruleunsigned_number )
            	    {
            	    // InternalPascal.g:1191:5: (lv_terms_5_0= ruleunsigned_number )
            	    // InternalPascal.g:1192:6: lv_terms_5_0= ruleunsigned_number
            	    {

            	    						newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsUnsigned_numberParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_terms_5_0=ruleunsigned_number();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalPascal.g:1214:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // InternalPascal.g:1214:45: (iv_ruleterm= ruleterm EOF )
            // InternalPascal.g:1215:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:1221:1: ruleterm returns [EObject current=null] : ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* ) ;
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
            // InternalPascal.g:1227:2: ( ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* ) )
            // InternalPascal.g:1228:2: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* )
            {
            // InternalPascal.g:1228:2: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* )
            // InternalPascal.g:1229:3: ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )*
            {
            // InternalPascal.g:1229:3: ( (lv_factors_0_0= rulefactor ) )
            // InternalPascal.g:1230:4: (lv_factors_0_0= rulefactor )
            {
            // InternalPascal.g:1230:4: (lv_factors_0_0= rulefactor )
            // InternalPascal.g:1231:5: lv_factors_0_0= rulefactor
            {

            					newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_factors_0_0=rulefactor();

            state._fsp--;


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

            // InternalPascal.g:1248:3: ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_MULTIPLICATION_OP||(LA18_0>=36 && LA18_0<=38)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPascal.g:1249:4: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) )
            	    {
            	    // InternalPascal.g:1249:4: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) )
            	    int alt17=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_MULTIPLICATION_OP:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt17=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // InternalPascal.g:1250:5: ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) )
            	            {
            	            // InternalPascal.g:1250:5: ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) )
            	            // InternalPascal.g:1251:6: (lv_operators_1_0= RULE_MULTIPLICATION_OP )
            	            {
            	            // InternalPascal.g:1251:6: (lv_operators_1_0= RULE_MULTIPLICATION_OP )
            	            // InternalPascal.g:1252:7: lv_operators_1_0= RULE_MULTIPLICATION_OP
            	            {
            	            lv_operators_1_0=(Token)match(input,RULE_MULTIPLICATION_OP,FOLLOW_12); 

            	            							newLeafNode(lv_operators_1_0, grammarAccess.getTermAccess().getOperatorsMULTIPLICATION_OPTerminalRuleCall_1_0_0_0());
            	            						

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
            	            break;
            	        case 2 :
            	            // InternalPascal.g:1269:5: ( (lv_operators_2_0= 'div' ) )
            	            {
            	            // InternalPascal.g:1269:5: ( (lv_operators_2_0= 'div' ) )
            	            // InternalPascal.g:1270:6: (lv_operators_2_0= 'div' )
            	            {
            	            // InternalPascal.g:1270:6: (lv_operators_2_0= 'div' )
            	            // InternalPascal.g:1271:7: lv_operators_2_0= 'div'
            	            {
            	            lv_operators_2_0=(Token)match(input,36,FOLLOW_12); 

            	            							newLeafNode(lv_operators_2_0, grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTermRule());
            	            							}
            	            							addWithLastConsumed(current, "operators", lv_operators_2_0, "div");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalPascal.g:1284:5: ( (lv_operators_3_0= 'mod' ) )
            	            {
            	            // InternalPascal.g:1284:5: ( (lv_operators_3_0= 'mod' ) )
            	            // InternalPascal.g:1285:6: (lv_operators_3_0= 'mod' )
            	            {
            	            // InternalPascal.g:1285:6: (lv_operators_3_0= 'mod' )
            	            // InternalPascal.g:1286:7: lv_operators_3_0= 'mod'
            	            {
            	            lv_operators_3_0=(Token)match(input,37,FOLLOW_12); 

            	            							newLeafNode(lv_operators_3_0, grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTermRule());
            	            							}
            	            							addWithLastConsumed(current, "operators", lv_operators_3_0, "mod");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalPascal.g:1299:5: ( (lv_operators_4_0= 'and' ) )
            	            {
            	            // InternalPascal.g:1299:5: ( (lv_operators_4_0= 'and' ) )
            	            // InternalPascal.g:1300:6: (lv_operators_4_0= 'and' )
            	            {
            	            // InternalPascal.g:1300:6: (lv_operators_4_0= 'and' )
            	            // InternalPascal.g:1301:7: lv_operators_4_0= 'and'
            	            {
            	            lv_operators_4_0=(Token)match(input,38,FOLLOW_12); 

            	            							newLeafNode(lv_operators_4_0, grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTermRule());
            	            							}
            	            							addWithLastConsumed(current, "operators", lv_operators_4_0, "and");
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalPascal.g:1314:4: ( (lv_factors_5_0= rulefactor ) )
            	    // InternalPascal.g:1315:5: (lv_factors_5_0= rulefactor )
            	    {
            	    // InternalPascal.g:1315:5: (lv_factors_5_0= rulefactor )
            	    // InternalPascal.g:1316:6: lv_factors_5_0= rulefactor
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_factors_5_0=rulefactor();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalPascal.g:1338:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // InternalPascal.g:1338:47: (iv_rulefactor= rulefactor EOF )
            // InternalPascal.g:1339:2: iv_rulefactor= rulefactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefactor=rulefactor();

            state._fsp--;

             current =iv_rulefactor; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:1345:1: rulefactor returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) ) ;
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
            // InternalPascal.g:1351:2: ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) ) )
            // InternalPascal.g:1352:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) )
            {
            // InternalPascal.g:1352:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) )
            int alt19=10;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalPascal.g:1353:3: ( (lv_variable_0_0= rulevariable ) )
                    {
                    // InternalPascal.g:1353:3: ( (lv_variable_0_0= rulevariable ) )
                    // InternalPascal.g:1354:4: (lv_variable_0_0= rulevariable )
                    {
                    // InternalPascal.g:1354:4: (lv_variable_0_0= rulevariable )
                    // InternalPascal.g:1355:5: lv_variable_0_0= rulevariable
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_0_0=rulevariable();

                    state._fsp--;


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
                    break;
                case 2 :
                    // InternalPascal.g:1373:3: ( (lv_number_1_0= rulenumber ) )
                    {
                    // InternalPascal.g:1373:3: ( (lv_number_1_0= rulenumber ) )
                    // InternalPascal.g:1374:4: (lv_number_1_0= rulenumber )
                    {
                    // InternalPascal.g:1374:4: (lv_number_1_0= rulenumber )
                    // InternalPascal.g:1375:5: lv_number_1_0= rulenumber
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getNumberNumberParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_number_1_0=rulenumber();

                    state._fsp--;


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
                    break;
                case 3 :
                    // InternalPascal.g:1393:3: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalPascal.g:1393:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalPascal.g:1394:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalPascal.g:1394:4: (lv_string_2_0= RULE_STRING )
                    // InternalPascal.g:1395:5: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_2_0, grammarAccess.getFactorAccess().getStringSTRINGTerminalRuleCall_2_0());
                    				

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
                    break;
                case 4 :
                    // InternalPascal.g:1412:3: ( (lv_set_3_0= ruleset ) )
                    {
                    // InternalPascal.g:1412:3: ( (lv_set_3_0= ruleset ) )
                    // InternalPascal.g:1413:4: (lv_set_3_0= ruleset )
                    {
                    // InternalPascal.g:1413:4: (lv_set_3_0= ruleset )
                    // InternalPascal.g:1414:5: lv_set_3_0= ruleset
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getSetSetParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_set_3_0=ruleset();

                    state._fsp--;


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
                    break;
                case 5 :
                    // InternalPascal.g:1432:3: ( (lv_nil_4_0= 'nil' ) )
                    {
                    // InternalPascal.g:1432:3: ( (lv_nil_4_0= 'nil' ) )
                    // InternalPascal.g:1433:4: (lv_nil_4_0= 'nil' )
                    {
                    // InternalPascal.g:1433:4: (lv_nil_4_0= 'nil' )
                    // InternalPascal.g:1434:5: lv_nil_4_0= 'nil'
                    {
                    lv_nil_4_0=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(lv_nil_4_0, grammarAccess.getFactorAccess().getNilNilKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(current, "nil", true, "nil");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:1447:3: ( (lv_boolean_5_0= 'true' ) )
                    {
                    // InternalPascal.g:1447:3: ( (lv_boolean_5_0= 'true' ) )
                    // InternalPascal.g:1448:4: (lv_boolean_5_0= 'true' )
                    {
                    // InternalPascal.g:1448:4: (lv_boolean_5_0= 'true' )
                    // InternalPascal.g:1449:5: lv_boolean_5_0= 'true'
                    {
                    lv_boolean_5_0=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_boolean_5_0, grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(current, "boolean", lv_boolean_5_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalPascal.g:1462:3: ( (lv_boolean_6_0= 'false' ) )
                    {
                    // InternalPascal.g:1462:3: ( (lv_boolean_6_0= 'false' ) )
                    // InternalPascal.g:1463:4: (lv_boolean_6_0= 'false' )
                    {
                    // InternalPascal.g:1463:4: (lv_boolean_6_0= 'false' )
                    // InternalPascal.g:1464:5: lv_boolean_6_0= 'false'
                    {
                    lv_boolean_6_0=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_boolean_6_0, grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(current, "boolean", lv_boolean_6_0, "false");
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalPascal.g:1477:3: ( (lv_function_7_0= rulefunction_designator ) )
                    {
                    // InternalPascal.g:1477:3: ( (lv_function_7_0= rulefunction_designator ) )
                    // InternalPascal.g:1478:4: (lv_function_7_0= rulefunction_designator )
                    {
                    // InternalPascal.g:1478:4: (lv_function_7_0= rulefunction_designator )
                    // InternalPascal.g:1479:5: lv_function_7_0= rulefunction_designator
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getFunctionFunction_designatorParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_function_7_0=rulefunction_designator();

                    state._fsp--;


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
                    break;
                case 9 :
                    // InternalPascal.g:1497:3: (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' )
                    {
                    // InternalPascal.g:1497:3: (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' )
                    // InternalPascal.g:1498:4: otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,42,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_8_0());
                    			
                    // InternalPascal.g:1502:4: ( (lv_expression_9_0= ruleexpression ) )
                    // InternalPascal.g:1503:5: (lv_expression_9_0= ruleexpression )
                    {
                    // InternalPascal.g:1503:5: (lv_expression_9_0= ruleexpression )
                    // InternalPascal.g:1504:6: lv_expression_9_0= ruleexpression
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_expression_9_0=ruleexpression();

                    state._fsp--;


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

                    otherlv_10=(Token)match(input,43,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getFactorAccess().getRightParenthesisKeyword_8_2());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalPascal.g:1527:3: (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) )
                    {
                    // InternalPascal.g:1527:3: (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) )
                    // InternalPascal.g:1528:4: otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) )
                    {
                    otherlv_11=(Token)match(input,44,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getFactorAccess().getNotKeyword_9_0());
                    			
                    // InternalPascal.g:1532:4: ( (lv_not_12_0= rulefactor ) )
                    // InternalPascal.g:1533:5: (lv_not_12_0= rulefactor )
                    {
                    // InternalPascal.g:1533:5: (lv_not_12_0= rulefactor )
                    // InternalPascal.g:1534:6: lv_not_12_0= rulefactor
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getNotFactorParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_not_12_0=rulefactor();

                    state._fsp--;


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
                    break;

            }


            }


            	leaveRule();

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
    // InternalPascal.g:1556:1: entryRulefunction_designator returns [EObject current=null] : iv_rulefunction_designator= rulefunction_designator EOF ;
    public final EObject entryRulefunction_designator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_designator = null;


        try {
            // InternalPascal.g:1556:60: (iv_rulefunction_designator= rulefunction_designator EOF )
            // InternalPascal.g:1557:2: iv_rulefunction_designator= rulefunction_designator EOF
            {
             newCompositeNode(grammarAccess.getFunction_designatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunction_designator=rulefunction_designator();

            state._fsp--;

             current =iv_rulefunction_designator; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:1563:1: rulefunction_designator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' ) ;
    public final EObject rulefunction_designator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1569:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' ) )
            // InternalPascal.g:1570:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' )
            {
            // InternalPascal.g:1570:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' )
            // InternalPascal.g:1571:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')'
            {
            // InternalPascal.g:1571:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:1572:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:1572:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:1573:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFunction_designatorAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,42,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPascal.g:1593:3: ( (lv_expressions_2_0= ruleexpression_list ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_INTEGER_NUMBER)||LA20_0==RULE_ADDITION_OP||LA20_0==RULE_STRING||(LA20_0>=RULE_SIGNED_REAL_NUMBER && LA20_0<=RULE_REAL_NUMBER)||LA20_0==29||(LA20_0>=39 && LA20_0<=42)||LA20_0==44) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPascal.g:1594:4: (lv_expressions_2_0= ruleexpression_list )
                    {
                    // InternalPascal.g:1594:4: (lv_expressions_2_0= ruleexpression_list )
                    // InternalPascal.g:1595:5: lv_expressions_2_0= ruleexpression_list
                    {

                    					newCompositeNode(grammarAccess.getFunction_designatorAccess().getExpressionsExpression_listParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_expressions_2_0=ruleexpression_list();

                    state._fsp--;


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
                    break;

            }

            otherlv_3=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalPascal.g:1620:1: entryRulefunction_procedure_declaration returns [EObject current=null] : iv_rulefunction_procedure_declaration= rulefunction_procedure_declaration EOF ;
    public final EObject entryRulefunction_procedure_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_procedure_declaration = null;


        try {
            // InternalPascal.g:1620:71: (iv_rulefunction_procedure_declaration= rulefunction_procedure_declaration EOF )
            // InternalPascal.g:1621:2: iv_rulefunction_procedure_declaration= rulefunction_procedure_declaration EOF
            {
             newCompositeNode(grammarAccess.getFunction_procedure_declarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunction_procedure_declaration=rulefunction_procedure_declaration();

            state._fsp--;

             current =iv_rulefunction_procedure_declaration; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:1627:1: rulefunction_procedure_declaration returns [EObject current=null] : ( ( ( (lv_procedures_0_0= rulefunction_declaration ) ) | ( (lv_functions_1_0= ruleprocedure_declaration ) ) ) otherlv_2= ';' )+ ;
    public final EObject rulefunction_procedure_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_procedures_0_0 = null;

        EObject lv_functions_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1633:2: ( ( ( ( (lv_procedures_0_0= rulefunction_declaration ) ) | ( (lv_functions_1_0= ruleprocedure_declaration ) ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:1634:2: ( ( ( (lv_procedures_0_0= rulefunction_declaration ) ) | ( (lv_functions_1_0= ruleprocedure_declaration ) ) ) otherlv_2= ';' )+
            {
            // InternalPascal.g:1634:2: ( ( ( (lv_procedures_0_0= rulefunction_declaration ) ) | ( (lv_functions_1_0= ruleprocedure_declaration ) ) ) otherlv_2= ';' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==45||LA22_0==47) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPascal.g:1635:3: ( ( (lv_procedures_0_0= rulefunction_declaration ) ) | ( (lv_functions_1_0= ruleprocedure_declaration ) ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:1635:3: ( ( (lv_procedures_0_0= rulefunction_declaration ) ) | ( (lv_functions_1_0= ruleprocedure_declaration ) ) )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==45) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==47) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalPascal.g:1636:4: ( (lv_procedures_0_0= rulefunction_declaration ) )
            	            {
            	            // InternalPascal.g:1636:4: ( (lv_procedures_0_0= rulefunction_declaration ) )
            	            // InternalPascal.g:1637:5: (lv_procedures_0_0= rulefunction_declaration )
            	            {
            	            // InternalPascal.g:1637:5: (lv_procedures_0_0= rulefunction_declaration )
            	            // InternalPascal.g:1638:6: lv_procedures_0_0= rulefunction_declaration
            	            {

            	            						newCompositeNode(grammarAccess.getFunction_procedure_declarationAccess().getProceduresFunction_declarationParserRuleCall_0_0_0());
            	            					
            	            pushFollow(FOLLOW_6);
            	            lv_procedures_0_0=rulefunction_declaration();

            	            state._fsp--;


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
            	            break;
            	        case 2 :
            	            // InternalPascal.g:1656:4: ( (lv_functions_1_0= ruleprocedure_declaration ) )
            	            {
            	            // InternalPascal.g:1656:4: ( (lv_functions_1_0= ruleprocedure_declaration ) )
            	            // InternalPascal.g:1657:5: (lv_functions_1_0= ruleprocedure_declaration )
            	            {
            	            // InternalPascal.g:1657:5: (lv_functions_1_0= ruleprocedure_declaration )
            	            // InternalPascal.g:1658:6: lv_functions_1_0= ruleprocedure_declaration
            	            {

            	            						newCompositeNode(grammarAccess.getFunction_procedure_declarationAccess().getFunctionsProcedure_declarationParserRuleCall_0_1_0());
            	            					
            	            pushFollow(FOLLOW_6);
            	            lv_functions_1_0=ruleprocedure_declaration();

            	            state._fsp--;


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
            	            break;

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_22); 

            	    			newLeafNode(otherlv_2, grammarAccess.getFunction_procedure_declarationAccess().getSemicolonKeyword_1());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }


            	leaveRule();

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
    // InternalPascal.g:1684:1: entryRulefunction_heading returns [EObject current=null] : iv_rulefunction_heading= rulefunction_heading EOF ;
    public final EObject entryRulefunction_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_heading = null;


        try {
            // InternalPascal.g:1684:57: (iv_rulefunction_heading= rulefunction_heading EOF )
            // InternalPascal.g:1685:2: iv_rulefunction_heading= rulefunction_heading EOF
            {
             newCompositeNode(grammarAccess.getFunction_headingRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunction_heading=rulefunction_heading();

            state._fsp--;

             current =iv_rulefunction_heading; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:1691:1: rulefunction_heading returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) ) ;
    public final EObject rulefunction_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_returnType_4_0=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1697:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) ) )
            // InternalPascal.g:1698:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) )
            {
            // InternalPascal.g:1698:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) )
            // InternalPascal.g:1699:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFunction_headingAccess().getFunctionKeyword_0());
            		
            // InternalPascal.g:1703:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:1704:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:1704:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:1705:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunction_headingAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalPascal.g:1721:3: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPascal.g:1722:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:1722:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:1723:5: lv_parameters_2_0= ruleformal_parameter_list
                    {

                    					newCompositeNode(grammarAccess.getFunction_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_parameters_2_0=ruleformal_parameter_list();

                    state._fsp--;


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
                    break;

            }

            otherlv_3=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getFunction_headingAccess().getColonKeyword_3());
            		
            // InternalPascal.g:1744:3: ( (lv_returnType_4_0= RULE_ID ) )
            // InternalPascal.g:1745:4: (lv_returnType_4_0= RULE_ID )
            {
            // InternalPascal.g:1745:4: (lv_returnType_4_0= RULE_ID )
            // InternalPascal.g:1746:5: lv_returnType_4_0= RULE_ID
            {
            lv_returnType_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_returnType_4_0, grammarAccess.getFunction_headingAccess().getReturnTypeIDTerminalRuleCall_4_0());
            				

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


            	leaveRule();

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
    // InternalPascal.g:1766:1: entryRulefunction_declaration returns [EObject current=null] : iv_rulefunction_declaration= rulefunction_declaration EOF ;
    public final EObject entryRulefunction_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_declaration = null;


        try {
            // InternalPascal.g:1766:61: (iv_rulefunction_declaration= rulefunction_declaration EOF )
            // InternalPascal.g:1767:2: iv_rulefunction_declaration= rulefunction_declaration EOF
            {
             newCompositeNode(grammarAccess.getFunction_declarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunction_declaration=rulefunction_declaration();

            state._fsp--;

             current =iv_rulefunction_declaration; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:1773:1: rulefunction_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) ) ;
    public final EObject rulefunction_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1779:2: ( ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) ) )
            // InternalPascal.g:1780:2: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) )
            {
            // InternalPascal.g:1780:2: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) )
            // InternalPascal.g:1781:3: ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) )
            {
            // InternalPascal.g:1781:3: ( (lv_heading_0_0= rulefunction_heading ) )
            // InternalPascal.g:1782:4: (lv_heading_0_0= rulefunction_heading )
            {
            // InternalPascal.g:1782:4: (lv_heading_0_0= rulefunction_heading )
            // InternalPascal.g:1783:5: lv_heading_0_0= rulefunction_heading
            {

            					newCompositeNode(grammarAccess.getFunction_declarationAccess().getHeadingFunction_headingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_heading_0_0=rulefunction_heading();

            state._fsp--;


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

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_1());
            		
            // InternalPascal.g:1804:3: ( (lv_block_2_0= ruleblock ) )
            // InternalPascal.g:1805:4: (lv_block_2_0= ruleblock )
            {
            // InternalPascal.g:1805:4: (lv_block_2_0= ruleblock )
            // InternalPascal.g:1806:5: lv_block_2_0= ruleblock
            {

            					newCompositeNode(grammarAccess.getFunction_declarationAccess().getBlockBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_2_0=ruleblock();

            state._fsp--;


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


            	leaveRule();

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
    // InternalPascal.g:1827:1: entryRuleformal_parameter_list returns [EObject current=null] : iv_ruleformal_parameter_list= ruleformal_parameter_list EOF ;
    public final EObject entryRuleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_list = null;


        try {
            // InternalPascal.g:1827:62: (iv_ruleformal_parameter_list= ruleformal_parameter_list EOF )
            // InternalPascal.g:1828:2: iv_ruleformal_parameter_list= ruleformal_parameter_list EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleformal_parameter_list=ruleformal_parameter_list();

            state._fsp--;

             current =iv_ruleformal_parameter_list; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:1834:1: ruleformal_parameter_list returns [EObject current=null] : (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1840:2: ( (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) )
            // InternalPascal.g:1841:2: (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            {
            // InternalPascal.g:1841:2: (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            // InternalPascal.g:1842:3: otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0());
            		
            // InternalPascal.g:1846:3: ( (lv_parameters_1_0= ruleformal_parameter_section ) )
            // InternalPascal.g:1847:4: (lv_parameters_1_0= ruleformal_parameter_section )
            {
            // InternalPascal.g:1847:4: (lv_parameters_1_0= ruleformal_parameter_section )
            // InternalPascal.g:1848:5: lv_parameters_1_0= ruleformal_parameter_section
            {

            					newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_parameters_1_0=ruleformal_parameter_section();

            state._fsp--;


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

            // InternalPascal.g:1865:3: (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==24) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPascal.g:1866:4: otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalPascal.g:1870:4: ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    // InternalPascal.g:1871:5: (lv_parameters_3_0= ruleformal_parameter_section )
            	    {
            	    // InternalPascal.g:1871:5: (lv_parameters_3_0= ruleformal_parameter_section )
            	    // InternalPascal.g:1872:6: lv_parameters_3_0= ruleformal_parameter_section
            	    {

            	    						newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_parameters_3_0=ruleformal_parameter_section();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_4=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalPascal.g:1898:1: entryRuleformal_parameter_section returns [EObject current=null] : iv_ruleformal_parameter_section= ruleformal_parameter_section EOF ;
    public final EObject entryRuleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_section = null;


        try {
            // InternalPascal.g:1898:65: (iv_ruleformal_parameter_section= ruleformal_parameter_section EOF )
            // InternalPascal.g:1899:2: iv_ruleformal_parameter_section= ruleformal_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleformal_parameter_section=ruleformal_parameter_section();

            state._fsp--;

             current =iv_ruleformal_parameter_section; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:1905:1: ruleformal_parameter_section returns [EObject current=null] : ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) ;
    public final EObject ruleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_procedure_2_0 = null;

        EObject lv_function_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1911:2: ( ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) )
            // InternalPascal.g:1912:2: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            {
            // InternalPascal.g:1912:2: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt25=1;
                }
                break;
            case 46:
                {
                alt25=2;
                }
                break;
            case 47:
                {
                alt25=3;
                }
                break;
            case 45:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalPascal.g:1913:3: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    {
                    // InternalPascal.g:1913:3: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    // InternalPascal.g:1914:4: (lv_value_0_0= rulevalue_parameter_section )
                    {
                    // InternalPascal.g:1914:4: (lv_value_0_0= rulevalue_parameter_section )
                    // InternalPascal.g:1915:5: lv_value_0_0= rulevalue_parameter_section
                    {

                    					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getValueValue_parameter_sectionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=rulevalue_parameter_section();

                    state._fsp--;


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
                    break;
                case 2 :
                    // InternalPascal.g:1933:3: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    {
                    // InternalPascal.g:1933:3: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    // InternalPascal.g:1934:4: (lv_variable_1_0= rulevariable_parameter_section )
                    {
                    // InternalPascal.g:1934:4: (lv_variable_1_0= rulevariable_parameter_section )
                    // InternalPascal.g:1935:5: lv_variable_1_0= rulevariable_parameter_section
                    {

                    					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getVariableVariable_parameter_sectionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_1_0=rulevariable_parameter_section();

                    state._fsp--;


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
                    break;
                case 3 :
                    // InternalPascal.g:1953:3: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    {
                    // InternalPascal.g:1953:3: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    // InternalPascal.g:1954:4: (lv_procedure_2_0= ruleprocedure_heading )
                    {
                    // InternalPascal.g:1954:4: (lv_procedure_2_0= ruleprocedure_heading )
                    // InternalPascal.g:1955:5: lv_procedure_2_0= ruleprocedure_heading
                    {

                    					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getProcedureProcedure_headingParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_procedure_2_0=ruleprocedure_heading();

                    state._fsp--;


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
                    break;
                case 4 :
                    // InternalPascal.g:1973:3: ( (lv_function_3_0= rulefunction_heading ) )
                    {
                    // InternalPascal.g:1973:3: ( (lv_function_3_0= rulefunction_heading ) )
                    // InternalPascal.g:1974:4: (lv_function_3_0= rulefunction_heading )
                    {
                    // InternalPascal.g:1974:4: (lv_function_3_0= rulefunction_heading )
                    // InternalPascal.g:1975:5: lv_function_3_0= rulefunction_heading
                    {

                    					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getFunctionFunction_headingParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_function_3_0=rulefunction_heading();

                    state._fsp--;


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
                    break;

            }


            }


            	leaveRule();

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
    // InternalPascal.g:1996:1: entryRulevalue_parameter_section returns [EObject current=null] : iv_rulevalue_parameter_section= rulevalue_parameter_section EOF ;
    public final EObject entryRulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalue_parameter_section = null;


        try {
            // InternalPascal.g:1996:64: (iv_rulevalue_parameter_section= rulevalue_parameter_section EOF )
            // InternalPascal.g:1997:2: iv_rulevalue_parameter_section= rulevalue_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getValue_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevalue_parameter_section=rulevalue_parameter_section();

            state._fsp--;

             current =iv_rulevalue_parameter_section; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:2003:1: rulevalue_parameter_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) ) ;
    public final EObject rulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2009:2: ( ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:2010:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:2010:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) )
            // InternalPascal.g:2011:3: ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) )
            {
            // InternalPascal.g:2011:3: ( (lv_identifiers_0_0= ruleidentifier_list ) )
            // InternalPascal.g:2012:4: (lv_identifiers_0_0= ruleidentifier_list )
            {
            // InternalPascal.g:2012:4: (lv_identifiers_0_0= ruleidentifier_list )
            // InternalPascal.g:2013:5: lv_identifiers_0_0= ruleidentifier_list
            {

            					newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_identifiers_0_0=ruleidentifier_list();

            state._fsp--;


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

            otherlv_1=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1());
            		
            // InternalPascal.g:2034:3: ( (lv_type_2_0= ruleparameter_type ) )
            // InternalPascal.g:2035:4: (lv_type_2_0= ruleparameter_type )
            {
            // InternalPascal.g:2035:4: (lv_type_2_0= ruleparameter_type )
            // InternalPascal.g:2036:5: lv_type_2_0= ruleparameter_type
            {

            					newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleparameter_type();

            state._fsp--;


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


            	leaveRule();

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
    // InternalPascal.g:2057:1: entryRuleidentifier_list returns [EObject current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final EObject entryRuleidentifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifier_list = null;


        try {
            // InternalPascal.g:2057:56: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // InternalPascal.g:2058:2: iv_ruleidentifier_list= ruleidentifier_list EOF
            {
             newCompositeNode(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleidentifier_list=ruleidentifier_list();

            state._fsp--;

             current =iv_ruleidentifier_list; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:2064:1: ruleidentifier_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleidentifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;


        	enterRule();

        try {
            // InternalPascal.g:2070:2: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // InternalPascal.g:2071:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // InternalPascal.g:2071:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            // InternalPascal.g:2072:3: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // InternalPascal.g:2072:3: ( (lv_names_0_0= RULE_ID ) )
            // InternalPascal.g:2073:4: (lv_names_0_0= RULE_ID )
            {
            // InternalPascal.g:2073:4: (lv_names_0_0= RULE_ID )
            // InternalPascal.g:2074:5: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_names_0_0, grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_0_0());
            				

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

            // InternalPascal.g:2090:3: (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==32) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPascal.g:2091:4: otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,32,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:2095:4: ( (lv_names_2_0= RULE_ID ) )
            	    // InternalPascal.g:2096:5: (lv_names_2_0= RULE_ID )
            	    {
            	    // InternalPascal.g:2096:5: (lv_names_2_0= RULE_ID )
            	    // InternalPascal.g:2097:6: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    						newLeafNode(lv_names_2_0, grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_1_1_0());
            	    					

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
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalPascal.g:2118:1: entryRuleparameter_type returns [EObject current=null] : iv_ruleparameter_type= ruleparameter_type EOF ;
    public final EObject entryRuleparameter_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_type = null;


        try {
            // InternalPascal.g:2118:55: (iv_ruleparameter_type= ruleparameter_type EOF )
            // InternalPascal.g:2119:2: iv_ruleparameter_type= ruleparameter_type EOF
            {
             newCompositeNode(grammarAccess.getParameter_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleparameter_type=ruleparameter_type();

            state._fsp--;

             current =iv_ruleparameter_type; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:2125:1: ruleparameter_type returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleparameter_type() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPascal.g:2131:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPascal.g:2132:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPascal.g:2132:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:2133:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:2133:3: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:2134:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getParameter_typeAccess().getNameIDTerminalRuleCall_0());
            			

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


            	leaveRule();

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
    // InternalPascal.g:2153:1: entryRulevariable_parameter_section returns [EObject current=null] : iv_rulevariable_parameter_section= rulevariable_parameter_section EOF ;
    public final EObject entryRulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_parameter_section = null;


        try {
            // InternalPascal.g:2153:67: (iv_rulevariable_parameter_section= rulevariable_parameter_section EOF )
            // InternalPascal.g:2154:2: iv_rulevariable_parameter_section= rulevariable_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getVariable_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_parameter_section=rulevariable_parameter_section();

            state._fsp--;

             current =iv_rulevariable_parameter_section; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:2160:1: rulevariable_parameter_section returns [EObject current=null] : (otherlv_0= 'var' ( (lv_indentifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) ) ;
    public final EObject rulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_indentifiers_1_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2166:2: ( (otherlv_0= 'var' ( (lv_indentifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:2167:2: (otherlv_0= 'var' ( (lv_indentifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:2167:2: (otherlv_0= 'var' ( (lv_indentifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) )
            // InternalPascal.g:2168:3: otherlv_0= 'var' ( (lv_indentifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0());
            		
            // InternalPascal.g:2172:3: ( (lv_indentifiers_1_0= ruleidentifier_list ) )
            // InternalPascal.g:2173:4: (lv_indentifiers_1_0= ruleidentifier_list )
            {
            // InternalPascal.g:2173:4: (lv_indentifiers_1_0= ruleidentifier_list )
            // InternalPascal.g:2174:5: lv_indentifiers_1_0= ruleidentifier_list
            {

            					newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getIndentifiersIdentifier_listParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_indentifiers_1_0=ruleidentifier_list();

            state._fsp--;


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

            otherlv_2=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2());
            		
            // InternalPascal.g:2195:3: ( (lv_type_3_0= ruleparameter_type ) )
            // InternalPascal.g:2196:4: (lv_type_3_0= ruleparameter_type )
            {
            // InternalPascal.g:2196:4: (lv_type_3_0= ruleparameter_type )
            // InternalPascal.g:2197:5: lv_type_3_0= ruleparameter_type
            {

            					newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleparameter_type();

            state._fsp--;


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


            	leaveRule();

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
    // InternalPascal.g:2218:1: entryRuleprocedure_declaration returns [EObject current=null] : iv_ruleprocedure_declaration= ruleprocedure_declaration EOF ;
    public final EObject entryRuleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_declaration = null;


        try {
            // InternalPascal.g:2218:62: (iv_ruleprocedure_declaration= ruleprocedure_declaration EOF )
            // InternalPascal.g:2219:2: iv_ruleprocedure_declaration= ruleprocedure_declaration EOF
            {
             newCompositeNode(grammarAccess.getProcedure_declarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_declaration=ruleprocedure_declaration();

            state._fsp--;

             current =iv_ruleprocedure_declaration; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:2225:1: ruleprocedure_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) ) ;
    public final EObject ruleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2231:2: ( ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) ) )
            // InternalPascal.g:2232:2: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) )
            {
            // InternalPascal.g:2232:2: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) )
            // InternalPascal.g:2233:3: ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) )
            {
            // InternalPascal.g:2233:3: ( (lv_heading_0_0= ruleprocedure_heading ) )
            // InternalPascal.g:2234:4: (lv_heading_0_0= ruleprocedure_heading )
            {
            // InternalPascal.g:2234:4: (lv_heading_0_0= ruleprocedure_heading )
            // InternalPascal.g:2235:5: lv_heading_0_0= ruleprocedure_heading
            {

            					newCompositeNode(grammarAccess.getProcedure_declarationAccess().getHeadingProcedure_headingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_heading_0_0=ruleprocedure_heading();

            state._fsp--;


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

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_1());
            		
            // InternalPascal.g:2256:3: ( (lv_block_2_0= ruleblock ) )
            // InternalPascal.g:2257:4: (lv_block_2_0= ruleblock )
            {
            // InternalPascal.g:2257:4: (lv_block_2_0= ruleblock )
            // InternalPascal.g:2258:5: lv_block_2_0= ruleblock
            {

            					newCompositeNode(grammarAccess.getProcedure_declarationAccess().getBlockBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_2_0=ruleblock();

            state._fsp--;


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


            	leaveRule();

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
    // InternalPascal.g:2279:1: entryRuleprocedure_heading returns [EObject current=null] : iv_ruleprocedure_heading= ruleprocedure_heading EOF ;
    public final EObject entryRuleprocedure_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_heading = null;


        try {
            // InternalPascal.g:2279:58: (iv_ruleprocedure_heading= ruleprocedure_heading EOF )
            // InternalPascal.g:2280:2: iv_ruleprocedure_heading= ruleprocedure_heading EOF
            {
             newCompositeNode(grammarAccess.getProcedure_headingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_heading=ruleprocedure_heading();

            state._fsp--;

             current =iv_ruleprocedure_heading; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:2286:1: ruleprocedure_heading returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) ;
    public final EObject ruleprocedure_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2292:2: ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) )
            // InternalPascal.g:2293:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            {
            // InternalPascal.g:2293:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            // InternalPascal.g:2294:3: otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0());
            		
            // InternalPascal.g:2298:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:2299:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:2299:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:2300:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcedure_headingAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalPascal.g:2316:3: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPascal.g:2317:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:2317:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:2318:5: lv_parameters_2_0= ruleformal_parameter_list
                    {

                    					newCompositeNode(grammarAccess.getProcedure_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parameters_2_0=ruleformal_parameter_list();

                    state._fsp--;


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
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalPascal.g:2339:1: entryRuleset returns [EObject current=null] : iv_ruleset= ruleset EOF ;
    public final EObject entryRuleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset = null;


        try {
            // InternalPascal.g:2339:44: (iv_ruleset= ruleset EOF )
            // InternalPascal.g:2340:2: iv_ruleset= ruleset EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleset=ruleset();

            state._fsp--;

             current =iv_ruleset; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:2346:1: ruleset returns [EObject current=null] : ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) ) ;
    public final EObject ruleset() throws RecognitionException {
        EObject current = null;

        Token lv_brackets_0_0=null;
        Token lv_brackets_2_0=null;
        EObject lv_expressions_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2352:2: ( ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) ) )
            // InternalPascal.g:2353:2: ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) )
            {
            // InternalPascal.g:2353:2: ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) )
            // InternalPascal.g:2354:3: ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) )
            {
            // InternalPascal.g:2354:3: ( (lv_brackets_0_0= '[' ) )
            // InternalPascal.g:2355:4: (lv_brackets_0_0= '[' )
            {
            // InternalPascal.g:2355:4: (lv_brackets_0_0= '[' )
            // InternalPascal.g:2356:5: lv_brackets_0_0= '['
            {
            lv_brackets_0_0=(Token)match(input,29,FOLLOW_27); 

            					newLeafNode(lv_brackets_0_0, grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetRule());
            					}
            					addWithLastConsumed(current, "brackets", lv_brackets_0_0, "[");
            				

            }


            }

            // InternalPascal.g:2368:3: ( (lv_expressions_1_0= ruleexpression_list ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_INTEGER_NUMBER)||LA28_0==RULE_ADDITION_OP||LA28_0==RULE_STRING||(LA28_0>=RULE_SIGNED_REAL_NUMBER && LA28_0<=RULE_REAL_NUMBER)||LA28_0==29||(LA28_0>=39 && LA28_0<=42)||LA28_0==44) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPascal.g:2369:4: (lv_expressions_1_0= ruleexpression_list )
                    {
                    // InternalPascal.g:2369:4: (lv_expressions_1_0= ruleexpression_list )
                    // InternalPascal.g:2370:5: lv_expressions_1_0= ruleexpression_list
                    {

                    					newCompositeNode(grammarAccess.getSetAccess().getExpressionsExpression_listParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_expressions_1_0=ruleexpression_list();

                    state._fsp--;


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
                    break;

            }

            // InternalPascal.g:2387:3: ( (lv_brackets_2_0= ']' ) )
            // InternalPascal.g:2388:4: (lv_brackets_2_0= ']' )
            {
            // InternalPascal.g:2388:4: (lv_brackets_2_0= ']' )
            // InternalPascal.g:2389:5: lv_brackets_2_0= ']'
            {
            lv_brackets_2_0=(Token)match(input,30,FOLLOW_2); 

            					newLeafNode(lv_brackets_2_0, grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetRule());
            					}
            					addWithLastConsumed(current, "brackets", lv_brackets_2_0, "]");
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalPascal.g:2405:1: entryRulenumber returns [EObject current=null] : iv_rulenumber= rulenumber EOF ;
    public final EObject entryRulenumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumber = null;


        try {
            // InternalPascal.g:2405:47: (iv_rulenumber= rulenumber EOF )
            // InternalPascal.g:2406:2: iv_rulenumber= rulenumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulenumber=rulenumber();

            state._fsp--;

             current =iv_rulenumber; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:2412:1: rulenumber returns [EObject current=null] : ( (lv_number_0_0= ruleany_number ) ) ;
    public final EObject rulenumber() throws RecognitionException {
        EObject current = null;

        EObject lv_number_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2418:2: ( ( (lv_number_0_0= ruleany_number ) ) )
            // InternalPascal.g:2419:2: ( (lv_number_0_0= ruleany_number ) )
            {
            // InternalPascal.g:2419:2: ( (lv_number_0_0= ruleany_number ) )
            // InternalPascal.g:2420:3: (lv_number_0_0= ruleany_number )
            {
            // InternalPascal.g:2420:3: (lv_number_0_0= ruleany_number )
            // InternalPascal.g:2421:4: lv_number_0_0= ruleany_number
            {

            				newCompositeNode(grammarAccess.getNumberAccess().getNumberAny_numberParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_number_0_0=ruleany_number();

            state._fsp--;


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


            	leaveRule();

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
    // InternalPascal.g:2441:1: entryRuleany_number returns [EObject current=null] : iv_ruleany_number= ruleany_number EOF ;
    public final EObject entryRuleany_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleany_number = null;


        try {
            // InternalPascal.g:2441:51: (iv_ruleany_number= ruleany_number EOF )
            // InternalPascal.g:2442:2: iv_ruleany_number= ruleany_number EOF
            {
             newCompositeNode(grammarAccess.getAny_numberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleany_number=ruleany_number();

            state._fsp--;

             current =iv_ruleany_number; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:2448:1: ruleany_number returns [EObject current=null] : (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) ;
    public final EObject ruleany_number() throws RecognitionException {
        EObject current = null;

        EObject this_unsigned_number_0 = null;

        EObject this_signed_number_1 = null;



        	enterRule();

        try {
            // InternalPascal.g:2454:2: ( (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) )
            // InternalPascal.g:2455:2: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            {
            // InternalPascal.g:2455:2: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INTEGER_NUMBER||LA29_0==RULE_REAL_NUMBER) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_SIGNED_INTEGER_NUMBER||LA29_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalPascal.g:2456:3: this_unsigned_number_0= ruleunsigned_number
                    {

                    			newCompositeNode(grammarAccess.getAny_numberAccess().getUnsigned_numberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_unsigned_number_0=ruleunsigned_number();

                    state._fsp--;


                    			current = this_unsigned_number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:2465:3: this_signed_number_1= rulesigned_number
                    {

                    			newCompositeNode(grammarAccess.getAny_numberAccess().getSigned_numberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_signed_number_1=rulesigned_number();

                    state._fsp--;


                    			current = this_signed_number_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalPascal.g:2477:1: entryRulelabel_declaration returns [EObject current=null] : iv_rulelabel_declaration= rulelabel_declaration EOF ;
    public final EObject entryRulelabel_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel_declaration = null;


        try {
            // InternalPascal.g:2477:58: (iv_rulelabel_declaration= rulelabel_declaration EOF )
            // InternalPascal.g:2478:2: iv_rulelabel_declaration= rulelabel_declaration EOF
            {
             newCompositeNode(grammarAccess.getLabel_declarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelabel_declaration=rulelabel_declaration();

            state._fsp--;

             current =iv_rulelabel_declaration; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:2484:1: rulelabel_declaration returns [EObject current=null] : (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' ) ;
    public final EObject rulelabel_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_labels_1_0 = null;

        EObject lv_labels_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2490:2: ( (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' ) )
            // InternalPascal.g:2491:2: (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' )
            {
            // InternalPascal.g:2491:2: (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' )
            // InternalPascal.g:2492:3: otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getLabel_declarationAccess().getLabelKeyword_0());
            		
            // InternalPascal.g:2496:3: ( (lv_labels_1_0= rulelabel ) )
            // InternalPascal.g:2497:4: (lv_labels_1_0= rulelabel )
            {
            // InternalPascal.g:2497:4: (lv_labels_1_0= rulelabel )
            // InternalPascal.g:2498:5: lv_labels_1_0= rulelabel
            {

            					newCompositeNode(grammarAccess.getLabel_declarationAccess().getLabelsLabelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_labels_1_0=rulelabel();

            state._fsp--;


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

            // InternalPascal.g:2515:3: (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==32) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPascal.g:2516:4: otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_28); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLabel_declarationAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalPascal.g:2520:4: ( (lv_labels_3_0= rulelabel ) )
            	    // InternalPascal.g:2521:5: (lv_labels_3_0= rulelabel )
            	    {
            	    // InternalPascal.g:2521:5: (lv_labels_3_0= rulelabel )
            	    // InternalPascal.g:2522:6: lv_labels_3_0= rulelabel
            	    {

            	    						newCompositeNode(grammarAccess.getLabel_declarationAccess().getLabelsLabelParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_labels_3_0=rulelabel();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLabel_declarationAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalPascal.g:2548:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // InternalPascal.g:2548:49: (iv_ruleconstant= ruleconstant EOF )
            // InternalPascal.g:2549:2: iv_ruleconstant= ruleconstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstant=ruleconstant();

            state._fsp--;

             current =iv_ruleconstant; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:2555:1: ruleconstant returns [EObject current=null] : ( ( ( (lv_opterator_0_0= RULE_ADDITION_OP ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) ) ;
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
            // InternalPascal.g:2561:2: ( ( ( ( (lv_opterator_0_0= RULE_ADDITION_OP ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) ) )
            // InternalPascal.g:2562:2: ( ( ( (lv_opterator_0_0= RULE_ADDITION_OP ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) )
            {
            // InternalPascal.g:2562:2: ( ( ( (lv_opterator_0_0= RULE_ADDITION_OP ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) )
            int alt33=4;
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
            case 40:
                {
                alt33=3;
                }
                break;
            case 41:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalPascal.g:2563:3: ( ( (lv_opterator_0_0= RULE_ADDITION_OP ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    {
                    // InternalPascal.g:2563:3: ( ( (lv_opterator_0_0= RULE_ADDITION_OP ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    // InternalPascal.g:2564:4: ( (lv_opterator_0_0= RULE_ADDITION_OP ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    {
                    // InternalPascal.g:2564:4: ( (lv_opterator_0_0= RULE_ADDITION_OP ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_ADDITION_OP) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalPascal.g:2565:5: (lv_opterator_0_0= RULE_ADDITION_OP )
                            {
                            // InternalPascal.g:2565:5: (lv_opterator_0_0= RULE_ADDITION_OP )
                            // InternalPascal.g:2566:6: lv_opterator_0_0= RULE_ADDITION_OP
                            {
                            lv_opterator_0_0=(Token)match(input,RULE_ADDITION_OP,FOLLOW_30); 

                            						newLeafNode(lv_opterator_0_0, grammarAccess.getConstantAccess().getOpteratorADDITION_OPTerminalRuleCall_0_0_0());
                            					

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
                            break;

                    }

                    // InternalPascal.g:2582:4: ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID) ) {
                        alt32=1;
                    }
                    else if ( ((LA32_0>=RULE_SIGNED_INTEGER_NUMBER && LA32_0<=RULE_INTEGER_NUMBER)||(LA32_0>=RULE_SIGNED_REAL_NUMBER && LA32_0<=RULE_REAL_NUMBER)) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalPascal.g:2583:5: ( (lv_name_1_0= RULE_ID ) )
                            {
                            // InternalPascal.g:2583:5: ( (lv_name_1_0= RULE_ID ) )
                            // InternalPascal.g:2584:6: (lv_name_1_0= RULE_ID )
                            {
                            // InternalPascal.g:2584:6: (lv_name_1_0= RULE_ID )
                            // InternalPascal.g:2585:7: lv_name_1_0= RULE_ID
                            {
                            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_name_1_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0_1_0_0());
                            						

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
                            break;
                        case 2 :
                            // InternalPascal.g:2602:5: ( (lv_number_2_0= rulenumber ) )
                            {
                            // InternalPascal.g:2602:5: ( (lv_number_2_0= rulenumber ) )
                            // InternalPascal.g:2603:6: (lv_number_2_0= rulenumber )
                            {
                            // InternalPascal.g:2603:6: (lv_number_2_0= rulenumber )
                            // InternalPascal.g:2604:7: lv_number_2_0= rulenumber
                            {

                            							newCompositeNode(grammarAccess.getConstantAccess().getNumberNumberParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_number_2_0=rulenumber();

                            state._fsp--;


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
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2624:3: ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // InternalPascal.g:2624:3: ( (lv_string_3_0= RULE_STRING ) )
                    // InternalPascal.g:2625:4: (lv_string_3_0= RULE_STRING )
                    {
                    // InternalPascal.g:2625:4: (lv_string_3_0= RULE_STRING )
                    // InternalPascal.g:2626:5: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_3_0, grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_1_0());
                    				

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
                    break;
                case 3 :
                    // InternalPascal.g:2643:3: ( (lv_boolLiteral_4_0= 'true' ) )
                    {
                    // InternalPascal.g:2643:3: ( (lv_boolLiteral_4_0= 'true' ) )
                    // InternalPascal.g:2644:4: (lv_boolLiteral_4_0= 'true' )
                    {
                    // InternalPascal.g:2644:4: (lv_boolLiteral_4_0= 'true' )
                    // InternalPascal.g:2645:5: lv_boolLiteral_4_0= 'true'
                    {
                    lv_boolLiteral_4_0=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_boolLiteral_4_0, grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(current, "boolLiteral", lv_boolLiteral_4_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:2658:3: ( (lv_boolLiteral_5_0= 'false' ) )
                    {
                    // InternalPascal.g:2658:3: ( (lv_boolLiteral_5_0= 'false' ) )
                    // InternalPascal.g:2659:4: (lv_boolLiteral_5_0= 'false' )
                    {
                    // InternalPascal.g:2659:4: (lv_boolLiteral_5_0= 'false' )
                    // InternalPascal.g:2660:5: lv_boolLiteral_5_0= 'false'
                    {
                    lv_boolLiteral_5_0=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_boolLiteral_5_0, grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(current, "boolLiteral", lv_boolLiteral_5_0, "false");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalPascal.g:2676:1: entryRuleconstant_definition_part returns [EObject current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final EObject entryRuleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition_part = null;


        try {
            // InternalPascal.g:2676:65: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // InternalPascal.g:2677:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
            {
             newCompositeNode(grammarAccess.getConstant_definition_partRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstant_definition_part=ruleconstant_definition_part();

            state._fsp--;

             current =iv_ruleconstant_definition_part; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:2683:1: ruleconstant_definition_part returns [EObject current=null] : (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_consts_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2689:2: ( (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ ) )
            // InternalPascal.g:2690:2: (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ )
            {
            // InternalPascal.g:2690:2: (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:2691:3: otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,49,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConstant_definition_partAccess().getConstKeyword_0());
            		
            // InternalPascal.g:2695:3: ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+
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
            	    // InternalPascal.g:2696:4: ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:2696:4: ( (lv_consts_1_0= ruleconstant_definition ) )
            	    // InternalPascal.g:2697:5: (lv_consts_1_0= ruleconstant_definition )
            	    {
            	    // InternalPascal.g:2697:5: (lv_consts_1_0= ruleconstant_definition )
            	    // InternalPascal.g:2698:6: lv_consts_1_0= ruleconstant_definition
            	    {

            	    						newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstsConstant_definitionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_consts_1_0=ruleconstant_definition();

            	    state._fsp--;


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

            	    otherlv_2=(Token)match(input,24,FOLLOW_31); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalPascal.g:2724:1: entryRuleconstant_definition returns [EObject current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final EObject entryRuleconstant_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition = null;


        try {
            // InternalPascal.g:2724:60: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // InternalPascal.g:2725:2: iv_ruleconstant_definition= ruleconstant_definition EOF
            {
             newCompositeNode(grammarAccess.getConstant_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstant_definition=ruleconstant_definition();

            state._fsp--;

             current =iv_ruleconstant_definition; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:2731:1: ruleconstant_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) ) ;
    public final EObject ruleconstant_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_const_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2737:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) ) )
            // InternalPascal.g:2738:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) )
            {
            // InternalPascal.g:2738:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) )
            // InternalPascal.g:2739:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) )
            {
            // InternalPascal.g:2739:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:2740:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:2740:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:2741:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConstant_definitionAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,34,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1());
            		
            // InternalPascal.g:2761:3: ( (lv_const_2_0= ruleconstant ) )
            // InternalPascal.g:2762:4: (lv_const_2_0= ruleconstant )
            {
            // InternalPascal.g:2762:4: (lv_const_2_0= ruleconstant )
            // InternalPascal.g:2763:5: lv_const_2_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getConstant_definitionAccess().getConstConstantParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_const_2_0=ruleconstant();

            state._fsp--;


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


            	leaveRule();

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
    // InternalPascal.g:2784:1: entryRuletype_definition_part returns [EObject current=null] : iv_ruletype_definition_part= ruletype_definition_part EOF ;
    public final EObject entryRuletype_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition_part = null;


        try {
            // InternalPascal.g:2784:61: (iv_ruletype_definition_part= ruletype_definition_part EOF )
            // InternalPascal.g:2785:2: iv_ruletype_definition_part= ruletype_definition_part EOF
            {
             newCompositeNode(grammarAccess.getType_definition_partRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype_definition_part=ruletype_definition_part();

            state._fsp--;

             current =iv_ruletype_definition_part; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:2791:1: ruletype_definition_part returns [EObject current=null] : (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruletype_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2797:2: ( (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ ) )
            // InternalPascal.g:2798:2: (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ )
            {
            // InternalPascal.g:2798:2: (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:2799:3: otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,50,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getType_definition_partAccess().getTypeKeyword_0());
            		
            // InternalPascal.g:2803:3: ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+
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
            	    // InternalPascal.g:2804:4: ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:2804:4: ( (lv_types_1_0= ruletype_definition ) )
            	    // InternalPascal.g:2805:5: (lv_types_1_0= ruletype_definition )
            	    {
            	    // InternalPascal.g:2805:5: (lv_types_1_0= ruletype_definition )
            	    // InternalPascal.g:2806:6: lv_types_1_0= ruletype_definition
            	    {

            	    						newCompositeNode(grammarAccess.getType_definition_partAccess().getTypesType_definitionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_types_1_0=ruletype_definition();

            	    state._fsp--;


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

            	    otherlv_2=(Token)match(input,24,FOLLOW_31); 

            	    				newLeafNode(otherlv_2, grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalPascal.g:2832:1: entryRuletype_definition returns [EObject current=null] : iv_ruletype_definition= ruletype_definition EOF ;
    public final EObject entryRuletype_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition = null;


        try {
            // InternalPascal.g:2832:56: (iv_ruletype_definition= ruletype_definition EOF )
            // InternalPascal.g:2833:2: iv_ruletype_definition= ruletype_definition EOF
            {
             newCompositeNode(grammarAccess.getType_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype_definition=ruletype_definition();

            state._fsp--;

             current =iv_ruletype_definition; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:2839:1: ruletype_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruletype_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2845:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:2846:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:2846:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:2847:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:2847:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:2848:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:2848:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:2849:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_name_0_0, grammarAccess.getType_definitionAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,34,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1());
            		
            // InternalPascal.g:2869:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:2870:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:2870:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:2871:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getType_definitionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


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


            	leaveRule();

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
    // InternalPascal.g:2892:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // InternalPascal.g:2892:45: (iv_ruletype= ruletype EOF )
            // InternalPascal.g:2893:2: iv_ruletype= ruletype EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype=ruletype();

            state._fsp--;

             current =iv_ruletype; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:2899:1: ruletype returns [EObject current=null] : ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestrutured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        EObject lv_structured_1_0 = null;

        EObject lv_pointer_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2905:2: ( ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestrutured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) ) )
            // InternalPascal.g:2906:2: ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestrutured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) )
            {
            // InternalPascal.g:2906:2: ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestrutured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OP:
            case RULE_STRING:
            case RULE_NUMERIC_SUBRANGE:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_REAL_NUMBER:
            case 40:
            case 41:
            case 42:
                {
                alt36=1;
                }
                break;
            case 52:
            case 53:
                {
                alt36=2;
                }
                break;
            case 31:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalPascal.g:2907:3: ( (lv_simple_0_0= rulesimple_type ) )
                    {
                    // InternalPascal.g:2907:3: ( (lv_simple_0_0= rulesimple_type ) )
                    // InternalPascal.g:2908:4: (lv_simple_0_0= rulesimple_type )
                    {
                    // InternalPascal.g:2908:4: (lv_simple_0_0= rulesimple_type )
                    // InternalPascal.g:2909:5: lv_simple_0_0= rulesimple_type
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getSimpleSimple_typeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_simple_0_0=rulesimple_type();

                    state._fsp--;


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
                    break;
                case 2 :
                    // InternalPascal.g:2927:3: ( (lv_structured_1_0= rulestrutured_type ) )
                    {
                    // InternalPascal.g:2927:3: ( (lv_structured_1_0= rulestrutured_type ) )
                    // InternalPascal.g:2928:4: (lv_structured_1_0= rulestrutured_type )
                    {
                    // InternalPascal.g:2928:4: (lv_structured_1_0= rulestrutured_type )
                    // InternalPascal.g:2929:5: lv_structured_1_0= rulestrutured_type
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getStructuredStrutured_typeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_structured_1_0=rulestrutured_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"structured",
                    						lv_structured_1_0,
                    						"org.xtext.example.pascal.Pascal.strutured_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2947:3: ( (lv_pointer_2_0= rulepointer_type ) )
                    {
                    // InternalPascal.g:2947:3: ( (lv_pointer_2_0= rulepointer_type ) )
                    // InternalPascal.g:2948:4: (lv_pointer_2_0= rulepointer_type )
                    {
                    // InternalPascal.g:2948:4: (lv_pointer_2_0= rulepointer_type )
                    // InternalPascal.g:2949:5: lv_pointer_2_0= rulepointer_type
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getPointerPointer_typeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_pointer_2_0=rulepointer_type();

                    state._fsp--;


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
                    break;

            }


            }


            	leaveRule();

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
    // InternalPascal.g:2970:1: entryRulesimple_type returns [EObject current=null] : iv_rulesimple_type= rulesimple_type EOF ;
    public final EObject entryRulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_type = null;


        try {
            // InternalPascal.g:2970:52: (iv_rulesimple_type= rulesimple_type EOF )
            // InternalPascal.g:2971:2: iv_rulesimple_type= rulesimple_type EOF
            {
             newCompositeNode(grammarAccess.getSimple_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimple_type=rulesimple_type();

            state._fsp--;

             current =iv_rulesimple_type; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:2977:1: rulesimple_type returns [EObject current=null] : ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulesimple_type() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_subrange_0_0 = null;

        EObject lv_enumerated_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2983:2: ( ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalPascal.g:2984:2: ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalPascal.g:2984:2: ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OP:
            case RULE_STRING:
            case RULE_NUMERIC_SUBRANGE:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_REAL_NUMBER:
            case 40:
            case 41:
                {
                alt37=1;
                }
                break;
            case RULE_ID:
                {
                int LA37_2 = input.LA(2);

                if ( (LA37_2==51) ) {
                    alt37=1;
                }
                else if ( (LA37_2==EOF||LA37_2==24) ) {
                    alt37=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                alt37=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalPascal.g:2985:3: ( (lv_subrange_0_0= rulesubrange_type ) )
                    {
                    // InternalPascal.g:2985:3: ( (lv_subrange_0_0= rulesubrange_type ) )
                    // InternalPascal.g:2986:4: (lv_subrange_0_0= rulesubrange_type )
                    {
                    // InternalPascal.g:2986:4: (lv_subrange_0_0= rulesubrange_type )
                    // InternalPascal.g:2987:5: lv_subrange_0_0= rulesubrange_type
                    {

                    					newCompositeNode(grammarAccess.getSimple_typeAccess().getSubrangeSubrange_typeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subrange_0_0=rulesubrange_type();

                    state._fsp--;


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
                    break;
                case 2 :
                    // InternalPascal.g:3005:3: ( (lv_enumerated_1_0= ruleenumerated_type ) )
                    {
                    // InternalPascal.g:3005:3: ( (lv_enumerated_1_0= ruleenumerated_type ) )
                    // InternalPascal.g:3006:4: (lv_enumerated_1_0= ruleenumerated_type )
                    {
                    // InternalPascal.g:3006:4: (lv_enumerated_1_0= ruleenumerated_type )
                    // InternalPascal.g:3007:5: lv_enumerated_1_0= ruleenumerated_type
                    {

                    					newCompositeNode(grammarAccess.getSimple_typeAccess().getEnumeratedEnumerated_typeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_enumerated_1_0=ruleenumerated_type();

                    state._fsp--;


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
                    break;
                case 3 :
                    // InternalPascal.g:3025:3: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // InternalPascal.g:3025:3: ( (lv_name_2_0= RULE_ID ) )
                    // InternalPascal.g:3026:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalPascal.g:3026:4: (lv_name_2_0= RULE_ID )
                    // InternalPascal.g:3027:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getSimple_typeAccess().getNameIDTerminalRuleCall_2_0());
                    				

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
                    break;

            }


            }


            	leaveRule();

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
    // InternalPascal.g:3047:1: entryRulesubrange_type returns [EObject current=null] : iv_rulesubrange_type= rulesubrange_type EOF ;
    public final EObject entryRulesubrange_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubrange_type = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalPascal.g:3049:2: (iv_rulesubrange_type= rulesubrange_type EOF )
            // InternalPascal.g:3050:2: iv_rulesubrange_type= rulesubrange_type EOF
            {
             newCompositeNode(grammarAccess.getSubrange_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesubrange_type=rulesubrange_type();

            state._fsp--;

             current =iv_rulesubrange_type; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:3059:1: rulesubrange_type returns [EObject current=null] : ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) ) ;
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
            // InternalPascal.g:3066:2: ( ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) ) )
            // InternalPascal.g:3067:2: ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) )
            {
            // InternalPascal.g:3067:2: ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_INTEGER_NUMBER)||LA38_0==RULE_ADDITION_OP||LA38_0==RULE_STRING||(LA38_0>=RULE_SIGNED_REAL_NUMBER && LA38_0<=RULE_REAL_NUMBER)||(LA38_0>=40 && LA38_0<=41)) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_NUMERIC_SUBRANGE) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalPascal.g:3068:3: ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) )
                    {
                    // InternalPascal.g:3068:3: ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) )
                    // InternalPascal.g:3069:4: ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) )
                    {
                    // InternalPascal.g:3069:4: ( (lv_initialConst_0_0= ruleconstant ) )
                    // InternalPascal.g:3070:5: (lv_initialConst_0_0= ruleconstant )
                    {
                    // InternalPascal.g:3070:5: (lv_initialConst_0_0= ruleconstant )
                    // InternalPascal.g:3071:6: lv_initialConst_0_0= ruleconstant
                    {

                    						newCompositeNode(grammarAccess.getSubrange_typeAccess().getInitialConstConstantParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_initialConst_0_0=ruleconstant();

                    state._fsp--;


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

                    otherlv_1=(Token)match(input,51,FOLLOW_33); 

                    				newLeafNode(otherlv_1, grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_0_1());
                    			
                    // InternalPascal.g:3092:4: ( (lv_finalConst_2_0= ruleconstant ) )
                    // InternalPascal.g:3093:5: (lv_finalConst_2_0= ruleconstant )
                    {
                    // InternalPascal.g:3093:5: (lv_finalConst_2_0= ruleconstant )
                    // InternalPascal.g:3094:6: lv_finalConst_2_0= ruleconstant
                    {

                    						newCompositeNode(grammarAccess.getSubrange_typeAccess().getFinalConstConstantParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_finalConst_2_0=ruleconstant();

                    state._fsp--;


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
                    break;
                case 2 :
                    // InternalPascal.g:3113:3: ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) )
                    {
                    // InternalPascal.g:3113:3: ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) )
                    // InternalPascal.g:3114:4: ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) )
                    {
                    // InternalPascal.g:3114:4: ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) )
                    // InternalPascal.g:3115:5: (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE )
                    {
                    // InternalPascal.g:3115:5: (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE )
                    // InternalPascal.g:3116:6: lv_subrange_3_0= RULE_NUMERIC_SUBRANGE
                    {
                    lv_subrange_3_0=(Token)match(input,RULE_NUMERIC_SUBRANGE,FOLLOW_33); 

                    						newLeafNode(lv_subrange_3_0, grammarAccess.getSubrange_typeAccess().getSubrangeNUMERIC_SUBRANGETerminalRuleCall_1_0_0());
                    					

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

                    // InternalPascal.g:3132:4: ( (lv_const_4_0= ruleconstant ) )
                    // InternalPascal.g:3133:5: (lv_const_4_0= ruleconstant )
                    {
                    // InternalPascal.g:3133:5: (lv_const_4_0= ruleconstant )
                    // InternalPascal.g:3134:6: lv_const_4_0= ruleconstant
                    {

                    						newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstConstantParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_const_4_0=ruleconstant();

                    state._fsp--;


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
                    break;

            }


            }


            	leaveRule();

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
    // InternalPascal.g:3159:1: entryRuleenumerated_type returns [EObject current=null] : iv_ruleenumerated_type= ruleenumerated_type EOF ;
    public final EObject entryRuleenumerated_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenumerated_type = null;


        try {
            // InternalPascal.g:3159:56: (iv_ruleenumerated_type= ruleenumerated_type EOF )
            // InternalPascal.g:3160:2: iv_ruleenumerated_type= ruleenumerated_type EOF
            {
             newCompositeNode(grammarAccess.getEnumerated_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleenumerated_type=ruleenumerated_type();

            state._fsp--;

             current =iv_ruleenumerated_type; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:3166:1: ruleenumerated_type returns [EObject current=null] : (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' ) ;
    public final EObject ruleenumerated_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifiers_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3172:2: ( (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' ) )
            // InternalPascal.g:3173:2: (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' )
            {
            // InternalPascal.g:3173:2: (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' )
            // InternalPascal.g:3174:3: otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0());
            		
            // InternalPascal.g:3178:3: ( (lv_identifiers_1_0= ruleidentifier_list ) )
            // InternalPascal.g:3179:4: (lv_identifiers_1_0= ruleidentifier_list )
            {
            // InternalPascal.g:3179:4: (lv_identifiers_1_0= ruleidentifier_list )
            // InternalPascal.g:3180:5: lv_identifiers_1_0= ruleidentifier_list
            {

            					newCompositeNode(grammarAccess.getEnumerated_typeAccess().getIdentifiersIdentifier_listParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_identifiers_1_0=ruleidentifier_list();

            state._fsp--;


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

            otherlv_2=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerated_typeAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRulestrutured_type"
    // InternalPascal.g:3205:1: entryRulestrutured_type returns [EObject current=null] : iv_rulestrutured_type= rulestrutured_type EOF ;
    public final EObject entryRulestrutured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestrutured_type = null;


        try {
            // InternalPascal.g:3205:55: (iv_rulestrutured_type= rulestrutured_type EOF )
            // InternalPascal.g:3206:2: iv_rulestrutured_type= rulestrutured_type EOF
            {
             newCompositeNode(grammarAccess.getStrutured_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestrutured_type=rulestrutured_type();

            state._fsp--;

             current =iv_rulestrutured_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulestrutured_type"


    // $ANTLR start "rulestrutured_type"
    // InternalPascal.g:3212:1: rulestrutured_type returns [EObject current=null] : ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_strutured_type ) ) ) ;
    public final EObject rulestrutured_type() throws RecognitionException {
        EObject current = null;

        Token lv_packed_0_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3218:2: ( ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_strutured_type ) ) ) )
            // InternalPascal.g:3219:2: ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_strutured_type ) ) )
            {
            // InternalPascal.g:3219:2: ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_strutured_type ) ) )
            // InternalPascal.g:3220:3: ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_strutured_type ) )
            {
            // InternalPascal.g:3220:3: ( (lv_packed_0_0= 'packed' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==52) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPascal.g:3221:4: (lv_packed_0_0= 'packed' )
                    {
                    // InternalPascal.g:3221:4: (lv_packed_0_0= 'packed' )
                    // InternalPascal.g:3222:5: lv_packed_0_0= 'packed'
                    {
                    lv_packed_0_0=(Token)match(input,52,FOLLOW_36); 

                    					newLeafNode(lv_packed_0_0, grammarAccess.getStrutured_typeAccess().getPackedPackedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStrutured_typeRule());
                    					}
                    					setWithLastConsumed(current, "packed", true, "packed");
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:3234:3: ( (lv_type_1_0= ruleunpacked_strutured_type ) )
            // InternalPascal.g:3235:4: (lv_type_1_0= ruleunpacked_strutured_type )
            {
            // InternalPascal.g:3235:4: (lv_type_1_0= ruleunpacked_strutured_type )
            // InternalPascal.g:3236:5: lv_type_1_0= ruleunpacked_strutured_type
            {

            					newCompositeNode(grammarAccess.getStrutured_typeAccess().getTypeUnpacked_strutured_typeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleunpacked_strutured_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStrutured_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.example.pascal.Pascal.unpacked_strutured_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestrutured_type"


    // $ANTLR start "entryRuleunpacked_strutured_type"
    // InternalPascal.g:3257:1: entryRuleunpacked_strutured_type returns [EObject current=null] : iv_ruleunpacked_strutured_type= ruleunpacked_strutured_type EOF ;
    public final EObject entryRuleunpacked_strutured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_strutured_type = null;


        try {
            // InternalPascal.g:3257:64: (iv_ruleunpacked_strutured_type= ruleunpacked_strutured_type EOF )
            // InternalPascal.g:3258:2: iv_ruleunpacked_strutured_type= ruleunpacked_strutured_type EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_strutured_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunpacked_strutured_type=ruleunpacked_strutured_type();

            state._fsp--;

             current =iv_ruleunpacked_strutured_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleunpacked_strutured_type"


    // $ANTLR start "ruleunpacked_strutured_type"
    // InternalPascal.g:3264:1: ruleunpacked_strutured_type returns [EObject current=null] : ( (lv_set_0_0= ruleset_type ) ) ;
    public final EObject ruleunpacked_strutured_type() throws RecognitionException {
        EObject current = null;

        EObject lv_set_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3270:2: ( ( (lv_set_0_0= ruleset_type ) ) )
            // InternalPascal.g:3271:2: ( (lv_set_0_0= ruleset_type ) )
            {
            // InternalPascal.g:3271:2: ( (lv_set_0_0= ruleset_type ) )
            // InternalPascal.g:3272:3: (lv_set_0_0= ruleset_type )
            {
            // InternalPascal.g:3272:3: (lv_set_0_0= ruleset_type )
            // InternalPascal.g:3273:4: lv_set_0_0= ruleset_type
            {

            				newCompositeNode(grammarAccess.getUnpacked_strutured_typeAccess().getSetSet_typeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_set_0_0=ruleset_type();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getUnpacked_strutured_typeRule());
            				}
            				set(
            					current,
            					"set",
            					lv_set_0_0,
            					"org.xtext.example.pascal.Pascal.set_type");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunpacked_strutured_type"


    // $ANTLR start "entryRuleset_type"
    // InternalPascal.g:3293:1: entryRuleset_type returns [EObject current=null] : iv_ruleset_type= ruleset_type EOF ;
    public final EObject entryRuleset_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset_type = null;


        try {
            // InternalPascal.g:3293:49: (iv_ruleset_type= ruleset_type EOF )
            // InternalPascal.g:3294:2: iv_ruleset_type= ruleset_type EOF
            {
             newCompositeNode(grammarAccess.getSet_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleset_type=ruleset_type();

            state._fsp--;

             current =iv_ruleset_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleset_type"


    // $ANTLR start "ruleset_type"
    // InternalPascal.g:3300:1: ruleset_type returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruleset_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3306:2: ( (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:3307:2: (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:3307:2: (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:3308:3: otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getSet_typeAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,54,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getSet_typeAccess().getOfKeyword_1());
            		
            // InternalPascal.g:3316:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:3317:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:3317:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:3318:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getSet_typeAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSet_typeRule());
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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleset_type"


    // $ANTLR start "entryRulepointer_type"
    // InternalPascal.g:3339:1: entryRulepointer_type returns [EObject current=null] : iv_rulepointer_type= rulepointer_type EOF ;
    public final EObject entryRulepointer_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepointer_type = null;


        try {
            // InternalPascal.g:3339:53: (iv_rulepointer_type= rulepointer_type EOF )
            // InternalPascal.g:3340:2: iv_rulepointer_type= rulepointer_type EOF
            {
             newCompositeNode(grammarAccess.getPointer_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepointer_type=rulepointer_type();

            state._fsp--;

             current =iv_rulepointer_type; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:3346:1: rulepointer_type returns [EObject current=null] : (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) ) ;
    public final EObject rulepointer_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3352:2: ( (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) ) )
            // InternalPascal.g:3353:2: (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) )
            {
            // InternalPascal.g:3353:2: (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) )
            // InternalPascal.g:3354:3: otherlv_0= '^' ( (lv_type_1_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0());
            		
            // InternalPascal.g:3358:3: ( (lv_type_1_0= ruletype ) )
            // InternalPascal.g:3359:4: (lv_type_1_0= ruletype )
            {
            // InternalPascal.g:3359:4: (lv_type_1_0= ruletype )
            // InternalPascal.g:3360:5: lv_type_1_0= ruletype
            {

            					newCompositeNode(grammarAccess.getPointer_typeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruletype();

            state._fsp--;


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


            	leaveRule();

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
    // InternalPascal.g:3381:1: entryRulesigned_number returns [EObject current=null] : iv_rulesigned_number= rulesigned_number EOF ;
    public final EObject entryRulesigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigned_number = null;


        try {
            // InternalPascal.g:3381:54: (iv_rulesigned_number= rulesigned_number EOF )
            // InternalPascal.g:3382:2: iv_rulesigned_number= rulesigned_number EOF
            {
             newCompositeNode(grammarAccess.getSigned_numberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesigned_number=rulesigned_number();

            state._fsp--;

             current =iv_rulesigned_number; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:3388:1: rulesigned_number returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) ;
    public final EObject rulesigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_real_1_0=null;


        	enterRule();

        try {
            // InternalPascal.g:3394:2: ( ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) )
            // InternalPascal.g:3395:2: ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            {
            // InternalPascal.g:3395:2: ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalPascal.g:3396:3: ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:3396:3: ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    // InternalPascal.g:3397:4: (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:3397:4: (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    // InternalPascal.g:3398:5: lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    lv_integer_0_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_integer_0_0, grammarAccess.getSigned_numberAccess().getIntegerSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0());
                    				

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
                    break;
                case 2 :
                    // InternalPascal.g:3415:3: ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    {
                    // InternalPascal.g:3415:3: ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    // InternalPascal.g:3416:4: (lv_real_1_0= RULE_SIGNED_REAL_NUMBER )
                    {
                    // InternalPascal.g:3416:4: (lv_real_1_0= RULE_SIGNED_REAL_NUMBER )
                    // InternalPascal.g:3417:5: lv_real_1_0= RULE_SIGNED_REAL_NUMBER
                    {
                    lv_real_1_0=(Token)match(input,RULE_SIGNED_REAL_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_real_1_0, grammarAccess.getSigned_numberAccess().getRealSIGNED_REAL_NUMBERTerminalRuleCall_1_0());
                    				

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
                    break;

            }


            }


            	leaveRule();

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
    // InternalPascal.g:3437:1: entryRuleunsigned_number returns [EObject current=null] : iv_ruleunsigned_number= ruleunsigned_number EOF ;
    public final EObject entryRuleunsigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsigned_number = null;


        try {
            // InternalPascal.g:3437:56: (iv_ruleunsigned_number= ruleunsigned_number EOF )
            // InternalPascal.g:3438:2: iv_ruleunsigned_number= ruleunsigned_number EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_numberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunsigned_number=ruleunsigned_number();

            state._fsp--;

             current =iv_ruleunsigned_number; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:3444:1: ruleunsigned_number returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) ;
    public final EObject ruleunsigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_real_1_0=null;


        	enterRule();

        try {
            // InternalPascal.g:3450:2: ( ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) )
            // InternalPascal.g:3451:2: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            {
            // InternalPascal.g:3451:2: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_INTEGER_NUMBER) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_REAL_NUMBER) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalPascal.g:3452:3: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:3452:3: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    // InternalPascal.g:3453:4: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:3453:4: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    // InternalPascal.g:3454:5: lv_integer_0_0= RULE_INTEGER_NUMBER
                    {
                    lv_integer_0_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_integer_0_0, grammarAccess.getUnsigned_numberAccess().getIntegerINTEGER_NUMBERTerminalRuleCall_0_0());
                    				

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
                    break;
                case 2 :
                    // InternalPascal.g:3471:3: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    {
                    // InternalPascal.g:3471:3: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    // InternalPascal.g:3472:4: (lv_real_1_0= RULE_REAL_NUMBER )
                    {
                    // InternalPascal.g:3472:4: (lv_real_1_0= RULE_REAL_NUMBER )
                    // InternalPascal.g:3473:5: lv_real_1_0= RULE_REAL_NUMBER
                    {
                    lv_real_1_0=(Token)match(input,RULE_REAL_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_real_1_0, grammarAccess.getUnsigned_numberAccess().getRealREAL_NUMBERTerminalRuleCall_1_0());
                    				

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
                    break;

            }


            }


            	leaveRule();

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
    // InternalPascal.g:3493:1: entryRulevariable_declaration_part returns [EObject current=null] : iv_rulevariable_declaration_part= rulevariable_declaration_part EOF ;
    public final EObject entryRulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration_part = null;


        try {
            // InternalPascal.g:3493:66: (iv_rulevariable_declaration_part= rulevariable_declaration_part EOF )
            // InternalPascal.g:3494:2: iv_rulevariable_declaration_part= rulevariable_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getVariable_declaration_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_declaration_part=rulevariable_declaration_part();

            state._fsp--;

             current =iv_rulevariable_declaration_part; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:3500:1: rulevariable_declaration_part returns [EObject current=null] : (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* ) ;
    public final EObject rulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sections_1_0 = null;

        EObject lv_sections_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3506:2: ( (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* ) )
            // InternalPascal.g:3507:2: (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* )
            {
            // InternalPascal.g:3507:2: (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* )
            // InternalPascal.g:3508:3: otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )*
            {
            otherlv_0=(Token)match(input,46,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0());
            		
            // InternalPascal.g:3512:3: ( (lv_sections_1_0= rulevariable_section ) )
            // InternalPascal.g:3513:4: (lv_sections_1_0= rulevariable_section )
            {
            // InternalPascal.g:3513:4: (lv_sections_1_0= rulevariable_section )
            // InternalPascal.g:3514:5: lv_sections_1_0= rulevariable_section
            {

            					newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_sections_1_0=rulevariable_section();

            state._fsp--;


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

            otherlv_2=(Token)match(input,24,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2());
            		
            // InternalPascal.g:3535:3: ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPascal.g:3536:4: ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';'
            	    {
            	    // InternalPascal.g:3536:4: ( (lv_sections_3_0= rulevariable_section ) )
            	    // InternalPascal.g:3537:5: (lv_sections_3_0= rulevariable_section )
            	    {
            	    // InternalPascal.g:3537:5: (lv_sections_3_0= rulevariable_section )
            	    // InternalPascal.g:3538:6: lv_sections_3_0= rulevariable_section
            	    {

            	    						newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_sections_3_0=rulevariable_section();

            	    state._fsp--;


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

            	    otherlv_4=(Token)match(input,24,FOLLOW_31); 

            	    				newLeafNode(otherlv_4, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalPascal.g:3564:1: entryRulevariable_section returns [EObject current=null] : iv_rulevariable_section= rulevariable_section EOF ;
    public final EObject entryRulevariable_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_section = null;


        try {
            // InternalPascal.g:3564:57: (iv_rulevariable_section= rulevariable_section EOF )
            // InternalPascal.g:3565:2: iv_rulevariable_section= rulevariable_section EOF
            {
             newCompositeNode(grammarAccess.getVariable_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_section=rulevariable_section();

            state._fsp--;

             current =iv_rulevariable_section; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:3571:1: rulevariable_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulevariable_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3577:2: ( ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:3578:2: ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:3578:2: ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:3579:3: ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:3579:3: ( (lv_identifiers_0_0= rulevariable_identifier_list ) )
            // InternalPascal.g:3580:4: (lv_identifiers_0_0= rulevariable_identifier_list )
            {
            // InternalPascal.g:3580:4: (lv_identifiers_0_0= rulevariable_identifier_list )
            // InternalPascal.g:3581:5: lv_identifiers_0_0= rulevariable_identifier_list
            {

            					newCompositeNode(grammarAccess.getVariable_sectionAccess().getIdentifiersVariable_identifier_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_identifiers_0_0=rulevariable_identifier_list();

            state._fsp--;


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

            otherlv_1=(Token)match(input,27,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getVariable_sectionAccess().getColonKeyword_1());
            		
            // InternalPascal.g:3602:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:3603:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:3603:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:3604:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getVariable_sectionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


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


            	leaveRule();

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
    // InternalPascal.g:3625:1: entryRulevariable_identifier_list returns [EObject current=null] : iv_rulevariable_identifier_list= rulevariable_identifier_list EOF ;
    public final EObject entryRulevariable_identifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_identifier_list = null;


        try {
            // InternalPascal.g:3625:65: (iv_rulevariable_identifier_list= rulevariable_identifier_list EOF )
            // InternalPascal.g:3626:2: iv_rulevariable_identifier_list= rulevariable_identifier_list EOF
            {
             newCompositeNode(grammarAccess.getVariable_identifier_listRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_identifier_list=rulevariable_identifier_list();

            state._fsp--;

             current =iv_rulevariable_identifier_list; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPascal.g:3632:1: rulevariable_identifier_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject rulevariable_identifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;


        	enterRule();

        try {
            // InternalPascal.g:3638:2: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // InternalPascal.g:3639:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // InternalPascal.g:3639:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            // InternalPascal.g:3640:3: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // InternalPascal.g:3640:3: ( (lv_names_0_0= RULE_ID ) )
            // InternalPascal.g:3641:4: (lv_names_0_0= RULE_ID )
            {
            // InternalPascal.g:3641:4: (lv_names_0_0= RULE_ID )
            // InternalPascal.g:3642:5: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_names_0_0, grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_0_0());
            				

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

            // InternalPascal.g:3658:3: (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==32) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalPascal.g:3659:4: otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,32,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVariable_identifier_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:3663:4: ( (lv_names_2_0= RULE_ID ) )
            	    // InternalPascal.g:3664:5: (lv_names_2_0= RULE_ID )
            	    {
            	    // InternalPascal.g:3664:5: (lv_names_2_0= RULE_ID )
            	    // InternalPascal.g:3665:6: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    						newLeafNode(lv_names_2_0, grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_1_1_0());
            	    					

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
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }


            	leaveRule();

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

    // Delegated rules


    protected DFA19 dfa19 = new DFA19(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\13\12\uffff";
    static final String dfa_3s = "\1\4\1\6\12\uffff";
    static final String dfa_4s = "\1\54\1\53\12\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\10\1\1";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\3\uffff\1\3\1\uffff\2\2\17\uffff\1\4\11\uffff\1\5\1\6\1\7\1\10\1\uffff\1\11",
            "\4\13\3\uffff\1\13\10\uffff\1\13\1\uffff\1\13\1\uffff\1\13\2\uffff\12\13\3\uffff\1\12\1\13",
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

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1352:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0007E00002000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000178020003570L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000A0400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000600000082L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800002142L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000007000000202L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00001F8020003570L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000A00000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000E00000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000178060003570L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000003070L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000030000003570L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0030070080003D70L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040000000000000L});

}