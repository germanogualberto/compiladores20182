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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_RELATIONAL_OP", "RULE_ADDITION_OP", "RULE_MULTIPLICATION_OP", "RULE_STRING", "RULE_SIGNED_INTEGER_NUMBER", "RULE_SIGNED_REAL_NUMBER", "RULE_INTEGER_NUMBER", "RULE_REAL_NUMBER", "RULE_PARENTHESES_COMMENT", "RULE_CURLY_BRACKETS_COMMENT", "RULE_NUMERIC_SUBRANGE", "RULE_DIGIT_SEQUENCE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "';'", "'('", "')'", "','", "'['", "']'", "'^'", "'not'", "'.'", "'in'", "'='", "'or'", "'div'", "'mod'", "'and'", "'nil'", "'true'", "'false'"
    };
    public static final int RULE_PARENTHESES_COMMENT=13;
    public static final int RULE_STRING=8;
    public static final int RULE_REAL_NUMBER=12;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_DIGIT_SEQUENCE=16;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_NUMERIC_SUBRANGE=15;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=20;
    public static final int RULE_MULTIPLICATION_OP=7;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_SIGNED_INTEGER_NUMBER=9;
    public static final int RULE_SIGNED_REAL_NUMBER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=17;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_CURLY_BRACKETS_COMMENT=14;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_RELATIONAL_OP=5;
    public static final int RULE_ADDITION_OP=6;
    public static final int T__40=40;
    public static final int RULE_INTEGER_NUMBER=11;

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


    // $ANTLR start "entryRulevariable"
    // InternalPascal.g:103:1: entryRulevariable : rulevariable EOF ;
    public final void entryRulevariable() throws RecognitionException {
        try {
            // InternalPascal.g:104:1: ( rulevariable EOF )
            // InternalPascal.g:105:1: rulevariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            rulevariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRulevariable"


    // $ANTLR start "rulevariable"
    // InternalPascal.g:112:1: rulevariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void rulevariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:116:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalPascal.g:117:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalPascal.g:117:2: ( ( rule__Variable__Group__0 ) )
            // InternalPascal.g:118:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalPascal.g:119:3: ( rule__Variable__Group__0 )
            // InternalPascal.g:119:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

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
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRulevar_"
    // InternalPascal.g:128:1: entryRulevar_ : rulevar_ EOF ;
    public final void entryRulevar_() throws RecognitionException {
        try {
            // InternalPascal.g:129:1: ( rulevar_ EOF )
            // InternalPascal.g:130:1: rulevar_ EOF
            {
             before(grammarAccess.getVar_Rule()); 
            pushFollow(FOLLOW_1);
            rulevar_();

            state._fsp--;

             after(grammarAccess.getVar_Rule()); 
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
    // $ANTLR end "entryRulevar_"


    // $ANTLR start "rulevar_"
    // InternalPascal.g:137:1: rulevar_ : ( ( rule__Var___Alternatives )? ) ;
    public final void rulevar_() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:141:2: ( ( ( rule__Var___Alternatives )? ) )
            // InternalPascal.g:142:2: ( ( rule__Var___Alternatives )? )
            {
            // InternalPascal.g:142:2: ( ( rule__Var___Alternatives )? )
            // InternalPascal.g:143:3: ( rule__Var___Alternatives )?
            {
             before(grammarAccess.getVar_Access().getAlternatives()); 
            // InternalPascal.g:144:3: ( rule__Var___Alternatives )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==27||LA1_0==29||LA1_0==31) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:144:4: rule__Var___Alternatives
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var___Alternatives();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVar_Access().getAlternatives()); 

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
    // $ANTLR end "rulevar_"


    // $ANTLR start "entryRuleexpression_list"
    // InternalPascal.g:153:1: entryRuleexpression_list : ruleexpression_list EOF ;
    public final void entryRuleexpression_list() throws RecognitionException {
        try {
            // InternalPascal.g:154:1: ( ruleexpression_list EOF )
            // InternalPascal.g:155:1: ruleexpression_list EOF
            {
             before(grammarAccess.getExpression_listRule()); 
            pushFollow(FOLLOW_1);
            ruleexpression_list();

            state._fsp--;

             after(grammarAccess.getExpression_listRule()); 
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
    // $ANTLR end "entryRuleexpression_list"


    // $ANTLR start "ruleexpression_list"
    // InternalPascal.g:162:1: ruleexpression_list : ( ( rule__Expression_list__Group__0 ) ) ;
    public final void ruleexpression_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:166:2: ( ( ( rule__Expression_list__Group__0 ) ) )
            // InternalPascal.g:167:2: ( ( rule__Expression_list__Group__0 ) )
            {
            // InternalPascal.g:167:2: ( ( rule__Expression_list__Group__0 ) )
            // InternalPascal.g:168:3: ( rule__Expression_list__Group__0 )
            {
             before(grammarAccess.getExpression_listAccess().getGroup()); 
            // InternalPascal.g:169:3: ( rule__Expression_list__Group__0 )
            // InternalPascal.g:169:4: rule__Expression_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_listAccess().getGroup()); 

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
    // $ANTLR end "ruleexpression_list"


    // $ANTLR start "entryRuleexpression"
    // InternalPascal.g:178:1: entryRuleexpression : ruleexpression EOF ;
    public final void entryRuleexpression() throws RecognitionException {
        try {
            // InternalPascal.g:179:1: ( ruleexpression EOF )
            // InternalPascal.g:180:1: ruleexpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalPascal.g:187:1: ruleexpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleexpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:191:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalPascal.g:192:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalPascal.g:192:2: ( ( rule__Expression__Group__0 ) )
            // InternalPascal.g:193:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalPascal.g:194:3: ( rule__Expression__Group__0 )
            // InternalPascal.g:194:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulesimple_expression"
    // InternalPascal.g:203:1: entryRulesimple_expression : rulesimple_expression EOF ;
    public final void entryRulesimple_expression() throws RecognitionException {
        try {
            // InternalPascal.g:204:1: ( rulesimple_expression EOF )
            // InternalPascal.g:205:1: rulesimple_expression EOF
            {
             before(grammarAccess.getSimple_expressionRule()); 
            pushFollow(FOLLOW_1);
            rulesimple_expression();

            state._fsp--;

             after(grammarAccess.getSimple_expressionRule()); 
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
    // $ANTLR end "entryRulesimple_expression"


    // $ANTLR start "rulesimple_expression"
    // InternalPascal.g:212:1: rulesimple_expression : ( ( rule__Simple_expression__Group__0 ) ) ;
    public final void rulesimple_expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:216:2: ( ( ( rule__Simple_expression__Group__0 ) ) )
            // InternalPascal.g:217:2: ( ( rule__Simple_expression__Group__0 ) )
            {
            // InternalPascal.g:217:2: ( ( rule__Simple_expression__Group__0 ) )
            // InternalPascal.g:218:3: ( rule__Simple_expression__Group__0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getGroup()); 
            // InternalPascal.g:219:3: ( rule__Simple_expression__Group__0 )
            // InternalPascal.g:219:4: rule__Simple_expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimple_expressionAccess().getGroup()); 

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
    // $ANTLR end "rulesimple_expression"


    // $ANTLR start "entryRuleterm"
    // InternalPascal.g:228:1: entryRuleterm : ruleterm EOF ;
    public final void entryRuleterm() throws RecognitionException {
        try {
            // InternalPascal.g:229:1: ( ruleterm EOF )
            // InternalPascal.g:230:1: ruleterm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
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
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // InternalPascal.g:237:1: ruleterm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleterm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:241:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalPascal.g:242:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalPascal.g:242:2: ( ( rule__Term__Group__0 ) )
            // InternalPascal.g:243:3: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // InternalPascal.g:244:3: ( rule__Term__Group__0 )
            // InternalPascal.g:244:4: rule__Term__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getGroup()); 

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
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulefactor"
    // InternalPascal.g:253:1: entryRulefactor : rulefactor EOF ;
    public final void entryRulefactor() throws RecognitionException {
        try {
            // InternalPascal.g:254:1: ( rulefactor EOF )
            // InternalPascal.g:255:1: rulefactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            rulefactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
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
    // $ANTLR end "entryRulefactor"


    // $ANTLR start "rulefactor"
    // InternalPascal.g:262:1: rulefactor : ( ( rule__Factor__Alternatives ) ) ;
    public final void rulefactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:266:2: ( ( ( rule__Factor__Alternatives ) ) )
            // InternalPascal.g:267:2: ( ( rule__Factor__Alternatives ) )
            {
            // InternalPascal.g:267:2: ( ( rule__Factor__Alternatives ) )
            // InternalPascal.g:268:3: ( rule__Factor__Alternatives )
            {
             before(grammarAccess.getFactorAccess().getAlternatives()); 
            // InternalPascal.g:269:3: ( rule__Factor__Alternatives )
            // InternalPascal.g:269:4: rule__Factor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getAlternatives()); 

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
    // $ANTLR end "rulefactor"


    // $ANTLR start "entryRulefunction_designator"
    // InternalPascal.g:278:1: entryRulefunction_designator : rulefunction_designator EOF ;
    public final void entryRulefunction_designator() throws RecognitionException {
        try {
            // InternalPascal.g:279:1: ( rulefunction_designator EOF )
            // InternalPascal.g:280:1: rulefunction_designator EOF
            {
             before(grammarAccess.getFunction_designatorRule()); 
            pushFollow(FOLLOW_1);
            rulefunction_designator();

            state._fsp--;

             after(grammarAccess.getFunction_designatorRule()); 
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
    // $ANTLR end "entryRulefunction_designator"


    // $ANTLR start "rulefunction_designator"
    // InternalPascal.g:287:1: rulefunction_designator : ( ( rule__Function_designator__Group__0 ) ) ;
    public final void rulefunction_designator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:291:2: ( ( ( rule__Function_designator__Group__0 ) ) )
            // InternalPascal.g:292:2: ( ( rule__Function_designator__Group__0 ) )
            {
            // InternalPascal.g:292:2: ( ( rule__Function_designator__Group__0 ) )
            // InternalPascal.g:293:3: ( rule__Function_designator__Group__0 )
            {
             before(grammarAccess.getFunction_designatorAccess().getGroup()); 
            // InternalPascal.g:294:3: ( rule__Function_designator__Group__0 )
            // InternalPascal.g:294:4: rule__Function_designator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function_designator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunction_designatorAccess().getGroup()); 

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
    // $ANTLR end "rulefunction_designator"


    // $ANTLR start "entryRuleset"
    // InternalPascal.g:303:1: entryRuleset : ruleset EOF ;
    public final void entryRuleset() throws RecognitionException {
        try {
            // InternalPascal.g:304:1: ( ruleset EOF )
            // InternalPascal.g:305:1: ruleset EOF
            {
             before(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            ruleset();

            state._fsp--;

             after(grammarAccess.getSetRule()); 
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
    // $ANTLR end "entryRuleset"


    // $ANTLR start "ruleset"
    // InternalPascal.g:312:1: ruleset : ( ( rule__Set__Group__0 ) ) ;
    public final void ruleset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:316:2: ( ( ( rule__Set__Group__0 ) ) )
            // InternalPascal.g:317:2: ( ( rule__Set__Group__0 ) )
            {
            // InternalPascal.g:317:2: ( ( rule__Set__Group__0 ) )
            // InternalPascal.g:318:3: ( rule__Set__Group__0 )
            {
             before(grammarAccess.getSetAccess().getGroup()); 
            // InternalPascal.g:319:3: ( rule__Set__Group__0 )
            // InternalPascal.g:319:4: rule__Set__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getGroup()); 

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
    // $ANTLR end "ruleset"


    // $ANTLR start "entryRulenumber"
    // InternalPascal.g:328:1: entryRulenumber : rulenumber EOF ;
    public final void entryRulenumber() throws RecognitionException {
        try {
            // InternalPascal.g:329:1: ( rulenumber EOF )
            // InternalPascal.g:330:1: rulenumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            rulenumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
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
    // $ANTLR end "entryRulenumber"


    // $ANTLR start "rulenumber"
    // InternalPascal.g:337:1: rulenumber : ( ( rule__Number__NumberAssignment ) ) ;
    public final void rulenumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:341:2: ( ( ( rule__Number__NumberAssignment ) ) )
            // InternalPascal.g:342:2: ( ( rule__Number__NumberAssignment ) )
            {
            // InternalPascal.g:342:2: ( ( rule__Number__NumberAssignment ) )
            // InternalPascal.g:343:3: ( rule__Number__NumberAssignment )
            {
             before(grammarAccess.getNumberAccess().getNumberAssignment()); 
            // InternalPascal.g:344:3: ( rule__Number__NumberAssignment )
            // InternalPascal.g:344:4: rule__Number__NumberAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Number__NumberAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getNumberAssignment()); 

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
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRuleany_number"
    // InternalPascal.g:353:1: entryRuleany_number : ruleany_number EOF ;
    public final void entryRuleany_number() throws RecognitionException {
        try {
            // InternalPascal.g:354:1: ( ruleany_number EOF )
            // InternalPascal.g:355:1: ruleany_number EOF
            {
             before(grammarAccess.getAny_numberRule()); 
            pushFollow(FOLLOW_1);
            ruleany_number();

            state._fsp--;

             after(grammarAccess.getAny_numberRule()); 
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
    // $ANTLR end "entryRuleany_number"


    // $ANTLR start "ruleany_number"
    // InternalPascal.g:362:1: ruleany_number : ( ( rule__Any_number__Alternatives ) ) ;
    public final void ruleany_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:366:2: ( ( ( rule__Any_number__Alternatives ) ) )
            // InternalPascal.g:367:2: ( ( rule__Any_number__Alternatives ) )
            {
            // InternalPascal.g:367:2: ( ( rule__Any_number__Alternatives ) )
            // InternalPascal.g:368:3: ( rule__Any_number__Alternatives )
            {
             before(grammarAccess.getAny_numberAccess().getAlternatives()); 
            // InternalPascal.g:369:3: ( rule__Any_number__Alternatives )
            // InternalPascal.g:369:4: rule__Any_number__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Any_number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAny_numberAccess().getAlternatives()); 

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
    // $ANTLR end "ruleany_number"


    // $ANTLR start "entryRulesigned_number"
    // InternalPascal.g:378:1: entryRulesigned_number : rulesigned_number EOF ;
    public final void entryRulesigned_number() throws RecognitionException {
        try {
            // InternalPascal.g:379:1: ( rulesigned_number EOF )
            // InternalPascal.g:380:1: rulesigned_number EOF
            {
             before(grammarAccess.getSigned_numberRule()); 
            pushFollow(FOLLOW_1);
            rulesigned_number();

            state._fsp--;

             after(grammarAccess.getSigned_numberRule()); 
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
    // $ANTLR end "entryRulesigned_number"


    // $ANTLR start "rulesigned_number"
    // InternalPascal.g:387:1: rulesigned_number : ( ( rule__Signed_number__Alternatives ) ) ;
    public final void rulesigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:391:2: ( ( ( rule__Signed_number__Alternatives ) ) )
            // InternalPascal.g:392:2: ( ( rule__Signed_number__Alternatives ) )
            {
            // InternalPascal.g:392:2: ( ( rule__Signed_number__Alternatives ) )
            // InternalPascal.g:393:3: ( rule__Signed_number__Alternatives )
            {
             before(grammarAccess.getSigned_numberAccess().getAlternatives()); 
            // InternalPascal.g:394:3: ( rule__Signed_number__Alternatives )
            // InternalPascal.g:394:4: rule__Signed_number__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Signed_number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSigned_numberAccess().getAlternatives()); 

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
    // $ANTLR end "rulesigned_number"


    // $ANTLR start "entryRuleunsigned_number"
    // InternalPascal.g:403:1: entryRuleunsigned_number : ruleunsigned_number EOF ;
    public final void entryRuleunsigned_number() throws RecognitionException {
        try {
            // InternalPascal.g:404:1: ( ruleunsigned_number EOF )
            // InternalPascal.g:405:1: ruleunsigned_number EOF
            {
             before(grammarAccess.getUnsigned_numberRule()); 
            pushFollow(FOLLOW_1);
            ruleunsigned_number();

            state._fsp--;

             after(grammarAccess.getUnsigned_numberRule()); 
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
    // $ANTLR end "entryRuleunsigned_number"


    // $ANTLR start "ruleunsigned_number"
    // InternalPascal.g:412:1: ruleunsigned_number : ( ( rule__Unsigned_number__Alternatives ) ) ;
    public final void ruleunsigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:416:2: ( ( ( rule__Unsigned_number__Alternatives ) ) )
            // InternalPascal.g:417:2: ( ( rule__Unsigned_number__Alternatives ) )
            {
            // InternalPascal.g:417:2: ( ( rule__Unsigned_number__Alternatives ) )
            // InternalPascal.g:418:3: ( rule__Unsigned_number__Alternatives )
            {
             before(grammarAccess.getUnsigned_numberAccess().getAlternatives()); 
            // InternalPascal.g:419:3: ( rule__Unsigned_number__Alternatives )
            // InternalPascal.g:419:4: rule__Unsigned_number__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Unsigned_number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnsigned_numberAccess().getAlternatives()); 

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
    // $ANTLR end "ruleunsigned_number"


    // $ANTLR start "rule__Var___Alternatives"
    // InternalPascal.g:427:1: rule__Var___Alternatives : ( ( ( rule__Var___Group_0__0 ) ) | ( ( rule__Var___Group_1__0 ) ) | ( ( rule__Var___Group_2__0 ) ) );
    public final void rule__Var___Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:431:1: ( ( ( rule__Var___Group_0__0 ) ) | ( ( rule__Var___Group_1__0 ) ) | ( ( rule__Var___Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPascal.g:432:2: ( ( rule__Var___Group_0__0 ) )
                    {
                    // InternalPascal.g:432:2: ( ( rule__Var___Group_0__0 ) )
                    // InternalPascal.g:433:3: ( rule__Var___Group_0__0 )
                    {
                     before(grammarAccess.getVar_Access().getGroup_0()); 
                    // InternalPascal.g:434:3: ( rule__Var___Group_0__0 )
                    // InternalPascal.g:434:4: rule__Var___Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var___Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVar_Access().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:438:2: ( ( rule__Var___Group_1__0 ) )
                    {
                    // InternalPascal.g:438:2: ( ( rule__Var___Group_1__0 ) )
                    // InternalPascal.g:439:3: ( rule__Var___Group_1__0 )
                    {
                     before(grammarAccess.getVar_Access().getGroup_1()); 
                    // InternalPascal.g:440:3: ( rule__Var___Group_1__0 )
                    // InternalPascal.g:440:4: rule__Var___Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var___Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVar_Access().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:444:2: ( ( rule__Var___Group_2__0 ) )
                    {
                    // InternalPascal.g:444:2: ( ( rule__Var___Group_2__0 ) )
                    // InternalPascal.g:445:3: ( rule__Var___Group_2__0 )
                    {
                     before(grammarAccess.getVar_Access().getGroup_2()); 
                    // InternalPascal.g:446:3: ( rule__Var___Group_2__0 )
                    // InternalPascal.g:446:4: rule__Var___Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var___Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVar_Access().getGroup_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Var___Alternatives"


    // $ANTLR start "rule__Expression__Alternatives_1_0"
    // InternalPascal.g:454:1: rule__Expression__Alternatives_1_0 : ( ( ( rule__Expression__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_2 ) ) );
    public final void rule__Expression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:458:1: ( ( ( rule__Expression__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_RELATIONAL_OP:
                {
                alt3=1;
                }
                break;
            case 32:
                {
                alt3=2;
                }
                break;
            case 33:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPascal.g:459:2: ( ( rule__Expression__OperatorsAssignment_1_0_0 ) )
                    {
                    // InternalPascal.g:459:2: ( ( rule__Expression__OperatorsAssignment_1_0_0 ) )
                    // InternalPascal.g:460:3: ( rule__Expression__OperatorsAssignment_1_0_0 )
                    {
                     before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_0()); 
                    // InternalPascal.g:461:3: ( rule__Expression__OperatorsAssignment_1_0_0 )
                    // InternalPascal.g:461:4: rule__Expression__OperatorsAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__OperatorsAssignment_1_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:465:2: ( ( rule__Expression__OperatorsAssignment_1_0_1 ) )
                    {
                    // InternalPascal.g:465:2: ( ( rule__Expression__OperatorsAssignment_1_0_1 ) )
                    // InternalPascal.g:466:3: ( rule__Expression__OperatorsAssignment_1_0_1 )
                    {
                     before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_1()); 
                    // InternalPascal.g:467:3: ( rule__Expression__OperatorsAssignment_1_0_1 )
                    // InternalPascal.g:467:4: rule__Expression__OperatorsAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__OperatorsAssignment_1_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:471:2: ( ( rule__Expression__OperatorsAssignment_1_0_2 ) )
                    {
                    // InternalPascal.g:471:2: ( ( rule__Expression__OperatorsAssignment_1_0_2 ) )
                    // InternalPascal.g:472:3: ( rule__Expression__OperatorsAssignment_1_0_2 )
                    {
                     before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_2()); 
                    // InternalPascal.g:473:3: ( rule__Expression__OperatorsAssignment_1_0_2 )
                    // InternalPascal.g:473:4: rule__Expression__OperatorsAssignment_1_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__OperatorsAssignment_1_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Expression__Alternatives_1_0"


    // $ANTLR start "rule__Simple_expression__Alternatives_2"
    // InternalPascal.g:481:1: rule__Simple_expression__Alternatives_2 : ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( ( rule__Simple_expression__TermsAssignment_2_1 ) ) );
    public final void rule__Simple_expression__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:485:1: ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( ( rule__Simple_expression__TermsAssignment_2_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ADDITION_OP||LA4_0==34) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_INTEGER_NUMBER && LA4_0<=RULE_REAL_NUMBER)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:486:2: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    {
                    // InternalPascal.g:486:2: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    // InternalPascal.g:487:3: ( rule__Simple_expression__Group_2_0__0 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getGroup_2_0()); 
                    // InternalPascal.g:488:3: ( rule__Simple_expression__Group_2_0__0 )
                    // InternalPascal.g:488:4: rule__Simple_expression__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_expression__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_expressionAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:492:2: ( ( rule__Simple_expression__TermsAssignment_2_1 ) )
                    {
                    // InternalPascal.g:492:2: ( ( rule__Simple_expression__TermsAssignment_2_1 ) )
                    // InternalPascal.g:493:3: ( rule__Simple_expression__TermsAssignment_2_1 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_1()); 
                    // InternalPascal.g:494:3: ( rule__Simple_expression__TermsAssignment_2_1 )
                    // InternalPascal.g:494:4: rule__Simple_expression__TermsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_expression__TermsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Simple_expression__Alternatives_2"


    // $ANTLR start "rule__Simple_expression__Alternatives_2_0_0"
    // InternalPascal.g:502:1: rule__Simple_expression__Alternatives_2_0_0 : ( ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) ) | ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) ) );
    public final void rule__Simple_expression__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:506:1: ( ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) ) | ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ADDITION_OP) ) {
                alt5=1;
            }
            else if ( (LA5_0==34) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:507:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) )
                    {
                    // InternalPascal.g:507:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) )
                    // InternalPascal.g:508:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_0()); 
                    // InternalPascal.g:509:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 )
                    // InternalPascal.g:509:4: rule__Simple_expression__OperatorsAssignment_2_0_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_expression__OperatorsAssignment_2_0_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:513:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) )
                    {
                    // InternalPascal.g:513:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) )
                    // InternalPascal.g:514:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_1()); 
                    // InternalPascal.g:515:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 )
                    // InternalPascal.g:515:4: rule__Simple_expression__OperatorsAssignment_2_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_expression__OperatorsAssignment_2_0_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Simple_expression__Alternatives_2_0_0"


    // $ANTLR start "rule__Term__Alternatives_1_0"
    // InternalPascal.g:523:1: rule__Term__Alternatives_1_0 : ( ( ( rule__Term__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_2 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_3 ) ) );
    public final void rule__Term__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:527:1: ( ( ( rule__Term__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_2 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_3 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_MULTIPLICATION_OP:
                {
                alt6=1;
                }
                break;
            case 35:
                {
                alt6=2;
                }
                break;
            case 36:
                {
                alt6=3;
                }
                break;
            case 37:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPascal.g:528:2: ( ( rule__Term__OperatorsAssignment_1_0_0 ) )
                    {
                    // InternalPascal.g:528:2: ( ( rule__Term__OperatorsAssignment_1_0_0 ) )
                    // InternalPascal.g:529:3: ( rule__Term__OperatorsAssignment_1_0_0 )
                    {
                     before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_0()); 
                    // InternalPascal.g:530:3: ( rule__Term__OperatorsAssignment_1_0_0 )
                    // InternalPascal.g:530:4: rule__Term__OperatorsAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__OperatorsAssignment_1_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:534:2: ( ( rule__Term__OperatorsAssignment_1_0_1 ) )
                    {
                    // InternalPascal.g:534:2: ( ( rule__Term__OperatorsAssignment_1_0_1 ) )
                    // InternalPascal.g:535:3: ( rule__Term__OperatorsAssignment_1_0_1 )
                    {
                     before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_1()); 
                    // InternalPascal.g:536:3: ( rule__Term__OperatorsAssignment_1_0_1 )
                    // InternalPascal.g:536:4: rule__Term__OperatorsAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__OperatorsAssignment_1_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:540:2: ( ( rule__Term__OperatorsAssignment_1_0_2 ) )
                    {
                    // InternalPascal.g:540:2: ( ( rule__Term__OperatorsAssignment_1_0_2 ) )
                    // InternalPascal.g:541:3: ( rule__Term__OperatorsAssignment_1_0_2 )
                    {
                     before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_2()); 
                    // InternalPascal.g:542:3: ( rule__Term__OperatorsAssignment_1_0_2 )
                    // InternalPascal.g:542:4: rule__Term__OperatorsAssignment_1_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__OperatorsAssignment_1_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:546:2: ( ( rule__Term__OperatorsAssignment_1_0_3 ) )
                    {
                    // InternalPascal.g:546:2: ( ( rule__Term__OperatorsAssignment_1_0_3 ) )
                    // InternalPascal.g:547:3: ( rule__Term__OperatorsAssignment_1_0_3 )
                    {
                     before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_3()); 
                    // InternalPascal.g:548:3: ( rule__Term__OperatorsAssignment_1_0_3 )
                    // InternalPascal.g:548:4: rule__Term__OperatorsAssignment_1_0_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__OperatorsAssignment_1_0_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_3()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Term__Alternatives_1_0"


    // $ANTLR start "rule__Factor__Alternatives"
    // InternalPascal.g:556:1: rule__Factor__Alternatives : ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__FunctionAssignment_7 ) ) | ( ( rule__Factor__Group_8__0 ) ) | ( ( rule__Factor__Group_9__0 ) ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:560:1: ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__FunctionAssignment_7 ) ) | ( ( rule__Factor__Group_8__0 ) ) | ( ( rule__Factor__Group_9__0 ) ) )
            int alt7=10;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalPascal.g:561:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    {
                    // InternalPascal.g:561:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    // InternalPascal.g:562:3: ( rule__Factor__VariableAssignment_0 )
                    {
                     before(grammarAccess.getFactorAccess().getVariableAssignment_0()); 
                    // InternalPascal.g:563:3: ( rule__Factor__VariableAssignment_0 )
                    // InternalPascal.g:563:4: rule__Factor__VariableAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__VariableAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getVariableAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:567:2: ( ( rule__Factor__NumberAssignment_1 ) )
                    {
                    // InternalPascal.g:567:2: ( ( rule__Factor__NumberAssignment_1 ) )
                    // InternalPascal.g:568:3: ( rule__Factor__NumberAssignment_1 )
                    {
                     before(grammarAccess.getFactorAccess().getNumberAssignment_1()); 
                    // InternalPascal.g:569:3: ( rule__Factor__NumberAssignment_1 )
                    // InternalPascal.g:569:4: rule__Factor__NumberAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__NumberAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getNumberAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:573:2: ( ( rule__Factor__StringAssignment_2 ) )
                    {
                    // InternalPascal.g:573:2: ( ( rule__Factor__StringAssignment_2 ) )
                    // InternalPascal.g:574:3: ( rule__Factor__StringAssignment_2 )
                    {
                     before(grammarAccess.getFactorAccess().getStringAssignment_2()); 
                    // InternalPascal.g:575:3: ( rule__Factor__StringAssignment_2 )
                    // InternalPascal.g:575:4: rule__Factor__StringAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__StringAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getStringAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:579:2: ( ( rule__Factor__SetAssignment_3 ) )
                    {
                    // InternalPascal.g:579:2: ( ( rule__Factor__SetAssignment_3 ) )
                    // InternalPascal.g:580:3: ( rule__Factor__SetAssignment_3 )
                    {
                     before(grammarAccess.getFactorAccess().getSetAssignment_3()); 
                    // InternalPascal.g:581:3: ( rule__Factor__SetAssignment_3 )
                    // InternalPascal.g:581:4: rule__Factor__SetAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__SetAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getSetAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:585:2: ( ( rule__Factor__NilAssignment_4 ) )
                    {
                    // InternalPascal.g:585:2: ( ( rule__Factor__NilAssignment_4 ) )
                    // InternalPascal.g:586:3: ( rule__Factor__NilAssignment_4 )
                    {
                     before(grammarAccess.getFactorAccess().getNilAssignment_4()); 
                    // InternalPascal.g:587:3: ( rule__Factor__NilAssignment_4 )
                    // InternalPascal.g:587:4: rule__Factor__NilAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__NilAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getNilAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:591:2: ( ( rule__Factor__BooleanAssignment_5 ) )
                    {
                    // InternalPascal.g:591:2: ( ( rule__Factor__BooleanAssignment_5 ) )
                    // InternalPascal.g:592:3: ( rule__Factor__BooleanAssignment_5 )
                    {
                     before(grammarAccess.getFactorAccess().getBooleanAssignment_5()); 
                    // InternalPascal.g:593:3: ( rule__Factor__BooleanAssignment_5 )
                    // InternalPascal.g:593:4: rule__Factor__BooleanAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__BooleanAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getBooleanAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPascal.g:597:2: ( ( rule__Factor__BooleanAssignment_6 ) )
                    {
                    // InternalPascal.g:597:2: ( ( rule__Factor__BooleanAssignment_6 ) )
                    // InternalPascal.g:598:3: ( rule__Factor__BooleanAssignment_6 )
                    {
                     before(grammarAccess.getFactorAccess().getBooleanAssignment_6()); 
                    // InternalPascal.g:599:3: ( rule__Factor__BooleanAssignment_6 )
                    // InternalPascal.g:599:4: rule__Factor__BooleanAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__BooleanAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getBooleanAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalPascal.g:603:2: ( ( rule__Factor__FunctionAssignment_7 ) )
                    {
                    // InternalPascal.g:603:2: ( ( rule__Factor__FunctionAssignment_7 ) )
                    // InternalPascal.g:604:3: ( rule__Factor__FunctionAssignment_7 )
                    {
                     before(grammarAccess.getFactorAccess().getFunctionAssignment_7()); 
                    // InternalPascal.g:605:3: ( rule__Factor__FunctionAssignment_7 )
                    // InternalPascal.g:605:4: rule__Factor__FunctionAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__FunctionAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getFunctionAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalPascal.g:609:2: ( ( rule__Factor__Group_8__0 ) )
                    {
                    // InternalPascal.g:609:2: ( ( rule__Factor__Group_8__0 ) )
                    // InternalPascal.g:610:3: ( rule__Factor__Group_8__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_8()); 
                    // InternalPascal.g:611:3: ( rule__Factor__Group_8__0 )
                    // InternalPascal.g:611:4: rule__Factor__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalPascal.g:615:2: ( ( rule__Factor__Group_9__0 ) )
                    {
                    // InternalPascal.g:615:2: ( ( rule__Factor__Group_9__0 ) )
                    // InternalPascal.g:616:3: ( rule__Factor__Group_9__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_9()); 
                    // InternalPascal.g:617:3: ( rule__Factor__Group_9__0 )
                    // InternalPascal.g:617:4: rule__Factor__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_9()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Factor__Alternatives"


    // $ANTLR start "rule__Any_number__Alternatives"
    // InternalPascal.g:625:1: rule__Any_number__Alternatives : ( ( ruleunsigned_number ) | ( rulesigned_number ) );
    public final void rule__Any_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:629:1: ( ( ruleunsigned_number ) | ( rulesigned_number ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_INTEGER_NUMBER && LA8_0<=RULE_REAL_NUMBER)) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_SIGNED_INTEGER_NUMBER && LA8_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPascal.g:630:2: ( ruleunsigned_number )
                    {
                    // InternalPascal.g:630:2: ( ruleunsigned_number )
                    // InternalPascal.g:631:3: ruleunsigned_number
                    {
                     before(grammarAccess.getAny_numberAccess().getUnsigned_numberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleunsigned_number();

                    state._fsp--;

                     after(grammarAccess.getAny_numberAccess().getUnsigned_numberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:636:2: ( rulesigned_number )
                    {
                    // InternalPascal.g:636:2: ( rulesigned_number )
                    // InternalPascal.g:637:3: rulesigned_number
                    {
                     before(grammarAccess.getAny_numberAccess().getSigned_numberParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulesigned_number();

                    state._fsp--;

                     after(grammarAccess.getAny_numberAccess().getSigned_numberParserRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Any_number__Alternatives"


    // $ANTLR start "rule__Signed_number__Alternatives"
    // InternalPascal.g:646:1: rule__Signed_number__Alternatives : ( ( ( rule__Signed_number__IntegerAssignment_0 ) ) | ( ( rule__Signed_number__RealAssignment_1 ) ) );
    public final void rule__Signed_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:650:1: ( ( ( rule__Signed_number__IntegerAssignment_0 ) ) | ( ( rule__Signed_number__RealAssignment_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:651:2: ( ( rule__Signed_number__IntegerAssignment_0 ) )
                    {
                    // InternalPascal.g:651:2: ( ( rule__Signed_number__IntegerAssignment_0 ) )
                    // InternalPascal.g:652:3: ( rule__Signed_number__IntegerAssignment_0 )
                    {
                     before(grammarAccess.getSigned_numberAccess().getIntegerAssignment_0()); 
                    // InternalPascal.g:653:3: ( rule__Signed_number__IntegerAssignment_0 )
                    // InternalPascal.g:653:4: rule__Signed_number__IntegerAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signed_number__IntegerAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSigned_numberAccess().getIntegerAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:657:2: ( ( rule__Signed_number__RealAssignment_1 ) )
                    {
                    // InternalPascal.g:657:2: ( ( rule__Signed_number__RealAssignment_1 ) )
                    // InternalPascal.g:658:3: ( rule__Signed_number__RealAssignment_1 )
                    {
                     before(grammarAccess.getSigned_numberAccess().getRealAssignment_1()); 
                    // InternalPascal.g:659:3: ( rule__Signed_number__RealAssignment_1 )
                    // InternalPascal.g:659:4: rule__Signed_number__RealAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signed_number__RealAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSigned_numberAccess().getRealAssignment_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Signed_number__Alternatives"


    // $ANTLR start "rule__Unsigned_number__Alternatives"
    // InternalPascal.g:667:1: rule__Unsigned_number__Alternatives : ( ( ( rule__Unsigned_number__IntegerAssignment_0 ) ) | ( ( rule__Unsigned_number__RealAssignment_1 ) ) );
    public final void rule__Unsigned_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:671:1: ( ( ( rule__Unsigned_number__IntegerAssignment_0 ) ) | ( ( rule__Unsigned_number__RealAssignment_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INTEGER_NUMBER) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_REAL_NUMBER) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPascal.g:672:2: ( ( rule__Unsigned_number__IntegerAssignment_0 ) )
                    {
                    // InternalPascal.g:672:2: ( ( rule__Unsigned_number__IntegerAssignment_0 ) )
                    // InternalPascal.g:673:3: ( rule__Unsigned_number__IntegerAssignment_0 )
                    {
                     before(grammarAccess.getUnsigned_numberAccess().getIntegerAssignment_0()); 
                    // InternalPascal.g:674:3: ( rule__Unsigned_number__IntegerAssignment_0 )
                    // InternalPascal.g:674:4: rule__Unsigned_number__IntegerAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unsigned_number__IntegerAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnsigned_numberAccess().getIntegerAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:678:2: ( ( rule__Unsigned_number__RealAssignment_1 ) )
                    {
                    // InternalPascal.g:678:2: ( ( rule__Unsigned_number__RealAssignment_1 ) )
                    // InternalPascal.g:679:3: ( rule__Unsigned_number__RealAssignment_1 )
                    {
                     before(grammarAccess.getUnsigned_numberAccess().getRealAssignment_1()); 
                    // InternalPascal.g:680:3: ( rule__Unsigned_number__RealAssignment_1 )
                    // InternalPascal.g:680:4: rule__Unsigned_number__RealAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unsigned_number__RealAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnsigned_numberAccess().getRealAssignment_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Unsigned_number__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalPascal.g:688:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:692:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalPascal.g:693:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalPascal.g:700:1: rule__Program__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:704:1: ( ( 'program' ) )
            // InternalPascal.g:705:1: ( 'program' )
            {
            // InternalPascal.g:705:1: ( 'program' )
            // InternalPascal.g:706:2: 'program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalPascal.g:715:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:719:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalPascal.g:720:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalPascal.g:727:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:731:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalPascal.g:732:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalPascal.g:732:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalPascal.g:733:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalPascal.g:734:2: ( rule__Program__NameAssignment_1 )
            // InternalPascal.g:734:3: rule__Program__NameAssignment_1
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
    // InternalPascal.g:742:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:746:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalPascal.g:747:2: rule__Program__Group__2__Impl rule__Program__Group__3
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
    // InternalPascal.g:754:1: rule__Program__Group__2__Impl : ( ( rule__Program__Group_2__0 )? ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:758:1: ( ( ( rule__Program__Group_2__0 )? ) )
            // InternalPascal.g:759:1: ( ( rule__Program__Group_2__0 )? )
            {
            // InternalPascal.g:759:1: ( ( rule__Program__Group_2__0 )? )
            // InternalPascal.g:760:2: ( rule__Program__Group_2__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_2()); 
            // InternalPascal.g:761:2: ( rule__Program__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPascal.g:761:3: rule__Program__Group_2__0
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
    // InternalPascal.g:769:1: rule__Program__Group__3 : rule__Program__Group__3__Impl ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:773:1: ( rule__Program__Group__3__Impl )
            // InternalPascal.g:774:2: rule__Program__Group__3__Impl
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
    // InternalPascal.g:780:1: rule__Program__Group__3__Impl : ( ';' ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:784:1: ( ( ';' ) )
            // InternalPascal.g:785:1: ( ';' )
            {
            // InternalPascal.g:785:1: ( ';' )
            // InternalPascal.g:786:2: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalPascal.g:796:1: rule__Program__Group_2__0 : rule__Program__Group_2__0__Impl rule__Program__Group_2__1 ;
    public final void rule__Program__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:800:1: ( rule__Program__Group_2__0__Impl rule__Program__Group_2__1 )
            // InternalPascal.g:801:2: rule__Program__Group_2__0__Impl rule__Program__Group_2__1
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
    // InternalPascal.g:808:1: rule__Program__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Program__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:812:1: ( ( '(' ) )
            // InternalPascal.g:813:1: ( '(' )
            {
            // InternalPascal.g:813:1: ( '(' )
            // InternalPascal.g:814:2: '('
            {
             before(grammarAccess.getProgramAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalPascal.g:823:1: rule__Program__Group_2__1 : rule__Program__Group_2__1__Impl rule__Program__Group_2__2 ;
    public final void rule__Program__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:827:1: ( rule__Program__Group_2__1__Impl rule__Program__Group_2__2 )
            // InternalPascal.g:828:2: rule__Program__Group_2__1__Impl rule__Program__Group_2__2
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
    // InternalPascal.g:835:1: rule__Program__Group_2__1__Impl : ( ( rule__Program__IdentifiersAssignment_2_1 ) ) ;
    public final void rule__Program__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:839:1: ( ( ( rule__Program__IdentifiersAssignment_2_1 ) ) )
            // InternalPascal.g:840:1: ( ( rule__Program__IdentifiersAssignment_2_1 ) )
            {
            // InternalPascal.g:840:1: ( ( rule__Program__IdentifiersAssignment_2_1 ) )
            // InternalPascal.g:841:2: ( rule__Program__IdentifiersAssignment_2_1 )
            {
             before(grammarAccess.getProgramAccess().getIdentifiersAssignment_2_1()); 
            // InternalPascal.g:842:2: ( rule__Program__IdentifiersAssignment_2_1 )
            // InternalPascal.g:842:3: rule__Program__IdentifiersAssignment_2_1
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
    // InternalPascal.g:850:1: rule__Program__Group_2__2 : rule__Program__Group_2__2__Impl ;
    public final void rule__Program__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:854:1: ( rule__Program__Group_2__2__Impl )
            // InternalPascal.g:855:2: rule__Program__Group_2__2__Impl
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
    // InternalPascal.g:861:1: rule__Program__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Program__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:865:1: ( ( ')' ) )
            // InternalPascal.g:866:1: ( ')' )
            {
            // InternalPascal.g:866:1: ( ')' )
            // InternalPascal.g:867:2: ')'
            {
             before(grammarAccess.getProgramAccess().getRightParenthesisKeyword_2_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalPascal.g:877:1: rule__Indentifier_list__Group__0 : rule__Indentifier_list__Group__0__Impl rule__Indentifier_list__Group__1 ;
    public final void rule__Indentifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:881:1: ( rule__Indentifier_list__Group__0__Impl rule__Indentifier_list__Group__1 )
            // InternalPascal.g:882:2: rule__Indentifier_list__Group__0__Impl rule__Indentifier_list__Group__1
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
    // InternalPascal.g:889:1: rule__Indentifier_list__Group__0__Impl : ( ( rule__Indentifier_list__NamesAssignment_0 ) ) ;
    public final void rule__Indentifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:893:1: ( ( ( rule__Indentifier_list__NamesAssignment_0 ) ) )
            // InternalPascal.g:894:1: ( ( rule__Indentifier_list__NamesAssignment_0 ) )
            {
            // InternalPascal.g:894:1: ( ( rule__Indentifier_list__NamesAssignment_0 ) )
            // InternalPascal.g:895:2: ( rule__Indentifier_list__NamesAssignment_0 )
            {
             before(grammarAccess.getIndentifier_listAccess().getNamesAssignment_0()); 
            // InternalPascal.g:896:2: ( rule__Indentifier_list__NamesAssignment_0 )
            // InternalPascal.g:896:3: rule__Indentifier_list__NamesAssignment_0
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
    // InternalPascal.g:904:1: rule__Indentifier_list__Group__1 : rule__Indentifier_list__Group__1__Impl ;
    public final void rule__Indentifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:908:1: ( rule__Indentifier_list__Group__1__Impl )
            // InternalPascal.g:909:2: rule__Indentifier_list__Group__1__Impl
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
    // InternalPascal.g:915:1: rule__Indentifier_list__Group__1__Impl : ( ( rule__Indentifier_list__Group_1__0 )* ) ;
    public final void rule__Indentifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:919:1: ( ( ( rule__Indentifier_list__Group_1__0 )* ) )
            // InternalPascal.g:920:1: ( ( rule__Indentifier_list__Group_1__0 )* )
            {
            // InternalPascal.g:920:1: ( ( rule__Indentifier_list__Group_1__0 )* )
            // InternalPascal.g:921:2: ( rule__Indentifier_list__Group_1__0 )*
            {
             before(grammarAccess.getIndentifier_listAccess().getGroup_1()); 
            // InternalPascal.g:922:2: ( rule__Indentifier_list__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPascal.g:922:3: rule__Indentifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Indentifier_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalPascal.g:931:1: rule__Indentifier_list__Group_1__0 : rule__Indentifier_list__Group_1__0__Impl rule__Indentifier_list__Group_1__1 ;
    public final void rule__Indentifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:935:1: ( rule__Indentifier_list__Group_1__0__Impl rule__Indentifier_list__Group_1__1 )
            // InternalPascal.g:936:2: rule__Indentifier_list__Group_1__0__Impl rule__Indentifier_list__Group_1__1
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
    // InternalPascal.g:943:1: rule__Indentifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Indentifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:947:1: ( ( ',' ) )
            // InternalPascal.g:948:1: ( ',' )
            {
            // InternalPascal.g:948:1: ( ',' )
            // InternalPascal.g:949:2: ','
            {
             before(grammarAccess.getIndentifier_listAccess().getCommaKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPascal.g:958:1: rule__Indentifier_list__Group_1__1 : rule__Indentifier_list__Group_1__1__Impl ;
    public final void rule__Indentifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:962:1: ( rule__Indentifier_list__Group_1__1__Impl )
            // InternalPascal.g:963:2: rule__Indentifier_list__Group_1__1__Impl
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
    // InternalPascal.g:969:1: rule__Indentifier_list__Group_1__1__Impl : ( ( rule__Indentifier_list__NamesAssignment_1_1 ) ) ;
    public final void rule__Indentifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:973:1: ( ( ( rule__Indentifier_list__NamesAssignment_1_1 ) ) )
            // InternalPascal.g:974:1: ( ( rule__Indentifier_list__NamesAssignment_1_1 ) )
            {
            // InternalPascal.g:974:1: ( ( rule__Indentifier_list__NamesAssignment_1_1 ) )
            // InternalPascal.g:975:2: ( rule__Indentifier_list__NamesAssignment_1_1 )
            {
             before(grammarAccess.getIndentifier_listAccess().getNamesAssignment_1_1()); 
            // InternalPascal.g:976:2: ( rule__Indentifier_list__NamesAssignment_1_1 )
            // InternalPascal.g:976:3: rule__Indentifier_list__NamesAssignment_1_1
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


    // $ANTLR start "rule__Variable__Group__0"
    // InternalPascal.g:985:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:989:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalPascal.g:990:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalPascal.g:997:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1001:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalPascal.g:1002:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalPascal.g:1002:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalPascal.g:1003:2: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // InternalPascal.g:1004:2: ( rule__Variable__NameAssignment_0 )
            // InternalPascal.g:1004:3: rule__Variable__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalPascal.g:1012:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1016:1: ( rule__Variable__Group__1__Impl )
            // InternalPascal.g:1017:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__1__Impl();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalPascal.g:1023:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__VariableAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1027:1: ( ( ( rule__Variable__VariableAssignment_1 ) ) )
            // InternalPascal.g:1028:1: ( ( rule__Variable__VariableAssignment_1 ) )
            {
            // InternalPascal.g:1028:1: ( ( rule__Variable__VariableAssignment_1 ) )
            // InternalPascal.g:1029:2: ( rule__Variable__VariableAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getVariableAssignment_1()); 
            // InternalPascal.g:1030:2: ( rule__Variable__VariableAssignment_1 )
            // InternalPascal.g:1030:3: rule__Variable__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getVariableAssignment_1()); 

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
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Var___Group_0__0"
    // InternalPascal.g:1039:1: rule__Var___Group_0__0 : rule__Var___Group_0__0__Impl rule__Var___Group_0__1 ;
    public final void rule__Var___Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1043:1: ( rule__Var___Group_0__0__Impl rule__Var___Group_0__1 )
            // InternalPascal.g:1044:2: rule__Var___Group_0__0__Impl rule__Var___Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Var___Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var___Group_0__1();

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
    // $ANTLR end "rule__Var___Group_0__0"


    // $ANTLR start "rule__Var___Group_0__0__Impl"
    // InternalPascal.g:1051:1: rule__Var___Group_0__0__Impl : ( '[' ) ;
    public final void rule__Var___Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1055:1: ( ( '[' ) )
            // InternalPascal.g:1056:1: ( '[' )
            {
            // InternalPascal.g:1056:1: ( '[' )
            // InternalPascal.g:1057:2: '['
            {
             before(grammarAccess.getVar_Access().getLeftSquareBracketKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVar_Access().getLeftSquareBracketKeyword_0_0()); 

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
    // $ANTLR end "rule__Var___Group_0__0__Impl"


    // $ANTLR start "rule__Var___Group_0__1"
    // InternalPascal.g:1066:1: rule__Var___Group_0__1 : rule__Var___Group_0__1__Impl rule__Var___Group_0__2 ;
    public final void rule__Var___Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1070:1: ( rule__Var___Group_0__1__Impl rule__Var___Group_0__2 )
            // InternalPascal.g:1071:2: rule__Var___Group_0__1__Impl rule__Var___Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__Var___Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var___Group_0__2();

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
    // $ANTLR end "rule__Var___Group_0__1"


    // $ANTLR start "rule__Var___Group_0__1__Impl"
    // InternalPascal.g:1078:1: rule__Var___Group_0__1__Impl : ( ( rule__Var___ExpressionsAssignment_0_1 ) ) ;
    public final void rule__Var___Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1082:1: ( ( ( rule__Var___ExpressionsAssignment_0_1 ) ) )
            // InternalPascal.g:1083:1: ( ( rule__Var___ExpressionsAssignment_0_1 ) )
            {
            // InternalPascal.g:1083:1: ( ( rule__Var___ExpressionsAssignment_0_1 ) )
            // InternalPascal.g:1084:2: ( rule__Var___ExpressionsAssignment_0_1 )
            {
             before(grammarAccess.getVar_Access().getExpressionsAssignment_0_1()); 
            // InternalPascal.g:1085:2: ( rule__Var___ExpressionsAssignment_0_1 )
            // InternalPascal.g:1085:3: rule__Var___ExpressionsAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Var___ExpressionsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVar_Access().getExpressionsAssignment_0_1()); 

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
    // $ANTLR end "rule__Var___Group_0__1__Impl"


    // $ANTLR start "rule__Var___Group_0__2"
    // InternalPascal.g:1093:1: rule__Var___Group_0__2 : rule__Var___Group_0__2__Impl rule__Var___Group_0__3 ;
    public final void rule__Var___Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1097:1: ( rule__Var___Group_0__2__Impl rule__Var___Group_0__3 )
            // InternalPascal.g:1098:2: rule__Var___Group_0__2__Impl rule__Var___Group_0__3
            {
            pushFollow(FOLLOW_8);
            rule__Var___Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var___Group_0__3();

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
    // $ANTLR end "rule__Var___Group_0__2"


    // $ANTLR start "rule__Var___Group_0__2__Impl"
    // InternalPascal.g:1105:1: rule__Var___Group_0__2__Impl : ( ']' ) ;
    public final void rule__Var___Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1109:1: ( ( ']' ) )
            // InternalPascal.g:1110:1: ( ']' )
            {
            // InternalPascal.g:1110:1: ( ']' )
            // InternalPascal.g:1111:2: ']'
            {
             before(grammarAccess.getVar_Access().getRightSquareBracketKeyword_0_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVar_Access().getRightSquareBracketKeyword_0_2()); 

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
    // $ANTLR end "rule__Var___Group_0__2__Impl"


    // $ANTLR start "rule__Var___Group_0__3"
    // InternalPascal.g:1120:1: rule__Var___Group_0__3 : rule__Var___Group_0__3__Impl ;
    public final void rule__Var___Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1124:1: ( rule__Var___Group_0__3__Impl )
            // InternalPascal.g:1125:2: rule__Var___Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var___Group_0__3__Impl();

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
    // $ANTLR end "rule__Var___Group_0__3"


    // $ANTLR start "rule__Var___Group_0__3__Impl"
    // InternalPascal.g:1131:1: rule__Var___Group_0__3__Impl : ( ( rule__Var___ArrayAssignment_0_3 ) ) ;
    public final void rule__Var___Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1135:1: ( ( ( rule__Var___ArrayAssignment_0_3 ) ) )
            // InternalPascal.g:1136:1: ( ( rule__Var___ArrayAssignment_0_3 ) )
            {
            // InternalPascal.g:1136:1: ( ( rule__Var___ArrayAssignment_0_3 ) )
            // InternalPascal.g:1137:2: ( rule__Var___ArrayAssignment_0_3 )
            {
             before(grammarAccess.getVar_Access().getArrayAssignment_0_3()); 
            // InternalPascal.g:1138:2: ( rule__Var___ArrayAssignment_0_3 )
            // InternalPascal.g:1138:3: rule__Var___ArrayAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Var___ArrayAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getVar_Access().getArrayAssignment_0_3()); 

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
    // $ANTLR end "rule__Var___Group_0__3__Impl"


    // $ANTLR start "rule__Var___Group_1__0"
    // InternalPascal.g:1147:1: rule__Var___Group_1__0 : rule__Var___Group_1__0__Impl rule__Var___Group_1__1 ;
    public final void rule__Var___Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1151:1: ( rule__Var___Group_1__0__Impl rule__Var___Group_1__1 )
            // InternalPascal.g:1152:2: rule__Var___Group_1__0__Impl rule__Var___Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Var___Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var___Group_1__1();

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
    // $ANTLR end "rule__Var___Group_1__0"


    // $ANTLR start "rule__Var___Group_1__0__Impl"
    // InternalPascal.g:1159:1: rule__Var___Group_1__0__Impl : ( ( rule__Var___AccessorAssignment_1_0 ) ) ;
    public final void rule__Var___Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1163:1: ( ( ( rule__Var___AccessorAssignment_1_0 ) ) )
            // InternalPascal.g:1164:1: ( ( rule__Var___AccessorAssignment_1_0 ) )
            {
            // InternalPascal.g:1164:1: ( ( rule__Var___AccessorAssignment_1_0 ) )
            // InternalPascal.g:1165:2: ( rule__Var___AccessorAssignment_1_0 )
            {
             before(grammarAccess.getVar_Access().getAccessorAssignment_1_0()); 
            // InternalPascal.g:1166:2: ( rule__Var___AccessorAssignment_1_0 )
            // InternalPascal.g:1166:3: rule__Var___AccessorAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Var___AccessorAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getVar_Access().getAccessorAssignment_1_0()); 

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
    // $ANTLR end "rule__Var___Group_1__0__Impl"


    // $ANTLR start "rule__Var___Group_1__1"
    // InternalPascal.g:1174:1: rule__Var___Group_1__1 : rule__Var___Group_1__1__Impl rule__Var___Group_1__2 ;
    public final void rule__Var___Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1178:1: ( rule__Var___Group_1__1__Impl rule__Var___Group_1__2 )
            // InternalPascal.g:1179:2: rule__Var___Group_1__1__Impl rule__Var___Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Var___Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var___Group_1__2();

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
    // $ANTLR end "rule__Var___Group_1__1"


    // $ANTLR start "rule__Var___Group_1__1__Impl"
    // InternalPascal.g:1186:1: rule__Var___Group_1__1__Impl : ( ( rule__Var___NameAssignment_1_1 ) ) ;
    public final void rule__Var___Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1190:1: ( ( ( rule__Var___NameAssignment_1_1 ) ) )
            // InternalPascal.g:1191:1: ( ( rule__Var___NameAssignment_1_1 ) )
            {
            // InternalPascal.g:1191:1: ( ( rule__Var___NameAssignment_1_1 ) )
            // InternalPascal.g:1192:2: ( rule__Var___NameAssignment_1_1 )
            {
             before(grammarAccess.getVar_Access().getNameAssignment_1_1()); 
            // InternalPascal.g:1193:2: ( rule__Var___NameAssignment_1_1 )
            // InternalPascal.g:1193:3: rule__Var___NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Var___NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVar_Access().getNameAssignment_1_1()); 

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
    // $ANTLR end "rule__Var___Group_1__1__Impl"


    // $ANTLR start "rule__Var___Group_1__2"
    // InternalPascal.g:1201:1: rule__Var___Group_1__2 : rule__Var___Group_1__2__Impl ;
    public final void rule__Var___Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1205:1: ( rule__Var___Group_1__2__Impl )
            // InternalPascal.g:1206:2: rule__Var___Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var___Group_1__2__Impl();

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
    // $ANTLR end "rule__Var___Group_1__2"


    // $ANTLR start "rule__Var___Group_1__2__Impl"
    // InternalPascal.g:1212:1: rule__Var___Group_1__2__Impl : ( ( rule__Var___VariableAssignment_1_2 ) ) ;
    public final void rule__Var___Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1216:1: ( ( ( rule__Var___VariableAssignment_1_2 ) ) )
            // InternalPascal.g:1217:1: ( ( rule__Var___VariableAssignment_1_2 ) )
            {
            // InternalPascal.g:1217:1: ( ( rule__Var___VariableAssignment_1_2 ) )
            // InternalPascal.g:1218:2: ( rule__Var___VariableAssignment_1_2 )
            {
             before(grammarAccess.getVar_Access().getVariableAssignment_1_2()); 
            // InternalPascal.g:1219:2: ( rule__Var___VariableAssignment_1_2 )
            // InternalPascal.g:1219:3: rule__Var___VariableAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Var___VariableAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getVar_Access().getVariableAssignment_1_2()); 

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
    // $ANTLR end "rule__Var___Group_1__2__Impl"


    // $ANTLR start "rule__Var___Group_2__0"
    // InternalPascal.g:1228:1: rule__Var___Group_2__0 : rule__Var___Group_2__0__Impl rule__Var___Group_2__1 ;
    public final void rule__Var___Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1232:1: ( rule__Var___Group_2__0__Impl rule__Var___Group_2__1 )
            // InternalPascal.g:1233:2: rule__Var___Group_2__0__Impl rule__Var___Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Var___Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var___Group_2__1();

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
    // $ANTLR end "rule__Var___Group_2__0"


    // $ANTLR start "rule__Var___Group_2__0__Impl"
    // InternalPascal.g:1240:1: rule__Var___Group_2__0__Impl : ( '^' ) ;
    public final void rule__Var___Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1244:1: ( ( '^' ) )
            // InternalPascal.g:1245:1: ( '^' )
            {
            // InternalPascal.g:1245:1: ( '^' )
            // InternalPascal.g:1246:2: '^'
            {
             before(grammarAccess.getVar_Access().getCircumflexAccentKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVar_Access().getCircumflexAccentKeyword_2_0()); 

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
    // $ANTLR end "rule__Var___Group_2__0__Impl"


    // $ANTLR start "rule__Var___Group_2__1"
    // InternalPascal.g:1255:1: rule__Var___Group_2__1 : rule__Var___Group_2__1__Impl ;
    public final void rule__Var___Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1259:1: ( rule__Var___Group_2__1__Impl )
            // InternalPascal.g:1260:2: rule__Var___Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var___Group_2__1__Impl();

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
    // $ANTLR end "rule__Var___Group_2__1"


    // $ANTLR start "rule__Var___Group_2__1__Impl"
    // InternalPascal.g:1266:1: rule__Var___Group_2__1__Impl : ( ( rule__Var___PointerAssignment_2_1 ) ) ;
    public final void rule__Var___Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1270:1: ( ( ( rule__Var___PointerAssignment_2_1 ) ) )
            // InternalPascal.g:1271:1: ( ( rule__Var___PointerAssignment_2_1 ) )
            {
            // InternalPascal.g:1271:1: ( ( rule__Var___PointerAssignment_2_1 ) )
            // InternalPascal.g:1272:2: ( rule__Var___PointerAssignment_2_1 )
            {
             before(grammarAccess.getVar_Access().getPointerAssignment_2_1()); 
            // InternalPascal.g:1273:2: ( rule__Var___PointerAssignment_2_1 )
            // InternalPascal.g:1273:3: rule__Var___PointerAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Var___PointerAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVar_Access().getPointerAssignment_2_1()); 

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
    // $ANTLR end "rule__Var___Group_2__1__Impl"


    // $ANTLR start "rule__Expression_list__Group__0"
    // InternalPascal.g:1282:1: rule__Expression_list__Group__0 : rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 ;
    public final void rule__Expression_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1286:1: ( rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 )
            // InternalPascal.g:1287:2: rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Expression_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_list__Group__1();

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
    // $ANTLR end "rule__Expression_list__Group__0"


    // $ANTLR start "rule__Expression_list__Group__0__Impl"
    // InternalPascal.g:1294:1: rule__Expression_list__Group__0__Impl : ( ( rule__Expression_list__ExpressionsAssignment_0 ) ) ;
    public final void rule__Expression_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1298:1: ( ( ( rule__Expression_list__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:1299:1: ( ( rule__Expression_list__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:1299:1: ( ( rule__Expression_list__ExpressionsAssignment_0 ) )
            // InternalPascal.g:1300:2: ( rule__Expression_list__ExpressionsAssignment_0 )
            {
             before(grammarAccess.getExpression_listAccess().getExpressionsAssignment_0()); 
            // InternalPascal.g:1301:2: ( rule__Expression_list__ExpressionsAssignment_0 )
            // InternalPascal.g:1301:3: rule__Expression_list__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_list__ExpressionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_listAccess().getExpressionsAssignment_0()); 

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
    // $ANTLR end "rule__Expression_list__Group__0__Impl"


    // $ANTLR start "rule__Expression_list__Group__1"
    // InternalPascal.g:1309:1: rule__Expression_list__Group__1 : rule__Expression_list__Group__1__Impl ;
    public final void rule__Expression_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1313:1: ( rule__Expression_list__Group__1__Impl )
            // InternalPascal.g:1314:2: rule__Expression_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_list__Group__1__Impl();

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
    // $ANTLR end "rule__Expression_list__Group__1"


    // $ANTLR start "rule__Expression_list__Group__1__Impl"
    // InternalPascal.g:1320:1: rule__Expression_list__Group__1__Impl : ( ( rule__Expression_list__Group_1__0 )* ) ;
    public final void rule__Expression_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1324:1: ( ( ( rule__Expression_list__Group_1__0 )* ) )
            // InternalPascal.g:1325:1: ( ( rule__Expression_list__Group_1__0 )* )
            {
            // InternalPascal.g:1325:1: ( ( rule__Expression_list__Group_1__0 )* )
            // InternalPascal.g:1326:2: ( rule__Expression_list__Group_1__0 )*
            {
             before(grammarAccess.getExpression_listAccess().getGroup_1()); 
            // InternalPascal.g:1327:2: ( rule__Expression_list__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPascal.g:1327:3: rule__Expression_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Expression_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getExpression_listAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Expression_list__Group__1__Impl"


    // $ANTLR start "rule__Expression_list__Group_1__0"
    // InternalPascal.g:1336:1: rule__Expression_list__Group_1__0 : rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 ;
    public final void rule__Expression_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1340:1: ( rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 )
            // InternalPascal.g:1341:2: rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Expression_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_list__Group_1__1();

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
    // $ANTLR end "rule__Expression_list__Group_1__0"


    // $ANTLR start "rule__Expression_list__Group_1__0__Impl"
    // InternalPascal.g:1348:1: rule__Expression_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Expression_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1352:1: ( ( ',' ) )
            // InternalPascal.g:1353:1: ( ',' )
            {
            // InternalPascal.g:1353:1: ( ',' )
            // InternalPascal.g:1354:2: ','
            {
             before(grammarAccess.getExpression_listAccess().getCommaKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getExpression_listAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Expression_list__Group_1__0__Impl"


    // $ANTLR start "rule__Expression_list__Group_1__1"
    // InternalPascal.g:1363:1: rule__Expression_list__Group_1__1 : rule__Expression_list__Group_1__1__Impl ;
    public final void rule__Expression_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1367:1: ( rule__Expression_list__Group_1__1__Impl )
            // InternalPascal.g:1368:2: rule__Expression_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_list__Group_1__1__Impl();

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
    // $ANTLR end "rule__Expression_list__Group_1__1"


    // $ANTLR start "rule__Expression_list__Group_1__1__Impl"
    // InternalPascal.g:1374:1: rule__Expression_list__Group_1__1__Impl : ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Expression_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1378:1: ( ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:1379:1: ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:1379:1: ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:1380:2: ( rule__Expression_list__ExpressionsAssignment_1_1 )
            {
             before(grammarAccess.getExpression_listAccess().getExpressionsAssignment_1_1()); 
            // InternalPascal.g:1381:2: ( rule__Expression_list__ExpressionsAssignment_1_1 )
            // InternalPascal.g:1381:3: rule__Expression_list__ExpressionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression_list__ExpressionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpression_listAccess().getExpressionsAssignment_1_1()); 

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
    // $ANTLR end "rule__Expression_list__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalPascal.g:1390:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1394:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalPascal.g:1395:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

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
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalPascal.g:1402:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__ExpressionsAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1406:1: ( ( ( rule__Expression__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:1407:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:1407:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            // InternalPascal.g:1408:2: ( rule__Expression__ExpressionsAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getExpressionsAssignment_0()); 
            // InternalPascal.g:1409:2: ( rule__Expression__ExpressionsAssignment_0 )
            // InternalPascal.g:1409:3: rule__Expression__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ExpressionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getExpressionsAssignment_0()); 

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
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalPascal.g:1417:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1421:1: ( rule__Expression__Group__1__Impl )
            // InternalPascal.g:1422:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

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
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalPascal.g:1428:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1432:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalPascal.g:1433:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalPascal.g:1433:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalPascal.g:1434:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalPascal.g:1435:2: ( rule__Expression__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_RELATIONAL_OP||(LA14_0>=32 && LA14_0<=33)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPascal.g:1435:3: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalPascal.g:1444:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1448:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalPascal.g:1449:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

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
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalPascal.g:1456:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Alternatives_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1460:1: ( ( ( rule__Expression__Alternatives_1_0 ) ) )
            // InternalPascal.g:1461:1: ( ( rule__Expression__Alternatives_1_0 ) )
            {
            // InternalPascal.g:1461:1: ( ( rule__Expression__Alternatives_1_0 ) )
            // InternalPascal.g:1462:2: ( rule__Expression__Alternatives_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 
            // InternalPascal.g:1463:2: ( rule__Expression__Alternatives_1_0 )
            // InternalPascal.g:1463:3: rule__Expression__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalPascal.g:1471:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1475:1: ( rule__Expression__Group_1__1__Impl )
            // InternalPascal.g:1476:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalPascal.g:1482:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1486:1: ( ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:1487:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:1487:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:1488:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getExpressionsAssignment_1_1()); 
            // InternalPascal.g:1489:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            // InternalPascal.g:1489:3: rule__Expression__ExpressionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ExpressionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getExpressionsAssignment_1_1()); 

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
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Simple_expression__Group__0"
    // InternalPascal.g:1498:1: rule__Simple_expression__Group__0 : rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 ;
    public final void rule__Simple_expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1502:1: ( rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 )
            // InternalPascal.g:1503:2: rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Simple_expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group__1();

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
    // $ANTLR end "rule__Simple_expression__Group__0"


    // $ANTLR start "rule__Simple_expression__Group__0__Impl"
    // InternalPascal.g:1510:1: rule__Simple_expression__Group__0__Impl : ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? ) ;
    public final void rule__Simple_expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1514:1: ( ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? ) )
            // InternalPascal.g:1515:1: ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? )
            {
            // InternalPascal.g:1515:1: ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? )
            // InternalPascal.g:1516:2: ( rule__Simple_expression__PrefixOperatorAssignment_0 )?
            {
             before(grammarAccess.getSimple_expressionAccess().getPrefixOperatorAssignment_0()); 
            // InternalPascal.g:1517:2: ( rule__Simple_expression__PrefixOperatorAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ADDITION_OP) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPascal.g:1517:3: rule__Simple_expression__PrefixOperatorAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_expression__PrefixOperatorAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimple_expressionAccess().getPrefixOperatorAssignment_0()); 

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
    // $ANTLR end "rule__Simple_expression__Group__0__Impl"


    // $ANTLR start "rule__Simple_expression__Group__1"
    // InternalPascal.g:1525:1: rule__Simple_expression__Group__1 : rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 ;
    public final void rule__Simple_expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1529:1: ( rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 )
            // InternalPascal.g:1530:2: rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Simple_expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group__2();

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
    // $ANTLR end "rule__Simple_expression__Group__1"


    // $ANTLR start "rule__Simple_expression__Group__1__Impl"
    // InternalPascal.g:1537:1: rule__Simple_expression__Group__1__Impl : ( ( rule__Simple_expression__TermsAssignment_1 ) ) ;
    public final void rule__Simple_expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1541:1: ( ( ( rule__Simple_expression__TermsAssignment_1 ) ) )
            // InternalPascal.g:1542:1: ( ( rule__Simple_expression__TermsAssignment_1 ) )
            {
            // InternalPascal.g:1542:1: ( ( rule__Simple_expression__TermsAssignment_1 ) )
            // InternalPascal.g:1543:2: ( rule__Simple_expression__TermsAssignment_1 )
            {
             before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_1()); 
            // InternalPascal.g:1544:2: ( rule__Simple_expression__TermsAssignment_1 )
            // InternalPascal.g:1544:3: rule__Simple_expression__TermsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__TermsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimple_expressionAccess().getTermsAssignment_1()); 

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
    // $ANTLR end "rule__Simple_expression__Group__1__Impl"


    // $ANTLR start "rule__Simple_expression__Group__2"
    // InternalPascal.g:1552:1: rule__Simple_expression__Group__2 : rule__Simple_expression__Group__2__Impl ;
    public final void rule__Simple_expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1556:1: ( rule__Simple_expression__Group__2__Impl )
            // InternalPascal.g:1557:2: rule__Simple_expression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group__2__Impl();

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
    // $ANTLR end "rule__Simple_expression__Group__2"


    // $ANTLR start "rule__Simple_expression__Group__2__Impl"
    // InternalPascal.g:1563:1: rule__Simple_expression__Group__2__Impl : ( ( rule__Simple_expression__Alternatives_2 )* ) ;
    public final void rule__Simple_expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1567:1: ( ( ( rule__Simple_expression__Alternatives_2 )* ) )
            // InternalPascal.g:1568:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            {
            // InternalPascal.g:1568:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            // InternalPascal.g:1569:2: ( rule__Simple_expression__Alternatives_2 )*
            {
             before(grammarAccess.getSimple_expressionAccess().getAlternatives_2()); 
            // InternalPascal.g:1570:2: ( rule__Simple_expression__Alternatives_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ADDITION_OP||(LA16_0>=RULE_INTEGER_NUMBER && LA16_0<=RULE_REAL_NUMBER)||LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPascal.g:1570:3: rule__Simple_expression__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Simple_expression__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSimple_expressionAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Simple_expression__Group__2__Impl"


    // $ANTLR start "rule__Simple_expression__Group_2_0__0"
    // InternalPascal.g:1579:1: rule__Simple_expression__Group_2_0__0 : rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 ;
    public final void rule__Simple_expression__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1583:1: ( rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 )
            // InternalPascal.g:1584:2: rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Simple_expression__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group_2_0__1();

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
    // $ANTLR end "rule__Simple_expression__Group_2_0__0"


    // $ANTLR start "rule__Simple_expression__Group_2_0__0__Impl"
    // InternalPascal.g:1591:1: rule__Simple_expression__Group_2_0__0__Impl : ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) ;
    public final void rule__Simple_expression__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1595:1: ( ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) )
            // InternalPascal.g:1596:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            {
            // InternalPascal.g:1596:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            // InternalPascal.g:1597:2: ( rule__Simple_expression__Alternatives_2_0_0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getAlternatives_2_0_0()); 
            // InternalPascal.g:1598:2: ( rule__Simple_expression__Alternatives_2_0_0 )
            // InternalPascal.g:1598:3: rule__Simple_expression__Alternatives_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__Alternatives_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSimple_expressionAccess().getAlternatives_2_0_0()); 

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
    // $ANTLR end "rule__Simple_expression__Group_2_0__0__Impl"


    // $ANTLR start "rule__Simple_expression__Group_2_0__1"
    // InternalPascal.g:1606:1: rule__Simple_expression__Group_2_0__1 : rule__Simple_expression__Group_2_0__1__Impl ;
    public final void rule__Simple_expression__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1610:1: ( rule__Simple_expression__Group_2_0__1__Impl )
            // InternalPascal.g:1611:2: rule__Simple_expression__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group_2_0__1__Impl();

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
    // $ANTLR end "rule__Simple_expression__Group_2_0__1"


    // $ANTLR start "rule__Simple_expression__Group_2_0__1__Impl"
    // InternalPascal.g:1617:1: rule__Simple_expression__Group_2_0__1__Impl : ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) ) ;
    public final void rule__Simple_expression__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1621:1: ( ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) ) )
            // InternalPascal.g:1622:1: ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) )
            {
            // InternalPascal.g:1622:1: ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) )
            // InternalPascal.g:1623:2: ( rule__Simple_expression__TermsAssignment_2_0_1 )
            {
             before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_0_1()); 
            // InternalPascal.g:1624:2: ( rule__Simple_expression__TermsAssignment_2_0_1 )
            // InternalPascal.g:1624:3: rule__Simple_expression__TermsAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__TermsAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_0_1()); 

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
    // $ANTLR end "rule__Simple_expression__Group_2_0__1__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // InternalPascal.g:1633:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1637:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalPascal.g:1638:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group__1();

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
    // $ANTLR end "rule__Term__Group__0"


    // $ANTLR start "rule__Term__Group__0__Impl"
    // InternalPascal.g:1645:1: rule__Term__Group__0__Impl : ( ( rule__Term__FactorsAssignment_0 ) ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1649:1: ( ( ( rule__Term__FactorsAssignment_0 ) ) )
            // InternalPascal.g:1650:1: ( ( rule__Term__FactorsAssignment_0 ) )
            {
            // InternalPascal.g:1650:1: ( ( rule__Term__FactorsAssignment_0 ) )
            // InternalPascal.g:1651:2: ( rule__Term__FactorsAssignment_0 )
            {
             before(grammarAccess.getTermAccess().getFactorsAssignment_0()); 
            // InternalPascal.g:1652:2: ( rule__Term__FactorsAssignment_0 )
            // InternalPascal.g:1652:3: rule__Term__FactorsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Term__FactorsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getFactorsAssignment_0()); 

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
    // $ANTLR end "rule__Term__Group__0__Impl"


    // $ANTLR start "rule__Term__Group__1"
    // InternalPascal.g:1660:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1664:1: ( rule__Term__Group__1__Impl )
            // InternalPascal.g:1665:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__1__Impl();

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
    // $ANTLR end "rule__Term__Group__1"


    // $ANTLR start "rule__Term__Group__1__Impl"
    // InternalPascal.g:1671:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1675:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // InternalPascal.g:1676:1: ( ( rule__Term__Group_1__0 )* )
            {
            // InternalPascal.g:1676:1: ( ( rule__Term__Group_1__0 )* )
            // InternalPascal.g:1677:2: ( rule__Term__Group_1__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // InternalPascal.g:1678:2: ( rule__Term__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_MULTIPLICATION_OP||(LA17_0>=35 && LA17_0<=37)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPascal.g:1678:3: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Term__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTermAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Term__Group__1__Impl"


    // $ANTLR start "rule__Term__Group_1__0"
    // InternalPascal.g:1687:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1691:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalPascal.g:1692:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Term__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1();

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
    // $ANTLR end "rule__Term__Group_1__0"


    // $ANTLR start "rule__Term__Group_1__0__Impl"
    // InternalPascal.g:1699:1: rule__Term__Group_1__0__Impl : ( ( rule__Term__Alternatives_1_0 ) ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1703:1: ( ( ( rule__Term__Alternatives_1_0 ) ) )
            // InternalPascal.g:1704:1: ( ( rule__Term__Alternatives_1_0 ) )
            {
            // InternalPascal.g:1704:1: ( ( rule__Term__Alternatives_1_0 ) )
            // InternalPascal.g:1705:2: ( rule__Term__Alternatives_1_0 )
            {
             before(grammarAccess.getTermAccess().getAlternatives_1_0()); 
            // InternalPascal.g:1706:2: ( rule__Term__Alternatives_1_0 )
            // InternalPascal.g:1706:3: rule__Term__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__Term__Group_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1__1"
    // InternalPascal.g:1714:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1718:1: ( rule__Term__Group_1__1__Impl )
            // InternalPascal.g:1719:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1__Impl();

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
    // $ANTLR end "rule__Term__Group_1__1"


    // $ANTLR start "rule__Term__Group_1__1__Impl"
    // InternalPascal.g:1725:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__FactorsAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1729:1: ( ( ( rule__Term__FactorsAssignment_1_1 ) ) )
            // InternalPascal.g:1730:1: ( ( rule__Term__FactorsAssignment_1_1 ) )
            {
            // InternalPascal.g:1730:1: ( ( rule__Term__FactorsAssignment_1_1 ) )
            // InternalPascal.g:1731:2: ( rule__Term__FactorsAssignment_1_1 )
            {
             before(grammarAccess.getTermAccess().getFactorsAssignment_1_1()); 
            // InternalPascal.g:1732:2: ( rule__Term__FactorsAssignment_1_1 )
            // InternalPascal.g:1732:3: rule__Term__FactorsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Term__FactorsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getFactorsAssignment_1_1()); 

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
    // $ANTLR end "rule__Term__Group_1__1__Impl"


    // $ANTLR start "rule__Factor__Group_8__0"
    // InternalPascal.g:1741:1: rule__Factor__Group_8__0 : rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1 ;
    public final void rule__Factor__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1745:1: ( rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1 )
            // InternalPascal.g:1746:2: rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1
            {
            pushFollow(FOLLOW_9);
            rule__Factor__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_8__1();

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
    // $ANTLR end "rule__Factor__Group_8__0"


    // $ANTLR start "rule__Factor__Group_8__0__Impl"
    // InternalPascal.g:1753:1: rule__Factor__Group_8__0__Impl : ( '(' ) ;
    public final void rule__Factor__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1757:1: ( ( '(' ) )
            // InternalPascal.g:1758:1: ( '(' )
            {
            // InternalPascal.g:1758:1: ( '(' )
            // InternalPascal.g:1759:2: '('
            {
             before(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_8_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_8_0()); 

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
    // $ANTLR end "rule__Factor__Group_8__0__Impl"


    // $ANTLR start "rule__Factor__Group_8__1"
    // InternalPascal.g:1768:1: rule__Factor__Group_8__1 : rule__Factor__Group_8__1__Impl rule__Factor__Group_8__2 ;
    public final void rule__Factor__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1772:1: ( rule__Factor__Group_8__1__Impl rule__Factor__Group_8__2 )
            // InternalPascal.g:1773:2: rule__Factor__Group_8__1__Impl rule__Factor__Group_8__2
            {
            pushFollow(FOLLOW_5);
            rule__Factor__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_8__2();

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
    // $ANTLR end "rule__Factor__Group_8__1"


    // $ANTLR start "rule__Factor__Group_8__1__Impl"
    // InternalPascal.g:1780:1: rule__Factor__Group_8__1__Impl : ( ( rule__Factor__ExpressionAssignment_8_1 ) ) ;
    public final void rule__Factor__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1784:1: ( ( ( rule__Factor__ExpressionAssignment_8_1 ) ) )
            // InternalPascal.g:1785:1: ( ( rule__Factor__ExpressionAssignment_8_1 ) )
            {
            // InternalPascal.g:1785:1: ( ( rule__Factor__ExpressionAssignment_8_1 ) )
            // InternalPascal.g:1786:2: ( rule__Factor__ExpressionAssignment_8_1 )
            {
             before(grammarAccess.getFactorAccess().getExpressionAssignment_8_1()); 
            // InternalPascal.g:1787:2: ( rule__Factor__ExpressionAssignment_8_1 )
            // InternalPascal.g:1787:3: rule__Factor__ExpressionAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__ExpressionAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getExpressionAssignment_8_1()); 

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
    // $ANTLR end "rule__Factor__Group_8__1__Impl"


    // $ANTLR start "rule__Factor__Group_8__2"
    // InternalPascal.g:1795:1: rule__Factor__Group_8__2 : rule__Factor__Group_8__2__Impl ;
    public final void rule__Factor__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1799:1: ( rule__Factor__Group_8__2__Impl )
            // InternalPascal.g:1800:2: rule__Factor__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_8__2__Impl();

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
    // $ANTLR end "rule__Factor__Group_8__2"


    // $ANTLR start "rule__Factor__Group_8__2__Impl"
    // InternalPascal.g:1806:1: rule__Factor__Group_8__2__Impl : ( ')' ) ;
    public final void rule__Factor__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1810:1: ( ( ')' ) )
            // InternalPascal.g:1811:1: ( ')' )
            {
            // InternalPascal.g:1811:1: ( ')' )
            // InternalPascal.g:1812:2: ')'
            {
             before(grammarAccess.getFactorAccess().getRightParenthesisKeyword_8_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getRightParenthesisKeyword_8_2()); 

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
    // $ANTLR end "rule__Factor__Group_8__2__Impl"


    // $ANTLR start "rule__Factor__Group_9__0"
    // InternalPascal.g:1822:1: rule__Factor__Group_9__0 : rule__Factor__Group_9__0__Impl rule__Factor__Group_9__1 ;
    public final void rule__Factor__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1826:1: ( rule__Factor__Group_9__0__Impl rule__Factor__Group_9__1 )
            // InternalPascal.g:1827:2: rule__Factor__Group_9__0__Impl rule__Factor__Group_9__1
            {
            pushFollow(FOLLOW_9);
            rule__Factor__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_9__1();

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
    // $ANTLR end "rule__Factor__Group_9__0"


    // $ANTLR start "rule__Factor__Group_9__0__Impl"
    // InternalPascal.g:1834:1: rule__Factor__Group_9__0__Impl : ( 'not' ) ;
    public final void rule__Factor__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1838:1: ( ( 'not' ) )
            // InternalPascal.g:1839:1: ( 'not' )
            {
            // InternalPascal.g:1839:1: ( 'not' )
            // InternalPascal.g:1840:2: 'not'
            {
             before(grammarAccess.getFactorAccess().getNotKeyword_9_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getNotKeyword_9_0()); 

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
    // $ANTLR end "rule__Factor__Group_9__0__Impl"


    // $ANTLR start "rule__Factor__Group_9__1"
    // InternalPascal.g:1849:1: rule__Factor__Group_9__1 : rule__Factor__Group_9__1__Impl ;
    public final void rule__Factor__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1853:1: ( rule__Factor__Group_9__1__Impl )
            // InternalPascal.g:1854:2: rule__Factor__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_9__1__Impl();

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
    // $ANTLR end "rule__Factor__Group_9__1"


    // $ANTLR start "rule__Factor__Group_9__1__Impl"
    // InternalPascal.g:1860:1: rule__Factor__Group_9__1__Impl : ( ( rule__Factor__NotAssignment_9_1 ) ) ;
    public final void rule__Factor__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1864:1: ( ( ( rule__Factor__NotAssignment_9_1 ) ) )
            // InternalPascal.g:1865:1: ( ( rule__Factor__NotAssignment_9_1 ) )
            {
            // InternalPascal.g:1865:1: ( ( rule__Factor__NotAssignment_9_1 ) )
            // InternalPascal.g:1866:2: ( rule__Factor__NotAssignment_9_1 )
            {
             before(grammarAccess.getFactorAccess().getNotAssignment_9_1()); 
            // InternalPascal.g:1867:2: ( rule__Factor__NotAssignment_9_1 )
            // InternalPascal.g:1867:3: rule__Factor__NotAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__NotAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getNotAssignment_9_1()); 

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
    // $ANTLR end "rule__Factor__Group_9__1__Impl"


    // $ANTLR start "rule__Function_designator__Group__0"
    // InternalPascal.g:1876:1: rule__Function_designator__Group__0 : rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 ;
    public final void rule__Function_designator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1880:1: ( rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 )
            // InternalPascal.g:1881:2: rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Function_designator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_designator__Group__1();

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
    // $ANTLR end "rule__Function_designator__Group__0"


    // $ANTLR start "rule__Function_designator__Group__0__Impl"
    // InternalPascal.g:1888:1: rule__Function_designator__Group__0__Impl : ( ( rule__Function_designator__NameAssignment_0 ) ) ;
    public final void rule__Function_designator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1892:1: ( ( ( rule__Function_designator__NameAssignment_0 ) ) )
            // InternalPascal.g:1893:1: ( ( rule__Function_designator__NameAssignment_0 ) )
            {
            // InternalPascal.g:1893:1: ( ( rule__Function_designator__NameAssignment_0 ) )
            // InternalPascal.g:1894:2: ( rule__Function_designator__NameAssignment_0 )
            {
             before(grammarAccess.getFunction_designatorAccess().getNameAssignment_0()); 
            // InternalPascal.g:1895:2: ( rule__Function_designator__NameAssignment_0 )
            // InternalPascal.g:1895:3: rule__Function_designator__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Function_designator__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunction_designatorAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Function_designator__Group__0__Impl"


    // $ANTLR start "rule__Function_designator__Group__1"
    // InternalPascal.g:1903:1: rule__Function_designator__Group__1 : rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 ;
    public final void rule__Function_designator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1907:1: ( rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 )
            // InternalPascal.g:1908:2: rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Function_designator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_designator__Group__2();

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
    // $ANTLR end "rule__Function_designator__Group__1"


    // $ANTLR start "rule__Function_designator__Group__1__Impl"
    // InternalPascal.g:1915:1: rule__Function_designator__Group__1__Impl : ( '(' ) ;
    public final void rule__Function_designator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1919:1: ( ( '(' ) )
            // InternalPascal.g:1920:1: ( '(' )
            {
            // InternalPascal.g:1920:1: ( '(' )
            // InternalPascal.g:1921:2: '('
            {
             before(grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Function_designator__Group__1__Impl"


    // $ANTLR start "rule__Function_designator__Group__2"
    // InternalPascal.g:1930:1: rule__Function_designator__Group__2 : rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 ;
    public final void rule__Function_designator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1934:1: ( rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 )
            // InternalPascal.g:1935:2: rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Function_designator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_designator__Group__3();

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
    // $ANTLR end "rule__Function_designator__Group__2"


    // $ANTLR start "rule__Function_designator__Group__2__Impl"
    // InternalPascal.g:1942:1: rule__Function_designator__Group__2__Impl : ( ( rule__Function_designator__ExpressionsAssignment_2 )? ) ;
    public final void rule__Function_designator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1946:1: ( ( ( rule__Function_designator__ExpressionsAssignment_2 )? ) )
            // InternalPascal.g:1947:1: ( ( rule__Function_designator__ExpressionsAssignment_2 )? )
            {
            // InternalPascal.g:1947:1: ( ( rule__Function_designator__ExpressionsAssignment_2 )? )
            // InternalPascal.g:1948:2: ( rule__Function_designator__ExpressionsAssignment_2 )?
            {
             before(grammarAccess.getFunction_designatorAccess().getExpressionsAssignment_2()); 
            // InternalPascal.g:1949:2: ( rule__Function_designator__ExpressionsAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||LA18_0==RULE_ADDITION_OP||(LA18_0>=RULE_STRING && LA18_0<=RULE_REAL_NUMBER)||LA18_0==24||LA18_0==27||LA18_0==30||(LA18_0>=38 && LA18_0<=40)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPascal.g:1949:3: rule__Function_designator__ExpressionsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function_designator__ExpressionsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunction_designatorAccess().getExpressionsAssignment_2()); 

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
    // $ANTLR end "rule__Function_designator__Group__2__Impl"


    // $ANTLR start "rule__Function_designator__Group__3"
    // InternalPascal.g:1957:1: rule__Function_designator__Group__3 : rule__Function_designator__Group__3__Impl ;
    public final void rule__Function_designator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1961:1: ( rule__Function_designator__Group__3__Impl )
            // InternalPascal.g:1962:2: rule__Function_designator__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function_designator__Group__3__Impl();

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
    // $ANTLR end "rule__Function_designator__Group__3"


    // $ANTLR start "rule__Function_designator__Group__3__Impl"
    // InternalPascal.g:1968:1: rule__Function_designator__Group__3__Impl : ( ')' ) ;
    public final void rule__Function_designator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1972:1: ( ( ')' ) )
            // InternalPascal.g:1973:1: ( ')' )
            {
            // InternalPascal.g:1973:1: ( ')' )
            // InternalPascal.g:1974:2: ')'
            {
             before(grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Function_designator__Group__3__Impl"


    // $ANTLR start "rule__Set__Group__0"
    // InternalPascal.g:1984:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1988:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // InternalPascal.g:1989:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Set__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group__1();

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
    // $ANTLR end "rule__Set__Group__0"


    // $ANTLR start "rule__Set__Group__0__Impl"
    // InternalPascal.g:1996:1: rule__Set__Group__0__Impl : ( ( rule__Set__BracketsAssignment_0 ) ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2000:1: ( ( ( rule__Set__BracketsAssignment_0 ) ) )
            // InternalPascal.g:2001:1: ( ( rule__Set__BracketsAssignment_0 ) )
            {
            // InternalPascal.g:2001:1: ( ( rule__Set__BracketsAssignment_0 ) )
            // InternalPascal.g:2002:2: ( rule__Set__BracketsAssignment_0 )
            {
             before(grammarAccess.getSetAccess().getBracketsAssignment_0()); 
            // InternalPascal.g:2003:2: ( rule__Set__BracketsAssignment_0 )
            // InternalPascal.g:2003:3: rule__Set__BracketsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Set__BracketsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getBracketsAssignment_0()); 

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
    // $ANTLR end "rule__Set__Group__0__Impl"


    // $ANTLR start "rule__Set__Group__1"
    // InternalPascal.g:2011:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2015:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // InternalPascal.g:2016:2: rule__Set__Group__1__Impl rule__Set__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Set__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group__2();

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
    // $ANTLR end "rule__Set__Group__1"


    // $ANTLR start "rule__Set__Group__1__Impl"
    // InternalPascal.g:2023:1: rule__Set__Group__1__Impl : ( ( rule__Set__ExpressionsAssignment_1 )? ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2027:1: ( ( ( rule__Set__ExpressionsAssignment_1 )? ) )
            // InternalPascal.g:2028:1: ( ( rule__Set__ExpressionsAssignment_1 )? )
            {
            // InternalPascal.g:2028:1: ( ( rule__Set__ExpressionsAssignment_1 )? )
            // InternalPascal.g:2029:2: ( rule__Set__ExpressionsAssignment_1 )?
            {
             before(grammarAccess.getSetAccess().getExpressionsAssignment_1()); 
            // InternalPascal.g:2030:2: ( rule__Set__ExpressionsAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||LA19_0==RULE_ADDITION_OP||(LA19_0>=RULE_STRING && LA19_0<=RULE_REAL_NUMBER)||LA19_0==24||LA19_0==27||LA19_0==30||(LA19_0>=38 && LA19_0<=40)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPascal.g:2030:3: rule__Set__ExpressionsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Set__ExpressionsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetAccess().getExpressionsAssignment_1()); 

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
    // $ANTLR end "rule__Set__Group__1__Impl"


    // $ANTLR start "rule__Set__Group__2"
    // InternalPascal.g:2038:1: rule__Set__Group__2 : rule__Set__Group__2__Impl ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2042:1: ( rule__Set__Group__2__Impl )
            // InternalPascal.g:2043:2: rule__Set__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group__2__Impl();

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
    // $ANTLR end "rule__Set__Group__2"


    // $ANTLR start "rule__Set__Group__2__Impl"
    // InternalPascal.g:2049:1: rule__Set__Group__2__Impl : ( ( rule__Set__BracketsAssignment_2 ) ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2053:1: ( ( ( rule__Set__BracketsAssignment_2 ) ) )
            // InternalPascal.g:2054:1: ( ( rule__Set__BracketsAssignment_2 ) )
            {
            // InternalPascal.g:2054:1: ( ( rule__Set__BracketsAssignment_2 ) )
            // InternalPascal.g:2055:2: ( rule__Set__BracketsAssignment_2 )
            {
             before(grammarAccess.getSetAccess().getBracketsAssignment_2()); 
            // InternalPascal.g:2056:2: ( rule__Set__BracketsAssignment_2 )
            // InternalPascal.g:2056:3: rule__Set__BracketsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Set__BracketsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getBracketsAssignment_2()); 

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
    // $ANTLR end "rule__Set__Group__2__Impl"


    // $ANTLR start "rule__Program__NameAssignment_1"
    // InternalPascal.g:2065:1: rule__Program__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2069:1: ( ( RULE_ID ) )
            // InternalPascal.g:2070:2: ( RULE_ID )
            {
            // InternalPascal.g:2070:2: ( RULE_ID )
            // InternalPascal.g:2071:3: RULE_ID
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
    // InternalPascal.g:2080:1: rule__Program__IdentifiersAssignment_2_1 : ( ruleindentifier_list ) ;
    public final void rule__Program__IdentifiersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2084:1: ( ( ruleindentifier_list ) )
            // InternalPascal.g:2085:2: ( ruleindentifier_list )
            {
            // InternalPascal.g:2085:2: ( ruleindentifier_list )
            // InternalPascal.g:2086:3: ruleindentifier_list
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
    // InternalPascal.g:2095:1: rule__Indentifier_list__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Indentifier_list__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2099:1: ( ( RULE_ID ) )
            // InternalPascal.g:2100:2: ( RULE_ID )
            {
            // InternalPascal.g:2100:2: ( RULE_ID )
            // InternalPascal.g:2101:3: RULE_ID
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
    // InternalPascal.g:2110:1: rule__Indentifier_list__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Indentifier_list__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2114:1: ( ( RULE_ID ) )
            // InternalPascal.g:2115:2: ( RULE_ID )
            {
            // InternalPascal.g:2115:2: ( RULE_ID )
            // InternalPascal.g:2116:3: RULE_ID
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


    // $ANTLR start "rule__Variable__NameAssignment_0"
    // InternalPascal.g:2125:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2129:1: ( ( RULE_ID ) )
            // InternalPascal.g:2130:2: ( RULE_ID )
            {
            // InternalPascal.g:2130:2: ( RULE_ID )
            // InternalPascal.g:2131:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Variable__NameAssignment_0"


    // $ANTLR start "rule__Variable__VariableAssignment_1"
    // InternalPascal.g:2140:1: rule__Variable__VariableAssignment_1 : ( rulevar_ ) ;
    public final void rule__Variable__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2144:1: ( ( rulevar_ ) )
            // InternalPascal.g:2145:2: ( rulevar_ )
            {
            // InternalPascal.g:2145:2: ( rulevar_ )
            // InternalPascal.g:2146:3: rulevar_
            {
             before(grammarAccess.getVariableAccess().getVariableVar_ParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulevar_();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getVariableVar_ParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Variable__VariableAssignment_1"


    // $ANTLR start "rule__Var___ExpressionsAssignment_0_1"
    // InternalPascal.g:2155:1: rule__Var___ExpressionsAssignment_0_1 : ( ruleexpression_list ) ;
    public final void rule__Var___ExpressionsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2159:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:2160:2: ( ruleexpression_list )
            {
            // InternalPascal.g:2160:2: ( ruleexpression_list )
            // InternalPascal.g:2161:3: ruleexpression_list
            {
             before(grammarAccess.getVar_Access().getExpressionsExpression_listParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression_list();

            state._fsp--;

             after(grammarAccess.getVar_Access().getExpressionsExpression_listParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Var___ExpressionsAssignment_0_1"


    // $ANTLR start "rule__Var___ArrayAssignment_0_3"
    // InternalPascal.g:2170:1: rule__Var___ArrayAssignment_0_3 : ( rulevar_ ) ;
    public final void rule__Var___ArrayAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2174:1: ( ( rulevar_ ) )
            // InternalPascal.g:2175:2: ( rulevar_ )
            {
            // InternalPascal.g:2175:2: ( rulevar_ )
            // InternalPascal.g:2176:3: rulevar_
            {
             before(grammarAccess.getVar_Access().getArrayVar_ParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            rulevar_();

            state._fsp--;

             after(grammarAccess.getVar_Access().getArrayVar_ParserRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__Var___ArrayAssignment_0_3"


    // $ANTLR start "rule__Var___AccessorAssignment_1_0"
    // InternalPascal.g:2185:1: rule__Var___AccessorAssignment_1_0 : ( ( '.' ) ) ;
    public final void rule__Var___AccessorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2189:1: ( ( ( '.' ) ) )
            // InternalPascal.g:2190:2: ( ( '.' ) )
            {
            // InternalPascal.g:2190:2: ( ( '.' ) )
            // InternalPascal.g:2191:3: ( '.' )
            {
             before(grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0()); 
            // InternalPascal.g:2192:3: ( '.' )
            // InternalPascal.g:2193:4: '.'
            {
             before(grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0()); 

            }

             after(grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0()); 

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
    // $ANTLR end "rule__Var___AccessorAssignment_1_0"


    // $ANTLR start "rule__Var___NameAssignment_1_1"
    // InternalPascal.g:2204:1: rule__Var___NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Var___NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2208:1: ( ( RULE_ID ) )
            // InternalPascal.g:2209:2: ( RULE_ID )
            {
            // InternalPascal.g:2209:2: ( RULE_ID )
            // InternalPascal.g:2210:3: RULE_ID
            {
             before(grammarAccess.getVar_Access().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVar_Access().getNameIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Var___NameAssignment_1_1"


    // $ANTLR start "rule__Var___VariableAssignment_1_2"
    // InternalPascal.g:2219:1: rule__Var___VariableAssignment_1_2 : ( rulevar_ ) ;
    public final void rule__Var___VariableAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2223:1: ( ( rulevar_ ) )
            // InternalPascal.g:2224:2: ( rulevar_ )
            {
            // InternalPascal.g:2224:2: ( rulevar_ )
            // InternalPascal.g:2225:3: rulevar_
            {
             before(grammarAccess.getVar_Access().getVariableVar_ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulevar_();

            state._fsp--;

             after(grammarAccess.getVar_Access().getVariableVar_ParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Var___VariableAssignment_1_2"


    // $ANTLR start "rule__Var___PointerAssignment_2_1"
    // InternalPascal.g:2234:1: rule__Var___PointerAssignment_2_1 : ( rulevar_ ) ;
    public final void rule__Var___PointerAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2238:1: ( ( rulevar_ ) )
            // InternalPascal.g:2239:2: ( rulevar_ )
            {
            // InternalPascal.g:2239:2: ( rulevar_ )
            // InternalPascal.g:2240:3: rulevar_
            {
             before(grammarAccess.getVar_Access().getPointerVar_ParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulevar_();

            state._fsp--;

             after(grammarAccess.getVar_Access().getPointerVar_ParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Var___PointerAssignment_2_1"


    // $ANTLR start "rule__Expression_list__ExpressionsAssignment_0"
    // InternalPascal.g:2249:1: rule__Expression_list__ExpressionsAssignment_0 : ( ruleexpression ) ;
    public final void rule__Expression_list__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2253:1: ( ( ruleexpression ) )
            // InternalPascal.g:2254:2: ( ruleexpression )
            {
            // InternalPascal.g:2254:2: ( ruleexpression )
            // InternalPascal.g:2255:3: ruleexpression
            {
             before(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Expression_list__ExpressionsAssignment_0"


    // $ANTLR start "rule__Expression_list__ExpressionsAssignment_1_1"
    // InternalPascal.g:2264:1: rule__Expression_list__ExpressionsAssignment_1_1 : ( ruleexpression ) ;
    public final void rule__Expression_list__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2268:1: ( ( ruleexpression ) )
            // InternalPascal.g:2269:2: ( ruleexpression )
            {
            // InternalPascal.g:2269:2: ( ruleexpression )
            // InternalPascal.g:2270:3: ruleexpression
            {
             before(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Expression_list__ExpressionsAssignment_1_1"


    // $ANTLR start "rule__Expression__ExpressionsAssignment_0"
    // InternalPascal.g:2279:1: rule__Expression__ExpressionsAssignment_0 : ( rulesimple_expression ) ;
    public final void rule__Expression__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2283:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:2284:2: ( rulesimple_expression )
            {
            // InternalPascal.g:2284:2: ( rulesimple_expression )
            // InternalPascal.g:2285:3: rulesimple_expression
            {
             before(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulesimple_expression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Expression__ExpressionsAssignment_0"


    // $ANTLR start "rule__Expression__OperatorsAssignment_1_0_0"
    // InternalPascal.g:2294:1: rule__Expression__OperatorsAssignment_1_0_0 : ( RULE_RELATIONAL_OP ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2298:1: ( ( RULE_RELATIONAL_OP ) )
            // InternalPascal.g:2299:2: ( RULE_RELATIONAL_OP )
            {
            // InternalPascal.g:2299:2: ( RULE_RELATIONAL_OP )
            // InternalPascal.g:2300:3: RULE_RELATIONAL_OP
            {
             before(grammarAccess.getExpressionAccess().getOperatorsRELATIONAL_OPTerminalRuleCall_1_0_0_0()); 
            match(input,RULE_RELATIONAL_OP,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getOperatorsRELATIONAL_OPTerminalRuleCall_1_0_0_0()); 

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
    // $ANTLR end "rule__Expression__OperatorsAssignment_1_0_0"


    // $ANTLR start "rule__Expression__OperatorsAssignment_1_0_1"
    // InternalPascal.g:2309:1: rule__Expression__OperatorsAssignment_1_0_1 : ( ( 'in' ) ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2313:1: ( ( ( 'in' ) ) )
            // InternalPascal.g:2314:2: ( ( 'in' ) )
            {
            // InternalPascal.g:2314:2: ( ( 'in' ) )
            // InternalPascal.g:2315:3: ( 'in' )
            {
             before(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 
            // InternalPascal.g:2316:3: ( 'in' )
            // InternalPascal.g:2317:4: 'in'
            {
             before(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 

            }

             after(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 

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
    // $ANTLR end "rule__Expression__OperatorsAssignment_1_0_1"


    // $ANTLR start "rule__Expression__OperatorsAssignment_1_0_2"
    // InternalPascal.g:2328:1: rule__Expression__OperatorsAssignment_1_0_2 : ( ( '=' ) ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2332:1: ( ( ( '=' ) ) )
            // InternalPascal.g:2333:2: ( ( '=' ) )
            {
            // InternalPascal.g:2333:2: ( ( '=' ) )
            // InternalPascal.g:2334:3: ( '=' )
            {
             before(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 
            // InternalPascal.g:2335:3: ( '=' )
            // InternalPascal.g:2336:4: '='
            {
             before(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 

            }

             after(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 

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
    // $ANTLR end "rule__Expression__OperatorsAssignment_1_0_2"


    // $ANTLR start "rule__Expression__ExpressionsAssignment_1_1"
    // InternalPascal.g:2347:1: rule__Expression__ExpressionsAssignment_1_1 : ( rulesimple_expression ) ;
    public final void rule__Expression__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2351:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:2352:2: ( rulesimple_expression )
            {
            // InternalPascal.g:2352:2: ( rulesimple_expression )
            // InternalPascal.g:2353:3: rulesimple_expression
            {
             before(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulesimple_expression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Expression__ExpressionsAssignment_1_1"


    // $ANTLR start "rule__Simple_expression__PrefixOperatorAssignment_0"
    // InternalPascal.g:2362:1: rule__Simple_expression__PrefixOperatorAssignment_0 : ( RULE_ADDITION_OP ) ;
    public final void rule__Simple_expression__PrefixOperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2366:1: ( ( RULE_ADDITION_OP ) )
            // InternalPascal.g:2367:2: ( RULE_ADDITION_OP )
            {
            // InternalPascal.g:2367:2: ( RULE_ADDITION_OP )
            // InternalPascal.g:2368:3: RULE_ADDITION_OP
            {
             before(grammarAccess.getSimple_expressionAccess().getPrefixOperatorADDITION_OPTerminalRuleCall_0_0()); 
            match(input,RULE_ADDITION_OP,FOLLOW_2); 
             after(grammarAccess.getSimple_expressionAccess().getPrefixOperatorADDITION_OPTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Simple_expression__PrefixOperatorAssignment_0"


    // $ANTLR start "rule__Simple_expression__TermsAssignment_1"
    // InternalPascal.g:2377:1: rule__Simple_expression__TermsAssignment_1 : ( ruleterm ) ;
    public final void rule__Simple_expression__TermsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2381:1: ( ( ruleterm ) )
            // InternalPascal.g:2382:2: ( ruleterm )
            {
            // InternalPascal.g:2382:2: ( ruleterm )
            // InternalPascal.g:2383:3: ruleterm
            {
             before(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Simple_expression__TermsAssignment_1"


    // $ANTLR start "rule__Simple_expression__OperatorsAssignment_2_0_0_0"
    // InternalPascal.g:2392:1: rule__Simple_expression__OperatorsAssignment_2_0_0_0 : ( RULE_ADDITION_OP ) ;
    public final void rule__Simple_expression__OperatorsAssignment_2_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2396:1: ( ( RULE_ADDITION_OP ) )
            // InternalPascal.g:2397:2: ( RULE_ADDITION_OP )
            {
            // InternalPascal.g:2397:2: ( RULE_ADDITION_OP )
            // InternalPascal.g:2398:3: RULE_ADDITION_OP
            {
             before(grammarAccess.getSimple_expressionAccess().getOperatorsADDITION_OPTerminalRuleCall_2_0_0_0_0()); 
            match(input,RULE_ADDITION_OP,FOLLOW_2); 
             after(grammarAccess.getSimple_expressionAccess().getOperatorsADDITION_OPTerminalRuleCall_2_0_0_0_0()); 

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
    // $ANTLR end "rule__Simple_expression__OperatorsAssignment_2_0_0_0"


    // $ANTLR start "rule__Simple_expression__OperatorsAssignment_2_0_0_1"
    // InternalPascal.g:2407:1: rule__Simple_expression__OperatorsAssignment_2_0_0_1 : ( ( 'or' ) ) ;
    public final void rule__Simple_expression__OperatorsAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2411:1: ( ( ( 'or' ) ) )
            // InternalPascal.g:2412:2: ( ( 'or' ) )
            {
            // InternalPascal.g:2412:2: ( ( 'or' ) )
            // InternalPascal.g:2413:3: ( 'or' )
            {
             before(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 
            // InternalPascal.g:2414:3: ( 'or' )
            // InternalPascal.g:2415:4: 'or'
            {
             before(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 

            }

             after(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 

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
    // $ANTLR end "rule__Simple_expression__OperatorsAssignment_2_0_0_1"


    // $ANTLR start "rule__Simple_expression__TermsAssignment_2_0_1"
    // InternalPascal.g:2426:1: rule__Simple_expression__TermsAssignment_2_0_1 : ( ruleterm ) ;
    public final void rule__Simple_expression__TermsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2430:1: ( ( ruleterm ) )
            // InternalPascal.g:2431:2: ( ruleterm )
            {
            // InternalPascal.g:2431:2: ( ruleterm )
            // InternalPascal.g:2432:3: ruleterm
            {
             before(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_2_0_1_0()); 

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
    // $ANTLR end "rule__Simple_expression__TermsAssignment_2_0_1"


    // $ANTLR start "rule__Simple_expression__TermsAssignment_2_1"
    // InternalPascal.g:2441:1: rule__Simple_expression__TermsAssignment_2_1 : ( ruleunsigned_number ) ;
    public final void rule__Simple_expression__TermsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2445:1: ( ( ruleunsigned_number ) )
            // InternalPascal.g:2446:2: ( ruleunsigned_number )
            {
            // InternalPascal.g:2446:2: ( ruleunsigned_number )
            // InternalPascal.g:2447:3: ruleunsigned_number
            {
             before(grammarAccess.getSimple_expressionAccess().getTermsUnsigned_numberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleunsigned_number();

            state._fsp--;

             after(grammarAccess.getSimple_expressionAccess().getTermsUnsigned_numberParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Simple_expression__TermsAssignment_2_1"


    // $ANTLR start "rule__Term__FactorsAssignment_0"
    // InternalPascal.g:2456:1: rule__Term__FactorsAssignment_0 : ( rulefactor ) ;
    public final void rule__Term__FactorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2460:1: ( ( rulefactor ) )
            // InternalPascal.g:2461:2: ( rulefactor )
            {
            // InternalPascal.g:2461:2: ( rulefactor )
            // InternalPascal.g:2462:3: rulefactor
            {
             before(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulefactor();

            state._fsp--;

             after(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Term__FactorsAssignment_0"


    // $ANTLR start "rule__Term__OperatorsAssignment_1_0_0"
    // InternalPascal.g:2471:1: rule__Term__OperatorsAssignment_1_0_0 : ( RULE_MULTIPLICATION_OP ) ;
    public final void rule__Term__OperatorsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2475:1: ( ( RULE_MULTIPLICATION_OP ) )
            // InternalPascal.g:2476:2: ( RULE_MULTIPLICATION_OP )
            {
            // InternalPascal.g:2476:2: ( RULE_MULTIPLICATION_OP )
            // InternalPascal.g:2477:3: RULE_MULTIPLICATION_OP
            {
             before(grammarAccess.getTermAccess().getOperatorsMULTIPLICATION_OPTerminalRuleCall_1_0_0_0()); 
            match(input,RULE_MULTIPLICATION_OP,FOLLOW_2); 
             after(grammarAccess.getTermAccess().getOperatorsMULTIPLICATION_OPTerminalRuleCall_1_0_0_0()); 

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
    // $ANTLR end "rule__Term__OperatorsAssignment_1_0_0"


    // $ANTLR start "rule__Term__OperatorsAssignment_1_0_1"
    // InternalPascal.g:2486:1: rule__Term__OperatorsAssignment_1_0_1 : ( ( 'div' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2490:1: ( ( ( 'div' ) ) )
            // InternalPascal.g:2491:2: ( ( 'div' ) )
            {
            // InternalPascal.g:2491:2: ( ( 'div' ) )
            // InternalPascal.g:2492:3: ( 'div' )
            {
             before(grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0()); 
            // InternalPascal.g:2493:3: ( 'div' )
            // InternalPascal.g:2494:4: 'div'
            {
             before(grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0()); 

            }

             after(grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0()); 

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
    // $ANTLR end "rule__Term__OperatorsAssignment_1_0_1"


    // $ANTLR start "rule__Term__OperatorsAssignment_1_0_2"
    // InternalPascal.g:2505:1: rule__Term__OperatorsAssignment_1_0_2 : ( ( 'mod' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2509:1: ( ( ( 'mod' ) ) )
            // InternalPascal.g:2510:2: ( ( 'mod' ) )
            {
            // InternalPascal.g:2510:2: ( ( 'mod' ) )
            // InternalPascal.g:2511:3: ( 'mod' )
            {
             before(grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0()); 
            // InternalPascal.g:2512:3: ( 'mod' )
            // InternalPascal.g:2513:4: 'mod'
            {
             before(grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0()); 

            }

             after(grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0()); 

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
    // $ANTLR end "rule__Term__OperatorsAssignment_1_0_2"


    // $ANTLR start "rule__Term__OperatorsAssignment_1_0_3"
    // InternalPascal.g:2524:1: rule__Term__OperatorsAssignment_1_0_3 : ( ( 'and' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2528:1: ( ( ( 'and' ) ) )
            // InternalPascal.g:2529:2: ( ( 'and' ) )
            {
            // InternalPascal.g:2529:2: ( ( 'and' ) )
            // InternalPascal.g:2530:3: ( 'and' )
            {
             before(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0()); 
            // InternalPascal.g:2531:3: ( 'and' )
            // InternalPascal.g:2532:4: 'and'
            {
             before(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0()); 

            }

             after(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0()); 

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
    // $ANTLR end "rule__Term__OperatorsAssignment_1_0_3"


    // $ANTLR start "rule__Term__FactorsAssignment_1_1"
    // InternalPascal.g:2543:1: rule__Term__FactorsAssignment_1_1 : ( rulefactor ) ;
    public final void rule__Term__FactorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2547:1: ( ( rulefactor ) )
            // InternalPascal.g:2548:2: ( rulefactor )
            {
            // InternalPascal.g:2548:2: ( rulefactor )
            // InternalPascal.g:2549:3: rulefactor
            {
             before(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulefactor();

            state._fsp--;

             after(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Term__FactorsAssignment_1_1"


    // $ANTLR start "rule__Factor__VariableAssignment_0"
    // InternalPascal.g:2558:1: rule__Factor__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Factor__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2562:1: ( ( rulevariable ) )
            // InternalPascal.g:2563:2: ( rulevariable )
            {
            // InternalPascal.g:2563:2: ( rulevariable )
            // InternalPascal.g:2564:3: rulevariable
            {
             before(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulevariable();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Factor__VariableAssignment_0"


    // $ANTLR start "rule__Factor__NumberAssignment_1"
    // InternalPascal.g:2573:1: rule__Factor__NumberAssignment_1 : ( rulenumber ) ;
    public final void rule__Factor__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2577:1: ( ( rulenumber ) )
            // InternalPascal.g:2578:2: ( rulenumber )
            {
            // InternalPascal.g:2578:2: ( rulenumber )
            // InternalPascal.g:2579:3: rulenumber
            {
             before(grammarAccess.getFactorAccess().getNumberNumberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulenumber();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getNumberNumberParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Factor__NumberAssignment_1"


    // $ANTLR start "rule__Factor__StringAssignment_2"
    // InternalPascal.g:2588:1: rule__Factor__StringAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Factor__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2592:1: ( ( RULE_STRING ) )
            // InternalPascal.g:2593:2: ( RULE_STRING )
            {
            // InternalPascal.g:2593:2: ( RULE_STRING )
            // InternalPascal.g:2594:3: RULE_STRING
            {
             before(grammarAccess.getFactorAccess().getStringSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getStringSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Factor__StringAssignment_2"


    // $ANTLR start "rule__Factor__SetAssignment_3"
    // InternalPascal.g:2603:1: rule__Factor__SetAssignment_3 : ( ruleset ) ;
    public final void rule__Factor__SetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2607:1: ( ( ruleset ) )
            // InternalPascal.g:2608:2: ( ruleset )
            {
            // InternalPascal.g:2608:2: ( ruleset )
            // InternalPascal.g:2609:3: ruleset
            {
             before(grammarAccess.getFactorAccess().getSetSetParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleset();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getSetSetParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Factor__SetAssignment_3"


    // $ANTLR start "rule__Factor__NilAssignment_4"
    // InternalPascal.g:2618:1: rule__Factor__NilAssignment_4 : ( ( 'nil' ) ) ;
    public final void rule__Factor__NilAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2622:1: ( ( ( 'nil' ) ) )
            // InternalPascal.g:2623:2: ( ( 'nil' ) )
            {
            // InternalPascal.g:2623:2: ( ( 'nil' ) )
            // InternalPascal.g:2624:3: ( 'nil' )
            {
             before(grammarAccess.getFactorAccess().getNilNilKeyword_4_0()); 
            // InternalPascal.g:2625:3: ( 'nil' )
            // InternalPascal.g:2626:4: 'nil'
            {
             before(grammarAccess.getFactorAccess().getNilNilKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getNilNilKeyword_4_0()); 

            }

             after(grammarAccess.getFactorAccess().getNilNilKeyword_4_0()); 

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
    // $ANTLR end "rule__Factor__NilAssignment_4"


    // $ANTLR start "rule__Factor__BooleanAssignment_5"
    // InternalPascal.g:2637:1: rule__Factor__BooleanAssignment_5 : ( ( 'true' ) ) ;
    public final void rule__Factor__BooleanAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2641:1: ( ( ( 'true' ) ) )
            // InternalPascal.g:2642:2: ( ( 'true' ) )
            {
            // InternalPascal.g:2642:2: ( ( 'true' ) )
            // InternalPascal.g:2643:3: ( 'true' )
            {
             before(grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0()); 
            // InternalPascal.g:2644:3: ( 'true' )
            // InternalPascal.g:2645:4: 'true'
            {
             before(grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0()); 

            }

             after(grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0()); 

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
    // $ANTLR end "rule__Factor__BooleanAssignment_5"


    // $ANTLR start "rule__Factor__BooleanAssignment_6"
    // InternalPascal.g:2656:1: rule__Factor__BooleanAssignment_6 : ( ( 'false' ) ) ;
    public final void rule__Factor__BooleanAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2660:1: ( ( ( 'false' ) ) )
            // InternalPascal.g:2661:2: ( ( 'false' ) )
            {
            // InternalPascal.g:2661:2: ( ( 'false' ) )
            // InternalPascal.g:2662:3: ( 'false' )
            {
             before(grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0()); 
            // InternalPascal.g:2663:3: ( 'false' )
            // InternalPascal.g:2664:4: 'false'
            {
             before(grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0()); 

            }

             after(grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0()); 

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
    // $ANTLR end "rule__Factor__BooleanAssignment_6"


    // $ANTLR start "rule__Factor__FunctionAssignment_7"
    // InternalPascal.g:2675:1: rule__Factor__FunctionAssignment_7 : ( rulefunction_designator ) ;
    public final void rule__Factor__FunctionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2679:1: ( ( rulefunction_designator ) )
            // InternalPascal.g:2680:2: ( rulefunction_designator )
            {
            // InternalPascal.g:2680:2: ( rulefunction_designator )
            // InternalPascal.g:2681:3: rulefunction_designator
            {
             before(grammarAccess.getFactorAccess().getFunctionFunction_designatorParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulefunction_designator();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getFunctionFunction_designatorParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Factor__FunctionAssignment_7"


    // $ANTLR start "rule__Factor__ExpressionAssignment_8_1"
    // InternalPascal.g:2690:1: rule__Factor__ExpressionAssignment_8_1 : ( ruleexpression ) ;
    public final void rule__Factor__ExpressionAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2694:1: ( ( ruleexpression ) )
            // InternalPascal.g:2695:2: ( ruleexpression )
            {
            // InternalPascal.g:2695:2: ( ruleexpression )
            // InternalPascal.g:2696:3: ruleexpression
            {
             before(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Factor__ExpressionAssignment_8_1"


    // $ANTLR start "rule__Factor__NotAssignment_9_1"
    // InternalPascal.g:2705:1: rule__Factor__NotAssignment_9_1 : ( rulefactor ) ;
    public final void rule__Factor__NotAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2709:1: ( ( rulefactor ) )
            // InternalPascal.g:2710:2: ( rulefactor )
            {
            // InternalPascal.g:2710:2: ( rulefactor )
            // InternalPascal.g:2711:3: rulefactor
            {
             before(grammarAccess.getFactorAccess().getNotFactorParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            rulefactor();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getNotFactorParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Factor__NotAssignment_9_1"


    // $ANTLR start "rule__Function_designator__NameAssignment_0"
    // InternalPascal.g:2720:1: rule__Function_designator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Function_designator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2724:1: ( ( RULE_ID ) )
            // InternalPascal.g:2725:2: ( RULE_ID )
            {
            // InternalPascal.g:2725:2: ( RULE_ID )
            // InternalPascal.g:2726:3: RULE_ID
            {
             before(grammarAccess.getFunction_designatorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunction_designatorAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Function_designator__NameAssignment_0"


    // $ANTLR start "rule__Function_designator__ExpressionsAssignment_2"
    // InternalPascal.g:2735:1: rule__Function_designator__ExpressionsAssignment_2 : ( ruleexpression_list ) ;
    public final void rule__Function_designator__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2739:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:2740:2: ( ruleexpression_list )
            {
            // InternalPascal.g:2740:2: ( ruleexpression_list )
            // InternalPascal.g:2741:3: ruleexpression_list
            {
             before(grammarAccess.getFunction_designatorAccess().getExpressionsExpression_listParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression_list();

            state._fsp--;

             after(grammarAccess.getFunction_designatorAccess().getExpressionsExpression_listParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Function_designator__ExpressionsAssignment_2"


    // $ANTLR start "rule__Set__BracketsAssignment_0"
    // InternalPascal.g:2750:1: rule__Set__BracketsAssignment_0 : ( ( '[' ) ) ;
    public final void rule__Set__BracketsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2754:1: ( ( ( '[' ) ) )
            // InternalPascal.g:2755:2: ( ( '[' ) )
            {
            // InternalPascal.g:2755:2: ( ( '[' ) )
            // InternalPascal.g:2756:3: ( '[' )
            {
             before(grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0()); 
            // InternalPascal.g:2757:3: ( '[' )
            // InternalPascal.g:2758:4: '['
            {
             before(grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0()); 

            }

             after(grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0()); 

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
    // $ANTLR end "rule__Set__BracketsAssignment_0"


    // $ANTLR start "rule__Set__ExpressionsAssignment_1"
    // InternalPascal.g:2769:1: rule__Set__ExpressionsAssignment_1 : ( ruleexpression_list ) ;
    public final void rule__Set__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2773:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:2774:2: ( ruleexpression_list )
            {
            // InternalPascal.g:2774:2: ( ruleexpression_list )
            // InternalPascal.g:2775:3: ruleexpression_list
            {
             before(grammarAccess.getSetAccess().getExpressionsExpression_listParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression_list();

            state._fsp--;

             after(grammarAccess.getSetAccess().getExpressionsExpression_listParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Set__ExpressionsAssignment_1"


    // $ANTLR start "rule__Set__BracketsAssignment_2"
    // InternalPascal.g:2784:1: rule__Set__BracketsAssignment_2 : ( ( ']' ) ) ;
    public final void rule__Set__BracketsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2788:1: ( ( ( ']' ) ) )
            // InternalPascal.g:2789:2: ( ( ']' ) )
            {
            // InternalPascal.g:2789:2: ( ( ']' ) )
            // InternalPascal.g:2790:3: ( ']' )
            {
             before(grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0()); 
            // InternalPascal.g:2791:3: ( ']' )
            // InternalPascal.g:2792:4: ']'
            {
             before(grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0()); 

            }

             after(grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__Set__BracketsAssignment_2"


    // $ANTLR start "rule__Number__NumberAssignment"
    // InternalPascal.g:2803:1: rule__Number__NumberAssignment : ( ruleany_number ) ;
    public final void rule__Number__NumberAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2807:1: ( ( ruleany_number ) )
            // InternalPascal.g:2808:2: ( ruleany_number )
            {
            // InternalPascal.g:2808:2: ( ruleany_number )
            // InternalPascal.g:2809:3: ruleany_number
            {
             before(grammarAccess.getNumberAccess().getNumberAny_numberParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleany_number();

            state._fsp--;

             after(grammarAccess.getNumberAccess().getNumberAny_numberParserRuleCall_0()); 

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
    // $ANTLR end "rule__Number__NumberAssignment"


    // $ANTLR start "rule__Signed_number__IntegerAssignment_0"
    // InternalPascal.g:2818:1: rule__Signed_number__IntegerAssignment_0 : ( RULE_SIGNED_INTEGER_NUMBER ) ;
    public final void rule__Signed_number__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2822:1: ( ( RULE_SIGNED_INTEGER_NUMBER ) )
            // InternalPascal.g:2823:2: ( RULE_SIGNED_INTEGER_NUMBER )
            {
            // InternalPascal.g:2823:2: ( RULE_SIGNED_INTEGER_NUMBER )
            // InternalPascal.g:2824:3: RULE_SIGNED_INTEGER_NUMBER
            {
             before(grammarAccess.getSigned_numberAccess().getIntegerSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0()); 
            match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_2); 
             after(grammarAccess.getSigned_numberAccess().getIntegerSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Signed_number__IntegerAssignment_0"


    // $ANTLR start "rule__Signed_number__RealAssignment_1"
    // InternalPascal.g:2833:1: rule__Signed_number__RealAssignment_1 : ( RULE_SIGNED_REAL_NUMBER ) ;
    public final void rule__Signed_number__RealAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2837:1: ( ( RULE_SIGNED_REAL_NUMBER ) )
            // InternalPascal.g:2838:2: ( RULE_SIGNED_REAL_NUMBER )
            {
            // InternalPascal.g:2838:2: ( RULE_SIGNED_REAL_NUMBER )
            // InternalPascal.g:2839:3: RULE_SIGNED_REAL_NUMBER
            {
             before(grammarAccess.getSigned_numberAccess().getRealSIGNED_REAL_NUMBERTerminalRuleCall_1_0()); 
            match(input,RULE_SIGNED_REAL_NUMBER,FOLLOW_2); 
             after(grammarAccess.getSigned_numberAccess().getRealSIGNED_REAL_NUMBERTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Signed_number__RealAssignment_1"


    // $ANTLR start "rule__Unsigned_number__IntegerAssignment_0"
    // InternalPascal.g:2848:1: rule__Unsigned_number__IntegerAssignment_0 : ( RULE_INTEGER_NUMBER ) ;
    public final void rule__Unsigned_number__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2852:1: ( ( RULE_INTEGER_NUMBER ) )
            // InternalPascal.g:2853:2: ( RULE_INTEGER_NUMBER )
            {
            // InternalPascal.g:2853:2: ( RULE_INTEGER_NUMBER )
            // InternalPascal.g:2854:3: RULE_INTEGER_NUMBER
            {
             before(grammarAccess.getUnsigned_numberAccess().getIntegerINTEGER_NUMBERTerminalRuleCall_0_0()); 
            match(input,RULE_INTEGER_NUMBER,FOLLOW_2); 
             after(grammarAccess.getUnsigned_numberAccess().getIntegerINTEGER_NUMBERTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Unsigned_number__IntegerAssignment_0"


    // $ANTLR start "rule__Unsigned_number__RealAssignment_1"
    // InternalPascal.g:2863:1: rule__Unsigned_number__RealAssignment_1 : ( RULE_REAL_NUMBER ) ;
    public final void rule__Unsigned_number__RealAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2867:1: ( ( RULE_REAL_NUMBER ) )
            // InternalPascal.g:2868:2: ( RULE_REAL_NUMBER )
            {
            // InternalPascal.g:2868:2: ( RULE_REAL_NUMBER )
            // InternalPascal.g:2869:3: RULE_REAL_NUMBER
            {
             before(grammarAccess.getUnsigned_numberAccess().getRealREAL_NUMBERTerminalRuleCall_1_0()); 
            match(input,RULE_REAL_NUMBER,FOLLOW_2); 
             after(grammarAccess.getUnsigned_numberAccess().getRealREAL_NUMBERTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Unsigned_number__RealAssignment_1"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\13\12\uffff";
    static final String dfa_3s = "\1\4\1\5\12\uffff";
    static final String dfa_4s = "\1\50\1\45\12\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\10\1\1";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\3\uffff\1\3\4\2\13\uffff\1\10\2\uffff\1\4\2\uffff\1\11\7\uffff\1\5\1\6\1\7",
            "\3\13\3\uffff\2\13\13\uffff\1\12\5\13\1\uffff\7\13",
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

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "556:1: rule__Factor__Alternatives : ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__FunctionAssignment_7 ) ) | ( ( rule__Factor__Group_8__0 ) ) | ( ( rule__Factor__Group_9__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000A8000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000001C049001F50L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000300000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400001840L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400001842L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000003800000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000003800000082L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000001C04B001F50L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000001C059001F50L});

}