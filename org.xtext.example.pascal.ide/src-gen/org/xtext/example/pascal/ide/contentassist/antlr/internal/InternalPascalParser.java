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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_RELATIONAL_OP", "RULE_ADDITION_OP", "RULE_MULTIPLICATION_OP", "RULE_STRING", "RULE_SIGNED_INTEGER_NUMBER", "RULE_SIGNED_REAL_NUMBER", "RULE_INTEGER_NUMBER", "RULE_REAL_NUMBER", "RULE_PARENTHESES_COMMENT", "RULE_CURLY_BRACKETS_COMMENT", "RULE_NUMERIC_SUBRANGE", "RULE_DIGIT_SEQUENCE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "';'", "'['", "']'", "'^'", "','", "'('", "')'", "'not'", "'.'", "'in'", "'='", "'or'", "'div'", "'mod'", "'and'", "'nil'", "'true'", "'false'"
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


    // $ANTLR start "entryRulevariable"
    // InternalPascal.g:78:1: entryRulevariable : rulevariable EOF ;
    public final void entryRulevariable() throws RecognitionException {
        try {
            // InternalPascal.g:79:1: ( rulevariable EOF )
            // InternalPascal.g:80:1: rulevariable EOF
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
    // InternalPascal.g:87:1: rulevariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void rulevariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:91:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalPascal.g:92:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalPascal.g:92:2: ( ( rule__Variable__Group__0 ) )
            // InternalPascal.g:93:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalPascal.g:94:3: ( rule__Variable__Group__0 )
            // InternalPascal.g:94:4: rule__Variable__Group__0
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
    // InternalPascal.g:103:1: entryRulevar_ : rulevar_ EOF ;
    public final void entryRulevar_() throws RecognitionException {
        try {
            // InternalPascal.g:104:1: ( rulevar_ EOF )
            // InternalPascal.g:105:1: rulevar_ EOF
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
    // InternalPascal.g:112:1: rulevar_ : ( ( rule__Var___Alternatives )? ) ;
    public final void rulevar_() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:116:2: ( ( ( rule__Var___Alternatives )? ) )
            // InternalPascal.g:117:2: ( ( rule__Var___Alternatives )? )
            {
            // InternalPascal.g:117:2: ( ( rule__Var___Alternatives )? )
            // InternalPascal.g:118:3: ( rule__Var___Alternatives )?
            {
             before(grammarAccess.getVar_Access().getAlternatives()); 
            // InternalPascal.g:119:3: ( rule__Var___Alternatives )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24||LA1_0==26||LA1_0==31) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:119:4: rule__Var___Alternatives
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
    // InternalPascal.g:128:1: entryRuleexpression_list : ruleexpression_list EOF ;
    public final void entryRuleexpression_list() throws RecognitionException {
        try {
            // InternalPascal.g:129:1: ( ruleexpression_list EOF )
            // InternalPascal.g:130:1: ruleexpression_list EOF
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
    // InternalPascal.g:137:1: ruleexpression_list : ( ( rule__Expression_list__Group__0 ) ) ;
    public final void ruleexpression_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:141:2: ( ( ( rule__Expression_list__Group__0 ) ) )
            // InternalPascal.g:142:2: ( ( rule__Expression_list__Group__0 ) )
            {
            // InternalPascal.g:142:2: ( ( rule__Expression_list__Group__0 ) )
            // InternalPascal.g:143:3: ( rule__Expression_list__Group__0 )
            {
             before(grammarAccess.getExpression_listAccess().getGroup()); 
            // InternalPascal.g:144:3: ( rule__Expression_list__Group__0 )
            // InternalPascal.g:144:4: rule__Expression_list__Group__0
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
    // InternalPascal.g:153:1: entryRuleexpression : ruleexpression EOF ;
    public final void entryRuleexpression() throws RecognitionException {
        try {
            // InternalPascal.g:154:1: ( ruleexpression EOF )
            // InternalPascal.g:155:1: ruleexpression EOF
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
    // InternalPascal.g:162:1: ruleexpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleexpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:166:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalPascal.g:167:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalPascal.g:167:2: ( ( rule__Expression__Group__0 ) )
            // InternalPascal.g:168:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalPascal.g:169:3: ( rule__Expression__Group__0 )
            // InternalPascal.g:169:4: rule__Expression__Group__0
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
    // InternalPascal.g:178:1: entryRulesimple_expression : rulesimple_expression EOF ;
    public final void entryRulesimple_expression() throws RecognitionException {
        try {
            // InternalPascal.g:179:1: ( rulesimple_expression EOF )
            // InternalPascal.g:180:1: rulesimple_expression EOF
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
    // InternalPascal.g:187:1: rulesimple_expression : ( ( rule__Simple_expression__Group__0 ) ) ;
    public final void rulesimple_expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:191:2: ( ( ( rule__Simple_expression__Group__0 ) ) )
            // InternalPascal.g:192:2: ( ( rule__Simple_expression__Group__0 ) )
            {
            // InternalPascal.g:192:2: ( ( rule__Simple_expression__Group__0 ) )
            // InternalPascal.g:193:3: ( rule__Simple_expression__Group__0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getGroup()); 
            // InternalPascal.g:194:3: ( rule__Simple_expression__Group__0 )
            // InternalPascal.g:194:4: rule__Simple_expression__Group__0
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
    // InternalPascal.g:203:1: entryRuleterm : ruleterm EOF ;
    public final void entryRuleterm() throws RecognitionException {
        try {
            // InternalPascal.g:204:1: ( ruleterm EOF )
            // InternalPascal.g:205:1: ruleterm EOF
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
    // InternalPascal.g:212:1: ruleterm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleterm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:216:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalPascal.g:217:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalPascal.g:217:2: ( ( rule__Term__Group__0 ) )
            // InternalPascal.g:218:3: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // InternalPascal.g:219:3: ( rule__Term__Group__0 )
            // InternalPascal.g:219:4: rule__Term__Group__0
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
    // InternalPascal.g:228:1: entryRulefactor : rulefactor EOF ;
    public final void entryRulefactor() throws RecognitionException {
        try {
            // InternalPascal.g:229:1: ( rulefactor EOF )
            // InternalPascal.g:230:1: rulefactor EOF
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
    // InternalPascal.g:237:1: rulefactor : ( ( rule__Factor__Alternatives ) ) ;
    public final void rulefactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:241:2: ( ( ( rule__Factor__Alternatives ) ) )
            // InternalPascal.g:242:2: ( ( rule__Factor__Alternatives ) )
            {
            // InternalPascal.g:242:2: ( ( rule__Factor__Alternatives ) )
            // InternalPascal.g:243:3: ( rule__Factor__Alternatives )
            {
             before(grammarAccess.getFactorAccess().getAlternatives()); 
            // InternalPascal.g:244:3: ( rule__Factor__Alternatives )
            // InternalPascal.g:244:4: rule__Factor__Alternatives
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
    // InternalPascal.g:253:1: entryRulefunction_designator : rulefunction_designator EOF ;
    public final void entryRulefunction_designator() throws RecognitionException {
        try {
            // InternalPascal.g:254:1: ( rulefunction_designator EOF )
            // InternalPascal.g:255:1: rulefunction_designator EOF
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
    // InternalPascal.g:262:1: rulefunction_designator : ( ( rule__Function_designator__Group__0 ) ) ;
    public final void rulefunction_designator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:266:2: ( ( ( rule__Function_designator__Group__0 ) ) )
            // InternalPascal.g:267:2: ( ( rule__Function_designator__Group__0 ) )
            {
            // InternalPascal.g:267:2: ( ( rule__Function_designator__Group__0 ) )
            // InternalPascal.g:268:3: ( rule__Function_designator__Group__0 )
            {
             before(grammarAccess.getFunction_designatorAccess().getGroup()); 
            // InternalPascal.g:269:3: ( rule__Function_designator__Group__0 )
            // InternalPascal.g:269:4: rule__Function_designator__Group__0
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
    // InternalPascal.g:278:1: entryRuleset : ruleset EOF ;
    public final void entryRuleset() throws RecognitionException {
        try {
            // InternalPascal.g:279:1: ( ruleset EOF )
            // InternalPascal.g:280:1: ruleset EOF
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
    // InternalPascal.g:287:1: ruleset : ( ( rule__Set__Group__0 ) ) ;
    public final void ruleset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:291:2: ( ( ( rule__Set__Group__0 ) ) )
            // InternalPascal.g:292:2: ( ( rule__Set__Group__0 ) )
            {
            // InternalPascal.g:292:2: ( ( rule__Set__Group__0 ) )
            // InternalPascal.g:293:3: ( rule__Set__Group__0 )
            {
             before(grammarAccess.getSetAccess().getGroup()); 
            // InternalPascal.g:294:3: ( rule__Set__Group__0 )
            // InternalPascal.g:294:4: rule__Set__Group__0
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
    // InternalPascal.g:303:1: entryRulenumber : rulenumber EOF ;
    public final void entryRulenumber() throws RecognitionException {
        try {
            // InternalPascal.g:304:1: ( rulenumber EOF )
            // InternalPascal.g:305:1: rulenumber EOF
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
    // InternalPascal.g:312:1: rulenumber : ( ( rule__Number__NumberAssignment ) ) ;
    public final void rulenumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:316:2: ( ( ( rule__Number__NumberAssignment ) ) )
            // InternalPascal.g:317:2: ( ( rule__Number__NumberAssignment ) )
            {
            // InternalPascal.g:317:2: ( ( rule__Number__NumberAssignment ) )
            // InternalPascal.g:318:3: ( rule__Number__NumberAssignment )
            {
             before(grammarAccess.getNumberAccess().getNumberAssignment()); 
            // InternalPascal.g:319:3: ( rule__Number__NumberAssignment )
            // InternalPascal.g:319:4: rule__Number__NumberAssignment
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
    // InternalPascal.g:328:1: entryRuleany_number : ruleany_number EOF ;
    public final void entryRuleany_number() throws RecognitionException {
        try {
            // InternalPascal.g:329:1: ( ruleany_number EOF )
            // InternalPascal.g:330:1: ruleany_number EOF
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
    // InternalPascal.g:337:1: ruleany_number : ( ( rule__Any_number__Alternatives ) ) ;
    public final void ruleany_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:341:2: ( ( ( rule__Any_number__Alternatives ) ) )
            // InternalPascal.g:342:2: ( ( rule__Any_number__Alternatives ) )
            {
            // InternalPascal.g:342:2: ( ( rule__Any_number__Alternatives ) )
            // InternalPascal.g:343:3: ( rule__Any_number__Alternatives )
            {
             before(grammarAccess.getAny_numberAccess().getAlternatives()); 
            // InternalPascal.g:344:3: ( rule__Any_number__Alternatives )
            // InternalPascal.g:344:4: rule__Any_number__Alternatives
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
    // InternalPascal.g:353:1: entryRulesigned_number : rulesigned_number EOF ;
    public final void entryRulesigned_number() throws RecognitionException {
        try {
            // InternalPascal.g:354:1: ( rulesigned_number EOF )
            // InternalPascal.g:355:1: rulesigned_number EOF
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
    // InternalPascal.g:362:1: rulesigned_number : ( ( rule__Signed_number__Alternatives ) ) ;
    public final void rulesigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:366:2: ( ( ( rule__Signed_number__Alternatives ) ) )
            // InternalPascal.g:367:2: ( ( rule__Signed_number__Alternatives ) )
            {
            // InternalPascal.g:367:2: ( ( rule__Signed_number__Alternatives ) )
            // InternalPascal.g:368:3: ( rule__Signed_number__Alternatives )
            {
             before(grammarAccess.getSigned_numberAccess().getAlternatives()); 
            // InternalPascal.g:369:3: ( rule__Signed_number__Alternatives )
            // InternalPascal.g:369:4: rule__Signed_number__Alternatives
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
    // InternalPascal.g:378:1: entryRuleunsigned_number : ruleunsigned_number EOF ;
    public final void entryRuleunsigned_number() throws RecognitionException {
        try {
            // InternalPascal.g:379:1: ( ruleunsigned_number EOF )
            // InternalPascal.g:380:1: ruleunsigned_number EOF
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
    // InternalPascal.g:387:1: ruleunsigned_number : ( ( rule__Unsigned_number__Alternatives ) ) ;
    public final void ruleunsigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:391:2: ( ( ( rule__Unsigned_number__Alternatives ) ) )
            // InternalPascal.g:392:2: ( ( rule__Unsigned_number__Alternatives ) )
            {
            // InternalPascal.g:392:2: ( ( rule__Unsigned_number__Alternatives ) )
            // InternalPascal.g:393:3: ( rule__Unsigned_number__Alternatives )
            {
             before(grammarAccess.getUnsigned_numberAccess().getAlternatives()); 
            // InternalPascal.g:394:3: ( rule__Unsigned_number__Alternatives )
            // InternalPascal.g:394:4: rule__Unsigned_number__Alternatives
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
    // InternalPascal.g:402:1: rule__Var___Alternatives : ( ( ( rule__Var___Group_0__0 ) ) | ( ( rule__Var___Group_1__0 ) ) | ( ( rule__Var___Group_2__0 ) ) );
    public final void rule__Var___Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:406:1: ( ( ( rule__Var___Group_0__0 ) ) | ( ( rule__Var___Group_1__0 ) ) | ( ( rule__Var___Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 26:
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
                    // InternalPascal.g:407:2: ( ( rule__Var___Group_0__0 ) )
                    {
                    // InternalPascal.g:407:2: ( ( rule__Var___Group_0__0 ) )
                    // InternalPascal.g:408:3: ( rule__Var___Group_0__0 )
                    {
                     before(grammarAccess.getVar_Access().getGroup_0()); 
                    // InternalPascal.g:409:3: ( rule__Var___Group_0__0 )
                    // InternalPascal.g:409:4: rule__Var___Group_0__0
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
                    // InternalPascal.g:413:2: ( ( rule__Var___Group_1__0 ) )
                    {
                    // InternalPascal.g:413:2: ( ( rule__Var___Group_1__0 ) )
                    // InternalPascal.g:414:3: ( rule__Var___Group_1__0 )
                    {
                     before(grammarAccess.getVar_Access().getGroup_1()); 
                    // InternalPascal.g:415:3: ( rule__Var___Group_1__0 )
                    // InternalPascal.g:415:4: rule__Var___Group_1__0
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
                    // InternalPascal.g:419:2: ( ( rule__Var___Group_2__0 ) )
                    {
                    // InternalPascal.g:419:2: ( ( rule__Var___Group_2__0 ) )
                    // InternalPascal.g:420:3: ( rule__Var___Group_2__0 )
                    {
                     before(grammarAccess.getVar_Access().getGroup_2()); 
                    // InternalPascal.g:421:3: ( rule__Var___Group_2__0 )
                    // InternalPascal.g:421:4: rule__Var___Group_2__0
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
    // InternalPascal.g:429:1: rule__Expression__Alternatives_1_0 : ( ( ( rule__Expression__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_2 ) ) );
    public final void rule__Expression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:433:1: ( ( ( rule__Expression__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_2 ) ) )
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
                    // InternalPascal.g:434:2: ( ( rule__Expression__OperatorsAssignment_1_0_0 ) )
                    {
                    // InternalPascal.g:434:2: ( ( rule__Expression__OperatorsAssignment_1_0_0 ) )
                    // InternalPascal.g:435:3: ( rule__Expression__OperatorsAssignment_1_0_0 )
                    {
                     before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_0()); 
                    // InternalPascal.g:436:3: ( rule__Expression__OperatorsAssignment_1_0_0 )
                    // InternalPascal.g:436:4: rule__Expression__OperatorsAssignment_1_0_0
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
                    // InternalPascal.g:440:2: ( ( rule__Expression__OperatorsAssignment_1_0_1 ) )
                    {
                    // InternalPascal.g:440:2: ( ( rule__Expression__OperatorsAssignment_1_0_1 ) )
                    // InternalPascal.g:441:3: ( rule__Expression__OperatorsAssignment_1_0_1 )
                    {
                     before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_1()); 
                    // InternalPascal.g:442:3: ( rule__Expression__OperatorsAssignment_1_0_1 )
                    // InternalPascal.g:442:4: rule__Expression__OperatorsAssignment_1_0_1
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
                    // InternalPascal.g:446:2: ( ( rule__Expression__OperatorsAssignment_1_0_2 ) )
                    {
                    // InternalPascal.g:446:2: ( ( rule__Expression__OperatorsAssignment_1_0_2 ) )
                    // InternalPascal.g:447:3: ( rule__Expression__OperatorsAssignment_1_0_2 )
                    {
                     before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_2()); 
                    // InternalPascal.g:448:3: ( rule__Expression__OperatorsAssignment_1_0_2 )
                    // InternalPascal.g:448:4: rule__Expression__OperatorsAssignment_1_0_2
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
    // InternalPascal.g:456:1: rule__Simple_expression__Alternatives_2 : ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( ( rule__Simple_expression__TermsAssignment_2_1 ) ) );
    public final void rule__Simple_expression__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:460:1: ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( ( rule__Simple_expression__TermsAssignment_2_1 ) ) )
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
                    // InternalPascal.g:461:2: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    {
                    // InternalPascal.g:461:2: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    // InternalPascal.g:462:3: ( rule__Simple_expression__Group_2_0__0 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getGroup_2_0()); 
                    // InternalPascal.g:463:3: ( rule__Simple_expression__Group_2_0__0 )
                    // InternalPascal.g:463:4: rule__Simple_expression__Group_2_0__0
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
                    // InternalPascal.g:467:2: ( ( rule__Simple_expression__TermsAssignment_2_1 ) )
                    {
                    // InternalPascal.g:467:2: ( ( rule__Simple_expression__TermsAssignment_2_1 ) )
                    // InternalPascal.g:468:3: ( rule__Simple_expression__TermsAssignment_2_1 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_1()); 
                    // InternalPascal.g:469:3: ( rule__Simple_expression__TermsAssignment_2_1 )
                    // InternalPascal.g:469:4: rule__Simple_expression__TermsAssignment_2_1
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
    // InternalPascal.g:477:1: rule__Simple_expression__Alternatives_2_0_0 : ( ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) ) | ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) ) );
    public final void rule__Simple_expression__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:481:1: ( ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) ) | ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) ) )
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
                    // InternalPascal.g:482:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) )
                    {
                    // InternalPascal.g:482:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) )
                    // InternalPascal.g:483:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_0()); 
                    // InternalPascal.g:484:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 )
                    // InternalPascal.g:484:4: rule__Simple_expression__OperatorsAssignment_2_0_0_0
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
                    // InternalPascal.g:488:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) )
                    {
                    // InternalPascal.g:488:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) )
                    // InternalPascal.g:489:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_1()); 
                    // InternalPascal.g:490:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 )
                    // InternalPascal.g:490:4: rule__Simple_expression__OperatorsAssignment_2_0_0_1
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
    // InternalPascal.g:498:1: rule__Term__Alternatives_1_0 : ( ( ( rule__Term__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_2 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_3 ) ) );
    public final void rule__Term__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:502:1: ( ( ( rule__Term__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_2 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_3 ) ) )
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
                    // InternalPascal.g:503:2: ( ( rule__Term__OperatorsAssignment_1_0_0 ) )
                    {
                    // InternalPascal.g:503:2: ( ( rule__Term__OperatorsAssignment_1_0_0 ) )
                    // InternalPascal.g:504:3: ( rule__Term__OperatorsAssignment_1_0_0 )
                    {
                     before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_0()); 
                    // InternalPascal.g:505:3: ( rule__Term__OperatorsAssignment_1_0_0 )
                    // InternalPascal.g:505:4: rule__Term__OperatorsAssignment_1_0_0
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
                    // InternalPascal.g:509:2: ( ( rule__Term__OperatorsAssignment_1_0_1 ) )
                    {
                    // InternalPascal.g:509:2: ( ( rule__Term__OperatorsAssignment_1_0_1 ) )
                    // InternalPascal.g:510:3: ( rule__Term__OperatorsAssignment_1_0_1 )
                    {
                     before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_1()); 
                    // InternalPascal.g:511:3: ( rule__Term__OperatorsAssignment_1_0_1 )
                    // InternalPascal.g:511:4: rule__Term__OperatorsAssignment_1_0_1
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
                    // InternalPascal.g:515:2: ( ( rule__Term__OperatorsAssignment_1_0_2 ) )
                    {
                    // InternalPascal.g:515:2: ( ( rule__Term__OperatorsAssignment_1_0_2 ) )
                    // InternalPascal.g:516:3: ( rule__Term__OperatorsAssignment_1_0_2 )
                    {
                     before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_2()); 
                    // InternalPascal.g:517:3: ( rule__Term__OperatorsAssignment_1_0_2 )
                    // InternalPascal.g:517:4: rule__Term__OperatorsAssignment_1_0_2
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
                    // InternalPascal.g:521:2: ( ( rule__Term__OperatorsAssignment_1_0_3 ) )
                    {
                    // InternalPascal.g:521:2: ( ( rule__Term__OperatorsAssignment_1_0_3 ) )
                    // InternalPascal.g:522:3: ( rule__Term__OperatorsAssignment_1_0_3 )
                    {
                     before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_3()); 
                    // InternalPascal.g:523:3: ( rule__Term__OperatorsAssignment_1_0_3 )
                    // InternalPascal.g:523:4: rule__Term__OperatorsAssignment_1_0_3
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
    // InternalPascal.g:531:1: rule__Factor__Alternatives : ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__FunctionAssignment_7 ) ) | ( ( rule__Factor__Group_8__0 ) ) | ( ( rule__Factor__Group_9__0 ) ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:535:1: ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__FunctionAssignment_7 ) ) | ( ( rule__Factor__Group_8__0 ) ) | ( ( rule__Factor__Group_9__0 ) ) )
            int alt7=10;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalPascal.g:536:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    {
                    // InternalPascal.g:536:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    // InternalPascal.g:537:3: ( rule__Factor__VariableAssignment_0 )
                    {
                     before(grammarAccess.getFactorAccess().getVariableAssignment_0()); 
                    // InternalPascal.g:538:3: ( rule__Factor__VariableAssignment_0 )
                    // InternalPascal.g:538:4: rule__Factor__VariableAssignment_0
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
                    // InternalPascal.g:542:2: ( ( rule__Factor__NumberAssignment_1 ) )
                    {
                    // InternalPascal.g:542:2: ( ( rule__Factor__NumberAssignment_1 ) )
                    // InternalPascal.g:543:3: ( rule__Factor__NumberAssignment_1 )
                    {
                     before(grammarAccess.getFactorAccess().getNumberAssignment_1()); 
                    // InternalPascal.g:544:3: ( rule__Factor__NumberAssignment_1 )
                    // InternalPascal.g:544:4: rule__Factor__NumberAssignment_1
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
                    // InternalPascal.g:548:2: ( ( rule__Factor__StringAssignment_2 ) )
                    {
                    // InternalPascal.g:548:2: ( ( rule__Factor__StringAssignment_2 ) )
                    // InternalPascal.g:549:3: ( rule__Factor__StringAssignment_2 )
                    {
                     before(grammarAccess.getFactorAccess().getStringAssignment_2()); 
                    // InternalPascal.g:550:3: ( rule__Factor__StringAssignment_2 )
                    // InternalPascal.g:550:4: rule__Factor__StringAssignment_2
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
                    // InternalPascal.g:554:2: ( ( rule__Factor__SetAssignment_3 ) )
                    {
                    // InternalPascal.g:554:2: ( ( rule__Factor__SetAssignment_3 ) )
                    // InternalPascal.g:555:3: ( rule__Factor__SetAssignment_3 )
                    {
                     before(grammarAccess.getFactorAccess().getSetAssignment_3()); 
                    // InternalPascal.g:556:3: ( rule__Factor__SetAssignment_3 )
                    // InternalPascal.g:556:4: rule__Factor__SetAssignment_3
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
                    // InternalPascal.g:560:2: ( ( rule__Factor__NilAssignment_4 ) )
                    {
                    // InternalPascal.g:560:2: ( ( rule__Factor__NilAssignment_4 ) )
                    // InternalPascal.g:561:3: ( rule__Factor__NilAssignment_4 )
                    {
                     before(grammarAccess.getFactorAccess().getNilAssignment_4()); 
                    // InternalPascal.g:562:3: ( rule__Factor__NilAssignment_4 )
                    // InternalPascal.g:562:4: rule__Factor__NilAssignment_4
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
                    // InternalPascal.g:566:2: ( ( rule__Factor__BooleanAssignment_5 ) )
                    {
                    // InternalPascal.g:566:2: ( ( rule__Factor__BooleanAssignment_5 ) )
                    // InternalPascal.g:567:3: ( rule__Factor__BooleanAssignment_5 )
                    {
                     before(grammarAccess.getFactorAccess().getBooleanAssignment_5()); 
                    // InternalPascal.g:568:3: ( rule__Factor__BooleanAssignment_5 )
                    // InternalPascal.g:568:4: rule__Factor__BooleanAssignment_5
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
                    // InternalPascal.g:572:2: ( ( rule__Factor__BooleanAssignment_6 ) )
                    {
                    // InternalPascal.g:572:2: ( ( rule__Factor__BooleanAssignment_6 ) )
                    // InternalPascal.g:573:3: ( rule__Factor__BooleanAssignment_6 )
                    {
                     before(grammarAccess.getFactorAccess().getBooleanAssignment_6()); 
                    // InternalPascal.g:574:3: ( rule__Factor__BooleanAssignment_6 )
                    // InternalPascal.g:574:4: rule__Factor__BooleanAssignment_6
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
                    // InternalPascal.g:578:2: ( ( rule__Factor__FunctionAssignment_7 ) )
                    {
                    // InternalPascal.g:578:2: ( ( rule__Factor__FunctionAssignment_7 ) )
                    // InternalPascal.g:579:3: ( rule__Factor__FunctionAssignment_7 )
                    {
                     before(grammarAccess.getFactorAccess().getFunctionAssignment_7()); 
                    // InternalPascal.g:580:3: ( rule__Factor__FunctionAssignment_7 )
                    // InternalPascal.g:580:4: rule__Factor__FunctionAssignment_7
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
                    // InternalPascal.g:584:2: ( ( rule__Factor__Group_8__0 ) )
                    {
                    // InternalPascal.g:584:2: ( ( rule__Factor__Group_8__0 ) )
                    // InternalPascal.g:585:3: ( rule__Factor__Group_8__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_8()); 
                    // InternalPascal.g:586:3: ( rule__Factor__Group_8__0 )
                    // InternalPascal.g:586:4: rule__Factor__Group_8__0
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
                    // InternalPascal.g:590:2: ( ( rule__Factor__Group_9__0 ) )
                    {
                    // InternalPascal.g:590:2: ( ( rule__Factor__Group_9__0 ) )
                    // InternalPascal.g:591:3: ( rule__Factor__Group_9__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_9()); 
                    // InternalPascal.g:592:3: ( rule__Factor__Group_9__0 )
                    // InternalPascal.g:592:4: rule__Factor__Group_9__0
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
    // InternalPascal.g:600:1: rule__Any_number__Alternatives : ( ( ruleunsigned_number ) | ( rulesigned_number ) );
    public final void rule__Any_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:604:1: ( ( ruleunsigned_number ) | ( rulesigned_number ) )
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
                    // InternalPascal.g:605:2: ( ruleunsigned_number )
                    {
                    // InternalPascal.g:605:2: ( ruleunsigned_number )
                    // InternalPascal.g:606:3: ruleunsigned_number
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
                    // InternalPascal.g:611:2: ( rulesigned_number )
                    {
                    // InternalPascal.g:611:2: ( rulesigned_number )
                    // InternalPascal.g:612:3: rulesigned_number
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
    // InternalPascal.g:621:1: rule__Signed_number__Alternatives : ( ( ( rule__Signed_number__IntegerAssignment_0 ) ) | ( ( rule__Signed_number__RealAssignment_1 ) ) );
    public final void rule__Signed_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:625:1: ( ( ( rule__Signed_number__IntegerAssignment_0 ) ) | ( ( rule__Signed_number__RealAssignment_1 ) ) )
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
                    // InternalPascal.g:626:2: ( ( rule__Signed_number__IntegerAssignment_0 ) )
                    {
                    // InternalPascal.g:626:2: ( ( rule__Signed_number__IntegerAssignment_0 ) )
                    // InternalPascal.g:627:3: ( rule__Signed_number__IntegerAssignment_0 )
                    {
                     before(grammarAccess.getSigned_numberAccess().getIntegerAssignment_0()); 
                    // InternalPascal.g:628:3: ( rule__Signed_number__IntegerAssignment_0 )
                    // InternalPascal.g:628:4: rule__Signed_number__IntegerAssignment_0
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
                    // InternalPascal.g:632:2: ( ( rule__Signed_number__RealAssignment_1 ) )
                    {
                    // InternalPascal.g:632:2: ( ( rule__Signed_number__RealAssignment_1 ) )
                    // InternalPascal.g:633:3: ( rule__Signed_number__RealAssignment_1 )
                    {
                     before(grammarAccess.getSigned_numberAccess().getRealAssignment_1()); 
                    // InternalPascal.g:634:3: ( rule__Signed_number__RealAssignment_1 )
                    // InternalPascal.g:634:4: rule__Signed_number__RealAssignment_1
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
    // InternalPascal.g:642:1: rule__Unsigned_number__Alternatives : ( ( ( rule__Unsigned_number__IntegerAssignment_0 ) ) | ( ( rule__Unsigned_number__RealAssignment_1 ) ) );
    public final void rule__Unsigned_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:646:1: ( ( ( rule__Unsigned_number__IntegerAssignment_0 ) ) | ( ( rule__Unsigned_number__RealAssignment_1 ) ) )
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
                    // InternalPascal.g:647:2: ( ( rule__Unsigned_number__IntegerAssignment_0 ) )
                    {
                    // InternalPascal.g:647:2: ( ( rule__Unsigned_number__IntegerAssignment_0 ) )
                    // InternalPascal.g:648:3: ( rule__Unsigned_number__IntegerAssignment_0 )
                    {
                     before(grammarAccess.getUnsigned_numberAccess().getIntegerAssignment_0()); 
                    // InternalPascal.g:649:3: ( rule__Unsigned_number__IntegerAssignment_0 )
                    // InternalPascal.g:649:4: rule__Unsigned_number__IntegerAssignment_0
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
                    // InternalPascal.g:653:2: ( ( rule__Unsigned_number__RealAssignment_1 ) )
                    {
                    // InternalPascal.g:653:2: ( ( rule__Unsigned_number__RealAssignment_1 ) )
                    // InternalPascal.g:654:3: ( rule__Unsigned_number__RealAssignment_1 )
                    {
                     before(grammarAccess.getUnsigned_numberAccess().getRealAssignment_1()); 
                    // InternalPascal.g:655:3: ( rule__Unsigned_number__RealAssignment_1 )
                    // InternalPascal.g:655:4: rule__Unsigned_number__RealAssignment_1
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
    // InternalPascal.g:663:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:667:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalPascal.g:668:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalPascal.g:675:1: rule__Program__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:679:1: ( ( 'program' ) )
            // InternalPascal.g:680:1: ( 'program' )
            {
            // InternalPascal.g:680:1: ( 'program' )
            // InternalPascal.g:681:2: 'program'
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
    // InternalPascal.g:690:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:694:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalPascal.g:695:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalPascal.g:702:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:706:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalPascal.g:707:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalPascal.g:707:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalPascal.g:708:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalPascal.g:709:2: ( rule__Program__NameAssignment_1 )
            // InternalPascal.g:709:3: rule__Program__NameAssignment_1
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
    // InternalPascal.g:717:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:721:1: ( rule__Program__Group__2__Impl )
            // InternalPascal.g:722:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__2__Impl();

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
    // InternalPascal.g:728:1: rule__Program__Group__2__Impl : ( ';' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:732:1: ( ( ';' ) )
            // InternalPascal.g:733:1: ( ';' )
            {
            // InternalPascal.g:733:1: ( ';' )
            // InternalPascal.g:734:2: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getSemicolonKeyword_2()); 

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


    // $ANTLR start "rule__Variable__Group__0"
    // InternalPascal.g:744:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:748:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalPascal.g:749:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalPascal.g:756:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:760:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalPascal.g:761:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalPascal.g:761:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalPascal.g:762:2: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // InternalPascal.g:763:2: ( rule__Variable__NameAssignment_0 )
            // InternalPascal.g:763:3: rule__Variable__NameAssignment_0
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
    // InternalPascal.g:771:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:775:1: ( rule__Variable__Group__1__Impl )
            // InternalPascal.g:776:2: rule__Variable__Group__1__Impl
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
    // InternalPascal.g:782:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__VariableAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:786:1: ( ( ( rule__Variable__VariableAssignment_1 ) ) )
            // InternalPascal.g:787:1: ( ( rule__Variable__VariableAssignment_1 ) )
            {
            // InternalPascal.g:787:1: ( ( rule__Variable__VariableAssignment_1 ) )
            // InternalPascal.g:788:2: ( rule__Variable__VariableAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getVariableAssignment_1()); 
            // InternalPascal.g:789:2: ( rule__Variable__VariableAssignment_1 )
            // InternalPascal.g:789:3: rule__Variable__VariableAssignment_1
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
    // InternalPascal.g:798:1: rule__Var___Group_0__0 : rule__Var___Group_0__0__Impl rule__Var___Group_0__1 ;
    public final void rule__Var___Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:802:1: ( rule__Var___Group_0__0__Impl rule__Var___Group_0__1 )
            // InternalPascal.g:803:2: rule__Var___Group_0__0__Impl rule__Var___Group_0__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalPascal.g:810:1: rule__Var___Group_0__0__Impl : ( '[' ) ;
    public final void rule__Var___Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:814:1: ( ( '[' ) )
            // InternalPascal.g:815:1: ( '[' )
            {
            // InternalPascal.g:815:1: ( '[' )
            // InternalPascal.g:816:2: '['
            {
             before(grammarAccess.getVar_Access().getLeftSquareBracketKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalPascal.g:825:1: rule__Var___Group_0__1 : rule__Var___Group_0__1__Impl rule__Var___Group_0__2 ;
    public final void rule__Var___Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:829:1: ( rule__Var___Group_0__1__Impl rule__Var___Group_0__2 )
            // InternalPascal.g:830:2: rule__Var___Group_0__1__Impl rule__Var___Group_0__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalPascal.g:837:1: rule__Var___Group_0__1__Impl : ( ( rule__Var___ExpressionsAssignment_0_1 ) ) ;
    public final void rule__Var___Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:841:1: ( ( ( rule__Var___ExpressionsAssignment_0_1 ) ) )
            // InternalPascal.g:842:1: ( ( rule__Var___ExpressionsAssignment_0_1 ) )
            {
            // InternalPascal.g:842:1: ( ( rule__Var___ExpressionsAssignment_0_1 ) )
            // InternalPascal.g:843:2: ( rule__Var___ExpressionsAssignment_0_1 )
            {
             before(grammarAccess.getVar_Access().getExpressionsAssignment_0_1()); 
            // InternalPascal.g:844:2: ( rule__Var___ExpressionsAssignment_0_1 )
            // InternalPascal.g:844:3: rule__Var___ExpressionsAssignment_0_1
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
    // InternalPascal.g:852:1: rule__Var___Group_0__2 : rule__Var___Group_0__2__Impl rule__Var___Group_0__3 ;
    public final void rule__Var___Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:856:1: ( rule__Var___Group_0__2__Impl rule__Var___Group_0__3 )
            // InternalPascal.g:857:2: rule__Var___Group_0__2__Impl rule__Var___Group_0__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalPascal.g:864:1: rule__Var___Group_0__2__Impl : ( ']' ) ;
    public final void rule__Var___Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:868:1: ( ( ']' ) )
            // InternalPascal.g:869:1: ( ']' )
            {
            // InternalPascal.g:869:1: ( ']' )
            // InternalPascal.g:870:2: ']'
            {
             before(grammarAccess.getVar_Access().getRightSquareBracketKeyword_0_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalPascal.g:879:1: rule__Var___Group_0__3 : rule__Var___Group_0__3__Impl ;
    public final void rule__Var___Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:883:1: ( rule__Var___Group_0__3__Impl )
            // InternalPascal.g:884:2: rule__Var___Group_0__3__Impl
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
    // InternalPascal.g:890:1: rule__Var___Group_0__3__Impl : ( ( rule__Var___ArrayAssignment_0_3 ) ) ;
    public final void rule__Var___Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:894:1: ( ( ( rule__Var___ArrayAssignment_0_3 ) ) )
            // InternalPascal.g:895:1: ( ( rule__Var___ArrayAssignment_0_3 ) )
            {
            // InternalPascal.g:895:1: ( ( rule__Var___ArrayAssignment_0_3 ) )
            // InternalPascal.g:896:2: ( rule__Var___ArrayAssignment_0_3 )
            {
             before(grammarAccess.getVar_Access().getArrayAssignment_0_3()); 
            // InternalPascal.g:897:2: ( rule__Var___ArrayAssignment_0_3 )
            // InternalPascal.g:897:3: rule__Var___ArrayAssignment_0_3
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
    // InternalPascal.g:906:1: rule__Var___Group_1__0 : rule__Var___Group_1__0__Impl rule__Var___Group_1__1 ;
    public final void rule__Var___Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:910:1: ( rule__Var___Group_1__0__Impl rule__Var___Group_1__1 )
            // InternalPascal.g:911:2: rule__Var___Group_1__0__Impl rule__Var___Group_1__1
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
    // InternalPascal.g:918:1: rule__Var___Group_1__0__Impl : ( ( rule__Var___AccessorAssignment_1_0 ) ) ;
    public final void rule__Var___Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:922:1: ( ( ( rule__Var___AccessorAssignment_1_0 ) ) )
            // InternalPascal.g:923:1: ( ( rule__Var___AccessorAssignment_1_0 ) )
            {
            // InternalPascal.g:923:1: ( ( rule__Var___AccessorAssignment_1_0 ) )
            // InternalPascal.g:924:2: ( rule__Var___AccessorAssignment_1_0 )
            {
             before(grammarAccess.getVar_Access().getAccessorAssignment_1_0()); 
            // InternalPascal.g:925:2: ( rule__Var___AccessorAssignment_1_0 )
            // InternalPascal.g:925:3: rule__Var___AccessorAssignment_1_0
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
    // InternalPascal.g:933:1: rule__Var___Group_1__1 : rule__Var___Group_1__1__Impl rule__Var___Group_1__2 ;
    public final void rule__Var___Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:937:1: ( rule__Var___Group_1__1__Impl rule__Var___Group_1__2 )
            // InternalPascal.g:938:2: rule__Var___Group_1__1__Impl rule__Var___Group_1__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalPascal.g:945:1: rule__Var___Group_1__1__Impl : ( ( rule__Var___NameAssignment_1_1 ) ) ;
    public final void rule__Var___Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:949:1: ( ( ( rule__Var___NameAssignment_1_1 ) ) )
            // InternalPascal.g:950:1: ( ( rule__Var___NameAssignment_1_1 ) )
            {
            // InternalPascal.g:950:1: ( ( rule__Var___NameAssignment_1_1 ) )
            // InternalPascal.g:951:2: ( rule__Var___NameAssignment_1_1 )
            {
             before(grammarAccess.getVar_Access().getNameAssignment_1_1()); 
            // InternalPascal.g:952:2: ( rule__Var___NameAssignment_1_1 )
            // InternalPascal.g:952:3: rule__Var___NameAssignment_1_1
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
    // InternalPascal.g:960:1: rule__Var___Group_1__2 : rule__Var___Group_1__2__Impl ;
    public final void rule__Var___Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:964:1: ( rule__Var___Group_1__2__Impl )
            // InternalPascal.g:965:2: rule__Var___Group_1__2__Impl
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
    // InternalPascal.g:971:1: rule__Var___Group_1__2__Impl : ( ( rule__Var___VariableAssignment_1_2 ) ) ;
    public final void rule__Var___Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:975:1: ( ( ( rule__Var___VariableAssignment_1_2 ) ) )
            // InternalPascal.g:976:1: ( ( rule__Var___VariableAssignment_1_2 ) )
            {
            // InternalPascal.g:976:1: ( ( rule__Var___VariableAssignment_1_2 ) )
            // InternalPascal.g:977:2: ( rule__Var___VariableAssignment_1_2 )
            {
             before(grammarAccess.getVar_Access().getVariableAssignment_1_2()); 
            // InternalPascal.g:978:2: ( rule__Var___VariableAssignment_1_2 )
            // InternalPascal.g:978:3: rule__Var___VariableAssignment_1_2
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
    // InternalPascal.g:987:1: rule__Var___Group_2__0 : rule__Var___Group_2__0__Impl rule__Var___Group_2__1 ;
    public final void rule__Var___Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:991:1: ( rule__Var___Group_2__0__Impl rule__Var___Group_2__1 )
            // InternalPascal.g:992:2: rule__Var___Group_2__0__Impl rule__Var___Group_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalPascal.g:999:1: rule__Var___Group_2__0__Impl : ( '^' ) ;
    public final void rule__Var___Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1003:1: ( ( '^' ) )
            // InternalPascal.g:1004:1: ( '^' )
            {
            // InternalPascal.g:1004:1: ( '^' )
            // InternalPascal.g:1005:2: '^'
            {
             before(grammarAccess.getVar_Access().getCircumflexAccentKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPascal.g:1014:1: rule__Var___Group_2__1 : rule__Var___Group_2__1__Impl ;
    public final void rule__Var___Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1018:1: ( rule__Var___Group_2__1__Impl )
            // InternalPascal.g:1019:2: rule__Var___Group_2__1__Impl
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
    // InternalPascal.g:1025:1: rule__Var___Group_2__1__Impl : ( ( rule__Var___PointerAssignment_2_1 ) ) ;
    public final void rule__Var___Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1029:1: ( ( ( rule__Var___PointerAssignment_2_1 ) ) )
            // InternalPascal.g:1030:1: ( ( rule__Var___PointerAssignment_2_1 ) )
            {
            // InternalPascal.g:1030:1: ( ( rule__Var___PointerAssignment_2_1 ) )
            // InternalPascal.g:1031:2: ( rule__Var___PointerAssignment_2_1 )
            {
             before(grammarAccess.getVar_Access().getPointerAssignment_2_1()); 
            // InternalPascal.g:1032:2: ( rule__Var___PointerAssignment_2_1 )
            // InternalPascal.g:1032:3: rule__Var___PointerAssignment_2_1
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
    // InternalPascal.g:1041:1: rule__Expression_list__Group__0 : rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 ;
    public final void rule__Expression_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1045:1: ( rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 )
            // InternalPascal.g:1046:2: rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalPascal.g:1053:1: rule__Expression_list__Group__0__Impl : ( ( rule__Expression_list__ExpressionsAssignment_0 ) ) ;
    public final void rule__Expression_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1057:1: ( ( ( rule__Expression_list__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:1058:1: ( ( rule__Expression_list__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:1058:1: ( ( rule__Expression_list__ExpressionsAssignment_0 ) )
            // InternalPascal.g:1059:2: ( rule__Expression_list__ExpressionsAssignment_0 )
            {
             before(grammarAccess.getExpression_listAccess().getExpressionsAssignment_0()); 
            // InternalPascal.g:1060:2: ( rule__Expression_list__ExpressionsAssignment_0 )
            // InternalPascal.g:1060:3: rule__Expression_list__ExpressionsAssignment_0
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
    // InternalPascal.g:1068:1: rule__Expression_list__Group__1 : rule__Expression_list__Group__1__Impl ;
    public final void rule__Expression_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1072:1: ( rule__Expression_list__Group__1__Impl )
            // InternalPascal.g:1073:2: rule__Expression_list__Group__1__Impl
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
    // InternalPascal.g:1079:1: rule__Expression_list__Group__1__Impl : ( ( rule__Expression_list__Group_1__0 )* ) ;
    public final void rule__Expression_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1083:1: ( ( ( rule__Expression_list__Group_1__0 )* ) )
            // InternalPascal.g:1084:1: ( ( rule__Expression_list__Group_1__0 )* )
            {
            // InternalPascal.g:1084:1: ( ( rule__Expression_list__Group_1__0 )* )
            // InternalPascal.g:1085:2: ( rule__Expression_list__Group_1__0 )*
            {
             before(grammarAccess.getExpression_listAccess().getGroup_1()); 
            // InternalPascal.g:1086:2: ( rule__Expression_list__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPascal.g:1086:3: rule__Expression_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Expression_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalPascal.g:1095:1: rule__Expression_list__Group_1__0 : rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 ;
    public final void rule__Expression_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1099:1: ( rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 )
            // InternalPascal.g:1100:2: rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalPascal.g:1107:1: rule__Expression_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Expression_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1111:1: ( ( ',' ) )
            // InternalPascal.g:1112:1: ( ',' )
            {
            // InternalPascal.g:1112:1: ( ',' )
            // InternalPascal.g:1113:2: ','
            {
             before(grammarAccess.getExpression_listAccess().getCommaKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalPascal.g:1122:1: rule__Expression_list__Group_1__1 : rule__Expression_list__Group_1__1__Impl ;
    public final void rule__Expression_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1126:1: ( rule__Expression_list__Group_1__1__Impl )
            // InternalPascal.g:1127:2: rule__Expression_list__Group_1__1__Impl
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
    // InternalPascal.g:1133:1: rule__Expression_list__Group_1__1__Impl : ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Expression_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1137:1: ( ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:1138:1: ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:1138:1: ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:1139:2: ( rule__Expression_list__ExpressionsAssignment_1_1 )
            {
             before(grammarAccess.getExpression_listAccess().getExpressionsAssignment_1_1()); 
            // InternalPascal.g:1140:2: ( rule__Expression_list__ExpressionsAssignment_1_1 )
            // InternalPascal.g:1140:3: rule__Expression_list__ExpressionsAssignment_1_1
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
    // InternalPascal.g:1149:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1153:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalPascal.g:1154:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalPascal.g:1161:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__ExpressionsAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1165:1: ( ( ( rule__Expression__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:1166:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:1166:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            // InternalPascal.g:1167:2: ( rule__Expression__ExpressionsAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getExpressionsAssignment_0()); 
            // InternalPascal.g:1168:2: ( rule__Expression__ExpressionsAssignment_0 )
            // InternalPascal.g:1168:3: rule__Expression__ExpressionsAssignment_0
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
    // InternalPascal.g:1176:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1180:1: ( rule__Expression__Group__1__Impl )
            // InternalPascal.g:1181:2: rule__Expression__Group__1__Impl
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
    // InternalPascal.g:1187:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1191:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalPascal.g:1192:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalPascal.g:1192:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalPascal.g:1193:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalPascal.g:1194:2: ( rule__Expression__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_RELATIONAL_OP||(LA12_0>=32 && LA12_0<=33)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPascal.g:1194:3: rule__Expression__Group_1__0
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
    // InternalPascal.g:1203:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1207:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalPascal.g:1208:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalPascal.g:1215:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Alternatives_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1219:1: ( ( ( rule__Expression__Alternatives_1_0 ) ) )
            // InternalPascal.g:1220:1: ( ( rule__Expression__Alternatives_1_0 ) )
            {
            // InternalPascal.g:1220:1: ( ( rule__Expression__Alternatives_1_0 ) )
            // InternalPascal.g:1221:2: ( rule__Expression__Alternatives_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 
            // InternalPascal.g:1222:2: ( rule__Expression__Alternatives_1_0 )
            // InternalPascal.g:1222:3: rule__Expression__Alternatives_1_0
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
    // InternalPascal.g:1230:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1234:1: ( rule__Expression__Group_1__1__Impl )
            // InternalPascal.g:1235:2: rule__Expression__Group_1__1__Impl
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
    // InternalPascal.g:1241:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1245:1: ( ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:1246:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:1246:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:1247:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getExpressionsAssignment_1_1()); 
            // InternalPascal.g:1248:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            // InternalPascal.g:1248:3: rule__Expression__ExpressionsAssignment_1_1
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
    // InternalPascal.g:1257:1: rule__Simple_expression__Group__0 : rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 ;
    public final void rule__Simple_expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1261:1: ( rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 )
            // InternalPascal.g:1262:2: rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalPascal.g:1269:1: rule__Simple_expression__Group__0__Impl : ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? ) ;
    public final void rule__Simple_expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1273:1: ( ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? ) )
            // InternalPascal.g:1274:1: ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? )
            {
            // InternalPascal.g:1274:1: ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? )
            // InternalPascal.g:1275:2: ( rule__Simple_expression__PrefixOperatorAssignment_0 )?
            {
             before(grammarAccess.getSimple_expressionAccess().getPrefixOperatorAssignment_0()); 
            // InternalPascal.g:1276:2: ( rule__Simple_expression__PrefixOperatorAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ADDITION_OP) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPascal.g:1276:3: rule__Simple_expression__PrefixOperatorAssignment_0
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
    // InternalPascal.g:1284:1: rule__Simple_expression__Group__1 : rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 ;
    public final void rule__Simple_expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1288:1: ( rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 )
            // InternalPascal.g:1289:2: rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalPascal.g:1296:1: rule__Simple_expression__Group__1__Impl : ( ( rule__Simple_expression__TermsAssignment_1 ) ) ;
    public final void rule__Simple_expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1300:1: ( ( ( rule__Simple_expression__TermsAssignment_1 ) ) )
            // InternalPascal.g:1301:1: ( ( rule__Simple_expression__TermsAssignment_1 ) )
            {
            // InternalPascal.g:1301:1: ( ( rule__Simple_expression__TermsAssignment_1 ) )
            // InternalPascal.g:1302:2: ( rule__Simple_expression__TermsAssignment_1 )
            {
             before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_1()); 
            // InternalPascal.g:1303:2: ( rule__Simple_expression__TermsAssignment_1 )
            // InternalPascal.g:1303:3: rule__Simple_expression__TermsAssignment_1
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
    // InternalPascal.g:1311:1: rule__Simple_expression__Group__2 : rule__Simple_expression__Group__2__Impl ;
    public final void rule__Simple_expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1315:1: ( rule__Simple_expression__Group__2__Impl )
            // InternalPascal.g:1316:2: rule__Simple_expression__Group__2__Impl
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
    // InternalPascal.g:1322:1: rule__Simple_expression__Group__2__Impl : ( ( rule__Simple_expression__Alternatives_2 )* ) ;
    public final void rule__Simple_expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1326:1: ( ( ( rule__Simple_expression__Alternatives_2 )* ) )
            // InternalPascal.g:1327:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            {
            // InternalPascal.g:1327:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            // InternalPascal.g:1328:2: ( rule__Simple_expression__Alternatives_2 )*
            {
             before(grammarAccess.getSimple_expressionAccess().getAlternatives_2()); 
            // InternalPascal.g:1329:2: ( rule__Simple_expression__Alternatives_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ADDITION_OP||(LA14_0>=RULE_INTEGER_NUMBER && LA14_0<=RULE_REAL_NUMBER)||LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPascal.g:1329:3: rule__Simple_expression__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Simple_expression__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalPascal.g:1338:1: rule__Simple_expression__Group_2_0__0 : rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 ;
    public final void rule__Simple_expression__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1342:1: ( rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 )
            // InternalPascal.g:1343:2: rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalPascal.g:1350:1: rule__Simple_expression__Group_2_0__0__Impl : ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) ;
    public final void rule__Simple_expression__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1354:1: ( ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) )
            // InternalPascal.g:1355:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            {
            // InternalPascal.g:1355:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            // InternalPascal.g:1356:2: ( rule__Simple_expression__Alternatives_2_0_0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getAlternatives_2_0_0()); 
            // InternalPascal.g:1357:2: ( rule__Simple_expression__Alternatives_2_0_0 )
            // InternalPascal.g:1357:3: rule__Simple_expression__Alternatives_2_0_0
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
    // InternalPascal.g:1365:1: rule__Simple_expression__Group_2_0__1 : rule__Simple_expression__Group_2_0__1__Impl ;
    public final void rule__Simple_expression__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1369:1: ( rule__Simple_expression__Group_2_0__1__Impl )
            // InternalPascal.g:1370:2: rule__Simple_expression__Group_2_0__1__Impl
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
    // InternalPascal.g:1376:1: rule__Simple_expression__Group_2_0__1__Impl : ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) ) ;
    public final void rule__Simple_expression__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1380:1: ( ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) ) )
            // InternalPascal.g:1381:1: ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) )
            {
            // InternalPascal.g:1381:1: ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) )
            // InternalPascal.g:1382:2: ( rule__Simple_expression__TermsAssignment_2_0_1 )
            {
             before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_0_1()); 
            // InternalPascal.g:1383:2: ( rule__Simple_expression__TermsAssignment_2_0_1 )
            // InternalPascal.g:1383:3: rule__Simple_expression__TermsAssignment_2_0_1
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
    // InternalPascal.g:1392:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1396:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalPascal.g:1397:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalPascal.g:1404:1: rule__Term__Group__0__Impl : ( ( rule__Term__FactorsAssignment_0 ) ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1408:1: ( ( ( rule__Term__FactorsAssignment_0 ) ) )
            // InternalPascal.g:1409:1: ( ( rule__Term__FactorsAssignment_0 ) )
            {
            // InternalPascal.g:1409:1: ( ( rule__Term__FactorsAssignment_0 ) )
            // InternalPascal.g:1410:2: ( rule__Term__FactorsAssignment_0 )
            {
             before(grammarAccess.getTermAccess().getFactorsAssignment_0()); 
            // InternalPascal.g:1411:2: ( rule__Term__FactorsAssignment_0 )
            // InternalPascal.g:1411:3: rule__Term__FactorsAssignment_0
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
    // InternalPascal.g:1419:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1423:1: ( rule__Term__Group__1__Impl )
            // InternalPascal.g:1424:2: rule__Term__Group__1__Impl
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
    // InternalPascal.g:1430:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1434:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // InternalPascal.g:1435:1: ( ( rule__Term__Group_1__0 )* )
            {
            // InternalPascal.g:1435:1: ( ( rule__Term__Group_1__0 )* )
            // InternalPascal.g:1436:2: ( rule__Term__Group_1__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // InternalPascal.g:1437:2: ( rule__Term__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_MULTIPLICATION_OP||(LA15_0>=35 && LA15_0<=37)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPascal.g:1437:3: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Term__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalPascal.g:1446:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1450:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalPascal.g:1451:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalPascal.g:1458:1: rule__Term__Group_1__0__Impl : ( ( rule__Term__Alternatives_1_0 ) ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1462:1: ( ( ( rule__Term__Alternatives_1_0 ) ) )
            // InternalPascal.g:1463:1: ( ( rule__Term__Alternatives_1_0 ) )
            {
            // InternalPascal.g:1463:1: ( ( rule__Term__Alternatives_1_0 ) )
            // InternalPascal.g:1464:2: ( rule__Term__Alternatives_1_0 )
            {
             before(grammarAccess.getTermAccess().getAlternatives_1_0()); 
            // InternalPascal.g:1465:2: ( rule__Term__Alternatives_1_0 )
            // InternalPascal.g:1465:3: rule__Term__Alternatives_1_0
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
    // InternalPascal.g:1473:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1477:1: ( rule__Term__Group_1__1__Impl )
            // InternalPascal.g:1478:2: rule__Term__Group_1__1__Impl
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
    // InternalPascal.g:1484:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__FactorsAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1488:1: ( ( ( rule__Term__FactorsAssignment_1_1 ) ) )
            // InternalPascal.g:1489:1: ( ( rule__Term__FactorsAssignment_1_1 ) )
            {
            // InternalPascal.g:1489:1: ( ( rule__Term__FactorsAssignment_1_1 ) )
            // InternalPascal.g:1490:2: ( rule__Term__FactorsAssignment_1_1 )
            {
             before(grammarAccess.getTermAccess().getFactorsAssignment_1_1()); 
            // InternalPascal.g:1491:2: ( rule__Term__FactorsAssignment_1_1 )
            // InternalPascal.g:1491:3: rule__Term__FactorsAssignment_1_1
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
    // InternalPascal.g:1500:1: rule__Factor__Group_8__0 : rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1 ;
    public final void rule__Factor__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1504:1: ( rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1 )
            // InternalPascal.g:1505:2: rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalPascal.g:1512:1: rule__Factor__Group_8__0__Impl : ( '(' ) ;
    public final void rule__Factor__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1516:1: ( ( '(' ) )
            // InternalPascal.g:1517:1: ( '(' )
            {
            // InternalPascal.g:1517:1: ( '(' )
            // InternalPascal.g:1518:2: '('
            {
             before(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_8_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPascal.g:1527:1: rule__Factor__Group_8__1 : rule__Factor__Group_8__1__Impl rule__Factor__Group_8__2 ;
    public final void rule__Factor__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1531:1: ( rule__Factor__Group_8__1__Impl rule__Factor__Group_8__2 )
            // InternalPascal.g:1532:2: rule__Factor__Group_8__1__Impl rule__Factor__Group_8__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalPascal.g:1539:1: rule__Factor__Group_8__1__Impl : ( ( rule__Factor__ExpressionAssignment_8_1 ) ) ;
    public final void rule__Factor__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1543:1: ( ( ( rule__Factor__ExpressionAssignment_8_1 ) ) )
            // InternalPascal.g:1544:1: ( ( rule__Factor__ExpressionAssignment_8_1 ) )
            {
            // InternalPascal.g:1544:1: ( ( rule__Factor__ExpressionAssignment_8_1 ) )
            // InternalPascal.g:1545:2: ( rule__Factor__ExpressionAssignment_8_1 )
            {
             before(grammarAccess.getFactorAccess().getExpressionAssignment_8_1()); 
            // InternalPascal.g:1546:2: ( rule__Factor__ExpressionAssignment_8_1 )
            // InternalPascal.g:1546:3: rule__Factor__ExpressionAssignment_8_1
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
    // InternalPascal.g:1554:1: rule__Factor__Group_8__2 : rule__Factor__Group_8__2__Impl ;
    public final void rule__Factor__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1558:1: ( rule__Factor__Group_8__2__Impl )
            // InternalPascal.g:1559:2: rule__Factor__Group_8__2__Impl
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
    // InternalPascal.g:1565:1: rule__Factor__Group_8__2__Impl : ( ')' ) ;
    public final void rule__Factor__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1569:1: ( ( ')' ) )
            // InternalPascal.g:1570:1: ( ')' )
            {
            // InternalPascal.g:1570:1: ( ')' )
            // InternalPascal.g:1571:2: ')'
            {
             before(grammarAccess.getFactorAccess().getRightParenthesisKeyword_8_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPascal.g:1581:1: rule__Factor__Group_9__0 : rule__Factor__Group_9__0__Impl rule__Factor__Group_9__1 ;
    public final void rule__Factor__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1585:1: ( rule__Factor__Group_9__0__Impl rule__Factor__Group_9__1 )
            // InternalPascal.g:1586:2: rule__Factor__Group_9__0__Impl rule__Factor__Group_9__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalPascal.g:1593:1: rule__Factor__Group_9__0__Impl : ( 'not' ) ;
    public final void rule__Factor__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1597:1: ( ( 'not' ) )
            // InternalPascal.g:1598:1: ( 'not' )
            {
            // InternalPascal.g:1598:1: ( 'not' )
            // InternalPascal.g:1599:2: 'not'
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
    // InternalPascal.g:1608:1: rule__Factor__Group_9__1 : rule__Factor__Group_9__1__Impl ;
    public final void rule__Factor__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1612:1: ( rule__Factor__Group_9__1__Impl )
            // InternalPascal.g:1613:2: rule__Factor__Group_9__1__Impl
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
    // InternalPascal.g:1619:1: rule__Factor__Group_9__1__Impl : ( ( rule__Factor__NotAssignment_9_1 ) ) ;
    public final void rule__Factor__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1623:1: ( ( ( rule__Factor__NotAssignment_9_1 ) ) )
            // InternalPascal.g:1624:1: ( ( rule__Factor__NotAssignment_9_1 ) )
            {
            // InternalPascal.g:1624:1: ( ( rule__Factor__NotAssignment_9_1 ) )
            // InternalPascal.g:1625:2: ( rule__Factor__NotAssignment_9_1 )
            {
             before(grammarAccess.getFactorAccess().getNotAssignment_9_1()); 
            // InternalPascal.g:1626:2: ( rule__Factor__NotAssignment_9_1 )
            // InternalPascal.g:1626:3: rule__Factor__NotAssignment_9_1
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
    // InternalPascal.g:1635:1: rule__Function_designator__Group__0 : rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 ;
    public final void rule__Function_designator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1639:1: ( rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 )
            // InternalPascal.g:1640:2: rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1
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
    // InternalPascal.g:1647:1: rule__Function_designator__Group__0__Impl : ( ( rule__Function_designator__NameAssignment_0 ) ) ;
    public final void rule__Function_designator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1651:1: ( ( ( rule__Function_designator__NameAssignment_0 ) ) )
            // InternalPascal.g:1652:1: ( ( rule__Function_designator__NameAssignment_0 ) )
            {
            // InternalPascal.g:1652:1: ( ( rule__Function_designator__NameAssignment_0 ) )
            // InternalPascal.g:1653:2: ( rule__Function_designator__NameAssignment_0 )
            {
             before(grammarAccess.getFunction_designatorAccess().getNameAssignment_0()); 
            // InternalPascal.g:1654:2: ( rule__Function_designator__NameAssignment_0 )
            // InternalPascal.g:1654:3: rule__Function_designator__NameAssignment_0
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
    // InternalPascal.g:1662:1: rule__Function_designator__Group__1 : rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 ;
    public final void rule__Function_designator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1666:1: ( rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 )
            // InternalPascal.g:1667:2: rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2
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
    // InternalPascal.g:1674:1: rule__Function_designator__Group__1__Impl : ( '(' ) ;
    public final void rule__Function_designator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1678:1: ( ( '(' ) )
            // InternalPascal.g:1679:1: ( '(' )
            {
            // InternalPascal.g:1679:1: ( '(' )
            // InternalPascal.g:1680:2: '('
            {
             before(grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPascal.g:1689:1: rule__Function_designator__Group__2 : rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 ;
    public final void rule__Function_designator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1693:1: ( rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 )
            // InternalPascal.g:1694:2: rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3
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
    // InternalPascal.g:1701:1: rule__Function_designator__Group__2__Impl : ( ( rule__Function_designator__ExpressionsAssignment_2 )? ) ;
    public final void rule__Function_designator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1705:1: ( ( ( rule__Function_designator__ExpressionsAssignment_2 )? ) )
            // InternalPascal.g:1706:1: ( ( rule__Function_designator__ExpressionsAssignment_2 )? )
            {
            // InternalPascal.g:1706:1: ( ( rule__Function_designator__ExpressionsAssignment_2 )? )
            // InternalPascal.g:1707:2: ( rule__Function_designator__ExpressionsAssignment_2 )?
            {
             before(grammarAccess.getFunction_designatorAccess().getExpressionsAssignment_2()); 
            // InternalPascal.g:1708:2: ( rule__Function_designator__ExpressionsAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||LA16_0==RULE_ADDITION_OP||(LA16_0>=RULE_STRING && LA16_0<=RULE_REAL_NUMBER)||LA16_0==24||LA16_0==28||LA16_0==30||(LA16_0>=38 && LA16_0<=40)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPascal.g:1708:3: rule__Function_designator__ExpressionsAssignment_2
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
    // InternalPascal.g:1716:1: rule__Function_designator__Group__3 : rule__Function_designator__Group__3__Impl ;
    public final void rule__Function_designator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1720:1: ( rule__Function_designator__Group__3__Impl )
            // InternalPascal.g:1721:2: rule__Function_designator__Group__3__Impl
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
    // InternalPascal.g:1727:1: rule__Function_designator__Group__3__Impl : ( ')' ) ;
    public final void rule__Function_designator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1731:1: ( ( ')' ) )
            // InternalPascal.g:1732:1: ( ')' )
            {
            // InternalPascal.g:1732:1: ( ')' )
            // InternalPascal.g:1733:2: ')'
            {
             before(grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPascal.g:1743:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1747:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // InternalPascal.g:1748:2: rule__Set__Group__0__Impl rule__Set__Group__1
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
    // InternalPascal.g:1755:1: rule__Set__Group__0__Impl : ( ( rule__Set__BracketsAssignment_0 ) ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1759:1: ( ( ( rule__Set__BracketsAssignment_0 ) ) )
            // InternalPascal.g:1760:1: ( ( rule__Set__BracketsAssignment_0 ) )
            {
            // InternalPascal.g:1760:1: ( ( rule__Set__BracketsAssignment_0 ) )
            // InternalPascal.g:1761:2: ( rule__Set__BracketsAssignment_0 )
            {
             before(grammarAccess.getSetAccess().getBracketsAssignment_0()); 
            // InternalPascal.g:1762:2: ( rule__Set__BracketsAssignment_0 )
            // InternalPascal.g:1762:3: rule__Set__BracketsAssignment_0
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
    // InternalPascal.g:1770:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1774:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // InternalPascal.g:1775:2: rule__Set__Group__1__Impl rule__Set__Group__2
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
    // InternalPascal.g:1782:1: rule__Set__Group__1__Impl : ( ( rule__Set__ExpressionsAssignment_1 )? ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1786:1: ( ( ( rule__Set__ExpressionsAssignment_1 )? ) )
            // InternalPascal.g:1787:1: ( ( rule__Set__ExpressionsAssignment_1 )? )
            {
            // InternalPascal.g:1787:1: ( ( rule__Set__ExpressionsAssignment_1 )? )
            // InternalPascal.g:1788:2: ( rule__Set__ExpressionsAssignment_1 )?
            {
             before(grammarAccess.getSetAccess().getExpressionsAssignment_1()); 
            // InternalPascal.g:1789:2: ( rule__Set__ExpressionsAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||LA17_0==RULE_ADDITION_OP||(LA17_0>=RULE_STRING && LA17_0<=RULE_REAL_NUMBER)||LA17_0==24||LA17_0==28||LA17_0==30||(LA17_0>=38 && LA17_0<=40)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPascal.g:1789:3: rule__Set__ExpressionsAssignment_1
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
    // InternalPascal.g:1797:1: rule__Set__Group__2 : rule__Set__Group__2__Impl ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1801:1: ( rule__Set__Group__2__Impl )
            // InternalPascal.g:1802:2: rule__Set__Group__2__Impl
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
    // InternalPascal.g:1808:1: rule__Set__Group__2__Impl : ( ( rule__Set__BracketsAssignment_2 ) ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1812:1: ( ( ( rule__Set__BracketsAssignment_2 ) ) )
            // InternalPascal.g:1813:1: ( ( rule__Set__BracketsAssignment_2 ) )
            {
            // InternalPascal.g:1813:1: ( ( rule__Set__BracketsAssignment_2 ) )
            // InternalPascal.g:1814:2: ( rule__Set__BracketsAssignment_2 )
            {
             before(grammarAccess.getSetAccess().getBracketsAssignment_2()); 
            // InternalPascal.g:1815:2: ( rule__Set__BracketsAssignment_2 )
            // InternalPascal.g:1815:3: rule__Set__BracketsAssignment_2
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
    // InternalPascal.g:1824:1: rule__Program__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1828:1: ( ( RULE_ID ) )
            // InternalPascal.g:1829:2: ( RULE_ID )
            {
            // InternalPascal.g:1829:2: ( RULE_ID )
            // InternalPascal.g:1830:3: RULE_ID
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


    // $ANTLR start "rule__Variable__NameAssignment_0"
    // InternalPascal.g:1839:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1843:1: ( ( RULE_ID ) )
            // InternalPascal.g:1844:2: ( RULE_ID )
            {
            // InternalPascal.g:1844:2: ( RULE_ID )
            // InternalPascal.g:1845:3: RULE_ID
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
    // InternalPascal.g:1854:1: rule__Variable__VariableAssignment_1 : ( rulevar_ ) ;
    public final void rule__Variable__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1858:1: ( ( rulevar_ ) )
            // InternalPascal.g:1859:2: ( rulevar_ )
            {
            // InternalPascal.g:1859:2: ( rulevar_ )
            // InternalPascal.g:1860:3: rulevar_
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
    // InternalPascal.g:1869:1: rule__Var___ExpressionsAssignment_0_1 : ( ruleexpression_list ) ;
    public final void rule__Var___ExpressionsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1873:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:1874:2: ( ruleexpression_list )
            {
            // InternalPascal.g:1874:2: ( ruleexpression_list )
            // InternalPascal.g:1875:3: ruleexpression_list
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
    // InternalPascal.g:1884:1: rule__Var___ArrayAssignment_0_3 : ( rulevar_ ) ;
    public final void rule__Var___ArrayAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1888:1: ( ( rulevar_ ) )
            // InternalPascal.g:1889:2: ( rulevar_ )
            {
            // InternalPascal.g:1889:2: ( rulevar_ )
            // InternalPascal.g:1890:3: rulevar_
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
    // InternalPascal.g:1899:1: rule__Var___AccessorAssignment_1_0 : ( ( '.' ) ) ;
    public final void rule__Var___AccessorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1903:1: ( ( ( '.' ) ) )
            // InternalPascal.g:1904:2: ( ( '.' ) )
            {
            // InternalPascal.g:1904:2: ( ( '.' ) )
            // InternalPascal.g:1905:3: ( '.' )
            {
             before(grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0()); 
            // InternalPascal.g:1906:3: ( '.' )
            // InternalPascal.g:1907:4: '.'
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
    // InternalPascal.g:1918:1: rule__Var___NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Var___NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1922:1: ( ( RULE_ID ) )
            // InternalPascal.g:1923:2: ( RULE_ID )
            {
            // InternalPascal.g:1923:2: ( RULE_ID )
            // InternalPascal.g:1924:3: RULE_ID
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
    // InternalPascal.g:1933:1: rule__Var___VariableAssignment_1_2 : ( rulevar_ ) ;
    public final void rule__Var___VariableAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1937:1: ( ( rulevar_ ) )
            // InternalPascal.g:1938:2: ( rulevar_ )
            {
            // InternalPascal.g:1938:2: ( rulevar_ )
            // InternalPascal.g:1939:3: rulevar_
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
    // InternalPascal.g:1948:1: rule__Var___PointerAssignment_2_1 : ( rulevar_ ) ;
    public final void rule__Var___PointerAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1952:1: ( ( rulevar_ ) )
            // InternalPascal.g:1953:2: ( rulevar_ )
            {
            // InternalPascal.g:1953:2: ( rulevar_ )
            // InternalPascal.g:1954:3: rulevar_
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
    // InternalPascal.g:1963:1: rule__Expression_list__ExpressionsAssignment_0 : ( ruleexpression ) ;
    public final void rule__Expression_list__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1967:1: ( ( ruleexpression ) )
            // InternalPascal.g:1968:2: ( ruleexpression )
            {
            // InternalPascal.g:1968:2: ( ruleexpression )
            // InternalPascal.g:1969:3: ruleexpression
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
    // InternalPascal.g:1978:1: rule__Expression_list__ExpressionsAssignment_1_1 : ( ruleexpression ) ;
    public final void rule__Expression_list__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1982:1: ( ( ruleexpression ) )
            // InternalPascal.g:1983:2: ( ruleexpression )
            {
            // InternalPascal.g:1983:2: ( ruleexpression )
            // InternalPascal.g:1984:3: ruleexpression
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
    // InternalPascal.g:1993:1: rule__Expression__ExpressionsAssignment_0 : ( rulesimple_expression ) ;
    public final void rule__Expression__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1997:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:1998:2: ( rulesimple_expression )
            {
            // InternalPascal.g:1998:2: ( rulesimple_expression )
            // InternalPascal.g:1999:3: rulesimple_expression
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
    // InternalPascal.g:2008:1: rule__Expression__OperatorsAssignment_1_0_0 : ( RULE_RELATIONAL_OP ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2012:1: ( ( RULE_RELATIONAL_OP ) )
            // InternalPascal.g:2013:2: ( RULE_RELATIONAL_OP )
            {
            // InternalPascal.g:2013:2: ( RULE_RELATIONAL_OP )
            // InternalPascal.g:2014:3: RULE_RELATIONAL_OP
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
    // InternalPascal.g:2023:1: rule__Expression__OperatorsAssignment_1_0_1 : ( ( 'in' ) ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2027:1: ( ( ( 'in' ) ) )
            // InternalPascal.g:2028:2: ( ( 'in' ) )
            {
            // InternalPascal.g:2028:2: ( ( 'in' ) )
            // InternalPascal.g:2029:3: ( 'in' )
            {
             before(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 
            // InternalPascal.g:2030:3: ( 'in' )
            // InternalPascal.g:2031:4: 'in'
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
    // InternalPascal.g:2042:1: rule__Expression__OperatorsAssignment_1_0_2 : ( ( '=' ) ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2046:1: ( ( ( '=' ) ) )
            // InternalPascal.g:2047:2: ( ( '=' ) )
            {
            // InternalPascal.g:2047:2: ( ( '=' ) )
            // InternalPascal.g:2048:3: ( '=' )
            {
             before(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 
            // InternalPascal.g:2049:3: ( '=' )
            // InternalPascal.g:2050:4: '='
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
    // InternalPascal.g:2061:1: rule__Expression__ExpressionsAssignment_1_1 : ( rulesimple_expression ) ;
    public final void rule__Expression__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2065:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:2066:2: ( rulesimple_expression )
            {
            // InternalPascal.g:2066:2: ( rulesimple_expression )
            // InternalPascal.g:2067:3: rulesimple_expression
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
    // InternalPascal.g:2076:1: rule__Simple_expression__PrefixOperatorAssignment_0 : ( RULE_ADDITION_OP ) ;
    public final void rule__Simple_expression__PrefixOperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2080:1: ( ( RULE_ADDITION_OP ) )
            // InternalPascal.g:2081:2: ( RULE_ADDITION_OP )
            {
            // InternalPascal.g:2081:2: ( RULE_ADDITION_OP )
            // InternalPascal.g:2082:3: RULE_ADDITION_OP
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
    // InternalPascal.g:2091:1: rule__Simple_expression__TermsAssignment_1 : ( ruleterm ) ;
    public final void rule__Simple_expression__TermsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2095:1: ( ( ruleterm ) )
            // InternalPascal.g:2096:2: ( ruleterm )
            {
            // InternalPascal.g:2096:2: ( ruleterm )
            // InternalPascal.g:2097:3: ruleterm
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
    // InternalPascal.g:2106:1: rule__Simple_expression__OperatorsAssignment_2_0_0_0 : ( RULE_ADDITION_OP ) ;
    public final void rule__Simple_expression__OperatorsAssignment_2_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2110:1: ( ( RULE_ADDITION_OP ) )
            // InternalPascal.g:2111:2: ( RULE_ADDITION_OP )
            {
            // InternalPascal.g:2111:2: ( RULE_ADDITION_OP )
            // InternalPascal.g:2112:3: RULE_ADDITION_OP
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
    // InternalPascal.g:2121:1: rule__Simple_expression__OperatorsAssignment_2_0_0_1 : ( ( 'or' ) ) ;
    public final void rule__Simple_expression__OperatorsAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2125:1: ( ( ( 'or' ) ) )
            // InternalPascal.g:2126:2: ( ( 'or' ) )
            {
            // InternalPascal.g:2126:2: ( ( 'or' ) )
            // InternalPascal.g:2127:3: ( 'or' )
            {
             before(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 
            // InternalPascal.g:2128:3: ( 'or' )
            // InternalPascal.g:2129:4: 'or'
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
    // InternalPascal.g:2140:1: rule__Simple_expression__TermsAssignment_2_0_1 : ( ruleterm ) ;
    public final void rule__Simple_expression__TermsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2144:1: ( ( ruleterm ) )
            // InternalPascal.g:2145:2: ( ruleterm )
            {
            // InternalPascal.g:2145:2: ( ruleterm )
            // InternalPascal.g:2146:3: ruleterm
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
    // InternalPascal.g:2155:1: rule__Simple_expression__TermsAssignment_2_1 : ( ruleunsigned_number ) ;
    public final void rule__Simple_expression__TermsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2159:1: ( ( ruleunsigned_number ) )
            // InternalPascal.g:2160:2: ( ruleunsigned_number )
            {
            // InternalPascal.g:2160:2: ( ruleunsigned_number )
            // InternalPascal.g:2161:3: ruleunsigned_number
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
    // InternalPascal.g:2170:1: rule__Term__FactorsAssignment_0 : ( rulefactor ) ;
    public final void rule__Term__FactorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2174:1: ( ( rulefactor ) )
            // InternalPascal.g:2175:2: ( rulefactor )
            {
            // InternalPascal.g:2175:2: ( rulefactor )
            // InternalPascal.g:2176:3: rulefactor
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
    // InternalPascal.g:2185:1: rule__Term__OperatorsAssignment_1_0_0 : ( RULE_MULTIPLICATION_OP ) ;
    public final void rule__Term__OperatorsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2189:1: ( ( RULE_MULTIPLICATION_OP ) )
            // InternalPascal.g:2190:2: ( RULE_MULTIPLICATION_OP )
            {
            // InternalPascal.g:2190:2: ( RULE_MULTIPLICATION_OP )
            // InternalPascal.g:2191:3: RULE_MULTIPLICATION_OP
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
    // InternalPascal.g:2200:1: rule__Term__OperatorsAssignment_1_0_1 : ( ( 'div' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2204:1: ( ( ( 'div' ) ) )
            // InternalPascal.g:2205:2: ( ( 'div' ) )
            {
            // InternalPascal.g:2205:2: ( ( 'div' ) )
            // InternalPascal.g:2206:3: ( 'div' )
            {
             before(grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0()); 
            // InternalPascal.g:2207:3: ( 'div' )
            // InternalPascal.g:2208:4: 'div'
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
    // InternalPascal.g:2219:1: rule__Term__OperatorsAssignment_1_0_2 : ( ( 'mod' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2223:1: ( ( ( 'mod' ) ) )
            // InternalPascal.g:2224:2: ( ( 'mod' ) )
            {
            // InternalPascal.g:2224:2: ( ( 'mod' ) )
            // InternalPascal.g:2225:3: ( 'mod' )
            {
             before(grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0()); 
            // InternalPascal.g:2226:3: ( 'mod' )
            // InternalPascal.g:2227:4: 'mod'
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
    // InternalPascal.g:2238:1: rule__Term__OperatorsAssignment_1_0_3 : ( ( 'and' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2242:1: ( ( ( 'and' ) ) )
            // InternalPascal.g:2243:2: ( ( 'and' ) )
            {
            // InternalPascal.g:2243:2: ( ( 'and' ) )
            // InternalPascal.g:2244:3: ( 'and' )
            {
             before(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0()); 
            // InternalPascal.g:2245:3: ( 'and' )
            // InternalPascal.g:2246:4: 'and'
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
    // InternalPascal.g:2257:1: rule__Term__FactorsAssignment_1_1 : ( rulefactor ) ;
    public final void rule__Term__FactorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2261:1: ( ( rulefactor ) )
            // InternalPascal.g:2262:2: ( rulefactor )
            {
            // InternalPascal.g:2262:2: ( rulefactor )
            // InternalPascal.g:2263:3: rulefactor
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
    // InternalPascal.g:2272:1: rule__Factor__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Factor__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2276:1: ( ( rulevariable ) )
            // InternalPascal.g:2277:2: ( rulevariable )
            {
            // InternalPascal.g:2277:2: ( rulevariable )
            // InternalPascal.g:2278:3: rulevariable
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
    // InternalPascal.g:2287:1: rule__Factor__NumberAssignment_1 : ( rulenumber ) ;
    public final void rule__Factor__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2291:1: ( ( rulenumber ) )
            // InternalPascal.g:2292:2: ( rulenumber )
            {
            // InternalPascal.g:2292:2: ( rulenumber )
            // InternalPascal.g:2293:3: rulenumber
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
    // InternalPascal.g:2302:1: rule__Factor__StringAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Factor__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2306:1: ( ( RULE_STRING ) )
            // InternalPascal.g:2307:2: ( RULE_STRING )
            {
            // InternalPascal.g:2307:2: ( RULE_STRING )
            // InternalPascal.g:2308:3: RULE_STRING
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
    // InternalPascal.g:2317:1: rule__Factor__SetAssignment_3 : ( ruleset ) ;
    public final void rule__Factor__SetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2321:1: ( ( ruleset ) )
            // InternalPascal.g:2322:2: ( ruleset )
            {
            // InternalPascal.g:2322:2: ( ruleset )
            // InternalPascal.g:2323:3: ruleset
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
    // InternalPascal.g:2332:1: rule__Factor__NilAssignment_4 : ( ( 'nil' ) ) ;
    public final void rule__Factor__NilAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2336:1: ( ( ( 'nil' ) ) )
            // InternalPascal.g:2337:2: ( ( 'nil' ) )
            {
            // InternalPascal.g:2337:2: ( ( 'nil' ) )
            // InternalPascal.g:2338:3: ( 'nil' )
            {
             before(grammarAccess.getFactorAccess().getNilNilKeyword_4_0()); 
            // InternalPascal.g:2339:3: ( 'nil' )
            // InternalPascal.g:2340:4: 'nil'
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
    // InternalPascal.g:2351:1: rule__Factor__BooleanAssignment_5 : ( ( 'true' ) ) ;
    public final void rule__Factor__BooleanAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2355:1: ( ( ( 'true' ) ) )
            // InternalPascal.g:2356:2: ( ( 'true' ) )
            {
            // InternalPascal.g:2356:2: ( ( 'true' ) )
            // InternalPascal.g:2357:3: ( 'true' )
            {
             before(grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0()); 
            // InternalPascal.g:2358:3: ( 'true' )
            // InternalPascal.g:2359:4: 'true'
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
    // InternalPascal.g:2370:1: rule__Factor__BooleanAssignment_6 : ( ( 'false' ) ) ;
    public final void rule__Factor__BooleanAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2374:1: ( ( ( 'false' ) ) )
            // InternalPascal.g:2375:2: ( ( 'false' ) )
            {
            // InternalPascal.g:2375:2: ( ( 'false' ) )
            // InternalPascal.g:2376:3: ( 'false' )
            {
             before(grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0()); 
            // InternalPascal.g:2377:3: ( 'false' )
            // InternalPascal.g:2378:4: 'false'
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
    // InternalPascal.g:2389:1: rule__Factor__FunctionAssignment_7 : ( rulefunction_designator ) ;
    public final void rule__Factor__FunctionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2393:1: ( ( rulefunction_designator ) )
            // InternalPascal.g:2394:2: ( rulefunction_designator )
            {
            // InternalPascal.g:2394:2: ( rulefunction_designator )
            // InternalPascal.g:2395:3: rulefunction_designator
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
    // InternalPascal.g:2404:1: rule__Factor__ExpressionAssignment_8_1 : ( ruleexpression ) ;
    public final void rule__Factor__ExpressionAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2408:1: ( ( ruleexpression ) )
            // InternalPascal.g:2409:2: ( ruleexpression )
            {
            // InternalPascal.g:2409:2: ( ruleexpression )
            // InternalPascal.g:2410:3: ruleexpression
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
    // InternalPascal.g:2419:1: rule__Factor__NotAssignment_9_1 : ( rulefactor ) ;
    public final void rule__Factor__NotAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2423:1: ( ( rulefactor ) )
            // InternalPascal.g:2424:2: ( rulefactor )
            {
            // InternalPascal.g:2424:2: ( rulefactor )
            // InternalPascal.g:2425:3: rulefactor
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
    // InternalPascal.g:2434:1: rule__Function_designator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Function_designator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2438:1: ( ( RULE_ID ) )
            // InternalPascal.g:2439:2: ( RULE_ID )
            {
            // InternalPascal.g:2439:2: ( RULE_ID )
            // InternalPascal.g:2440:3: RULE_ID
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
    // InternalPascal.g:2449:1: rule__Function_designator__ExpressionsAssignment_2 : ( ruleexpression_list ) ;
    public final void rule__Function_designator__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2453:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:2454:2: ( ruleexpression_list )
            {
            // InternalPascal.g:2454:2: ( ruleexpression_list )
            // InternalPascal.g:2455:3: ruleexpression_list
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
    // InternalPascal.g:2464:1: rule__Set__BracketsAssignment_0 : ( ( '[' ) ) ;
    public final void rule__Set__BracketsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2468:1: ( ( ( '[' ) ) )
            // InternalPascal.g:2469:2: ( ( '[' ) )
            {
            // InternalPascal.g:2469:2: ( ( '[' ) )
            // InternalPascal.g:2470:3: ( '[' )
            {
             before(grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0()); 
            // InternalPascal.g:2471:3: ( '[' )
            // InternalPascal.g:2472:4: '['
            {
             before(grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalPascal.g:2483:1: rule__Set__ExpressionsAssignment_1 : ( ruleexpression_list ) ;
    public final void rule__Set__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2487:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:2488:2: ( ruleexpression_list )
            {
            // InternalPascal.g:2488:2: ( ruleexpression_list )
            // InternalPascal.g:2489:3: ruleexpression_list
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
    // InternalPascal.g:2498:1: rule__Set__BracketsAssignment_2 : ( ( ']' ) ) ;
    public final void rule__Set__BracketsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2502:1: ( ( ( ']' ) ) )
            // InternalPascal.g:2503:2: ( ( ']' ) )
            {
            // InternalPascal.g:2503:2: ( ( ']' ) )
            // InternalPascal.g:2504:3: ( ']' )
            {
             before(grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0()); 
            // InternalPascal.g:2505:3: ( ']' )
            // InternalPascal.g:2506:4: ']'
            {
             before(grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalPascal.g:2517:1: rule__Number__NumberAssignment : ( ruleany_number ) ;
    public final void rule__Number__NumberAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2521:1: ( ( ruleany_number ) )
            // InternalPascal.g:2522:2: ( ruleany_number )
            {
            // InternalPascal.g:2522:2: ( ruleany_number )
            // InternalPascal.g:2523:3: ruleany_number
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
    // InternalPascal.g:2532:1: rule__Signed_number__IntegerAssignment_0 : ( RULE_SIGNED_INTEGER_NUMBER ) ;
    public final void rule__Signed_number__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2536:1: ( ( RULE_SIGNED_INTEGER_NUMBER ) )
            // InternalPascal.g:2537:2: ( RULE_SIGNED_INTEGER_NUMBER )
            {
            // InternalPascal.g:2537:2: ( RULE_SIGNED_INTEGER_NUMBER )
            // InternalPascal.g:2538:3: RULE_SIGNED_INTEGER_NUMBER
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
    // InternalPascal.g:2547:1: rule__Signed_number__RealAssignment_1 : ( RULE_SIGNED_REAL_NUMBER ) ;
    public final void rule__Signed_number__RealAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2551:1: ( ( RULE_SIGNED_REAL_NUMBER ) )
            // InternalPascal.g:2552:2: ( RULE_SIGNED_REAL_NUMBER )
            {
            // InternalPascal.g:2552:2: ( RULE_SIGNED_REAL_NUMBER )
            // InternalPascal.g:2553:3: RULE_SIGNED_REAL_NUMBER
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
    // InternalPascal.g:2562:1: rule__Unsigned_number__IntegerAssignment_0 : ( RULE_INTEGER_NUMBER ) ;
    public final void rule__Unsigned_number__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2566:1: ( ( RULE_INTEGER_NUMBER ) )
            // InternalPascal.g:2567:2: ( RULE_INTEGER_NUMBER )
            {
            // InternalPascal.g:2567:2: ( RULE_INTEGER_NUMBER )
            // InternalPascal.g:2568:3: RULE_INTEGER_NUMBER
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
    // InternalPascal.g:2577:1: rule__Unsigned_number__RealAssignment_1 : ( RULE_REAL_NUMBER ) ;
    public final void rule__Unsigned_number__RealAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2581:1: ( ( RULE_REAL_NUMBER ) )
            // InternalPascal.g:2582:2: ( RULE_REAL_NUMBER )
            {
            // InternalPascal.g:2582:2: ( RULE_REAL_NUMBER )
            // InternalPascal.g:2583:3: RULE_REAL_NUMBER
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
    static final String dfa_2s = "\1\uffff\1\12\12\uffff";
    static final String dfa_3s = "\1\4\1\5\12\uffff";
    static final String dfa_4s = "\1\50\1\45\12\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\1\1\10";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\3\uffff\1\3\4\2\13\uffff\1\4\3\uffff\1\10\1\uffff\1\11\7\uffff\1\5\1\6\1\7",
            "\3\12\3\uffff\2\12\13\uffff\4\12\1\13\1\12\1\uffff\7\12",
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
            return "531:1: rule__Factor__Alternatives : ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__FunctionAssignment_7 ) ) | ( ( rule__Factor__Group_8__0 ) ) | ( ( rule__Factor__Group_9__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000085000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000001C051001F50L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000300000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400001840L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400001842L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000003800000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000003800000082L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000001C071001F50L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000001C053001F50L});

}