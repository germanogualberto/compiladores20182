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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SIGNED_INTEGER_NUMBER", "RULE_INTEGER_NUMBER", "RULE_RELATIONAL_OP", "RULE_ADDITION_OP", "RULE_MULTIPLICATION_OP", "RULE_STRING", "RULE_SIGNED_REAL_NUMBER", "RULE_REAL_NUMBER", "RULE_PARENTHESES_COMMENT", "RULE_CURLY_BRACKETS_COMMENT", "RULE_NUMERIC_SUBRANGE", "RULE_DIGIT_SEQUENCE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "';'", "'begin'", "'end'", "':'", "':='", "'['", "']'", "'^'", "','", "'in'", "'='", "'or'", "'div'", "'mod'", "'and'", "'nil'", "'true'", "'false'", "'('", "')'", "'not'", "'function'", "'var'", "'procedure'"
    };
    public static final int RULE_PARENTHESES_COMMENT=13;
    public static final int RULE_REAL_NUMBER=12;
    public static final int RULE_NUMERIC_SUBRANGE=15;
    public static final int RULE_ID=4;
    public static final int RULE_MULTIPLICATION_OP=9;
    public static final int RULE_SIGNED_REAL_NUMBER=11;
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
    public static final int T__44=44;
    public static final int RULE_CURLY_BRACKETS_COMMENT=14;
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
    // InternalPascal.g:213:1: ruleblock returns [EObject current=null] : ( ( (lv_abstraction_0_0= rulefunction_procedure_declaration ) )? ( (lv_statement_1_0= rulestatement_part ) ) ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        EObject lv_abstraction_0_0 = null;

        EObject lv_statement_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:219:2: ( ( ( (lv_abstraction_0_0= rulefunction_procedure_declaration ) )? ( (lv_statement_1_0= rulestatement_part ) ) ) )
            // InternalPascal.g:220:2: ( ( (lv_abstraction_0_0= rulefunction_procedure_declaration ) )? ( (lv_statement_1_0= rulestatement_part ) ) )
            {
            // InternalPascal.g:220:2: ( ( (lv_abstraction_0_0= rulefunction_procedure_declaration ) )? ( (lv_statement_1_0= rulestatement_part ) ) )
            // InternalPascal.g:221:3: ( (lv_abstraction_0_0= rulefunction_procedure_declaration ) )? ( (lv_statement_1_0= rulestatement_part ) )
            {
            // InternalPascal.g:221:3: ( (lv_abstraction_0_0= rulefunction_procedure_declaration ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==45||LA1_0==47) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:222:4: (lv_abstraction_0_0= rulefunction_procedure_declaration )
                    {
                    // InternalPascal.g:222:4: (lv_abstraction_0_0= rulefunction_procedure_declaration )
                    // InternalPascal.g:223:5: lv_abstraction_0_0= rulefunction_procedure_declaration
                    {

                    					newCompositeNode(grammarAccess.getBlockAccess().getAbstractionFunction_procedure_declarationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_abstraction_0_0=rulefunction_procedure_declaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBlockRule());
                    					}
                    					set(
                    						current,
                    						"abstraction",
                    						lv_abstraction_0_0,
                    						"org.xtext.example.pascal.Pascal.function_procedure_declaration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:240:3: ( (lv_statement_1_0= rulestatement_part ) )
            // InternalPascal.g:241:4: (lv_statement_1_0= rulestatement_part )
            {
            // InternalPascal.g:241:4: (lv_statement_1_0= rulestatement_part )
            // InternalPascal.g:242:5: lv_statement_1_0= rulestatement_part
            {

            					newCompositeNode(grammarAccess.getBlockAccess().getStatementStatement_partParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_1_0=rulestatement_part();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_1_0,
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
    // InternalPascal.g:263:1: entryRulestatement_part returns [EObject current=null] : iv_rulestatement_part= rulestatement_part EOF ;
    public final EObject entryRulestatement_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_part = null;


        try {
            // InternalPascal.g:263:55: (iv_rulestatement_part= rulestatement_part EOF )
            // InternalPascal.g:264:2: iv_rulestatement_part= rulestatement_part EOF
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
    // InternalPascal.g:270:1: rulestatement_part returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) ;
    public final EObject rulestatement_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:276:2: ( (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:277:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:277:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            // InternalPascal.g:278:3: otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getStatement_partAccess().getBeginKeyword_0());
            		
            // InternalPascal.g:282:3: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // InternalPascal.g:283:4: (lv_sequence_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:283:4: (lv_sequence_1_0= rulestatement_sequence )
            // InternalPascal.g:284:5: lv_sequence_1_0= rulestatement_sequence
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
    // InternalPascal.g:309:1: entryRulestatement_sequence returns [EObject current=null] : iv_rulestatement_sequence= rulestatement_sequence EOF ;
    public final EObject entryRulestatement_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_sequence = null;


        try {
            // InternalPascal.g:309:59: (iv_rulestatement_sequence= rulestatement_sequence EOF )
            // InternalPascal.g:310:2: iv_rulestatement_sequence= rulestatement_sequence EOF
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
    // InternalPascal.g:316:1: rulestatement_sequence returns [EObject current=null] : ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) ;
    public final EObject rulestatement_sequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:322:2: ( ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) )
            // InternalPascal.g:323:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            {
            // InternalPascal.g:323:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            // InternalPascal.g:324:3: ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            {
            // InternalPascal.g:324:3: ( (lv_statements_0_0= rulestatement ) )
            // InternalPascal.g:325:4: (lv_statements_0_0= rulestatement )
            {
            // InternalPascal.g:325:4: (lv_statements_0_0= rulestatement )
            // InternalPascal.g:326:5: lv_statements_0_0= rulestatement
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

            // InternalPascal.g:343:3: (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPascal.g:344:4: otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalPascal.g:348:4: ( (lv_statements_2_0= rulestatement ) )
            	    // InternalPascal.g:349:5: (lv_statements_2_0= rulestatement )
            	    {
            	    // InternalPascal.g:349:5: (lv_statements_2_0= rulestatement )
            	    // InternalPascal.g:350:6: lv_statements_2_0= rulestatement
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
            	    break loop2;
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
    // InternalPascal.g:372:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // InternalPascal.g:372:50: (iv_rulestatement= rulestatement EOF )
            // InternalPascal.g:373:2: iv_rulestatement= rulestatement EOF
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
    // InternalPascal.g:379:1: rulestatement returns [EObject current=null] : ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( (lv_simple_2_0= rulesimple_statement ) ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_label_0_0 = null;

        EObject lv_simple_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:385:2: ( ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( (lv_simple_2_0= rulesimple_statement ) ) ) )
            // InternalPascal.g:386:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( (lv_simple_2_0= rulesimple_statement ) ) )
            {
            // InternalPascal.g:386:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( (lv_simple_2_0= rulesimple_statement ) ) )
            // InternalPascal.g:387:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( (lv_simple_2_0= rulesimple_statement ) )
            {
            // InternalPascal.g:387:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_SIGNED_INTEGER_NUMBER && LA3_0<=RULE_INTEGER_NUMBER)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPascal.g:388:4: ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':'
                    {
                    // InternalPascal.g:388:4: ( (lv_label_0_0= rulelabel ) )
                    // InternalPascal.g:389:5: (lv_label_0_0= rulelabel )
                    {
                    // InternalPascal.g:389:5: (lv_label_0_0= rulelabel )
                    // InternalPascal.g:390:6: lv_label_0_0= rulelabel
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

            // InternalPascal.g:412:3: ( (lv_simple_2_0= rulesimple_statement ) )
            // InternalPascal.g:413:4: (lv_simple_2_0= rulesimple_statement )
            {
            // InternalPascal.g:413:4: (lv_simple_2_0= rulesimple_statement )
            // InternalPascal.g:414:5: lv_simple_2_0= rulesimple_statement
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
    // InternalPascal.g:435:1: entryRulesimple_statement returns [EObject current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final EObject entryRulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_statement = null;


        try {
            // InternalPascal.g:435:57: (iv_rulesimple_statement= rulesimple_statement EOF )
            // InternalPascal.g:436:2: iv_rulesimple_statement= rulesimple_statement EOF
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
    // InternalPascal.g:442:1: rulesimple_statement returns [EObject current=null] : ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_function_noargs_2_0= RULE_ID ) ) )? ;
    public final EObject rulesimple_statement() throws RecognitionException {
        EObject current = null;

        Token lv_function_noargs_2_0=null;
        EObject lv_assignment_0_0 = null;

        EObject lv_function_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:448:2: ( ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_function_noargs_2_0= RULE_ID ) ) )? )
            // InternalPascal.g:449:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_function_noargs_2_0= RULE_ID ) ) )?
            {
            // InternalPascal.g:449:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_function_noargs_2_0= RULE_ID ) ) )?
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                    case EOF:
                    case 24:
                    case 26:
                        {
                        alt4=3;
                        }
                        break;
                    case 22:
                    case 28:
                    case 29:
                    case 31:
                        {
                        alt4=1;
                        }
                        break;
                    case 42:
                        {
                        alt4=2;
                        }
                        break;
                }

            }
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:450:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    {
                    // InternalPascal.g:450:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    // InternalPascal.g:451:4: (lv_assignment_0_0= ruleassignment_statement )
                    {
                    // InternalPascal.g:451:4: (lv_assignment_0_0= ruleassignment_statement )
                    // InternalPascal.g:452:5: lv_assignment_0_0= ruleassignment_statement
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
                    // InternalPascal.g:470:3: ( (lv_function_1_0= rulefunction_designator ) )
                    {
                    // InternalPascal.g:470:3: ( (lv_function_1_0= rulefunction_designator ) )
                    // InternalPascal.g:471:4: (lv_function_1_0= rulefunction_designator )
                    {
                    // InternalPascal.g:471:4: (lv_function_1_0= rulefunction_designator )
                    // InternalPascal.g:472:5: lv_function_1_0= rulefunction_designator
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
                    // InternalPascal.g:490:3: ( (lv_function_noargs_2_0= RULE_ID ) )
                    {
                    // InternalPascal.g:490:3: ( (lv_function_noargs_2_0= RULE_ID ) )
                    // InternalPascal.g:491:4: (lv_function_noargs_2_0= RULE_ID )
                    {
                    // InternalPascal.g:491:4: (lv_function_noargs_2_0= RULE_ID )
                    // InternalPascal.g:492:5: lv_function_noargs_2_0= RULE_ID
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
    // InternalPascal.g:512:1: entryRuleassignment_statement returns [EObject current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final EObject entryRuleassignment_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment_statement = null;


        try {
            // InternalPascal.g:512:61: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // InternalPascal.g:513:2: iv_ruleassignment_statement= ruleassignment_statement EOF
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
    // InternalPascal.g:519:1: ruleassignment_statement returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) ;
    public final EObject ruleassignment_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:525:2: ( ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) )
            // InternalPascal.g:526:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            {
            // InternalPascal.g:526:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            // InternalPascal.g:527:3: ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) )
            {
            // InternalPascal.g:527:3: ( (lv_variable_0_0= rulevariable ) )
            // InternalPascal.g:528:4: (lv_variable_0_0= rulevariable )
            {
            // InternalPascal.g:528:4: (lv_variable_0_0= rulevariable )
            // InternalPascal.g:529:5: lv_variable_0_0= rulevariable
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
            		
            // InternalPascal.g:550:3: ( (lv_expression_2_0= ruleexpression ) )
            // InternalPascal.g:551:4: (lv_expression_2_0= ruleexpression )
            {
            // InternalPascal.g:551:4: (lv_expression_2_0= ruleexpression )
            // InternalPascal.g:552:5: lv_expression_2_0= ruleexpression
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
    // InternalPascal.g:573:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // InternalPascal.g:573:46: (iv_rulelabel= rulelabel EOF )
            // InternalPascal.g:574:2: iv_rulelabel= rulelabel EOF
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
    // InternalPascal.g:580:1: rulelabel returns [EObject current=null] : ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_number_1_0=null;


        	enterRule();

        try {
            // InternalPascal.g:586:2: ( ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) ) )
            // InternalPascal.g:587:2: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) )
            {
            // InternalPascal.g:587:2: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INTEGER_NUMBER) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:588:3: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:588:3: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    // InternalPascal.g:589:4: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:589:4: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    // InternalPascal.g:590:5: lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER
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
                    // InternalPascal.g:607:3: ( (lv_number_1_0= RULE_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:607:3: ( (lv_number_1_0= RULE_INTEGER_NUMBER ) )
                    // InternalPascal.g:608:4: (lv_number_1_0= RULE_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:608:4: (lv_number_1_0= RULE_INTEGER_NUMBER )
                    // InternalPascal.g:609:5: lv_number_1_0= RULE_INTEGER_NUMBER
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
    // InternalPascal.g:629:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // InternalPascal.g:629:49: (iv_rulevariable= rulevariable EOF )
            // InternalPascal.g:630:2: iv_rulevariable= rulevariable EOF
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
    // InternalPascal.g:636:1: rulevariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) ) ;
    public final EObject rulevariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:642:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) ) )
            // InternalPascal.g:643:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) )
            {
            // InternalPascal.g:643:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) )
            // InternalPascal.g:644:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) )
            {
            // InternalPascal.g:644:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:645:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:645:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:646:5: lv_name_0_0= RULE_ID
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

            // InternalPascal.g:662:3: ( (lv_variable_1_0= rulevar_ ) )
            // InternalPascal.g:663:4: (lv_variable_1_0= rulevar_ )
            {
            // InternalPascal.g:663:4: (lv_variable_1_0= rulevar_ )
            // InternalPascal.g:664:5: lv_variable_1_0= rulevar_
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
    // InternalPascal.g:685:1: entryRulevar_ returns [EObject current=null] : iv_rulevar_= rulevar_ EOF ;
    public final EObject entryRulevar_() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevar_ = null;


        try {
            // InternalPascal.g:685:45: (iv_rulevar_= rulevar_ EOF )
            // InternalPascal.g:686:2: iv_rulevar_= rulevar_ EOF
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
    // InternalPascal.g:692:1: rulevar_ returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )? ;
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
            // InternalPascal.g:698:2: ( ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )? )
            // InternalPascal.g:699:2: ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )?
            {
            // InternalPascal.g:699:2: ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )?
            int alt6=4;
            switch ( input.LA(1) ) {
                case 29:
                    {
                    alt6=1;
                    }
                    break;
                case 22:
                    {
                    alt6=2;
                    }
                    break;
                case 31:
                    {
                    alt6=3;
                    }
                    break;
            }

            switch (alt6) {
                case 1 :
                    // InternalPascal.g:700:3: (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) )
                    {
                    // InternalPascal.g:700:3: (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) )
                    // InternalPascal.g:701:4: otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) )
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getVar_Access().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalPascal.g:705:4: ( (lv_expressions_1_0= ruleexpression_list ) )
                    // InternalPascal.g:706:5: (lv_expressions_1_0= ruleexpression_list )
                    {
                    // InternalPascal.g:706:5: (lv_expressions_1_0= ruleexpression_list )
                    // InternalPascal.g:707:6: lv_expressions_1_0= ruleexpression_list
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
                    			
                    // InternalPascal.g:728:4: ( (lv_array_3_0= rulevar_ ) )
                    // InternalPascal.g:729:5: (lv_array_3_0= rulevar_ )
                    {
                    // InternalPascal.g:729:5: (lv_array_3_0= rulevar_ )
                    // InternalPascal.g:730:6: lv_array_3_0= rulevar_
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
                    // InternalPascal.g:749:3: ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) )
                    {
                    // InternalPascal.g:749:3: ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) )
                    // InternalPascal.g:750:4: ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) )
                    {
                    // InternalPascal.g:750:4: ( (lv_accessor_4_0= '.' ) )
                    // InternalPascal.g:751:5: (lv_accessor_4_0= '.' )
                    {
                    // InternalPascal.g:751:5: (lv_accessor_4_0= '.' )
                    // InternalPascal.g:752:6: lv_accessor_4_0= '.'
                    {
                    lv_accessor_4_0=(Token)match(input,22,FOLLOW_5); 

                    						newLeafNode(lv_accessor_4_0, grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVar_Rule());
                    						}
                    						setWithLastConsumed(current, "accessor", true, ".");
                    					

                    }


                    }

                    // InternalPascal.g:764:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalPascal.g:765:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalPascal.g:765:5: (lv_name_5_0= RULE_ID )
                    // InternalPascal.g:766:6: lv_name_5_0= RULE_ID
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

                    // InternalPascal.g:782:4: ( (lv_variable_6_0= rulevar_ ) )
                    // InternalPascal.g:783:5: (lv_variable_6_0= rulevar_ )
                    {
                    // InternalPascal.g:783:5: (lv_variable_6_0= rulevar_ )
                    // InternalPascal.g:784:6: lv_variable_6_0= rulevar_
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
                    // InternalPascal.g:803:3: (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) )
                    {
                    // InternalPascal.g:803:3: (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) )
                    // InternalPascal.g:804:4: otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) )
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getVar_Access().getCircumflexAccentKeyword_2_0());
                    			
                    // InternalPascal.g:808:4: ( (lv_pointer_8_0= rulevar_ ) )
                    // InternalPascal.g:809:5: (lv_pointer_8_0= rulevar_ )
                    {
                    // InternalPascal.g:809:5: (lv_pointer_8_0= rulevar_ )
                    // InternalPascal.g:810:6: lv_pointer_8_0= rulevar_
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
    // InternalPascal.g:832:1: entryRuleexpression_list returns [EObject current=null] : iv_ruleexpression_list= ruleexpression_list EOF ;
    public final EObject entryRuleexpression_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression_list = null;


        try {
            // InternalPascal.g:832:56: (iv_ruleexpression_list= ruleexpression_list EOF )
            // InternalPascal.g:833:2: iv_ruleexpression_list= ruleexpression_list EOF
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
    // InternalPascal.g:839:1: ruleexpression_list returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* ) ;
    public final EObject ruleexpression_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:845:2: ( ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* ) )
            // InternalPascal.g:846:2: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* )
            {
            // InternalPascal.g:846:2: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* )
            // InternalPascal.g:847:3: ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )*
            {
            // InternalPascal.g:847:3: ( (lv_expressions_0_0= ruleexpression ) )
            // InternalPascal.g:848:4: (lv_expressions_0_0= ruleexpression )
            {
            // InternalPascal.g:848:4: (lv_expressions_0_0= ruleexpression )
            // InternalPascal.g:849:5: lv_expressions_0_0= ruleexpression
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

            // InternalPascal.g:866:3: (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPascal.g:867:4: otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) )
            	    {
            	    otherlv_1=(Token)match(input,32,FOLLOW_12); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExpression_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:871:4: ( (lv_expressions_2_0= ruleexpression ) )
            	    // InternalPascal.g:872:5: (lv_expressions_2_0= ruleexpression )
            	    {
            	    // InternalPascal.g:872:5: (lv_expressions_2_0= ruleexpression )
            	    // InternalPascal.g:873:6: lv_expressions_2_0= ruleexpression
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
            	    break loop7;
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
    // InternalPascal.g:895:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalPascal.g:895:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalPascal.g:896:2: iv_ruleexpression= ruleexpression EOF
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
    // InternalPascal.g:902:1: ruleexpression returns [EObject current=null] : ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:908:2: ( ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) )
            // InternalPascal.g:909:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            {
            // InternalPascal.g:909:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            // InternalPascal.g:910:3: ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            {
            // InternalPascal.g:910:3: ( (lv_expressions_0_0= rulesimple_expression ) )
            // InternalPascal.g:911:4: (lv_expressions_0_0= rulesimple_expression )
            {
            // InternalPascal.g:911:4: (lv_expressions_0_0= rulesimple_expression )
            // InternalPascal.g:912:5: lv_expressions_0_0= rulesimple_expression
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

            // InternalPascal.g:929:3: ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_RELATIONAL_OP||(LA9_0>=33 && LA9_0<=34)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:930:4: ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) )
                    {
                    // InternalPascal.g:930:4: ( ( (lv_operators_1_0= RULE_RELATIONAL_OP ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) )
                    int alt8=3;
                    switch ( input.LA(1) ) {
                    case RULE_RELATIONAL_OP:
                        {
                        alt8=1;
                        }
                        break;
                    case 33:
                        {
                        alt8=2;
                        }
                        break;
                    case 34:
                        {
                        alt8=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }

                    switch (alt8) {
                        case 1 :
                            // InternalPascal.g:931:5: ( (lv_operators_1_0= RULE_RELATIONAL_OP ) )
                            {
                            // InternalPascal.g:931:5: ( (lv_operators_1_0= RULE_RELATIONAL_OP ) )
                            // InternalPascal.g:932:6: (lv_operators_1_0= RULE_RELATIONAL_OP )
                            {
                            // InternalPascal.g:932:6: (lv_operators_1_0= RULE_RELATIONAL_OP )
                            // InternalPascal.g:933:7: lv_operators_1_0= RULE_RELATIONAL_OP
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
                            // InternalPascal.g:950:5: ( (lv_operators_2_0= 'in' ) )
                            {
                            // InternalPascal.g:950:5: ( (lv_operators_2_0= 'in' ) )
                            // InternalPascal.g:951:6: (lv_operators_2_0= 'in' )
                            {
                            // InternalPascal.g:951:6: (lv_operators_2_0= 'in' )
                            // InternalPascal.g:952:7: lv_operators_2_0= 'in'
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
                            // InternalPascal.g:965:5: ( (lv_operators_3_0= '=' ) )
                            {
                            // InternalPascal.g:965:5: ( (lv_operators_3_0= '=' ) )
                            // InternalPascal.g:966:6: (lv_operators_3_0= '=' )
                            {
                            // InternalPascal.g:966:6: (lv_operators_3_0= '=' )
                            // InternalPascal.g:967:7: lv_operators_3_0= '='
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

                    // InternalPascal.g:980:4: ( (lv_expressions_4_0= rulesimple_expression ) )
                    // InternalPascal.g:981:5: (lv_expressions_4_0= rulesimple_expression )
                    {
                    // InternalPascal.g:981:5: (lv_expressions_4_0= rulesimple_expression )
                    // InternalPascal.g:982:6: lv_expressions_4_0= rulesimple_expression
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
    // InternalPascal.g:1004:1: entryRulesimple_expression returns [EObject current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final EObject entryRulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_expression = null;


        try {
            // InternalPascal.g:1004:58: (iv_rulesimple_expression= rulesimple_expression EOF )
            // InternalPascal.g:1005:2: iv_rulesimple_expression= rulesimple_expression EOF
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
    // InternalPascal.g:1011:1: rulesimple_expression returns [EObject current=null] : ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* ) ;
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
            // InternalPascal.g:1017:2: ( ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* ) )
            // InternalPascal.g:1018:2: ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* )
            {
            // InternalPascal.g:1018:2: ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* )
            // InternalPascal.g:1019:3: ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )*
            {
            // InternalPascal.g:1019:3: ( (lv_prefixOperator_0_0= RULE_ADDITION_OP ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ADDITION_OP) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPascal.g:1020:4: (lv_prefixOperator_0_0= RULE_ADDITION_OP )
                    {
                    // InternalPascal.g:1020:4: (lv_prefixOperator_0_0= RULE_ADDITION_OP )
                    // InternalPascal.g:1021:5: lv_prefixOperator_0_0= RULE_ADDITION_OP
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

            // InternalPascal.g:1037:3: ( (lv_terms_1_0= ruleterm ) )
            // InternalPascal.g:1038:4: (lv_terms_1_0= ruleterm )
            {
            // InternalPascal.g:1038:4: (lv_terms_1_0= ruleterm )
            // InternalPascal.g:1039:5: lv_terms_1_0= ruleterm
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

            // InternalPascal.g:1056:3: ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ADDITION_OP||LA12_0==35) ) {
                    alt12=1;
                }
                else if ( (LA12_0==RULE_INTEGER_NUMBER||LA12_0==RULE_REAL_NUMBER) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPascal.g:1057:4: ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    {
            	    // InternalPascal.g:1057:4: ( ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    // InternalPascal.g:1058:5: ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) )
            	    {
            	    // InternalPascal.g:1058:5: ( ( (lv_operators_2_0= RULE_ADDITION_OP ) ) | ( (lv_operators_3_0= 'or' ) ) )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==RULE_ADDITION_OP) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==35) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalPascal.g:1059:6: ( (lv_operators_2_0= RULE_ADDITION_OP ) )
            	            {
            	            // InternalPascal.g:1059:6: ( (lv_operators_2_0= RULE_ADDITION_OP ) )
            	            // InternalPascal.g:1060:7: (lv_operators_2_0= RULE_ADDITION_OP )
            	            {
            	            // InternalPascal.g:1060:7: (lv_operators_2_0= RULE_ADDITION_OP )
            	            // InternalPascal.g:1061:8: lv_operators_2_0= RULE_ADDITION_OP
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
            	            // InternalPascal.g:1078:6: ( (lv_operators_3_0= 'or' ) )
            	            {
            	            // InternalPascal.g:1078:6: ( (lv_operators_3_0= 'or' ) )
            	            // InternalPascal.g:1079:7: (lv_operators_3_0= 'or' )
            	            {
            	            // InternalPascal.g:1079:7: (lv_operators_3_0= 'or' )
            	            // InternalPascal.g:1080:8: lv_operators_3_0= 'or'
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

            	    // InternalPascal.g:1093:5: ( (lv_terms_4_0= ruleterm ) )
            	    // InternalPascal.g:1094:6: (lv_terms_4_0= ruleterm )
            	    {
            	    // InternalPascal.g:1094:6: (lv_terms_4_0= ruleterm )
            	    // InternalPascal.g:1095:7: lv_terms_4_0= ruleterm
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
            	    // InternalPascal.g:1114:4: ( (lv_terms_5_0= ruleunsigned_number ) )
            	    {
            	    // InternalPascal.g:1114:4: ( (lv_terms_5_0= ruleunsigned_number ) )
            	    // InternalPascal.g:1115:5: (lv_terms_5_0= ruleunsigned_number )
            	    {
            	    // InternalPascal.g:1115:5: (lv_terms_5_0= ruleunsigned_number )
            	    // InternalPascal.g:1116:6: lv_terms_5_0= ruleunsigned_number
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
            	    break loop12;
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
    // InternalPascal.g:1138:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // InternalPascal.g:1138:45: (iv_ruleterm= ruleterm EOF )
            // InternalPascal.g:1139:2: iv_ruleterm= ruleterm EOF
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
    // InternalPascal.g:1145:1: ruleterm returns [EObject current=null] : ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* ) ;
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
            // InternalPascal.g:1151:2: ( ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* ) )
            // InternalPascal.g:1152:2: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* )
            {
            // InternalPascal.g:1152:2: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* )
            // InternalPascal.g:1153:3: ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )*
            {
            // InternalPascal.g:1153:3: ( (lv_factors_0_0= rulefactor ) )
            // InternalPascal.g:1154:4: (lv_factors_0_0= rulefactor )
            {
            // InternalPascal.g:1154:4: (lv_factors_0_0= rulefactor )
            // InternalPascal.g:1155:5: lv_factors_0_0= rulefactor
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

            // InternalPascal.g:1172:3: ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_MULTIPLICATION_OP||(LA14_0>=36 && LA14_0<=38)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPascal.g:1173:4: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) )
            	    {
            	    // InternalPascal.g:1173:4: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) )
            	    int alt13=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_MULTIPLICATION_OP:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt13=3;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt13=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt13) {
            	        case 1 :
            	            // InternalPascal.g:1174:5: ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) )
            	            {
            	            // InternalPascal.g:1174:5: ( (lv_operators_1_0= RULE_MULTIPLICATION_OP ) )
            	            // InternalPascal.g:1175:6: (lv_operators_1_0= RULE_MULTIPLICATION_OP )
            	            {
            	            // InternalPascal.g:1175:6: (lv_operators_1_0= RULE_MULTIPLICATION_OP )
            	            // InternalPascal.g:1176:7: lv_operators_1_0= RULE_MULTIPLICATION_OP
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
            	            // InternalPascal.g:1193:5: ( (lv_operators_2_0= 'div' ) )
            	            {
            	            // InternalPascal.g:1193:5: ( (lv_operators_2_0= 'div' ) )
            	            // InternalPascal.g:1194:6: (lv_operators_2_0= 'div' )
            	            {
            	            // InternalPascal.g:1194:6: (lv_operators_2_0= 'div' )
            	            // InternalPascal.g:1195:7: lv_operators_2_0= 'div'
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
            	            // InternalPascal.g:1208:5: ( (lv_operators_3_0= 'mod' ) )
            	            {
            	            // InternalPascal.g:1208:5: ( (lv_operators_3_0= 'mod' ) )
            	            // InternalPascal.g:1209:6: (lv_operators_3_0= 'mod' )
            	            {
            	            // InternalPascal.g:1209:6: (lv_operators_3_0= 'mod' )
            	            // InternalPascal.g:1210:7: lv_operators_3_0= 'mod'
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
            	            // InternalPascal.g:1223:5: ( (lv_operators_4_0= 'and' ) )
            	            {
            	            // InternalPascal.g:1223:5: ( (lv_operators_4_0= 'and' ) )
            	            // InternalPascal.g:1224:6: (lv_operators_4_0= 'and' )
            	            {
            	            // InternalPascal.g:1224:6: (lv_operators_4_0= 'and' )
            	            // InternalPascal.g:1225:7: lv_operators_4_0= 'and'
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

            	    // InternalPascal.g:1238:4: ( (lv_factors_5_0= rulefactor ) )
            	    // InternalPascal.g:1239:5: (lv_factors_5_0= rulefactor )
            	    {
            	    // InternalPascal.g:1239:5: (lv_factors_5_0= rulefactor )
            	    // InternalPascal.g:1240:6: lv_factors_5_0= rulefactor
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
            	    break loop14;
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
    // InternalPascal.g:1262:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // InternalPascal.g:1262:47: (iv_rulefactor= rulefactor EOF )
            // InternalPascal.g:1263:2: iv_rulefactor= rulefactor EOF
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
    // InternalPascal.g:1269:1: rulefactor returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) ) ;
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
            // InternalPascal.g:1275:2: ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) ) )
            // InternalPascal.g:1276:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) )
            {
            // InternalPascal.g:1276:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) )
            int alt15=10;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalPascal.g:1277:3: ( (lv_variable_0_0= rulevariable ) )
                    {
                    // InternalPascal.g:1277:3: ( (lv_variable_0_0= rulevariable ) )
                    // InternalPascal.g:1278:4: (lv_variable_0_0= rulevariable )
                    {
                    // InternalPascal.g:1278:4: (lv_variable_0_0= rulevariable )
                    // InternalPascal.g:1279:5: lv_variable_0_0= rulevariable
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
                    // InternalPascal.g:1297:3: ( (lv_number_1_0= rulenumber ) )
                    {
                    // InternalPascal.g:1297:3: ( (lv_number_1_0= rulenumber ) )
                    // InternalPascal.g:1298:4: (lv_number_1_0= rulenumber )
                    {
                    // InternalPascal.g:1298:4: (lv_number_1_0= rulenumber )
                    // InternalPascal.g:1299:5: lv_number_1_0= rulenumber
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
                    // InternalPascal.g:1317:3: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalPascal.g:1317:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalPascal.g:1318:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalPascal.g:1318:4: (lv_string_2_0= RULE_STRING )
                    // InternalPascal.g:1319:5: lv_string_2_0= RULE_STRING
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
                    // InternalPascal.g:1336:3: ( (lv_set_3_0= ruleset ) )
                    {
                    // InternalPascal.g:1336:3: ( (lv_set_3_0= ruleset ) )
                    // InternalPascal.g:1337:4: (lv_set_3_0= ruleset )
                    {
                    // InternalPascal.g:1337:4: (lv_set_3_0= ruleset )
                    // InternalPascal.g:1338:5: lv_set_3_0= ruleset
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
                    // InternalPascal.g:1356:3: ( (lv_nil_4_0= 'nil' ) )
                    {
                    // InternalPascal.g:1356:3: ( (lv_nil_4_0= 'nil' ) )
                    // InternalPascal.g:1357:4: (lv_nil_4_0= 'nil' )
                    {
                    // InternalPascal.g:1357:4: (lv_nil_4_0= 'nil' )
                    // InternalPascal.g:1358:5: lv_nil_4_0= 'nil'
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
                    // InternalPascal.g:1371:3: ( (lv_boolean_5_0= 'true' ) )
                    {
                    // InternalPascal.g:1371:3: ( (lv_boolean_5_0= 'true' ) )
                    // InternalPascal.g:1372:4: (lv_boolean_5_0= 'true' )
                    {
                    // InternalPascal.g:1372:4: (lv_boolean_5_0= 'true' )
                    // InternalPascal.g:1373:5: lv_boolean_5_0= 'true'
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
                    // InternalPascal.g:1386:3: ( (lv_boolean_6_0= 'false' ) )
                    {
                    // InternalPascal.g:1386:3: ( (lv_boolean_6_0= 'false' ) )
                    // InternalPascal.g:1387:4: (lv_boolean_6_0= 'false' )
                    {
                    // InternalPascal.g:1387:4: (lv_boolean_6_0= 'false' )
                    // InternalPascal.g:1388:5: lv_boolean_6_0= 'false'
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
                    // InternalPascal.g:1401:3: ( (lv_function_7_0= rulefunction_designator ) )
                    {
                    // InternalPascal.g:1401:3: ( (lv_function_7_0= rulefunction_designator ) )
                    // InternalPascal.g:1402:4: (lv_function_7_0= rulefunction_designator )
                    {
                    // InternalPascal.g:1402:4: (lv_function_7_0= rulefunction_designator )
                    // InternalPascal.g:1403:5: lv_function_7_0= rulefunction_designator
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
                    // InternalPascal.g:1421:3: (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' )
                    {
                    // InternalPascal.g:1421:3: (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' )
                    // InternalPascal.g:1422:4: otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,42,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_8_0());
                    			
                    // InternalPascal.g:1426:4: ( (lv_expression_9_0= ruleexpression ) )
                    // InternalPascal.g:1427:5: (lv_expression_9_0= ruleexpression )
                    {
                    // InternalPascal.g:1427:5: (lv_expression_9_0= ruleexpression )
                    // InternalPascal.g:1428:6: lv_expression_9_0= ruleexpression
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
                    // InternalPascal.g:1451:3: (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) )
                    {
                    // InternalPascal.g:1451:3: (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) )
                    // InternalPascal.g:1452:4: otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) )
                    {
                    otherlv_11=(Token)match(input,44,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getFactorAccess().getNotKeyword_9_0());
                    			
                    // InternalPascal.g:1456:4: ( (lv_not_12_0= rulefactor ) )
                    // InternalPascal.g:1457:5: (lv_not_12_0= rulefactor )
                    {
                    // InternalPascal.g:1457:5: (lv_not_12_0= rulefactor )
                    // InternalPascal.g:1458:6: lv_not_12_0= rulefactor
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
    // InternalPascal.g:1480:1: entryRulefunction_designator returns [EObject current=null] : iv_rulefunction_designator= rulefunction_designator EOF ;
    public final EObject entryRulefunction_designator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_designator = null;


        try {
            // InternalPascal.g:1480:60: (iv_rulefunction_designator= rulefunction_designator EOF )
            // InternalPascal.g:1481:2: iv_rulefunction_designator= rulefunction_designator EOF
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
    // InternalPascal.g:1487:1: rulefunction_designator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' ) ;
    public final EObject rulefunction_designator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1493:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' ) )
            // InternalPascal.g:1494:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' )
            {
            // InternalPascal.g:1494:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' )
            // InternalPascal.g:1495:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')'
            {
            // InternalPascal.g:1495:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:1496:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:1496:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:1497:5: lv_name_0_0= RULE_ID
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
            		
            // InternalPascal.g:1517:3: ( (lv_expressions_2_0= ruleexpression_list ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INTEGER_NUMBER)||LA16_0==RULE_ADDITION_OP||(LA16_0>=RULE_STRING && LA16_0<=RULE_REAL_NUMBER)||LA16_0==29||(LA16_0>=39 && LA16_0<=42)||LA16_0==44) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPascal.g:1518:4: (lv_expressions_2_0= ruleexpression_list )
                    {
                    // InternalPascal.g:1518:4: (lv_expressions_2_0= ruleexpression_list )
                    // InternalPascal.g:1519:5: lv_expressions_2_0= ruleexpression_list
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
    // InternalPascal.g:1544:1: entryRulefunction_procedure_declaration returns [EObject current=null] : iv_rulefunction_procedure_declaration= rulefunction_procedure_declaration EOF ;
    public final EObject entryRulefunction_procedure_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_procedure_declaration = null;


        try {
            // InternalPascal.g:1544:71: (iv_rulefunction_procedure_declaration= rulefunction_procedure_declaration EOF )
            // InternalPascal.g:1545:2: iv_rulefunction_procedure_declaration= rulefunction_procedure_declaration EOF
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
    // InternalPascal.g:1551:1: rulefunction_procedure_declaration returns [EObject current=null] : ( ( ( (lv_procedures_0_0= rulefunction_declaration ) ) | ( (lv_functions_1_0= ruleprocedure_declaration ) ) ) otherlv_2= ';' )+ ;
    public final EObject rulefunction_procedure_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_procedures_0_0 = null;

        EObject lv_functions_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1557:2: ( ( ( ( (lv_procedures_0_0= rulefunction_declaration ) ) | ( (lv_functions_1_0= ruleprocedure_declaration ) ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:1558:2: ( ( ( (lv_procedures_0_0= rulefunction_declaration ) ) | ( (lv_functions_1_0= ruleprocedure_declaration ) ) ) otherlv_2= ';' )+
            {
            // InternalPascal.g:1558:2: ( ( ( (lv_procedures_0_0= rulefunction_declaration ) ) | ( (lv_functions_1_0= ruleprocedure_declaration ) ) ) otherlv_2= ';' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==45||LA18_0==47) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPascal.g:1559:3: ( ( (lv_procedures_0_0= rulefunction_declaration ) ) | ( (lv_functions_1_0= ruleprocedure_declaration ) ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:1559:3: ( ( (lv_procedures_0_0= rulefunction_declaration ) ) | ( (lv_functions_1_0= ruleprocedure_declaration ) ) )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==45) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==47) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalPascal.g:1560:4: ( (lv_procedures_0_0= rulefunction_declaration ) )
            	            {
            	            // InternalPascal.g:1560:4: ( (lv_procedures_0_0= rulefunction_declaration ) )
            	            // InternalPascal.g:1561:5: (lv_procedures_0_0= rulefunction_declaration )
            	            {
            	            // InternalPascal.g:1561:5: (lv_procedures_0_0= rulefunction_declaration )
            	            // InternalPascal.g:1562:6: lv_procedures_0_0= rulefunction_declaration
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
            	            // InternalPascal.g:1580:4: ( (lv_functions_1_0= ruleprocedure_declaration ) )
            	            {
            	            // InternalPascal.g:1580:4: ( (lv_functions_1_0= ruleprocedure_declaration ) )
            	            // InternalPascal.g:1581:5: (lv_functions_1_0= ruleprocedure_declaration )
            	            {
            	            // InternalPascal.g:1581:5: (lv_functions_1_0= ruleprocedure_declaration )
            	            // InternalPascal.g:1582:6: lv_functions_1_0= ruleprocedure_declaration
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
    // InternalPascal.g:1608:1: entryRulefunction_heading returns [EObject current=null] : iv_rulefunction_heading= rulefunction_heading EOF ;
    public final EObject entryRulefunction_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_heading = null;


        try {
            // InternalPascal.g:1608:57: (iv_rulefunction_heading= rulefunction_heading EOF )
            // InternalPascal.g:1609:2: iv_rulefunction_heading= rulefunction_heading EOF
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
    // InternalPascal.g:1615:1: rulefunction_heading returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) ) ;
    public final EObject rulefunction_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_returnType_4_0=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1621:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) ) )
            // InternalPascal.g:1622:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) )
            {
            // InternalPascal.g:1622:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) )
            // InternalPascal.g:1623:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFunction_headingAccess().getFunctionKeyword_0());
            		
            // InternalPascal.g:1627:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:1628:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:1628:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:1629:5: lv_name_1_0= RULE_ID
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

            // InternalPascal.g:1645:3: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPascal.g:1646:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:1646:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:1647:5: lv_parameters_2_0= ruleformal_parameter_list
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
            		
            // InternalPascal.g:1668:3: ( (lv_returnType_4_0= RULE_ID ) )
            // InternalPascal.g:1669:4: (lv_returnType_4_0= RULE_ID )
            {
            // InternalPascal.g:1669:4: (lv_returnType_4_0= RULE_ID )
            // InternalPascal.g:1670:5: lv_returnType_4_0= RULE_ID
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
    // InternalPascal.g:1690:1: entryRulefunction_declaration returns [EObject current=null] : iv_rulefunction_declaration= rulefunction_declaration EOF ;
    public final EObject entryRulefunction_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_declaration = null;


        try {
            // InternalPascal.g:1690:61: (iv_rulefunction_declaration= rulefunction_declaration EOF )
            // InternalPascal.g:1691:2: iv_rulefunction_declaration= rulefunction_declaration EOF
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
    // InternalPascal.g:1697:1: rulefunction_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) ) ;
    public final EObject rulefunction_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1703:2: ( ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) ) )
            // InternalPascal.g:1704:2: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) )
            {
            // InternalPascal.g:1704:2: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) )
            // InternalPascal.g:1705:3: ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) )
            {
            // InternalPascal.g:1705:3: ( (lv_heading_0_0= rulefunction_heading ) )
            // InternalPascal.g:1706:4: (lv_heading_0_0= rulefunction_heading )
            {
            // InternalPascal.g:1706:4: (lv_heading_0_0= rulefunction_heading )
            // InternalPascal.g:1707:5: lv_heading_0_0= rulefunction_heading
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
            		
            // InternalPascal.g:1728:3: ( (lv_block_2_0= ruleblock ) )
            // InternalPascal.g:1729:4: (lv_block_2_0= ruleblock )
            {
            // InternalPascal.g:1729:4: (lv_block_2_0= ruleblock )
            // InternalPascal.g:1730:5: lv_block_2_0= ruleblock
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
    // InternalPascal.g:1751:1: entryRuleformal_parameter_list returns [EObject current=null] : iv_ruleformal_parameter_list= ruleformal_parameter_list EOF ;
    public final EObject entryRuleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_list = null;


        try {
            // InternalPascal.g:1751:62: (iv_ruleformal_parameter_list= ruleformal_parameter_list EOF )
            // InternalPascal.g:1752:2: iv_ruleformal_parameter_list= ruleformal_parameter_list EOF
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
    // InternalPascal.g:1758:1: ruleformal_parameter_list returns [EObject current=null] : (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1764:2: ( (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) )
            // InternalPascal.g:1765:2: (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            {
            // InternalPascal.g:1765:2: (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            // InternalPascal.g:1766:3: otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0());
            		
            // InternalPascal.g:1770:3: ( (lv_parameters_1_0= ruleformal_parameter_section ) )
            // InternalPascal.g:1771:4: (lv_parameters_1_0= ruleformal_parameter_section )
            {
            // InternalPascal.g:1771:4: (lv_parameters_1_0= ruleformal_parameter_section )
            // InternalPascal.g:1772:5: lv_parameters_1_0= ruleformal_parameter_section
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

            // InternalPascal.g:1789:3: (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPascal.g:1790:4: otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalPascal.g:1794:4: ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    // InternalPascal.g:1795:5: (lv_parameters_3_0= ruleformal_parameter_section )
            	    {
            	    // InternalPascal.g:1795:5: (lv_parameters_3_0= ruleformal_parameter_section )
            	    // InternalPascal.g:1796:6: lv_parameters_3_0= ruleformal_parameter_section
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
            	    break loop20;
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
    // InternalPascal.g:1822:1: entryRuleformal_parameter_section returns [EObject current=null] : iv_ruleformal_parameter_section= ruleformal_parameter_section EOF ;
    public final EObject entryRuleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_section = null;


        try {
            // InternalPascal.g:1822:65: (iv_ruleformal_parameter_section= ruleformal_parameter_section EOF )
            // InternalPascal.g:1823:2: iv_ruleformal_parameter_section= ruleformal_parameter_section EOF
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
    // InternalPascal.g:1829:1: ruleformal_parameter_section returns [EObject current=null] : ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) ;
    public final EObject ruleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_procedure_2_0 = null;

        EObject lv_function_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1835:2: ( ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) )
            // InternalPascal.g:1836:2: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            {
            // InternalPascal.g:1836:2: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt21=1;
                }
                break;
            case 46:
                {
                alt21=2;
                }
                break;
            case 47:
                {
                alt21=3;
                }
                break;
            case 45:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalPascal.g:1837:3: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    {
                    // InternalPascal.g:1837:3: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    // InternalPascal.g:1838:4: (lv_value_0_0= rulevalue_parameter_section )
                    {
                    // InternalPascal.g:1838:4: (lv_value_0_0= rulevalue_parameter_section )
                    // InternalPascal.g:1839:5: lv_value_0_0= rulevalue_parameter_section
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
                    // InternalPascal.g:1857:3: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    {
                    // InternalPascal.g:1857:3: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    // InternalPascal.g:1858:4: (lv_variable_1_0= rulevariable_parameter_section )
                    {
                    // InternalPascal.g:1858:4: (lv_variable_1_0= rulevariable_parameter_section )
                    // InternalPascal.g:1859:5: lv_variable_1_0= rulevariable_parameter_section
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
                    // InternalPascal.g:1877:3: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    {
                    // InternalPascal.g:1877:3: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    // InternalPascal.g:1878:4: (lv_procedure_2_0= ruleprocedure_heading )
                    {
                    // InternalPascal.g:1878:4: (lv_procedure_2_0= ruleprocedure_heading )
                    // InternalPascal.g:1879:5: lv_procedure_2_0= ruleprocedure_heading
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
                    // InternalPascal.g:1897:3: ( (lv_function_3_0= rulefunction_heading ) )
                    {
                    // InternalPascal.g:1897:3: ( (lv_function_3_0= rulefunction_heading ) )
                    // InternalPascal.g:1898:4: (lv_function_3_0= rulefunction_heading )
                    {
                    // InternalPascal.g:1898:4: (lv_function_3_0= rulefunction_heading )
                    // InternalPascal.g:1899:5: lv_function_3_0= rulefunction_heading
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
    // InternalPascal.g:1920:1: entryRulevalue_parameter_section returns [EObject current=null] : iv_rulevalue_parameter_section= rulevalue_parameter_section EOF ;
    public final EObject entryRulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalue_parameter_section = null;


        try {
            // InternalPascal.g:1920:64: (iv_rulevalue_parameter_section= rulevalue_parameter_section EOF )
            // InternalPascal.g:1921:2: iv_rulevalue_parameter_section= rulevalue_parameter_section EOF
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
    // InternalPascal.g:1927:1: rulevalue_parameter_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) ) ;
    public final EObject rulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1933:2: ( ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:1934:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:1934:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) )
            // InternalPascal.g:1935:3: ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) )
            {
            // InternalPascal.g:1935:3: ( (lv_identifiers_0_0= ruleidentifier_list ) )
            // InternalPascal.g:1936:4: (lv_identifiers_0_0= ruleidentifier_list )
            {
            // InternalPascal.g:1936:4: (lv_identifiers_0_0= ruleidentifier_list )
            // InternalPascal.g:1937:5: lv_identifiers_0_0= ruleidentifier_list
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
            		
            // InternalPascal.g:1958:3: ( (lv_type_2_0= ruleparameter_type ) )
            // InternalPascal.g:1959:4: (lv_type_2_0= ruleparameter_type )
            {
            // InternalPascal.g:1959:4: (lv_type_2_0= ruleparameter_type )
            // InternalPascal.g:1960:5: lv_type_2_0= ruleparameter_type
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
    // InternalPascal.g:1981:1: entryRuleidentifier_list returns [EObject current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final EObject entryRuleidentifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifier_list = null;


        try {
            // InternalPascal.g:1981:56: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // InternalPascal.g:1982:2: iv_ruleidentifier_list= ruleidentifier_list EOF
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
    // InternalPascal.g:1988:1: ruleidentifier_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleidentifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;


        	enterRule();

        try {
            // InternalPascal.g:1994:2: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // InternalPascal.g:1995:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // InternalPascal.g:1995:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            // InternalPascal.g:1996:3: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // InternalPascal.g:1996:3: ( (lv_names_0_0= RULE_ID ) )
            // InternalPascal.g:1997:4: (lv_names_0_0= RULE_ID )
            {
            // InternalPascal.g:1997:4: (lv_names_0_0= RULE_ID )
            // InternalPascal.g:1998:5: lv_names_0_0= RULE_ID
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

            // InternalPascal.g:2014:3: (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPascal.g:2015:4: otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,32,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:2019:4: ( (lv_names_2_0= RULE_ID ) )
            	    // InternalPascal.g:2020:5: (lv_names_2_0= RULE_ID )
            	    {
            	    // InternalPascal.g:2020:5: (lv_names_2_0= RULE_ID )
            	    // InternalPascal.g:2021:6: lv_names_2_0= RULE_ID
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
            	    break loop22;
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
    // InternalPascal.g:2042:1: entryRuleparameter_type returns [EObject current=null] : iv_ruleparameter_type= ruleparameter_type EOF ;
    public final EObject entryRuleparameter_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_type = null;


        try {
            // InternalPascal.g:2042:55: (iv_ruleparameter_type= ruleparameter_type EOF )
            // InternalPascal.g:2043:2: iv_ruleparameter_type= ruleparameter_type EOF
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
    // InternalPascal.g:2049:1: ruleparameter_type returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleparameter_type() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPascal.g:2055:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPascal.g:2056:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPascal.g:2056:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:2057:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:2057:3: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:2058:4: lv_name_0_0= RULE_ID
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
    // InternalPascal.g:2077:1: entryRulevariable_parameter_section returns [EObject current=null] : iv_rulevariable_parameter_section= rulevariable_parameter_section EOF ;
    public final EObject entryRulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_parameter_section = null;


        try {
            // InternalPascal.g:2077:67: (iv_rulevariable_parameter_section= rulevariable_parameter_section EOF )
            // InternalPascal.g:2078:2: iv_rulevariable_parameter_section= rulevariable_parameter_section EOF
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
    // InternalPascal.g:2084:1: rulevariable_parameter_section returns [EObject current=null] : (otherlv_0= 'var' ( (lv_indentifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) ) ;
    public final EObject rulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_indentifiers_1_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2090:2: ( (otherlv_0= 'var' ( (lv_indentifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:2091:2: (otherlv_0= 'var' ( (lv_indentifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:2091:2: (otherlv_0= 'var' ( (lv_indentifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) )
            // InternalPascal.g:2092:3: otherlv_0= 'var' ( (lv_indentifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0());
            		
            // InternalPascal.g:2096:3: ( (lv_indentifiers_1_0= ruleidentifier_list ) )
            // InternalPascal.g:2097:4: (lv_indentifiers_1_0= ruleidentifier_list )
            {
            // InternalPascal.g:2097:4: (lv_indentifiers_1_0= ruleidentifier_list )
            // InternalPascal.g:2098:5: lv_indentifiers_1_0= ruleidentifier_list
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
            		
            // InternalPascal.g:2119:3: ( (lv_type_3_0= ruleparameter_type ) )
            // InternalPascal.g:2120:4: (lv_type_3_0= ruleparameter_type )
            {
            // InternalPascal.g:2120:4: (lv_type_3_0= ruleparameter_type )
            // InternalPascal.g:2121:5: lv_type_3_0= ruleparameter_type
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
    // InternalPascal.g:2142:1: entryRuleprocedure_declaration returns [EObject current=null] : iv_ruleprocedure_declaration= ruleprocedure_declaration EOF ;
    public final EObject entryRuleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_declaration = null;


        try {
            // InternalPascal.g:2142:62: (iv_ruleprocedure_declaration= ruleprocedure_declaration EOF )
            // InternalPascal.g:2143:2: iv_ruleprocedure_declaration= ruleprocedure_declaration EOF
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
    // InternalPascal.g:2149:1: ruleprocedure_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) ) ;
    public final EObject ruleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2155:2: ( ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) ) )
            // InternalPascal.g:2156:2: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) )
            {
            // InternalPascal.g:2156:2: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) ) )
            // InternalPascal.g:2157:3: ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( (lv_block_2_0= ruleblock ) )
            {
            // InternalPascal.g:2157:3: ( (lv_heading_0_0= ruleprocedure_heading ) )
            // InternalPascal.g:2158:4: (lv_heading_0_0= ruleprocedure_heading )
            {
            // InternalPascal.g:2158:4: (lv_heading_0_0= ruleprocedure_heading )
            // InternalPascal.g:2159:5: lv_heading_0_0= ruleprocedure_heading
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
            		
            // InternalPascal.g:2180:3: ( (lv_block_2_0= ruleblock ) )
            // InternalPascal.g:2181:4: (lv_block_2_0= ruleblock )
            {
            // InternalPascal.g:2181:4: (lv_block_2_0= ruleblock )
            // InternalPascal.g:2182:5: lv_block_2_0= ruleblock
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
    // InternalPascal.g:2203:1: entryRuleprocedure_heading returns [EObject current=null] : iv_ruleprocedure_heading= ruleprocedure_heading EOF ;
    public final EObject entryRuleprocedure_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_heading = null;


        try {
            // InternalPascal.g:2203:58: (iv_ruleprocedure_heading= ruleprocedure_heading EOF )
            // InternalPascal.g:2204:2: iv_ruleprocedure_heading= ruleprocedure_heading EOF
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
    // InternalPascal.g:2210:1: ruleprocedure_heading returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) ;
    public final EObject ruleprocedure_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2216:2: ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) )
            // InternalPascal.g:2217:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            {
            // InternalPascal.g:2217:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            // InternalPascal.g:2218:3: otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0());
            		
            // InternalPascal.g:2222:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:2223:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:2223:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:2224:5: lv_name_1_0= RULE_ID
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

            // InternalPascal.g:2240:3: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPascal.g:2241:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:2241:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:2242:5: lv_parameters_2_0= ruleformal_parameter_list
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
    // InternalPascal.g:2263:1: entryRuleset returns [EObject current=null] : iv_ruleset= ruleset EOF ;
    public final EObject entryRuleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset = null;


        try {
            // InternalPascal.g:2263:44: (iv_ruleset= ruleset EOF )
            // InternalPascal.g:2264:2: iv_ruleset= ruleset EOF
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
    // InternalPascal.g:2270:1: ruleset returns [EObject current=null] : ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) ) ;
    public final EObject ruleset() throws RecognitionException {
        EObject current = null;

        Token lv_brackets_0_0=null;
        Token lv_brackets_2_0=null;
        EObject lv_expressions_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2276:2: ( ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) ) )
            // InternalPascal.g:2277:2: ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) )
            {
            // InternalPascal.g:2277:2: ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) )
            // InternalPascal.g:2278:3: ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) )
            {
            // InternalPascal.g:2278:3: ( (lv_brackets_0_0= '[' ) )
            // InternalPascal.g:2279:4: (lv_brackets_0_0= '[' )
            {
            // InternalPascal.g:2279:4: (lv_brackets_0_0= '[' )
            // InternalPascal.g:2280:5: lv_brackets_0_0= '['
            {
            lv_brackets_0_0=(Token)match(input,29,FOLLOW_27); 

            					newLeafNode(lv_brackets_0_0, grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetRule());
            					}
            					addWithLastConsumed(current, "brackets", lv_brackets_0_0, "[");
            				

            }


            }

            // InternalPascal.g:2292:3: ( (lv_expressions_1_0= ruleexpression_list ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_INTEGER_NUMBER)||LA24_0==RULE_ADDITION_OP||(LA24_0>=RULE_STRING && LA24_0<=RULE_REAL_NUMBER)||LA24_0==29||(LA24_0>=39 && LA24_0<=42)||LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPascal.g:2293:4: (lv_expressions_1_0= ruleexpression_list )
                    {
                    // InternalPascal.g:2293:4: (lv_expressions_1_0= ruleexpression_list )
                    // InternalPascal.g:2294:5: lv_expressions_1_0= ruleexpression_list
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

            // InternalPascal.g:2311:3: ( (lv_brackets_2_0= ']' ) )
            // InternalPascal.g:2312:4: (lv_brackets_2_0= ']' )
            {
            // InternalPascal.g:2312:4: (lv_brackets_2_0= ']' )
            // InternalPascal.g:2313:5: lv_brackets_2_0= ']'
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
    // InternalPascal.g:2329:1: entryRulenumber returns [EObject current=null] : iv_rulenumber= rulenumber EOF ;
    public final EObject entryRulenumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumber = null;


        try {
            // InternalPascal.g:2329:47: (iv_rulenumber= rulenumber EOF )
            // InternalPascal.g:2330:2: iv_rulenumber= rulenumber EOF
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
    // InternalPascal.g:2336:1: rulenumber returns [EObject current=null] : ( (lv_number_0_0= ruleany_number ) ) ;
    public final EObject rulenumber() throws RecognitionException {
        EObject current = null;

        EObject lv_number_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2342:2: ( ( (lv_number_0_0= ruleany_number ) ) )
            // InternalPascal.g:2343:2: ( (lv_number_0_0= ruleany_number ) )
            {
            // InternalPascal.g:2343:2: ( (lv_number_0_0= ruleany_number ) )
            // InternalPascal.g:2344:3: (lv_number_0_0= ruleany_number )
            {
            // InternalPascal.g:2344:3: (lv_number_0_0= ruleany_number )
            // InternalPascal.g:2345:4: lv_number_0_0= ruleany_number
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
    // InternalPascal.g:2365:1: entryRuleany_number returns [EObject current=null] : iv_ruleany_number= ruleany_number EOF ;
    public final EObject entryRuleany_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleany_number = null;


        try {
            // InternalPascal.g:2365:51: (iv_ruleany_number= ruleany_number EOF )
            // InternalPascal.g:2366:2: iv_ruleany_number= ruleany_number EOF
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
    // InternalPascal.g:2372:1: ruleany_number returns [EObject current=null] : (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) ;
    public final EObject ruleany_number() throws RecognitionException {
        EObject current = null;

        EObject this_unsigned_number_0 = null;

        EObject this_signed_number_1 = null;



        	enterRule();

        try {
            // InternalPascal.g:2378:2: ( (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) )
            // InternalPascal.g:2379:2: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            {
            // InternalPascal.g:2379:2: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INTEGER_NUMBER||LA25_0==RULE_REAL_NUMBER) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_SIGNED_INTEGER_NUMBER||LA25_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalPascal.g:2380:3: this_unsigned_number_0= ruleunsigned_number
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
                    // InternalPascal.g:2389:3: this_signed_number_1= rulesigned_number
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


    // $ANTLR start "entryRulesigned_number"
    // InternalPascal.g:2401:1: entryRulesigned_number returns [EObject current=null] : iv_rulesigned_number= rulesigned_number EOF ;
    public final EObject entryRulesigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigned_number = null;


        try {
            // InternalPascal.g:2401:54: (iv_rulesigned_number= rulesigned_number EOF )
            // InternalPascal.g:2402:2: iv_rulesigned_number= rulesigned_number EOF
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
    // InternalPascal.g:2408:1: rulesigned_number returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) ;
    public final EObject rulesigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_real_1_0=null;


        	enterRule();

        try {
            // InternalPascal.g:2414:2: ( ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) )
            // InternalPascal.g:2415:2: ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            {
            // InternalPascal.g:2415:2: ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalPascal.g:2416:3: ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:2416:3: ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    // InternalPascal.g:2417:4: (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:2417:4: (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    // InternalPascal.g:2418:5: lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER
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
                    // InternalPascal.g:2435:3: ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    {
                    // InternalPascal.g:2435:3: ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    // InternalPascal.g:2436:4: (lv_real_1_0= RULE_SIGNED_REAL_NUMBER )
                    {
                    // InternalPascal.g:2436:4: (lv_real_1_0= RULE_SIGNED_REAL_NUMBER )
                    // InternalPascal.g:2437:5: lv_real_1_0= RULE_SIGNED_REAL_NUMBER
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
    // InternalPascal.g:2457:1: entryRuleunsigned_number returns [EObject current=null] : iv_ruleunsigned_number= ruleunsigned_number EOF ;
    public final EObject entryRuleunsigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsigned_number = null;


        try {
            // InternalPascal.g:2457:56: (iv_ruleunsigned_number= ruleunsigned_number EOF )
            // InternalPascal.g:2458:2: iv_ruleunsigned_number= ruleunsigned_number EOF
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
    // InternalPascal.g:2464:1: ruleunsigned_number returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) ;
    public final EObject ruleunsigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_real_1_0=null;


        	enterRule();

        try {
            // InternalPascal.g:2470:2: ( ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) )
            // InternalPascal.g:2471:2: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            {
            // InternalPascal.g:2471:2: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INTEGER_NUMBER) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_REAL_NUMBER) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalPascal.g:2472:3: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:2472:3: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    // InternalPascal.g:2473:4: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:2473:4: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    // InternalPascal.g:2474:5: lv_integer_0_0= RULE_INTEGER_NUMBER
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
                    // InternalPascal.g:2491:3: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    {
                    // InternalPascal.g:2491:3: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    // InternalPascal.g:2492:4: (lv_real_1_0= RULE_REAL_NUMBER )
                    {
                    // InternalPascal.g:2492:4: (lv_real_1_0= RULE_REAL_NUMBER )
                    // InternalPascal.g:2493:5: lv_real_1_0= RULE_REAL_NUMBER
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

    // Delegated rules


    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\12\12\uffff";
    static final String dfa_3s = "\1\4\1\6\12\uffff";
    static final String dfa_4s = "\1\54\1\53\12\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\1\1\10";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\3\uffff\1\3\2\2\20\uffff\1\4\11\uffff\1\5\1\6\1\7\1\10\1\uffff\1\11",
            "\4\12\2\uffff\1\12\11\uffff\1\12\1\uffff\1\12\1\uffff\1\12\2\uffff\12\12\3\uffff\1\13\1\12",
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

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1276:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000A00002000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000178020001D70L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000A0400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000600000082L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800001142L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000007000000202L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00001F8020001D70L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000A00000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000E00000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000178060001D70L});

}