package org.xtext.example.pascal.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.pascal.services.PascalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ADDITION_OP", "RULE_MULTIPLICATION_OP", "RULE_RELATIONAL_OP", "RULE_PARENTHESES_COMMENT", "RULE_CURLY_BRACKETS_COMMENT", "RULE_DIGIT", "RULE_UNSIGNED_DIGIT_SEQUENCE", "RULE_DIGIT_SEQUENCE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "';'", "'('", "')'", "','"
    };
    public static final int RULE_PARENTHESES_COMMENT=8;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=11;
    public static final int RULE_STRING=14;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__19=19;
    public static final int RULE_DIGIT_SEQUENCE=12;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=17;
    public static final int RULE_MULTIPLICATION_OP=6;
    public static final int RULE_DIGIT=10;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_INT=13;
    public static final int T__22=22;
    public static final int RULE_CURLY_BRACKETS_COMMENT=9;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__23=23;
    public static final int RULE_ADDITION_OP=5;
    public static final int RULE_RELATIONAL_OP=7;
    public static final int T__20=20;
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

    	public void setGrammarAccess(PascalGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleprogram"
    // InternalPascal.g:53:1: entryRuleprogram : ruleprogram EOF ;
    public final void entryRuleprogram() throws RecognitionException {
        try {
            // InternalPascal.g:54:1: ( ruleprogram EOF )
            // InternalPascal.g:55:1: ruleprogram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleprogram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // InternalPascal.g:62:1: ruleprogram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleprogram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalPascal.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalPascal.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalPascal.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalPascal.g:69:3: ( rule__Program__Group__0 )
            // InternalPascal.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRuleindentifier_list"
    // InternalPascal.g:78:1: entryRuleindentifier_list : ruleindentifier_list EOF ;
    public final void entryRuleindentifier_list() throws RecognitionException {
        try {
            // InternalPascal.g:79:1: ( ruleindentifier_list EOF )
            // InternalPascal.g:80:1: ruleindentifier_list EOF
            {
             before(grammarAccess.getIndentifier_listRule()); 
            pushFollow(FOLLOW_1);
            ruleindentifier_list();

            state._fsp--;

             after(grammarAccess.getIndentifier_listRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleindentifier_list"


    // $ANTLR start "ruleindentifier_list"
    // InternalPascal.g:87:1: ruleindentifier_list : ( ( rule__Indentifier_list__Group__0 ) ) ;
    public final void ruleindentifier_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:91:2: ( ( ( rule__Indentifier_list__Group__0 ) ) )
            // InternalPascal.g:92:2: ( ( rule__Indentifier_list__Group__0 ) )
            {
            // InternalPascal.g:92:2: ( ( rule__Indentifier_list__Group__0 ) )
            // InternalPascal.g:93:3: ( rule__Indentifier_list__Group__0 )
            {
             before(grammarAccess.getIndentifier_listAccess().getGroup()); 
            // InternalPascal.g:94:3: ( rule__Indentifier_list__Group__0 )
            // InternalPascal.g:94:4: rule__Indentifier_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Indentifier_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndentifier_listAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleindentifier_list"


    // $ANTLR start "rule__Program__Group__0"
    // InternalPascal.g:102:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:106:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalPascal.g:107:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalPascal.g:114:1: rule__Program__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:118:1: ( ( 'program' ) )
            // InternalPascal.g:119:1: ( 'program' )
            {
            // InternalPascal.g:119:1: ( 'program' )
            // InternalPascal.g:120:2: 'program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getProgramKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalPascal.g:129:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:133:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalPascal.g:134:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalPascal.g:141:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:145:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalPascal.g:146:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalPascal.g:146:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalPascal.g:147:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalPascal.g:148:2: ( rule__Program__NameAssignment_1 )
            // InternalPascal.g:148:3: rule__Program__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalPascal.g:156:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:160:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalPascal.g:161:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalPascal.g:168:1: rule__Program__Group__2__Impl : ( ( rule__Program__Group_2__0 )? ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:172:1: ( ( ( rule__Program__Group_2__0 )? ) )
            // InternalPascal.g:173:1: ( ( rule__Program__Group_2__0 )? )
            {
            // InternalPascal.g:173:1: ( ( rule__Program__Group_2__0 )? )
            // InternalPascal.g:174:2: ( rule__Program__Group_2__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_2()); 
            // InternalPascal.g:175:2: ( rule__Program__Group_2__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:175:3: rule__Program__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // InternalPascal.g:183:1: rule__Program__Group__3 : rule__Program__Group__3__Impl ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:187:1: ( rule__Program__Group__3__Impl )
            // InternalPascal.g:188:2: rule__Program__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // InternalPascal.g:194:1: rule__Program__Group__3__Impl : ( ';' ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:198:1: ( ( ';' ) )
            // InternalPascal.g:199:1: ( ';' )
            {
            // InternalPascal.g:199:1: ( ';' )
            // InternalPascal.g:200:2: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group_2__0"
    // InternalPascal.g:210:1: rule__Program__Group_2__0 : rule__Program__Group_2__0__Impl rule__Program__Group_2__1 ;
    public final void rule__Program__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:214:1: ( rule__Program__Group_2__0__Impl rule__Program__Group_2__1 )
            // InternalPascal.g:215:2: rule__Program__Group_2__0__Impl rule__Program__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__0"


    // $ANTLR start "rule__Program__Group_2__0__Impl"
    // InternalPascal.g:222:1: rule__Program__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Program__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:226:1: ( ( '(' ) )
            // InternalPascal.g:227:1: ( '(' )
            {
            // InternalPascal.g:227:1: ( '(' )
            // InternalPascal.g:228:2: '('
            {
             before(grammarAccess.getProgramAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__0__Impl"


    // $ANTLR start "rule__Program__Group_2__1"
    // InternalPascal.g:237:1: rule__Program__Group_2__1 : rule__Program__Group_2__1__Impl rule__Program__Group_2__2 ;
    public final void rule__Program__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:241:1: ( rule__Program__Group_2__1__Impl rule__Program__Group_2__2 )
            // InternalPascal.g:242:2: rule__Program__Group_2__1__Impl rule__Program__Group_2__2
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__1"


    // $ANTLR start "rule__Program__Group_2__1__Impl"
    // InternalPascal.g:249:1: rule__Program__Group_2__1__Impl : ( ( rule__Program__IdentifiersAssignment_2_1 ) ) ;
    public final void rule__Program__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:253:1: ( ( ( rule__Program__IdentifiersAssignment_2_1 ) ) )
            // InternalPascal.g:254:1: ( ( rule__Program__IdentifiersAssignment_2_1 ) )
            {
            // InternalPascal.g:254:1: ( ( rule__Program__IdentifiersAssignment_2_1 ) )
            // InternalPascal.g:255:2: ( rule__Program__IdentifiersAssignment_2_1 )
            {
             before(grammarAccess.getProgramAccess().getIdentifiersAssignment_2_1()); 
            // InternalPascal.g:256:2: ( rule__Program__IdentifiersAssignment_2_1 )
            // InternalPascal.g:256:3: rule__Program__IdentifiersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__IdentifiersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getIdentifiersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__1__Impl"


    // $ANTLR start "rule__Program__Group_2__2"
    // InternalPascal.g:264:1: rule__Program__Group_2__2 : rule__Program__Group_2__2__Impl ;
    public final void rule__Program__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:268:1: ( rule__Program__Group_2__2__Impl )
            // InternalPascal.g:269:2: rule__Program__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__2"


    // $ANTLR start "rule__Program__Group_2__2__Impl"
    // InternalPascal.g:275:1: rule__Program__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Program__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:279:1: ( ( ')' ) )
            // InternalPascal.g:280:1: ( ')' )
            {
            // InternalPascal.g:280:1: ( ')' )
            // InternalPascal.g:281:2: ')'
            {
             before(grammarAccess.getProgramAccess().getRightParenthesisKeyword_2_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__2__Impl"


    // $ANTLR start "rule__Indentifier_list__Group__0"
    // InternalPascal.g:291:1: rule__Indentifier_list__Group__0 : rule__Indentifier_list__Group__0__Impl rule__Indentifier_list__Group__1 ;
    public final void rule__Indentifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:295:1: ( rule__Indentifier_list__Group__0__Impl rule__Indentifier_list__Group__1 )
            // InternalPascal.g:296:2: rule__Indentifier_list__Group__0__Impl rule__Indentifier_list__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Indentifier_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Indentifier_list__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Indentifier_list__Group__0"


    // $ANTLR start "rule__Indentifier_list__Group__0__Impl"
    // InternalPascal.g:303:1: rule__Indentifier_list__Group__0__Impl : ( ( rule__Indentifier_list__NamesAssignment_0 ) ) ;
    public final void rule__Indentifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:307:1: ( ( ( rule__Indentifier_list__NamesAssignment_0 ) ) )
            // InternalPascal.g:308:1: ( ( rule__Indentifier_list__NamesAssignment_0 ) )
            {
            // InternalPascal.g:308:1: ( ( rule__Indentifier_list__NamesAssignment_0 ) )
            // InternalPascal.g:309:2: ( rule__Indentifier_list__NamesAssignment_0 )
            {
             before(grammarAccess.getIndentifier_listAccess().getNamesAssignment_0()); 
            // InternalPascal.g:310:2: ( rule__Indentifier_list__NamesAssignment_0 )
            // InternalPascal.g:310:3: rule__Indentifier_list__NamesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Indentifier_list__NamesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIndentifier_listAccess().getNamesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Indentifier_list__Group__0__Impl"


    // $ANTLR start "rule__Indentifier_list__Group__1"
    // InternalPascal.g:318:1: rule__Indentifier_list__Group__1 : rule__Indentifier_list__Group__1__Impl ;
    public final void rule__Indentifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:322:1: ( rule__Indentifier_list__Group__1__Impl )
            // InternalPascal.g:323:2: rule__Indentifier_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Indentifier_list__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Indentifier_list__Group__1"


    // $ANTLR start "rule__Indentifier_list__Group__1__Impl"
    // InternalPascal.g:329:1: rule__Indentifier_list__Group__1__Impl : ( ( rule__Indentifier_list__Group_1__0 )* ) ;
    public final void rule__Indentifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:333:1: ( ( ( rule__Indentifier_list__Group_1__0 )* ) )
            // InternalPascal.g:334:1: ( ( rule__Indentifier_list__Group_1__0 )* )
            {
            // InternalPascal.g:334:1: ( ( rule__Indentifier_list__Group_1__0 )* )
            // InternalPascal.g:335:2: ( rule__Indentifier_list__Group_1__0 )*
            {
             before(grammarAccess.getIndentifier_listAccess().getGroup_1()); 
            // InternalPascal.g:336:2: ( rule__Indentifier_list__Group_1__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPascal.g:336:3: rule__Indentifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Indentifier_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getIndentifier_listAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Indentifier_list__Group__1__Impl"


    // $ANTLR start "rule__Indentifier_list__Group_1__0"
    // InternalPascal.g:345:1: rule__Indentifier_list__Group_1__0 : rule__Indentifier_list__Group_1__0__Impl rule__Indentifier_list__Group_1__1 ;
    public final void rule__Indentifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:349:1: ( rule__Indentifier_list__Group_1__0__Impl rule__Indentifier_list__Group_1__1 )
            // InternalPascal.g:350:2: rule__Indentifier_list__Group_1__0__Impl rule__Indentifier_list__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Indentifier_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Indentifier_list__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Indentifier_list__Group_1__0"


    // $ANTLR start "rule__Indentifier_list__Group_1__0__Impl"
    // InternalPascal.g:357:1: rule__Indentifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Indentifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:361:1: ( ( ',' ) )
            // InternalPascal.g:362:1: ( ',' )
            {
            // InternalPascal.g:362:1: ( ',' )
            // InternalPascal.g:363:2: ','
            {
             before(grammarAccess.getIndentifier_listAccess().getCommaKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getIndentifier_listAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Indentifier_list__Group_1__0__Impl"


    // $ANTLR start "rule__Indentifier_list__Group_1__1"
    // InternalPascal.g:372:1: rule__Indentifier_list__Group_1__1 : rule__Indentifier_list__Group_1__1__Impl ;
    public final void rule__Indentifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:376:1: ( rule__Indentifier_list__Group_1__1__Impl )
            // InternalPascal.g:377:2: rule__Indentifier_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Indentifier_list__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Indentifier_list__Group_1__1"


    // $ANTLR start "rule__Indentifier_list__Group_1__1__Impl"
    // InternalPascal.g:383:1: rule__Indentifier_list__Group_1__1__Impl : ( ( rule__Indentifier_list__NamesAssignment_1_1 ) ) ;
    public final void rule__Indentifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:387:1: ( ( ( rule__Indentifier_list__NamesAssignment_1_1 ) ) )
            // InternalPascal.g:388:1: ( ( rule__Indentifier_list__NamesAssignment_1_1 ) )
            {
            // InternalPascal.g:388:1: ( ( rule__Indentifier_list__NamesAssignment_1_1 ) )
            // InternalPascal.g:389:2: ( rule__Indentifier_list__NamesAssignment_1_1 )
            {
             before(grammarAccess.getIndentifier_listAccess().getNamesAssignment_1_1()); 
            // InternalPascal.g:390:2: ( rule__Indentifier_list__NamesAssignment_1_1 )
            // InternalPascal.g:390:3: rule__Indentifier_list__NamesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Indentifier_list__NamesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIndentifier_listAccess().getNamesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Indentifier_list__Group_1__1__Impl"


    // $ANTLR start "rule__Program__NameAssignment_1"
    // InternalPascal.g:399:1: rule__Program__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:403:1: ( ( RULE_ID ) )
            // InternalPascal.g:404:2: ( RULE_ID )
            {
            // InternalPascal.g:404:2: ( RULE_ID )
            // InternalPascal.g:405:3: RULE_ID
            {
             before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__NameAssignment_1"


    // $ANTLR start "rule__Program__IdentifiersAssignment_2_1"
    // InternalPascal.g:414:1: rule__Program__IdentifiersAssignment_2_1 : ( ruleindentifier_list ) ;
    public final void rule__Program__IdentifiersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:418:1: ( ( ruleindentifier_list ) )
            // InternalPascal.g:419:2: ( ruleindentifier_list )
            {
            // InternalPascal.g:419:2: ( ruleindentifier_list )
            // InternalPascal.g:420:3: ruleindentifier_list
            {
             before(grammarAccess.getProgramAccess().getIdentifiersIndentifier_listParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleindentifier_list();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getIdentifiersIndentifier_listParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__IdentifiersAssignment_2_1"


    // $ANTLR start "rule__Indentifier_list__NamesAssignment_0"
    // InternalPascal.g:429:1: rule__Indentifier_list__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Indentifier_list__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:433:1: ( ( RULE_ID ) )
            // InternalPascal.g:434:2: ( RULE_ID )
            {
            // InternalPascal.g:434:2: ( RULE_ID )
            // InternalPascal.g:435:3: RULE_ID
            {
             before(grammarAccess.getIndentifier_listAccess().getNamesIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIndentifier_listAccess().getNamesIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Indentifier_list__NamesAssignment_0"


    // $ANTLR start "rule__Indentifier_list__NamesAssignment_1_1"
    // InternalPascal.g:444:1: rule__Indentifier_list__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Indentifier_list__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:448:1: ( ( RULE_ID ) )
            // InternalPascal.g:449:2: ( RULE_ID )
            {
            // InternalPascal.g:449:2: ( RULE_ID )
            // InternalPascal.g:450:3: RULE_ID
            {
             before(grammarAccess.getIndentifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIndentifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Indentifier_list__NamesAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800002L});

}