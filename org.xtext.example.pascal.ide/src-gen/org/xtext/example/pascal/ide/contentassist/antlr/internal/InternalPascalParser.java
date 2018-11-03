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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SIGNED_INTEGER_NUMBER", "RULE_INTEGER_NUMBER", "RULE_RELATIONAL_OP", "RULE_ADDITION_OP", "RULE_MULTIPLICATION_OP", "RULE_STRING", "RULE_NUMERIC_SUBRANGE", "RULE_SIGNED_REAL_NUMBER", "RULE_REAL_NUMBER", "RULE_PARENTHESES_COMMENT", "RULE_CURLY_BRACKETS_COMMENT", "RULE_DIGIT_SEQUENCE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "';'", "'begin'", "'end'", "':'", "':='", "'['", "']'", "'^'", "','", "'('", "')'", "'not'", "'function'", "'var'", "'procedure'", "'label'", "'const'", "'='", "'type'", "'..'", "'set'", "'of'", "'in'", "'or'", "'div'", "'mod'", "'and'", "'nil'", "'true'", "'false'", "'packed'"
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



    // $ANTLR start "entryRulepascal"
    // InternalPascal.g:53:1: entryRulepascal : rulepascal EOF ;
    public final void entryRulepascal() throws RecognitionException {
        try {
            // InternalPascal.g:54:1: ( rulepascal EOF )
            // InternalPascal.g:55:1: rulepascal EOF
            {
             before(grammarAccess.getPascalRule()); 
            pushFollow(FOLLOW_1);
            rulepascal();

            state._fsp--;

             after(grammarAccess.getPascalRule()); 
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
    // $ANTLR end "entryRulepascal"


    // $ANTLR start "rulepascal"
    // InternalPascal.g:62:1: rulepascal : ( ( rule__Pascal__ProgramAssignment ) ) ;
    public final void rulepascal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:66:2: ( ( ( rule__Pascal__ProgramAssignment ) ) )
            // InternalPascal.g:67:2: ( ( rule__Pascal__ProgramAssignment ) )
            {
            // InternalPascal.g:67:2: ( ( rule__Pascal__ProgramAssignment ) )
            // InternalPascal.g:68:3: ( rule__Pascal__ProgramAssignment )
            {
             before(grammarAccess.getPascalAccess().getProgramAssignment()); 
            // InternalPascal.g:69:3: ( rule__Pascal__ProgramAssignment )
            // InternalPascal.g:69:4: rule__Pascal__ProgramAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Pascal__ProgramAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPascalAccess().getProgramAssignment()); 

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
    // $ANTLR end "rulepascal"


    // $ANTLR start "entryRuleprogram"
    // InternalPascal.g:78:1: entryRuleprogram : ruleprogram EOF ;
    public final void entryRuleprogram() throws RecognitionException {
        try {
            // InternalPascal.g:79:1: ( ruleprogram EOF )
            // InternalPascal.g:80:1: ruleprogram EOF
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
    // InternalPascal.g:87:1: ruleprogram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleprogram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:91:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalPascal.g:92:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalPascal.g:92:2: ( ( rule__Program__Group__0 ) )
            // InternalPascal.g:93:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalPascal.g:94:3: ( rule__Program__Group__0 )
            // InternalPascal.g:94:4: rule__Program__Group__0
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


    // $ANTLR start "entryRuleprogram_heading_block"
    // InternalPascal.g:103:1: entryRuleprogram_heading_block : ruleprogram_heading_block EOF ;
    public final void entryRuleprogram_heading_block() throws RecognitionException {
        try {
            // InternalPascal.g:104:1: ( ruleprogram_heading_block EOF )
            // InternalPascal.g:105:1: ruleprogram_heading_block EOF
            {
             before(grammarAccess.getProgram_heading_blockRule()); 
            pushFollow(FOLLOW_1);
            ruleprogram_heading_block();

            state._fsp--;

             after(grammarAccess.getProgram_heading_blockRule()); 
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
    // $ANTLR end "entryRuleprogram_heading_block"


    // $ANTLR start "ruleprogram_heading_block"
    // InternalPascal.g:112:1: ruleprogram_heading_block : ( ( rule__Program_heading_block__Group__0 ) ) ;
    public final void ruleprogram_heading_block() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:116:2: ( ( ( rule__Program_heading_block__Group__0 ) ) )
            // InternalPascal.g:117:2: ( ( rule__Program_heading_block__Group__0 ) )
            {
            // InternalPascal.g:117:2: ( ( rule__Program_heading_block__Group__0 ) )
            // InternalPascal.g:118:3: ( rule__Program_heading_block__Group__0 )
            {
             before(grammarAccess.getProgram_heading_blockAccess().getGroup()); 
            // InternalPascal.g:119:3: ( rule__Program_heading_block__Group__0 )
            // InternalPascal.g:119:4: rule__Program_heading_block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgram_heading_blockAccess().getGroup()); 

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
    // $ANTLR end "ruleprogram_heading_block"


    // $ANTLR start "entryRuleblock"
    // InternalPascal.g:128:1: entryRuleblock : ruleblock EOF ;
    public final void entryRuleblock() throws RecognitionException {
        try {
            // InternalPascal.g:129:1: ( ruleblock EOF )
            // InternalPascal.g:130:1: ruleblock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleblock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
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
    // $ANTLR end "entryRuleblock"


    // $ANTLR start "ruleblock"
    // InternalPascal.g:137:1: ruleblock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleblock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:141:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalPascal.g:142:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalPascal.g:142:2: ( ( rule__Block__Group__0 ) )
            // InternalPascal.g:143:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalPascal.g:144:3: ( rule__Block__Group__0 )
            // InternalPascal.g:144:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRulestatement_part"
    // InternalPascal.g:153:1: entryRulestatement_part : rulestatement_part EOF ;
    public final void entryRulestatement_part() throws RecognitionException {
        try {
            // InternalPascal.g:154:1: ( rulestatement_part EOF )
            // InternalPascal.g:155:1: rulestatement_part EOF
            {
             before(grammarAccess.getStatement_partRule()); 
            pushFollow(FOLLOW_1);
            rulestatement_part();

            state._fsp--;

             after(grammarAccess.getStatement_partRule()); 
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
    // $ANTLR end "entryRulestatement_part"


    // $ANTLR start "rulestatement_part"
    // InternalPascal.g:162:1: rulestatement_part : ( ( rule__Statement_part__Group__0 ) ) ;
    public final void rulestatement_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:166:2: ( ( ( rule__Statement_part__Group__0 ) ) )
            // InternalPascal.g:167:2: ( ( rule__Statement_part__Group__0 ) )
            {
            // InternalPascal.g:167:2: ( ( rule__Statement_part__Group__0 ) )
            // InternalPascal.g:168:3: ( rule__Statement_part__Group__0 )
            {
             before(grammarAccess.getStatement_partAccess().getGroup()); 
            // InternalPascal.g:169:3: ( rule__Statement_part__Group__0 )
            // InternalPascal.g:169:4: rule__Statement_part__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatement_partAccess().getGroup()); 

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
    // $ANTLR end "rulestatement_part"


    // $ANTLR start "entryRulestatement_sequence"
    // InternalPascal.g:178:1: entryRulestatement_sequence : rulestatement_sequence EOF ;
    public final void entryRulestatement_sequence() throws RecognitionException {
        try {
            // InternalPascal.g:179:1: ( rulestatement_sequence EOF )
            // InternalPascal.g:180:1: rulestatement_sequence EOF
            {
             before(grammarAccess.getStatement_sequenceRule()); 
            pushFollow(FOLLOW_1);
            rulestatement_sequence();

            state._fsp--;

             after(grammarAccess.getStatement_sequenceRule()); 
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
    // $ANTLR end "entryRulestatement_sequence"


    // $ANTLR start "rulestatement_sequence"
    // InternalPascal.g:187:1: rulestatement_sequence : ( ( rule__Statement_sequence__Group__0 ) ) ;
    public final void rulestatement_sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:191:2: ( ( ( rule__Statement_sequence__Group__0 ) ) )
            // InternalPascal.g:192:2: ( ( rule__Statement_sequence__Group__0 ) )
            {
            // InternalPascal.g:192:2: ( ( rule__Statement_sequence__Group__0 ) )
            // InternalPascal.g:193:3: ( rule__Statement_sequence__Group__0 )
            {
             before(grammarAccess.getStatement_sequenceAccess().getGroup()); 
            // InternalPascal.g:194:3: ( rule__Statement_sequence__Group__0 )
            // InternalPascal.g:194:4: rule__Statement_sequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement_sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatement_sequenceAccess().getGroup()); 

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
    // $ANTLR end "rulestatement_sequence"


    // $ANTLR start "entryRulestatement"
    // InternalPascal.g:203:1: entryRulestatement : rulestatement EOF ;
    public final void entryRulestatement() throws RecognitionException {
        try {
            // InternalPascal.g:204:1: ( rulestatement EOF )
            // InternalPascal.g:205:1: rulestatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // InternalPascal.g:212:1: rulestatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void rulestatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:216:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalPascal.g:217:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalPascal.g:217:2: ( ( rule__Statement__Group__0 ) )
            // InternalPascal.g:218:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalPascal.g:219:3: ( rule__Statement__Group__0 )
            // InternalPascal.g:219:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

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
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulesimple_statement"
    // InternalPascal.g:228:1: entryRulesimple_statement : rulesimple_statement EOF ;
    public final void entryRulesimple_statement() throws RecognitionException {
        try {
            // InternalPascal.g:229:1: ( rulesimple_statement EOF )
            // InternalPascal.g:230:1: rulesimple_statement EOF
            {
             before(grammarAccess.getSimple_statementRule()); 
            pushFollow(FOLLOW_1);
            rulesimple_statement();

            state._fsp--;

             after(grammarAccess.getSimple_statementRule()); 
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
    // $ANTLR end "entryRulesimple_statement"


    // $ANTLR start "rulesimple_statement"
    // InternalPascal.g:237:1: rulesimple_statement : ( ( rule__Simple_statement__Alternatives )? ) ;
    public final void rulesimple_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:241:2: ( ( ( rule__Simple_statement__Alternatives )? ) )
            // InternalPascal.g:242:2: ( ( rule__Simple_statement__Alternatives )? )
            {
            // InternalPascal.g:242:2: ( ( rule__Simple_statement__Alternatives )? )
            // InternalPascal.g:243:3: ( rule__Simple_statement__Alternatives )?
            {
             before(grammarAccess.getSimple_statementAccess().getAlternatives()); 
            // InternalPascal.g:244:3: ( rule__Simple_statement__Alternatives )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:244:4: rule__Simple_statement__Alternatives
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_statement__Alternatives();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimple_statementAccess().getAlternatives()); 

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
    // $ANTLR end "rulesimple_statement"


    // $ANTLR start "entryRuleassignment_statement"
    // InternalPascal.g:253:1: entryRuleassignment_statement : ruleassignment_statement EOF ;
    public final void entryRuleassignment_statement() throws RecognitionException {
        try {
            // InternalPascal.g:254:1: ( ruleassignment_statement EOF )
            // InternalPascal.g:255:1: ruleassignment_statement EOF
            {
             before(grammarAccess.getAssignment_statementRule()); 
            pushFollow(FOLLOW_1);
            ruleassignment_statement();

            state._fsp--;

             after(grammarAccess.getAssignment_statementRule()); 
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
    // $ANTLR end "entryRuleassignment_statement"


    // $ANTLR start "ruleassignment_statement"
    // InternalPascal.g:262:1: ruleassignment_statement : ( ( rule__Assignment_statement__Group__0 ) ) ;
    public final void ruleassignment_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:266:2: ( ( ( rule__Assignment_statement__Group__0 ) ) )
            // InternalPascal.g:267:2: ( ( rule__Assignment_statement__Group__0 ) )
            {
            // InternalPascal.g:267:2: ( ( rule__Assignment_statement__Group__0 ) )
            // InternalPascal.g:268:3: ( rule__Assignment_statement__Group__0 )
            {
             before(grammarAccess.getAssignment_statementAccess().getGroup()); 
            // InternalPascal.g:269:3: ( rule__Assignment_statement__Group__0 )
            // InternalPascal.g:269:4: rule__Assignment_statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment_statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignment_statementAccess().getGroup()); 

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
    // $ANTLR end "ruleassignment_statement"


    // $ANTLR start "entryRulelabel"
    // InternalPascal.g:278:1: entryRulelabel : rulelabel EOF ;
    public final void entryRulelabel() throws RecognitionException {
        try {
            // InternalPascal.g:279:1: ( rulelabel EOF )
            // InternalPascal.g:280:1: rulelabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            rulelabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
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
    // $ANTLR end "entryRulelabel"


    // $ANTLR start "rulelabel"
    // InternalPascal.g:287:1: rulelabel : ( ( rule__Label__Alternatives ) ) ;
    public final void rulelabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:291:2: ( ( ( rule__Label__Alternatives ) ) )
            // InternalPascal.g:292:2: ( ( rule__Label__Alternatives ) )
            {
            // InternalPascal.g:292:2: ( ( rule__Label__Alternatives ) )
            // InternalPascal.g:293:3: ( rule__Label__Alternatives )
            {
             before(grammarAccess.getLabelAccess().getAlternatives()); 
            // InternalPascal.g:294:3: ( rule__Label__Alternatives )
            // InternalPascal.g:294:4: rule__Label__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Label__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getAlternatives()); 

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
    // $ANTLR end "rulelabel"


    // $ANTLR start "entryRulevariable"
    // InternalPascal.g:303:1: entryRulevariable : rulevariable EOF ;
    public final void entryRulevariable() throws RecognitionException {
        try {
            // InternalPascal.g:304:1: ( rulevariable EOF )
            // InternalPascal.g:305:1: rulevariable EOF
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
    // InternalPascal.g:312:1: rulevariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void rulevariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:316:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalPascal.g:317:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalPascal.g:317:2: ( ( rule__Variable__Group__0 ) )
            // InternalPascal.g:318:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalPascal.g:319:3: ( rule__Variable__Group__0 )
            // InternalPascal.g:319:4: rule__Variable__Group__0
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
    // InternalPascal.g:328:1: entryRulevar_ : rulevar_ EOF ;
    public final void entryRulevar_() throws RecognitionException {
        try {
            // InternalPascal.g:329:1: ( rulevar_ EOF )
            // InternalPascal.g:330:1: rulevar_ EOF
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
    // InternalPascal.g:337:1: rulevar_ : ( ( rule__Var___Alternatives )? ) ;
    public final void rulevar_() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:341:2: ( ( ( rule__Var___Alternatives )? ) )
            // InternalPascal.g:342:2: ( ( rule__Var___Alternatives )? )
            {
            // InternalPascal.g:342:2: ( ( rule__Var___Alternatives )? )
            // InternalPascal.g:343:3: ( rule__Var___Alternatives )?
            {
             before(grammarAccess.getVar_Access().getAlternatives()); 
            // InternalPascal.g:344:3: ( rule__Var___Alternatives )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22||LA2_0==29||LA2_0==31) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPascal.g:344:4: rule__Var___Alternatives
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
    // InternalPascal.g:353:1: entryRuleexpression_list : ruleexpression_list EOF ;
    public final void entryRuleexpression_list() throws RecognitionException {
        try {
            // InternalPascal.g:354:1: ( ruleexpression_list EOF )
            // InternalPascal.g:355:1: ruleexpression_list EOF
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
    // InternalPascal.g:362:1: ruleexpression_list : ( ( rule__Expression_list__Group__0 ) ) ;
    public final void ruleexpression_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:366:2: ( ( ( rule__Expression_list__Group__0 ) ) )
            // InternalPascal.g:367:2: ( ( rule__Expression_list__Group__0 ) )
            {
            // InternalPascal.g:367:2: ( ( rule__Expression_list__Group__0 ) )
            // InternalPascal.g:368:3: ( rule__Expression_list__Group__0 )
            {
             before(grammarAccess.getExpression_listAccess().getGroup()); 
            // InternalPascal.g:369:3: ( rule__Expression_list__Group__0 )
            // InternalPascal.g:369:4: rule__Expression_list__Group__0
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
    // InternalPascal.g:378:1: entryRuleexpression : ruleexpression EOF ;
    public final void entryRuleexpression() throws RecognitionException {
        try {
            // InternalPascal.g:379:1: ( ruleexpression EOF )
            // InternalPascal.g:380:1: ruleexpression EOF
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
    // InternalPascal.g:387:1: ruleexpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleexpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:391:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalPascal.g:392:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalPascal.g:392:2: ( ( rule__Expression__Group__0 ) )
            // InternalPascal.g:393:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalPascal.g:394:3: ( rule__Expression__Group__0 )
            // InternalPascal.g:394:4: rule__Expression__Group__0
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
    // InternalPascal.g:403:1: entryRulesimple_expression : rulesimple_expression EOF ;
    public final void entryRulesimple_expression() throws RecognitionException {
        try {
            // InternalPascal.g:404:1: ( rulesimple_expression EOF )
            // InternalPascal.g:405:1: rulesimple_expression EOF
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
    // InternalPascal.g:412:1: rulesimple_expression : ( ( rule__Simple_expression__Group__0 ) ) ;
    public final void rulesimple_expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:416:2: ( ( ( rule__Simple_expression__Group__0 ) ) )
            // InternalPascal.g:417:2: ( ( rule__Simple_expression__Group__0 ) )
            {
            // InternalPascal.g:417:2: ( ( rule__Simple_expression__Group__0 ) )
            // InternalPascal.g:418:3: ( rule__Simple_expression__Group__0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getGroup()); 
            // InternalPascal.g:419:3: ( rule__Simple_expression__Group__0 )
            // InternalPascal.g:419:4: rule__Simple_expression__Group__0
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
    // InternalPascal.g:428:1: entryRuleterm : ruleterm EOF ;
    public final void entryRuleterm() throws RecognitionException {
        try {
            // InternalPascal.g:429:1: ( ruleterm EOF )
            // InternalPascal.g:430:1: ruleterm EOF
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
    // InternalPascal.g:437:1: ruleterm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleterm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:441:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalPascal.g:442:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalPascal.g:442:2: ( ( rule__Term__Group__0 ) )
            // InternalPascal.g:443:3: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // InternalPascal.g:444:3: ( rule__Term__Group__0 )
            // InternalPascal.g:444:4: rule__Term__Group__0
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
    // InternalPascal.g:453:1: entryRulefactor : rulefactor EOF ;
    public final void entryRulefactor() throws RecognitionException {
        try {
            // InternalPascal.g:454:1: ( rulefactor EOF )
            // InternalPascal.g:455:1: rulefactor EOF
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
    // InternalPascal.g:462:1: rulefactor : ( ( rule__Factor__Alternatives ) ) ;
    public final void rulefactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:466:2: ( ( ( rule__Factor__Alternatives ) ) )
            // InternalPascal.g:467:2: ( ( rule__Factor__Alternatives ) )
            {
            // InternalPascal.g:467:2: ( ( rule__Factor__Alternatives ) )
            // InternalPascal.g:468:3: ( rule__Factor__Alternatives )
            {
             before(grammarAccess.getFactorAccess().getAlternatives()); 
            // InternalPascal.g:469:3: ( rule__Factor__Alternatives )
            // InternalPascal.g:469:4: rule__Factor__Alternatives
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
    // InternalPascal.g:478:1: entryRulefunction_designator : rulefunction_designator EOF ;
    public final void entryRulefunction_designator() throws RecognitionException {
        try {
            // InternalPascal.g:479:1: ( rulefunction_designator EOF )
            // InternalPascal.g:480:1: rulefunction_designator EOF
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
    // InternalPascal.g:487:1: rulefunction_designator : ( ( rule__Function_designator__Group__0 ) ) ;
    public final void rulefunction_designator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:491:2: ( ( ( rule__Function_designator__Group__0 ) ) )
            // InternalPascal.g:492:2: ( ( rule__Function_designator__Group__0 ) )
            {
            // InternalPascal.g:492:2: ( ( rule__Function_designator__Group__0 ) )
            // InternalPascal.g:493:3: ( rule__Function_designator__Group__0 )
            {
             before(grammarAccess.getFunction_designatorAccess().getGroup()); 
            // InternalPascal.g:494:3: ( rule__Function_designator__Group__0 )
            // InternalPascal.g:494:4: rule__Function_designator__Group__0
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


    // $ANTLR start "entryRulefunction_procedure_declaration"
    // InternalPascal.g:503:1: entryRulefunction_procedure_declaration : rulefunction_procedure_declaration EOF ;
    public final void entryRulefunction_procedure_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:504:1: ( rulefunction_procedure_declaration EOF )
            // InternalPascal.g:505:1: rulefunction_procedure_declaration EOF
            {
             before(grammarAccess.getFunction_procedure_declarationRule()); 
            pushFollow(FOLLOW_1);
            rulefunction_procedure_declaration();

            state._fsp--;

             after(grammarAccess.getFunction_procedure_declarationRule()); 
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
    // $ANTLR end "entryRulefunction_procedure_declaration"


    // $ANTLR start "rulefunction_procedure_declaration"
    // InternalPascal.g:512:1: rulefunction_procedure_declaration : ( ( ( rule__Function_procedure_declaration__Group__0 ) ) ( ( rule__Function_procedure_declaration__Group__0 )* ) ) ;
    public final void rulefunction_procedure_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:516:2: ( ( ( ( rule__Function_procedure_declaration__Group__0 ) ) ( ( rule__Function_procedure_declaration__Group__0 )* ) ) )
            // InternalPascal.g:517:2: ( ( ( rule__Function_procedure_declaration__Group__0 ) ) ( ( rule__Function_procedure_declaration__Group__0 )* ) )
            {
            // InternalPascal.g:517:2: ( ( ( rule__Function_procedure_declaration__Group__0 ) ) ( ( rule__Function_procedure_declaration__Group__0 )* ) )
            // InternalPascal.g:518:3: ( ( rule__Function_procedure_declaration__Group__0 ) ) ( ( rule__Function_procedure_declaration__Group__0 )* )
            {
            // InternalPascal.g:518:3: ( ( rule__Function_procedure_declaration__Group__0 ) )
            // InternalPascal.g:519:4: ( rule__Function_procedure_declaration__Group__0 )
            {
             before(grammarAccess.getFunction_procedure_declarationAccess().getGroup()); 
            // InternalPascal.g:520:4: ( rule__Function_procedure_declaration__Group__0 )
            // InternalPascal.g:520:5: rule__Function_procedure_declaration__Group__0
            {
            pushFollow(FOLLOW_3);
            rule__Function_procedure_declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunction_procedure_declarationAccess().getGroup()); 

            }

            // InternalPascal.g:523:3: ( ( rule__Function_procedure_declaration__Group__0 )* )
            // InternalPascal.g:524:4: ( rule__Function_procedure_declaration__Group__0 )*
            {
             before(grammarAccess.getFunction_procedure_declarationAccess().getGroup()); 
            // InternalPascal.g:525:4: ( rule__Function_procedure_declaration__Group__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==36||LA3_0==38) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPascal.g:525:5: rule__Function_procedure_declaration__Group__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Function_procedure_declaration__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getFunction_procedure_declarationAccess().getGroup()); 

            }


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
    // $ANTLR end "rulefunction_procedure_declaration"


    // $ANTLR start "entryRulefunction_heading"
    // InternalPascal.g:535:1: entryRulefunction_heading : rulefunction_heading EOF ;
    public final void entryRulefunction_heading() throws RecognitionException {
        try {
            // InternalPascal.g:536:1: ( rulefunction_heading EOF )
            // InternalPascal.g:537:1: rulefunction_heading EOF
            {
             before(grammarAccess.getFunction_headingRule()); 
            pushFollow(FOLLOW_1);
            rulefunction_heading();

            state._fsp--;

             after(grammarAccess.getFunction_headingRule()); 
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
    // $ANTLR end "entryRulefunction_heading"


    // $ANTLR start "rulefunction_heading"
    // InternalPascal.g:544:1: rulefunction_heading : ( ( rule__Function_heading__Group__0 ) ) ;
    public final void rulefunction_heading() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:548:2: ( ( ( rule__Function_heading__Group__0 ) ) )
            // InternalPascal.g:549:2: ( ( rule__Function_heading__Group__0 ) )
            {
            // InternalPascal.g:549:2: ( ( rule__Function_heading__Group__0 ) )
            // InternalPascal.g:550:3: ( rule__Function_heading__Group__0 )
            {
             before(grammarAccess.getFunction_headingAccess().getGroup()); 
            // InternalPascal.g:551:3: ( rule__Function_heading__Group__0 )
            // InternalPascal.g:551:4: rule__Function_heading__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function_heading__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunction_headingAccess().getGroup()); 

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
    // $ANTLR end "rulefunction_heading"


    // $ANTLR start "entryRulefunction_declaration"
    // InternalPascal.g:560:1: entryRulefunction_declaration : rulefunction_declaration EOF ;
    public final void entryRulefunction_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:561:1: ( rulefunction_declaration EOF )
            // InternalPascal.g:562:1: rulefunction_declaration EOF
            {
             before(grammarAccess.getFunction_declarationRule()); 
            pushFollow(FOLLOW_1);
            rulefunction_declaration();

            state._fsp--;

             after(grammarAccess.getFunction_declarationRule()); 
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
    // $ANTLR end "entryRulefunction_declaration"


    // $ANTLR start "rulefunction_declaration"
    // InternalPascal.g:569:1: rulefunction_declaration : ( ( rule__Function_declaration__Group__0 ) ) ;
    public final void rulefunction_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:573:2: ( ( ( rule__Function_declaration__Group__0 ) ) )
            // InternalPascal.g:574:2: ( ( rule__Function_declaration__Group__0 ) )
            {
            // InternalPascal.g:574:2: ( ( rule__Function_declaration__Group__0 ) )
            // InternalPascal.g:575:3: ( rule__Function_declaration__Group__0 )
            {
             before(grammarAccess.getFunction_declarationAccess().getGroup()); 
            // InternalPascal.g:576:3: ( rule__Function_declaration__Group__0 )
            // InternalPascal.g:576:4: rule__Function_declaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function_declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunction_declarationAccess().getGroup()); 

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
    // $ANTLR end "rulefunction_declaration"


    // $ANTLR start "entryRuleformal_parameter_list"
    // InternalPascal.g:585:1: entryRuleformal_parameter_list : ruleformal_parameter_list EOF ;
    public final void entryRuleformal_parameter_list() throws RecognitionException {
        try {
            // InternalPascal.g:586:1: ( ruleformal_parameter_list EOF )
            // InternalPascal.g:587:1: ruleformal_parameter_list EOF
            {
             before(grammarAccess.getFormal_parameter_listRule()); 
            pushFollow(FOLLOW_1);
            ruleformal_parameter_list();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_listRule()); 
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
    // $ANTLR end "entryRuleformal_parameter_list"


    // $ANTLR start "ruleformal_parameter_list"
    // InternalPascal.g:594:1: ruleformal_parameter_list : ( ( rule__Formal_parameter_list__Group__0 ) ) ;
    public final void ruleformal_parameter_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:598:2: ( ( ( rule__Formal_parameter_list__Group__0 ) ) )
            // InternalPascal.g:599:2: ( ( rule__Formal_parameter_list__Group__0 ) )
            {
            // InternalPascal.g:599:2: ( ( rule__Formal_parameter_list__Group__0 ) )
            // InternalPascal.g:600:3: ( rule__Formal_parameter_list__Group__0 )
            {
             before(grammarAccess.getFormal_parameter_listAccess().getGroup()); 
            // InternalPascal.g:601:3: ( rule__Formal_parameter_list__Group__0 )
            // InternalPascal.g:601:4: rule__Formal_parameter_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormal_parameter_listAccess().getGroup()); 

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
    // $ANTLR end "ruleformal_parameter_list"


    // $ANTLR start "entryRuleformal_parameter_section"
    // InternalPascal.g:610:1: entryRuleformal_parameter_section : ruleformal_parameter_section EOF ;
    public final void entryRuleformal_parameter_section() throws RecognitionException {
        try {
            // InternalPascal.g:611:1: ( ruleformal_parameter_section EOF )
            // InternalPascal.g:612:1: ruleformal_parameter_section EOF
            {
             before(grammarAccess.getFormal_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            ruleformal_parameter_section();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_sectionRule()); 
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
    // $ANTLR end "entryRuleformal_parameter_section"


    // $ANTLR start "ruleformal_parameter_section"
    // InternalPascal.g:619:1: ruleformal_parameter_section : ( ( rule__Formal_parameter_section__Alternatives ) ) ;
    public final void ruleformal_parameter_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:623:2: ( ( ( rule__Formal_parameter_section__Alternatives ) ) )
            // InternalPascal.g:624:2: ( ( rule__Formal_parameter_section__Alternatives ) )
            {
            // InternalPascal.g:624:2: ( ( rule__Formal_parameter_section__Alternatives ) )
            // InternalPascal.g:625:3: ( rule__Formal_parameter_section__Alternatives )
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getAlternatives()); 
            // InternalPascal.g:626:3: ( rule__Formal_parameter_section__Alternatives )
            // InternalPascal.g:626:4: rule__Formal_parameter_section__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_section__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormal_parameter_sectionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleformal_parameter_section"


    // $ANTLR start "entryRulevalue_parameter_section"
    // InternalPascal.g:635:1: entryRulevalue_parameter_section : rulevalue_parameter_section EOF ;
    public final void entryRulevalue_parameter_section() throws RecognitionException {
        try {
            // InternalPascal.g:636:1: ( rulevalue_parameter_section EOF )
            // InternalPascal.g:637:1: rulevalue_parameter_section EOF
            {
             before(grammarAccess.getValue_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            rulevalue_parameter_section();

            state._fsp--;

             after(grammarAccess.getValue_parameter_sectionRule()); 
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
    // $ANTLR end "entryRulevalue_parameter_section"


    // $ANTLR start "rulevalue_parameter_section"
    // InternalPascal.g:644:1: rulevalue_parameter_section : ( ( rule__Value_parameter_section__Group__0 ) ) ;
    public final void rulevalue_parameter_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:648:2: ( ( ( rule__Value_parameter_section__Group__0 ) ) )
            // InternalPascal.g:649:2: ( ( rule__Value_parameter_section__Group__0 ) )
            {
            // InternalPascal.g:649:2: ( ( rule__Value_parameter_section__Group__0 ) )
            // InternalPascal.g:650:3: ( rule__Value_parameter_section__Group__0 )
            {
             before(grammarAccess.getValue_parameter_sectionAccess().getGroup()); 
            // InternalPascal.g:651:3: ( rule__Value_parameter_section__Group__0 )
            // InternalPascal.g:651:4: rule__Value_parameter_section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Value_parameter_section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValue_parameter_sectionAccess().getGroup()); 

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
    // $ANTLR end "rulevalue_parameter_section"


    // $ANTLR start "entryRuleidentifier_list"
    // InternalPascal.g:660:1: entryRuleidentifier_list : ruleidentifier_list EOF ;
    public final void entryRuleidentifier_list() throws RecognitionException {
        try {
            // InternalPascal.g:661:1: ( ruleidentifier_list EOF )
            // InternalPascal.g:662:1: ruleidentifier_list EOF
            {
             before(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_1);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getIdentifier_listRule()); 
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
    // $ANTLR end "entryRuleidentifier_list"


    // $ANTLR start "ruleidentifier_list"
    // InternalPascal.g:669:1: ruleidentifier_list : ( ( rule__Identifier_list__Group__0 ) ) ;
    public final void ruleidentifier_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:673:2: ( ( ( rule__Identifier_list__Group__0 ) ) )
            // InternalPascal.g:674:2: ( ( rule__Identifier_list__Group__0 ) )
            {
            // InternalPascal.g:674:2: ( ( rule__Identifier_list__Group__0 ) )
            // InternalPascal.g:675:3: ( rule__Identifier_list__Group__0 )
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup()); 
            // InternalPascal.g:676:3: ( rule__Identifier_list__Group__0 )
            // InternalPascal.g:676:4: rule__Identifier_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdentifier_listAccess().getGroup()); 

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
    // $ANTLR end "ruleidentifier_list"


    // $ANTLR start "entryRuleparameter_type"
    // InternalPascal.g:685:1: entryRuleparameter_type : ruleparameter_type EOF ;
    public final void entryRuleparameter_type() throws RecognitionException {
        try {
            // InternalPascal.g:686:1: ( ruleparameter_type EOF )
            // InternalPascal.g:687:1: ruleparameter_type EOF
            {
             before(grammarAccess.getParameter_typeRule()); 
            pushFollow(FOLLOW_1);
            ruleparameter_type();

            state._fsp--;

             after(grammarAccess.getParameter_typeRule()); 
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
    // $ANTLR end "entryRuleparameter_type"


    // $ANTLR start "ruleparameter_type"
    // InternalPascal.g:694:1: ruleparameter_type : ( ( rule__Parameter_type__NameAssignment ) ) ;
    public final void ruleparameter_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:698:2: ( ( ( rule__Parameter_type__NameAssignment ) ) )
            // InternalPascal.g:699:2: ( ( rule__Parameter_type__NameAssignment ) )
            {
            // InternalPascal.g:699:2: ( ( rule__Parameter_type__NameAssignment ) )
            // InternalPascal.g:700:3: ( rule__Parameter_type__NameAssignment )
            {
             before(grammarAccess.getParameter_typeAccess().getNameAssignment()); 
            // InternalPascal.g:701:3: ( rule__Parameter_type__NameAssignment )
            // InternalPascal.g:701:4: rule__Parameter_type__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_type__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameter_typeAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleparameter_type"


    // $ANTLR start "entryRulevariable_parameter_section"
    // InternalPascal.g:710:1: entryRulevariable_parameter_section : rulevariable_parameter_section EOF ;
    public final void entryRulevariable_parameter_section() throws RecognitionException {
        try {
            // InternalPascal.g:711:1: ( rulevariable_parameter_section EOF )
            // InternalPascal.g:712:1: rulevariable_parameter_section EOF
            {
             before(grammarAccess.getVariable_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            rulevariable_parameter_section();

            state._fsp--;

             after(grammarAccess.getVariable_parameter_sectionRule()); 
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
    // $ANTLR end "entryRulevariable_parameter_section"


    // $ANTLR start "rulevariable_parameter_section"
    // InternalPascal.g:719:1: rulevariable_parameter_section : ( ( rule__Variable_parameter_section__Group__0 ) ) ;
    public final void rulevariable_parameter_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:723:2: ( ( ( rule__Variable_parameter_section__Group__0 ) ) )
            // InternalPascal.g:724:2: ( ( rule__Variable_parameter_section__Group__0 ) )
            {
            // InternalPascal.g:724:2: ( ( rule__Variable_parameter_section__Group__0 ) )
            // InternalPascal.g:725:3: ( rule__Variable_parameter_section__Group__0 )
            {
             before(grammarAccess.getVariable_parameter_sectionAccess().getGroup()); 
            // InternalPascal.g:726:3: ( rule__Variable_parameter_section__Group__0 )
            // InternalPascal.g:726:4: rule__Variable_parameter_section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_parameter_section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_parameter_sectionAccess().getGroup()); 

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
    // $ANTLR end "rulevariable_parameter_section"


    // $ANTLR start "entryRuleprocedure_declaration"
    // InternalPascal.g:735:1: entryRuleprocedure_declaration : ruleprocedure_declaration EOF ;
    public final void entryRuleprocedure_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:736:1: ( ruleprocedure_declaration EOF )
            // InternalPascal.g:737:1: ruleprocedure_declaration EOF
            {
             before(grammarAccess.getProcedure_declarationRule()); 
            pushFollow(FOLLOW_1);
            ruleprocedure_declaration();

            state._fsp--;

             after(grammarAccess.getProcedure_declarationRule()); 
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
    // $ANTLR end "entryRuleprocedure_declaration"


    // $ANTLR start "ruleprocedure_declaration"
    // InternalPascal.g:744:1: ruleprocedure_declaration : ( ( rule__Procedure_declaration__Group__0 ) ) ;
    public final void ruleprocedure_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:748:2: ( ( ( rule__Procedure_declaration__Group__0 ) ) )
            // InternalPascal.g:749:2: ( ( rule__Procedure_declaration__Group__0 ) )
            {
            // InternalPascal.g:749:2: ( ( rule__Procedure_declaration__Group__0 ) )
            // InternalPascal.g:750:3: ( rule__Procedure_declaration__Group__0 )
            {
             before(grammarAccess.getProcedure_declarationAccess().getGroup()); 
            // InternalPascal.g:751:3: ( rule__Procedure_declaration__Group__0 )
            // InternalPascal.g:751:4: rule__Procedure_declaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_declarationAccess().getGroup()); 

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
    // $ANTLR end "ruleprocedure_declaration"


    // $ANTLR start "entryRuleprocedure_heading"
    // InternalPascal.g:760:1: entryRuleprocedure_heading : ruleprocedure_heading EOF ;
    public final void entryRuleprocedure_heading() throws RecognitionException {
        try {
            // InternalPascal.g:761:1: ( ruleprocedure_heading EOF )
            // InternalPascal.g:762:1: ruleprocedure_heading EOF
            {
             before(grammarAccess.getProcedure_headingRule()); 
            pushFollow(FOLLOW_1);
            ruleprocedure_heading();

            state._fsp--;

             after(grammarAccess.getProcedure_headingRule()); 
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
    // $ANTLR end "entryRuleprocedure_heading"


    // $ANTLR start "ruleprocedure_heading"
    // InternalPascal.g:769:1: ruleprocedure_heading : ( ( rule__Procedure_heading__Group__0 ) ) ;
    public final void ruleprocedure_heading() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:773:2: ( ( ( rule__Procedure_heading__Group__0 ) ) )
            // InternalPascal.g:774:2: ( ( rule__Procedure_heading__Group__0 ) )
            {
            // InternalPascal.g:774:2: ( ( rule__Procedure_heading__Group__0 ) )
            // InternalPascal.g:775:3: ( rule__Procedure_heading__Group__0 )
            {
             before(grammarAccess.getProcedure_headingAccess().getGroup()); 
            // InternalPascal.g:776:3: ( rule__Procedure_heading__Group__0 )
            // InternalPascal.g:776:4: rule__Procedure_heading__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_heading__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_headingAccess().getGroup()); 

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
    // $ANTLR end "ruleprocedure_heading"


    // $ANTLR start "entryRuleset"
    // InternalPascal.g:785:1: entryRuleset : ruleset EOF ;
    public final void entryRuleset() throws RecognitionException {
        try {
            // InternalPascal.g:786:1: ( ruleset EOF )
            // InternalPascal.g:787:1: ruleset EOF
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
    // InternalPascal.g:794:1: ruleset : ( ( rule__Set__Group__0 ) ) ;
    public final void ruleset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:798:2: ( ( ( rule__Set__Group__0 ) ) )
            // InternalPascal.g:799:2: ( ( rule__Set__Group__0 ) )
            {
            // InternalPascal.g:799:2: ( ( rule__Set__Group__0 ) )
            // InternalPascal.g:800:3: ( rule__Set__Group__0 )
            {
             before(grammarAccess.getSetAccess().getGroup()); 
            // InternalPascal.g:801:3: ( rule__Set__Group__0 )
            // InternalPascal.g:801:4: rule__Set__Group__0
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
    // InternalPascal.g:810:1: entryRulenumber : rulenumber EOF ;
    public final void entryRulenumber() throws RecognitionException {
        try {
            // InternalPascal.g:811:1: ( rulenumber EOF )
            // InternalPascal.g:812:1: rulenumber EOF
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
    // InternalPascal.g:819:1: rulenumber : ( ( rule__Number__NumberAssignment ) ) ;
    public final void rulenumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:823:2: ( ( ( rule__Number__NumberAssignment ) ) )
            // InternalPascal.g:824:2: ( ( rule__Number__NumberAssignment ) )
            {
            // InternalPascal.g:824:2: ( ( rule__Number__NumberAssignment ) )
            // InternalPascal.g:825:3: ( rule__Number__NumberAssignment )
            {
             before(grammarAccess.getNumberAccess().getNumberAssignment()); 
            // InternalPascal.g:826:3: ( rule__Number__NumberAssignment )
            // InternalPascal.g:826:4: rule__Number__NumberAssignment
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
    // InternalPascal.g:835:1: entryRuleany_number : ruleany_number EOF ;
    public final void entryRuleany_number() throws RecognitionException {
        try {
            // InternalPascal.g:836:1: ( ruleany_number EOF )
            // InternalPascal.g:837:1: ruleany_number EOF
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
    // InternalPascal.g:844:1: ruleany_number : ( ( rule__Any_number__Alternatives ) ) ;
    public final void ruleany_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:848:2: ( ( ( rule__Any_number__Alternatives ) ) )
            // InternalPascal.g:849:2: ( ( rule__Any_number__Alternatives ) )
            {
            // InternalPascal.g:849:2: ( ( rule__Any_number__Alternatives ) )
            // InternalPascal.g:850:3: ( rule__Any_number__Alternatives )
            {
             before(grammarAccess.getAny_numberAccess().getAlternatives()); 
            // InternalPascal.g:851:3: ( rule__Any_number__Alternatives )
            // InternalPascal.g:851:4: rule__Any_number__Alternatives
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


    // $ANTLR start "entryRulelabel_declaration"
    // InternalPascal.g:860:1: entryRulelabel_declaration : rulelabel_declaration EOF ;
    public final void entryRulelabel_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:861:1: ( rulelabel_declaration EOF )
            // InternalPascal.g:862:1: rulelabel_declaration EOF
            {
             before(grammarAccess.getLabel_declarationRule()); 
            pushFollow(FOLLOW_1);
            rulelabel_declaration();

            state._fsp--;

             after(grammarAccess.getLabel_declarationRule()); 
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
    // $ANTLR end "entryRulelabel_declaration"


    // $ANTLR start "rulelabel_declaration"
    // InternalPascal.g:869:1: rulelabel_declaration : ( ( rule__Label_declaration__Group__0 ) ) ;
    public final void rulelabel_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:873:2: ( ( ( rule__Label_declaration__Group__0 ) ) )
            // InternalPascal.g:874:2: ( ( rule__Label_declaration__Group__0 ) )
            {
            // InternalPascal.g:874:2: ( ( rule__Label_declaration__Group__0 ) )
            // InternalPascal.g:875:3: ( rule__Label_declaration__Group__0 )
            {
             before(grammarAccess.getLabel_declarationAccess().getGroup()); 
            // InternalPascal.g:876:3: ( rule__Label_declaration__Group__0 )
            // InternalPascal.g:876:4: rule__Label_declaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Label_declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabel_declarationAccess().getGroup()); 

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
    // $ANTLR end "rulelabel_declaration"


    // $ANTLR start "entryRuleconstant"
    // InternalPascal.g:885:1: entryRuleconstant : ruleconstant EOF ;
    public final void entryRuleconstant() throws RecognitionException {
        try {
            // InternalPascal.g:886:1: ( ruleconstant EOF )
            // InternalPascal.g:887:1: ruleconstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
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
    // $ANTLR end "entryRuleconstant"


    // $ANTLR start "ruleconstant"
    // InternalPascal.g:894:1: ruleconstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleconstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:898:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalPascal.g:899:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalPascal.g:899:2: ( ( rule__Constant__Alternatives ) )
            // InternalPascal.g:900:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalPascal.g:901:3: ( rule__Constant__Alternatives )
            // InternalPascal.g:901:4: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives()); 

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
    // $ANTLR end "ruleconstant"


    // $ANTLR start "entryRuleconstant_definition_part"
    // InternalPascal.g:910:1: entryRuleconstant_definition_part : ruleconstant_definition_part EOF ;
    public final void entryRuleconstant_definition_part() throws RecognitionException {
        try {
            // InternalPascal.g:911:1: ( ruleconstant_definition_part EOF )
            // InternalPascal.g:912:1: ruleconstant_definition_part EOF
            {
             before(grammarAccess.getConstant_definition_partRule()); 
            pushFollow(FOLLOW_1);
            ruleconstant_definition_part();

            state._fsp--;

             after(grammarAccess.getConstant_definition_partRule()); 
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
    // $ANTLR end "entryRuleconstant_definition_part"


    // $ANTLR start "ruleconstant_definition_part"
    // InternalPascal.g:919:1: ruleconstant_definition_part : ( ( rule__Constant_definition_part__Group__0 ) ) ;
    public final void ruleconstant_definition_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:923:2: ( ( ( rule__Constant_definition_part__Group__0 ) ) )
            // InternalPascal.g:924:2: ( ( rule__Constant_definition_part__Group__0 ) )
            {
            // InternalPascal.g:924:2: ( ( rule__Constant_definition_part__Group__0 ) )
            // InternalPascal.g:925:3: ( rule__Constant_definition_part__Group__0 )
            {
             before(grammarAccess.getConstant_definition_partAccess().getGroup()); 
            // InternalPascal.g:926:3: ( rule__Constant_definition_part__Group__0 )
            // InternalPascal.g:926:4: rule__Constant_definition_part__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstant_definition_partAccess().getGroup()); 

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
    // $ANTLR end "ruleconstant_definition_part"


    // $ANTLR start "entryRuleconstant_definition"
    // InternalPascal.g:935:1: entryRuleconstant_definition : ruleconstant_definition EOF ;
    public final void entryRuleconstant_definition() throws RecognitionException {
        try {
            // InternalPascal.g:936:1: ( ruleconstant_definition EOF )
            // InternalPascal.g:937:1: ruleconstant_definition EOF
            {
             before(grammarAccess.getConstant_definitionRule()); 
            pushFollow(FOLLOW_1);
            ruleconstant_definition();

            state._fsp--;

             after(grammarAccess.getConstant_definitionRule()); 
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
    // $ANTLR end "entryRuleconstant_definition"


    // $ANTLR start "ruleconstant_definition"
    // InternalPascal.g:944:1: ruleconstant_definition : ( ( rule__Constant_definition__Group__0 ) ) ;
    public final void ruleconstant_definition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:948:2: ( ( ( rule__Constant_definition__Group__0 ) ) )
            // InternalPascal.g:949:2: ( ( rule__Constant_definition__Group__0 ) )
            {
            // InternalPascal.g:949:2: ( ( rule__Constant_definition__Group__0 ) )
            // InternalPascal.g:950:3: ( rule__Constant_definition__Group__0 )
            {
             before(grammarAccess.getConstant_definitionAccess().getGroup()); 
            // InternalPascal.g:951:3: ( rule__Constant_definition__Group__0 )
            // InternalPascal.g:951:4: rule__Constant_definition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstant_definitionAccess().getGroup()); 

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
    // $ANTLR end "ruleconstant_definition"


    // $ANTLR start "entryRuletype_definition_part"
    // InternalPascal.g:960:1: entryRuletype_definition_part : ruletype_definition_part EOF ;
    public final void entryRuletype_definition_part() throws RecognitionException {
        try {
            // InternalPascal.g:961:1: ( ruletype_definition_part EOF )
            // InternalPascal.g:962:1: ruletype_definition_part EOF
            {
             before(grammarAccess.getType_definition_partRule()); 
            pushFollow(FOLLOW_1);
            ruletype_definition_part();

            state._fsp--;

             after(grammarAccess.getType_definition_partRule()); 
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
    // $ANTLR end "entryRuletype_definition_part"


    // $ANTLR start "ruletype_definition_part"
    // InternalPascal.g:969:1: ruletype_definition_part : ( ( rule__Type_definition_part__Group__0 ) ) ;
    public final void ruletype_definition_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:973:2: ( ( ( rule__Type_definition_part__Group__0 ) ) )
            // InternalPascal.g:974:2: ( ( rule__Type_definition_part__Group__0 ) )
            {
            // InternalPascal.g:974:2: ( ( rule__Type_definition_part__Group__0 ) )
            // InternalPascal.g:975:3: ( rule__Type_definition_part__Group__0 )
            {
             before(grammarAccess.getType_definition_partAccess().getGroup()); 
            // InternalPascal.g:976:3: ( rule__Type_definition_part__Group__0 )
            // InternalPascal.g:976:4: rule__Type_definition_part__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getType_definition_partAccess().getGroup()); 

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
    // $ANTLR end "ruletype_definition_part"


    // $ANTLR start "entryRuletype_definition"
    // InternalPascal.g:985:1: entryRuletype_definition : ruletype_definition EOF ;
    public final void entryRuletype_definition() throws RecognitionException {
        try {
            // InternalPascal.g:986:1: ( ruletype_definition EOF )
            // InternalPascal.g:987:1: ruletype_definition EOF
            {
             before(grammarAccess.getType_definitionRule()); 
            pushFollow(FOLLOW_1);
            ruletype_definition();

            state._fsp--;

             after(grammarAccess.getType_definitionRule()); 
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
    // $ANTLR end "entryRuletype_definition"


    // $ANTLR start "ruletype_definition"
    // InternalPascal.g:994:1: ruletype_definition : ( ( rule__Type_definition__Group__0 ) ) ;
    public final void ruletype_definition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:998:2: ( ( ( rule__Type_definition__Group__0 ) ) )
            // InternalPascal.g:999:2: ( ( rule__Type_definition__Group__0 ) )
            {
            // InternalPascal.g:999:2: ( ( rule__Type_definition__Group__0 ) )
            // InternalPascal.g:1000:3: ( rule__Type_definition__Group__0 )
            {
             before(grammarAccess.getType_definitionAccess().getGroup()); 
            // InternalPascal.g:1001:3: ( rule__Type_definition__Group__0 )
            // InternalPascal.g:1001:4: rule__Type_definition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getType_definitionAccess().getGroup()); 

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
    // $ANTLR end "ruletype_definition"


    // $ANTLR start "entryRuletype"
    // InternalPascal.g:1010:1: entryRuletype : ruletype EOF ;
    public final void entryRuletype() throws RecognitionException {
        try {
            // InternalPascal.g:1011:1: ( ruletype EOF )
            // InternalPascal.g:1012:1: ruletype EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruletype();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // InternalPascal.g:1019:1: ruletype : ( ( rule__Type__Alternatives ) ) ;
    public final void ruletype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1023:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalPascal.g:1024:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalPascal.g:1024:2: ( ( rule__Type__Alternatives ) )
            // InternalPascal.g:1025:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalPascal.g:1026:3: ( rule__Type__Alternatives )
            // InternalPascal.g:1026:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRulesimple_type"
    // InternalPascal.g:1035:1: entryRulesimple_type : rulesimple_type EOF ;
    public final void entryRulesimple_type() throws RecognitionException {
        try {
            // InternalPascal.g:1036:1: ( rulesimple_type EOF )
            // InternalPascal.g:1037:1: rulesimple_type EOF
            {
             before(grammarAccess.getSimple_typeRule()); 
            pushFollow(FOLLOW_1);
            rulesimple_type();

            state._fsp--;

             after(grammarAccess.getSimple_typeRule()); 
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
    // $ANTLR end "entryRulesimple_type"


    // $ANTLR start "rulesimple_type"
    // InternalPascal.g:1044:1: rulesimple_type : ( ( rule__Simple_type__Alternatives ) ) ;
    public final void rulesimple_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1048:2: ( ( ( rule__Simple_type__Alternatives ) ) )
            // InternalPascal.g:1049:2: ( ( rule__Simple_type__Alternatives ) )
            {
            // InternalPascal.g:1049:2: ( ( rule__Simple_type__Alternatives ) )
            // InternalPascal.g:1050:3: ( rule__Simple_type__Alternatives )
            {
             before(grammarAccess.getSimple_typeAccess().getAlternatives()); 
            // InternalPascal.g:1051:3: ( rule__Simple_type__Alternatives )
            // InternalPascal.g:1051:4: rule__Simple_type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Simple_type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimple_typeAccess().getAlternatives()); 

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
    // $ANTLR end "rulesimple_type"


    // $ANTLR start "entryRulesubrange_type"
    // InternalPascal.g:1060:1: entryRulesubrange_type : rulesubrange_type EOF ;
    public final void entryRulesubrange_type() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalPascal.g:1064:1: ( rulesubrange_type EOF )
            // InternalPascal.g:1065:1: rulesubrange_type EOF
            {
             before(grammarAccess.getSubrange_typeRule()); 
            pushFollow(FOLLOW_1);
            rulesubrange_type();

            state._fsp--;

             after(grammarAccess.getSubrange_typeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRulesubrange_type"


    // $ANTLR start "rulesubrange_type"
    // InternalPascal.g:1075:1: rulesubrange_type : ( ( rule__Subrange_type__Alternatives ) ) ;
    public final void rulesubrange_type() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1080:2: ( ( ( rule__Subrange_type__Alternatives ) ) )
            // InternalPascal.g:1081:2: ( ( rule__Subrange_type__Alternatives ) )
            {
            // InternalPascal.g:1081:2: ( ( rule__Subrange_type__Alternatives ) )
            // InternalPascal.g:1082:3: ( rule__Subrange_type__Alternatives )
            {
             before(grammarAccess.getSubrange_typeAccess().getAlternatives()); 
            // InternalPascal.g:1083:3: ( rule__Subrange_type__Alternatives )
            // InternalPascal.g:1083:4: rule__Subrange_type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSubrange_typeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "rulesubrange_type"


    // $ANTLR start "entryRuleenumerated_type"
    // InternalPascal.g:1093:1: entryRuleenumerated_type : ruleenumerated_type EOF ;
    public final void entryRuleenumerated_type() throws RecognitionException {
        try {
            // InternalPascal.g:1094:1: ( ruleenumerated_type EOF )
            // InternalPascal.g:1095:1: ruleenumerated_type EOF
            {
             before(grammarAccess.getEnumerated_typeRule()); 
            pushFollow(FOLLOW_1);
            ruleenumerated_type();

            state._fsp--;

             after(grammarAccess.getEnumerated_typeRule()); 
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
    // $ANTLR end "entryRuleenumerated_type"


    // $ANTLR start "ruleenumerated_type"
    // InternalPascal.g:1102:1: ruleenumerated_type : ( ( rule__Enumerated_type__Group__0 ) ) ;
    public final void ruleenumerated_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1106:2: ( ( ( rule__Enumerated_type__Group__0 ) ) )
            // InternalPascal.g:1107:2: ( ( rule__Enumerated_type__Group__0 ) )
            {
            // InternalPascal.g:1107:2: ( ( rule__Enumerated_type__Group__0 ) )
            // InternalPascal.g:1108:3: ( rule__Enumerated_type__Group__0 )
            {
             before(grammarAccess.getEnumerated_typeAccess().getGroup()); 
            // InternalPascal.g:1109:3: ( rule__Enumerated_type__Group__0 )
            // InternalPascal.g:1109:4: rule__Enumerated_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enumerated_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerated_typeAccess().getGroup()); 

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
    // $ANTLR end "ruleenumerated_type"


    // $ANTLR start "entryRulestrutured_type"
    // InternalPascal.g:1118:1: entryRulestrutured_type : rulestrutured_type EOF ;
    public final void entryRulestrutured_type() throws RecognitionException {
        try {
            // InternalPascal.g:1119:1: ( rulestrutured_type EOF )
            // InternalPascal.g:1120:1: rulestrutured_type EOF
            {
             before(grammarAccess.getStrutured_typeRule()); 
            pushFollow(FOLLOW_1);
            rulestrutured_type();

            state._fsp--;

             after(grammarAccess.getStrutured_typeRule()); 
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
    // $ANTLR end "entryRulestrutured_type"


    // $ANTLR start "rulestrutured_type"
    // InternalPascal.g:1127:1: rulestrutured_type : ( ( rule__Strutured_type__Group__0 ) ) ;
    public final void rulestrutured_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1131:2: ( ( ( rule__Strutured_type__Group__0 ) ) )
            // InternalPascal.g:1132:2: ( ( rule__Strutured_type__Group__0 ) )
            {
            // InternalPascal.g:1132:2: ( ( rule__Strutured_type__Group__0 ) )
            // InternalPascal.g:1133:3: ( rule__Strutured_type__Group__0 )
            {
             before(grammarAccess.getStrutured_typeAccess().getGroup()); 
            // InternalPascal.g:1134:3: ( rule__Strutured_type__Group__0 )
            // InternalPascal.g:1134:4: rule__Strutured_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Strutured_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStrutured_typeAccess().getGroup()); 

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
    // $ANTLR end "rulestrutured_type"


    // $ANTLR start "entryRuleunpacked_strutured_type"
    // InternalPascal.g:1143:1: entryRuleunpacked_strutured_type : ruleunpacked_strutured_type EOF ;
    public final void entryRuleunpacked_strutured_type() throws RecognitionException {
        try {
            // InternalPascal.g:1144:1: ( ruleunpacked_strutured_type EOF )
            // InternalPascal.g:1145:1: ruleunpacked_strutured_type EOF
            {
             before(grammarAccess.getUnpacked_strutured_typeRule()); 
            pushFollow(FOLLOW_1);
            ruleunpacked_strutured_type();

            state._fsp--;

             after(grammarAccess.getUnpacked_strutured_typeRule()); 
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
    // $ANTLR end "entryRuleunpacked_strutured_type"


    // $ANTLR start "ruleunpacked_strutured_type"
    // InternalPascal.g:1152:1: ruleunpacked_strutured_type : ( ( rule__Unpacked_strutured_type__SetAssignment ) ) ;
    public final void ruleunpacked_strutured_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1156:2: ( ( ( rule__Unpacked_strutured_type__SetAssignment ) ) )
            // InternalPascal.g:1157:2: ( ( rule__Unpacked_strutured_type__SetAssignment ) )
            {
            // InternalPascal.g:1157:2: ( ( rule__Unpacked_strutured_type__SetAssignment ) )
            // InternalPascal.g:1158:3: ( rule__Unpacked_strutured_type__SetAssignment )
            {
             before(grammarAccess.getUnpacked_strutured_typeAccess().getSetAssignment()); 
            // InternalPascal.g:1159:3: ( rule__Unpacked_strutured_type__SetAssignment )
            // InternalPascal.g:1159:4: rule__Unpacked_strutured_type__SetAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Unpacked_strutured_type__SetAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUnpacked_strutured_typeAccess().getSetAssignment()); 

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
    // $ANTLR end "ruleunpacked_strutured_type"


    // $ANTLR start "entryRuleset_type"
    // InternalPascal.g:1168:1: entryRuleset_type : ruleset_type EOF ;
    public final void entryRuleset_type() throws RecognitionException {
        try {
            // InternalPascal.g:1169:1: ( ruleset_type EOF )
            // InternalPascal.g:1170:1: ruleset_type EOF
            {
             before(grammarAccess.getSet_typeRule()); 
            pushFollow(FOLLOW_1);
            ruleset_type();

            state._fsp--;

             after(grammarAccess.getSet_typeRule()); 
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
    // $ANTLR end "entryRuleset_type"


    // $ANTLR start "ruleset_type"
    // InternalPascal.g:1177:1: ruleset_type : ( ( rule__Set_type__Group__0 ) ) ;
    public final void ruleset_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1181:2: ( ( ( rule__Set_type__Group__0 ) ) )
            // InternalPascal.g:1182:2: ( ( rule__Set_type__Group__0 ) )
            {
            // InternalPascal.g:1182:2: ( ( rule__Set_type__Group__0 ) )
            // InternalPascal.g:1183:3: ( rule__Set_type__Group__0 )
            {
             before(grammarAccess.getSet_typeAccess().getGroup()); 
            // InternalPascal.g:1184:3: ( rule__Set_type__Group__0 )
            // InternalPascal.g:1184:4: rule__Set_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Set_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSet_typeAccess().getGroup()); 

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
    // $ANTLR end "ruleset_type"


    // $ANTLR start "entryRulepointer_type"
    // InternalPascal.g:1193:1: entryRulepointer_type : rulepointer_type EOF ;
    public final void entryRulepointer_type() throws RecognitionException {
        try {
            // InternalPascal.g:1194:1: ( rulepointer_type EOF )
            // InternalPascal.g:1195:1: rulepointer_type EOF
            {
             before(grammarAccess.getPointer_typeRule()); 
            pushFollow(FOLLOW_1);
            rulepointer_type();

            state._fsp--;

             after(grammarAccess.getPointer_typeRule()); 
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
    // $ANTLR end "entryRulepointer_type"


    // $ANTLR start "rulepointer_type"
    // InternalPascal.g:1202:1: rulepointer_type : ( ( rule__Pointer_type__Group__0 ) ) ;
    public final void rulepointer_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1206:2: ( ( ( rule__Pointer_type__Group__0 ) ) )
            // InternalPascal.g:1207:2: ( ( rule__Pointer_type__Group__0 ) )
            {
            // InternalPascal.g:1207:2: ( ( rule__Pointer_type__Group__0 ) )
            // InternalPascal.g:1208:3: ( rule__Pointer_type__Group__0 )
            {
             before(grammarAccess.getPointer_typeAccess().getGroup()); 
            // InternalPascal.g:1209:3: ( rule__Pointer_type__Group__0 )
            // InternalPascal.g:1209:4: rule__Pointer_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pointer_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointer_typeAccess().getGroup()); 

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
    // $ANTLR end "rulepointer_type"


    // $ANTLR start "entryRulesigned_number"
    // InternalPascal.g:1218:1: entryRulesigned_number : rulesigned_number EOF ;
    public final void entryRulesigned_number() throws RecognitionException {
        try {
            // InternalPascal.g:1219:1: ( rulesigned_number EOF )
            // InternalPascal.g:1220:1: rulesigned_number EOF
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
    // InternalPascal.g:1227:1: rulesigned_number : ( ( rule__Signed_number__Alternatives ) ) ;
    public final void rulesigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1231:2: ( ( ( rule__Signed_number__Alternatives ) ) )
            // InternalPascal.g:1232:2: ( ( rule__Signed_number__Alternatives ) )
            {
            // InternalPascal.g:1232:2: ( ( rule__Signed_number__Alternatives ) )
            // InternalPascal.g:1233:3: ( rule__Signed_number__Alternatives )
            {
             before(grammarAccess.getSigned_numberAccess().getAlternatives()); 
            // InternalPascal.g:1234:3: ( rule__Signed_number__Alternatives )
            // InternalPascal.g:1234:4: rule__Signed_number__Alternatives
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
    // InternalPascal.g:1243:1: entryRuleunsigned_number : ruleunsigned_number EOF ;
    public final void entryRuleunsigned_number() throws RecognitionException {
        try {
            // InternalPascal.g:1244:1: ( ruleunsigned_number EOF )
            // InternalPascal.g:1245:1: ruleunsigned_number EOF
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
    // InternalPascal.g:1252:1: ruleunsigned_number : ( ( rule__Unsigned_number__Alternatives ) ) ;
    public final void ruleunsigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1256:2: ( ( ( rule__Unsigned_number__Alternatives ) ) )
            // InternalPascal.g:1257:2: ( ( rule__Unsigned_number__Alternatives ) )
            {
            // InternalPascal.g:1257:2: ( ( rule__Unsigned_number__Alternatives ) )
            // InternalPascal.g:1258:3: ( rule__Unsigned_number__Alternatives )
            {
             before(grammarAccess.getUnsigned_numberAccess().getAlternatives()); 
            // InternalPascal.g:1259:3: ( rule__Unsigned_number__Alternatives )
            // InternalPascal.g:1259:4: rule__Unsigned_number__Alternatives
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


    // $ANTLR start "entryRulevariable_declaration_part"
    // InternalPascal.g:1268:1: entryRulevariable_declaration_part : rulevariable_declaration_part EOF ;
    public final void entryRulevariable_declaration_part() throws RecognitionException {
        try {
            // InternalPascal.g:1269:1: ( rulevariable_declaration_part EOF )
            // InternalPascal.g:1270:1: rulevariable_declaration_part EOF
            {
             before(grammarAccess.getVariable_declaration_partRule()); 
            pushFollow(FOLLOW_1);
            rulevariable_declaration_part();

            state._fsp--;

             after(grammarAccess.getVariable_declaration_partRule()); 
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
    // $ANTLR end "entryRulevariable_declaration_part"


    // $ANTLR start "rulevariable_declaration_part"
    // InternalPascal.g:1277:1: rulevariable_declaration_part : ( ( rule__Variable_declaration_part__Group__0 ) ) ;
    public final void rulevariable_declaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1281:2: ( ( ( rule__Variable_declaration_part__Group__0 ) ) )
            // InternalPascal.g:1282:2: ( ( rule__Variable_declaration_part__Group__0 ) )
            {
            // InternalPascal.g:1282:2: ( ( rule__Variable_declaration_part__Group__0 ) )
            // InternalPascal.g:1283:3: ( rule__Variable_declaration_part__Group__0 )
            {
             before(grammarAccess.getVariable_declaration_partAccess().getGroup()); 
            // InternalPascal.g:1284:3: ( rule__Variable_declaration_part__Group__0 )
            // InternalPascal.g:1284:4: rule__Variable_declaration_part__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_declaration_partAccess().getGroup()); 

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
    // $ANTLR end "rulevariable_declaration_part"


    // $ANTLR start "entryRulevariable_section"
    // InternalPascal.g:1293:1: entryRulevariable_section : rulevariable_section EOF ;
    public final void entryRulevariable_section() throws RecognitionException {
        try {
            // InternalPascal.g:1294:1: ( rulevariable_section EOF )
            // InternalPascal.g:1295:1: rulevariable_section EOF
            {
             before(grammarAccess.getVariable_sectionRule()); 
            pushFollow(FOLLOW_1);
            rulevariable_section();

            state._fsp--;

             after(grammarAccess.getVariable_sectionRule()); 
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
    // $ANTLR end "entryRulevariable_section"


    // $ANTLR start "rulevariable_section"
    // InternalPascal.g:1302:1: rulevariable_section : ( ( rule__Variable_section__Group__0 ) ) ;
    public final void rulevariable_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1306:2: ( ( ( rule__Variable_section__Group__0 ) ) )
            // InternalPascal.g:1307:2: ( ( rule__Variable_section__Group__0 ) )
            {
            // InternalPascal.g:1307:2: ( ( rule__Variable_section__Group__0 ) )
            // InternalPascal.g:1308:3: ( rule__Variable_section__Group__0 )
            {
             before(grammarAccess.getVariable_sectionAccess().getGroup()); 
            // InternalPascal.g:1309:3: ( rule__Variable_section__Group__0 )
            // InternalPascal.g:1309:4: rule__Variable_section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_sectionAccess().getGroup()); 

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
    // $ANTLR end "rulevariable_section"


    // $ANTLR start "entryRulevariable_identifier_list"
    // InternalPascal.g:1318:1: entryRulevariable_identifier_list : rulevariable_identifier_list EOF ;
    public final void entryRulevariable_identifier_list() throws RecognitionException {
        try {
            // InternalPascal.g:1319:1: ( rulevariable_identifier_list EOF )
            // InternalPascal.g:1320:1: rulevariable_identifier_list EOF
            {
             before(grammarAccess.getVariable_identifier_listRule()); 
            pushFollow(FOLLOW_1);
            rulevariable_identifier_list();

            state._fsp--;

             after(grammarAccess.getVariable_identifier_listRule()); 
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
    // $ANTLR end "entryRulevariable_identifier_list"


    // $ANTLR start "rulevariable_identifier_list"
    // InternalPascal.g:1327:1: rulevariable_identifier_list : ( ( rule__Variable_identifier_list__Group__0 ) ) ;
    public final void rulevariable_identifier_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1331:2: ( ( ( rule__Variable_identifier_list__Group__0 ) ) )
            // InternalPascal.g:1332:2: ( ( rule__Variable_identifier_list__Group__0 ) )
            {
            // InternalPascal.g:1332:2: ( ( rule__Variable_identifier_list__Group__0 ) )
            // InternalPascal.g:1333:3: ( rule__Variable_identifier_list__Group__0 )
            {
             before(grammarAccess.getVariable_identifier_listAccess().getGroup()); 
            // InternalPascal.g:1334:3: ( rule__Variable_identifier_list__Group__0 )
            // InternalPascal.g:1334:4: rule__Variable_identifier_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_identifier_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_identifier_listAccess().getGroup()); 

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
    // $ANTLR end "rulevariable_identifier_list"


    // $ANTLR start "rule__Simple_statement__Alternatives"
    // InternalPascal.g:1342:1: rule__Simple_statement__Alternatives : ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__FunctionAssignment_1 ) ) | ( ( rule__Simple_statement__Function_noargsAssignment_2 ) ) );
    public final void rule__Simple_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1346:1: ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__FunctionAssignment_1 ) ) | ( ( rule__Simple_statement__Function_noargsAssignment_2 ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 22:
                case 28:
                case 29:
                case 31:
                    {
                    alt4=1;
                    }
                    break;
                case 33:
                    {
                    alt4=2;
                    }
                    break;
                case EOF:
                case 24:
                case 26:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:1347:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    {
                    // InternalPascal.g:1347:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    // InternalPascal.g:1348:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    {
                     before(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_0()); 
                    // InternalPascal.g:1349:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    // InternalPascal.g:1349:4: rule__Simple_statement__AssignmentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_statement__AssignmentAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1353:2: ( ( rule__Simple_statement__FunctionAssignment_1 ) )
                    {
                    // InternalPascal.g:1353:2: ( ( rule__Simple_statement__FunctionAssignment_1 ) )
                    // InternalPascal.g:1354:3: ( rule__Simple_statement__FunctionAssignment_1 )
                    {
                     before(grammarAccess.getSimple_statementAccess().getFunctionAssignment_1()); 
                    // InternalPascal.g:1355:3: ( rule__Simple_statement__FunctionAssignment_1 )
                    // InternalPascal.g:1355:4: rule__Simple_statement__FunctionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_statement__FunctionAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_statementAccess().getFunctionAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1359:2: ( ( rule__Simple_statement__Function_noargsAssignment_2 ) )
                    {
                    // InternalPascal.g:1359:2: ( ( rule__Simple_statement__Function_noargsAssignment_2 ) )
                    // InternalPascal.g:1360:3: ( rule__Simple_statement__Function_noargsAssignment_2 )
                    {
                     before(grammarAccess.getSimple_statementAccess().getFunction_noargsAssignment_2()); 
                    // InternalPascal.g:1361:3: ( rule__Simple_statement__Function_noargsAssignment_2 )
                    // InternalPascal.g:1361:4: rule__Simple_statement__Function_noargsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_statement__Function_noargsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_statementAccess().getFunction_noargsAssignment_2()); 

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
    // $ANTLR end "rule__Simple_statement__Alternatives"


    // $ANTLR start "rule__Label__Alternatives"
    // InternalPascal.g:1369:1: rule__Label__Alternatives : ( ( ( rule__Label__NumberAssignment_0 ) ) | ( ( rule__Label__NumberAssignment_1 ) ) );
    public final void rule__Label__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1373:1: ( ( ( rule__Label__NumberAssignment_0 ) ) | ( ( rule__Label__NumberAssignment_1 ) ) )
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
                    // InternalPascal.g:1374:2: ( ( rule__Label__NumberAssignment_0 ) )
                    {
                    // InternalPascal.g:1374:2: ( ( rule__Label__NumberAssignment_0 ) )
                    // InternalPascal.g:1375:3: ( rule__Label__NumberAssignment_0 )
                    {
                     before(grammarAccess.getLabelAccess().getNumberAssignment_0()); 
                    // InternalPascal.g:1376:3: ( rule__Label__NumberAssignment_0 )
                    // InternalPascal.g:1376:4: rule__Label__NumberAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Label__NumberAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLabelAccess().getNumberAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1380:2: ( ( rule__Label__NumberAssignment_1 ) )
                    {
                    // InternalPascal.g:1380:2: ( ( rule__Label__NumberAssignment_1 ) )
                    // InternalPascal.g:1381:3: ( rule__Label__NumberAssignment_1 )
                    {
                     before(grammarAccess.getLabelAccess().getNumberAssignment_1()); 
                    // InternalPascal.g:1382:3: ( rule__Label__NumberAssignment_1 )
                    // InternalPascal.g:1382:4: rule__Label__NumberAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Label__NumberAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLabelAccess().getNumberAssignment_1()); 

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
    // $ANTLR end "rule__Label__Alternatives"


    // $ANTLR start "rule__Var___Alternatives"
    // InternalPascal.g:1390:1: rule__Var___Alternatives : ( ( ( rule__Var___Group_0__0 ) ) | ( ( rule__Var___Group_1__0 ) ) | ( ( rule__Var___Group_2__0 ) ) );
    public final void rule__Var___Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1394:1: ( ( ( rule__Var___Group_0__0 ) ) | ( ( rule__Var___Group_1__0 ) ) | ( ( rule__Var___Group_2__0 ) ) )
            int alt6=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPascal.g:1395:2: ( ( rule__Var___Group_0__0 ) )
                    {
                    // InternalPascal.g:1395:2: ( ( rule__Var___Group_0__0 ) )
                    // InternalPascal.g:1396:3: ( rule__Var___Group_0__0 )
                    {
                     before(grammarAccess.getVar_Access().getGroup_0()); 
                    // InternalPascal.g:1397:3: ( rule__Var___Group_0__0 )
                    // InternalPascal.g:1397:4: rule__Var___Group_0__0
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
                    // InternalPascal.g:1401:2: ( ( rule__Var___Group_1__0 ) )
                    {
                    // InternalPascal.g:1401:2: ( ( rule__Var___Group_1__0 ) )
                    // InternalPascal.g:1402:3: ( rule__Var___Group_1__0 )
                    {
                     before(grammarAccess.getVar_Access().getGroup_1()); 
                    // InternalPascal.g:1403:3: ( rule__Var___Group_1__0 )
                    // InternalPascal.g:1403:4: rule__Var___Group_1__0
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
                    // InternalPascal.g:1407:2: ( ( rule__Var___Group_2__0 ) )
                    {
                    // InternalPascal.g:1407:2: ( ( rule__Var___Group_2__0 ) )
                    // InternalPascal.g:1408:3: ( rule__Var___Group_2__0 )
                    {
                     before(grammarAccess.getVar_Access().getGroup_2()); 
                    // InternalPascal.g:1409:3: ( rule__Var___Group_2__0 )
                    // InternalPascal.g:1409:4: rule__Var___Group_2__0
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
    // InternalPascal.g:1417:1: rule__Expression__Alternatives_1_0 : ( ( ( rule__Expression__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_2 ) ) );
    public final void rule__Expression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1421:1: ( ( ( rule__Expression__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_2 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_RELATIONAL_OP:
                {
                alt7=1;
                }
                break;
            case 46:
                {
                alt7=2;
                }
                break;
            case 41:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPascal.g:1422:2: ( ( rule__Expression__OperatorsAssignment_1_0_0 ) )
                    {
                    // InternalPascal.g:1422:2: ( ( rule__Expression__OperatorsAssignment_1_0_0 ) )
                    // InternalPascal.g:1423:3: ( rule__Expression__OperatorsAssignment_1_0_0 )
                    {
                     before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_0()); 
                    // InternalPascal.g:1424:3: ( rule__Expression__OperatorsAssignment_1_0_0 )
                    // InternalPascal.g:1424:4: rule__Expression__OperatorsAssignment_1_0_0
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
                    // InternalPascal.g:1428:2: ( ( rule__Expression__OperatorsAssignment_1_0_1 ) )
                    {
                    // InternalPascal.g:1428:2: ( ( rule__Expression__OperatorsAssignment_1_0_1 ) )
                    // InternalPascal.g:1429:3: ( rule__Expression__OperatorsAssignment_1_0_1 )
                    {
                     before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_1()); 
                    // InternalPascal.g:1430:3: ( rule__Expression__OperatorsAssignment_1_0_1 )
                    // InternalPascal.g:1430:4: rule__Expression__OperatorsAssignment_1_0_1
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
                    // InternalPascal.g:1434:2: ( ( rule__Expression__OperatorsAssignment_1_0_2 ) )
                    {
                    // InternalPascal.g:1434:2: ( ( rule__Expression__OperatorsAssignment_1_0_2 ) )
                    // InternalPascal.g:1435:3: ( rule__Expression__OperatorsAssignment_1_0_2 )
                    {
                     before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_2()); 
                    // InternalPascal.g:1436:3: ( rule__Expression__OperatorsAssignment_1_0_2 )
                    // InternalPascal.g:1436:4: rule__Expression__OperatorsAssignment_1_0_2
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
    // InternalPascal.g:1444:1: rule__Simple_expression__Alternatives_2 : ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( ( rule__Simple_expression__TermsAssignment_2_1 ) ) );
    public final void rule__Simple_expression__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1448:1: ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( ( rule__Simple_expression__TermsAssignment_2_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ADDITION_OP||LA8_0==47) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INTEGER_NUMBER||LA8_0==RULE_REAL_NUMBER) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPascal.g:1449:2: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    {
                    // InternalPascal.g:1449:2: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    // InternalPascal.g:1450:3: ( rule__Simple_expression__Group_2_0__0 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getGroup_2_0()); 
                    // InternalPascal.g:1451:3: ( rule__Simple_expression__Group_2_0__0 )
                    // InternalPascal.g:1451:4: rule__Simple_expression__Group_2_0__0
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
                    // InternalPascal.g:1455:2: ( ( rule__Simple_expression__TermsAssignment_2_1 ) )
                    {
                    // InternalPascal.g:1455:2: ( ( rule__Simple_expression__TermsAssignment_2_1 ) )
                    // InternalPascal.g:1456:3: ( rule__Simple_expression__TermsAssignment_2_1 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_1()); 
                    // InternalPascal.g:1457:3: ( rule__Simple_expression__TermsAssignment_2_1 )
                    // InternalPascal.g:1457:4: rule__Simple_expression__TermsAssignment_2_1
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
    // InternalPascal.g:1465:1: rule__Simple_expression__Alternatives_2_0_0 : ( ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) ) | ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) ) );
    public final void rule__Simple_expression__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1469:1: ( ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) ) | ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ADDITION_OP) ) {
                alt9=1;
            }
            else if ( (LA9_0==47) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:1470:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) )
                    {
                    // InternalPascal.g:1470:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) )
                    // InternalPascal.g:1471:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_0()); 
                    // InternalPascal.g:1472:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 )
                    // InternalPascal.g:1472:4: rule__Simple_expression__OperatorsAssignment_2_0_0_0
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
                    // InternalPascal.g:1476:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) )
                    {
                    // InternalPascal.g:1476:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) )
                    // InternalPascal.g:1477:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_1()); 
                    // InternalPascal.g:1478:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 )
                    // InternalPascal.g:1478:4: rule__Simple_expression__OperatorsAssignment_2_0_0_1
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
    // InternalPascal.g:1486:1: rule__Term__Alternatives_1_0 : ( ( ( rule__Term__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_2 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_3 ) ) );
    public final void rule__Term__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1490:1: ( ( ( rule__Term__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_2 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_3 ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_MULTIPLICATION_OP:
                {
                alt10=1;
                }
                break;
            case 48:
                {
                alt10=2;
                }
                break;
            case 49:
                {
                alt10=3;
                }
                break;
            case 50:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalPascal.g:1491:2: ( ( rule__Term__OperatorsAssignment_1_0_0 ) )
                    {
                    // InternalPascal.g:1491:2: ( ( rule__Term__OperatorsAssignment_1_0_0 ) )
                    // InternalPascal.g:1492:3: ( rule__Term__OperatorsAssignment_1_0_0 )
                    {
                     before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_0()); 
                    // InternalPascal.g:1493:3: ( rule__Term__OperatorsAssignment_1_0_0 )
                    // InternalPascal.g:1493:4: rule__Term__OperatorsAssignment_1_0_0
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
                    // InternalPascal.g:1497:2: ( ( rule__Term__OperatorsAssignment_1_0_1 ) )
                    {
                    // InternalPascal.g:1497:2: ( ( rule__Term__OperatorsAssignment_1_0_1 ) )
                    // InternalPascal.g:1498:3: ( rule__Term__OperatorsAssignment_1_0_1 )
                    {
                     before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_1()); 
                    // InternalPascal.g:1499:3: ( rule__Term__OperatorsAssignment_1_0_1 )
                    // InternalPascal.g:1499:4: rule__Term__OperatorsAssignment_1_0_1
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
                    // InternalPascal.g:1503:2: ( ( rule__Term__OperatorsAssignment_1_0_2 ) )
                    {
                    // InternalPascal.g:1503:2: ( ( rule__Term__OperatorsAssignment_1_0_2 ) )
                    // InternalPascal.g:1504:3: ( rule__Term__OperatorsAssignment_1_0_2 )
                    {
                     before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_2()); 
                    // InternalPascal.g:1505:3: ( rule__Term__OperatorsAssignment_1_0_2 )
                    // InternalPascal.g:1505:4: rule__Term__OperatorsAssignment_1_0_2
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
                    // InternalPascal.g:1509:2: ( ( rule__Term__OperatorsAssignment_1_0_3 ) )
                    {
                    // InternalPascal.g:1509:2: ( ( rule__Term__OperatorsAssignment_1_0_3 ) )
                    // InternalPascal.g:1510:3: ( rule__Term__OperatorsAssignment_1_0_3 )
                    {
                     before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_3()); 
                    // InternalPascal.g:1511:3: ( rule__Term__OperatorsAssignment_1_0_3 )
                    // InternalPascal.g:1511:4: rule__Term__OperatorsAssignment_1_0_3
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
    // InternalPascal.g:1519:1: rule__Factor__Alternatives : ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__FunctionAssignment_7 ) ) | ( ( rule__Factor__Group_8__0 ) ) | ( ( rule__Factor__Group_9__0 ) ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1523:1: ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__FunctionAssignment_7 ) ) | ( ( rule__Factor__Group_8__0 ) ) | ( ( rule__Factor__Group_9__0 ) ) )
            int alt11=10;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalPascal.g:1524:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    {
                    // InternalPascal.g:1524:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    // InternalPascal.g:1525:3: ( rule__Factor__VariableAssignment_0 )
                    {
                     before(grammarAccess.getFactorAccess().getVariableAssignment_0()); 
                    // InternalPascal.g:1526:3: ( rule__Factor__VariableAssignment_0 )
                    // InternalPascal.g:1526:4: rule__Factor__VariableAssignment_0
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
                    // InternalPascal.g:1530:2: ( ( rule__Factor__NumberAssignment_1 ) )
                    {
                    // InternalPascal.g:1530:2: ( ( rule__Factor__NumberAssignment_1 ) )
                    // InternalPascal.g:1531:3: ( rule__Factor__NumberAssignment_1 )
                    {
                     before(grammarAccess.getFactorAccess().getNumberAssignment_1()); 
                    // InternalPascal.g:1532:3: ( rule__Factor__NumberAssignment_1 )
                    // InternalPascal.g:1532:4: rule__Factor__NumberAssignment_1
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
                    // InternalPascal.g:1536:2: ( ( rule__Factor__StringAssignment_2 ) )
                    {
                    // InternalPascal.g:1536:2: ( ( rule__Factor__StringAssignment_2 ) )
                    // InternalPascal.g:1537:3: ( rule__Factor__StringAssignment_2 )
                    {
                     before(grammarAccess.getFactorAccess().getStringAssignment_2()); 
                    // InternalPascal.g:1538:3: ( rule__Factor__StringAssignment_2 )
                    // InternalPascal.g:1538:4: rule__Factor__StringAssignment_2
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
                    // InternalPascal.g:1542:2: ( ( rule__Factor__SetAssignment_3 ) )
                    {
                    // InternalPascal.g:1542:2: ( ( rule__Factor__SetAssignment_3 ) )
                    // InternalPascal.g:1543:3: ( rule__Factor__SetAssignment_3 )
                    {
                     before(grammarAccess.getFactorAccess().getSetAssignment_3()); 
                    // InternalPascal.g:1544:3: ( rule__Factor__SetAssignment_3 )
                    // InternalPascal.g:1544:4: rule__Factor__SetAssignment_3
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
                    // InternalPascal.g:1548:2: ( ( rule__Factor__NilAssignment_4 ) )
                    {
                    // InternalPascal.g:1548:2: ( ( rule__Factor__NilAssignment_4 ) )
                    // InternalPascal.g:1549:3: ( rule__Factor__NilAssignment_4 )
                    {
                     before(grammarAccess.getFactorAccess().getNilAssignment_4()); 
                    // InternalPascal.g:1550:3: ( rule__Factor__NilAssignment_4 )
                    // InternalPascal.g:1550:4: rule__Factor__NilAssignment_4
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
                    // InternalPascal.g:1554:2: ( ( rule__Factor__BooleanAssignment_5 ) )
                    {
                    // InternalPascal.g:1554:2: ( ( rule__Factor__BooleanAssignment_5 ) )
                    // InternalPascal.g:1555:3: ( rule__Factor__BooleanAssignment_5 )
                    {
                     before(grammarAccess.getFactorAccess().getBooleanAssignment_5()); 
                    // InternalPascal.g:1556:3: ( rule__Factor__BooleanAssignment_5 )
                    // InternalPascal.g:1556:4: rule__Factor__BooleanAssignment_5
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
                    // InternalPascal.g:1560:2: ( ( rule__Factor__BooleanAssignment_6 ) )
                    {
                    // InternalPascal.g:1560:2: ( ( rule__Factor__BooleanAssignment_6 ) )
                    // InternalPascal.g:1561:3: ( rule__Factor__BooleanAssignment_6 )
                    {
                     before(grammarAccess.getFactorAccess().getBooleanAssignment_6()); 
                    // InternalPascal.g:1562:3: ( rule__Factor__BooleanAssignment_6 )
                    // InternalPascal.g:1562:4: rule__Factor__BooleanAssignment_6
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
                    // InternalPascal.g:1566:2: ( ( rule__Factor__FunctionAssignment_7 ) )
                    {
                    // InternalPascal.g:1566:2: ( ( rule__Factor__FunctionAssignment_7 ) )
                    // InternalPascal.g:1567:3: ( rule__Factor__FunctionAssignment_7 )
                    {
                     before(grammarAccess.getFactorAccess().getFunctionAssignment_7()); 
                    // InternalPascal.g:1568:3: ( rule__Factor__FunctionAssignment_7 )
                    // InternalPascal.g:1568:4: rule__Factor__FunctionAssignment_7
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
                    // InternalPascal.g:1572:2: ( ( rule__Factor__Group_8__0 ) )
                    {
                    // InternalPascal.g:1572:2: ( ( rule__Factor__Group_8__0 ) )
                    // InternalPascal.g:1573:3: ( rule__Factor__Group_8__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_8()); 
                    // InternalPascal.g:1574:3: ( rule__Factor__Group_8__0 )
                    // InternalPascal.g:1574:4: rule__Factor__Group_8__0
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
                    // InternalPascal.g:1578:2: ( ( rule__Factor__Group_9__0 ) )
                    {
                    // InternalPascal.g:1578:2: ( ( rule__Factor__Group_9__0 ) )
                    // InternalPascal.g:1579:3: ( rule__Factor__Group_9__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_9()); 
                    // InternalPascal.g:1580:3: ( rule__Factor__Group_9__0 )
                    // InternalPascal.g:1580:4: rule__Factor__Group_9__0
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


    // $ANTLR start "rule__Function_procedure_declaration__Alternatives_0"
    // InternalPascal.g:1588:1: rule__Function_procedure_declaration__Alternatives_0 : ( ( ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 ) ) | ( ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 ) ) );
    public final void rule__Function_procedure_declaration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1592:1: ( ( ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 ) ) | ( ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            else if ( (LA12_0==38) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalPascal.g:1593:2: ( ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 ) )
                    {
                    // InternalPascal.g:1593:2: ( ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 ) )
                    // InternalPascal.g:1594:3: ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 )
                    {
                     before(grammarAccess.getFunction_procedure_declarationAccess().getProceduresAssignment_0_0()); 
                    // InternalPascal.g:1595:3: ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 )
                    // InternalPascal.g:1595:4: rule__Function_procedure_declaration__ProceduresAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function_procedure_declaration__ProceduresAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunction_procedure_declarationAccess().getProceduresAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1599:2: ( ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 ) )
                    {
                    // InternalPascal.g:1599:2: ( ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 ) )
                    // InternalPascal.g:1600:3: ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 )
                    {
                     before(grammarAccess.getFunction_procedure_declarationAccess().getFunctionsAssignment_0_1()); 
                    // InternalPascal.g:1601:3: ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 )
                    // InternalPascal.g:1601:4: rule__Function_procedure_declaration__FunctionsAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function_procedure_declaration__FunctionsAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunction_procedure_declarationAccess().getFunctionsAssignment_0_1()); 

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
    // $ANTLR end "rule__Function_procedure_declaration__Alternatives_0"


    // $ANTLR start "rule__Formal_parameter_section__Alternatives"
    // InternalPascal.g:1609:1: rule__Formal_parameter_section__Alternatives : ( ( ( rule__Formal_parameter_section__ValueAssignment_0 ) ) | ( ( rule__Formal_parameter_section__VariableAssignment_1 ) ) | ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) ) | ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) ) );
    public final void rule__Formal_parameter_section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1613:1: ( ( ( rule__Formal_parameter_section__ValueAssignment_0 ) ) | ( ( rule__Formal_parameter_section__VariableAssignment_1 ) ) | ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) ) | ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case 37:
                {
                alt13=2;
                }
                break;
            case 38:
                {
                alt13=3;
                }
                break;
            case 36:
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
                    // InternalPascal.g:1614:2: ( ( rule__Formal_parameter_section__ValueAssignment_0 ) )
                    {
                    // InternalPascal.g:1614:2: ( ( rule__Formal_parameter_section__ValueAssignment_0 ) )
                    // InternalPascal.g:1615:3: ( rule__Formal_parameter_section__ValueAssignment_0 )
                    {
                     before(grammarAccess.getFormal_parameter_sectionAccess().getValueAssignment_0()); 
                    // InternalPascal.g:1616:3: ( rule__Formal_parameter_section__ValueAssignment_0 )
                    // InternalPascal.g:1616:4: rule__Formal_parameter_section__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formal_parameter_section__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormal_parameter_sectionAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1620:2: ( ( rule__Formal_parameter_section__VariableAssignment_1 ) )
                    {
                    // InternalPascal.g:1620:2: ( ( rule__Formal_parameter_section__VariableAssignment_1 ) )
                    // InternalPascal.g:1621:3: ( rule__Formal_parameter_section__VariableAssignment_1 )
                    {
                     before(grammarAccess.getFormal_parameter_sectionAccess().getVariableAssignment_1()); 
                    // InternalPascal.g:1622:3: ( rule__Formal_parameter_section__VariableAssignment_1 )
                    // InternalPascal.g:1622:4: rule__Formal_parameter_section__VariableAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formal_parameter_section__VariableAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormal_parameter_sectionAccess().getVariableAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1626:2: ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) )
                    {
                    // InternalPascal.g:1626:2: ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) )
                    // InternalPascal.g:1627:3: ( rule__Formal_parameter_section__ProcedureAssignment_2 )
                    {
                     before(grammarAccess.getFormal_parameter_sectionAccess().getProcedureAssignment_2()); 
                    // InternalPascal.g:1628:3: ( rule__Formal_parameter_section__ProcedureAssignment_2 )
                    // InternalPascal.g:1628:4: rule__Formal_parameter_section__ProcedureAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formal_parameter_section__ProcedureAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormal_parameter_sectionAccess().getProcedureAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1632:2: ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) )
                    {
                    // InternalPascal.g:1632:2: ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) )
                    // InternalPascal.g:1633:3: ( rule__Formal_parameter_section__FunctionAssignment_3 )
                    {
                     before(grammarAccess.getFormal_parameter_sectionAccess().getFunctionAssignment_3()); 
                    // InternalPascal.g:1634:3: ( rule__Formal_parameter_section__FunctionAssignment_3 )
                    // InternalPascal.g:1634:4: rule__Formal_parameter_section__FunctionAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formal_parameter_section__FunctionAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormal_parameter_sectionAccess().getFunctionAssignment_3()); 

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
    // $ANTLR end "rule__Formal_parameter_section__Alternatives"


    // $ANTLR start "rule__Any_number__Alternatives"
    // InternalPascal.g:1642:1: rule__Any_number__Alternatives : ( ( ruleunsigned_number ) | ( rulesigned_number ) );
    public final void rule__Any_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1646:1: ( ( ruleunsigned_number ) | ( rulesigned_number ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INTEGER_NUMBER||LA14_0==RULE_REAL_NUMBER) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_SIGNED_INTEGER_NUMBER||LA14_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalPascal.g:1647:2: ( ruleunsigned_number )
                    {
                    // InternalPascal.g:1647:2: ( ruleunsigned_number )
                    // InternalPascal.g:1648:3: ruleunsigned_number
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
                    // InternalPascal.g:1653:2: ( rulesigned_number )
                    {
                    // InternalPascal.g:1653:2: ( rulesigned_number )
                    // InternalPascal.g:1654:3: rulesigned_number
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


    // $ANTLR start "rule__Constant__Alternatives"
    // InternalPascal.g:1663:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__StringAssignment_1 ) ) | ( ( rule__Constant__BoolLiteralAssignment_2 ) ) | ( ( rule__Constant__BoolLiteralAssignment_3 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1667:1: ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__StringAssignment_1 ) ) | ( ( rule__Constant__BoolLiteralAssignment_2 ) ) | ( ( rule__Constant__BoolLiteralAssignment_3 ) ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OP:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_REAL_NUMBER:
                {
                alt15=1;
                }
                break;
            case RULE_STRING:
                {
                alt15=2;
                }
                break;
            case 52:
                {
                alt15=3;
                }
                break;
            case 53:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalPascal.g:1668:2: ( ( rule__Constant__Group_0__0 ) )
                    {
                    // InternalPascal.g:1668:2: ( ( rule__Constant__Group_0__0 ) )
                    // InternalPascal.g:1669:3: ( rule__Constant__Group_0__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_0()); 
                    // InternalPascal.g:1670:3: ( rule__Constant__Group_0__0 )
                    // InternalPascal.g:1670:4: rule__Constant__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1674:2: ( ( rule__Constant__StringAssignment_1 ) )
                    {
                    // InternalPascal.g:1674:2: ( ( rule__Constant__StringAssignment_1 ) )
                    // InternalPascal.g:1675:3: ( rule__Constant__StringAssignment_1 )
                    {
                     before(grammarAccess.getConstantAccess().getStringAssignment_1()); 
                    // InternalPascal.g:1676:3: ( rule__Constant__StringAssignment_1 )
                    // InternalPascal.g:1676:4: rule__Constant__StringAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__StringAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getStringAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1680:2: ( ( rule__Constant__BoolLiteralAssignment_2 ) )
                    {
                    // InternalPascal.g:1680:2: ( ( rule__Constant__BoolLiteralAssignment_2 ) )
                    // InternalPascal.g:1681:3: ( rule__Constant__BoolLiteralAssignment_2 )
                    {
                     before(grammarAccess.getConstantAccess().getBoolLiteralAssignment_2()); 
                    // InternalPascal.g:1682:3: ( rule__Constant__BoolLiteralAssignment_2 )
                    // InternalPascal.g:1682:4: rule__Constant__BoolLiteralAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__BoolLiteralAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getBoolLiteralAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1686:2: ( ( rule__Constant__BoolLiteralAssignment_3 ) )
                    {
                    // InternalPascal.g:1686:2: ( ( rule__Constant__BoolLiteralAssignment_3 ) )
                    // InternalPascal.g:1687:3: ( rule__Constant__BoolLiteralAssignment_3 )
                    {
                     before(grammarAccess.getConstantAccess().getBoolLiteralAssignment_3()); 
                    // InternalPascal.g:1688:3: ( rule__Constant__BoolLiteralAssignment_3 )
                    // InternalPascal.g:1688:4: rule__Constant__BoolLiteralAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__BoolLiteralAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getBoolLiteralAssignment_3()); 

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
    // $ANTLR end "rule__Constant__Alternatives"


    // $ANTLR start "rule__Constant__Alternatives_0_1"
    // InternalPascal.g:1696:1: rule__Constant__Alternatives_0_1 : ( ( ( rule__Constant__NameAssignment_0_1_0 ) ) | ( ( rule__Constant__NumberAssignment_0_1_1 ) ) );
    public final void rule__Constant__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1700:1: ( ( ( rule__Constant__NameAssignment_0_1_0 ) ) | ( ( rule__Constant__NumberAssignment_0_1_1 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=RULE_SIGNED_INTEGER_NUMBER && LA16_0<=RULE_INTEGER_NUMBER)||(LA16_0>=RULE_SIGNED_REAL_NUMBER && LA16_0<=RULE_REAL_NUMBER)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalPascal.g:1701:2: ( ( rule__Constant__NameAssignment_0_1_0 ) )
                    {
                    // InternalPascal.g:1701:2: ( ( rule__Constant__NameAssignment_0_1_0 ) )
                    // InternalPascal.g:1702:3: ( rule__Constant__NameAssignment_0_1_0 )
                    {
                     before(grammarAccess.getConstantAccess().getNameAssignment_0_1_0()); 
                    // InternalPascal.g:1703:3: ( rule__Constant__NameAssignment_0_1_0 )
                    // InternalPascal.g:1703:4: rule__Constant__NameAssignment_0_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__NameAssignment_0_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getNameAssignment_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1707:2: ( ( rule__Constant__NumberAssignment_0_1_1 ) )
                    {
                    // InternalPascal.g:1707:2: ( ( rule__Constant__NumberAssignment_0_1_1 ) )
                    // InternalPascal.g:1708:3: ( rule__Constant__NumberAssignment_0_1_1 )
                    {
                     before(grammarAccess.getConstantAccess().getNumberAssignment_0_1_1()); 
                    // InternalPascal.g:1709:3: ( rule__Constant__NumberAssignment_0_1_1 )
                    // InternalPascal.g:1709:4: rule__Constant__NumberAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__NumberAssignment_0_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getNumberAssignment_0_1_1()); 

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
    // $ANTLR end "rule__Constant__Alternatives_0_1"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalPascal.g:1717:1: rule__Type__Alternatives : ( ( ( rule__Type__SimpleAssignment_0 ) ) | ( ( rule__Type__StructuredAssignment_1 ) ) | ( ( rule__Type__PointerAssignment_2 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1721:1: ( ( ( rule__Type__SimpleAssignment_0 ) ) | ( ( rule__Type__StructuredAssignment_1 ) ) | ( ( rule__Type__PointerAssignment_2 ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OP:
            case RULE_STRING:
            case RULE_NUMERIC_SUBRANGE:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_REAL_NUMBER:
            case 33:
            case 52:
            case 53:
                {
                alt17=1;
                }
                break;
            case 44:
            case 54:
                {
                alt17=2;
                }
                break;
            case 31:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalPascal.g:1722:2: ( ( rule__Type__SimpleAssignment_0 ) )
                    {
                    // InternalPascal.g:1722:2: ( ( rule__Type__SimpleAssignment_0 ) )
                    // InternalPascal.g:1723:3: ( rule__Type__SimpleAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getSimpleAssignment_0()); 
                    // InternalPascal.g:1724:3: ( rule__Type__SimpleAssignment_0 )
                    // InternalPascal.g:1724:4: rule__Type__SimpleAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__SimpleAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getSimpleAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1728:2: ( ( rule__Type__StructuredAssignment_1 ) )
                    {
                    // InternalPascal.g:1728:2: ( ( rule__Type__StructuredAssignment_1 ) )
                    // InternalPascal.g:1729:3: ( rule__Type__StructuredAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getStructuredAssignment_1()); 
                    // InternalPascal.g:1730:3: ( rule__Type__StructuredAssignment_1 )
                    // InternalPascal.g:1730:4: rule__Type__StructuredAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__StructuredAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getStructuredAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1734:2: ( ( rule__Type__PointerAssignment_2 ) )
                    {
                    // InternalPascal.g:1734:2: ( ( rule__Type__PointerAssignment_2 ) )
                    // InternalPascal.g:1735:3: ( rule__Type__PointerAssignment_2 )
                    {
                     before(grammarAccess.getTypeAccess().getPointerAssignment_2()); 
                    // InternalPascal.g:1736:3: ( rule__Type__PointerAssignment_2 )
                    // InternalPascal.g:1736:4: rule__Type__PointerAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__PointerAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getPointerAssignment_2()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Simple_type__Alternatives"
    // InternalPascal.g:1744:1: rule__Simple_type__Alternatives : ( ( ( rule__Simple_type__SubrangeAssignment_0 ) ) | ( ( rule__Simple_type__EnumeratedAssignment_1 ) ) | ( ( rule__Simple_type__NameAssignment_2 ) ) );
    public final void rule__Simple_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1748:1: ( ( ( rule__Simple_type__SubrangeAssignment_0 ) ) | ( ( rule__Simple_type__EnumeratedAssignment_1 ) ) | ( ( rule__Simple_type__NameAssignment_2 ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OP:
            case RULE_STRING:
            case RULE_NUMERIC_SUBRANGE:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_REAL_NUMBER:
            case 52:
            case 53:
                {
                alt18=1;
                }
                break;
            case RULE_ID:
                {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==EOF||LA18_2==24) ) {
                    alt18=3;
                }
                else if ( (LA18_2==43) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                alt18=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalPascal.g:1749:2: ( ( rule__Simple_type__SubrangeAssignment_0 ) )
                    {
                    // InternalPascal.g:1749:2: ( ( rule__Simple_type__SubrangeAssignment_0 ) )
                    // InternalPascal.g:1750:3: ( rule__Simple_type__SubrangeAssignment_0 )
                    {
                     before(grammarAccess.getSimple_typeAccess().getSubrangeAssignment_0()); 
                    // InternalPascal.g:1751:3: ( rule__Simple_type__SubrangeAssignment_0 )
                    // InternalPascal.g:1751:4: rule__Simple_type__SubrangeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_type__SubrangeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_typeAccess().getSubrangeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1755:2: ( ( rule__Simple_type__EnumeratedAssignment_1 ) )
                    {
                    // InternalPascal.g:1755:2: ( ( rule__Simple_type__EnumeratedAssignment_1 ) )
                    // InternalPascal.g:1756:3: ( rule__Simple_type__EnumeratedAssignment_1 )
                    {
                     before(grammarAccess.getSimple_typeAccess().getEnumeratedAssignment_1()); 
                    // InternalPascal.g:1757:3: ( rule__Simple_type__EnumeratedAssignment_1 )
                    // InternalPascal.g:1757:4: rule__Simple_type__EnumeratedAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_type__EnumeratedAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_typeAccess().getEnumeratedAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1761:2: ( ( rule__Simple_type__NameAssignment_2 ) )
                    {
                    // InternalPascal.g:1761:2: ( ( rule__Simple_type__NameAssignment_2 ) )
                    // InternalPascal.g:1762:3: ( rule__Simple_type__NameAssignment_2 )
                    {
                     before(grammarAccess.getSimple_typeAccess().getNameAssignment_2()); 
                    // InternalPascal.g:1763:3: ( rule__Simple_type__NameAssignment_2 )
                    // InternalPascal.g:1763:4: rule__Simple_type__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_type__NameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_typeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Simple_type__Alternatives"


    // $ANTLR start "rule__Subrange_type__Alternatives"
    // InternalPascal.g:1771:1: rule__Subrange_type__Alternatives : ( ( ( rule__Subrange_type__Group_0__0 ) ) | ( ( rule__Subrange_type__Group_1__0 ) ) );
    public final void rule__Subrange_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1775:1: ( ( ( rule__Subrange_type__Group_0__0 ) ) | ( ( rule__Subrange_type__Group_1__0 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_INTEGER_NUMBER)||LA19_0==RULE_ADDITION_OP||LA19_0==RULE_STRING||(LA19_0>=RULE_SIGNED_REAL_NUMBER && LA19_0<=RULE_REAL_NUMBER)||(LA19_0>=52 && LA19_0<=53)) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_NUMERIC_SUBRANGE) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalPascal.g:1776:2: ( ( rule__Subrange_type__Group_0__0 ) )
                    {
                    // InternalPascal.g:1776:2: ( ( rule__Subrange_type__Group_0__0 ) )
                    // InternalPascal.g:1777:3: ( rule__Subrange_type__Group_0__0 )
                    {
                     before(grammarAccess.getSubrange_typeAccess().getGroup_0()); 
                    // InternalPascal.g:1778:3: ( rule__Subrange_type__Group_0__0 )
                    // InternalPascal.g:1778:4: rule__Subrange_type__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subrange_type__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubrange_typeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1782:2: ( ( rule__Subrange_type__Group_1__0 ) )
                    {
                    // InternalPascal.g:1782:2: ( ( rule__Subrange_type__Group_1__0 ) )
                    // InternalPascal.g:1783:3: ( rule__Subrange_type__Group_1__0 )
                    {
                     before(grammarAccess.getSubrange_typeAccess().getGroup_1()); 
                    // InternalPascal.g:1784:3: ( rule__Subrange_type__Group_1__0 )
                    // InternalPascal.g:1784:4: rule__Subrange_type__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subrange_type__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubrange_typeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Subrange_type__Alternatives"


    // $ANTLR start "rule__Signed_number__Alternatives"
    // InternalPascal.g:1792:1: rule__Signed_number__Alternatives : ( ( ( rule__Signed_number__IntegerAssignment_0 ) ) | ( ( rule__Signed_number__RealAssignment_1 ) ) );
    public final void rule__Signed_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1796:1: ( ( ( rule__Signed_number__IntegerAssignment_0 ) ) | ( ( rule__Signed_number__RealAssignment_1 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalPascal.g:1797:2: ( ( rule__Signed_number__IntegerAssignment_0 ) )
                    {
                    // InternalPascal.g:1797:2: ( ( rule__Signed_number__IntegerAssignment_0 ) )
                    // InternalPascal.g:1798:3: ( rule__Signed_number__IntegerAssignment_0 )
                    {
                     before(grammarAccess.getSigned_numberAccess().getIntegerAssignment_0()); 
                    // InternalPascal.g:1799:3: ( rule__Signed_number__IntegerAssignment_0 )
                    // InternalPascal.g:1799:4: rule__Signed_number__IntegerAssignment_0
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
                    // InternalPascal.g:1803:2: ( ( rule__Signed_number__RealAssignment_1 ) )
                    {
                    // InternalPascal.g:1803:2: ( ( rule__Signed_number__RealAssignment_1 ) )
                    // InternalPascal.g:1804:3: ( rule__Signed_number__RealAssignment_1 )
                    {
                     before(grammarAccess.getSigned_numberAccess().getRealAssignment_1()); 
                    // InternalPascal.g:1805:3: ( rule__Signed_number__RealAssignment_1 )
                    // InternalPascal.g:1805:4: rule__Signed_number__RealAssignment_1
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
    // InternalPascal.g:1813:1: rule__Unsigned_number__Alternatives : ( ( ( rule__Unsigned_number__IntegerAssignment_0 ) ) | ( ( rule__Unsigned_number__RealAssignment_1 ) ) );
    public final void rule__Unsigned_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1817:1: ( ( ( rule__Unsigned_number__IntegerAssignment_0 ) ) | ( ( rule__Unsigned_number__RealAssignment_1 ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INTEGER_NUMBER) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_REAL_NUMBER) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalPascal.g:1818:2: ( ( rule__Unsigned_number__IntegerAssignment_0 ) )
                    {
                    // InternalPascal.g:1818:2: ( ( rule__Unsigned_number__IntegerAssignment_0 ) )
                    // InternalPascal.g:1819:3: ( rule__Unsigned_number__IntegerAssignment_0 )
                    {
                     before(grammarAccess.getUnsigned_numberAccess().getIntegerAssignment_0()); 
                    // InternalPascal.g:1820:3: ( rule__Unsigned_number__IntegerAssignment_0 )
                    // InternalPascal.g:1820:4: rule__Unsigned_number__IntegerAssignment_0
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
                    // InternalPascal.g:1824:2: ( ( rule__Unsigned_number__RealAssignment_1 ) )
                    {
                    // InternalPascal.g:1824:2: ( ( rule__Unsigned_number__RealAssignment_1 ) )
                    // InternalPascal.g:1825:3: ( rule__Unsigned_number__RealAssignment_1 )
                    {
                     before(grammarAccess.getUnsigned_numberAccess().getRealAssignment_1()); 
                    // InternalPascal.g:1826:3: ( rule__Unsigned_number__RealAssignment_1 )
                    // InternalPascal.g:1826:4: rule__Unsigned_number__RealAssignment_1
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
    // InternalPascal.g:1834:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1838:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalPascal.g:1839:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalPascal.g:1846:1: rule__Program__Group__0__Impl : ( ( rule__Program__HeadingAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1850:1: ( ( ( rule__Program__HeadingAssignment_0 ) ) )
            // InternalPascal.g:1851:1: ( ( rule__Program__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:1851:1: ( ( rule__Program__HeadingAssignment_0 ) )
            // InternalPascal.g:1852:2: ( rule__Program__HeadingAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getHeadingAssignment_0()); 
            // InternalPascal.g:1853:2: ( rule__Program__HeadingAssignment_0 )
            // InternalPascal.g:1853:3: rule__Program__HeadingAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Program__HeadingAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getHeadingAssignment_0()); 

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
    // InternalPascal.g:1861:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1865:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalPascal.g:1866:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalPascal.g:1873:1: rule__Program__Group__1__Impl : ( ( rule__Program__BlockAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1877:1: ( ( ( rule__Program__BlockAssignment_1 ) ) )
            // InternalPascal.g:1878:1: ( ( rule__Program__BlockAssignment_1 ) )
            {
            // InternalPascal.g:1878:1: ( ( rule__Program__BlockAssignment_1 ) )
            // InternalPascal.g:1879:2: ( rule__Program__BlockAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getBlockAssignment_1()); 
            // InternalPascal.g:1880:2: ( rule__Program__BlockAssignment_1 )
            // InternalPascal.g:1880:3: rule__Program__BlockAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__BlockAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getBlockAssignment_1()); 

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
    // InternalPascal.g:1888:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1892:1: ( rule__Program__Group__2__Impl )
            // InternalPascal.g:1893:2: rule__Program__Group__2__Impl
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
    // InternalPascal.g:1899:1: rule__Program__Group__2__Impl : ( '.' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1903:1: ( ( '.' ) )
            // InternalPascal.g:1904:1: ( '.' )
            {
            // InternalPascal.g:1904:1: ( '.' )
            // InternalPascal.g:1905:2: '.'
            {
             before(grammarAccess.getProgramAccess().getFullStopKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getFullStopKeyword_2()); 

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


    // $ANTLR start "rule__Program_heading_block__Group__0"
    // InternalPascal.g:1915:1: rule__Program_heading_block__Group__0 : rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 ;
    public final void rule__Program_heading_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1919:1: ( rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 )
            // InternalPascal.g:1920:2: rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Program_heading_block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group__1();

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
    // $ANTLR end "rule__Program_heading_block__Group__0"


    // $ANTLR start "rule__Program_heading_block__Group__0__Impl"
    // InternalPascal.g:1927:1: rule__Program_heading_block__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program_heading_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1931:1: ( ( 'program' ) )
            // InternalPascal.g:1932:1: ( 'program' )
            {
            // InternalPascal.g:1932:1: ( 'program' )
            // InternalPascal.g:1933:2: 'program'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 

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
    // $ANTLR end "rule__Program_heading_block__Group__0__Impl"


    // $ANTLR start "rule__Program_heading_block__Group__1"
    // InternalPascal.g:1942:1: rule__Program_heading_block__Group__1 : rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 ;
    public final void rule__Program_heading_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1946:1: ( rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 )
            // InternalPascal.g:1947:2: rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Program_heading_block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group__2();

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
    // $ANTLR end "rule__Program_heading_block__Group__1"


    // $ANTLR start "rule__Program_heading_block__Group__1__Impl"
    // InternalPascal.g:1954:1: rule__Program_heading_block__Group__1__Impl : ( ( rule__Program_heading_block__NameAssignment_1 ) ) ;
    public final void rule__Program_heading_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1958:1: ( ( ( rule__Program_heading_block__NameAssignment_1 ) ) )
            // InternalPascal.g:1959:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            {
            // InternalPascal.g:1959:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            // InternalPascal.g:1960:2: ( rule__Program_heading_block__NameAssignment_1 )
            {
             before(grammarAccess.getProgram_heading_blockAccess().getNameAssignment_1()); 
            // InternalPascal.g:1961:2: ( rule__Program_heading_block__NameAssignment_1 )
            // InternalPascal.g:1961:3: rule__Program_heading_block__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program_heading_block__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgram_heading_blockAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Program_heading_block__Group__1__Impl"


    // $ANTLR start "rule__Program_heading_block__Group__2"
    // InternalPascal.g:1969:1: rule__Program_heading_block__Group__2 : rule__Program_heading_block__Group__2__Impl ;
    public final void rule__Program_heading_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1973:1: ( rule__Program_heading_block__Group__2__Impl )
            // InternalPascal.g:1974:2: rule__Program_heading_block__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group__2__Impl();

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
    // $ANTLR end "rule__Program_heading_block__Group__2"


    // $ANTLR start "rule__Program_heading_block__Group__2__Impl"
    // InternalPascal.g:1980:1: rule__Program_heading_block__Group__2__Impl : ( ';' ) ;
    public final void rule__Program_heading_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1984:1: ( ( ';' ) )
            // InternalPascal.g:1985:1: ( ';' )
            {
            // InternalPascal.g:1985:1: ( ';' )
            // InternalPascal.g:1986:2: ';'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Program_heading_block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalPascal.g:1996:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2000:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalPascal.g:2001:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

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
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalPascal.g:2008:1: rule__Block__Group__0__Impl : ( ( rule__Block__LabelAssignment_0 )? ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2012:1: ( ( ( rule__Block__LabelAssignment_0 )? ) )
            // InternalPascal.g:2013:1: ( ( rule__Block__LabelAssignment_0 )? )
            {
            // InternalPascal.g:2013:1: ( ( rule__Block__LabelAssignment_0 )? )
            // InternalPascal.g:2014:2: ( rule__Block__LabelAssignment_0 )?
            {
             before(grammarAccess.getBlockAccess().getLabelAssignment_0()); 
            // InternalPascal.g:2015:2: ( rule__Block__LabelAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPascal.g:2015:3: rule__Block__LabelAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__LabelAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBlockAccess().getLabelAssignment_0()); 

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
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalPascal.g:2023:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2027:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalPascal.g:2028:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

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
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalPascal.g:2035:1: rule__Block__Group__1__Impl : ( ( rule__Block__TypeAssignment_1 )? ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2039:1: ( ( ( rule__Block__TypeAssignment_1 )? ) )
            // InternalPascal.g:2040:1: ( ( rule__Block__TypeAssignment_1 )? )
            {
            // InternalPascal.g:2040:1: ( ( rule__Block__TypeAssignment_1 )? )
            // InternalPascal.g:2041:2: ( rule__Block__TypeAssignment_1 )?
            {
             before(grammarAccess.getBlockAccess().getTypeAssignment_1()); 
            // InternalPascal.g:2042:2: ( rule__Block__TypeAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPascal.g:2042:3: rule__Block__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__TypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBlockAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalPascal.g:2050:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2054:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalPascal.g:2055:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__3();

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
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalPascal.g:2062:1: rule__Block__Group__2__Impl : ( ( rule__Block__VariableAssignment_2 )? ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2066:1: ( ( ( rule__Block__VariableAssignment_2 )? ) )
            // InternalPascal.g:2067:1: ( ( rule__Block__VariableAssignment_2 )? )
            {
            // InternalPascal.g:2067:1: ( ( rule__Block__VariableAssignment_2 )? )
            // InternalPascal.g:2068:2: ( rule__Block__VariableAssignment_2 )?
            {
             before(grammarAccess.getBlockAccess().getVariableAssignment_2()); 
            // InternalPascal.g:2069:2: ( rule__Block__VariableAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPascal.g:2069:3: rule__Block__VariableAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__VariableAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBlockAccess().getVariableAssignment_2()); 

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
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // InternalPascal.g:2077:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2081:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalPascal.g:2082:2: rule__Block__Group__3__Impl rule__Block__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__4();

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
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // InternalPascal.g:2089:1: rule__Block__Group__3__Impl : ( ( rule__Block__ConstantAssignment_3 )? ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2093:1: ( ( ( rule__Block__ConstantAssignment_3 )? ) )
            // InternalPascal.g:2094:1: ( ( rule__Block__ConstantAssignment_3 )? )
            {
            // InternalPascal.g:2094:1: ( ( rule__Block__ConstantAssignment_3 )? )
            // InternalPascal.g:2095:2: ( rule__Block__ConstantAssignment_3 )?
            {
             before(grammarAccess.getBlockAccess().getConstantAssignment_3()); 
            // InternalPascal.g:2096:2: ( rule__Block__ConstantAssignment_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPascal.g:2096:3: rule__Block__ConstantAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__ConstantAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBlockAccess().getConstantAssignment_3()); 

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
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Block__Group__4"
    // InternalPascal.g:2104:1: rule__Block__Group__4 : rule__Block__Group__4__Impl rule__Block__Group__5 ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2108:1: ( rule__Block__Group__4__Impl rule__Block__Group__5 )
            // InternalPascal.g:2109:2: rule__Block__Group__4__Impl rule__Block__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__5();

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
    // $ANTLR end "rule__Block__Group__4"


    // $ANTLR start "rule__Block__Group__4__Impl"
    // InternalPascal.g:2116:1: rule__Block__Group__4__Impl : ( ( rule__Block__AbstractionAssignment_4 )? ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2120:1: ( ( ( rule__Block__AbstractionAssignment_4 )? ) )
            // InternalPascal.g:2121:1: ( ( rule__Block__AbstractionAssignment_4 )? )
            {
            // InternalPascal.g:2121:1: ( ( rule__Block__AbstractionAssignment_4 )? )
            // InternalPascal.g:2122:2: ( rule__Block__AbstractionAssignment_4 )?
            {
             before(grammarAccess.getBlockAccess().getAbstractionAssignment_4()); 
            // InternalPascal.g:2123:2: ( rule__Block__AbstractionAssignment_4 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36||LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPascal.g:2123:3: rule__Block__AbstractionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__AbstractionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBlockAccess().getAbstractionAssignment_4()); 

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
    // $ANTLR end "rule__Block__Group__4__Impl"


    // $ANTLR start "rule__Block__Group__5"
    // InternalPascal.g:2131:1: rule__Block__Group__5 : rule__Block__Group__5__Impl ;
    public final void rule__Block__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2135:1: ( rule__Block__Group__5__Impl )
            // InternalPascal.g:2136:2: rule__Block__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__5__Impl();

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
    // $ANTLR end "rule__Block__Group__5"


    // $ANTLR start "rule__Block__Group__5__Impl"
    // InternalPascal.g:2142:1: rule__Block__Group__5__Impl : ( ( rule__Block__StatementAssignment_5 ) ) ;
    public final void rule__Block__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2146:1: ( ( ( rule__Block__StatementAssignment_5 ) ) )
            // InternalPascal.g:2147:1: ( ( rule__Block__StatementAssignment_5 ) )
            {
            // InternalPascal.g:2147:1: ( ( rule__Block__StatementAssignment_5 ) )
            // InternalPascal.g:2148:2: ( rule__Block__StatementAssignment_5 )
            {
             before(grammarAccess.getBlockAccess().getStatementAssignment_5()); 
            // InternalPascal.g:2149:2: ( rule__Block__StatementAssignment_5 )
            // InternalPascal.g:2149:3: rule__Block__StatementAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Block__StatementAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getStatementAssignment_5()); 

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
    // $ANTLR end "rule__Block__Group__5__Impl"


    // $ANTLR start "rule__Statement_part__Group__0"
    // InternalPascal.g:2158:1: rule__Statement_part__Group__0 : rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 ;
    public final void rule__Statement_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2162:1: ( rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 )
            // InternalPascal.g:2163:2: rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Statement_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement_part__Group__1();

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
    // $ANTLR end "rule__Statement_part__Group__0"


    // $ANTLR start "rule__Statement_part__Group__0__Impl"
    // InternalPascal.g:2170:1: rule__Statement_part__Group__0__Impl : ( 'begin' ) ;
    public final void rule__Statement_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2174:1: ( ( 'begin' ) )
            // InternalPascal.g:2175:1: ( 'begin' )
            {
            // InternalPascal.g:2175:1: ( 'begin' )
            // InternalPascal.g:2176:2: 'begin'
            {
             before(grammarAccess.getStatement_partAccess().getBeginKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStatement_partAccess().getBeginKeyword_0()); 

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
    // $ANTLR end "rule__Statement_part__Group__0__Impl"


    // $ANTLR start "rule__Statement_part__Group__1"
    // InternalPascal.g:2185:1: rule__Statement_part__Group__1 : rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 ;
    public final void rule__Statement_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2189:1: ( rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 )
            // InternalPascal.g:2190:2: rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Statement_part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement_part__Group__2();

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
    // $ANTLR end "rule__Statement_part__Group__1"


    // $ANTLR start "rule__Statement_part__Group__1__Impl"
    // InternalPascal.g:2197:1: rule__Statement_part__Group__1__Impl : ( ( rule__Statement_part__SequenceAssignment_1 ) ) ;
    public final void rule__Statement_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2201:1: ( ( ( rule__Statement_part__SequenceAssignment_1 ) ) )
            // InternalPascal.g:2202:1: ( ( rule__Statement_part__SequenceAssignment_1 ) )
            {
            // InternalPascal.g:2202:1: ( ( rule__Statement_part__SequenceAssignment_1 ) )
            // InternalPascal.g:2203:2: ( rule__Statement_part__SequenceAssignment_1 )
            {
             before(grammarAccess.getStatement_partAccess().getSequenceAssignment_1()); 
            // InternalPascal.g:2204:2: ( rule__Statement_part__SequenceAssignment_1 )
            // InternalPascal.g:2204:3: rule__Statement_part__SequenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement_part__SequenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatement_partAccess().getSequenceAssignment_1()); 

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
    // $ANTLR end "rule__Statement_part__Group__1__Impl"


    // $ANTLR start "rule__Statement_part__Group__2"
    // InternalPascal.g:2212:1: rule__Statement_part__Group__2 : rule__Statement_part__Group__2__Impl ;
    public final void rule__Statement_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2216:1: ( rule__Statement_part__Group__2__Impl )
            // InternalPascal.g:2217:2: rule__Statement_part__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement_part__Group__2__Impl();

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
    // $ANTLR end "rule__Statement_part__Group__2"


    // $ANTLR start "rule__Statement_part__Group__2__Impl"
    // InternalPascal.g:2223:1: rule__Statement_part__Group__2__Impl : ( 'end' ) ;
    public final void rule__Statement_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2227:1: ( ( 'end' ) )
            // InternalPascal.g:2228:1: ( 'end' )
            {
            // InternalPascal.g:2228:1: ( 'end' )
            // InternalPascal.g:2229:2: 'end'
            {
             before(grammarAccess.getStatement_partAccess().getEndKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStatement_partAccess().getEndKeyword_2()); 

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
    // $ANTLR end "rule__Statement_part__Group__2__Impl"


    // $ANTLR start "rule__Statement_sequence__Group__0"
    // InternalPascal.g:2239:1: rule__Statement_sequence__Group__0 : rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 ;
    public final void rule__Statement_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2243:1: ( rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 )
            // InternalPascal.g:2244:2: rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Statement_sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement_sequence__Group__1();

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
    // $ANTLR end "rule__Statement_sequence__Group__0"


    // $ANTLR start "rule__Statement_sequence__Group__0__Impl"
    // InternalPascal.g:2251:1: rule__Statement_sequence__Group__0__Impl : ( ( rule__Statement_sequence__StatementsAssignment_0 ) ) ;
    public final void rule__Statement_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2255:1: ( ( ( rule__Statement_sequence__StatementsAssignment_0 ) ) )
            // InternalPascal.g:2256:1: ( ( rule__Statement_sequence__StatementsAssignment_0 ) )
            {
            // InternalPascal.g:2256:1: ( ( rule__Statement_sequence__StatementsAssignment_0 ) )
            // InternalPascal.g:2257:2: ( rule__Statement_sequence__StatementsAssignment_0 )
            {
             before(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_0()); 
            // InternalPascal.g:2258:2: ( rule__Statement_sequence__StatementsAssignment_0 )
            // InternalPascal.g:2258:3: rule__Statement_sequence__StatementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement_sequence__StatementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_0()); 

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
    // $ANTLR end "rule__Statement_sequence__Group__0__Impl"


    // $ANTLR start "rule__Statement_sequence__Group__1"
    // InternalPascal.g:2266:1: rule__Statement_sequence__Group__1 : rule__Statement_sequence__Group__1__Impl ;
    public final void rule__Statement_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2270:1: ( rule__Statement_sequence__Group__1__Impl )
            // InternalPascal.g:2271:2: rule__Statement_sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement_sequence__Group__1__Impl();

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
    // $ANTLR end "rule__Statement_sequence__Group__1"


    // $ANTLR start "rule__Statement_sequence__Group__1__Impl"
    // InternalPascal.g:2277:1: rule__Statement_sequence__Group__1__Impl : ( ( rule__Statement_sequence__Group_1__0 )* ) ;
    public final void rule__Statement_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2281:1: ( ( ( rule__Statement_sequence__Group_1__0 )* ) )
            // InternalPascal.g:2282:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            {
            // InternalPascal.g:2282:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            // InternalPascal.g:2283:2: ( rule__Statement_sequence__Group_1__0 )*
            {
             before(grammarAccess.getStatement_sequenceAccess().getGroup_1()); 
            // InternalPascal.g:2284:2: ( rule__Statement_sequence__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==24) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPascal.g:2284:3: rule__Statement_sequence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Statement_sequence__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getStatement_sequenceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Statement_sequence__Group__1__Impl"


    // $ANTLR start "rule__Statement_sequence__Group_1__0"
    // InternalPascal.g:2293:1: rule__Statement_sequence__Group_1__0 : rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 ;
    public final void rule__Statement_sequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2297:1: ( rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 )
            // InternalPascal.g:2298:2: rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Statement_sequence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement_sequence__Group_1__1();

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
    // $ANTLR end "rule__Statement_sequence__Group_1__0"


    // $ANTLR start "rule__Statement_sequence__Group_1__0__Impl"
    // InternalPascal.g:2305:1: rule__Statement_sequence__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Statement_sequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2309:1: ( ( ';' ) )
            // InternalPascal.g:2310:1: ( ';' )
            {
            // InternalPascal.g:2310:1: ( ';' )
            // InternalPascal.g:2311:2: ';'
            {
             before(grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0()); 

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
    // $ANTLR end "rule__Statement_sequence__Group_1__0__Impl"


    // $ANTLR start "rule__Statement_sequence__Group_1__1"
    // InternalPascal.g:2320:1: rule__Statement_sequence__Group_1__1 : rule__Statement_sequence__Group_1__1__Impl ;
    public final void rule__Statement_sequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2324:1: ( rule__Statement_sequence__Group_1__1__Impl )
            // InternalPascal.g:2325:2: rule__Statement_sequence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement_sequence__Group_1__1__Impl();

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
    // $ANTLR end "rule__Statement_sequence__Group_1__1"


    // $ANTLR start "rule__Statement_sequence__Group_1__1__Impl"
    // InternalPascal.g:2331:1: rule__Statement_sequence__Group_1__1__Impl : ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) ) ;
    public final void rule__Statement_sequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2335:1: ( ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) ) )
            // InternalPascal.g:2336:1: ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) )
            {
            // InternalPascal.g:2336:1: ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) )
            // InternalPascal.g:2337:2: ( rule__Statement_sequence__StatementsAssignment_1_1 )
            {
             before(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_1_1()); 
            // InternalPascal.g:2338:2: ( rule__Statement_sequence__StatementsAssignment_1_1 )
            // InternalPascal.g:2338:3: rule__Statement_sequence__StatementsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement_sequence__StatementsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_1_1()); 

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
    // $ANTLR end "rule__Statement_sequence__Group_1__1__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalPascal.g:2347:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2351:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalPascal.g:2352:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

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
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // InternalPascal.g:2359:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Group_0__0 )? ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2363:1: ( ( ( rule__Statement__Group_0__0 )? ) )
            // InternalPascal.g:2364:1: ( ( rule__Statement__Group_0__0 )? )
            {
            // InternalPascal.g:2364:1: ( ( rule__Statement__Group_0__0 )? )
            // InternalPascal.g:2365:2: ( rule__Statement__Group_0__0 )?
            {
             before(grammarAccess.getStatementAccess().getGroup_0()); 
            // InternalPascal.g:2366:2: ( rule__Statement__Group_0__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_SIGNED_INTEGER_NUMBER && LA28_0<=RULE_INTEGER_NUMBER)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPascal.g:2366:3: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatementAccess().getGroup_0()); 

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
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalPascal.g:2374:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2378:1: ( rule__Statement__Group__1__Impl )
            // InternalPascal.g:2379:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__1__Impl();

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
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // InternalPascal.g:2385:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__SimpleAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2389:1: ( ( ( rule__Statement__SimpleAssignment_1 ) ) )
            // InternalPascal.g:2390:1: ( ( rule__Statement__SimpleAssignment_1 ) )
            {
            // InternalPascal.g:2390:1: ( ( rule__Statement__SimpleAssignment_1 ) )
            // InternalPascal.g:2391:2: ( rule__Statement__SimpleAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getSimpleAssignment_1()); 
            // InternalPascal.g:2392:2: ( rule__Statement__SimpleAssignment_1 )
            // InternalPascal.g:2392:3: rule__Statement__SimpleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement__SimpleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getSimpleAssignment_1()); 

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
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group_0__0"
    // InternalPascal.g:2401:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2405:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalPascal.g:2406:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1();

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
    // $ANTLR end "rule__Statement__Group_0__0"


    // $ANTLR start "rule__Statement__Group_0__0__Impl"
    // InternalPascal.g:2413:1: rule__Statement__Group_0__0__Impl : ( ( rule__Statement__LabelAssignment_0_0 ) ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2417:1: ( ( ( rule__Statement__LabelAssignment_0_0 ) ) )
            // InternalPascal.g:2418:1: ( ( rule__Statement__LabelAssignment_0_0 ) )
            {
            // InternalPascal.g:2418:1: ( ( rule__Statement__LabelAssignment_0_0 ) )
            // InternalPascal.g:2419:2: ( rule__Statement__LabelAssignment_0_0 )
            {
             before(grammarAccess.getStatementAccess().getLabelAssignment_0_0()); 
            // InternalPascal.g:2420:2: ( rule__Statement__LabelAssignment_0_0 )
            // InternalPascal.g:2420:3: rule__Statement__LabelAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__LabelAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getLabelAssignment_0_0()); 

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
    // $ANTLR end "rule__Statement__Group_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_0__1"
    // InternalPascal.g:2428:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2432:1: ( rule__Statement__Group_0__1__Impl )
            // InternalPascal.g:2433:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_0__1"


    // $ANTLR start "rule__Statement__Group_0__1__Impl"
    // InternalPascal.g:2439:1: rule__Statement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2443:1: ( ( ':' ) )
            // InternalPascal.g:2444:1: ( ':' )
            {
            // InternalPascal.g:2444:1: ( ':' )
            // InternalPascal.g:2445:2: ':'
            {
             before(grammarAccess.getStatementAccess().getColonKeyword_0_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getColonKeyword_0_1()); 

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
    // $ANTLR end "rule__Statement__Group_0__1__Impl"


    // $ANTLR start "rule__Assignment_statement__Group__0"
    // InternalPascal.g:2455:1: rule__Assignment_statement__Group__0 : rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 ;
    public final void rule__Assignment_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2459:1: ( rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 )
            // InternalPascal.g:2460:2: rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Assignment_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment_statement__Group__1();

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
    // $ANTLR end "rule__Assignment_statement__Group__0"


    // $ANTLR start "rule__Assignment_statement__Group__0__Impl"
    // InternalPascal.g:2467:1: rule__Assignment_statement__Group__0__Impl : ( ( rule__Assignment_statement__VariableAssignment_0 ) ) ;
    public final void rule__Assignment_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2471:1: ( ( ( rule__Assignment_statement__VariableAssignment_0 ) ) )
            // InternalPascal.g:2472:1: ( ( rule__Assignment_statement__VariableAssignment_0 ) )
            {
            // InternalPascal.g:2472:1: ( ( rule__Assignment_statement__VariableAssignment_0 ) )
            // InternalPascal.g:2473:2: ( rule__Assignment_statement__VariableAssignment_0 )
            {
             before(grammarAccess.getAssignment_statementAccess().getVariableAssignment_0()); 
            // InternalPascal.g:2474:2: ( rule__Assignment_statement__VariableAssignment_0 )
            // InternalPascal.g:2474:3: rule__Assignment_statement__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment_statement__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignment_statementAccess().getVariableAssignment_0()); 

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
    // $ANTLR end "rule__Assignment_statement__Group__0__Impl"


    // $ANTLR start "rule__Assignment_statement__Group__1"
    // InternalPascal.g:2482:1: rule__Assignment_statement__Group__1 : rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 ;
    public final void rule__Assignment_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2486:1: ( rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 )
            // InternalPascal.g:2487:2: rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Assignment_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment_statement__Group__2();

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
    // $ANTLR end "rule__Assignment_statement__Group__1"


    // $ANTLR start "rule__Assignment_statement__Group__1__Impl"
    // InternalPascal.g:2494:1: rule__Assignment_statement__Group__1__Impl : ( ':=' ) ;
    public final void rule__Assignment_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2498:1: ( ( ':=' ) )
            // InternalPascal.g:2499:1: ( ':=' )
            {
            // InternalPascal.g:2499:1: ( ':=' )
            // InternalPascal.g:2500:2: ':='
            {
             before(grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Assignment_statement__Group__1__Impl"


    // $ANTLR start "rule__Assignment_statement__Group__2"
    // InternalPascal.g:2509:1: rule__Assignment_statement__Group__2 : rule__Assignment_statement__Group__2__Impl ;
    public final void rule__Assignment_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2513:1: ( rule__Assignment_statement__Group__2__Impl )
            // InternalPascal.g:2514:2: rule__Assignment_statement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment_statement__Group__2__Impl();

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
    // $ANTLR end "rule__Assignment_statement__Group__2"


    // $ANTLR start "rule__Assignment_statement__Group__2__Impl"
    // InternalPascal.g:2520:1: rule__Assignment_statement__Group__2__Impl : ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2524:1: ( ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) )
            // InternalPascal.g:2525:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            {
            // InternalPascal.g:2525:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            // InternalPascal.g:2526:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            {
             before(grammarAccess.getAssignment_statementAccess().getExpressionAssignment_2()); 
            // InternalPascal.g:2527:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            // InternalPascal.g:2527:3: rule__Assignment_statement__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment_statement__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignment_statementAccess().getExpressionAssignment_2()); 

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
    // $ANTLR end "rule__Assignment_statement__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalPascal.g:2536:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2540:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalPascal.g:2541:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalPascal.g:2548:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2552:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalPascal.g:2553:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalPascal.g:2553:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalPascal.g:2554:2: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // InternalPascal.g:2555:2: ( rule__Variable__NameAssignment_0 )
            // InternalPascal.g:2555:3: rule__Variable__NameAssignment_0
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
    // InternalPascal.g:2563:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2567:1: ( rule__Variable__Group__1__Impl )
            // InternalPascal.g:2568:2: rule__Variable__Group__1__Impl
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
    // InternalPascal.g:2574:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__VariableAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2578:1: ( ( ( rule__Variable__VariableAssignment_1 ) ) )
            // InternalPascal.g:2579:1: ( ( rule__Variable__VariableAssignment_1 ) )
            {
            // InternalPascal.g:2579:1: ( ( rule__Variable__VariableAssignment_1 ) )
            // InternalPascal.g:2580:2: ( rule__Variable__VariableAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getVariableAssignment_1()); 
            // InternalPascal.g:2581:2: ( rule__Variable__VariableAssignment_1 )
            // InternalPascal.g:2581:3: rule__Variable__VariableAssignment_1
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
    // InternalPascal.g:2590:1: rule__Var___Group_0__0 : rule__Var___Group_0__0__Impl rule__Var___Group_0__1 ;
    public final void rule__Var___Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2594:1: ( rule__Var___Group_0__0__Impl rule__Var___Group_0__1 )
            // InternalPascal.g:2595:2: rule__Var___Group_0__0__Impl rule__Var___Group_0__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalPascal.g:2602:1: rule__Var___Group_0__0__Impl : ( '[' ) ;
    public final void rule__Var___Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2606:1: ( ( '[' ) )
            // InternalPascal.g:2607:1: ( '[' )
            {
            // InternalPascal.g:2607:1: ( '[' )
            // InternalPascal.g:2608:2: '['
            {
             before(grammarAccess.getVar_Access().getLeftSquareBracketKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPascal.g:2617:1: rule__Var___Group_0__1 : rule__Var___Group_0__1__Impl rule__Var___Group_0__2 ;
    public final void rule__Var___Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2621:1: ( rule__Var___Group_0__1__Impl rule__Var___Group_0__2 )
            // InternalPascal.g:2622:2: rule__Var___Group_0__1__Impl rule__Var___Group_0__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalPascal.g:2629:1: rule__Var___Group_0__1__Impl : ( ( rule__Var___ExpressionsAssignment_0_1 ) ) ;
    public final void rule__Var___Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2633:1: ( ( ( rule__Var___ExpressionsAssignment_0_1 ) ) )
            // InternalPascal.g:2634:1: ( ( rule__Var___ExpressionsAssignment_0_1 ) )
            {
            // InternalPascal.g:2634:1: ( ( rule__Var___ExpressionsAssignment_0_1 ) )
            // InternalPascal.g:2635:2: ( rule__Var___ExpressionsAssignment_0_1 )
            {
             before(grammarAccess.getVar_Access().getExpressionsAssignment_0_1()); 
            // InternalPascal.g:2636:2: ( rule__Var___ExpressionsAssignment_0_1 )
            // InternalPascal.g:2636:3: rule__Var___ExpressionsAssignment_0_1
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
    // InternalPascal.g:2644:1: rule__Var___Group_0__2 : rule__Var___Group_0__2__Impl rule__Var___Group_0__3 ;
    public final void rule__Var___Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2648:1: ( rule__Var___Group_0__2__Impl rule__Var___Group_0__3 )
            // InternalPascal.g:2649:2: rule__Var___Group_0__2__Impl rule__Var___Group_0__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalPascal.g:2656:1: rule__Var___Group_0__2__Impl : ( ']' ) ;
    public final void rule__Var___Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2660:1: ( ( ']' ) )
            // InternalPascal.g:2661:1: ( ']' )
            {
            // InternalPascal.g:2661:1: ( ']' )
            // InternalPascal.g:2662:2: ']'
            {
             before(grammarAccess.getVar_Access().getRightSquareBracketKeyword_0_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPascal.g:2671:1: rule__Var___Group_0__3 : rule__Var___Group_0__3__Impl ;
    public final void rule__Var___Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2675:1: ( rule__Var___Group_0__3__Impl )
            // InternalPascal.g:2676:2: rule__Var___Group_0__3__Impl
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
    // InternalPascal.g:2682:1: rule__Var___Group_0__3__Impl : ( ( rule__Var___ArrayAssignment_0_3 ) ) ;
    public final void rule__Var___Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2686:1: ( ( ( rule__Var___ArrayAssignment_0_3 ) ) )
            // InternalPascal.g:2687:1: ( ( rule__Var___ArrayAssignment_0_3 ) )
            {
            // InternalPascal.g:2687:1: ( ( rule__Var___ArrayAssignment_0_3 ) )
            // InternalPascal.g:2688:2: ( rule__Var___ArrayAssignment_0_3 )
            {
             before(grammarAccess.getVar_Access().getArrayAssignment_0_3()); 
            // InternalPascal.g:2689:2: ( rule__Var___ArrayAssignment_0_3 )
            // InternalPascal.g:2689:3: rule__Var___ArrayAssignment_0_3
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
    // InternalPascal.g:2698:1: rule__Var___Group_1__0 : rule__Var___Group_1__0__Impl rule__Var___Group_1__1 ;
    public final void rule__Var___Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2702:1: ( rule__Var___Group_1__0__Impl rule__Var___Group_1__1 )
            // InternalPascal.g:2703:2: rule__Var___Group_1__0__Impl rule__Var___Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalPascal.g:2710:1: rule__Var___Group_1__0__Impl : ( ( rule__Var___AccessorAssignment_1_0 ) ) ;
    public final void rule__Var___Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2714:1: ( ( ( rule__Var___AccessorAssignment_1_0 ) ) )
            // InternalPascal.g:2715:1: ( ( rule__Var___AccessorAssignment_1_0 ) )
            {
            // InternalPascal.g:2715:1: ( ( rule__Var___AccessorAssignment_1_0 ) )
            // InternalPascal.g:2716:2: ( rule__Var___AccessorAssignment_1_0 )
            {
             before(grammarAccess.getVar_Access().getAccessorAssignment_1_0()); 
            // InternalPascal.g:2717:2: ( rule__Var___AccessorAssignment_1_0 )
            // InternalPascal.g:2717:3: rule__Var___AccessorAssignment_1_0
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
    // InternalPascal.g:2725:1: rule__Var___Group_1__1 : rule__Var___Group_1__1__Impl rule__Var___Group_1__2 ;
    public final void rule__Var___Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2729:1: ( rule__Var___Group_1__1__Impl rule__Var___Group_1__2 )
            // InternalPascal.g:2730:2: rule__Var___Group_1__1__Impl rule__Var___Group_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalPascal.g:2737:1: rule__Var___Group_1__1__Impl : ( ( rule__Var___NameAssignment_1_1 ) ) ;
    public final void rule__Var___Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2741:1: ( ( ( rule__Var___NameAssignment_1_1 ) ) )
            // InternalPascal.g:2742:1: ( ( rule__Var___NameAssignment_1_1 ) )
            {
            // InternalPascal.g:2742:1: ( ( rule__Var___NameAssignment_1_1 ) )
            // InternalPascal.g:2743:2: ( rule__Var___NameAssignment_1_1 )
            {
             before(grammarAccess.getVar_Access().getNameAssignment_1_1()); 
            // InternalPascal.g:2744:2: ( rule__Var___NameAssignment_1_1 )
            // InternalPascal.g:2744:3: rule__Var___NameAssignment_1_1
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
    // InternalPascal.g:2752:1: rule__Var___Group_1__2 : rule__Var___Group_1__2__Impl ;
    public final void rule__Var___Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2756:1: ( rule__Var___Group_1__2__Impl )
            // InternalPascal.g:2757:2: rule__Var___Group_1__2__Impl
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
    // InternalPascal.g:2763:1: rule__Var___Group_1__2__Impl : ( ( rule__Var___VariableAssignment_1_2 ) ) ;
    public final void rule__Var___Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2767:1: ( ( ( rule__Var___VariableAssignment_1_2 ) ) )
            // InternalPascal.g:2768:1: ( ( rule__Var___VariableAssignment_1_2 ) )
            {
            // InternalPascal.g:2768:1: ( ( rule__Var___VariableAssignment_1_2 ) )
            // InternalPascal.g:2769:2: ( rule__Var___VariableAssignment_1_2 )
            {
             before(grammarAccess.getVar_Access().getVariableAssignment_1_2()); 
            // InternalPascal.g:2770:2: ( rule__Var___VariableAssignment_1_2 )
            // InternalPascal.g:2770:3: rule__Var___VariableAssignment_1_2
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
    // InternalPascal.g:2779:1: rule__Var___Group_2__0 : rule__Var___Group_2__0__Impl rule__Var___Group_2__1 ;
    public final void rule__Var___Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2783:1: ( rule__Var___Group_2__0__Impl rule__Var___Group_2__1 )
            // InternalPascal.g:2784:2: rule__Var___Group_2__0__Impl rule__Var___Group_2__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalPascal.g:2791:1: rule__Var___Group_2__0__Impl : ( '^' ) ;
    public final void rule__Var___Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2795:1: ( ( '^' ) )
            // InternalPascal.g:2796:1: ( '^' )
            {
            // InternalPascal.g:2796:1: ( '^' )
            // InternalPascal.g:2797:2: '^'
            {
             before(grammarAccess.getVar_Access().getCircumflexAccentKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalPascal.g:2806:1: rule__Var___Group_2__1 : rule__Var___Group_2__1__Impl ;
    public final void rule__Var___Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2810:1: ( rule__Var___Group_2__1__Impl )
            // InternalPascal.g:2811:2: rule__Var___Group_2__1__Impl
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
    // InternalPascal.g:2817:1: rule__Var___Group_2__1__Impl : ( ( rule__Var___PointerAssignment_2_1 ) ) ;
    public final void rule__Var___Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2821:1: ( ( ( rule__Var___PointerAssignment_2_1 ) ) )
            // InternalPascal.g:2822:1: ( ( rule__Var___PointerAssignment_2_1 ) )
            {
            // InternalPascal.g:2822:1: ( ( rule__Var___PointerAssignment_2_1 ) )
            // InternalPascal.g:2823:2: ( rule__Var___PointerAssignment_2_1 )
            {
             before(grammarAccess.getVar_Access().getPointerAssignment_2_1()); 
            // InternalPascal.g:2824:2: ( rule__Var___PointerAssignment_2_1 )
            // InternalPascal.g:2824:3: rule__Var___PointerAssignment_2_1
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
    // InternalPascal.g:2833:1: rule__Expression_list__Group__0 : rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 ;
    public final void rule__Expression_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2837:1: ( rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 )
            // InternalPascal.g:2838:2: rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalPascal.g:2845:1: rule__Expression_list__Group__0__Impl : ( ( rule__Expression_list__ExpressionsAssignment_0 ) ) ;
    public final void rule__Expression_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2849:1: ( ( ( rule__Expression_list__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:2850:1: ( ( rule__Expression_list__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:2850:1: ( ( rule__Expression_list__ExpressionsAssignment_0 ) )
            // InternalPascal.g:2851:2: ( rule__Expression_list__ExpressionsAssignment_0 )
            {
             before(grammarAccess.getExpression_listAccess().getExpressionsAssignment_0()); 
            // InternalPascal.g:2852:2: ( rule__Expression_list__ExpressionsAssignment_0 )
            // InternalPascal.g:2852:3: rule__Expression_list__ExpressionsAssignment_0
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
    // InternalPascal.g:2860:1: rule__Expression_list__Group__1 : rule__Expression_list__Group__1__Impl ;
    public final void rule__Expression_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2864:1: ( rule__Expression_list__Group__1__Impl )
            // InternalPascal.g:2865:2: rule__Expression_list__Group__1__Impl
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
    // InternalPascal.g:2871:1: rule__Expression_list__Group__1__Impl : ( ( rule__Expression_list__Group_1__0 )* ) ;
    public final void rule__Expression_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2875:1: ( ( ( rule__Expression_list__Group_1__0 )* ) )
            // InternalPascal.g:2876:1: ( ( rule__Expression_list__Group_1__0 )* )
            {
            // InternalPascal.g:2876:1: ( ( rule__Expression_list__Group_1__0 )* )
            // InternalPascal.g:2877:2: ( rule__Expression_list__Group_1__0 )*
            {
             before(grammarAccess.getExpression_listAccess().getGroup_1()); 
            // InternalPascal.g:2878:2: ( rule__Expression_list__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==32) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPascal.g:2878:3: rule__Expression_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Expression_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalPascal.g:2887:1: rule__Expression_list__Group_1__0 : rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 ;
    public final void rule__Expression_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2891:1: ( rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 )
            // InternalPascal.g:2892:2: rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalPascal.g:2899:1: rule__Expression_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Expression_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2903:1: ( ( ',' ) )
            // InternalPascal.g:2904:1: ( ',' )
            {
            // InternalPascal.g:2904:1: ( ',' )
            // InternalPascal.g:2905:2: ','
            {
             before(grammarAccess.getExpression_listAccess().getCommaKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalPascal.g:2914:1: rule__Expression_list__Group_1__1 : rule__Expression_list__Group_1__1__Impl ;
    public final void rule__Expression_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2918:1: ( rule__Expression_list__Group_1__1__Impl )
            // InternalPascal.g:2919:2: rule__Expression_list__Group_1__1__Impl
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
    // InternalPascal.g:2925:1: rule__Expression_list__Group_1__1__Impl : ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Expression_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2929:1: ( ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:2930:1: ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:2930:1: ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:2931:2: ( rule__Expression_list__ExpressionsAssignment_1_1 )
            {
             before(grammarAccess.getExpression_listAccess().getExpressionsAssignment_1_1()); 
            // InternalPascal.g:2932:2: ( rule__Expression_list__ExpressionsAssignment_1_1 )
            // InternalPascal.g:2932:3: rule__Expression_list__ExpressionsAssignment_1_1
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
    // InternalPascal.g:2941:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2945:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalPascal.g:2946:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalPascal.g:2953:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__ExpressionsAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2957:1: ( ( ( rule__Expression__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:2958:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:2958:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            // InternalPascal.g:2959:2: ( rule__Expression__ExpressionsAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getExpressionsAssignment_0()); 
            // InternalPascal.g:2960:2: ( rule__Expression__ExpressionsAssignment_0 )
            // InternalPascal.g:2960:3: rule__Expression__ExpressionsAssignment_0
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
    // InternalPascal.g:2968:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2972:1: ( rule__Expression__Group__1__Impl )
            // InternalPascal.g:2973:2: rule__Expression__Group__1__Impl
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
    // InternalPascal.g:2979:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2983:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalPascal.g:2984:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalPascal.g:2984:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalPascal.g:2985:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalPascal.g:2986:2: ( rule__Expression__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_RELATIONAL_OP||LA30_0==41||LA30_0==46) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPascal.g:2986:3: rule__Expression__Group_1__0
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
    // InternalPascal.g:2995:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2999:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalPascal.g:3000:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalPascal.g:3007:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Alternatives_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3011:1: ( ( ( rule__Expression__Alternatives_1_0 ) ) )
            // InternalPascal.g:3012:1: ( ( rule__Expression__Alternatives_1_0 ) )
            {
            // InternalPascal.g:3012:1: ( ( rule__Expression__Alternatives_1_0 ) )
            // InternalPascal.g:3013:2: ( rule__Expression__Alternatives_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 
            // InternalPascal.g:3014:2: ( rule__Expression__Alternatives_1_0 )
            // InternalPascal.g:3014:3: rule__Expression__Alternatives_1_0
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
    // InternalPascal.g:3022:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3026:1: ( rule__Expression__Group_1__1__Impl )
            // InternalPascal.g:3027:2: rule__Expression__Group_1__1__Impl
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
    // InternalPascal.g:3033:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3037:1: ( ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:3038:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:3038:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:3039:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getExpressionsAssignment_1_1()); 
            // InternalPascal.g:3040:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            // InternalPascal.g:3040:3: rule__Expression__ExpressionsAssignment_1_1
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
    // InternalPascal.g:3049:1: rule__Simple_expression__Group__0 : rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 ;
    public final void rule__Simple_expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3053:1: ( rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 )
            // InternalPascal.g:3054:2: rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalPascal.g:3061:1: rule__Simple_expression__Group__0__Impl : ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? ) ;
    public final void rule__Simple_expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3065:1: ( ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? ) )
            // InternalPascal.g:3066:1: ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? )
            {
            // InternalPascal.g:3066:1: ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? )
            // InternalPascal.g:3067:2: ( rule__Simple_expression__PrefixOperatorAssignment_0 )?
            {
             before(grammarAccess.getSimple_expressionAccess().getPrefixOperatorAssignment_0()); 
            // InternalPascal.g:3068:2: ( rule__Simple_expression__PrefixOperatorAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ADDITION_OP) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPascal.g:3068:3: rule__Simple_expression__PrefixOperatorAssignment_0
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
    // InternalPascal.g:3076:1: rule__Simple_expression__Group__1 : rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 ;
    public final void rule__Simple_expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3080:1: ( rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 )
            // InternalPascal.g:3081:2: rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalPascal.g:3088:1: rule__Simple_expression__Group__1__Impl : ( ( rule__Simple_expression__TermsAssignment_1 ) ) ;
    public final void rule__Simple_expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3092:1: ( ( ( rule__Simple_expression__TermsAssignment_1 ) ) )
            // InternalPascal.g:3093:1: ( ( rule__Simple_expression__TermsAssignment_1 ) )
            {
            // InternalPascal.g:3093:1: ( ( rule__Simple_expression__TermsAssignment_1 ) )
            // InternalPascal.g:3094:2: ( rule__Simple_expression__TermsAssignment_1 )
            {
             before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_1()); 
            // InternalPascal.g:3095:2: ( rule__Simple_expression__TermsAssignment_1 )
            // InternalPascal.g:3095:3: rule__Simple_expression__TermsAssignment_1
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
    // InternalPascal.g:3103:1: rule__Simple_expression__Group__2 : rule__Simple_expression__Group__2__Impl ;
    public final void rule__Simple_expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3107:1: ( rule__Simple_expression__Group__2__Impl )
            // InternalPascal.g:3108:2: rule__Simple_expression__Group__2__Impl
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
    // InternalPascal.g:3114:1: rule__Simple_expression__Group__2__Impl : ( ( rule__Simple_expression__Alternatives_2 )* ) ;
    public final void rule__Simple_expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3118:1: ( ( ( rule__Simple_expression__Alternatives_2 )* ) )
            // InternalPascal.g:3119:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            {
            // InternalPascal.g:3119:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            // InternalPascal.g:3120:2: ( rule__Simple_expression__Alternatives_2 )*
            {
             before(grammarAccess.getSimple_expressionAccess().getAlternatives_2()); 
            // InternalPascal.g:3121:2: ( rule__Simple_expression__Alternatives_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_INTEGER_NUMBER||LA32_0==RULE_ADDITION_OP||LA32_0==RULE_REAL_NUMBER||LA32_0==47) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPascal.g:3121:3: rule__Simple_expression__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Simple_expression__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalPascal.g:3130:1: rule__Simple_expression__Group_2_0__0 : rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 ;
    public final void rule__Simple_expression__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3134:1: ( rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 )
            // InternalPascal.g:3135:2: rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalPascal.g:3142:1: rule__Simple_expression__Group_2_0__0__Impl : ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) ;
    public final void rule__Simple_expression__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3146:1: ( ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) )
            // InternalPascal.g:3147:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            {
            // InternalPascal.g:3147:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            // InternalPascal.g:3148:2: ( rule__Simple_expression__Alternatives_2_0_0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getAlternatives_2_0_0()); 
            // InternalPascal.g:3149:2: ( rule__Simple_expression__Alternatives_2_0_0 )
            // InternalPascal.g:3149:3: rule__Simple_expression__Alternatives_2_0_0
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
    // InternalPascal.g:3157:1: rule__Simple_expression__Group_2_0__1 : rule__Simple_expression__Group_2_0__1__Impl ;
    public final void rule__Simple_expression__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3161:1: ( rule__Simple_expression__Group_2_0__1__Impl )
            // InternalPascal.g:3162:2: rule__Simple_expression__Group_2_0__1__Impl
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
    // InternalPascal.g:3168:1: rule__Simple_expression__Group_2_0__1__Impl : ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) ) ;
    public final void rule__Simple_expression__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3172:1: ( ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) ) )
            // InternalPascal.g:3173:1: ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) )
            {
            // InternalPascal.g:3173:1: ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) )
            // InternalPascal.g:3174:2: ( rule__Simple_expression__TermsAssignment_2_0_1 )
            {
             before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_0_1()); 
            // InternalPascal.g:3175:2: ( rule__Simple_expression__TermsAssignment_2_0_1 )
            // InternalPascal.g:3175:3: rule__Simple_expression__TermsAssignment_2_0_1
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
    // InternalPascal.g:3184:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3188:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalPascal.g:3189:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalPascal.g:3196:1: rule__Term__Group__0__Impl : ( ( rule__Term__FactorsAssignment_0 ) ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3200:1: ( ( ( rule__Term__FactorsAssignment_0 ) ) )
            // InternalPascal.g:3201:1: ( ( rule__Term__FactorsAssignment_0 ) )
            {
            // InternalPascal.g:3201:1: ( ( rule__Term__FactorsAssignment_0 ) )
            // InternalPascal.g:3202:2: ( rule__Term__FactorsAssignment_0 )
            {
             before(grammarAccess.getTermAccess().getFactorsAssignment_0()); 
            // InternalPascal.g:3203:2: ( rule__Term__FactorsAssignment_0 )
            // InternalPascal.g:3203:3: rule__Term__FactorsAssignment_0
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
    // InternalPascal.g:3211:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3215:1: ( rule__Term__Group__1__Impl )
            // InternalPascal.g:3216:2: rule__Term__Group__1__Impl
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
    // InternalPascal.g:3222:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3226:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // InternalPascal.g:3227:1: ( ( rule__Term__Group_1__0 )* )
            {
            // InternalPascal.g:3227:1: ( ( rule__Term__Group_1__0 )* )
            // InternalPascal.g:3228:2: ( rule__Term__Group_1__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // InternalPascal.g:3229:2: ( rule__Term__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_MULTIPLICATION_OP||(LA33_0>=48 && LA33_0<=50)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPascal.g:3229:3: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Term__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalPascal.g:3238:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3242:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalPascal.g:3243:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalPascal.g:3250:1: rule__Term__Group_1__0__Impl : ( ( rule__Term__Alternatives_1_0 ) ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3254:1: ( ( ( rule__Term__Alternatives_1_0 ) ) )
            // InternalPascal.g:3255:1: ( ( rule__Term__Alternatives_1_0 ) )
            {
            // InternalPascal.g:3255:1: ( ( rule__Term__Alternatives_1_0 ) )
            // InternalPascal.g:3256:2: ( rule__Term__Alternatives_1_0 )
            {
             before(grammarAccess.getTermAccess().getAlternatives_1_0()); 
            // InternalPascal.g:3257:2: ( rule__Term__Alternatives_1_0 )
            // InternalPascal.g:3257:3: rule__Term__Alternatives_1_0
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
    // InternalPascal.g:3265:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3269:1: ( rule__Term__Group_1__1__Impl )
            // InternalPascal.g:3270:2: rule__Term__Group_1__1__Impl
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
    // InternalPascal.g:3276:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__FactorsAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3280:1: ( ( ( rule__Term__FactorsAssignment_1_1 ) ) )
            // InternalPascal.g:3281:1: ( ( rule__Term__FactorsAssignment_1_1 ) )
            {
            // InternalPascal.g:3281:1: ( ( rule__Term__FactorsAssignment_1_1 ) )
            // InternalPascal.g:3282:2: ( rule__Term__FactorsAssignment_1_1 )
            {
             before(grammarAccess.getTermAccess().getFactorsAssignment_1_1()); 
            // InternalPascal.g:3283:2: ( rule__Term__FactorsAssignment_1_1 )
            // InternalPascal.g:3283:3: rule__Term__FactorsAssignment_1_1
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
    // InternalPascal.g:3292:1: rule__Factor__Group_8__0 : rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1 ;
    public final void rule__Factor__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3296:1: ( rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1 )
            // InternalPascal.g:3297:2: rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalPascal.g:3304:1: rule__Factor__Group_8__0__Impl : ( '(' ) ;
    public final void rule__Factor__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3308:1: ( ( '(' ) )
            // InternalPascal.g:3309:1: ( '(' )
            {
            // InternalPascal.g:3309:1: ( '(' )
            // InternalPascal.g:3310:2: '('
            {
             before(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_8_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalPascal.g:3319:1: rule__Factor__Group_8__1 : rule__Factor__Group_8__1__Impl rule__Factor__Group_8__2 ;
    public final void rule__Factor__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3323:1: ( rule__Factor__Group_8__1__Impl rule__Factor__Group_8__2 )
            // InternalPascal.g:3324:2: rule__Factor__Group_8__1__Impl rule__Factor__Group_8__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalPascal.g:3331:1: rule__Factor__Group_8__1__Impl : ( ( rule__Factor__ExpressionAssignment_8_1 ) ) ;
    public final void rule__Factor__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3335:1: ( ( ( rule__Factor__ExpressionAssignment_8_1 ) ) )
            // InternalPascal.g:3336:1: ( ( rule__Factor__ExpressionAssignment_8_1 ) )
            {
            // InternalPascal.g:3336:1: ( ( rule__Factor__ExpressionAssignment_8_1 ) )
            // InternalPascal.g:3337:2: ( rule__Factor__ExpressionAssignment_8_1 )
            {
             before(grammarAccess.getFactorAccess().getExpressionAssignment_8_1()); 
            // InternalPascal.g:3338:2: ( rule__Factor__ExpressionAssignment_8_1 )
            // InternalPascal.g:3338:3: rule__Factor__ExpressionAssignment_8_1
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
    // InternalPascal.g:3346:1: rule__Factor__Group_8__2 : rule__Factor__Group_8__2__Impl ;
    public final void rule__Factor__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3350:1: ( rule__Factor__Group_8__2__Impl )
            // InternalPascal.g:3351:2: rule__Factor__Group_8__2__Impl
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
    // InternalPascal.g:3357:1: rule__Factor__Group_8__2__Impl : ( ')' ) ;
    public final void rule__Factor__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3361:1: ( ( ')' ) )
            // InternalPascal.g:3362:1: ( ')' )
            {
            // InternalPascal.g:3362:1: ( ')' )
            // InternalPascal.g:3363:2: ')'
            {
             before(grammarAccess.getFactorAccess().getRightParenthesisKeyword_8_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalPascal.g:3373:1: rule__Factor__Group_9__0 : rule__Factor__Group_9__0__Impl rule__Factor__Group_9__1 ;
    public final void rule__Factor__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3377:1: ( rule__Factor__Group_9__0__Impl rule__Factor__Group_9__1 )
            // InternalPascal.g:3378:2: rule__Factor__Group_9__0__Impl rule__Factor__Group_9__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalPascal.g:3385:1: rule__Factor__Group_9__0__Impl : ( 'not' ) ;
    public final void rule__Factor__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3389:1: ( ( 'not' ) )
            // InternalPascal.g:3390:1: ( 'not' )
            {
            // InternalPascal.g:3390:1: ( 'not' )
            // InternalPascal.g:3391:2: 'not'
            {
             before(grammarAccess.getFactorAccess().getNotKeyword_9_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalPascal.g:3400:1: rule__Factor__Group_9__1 : rule__Factor__Group_9__1__Impl ;
    public final void rule__Factor__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3404:1: ( rule__Factor__Group_9__1__Impl )
            // InternalPascal.g:3405:2: rule__Factor__Group_9__1__Impl
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
    // InternalPascal.g:3411:1: rule__Factor__Group_9__1__Impl : ( ( rule__Factor__NotAssignment_9_1 ) ) ;
    public final void rule__Factor__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3415:1: ( ( ( rule__Factor__NotAssignment_9_1 ) ) )
            // InternalPascal.g:3416:1: ( ( rule__Factor__NotAssignment_9_1 ) )
            {
            // InternalPascal.g:3416:1: ( ( rule__Factor__NotAssignment_9_1 ) )
            // InternalPascal.g:3417:2: ( rule__Factor__NotAssignment_9_1 )
            {
             before(grammarAccess.getFactorAccess().getNotAssignment_9_1()); 
            // InternalPascal.g:3418:2: ( rule__Factor__NotAssignment_9_1 )
            // InternalPascal.g:3418:3: rule__Factor__NotAssignment_9_1
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
    // InternalPascal.g:3427:1: rule__Function_designator__Group__0 : rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 ;
    public final void rule__Function_designator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3431:1: ( rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 )
            // InternalPascal.g:3432:2: rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalPascal.g:3439:1: rule__Function_designator__Group__0__Impl : ( ( rule__Function_designator__NameAssignment_0 ) ) ;
    public final void rule__Function_designator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3443:1: ( ( ( rule__Function_designator__NameAssignment_0 ) ) )
            // InternalPascal.g:3444:1: ( ( rule__Function_designator__NameAssignment_0 ) )
            {
            // InternalPascal.g:3444:1: ( ( rule__Function_designator__NameAssignment_0 ) )
            // InternalPascal.g:3445:2: ( rule__Function_designator__NameAssignment_0 )
            {
             before(grammarAccess.getFunction_designatorAccess().getNameAssignment_0()); 
            // InternalPascal.g:3446:2: ( rule__Function_designator__NameAssignment_0 )
            // InternalPascal.g:3446:3: rule__Function_designator__NameAssignment_0
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
    // InternalPascal.g:3454:1: rule__Function_designator__Group__1 : rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 ;
    public final void rule__Function_designator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3458:1: ( rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 )
            // InternalPascal.g:3459:2: rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalPascal.g:3466:1: rule__Function_designator__Group__1__Impl : ( '(' ) ;
    public final void rule__Function_designator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3470:1: ( ( '(' ) )
            // InternalPascal.g:3471:1: ( '(' )
            {
            // InternalPascal.g:3471:1: ( '(' )
            // InternalPascal.g:3472:2: '('
            {
             before(grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalPascal.g:3481:1: rule__Function_designator__Group__2 : rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 ;
    public final void rule__Function_designator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3485:1: ( rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 )
            // InternalPascal.g:3486:2: rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalPascal.g:3493:1: rule__Function_designator__Group__2__Impl : ( ( rule__Function_designator__ExpressionsAssignment_2 )? ) ;
    public final void rule__Function_designator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3497:1: ( ( ( rule__Function_designator__ExpressionsAssignment_2 )? ) )
            // InternalPascal.g:3498:1: ( ( rule__Function_designator__ExpressionsAssignment_2 )? )
            {
            // InternalPascal.g:3498:1: ( ( rule__Function_designator__ExpressionsAssignment_2 )? )
            // InternalPascal.g:3499:2: ( rule__Function_designator__ExpressionsAssignment_2 )?
            {
             before(grammarAccess.getFunction_designatorAccess().getExpressionsAssignment_2()); 
            // InternalPascal.g:3500:2: ( rule__Function_designator__ExpressionsAssignment_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_INTEGER_NUMBER)||LA34_0==RULE_ADDITION_OP||LA34_0==RULE_STRING||(LA34_0>=RULE_SIGNED_REAL_NUMBER && LA34_0<=RULE_REAL_NUMBER)||LA34_0==29||LA34_0==33||LA34_0==35||(LA34_0>=51 && LA34_0<=53)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPascal.g:3500:3: rule__Function_designator__ExpressionsAssignment_2
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
    // InternalPascal.g:3508:1: rule__Function_designator__Group__3 : rule__Function_designator__Group__3__Impl ;
    public final void rule__Function_designator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3512:1: ( rule__Function_designator__Group__3__Impl )
            // InternalPascal.g:3513:2: rule__Function_designator__Group__3__Impl
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
    // InternalPascal.g:3519:1: rule__Function_designator__Group__3__Impl : ( ')' ) ;
    public final void rule__Function_designator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3523:1: ( ( ')' ) )
            // InternalPascal.g:3524:1: ( ')' )
            {
            // InternalPascal.g:3524:1: ( ')' )
            // InternalPascal.g:3525:2: ')'
            {
             before(grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_2); 
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


    // $ANTLR start "rule__Function_procedure_declaration__Group__0"
    // InternalPascal.g:3535:1: rule__Function_procedure_declaration__Group__0 : rule__Function_procedure_declaration__Group__0__Impl rule__Function_procedure_declaration__Group__1 ;
    public final void rule__Function_procedure_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3539:1: ( rule__Function_procedure_declaration__Group__0__Impl rule__Function_procedure_declaration__Group__1 )
            // InternalPascal.g:3540:2: rule__Function_procedure_declaration__Group__0__Impl rule__Function_procedure_declaration__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Function_procedure_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_procedure_declaration__Group__1();

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
    // $ANTLR end "rule__Function_procedure_declaration__Group__0"


    // $ANTLR start "rule__Function_procedure_declaration__Group__0__Impl"
    // InternalPascal.g:3547:1: rule__Function_procedure_declaration__Group__0__Impl : ( ( rule__Function_procedure_declaration__Alternatives_0 ) ) ;
    public final void rule__Function_procedure_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3551:1: ( ( ( rule__Function_procedure_declaration__Alternatives_0 ) ) )
            // InternalPascal.g:3552:1: ( ( rule__Function_procedure_declaration__Alternatives_0 ) )
            {
            // InternalPascal.g:3552:1: ( ( rule__Function_procedure_declaration__Alternatives_0 ) )
            // InternalPascal.g:3553:2: ( rule__Function_procedure_declaration__Alternatives_0 )
            {
             before(grammarAccess.getFunction_procedure_declarationAccess().getAlternatives_0()); 
            // InternalPascal.g:3554:2: ( rule__Function_procedure_declaration__Alternatives_0 )
            // InternalPascal.g:3554:3: rule__Function_procedure_declaration__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Function_procedure_declaration__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getFunction_procedure_declarationAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Function_procedure_declaration__Group__0__Impl"


    // $ANTLR start "rule__Function_procedure_declaration__Group__1"
    // InternalPascal.g:3562:1: rule__Function_procedure_declaration__Group__1 : rule__Function_procedure_declaration__Group__1__Impl ;
    public final void rule__Function_procedure_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3566:1: ( rule__Function_procedure_declaration__Group__1__Impl )
            // InternalPascal.g:3567:2: rule__Function_procedure_declaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function_procedure_declaration__Group__1__Impl();

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
    // $ANTLR end "rule__Function_procedure_declaration__Group__1"


    // $ANTLR start "rule__Function_procedure_declaration__Group__1__Impl"
    // InternalPascal.g:3573:1: rule__Function_procedure_declaration__Group__1__Impl : ( ';' ) ;
    public final void rule__Function_procedure_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3577:1: ( ( ';' ) )
            // InternalPascal.g:3578:1: ( ';' )
            {
            // InternalPascal.g:3578:1: ( ';' )
            // InternalPascal.g:3579:2: ';'
            {
             before(grammarAccess.getFunction_procedure_declarationAccess().getSemicolonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFunction_procedure_declarationAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Function_procedure_declaration__Group__1__Impl"


    // $ANTLR start "rule__Function_heading__Group__0"
    // InternalPascal.g:3589:1: rule__Function_heading__Group__0 : rule__Function_heading__Group__0__Impl rule__Function_heading__Group__1 ;
    public final void rule__Function_heading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3593:1: ( rule__Function_heading__Group__0__Impl rule__Function_heading__Group__1 )
            // InternalPascal.g:3594:2: rule__Function_heading__Group__0__Impl rule__Function_heading__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Function_heading__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_heading__Group__1();

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
    // $ANTLR end "rule__Function_heading__Group__0"


    // $ANTLR start "rule__Function_heading__Group__0__Impl"
    // InternalPascal.g:3601:1: rule__Function_heading__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function_heading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3605:1: ( ( 'function' ) )
            // InternalPascal.g:3606:1: ( 'function' )
            {
            // InternalPascal.g:3606:1: ( 'function' )
            // InternalPascal.g:3607:2: 'function'
            {
             before(grammarAccess.getFunction_headingAccess().getFunctionKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFunction_headingAccess().getFunctionKeyword_0()); 

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
    // $ANTLR end "rule__Function_heading__Group__0__Impl"


    // $ANTLR start "rule__Function_heading__Group__1"
    // InternalPascal.g:3616:1: rule__Function_heading__Group__1 : rule__Function_heading__Group__1__Impl rule__Function_heading__Group__2 ;
    public final void rule__Function_heading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3620:1: ( rule__Function_heading__Group__1__Impl rule__Function_heading__Group__2 )
            // InternalPascal.g:3621:2: rule__Function_heading__Group__1__Impl rule__Function_heading__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Function_heading__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_heading__Group__2();

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
    // $ANTLR end "rule__Function_heading__Group__1"


    // $ANTLR start "rule__Function_heading__Group__1__Impl"
    // InternalPascal.g:3628:1: rule__Function_heading__Group__1__Impl : ( ( rule__Function_heading__NameAssignment_1 ) ) ;
    public final void rule__Function_heading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3632:1: ( ( ( rule__Function_heading__NameAssignment_1 ) ) )
            // InternalPascal.g:3633:1: ( ( rule__Function_heading__NameAssignment_1 ) )
            {
            // InternalPascal.g:3633:1: ( ( rule__Function_heading__NameAssignment_1 ) )
            // InternalPascal.g:3634:2: ( rule__Function_heading__NameAssignment_1 )
            {
             before(grammarAccess.getFunction_headingAccess().getNameAssignment_1()); 
            // InternalPascal.g:3635:2: ( rule__Function_heading__NameAssignment_1 )
            // InternalPascal.g:3635:3: rule__Function_heading__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function_heading__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunction_headingAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Function_heading__Group__1__Impl"


    // $ANTLR start "rule__Function_heading__Group__2"
    // InternalPascal.g:3643:1: rule__Function_heading__Group__2 : rule__Function_heading__Group__2__Impl rule__Function_heading__Group__3 ;
    public final void rule__Function_heading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3647:1: ( rule__Function_heading__Group__2__Impl rule__Function_heading__Group__3 )
            // InternalPascal.g:3648:2: rule__Function_heading__Group__2__Impl rule__Function_heading__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Function_heading__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_heading__Group__3();

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
    // $ANTLR end "rule__Function_heading__Group__2"


    // $ANTLR start "rule__Function_heading__Group__2__Impl"
    // InternalPascal.g:3655:1: rule__Function_heading__Group__2__Impl : ( ( rule__Function_heading__ParametersAssignment_2 )? ) ;
    public final void rule__Function_heading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3659:1: ( ( ( rule__Function_heading__ParametersAssignment_2 )? ) )
            // InternalPascal.g:3660:1: ( ( rule__Function_heading__ParametersAssignment_2 )? )
            {
            // InternalPascal.g:3660:1: ( ( rule__Function_heading__ParametersAssignment_2 )? )
            // InternalPascal.g:3661:2: ( rule__Function_heading__ParametersAssignment_2 )?
            {
             before(grammarAccess.getFunction_headingAccess().getParametersAssignment_2()); 
            // InternalPascal.g:3662:2: ( rule__Function_heading__ParametersAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPascal.g:3662:3: rule__Function_heading__ParametersAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function_heading__ParametersAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunction_headingAccess().getParametersAssignment_2()); 

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
    // $ANTLR end "rule__Function_heading__Group__2__Impl"


    // $ANTLR start "rule__Function_heading__Group__3"
    // InternalPascal.g:3670:1: rule__Function_heading__Group__3 : rule__Function_heading__Group__3__Impl rule__Function_heading__Group__4 ;
    public final void rule__Function_heading__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3674:1: ( rule__Function_heading__Group__3__Impl rule__Function_heading__Group__4 )
            // InternalPascal.g:3675:2: rule__Function_heading__Group__3__Impl rule__Function_heading__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Function_heading__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_heading__Group__4();

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
    // $ANTLR end "rule__Function_heading__Group__3"


    // $ANTLR start "rule__Function_heading__Group__3__Impl"
    // InternalPascal.g:3682:1: rule__Function_heading__Group__3__Impl : ( ':' ) ;
    public final void rule__Function_heading__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3686:1: ( ( ':' ) )
            // InternalPascal.g:3687:1: ( ':' )
            {
            // InternalPascal.g:3687:1: ( ':' )
            // InternalPascal.g:3688:2: ':'
            {
             before(grammarAccess.getFunction_headingAccess().getColonKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFunction_headingAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Function_heading__Group__3__Impl"


    // $ANTLR start "rule__Function_heading__Group__4"
    // InternalPascal.g:3697:1: rule__Function_heading__Group__4 : rule__Function_heading__Group__4__Impl ;
    public final void rule__Function_heading__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3701:1: ( rule__Function_heading__Group__4__Impl )
            // InternalPascal.g:3702:2: rule__Function_heading__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function_heading__Group__4__Impl();

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
    // $ANTLR end "rule__Function_heading__Group__4"


    // $ANTLR start "rule__Function_heading__Group__4__Impl"
    // InternalPascal.g:3708:1: rule__Function_heading__Group__4__Impl : ( ( rule__Function_heading__ReturnTypeAssignment_4 ) ) ;
    public final void rule__Function_heading__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3712:1: ( ( ( rule__Function_heading__ReturnTypeAssignment_4 ) ) )
            // InternalPascal.g:3713:1: ( ( rule__Function_heading__ReturnTypeAssignment_4 ) )
            {
            // InternalPascal.g:3713:1: ( ( rule__Function_heading__ReturnTypeAssignment_4 ) )
            // InternalPascal.g:3714:2: ( rule__Function_heading__ReturnTypeAssignment_4 )
            {
             before(grammarAccess.getFunction_headingAccess().getReturnTypeAssignment_4()); 
            // InternalPascal.g:3715:2: ( rule__Function_heading__ReturnTypeAssignment_4 )
            // InternalPascal.g:3715:3: rule__Function_heading__ReturnTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Function_heading__ReturnTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFunction_headingAccess().getReturnTypeAssignment_4()); 

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
    // $ANTLR end "rule__Function_heading__Group__4__Impl"


    // $ANTLR start "rule__Function_declaration__Group__0"
    // InternalPascal.g:3724:1: rule__Function_declaration__Group__0 : rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1 ;
    public final void rule__Function_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3728:1: ( rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1 )
            // InternalPascal.g:3729:2: rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Function_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_declaration__Group__1();

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
    // $ANTLR end "rule__Function_declaration__Group__0"


    // $ANTLR start "rule__Function_declaration__Group__0__Impl"
    // InternalPascal.g:3736:1: rule__Function_declaration__Group__0__Impl : ( ( rule__Function_declaration__HeadingAssignment_0 ) ) ;
    public final void rule__Function_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3740:1: ( ( ( rule__Function_declaration__HeadingAssignment_0 ) ) )
            // InternalPascal.g:3741:1: ( ( rule__Function_declaration__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:3741:1: ( ( rule__Function_declaration__HeadingAssignment_0 ) )
            // InternalPascal.g:3742:2: ( rule__Function_declaration__HeadingAssignment_0 )
            {
             before(grammarAccess.getFunction_declarationAccess().getHeadingAssignment_0()); 
            // InternalPascal.g:3743:2: ( rule__Function_declaration__HeadingAssignment_0 )
            // InternalPascal.g:3743:3: rule__Function_declaration__HeadingAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Function_declaration__HeadingAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunction_declarationAccess().getHeadingAssignment_0()); 

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
    // $ANTLR end "rule__Function_declaration__Group__0__Impl"


    // $ANTLR start "rule__Function_declaration__Group__1"
    // InternalPascal.g:3751:1: rule__Function_declaration__Group__1 : rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2 ;
    public final void rule__Function_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3755:1: ( rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2 )
            // InternalPascal.g:3756:2: rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Function_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_declaration__Group__2();

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
    // $ANTLR end "rule__Function_declaration__Group__1"


    // $ANTLR start "rule__Function_declaration__Group__1__Impl"
    // InternalPascal.g:3763:1: rule__Function_declaration__Group__1__Impl : ( ';' ) ;
    public final void rule__Function_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3767:1: ( ( ';' ) )
            // InternalPascal.g:3768:1: ( ';' )
            {
            // InternalPascal.g:3768:1: ( ';' )
            // InternalPascal.g:3769:2: ';'
            {
             before(grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Function_declaration__Group__1__Impl"


    // $ANTLR start "rule__Function_declaration__Group__2"
    // InternalPascal.g:3778:1: rule__Function_declaration__Group__2 : rule__Function_declaration__Group__2__Impl ;
    public final void rule__Function_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3782:1: ( rule__Function_declaration__Group__2__Impl )
            // InternalPascal.g:3783:2: rule__Function_declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function_declaration__Group__2__Impl();

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
    // $ANTLR end "rule__Function_declaration__Group__2"


    // $ANTLR start "rule__Function_declaration__Group__2__Impl"
    // InternalPascal.g:3789:1: rule__Function_declaration__Group__2__Impl : ( ( rule__Function_declaration__BlockAssignment_2 ) ) ;
    public final void rule__Function_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3793:1: ( ( ( rule__Function_declaration__BlockAssignment_2 ) ) )
            // InternalPascal.g:3794:1: ( ( rule__Function_declaration__BlockAssignment_2 ) )
            {
            // InternalPascal.g:3794:1: ( ( rule__Function_declaration__BlockAssignment_2 ) )
            // InternalPascal.g:3795:2: ( rule__Function_declaration__BlockAssignment_2 )
            {
             before(grammarAccess.getFunction_declarationAccess().getBlockAssignment_2()); 
            // InternalPascal.g:3796:2: ( rule__Function_declaration__BlockAssignment_2 )
            // InternalPascal.g:3796:3: rule__Function_declaration__BlockAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Function_declaration__BlockAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunction_declarationAccess().getBlockAssignment_2()); 

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
    // $ANTLR end "rule__Function_declaration__Group__2__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group__0"
    // InternalPascal.g:3805:1: rule__Formal_parameter_list__Group__0 : rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1 ;
    public final void rule__Formal_parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3809:1: ( rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1 )
            // InternalPascal.g:3810:2: rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Formal_parameter_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group__1();

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
    // $ANTLR end "rule__Formal_parameter_list__Group__0"


    // $ANTLR start "rule__Formal_parameter_list__Group__0__Impl"
    // InternalPascal.g:3817:1: rule__Formal_parameter_list__Group__0__Impl : ( '(' ) ;
    public final void rule__Formal_parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3821:1: ( ( '(' ) )
            // InternalPascal.g:3822:1: ( '(' )
            {
            // InternalPascal.g:3822:1: ( '(' )
            // InternalPascal.g:3823:2: '('
            {
             before(grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Formal_parameter_list__Group__0__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group__1"
    // InternalPascal.g:3832:1: rule__Formal_parameter_list__Group__1 : rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2 ;
    public final void rule__Formal_parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3836:1: ( rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2 )
            // InternalPascal.g:3837:2: rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Formal_parameter_list__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group__2();

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
    // $ANTLR end "rule__Formal_parameter_list__Group__1"


    // $ANTLR start "rule__Formal_parameter_list__Group__1__Impl"
    // InternalPascal.g:3844:1: rule__Formal_parameter_list__Group__1__Impl : ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) ) ;
    public final void rule__Formal_parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3848:1: ( ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) ) )
            // InternalPascal.g:3849:1: ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) )
            {
            // InternalPascal.g:3849:1: ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) )
            // InternalPascal.g:3850:2: ( rule__Formal_parameter_list__ParametersAssignment_1 )
            {
             before(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_1()); 
            // InternalPascal.g:3851:2: ( rule__Formal_parameter_list__ParametersAssignment_1 )
            // InternalPascal.g:3851:3: rule__Formal_parameter_list__ParametersAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__ParametersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_1()); 

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
    // $ANTLR end "rule__Formal_parameter_list__Group__1__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group__2"
    // InternalPascal.g:3859:1: rule__Formal_parameter_list__Group__2 : rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3 ;
    public final void rule__Formal_parameter_list__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3863:1: ( rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3 )
            // InternalPascal.g:3864:2: rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Formal_parameter_list__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group__3();

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
    // $ANTLR end "rule__Formal_parameter_list__Group__2"


    // $ANTLR start "rule__Formal_parameter_list__Group__2__Impl"
    // InternalPascal.g:3871:1: rule__Formal_parameter_list__Group__2__Impl : ( ( rule__Formal_parameter_list__Group_2__0 )* ) ;
    public final void rule__Formal_parameter_list__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3875:1: ( ( ( rule__Formal_parameter_list__Group_2__0 )* ) )
            // InternalPascal.g:3876:1: ( ( rule__Formal_parameter_list__Group_2__0 )* )
            {
            // InternalPascal.g:3876:1: ( ( rule__Formal_parameter_list__Group_2__0 )* )
            // InternalPascal.g:3877:2: ( rule__Formal_parameter_list__Group_2__0 )*
            {
             before(grammarAccess.getFormal_parameter_listAccess().getGroup_2()); 
            // InternalPascal.g:3878:2: ( rule__Formal_parameter_list__Group_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==24) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPascal.g:3878:3: rule__Formal_parameter_list__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Formal_parameter_list__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getFormal_parameter_listAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Formal_parameter_list__Group__2__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group__3"
    // InternalPascal.g:3886:1: rule__Formal_parameter_list__Group__3 : rule__Formal_parameter_list__Group__3__Impl ;
    public final void rule__Formal_parameter_list__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3890:1: ( rule__Formal_parameter_list__Group__3__Impl )
            // InternalPascal.g:3891:2: rule__Formal_parameter_list__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group__3__Impl();

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
    // $ANTLR end "rule__Formal_parameter_list__Group__3"


    // $ANTLR start "rule__Formal_parameter_list__Group__3__Impl"
    // InternalPascal.g:3897:1: rule__Formal_parameter_list__Group__3__Impl : ( ')' ) ;
    public final void rule__Formal_parameter_list__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3901:1: ( ( ')' ) )
            // InternalPascal.g:3902:1: ( ')' )
            {
            // InternalPascal.g:3902:1: ( ')' )
            // InternalPascal.g:3903:2: ')'
            {
             before(grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Formal_parameter_list__Group__3__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group_2__0"
    // InternalPascal.g:3913:1: rule__Formal_parameter_list__Group_2__0 : rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1 ;
    public final void rule__Formal_parameter_list__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3917:1: ( rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1 )
            // InternalPascal.g:3918:2: rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__Formal_parameter_list__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group_2__1();

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
    // $ANTLR end "rule__Formal_parameter_list__Group_2__0"


    // $ANTLR start "rule__Formal_parameter_list__Group_2__0__Impl"
    // InternalPascal.g:3925:1: rule__Formal_parameter_list__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Formal_parameter_list__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3929:1: ( ( ';' ) )
            // InternalPascal.g:3930:1: ( ';' )
            {
            // InternalPascal.g:3930:1: ( ';' )
            // InternalPascal.g:3931:2: ';'
            {
             before(grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0()); 

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
    // $ANTLR end "rule__Formal_parameter_list__Group_2__0__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group_2__1"
    // InternalPascal.g:3940:1: rule__Formal_parameter_list__Group_2__1 : rule__Formal_parameter_list__Group_2__1__Impl ;
    public final void rule__Formal_parameter_list__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3944:1: ( rule__Formal_parameter_list__Group_2__1__Impl )
            // InternalPascal.g:3945:2: rule__Formal_parameter_list__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group_2__1__Impl();

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
    // $ANTLR end "rule__Formal_parameter_list__Group_2__1"


    // $ANTLR start "rule__Formal_parameter_list__Group_2__1__Impl"
    // InternalPascal.g:3951:1: rule__Formal_parameter_list__Group_2__1__Impl : ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) ) ;
    public final void rule__Formal_parameter_list__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3955:1: ( ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) ) )
            // InternalPascal.g:3956:1: ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) )
            {
            // InternalPascal.g:3956:1: ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) )
            // InternalPascal.g:3957:2: ( rule__Formal_parameter_list__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_2_1()); 
            // InternalPascal.g:3958:2: ( rule__Formal_parameter_list__ParametersAssignment_2_1 )
            // InternalPascal.g:3958:3: rule__Formal_parameter_list__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__ParametersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_2_1()); 

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
    // $ANTLR end "rule__Formal_parameter_list__Group_2__1__Impl"


    // $ANTLR start "rule__Value_parameter_section__Group__0"
    // InternalPascal.g:3967:1: rule__Value_parameter_section__Group__0 : rule__Value_parameter_section__Group__0__Impl rule__Value_parameter_section__Group__1 ;
    public final void rule__Value_parameter_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3971:1: ( rule__Value_parameter_section__Group__0__Impl rule__Value_parameter_section__Group__1 )
            // InternalPascal.g:3972:2: rule__Value_parameter_section__Group__0__Impl rule__Value_parameter_section__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Value_parameter_section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value_parameter_section__Group__1();

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
    // $ANTLR end "rule__Value_parameter_section__Group__0"


    // $ANTLR start "rule__Value_parameter_section__Group__0__Impl"
    // InternalPascal.g:3979:1: rule__Value_parameter_section__Group__0__Impl : ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) ) ;
    public final void rule__Value_parameter_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3983:1: ( ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) ) )
            // InternalPascal.g:3984:1: ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) )
            {
            // InternalPascal.g:3984:1: ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) )
            // InternalPascal.g:3985:2: ( rule__Value_parameter_section__IdentifiersAssignment_0 )
            {
             before(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersAssignment_0()); 
            // InternalPascal.g:3986:2: ( rule__Value_parameter_section__IdentifiersAssignment_0 )
            // InternalPascal.g:3986:3: rule__Value_parameter_section__IdentifiersAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Value_parameter_section__IdentifiersAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersAssignment_0()); 

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
    // $ANTLR end "rule__Value_parameter_section__Group__0__Impl"


    // $ANTLR start "rule__Value_parameter_section__Group__1"
    // InternalPascal.g:3994:1: rule__Value_parameter_section__Group__1 : rule__Value_parameter_section__Group__1__Impl rule__Value_parameter_section__Group__2 ;
    public final void rule__Value_parameter_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3998:1: ( rule__Value_parameter_section__Group__1__Impl rule__Value_parameter_section__Group__2 )
            // InternalPascal.g:3999:2: rule__Value_parameter_section__Group__1__Impl rule__Value_parameter_section__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Value_parameter_section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value_parameter_section__Group__2();

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
    // $ANTLR end "rule__Value_parameter_section__Group__1"


    // $ANTLR start "rule__Value_parameter_section__Group__1__Impl"
    // InternalPascal.g:4006:1: rule__Value_parameter_section__Group__1__Impl : ( ':' ) ;
    public final void rule__Value_parameter_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4010:1: ( ( ':' ) )
            // InternalPascal.g:4011:1: ( ':' )
            {
            // InternalPascal.g:4011:1: ( ':' )
            // InternalPascal.g:4012:2: ':'
            {
             before(grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Value_parameter_section__Group__1__Impl"


    // $ANTLR start "rule__Value_parameter_section__Group__2"
    // InternalPascal.g:4021:1: rule__Value_parameter_section__Group__2 : rule__Value_parameter_section__Group__2__Impl ;
    public final void rule__Value_parameter_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4025:1: ( rule__Value_parameter_section__Group__2__Impl )
            // InternalPascal.g:4026:2: rule__Value_parameter_section__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value_parameter_section__Group__2__Impl();

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
    // $ANTLR end "rule__Value_parameter_section__Group__2"


    // $ANTLR start "rule__Value_parameter_section__Group__2__Impl"
    // InternalPascal.g:4032:1: rule__Value_parameter_section__Group__2__Impl : ( ( rule__Value_parameter_section__TypeAssignment_2 ) ) ;
    public final void rule__Value_parameter_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4036:1: ( ( ( rule__Value_parameter_section__TypeAssignment_2 ) ) )
            // InternalPascal.g:4037:1: ( ( rule__Value_parameter_section__TypeAssignment_2 ) )
            {
            // InternalPascal.g:4037:1: ( ( rule__Value_parameter_section__TypeAssignment_2 ) )
            // InternalPascal.g:4038:2: ( rule__Value_parameter_section__TypeAssignment_2 )
            {
             before(grammarAccess.getValue_parameter_sectionAccess().getTypeAssignment_2()); 
            // InternalPascal.g:4039:2: ( rule__Value_parameter_section__TypeAssignment_2 )
            // InternalPascal.g:4039:3: rule__Value_parameter_section__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Value_parameter_section__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getValue_parameter_sectionAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Value_parameter_section__Group__2__Impl"


    // $ANTLR start "rule__Identifier_list__Group__0"
    // InternalPascal.g:4048:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4052:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // InternalPascal.g:4053:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Identifier_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group__1();

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
    // $ANTLR end "rule__Identifier_list__Group__0"


    // $ANTLR start "rule__Identifier_list__Group__0__Impl"
    // InternalPascal.g:4060:1: rule__Identifier_list__Group__0__Impl : ( ( rule__Identifier_list__NamesAssignment_0 ) ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4064:1: ( ( ( rule__Identifier_list__NamesAssignment_0 ) ) )
            // InternalPascal.g:4065:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            {
            // InternalPascal.g:4065:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            // InternalPascal.g:4066:2: ( rule__Identifier_list__NamesAssignment_0 )
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_0()); 
            // InternalPascal.g:4067:2: ( rule__Identifier_list__NamesAssignment_0 )
            // InternalPascal.g:4067:3: rule__Identifier_list__NamesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__NamesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIdentifier_listAccess().getNamesAssignment_0()); 

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
    // $ANTLR end "rule__Identifier_list__Group__0__Impl"


    // $ANTLR start "rule__Identifier_list__Group__1"
    // InternalPascal.g:4075:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4079:1: ( rule__Identifier_list__Group__1__Impl )
            // InternalPascal.g:4080:2: rule__Identifier_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group__1__Impl();

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
    // $ANTLR end "rule__Identifier_list__Group__1"


    // $ANTLR start "rule__Identifier_list__Group__1__Impl"
    // InternalPascal.g:4086:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4090:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // InternalPascal.g:4091:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // InternalPascal.g:4091:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // InternalPascal.g:4092:2: ( rule__Identifier_list__Group_1__0 )*
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            // InternalPascal.g:4093:2: ( rule__Identifier_list__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==32) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPascal.g:4093:3: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Identifier_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getIdentifier_listAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Identifier_list__Group__1__Impl"


    // $ANTLR start "rule__Identifier_list__Group_1__0"
    // InternalPascal.g:4102:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4106:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // InternalPascal.g:4107:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Identifier_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group_1__1();

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
    // $ANTLR end "rule__Identifier_list__Group_1__0"


    // $ANTLR start "rule__Identifier_list__Group_1__0__Impl"
    // InternalPascal.g:4114:1: rule__Identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4118:1: ( ( ',' ) )
            // InternalPascal.g:4119:1: ( ',' )
            {
            // InternalPascal.g:4119:1: ( ',' )
            // InternalPascal.g:4120:2: ','
            {
             before(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Identifier_list__Group_1__0__Impl"


    // $ANTLR start "rule__Identifier_list__Group_1__1"
    // InternalPascal.g:4129:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4133:1: ( rule__Identifier_list__Group_1__1__Impl )
            // InternalPascal.g:4134:2: rule__Identifier_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group_1__1__Impl();

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
    // $ANTLR end "rule__Identifier_list__Group_1__1"


    // $ANTLR start "rule__Identifier_list__Group_1__1__Impl"
    // InternalPascal.g:4140:1: rule__Identifier_list__Group_1__1__Impl : ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4144:1: ( ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) )
            // InternalPascal.g:4145:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            {
            // InternalPascal.g:4145:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            // InternalPascal.g:4146:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_1_1()); 
            // InternalPascal.g:4147:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            // InternalPascal.g:4147:3: rule__Identifier_list__NamesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__NamesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIdentifier_listAccess().getNamesAssignment_1_1()); 

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
    // $ANTLR end "rule__Identifier_list__Group_1__1__Impl"


    // $ANTLR start "rule__Variable_parameter_section__Group__0"
    // InternalPascal.g:4156:1: rule__Variable_parameter_section__Group__0 : rule__Variable_parameter_section__Group__0__Impl rule__Variable_parameter_section__Group__1 ;
    public final void rule__Variable_parameter_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4160:1: ( rule__Variable_parameter_section__Group__0__Impl rule__Variable_parameter_section__Group__1 )
            // InternalPascal.g:4161:2: rule__Variable_parameter_section__Group__0__Impl rule__Variable_parameter_section__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Variable_parameter_section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_parameter_section__Group__1();

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
    // $ANTLR end "rule__Variable_parameter_section__Group__0"


    // $ANTLR start "rule__Variable_parameter_section__Group__0__Impl"
    // InternalPascal.g:4168:1: rule__Variable_parameter_section__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable_parameter_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4172:1: ( ( 'var' ) )
            // InternalPascal.g:4173:1: ( 'var' )
            {
            // InternalPascal.g:4173:1: ( 'var' )
            // InternalPascal.g:4174:2: 'var'
            {
             before(grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0()); 

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
    // $ANTLR end "rule__Variable_parameter_section__Group__0__Impl"


    // $ANTLR start "rule__Variable_parameter_section__Group__1"
    // InternalPascal.g:4183:1: rule__Variable_parameter_section__Group__1 : rule__Variable_parameter_section__Group__1__Impl rule__Variable_parameter_section__Group__2 ;
    public final void rule__Variable_parameter_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4187:1: ( rule__Variable_parameter_section__Group__1__Impl rule__Variable_parameter_section__Group__2 )
            // InternalPascal.g:4188:2: rule__Variable_parameter_section__Group__1__Impl rule__Variable_parameter_section__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Variable_parameter_section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_parameter_section__Group__2();

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
    // $ANTLR end "rule__Variable_parameter_section__Group__1"


    // $ANTLR start "rule__Variable_parameter_section__Group__1__Impl"
    // InternalPascal.g:4195:1: rule__Variable_parameter_section__Group__1__Impl : ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) ) ;
    public final void rule__Variable_parameter_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4199:1: ( ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) ) )
            // InternalPascal.g:4200:1: ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) )
            {
            // InternalPascal.g:4200:1: ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) )
            // InternalPascal.g:4201:2: ( rule__Variable_parameter_section__IndentifiersAssignment_1 )
            {
             before(grammarAccess.getVariable_parameter_sectionAccess().getIndentifiersAssignment_1()); 
            // InternalPascal.g:4202:2: ( rule__Variable_parameter_section__IndentifiersAssignment_1 )
            // InternalPascal.g:4202:3: rule__Variable_parameter_section__IndentifiersAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable_parameter_section__IndentifiersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariable_parameter_sectionAccess().getIndentifiersAssignment_1()); 

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
    // $ANTLR end "rule__Variable_parameter_section__Group__1__Impl"


    // $ANTLR start "rule__Variable_parameter_section__Group__2"
    // InternalPascal.g:4210:1: rule__Variable_parameter_section__Group__2 : rule__Variable_parameter_section__Group__2__Impl rule__Variable_parameter_section__Group__3 ;
    public final void rule__Variable_parameter_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4214:1: ( rule__Variable_parameter_section__Group__2__Impl rule__Variable_parameter_section__Group__3 )
            // InternalPascal.g:4215:2: rule__Variable_parameter_section__Group__2__Impl rule__Variable_parameter_section__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Variable_parameter_section__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_parameter_section__Group__3();

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
    // $ANTLR end "rule__Variable_parameter_section__Group__2"


    // $ANTLR start "rule__Variable_parameter_section__Group__2__Impl"
    // InternalPascal.g:4222:1: rule__Variable_parameter_section__Group__2__Impl : ( ':' ) ;
    public final void rule__Variable_parameter_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4226:1: ( ( ':' ) )
            // InternalPascal.g:4227:1: ( ':' )
            {
            // InternalPascal.g:4227:1: ( ':' )
            // InternalPascal.g:4228:2: ':'
            {
             before(grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Variable_parameter_section__Group__2__Impl"


    // $ANTLR start "rule__Variable_parameter_section__Group__3"
    // InternalPascal.g:4237:1: rule__Variable_parameter_section__Group__3 : rule__Variable_parameter_section__Group__3__Impl ;
    public final void rule__Variable_parameter_section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4241:1: ( rule__Variable_parameter_section__Group__3__Impl )
            // InternalPascal.g:4242:2: rule__Variable_parameter_section__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_parameter_section__Group__3__Impl();

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
    // $ANTLR end "rule__Variable_parameter_section__Group__3"


    // $ANTLR start "rule__Variable_parameter_section__Group__3__Impl"
    // InternalPascal.g:4248:1: rule__Variable_parameter_section__Group__3__Impl : ( ( rule__Variable_parameter_section__TypeAssignment_3 ) ) ;
    public final void rule__Variable_parameter_section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4252:1: ( ( ( rule__Variable_parameter_section__TypeAssignment_3 ) ) )
            // InternalPascal.g:4253:1: ( ( rule__Variable_parameter_section__TypeAssignment_3 ) )
            {
            // InternalPascal.g:4253:1: ( ( rule__Variable_parameter_section__TypeAssignment_3 ) )
            // InternalPascal.g:4254:2: ( rule__Variable_parameter_section__TypeAssignment_3 )
            {
             before(grammarAccess.getVariable_parameter_sectionAccess().getTypeAssignment_3()); 
            // InternalPascal.g:4255:2: ( rule__Variable_parameter_section__TypeAssignment_3 )
            // InternalPascal.g:4255:3: rule__Variable_parameter_section__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Variable_parameter_section__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariable_parameter_sectionAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Variable_parameter_section__Group__3__Impl"


    // $ANTLR start "rule__Procedure_declaration__Group__0"
    // InternalPascal.g:4264:1: rule__Procedure_declaration__Group__0 : rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1 ;
    public final void rule__Procedure_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4268:1: ( rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1 )
            // InternalPascal.g:4269:2: rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Procedure_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__Group__1();

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
    // $ANTLR end "rule__Procedure_declaration__Group__0"


    // $ANTLR start "rule__Procedure_declaration__Group__0__Impl"
    // InternalPascal.g:4276:1: rule__Procedure_declaration__Group__0__Impl : ( ( rule__Procedure_declaration__HeadingAssignment_0 ) ) ;
    public final void rule__Procedure_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4280:1: ( ( ( rule__Procedure_declaration__HeadingAssignment_0 ) ) )
            // InternalPascal.g:4281:1: ( ( rule__Procedure_declaration__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:4281:1: ( ( rule__Procedure_declaration__HeadingAssignment_0 ) )
            // InternalPascal.g:4282:2: ( rule__Procedure_declaration__HeadingAssignment_0 )
            {
             before(grammarAccess.getProcedure_declarationAccess().getHeadingAssignment_0()); 
            // InternalPascal.g:4283:2: ( rule__Procedure_declaration__HeadingAssignment_0 )
            // InternalPascal.g:4283:3: rule__Procedure_declaration__HeadingAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__HeadingAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_declarationAccess().getHeadingAssignment_0()); 

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
    // $ANTLR end "rule__Procedure_declaration__Group__0__Impl"


    // $ANTLR start "rule__Procedure_declaration__Group__1"
    // InternalPascal.g:4291:1: rule__Procedure_declaration__Group__1 : rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2 ;
    public final void rule__Procedure_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4295:1: ( rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2 )
            // InternalPascal.g:4296:2: rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Procedure_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__Group__2();

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
    // $ANTLR end "rule__Procedure_declaration__Group__1"


    // $ANTLR start "rule__Procedure_declaration__Group__1__Impl"
    // InternalPascal.g:4303:1: rule__Procedure_declaration__Group__1__Impl : ( ';' ) ;
    public final void rule__Procedure_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4307:1: ( ( ';' ) )
            // InternalPascal.g:4308:1: ( ';' )
            {
            // InternalPascal.g:4308:1: ( ';' )
            // InternalPascal.g:4309:2: ';'
            {
             before(grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Procedure_declaration__Group__1__Impl"


    // $ANTLR start "rule__Procedure_declaration__Group__2"
    // InternalPascal.g:4318:1: rule__Procedure_declaration__Group__2 : rule__Procedure_declaration__Group__2__Impl ;
    public final void rule__Procedure_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4322:1: ( rule__Procedure_declaration__Group__2__Impl )
            // InternalPascal.g:4323:2: rule__Procedure_declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__Group__2__Impl();

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
    // $ANTLR end "rule__Procedure_declaration__Group__2"


    // $ANTLR start "rule__Procedure_declaration__Group__2__Impl"
    // InternalPascal.g:4329:1: rule__Procedure_declaration__Group__2__Impl : ( ( rule__Procedure_declaration__BlockAssignment_2 ) ) ;
    public final void rule__Procedure_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4333:1: ( ( ( rule__Procedure_declaration__BlockAssignment_2 ) ) )
            // InternalPascal.g:4334:1: ( ( rule__Procedure_declaration__BlockAssignment_2 ) )
            {
            // InternalPascal.g:4334:1: ( ( rule__Procedure_declaration__BlockAssignment_2 ) )
            // InternalPascal.g:4335:2: ( rule__Procedure_declaration__BlockAssignment_2 )
            {
             before(grammarAccess.getProcedure_declarationAccess().getBlockAssignment_2()); 
            // InternalPascal.g:4336:2: ( rule__Procedure_declaration__BlockAssignment_2 )
            // InternalPascal.g:4336:3: rule__Procedure_declaration__BlockAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__BlockAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_declarationAccess().getBlockAssignment_2()); 

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
    // $ANTLR end "rule__Procedure_declaration__Group__2__Impl"


    // $ANTLR start "rule__Procedure_heading__Group__0"
    // InternalPascal.g:4345:1: rule__Procedure_heading__Group__0 : rule__Procedure_heading__Group__0__Impl rule__Procedure_heading__Group__1 ;
    public final void rule__Procedure_heading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4349:1: ( rule__Procedure_heading__Group__0__Impl rule__Procedure_heading__Group__1 )
            // InternalPascal.g:4350:2: rule__Procedure_heading__Group__0__Impl rule__Procedure_heading__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Procedure_heading__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure_heading__Group__1();

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
    // $ANTLR end "rule__Procedure_heading__Group__0"


    // $ANTLR start "rule__Procedure_heading__Group__0__Impl"
    // InternalPascal.g:4357:1: rule__Procedure_heading__Group__0__Impl : ( 'procedure' ) ;
    public final void rule__Procedure_heading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4361:1: ( ( 'procedure' ) )
            // InternalPascal.g:4362:1: ( 'procedure' )
            {
            // InternalPascal.g:4362:1: ( 'procedure' )
            // InternalPascal.g:4363:2: 'procedure'
            {
             before(grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0()); 

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
    // $ANTLR end "rule__Procedure_heading__Group__0__Impl"


    // $ANTLR start "rule__Procedure_heading__Group__1"
    // InternalPascal.g:4372:1: rule__Procedure_heading__Group__1 : rule__Procedure_heading__Group__1__Impl rule__Procedure_heading__Group__2 ;
    public final void rule__Procedure_heading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4376:1: ( rule__Procedure_heading__Group__1__Impl rule__Procedure_heading__Group__2 )
            // InternalPascal.g:4377:2: rule__Procedure_heading__Group__1__Impl rule__Procedure_heading__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Procedure_heading__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure_heading__Group__2();

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
    // $ANTLR end "rule__Procedure_heading__Group__1"


    // $ANTLR start "rule__Procedure_heading__Group__1__Impl"
    // InternalPascal.g:4384:1: rule__Procedure_heading__Group__1__Impl : ( ( rule__Procedure_heading__NameAssignment_1 ) ) ;
    public final void rule__Procedure_heading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4388:1: ( ( ( rule__Procedure_heading__NameAssignment_1 ) ) )
            // InternalPascal.g:4389:1: ( ( rule__Procedure_heading__NameAssignment_1 ) )
            {
            // InternalPascal.g:4389:1: ( ( rule__Procedure_heading__NameAssignment_1 ) )
            // InternalPascal.g:4390:2: ( rule__Procedure_heading__NameAssignment_1 )
            {
             before(grammarAccess.getProcedure_headingAccess().getNameAssignment_1()); 
            // InternalPascal.g:4391:2: ( rule__Procedure_heading__NameAssignment_1 )
            // InternalPascal.g:4391:3: rule__Procedure_heading__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_heading__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_headingAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Procedure_heading__Group__1__Impl"


    // $ANTLR start "rule__Procedure_heading__Group__2"
    // InternalPascal.g:4399:1: rule__Procedure_heading__Group__2 : rule__Procedure_heading__Group__2__Impl ;
    public final void rule__Procedure_heading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4403:1: ( rule__Procedure_heading__Group__2__Impl )
            // InternalPascal.g:4404:2: rule__Procedure_heading__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_heading__Group__2__Impl();

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
    // $ANTLR end "rule__Procedure_heading__Group__2"


    // $ANTLR start "rule__Procedure_heading__Group__2__Impl"
    // InternalPascal.g:4410:1: rule__Procedure_heading__Group__2__Impl : ( ( rule__Procedure_heading__ParametersAssignment_2 )? ) ;
    public final void rule__Procedure_heading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4414:1: ( ( ( rule__Procedure_heading__ParametersAssignment_2 )? ) )
            // InternalPascal.g:4415:1: ( ( rule__Procedure_heading__ParametersAssignment_2 )? )
            {
            // InternalPascal.g:4415:1: ( ( rule__Procedure_heading__ParametersAssignment_2 )? )
            // InternalPascal.g:4416:2: ( rule__Procedure_heading__ParametersAssignment_2 )?
            {
             before(grammarAccess.getProcedure_headingAccess().getParametersAssignment_2()); 
            // InternalPascal.g:4417:2: ( rule__Procedure_heading__ParametersAssignment_2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==33) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPascal.g:4417:3: rule__Procedure_heading__ParametersAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Procedure_heading__ParametersAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcedure_headingAccess().getParametersAssignment_2()); 

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
    // $ANTLR end "rule__Procedure_heading__Group__2__Impl"


    // $ANTLR start "rule__Set__Group__0"
    // InternalPascal.g:4426:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4430:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // InternalPascal.g:4431:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalPascal.g:4438:1: rule__Set__Group__0__Impl : ( ( rule__Set__BracketsAssignment_0 ) ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4442:1: ( ( ( rule__Set__BracketsAssignment_0 ) ) )
            // InternalPascal.g:4443:1: ( ( rule__Set__BracketsAssignment_0 ) )
            {
            // InternalPascal.g:4443:1: ( ( rule__Set__BracketsAssignment_0 ) )
            // InternalPascal.g:4444:2: ( rule__Set__BracketsAssignment_0 )
            {
             before(grammarAccess.getSetAccess().getBracketsAssignment_0()); 
            // InternalPascal.g:4445:2: ( rule__Set__BracketsAssignment_0 )
            // InternalPascal.g:4445:3: rule__Set__BracketsAssignment_0
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
    // InternalPascal.g:4453:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4457:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // InternalPascal.g:4458:2: rule__Set__Group__1__Impl rule__Set__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalPascal.g:4465:1: rule__Set__Group__1__Impl : ( ( rule__Set__ExpressionsAssignment_1 )? ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4469:1: ( ( ( rule__Set__ExpressionsAssignment_1 )? ) )
            // InternalPascal.g:4470:1: ( ( rule__Set__ExpressionsAssignment_1 )? )
            {
            // InternalPascal.g:4470:1: ( ( rule__Set__ExpressionsAssignment_1 )? )
            // InternalPascal.g:4471:2: ( rule__Set__ExpressionsAssignment_1 )?
            {
             before(grammarAccess.getSetAccess().getExpressionsAssignment_1()); 
            // InternalPascal.g:4472:2: ( rule__Set__ExpressionsAssignment_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_INTEGER_NUMBER)||LA39_0==RULE_ADDITION_OP||LA39_0==RULE_STRING||(LA39_0>=RULE_SIGNED_REAL_NUMBER && LA39_0<=RULE_REAL_NUMBER)||LA39_0==29||LA39_0==33||LA39_0==35||(LA39_0>=51 && LA39_0<=53)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPascal.g:4472:3: rule__Set__ExpressionsAssignment_1
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
    // InternalPascal.g:4480:1: rule__Set__Group__2 : rule__Set__Group__2__Impl ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4484:1: ( rule__Set__Group__2__Impl )
            // InternalPascal.g:4485:2: rule__Set__Group__2__Impl
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
    // InternalPascal.g:4491:1: rule__Set__Group__2__Impl : ( ( rule__Set__BracketsAssignment_2 ) ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4495:1: ( ( ( rule__Set__BracketsAssignment_2 ) ) )
            // InternalPascal.g:4496:1: ( ( rule__Set__BracketsAssignment_2 ) )
            {
            // InternalPascal.g:4496:1: ( ( rule__Set__BracketsAssignment_2 ) )
            // InternalPascal.g:4497:2: ( rule__Set__BracketsAssignment_2 )
            {
             before(grammarAccess.getSetAccess().getBracketsAssignment_2()); 
            // InternalPascal.g:4498:2: ( rule__Set__BracketsAssignment_2 )
            // InternalPascal.g:4498:3: rule__Set__BracketsAssignment_2
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


    // $ANTLR start "rule__Label_declaration__Group__0"
    // InternalPascal.g:4507:1: rule__Label_declaration__Group__0 : rule__Label_declaration__Group__0__Impl rule__Label_declaration__Group__1 ;
    public final void rule__Label_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4511:1: ( rule__Label_declaration__Group__0__Impl rule__Label_declaration__Group__1 )
            // InternalPascal.g:4512:2: rule__Label_declaration__Group__0__Impl rule__Label_declaration__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Label_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label_declaration__Group__1();

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
    // $ANTLR end "rule__Label_declaration__Group__0"


    // $ANTLR start "rule__Label_declaration__Group__0__Impl"
    // InternalPascal.g:4519:1: rule__Label_declaration__Group__0__Impl : ( 'label' ) ;
    public final void rule__Label_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4523:1: ( ( 'label' ) )
            // InternalPascal.g:4524:1: ( 'label' )
            {
            // InternalPascal.g:4524:1: ( 'label' )
            // InternalPascal.g:4525:2: 'label'
            {
             before(grammarAccess.getLabel_declarationAccess().getLabelKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLabel_declarationAccess().getLabelKeyword_0()); 

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
    // $ANTLR end "rule__Label_declaration__Group__0__Impl"


    // $ANTLR start "rule__Label_declaration__Group__1"
    // InternalPascal.g:4534:1: rule__Label_declaration__Group__1 : rule__Label_declaration__Group__1__Impl rule__Label_declaration__Group__2 ;
    public final void rule__Label_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4538:1: ( rule__Label_declaration__Group__1__Impl rule__Label_declaration__Group__2 )
            // InternalPascal.g:4539:2: rule__Label_declaration__Group__1__Impl rule__Label_declaration__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Label_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label_declaration__Group__2();

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
    // $ANTLR end "rule__Label_declaration__Group__1"


    // $ANTLR start "rule__Label_declaration__Group__1__Impl"
    // InternalPascal.g:4546:1: rule__Label_declaration__Group__1__Impl : ( ( rule__Label_declaration__LabelsAssignment_1 ) ) ;
    public final void rule__Label_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4550:1: ( ( ( rule__Label_declaration__LabelsAssignment_1 ) ) )
            // InternalPascal.g:4551:1: ( ( rule__Label_declaration__LabelsAssignment_1 ) )
            {
            // InternalPascal.g:4551:1: ( ( rule__Label_declaration__LabelsAssignment_1 ) )
            // InternalPascal.g:4552:2: ( rule__Label_declaration__LabelsAssignment_1 )
            {
             before(grammarAccess.getLabel_declarationAccess().getLabelsAssignment_1()); 
            // InternalPascal.g:4553:2: ( rule__Label_declaration__LabelsAssignment_1 )
            // InternalPascal.g:4553:3: rule__Label_declaration__LabelsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Label_declaration__LabelsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLabel_declarationAccess().getLabelsAssignment_1()); 

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
    // $ANTLR end "rule__Label_declaration__Group__1__Impl"


    // $ANTLR start "rule__Label_declaration__Group__2"
    // InternalPascal.g:4561:1: rule__Label_declaration__Group__2 : rule__Label_declaration__Group__2__Impl rule__Label_declaration__Group__3 ;
    public final void rule__Label_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4565:1: ( rule__Label_declaration__Group__2__Impl rule__Label_declaration__Group__3 )
            // InternalPascal.g:4566:2: rule__Label_declaration__Group__2__Impl rule__Label_declaration__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Label_declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label_declaration__Group__3();

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
    // $ANTLR end "rule__Label_declaration__Group__2"


    // $ANTLR start "rule__Label_declaration__Group__2__Impl"
    // InternalPascal.g:4573:1: rule__Label_declaration__Group__2__Impl : ( ( rule__Label_declaration__Group_2__0 )* ) ;
    public final void rule__Label_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4577:1: ( ( ( rule__Label_declaration__Group_2__0 )* ) )
            // InternalPascal.g:4578:1: ( ( rule__Label_declaration__Group_2__0 )* )
            {
            // InternalPascal.g:4578:1: ( ( rule__Label_declaration__Group_2__0 )* )
            // InternalPascal.g:4579:2: ( rule__Label_declaration__Group_2__0 )*
            {
             before(grammarAccess.getLabel_declarationAccess().getGroup_2()); 
            // InternalPascal.g:4580:2: ( rule__Label_declaration__Group_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==32) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPascal.g:4580:3: rule__Label_declaration__Group_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Label_declaration__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getLabel_declarationAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Label_declaration__Group__2__Impl"


    // $ANTLR start "rule__Label_declaration__Group__3"
    // InternalPascal.g:4588:1: rule__Label_declaration__Group__3 : rule__Label_declaration__Group__3__Impl ;
    public final void rule__Label_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4592:1: ( rule__Label_declaration__Group__3__Impl )
            // InternalPascal.g:4593:2: rule__Label_declaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Label_declaration__Group__3__Impl();

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
    // $ANTLR end "rule__Label_declaration__Group__3"


    // $ANTLR start "rule__Label_declaration__Group__3__Impl"
    // InternalPascal.g:4599:1: rule__Label_declaration__Group__3__Impl : ( ';' ) ;
    public final void rule__Label_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4603:1: ( ( ';' ) )
            // InternalPascal.g:4604:1: ( ';' )
            {
            // InternalPascal.g:4604:1: ( ';' )
            // InternalPascal.g:4605:2: ';'
            {
             before(grammarAccess.getLabel_declarationAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLabel_declarationAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Label_declaration__Group__3__Impl"


    // $ANTLR start "rule__Label_declaration__Group_2__0"
    // InternalPascal.g:4615:1: rule__Label_declaration__Group_2__0 : rule__Label_declaration__Group_2__0__Impl rule__Label_declaration__Group_2__1 ;
    public final void rule__Label_declaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4619:1: ( rule__Label_declaration__Group_2__0__Impl rule__Label_declaration__Group_2__1 )
            // InternalPascal.g:4620:2: rule__Label_declaration__Group_2__0__Impl rule__Label_declaration__Group_2__1
            {
            pushFollow(FOLLOW_30);
            rule__Label_declaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label_declaration__Group_2__1();

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
    // $ANTLR end "rule__Label_declaration__Group_2__0"


    // $ANTLR start "rule__Label_declaration__Group_2__0__Impl"
    // InternalPascal.g:4627:1: rule__Label_declaration__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Label_declaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4631:1: ( ( ',' ) )
            // InternalPascal.g:4632:1: ( ',' )
            {
            // InternalPascal.g:4632:1: ( ',' )
            // InternalPascal.g:4633:2: ','
            {
             before(grammarAccess.getLabel_declarationAccess().getCommaKeyword_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLabel_declarationAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Label_declaration__Group_2__0__Impl"


    // $ANTLR start "rule__Label_declaration__Group_2__1"
    // InternalPascal.g:4642:1: rule__Label_declaration__Group_2__1 : rule__Label_declaration__Group_2__1__Impl ;
    public final void rule__Label_declaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4646:1: ( rule__Label_declaration__Group_2__1__Impl )
            // InternalPascal.g:4647:2: rule__Label_declaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Label_declaration__Group_2__1__Impl();

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
    // $ANTLR end "rule__Label_declaration__Group_2__1"


    // $ANTLR start "rule__Label_declaration__Group_2__1__Impl"
    // InternalPascal.g:4653:1: rule__Label_declaration__Group_2__1__Impl : ( ( rule__Label_declaration__LabelsAssignment_2_1 ) ) ;
    public final void rule__Label_declaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4657:1: ( ( ( rule__Label_declaration__LabelsAssignment_2_1 ) ) )
            // InternalPascal.g:4658:1: ( ( rule__Label_declaration__LabelsAssignment_2_1 ) )
            {
            // InternalPascal.g:4658:1: ( ( rule__Label_declaration__LabelsAssignment_2_1 ) )
            // InternalPascal.g:4659:2: ( rule__Label_declaration__LabelsAssignment_2_1 )
            {
             before(grammarAccess.getLabel_declarationAccess().getLabelsAssignment_2_1()); 
            // InternalPascal.g:4660:2: ( rule__Label_declaration__LabelsAssignment_2_1 )
            // InternalPascal.g:4660:3: rule__Label_declaration__LabelsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Label_declaration__LabelsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLabel_declarationAccess().getLabelsAssignment_2_1()); 

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
    // $ANTLR end "rule__Label_declaration__Group_2__1__Impl"


    // $ANTLR start "rule__Constant__Group_0__0"
    // InternalPascal.g:4669:1: rule__Constant__Group_0__0 : rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 ;
    public final void rule__Constant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4673:1: ( rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 )
            // InternalPascal.g:4674:2: rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1
            {
            pushFollow(FOLLOW_32);
            rule__Constant__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group_0__1();

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
    // $ANTLR end "rule__Constant__Group_0__0"


    // $ANTLR start "rule__Constant__Group_0__0__Impl"
    // InternalPascal.g:4681:1: rule__Constant__Group_0__0__Impl : ( ( rule__Constant__OpteratorAssignment_0_0 )? ) ;
    public final void rule__Constant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4685:1: ( ( ( rule__Constant__OpteratorAssignment_0_0 )? ) )
            // InternalPascal.g:4686:1: ( ( rule__Constant__OpteratorAssignment_0_0 )? )
            {
            // InternalPascal.g:4686:1: ( ( rule__Constant__OpteratorAssignment_0_0 )? )
            // InternalPascal.g:4687:2: ( rule__Constant__OpteratorAssignment_0_0 )?
            {
             before(grammarAccess.getConstantAccess().getOpteratorAssignment_0_0()); 
            // InternalPascal.g:4688:2: ( rule__Constant__OpteratorAssignment_0_0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ADDITION_OP) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalPascal.g:4688:3: rule__Constant__OpteratorAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__OpteratorAssignment_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstantAccess().getOpteratorAssignment_0_0()); 

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
    // $ANTLR end "rule__Constant__Group_0__0__Impl"


    // $ANTLR start "rule__Constant__Group_0__1"
    // InternalPascal.g:4696:1: rule__Constant__Group_0__1 : rule__Constant__Group_0__1__Impl ;
    public final void rule__Constant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4700:1: ( rule__Constant__Group_0__1__Impl )
            // InternalPascal.g:4701:2: rule__Constant__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group_0__1__Impl();

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
    // $ANTLR end "rule__Constant__Group_0__1"


    // $ANTLR start "rule__Constant__Group_0__1__Impl"
    // InternalPascal.g:4707:1: rule__Constant__Group_0__1__Impl : ( ( rule__Constant__Alternatives_0_1 ) ) ;
    public final void rule__Constant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4711:1: ( ( ( rule__Constant__Alternatives_0_1 ) ) )
            // InternalPascal.g:4712:1: ( ( rule__Constant__Alternatives_0_1 ) )
            {
            // InternalPascal.g:4712:1: ( ( rule__Constant__Alternatives_0_1 ) )
            // InternalPascal.g:4713:2: ( rule__Constant__Alternatives_0_1 )
            {
             before(grammarAccess.getConstantAccess().getAlternatives_0_1()); 
            // InternalPascal.g:4714:2: ( rule__Constant__Alternatives_0_1 )
            // InternalPascal.g:4714:3: rule__Constant__Alternatives_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives_0_1()); 

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
    // $ANTLR end "rule__Constant__Group_0__1__Impl"


    // $ANTLR start "rule__Constant_definition_part__Group__0"
    // InternalPascal.g:4723:1: rule__Constant_definition_part__Group__0 : rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1 ;
    public final void rule__Constant_definition_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4727:1: ( rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1 )
            // InternalPascal.g:4728:2: rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Constant_definition_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__Group__1();

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
    // $ANTLR end "rule__Constant_definition_part__Group__0"


    // $ANTLR start "rule__Constant_definition_part__Group__0__Impl"
    // InternalPascal.g:4735:1: rule__Constant_definition_part__Group__0__Impl : ( 'const' ) ;
    public final void rule__Constant_definition_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4739:1: ( ( 'const' ) )
            // InternalPascal.g:4740:1: ( 'const' )
            {
            // InternalPascal.g:4740:1: ( 'const' )
            // InternalPascal.g:4741:2: 'const'
            {
             before(grammarAccess.getConstant_definition_partAccess().getConstKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getConstant_definition_partAccess().getConstKeyword_0()); 

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
    // $ANTLR end "rule__Constant_definition_part__Group__0__Impl"


    // $ANTLR start "rule__Constant_definition_part__Group__1"
    // InternalPascal.g:4750:1: rule__Constant_definition_part__Group__1 : rule__Constant_definition_part__Group__1__Impl ;
    public final void rule__Constant_definition_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4754:1: ( rule__Constant_definition_part__Group__1__Impl )
            // InternalPascal.g:4755:2: rule__Constant_definition_part__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__Group__1__Impl();

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
    // $ANTLR end "rule__Constant_definition_part__Group__1"


    // $ANTLR start "rule__Constant_definition_part__Group__1__Impl"
    // InternalPascal.g:4761:1: rule__Constant_definition_part__Group__1__Impl : ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) ) ;
    public final void rule__Constant_definition_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4765:1: ( ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) ) )
            // InternalPascal.g:4766:1: ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) )
            {
            // InternalPascal.g:4766:1: ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) )
            // InternalPascal.g:4767:2: ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* )
            {
            // InternalPascal.g:4767:2: ( ( rule__Constant_definition_part__Group_1__0 ) )
            // InternalPascal.g:4768:3: ( rule__Constant_definition_part__Group_1__0 )
            {
             before(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            // InternalPascal.g:4769:3: ( rule__Constant_definition_part__Group_1__0 )
            // InternalPascal.g:4769:4: rule__Constant_definition_part__Group_1__0
            {
            pushFollow(FOLLOW_33);
            rule__Constant_definition_part__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 

            }

            // InternalPascal.g:4772:2: ( ( rule__Constant_definition_part__Group_1__0 )* )
            // InternalPascal.g:4773:3: ( rule__Constant_definition_part__Group_1__0 )*
            {
             before(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            // InternalPascal.g:4774:3: ( rule__Constant_definition_part__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPascal.g:4774:4: rule__Constant_definition_part__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Constant_definition_part__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 

            }


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
    // $ANTLR end "rule__Constant_definition_part__Group__1__Impl"


    // $ANTLR start "rule__Constant_definition_part__Group_1__0"
    // InternalPascal.g:4784:1: rule__Constant_definition_part__Group_1__0 : rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1 ;
    public final void rule__Constant_definition_part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4788:1: ( rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1 )
            // InternalPascal.g:4789:2: rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Constant_definition_part__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__Group_1__1();

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
    // $ANTLR end "rule__Constant_definition_part__Group_1__0"


    // $ANTLR start "rule__Constant_definition_part__Group_1__0__Impl"
    // InternalPascal.g:4796:1: rule__Constant_definition_part__Group_1__0__Impl : ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) ) ;
    public final void rule__Constant_definition_part__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4800:1: ( ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) ) )
            // InternalPascal.g:4801:1: ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) )
            {
            // InternalPascal.g:4801:1: ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) )
            // InternalPascal.g:4802:2: ( rule__Constant_definition_part__ConstsAssignment_1_0 )
            {
             before(grammarAccess.getConstant_definition_partAccess().getConstsAssignment_1_0()); 
            // InternalPascal.g:4803:2: ( rule__Constant_definition_part__ConstsAssignment_1_0 )
            // InternalPascal.g:4803:3: rule__Constant_definition_part__ConstsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__ConstsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConstant_definition_partAccess().getConstsAssignment_1_0()); 

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
    // $ANTLR end "rule__Constant_definition_part__Group_1__0__Impl"


    // $ANTLR start "rule__Constant_definition_part__Group_1__1"
    // InternalPascal.g:4811:1: rule__Constant_definition_part__Group_1__1 : rule__Constant_definition_part__Group_1__1__Impl ;
    public final void rule__Constant_definition_part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4815:1: ( rule__Constant_definition_part__Group_1__1__Impl )
            // InternalPascal.g:4816:2: rule__Constant_definition_part__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__Group_1__1__Impl();

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
    // $ANTLR end "rule__Constant_definition_part__Group_1__1"


    // $ANTLR start "rule__Constant_definition_part__Group_1__1__Impl"
    // InternalPascal.g:4822:1: rule__Constant_definition_part__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Constant_definition_part__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4826:1: ( ( ';' ) )
            // InternalPascal.g:4827:1: ( ';' )
            {
            // InternalPascal.g:4827:1: ( ';' )
            // InternalPascal.g:4828:2: ';'
            {
             before(grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1()); 

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
    // $ANTLR end "rule__Constant_definition_part__Group_1__1__Impl"


    // $ANTLR start "rule__Constant_definition__Group__0"
    // InternalPascal.g:4838:1: rule__Constant_definition__Group__0 : rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1 ;
    public final void rule__Constant_definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4842:1: ( rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1 )
            // InternalPascal.g:4843:2: rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Constant_definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant_definition__Group__1();

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
    // $ANTLR end "rule__Constant_definition__Group__0"


    // $ANTLR start "rule__Constant_definition__Group__0__Impl"
    // InternalPascal.g:4850:1: rule__Constant_definition__Group__0__Impl : ( ( rule__Constant_definition__NameAssignment_0 ) ) ;
    public final void rule__Constant_definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4854:1: ( ( ( rule__Constant_definition__NameAssignment_0 ) ) )
            // InternalPascal.g:4855:1: ( ( rule__Constant_definition__NameAssignment_0 ) )
            {
            // InternalPascal.g:4855:1: ( ( rule__Constant_definition__NameAssignment_0 ) )
            // InternalPascal.g:4856:2: ( rule__Constant_definition__NameAssignment_0 )
            {
             before(grammarAccess.getConstant_definitionAccess().getNameAssignment_0()); 
            // InternalPascal.g:4857:2: ( rule__Constant_definition__NameAssignment_0 )
            // InternalPascal.g:4857:3: rule__Constant_definition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstant_definitionAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Constant_definition__Group__0__Impl"


    // $ANTLR start "rule__Constant_definition__Group__1"
    // InternalPascal.g:4865:1: rule__Constant_definition__Group__1 : rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2 ;
    public final void rule__Constant_definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4869:1: ( rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2 )
            // InternalPascal.g:4870:2: rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Constant_definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant_definition__Group__2();

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
    // $ANTLR end "rule__Constant_definition__Group__1"


    // $ANTLR start "rule__Constant_definition__Group__1__Impl"
    // InternalPascal.g:4877:1: rule__Constant_definition__Group__1__Impl : ( '=' ) ;
    public final void rule__Constant_definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4881:1: ( ( '=' ) )
            // InternalPascal.g:4882:1: ( '=' )
            {
            // InternalPascal.g:4882:1: ( '=' )
            // InternalPascal.g:4883:2: '='
            {
             before(grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Constant_definition__Group__1__Impl"


    // $ANTLR start "rule__Constant_definition__Group__2"
    // InternalPascal.g:4892:1: rule__Constant_definition__Group__2 : rule__Constant_definition__Group__2__Impl ;
    public final void rule__Constant_definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4896:1: ( rule__Constant_definition__Group__2__Impl )
            // InternalPascal.g:4897:2: rule__Constant_definition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition__Group__2__Impl();

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
    // $ANTLR end "rule__Constant_definition__Group__2"


    // $ANTLR start "rule__Constant_definition__Group__2__Impl"
    // InternalPascal.g:4903:1: rule__Constant_definition__Group__2__Impl : ( ( rule__Constant_definition__ConstAssignment_2 ) ) ;
    public final void rule__Constant_definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4907:1: ( ( ( rule__Constant_definition__ConstAssignment_2 ) ) )
            // InternalPascal.g:4908:1: ( ( rule__Constant_definition__ConstAssignment_2 ) )
            {
            // InternalPascal.g:4908:1: ( ( rule__Constant_definition__ConstAssignment_2 ) )
            // InternalPascal.g:4909:2: ( rule__Constant_definition__ConstAssignment_2 )
            {
             before(grammarAccess.getConstant_definitionAccess().getConstAssignment_2()); 
            // InternalPascal.g:4910:2: ( rule__Constant_definition__ConstAssignment_2 )
            // InternalPascal.g:4910:3: rule__Constant_definition__ConstAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition__ConstAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstant_definitionAccess().getConstAssignment_2()); 

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
    // $ANTLR end "rule__Constant_definition__Group__2__Impl"


    // $ANTLR start "rule__Type_definition_part__Group__0"
    // InternalPascal.g:4919:1: rule__Type_definition_part__Group__0 : rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1 ;
    public final void rule__Type_definition_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4923:1: ( rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1 )
            // InternalPascal.g:4924:2: rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Type_definition_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_definition_part__Group__1();

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
    // $ANTLR end "rule__Type_definition_part__Group__0"


    // $ANTLR start "rule__Type_definition_part__Group__0__Impl"
    // InternalPascal.g:4931:1: rule__Type_definition_part__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type_definition_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4935:1: ( ( 'type' ) )
            // InternalPascal.g:4936:1: ( 'type' )
            {
            // InternalPascal.g:4936:1: ( 'type' )
            // InternalPascal.g:4937:2: 'type'
            {
             before(grammarAccess.getType_definition_partAccess().getTypeKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getType_definition_partAccess().getTypeKeyword_0()); 

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
    // $ANTLR end "rule__Type_definition_part__Group__0__Impl"


    // $ANTLR start "rule__Type_definition_part__Group__1"
    // InternalPascal.g:4946:1: rule__Type_definition_part__Group__1 : rule__Type_definition_part__Group__1__Impl ;
    public final void rule__Type_definition_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4950:1: ( rule__Type_definition_part__Group__1__Impl )
            // InternalPascal.g:4951:2: rule__Type_definition_part__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition_part__Group__1__Impl();

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
    // $ANTLR end "rule__Type_definition_part__Group__1"


    // $ANTLR start "rule__Type_definition_part__Group__1__Impl"
    // InternalPascal.g:4957:1: rule__Type_definition_part__Group__1__Impl : ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) ) ;
    public final void rule__Type_definition_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4961:1: ( ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) ) )
            // InternalPascal.g:4962:1: ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) )
            {
            // InternalPascal.g:4962:1: ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) )
            // InternalPascal.g:4963:2: ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* )
            {
            // InternalPascal.g:4963:2: ( ( rule__Type_definition_part__Group_1__0 ) )
            // InternalPascal.g:4964:3: ( rule__Type_definition_part__Group_1__0 )
            {
             before(grammarAccess.getType_definition_partAccess().getGroup_1()); 
            // InternalPascal.g:4965:3: ( rule__Type_definition_part__Group_1__0 )
            // InternalPascal.g:4965:4: rule__Type_definition_part__Group_1__0
            {
            pushFollow(FOLLOW_33);
            rule__Type_definition_part__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getType_definition_partAccess().getGroup_1()); 

            }

            // InternalPascal.g:4968:2: ( ( rule__Type_definition_part__Group_1__0 )* )
            // InternalPascal.g:4969:3: ( rule__Type_definition_part__Group_1__0 )*
            {
             before(grammarAccess.getType_definition_partAccess().getGroup_1()); 
            // InternalPascal.g:4970:3: ( rule__Type_definition_part__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalPascal.g:4970:4: rule__Type_definition_part__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Type_definition_part__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getType_definition_partAccess().getGroup_1()); 

            }


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
    // $ANTLR end "rule__Type_definition_part__Group__1__Impl"


    // $ANTLR start "rule__Type_definition_part__Group_1__0"
    // InternalPascal.g:4980:1: rule__Type_definition_part__Group_1__0 : rule__Type_definition_part__Group_1__0__Impl rule__Type_definition_part__Group_1__1 ;
    public final void rule__Type_definition_part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4984:1: ( rule__Type_definition_part__Group_1__0__Impl rule__Type_definition_part__Group_1__1 )
            // InternalPascal.g:4985:2: rule__Type_definition_part__Group_1__0__Impl rule__Type_definition_part__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Type_definition_part__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_definition_part__Group_1__1();

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
    // $ANTLR end "rule__Type_definition_part__Group_1__0"


    // $ANTLR start "rule__Type_definition_part__Group_1__0__Impl"
    // InternalPascal.g:4992:1: rule__Type_definition_part__Group_1__0__Impl : ( ( rule__Type_definition_part__TypesAssignment_1_0 ) ) ;
    public final void rule__Type_definition_part__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4996:1: ( ( ( rule__Type_definition_part__TypesAssignment_1_0 ) ) )
            // InternalPascal.g:4997:1: ( ( rule__Type_definition_part__TypesAssignment_1_0 ) )
            {
            // InternalPascal.g:4997:1: ( ( rule__Type_definition_part__TypesAssignment_1_0 ) )
            // InternalPascal.g:4998:2: ( rule__Type_definition_part__TypesAssignment_1_0 )
            {
             before(grammarAccess.getType_definition_partAccess().getTypesAssignment_1_0()); 
            // InternalPascal.g:4999:2: ( rule__Type_definition_part__TypesAssignment_1_0 )
            // InternalPascal.g:4999:3: rule__Type_definition_part__TypesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition_part__TypesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getType_definition_partAccess().getTypesAssignment_1_0()); 

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
    // $ANTLR end "rule__Type_definition_part__Group_1__0__Impl"


    // $ANTLR start "rule__Type_definition_part__Group_1__1"
    // InternalPascal.g:5007:1: rule__Type_definition_part__Group_1__1 : rule__Type_definition_part__Group_1__1__Impl ;
    public final void rule__Type_definition_part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5011:1: ( rule__Type_definition_part__Group_1__1__Impl )
            // InternalPascal.g:5012:2: rule__Type_definition_part__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition_part__Group_1__1__Impl();

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
    // $ANTLR end "rule__Type_definition_part__Group_1__1"


    // $ANTLR start "rule__Type_definition_part__Group_1__1__Impl"
    // InternalPascal.g:5018:1: rule__Type_definition_part__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Type_definition_part__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5022:1: ( ( ';' ) )
            // InternalPascal.g:5023:1: ( ';' )
            {
            // InternalPascal.g:5023:1: ( ';' )
            // InternalPascal.g:5024:2: ';'
            {
             before(grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1()); 

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
    // $ANTLR end "rule__Type_definition_part__Group_1__1__Impl"


    // $ANTLR start "rule__Type_definition__Group__0"
    // InternalPascal.g:5034:1: rule__Type_definition__Group__0 : rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1 ;
    public final void rule__Type_definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5038:1: ( rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1 )
            // InternalPascal.g:5039:2: rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Type_definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_definition__Group__1();

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
    // $ANTLR end "rule__Type_definition__Group__0"


    // $ANTLR start "rule__Type_definition__Group__0__Impl"
    // InternalPascal.g:5046:1: rule__Type_definition__Group__0__Impl : ( ( rule__Type_definition__NameAssignment_0 ) ) ;
    public final void rule__Type_definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5050:1: ( ( ( rule__Type_definition__NameAssignment_0 ) ) )
            // InternalPascal.g:5051:1: ( ( rule__Type_definition__NameAssignment_0 ) )
            {
            // InternalPascal.g:5051:1: ( ( rule__Type_definition__NameAssignment_0 ) )
            // InternalPascal.g:5052:2: ( rule__Type_definition__NameAssignment_0 )
            {
             before(grammarAccess.getType_definitionAccess().getNameAssignment_0()); 
            // InternalPascal.g:5053:2: ( rule__Type_definition__NameAssignment_0 )
            // InternalPascal.g:5053:3: rule__Type_definition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getType_definitionAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Type_definition__Group__0__Impl"


    // $ANTLR start "rule__Type_definition__Group__1"
    // InternalPascal.g:5061:1: rule__Type_definition__Group__1 : rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2 ;
    public final void rule__Type_definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5065:1: ( rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2 )
            // InternalPascal.g:5066:2: rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Type_definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_definition__Group__2();

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
    // $ANTLR end "rule__Type_definition__Group__1"


    // $ANTLR start "rule__Type_definition__Group__1__Impl"
    // InternalPascal.g:5073:1: rule__Type_definition__Group__1__Impl : ( '=' ) ;
    public final void rule__Type_definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5077:1: ( ( '=' ) )
            // InternalPascal.g:5078:1: ( '=' )
            {
            // InternalPascal.g:5078:1: ( '=' )
            // InternalPascal.g:5079:2: '='
            {
             before(grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Type_definition__Group__1__Impl"


    // $ANTLR start "rule__Type_definition__Group__2"
    // InternalPascal.g:5088:1: rule__Type_definition__Group__2 : rule__Type_definition__Group__2__Impl ;
    public final void rule__Type_definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5092:1: ( rule__Type_definition__Group__2__Impl )
            // InternalPascal.g:5093:2: rule__Type_definition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition__Group__2__Impl();

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
    // $ANTLR end "rule__Type_definition__Group__2"


    // $ANTLR start "rule__Type_definition__Group__2__Impl"
    // InternalPascal.g:5099:1: rule__Type_definition__Group__2__Impl : ( ( rule__Type_definition__TypeAssignment_2 ) ) ;
    public final void rule__Type_definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5103:1: ( ( ( rule__Type_definition__TypeAssignment_2 ) ) )
            // InternalPascal.g:5104:1: ( ( rule__Type_definition__TypeAssignment_2 ) )
            {
            // InternalPascal.g:5104:1: ( ( rule__Type_definition__TypeAssignment_2 ) )
            // InternalPascal.g:5105:2: ( rule__Type_definition__TypeAssignment_2 )
            {
             before(grammarAccess.getType_definitionAccess().getTypeAssignment_2()); 
            // InternalPascal.g:5106:2: ( rule__Type_definition__TypeAssignment_2 )
            // InternalPascal.g:5106:3: rule__Type_definition__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getType_definitionAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Type_definition__Group__2__Impl"


    // $ANTLR start "rule__Subrange_type__Group_0__0"
    // InternalPascal.g:5115:1: rule__Subrange_type__Group_0__0 : rule__Subrange_type__Group_0__0__Impl rule__Subrange_type__Group_0__1 ;
    public final void rule__Subrange_type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5119:1: ( rule__Subrange_type__Group_0__0__Impl rule__Subrange_type__Group_0__1 )
            // InternalPascal.g:5120:2: rule__Subrange_type__Group_0__0__Impl rule__Subrange_type__Group_0__1
            {
            pushFollow(FOLLOW_37);
            rule__Subrange_type__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subrange_type__Group_0__1();

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
    // $ANTLR end "rule__Subrange_type__Group_0__0"


    // $ANTLR start "rule__Subrange_type__Group_0__0__Impl"
    // InternalPascal.g:5127:1: rule__Subrange_type__Group_0__0__Impl : ( ( rule__Subrange_type__InitialConstAssignment_0_0 ) ) ;
    public final void rule__Subrange_type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5131:1: ( ( ( rule__Subrange_type__InitialConstAssignment_0_0 ) ) )
            // InternalPascal.g:5132:1: ( ( rule__Subrange_type__InitialConstAssignment_0_0 ) )
            {
            // InternalPascal.g:5132:1: ( ( rule__Subrange_type__InitialConstAssignment_0_0 ) )
            // InternalPascal.g:5133:2: ( rule__Subrange_type__InitialConstAssignment_0_0 )
            {
             before(grammarAccess.getSubrange_typeAccess().getInitialConstAssignment_0_0()); 
            // InternalPascal.g:5134:2: ( rule__Subrange_type__InitialConstAssignment_0_0 )
            // InternalPascal.g:5134:3: rule__Subrange_type__InitialConstAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__InitialConstAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSubrange_typeAccess().getInitialConstAssignment_0_0()); 

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
    // $ANTLR end "rule__Subrange_type__Group_0__0__Impl"


    // $ANTLR start "rule__Subrange_type__Group_0__1"
    // InternalPascal.g:5142:1: rule__Subrange_type__Group_0__1 : rule__Subrange_type__Group_0__1__Impl rule__Subrange_type__Group_0__2 ;
    public final void rule__Subrange_type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5146:1: ( rule__Subrange_type__Group_0__1__Impl rule__Subrange_type__Group_0__2 )
            // InternalPascal.g:5147:2: rule__Subrange_type__Group_0__1__Impl rule__Subrange_type__Group_0__2
            {
            pushFollow(FOLLOW_35);
            rule__Subrange_type__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subrange_type__Group_0__2();

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
    // $ANTLR end "rule__Subrange_type__Group_0__1"


    // $ANTLR start "rule__Subrange_type__Group_0__1__Impl"
    // InternalPascal.g:5154:1: rule__Subrange_type__Group_0__1__Impl : ( '..' ) ;
    public final void rule__Subrange_type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5158:1: ( ( '..' ) )
            // InternalPascal.g:5159:1: ( '..' )
            {
            // InternalPascal.g:5159:1: ( '..' )
            // InternalPascal.g:5160:2: '..'
            {
             before(grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_0_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_0_1()); 

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
    // $ANTLR end "rule__Subrange_type__Group_0__1__Impl"


    // $ANTLR start "rule__Subrange_type__Group_0__2"
    // InternalPascal.g:5169:1: rule__Subrange_type__Group_0__2 : rule__Subrange_type__Group_0__2__Impl ;
    public final void rule__Subrange_type__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5173:1: ( rule__Subrange_type__Group_0__2__Impl )
            // InternalPascal.g:5174:2: rule__Subrange_type__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__Group_0__2__Impl();

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
    // $ANTLR end "rule__Subrange_type__Group_0__2"


    // $ANTLR start "rule__Subrange_type__Group_0__2__Impl"
    // InternalPascal.g:5180:1: rule__Subrange_type__Group_0__2__Impl : ( ( rule__Subrange_type__FinalConstAssignment_0_2 ) ) ;
    public final void rule__Subrange_type__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5184:1: ( ( ( rule__Subrange_type__FinalConstAssignment_0_2 ) ) )
            // InternalPascal.g:5185:1: ( ( rule__Subrange_type__FinalConstAssignment_0_2 ) )
            {
            // InternalPascal.g:5185:1: ( ( rule__Subrange_type__FinalConstAssignment_0_2 ) )
            // InternalPascal.g:5186:2: ( rule__Subrange_type__FinalConstAssignment_0_2 )
            {
             before(grammarAccess.getSubrange_typeAccess().getFinalConstAssignment_0_2()); 
            // InternalPascal.g:5187:2: ( rule__Subrange_type__FinalConstAssignment_0_2 )
            // InternalPascal.g:5187:3: rule__Subrange_type__FinalConstAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__FinalConstAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSubrange_typeAccess().getFinalConstAssignment_0_2()); 

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
    // $ANTLR end "rule__Subrange_type__Group_0__2__Impl"


    // $ANTLR start "rule__Subrange_type__Group_1__0"
    // InternalPascal.g:5196:1: rule__Subrange_type__Group_1__0 : rule__Subrange_type__Group_1__0__Impl rule__Subrange_type__Group_1__1 ;
    public final void rule__Subrange_type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5200:1: ( rule__Subrange_type__Group_1__0__Impl rule__Subrange_type__Group_1__1 )
            // InternalPascal.g:5201:2: rule__Subrange_type__Group_1__0__Impl rule__Subrange_type__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__Subrange_type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subrange_type__Group_1__1();

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
    // $ANTLR end "rule__Subrange_type__Group_1__0"


    // $ANTLR start "rule__Subrange_type__Group_1__0__Impl"
    // InternalPascal.g:5208:1: rule__Subrange_type__Group_1__0__Impl : ( ( rule__Subrange_type__SubrangeAssignment_1_0 ) ) ;
    public final void rule__Subrange_type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5212:1: ( ( ( rule__Subrange_type__SubrangeAssignment_1_0 ) ) )
            // InternalPascal.g:5213:1: ( ( rule__Subrange_type__SubrangeAssignment_1_0 ) )
            {
            // InternalPascal.g:5213:1: ( ( rule__Subrange_type__SubrangeAssignment_1_0 ) )
            // InternalPascal.g:5214:2: ( rule__Subrange_type__SubrangeAssignment_1_0 )
            {
             before(grammarAccess.getSubrange_typeAccess().getSubrangeAssignment_1_0()); 
            // InternalPascal.g:5215:2: ( rule__Subrange_type__SubrangeAssignment_1_0 )
            // InternalPascal.g:5215:3: rule__Subrange_type__SubrangeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__SubrangeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSubrange_typeAccess().getSubrangeAssignment_1_0()); 

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
    // $ANTLR end "rule__Subrange_type__Group_1__0__Impl"


    // $ANTLR start "rule__Subrange_type__Group_1__1"
    // InternalPascal.g:5223:1: rule__Subrange_type__Group_1__1 : rule__Subrange_type__Group_1__1__Impl ;
    public final void rule__Subrange_type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5227:1: ( rule__Subrange_type__Group_1__1__Impl )
            // InternalPascal.g:5228:2: rule__Subrange_type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__Group_1__1__Impl();

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
    // $ANTLR end "rule__Subrange_type__Group_1__1"


    // $ANTLR start "rule__Subrange_type__Group_1__1__Impl"
    // InternalPascal.g:5234:1: rule__Subrange_type__Group_1__1__Impl : ( ( rule__Subrange_type__ConstAssignment_1_1 ) ) ;
    public final void rule__Subrange_type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5238:1: ( ( ( rule__Subrange_type__ConstAssignment_1_1 ) ) )
            // InternalPascal.g:5239:1: ( ( rule__Subrange_type__ConstAssignment_1_1 ) )
            {
            // InternalPascal.g:5239:1: ( ( rule__Subrange_type__ConstAssignment_1_1 ) )
            // InternalPascal.g:5240:2: ( rule__Subrange_type__ConstAssignment_1_1 )
            {
             before(grammarAccess.getSubrange_typeAccess().getConstAssignment_1_1()); 
            // InternalPascal.g:5241:2: ( rule__Subrange_type__ConstAssignment_1_1 )
            // InternalPascal.g:5241:3: rule__Subrange_type__ConstAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__ConstAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSubrange_typeAccess().getConstAssignment_1_1()); 

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
    // $ANTLR end "rule__Subrange_type__Group_1__1__Impl"


    // $ANTLR start "rule__Enumerated_type__Group__0"
    // InternalPascal.g:5250:1: rule__Enumerated_type__Group__0 : rule__Enumerated_type__Group__0__Impl rule__Enumerated_type__Group__1 ;
    public final void rule__Enumerated_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5254:1: ( rule__Enumerated_type__Group__0__Impl rule__Enumerated_type__Group__1 )
            // InternalPascal.g:5255:2: rule__Enumerated_type__Group__0__Impl rule__Enumerated_type__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Enumerated_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumerated_type__Group__1();

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
    // $ANTLR end "rule__Enumerated_type__Group__0"


    // $ANTLR start "rule__Enumerated_type__Group__0__Impl"
    // InternalPascal.g:5262:1: rule__Enumerated_type__Group__0__Impl : ( '(' ) ;
    public final void rule__Enumerated_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5266:1: ( ( '(' ) )
            // InternalPascal.g:5267:1: ( '(' )
            {
            // InternalPascal.g:5267:1: ( '(' )
            // InternalPascal.g:5268:2: '('
            {
             before(grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Enumerated_type__Group__0__Impl"


    // $ANTLR start "rule__Enumerated_type__Group__1"
    // InternalPascal.g:5277:1: rule__Enumerated_type__Group__1 : rule__Enumerated_type__Group__1__Impl rule__Enumerated_type__Group__2 ;
    public final void rule__Enumerated_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5281:1: ( rule__Enumerated_type__Group__1__Impl rule__Enumerated_type__Group__2 )
            // InternalPascal.g:5282:2: rule__Enumerated_type__Group__1__Impl rule__Enumerated_type__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Enumerated_type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumerated_type__Group__2();

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
    // $ANTLR end "rule__Enumerated_type__Group__1"


    // $ANTLR start "rule__Enumerated_type__Group__1__Impl"
    // InternalPascal.g:5289:1: rule__Enumerated_type__Group__1__Impl : ( ( rule__Enumerated_type__IdentifiersAssignment_1 ) ) ;
    public final void rule__Enumerated_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5293:1: ( ( ( rule__Enumerated_type__IdentifiersAssignment_1 ) ) )
            // InternalPascal.g:5294:1: ( ( rule__Enumerated_type__IdentifiersAssignment_1 ) )
            {
            // InternalPascal.g:5294:1: ( ( rule__Enumerated_type__IdentifiersAssignment_1 ) )
            // InternalPascal.g:5295:2: ( rule__Enumerated_type__IdentifiersAssignment_1 )
            {
             before(grammarAccess.getEnumerated_typeAccess().getIdentifiersAssignment_1()); 
            // InternalPascal.g:5296:2: ( rule__Enumerated_type__IdentifiersAssignment_1 )
            // InternalPascal.g:5296:3: rule__Enumerated_type__IdentifiersAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumerated_type__IdentifiersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerated_typeAccess().getIdentifiersAssignment_1()); 

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
    // $ANTLR end "rule__Enumerated_type__Group__1__Impl"


    // $ANTLR start "rule__Enumerated_type__Group__2"
    // InternalPascal.g:5304:1: rule__Enumerated_type__Group__2 : rule__Enumerated_type__Group__2__Impl ;
    public final void rule__Enumerated_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5308:1: ( rule__Enumerated_type__Group__2__Impl )
            // InternalPascal.g:5309:2: rule__Enumerated_type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumerated_type__Group__2__Impl();

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
    // $ANTLR end "rule__Enumerated_type__Group__2"


    // $ANTLR start "rule__Enumerated_type__Group__2__Impl"
    // InternalPascal.g:5315:1: rule__Enumerated_type__Group__2__Impl : ( ')' ) ;
    public final void rule__Enumerated_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5319:1: ( ( ')' ) )
            // InternalPascal.g:5320:1: ( ')' )
            {
            // InternalPascal.g:5320:1: ( ')' )
            // InternalPascal.g:5321:2: ')'
            {
             before(grammarAccess.getEnumerated_typeAccess().getRightParenthesisKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEnumerated_typeAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Enumerated_type__Group__2__Impl"


    // $ANTLR start "rule__Strutured_type__Group__0"
    // InternalPascal.g:5331:1: rule__Strutured_type__Group__0 : rule__Strutured_type__Group__0__Impl rule__Strutured_type__Group__1 ;
    public final void rule__Strutured_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5335:1: ( rule__Strutured_type__Group__0__Impl rule__Strutured_type__Group__1 )
            // InternalPascal.g:5336:2: rule__Strutured_type__Group__0__Impl rule__Strutured_type__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Strutured_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Strutured_type__Group__1();

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
    // $ANTLR end "rule__Strutured_type__Group__0"


    // $ANTLR start "rule__Strutured_type__Group__0__Impl"
    // InternalPascal.g:5343:1: rule__Strutured_type__Group__0__Impl : ( ( rule__Strutured_type__PackedAssignment_0 )? ) ;
    public final void rule__Strutured_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5347:1: ( ( ( rule__Strutured_type__PackedAssignment_0 )? ) )
            // InternalPascal.g:5348:1: ( ( rule__Strutured_type__PackedAssignment_0 )? )
            {
            // InternalPascal.g:5348:1: ( ( rule__Strutured_type__PackedAssignment_0 )? )
            // InternalPascal.g:5349:2: ( rule__Strutured_type__PackedAssignment_0 )?
            {
             before(grammarAccess.getStrutured_typeAccess().getPackedAssignment_0()); 
            // InternalPascal.g:5350:2: ( rule__Strutured_type__PackedAssignment_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==54) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalPascal.g:5350:3: rule__Strutured_type__PackedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Strutured_type__PackedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStrutured_typeAccess().getPackedAssignment_0()); 

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
    // $ANTLR end "rule__Strutured_type__Group__0__Impl"


    // $ANTLR start "rule__Strutured_type__Group__1"
    // InternalPascal.g:5358:1: rule__Strutured_type__Group__1 : rule__Strutured_type__Group__1__Impl ;
    public final void rule__Strutured_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5362:1: ( rule__Strutured_type__Group__1__Impl )
            // InternalPascal.g:5363:2: rule__Strutured_type__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Strutured_type__Group__1__Impl();

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
    // $ANTLR end "rule__Strutured_type__Group__1"


    // $ANTLR start "rule__Strutured_type__Group__1__Impl"
    // InternalPascal.g:5369:1: rule__Strutured_type__Group__1__Impl : ( ( rule__Strutured_type__TypeAssignment_1 ) ) ;
    public final void rule__Strutured_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5373:1: ( ( ( rule__Strutured_type__TypeAssignment_1 ) ) )
            // InternalPascal.g:5374:1: ( ( rule__Strutured_type__TypeAssignment_1 ) )
            {
            // InternalPascal.g:5374:1: ( ( rule__Strutured_type__TypeAssignment_1 ) )
            // InternalPascal.g:5375:2: ( rule__Strutured_type__TypeAssignment_1 )
            {
             before(grammarAccess.getStrutured_typeAccess().getTypeAssignment_1()); 
            // InternalPascal.g:5376:2: ( rule__Strutured_type__TypeAssignment_1 )
            // InternalPascal.g:5376:3: rule__Strutured_type__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Strutured_type__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStrutured_typeAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Strutured_type__Group__1__Impl"


    // $ANTLR start "rule__Set_type__Group__0"
    // InternalPascal.g:5385:1: rule__Set_type__Group__0 : rule__Set_type__Group__0__Impl rule__Set_type__Group__1 ;
    public final void rule__Set_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5389:1: ( rule__Set_type__Group__0__Impl rule__Set_type__Group__1 )
            // InternalPascal.g:5390:2: rule__Set_type__Group__0__Impl rule__Set_type__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Set_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set_type__Group__1();

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
    // $ANTLR end "rule__Set_type__Group__0"


    // $ANTLR start "rule__Set_type__Group__0__Impl"
    // InternalPascal.g:5397:1: rule__Set_type__Group__0__Impl : ( 'set' ) ;
    public final void rule__Set_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5401:1: ( ( 'set' ) )
            // InternalPascal.g:5402:1: ( 'set' )
            {
            // InternalPascal.g:5402:1: ( 'set' )
            // InternalPascal.g:5403:2: 'set'
            {
             before(grammarAccess.getSet_typeAccess().getSetKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSet_typeAccess().getSetKeyword_0()); 

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
    // $ANTLR end "rule__Set_type__Group__0__Impl"


    // $ANTLR start "rule__Set_type__Group__1"
    // InternalPascal.g:5412:1: rule__Set_type__Group__1 : rule__Set_type__Group__1__Impl rule__Set_type__Group__2 ;
    public final void rule__Set_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5416:1: ( rule__Set_type__Group__1__Impl rule__Set_type__Group__2 )
            // InternalPascal.g:5417:2: rule__Set_type__Group__1__Impl rule__Set_type__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Set_type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set_type__Group__2();

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
    // $ANTLR end "rule__Set_type__Group__1"


    // $ANTLR start "rule__Set_type__Group__1__Impl"
    // InternalPascal.g:5424:1: rule__Set_type__Group__1__Impl : ( 'of' ) ;
    public final void rule__Set_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5428:1: ( ( 'of' ) )
            // InternalPascal.g:5429:1: ( 'of' )
            {
            // InternalPascal.g:5429:1: ( 'of' )
            // InternalPascal.g:5430:2: 'of'
            {
             before(grammarAccess.getSet_typeAccess().getOfKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSet_typeAccess().getOfKeyword_1()); 

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
    // $ANTLR end "rule__Set_type__Group__1__Impl"


    // $ANTLR start "rule__Set_type__Group__2"
    // InternalPascal.g:5439:1: rule__Set_type__Group__2 : rule__Set_type__Group__2__Impl ;
    public final void rule__Set_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5443:1: ( rule__Set_type__Group__2__Impl )
            // InternalPascal.g:5444:2: rule__Set_type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Set_type__Group__2__Impl();

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
    // $ANTLR end "rule__Set_type__Group__2"


    // $ANTLR start "rule__Set_type__Group__2__Impl"
    // InternalPascal.g:5450:1: rule__Set_type__Group__2__Impl : ( ( rule__Set_type__TypeAssignment_2 ) ) ;
    public final void rule__Set_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5454:1: ( ( ( rule__Set_type__TypeAssignment_2 ) ) )
            // InternalPascal.g:5455:1: ( ( rule__Set_type__TypeAssignment_2 ) )
            {
            // InternalPascal.g:5455:1: ( ( rule__Set_type__TypeAssignment_2 ) )
            // InternalPascal.g:5456:2: ( rule__Set_type__TypeAssignment_2 )
            {
             before(grammarAccess.getSet_typeAccess().getTypeAssignment_2()); 
            // InternalPascal.g:5457:2: ( rule__Set_type__TypeAssignment_2 )
            // InternalPascal.g:5457:3: rule__Set_type__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Set_type__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSet_typeAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Set_type__Group__2__Impl"


    // $ANTLR start "rule__Pointer_type__Group__0"
    // InternalPascal.g:5466:1: rule__Pointer_type__Group__0 : rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1 ;
    public final void rule__Pointer_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5470:1: ( rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1 )
            // InternalPascal.g:5471:2: rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Pointer_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pointer_type__Group__1();

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
    // $ANTLR end "rule__Pointer_type__Group__0"


    // $ANTLR start "rule__Pointer_type__Group__0__Impl"
    // InternalPascal.g:5478:1: rule__Pointer_type__Group__0__Impl : ( '^' ) ;
    public final void rule__Pointer_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5482:1: ( ( '^' ) )
            // InternalPascal.g:5483:1: ( '^' )
            {
            // InternalPascal.g:5483:1: ( '^' )
            // InternalPascal.g:5484:2: '^'
            {
             before(grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0()); 

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
    // $ANTLR end "rule__Pointer_type__Group__0__Impl"


    // $ANTLR start "rule__Pointer_type__Group__1"
    // InternalPascal.g:5493:1: rule__Pointer_type__Group__1 : rule__Pointer_type__Group__1__Impl ;
    public final void rule__Pointer_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5497:1: ( rule__Pointer_type__Group__1__Impl )
            // InternalPascal.g:5498:2: rule__Pointer_type__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pointer_type__Group__1__Impl();

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
    // $ANTLR end "rule__Pointer_type__Group__1"


    // $ANTLR start "rule__Pointer_type__Group__1__Impl"
    // InternalPascal.g:5504:1: rule__Pointer_type__Group__1__Impl : ( ( rule__Pointer_type__TypeAssignment_1 ) ) ;
    public final void rule__Pointer_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5508:1: ( ( ( rule__Pointer_type__TypeAssignment_1 ) ) )
            // InternalPascal.g:5509:1: ( ( rule__Pointer_type__TypeAssignment_1 ) )
            {
            // InternalPascal.g:5509:1: ( ( rule__Pointer_type__TypeAssignment_1 ) )
            // InternalPascal.g:5510:2: ( rule__Pointer_type__TypeAssignment_1 )
            {
             before(grammarAccess.getPointer_typeAccess().getTypeAssignment_1()); 
            // InternalPascal.g:5511:2: ( rule__Pointer_type__TypeAssignment_1 )
            // InternalPascal.g:5511:3: rule__Pointer_type__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Pointer_type__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPointer_typeAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Pointer_type__Group__1__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group__0"
    // InternalPascal.g:5520:1: rule__Variable_declaration_part__Group__0 : rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1 ;
    public final void rule__Variable_declaration_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5524:1: ( rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1 )
            // InternalPascal.g:5525:2: rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Variable_declaration_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group__1();

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
    // $ANTLR end "rule__Variable_declaration_part__Group__0"


    // $ANTLR start "rule__Variable_declaration_part__Group__0__Impl"
    // InternalPascal.g:5532:1: rule__Variable_declaration_part__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable_declaration_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5536:1: ( ( 'var' ) )
            // InternalPascal.g:5537:1: ( 'var' )
            {
            // InternalPascal.g:5537:1: ( 'var' )
            // InternalPascal.g:5538:2: 'var'
            {
             before(grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0()); 

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
    // $ANTLR end "rule__Variable_declaration_part__Group__0__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group__1"
    // InternalPascal.g:5547:1: rule__Variable_declaration_part__Group__1 : rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2 ;
    public final void rule__Variable_declaration_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5551:1: ( rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2 )
            // InternalPascal.g:5552:2: rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Variable_declaration_part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group__2();

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
    // $ANTLR end "rule__Variable_declaration_part__Group__1"


    // $ANTLR start "rule__Variable_declaration_part__Group__1__Impl"
    // InternalPascal.g:5559:1: rule__Variable_declaration_part__Group__1__Impl : ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) ) ;
    public final void rule__Variable_declaration_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5563:1: ( ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) ) )
            // InternalPascal.g:5564:1: ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) )
            {
            // InternalPascal.g:5564:1: ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) )
            // InternalPascal.g:5565:2: ( rule__Variable_declaration_part__SectionsAssignment_1 )
            {
             before(grammarAccess.getVariable_declaration_partAccess().getSectionsAssignment_1()); 
            // InternalPascal.g:5566:2: ( rule__Variable_declaration_part__SectionsAssignment_1 )
            // InternalPascal.g:5566:3: rule__Variable_declaration_part__SectionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__SectionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariable_declaration_partAccess().getSectionsAssignment_1()); 

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
    // $ANTLR end "rule__Variable_declaration_part__Group__1__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group__2"
    // InternalPascal.g:5574:1: rule__Variable_declaration_part__Group__2 : rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3 ;
    public final void rule__Variable_declaration_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5578:1: ( rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3 )
            // InternalPascal.g:5579:2: rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Variable_declaration_part__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group__3();

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
    // $ANTLR end "rule__Variable_declaration_part__Group__2"


    // $ANTLR start "rule__Variable_declaration_part__Group__2__Impl"
    // InternalPascal.g:5586:1: rule__Variable_declaration_part__Group__2__Impl : ( ';' ) ;
    public final void rule__Variable_declaration_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5590:1: ( ( ';' ) )
            // InternalPascal.g:5591:1: ( ';' )
            {
            // InternalPascal.g:5591:1: ( ';' )
            // InternalPascal.g:5592:2: ';'
            {
             before(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Variable_declaration_part__Group__2__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group__3"
    // InternalPascal.g:5601:1: rule__Variable_declaration_part__Group__3 : rule__Variable_declaration_part__Group__3__Impl ;
    public final void rule__Variable_declaration_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5605:1: ( rule__Variable_declaration_part__Group__3__Impl )
            // InternalPascal.g:5606:2: rule__Variable_declaration_part__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group__3__Impl();

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
    // $ANTLR end "rule__Variable_declaration_part__Group__3"


    // $ANTLR start "rule__Variable_declaration_part__Group__3__Impl"
    // InternalPascal.g:5612:1: rule__Variable_declaration_part__Group__3__Impl : ( ( rule__Variable_declaration_part__Group_3__0 )* ) ;
    public final void rule__Variable_declaration_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5616:1: ( ( ( rule__Variable_declaration_part__Group_3__0 )* ) )
            // InternalPascal.g:5617:1: ( ( rule__Variable_declaration_part__Group_3__0 )* )
            {
            // InternalPascal.g:5617:1: ( ( rule__Variable_declaration_part__Group_3__0 )* )
            // InternalPascal.g:5618:2: ( rule__Variable_declaration_part__Group_3__0 )*
            {
             before(grammarAccess.getVariable_declaration_partAccess().getGroup_3()); 
            // InternalPascal.g:5619:2: ( rule__Variable_declaration_part__Group_3__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalPascal.g:5619:3: rule__Variable_declaration_part__Group_3__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Variable_declaration_part__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getVariable_declaration_partAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Variable_declaration_part__Group__3__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group_3__0"
    // InternalPascal.g:5628:1: rule__Variable_declaration_part__Group_3__0 : rule__Variable_declaration_part__Group_3__0__Impl rule__Variable_declaration_part__Group_3__1 ;
    public final void rule__Variable_declaration_part__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5632:1: ( rule__Variable_declaration_part__Group_3__0__Impl rule__Variable_declaration_part__Group_3__1 )
            // InternalPascal.g:5633:2: rule__Variable_declaration_part__Group_3__0__Impl rule__Variable_declaration_part__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Variable_declaration_part__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group_3__1();

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
    // $ANTLR end "rule__Variable_declaration_part__Group_3__0"


    // $ANTLR start "rule__Variable_declaration_part__Group_3__0__Impl"
    // InternalPascal.g:5640:1: rule__Variable_declaration_part__Group_3__0__Impl : ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) ) ;
    public final void rule__Variable_declaration_part__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5644:1: ( ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) ) )
            // InternalPascal.g:5645:1: ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) )
            {
            // InternalPascal.g:5645:1: ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) )
            // InternalPascal.g:5646:2: ( rule__Variable_declaration_part__SectionsAssignment_3_0 )
            {
             before(grammarAccess.getVariable_declaration_partAccess().getSectionsAssignment_3_0()); 
            // InternalPascal.g:5647:2: ( rule__Variable_declaration_part__SectionsAssignment_3_0 )
            // InternalPascal.g:5647:3: rule__Variable_declaration_part__SectionsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__SectionsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_declaration_partAccess().getSectionsAssignment_3_0()); 

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
    // $ANTLR end "rule__Variable_declaration_part__Group_3__0__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group_3__1"
    // InternalPascal.g:5655:1: rule__Variable_declaration_part__Group_3__1 : rule__Variable_declaration_part__Group_3__1__Impl ;
    public final void rule__Variable_declaration_part__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5659:1: ( rule__Variable_declaration_part__Group_3__1__Impl )
            // InternalPascal.g:5660:2: rule__Variable_declaration_part__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group_3__1__Impl();

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
    // $ANTLR end "rule__Variable_declaration_part__Group_3__1"


    // $ANTLR start "rule__Variable_declaration_part__Group_3__1__Impl"
    // InternalPascal.g:5666:1: rule__Variable_declaration_part__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Variable_declaration_part__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5670:1: ( ( ';' ) )
            // InternalPascal.g:5671:1: ( ';' )
            {
            // InternalPascal.g:5671:1: ( ';' )
            // InternalPascal.g:5672:2: ';'
            {
             before(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1()); 

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
    // $ANTLR end "rule__Variable_declaration_part__Group_3__1__Impl"


    // $ANTLR start "rule__Variable_section__Group__0"
    // InternalPascal.g:5682:1: rule__Variable_section__Group__0 : rule__Variable_section__Group__0__Impl rule__Variable_section__Group__1 ;
    public final void rule__Variable_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5686:1: ( rule__Variable_section__Group__0__Impl rule__Variable_section__Group__1 )
            // InternalPascal.g:5687:2: rule__Variable_section__Group__0__Impl rule__Variable_section__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Variable_section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_section__Group__1();

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
    // $ANTLR end "rule__Variable_section__Group__0"


    // $ANTLR start "rule__Variable_section__Group__0__Impl"
    // InternalPascal.g:5694:1: rule__Variable_section__Group__0__Impl : ( ( rule__Variable_section__IdentifiersAssignment_0 ) ) ;
    public final void rule__Variable_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5698:1: ( ( ( rule__Variable_section__IdentifiersAssignment_0 ) ) )
            // InternalPascal.g:5699:1: ( ( rule__Variable_section__IdentifiersAssignment_0 ) )
            {
            // InternalPascal.g:5699:1: ( ( rule__Variable_section__IdentifiersAssignment_0 ) )
            // InternalPascal.g:5700:2: ( rule__Variable_section__IdentifiersAssignment_0 )
            {
             before(grammarAccess.getVariable_sectionAccess().getIdentifiersAssignment_0()); 
            // InternalPascal.g:5701:2: ( rule__Variable_section__IdentifiersAssignment_0 )
            // InternalPascal.g:5701:3: rule__Variable_section__IdentifiersAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_section__IdentifiersAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_sectionAccess().getIdentifiersAssignment_0()); 

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
    // $ANTLR end "rule__Variable_section__Group__0__Impl"


    // $ANTLR start "rule__Variable_section__Group__1"
    // InternalPascal.g:5709:1: rule__Variable_section__Group__1 : rule__Variable_section__Group__1__Impl rule__Variable_section__Group__2 ;
    public final void rule__Variable_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5713:1: ( rule__Variable_section__Group__1__Impl rule__Variable_section__Group__2 )
            // InternalPascal.g:5714:2: rule__Variable_section__Group__1__Impl rule__Variable_section__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Variable_section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_section__Group__2();

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
    // $ANTLR end "rule__Variable_section__Group__1"


    // $ANTLR start "rule__Variable_section__Group__1__Impl"
    // InternalPascal.g:5721:1: rule__Variable_section__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5725:1: ( ( ':' ) )
            // InternalPascal.g:5726:1: ( ':' )
            {
            // InternalPascal.g:5726:1: ( ':' )
            // InternalPascal.g:5727:2: ':'
            {
             before(grammarAccess.getVariable_sectionAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVariable_sectionAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Variable_section__Group__1__Impl"


    // $ANTLR start "rule__Variable_section__Group__2"
    // InternalPascal.g:5736:1: rule__Variable_section__Group__2 : rule__Variable_section__Group__2__Impl ;
    public final void rule__Variable_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5740:1: ( rule__Variable_section__Group__2__Impl )
            // InternalPascal.g:5741:2: rule__Variable_section__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_section__Group__2__Impl();

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
    // $ANTLR end "rule__Variable_section__Group__2"


    // $ANTLR start "rule__Variable_section__Group__2__Impl"
    // InternalPascal.g:5747:1: rule__Variable_section__Group__2__Impl : ( ( rule__Variable_section__TypeAssignment_2 ) ) ;
    public final void rule__Variable_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5751:1: ( ( ( rule__Variable_section__TypeAssignment_2 ) ) )
            // InternalPascal.g:5752:1: ( ( rule__Variable_section__TypeAssignment_2 ) )
            {
            // InternalPascal.g:5752:1: ( ( rule__Variable_section__TypeAssignment_2 ) )
            // InternalPascal.g:5753:2: ( rule__Variable_section__TypeAssignment_2 )
            {
             before(grammarAccess.getVariable_sectionAccess().getTypeAssignment_2()); 
            // InternalPascal.g:5754:2: ( rule__Variable_section__TypeAssignment_2 )
            // InternalPascal.g:5754:3: rule__Variable_section__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Variable_section__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariable_sectionAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Variable_section__Group__2__Impl"


    // $ANTLR start "rule__Variable_identifier_list__Group__0"
    // InternalPascal.g:5763:1: rule__Variable_identifier_list__Group__0 : rule__Variable_identifier_list__Group__0__Impl rule__Variable_identifier_list__Group__1 ;
    public final void rule__Variable_identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5767:1: ( rule__Variable_identifier_list__Group__0__Impl rule__Variable_identifier_list__Group__1 )
            // InternalPascal.g:5768:2: rule__Variable_identifier_list__Group__0__Impl rule__Variable_identifier_list__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Variable_identifier_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_identifier_list__Group__1();

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
    // $ANTLR end "rule__Variable_identifier_list__Group__0"


    // $ANTLR start "rule__Variable_identifier_list__Group__0__Impl"
    // InternalPascal.g:5775:1: rule__Variable_identifier_list__Group__0__Impl : ( ( rule__Variable_identifier_list__NamesAssignment_0 ) ) ;
    public final void rule__Variable_identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5779:1: ( ( ( rule__Variable_identifier_list__NamesAssignment_0 ) ) )
            // InternalPascal.g:5780:1: ( ( rule__Variable_identifier_list__NamesAssignment_0 ) )
            {
            // InternalPascal.g:5780:1: ( ( rule__Variable_identifier_list__NamesAssignment_0 ) )
            // InternalPascal.g:5781:2: ( rule__Variable_identifier_list__NamesAssignment_0 )
            {
             before(grammarAccess.getVariable_identifier_listAccess().getNamesAssignment_0()); 
            // InternalPascal.g:5782:2: ( rule__Variable_identifier_list__NamesAssignment_0 )
            // InternalPascal.g:5782:3: rule__Variable_identifier_list__NamesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_identifier_list__NamesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_identifier_listAccess().getNamesAssignment_0()); 

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
    // $ANTLR end "rule__Variable_identifier_list__Group__0__Impl"


    // $ANTLR start "rule__Variable_identifier_list__Group__1"
    // InternalPascal.g:5790:1: rule__Variable_identifier_list__Group__1 : rule__Variable_identifier_list__Group__1__Impl ;
    public final void rule__Variable_identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5794:1: ( rule__Variable_identifier_list__Group__1__Impl )
            // InternalPascal.g:5795:2: rule__Variable_identifier_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_identifier_list__Group__1__Impl();

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
    // $ANTLR end "rule__Variable_identifier_list__Group__1"


    // $ANTLR start "rule__Variable_identifier_list__Group__1__Impl"
    // InternalPascal.g:5801:1: rule__Variable_identifier_list__Group__1__Impl : ( ( rule__Variable_identifier_list__Group_1__0 )* ) ;
    public final void rule__Variable_identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5805:1: ( ( ( rule__Variable_identifier_list__Group_1__0 )* ) )
            // InternalPascal.g:5806:1: ( ( rule__Variable_identifier_list__Group_1__0 )* )
            {
            // InternalPascal.g:5806:1: ( ( rule__Variable_identifier_list__Group_1__0 )* )
            // InternalPascal.g:5807:2: ( rule__Variable_identifier_list__Group_1__0 )*
            {
             before(grammarAccess.getVariable_identifier_listAccess().getGroup_1()); 
            // InternalPascal.g:5808:2: ( rule__Variable_identifier_list__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==32) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalPascal.g:5808:3: rule__Variable_identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Variable_identifier_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getVariable_identifier_listAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Variable_identifier_list__Group__1__Impl"


    // $ANTLR start "rule__Variable_identifier_list__Group_1__0"
    // InternalPascal.g:5817:1: rule__Variable_identifier_list__Group_1__0 : rule__Variable_identifier_list__Group_1__0__Impl rule__Variable_identifier_list__Group_1__1 ;
    public final void rule__Variable_identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5821:1: ( rule__Variable_identifier_list__Group_1__0__Impl rule__Variable_identifier_list__Group_1__1 )
            // InternalPascal.g:5822:2: rule__Variable_identifier_list__Group_1__0__Impl rule__Variable_identifier_list__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Variable_identifier_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_identifier_list__Group_1__1();

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
    // $ANTLR end "rule__Variable_identifier_list__Group_1__0"


    // $ANTLR start "rule__Variable_identifier_list__Group_1__0__Impl"
    // InternalPascal.g:5829:1: rule__Variable_identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Variable_identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5833:1: ( ( ',' ) )
            // InternalPascal.g:5834:1: ( ',' )
            {
            // InternalPascal.g:5834:1: ( ',' )
            // InternalPascal.g:5835:2: ','
            {
             before(grammarAccess.getVariable_identifier_listAccess().getCommaKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVariable_identifier_listAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Variable_identifier_list__Group_1__0__Impl"


    // $ANTLR start "rule__Variable_identifier_list__Group_1__1"
    // InternalPascal.g:5844:1: rule__Variable_identifier_list__Group_1__1 : rule__Variable_identifier_list__Group_1__1__Impl ;
    public final void rule__Variable_identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5848:1: ( rule__Variable_identifier_list__Group_1__1__Impl )
            // InternalPascal.g:5849:2: rule__Variable_identifier_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_identifier_list__Group_1__1__Impl();

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
    // $ANTLR end "rule__Variable_identifier_list__Group_1__1"


    // $ANTLR start "rule__Variable_identifier_list__Group_1__1__Impl"
    // InternalPascal.g:5855:1: rule__Variable_identifier_list__Group_1__1__Impl : ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) ) ;
    public final void rule__Variable_identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5859:1: ( ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) ) )
            // InternalPascal.g:5860:1: ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) )
            {
            // InternalPascal.g:5860:1: ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) )
            // InternalPascal.g:5861:2: ( rule__Variable_identifier_list__NamesAssignment_1_1 )
            {
             before(grammarAccess.getVariable_identifier_listAccess().getNamesAssignment_1_1()); 
            // InternalPascal.g:5862:2: ( rule__Variable_identifier_list__NamesAssignment_1_1 )
            // InternalPascal.g:5862:3: rule__Variable_identifier_list__NamesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable_identifier_list__NamesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVariable_identifier_listAccess().getNamesAssignment_1_1()); 

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
    // $ANTLR end "rule__Variable_identifier_list__Group_1__1__Impl"


    // $ANTLR start "rule__Pascal__ProgramAssignment"
    // InternalPascal.g:5871:1: rule__Pascal__ProgramAssignment : ( ruleprogram ) ;
    public final void rule__Pascal__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5875:1: ( ( ruleprogram ) )
            // InternalPascal.g:5876:2: ( ruleprogram )
            {
            // InternalPascal.g:5876:2: ( ruleprogram )
            // InternalPascal.g:5877:3: ruleprogram
            {
             before(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleprogram();

            state._fsp--;

             after(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0()); 

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
    // $ANTLR end "rule__Pascal__ProgramAssignment"


    // $ANTLR start "rule__Program__HeadingAssignment_0"
    // InternalPascal.g:5886:1: rule__Program__HeadingAssignment_0 : ( ruleprogram_heading_block ) ;
    public final void rule__Program__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5890:1: ( ( ruleprogram_heading_block ) )
            // InternalPascal.g:5891:2: ( ruleprogram_heading_block )
            {
            // InternalPascal.g:5891:2: ( ruleprogram_heading_block )
            // InternalPascal.g:5892:3: ruleprogram_heading_block
            {
             before(grammarAccess.getProgramAccess().getHeadingProgram_heading_blockParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleprogram_heading_block();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getHeadingProgram_heading_blockParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Program__HeadingAssignment_0"


    // $ANTLR start "rule__Program__BlockAssignment_1"
    // InternalPascal.g:5901:1: rule__Program__BlockAssignment_1 : ( ruleblock ) ;
    public final void rule__Program__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5905:1: ( ( ruleblock ) )
            // InternalPascal.g:5906:2: ( ruleblock )
            {
            // InternalPascal.g:5906:2: ( ruleblock )
            // InternalPascal.g:5907:3: ruleblock
            {
             before(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleblock();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Program__BlockAssignment_1"


    // $ANTLR start "rule__Program_heading_block__NameAssignment_1"
    // InternalPascal.g:5916:1: rule__Program_heading_block__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program_heading_block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5920:1: ( ( RULE_ID ) )
            // InternalPascal.g:5921:2: ( RULE_ID )
            {
            // InternalPascal.g:5921:2: ( RULE_ID )
            // InternalPascal.g:5922:3: RULE_ID
            {
             before(grammarAccess.getProgram_heading_blockAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProgram_heading_blockAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Program_heading_block__NameAssignment_1"


    // $ANTLR start "rule__Block__LabelAssignment_0"
    // InternalPascal.g:5931:1: rule__Block__LabelAssignment_0 : ( rulelabel_declaration ) ;
    public final void rule__Block__LabelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5935:1: ( ( rulelabel_declaration ) )
            // InternalPascal.g:5936:2: ( rulelabel_declaration )
            {
            // InternalPascal.g:5936:2: ( rulelabel_declaration )
            // InternalPascal.g:5937:3: rulelabel_declaration
            {
             before(grammarAccess.getBlockAccess().getLabelLabel_declarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulelabel_declaration();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getLabelLabel_declarationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Block__LabelAssignment_0"


    // $ANTLR start "rule__Block__TypeAssignment_1"
    // InternalPascal.g:5946:1: rule__Block__TypeAssignment_1 : ( ruletype_definition_part ) ;
    public final void rule__Block__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5950:1: ( ( ruletype_definition_part ) )
            // InternalPascal.g:5951:2: ( ruletype_definition_part )
            {
            // InternalPascal.g:5951:2: ( ruletype_definition_part )
            // InternalPascal.g:5952:3: ruletype_definition_part
            {
             before(grammarAccess.getBlockAccess().getTypeType_definition_partParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruletype_definition_part();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getTypeType_definition_partParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Block__TypeAssignment_1"


    // $ANTLR start "rule__Block__VariableAssignment_2"
    // InternalPascal.g:5961:1: rule__Block__VariableAssignment_2 : ( rulevariable_declaration_part ) ;
    public final void rule__Block__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5965:1: ( ( rulevariable_declaration_part ) )
            // InternalPascal.g:5966:2: ( rulevariable_declaration_part )
            {
            // InternalPascal.g:5966:2: ( rulevariable_declaration_part )
            // InternalPascal.g:5967:3: rulevariable_declaration_part
            {
             before(grammarAccess.getBlockAccess().getVariableVariable_declaration_partParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulevariable_declaration_part();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getVariableVariable_declaration_partParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Block__VariableAssignment_2"


    // $ANTLR start "rule__Block__ConstantAssignment_3"
    // InternalPascal.g:5976:1: rule__Block__ConstantAssignment_3 : ( ruleconstant_definition_part ) ;
    public final void rule__Block__ConstantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5980:1: ( ( ruleconstant_definition_part ) )
            // InternalPascal.g:5981:2: ( ruleconstant_definition_part )
            {
            // InternalPascal.g:5981:2: ( ruleconstant_definition_part )
            // InternalPascal.g:5982:3: ruleconstant_definition_part
            {
             before(grammarAccess.getBlockAccess().getConstantConstant_definition_partParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleconstant_definition_part();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getConstantConstant_definition_partParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Block__ConstantAssignment_3"


    // $ANTLR start "rule__Block__AbstractionAssignment_4"
    // InternalPascal.g:5991:1: rule__Block__AbstractionAssignment_4 : ( rulefunction_procedure_declaration ) ;
    public final void rule__Block__AbstractionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5995:1: ( ( rulefunction_procedure_declaration ) )
            // InternalPascal.g:5996:2: ( rulefunction_procedure_declaration )
            {
            // InternalPascal.g:5996:2: ( rulefunction_procedure_declaration )
            // InternalPascal.g:5997:3: rulefunction_procedure_declaration
            {
             before(grammarAccess.getBlockAccess().getAbstractionFunction_procedure_declarationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulefunction_procedure_declaration();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getAbstractionFunction_procedure_declarationParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Block__AbstractionAssignment_4"


    // $ANTLR start "rule__Block__StatementAssignment_5"
    // InternalPascal.g:6006:1: rule__Block__StatementAssignment_5 : ( rulestatement_part ) ;
    public final void rule__Block__StatementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6010:1: ( ( rulestatement_part ) )
            // InternalPascal.g:6011:2: ( rulestatement_part )
            {
            // InternalPascal.g:6011:2: ( rulestatement_part )
            // InternalPascal.g:6012:3: rulestatement_part
            {
             before(grammarAccess.getBlockAccess().getStatementStatement_partParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulestatement_part();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatementStatement_partParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Block__StatementAssignment_5"


    // $ANTLR start "rule__Statement_part__SequenceAssignment_1"
    // InternalPascal.g:6021:1: rule__Statement_part__SequenceAssignment_1 : ( rulestatement_sequence ) ;
    public final void rule__Statement_part__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6025:1: ( ( rulestatement_sequence ) )
            // InternalPascal.g:6026:2: ( rulestatement_sequence )
            {
            // InternalPascal.g:6026:2: ( rulestatement_sequence )
            // InternalPascal.g:6027:3: rulestatement_sequence
            {
             before(grammarAccess.getStatement_partAccess().getSequenceStatement_sequenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulestatement_sequence();

            state._fsp--;

             after(grammarAccess.getStatement_partAccess().getSequenceStatement_sequenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Statement_part__SequenceAssignment_1"


    // $ANTLR start "rule__Statement_sequence__StatementsAssignment_0"
    // InternalPascal.g:6036:1: rule__Statement_sequence__StatementsAssignment_0 : ( rulestatement ) ;
    public final void rule__Statement_sequence__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6040:1: ( ( rulestatement ) )
            // InternalPascal.g:6041:2: ( rulestatement )
            {
            // InternalPascal.g:6041:2: ( rulestatement )
            // InternalPascal.g:6042:3: rulestatement
            {
             before(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Statement_sequence__StatementsAssignment_0"


    // $ANTLR start "rule__Statement_sequence__StatementsAssignment_1_1"
    // InternalPascal.g:6051:1: rule__Statement_sequence__StatementsAssignment_1_1 : ( rulestatement ) ;
    public final void rule__Statement_sequence__StatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6055:1: ( ( rulestatement ) )
            // InternalPascal.g:6056:2: ( rulestatement )
            {
            // InternalPascal.g:6056:2: ( rulestatement )
            // InternalPascal.g:6057:3: rulestatement
            {
             before(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Statement_sequence__StatementsAssignment_1_1"


    // $ANTLR start "rule__Statement__LabelAssignment_0_0"
    // InternalPascal.g:6066:1: rule__Statement__LabelAssignment_0_0 : ( rulelabel ) ;
    public final void rule__Statement__LabelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6070:1: ( ( rulelabel ) )
            // InternalPascal.g:6071:2: ( rulelabel )
            {
            // InternalPascal.g:6071:2: ( rulelabel )
            // InternalPascal.g:6072:3: rulelabel
            {
             before(grammarAccess.getStatementAccess().getLabelLabelParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            rulelabel();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getLabelLabelParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Statement__LabelAssignment_0_0"


    // $ANTLR start "rule__Statement__SimpleAssignment_1"
    // InternalPascal.g:6081:1: rule__Statement__SimpleAssignment_1 : ( rulesimple_statement ) ;
    public final void rule__Statement__SimpleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6085:1: ( ( rulesimple_statement ) )
            // InternalPascal.g:6086:2: ( rulesimple_statement )
            {
            // InternalPascal.g:6086:2: ( rulesimple_statement )
            // InternalPascal.g:6087:3: rulesimple_statement
            {
             before(grammarAccess.getStatementAccess().getSimpleSimple_statementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulesimple_statement();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getSimpleSimple_statementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Statement__SimpleAssignment_1"


    // $ANTLR start "rule__Simple_statement__AssignmentAssignment_0"
    // InternalPascal.g:6096:1: rule__Simple_statement__AssignmentAssignment_0 : ( ruleassignment_statement ) ;
    public final void rule__Simple_statement__AssignmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6100:1: ( ( ruleassignment_statement ) )
            // InternalPascal.g:6101:2: ( ruleassignment_statement )
            {
            // InternalPascal.g:6101:2: ( ruleassignment_statement )
            // InternalPascal.g:6102:3: ruleassignment_statement
            {
             before(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_statementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleassignment_statement();

            state._fsp--;

             after(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_statementParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Simple_statement__AssignmentAssignment_0"


    // $ANTLR start "rule__Simple_statement__FunctionAssignment_1"
    // InternalPascal.g:6111:1: rule__Simple_statement__FunctionAssignment_1 : ( rulefunction_designator ) ;
    public final void rule__Simple_statement__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6115:1: ( ( rulefunction_designator ) )
            // InternalPascal.g:6116:2: ( rulefunction_designator )
            {
            // InternalPascal.g:6116:2: ( rulefunction_designator )
            // InternalPascal.g:6117:3: rulefunction_designator
            {
             before(grammarAccess.getSimple_statementAccess().getFunctionFunction_designatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulefunction_designator();

            state._fsp--;

             after(grammarAccess.getSimple_statementAccess().getFunctionFunction_designatorParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Simple_statement__FunctionAssignment_1"


    // $ANTLR start "rule__Simple_statement__Function_noargsAssignment_2"
    // InternalPascal.g:6126:1: rule__Simple_statement__Function_noargsAssignment_2 : ( RULE_ID ) ;
    public final void rule__Simple_statement__Function_noargsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6130:1: ( ( RULE_ID ) )
            // InternalPascal.g:6131:2: ( RULE_ID )
            {
            // InternalPascal.g:6131:2: ( RULE_ID )
            // InternalPascal.g:6132:3: RULE_ID
            {
             before(grammarAccess.getSimple_statementAccess().getFunction_noargsIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimple_statementAccess().getFunction_noargsIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Simple_statement__Function_noargsAssignment_2"


    // $ANTLR start "rule__Assignment_statement__VariableAssignment_0"
    // InternalPascal.g:6141:1: rule__Assignment_statement__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Assignment_statement__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6145:1: ( ( rulevariable ) )
            // InternalPascal.g:6146:2: ( rulevariable )
            {
            // InternalPascal.g:6146:2: ( rulevariable )
            // InternalPascal.g:6147:3: rulevariable
            {
             before(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulevariable();

            state._fsp--;

             after(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Assignment_statement__VariableAssignment_0"


    // $ANTLR start "rule__Assignment_statement__ExpressionAssignment_2"
    // InternalPascal.g:6156:1: rule__Assignment_statement__ExpressionAssignment_2 : ( ruleexpression ) ;
    public final void rule__Assignment_statement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6160:1: ( ( ruleexpression ) )
            // InternalPascal.g:6161:2: ( ruleexpression )
            {
            // InternalPascal.g:6161:2: ( ruleexpression )
            // InternalPascal.g:6162:3: ruleexpression
            {
             before(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Assignment_statement__ExpressionAssignment_2"


    // $ANTLR start "rule__Label__NumberAssignment_0"
    // InternalPascal.g:6171:1: rule__Label__NumberAssignment_0 : ( RULE_SIGNED_INTEGER_NUMBER ) ;
    public final void rule__Label__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6175:1: ( ( RULE_SIGNED_INTEGER_NUMBER ) )
            // InternalPascal.g:6176:2: ( RULE_SIGNED_INTEGER_NUMBER )
            {
            // InternalPascal.g:6176:2: ( RULE_SIGNED_INTEGER_NUMBER )
            // InternalPascal.g:6177:3: RULE_SIGNED_INTEGER_NUMBER
            {
             before(grammarAccess.getLabelAccess().getNumberSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0()); 
            match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getNumberSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Label__NumberAssignment_0"


    // $ANTLR start "rule__Label__NumberAssignment_1"
    // InternalPascal.g:6186:1: rule__Label__NumberAssignment_1 : ( RULE_INTEGER_NUMBER ) ;
    public final void rule__Label__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6190:1: ( ( RULE_INTEGER_NUMBER ) )
            // InternalPascal.g:6191:2: ( RULE_INTEGER_NUMBER )
            {
            // InternalPascal.g:6191:2: ( RULE_INTEGER_NUMBER )
            // InternalPascal.g:6192:3: RULE_INTEGER_NUMBER
            {
             before(grammarAccess.getLabelAccess().getNumberINTEGER_NUMBERTerminalRuleCall_1_0()); 
            match(input,RULE_INTEGER_NUMBER,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getNumberINTEGER_NUMBERTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Label__NumberAssignment_1"


    // $ANTLR start "rule__Variable__NameAssignment_0"
    // InternalPascal.g:6201:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6205:1: ( ( RULE_ID ) )
            // InternalPascal.g:6206:2: ( RULE_ID )
            {
            // InternalPascal.g:6206:2: ( RULE_ID )
            // InternalPascal.g:6207:3: RULE_ID
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
    // InternalPascal.g:6216:1: rule__Variable__VariableAssignment_1 : ( rulevar_ ) ;
    public final void rule__Variable__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6220:1: ( ( rulevar_ ) )
            // InternalPascal.g:6221:2: ( rulevar_ )
            {
            // InternalPascal.g:6221:2: ( rulevar_ )
            // InternalPascal.g:6222:3: rulevar_
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
    // InternalPascal.g:6231:1: rule__Var___ExpressionsAssignment_0_1 : ( ruleexpression_list ) ;
    public final void rule__Var___ExpressionsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6235:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:6236:2: ( ruleexpression_list )
            {
            // InternalPascal.g:6236:2: ( ruleexpression_list )
            // InternalPascal.g:6237:3: ruleexpression_list
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
    // InternalPascal.g:6246:1: rule__Var___ArrayAssignment_0_3 : ( rulevar_ ) ;
    public final void rule__Var___ArrayAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6250:1: ( ( rulevar_ ) )
            // InternalPascal.g:6251:2: ( rulevar_ )
            {
            // InternalPascal.g:6251:2: ( rulevar_ )
            // InternalPascal.g:6252:3: rulevar_
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
    // InternalPascal.g:6261:1: rule__Var___AccessorAssignment_1_0 : ( ( '.' ) ) ;
    public final void rule__Var___AccessorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6265:1: ( ( ( '.' ) ) )
            // InternalPascal.g:6266:2: ( ( '.' ) )
            {
            // InternalPascal.g:6266:2: ( ( '.' ) )
            // InternalPascal.g:6267:3: ( '.' )
            {
             before(grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0()); 
            // InternalPascal.g:6268:3: ( '.' )
            // InternalPascal.g:6269:4: '.'
            {
             before(grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalPascal.g:6280:1: rule__Var___NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Var___NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6284:1: ( ( RULE_ID ) )
            // InternalPascal.g:6285:2: ( RULE_ID )
            {
            // InternalPascal.g:6285:2: ( RULE_ID )
            // InternalPascal.g:6286:3: RULE_ID
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
    // InternalPascal.g:6295:1: rule__Var___VariableAssignment_1_2 : ( rulevar_ ) ;
    public final void rule__Var___VariableAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6299:1: ( ( rulevar_ ) )
            // InternalPascal.g:6300:2: ( rulevar_ )
            {
            // InternalPascal.g:6300:2: ( rulevar_ )
            // InternalPascal.g:6301:3: rulevar_
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
    // InternalPascal.g:6310:1: rule__Var___PointerAssignment_2_1 : ( rulevar_ ) ;
    public final void rule__Var___PointerAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6314:1: ( ( rulevar_ ) )
            // InternalPascal.g:6315:2: ( rulevar_ )
            {
            // InternalPascal.g:6315:2: ( rulevar_ )
            // InternalPascal.g:6316:3: rulevar_
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
    // InternalPascal.g:6325:1: rule__Expression_list__ExpressionsAssignment_0 : ( ruleexpression ) ;
    public final void rule__Expression_list__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6329:1: ( ( ruleexpression ) )
            // InternalPascal.g:6330:2: ( ruleexpression )
            {
            // InternalPascal.g:6330:2: ( ruleexpression )
            // InternalPascal.g:6331:3: ruleexpression
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
    // InternalPascal.g:6340:1: rule__Expression_list__ExpressionsAssignment_1_1 : ( ruleexpression ) ;
    public final void rule__Expression_list__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6344:1: ( ( ruleexpression ) )
            // InternalPascal.g:6345:2: ( ruleexpression )
            {
            // InternalPascal.g:6345:2: ( ruleexpression )
            // InternalPascal.g:6346:3: ruleexpression
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
    // InternalPascal.g:6355:1: rule__Expression__ExpressionsAssignment_0 : ( rulesimple_expression ) ;
    public final void rule__Expression__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6359:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:6360:2: ( rulesimple_expression )
            {
            // InternalPascal.g:6360:2: ( rulesimple_expression )
            // InternalPascal.g:6361:3: rulesimple_expression
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
    // InternalPascal.g:6370:1: rule__Expression__OperatorsAssignment_1_0_0 : ( RULE_RELATIONAL_OP ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6374:1: ( ( RULE_RELATIONAL_OP ) )
            // InternalPascal.g:6375:2: ( RULE_RELATIONAL_OP )
            {
            // InternalPascal.g:6375:2: ( RULE_RELATIONAL_OP )
            // InternalPascal.g:6376:3: RULE_RELATIONAL_OP
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
    // InternalPascal.g:6385:1: rule__Expression__OperatorsAssignment_1_0_1 : ( ( 'in' ) ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6389:1: ( ( ( 'in' ) ) )
            // InternalPascal.g:6390:2: ( ( 'in' ) )
            {
            // InternalPascal.g:6390:2: ( ( 'in' ) )
            // InternalPascal.g:6391:3: ( 'in' )
            {
             before(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 
            // InternalPascal.g:6392:3: ( 'in' )
            // InternalPascal.g:6393:4: 'in'
            {
             before(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalPascal.g:6404:1: rule__Expression__OperatorsAssignment_1_0_2 : ( ( '=' ) ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6408:1: ( ( ( '=' ) ) )
            // InternalPascal.g:6409:2: ( ( '=' ) )
            {
            // InternalPascal.g:6409:2: ( ( '=' ) )
            // InternalPascal.g:6410:3: ( '=' )
            {
             before(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 
            // InternalPascal.g:6411:3: ( '=' )
            // InternalPascal.g:6412:4: '='
            {
             before(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalPascal.g:6423:1: rule__Expression__ExpressionsAssignment_1_1 : ( rulesimple_expression ) ;
    public final void rule__Expression__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6427:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:6428:2: ( rulesimple_expression )
            {
            // InternalPascal.g:6428:2: ( rulesimple_expression )
            // InternalPascal.g:6429:3: rulesimple_expression
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
    // InternalPascal.g:6438:1: rule__Simple_expression__PrefixOperatorAssignment_0 : ( RULE_ADDITION_OP ) ;
    public final void rule__Simple_expression__PrefixOperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6442:1: ( ( RULE_ADDITION_OP ) )
            // InternalPascal.g:6443:2: ( RULE_ADDITION_OP )
            {
            // InternalPascal.g:6443:2: ( RULE_ADDITION_OP )
            // InternalPascal.g:6444:3: RULE_ADDITION_OP
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
    // InternalPascal.g:6453:1: rule__Simple_expression__TermsAssignment_1 : ( ruleterm ) ;
    public final void rule__Simple_expression__TermsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6457:1: ( ( ruleterm ) )
            // InternalPascal.g:6458:2: ( ruleterm )
            {
            // InternalPascal.g:6458:2: ( ruleterm )
            // InternalPascal.g:6459:3: ruleterm
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
    // InternalPascal.g:6468:1: rule__Simple_expression__OperatorsAssignment_2_0_0_0 : ( RULE_ADDITION_OP ) ;
    public final void rule__Simple_expression__OperatorsAssignment_2_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6472:1: ( ( RULE_ADDITION_OP ) )
            // InternalPascal.g:6473:2: ( RULE_ADDITION_OP )
            {
            // InternalPascal.g:6473:2: ( RULE_ADDITION_OP )
            // InternalPascal.g:6474:3: RULE_ADDITION_OP
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
    // InternalPascal.g:6483:1: rule__Simple_expression__OperatorsAssignment_2_0_0_1 : ( ( 'or' ) ) ;
    public final void rule__Simple_expression__OperatorsAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6487:1: ( ( ( 'or' ) ) )
            // InternalPascal.g:6488:2: ( ( 'or' ) )
            {
            // InternalPascal.g:6488:2: ( ( 'or' ) )
            // InternalPascal.g:6489:3: ( 'or' )
            {
             before(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 
            // InternalPascal.g:6490:3: ( 'or' )
            // InternalPascal.g:6491:4: 'or'
            {
             before(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalPascal.g:6502:1: rule__Simple_expression__TermsAssignment_2_0_1 : ( ruleterm ) ;
    public final void rule__Simple_expression__TermsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6506:1: ( ( ruleterm ) )
            // InternalPascal.g:6507:2: ( ruleterm )
            {
            // InternalPascal.g:6507:2: ( ruleterm )
            // InternalPascal.g:6508:3: ruleterm
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
    // InternalPascal.g:6517:1: rule__Simple_expression__TermsAssignment_2_1 : ( ruleunsigned_number ) ;
    public final void rule__Simple_expression__TermsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6521:1: ( ( ruleunsigned_number ) )
            // InternalPascal.g:6522:2: ( ruleunsigned_number )
            {
            // InternalPascal.g:6522:2: ( ruleunsigned_number )
            // InternalPascal.g:6523:3: ruleunsigned_number
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
    // InternalPascal.g:6532:1: rule__Term__FactorsAssignment_0 : ( rulefactor ) ;
    public final void rule__Term__FactorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6536:1: ( ( rulefactor ) )
            // InternalPascal.g:6537:2: ( rulefactor )
            {
            // InternalPascal.g:6537:2: ( rulefactor )
            // InternalPascal.g:6538:3: rulefactor
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
    // InternalPascal.g:6547:1: rule__Term__OperatorsAssignment_1_0_0 : ( RULE_MULTIPLICATION_OP ) ;
    public final void rule__Term__OperatorsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6551:1: ( ( RULE_MULTIPLICATION_OP ) )
            // InternalPascal.g:6552:2: ( RULE_MULTIPLICATION_OP )
            {
            // InternalPascal.g:6552:2: ( RULE_MULTIPLICATION_OP )
            // InternalPascal.g:6553:3: RULE_MULTIPLICATION_OP
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
    // InternalPascal.g:6562:1: rule__Term__OperatorsAssignment_1_0_1 : ( ( 'div' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6566:1: ( ( ( 'div' ) ) )
            // InternalPascal.g:6567:2: ( ( 'div' ) )
            {
            // InternalPascal.g:6567:2: ( ( 'div' ) )
            // InternalPascal.g:6568:3: ( 'div' )
            {
             before(grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0()); 
            // InternalPascal.g:6569:3: ( 'div' )
            // InternalPascal.g:6570:4: 'div'
            {
             before(grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalPascal.g:6581:1: rule__Term__OperatorsAssignment_1_0_2 : ( ( 'mod' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6585:1: ( ( ( 'mod' ) ) )
            // InternalPascal.g:6586:2: ( ( 'mod' ) )
            {
            // InternalPascal.g:6586:2: ( ( 'mod' ) )
            // InternalPascal.g:6587:3: ( 'mod' )
            {
             before(grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0()); 
            // InternalPascal.g:6588:3: ( 'mod' )
            // InternalPascal.g:6589:4: 'mod'
            {
             before(grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalPascal.g:6600:1: rule__Term__OperatorsAssignment_1_0_3 : ( ( 'and' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6604:1: ( ( ( 'and' ) ) )
            // InternalPascal.g:6605:2: ( ( 'and' ) )
            {
            // InternalPascal.g:6605:2: ( ( 'and' ) )
            // InternalPascal.g:6606:3: ( 'and' )
            {
             before(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0()); 
            // InternalPascal.g:6607:3: ( 'and' )
            // InternalPascal.g:6608:4: 'and'
            {
             before(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalPascal.g:6619:1: rule__Term__FactorsAssignment_1_1 : ( rulefactor ) ;
    public final void rule__Term__FactorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6623:1: ( ( rulefactor ) )
            // InternalPascal.g:6624:2: ( rulefactor )
            {
            // InternalPascal.g:6624:2: ( rulefactor )
            // InternalPascal.g:6625:3: rulefactor
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
    // InternalPascal.g:6634:1: rule__Factor__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Factor__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6638:1: ( ( rulevariable ) )
            // InternalPascal.g:6639:2: ( rulevariable )
            {
            // InternalPascal.g:6639:2: ( rulevariable )
            // InternalPascal.g:6640:3: rulevariable
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
    // InternalPascal.g:6649:1: rule__Factor__NumberAssignment_1 : ( rulenumber ) ;
    public final void rule__Factor__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6653:1: ( ( rulenumber ) )
            // InternalPascal.g:6654:2: ( rulenumber )
            {
            // InternalPascal.g:6654:2: ( rulenumber )
            // InternalPascal.g:6655:3: rulenumber
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
    // InternalPascal.g:6664:1: rule__Factor__StringAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Factor__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6668:1: ( ( RULE_STRING ) )
            // InternalPascal.g:6669:2: ( RULE_STRING )
            {
            // InternalPascal.g:6669:2: ( RULE_STRING )
            // InternalPascal.g:6670:3: RULE_STRING
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
    // InternalPascal.g:6679:1: rule__Factor__SetAssignment_3 : ( ruleset ) ;
    public final void rule__Factor__SetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6683:1: ( ( ruleset ) )
            // InternalPascal.g:6684:2: ( ruleset )
            {
            // InternalPascal.g:6684:2: ( ruleset )
            // InternalPascal.g:6685:3: ruleset
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
    // InternalPascal.g:6694:1: rule__Factor__NilAssignment_4 : ( ( 'nil' ) ) ;
    public final void rule__Factor__NilAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6698:1: ( ( ( 'nil' ) ) )
            // InternalPascal.g:6699:2: ( ( 'nil' ) )
            {
            // InternalPascal.g:6699:2: ( ( 'nil' ) )
            // InternalPascal.g:6700:3: ( 'nil' )
            {
             before(grammarAccess.getFactorAccess().getNilNilKeyword_4_0()); 
            // InternalPascal.g:6701:3: ( 'nil' )
            // InternalPascal.g:6702:4: 'nil'
            {
             before(grammarAccess.getFactorAccess().getNilNilKeyword_4_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalPascal.g:6713:1: rule__Factor__BooleanAssignment_5 : ( ( 'true' ) ) ;
    public final void rule__Factor__BooleanAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6717:1: ( ( ( 'true' ) ) )
            // InternalPascal.g:6718:2: ( ( 'true' ) )
            {
            // InternalPascal.g:6718:2: ( ( 'true' ) )
            // InternalPascal.g:6719:3: ( 'true' )
            {
             before(grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0()); 
            // InternalPascal.g:6720:3: ( 'true' )
            // InternalPascal.g:6721:4: 'true'
            {
             before(grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalPascal.g:6732:1: rule__Factor__BooleanAssignment_6 : ( ( 'false' ) ) ;
    public final void rule__Factor__BooleanAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6736:1: ( ( ( 'false' ) ) )
            // InternalPascal.g:6737:2: ( ( 'false' ) )
            {
            // InternalPascal.g:6737:2: ( ( 'false' ) )
            // InternalPascal.g:6738:3: ( 'false' )
            {
             before(grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0()); 
            // InternalPascal.g:6739:3: ( 'false' )
            // InternalPascal.g:6740:4: 'false'
            {
             before(grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalPascal.g:6751:1: rule__Factor__FunctionAssignment_7 : ( rulefunction_designator ) ;
    public final void rule__Factor__FunctionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6755:1: ( ( rulefunction_designator ) )
            // InternalPascal.g:6756:2: ( rulefunction_designator )
            {
            // InternalPascal.g:6756:2: ( rulefunction_designator )
            // InternalPascal.g:6757:3: rulefunction_designator
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
    // InternalPascal.g:6766:1: rule__Factor__ExpressionAssignment_8_1 : ( ruleexpression ) ;
    public final void rule__Factor__ExpressionAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6770:1: ( ( ruleexpression ) )
            // InternalPascal.g:6771:2: ( ruleexpression )
            {
            // InternalPascal.g:6771:2: ( ruleexpression )
            // InternalPascal.g:6772:3: ruleexpression
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
    // InternalPascal.g:6781:1: rule__Factor__NotAssignment_9_1 : ( rulefactor ) ;
    public final void rule__Factor__NotAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6785:1: ( ( rulefactor ) )
            // InternalPascal.g:6786:2: ( rulefactor )
            {
            // InternalPascal.g:6786:2: ( rulefactor )
            // InternalPascal.g:6787:3: rulefactor
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
    // InternalPascal.g:6796:1: rule__Function_designator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Function_designator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6800:1: ( ( RULE_ID ) )
            // InternalPascal.g:6801:2: ( RULE_ID )
            {
            // InternalPascal.g:6801:2: ( RULE_ID )
            // InternalPascal.g:6802:3: RULE_ID
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
    // InternalPascal.g:6811:1: rule__Function_designator__ExpressionsAssignment_2 : ( ruleexpression_list ) ;
    public final void rule__Function_designator__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6815:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:6816:2: ( ruleexpression_list )
            {
            // InternalPascal.g:6816:2: ( ruleexpression_list )
            // InternalPascal.g:6817:3: ruleexpression_list
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


    // $ANTLR start "rule__Function_procedure_declaration__ProceduresAssignment_0_0"
    // InternalPascal.g:6826:1: rule__Function_procedure_declaration__ProceduresAssignment_0_0 : ( rulefunction_declaration ) ;
    public final void rule__Function_procedure_declaration__ProceduresAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6830:1: ( ( rulefunction_declaration ) )
            // InternalPascal.g:6831:2: ( rulefunction_declaration )
            {
            // InternalPascal.g:6831:2: ( rulefunction_declaration )
            // InternalPascal.g:6832:3: rulefunction_declaration
            {
             before(grammarAccess.getFunction_procedure_declarationAccess().getProceduresFunction_declarationParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            rulefunction_declaration();

            state._fsp--;

             after(grammarAccess.getFunction_procedure_declarationAccess().getProceduresFunction_declarationParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Function_procedure_declaration__ProceduresAssignment_0_0"


    // $ANTLR start "rule__Function_procedure_declaration__FunctionsAssignment_0_1"
    // InternalPascal.g:6841:1: rule__Function_procedure_declaration__FunctionsAssignment_0_1 : ( ruleprocedure_declaration ) ;
    public final void rule__Function_procedure_declaration__FunctionsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6845:1: ( ( ruleprocedure_declaration ) )
            // InternalPascal.g:6846:2: ( ruleprocedure_declaration )
            {
            // InternalPascal.g:6846:2: ( ruleprocedure_declaration )
            // InternalPascal.g:6847:3: ruleprocedure_declaration
            {
             before(grammarAccess.getFunction_procedure_declarationAccess().getFunctionsProcedure_declarationParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleprocedure_declaration();

            state._fsp--;

             after(grammarAccess.getFunction_procedure_declarationAccess().getFunctionsProcedure_declarationParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Function_procedure_declaration__FunctionsAssignment_0_1"


    // $ANTLR start "rule__Function_heading__NameAssignment_1"
    // InternalPascal.g:6856:1: rule__Function_heading__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function_heading__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6860:1: ( ( RULE_ID ) )
            // InternalPascal.g:6861:2: ( RULE_ID )
            {
            // InternalPascal.g:6861:2: ( RULE_ID )
            // InternalPascal.g:6862:3: RULE_ID
            {
             before(grammarAccess.getFunction_headingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunction_headingAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Function_heading__NameAssignment_1"


    // $ANTLR start "rule__Function_heading__ParametersAssignment_2"
    // InternalPascal.g:6871:1: rule__Function_heading__ParametersAssignment_2 : ( ruleformal_parameter_list ) ;
    public final void rule__Function_heading__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6875:1: ( ( ruleformal_parameter_list ) )
            // InternalPascal.g:6876:2: ( ruleformal_parameter_list )
            {
            // InternalPascal.g:6876:2: ( ruleformal_parameter_list )
            // InternalPascal.g:6877:3: ruleformal_parameter_list
            {
             before(grammarAccess.getFunction_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleformal_parameter_list();

            state._fsp--;

             after(grammarAccess.getFunction_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Function_heading__ParametersAssignment_2"


    // $ANTLR start "rule__Function_heading__ReturnTypeAssignment_4"
    // InternalPascal.g:6886:1: rule__Function_heading__ReturnTypeAssignment_4 : ( RULE_ID ) ;
    public final void rule__Function_heading__ReturnTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6890:1: ( ( RULE_ID ) )
            // InternalPascal.g:6891:2: ( RULE_ID )
            {
            // InternalPascal.g:6891:2: ( RULE_ID )
            // InternalPascal.g:6892:3: RULE_ID
            {
             before(grammarAccess.getFunction_headingAccess().getReturnTypeIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunction_headingAccess().getReturnTypeIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Function_heading__ReturnTypeAssignment_4"


    // $ANTLR start "rule__Function_declaration__HeadingAssignment_0"
    // InternalPascal.g:6901:1: rule__Function_declaration__HeadingAssignment_0 : ( rulefunction_heading ) ;
    public final void rule__Function_declaration__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6905:1: ( ( rulefunction_heading ) )
            // InternalPascal.g:6906:2: ( rulefunction_heading )
            {
            // InternalPascal.g:6906:2: ( rulefunction_heading )
            // InternalPascal.g:6907:3: rulefunction_heading
            {
             before(grammarAccess.getFunction_declarationAccess().getHeadingFunction_headingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulefunction_heading();

            state._fsp--;

             after(grammarAccess.getFunction_declarationAccess().getHeadingFunction_headingParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Function_declaration__HeadingAssignment_0"


    // $ANTLR start "rule__Function_declaration__BlockAssignment_2"
    // InternalPascal.g:6916:1: rule__Function_declaration__BlockAssignment_2 : ( ruleblock ) ;
    public final void rule__Function_declaration__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6920:1: ( ( ruleblock ) )
            // InternalPascal.g:6921:2: ( ruleblock )
            {
            // InternalPascal.g:6921:2: ( ruleblock )
            // InternalPascal.g:6922:3: ruleblock
            {
             before(grammarAccess.getFunction_declarationAccess().getBlockBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleblock();

            state._fsp--;

             after(grammarAccess.getFunction_declarationAccess().getBlockBlockParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Function_declaration__BlockAssignment_2"


    // $ANTLR start "rule__Formal_parameter_list__ParametersAssignment_1"
    // InternalPascal.g:6931:1: rule__Formal_parameter_list__ParametersAssignment_1 : ( ruleformal_parameter_section ) ;
    public final void rule__Formal_parameter_list__ParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6935:1: ( ( ruleformal_parameter_section ) )
            // InternalPascal.g:6936:2: ( ruleformal_parameter_section )
            {
            // InternalPascal.g:6936:2: ( ruleformal_parameter_section )
            // InternalPascal.g:6937:3: ruleformal_parameter_section
            {
             before(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleformal_parameter_section();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Formal_parameter_list__ParametersAssignment_1"


    // $ANTLR start "rule__Formal_parameter_list__ParametersAssignment_2_1"
    // InternalPascal.g:6946:1: rule__Formal_parameter_list__ParametersAssignment_2_1 : ( ruleformal_parameter_section ) ;
    public final void rule__Formal_parameter_list__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6950:1: ( ( ruleformal_parameter_section ) )
            // InternalPascal.g:6951:2: ( ruleformal_parameter_section )
            {
            // InternalPascal.g:6951:2: ( ruleformal_parameter_section )
            // InternalPascal.g:6952:3: ruleformal_parameter_section
            {
             before(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleformal_parameter_section();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Formal_parameter_list__ParametersAssignment_2_1"


    // $ANTLR start "rule__Formal_parameter_section__ValueAssignment_0"
    // InternalPascal.g:6961:1: rule__Formal_parameter_section__ValueAssignment_0 : ( rulevalue_parameter_section ) ;
    public final void rule__Formal_parameter_section__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6965:1: ( ( rulevalue_parameter_section ) )
            // InternalPascal.g:6966:2: ( rulevalue_parameter_section )
            {
            // InternalPascal.g:6966:2: ( rulevalue_parameter_section )
            // InternalPascal.g:6967:3: rulevalue_parameter_section
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getValueValue_parameter_sectionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulevalue_parameter_section();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_sectionAccess().getValueValue_parameter_sectionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Formal_parameter_section__ValueAssignment_0"


    // $ANTLR start "rule__Formal_parameter_section__VariableAssignment_1"
    // InternalPascal.g:6976:1: rule__Formal_parameter_section__VariableAssignment_1 : ( rulevariable_parameter_section ) ;
    public final void rule__Formal_parameter_section__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6980:1: ( ( rulevariable_parameter_section ) )
            // InternalPascal.g:6981:2: ( rulevariable_parameter_section )
            {
            // InternalPascal.g:6981:2: ( rulevariable_parameter_section )
            // InternalPascal.g:6982:3: rulevariable_parameter_section
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getVariableVariable_parameter_sectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulevariable_parameter_section();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_sectionAccess().getVariableVariable_parameter_sectionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Formal_parameter_section__VariableAssignment_1"


    // $ANTLR start "rule__Formal_parameter_section__ProcedureAssignment_2"
    // InternalPascal.g:6991:1: rule__Formal_parameter_section__ProcedureAssignment_2 : ( ruleprocedure_heading ) ;
    public final void rule__Formal_parameter_section__ProcedureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6995:1: ( ( ruleprocedure_heading ) )
            // InternalPascal.g:6996:2: ( ruleprocedure_heading )
            {
            // InternalPascal.g:6996:2: ( ruleprocedure_heading )
            // InternalPascal.g:6997:3: ruleprocedure_heading
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getProcedureProcedure_headingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleprocedure_heading();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_sectionAccess().getProcedureProcedure_headingParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Formal_parameter_section__ProcedureAssignment_2"


    // $ANTLR start "rule__Formal_parameter_section__FunctionAssignment_3"
    // InternalPascal.g:7006:1: rule__Formal_parameter_section__FunctionAssignment_3 : ( rulefunction_heading ) ;
    public final void rule__Formal_parameter_section__FunctionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7010:1: ( ( rulefunction_heading ) )
            // InternalPascal.g:7011:2: ( rulefunction_heading )
            {
            // InternalPascal.g:7011:2: ( rulefunction_heading )
            // InternalPascal.g:7012:3: rulefunction_heading
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getFunctionFunction_headingParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulefunction_heading();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_sectionAccess().getFunctionFunction_headingParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Formal_parameter_section__FunctionAssignment_3"


    // $ANTLR start "rule__Value_parameter_section__IdentifiersAssignment_0"
    // InternalPascal.g:7021:1: rule__Value_parameter_section__IdentifiersAssignment_0 : ( ruleidentifier_list ) ;
    public final void rule__Value_parameter_section__IdentifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7025:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:7026:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:7026:2: ( ruleidentifier_list )
            // InternalPascal.g:7027:3: ruleidentifier_list
            {
             before(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Value_parameter_section__IdentifiersAssignment_0"


    // $ANTLR start "rule__Value_parameter_section__TypeAssignment_2"
    // InternalPascal.g:7036:1: rule__Value_parameter_section__TypeAssignment_2 : ( ruleparameter_type ) ;
    public final void rule__Value_parameter_section__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7040:1: ( ( ruleparameter_type ) )
            // InternalPascal.g:7041:2: ( ruleparameter_type )
            {
            // InternalPascal.g:7041:2: ( ruleparameter_type )
            // InternalPascal.g:7042:3: ruleparameter_type
            {
             before(grammarAccess.getValue_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleparameter_type();

            state._fsp--;

             after(grammarAccess.getValue_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Value_parameter_section__TypeAssignment_2"


    // $ANTLR start "rule__Identifier_list__NamesAssignment_0"
    // InternalPascal.g:7051:1: rule__Identifier_list__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Identifier_list__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7055:1: ( ( RULE_ID ) )
            // InternalPascal.g:7056:2: ( RULE_ID )
            {
            // InternalPascal.g:7056:2: ( RULE_ID )
            // InternalPascal.g:7057:3: RULE_ID
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Identifier_list__NamesAssignment_0"


    // $ANTLR start "rule__Identifier_list__NamesAssignment_1_1"
    // InternalPascal.g:7066:1: rule__Identifier_list__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Identifier_list__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7070:1: ( ( RULE_ID ) )
            // InternalPascal.g:7071:2: ( RULE_ID )
            {
            // InternalPascal.g:7071:2: ( RULE_ID )
            // InternalPascal.g:7072:3: RULE_ID
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Identifier_list__NamesAssignment_1_1"


    // $ANTLR start "rule__Parameter_type__NameAssignment"
    // InternalPascal.g:7081:1: rule__Parameter_type__NameAssignment : ( RULE_ID ) ;
    public final void rule__Parameter_type__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7085:1: ( ( RULE_ID ) )
            // InternalPascal.g:7086:2: ( RULE_ID )
            {
            // InternalPascal.g:7086:2: ( RULE_ID )
            // InternalPascal.g:7087:3: RULE_ID
            {
             before(grammarAccess.getParameter_typeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameter_typeAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Parameter_type__NameAssignment"


    // $ANTLR start "rule__Variable_parameter_section__IndentifiersAssignment_1"
    // InternalPascal.g:7096:1: rule__Variable_parameter_section__IndentifiersAssignment_1 : ( ruleidentifier_list ) ;
    public final void rule__Variable_parameter_section__IndentifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7100:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:7101:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:7101:2: ( ruleidentifier_list )
            // InternalPascal.g:7102:3: ruleidentifier_list
            {
             before(grammarAccess.getVariable_parameter_sectionAccess().getIndentifiersIdentifier_listParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getVariable_parameter_sectionAccess().getIndentifiersIdentifier_listParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Variable_parameter_section__IndentifiersAssignment_1"


    // $ANTLR start "rule__Variable_parameter_section__TypeAssignment_3"
    // InternalPascal.g:7111:1: rule__Variable_parameter_section__TypeAssignment_3 : ( ruleparameter_type ) ;
    public final void rule__Variable_parameter_section__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7115:1: ( ( ruleparameter_type ) )
            // InternalPascal.g:7116:2: ( ruleparameter_type )
            {
            // InternalPascal.g:7116:2: ( ruleparameter_type )
            // InternalPascal.g:7117:3: ruleparameter_type
            {
             before(grammarAccess.getVariable_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleparameter_type();

            state._fsp--;

             after(grammarAccess.getVariable_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Variable_parameter_section__TypeAssignment_3"


    // $ANTLR start "rule__Procedure_declaration__HeadingAssignment_0"
    // InternalPascal.g:7126:1: rule__Procedure_declaration__HeadingAssignment_0 : ( ruleprocedure_heading ) ;
    public final void rule__Procedure_declaration__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7130:1: ( ( ruleprocedure_heading ) )
            // InternalPascal.g:7131:2: ( ruleprocedure_heading )
            {
            // InternalPascal.g:7131:2: ( ruleprocedure_heading )
            // InternalPascal.g:7132:3: ruleprocedure_heading
            {
             before(grammarAccess.getProcedure_declarationAccess().getHeadingProcedure_headingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleprocedure_heading();

            state._fsp--;

             after(grammarAccess.getProcedure_declarationAccess().getHeadingProcedure_headingParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Procedure_declaration__HeadingAssignment_0"


    // $ANTLR start "rule__Procedure_declaration__BlockAssignment_2"
    // InternalPascal.g:7141:1: rule__Procedure_declaration__BlockAssignment_2 : ( ruleblock ) ;
    public final void rule__Procedure_declaration__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7145:1: ( ( ruleblock ) )
            // InternalPascal.g:7146:2: ( ruleblock )
            {
            // InternalPascal.g:7146:2: ( ruleblock )
            // InternalPascal.g:7147:3: ruleblock
            {
             before(grammarAccess.getProcedure_declarationAccess().getBlockBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleblock();

            state._fsp--;

             after(grammarAccess.getProcedure_declarationAccess().getBlockBlockParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Procedure_declaration__BlockAssignment_2"


    // $ANTLR start "rule__Procedure_heading__NameAssignment_1"
    // InternalPascal.g:7156:1: rule__Procedure_heading__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure_heading__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7160:1: ( ( RULE_ID ) )
            // InternalPascal.g:7161:2: ( RULE_ID )
            {
            // InternalPascal.g:7161:2: ( RULE_ID )
            // InternalPascal.g:7162:3: RULE_ID
            {
             before(grammarAccess.getProcedure_headingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcedure_headingAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Procedure_heading__NameAssignment_1"


    // $ANTLR start "rule__Procedure_heading__ParametersAssignment_2"
    // InternalPascal.g:7171:1: rule__Procedure_heading__ParametersAssignment_2 : ( ruleformal_parameter_list ) ;
    public final void rule__Procedure_heading__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7175:1: ( ( ruleformal_parameter_list ) )
            // InternalPascal.g:7176:2: ( ruleformal_parameter_list )
            {
            // InternalPascal.g:7176:2: ( ruleformal_parameter_list )
            // InternalPascal.g:7177:3: ruleformal_parameter_list
            {
             before(grammarAccess.getProcedure_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleformal_parameter_list();

            state._fsp--;

             after(grammarAccess.getProcedure_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Procedure_heading__ParametersAssignment_2"


    // $ANTLR start "rule__Set__BracketsAssignment_0"
    // InternalPascal.g:7186:1: rule__Set__BracketsAssignment_0 : ( ( '[' ) ) ;
    public final void rule__Set__BracketsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7190:1: ( ( ( '[' ) ) )
            // InternalPascal.g:7191:2: ( ( '[' ) )
            {
            // InternalPascal.g:7191:2: ( ( '[' ) )
            // InternalPascal.g:7192:3: ( '[' )
            {
             before(grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0()); 
            // InternalPascal.g:7193:3: ( '[' )
            // InternalPascal.g:7194:4: '['
            {
             before(grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPascal.g:7205:1: rule__Set__ExpressionsAssignment_1 : ( ruleexpression_list ) ;
    public final void rule__Set__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7209:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:7210:2: ( ruleexpression_list )
            {
            // InternalPascal.g:7210:2: ( ruleexpression_list )
            // InternalPascal.g:7211:3: ruleexpression_list
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
    // InternalPascal.g:7220:1: rule__Set__BracketsAssignment_2 : ( ( ']' ) ) ;
    public final void rule__Set__BracketsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7224:1: ( ( ( ']' ) ) )
            // InternalPascal.g:7225:2: ( ( ']' ) )
            {
            // InternalPascal.g:7225:2: ( ( ']' ) )
            // InternalPascal.g:7226:3: ( ']' )
            {
             before(grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0()); 
            // InternalPascal.g:7227:3: ( ']' )
            // InternalPascal.g:7228:4: ']'
            {
             before(grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPascal.g:7239:1: rule__Number__NumberAssignment : ( ruleany_number ) ;
    public final void rule__Number__NumberAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7243:1: ( ( ruleany_number ) )
            // InternalPascal.g:7244:2: ( ruleany_number )
            {
            // InternalPascal.g:7244:2: ( ruleany_number )
            // InternalPascal.g:7245:3: ruleany_number
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


    // $ANTLR start "rule__Label_declaration__LabelsAssignment_1"
    // InternalPascal.g:7254:1: rule__Label_declaration__LabelsAssignment_1 : ( rulelabel ) ;
    public final void rule__Label_declaration__LabelsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7258:1: ( ( rulelabel ) )
            // InternalPascal.g:7259:2: ( rulelabel )
            {
            // InternalPascal.g:7259:2: ( rulelabel )
            // InternalPascal.g:7260:3: rulelabel
            {
             before(grammarAccess.getLabel_declarationAccess().getLabelsLabelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulelabel();

            state._fsp--;

             after(grammarAccess.getLabel_declarationAccess().getLabelsLabelParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Label_declaration__LabelsAssignment_1"


    // $ANTLR start "rule__Label_declaration__LabelsAssignment_2_1"
    // InternalPascal.g:7269:1: rule__Label_declaration__LabelsAssignment_2_1 : ( rulelabel ) ;
    public final void rule__Label_declaration__LabelsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7273:1: ( ( rulelabel ) )
            // InternalPascal.g:7274:2: ( rulelabel )
            {
            // InternalPascal.g:7274:2: ( rulelabel )
            // InternalPascal.g:7275:3: rulelabel
            {
             before(grammarAccess.getLabel_declarationAccess().getLabelsLabelParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulelabel();

            state._fsp--;

             after(grammarAccess.getLabel_declarationAccess().getLabelsLabelParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Label_declaration__LabelsAssignment_2_1"


    // $ANTLR start "rule__Constant__OpteratorAssignment_0_0"
    // InternalPascal.g:7284:1: rule__Constant__OpteratorAssignment_0_0 : ( RULE_ADDITION_OP ) ;
    public final void rule__Constant__OpteratorAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7288:1: ( ( RULE_ADDITION_OP ) )
            // InternalPascal.g:7289:2: ( RULE_ADDITION_OP )
            {
            // InternalPascal.g:7289:2: ( RULE_ADDITION_OP )
            // InternalPascal.g:7290:3: RULE_ADDITION_OP
            {
             before(grammarAccess.getConstantAccess().getOpteratorADDITION_OPTerminalRuleCall_0_0_0()); 
            match(input,RULE_ADDITION_OP,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getOpteratorADDITION_OPTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Constant__OpteratorAssignment_0_0"


    // $ANTLR start "rule__Constant__NameAssignment_0_1_0"
    // InternalPascal.g:7299:1: rule__Constant__NameAssignment_0_1_0 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7303:1: ( ( RULE_ID ) )
            // InternalPascal.g:7304:2: ( RULE_ID )
            {
            // InternalPascal.g:7304:2: ( RULE_ID )
            // InternalPascal.g:7305:3: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0_1_0_0()); 

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
    // $ANTLR end "rule__Constant__NameAssignment_0_1_0"


    // $ANTLR start "rule__Constant__NumberAssignment_0_1_1"
    // InternalPascal.g:7314:1: rule__Constant__NumberAssignment_0_1_1 : ( rulenumber ) ;
    public final void rule__Constant__NumberAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7318:1: ( ( rulenumber ) )
            // InternalPascal.g:7319:2: ( rulenumber )
            {
            // InternalPascal.g:7319:2: ( rulenumber )
            // InternalPascal.g:7320:3: rulenumber
            {
             before(grammarAccess.getConstantAccess().getNumberNumberParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulenumber();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getNumberNumberParserRuleCall_0_1_1_0()); 

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
    // $ANTLR end "rule__Constant__NumberAssignment_0_1_1"


    // $ANTLR start "rule__Constant__StringAssignment_1"
    // InternalPascal.g:7329:1: rule__Constant__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Constant__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7333:1: ( ( RULE_STRING ) )
            // InternalPascal.g:7334:2: ( RULE_STRING )
            {
            // InternalPascal.g:7334:2: ( RULE_STRING )
            // InternalPascal.g:7335:3: RULE_STRING
            {
             before(grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Constant__StringAssignment_1"


    // $ANTLR start "rule__Constant__BoolLiteralAssignment_2"
    // InternalPascal.g:7344:1: rule__Constant__BoolLiteralAssignment_2 : ( ( 'true' ) ) ;
    public final void rule__Constant__BoolLiteralAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7348:1: ( ( ( 'true' ) ) )
            // InternalPascal.g:7349:2: ( ( 'true' ) )
            {
            // InternalPascal.g:7349:2: ( ( 'true' ) )
            // InternalPascal.g:7350:3: ( 'true' )
            {
             before(grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0()); 
            // InternalPascal.g:7351:3: ( 'true' )
            // InternalPascal.g:7352:4: 'true'
            {
             before(grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0()); 

            }

             after(grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0()); 

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
    // $ANTLR end "rule__Constant__BoolLiteralAssignment_2"


    // $ANTLR start "rule__Constant__BoolLiteralAssignment_3"
    // InternalPascal.g:7363:1: rule__Constant__BoolLiteralAssignment_3 : ( ( 'false' ) ) ;
    public final void rule__Constant__BoolLiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7367:1: ( ( ( 'false' ) ) )
            // InternalPascal.g:7368:2: ( ( 'false' ) )
            {
            // InternalPascal.g:7368:2: ( ( 'false' ) )
            // InternalPascal.g:7369:3: ( 'false' )
            {
             before(grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0()); 
            // InternalPascal.g:7370:3: ( 'false' )
            // InternalPascal.g:7371:4: 'false'
            {
             before(grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0()); 

            }

             after(grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0()); 

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
    // $ANTLR end "rule__Constant__BoolLiteralAssignment_3"


    // $ANTLR start "rule__Constant_definition_part__ConstsAssignment_1_0"
    // InternalPascal.g:7382:1: rule__Constant_definition_part__ConstsAssignment_1_0 : ( ruleconstant_definition ) ;
    public final void rule__Constant_definition_part__ConstsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7386:1: ( ( ruleconstant_definition ) )
            // InternalPascal.g:7387:2: ( ruleconstant_definition )
            {
            // InternalPascal.g:7387:2: ( ruleconstant_definition )
            // InternalPascal.g:7388:3: ruleconstant_definition
            {
             before(grammarAccess.getConstant_definition_partAccess().getConstsConstant_definitionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleconstant_definition();

            state._fsp--;

             after(grammarAccess.getConstant_definition_partAccess().getConstsConstant_definitionParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Constant_definition_part__ConstsAssignment_1_0"


    // $ANTLR start "rule__Constant_definition__NameAssignment_0"
    // InternalPascal.g:7397:1: rule__Constant_definition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constant_definition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7401:1: ( ( RULE_ID ) )
            // InternalPascal.g:7402:2: ( RULE_ID )
            {
            // InternalPascal.g:7402:2: ( RULE_ID )
            // InternalPascal.g:7403:3: RULE_ID
            {
             before(grammarAccess.getConstant_definitionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstant_definitionAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Constant_definition__NameAssignment_0"


    // $ANTLR start "rule__Constant_definition__ConstAssignment_2"
    // InternalPascal.g:7412:1: rule__Constant_definition__ConstAssignment_2 : ( ruleconstant ) ;
    public final void rule__Constant_definition__ConstAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7416:1: ( ( ruleconstant ) )
            // InternalPascal.g:7417:2: ( ruleconstant )
            {
            // InternalPascal.g:7417:2: ( ruleconstant )
            // InternalPascal.g:7418:3: ruleconstant
            {
             before(grammarAccess.getConstant_definitionAccess().getConstConstantParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getConstant_definitionAccess().getConstConstantParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Constant_definition__ConstAssignment_2"


    // $ANTLR start "rule__Type_definition_part__TypesAssignment_1_0"
    // InternalPascal.g:7427:1: rule__Type_definition_part__TypesAssignment_1_0 : ( ruletype_definition ) ;
    public final void rule__Type_definition_part__TypesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7431:1: ( ( ruletype_definition ) )
            // InternalPascal.g:7432:2: ( ruletype_definition )
            {
            // InternalPascal.g:7432:2: ( ruletype_definition )
            // InternalPascal.g:7433:3: ruletype_definition
            {
             before(grammarAccess.getType_definition_partAccess().getTypesType_definitionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruletype_definition();

            state._fsp--;

             after(grammarAccess.getType_definition_partAccess().getTypesType_definitionParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Type_definition_part__TypesAssignment_1_0"


    // $ANTLR start "rule__Type_definition__NameAssignment_0"
    // InternalPascal.g:7442:1: rule__Type_definition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Type_definition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7446:1: ( ( RULE_ID ) )
            // InternalPascal.g:7447:2: ( RULE_ID )
            {
            // InternalPascal.g:7447:2: ( RULE_ID )
            // InternalPascal.g:7448:3: RULE_ID
            {
             before(grammarAccess.getType_definitionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getType_definitionAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Type_definition__NameAssignment_0"


    // $ANTLR start "rule__Type_definition__TypeAssignment_2"
    // InternalPascal.g:7457:1: rule__Type_definition__TypeAssignment_2 : ( ruletype ) ;
    public final void rule__Type_definition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7461:1: ( ( ruletype ) )
            // InternalPascal.g:7462:2: ( ruletype )
            {
            // InternalPascal.g:7462:2: ( ruletype )
            // InternalPascal.g:7463:3: ruletype
            {
             before(grammarAccess.getType_definitionAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;

             after(grammarAccess.getType_definitionAccess().getTypeTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Type_definition__TypeAssignment_2"


    // $ANTLR start "rule__Type__SimpleAssignment_0"
    // InternalPascal.g:7472:1: rule__Type__SimpleAssignment_0 : ( rulesimple_type ) ;
    public final void rule__Type__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7476:1: ( ( rulesimple_type ) )
            // InternalPascal.g:7477:2: ( rulesimple_type )
            {
            // InternalPascal.g:7477:2: ( rulesimple_type )
            // InternalPascal.g:7478:3: rulesimple_type
            {
             before(grammarAccess.getTypeAccess().getSimpleSimple_typeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulesimple_type();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getSimpleSimple_typeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Type__SimpleAssignment_0"


    // $ANTLR start "rule__Type__StructuredAssignment_1"
    // InternalPascal.g:7487:1: rule__Type__StructuredAssignment_1 : ( rulestrutured_type ) ;
    public final void rule__Type__StructuredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7491:1: ( ( rulestrutured_type ) )
            // InternalPascal.g:7492:2: ( rulestrutured_type )
            {
            // InternalPascal.g:7492:2: ( rulestrutured_type )
            // InternalPascal.g:7493:3: rulestrutured_type
            {
             before(grammarAccess.getTypeAccess().getStructuredStrutured_typeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulestrutured_type();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getStructuredStrutured_typeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Type__StructuredAssignment_1"


    // $ANTLR start "rule__Type__PointerAssignment_2"
    // InternalPascal.g:7502:1: rule__Type__PointerAssignment_2 : ( rulepointer_type ) ;
    public final void rule__Type__PointerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7506:1: ( ( rulepointer_type ) )
            // InternalPascal.g:7507:2: ( rulepointer_type )
            {
            // InternalPascal.g:7507:2: ( rulepointer_type )
            // InternalPascal.g:7508:3: rulepointer_type
            {
             before(grammarAccess.getTypeAccess().getPointerPointer_typeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulepointer_type();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getPointerPointer_typeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Type__PointerAssignment_2"


    // $ANTLR start "rule__Simple_type__SubrangeAssignment_0"
    // InternalPascal.g:7517:1: rule__Simple_type__SubrangeAssignment_0 : ( rulesubrange_type ) ;
    public final void rule__Simple_type__SubrangeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7521:1: ( ( rulesubrange_type ) )
            // InternalPascal.g:7522:2: ( rulesubrange_type )
            {
            // InternalPascal.g:7522:2: ( rulesubrange_type )
            // InternalPascal.g:7523:3: rulesubrange_type
            {
             before(grammarAccess.getSimple_typeAccess().getSubrangeSubrange_typeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulesubrange_type();

            state._fsp--;

             after(grammarAccess.getSimple_typeAccess().getSubrangeSubrange_typeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Simple_type__SubrangeAssignment_0"


    // $ANTLR start "rule__Simple_type__EnumeratedAssignment_1"
    // InternalPascal.g:7532:1: rule__Simple_type__EnumeratedAssignment_1 : ( ruleenumerated_type ) ;
    public final void rule__Simple_type__EnumeratedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7536:1: ( ( ruleenumerated_type ) )
            // InternalPascal.g:7537:2: ( ruleenumerated_type )
            {
            // InternalPascal.g:7537:2: ( ruleenumerated_type )
            // InternalPascal.g:7538:3: ruleenumerated_type
            {
             before(grammarAccess.getSimple_typeAccess().getEnumeratedEnumerated_typeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleenumerated_type();

            state._fsp--;

             after(grammarAccess.getSimple_typeAccess().getEnumeratedEnumerated_typeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Simple_type__EnumeratedAssignment_1"


    // $ANTLR start "rule__Simple_type__NameAssignment_2"
    // InternalPascal.g:7547:1: rule__Simple_type__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Simple_type__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7551:1: ( ( RULE_ID ) )
            // InternalPascal.g:7552:2: ( RULE_ID )
            {
            // InternalPascal.g:7552:2: ( RULE_ID )
            // InternalPascal.g:7553:3: RULE_ID
            {
             before(grammarAccess.getSimple_typeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimple_typeAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Simple_type__NameAssignment_2"


    // $ANTLR start "rule__Subrange_type__InitialConstAssignment_0_0"
    // InternalPascal.g:7562:1: rule__Subrange_type__InitialConstAssignment_0_0 : ( ruleconstant ) ;
    public final void rule__Subrange_type__InitialConstAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7566:1: ( ( ruleconstant ) )
            // InternalPascal.g:7567:2: ( ruleconstant )
            {
            // InternalPascal.g:7567:2: ( ruleconstant )
            // InternalPascal.g:7568:3: ruleconstant
            {
             before(grammarAccess.getSubrange_typeAccess().getInitialConstConstantParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getSubrange_typeAccess().getInitialConstConstantParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Subrange_type__InitialConstAssignment_0_0"


    // $ANTLR start "rule__Subrange_type__FinalConstAssignment_0_2"
    // InternalPascal.g:7577:1: rule__Subrange_type__FinalConstAssignment_0_2 : ( ruleconstant ) ;
    public final void rule__Subrange_type__FinalConstAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7581:1: ( ( ruleconstant ) )
            // InternalPascal.g:7582:2: ( ruleconstant )
            {
            // InternalPascal.g:7582:2: ( ruleconstant )
            // InternalPascal.g:7583:3: ruleconstant
            {
             before(grammarAccess.getSubrange_typeAccess().getFinalConstConstantParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getSubrange_typeAccess().getFinalConstConstantParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Subrange_type__FinalConstAssignment_0_2"


    // $ANTLR start "rule__Subrange_type__SubrangeAssignment_1_0"
    // InternalPascal.g:7592:1: rule__Subrange_type__SubrangeAssignment_1_0 : ( RULE_NUMERIC_SUBRANGE ) ;
    public final void rule__Subrange_type__SubrangeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7596:1: ( ( RULE_NUMERIC_SUBRANGE ) )
            // InternalPascal.g:7597:2: ( RULE_NUMERIC_SUBRANGE )
            {
            // InternalPascal.g:7597:2: ( RULE_NUMERIC_SUBRANGE )
            // InternalPascal.g:7598:3: RULE_NUMERIC_SUBRANGE
            {
             before(grammarAccess.getSubrange_typeAccess().getSubrangeNUMERIC_SUBRANGETerminalRuleCall_1_0_0()); 
            match(input,RULE_NUMERIC_SUBRANGE,FOLLOW_2); 
             after(grammarAccess.getSubrange_typeAccess().getSubrangeNUMERIC_SUBRANGETerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Subrange_type__SubrangeAssignment_1_0"


    // $ANTLR start "rule__Subrange_type__ConstAssignment_1_1"
    // InternalPascal.g:7607:1: rule__Subrange_type__ConstAssignment_1_1 : ( ruleconstant ) ;
    public final void rule__Subrange_type__ConstAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7611:1: ( ( ruleconstant ) )
            // InternalPascal.g:7612:2: ( ruleconstant )
            {
            // InternalPascal.g:7612:2: ( ruleconstant )
            // InternalPascal.g:7613:3: ruleconstant
            {
             before(grammarAccess.getSubrange_typeAccess().getConstConstantParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getSubrange_typeAccess().getConstConstantParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Subrange_type__ConstAssignment_1_1"


    // $ANTLR start "rule__Enumerated_type__IdentifiersAssignment_1"
    // InternalPascal.g:7622:1: rule__Enumerated_type__IdentifiersAssignment_1 : ( ruleidentifier_list ) ;
    public final void rule__Enumerated_type__IdentifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7626:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:7627:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:7627:2: ( ruleidentifier_list )
            // InternalPascal.g:7628:3: ruleidentifier_list
            {
             before(grammarAccess.getEnumerated_typeAccess().getIdentifiersIdentifier_listParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getEnumerated_typeAccess().getIdentifiersIdentifier_listParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Enumerated_type__IdentifiersAssignment_1"


    // $ANTLR start "rule__Strutured_type__PackedAssignment_0"
    // InternalPascal.g:7637:1: rule__Strutured_type__PackedAssignment_0 : ( ( 'packed' ) ) ;
    public final void rule__Strutured_type__PackedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7641:1: ( ( ( 'packed' ) ) )
            // InternalPascal.g:7642:2: ( ( 'packed' ) )
            {
            // InternalPascal.g:7642:2: ( ( 'packed' ) )
            // InternalPascal.g:7643:3: ( 'packed' )
            {
             before(grammarAccess.getStrutured_typeAccess().getPackedPackedKeyword_0_0()); 
            // InternalPascal.g:7644:3: ( 'packed' )
            // InternalPascal.g:7645:4: 'packed'
            {
             before(grammarAccess.getStrutured_typeAccess().getPackedPackedKeyword_0_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getStrutured_typeAccess().getPackedPackedKeyword_0_0()); 

            }

             after(grammarAccess.getStrutured_typeAccess().getPackedPackedKeyword_0_0()); 

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
    // $ANTLR end "rule__Strutured_type__PackedAssignment_0"


    // $ANTLR start "rule__Strutured_type__TypeAssignment_1"
    // InternalPascal.g:7656:1: rule__Strutured_type__TypeAssignment_1 : ( ruleunpacked_strutured_type ) ;
    public final void rule__Strutured_type__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7660:1: ( ( ruleunpacked_strutured_type ) )
            // InternalPascal.g:7661:2: ( ruleunpacked_strutured_type )
            {
            // InternalPascal.g:7661:2: ( ruleunpacked_strutured_type )
            // InternalPascal.g:7662:3: ruleunpacked_strutured_type
            {
             before(grammarAccess.getStrutured_typeAccess().getTypeUnpacked_strutured_typeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleunpacked_strutured_type();

            state._fsp--;

             after(grammarAccess.getStrutured_typeAccess().getTypeUnpacked_strutured_typeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Strutured_type__TypeAssignment_1"


    // $ANTLR start "rule__Unpacked_strutured_type__SetAssignment"
    // InternalPascal.g:7671:1: rule__Unpacked_strutured_type__SetAssignment : ( ruleset_type ) ;
    public final void rule__Unpacked_strutured_type__SetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7675:1: ( ( ruleset_type ) )
            // InternalPascal.g:7676:2: ( ruleset_type )
            {
            // InternalPascal.g:7676:2: ( ruleset_type )
            // InternalPascal.g:7677:3: ruleset_type
            {
             before(grammarAccess.getUnpacked_strutured_typeAccess().getSetSet_typeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleset_type();

            state._fsp--;

             after(grammarAccess.getUnpacked_strutured_typeAccess().getSetSet_typeParserRuleCall_0()); 

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
    // $ANTLR end "rule__Unpacked_strutured_type__SetAssignment"


    // $ANTLR start "rule__Set_type__TypeAssignment_2"
    // InternalPascal.g:7686:1: rule__Set_type__TypeAssignment_2 : ( ruletype ) ;
    public final void rule__Set_type__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7690:1: ( ( ruletype ) )
            // InternalPascal.g:7691:2: ( ruletype )
            {
            // InternalPascal.g:7691:2: ( ruletype )
            // InternalPascal.g:7692:3: ruletype
            {
             before(grammarAccess.getSet_typeAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;

             after(grammarAccess.getSet_typeAccess().getTypeTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Set_type__TypeAssignment_2"


    // $ANTLR start "rule__Pointer_type__TypeAssignment_1"
    // InternalPascal.g:7701:1: rule__Pointer_type__TypeAssignment_1 : ( ruletype ) ;
    public final void rule__Pointer_type__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7705:1: ( ( ruletype ) )
            // InternalPascal.g:7706:2: ( ruletype )
            {
            // InternalPascal.g:7706:2: ( ruletype )
            // InternalPascal.g:7707:3: ruletype
            {
             before(grammarAccess.getPointer_typeAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;

             after(grammarAccess.getPointer_typeAccess().getTypeTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Pointer_type__TypeAssignment_1"


    // $ANTLR start "rule__Signed_number__IntegerAssignment_0"
    // InternalPascal.g:7716:1: rule__Signed_number__IntegerAssignment_0 : ( RULE_SIGNED_INTEGER_NUMBER ) ;
    public final void rule__Signed_number__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7720:1: ( ( RULE_SIGNED_INTEGER_NUMBER ) )
            // InternalPascal.g:7721:2: ( RULE_SIGNED_INTEGER_NUMBER )
            {
            // InternalPascal.g:7721:2: ( RULE_SIGNED_INTEGER_NUMBER )
            // InternalPascal.g:7722:3: RULE_SIGNED_INTEGER_NUMBER
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
    // InternalPascal.g:7731:1: rule__Signed_number__RealAssignment_1 : ( RULE_SIGNED_REAL_NUMBER ) ;
    public final void rule__Signed_number__RealAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7735:1: ( ( RULE_SIGNED_REAL_NUMBER ) )
            // InternalPascal.g:7736:2: ( RULE_SIGNED_REAL_NUMBER )
            {
            // InternalPascal.g:7736:2: ( RULE_SIGNED_REAL_NUMBER )
            // InternalPascal.g:7737:3: RULE_SIGNED_REAL_NUMBER
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
    // InternalPascal.g:7746:1: rule__Unsigned_number__IntegerAssignment_0 : ( RULE_INTEGER_NUMBER ) ;
    public final void rule__Unsigned_number__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7750:1: ( ( RULE_INTEGER_NUMBER ) )
            // InternalPascal.g:7751:2: ( RULE_INTEGER_NUMBER )
            {
            // InternalPascal.g:7751:2: ( RULE_INTEGER_NUMBER )
            // InternalPascal.g:7752:3: RULE_INTEGER_NUMBER
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
    // InternalPascal.g:7761:1: rule__Unsigned_number__RealAssignment_1 : ( RULE_REAL_NUMBER ) ;
    public final void rule__Unsigned_number__RealAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7765:1: ( ( RULE_REAL_NUMBER ) )
            // InternalPascal.g:7766:2: ( RULE_REAL_NUMBER )
            {
            // InternalPascal.g:7766:2: ( RULE_REAL_NUMBER )
            // InternalPascal.g:7767:3: RULE_REAL_NUMBER
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


    // $ANTLR start "rule__Variable_declaration_part__SectionsAssignment_1"
    // InternalPascal.g:7776:1: rule__Variable_declaration_part__SectionsAssignment_1 : ( rulevariable_section ) ;
    public final void rule__Variable_declaration_part__SectionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7780:1: ( ( rulevariable_section ) )
            // InternalPascal.g:7781:2: ( rulevariable_section )
            {
            // InternalPascal.g:7781:2: ( rulevariable_section )
            // InternalPascal.g:7782:3: rulevariable_section
            {
             before(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulevariable_section();

            state._fsp--;

             after(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Variable_declaration_part__SectionsAssignment_1"


    // $ANTLR start "rule__Variable_declaration_part__SectionsAssignment_3_0"
    // InternalPascal.g:7791:1: rule__Variable_declaration_part__SectionsAssignment_3_0 : ( rulevariable_section ) ;
    public final void rule__Variable_declaration_part__SectionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7795:1: ( ( rulevariable_section ) )
            // InternalPascal.g:7796:2: ( rulevariable_section )
            {
            // InternalPascal.g:7796:2: ( rulevariable_section )
            // InternalPascal.g:7797:3: rulevariable_section
            {
             before(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            rulevariable_section();

            state._fsp--;

             after(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Variable_declaration_part__SectionsAssignment_3_0"


    // $ANTLR start "rule__Variable_section__IdentifiersAssignment_0"
    // InternalPascal.g:7806:1: rule__Variable_section__IdentifiersAssignment_0 : ( rulevariable_identifier_list ) ;
    public final void rule__Variable_section__IdentifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7810:1: ( ( rulevariable_identifier_list ) )
            // InternalPascal.g:7811:2: ( rulevariable_identifier_list )
            {
            // InternalPascal.g:7811:2: ( rulevariable_identifier_list )
            // InternalPascal.g:7812:3: rulevariable_identifier_list
            {
             before(grammarAccess.getVariable_sectionAccess().getIdentifiersVariable_identifier_listParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulevariable_identifier_list();

            state._fsp--;

             after(grammarAccess.getVariable_sectionAccess().getIdentifiersVariable_identifier_listParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Variable_section__IdentifiersAssignment_0"


    // $ANTLR start "rule__Variable_section__TypeAssignment_2"
    // InternalPascal.g:7821:1: rule__Variable_section__TypeAssignment_2 : ( ruletype ) ;
    public final void rule__Variable_section__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7825:1: ( ( ruletype ) )
            // InternalPascal.g:7826:2: ( ruletype )
            {
            // InternalPascal.g:7826:2: ( ruletype )
            // InternalPascal.g:7827:3: ruletype
            {
             before(grammarAccess.getVariable_sectionAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;

             after(grammarAccess.getVariable_sectionAccess().getTypeTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Variable_section__TypeAssignment_2"


    // $ANTLR start "rule__Variable_identifier_list__NamesAssignment_0"
    // InternalPascal.g:7836:1: rule__Variable_identifier_list__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable_identifier_list__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7840:1: ( ( RULE_ID ) )
            // InternalPascal.g:7841:2: ( RULE_ID )
            {
            // InternalPascal.g:7841:2: ( RULE_ID )
            // InternalPascal.g:7842:3: RULE_ID
            {
             before(grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Variable_identifier_list__NamesAssignment_0"


    // $ANTLR start "rule__Variable_identifier_list__NamesAssignment_1_1"
    // InternalPascal.g:7851:1: rule__Variable_identifier_list__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Variable_identifier_list__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7855:1: ( ( RULE_ID ) )
            // InternalPascal.g:7856:2: ( RULE_ID )
            {
            // InternalPascal.g:7856:2: ( RULE_ID )
            // InternalPascal.g:7857:3: RULE_ID
            {
             before(grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Variable_identifier_list__NamesAssignment_1_1"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\12\12\uffff";
    static final String dfa_3s = "\1\4\1\6\12\uffff";
    static final String dfa_4s = "\1\65\1\62\12\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\1\1\10";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\3\uffff\1\3\1\uffff\2\2\17\uffff\1\4\3\uffff\1\10\1\uffff\1\11\17\uffff\1\5\1\6\1\7",
            "\4\12\3\uffff\1\12\10\uffff\1\12\1\uffff\1\12\1\uffff\1\12\2\uffff\4\12\1\13\1\12\6\uffff\1\12\4\uffff\5\12",
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

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1519:1: rule__Factor__Alternatives : ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__FunctionAssignment_7 ) ) | ( ( rule__Factor__Group_8__0 ) ) | ( ( rule__Factor__Group_9__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000005000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000005F002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0038000A20003570L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000A0400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000420000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000800000002140L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000800000002142L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0007000000000200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0007000000000202L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0038000E20003570L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000007000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0038000A60003570L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000003070L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0030000000003570L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0070100280003D70L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});

}