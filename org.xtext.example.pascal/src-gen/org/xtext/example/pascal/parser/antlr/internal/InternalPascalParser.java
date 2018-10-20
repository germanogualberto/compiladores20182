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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ADDITION_OP", "RULE_MULTIPLICATION_OP", "RULE_RELATIONAL_OP", "RULE_PARENTHESES_COMMENT", "RULE_CURLY_BRACKETS_COMMENT", "RULE_INT", "RULE_REAL_NUMBER", "RULE_SIGNED_INTEGER_NUMBER", "RULE_SIGNED_REAL_NUMBER", "RULE_NUMERIC_SUBRANGE", "RULE_DIGIT_SEQUENCE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'('", "')'", "';'", "','"
    };
    public static final int RULE_PARENTHESES_COMMENT=8;
    public static final int RULE_STRING=16;
    public static final int RULE_REAL_NUMBER=11;
    public static final int RULE_SL_COMMENT=18;
    public static final int RULE_DIGIT_SEQUENCE=15;
    public static final int RULE_NUMERIC_SUBRANGE=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=19;
    public static final int RULE_MULTIPLICATION_OP=6;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_SIGNED_INTEGER_NUMBER=12;
    public static final int RULE_SIGNED_REAL_NUMBER=13;
    public static final int RULE_INT=10;
    public static final int T__22=22;
    public static final int RULE_CURLY_BRACKETS_COMMENT=9;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_ADDITION_OP=5;
    public static final int RULE_RELATIONAL_OP=7;
    public static final int T__21=21;

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
        	return "program";
       	}

       	@Override
       	protected PascalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleprogram"
    // InternalPascal.g:64:1: entryRuleprogram returns [EObject current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final EObject entryRuleprogram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram = null;


        try {
            // InternalPascal.g:64:48: (iv_ruleprogram= ruleprogram EOF )
            // InternalPascal.g:65:2: iv_ruleprogram= ruleprogram EOF
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
    // InternalPascal.g:71:1: ruleprogram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleindentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' ) ;
    public final EObject ruleprogram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_identifiers_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:77:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleindentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' ) )
            // InternalPascal.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleindentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' )
            {
            // InternalPascal.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleindentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' )
            // InternalPascal.g:79:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleindentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            // InternalPascal.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:101:3: (otherlv_2= '(' ( (lv_identifiers_3_0= ruleindentifier_list ) ) otherlv_4= ')' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:102:4: otherlv_2= '(' ( (lv_identifiers_3_0= ruleindentifier_list ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalPascal.g:106:4: ( (lv_identifiers_3_0= ruleindentifier_list ) )
                    // InternalPascal.g:107:5: (lv_identifiers_3_0= ruleindentifier_list )
                    {
                    // InternalPascal.g:107:5: (lv_identifiers_3_0= ruleindentifier_list )
                    // InternalPascal.g:108:6: lv_identifiers_3_0= ruleindentifier_list
                    {

                    						newCompositeNode(grammarAccess.getProgramAccess().getIdentifiersIndentifier_listParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_identifiers_3_0=ruleindentifier_list();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramRule());
                    						}
                    						set(
                    							current,
                    							"identifiers",
                    							lv_identifiers_3_0,
                    							"org.xtext.example.pascal.Pascal.indentifier_list");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProgramAccess().getSemicolonKeyword_3());
            		

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


    // $ANTLR start "entryRuleindentifier_list"
    // InternalPascal.g:138:1: entryRuleindentifier_list returns [EObject current=null] : iv_ruleindentifier_list= ruleindentifier_list EOF ;
    public final EObject entryRuleindentifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleindentifier_list = null;


        try {
            // InternalPascal.g:138:57: (iv_ruleindentifier_list= ruleindentifier_list EOF )
            // InternalPascal.g:139:2: iv_ruleindentifier_list= ruleindentifier_list EOF
            {
             newCompositeNode(grammarAccess.getIndentifier_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleindentifier_list=ruleindentifier_list();

            state._fsp--;

             current =iv_ruleindentifier_list; 
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
    // $ANTLR end "entryRuleindentifier_list"


    // $ANTLR start "ruleindentifier_list"
    // InternalPascal.g:145:1: ruleindentifier_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleindentifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;


        	enterRule();

        try {
            // InternalPascal.g:151:2: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // InternalPascal.g:152:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // InternalPascal.g:152:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            // InternalPascal.g:153:3: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // InternalPascal.g:153:3: ( (lv_names_0_0= RULE_ID ) )
            // InternalPascal.g:154:4: (lv_names_0_0= RULE_ID )
            {
            // InternalPascal.g:154:4: (lv_names_0_0= RULE_ID )
            // InternalPascal.g:155:5: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_names_0_0, grammarAccess.getIndentifier_listAccess().getNamesIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndentifier_listRule());
            					}
            					addWithLastConsumed(
            						current,
            						"names",
            						lv_names_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:171:3: (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPascal.g:172:4: otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getIndentifier_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:176:4: ( (lv_names_2_0= RULE_ID ) )
            	    // InternalPascal.g:177:5: (lv_names_2_0= RULE_ID )
            	    {
            	    // InternalPascal.g:177:5: (lv_names_2_0= RULE_ID )
            	    // InternalPascal.g:178:6: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    						newLeafNode(lv_names_2_0, grammarAccess.getIndentifier_listAccess().getNamesIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIndentifier_listRule());
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
    // $ANTLR end "ruleindentifier_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000002L});

}