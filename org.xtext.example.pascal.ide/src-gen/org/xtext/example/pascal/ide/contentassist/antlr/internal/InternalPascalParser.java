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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SIGNED_INTEGER_NUMBER", "RULE_INTEGER_NUMBER", "RULE_RELATIONAL_OP", "RULE_ADDITION_OP", "RULE_MULTIPLICATION_OP", "RULE_STRING", "RULE_SIGNED_REAL_NUMBER", "RULE_REAL_NUMBER", "RULE_PARENTHESES_COMMENT", "RULE_CURLY_BRACKETS_COMMENT", "RULE_NUMERIC_SUBRANGE", "RULE_DIGIT_SEQUENCE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "';'", "'begin'", "'end'", "':'", "':='", "'['", "']'", "'^'", "','", "'('", "')'", "'not'", "'function'", "'var'", "'procedure'", "'in'", "'='", "'or'", "'div'", "'mod'", "'and'", "'nil'", "'true'", "'false'"
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


    // $ANTLR start "entryRulesigned_number"
    // InternalPascal.g:860:1: entryRulesigned_number : rulesigned_number EOF ;
    public final void entryRulesigned_number() throws RecognitionException {
        try {
            // InternalPascal.g:861:1: ( rulesigned_number EOF )
            // InternalPascal.g:862:1: rulesigned_number EOF
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
    // InternalPascal.g:869:1: rulesigned_number : ( ( rule__Signed_number__Alternatives ) ) ;
    public final void rulesigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:873:2: ( ( ( rule__Signed_number__Alternatives ) ) )
            // InternalPascal.g:874:2: ( ( rule__Signed_number__Alternatives ) )
            {
            // InternalPascal.g:874:2: ( ( rule__Signed_number__Alternatives ) )
            // InternalPascal.g:875:3: ( rule__Signed_number__Alternatives )
            {
             before(grammarAccess.getSigned_numberAccess().getAlternatives()); 
            // InternalPascal.g:876:3: ( rule__Signed_number__Alternatives )
            // InternalPascal.g:876:4: rule__Signed_number__Alternatives
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
    // InternalPascal.g:885:1: entryRuleunsigned_number : ruleunsigned_number EOF ;
    public final void entryRuleunsigned_number() throws RecognitionException {
        try {
            // InternalPascal.g:886:1: ( ruleunsigned_number EOF )
            // InternalPascal.g:887:1: ruleunsigned_number EOF
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
    // InternalPascal.g:894:1: ruleunsigned_number : ( ( rule__Unsigned_number__Alternatives ) ) ;
    public final void ruleunsigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:898:2: ( ( ( rule__Unsigned_number__Alternatives ) ) )
            // InternalPascal.g:899:2: ( ( rule__Unsigned_number__Alternatives ) )
            {
            // InternalPascal.g:899:2: ( ( rule__Unsigned_number__Alternatives ) )
            // InternalPascal.g:900:3: ( rule__Unsigned_number__Alternatives )
            {
             before(grammarAccess.getUnsigned_numberAccess().getAlternatives()); 
            // InternalPascal.g:901:3: ( rule__Unsigned_number__Alternatives )
            // InternalPascal.g:901:4: rule__Unsigned_number__Alternatives
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


    // $ANTLR start "rule__Simple_statement__Alternatives"
    // InternalPascal.g:909:1: rule__Simple_statement__Alternatives : ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__FunctionAssignment_1 ) ) | ( ( rule__Simple_statement__Function_noargsAssignment_2 ) ) );
    public final void rule__Simple_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:913:1: ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__FunctionAssignment_1 ) ) | ( ( rule__Simple_statement__Function_noargsAssignment_2 ) ) )
            int alt4=3;
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
                case 33:
                    {
                    alt4=2;
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
                    // InternalPascal.g:914:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    {
                    // InternalPascal.g:914:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    // InternalPascal.g:915:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    {
                     before(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_0()); 
                    // InternalPascal.g:916:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    // InternalPascal.g:916:4: rule__Simple_statement__AssignmentAssignment_0
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
                    // InternalPascal.g:920:2: ( ( rule__Simple_statement__FunctionAssignment_1 ) )
                    {
                    // InternalPascal.g:920:2: ( ( rule__Simple_statement__FunctionAssignment_1 ) )
                    // InternalPascal.g:921:3: ( rule__Simple_statement__FunctionAssignment_1 )
                    {
                     before(grammarAccess.getSimple_statementAccess().getFunctionAssignment_1()); 
                    // InternalPascal.g:922:3: ( rule__Simple_statement__FunctionAssignment_1 )
                    // InternalPascal.g:922:4: rule__Simple_statement__FunctionAssignment_1
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
                    // InternalPascal.g:926:2: ( ( rule__Simple_statement__Function_noargsAssignment_2 ) )
                    {
                    // InternalPascal.g:926:2: ( ( rule__Simple_statement__Function_noargsAssignment_2 ) )
                    // InternalPascal.g:927:3: ( rule__Simple_statement__Function_noargsAssignment_2 )
                    {
                     before(grammarAccess.getSimple_statementAccess().getFunction_noargsAssignment_2()); 
                    // InternalPascal.g:928:3: ( rule__Simple_statement__Function_noargsAssignment_2 )
                    // InternalPascal.g:928:4: rule__Simple_statement__Function_noargsAssignment_2
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
    // InternalPascal.g:936:1: rule__Label__Alternatives : ( ( ( rule__Label__NumberAssignment_0 ) ) | ( ( rule__Label__NumberAssignment_1 ) ) );
    public final void rule__Label__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:940:1: ( ( ( rule__Label__NumberAssignment_0 ) ) | ( ( rule__Label__NumberAssignment_1 ) ) )
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
                    // InternalPascal.g:941:2: ( ( rule__Label__NumberAssignment_0 ) )
                    {
                    // InternalPascal.g:941:2: ( ( rule__Label__NumberAssignment_0 ) )
                    // InternalPascal.g:942:3: ( rule__Label__NumberAssignment_0 )
                    {
                     before(grammarAccess.getLabelAccess().getNumberAssignment_0()); 
                    // InternalPascal.g:943:3: ( rule__Label__NumberAssignment_0 )
                    // InternalPascal.g:943:4: rule__Label__NumberAssignment_0
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
                    // InternalPascal.g:947:2: ( ( rule__Label__NumberAssignment_1 ) )
                    {
                    // InternalPascal.g:947:2: ( ( rule__Label__NumberAssignment_1 ) )
                    // InternalPascal.g:948:3: ( rule__Label__NumberAssignment_1 )
                    {
                     before(grammarAccess.getLabelAccess().getNumberAssignment_1()); 
                    // InternalPascal.g:949:3: ( rule__Label__NumberAssignment_1 )
                    // InternalPascal.g:949:4: rule__Label__NumberAssignment_1
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
    // InternalPascal.g:957:1: rule__Var___Alternatives : ( ( ( rule__Var___Group_0__0 ) ) | ( ( rule__Var___Group_1__0 ) ) | ( ( rule__Var___Group_2__0 ) ) );
    public final void rule__Var___Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:961:1: ( ( ( rule__Var___Group_0__0 ) ) | ( ( rule__Var___Group_1__0 ) ) | ( ( rule__Var___Group_2__0 ) ) )
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
                    // InternalPascal.g:962:2: ( ( rule__Var___Group_0__0 ) )
                    {
                    // InternalPascal.g:962:2: ( ( rule__Var___Group_0__0 ) )
                    // InternalPascal.g:963:3: ( rule__Var___Group_0__0 )
                    {
                     before(grammarAccess.getVar_Access().getGroup_0()); 
                    // InternalPascal.g:964:3: ( rule__Var___Group_0__0 )
                    // InternalPascal.g:964:4: rule__Var___Group_0__0
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
                    // InternalPascal.g:968:2: ( ( rule__Var___Group_1__0 ) )
                    {
                    // InternalPascal.g:968:2: ( ( rule__Var___Group_1__0 ) )
                    // InternalPascal.g:969:3: ( rule__Var___Group_1__0 )
                    {
                     before(grammarAccess.getVar_Access().getGroup_1()); 
                    // InternalPascal.g:970:3: ( rule__Var___Group_1__0 )
                    // InternalPascal.g:970:4: rule__Var___Group_1__0
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
                    // InternalPascal.g:974:2: ( ( rule__Var___Group_2__0 ) )
                    {
                    // InternalPascal.g:974:2: ( ( rule__Var___Group_2__0 ) )
                    // InternalPascal.g:975:3: ( rule__Var___Group_2__0 )
                    {
                     before(grammarAccess.getVar_Access().getGroup_2()); 
                    // InternalPascal.g:976:3: ( rule__Var___Group_2__0 )
                    // InternalPascal.g:976:4: rule__Var___Group_2__0
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
    // InternalPascal.g:984:1: rule__Expression__Alternatives_1_0 : ( ( ( rule__Expression__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_2 ) ) );
    public final void rule__Expression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:988:1: ( ( ( rule__Expression__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_2 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_RELATIONAL_OP:
                {
                alt7=1;
                }
                break;
            case 39:
                {
                alt7=2;
                }
                break;
            case 40:
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
                    // InternalPascal.g:989:2: ( ( rule__Expression__OperatorsAssignment_1_0_0 ) )
                    {
                    // InternalPascal.g:989:2: ( ( rule__Expression__OperatorsAssignment_1_0_0 ) )
                    // InternalPascal.g:990:3: ( rule__Expression__OperatorsAssignment_1_0_0 )
                    {
                     before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_0()); 
                    // InternalPascal.g:991:3: ( rule__Expression__OperatorsAssignment_1_0_0 )
                    // InternalPascal.g:991:4: rule__Expression__OperatorsAssignment_1_0_0
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
                    // InternalPascal.g:995:2: ( ( rule__Expression__OperatorsAssignment_1_0_1 ) )
                    {
                    // InternalPascal.g:995:2: ( ( rule__Expression__OperatorsAssignment_1_0_1 ) )
                    // InternalPascal.g:996:3: ( rule__Expression__OperatorsAssignment_1_0_1 )
                    {
                     before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_1()); 
                    // InternalPascal.g:997:3: ( rule__Expression__OperatorsAssignment_1_0_1 )
                    // InternalPascal.g:997:4: rule__Expression__OperatorsAssignment_1_0_1
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
                    // InternalPascal.g:1001:2: ( ( rule__Expression__OperatorsAssignment_1_0_2 ) )
                    {
                    // InternalPascal.g:1001:2: ( ( rule__Expression__OperatorsAssignment_1_0_2 ) )
                    // InternalPascal.g:1002:3: ( rule__Expression__OperatorsAssignment_1_0_2 )
                    {
                     before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_2()); 
                    // InternalPascal.g:1003:3: ( rule__Expression__OperatorsAssignment_1_0_2 )
                    // InternalPascal.g:1003:4: rule__Expression__OperatorsAssignment_1_0_2
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
    // InternalPascal.g:1011:1: rule__Simple_expression__Alternatives_2 : ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( ( rule__Simple_expression__TermsAssignment_2_1 ) ) );
    public final void rule__Simple_expression__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1015:1: ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( ( rule__Simple_expression__TermsAssignment_2_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ADDITION_OP||LA8_0==41) ) {
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
                    // InternalPascal.g:1016:2: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    {
                    // InternalPascal.g:1016:2: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    // InternalPascal.g:1017:3: ( rule__Simple_expression__Group_2_0__0 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getGroup_2_0()); 
                    // InternalPascal.g:1018:3: ( rule__Simple_expression__Group_2_0__0 )
                    // InternalPascal.g:1018:4: rule__Simple_expression__Group_2_0__0
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
                    // InternalPascal.g:1022:2: ( ( rule__Simple_expression__TermsAssignment_2_1 ) )
                    {
                    // InternalPascal.g:1022:2: ( ( rule__Simple_expression__TermsAssignment_2_1 ) )
                    // InternalPascal.g:1023:3: ( rule__Simple_expression__TermsAssignment_2_1 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_1()); 
                    // InternalPascal.g:1024:3: ( rule__Simple_expression__TermsAssignment_2_1 )
                    // InternalPascal.g:1024:4: rule__Simple_expression__TermsAssignment_2_1
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
    // InternalPascal.g:1032:1: rule__Simple_expression__Alternatives_2_0_0 : ( ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) ) | ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) ) );
    public final void rule__Simple_expression__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1036:1: ( ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) ) | ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ADDITION_OP) ) {
                alt9=1;
            }
            else if ( (LA9_0==41) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:1037:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) )
                    {
                    // InternalPascal.g:1037:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) )
                    // InternalPascal.g:1038:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_0()); 
                    // InternalPascal.g:1039:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 )
                    // InternalPascal.g:1039:4: rule__Simple_expression__OperatorsAssignment_2_0_0_0
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
                    // InternalPascal.g:1043:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) )
                    {
                    // InternalPascal.g:1043:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) )
                    // InternalPascal.g:1044:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_1()); 
                    // InternalPascal.g:1045:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 )
                    // InternalPascal.g:1045:4: rule__Simple_expression__OperatorsAssignment_2_0_0_1
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
    // InternalPascal.g:1053:1: rule__Term__Alternatives_1_0 : ( ( ( rule__Term__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_2 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_3 ) ) );
    public final void rule__Term__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1057:1: ( ( ( rule__Term__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_2 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_3 ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_MULTIPLICATION_OP:
                {
                alt10=1;
                }
                break;
            case 42:
                {
                alt10=2;
                }
                break;
            case 43:
                {
                alt10=3;
                }
                break;
            case 44:
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
                    // InternalPascal.g:1058:2: ( ( rule__Term__OperatorsAssignment_1_0_0 ) )
                    {
                    // InternalPascal.g:1058:2: ( ( rule__Term__OperatorsAssignment_1_0_0 ) )
                    // InternalPascal.g:1059:3: ( rule__Term__OperatorsAssignment_1_0_0 )
                    {
                     before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_0()); 
                    // InternalPascal.g:1060:3: ( rule__Term__OperatorsAssignment_1_0_0 )
                    // InternalPascal.g:1060:4: rule__Term__OperatorsAssignment_1_0_0
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
                    // InternalPascal.g:1064:2: ( ( rule__Term__OperatorsAssignment_1_0_1 ) )
                    {
                    // InternalPascal.g:1064:2: ( ( rule__Term__OperatorsAssignment_1_0_1 ) )
                    // InternalPascal.g:1065:3: ( rule__Term__OperatorsAssignment_1_0_1 )
                    {
                     before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_1()); 
                    // InternalPascal.g:1066:3: ( rule__Term__OperatorsAssignment_1_0_1 )
                    // InternalPascal.g:1066:4: rule__Term__OperatorsAssignment_1_0_1
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
                    // InternalPascal.g:1070:2: ( ( rule__Term__OperatorsAssignment_1_0_2 ) )
                    {
                    // InternalPascal.g:1070:2: ( ( rule__Term__OperatorsAssignment_1_0_2 ) )
                    // InternalPascal.g:1071:3: ( rule__Term__OperatorsAssignment_1_0_2 )
                    {
                     before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_2()); 
                    // InternalPascal.g:1072:3: ( rule__Term__OperatorsAssignment_1_0_2 )
                    // InternalPascal.g:1072:4: rule__Term__OperatorsAssignment_1_0_2
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
                    // InternalPascal.g:1076:2: ( ( rule__Term__OperatorsAssignment_1_0_3 ) )
                    {
                    // InternalPascal.g:1076:2: ( ( rule__Term__OperatorsAssignment_1_0_3 ) )
                    // InternalPascal.g:1077:3: ( rule__Term__OperatorsAssignment_1_0_3 )
                    {
                     before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_3()); 
                    // InternalPascal.g:1078:3: ( rule__Term__OperatorsAssignment_1_0_3 )
                    // InternalPascal.g:1078:4: rule__Term__OperatorsAssignment_1_0_3
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
    // InternalPascal.g:1086:1: rule__Factor__Alternatives : ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__FunctionAssignment_7 ) ) | ( ( rule__Factor__Group_8__0 ) ) | ( ( rule__Factor__Group_9__0 ) ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1090:1: ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__FunctionAssignment_7 ) ) | ( ( rule__Factor__Group_8__0 ) ) | ( ( rule__Factor__Group_9__0 ) ) )
            int alt11=10;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalPascal.g:1091:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    {
                    // InternalPascal.g:1091:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    // InternalPascal.g:1092:3: ( rule__Factor__VariableAssignment_0 )
                    {
                     before(grammarAccess.getFactorAccess().getVariableAssignment_0()); 
                    // InternalPascal.g:1093:3: ( rule__Factor__VariableAssignment_0 )
                    // InternalPascal.g:1093:4: rule__Factor__VariableAssignment_0
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
                    // InternalPascal.g:1097:2: ( ( rule__Factor__NumberAssignment_1 ) )
                    {
                    // InternalPascal.g:1097:2: ( ( rule__Factor__NumberAssignment_1 ) )
                    // InternalPascal.g:1098:3: ( rule__Factor__NumberAssignment_1 )
                    {
                     before(grammarAccess.getFactorAccess().getNumberAssignment_1()); 
                    // InternalPascal.g:1099:3: ( rule__Factor__NumberAssignment_1 )
                    // InternalPascal.g:1099:4: rule__Factor__NumberAssignment_1
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
                    // InternalPascal.g:1103:2: ( ( rule__Factor__StringAssignment_2 ) )
                    {
                    // InternalPascal.g:1103:2: ( ( rule__Factor__StringAssignment_2 ) )
                    // InternalPascal.g:1104:3: ( rule__Factor__StringAssignment_2 )
                    {
                     before(grammarAccess.getFactorAccess().getStringAssignment_2()); 
                    // InternalPascal.g:1105:3: ( rule__Factor__StringAssignment_2 )
                    // InternalPascal.g:1105:4: rule__Factor__StringAssignment_2
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
                    // InternalPascal.g:1109:2: ( ( rule__Factor__SetAssignment_3 ) )
                    {
                    // InternalPascal.g:1109:2: ( ( rule__Factor__SetAssignment_3 ) )
                    // InternalPascal.g:1110:3: ( rule__Factor__SetAssignment_3 )
                    {
                     before(grammarAccess.getFactorAccess().getSetAssignment_3()); 
                    // InternalPascal.g:1111:3: ( rule__Factor__SetAssignment_3 )
                    // InternalPascal.g:1111:4: rule__Factor__SetAssignment_3
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
                    // InternalPascal.g:1115:2: ( ( rule__Factor__NilAssignment_4 ) )
                    {
                    // InternalPascal.g:1115:2: ( ( rule__Factor__NilAssignment_4 ) )
                    // InternalPascal.g:1116:3: ( rule__Factor__NilAssignment_4 )
                    {
                     before(grammarAccess.getFactorAccess().getNilAssignment_4()); 
                    // InternalPascal.g:1117:3: ( rule__Factor__NilAssignment_4 )
                    // InternalPascal.g:1117:4: rule__Factor__NilAssignment_4
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
                    // InternalPascal.g:1121:2: ( ( rule__Factor__BooleanAssignment_5 ) )
                    {
                    // InternalPascal.g:1121:2: ( ( rule__Factor__BooleanAssignment_5 ) )
                    // InternalPascal.g:1122:3: ( rule__Factor__BooleanAssignment_5 )
                    {
                     before(grammarAccess.getFactorAccess().getBooleanAssignment_5()); 
                    // InternalPascal.g:1123:3: ( rule__Factor__BooleanAssignment_5 )
                    // InternalPascal.g:1123:4: rule__Factor__BooleanAssignment_5
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
                    // InternalPascal.g:1127:2: ( ( rule__Factor__BooleanAssignment_6 ) )
                    {
                    // InternalPascal.g:1127:2: ( ( rule__Factor__BooleanAssignment_6 ) )
                    // InternalPascal.g:1128:3: ( rule__Factor__BooleanAssignment_6 )
                    {
                     before(grammarAccess.getFactorAccess().getBooleanAssignment_6()); 
                    // InternalPascal.g:1129:3: ( rule__Factor__BooleanAssignment_6 )
                    // InternalPascal.g:1129:4: rule__Factor__BooleanAssignment_6
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
                    // InternalPascal.g:1133:2: ( ( rule__Factor__FunctionAssignment_7 ) )
                    {
                    // InternalPascal.g:1133:2: ( ( rule__Factor__FunctionAssignment_7 ) )
                    // InternalPascal.g:1134:3: ( rule__Factor__FunctionAssignment_7 )
                    {
                     before(grammarAccess.getFactorAccess().getFunctionAssignment_7()); 
                    // InternalPascal.g:1135:3: ( rule__Factor__FunctionAssignment_7 )
                    // InternalPascal.g:1135:4: rule__Factor__FunctionAssignment_7
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
                    // InternalPascal.g:1139:2: ( ( rule__Factor__Group_8__0 ) )
                    {
                    // InternalPascal.g:1139:2: ( ( rule__Factor__Group_8__0 ) )
                    // InternalPascal.g:1140:3: ( rule__Factor__Group_8__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_8()); 
                    // InternalPascal.g:1141:3: ( rule__Factor__Group_8__0 )
                    // InternalPascal.g:1141:4: rule__Factor__Group_8__0
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
                    // InternalPascal.g:1145:2: ( ( rule__Factor__Group_9__0 ) )
                    {
                    // InternalPascal.g:1145:2: ( ( rule__Factor__Group_9__0 ) )
                    // InternalPascal.g:1146:3: ( rule__Factor__Group_9__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_9()); 
                    // InternalPascal.g:1147:3: ( rule__Factor__Group_9__0 )
                    // InternalPascal.g:1147:4: rule__Factor__Group_9__0
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
    // InternalPascal.g:1155:1: rule__Function_procedure_declaration__Alternatives_0 : ( ( ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 ) ) | ( ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 ) ) );
    public final void rule__Function_procedure_declaration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1159:1: ( ( ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 ) ) | ( ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 ) ) )
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
                    // InternalPascal.g:1160:2: ( ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 ) )
                    {
                    // InternalPascal.g:1160:2: ( ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 ) )
                    // InternalPascal.g:1161:3: ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 )
                    {
                     before(grammarAccess.getFunction_procedure_declarationAccess().getProceduresAssignment_0_0()); 
                    // InternalPascal.g:1162:3: ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 )
                    // InternalPascal.g:1162:4: rule__Function_procedure_declaration__ProceduresAssignment_0_0
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
                    // InternalPascal.g:1166:2: ( ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 ) )
                    {
                    // InternalPascal.g:1166:2: ( ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 ) )
                    // InternalPascal.g:1167:3: ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 )
                    {
                     before(grammarAccess.getFunction_procedure_declarationAccess().getFunctionsAssignment_0_1()); 
                    // InternalPascal.g:1168:3: ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 )
                    // InternalPascal.g:1168:4: rule__Function_procedure_declaration__FunctionsAssignment_0_1
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
    // InternalPascal.g:1176:1: rule__Formal_parameter_section__Alternatives : ( ( ( rule__Formal_parameter_section__ValueAssignment_0 ) ) | ( ( rule__Formal_parameter_section__VariableAssignment_1 ) ) | ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) ) | ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) ) );
    public final void rule__Formal_parameter_section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1180:1: ( ( ( rule__Formal_parameter_section__ValueAssignment_0 ) ) | ( ( rule__Formal_parameter_section__VariableAssignment_1 ) ) | ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) ) | ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) ) )
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
                    // InternalPascal.g:1181:2: ( ( rule__Formal_parameter_section__ValueAssignment_0 ) )
                    {
                    // InternalPascal.g:1181:2: ( ( rule__Formal_parameter_section__ValueAssignment_0 ) )
                    // InternalPascal.g:1182:3: ( rule__Formal_parameter_section__ValueAssignment_0 )
                    {
                     before(grammarAccess.getFormal_parameter_sectionAccess().getValueAssignment_0()); 
                    // InternalPascal.g:1183:3: ( rule__Formal_parameter_section__ValueAssignment_0 )
                    // InternalPascal.g:1183:4: rule__Formal_parameter_section__ValueAssignment_0
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
                    // InternalPascal.g:1187:2: ( ( rule__Formal_parameter_section__VariableAssignment_1 ) )
                    {
                    // InternalPascal.g:1187:2: ( ( rule__Formal_parameter_section__VariableAssignment_1 ) )
                    // InternalPascal.g:1188:3: ( rule__Formal_parameter_section__VariableAssignment_1 )
                    {
                     before(grammarAccess.getFormal_parameter_sectionAccess().getVariableAssignment_1()); 
                    // InternalPascal.g:1189:3: ( rule__Formal_parameter_section__VariableAssignment_1 )
                    // InternalPascal.g:1189:4: rule__Formal_parameter_section__VariableAssignment_1
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
                    // InternalPascal.g:1193:2: ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) )
                    {
                    // InternalPascal.g:1193:2: ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) )
                    // InternalPascal.g:1194:3: ( rule__Formal_parameter_section__ProcedureAssignment_2 )
                    {
                     before(grammarAccess.getFormal_parameter_sectionAccess().getProcedureAssignment_2()); 
                    // InternalPascal.g:1195:3: ( rule__Formal_parameter_section__ProcedureAssignment_2 )
                    // InternalPascal.g:1195:4: rule__Formal_parameter_section__ProcedureAssignment_2
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
                    // InternalPascal.g:1199:2: ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) )
                    {
                    // InternalPascal.g:1199:2: ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) )
                    // InternalPascal.g:1200:3: ( rule__Formal_parameter_section__FunctionAssignment_3 )
                    {
                     before(grammarAccess.getFormal_parameter_sectionAccess().getFunctionAssignment_3()); 
                    // InternalPascal.g:1201:3: ( rule__Formal_parameter_section__FunctionAssignment_3 )
                    // InternalPascal.g:1201:4: rule__Formal_parameter_section__FunctionAssignment_3
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
    // InternalPascal.g:1209:1: rule__Any_number__Alternatives : ( ( ruleunsigned_number ) | ( rulesigned_number ) );
    public final void rule__Any_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1213:1: ( ( ruleunsigned_number ) | ( rulesigned_number ) )
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
                    // InternalPascal.g:1214:2: ( ruleunsigned_number )
                    {
                    // InternalPascal.g:1214:2: ( ruleunsigned_number )
                    // InternalPascal.g:1215:3: ruleunsigned_number
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
                    // InternalPascal.g:1220:2: ( rulesigned_number )
                    {
                    // InternalPascal.g:1220:2: ( rulesigned_number )
                    // InternalPascal.g:1221:3: rulesigned_number
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
    // InternalPascal.g:1230:1: rule__Signed_number__Alternatives : ( ( ( rule__Signed_number__IntegerAssignment_0 ) ) | ( ( rule__Signed_number__RealAssignment_1 ) ) );
    public final void rule__Signed_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1234:1: ( ( ( rule__Signed_number__IntegerAssignment_0 ) ) | ( ( rule__Signed_number__RealAssignment_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalPascal.g:1235:2: ( ( rule__Signed_number__IntegerAssignment_0 ) )
                    {
                    // InternalPascal.g:1235:2: ( ( rule__Signed_number__IntegerAssignment_0 ) )
                    // InternalPascal.g:1236:3: ( rule__Signed_number__IntegerAssignment_0 )
                    {
                     before(grammarAccess.getSigned_numberAccess().getIntegerAssignment_0()); 
                    // InternalPascal.g:1237:3: ( rule__Signed_number__IntegerAssignment_0 )
                    // InternalPascal.g:1237:4: rule__Signed_number__IntegerAssignment_0
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
                    // InternalPascal.g:1241:2: ( ( rule__Signed_number__RealAssignment_1 ) )
                    {
                    // InternalPascal.g:1241:2: ( ( rule__Signed_number__RealAssignment_1 ) )
                    // InternalPascal.g:1242:3: ( rule__Signed_number__RealAssignment_1 )
                    {
                     before(grammarAccess.getSigned_numberAccess().getRealAssignment_1()); 
                    // InternalPascal.g:1243:3: ( rule__Signed_number__RealAssignment_1 )
                    // InternalPascal.g:1243:4: rule__Signed_number__RealAssignment_1
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
    // InternalPascal.g:1251:1: rule__Unsigned_number__Alternatives : ( ( ( rule__Unsigned_number__IntegerAssignment_0 ) ) | ( ( rule__Unsigned_number__RealAssignment_1 ) ) );
    public final void rule__Unsigned_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1255:1: ( ( ( rule__Unsigned_number__IntegerAssignment_0 ) ) | ( ( rule__Unsigned_number__RealAssignment_1 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INTEGER_NUMBER) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_REAL_NUMBER) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalPascal.g:1256:2: ( ( rule__Unsigned_number__IntegerAssignment_0 ) )
                    {
                    // InternalPascal.g:1256:2: ( ( rule__Unsigned_number__IntegerAssignment_0 ) )
                    // InternalPascal.g:1257:3: ( rule__Unsigned_number__IntegerAssignment_0 )
                    {
                     before(grammarAccess.getUnsigned_numberAccess().getIntegerAssignment_0()); 
                    // InternalPascal.g:1258:3: ( rule__Unsigned_number__IntegerAssignment_0 )
                    // InternalPascal.g:1258:4: rule__Unsigned_number__IntegerAssignment_0
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
                    // InternalPascal.g:1262:2: ( ( rule__Unsigned_number__RealAssignment_1 ) )
                    {
                    // InternalPascal.g:1262:2: ( ( rule__Unsigned_number__RealAssignment_1 ) )
                    // InternalPascal.g:1263:3: ( rule__Unsigned_number__RealAssignment_1 )
                    {
                     before(grammarAccess.getUnsigned_numberAccess().getRealAssignment_1()); 
                    // InternalPascal.g:1264:3: ( rule__Unsigned_number__RealAssignment_1 )
                    // InternalPascal.g:1264:4: rule__Unsigned_number__RealAssignment_1
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
    // InternalPascal.g:1272:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1276:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalPascal.g:1277:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalPascal.g:1284:1: rule__Program__Group__0__Impl : ( ( rule__Program__HeadingAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1288:1: ( ( ( rule__Program__HeadingAssignment_0 ) ) )
            // InternalPascal.g:1289:1: ( ( rule__Program__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:1289:1: ( ( rule__Program__HeadingAssignment_0 ) )
            // InternalPascal.g:1290:2: ( rule__Program__HeadingAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getHeadingAssignment_0()); 
            // InternalPascal.g:1291:2: ( rule__Program__HeadingAssignment_0 )
            // InternalPascal.g:1291:3: rule__Program__HeadingAssignment_0
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
    // InternalPascal.g:1299:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1303:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalPascal.g:1304:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalPascal.g:1311:1: rule__Program__Group__1__Impl : ( ( rule__Program__BlockAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1315:1: ( ( ( rule__Program__BlockAssignment_1 ) ) )
            // InternalPascal.g:1316:1: ( ( rule__Program__BlockAssignment_1 ) )
            {
            // InternalPascal.g:1316:1: ( ( rule__Program__BlockAssignment_1 ) )
            // InternalPascal.g:1317:2: ( rule__Program__BlockAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getBlockAssignment_1()); 
            // InternalPascal.g:1318:2: ( rule__Program__BlockAssignment_1 )
            // InternalPascal.g:1318:3: rule__Program__BlockAssignment_1
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
    // InternalPascal.g:1326:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1330:1: ( rule__Program__Group__2__Impl )
            // InternalPascal.g:1331:2: rule__Program__Group__2__Impl
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
    // InternalPascal.g:1337:1: rule__Program__Group__2__Impl : ( '.' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1341:1: ( ( '.' ) )
            // InternalPascal.g:1342:1: ( '.' )
            {
            // InternalPascal.g:1342:1: ( '.' )
            // InternalPascal.g:1343:2: '.'
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
    // InternalPascal.g:1353:1: rule__Program_heading_block__Group__0 : rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 ;
    public final void rule__Program_heading_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1357:1: ( rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 )
            // InternalPascal.g:1358:2: rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1
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
    // InternalPascal.g:1365:1: rule__Program_heading_block__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program_heading_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1369:1: ( ( 'program' ) )
            // InternalPascal.g:1370:1: ( 'program' )
            {
            // InternalPascal.g:1370:1: ( 'program' )
            // InternalPascal.g:1371:2: 'program'
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
    // InternalPascal.g:1380:1: rule__Program_heading_block__Group__1 : rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 ;
    public final void rule__Program_heading_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1384:1: ( rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 )
            // InternalPascal.g:1385:2: rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2
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
    // InternalPascal.g:1392:1: rule__Program_heading_block__Group__1__Impl : ( ( rule__Program_heading_block__NameAssignment_1 ) ) ;
    public final void rule__Program_heading_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1396:1: ( ( ( rule__Program_heading_block__NameAssignment_1 ) ) )
            // InternalPascal.g:1397:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            {
            // InternalPascal.g:1397:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            // InternalPascal.g:1398:2: ( rule__Program_heading_block__NameAssignment_1 )
            {
             before(grammarAccess.getProgram_heading_blockAccess().getNameAssignment_1()); 
            // InternalPascal.g:1399:2: ( rule__Program_heading_block__NameAssignment_1 )
            // InternalPascal.g:1399:3: rule__Program_heading_block__NameAssignment_1
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
    // InternalPascal.g:1407:1: rule__Program_heading_block__Group__2 : rule__Program_heading_block__Group__2__Impl ;
    public final void rule__Program_heading_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1411:1: ( rule__Program_heading_block__Group__2__Impl )
            // InternalPascal.g:1412:2: rule__Program_heading_block__Group__2__Impl
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
    // InternalPascal.g:1418:1: rule__Program_heading_block__Group__2__Impl : ( ';' ) ;
    public final void rule__Program_heading_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1422:1: ( ( ';' ) )
            // InternalPascal.g:1423:1: ( ';' )
            {
            // InternalPascal.g:1423:1: ( ';' )
            // InternalPascal.g:1424:2: ';'
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
    // InternalPascal.g:1434:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1438:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalPascal.g:1439:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalPascal.g:1446:1: rule__Block__Group__0__Impl : ( ( rule__Block__AbstractionAssignment_0 )? ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1450:1: ( ( ( rule__Block__AbstractionAssignment_0 )? ) )
            // InternalPascal.g:1451:1: ( ( rule__Block__AbstractionAssignment_0 )? )
            {
            // InternalPascal.g:1451:1: ( ( rule__Block__AbstractionAssignment_0 )? )
            // InternalPascal.g:1452:2: ( rule__Block__AbstractionAssignment_0 )?
            {
             before(grammarAccess.getBlockAccess().getAbstractionAssignment_0()); 
            // InternalPascal.g:1453:2: ( rule__Block__AbstractionAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36||LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPascal.g:1453:3: rule__Block__AbstractionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__AbstractionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBlockAccess().getAbstractionAssignment_0()); 

            }


            }

        }
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
    // InternalPascal.g:1461:1: rule__Block__Group__1 : rule__Block__Group__1__Impl ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1465:1: ( rule__Block__Group__1__Impl )
            // InternalPascal.g:1466:2: rule__Block__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__1__Impl();

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
    // InternalPascal.g:1472:1: rule__Block__Group__1__Impl : ( ( rule__Block__StatementAssignment_1 ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1476:1: ( ( ( rule__Block__StatementAssignment_1 ) ) )
            // InternalPascal.g:1477:1: ( ( rule__Block__StatementAssignment_1 ) )
            {
            // InternalPascal.g:1477:1: ( ( rule__Block__StatementAssignment_1 ) )
            // InternalPascal.g:1478:2: ( rule__Block__StatementAssignment_1 )
            {
             before(grammarAccess.getBlockAccess().getStatementAssignment_1()); 
            // InternalPascal.g:1479:2: ( rule__Block__StatementAssignment_1 )
            // InternalPascal.g:1479:3: rule__Block__StatementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Block__StatementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getStatementAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Statement_part__Group__0"
    // InternalPascal.g:1488:1: rule__Statement_part__Group__0 : rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 ;
    public final void rule__Statement_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1492:1: ( rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 )
            // InternalPascal.g:1493:2: rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1
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
    // InternalPascal.g:1500:1: rule__Statement_part__Group__0__Impl : ( 'begin' ) ;
    public final void rule__Statement_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1504:1: ( ( 'begin' ) )
            // InternalPascal.g:1505:1: ( 'begin' )
            {
            // InternalPascal.g:1505:1: ( 'begin' )
            // InternalPascal.g:1506:2: 'begin'
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
    // InternalPascal.g:1515:1: rule__Statement_part__Group__1 : rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 ;
    public final void rule__Statement_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1519:1: ( rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 )
            // InternalPascal.g:1520:2: rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2
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
    // InternalPascal.g:1527:1: rule__Statement_part__Group__1__Impl : ( ( rule__Statement_part__SequenceAssignment_1 ) ) ;
    public final void rule__Statement_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1531:1: ( ( ( rule__Statement_part__SequenceAssignment_1 ) ) )
            // InternalPascal.g:1532:1: ( ( rule__Statement_part__SequenceAssignment_1 ) )
            {
            // InternalPascal.g:1532:1: ( ( rule__Statement_part__SequenceAssignment_1 ) )
            // InternalPascal.g:1533:2: ( rule__Statement_part__SequenceAssignment_1 )
            {
             before(grammarAccess.getStatement_partAccess().getSequenceAssignment_1()); 
            // InternalPascal.g:1534:2: ( rule__Statement_part__SequenceAssignment_1 )
            // InternalPascal.g:1534:3: rule__Statement_part__SequenceAssignment_1
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
    // InternalPascal.g:1542:1: rule__Statement_part__Group__2 : rule__Statement_part__Group__2__Impl ;
    public final void rule__Statement_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1546:1: ( rule__Statement_part__Group__2__Impl )
            // InternalPascal.g:1547:2: rule__Statement_part__Group__2__Impl
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
    // InternalPascal.g:1553:1: rule__Statement_part__Group__2__Impl : ( 'end' ) ;
    public final void rule__Statement_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1557:1: ( ( 'end' ) )
            // InternalPascal.g:1558:1: ( 'end' )
            {
            // InternalPascal.g:1558:1: ( 'end' )
            // InternalPascal.g:1559:2: 'end'
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
    // InternalPascal.g:1569:1: rule__Statement_sequence__Group__0 : rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 ;
    public final void rule__Statement_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1573:1: ( rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 )
            // InternalPascal.g:1574:2: rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1
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
    // InternalPascal.g:1581:1: rule__Statement_sequence__Group__0__Impl : ( ( rule__Statement_sequence__StatementsAssignment_0 ) ) ;
    public final void rule__Statement_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1585:1: ( ( ( rule__Statement_sequence__StatementsAssignment_0 ) ) )
            // InternalPascal.g:1586:1: ( ( rule__Statement_sequence__StatementsAssignment_0 ) )
            {
            // InternalPascal.g:1586:1: ( ( rule__Statement_sequence__StatementsAssignment_0 ) )
            // InternalPascal.g:1587:2: ( rule__Statement_sequence__StatementsAssignment_0 )
            {
             before(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_0()); 
            // InternalPascal.g:1588:2: ( rule__Statement_sequence__StatementsAssignment_0 )
            // InternalPascal.g:1588:3: rule__Statement_sequence__StatementsAssignment_0
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
    // InternalPascal.g:1596:1: rule__Statement_sequence__Group__1 : rule__Statement_sequence__Group__1__Impl ;
    public final void rule__Statement_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1600:1: ( rule__Statement_sequence__Group__1__Impl )
            // InternalPascal.g:1601:2: rule__Statement_sequence__Group__1__Impl
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
    // InternalPascal.g:1607:1: rule__Statement_sequence__Group__1__Impl : ( ( rule__Statement_sequence__Group_1__0 )* ) ;
    public final void rule__Statement_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1611:1: ( ( ( rule__Statement_sequence__Group_1__0 )* ) )
            // InternalPascal.g:1612:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            {
            // InternalPascal.g:1612:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            // InternalPascal.g:1613:2: ( rule__Statement_sequence__Group_1__0 )*
            {
             before(grammarAccess.getStatement_sequenceAccess().getGroup_1()); 
            // InternalPascal.g:1614:2: ( rule__Statement_sequence__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==24) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPascal.g:1614:3: rule__Statement_sequence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Statement_sequence__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalPascal.g:1623:1: rule__Statement_sequence__Group_1__0 : rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 ;
    public final void rule__Statement_sequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1627:1: ( rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 )
            // InternalPascal.g:1628:2: rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1
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
    // InternalPascal.g:1635:1: rule__Statement_sequence__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Statement_sequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1639:1: ( ( ';' ) )
            // InternalPascal.g:1640:1: ( ';' )
            {
            // InternalPascal.g:1640:1: ( ';' )
            // InternalPascal.g:1641:2: ';'
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
    // InternalPascal.g:1650:1: rule__Statement_sequence__Group_1__1 : rule__Statement_sequence__Group_1__1__Impl ;
    public final void rule__Statement_sequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1654:1: ( rule__Statement_sequence__Group_1__1__Impl )
            // InternalPascal.g:1655:2: rule__Statement_sequence__Group_1__1__Impl
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
    // InternalPascal.g:1661:1: rule__Statement_sequence__Group_1__1__Impl : ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) ) ;
    public final void rule__Statement_sequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1665:1: ( ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) ) )
            // InternalPascal.g:1666:1: ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) )
            {
            // InternalPascal.g:1666:1: ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) )
            // InternalPascal.g:1667:2: ( rule__Statement_sequence__StatementsAssignment_1_1 )
            {
             before(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_1_1()); 
            // InternalPascal.g:1668:2: ( rule__Statement_sequence__StatementsAssignment_1_1 )
            // InternalPascal.g:1668:3: rule__Statement_sequence__StatementsAssignment_1_1
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
    // InternalPascal.g:1677:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1681:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalPascal.g:1682:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
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
    // InternalPascal.g:1689:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Group_0__0 )? ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1693:1: ( ( ( rule__Statement__Group_0__0 )? ) )
            // InternalPascal.g:1694:1: ( ( rule__Statement__Group_0__0 )? )
            {
            // InternalPascal.g:1694:1: ( ( rule__Statement__Group_0__0 )? )
            // InternalPascal.g:1695:2: ( rule__Statement__Group_0__0 )?
            {
             before(grammarAccess.getStatementAccess().getGroup_0()); 
            // InternalPascal.g:1696:2: ( rule__Statement__Group_0__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_SIGNED_INTEGER_NUMBER && LA19_0<=RULE_INTEGER_NUMBER)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPascal.g:1696:3: rule__Statement__Group_0__0
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
    // InternalPascal.g:1704:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1708:1: ( rule__Statement__Group__1__Impl )
            // InternalPascal.g:1709:2: rule__Statement__Group__1__Impl
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
    // InternalPascal.g:1715:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__SimpleAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1719:1: ( ( ( rule__Statement__SimpleAssignment_1 ) ) )
            // InternalPascal.g:1720:1: ( ( rule__Statement__SimpleAssignment_1 ) )
            {
            // InternalPascal.g:1720:1: ( ( rule__Statement__SimpleAssignment_1 ) )
            // InternalPascal.g:1721:2: ( rule__Statement__SimpleAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getSimpleAssignment_1()); 
            // InternalPascal.g:1722:2: ( rule__Statement__SimpleAssignment_1 )
            // InternalPascal.g:1722:3: rule__Statement__SimpleAssignment_1
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
    // InternalPascal.g:1731:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1735:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalPascal.g:1736:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
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
    // InternalPascal.g:1743:1: rule__Statement__Group_0__0__Impl : ( ( rule__Statement__LabelAssignment_0_0 ) ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1747:1: ( ( ( rule__Statement__LabelAssignment_0_0 ) ) )
            // InternalPascal.g:1748:1: ( ( rule__Statement__LabelAssignment_0_0 ) )
            {
            // InternalPascal.g:1748:1: ( ( rule__Statement__LabelAssignment_0_0 ) )
            // InternalPascal.g:1749:2: ( rule__Statement__LabelAssignment_0_0 )
            {
             before(grammarAccess.getStatementAccess().getLabelAssignment_0_0()); 
            // InternalPascal.g:1750:2: ( rule__Statement__LabelAssignment_0_0 )
            // InternalPascal.g:1750:3: rule__Statement__LabelAssignment_0_0
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
    // InternalPascal.g:1758:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1762:1: ( rule__Statement__Group_0__1__Impl )
            // InternalPascal.g:1763:2: rule__Statement__Group_0__1__Impl
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
    // InternalPascal.g:1769:1: rule__Statement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1773:1: ( ( ':' ) )
            // InternalPascal.g:1774:1: ( ':' )
            {
            // InternalPascal.g:1774:1: ( ':' )
            // InternalPascal.g:1775:2: ':'
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
    // InternalPascal.g:1785:1: rule__Assignment_statement__Group__0 : rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 ;
    public final void rule__Assignment_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1789:1: ( rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 )
            // InternalPascal.g:1790:2: rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1
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
    // InternalPascal.g:1797:1: rule__Assignment_statement__Group__0__Impl : ( ( rule__Assignment_statement__VariableAssignment_0 ) ) ;
    public final void rule__Assignment_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1801:1: ( ( ( rule__Assignment_statement__VariableAssignment_0 ) ) )
            // InternalPascal.g:1802:1: ( ( rule__Assignment_statement__VariableAssignment_0 ) )
            {
            // InternalPascal.g:1802:1: ( ( rule__Assignment_statement__VariableAssignment_0 ) )
            // InternalPascal.g:1803:2: ( rule__Assignment_statement__VariableAssignment_0 )
            {
             before(grammarAccess.getAssignment_statementAccess().getVariableAssignment_0()); 
            // InternalPascal.g:1804:2: ( rule__Assignment_statement__VariableAssignment_0 )
            // InternalPascal.g:1804:3: rule__Assignment_statement__VariableAssignment_0
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
    // InternalPascal.g:1812:1: rule__Assignment_statement__Group__1 : rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 ;
    public final void rule__Assignment_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1816:1: ( rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 )
            // InternalPascal.g:1817:2: rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2
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
    // InternalPascal.g:1824:1: rule__Assignment_statement__Group__1__Impl : ( ':=' ) ;
    public final void rule__Assignment_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1828:1: ( ( ':=' ) )
            // InternalPascal.g:1829:1: ( ':=' )
            {
            // InternalPascal.g:1829:1: ( ':=' )
            // InternalPascal.g:1830:2: ':='
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
    // InternalPascal.g:1839:1: rule__Assignment_statement__Group__2 : rule__Assignment_statement__Group__2__Impl ;
    public final void rule__Assignment_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1843:1: ( rule__Assignment_statement__Group__2__Impl )
            // InternalPascal.g:1844:2: rule__Assignment_statement__Group__2__Impl
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
    // InternalPascal.g:1850:1: rule__Assignment_statement__Group__2__Impl : ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1854:1: ( ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) )
            // InternalPascal.g:1855:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            {
            // InternalPascal.g:1855:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            // InternalPascal.g:1856:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            {
             before(grammarAccess.getAssignment_statementAccess().getExpressionAssignment_2()); 
            // InternalPascal.g:1857:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            // InternalPascal.g:1857:3: rule__Assignment_statement__ExpressionAssignment_2
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
    // InternalPascal.g:1866:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1870:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalPascal.g:1871:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalPascal.g:1878:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1882:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalPascal.g:1883:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalPascal.g:1883:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalPascal.g:1884:2: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // InternalPascal.g:1885:2: ( rule__Variable__NameAssignment_0 )
            // InternalPascal.g:1885:3: rule__Variable__NameAssignment_0
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
    // InternalPascal.g:1893:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1897:1: ( rule__Variable__Group__1__Impl )
            // InternalPascal.g:1898:2: rule__Variable__Group__1__Impl
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
    // InternalPascal.g:1904:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__VariableAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1908:1: ( ( ( rule__Variable__VariableAssignment_1 ) ) )
            // InternalPascal.g:1909:1: ( ( rule__Variable__VariableAssignment_1 ) )
            {
            // InternalPascal.g:1909:1: ( ( rule__Variable__VariableAssignment_1 ) )
            // InternalPascal.g:1910:2: ( rule__Variable__VariableAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getVariableAssignment_1()); 
            // InternalPascal.g:1911:2: ( rule__Variable__VariableAssignment_1 )
            // InternalPascal.g:1911:3: rule__Variable__VariableAssignment_1
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
    // InternalPascal.g:1920:1: rule__Var___Group_0__0 : rule__Var___Group_0__0__Impl rule__Var___Group_0__1 ;
    public final void rule__Var___Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1924:1: ( rule__Var___Group_0__0__Impl rule__Var___Group_0__1 )
            // InternalPascal.g:1925:2: rule__Var___Group_0__0__Impl rule__Var___Group_0__1
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
    // InternalPascal.g:1932:1: rule__Var___Group_0__0__Impl : ( '[' ) ;
    public final void rule__Var___Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1936:1: ( ( '[' ) )
            // InternalPascal.g:1937:1: ( '[' )
            {
            // InternalPascal.g:1937:1: ( '[' )
            // InternalPascal.g:1938:2: '['
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
    // InternalPascal.g:1947:1: rule__Var___Group_0__1 : rule__Var___Group_0__1__Impl rule__Var___Group_0__2 ;
    public final void rule__Var___Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1951:1: ( rule__Var___Group_0__1__Impl rule__Var___Group_0__2 )
            // InternalPascal.g:1952:2: rule__Var___Group_0__1__Impl rule__Var___Group_0__2
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
    // InternalPascal.g:1959:1: rule__Var___Group_0__1__Impl : ( ( rule__Var___ExpressionsAssignment_0_1 ) ) ;
    public final void rule__Var___Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1963:1: ( ( ( rule__Var___ExpressionsAssignment_0_1 ) ) )
            // InternalPascal.g:1964:1: ( ( rule__Var___ExpressionsAssignment_0_1 ) )
            {
            // InternalPascal.g:1964:1: ( ( rule__Var___ExpressionsAssignment_0_1 ) )
            // InternalPascal.g:1965:2: ( rule__Var___ExpressionsAssignment_0_1 )
            {
             before(grammarAccess.getVar_Access().getExpressionsAssignment_0_1()); 
            // InternalPascal.g:1966:2: ( rule__Var___ExpressionsAssignment_0_1 )
            // InternalPascal.g:1966:3: rule__Var___ExpressionsAssignment_0_1
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
    // InternalPascal.g:1974:1: rule__Var___Group_0__2 : rule__Var___Group_0__2__Impl rule__Var___Group_0__3 ;
    public final void rule__Var___Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1978:1: ( rule__Var___Group_0__2__Impl rule__Var___Group_0__3 )
            // InternalPascal.g:1979:2: rule__Var___Group_0__2__Impl rule__Var___Group_0__3
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
    // InternalPascal.g:1986:1: rule__Var___Group_0__2__Impl : ( ']' ) ;
    public final void rule__Var___Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1990:1: ( ( ']' ) )
            // InternalPascal.g:1991:1: ( ']' )
            {
            // InternalPascal.g:1991:1: ( ']' )
            // InternalPascal.g:1992:2: ']'
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
    // InternalPascal.g:2001:1: rule__Var___Group_0__3 : rule__Var___Group_0__3__Impl ;
    public final void rule__Var___Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2005:1: ( rule__Var___Group_0__3__Impl )
            // InternalPascal.g:2006:2: rule__Var___Group_0__3__Impl
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
    // InternalPascal.g:2012:1: rule__Var___Group_0__3__Impl : ( ( rule__Var___ArrayAssignment_0_3 ) ) ;
    public final void rule__Var___Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2016:1: ( ( ( rule__Var___ArrayAssignment_0_3 ) ) )
            // InternalPascal.g:2017:1: ( ( rule__Var___ArrayAssignment_0_3 ) )
            {
            // InternalPascal.g:2017:1: ( ( rule__Var___ArrayAssignment_0_3 ) )
            // InternalPascal.g:2018:2: ( rule__Var___ArrayAssignment_0_3 )
            {
             before(grammarAccess.getVar_Access().getArrayAssignment_0_3()); 
            // InternalPascal.g:2019:2: ( rule__Var___ArrayAssignment_0_3 )
            // InternalPascal.g:2019:3: rule__Var___ArrayAssignment_0_3
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
    // InternalPascal.g:2028:1: rule__Var___Group_1__0 : rule__Var___Group_1__0__Impl rule__Var___Group_1__1 ;
    public final void rule__Var___Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2032:1: ( rule__Var___Group_1__0__Impl rule__Var___Group_1__1 )
            // InternalPascal.g:2033:2: rule__Var___Group_1__0__Impl rule__Var___Group_1__1
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
    // InternalPascal.g:2040:1: rule__Var___Group_1__0__Impl : ( ( rule__Var___AccessorAssignment_1_0 ) ) ;
    public final void rule__Var___Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2044:1: ( ( ( rule__Var___AccessorAssignment_1_0 ) ) )
            // InternalPascal.g:2045:1: ( ( rule__Var___AccessorAssignment_1_0 ) )
            {
            // InternalPascal.g:2045:1: ( ( rule__Var___AccessorAssignment_1_0 ) )
            // InternalPascal.g:2046:2: ( rule__Var___AccessorAssignment_1_0 )
            {
             before(grammarAccess.getVar_Access().getAccessorAssignment_1_0()); 
            // InternalPascal.g:2047:2: ( rule__Var___AccessorAssignment_1_0 )
            // InternalPascal.g:2047:3: rule__Var___AccessorAssignment_1_0
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
    // InternalPascal.g:2055:1: rule__Var___Group_1__1 : rule__Var___Group_1__1__Impl rule__Var___Group_1__2 ;
    public final void rule__Var___Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2059:1: ( rule__Var___Group_1__1__Impl rule__Var___Group_1__2 )
            // InternalPascal.g:2060:2: rule__Var___Group_1__1__Impl rule__Var___Group_1__2
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
    // InternalPascal.g:2067:1: rule__Var___Group_1__1__Impl : ( ( rule__Var___NameAssignment_1_1 ) ) ;
    public final void rule__Var___Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2071:1: ( ( ( rule__Var___NameAssignment_1_1 ) ) )
            // InternalPascal.g:2072:1: ( ( rule__Var___NameAssignment_1_1 ) )
            {
            // InternalPascal.g:2072:1: ( ( rule__Var___NameAssignment_1_1 ) )
            // InternalPascal.g:2073:2: ( rule__Var___NameAssignment_1_1 )
            {
             before(grammarAccess.getVar_Access().getNameAssignment_1_1()); 
            // InternalPascal.g:2074:2: ( rule__Var___NameAssignment_1_1 )
            // InternalPascal.g:2074:3: rule__Var___NameAssignment_1_1
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
    // InternalPascal.g:2082:1: rule__Var___Group_1__2 : rule__Var___Group_1__2__Impl ;
    public final void rule__Var___Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2086:1: ( rule__Var___Group_1__2__Impl )
            // InternalPascal.g:2087:2: rule__Var___Group_1__2__Impl
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
    // InternalPascal.g:2093:1: rule__Var___Group_1__2__Impl : ( ( rule__Var___VariableAssignment_1_2 ) ) ;
    public final void rule__Var___Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2097:1: ( ( ( rule__Var___VariableAssignment_1_2 ) ) )
            // InternalPascal.g:2098:1: ( ( rule__Var___VariableAssignment_1_2 ) )
            {
            // InternalPascal.g:2098:1: ( ( rule__Var___VariableAssignment_1_2 ) )
            // InternalPascal.g:2099:2: ( rule__Var___VariableAssignment_1_2 )
            {
             before(grammarAccess.getVar_Access().getVariableAssignment_1_2()); 
            // InternalPascal.g:2100:2: ( rule__Var___VariableAssignment_1_2 )
            // InternalPascal.g:2100:3: rule__Var___VariableAssignment_1_2
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
    // InternalPascal.g:2109:1: rule__Var___Group_2__0 : rule__Var___Group_2__0__Impl rule__Var___Group_2__1 ;
    public final void rule__Var___Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2113:1: ( rule__Var___Group_2__0__Impl rule__Var___Group_2__1 )
            // InternalPascal.g:2114:2: rule__Var___Group_2__0__Impl rule__Var___Group_2__1
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
    // InternalPascal.g:2121:1: rule__Var___Group_2__0__Impl : ( '^' ) ;
    public final void rule__Var___Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2125:1: ( ( '^' ) )
            // InternalPascal.g:2126:1: ( '^' )
            {
            // InternalPascal.g:2126:1: ( '^' )
            // InternalPascal.g:2127:2: '^'
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
    // InternalPascal.g:2136:1: rule__Var___Group_2__1 : rule__Var___Group_2__1__Impl ;
    public final void rule__Var___Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2140:1: ( rule__Var___Group_2__1__Impl )
            // InternalPascal.g:2141:2: rule__Var___Group_2__1__Impl
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
    // InternalPascal.g:2147:1: rule__Var___Group_2__1__Impl : ( ( rule__Var___PointerAssignment_2_1 ) ) ;
    public final void rule__Var___Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2151:1: ( ( ( rule__Var___PointerAssignment_2_1 ) ) )
            // InternalPascal.g:2152:1: ( ( rule__Var___PointerAssignment_2_1 ) )
            {
            // InternalPascal.g:2152:1: ( ( rule__Var___PointerAssignment_2_1 ) )
            // InternalPascal.g:2153:2: ( rule__Var___PointerAssignment_2_1 )
            {
             before(grammarAccess.getVar_Access().getPointerAssignment_2_1()); 
            // InternalPascal.g:2154:2: ( rule__Var___PointerAssignment_2_1 )
            // InternalPascal.g:2154:3: rule__Var___PointerAssignment_2_1
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
    // InternalPascal.g:2163:1: rule__Expression_list__Group__0 : rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 ;
    public final void rule__Expression_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2167:1: ( rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 )
            // InternalPascal.g:2168:2: rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1
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
    // InternalPascal.g:2175:1: rule__Expression_list__Group__0__Impl : ( ( rule__Expression_list__ExpressionsAssignment_0 ) ) ;
    public final void rule__Expression_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2179:1: ( ( ( rule__Expression_list__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:2180:1: ( ( rule__Expression_list__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:2180:1: ( ( rule__Expression_list__ExpressionsAssignment_0 ) )
            // InternalPascal.g:2181:2: ( rule__Expression_list__ExpressionsAssignment_0 )
            {
             before(grammarAccess.getExpression_listAccess().getExpressionsAssignment_0()); 
            // InternalPascal.g:2182:2: ( rule__Expression_list__ExpressionsAssignment_0 )
            // InternalPascal.g:2182:3: rule__Expression_list__ExpressionsAssignment_0
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
    // InternalPascal.g:2190:1: rule__Expression_list__Group__1 : rule__Expression_list__Group__1__Impl ;
    public final void rule__Expression_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2194:1: ( rule__Expression_list__Group__1__Impl )
            // InternalPascal.g:2195:2: rule__Expression_list__Group__1__Impl
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
    // InternalPascal.g:2201:1: rule__Expression_list__Group__1__Impl : ( ( rule__Expression_list__Group_1__0 )* ) ;
    public final void rule__Expression_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2205:1: ( ( ( rule__Expression_list__Group_1__0 )* ) )
            // InternalPascal.g:2206:1: ( ( rule__Expression_list__Group_1__0 )* )
            {
            // InternalPascal.g:2206:1: ( ( rule__Expression_list__Group_1__0 )* )
            // InternalPascal.g:2207:2: ( rule__Expression_list__Group_1__0 )*
            {
             before(grammarAccess.getExpression_listAccess().getGroup_1()); 
            // InternalPascal.g:2208:2: ( rule__Expression_list__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPascal.g:2208:3: rule__Expression_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Expression_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalPascal.g:2217:1: rule__Expression_list__Group_1__0 : rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 ;
    public final void rule__Expression_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2221:1: ( rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 )
            // InternalPascal.g:2222:2: rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1
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
    // InternalPascal.g:2229:1: rule__Expression_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Expression_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2233:1: ( ( ',' ) )
            // InternalPascal.g:2234:1: ( ',' )
            {
            // InternalPascal.g:2234:1: ( ',' )
            // InternalPascal.g:2235:2: ','
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
    // InternalPascal.g:2244:1: rule__Expression_list__Group_1__1 : rule__Expression_list__Group_1__1__Impl ;
    public final void rule__Expression_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2248:1: ( rule__Expression_list__Group_1__1__Impl )
            // InternalPascal.g:2249:2: rule__Expression_list__Group_1__1__Impl
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
    // InternalPascal.g:2255:1: rule__Expression_list__Group_1__1__Impl : ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Expression_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2259:1: ( ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:2260:1: ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:2260:1: ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:2261:2: ( rule__Expression_list__ExpressionsAssignment_1_1 )
            {
             before(grammarAccess.getExpression_listAccess().getExpressionsAssignment_1_1()); 
            // InternalPascal.g:2262:2: ( rule__Expression_list__ExpressionsAssignment_1_1 )
            // InternalPascal.g:2262:3: rule__Expression_list__ExpressionsAssignment_1_1
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
    // InternalPascal.g:2271:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2275:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalPascal.g:2276:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
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
    // InternalPascal.g:2283:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__ExpressionsAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2287:1: ( ( ( rule__Expression__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:2288:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:2288:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            // InternalPascal.g:2289:2: ( rule__Expression__ExpressionsAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getExpressionsAssignment_0()); 
            // InternalPascal.g:2290:2: ( rule__Expression__ExpressionsAssignment_0 )
            // InternalPascal.g:2290:3: rule__Expression__ExpressionsAssignment_0
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
    // InternalPascal.g:2298:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2302:1: ( rule__Expression__Group__1__Impl )
            // InternalPascal.g:2303:2: rule__Expression__Group__1__Impl
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
    // InternalPascal.g:2309:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2313:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalPascal.g:2314:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalPascal.g:2314:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalPascal.g:2315:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalPascal.g:2316:2: ( rule__Expression__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_RELATIONAL_OP||(LA21_0>=39 && LA21_0<=40)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPascal.g:2316:3: rule__Expression__Group_1__0
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
    // InternalPascal.g:2325:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2329:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalPascal.g:2330:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
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
    // InternalPascal.g:2337:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Alternatives_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2341:1: ( ( ( rule__Expression__Alternatives_1_0 ) ) )
            // InternalPascal.g:2342:1: ( ( rule__Expression__Alternatives_1_0 ) )
            {
            // InternalPascal.g:2342:1: ( ( rule__Expression__Alternatives_1_0 ) )
            // InternalPascal.g:2343:2: ( rule__Expression__Alternatives_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 
            // InternalPascal.g:2344:2: ( rule__Expression__Alternatives_1_0 )
            // InternalPascal.g:2344:3: rule__Expression__Alternatives_1_0
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
    // InternalPascal.g:2352:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2356:1: ( rule__Expression__Group_1__1__Impl )
            // InternalPascal.g:2357:2: rule__Expression__Group_1__1__Impl
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
    // InternalPascal.g:2363:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2367:1: ( ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:2368:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:2368:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:2369:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getExpressionsAssignment_1_1()); 
            // InternalPascal.g:2370:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            // InternalPascal.g:2370:3: rule__Expression__ExpressionsAssignment_1_1
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
    // InternalPascal.g:2379:1: rule__Simple_expression__Group__0 : rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 ;
    public final void rule__Simple_expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2383:1: ( rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 )
            // InternalPascal.g:2384:2: rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1
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
    // InternalPascal.g:2391:1: rule__Simple_expression__Group__0__Impl : ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? ) ;
    public final void rule__Simple_expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2395:1: ( ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? ) )
            // InternalPascal.g:2396:1: ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? )
            {
            // InternalPascal.g:2396:1: ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? )
            // InternalPascal.g:2397:2: ( rule__Simple_expression__PrefixOperatorAssignment_0 )?
            {
             before(grammarAccess.getSimple_expressionAccess().getPrefixOperatorAssignment_0()); 
            // InternalPascal.g:2398:2: ( rule__Simple_expression__PrefixOperatorAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ADDITION_OP) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPascal.g:2398:3: rule__Simple_expression__PrefixOperatorAssignment_0
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
    // InternalPascal.g:2406:1: rule__Simple_expression__Group__1 : rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 ;
    public final void rule__Simple_expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2410:1: ( rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 )
            // InternalPascal.g:2411:2: rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2
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
    // InternalPascal.g:2418:1: rule__Simple_expression__Group__1__Impl : ( ( rule__Simple_expression__TermsAssignment_1 ) ) ;
    public final void rule__Simple_expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2422:1: ( ( ( rule__Simple_expression__TermsAssignment_1 ) ) )
            // InternalPascal.g:2423:1: ( ( rule__Simple_expression__TermsAssignment_1 ) )
            {
            // InternalPascal.g:2423:1: ( ( rule__Simple_expression__TermsAssignment_1 ) )
            // InternalPascal.g:2424:2: ( rule__Simple_expression__TermsAssignment_1 )
            {
             before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_1()); 
            // InternalPascal.g:2425:2: ( rule__Simple_expression__TermsAssignment_1 )
            // InternalPascal.g:2425:3: rule__Simple_expression__TermsAssignment_1
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
    // InternalPascal.g:2433:1: rule__Simple_expression__Group__2 : rule__Simple_expression__Group__2__Impl ;
    public final void rule__Simple_expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2437:1: ( rule__Simple_expression__Group__2__Impl )
            // InternalPascal.g:2438:2: rule__Simple_expression__Group__2__Impl
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
    // InternalPascal.g:2444:1: rule__Simple_expression__Group__2__Impl : ( ( rule__Simple_expression__Alternatives_2 )* ) ;
    public final void rule__Simple_expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2448:1: ( ( ( rule__Simple_expression__Alternatives_2 )* ) )
            // InternalPascal.g:2449:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            {
            // InternalPascal.g:2449:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            // InternalPascal.g:2450:2: ( rule__Simple_expression__Alternatives_2 )*
            {
             before(grammarAccess.getSimple_expressionAccess().getAlternatives_2()); 
            // InternalPascal.g:2451:2: ( rule__Simple_expression__Alternatives_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_INTEGER_NUMBER||LA23_0==RULE_ADDITION_OP||LA23_0==RULE_REAL_NUMBER||LA23_0==41) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPascal.g:2451:3: rule__Simple_expression__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Simple_expression__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalPascal.g:2460:1: rule__Simple_expression__Group_2_0__0 : rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 ;
    public final void rule__Simple_expression__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2464:1: ( rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 )
            // InternalPascal.g:2465:2: rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1
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
    // InternalPascal.g:2472:1: rule__Simple_expression__Group_2_0__0__Impl : ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) ;
    public final void rule__Simple_expression__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2476:1: ( ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) )
            // InternalPascal.g:2477:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            {
            // InternalPascal.g:2477:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            // InternalPascal.g:2478:2: ( rule__Simple_expression__Alternatives_2_0_0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getAlternatives_2_0_0()); 
            // InternalPascal.g:2479:2: ( rule__Simple_expression__Alternatives_2_0_0 )
            // InternalPascal.g:2479:3: rule__Simple_expression__Alternatives_2_0_0
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
    // InternalPascal.g:2487:1: rule__Simple_expression__Group_2_0__1 : rule__Simple_expression__Group_2_0__1__Impl ;
    public final void rule__Simple_expression__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2491:1: ( rule__Simple_expression__Group_2_0__1__Impl )
            // InternalPascal.g:2492:2: rule__Simple_expression__Group_2_0__1__Impl
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
    // InternalPascal.g:2498:1: rule__Simple_expression__Group_2_0__1__Impl : ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) ) ;
    public final void rule__Simple_expression__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2502:1: ( ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) ) )
            // InternalPascal.g:2503:1: ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) )
            {
            // InternalPascal.g:2503:1: ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) )
            // InternalPascal.g:2504:2: ( rule__Simple_expression__TermsAssignment_2_0_1 )
            {
             before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_0_1()); 
            // InternalPascal.g:2505:2: ( rule__Simple_expression__TermsAssignment_2_0_1 )
            // InternalPascal.g:2505:3: rule__Simple_expression__TermsAssignment_2_0_1
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
    // InternalPascal.g:2514:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2518:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalPascal.g:2519:2: rule__Term__Group__0__Impl rule__Term__Group__1
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
    // InternalPascal.g:2526:1: rule__Term__Group__0__Impl : ( ( rule__Term__FactorsAssignment_0 ) ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2530:1: ( ( ( rule__Term__FactorsAssignment_0 ) ) )
            // InternalPascal.g:2531:1: ( ( rule__Term__FactorsAssignment_0 ) )
            {
            // InternalPascal.g:2531:1: ( ( rule__Term__FactorsAssignment_0 ) )
            // InternalPascal.g:2532:2: ( rule__Term__FactorsAssignment_0 )
            {
             before(grammarAccess.getTermAccess().getFactorsAssignment_0()); 
            // InternalPascal.g:2533:2: ( rule__Term__FactorsAssignment_0 )
            // InternalPascal.g:2533:3: rule__Term__FactorsAssignment_0
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
    // InternalPascal.g:2541:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2545:1: ( rule__Term__Group__1__Impl )
            // InternalPascal.g:2546:2: rule__Term__Group__1__Impl
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
    // InternalPascal.g:2552:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2556:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // InternalPascal.g:2557:1: ( ( rule__Term__Group_1__0 )* )
            {
            // InternalPascal.g:2557:1: ( ( rule__Term__Group_1__0 )* )
            // InternalPascal.g:2558:2: ( rule__Term__Group_1__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // InternalPascal.g:2559:2: ( rule__Term__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_MULTIPLICATION_OP||(LA24_0>=42 && LA24_0<=44)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPascal.g:2559:3: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Term__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalPascal.g:2568:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2572:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalPascal.g:2573:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
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
    // InternalPascal.g:2580:1: rule__Term__Group_1__0__Impl : ( ( rule__Term__Alternatives_1_0 ) ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2584:1: ( ( ( rule__Term__Alternatives_1_0 ) ) )
            // InternalPascal.g:2585:1: ( ( rule__Term__Alternatives_1_0 ) )
            {
            // InternalPascal.g:2585:1: ( ( rule__Term__Alternatives_1_0 ) )
            // InternalPascal.g:2586:2: ( rule__Term__Alternatives_1_0 )
            {
             before(grammarAccess.getTermAccess().getAlternatives_1_0()); 
            // InternalPascal.g:2587:2: ( rule__Term__Alternatives_1_0 )
            // InternalPascal.g:2587:3: rule__Term__Alternatives_1_0
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
    // InternalPascal.g:2595:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2599:1: ( rule__Term__Group_1__1__Impl )
            // InternalPascal.g:2600:2: rule__Term__Group_1__1__Impl
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
    // InternalPascal.g:2606:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__FactorsAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2610:1: ( ( ( rule__Term__FactorsAssignment_1_1 ) ) )
            // InternalPascal.g:2611:1: ( ( rule__Term__FactorsAssignment_1_1 ) )
            {
            // InternalPascal.g:2611:1: ( ( rule__Term__FactorsAssignment_1_1 ) )
            // InternalPascal.g:2612:2: ( rule__Term__FactorsAssignment_1_1 )
            {
             before(grammarAccess.getTermAccess().getFactorsAssignment_1_1()); 
            // InternalPascal.g:2613:2: ( rule__Term__FactorsAssignment_1_1 )
            // InternalPascal.g:2613:3: rule__Term__FactorsAssignment_1_1
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
    // InternalPascal.g:2622:1: rule__Factor__Group_8__0 : rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1 ;
    public final void rule__Factor__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2626:1: ( rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1 )
            // InternalPascal.g:2627:2: rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1
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
    // InternalPascal.g:2634:1: rule__Factor__Group_8__0__Impl : ( '(' ) ;
    public final void rule__Factor__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2638:1: ( ( '(' ) )
            // InternalPascal.g:2639:1: ( '(' )
            {
            // InternalPascal.g:2639:1: ( '(' )
            // InternalPascal.g:2640:2: '('
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
    // InternalPascal.g:2649:1: rule__Factor__Group_8__1 : rule__Factor__Group_8__1__Impl rule__Factor__Group_8__2 ;
    public final void rule__Factor__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2653:1: ( rule__Factor__Group_8__1__Impl rule__Factor__Group_8__2 )
            // InternalPascal.g:2654:2: rule__Factor__Group_8__1__Impl rule__Factor__Group_8__2
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
    // InternalPascal.g:2661:1: rule__Factor__Group_8__1__Impl : ( ( rule__Factor__ExpressionAssignment_8_1 ) ) ;
    public final void rule__Factor__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2665:1: ( ( ( rule__Factor__ExpressionAssignment_8_1 ) ) )
            // InternalPascal.g:2666:1: ( ( rule__Factor__ExpressionAssignment_8_1 ) )
            {
            // InternalPascal.g:2666:1: ( ( rule__Factor__ExpressionAssignment_8_1 ) )
            // InternalPascal.g:2667:2: ( rule__Factor__ExpressionAssignment_8_1 )
            {
             before(grammarAccess.getFactorAccess().getExpressionAssignment_8_1()); 
            // InternalPascal.g:2668:2: ( rule__Factor__ExpressionAssignment_8_1 )
            // InternalPascal.g:2668:3: rule__Factor__ExpressionAssignment_8_1
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
    // InternalPascal.g:2676:1: rule__Factor__Group_8__2 : rule__Factor__Group_8__2__Impl ;
    public final void rule__Factor__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2680:1: ( rule__Factor__Group_8__2__Impl )
            // InternalPascal.g:2681:2: rule__Factor__Group_8__2__Impl
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
    // InternalPascal.g:2687:1: rule__Factor__Group_8__2__Impl : ( ')' ) ;
    public final void rule__Factor__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2691:1: ( ( ')' ) )
            // InternalPascal.g:2692:1: ( ')' )
            {
            // InternalPascal.g:2692:1: ( ')' )
            // InternalPascal.g:2693:2: ')'
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
    // InternalPascal.g:2703:1: rule__Factor__Group_9__0 : rule__Factor__Group_9__0__Impl rule__Factor__Group_9__1 ;
    public final void rule__Factor__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2707:1: ( rule__Factor__Group_9__0__Impl rule__Factor__Group_9__1 )
            // InternalPascal.g:2708:2: rule__Factor__Group_9__0__Impl rule__Factor__Group_9__1
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
    // InternalPascal.g:2715:1: rule__Factor__Group_9__0__Impl : ( 'not' ) ;
    public final void rule__Factor__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2719:1: ( ( 'not' ) )
            // InternalPascal.g:2720:1: ( 'not' )
            {
            // InternalPascal.g:2720:1: ( 'not' )
            // InternalPascal.g:2721:2: 'not'
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
    // InternalPascal.g:2730:1: rule__Factor__Group_9__1 : rule__Factor__Group_9__1__Impl ;
    public final void rule__Factor__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2734:1: ( rule__Factor__Group_9__1__Impl )
            // InternalPascal.g:2735:2: rule__Factor__Group_9__1__Impl
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
    // InternalPascal.g:2741:1: rule__Factor__Group_9__1__Impl : ( ( rule__Factor__NotAssignment_9_1 ) ) ;
    public final void rule__Factor__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2745:1: ( ( ( rule__Factor__NotAssignment_9_1 ) ) )
            // InternalPascal.g:2746:1: ( ( rule__Factor__NotAssignment_9_1 ) )
            {
            // InternalPascal.g:2746:1: ( ( rule__Factor__NotAssignment_9_1 ) )
            // InternalPascal.g:2747:2: ( rule__Factor__NotAssignment_9_1 )
            {
             before(grammarAccess.getFactorAccess().getNotAssignment_9_1()); 
            // InternalPascal.g:2748:2: ( rule__Factor__NotAssignment_9_1 )
            // InternalPascal.g:2748:3: rule__Factor__NotAssignment_9_1
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
    // InternalPascal.g:2757:1: rule__Function_designator__Group__0 : rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 ;
    public final void rule__Function_designator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2761:1: ( rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 )
            // InternalPascal.g:2762:2: rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1
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
    // InternalPascal.g:2769:1: rule__Function_designator__Group__0__Impl : ( ( rule__Function_designator__NameAssignment_0 ) ) ;
    public final void rule__Function_designator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2773:1: ( ( ( rule__Function_designator__NameAssignment_0 ) ) )
            // InternalPascal.g:2774:1: ( ( rule__Function_designator__NameAssignment_0 ) )
            {
            // InternalPascal.g:2774:1: ( ( rule__Function_designator__NameAssignment_0 ) )
            // InternalPascal.g:2775:2: ( rule__Function_designator__NameAssignment_0 )
            {
             before(grammarAccess.getFunction_designatorAccess().getNameAssignment_0()); 
            // InternalPascal.g:2776:2: ( rule__Function_designator__NameAssignment_0 )
            // InternalPascal.g:2776:3: rule__Function_designator__NameAssignment_0
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
    // InternalPascal.g:2784:1: rule__Function_designator__Group__1 : rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 ;
    public final void rule__Function_designator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2788:1: ( rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 )
            // InternalPascal.g:2789:2: rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2
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
    // InternalPascal.g:2796:1: rule__Function_designator__Group__1__Impl : ( '(' ) ;
    public final void rule__Function_designator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2800:1: ( ( '(' ) )
            // InternalPascal.g:2801:1: ( '(' )
            {
            // InternalPascal.g:2801:1: ( '(' )
            // InternalPascal.g:2802:2: '('
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
    // InternalPascal.g:2811:1: rule__Function_designator__Group__2 : rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 ;
    public final void rule__Function_designator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2815:1: ( rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 )
            // InternalPascal.g:2816:2: rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3
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
    // InternalPascal.g:2823:1: rule__Function_designator__Group__2__Impl : ( ( rule__Function_designator__ExpressionsAssignment_2 )? ) ;
    public final void rule__Function_designator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2827:1: ( ( ( rule__Function_designator__ExpressionsAssignment_2 )? ) )
            // InternalPascal.g:2828:1: ( ( rule__Function_designator__ExpressionsAssignment_2 )? )
            {
            // InternalPascal.g:2828:1: ( ( rule__Function_designator__ExpressionsAssignment_2 )? )
            // InternalPascal.g:2829:2: ( rule__Function_designator__ExpressionsAssignment_2 )?
            {
             before(grammarAccess.getFunction_designatorAccess().getExpressionsAssignment_2()); 
            // InternalPascal.g:2830:2: ( rule__Function_designator__ExpressionsAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_INTEGER_NUMBER)||LA25_0==RULE_ADDITION_OP||(LA25_0>=RULE_STRING && LA25_0<=RULE_REAL_NUMBER)||LA25_0==29||LA25_0==33||LA25_0==35||(LA25_0>=45 && LA25_0<=47)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPascal.g:2830:3: rule__Function_designator__ExpressionsAssignment_2
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
    // InternalPascal.g:2838:1: rule__Function_designator__Group__3 : rule__Function_designator__Group__3__Impl ;
    public final void rule__Function_designator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2842:1: ( rule__Function_designator__Group__3__Impl )
            // InternalPascal.g:2843:2: rule__Function_designator__Group__3__Impl
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
    // InternalPascal.g:2849:1: rule__Function_designator__Group__3__Impl : ( ')' ) ;
    public final void rule__Function_designator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2853:1: ( ( ')' ) )
            // InternalPascal.g:2854:1: ( ')' )
            {
            // InternalPascal.g:2854:1: ( ')' )
            // InternalPascal.g:2855:2: ')'
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
    // InternalPascal.g:2865:1: rule__Function_procedure_declaration__Group__0 : rule__Function_procedure_declaration__Group__0__Impl rule__Function_procedure_declaration__Group__1 ;
    public final void rule__Function_procedure_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2869:1: ( rule__Function_procedure_declaration__Group__0__Impl rule__Function_procedure_declaration__Group__1 )
            // InternalPascal.g:2870:2: rule__Function_procedure_declaration__Group__0__Impl rule__Function_procedure_declaration__Group__1
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
    // InternalPascal.g:2877:1: rule__Function_procedure_declaration__Group__0__Impl : ( ( rule__Function_procedure_declaration__Alternatives_0 ) ) ;
    public final void rule__Function_procedure_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2881:1: ( ( ( rule__Function_procedure_declaration__Alternatives_0 ) ) )
            // InternalPascal.g:2882:1: ( ( rule__Function_procedure_declaration__Alternatives_0 ) )
            {
            // InternalPascal.g:2882:1: ( ( rule__Function_procedure_declaration__Alternatives_0 ) )
            // InternalPascal.g:2883:2: ( rule__Function_procedure_declaration__Alternatives_0 )
            {
             before(grammarAccess.getFunction_procedure_declarationAccess().getAlternatives_0()); 
            // InternalPascal.g:2884:2: ( rule__Function_procedure_declaration__Alternatives_0 )
            // InternalPascal.g:2884:3: rule__Function_procedure_declaration__Alternatives_0
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
    // InternalPascal.g:2892:1: rule__Function_procedure_declaration__Group__1 : rule__Function_procedure_declaration__Group__1__Impl ;
    public final void rule__Function_procedure_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2896:1: ( rule__Function_procedure_declaration__Group__1__Impl )
            // InternalPascal.g:2897:2: rule__Function_procedure_declaration__Group__1__Impl
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
    // InternalPascal.g:2903:1: rule__Function_procedure_declaration__Group__1__Impl : ( ';' ) ;
    public final void rule__Function_procedure_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2907:1: ( ( ';' ) )
            // InternalPascal.g:2908:1: ( ';' )
            {
            // InternalPascal.g:2908:1: ( ';' )
            // InternalPascal.g:2909:2: ';'
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
    // InternalPascal.g:2919:1: rule__Function_heading__Group__0 : rule__Function_heading__Group__0__Impl rule__Function_heading__Group__1 ;
    public final void rule__Function_heading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2923:1: ( rule__Function_heading__Group__0__Impl rule__Function_heading__Group__1 )
            // InternalPascal.g:2924:2: rule__Function_heading__Group__0__Impl rule__Function_heading__Group__1
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
    // InternalPascal.g:2931:1: rule__Function_heading__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function_heading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2935:1: ( ( 'function' ) )
            // InternalPascal.g:2936:1: ( 'function' )
            {
            // InternalPascal.g:2936:1: ( 'function' )
            // InternalPascal.g:2937:2: 'function'
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
    // InternalPascal.g:2946:1: rule__Function_heading__Group__1 : rule__Function_heading__Group__1__Impl rule__Function_heading__Group__2 ;
    public final void rule__Function_heading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2950:1: ( rule__Function_heading__Group__1__Impl rule__Function_heading__Group__2 )
            // InternalPascal.g:2951:2: rule__Function_heading__Group__1__Impl rule__Function_heading__Group__2
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
    // InternalPascal.g:2958:1: rule__Function_heading__Group__1__Impl : ( ( rule__Function_heading__NameAssignment_1 ) ) ;
    public final void rule__Function_heading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2962:1: ( ( ( rule__Function_heading__NameAssignment_1 ) ) )
            // InternalPascal.g:2963:1: ( ( rule__Function_heading__NameAssignment_1 ) )
            {
            // InternalPascal.g:2963:1: ( ( rule__Function_heading__NameAssignment_1 ) )
            // InternalPascal.g:2964:2: ( rule__Function_heading__NameAssignment_1 )
            {
             before(grammarAccess.getFunction_headingAccess().getNameAssignment_1()); 
            // InternalPascal.g:2965:2: ( rule__Function_heading__NameAssignment_1 )
            // InternalPascal.g:2965:3: rule__Function_heading__NameAssignment_1
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
    // InternalPascal.g:2973:1: rule__Function_heading__Group__2 : rule__Function_heading__Group__2__Impl rule__Function_heading__Group__3 ;
    public final void rule__Function_heading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2977:1: ( rule__Function_heading__Group__2__Impl rule__Function_heading__Group__3 )
            // InternalPascal.g:2978:2: rule__Function_heading__Group__2__Impl rule__Function_heading__Group__3
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
    // InternalPascal.g:2985:1: rule__Function_heading__Group__2__Impl : ( ( rule__Function_heading__ParametersAssignment_2 )? ) ;
    public final void rule__Function_heading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2989:1: ( ( ( rule__Function_heading__ParametersAssignment_2 )? ) )
            // InternalPascal.g:2990:1: ( ( rule__Function_heading__ParametersAssignment_2 )? )
            {
            // InternalPascal.g:2990:1: ( ( rule__Function_heading__ParametersAssignment_2 )? )
            // InternalPascal.g:2991:2: ( rule__Function_heading__ParametersAssignment_2 )?
            {
             before(grammarAccess.getFunction_headingAccess().getParametersAssignment_2()); 
            // InternalPascal.g:2992:2: ( rule__Function_heading__ParametersAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPascal.g:2992:3: rule__Function_heading__ParametersAssignment_2
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
    // InternalPascal.g:3000:1: rule__Function_heading__Group__3 : rule__Function_heading__Group__3__Impl rule__Function_heading__Group__4 ;
    public final void rule__Function_heading__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3004:1: ( rule__Function_heading__Group__3__Impl rule__Function_heading__Group__4 )
            // InternalPascal.g:3005:2: rule__Function_heading__Group__3__Impl rule__Function_heading__Group__4
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
    // InternalPascal.g:3012:1: rule__Function_heading__Group__3__Impl : ( ':' ) ;
    public final void rule__Function_heading__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3016:1: ( ( ':' ) )
            // InternalPascal.g:3017:1: ( ':' )
            {
            // InternalPascal.g:3017:1: ( ':' )
            // InternalPascal.g:3018:2: ':'
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
    // InternalPascal.g:3027:1: rule__Function_heading__Group__4 : rule__Function_heading__Group__4__Impl ;
    public final void rule__Function_heading__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3031:1: ( rule__Function_heading__Group__4__Impl )
            // InternalPascal.g:3032:2: rule__Function_heading__Group__4__Impl
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
    // InternalPascal.g:3038:1: rule__Function_heading__Group__4__Impl : ( ( rule__Function_heading__ReturnTypeAssignment_4 ) ) ;
    public final void rule__Function_heading__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3042:1: ( ( ( rule__Function_heading__ReturnTypeAssignment_4 ) ) )
            // InternalPascal.g:3043:1: ( ( rule__Function_heading__ReturnTypeAssignment_4 ) )
            {
            // InternalPascal.g:3043:1: ( ( rule__Function_heading__ReturnTypeAssignment_4 ) )
            // InternalPascal.g:3044:2: ( rule__Function_heading__ReturnTypeAssignment_4 )
            {
             before(grammarAccess.getFunction_headingAccess().getReturnTypeAssignment_4()); 
            // InternalPascal.g:3045:2: ( rule__Function_heading__ReturnTypeAssignment_4 )
            // InternalPascal.g:3045:3: rule__Function_heading__ReturnTypeAssignment_4
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
    // InternalPascal.g:3054:1: rule__Function_declaration__Group__0 : rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1 ;
    public final void rule__Function_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3058:1: ( rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1 )
            // InternalPascal.g:3059:2: rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1
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
    // InternalPascal.g:3066:1: rule__Function_declaration__Group__0__Impl : ( ( rule__Function_declaration__HeadingAssignment_0 ) ) ;
    public final void rule__Function_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3070:1: ( ( ( rule__Function_declaration__HeadingAssignment_0 ) ) )
            // InternalPascal.g:3071:1: ( ( rule__Function_declaration__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:3071:1: ( ( rule__Function_declaration__HeadingAssignment_0 ) )
            // InternalPascal.g:3072:2: ( rule__Function_declaration__HeadingAssignment_0 )
            {
             before(grammarAccess.getFunction_declarationAccess().getHeadingAssignment_0()); 
            // InternalPascal.g:3073:2: ( rule__Function_declaration__HeadingAssignment_0 )
            // InternalPascal.g:3073:3: rule__Function_declaration__HeadingAssignment_0
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
    // InternalPascal.g:3081:1: rule__Function_declaration__Group__1 : rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2 ;
    public final void rule__Function_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3085:1: ( rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2 )
            // InternalPascal.g:3086:2: rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2
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
    // InternalPascal.g:3093:1: rule__Function_declaration__Group__1__Impl : ( ';' ) ;
    public final void rule__Function_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3097:1: ( ( ';' ) )
            // InternalPascal.g:3098:1: ( ';' )
            {
            // InternalPascal.g:3098:1: ( ';' )
            // InternalPascal.g:3099:2: ';'
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
    // InternalPascal.g:3108:1: rule__Function_declaration__Group__2 : rule__Function_declaration__Group__2__Impl ;
    public final void rule__Function_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3112:1: ( rule__Function_declaration__Group__2__Impl )
            // InternalPascal.g:3113:2: rule__Function_declaration__Group__2__Impl
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
    // InternalPascal.g:3119:1: rule__Function_declaration__Group__2__Impl : ( ( rule__Function_declaration__BlockAssignment_2 ) ) ;
    public final void rule__Function_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3123:1: ( ( ( rule__Function_declaration__BlockAssignment_2 ) ) )
            // InternalPascal.g:3124:1: ( ( rule__Function_declaration__BlockAssignment_2 ) )
            {
            // InternalPascal.g:3124:1: ( ( rule__Function_declaration__BlockAssignment_2 ) )
            // InternalPascal.g:3125:2: ( rule__Function_declaration__BlockAssignment_2 )
            {
             before(grammarAccess.getFunction_declarationAccess().getBlockAssignment_2()); 
            // InternalPascal.g:3126:2: ( rule__Function_declaration__BlockAssignment_2 )
            // InternalPascal.g:3126:3: rule__Function_declaration__BlockAssignment_2
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
    // InternalPascal.g:3135:1: rule__Formal_parameter_list__Group__0 : rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1 ;
    public final void rule__Formal_parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3139:1: ( rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1 )
            // InternalPascal.g:3140:2: rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1
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
    // InternalPascal.g:3147:1: rule__Formal_parameter_list__Group__0__Impl : ( '(' ) ;
    public final void rule__Formal_parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3151:1: ( ( '(' ) )
            // InternalPascal.g:3152:1: ( '(' )
            {
            // InternalPascal.g:3152:1: ( '(' )
            // InternalPascal.g:3153:2: '('
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
    // InternalPascal.g:3162:1: rule__Formal_parameter_list__Group__1 : rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2 ;
    public final void rule__Formal_parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3166:1: ( rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2 )
            // InternalPascal.g:3167:2: rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2
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
    // InternalPascal.g:3174:1: rule__Formal_parameter_list__Group__1__Impl : ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) ) ;
    public final void rule__Formal_parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3178:1: ( ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) ) )
            // InternalPascal.g:3179:1: ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) )
            {
            // InternalPascal.g:3179:1: ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) )
            // InternalPascal.g:3180:2: ( rule__Formal_parameter_list__ParametersAssignment_1 )
            {
             before(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_1()); 
            // InternalPascal.g:3181:2: ( rule__Formal_parameter_list__ParametersAssignment_1 )
            // InternalPascal.g:3181:3: rule__Formal_parameter_list__ParametersAssignment_1
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
    // InternalPascal.g:3189:1: rule__Formal_parameter_list__Group__2 : rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3 ;
    public final void rule__Formal_parameter_list__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3193:1: ( rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3 )
            // InternalPascal.g:3194:2: rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3
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
    // InternalPascal.g:3201:1: rule__Formal_parameter_list__Group__2__Impl : ( ( rule__Formal_parameter_list__Group_2__0 )* ) ;
    public final void rule__Formal_parameter_list__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3205:1: ( ( ( rule__Formal_parameter_list__Group_2__0 )* ) )
            // InternalPascal.g:3206:1: ( ( rule__Formal_parameter_list__Group_2__0 )* )
            {
            // InternalPascal.g:3206:1: ( ( rule__Formal_parameter_list__Group_2__0 )* )
            // InternalPascal.g:3207:2: ( rule__Formal_parameter_list__Group_2__0 )*
            {
             before(grammarAccess.getFormal_parameter_listAccess().getGroup_2()); 
            // InternalPascal.g:3208:2: ( rule__Formal_parameter_list__Group_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==24) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPascal.g:3208:3: rule__Formal_parameter_list__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Formal_parameter_list__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalPascal.g:3216:1: rule__Formal_parameter_list__Group__3 : rule__Formal_parameter_list__Group__3__Impl ;
    public final void rule__Formal_parameter_list__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3220:1: ( rule__Formal_parameter_list__Group__3__Impl )
            // InternalPascal.g:3221:2: rule__Formal_parameter_list__Group__3__Impl
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
    // InternalPascal.g:3227:1: rule__Formal_parameter_list__Group__3__Impl : ( ')' ) ;
    public final void rule__Formal_parameter_list__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3231:1: ( ( ')' ) )
            // InternalPascal.g:3232:1: ( ')' )
            {
            // InternalPascal.g:3232:1: ( ')' )
            // InternalPascal.g:3233:2: ')'
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
    // InternalPascal.g:3243:1: rule__Formal_parameter_list__Group_2__0 : rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1 ;
    public final void rule__Formal_parameter_list__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3247:1: ( rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1 )
            // InternalPascal.g:3248:2: rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1
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
    // InternalPascal.g:3255:1: rule__Formal_parameter_list__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Formal_parameter_list__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3259:1: ( ( ';' ) )
            // InternalPascal.g:3260:1: ( ';' )
            {
            // InternalPascal.g:3260:1: ( ';' )
            // InternalPascal.g:3261:2: ';'
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
    // InternalPascal.g:3270:1: rule__Formal_parameter_list__Group_2__1 : rule__Formal_parameter_list__Group_2__1__Impl ;
    public final void rule__Formal_parameter_list__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3274:1: ( rule__Formal_parameter_list__Group_2__1__Impl )
            // InternalPascal.g:3275:2: rule__Formal_parameter_list__Group_2__1__Impl
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
    // InternalPascal.g:3281:1: rule__Formal_parameter_list__Group_2__1__Impl : ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) ) ;
    public final void rule__Formal_parameter_list__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3285:1: ( ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) ) )
            // InternalPascal.g:3286:1: ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) )
            {
            // InternalPascal.g:3286:1: ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) )
            // InternalPascal.g:3287:2: ( rule__Formal_parameter_list__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_2_1()); 
            // InternalPascal.g:3288:2: ( rule__Formal_parameter_list__ParametersAssignment_2_1 )
            // InternalPascal.g:3288:3: rule__Formal_parameter_list__ParametersAssignment_2_1
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
    // InternalPascal.g:3297:1: rule__Value_parameter_section__Group__0 : rule__Value_parameter_section__Group__0__Impl rule__Value_parameter_section__Group__1 ;
    public final void rule__Value_parameter_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3301:1: ( rule__Value_parameter_section__Group__0__Impl rule__Value_parameter_section__Group__1 )
            // InternalPascal.g:3302:2: rule__Value_parameter_section__Group__0__Impl rule__Value_parameter_section__Group__1
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
    // InternalPascal.g:3309:1: rule__Value_parameter_section__Group__0__Impl : ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) ) ;
    public final void rule__Value_parameter_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3313:1: ( ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) ) )
            // InternalPascal.g:3314:1: ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) )
            {
            // InternalPascal.g:3314:1: ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) )
            // InternalPascal.g:3315:2: ( rule__Value_parameter_section__IdentifiersAssignment_0 )
            {
             before(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersAssignment_0()); 
            // InternalPascal.g:3316:2: ( rule__Value_parameter_section__IdentifiersAssignment_0 )
            // InternalPascal.g:3316:3: rule__Value_parameter_section__IdentifiersAssignment_0
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
    // InternalPascal.g:3324:1: rule__Value_parameter_section__Group__1 : rule__Value_parameter_section__Group__1__Impl rule__Value_parameter_section__Group__2 ;
    public final void rule__Value_parameter_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3328:1: ( rule__Value_parameter_section__Group__1__Impl rule__Value_parameter_section__Group__2 )
            // InternalPascal.g:3329:2: rule__Value_parameter_section__Group__1__Impl rule__Value_parameter_section__Group__2
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
    // InternalPascal.g:3336:1: rule__Value_parameter_section__Group__1__Impl : ( ':' ) ;
    public final void rule__Value_parameter_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3340:1: ( ( ':' ) )
            // InternalPascal.g:3341:1: ( ':' )
            {
            // InternalPascal.g:3341:1: ( ':' )
            // InternalPascal.g:3342:2: ':'
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
    // InternalPascal.g:3351:1: rule__Value_parameter_section__Group__2 : rule__Value_parameter_section__Group__2__Impl ;
    public final void rule__Value_parameter_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3355:1: ( rule__Value_parameter_section__Group__2__Impl )
            // InternalPascal.g:3356:2: rule__Value_parameter_section__Group__2__Impl
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
    // InternalPascal.g:3362:1: rule__Value_parameter_section__Group__2__Impl : ( ( rule__Value_parameter_section__TypeAssignment_2 ) ) ;
    public final void rule__Value_parameter_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3366:1: ( ( ( rule__Value_parameter_section__TypeAssignment_2 ) ) )
            // InternalPascal.g:3367:1: ( ( rule__Value_parameter_section__TypeAssignment_2 ) )
            {
            // InternalPascal.g:3367:1: ( ( rule__Value_parameter_section__TypeAssignment_2 ) )
            // InternalPascal.g:3368:2: ( rule__Value_parameter_section__TypeAssignment_2 )
            {
             before(grammarAccess.getValue_parameter_sectionAccess().getTypeAssignment_2()); 
            // InternalPascal.g:3369:2: ( rule__Value_parameter_section__TypeAssignment_2 )
            // InternalPascal.g:3369:3: rule__Value_parameter_section__TypeAssignment_2
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
    // InternalPascal.g:3378:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3382:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // InternalPascal.g:3383:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
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
    // InternalPascal.g:3390:1: rule__Identifier_list__Group__0__Impl : ( ( rule__Identifier_list__NamesAssignment_0 ) ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3394:1: ( ( ( rule__Identifier_list__NamesAssignment_0 ) ) )
            // InternalPascal.g:3395:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            {
            // InternalPascal.g:3395:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            // InternalPascal.g:3396:2: ( rule__Identifier_list__NamesAssignment_0 )
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_0()); 
            // InternalPascal.g:3397:2: ( rule__Identifier_list__NamesAssignment_0 )
            // InternalPascal.g:3397:3: rule__Identifier_list__NamesAssignment_0
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
    // InternalPascal.g:3405:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3409:1: ( rule__Identifier_list__Group__1__Impl )
            // InternalPascal.g:3410:2: rule__Identifier_list__Group__1__Impl
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
    // InternalPascal.g:3416:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3420:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // InternalPascal.g:3421:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // InternalPascal.g:3421:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // InternalPascal.g:3422:2: ( rule__Identifier_list__Group_1__0 )*
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            // InternalPascal.g:3423:2: ( rule__Identifier_list__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==32) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPascal.g:3423:3: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Identifier_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalPascal.g:3432:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3436:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // InternalPascal.g:3437:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
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
    // InternalPascal.g:3444:1: rule__Identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3448:1: ( ( ',' ) )
            // InternalPascal.g:3449:1: ( ',' )
            {
            // InternalPascal.g:3449:1: ( ',' )
            // InternalPascal.g:3450:2: ','
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
    // InternalPascal.g:3459:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3463:1: ( rule__Identifier_list__Group_1__1__Impl )
            // InternalPascal.g:3464:2: rule__Identifier_list__Group_1__1__Impl
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
    // InternalPascal.g:3470:1: rule__Identifier_list__Group_1__1__Impl : ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3474:1: ( ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) )
            // InternalPascal.g:3475:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            {
            // InternalPascal.g:3475:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            // InternalPascal.g:3476:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_1_1()); 
            // InternalPascal.g:3477:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            // InternalPascal.g:3477:3: rule__Identifier_list__NamesAssignment_1_1
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
    // InternalPascal.g:3486:1: rule__Variable_parameter_section__Group__0 : rule__Variable_parameter_section__Group__0__Impl rule__Variable_parameter_section__Group__1 ;
    public final void rule__Variable_parameter_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3490:1: ( rule__Variable_parameter_section__Group__0__Impl rule__Variable_parameter_section__Group__1 )
            // InternalPascal.g:3491:2: rule__Variable_parameter_section__Group__0__Impl rule__Variable_parameter_section__Group__1
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
    // InternalPascal.g:3498:1: rule__Variable_parameter_section__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable_parameter_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3502:1: ( ( 'var' ) )
            // InternalPascal.g:3503:1: ( 'var' )
            {
            // InternalPascal.g:3503:1: ( 'var' )
            // InternalPascal.g:3504:2: 'var'
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
    // InternalPascal.g:3513:1: rule__Variable_parameter_section__Group__1 : rule__Variable_parameter_section__Group__1__Impl rule__Variable_parameter_section__Group__2 ;
    public final void rule__Variable_parameter_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3517:1: ( rule__Variable_parameter_section__Group__1__Impl rule__Variable_parameter_section__Group__2 )
            // InternalPascal.g:3518:2: rule__Variable_parameter_section__Group__1__Impl rule__Variable_parameter_section__Group__2
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
    // InternalPascal.g:3525:1: rule__Variable_parameter_section__Group__1__Impl : ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) ) ;
    public final void rule__Variable_parameter_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3529:1: ( ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) ) )
            // InternalPascal.g:3530:1: ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) )
            {
            // InternalPascal.g:3530:1: ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) )
            // InternalPascal.g:3531:2: ( rule__Variable_parameter_section__IndentifiersAssignment_1 )
            {
             before(grammarAccess.getVariable_parameter_sectionAccess().getIndentifiersAssignment_1()); 
            // InternalPascal.g:3532:2: ( rule__Variable_parameter_section__IndentifiersAssignment_1 )
            // InternalPascal.g:3532:3: rule__Variable_parameter_section__IndentifiersAssignment_1
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
    // InternalPascal.g:3540:1: rule__Variable_parameter_section__Group__2 : rule__Variable_parameter_section__Group__2__Impl rule__Variable_parameter_section__Group__3 ;
    public final void rule__Variable_parameter_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3544:1: ( rule__Variable_parameter_section__Group__2__Impl rule__Variable_parameter_section__Group__3 )
            // InternalPascal.g:3545:2: rule__Variable_parameter_section__Group__2__Impl rule__Variable_parameter_section__Group__3
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
    // InternalPascal.g:3552:1: rule__Variable_parameter_section__Group__2__Impl : ( ':' ) ;
    public final void rule__Variable_parameter_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3556:1: ( ( ':' ) )
            // InternalPascal.g:3557:1: ( ':' )
            {
            // InternalPascal.g:3557:1: ( ':' )
            // InternalPascal.g:3558:2: ':'
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
    // InternalPascal.g:3567:1: rule__Variable_parameter_section__Group__3 : rule__Variable_parameter_section__Group__3__Impl ;
    public final void rule__Variable_parameter_section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3571:1: ( rule__Variable_parameter_section__Group__3__Impl )
            // InternalPascal.g:3572:2: rule__Variable_parameter_section__Group__3__Impl
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
    // InternalPascal.g:3578:1: rule__Variable_parameter_section__Group__3__Impl : ( ( rule__Variable_parameter_section__TypeAssignment_3 ) ) ;
    public final void rule__Variable_parameter_section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3582:1: ( ( ( rule__Variable_parameter_section__TypeAssignment_3 ) ) )
            // InternalPascal.g:3583:1: ( ( rule__Variable_parameter_section__TypeAssignment_3 ) )
            {
            // InternalPascal.g:3583:1: ( ( rule__Variable_parameter_section__TypeAssignment_3 ) )
            // InternalPascal.g:3584:2: ( rule__Variable_parameter_section__TypeAssignment_3 )
            {
             before(grammarAccess.getVariable_parameter_sectionAccess().getTypeAssignment_3()); 
            // InternalPascal.g:3585:2: ( rule__Variable_parameter_section__TypeAssignment_3 )
            // InternalPascal.g:3585:3: rule__Variable_parameter_section__TypeAssignment_3
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
    // InternalPascal.g:3594:1: rule__Procedure_declaration__Group__0 : rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1 ;
    public final void rule__Procedure_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3598:1: ( rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1 )
            // InternalPascal.g:3599:2: rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1
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
    // InternalPascal.g:3606:1: rule__Procedure_declaration__Group__0__Impl : ( ( rule__Procedure_declaration__HeadingAssignment_0 ) ) ;
    public final void rule__Procedure_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3610:1: ( ( ( rule__Procedure_declaration__HeadingAssignment_0 ) ) )
            // InternalPascal.g:3611:1: ( ( rule__Procedure_declaration__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:3611:1: ( ( rule__Procedure_declaration__HeadingAssignment_0 ) )
            // InternalPascal.g:3612:2: ( rule__Procedure_declaration__HeadingAssignment_0 )
            {
             before(grammarAccess.getProcedure_declarationAccess().getHeadingAssignment_0()); 
            // InternalPascal.g:3613:2: ( rule__Procedure_declaration__HeadingAssignment_0 )
            // InternalPascal.g:3613:3: rule__Procedure_declaration__HeadingAssignment_0
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
    // InternalPascal.g:3621:1: rule__Procedure_declaration__Group__1 : rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2 ;
    public final void rule__Procedure_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3625:1: ( rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2 )
            // InternalPascal.g:3626:2: rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2
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
    // InternalPascal.g:3633:1: rule__Procedure_declaration__Group__1__Impl : ( ';' ) ;
    public final void rule__Procedure_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3637:1: ( ( ';' ) )
            // InternalPascal.g:3638:1: ( ';' )
            {
            // InternalPascal.g:3638:1: ( ';' )
            // InternalPascal.g:3639:2: ';'
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
    // InternalPascal.g:3648:1: rule__Procedure_declaration__Group__2 : rule__Procedure_declaration__Group__2__Impl ;
    public final void rule__Procedure_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3652:1: ( rule__Procedure_declaration__Group__2__Impl )
            // InternalPascal.g:3653:2: rule__Procedure_declaration__Group__2__Impl
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
    // InternalPascal.g:3659:1: rule__Procedure_declaration__Group__2__Impl : ( ( rule__Procedure_declaration__BlockAssignment_2 ) ) ;
    public final void rule__Procedure_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3663:1: ( ( ( rule__Procedure_declaration__BlockAssignment_2 ) ) )
            // InternalPascal.g:3664:1: ( ( rule__Procedure_declaration__BlockAssignment_2 ) )
            {
            // InternalPascal.g:3664:1: ( ( rule__Procedure_declaration__BlockAssignment_2 ) )
            // InternalPascal.g:3665:2: ( rule__Procedure_declaration__BlockAssignment_2 )
            {
             before(grammarAccess.getProcedure_declarationAccess().getBlockAssignment_2()); 
            // InternalPascal.g:3666:2: ( rule__Procedure_declaration__BlockAssignment_2 )
            // InternalPascal.g:3666:3: rule__Procedure_declaration__BlockAssignment_2
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
    // InternalPascal.g:3675:1: rule__Procedure_heading__Group__0 : rule__Procedure_heading__Group__0__Impl rule__Procedure_heading__Group__1 ;
    public final void rule__Procedure_heading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3679:1: ( rule__Procedure_heading__Group__0__Impl rule__Procedure_heading__Group__1 )
            // InternalPascal.g:3680:2: rule__Procedure_heading__Group__0__Impl rule__Procedure_heading__Group__1
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
    // InternalPascal.g:3687:1: rule__Procedure_heading__Group__0__Impl : ( 'procedure' ) ;
    public final void rule__Procedure_heading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3691:1: ( ( 'procedure' ) )
            // InternalPascal.g:3692:1: ( 'procedure' )
            {
            // InternalPascal.g:3692:1: ( 'procedure' )
            // InternalPascal.g:3693:2: 'procedure'
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
    // InternalPascal.g:3702:1: rule__Procedure_heading__Group__1 : rule__Procedure_heading__Group__1__Impl rule__Procedure_heading__Group__2 ;
    public final void rule__Procedure_heading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3706:1: ( rule__Procedure_heading__Group__1__Impl rule__Procedure_heading__Group__2 )
            // InternalPascal.g:3707:2: rule__Procedure_heading__Group__1__Impl rule__Procedure_heading__Group__2
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
    // InternalPascal.g:3714:1: rule__Procedure_heading__Group__1__Impl : ( ( rule__Procedure_heading__NameAssignment_1 ) ) ;
    public final void rule__Procedure_heading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3718:1: ( ( ( rule__Procedure_heading__NameAssignment_1 ) ) )
            // InternalPascal.g:3719:1: ( ( rule__Procedure_heading__NameAssignment_1 ) )
            {
            // InternalPascal.g:3719:1: ( ( rule__Procedure_heading__NameAssignment_1 ) )
            // InternalPascal.g:3720:2: ( rule__Procedure_heading__NameAssignment_1 )
            {
             before(grammarAccess.getProcedure_headingAccess().getNameAssignment_1()); 
            // InternalPascal.g:3721:2: ( rule__Procedure_heading__NameAssignment_1 )
            // InternalPascal.g:3721:3: rule__Procedure_heading__NameAssignment_1
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
    // InternalPascal.g:3729:1: rule__Procedure_heading__Group__2 : rule__Procedure_heading__Group__2__Impl ;
    public final void rule__Procedure_heading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3733:1: ( rule__Procedure_heading__Group__2__Impl )
            // InternalPascal.g:3734:2: rule__Procedure_heading__Group__2__Impl
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
    // InternalPascal.g:3740:1: rule__Procedure_heading__Group__2__Impl : ( ( rule__Procedure_heading__ParametersAssignment_2 )? ) ;
    public final void rule__Procedure_heading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3744:1: ( ( ( rule__Procedure_heading__ParametersAssignment_2 )? ) )
            // InternalPascal.g:3745:1: ( ( rule__Procedure_heading__ParametersAssignment_2 )? )
            {
            // InternalPascal.g:3745:1: ( ( rule__Procedure_heading__ParametersAssignment_2 )? )
            // InternalPascal.g:3746:2: ( rule__Procedure_heading__ParametersAssignment_2 )?
            {
             before(grammarAccess.getProcedure_headingAccess().getParametersAssignment_2()); 
            // InternalPascal.g:3747:2: ( rule__Procedure_heading__ParametersAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPascal.g:3747:3: rule__Procedure_heading__ParametersAssignment_2
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
    // InternalPascal.g:3756:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3760:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // InternalPascal.g:3761:2: rule__Set__Group__0__Impl rule__Set__Group__1
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
    // InternalPascal.g:3768:1: rule__Set__Group__0__Impl : ( ( rule__Set__BracketsAssignment_0 ) ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3772:1: ( ( ( rule__Set__BracketsAssignment_0 ) ) )
            // InternalPascal.g:3773:1: ( ( rule__Set__BracketsAssignment_0 ) )
            {
            // InternalPascal.g:3773:1: ( ( rule__Set__BracketsAssignment_0 ) )
            // InternalPascal.g:3774:2: ( rule__Set__BracketsAssignment_0 )
            {
             before(grammarAccess.getSetAccess().getBracketsAssignment_0()); 
            // InternalPascal.g:3775:2: ( rule__Set__BracketsAssignment_0 )
            // InternalPascal.g:3775:3: rule__Set__BracketsAssignment_0
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
    // InternalPascal.g:3783:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3787:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // InternalPascal.g:3788:2: rule__Set__Group__1__Impl rule__Set__Group__2
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
    // InternalPascal.g:3795:1: rule__Set__Group__1__Impl : ( ( rule__Set__ExpressionsAssignment_1 )? ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3799:1: ( ( ( rule__Set__ExpressionsAssignment_1 )? ) )
            // InternalPascal.g:3800:1: ( ( rule__Set__ExpressionsAssignment_1 )? )
            {
            // InternalPascal.g:3800:1: ( ( rule__Set__ExpressionsAssignment_1 )? )
            // InternalPascal.g:3801:2: ( rule__Set__ExpressionsAssignment_1 )?
            {
             before(grammarAccess.getSetAccess().getExpressionsAssignment_1()); 
            // InternalPascal.g:3802:2: ( rule__Set__ExpressionsAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_INTEGER_NUMBER)||LA30_0==RULE_ADDITION_OP||(LA30_0>=RULE_STRING && LA30_0<=RULE_REAL_NUMBER)||LA30_0==29||LA30_0==33||LA30_0==35||(LA30_0>=45 && LA30_0<=47)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPascal.g:3802:3: rule__Set__ExpressionsAssignment_1
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
    // InternalPascal.g:3810:1: rule__Set__Group__2 : rule__Set__Group__2__Impl ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3814:1: ( rule__Set__Group__2__Impl )
            // InternalPascal.g:3815:2: rule__Set__Group__2__Impl
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
    // InternalPascal.g:3821:1: rule__Set__Group__2__Impl : ( ( rule__Set__BracketsAssignment_2 ) ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3825:1: ( ( ( rule__Set__BracketsAssignment_2 ) ) )
            // InternalPascal.g:3826:1: ( ( rule__Set__BracketsAssignment_2 ) )
            {
            // InternalPascal.g:3826:1: ( ( rule__Set__BracketsAssignment_2 ) )
            // InternalPascal.g:3827:2: ( rule__Set__BracketsAssignment_2 )
            {
             before(grammarAccess.getSetAccess().getBracketsAssignment_2()); 
            // InternalPascal.g:3828:2: ( rule__Set__BracketsAssignment_2 )
            // InternalPascal.g:3828:3: rule__Set__BracketsAssignment_2
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


    // $ANTLR start "rule__Pascal__ProgramAssignment"
    // InternalPascal.g:3837:1: rule__Pascal__ProgramAssignment : ( ruleprogram ) ;
    public final void rule__Pascal__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3841:1: ( ( ruleprogram ) )
            // InternalPascal.g:3842:2: ( ruleprogram )
            {
            // InternalPascal.g:3842:2: ( ruleprogram )
            // InternalPascal.g:3843:3: ruleprogram
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
    // InternalPascal.g:3852:1: rule__Program__HeadingAssignment_0 : ( ruleprogram_heading_block ) ;
    public final void rule__Program__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3856:1: ( ( ruleprogram_heading_block ) )
            // InternalPascal.g:3857:2: ( ruleprogram_heading_block )
            {
            // InternalPascal.g:3857:2: ( ruleprogram_heading_block )
            // InternalPascal.g:3858:3: ruleprogram_heading_block
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
    // InternalPascal.g:3867:1: rule__Program__BlockAssignment_1 : ( ruleblock ) ;
    public final void rule__Program__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3871:1: ( ( ruleblock ) )
            // InternalPascal.g:3872:2: ( ruleblock )
            {
            // InternalPascal.g:3872:2: ( ruleblock )
            // InternalPascal.g:3873:3: ruleblock
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
    // InternalPascal.g:3882:1: rule__Program_heading_block__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program_heading_block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3886:1: ( ( RULE_ID ) )
            // InternalPascal.g:3887:2: ( RULE_ID )
            {
            // InternalPascal.g:3887:2: ( RULE_ID )
            // InternalPascal.g:3888:3: RULE_ID
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


    // $ANTLR start "rule__Block__AbstractionAssignment_0"
    // InternalPascal.g:3897:1: rule__Block__AbstractionAssignment_0 : ( rulefunction_procedure_declaration ) ;
    public final void rule__Block__AbstractionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3901:1: ( ( rulefunction_procedure_declaration ) )
            // InternalPascal.g:3902:2: ( rulefunction_procedure_declaration )
            {
            // InternalPascal.g:3902:2: ( rulefunction_procedure_declaration )
            // InternalPascal.g:3903:3: rulefunction_procedure_declaration
            {
             before(grammarAccess.getBlockAccess().getAbstractionFunction_procedure_declarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulefunction_procedure_declaration();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getAbstractionFunction_procedure_declarationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__AbstractionAssignment_0"


    // $ANTLR start "rule__Block__StatementAssignment_1"
    // InternalPascal.g:3912:1: rule__Block__StatementAssignment_1 : ( rulestatement_part ) ;
    public final void rule__Block__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3916:1: ( ( rulestatement_part ) )
            // InternalPascal.g:3917:2: ( rulestatement_part )
            {
            // InternalPascal.g:3917:2: ( rulestatement_part )
            // InternalPascal.g:3918:3: rulestatement_part
            {
             before(grammarAccess.getBlockAccess().getStatementStatement_partParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulestatement_part();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatementStatement_partParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__StatementAssignment_1"


    // $ANTLR start "rule__Statement_part__SequenceAssignment_1"
    // InternalPascal.g:3927:1: rule__Statement_part__SequenceAssignment_1 : ( rulestatement_sequence ) ;
    public final void rule__Statement_part__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3931:1: ( ( rulestatement_sequence ) )
            // InternalPascal.g:3932:2: ( rulestatement_sequence )
            {
            // InternalPascal.g:3932:2: ( rulestatement_sequence )
            // InternalPascal.g:3933:3: rulestatement_sequence
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
    // InternalPascal.g:3942:1: rule__Statement_sequence__StatementsAssignment_0 : ( rulestatement ) ;
    public final void rule__Statement_sequence__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3946:1: ( ( rulestatement ) )
            // InternalPascal.g:3947:2: ( rulestatement )
            {
            // InternalPascal.g:3947:2: ( rulestatement )
            // InternalPascal.g:3948:3: rulestatement
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
    // InternalPascal.g:3957:1: rule__Statement_sequence__StatementsAssignment_1_1 : ( rulestatement ) ;
    public final void rule__Statement_sequence__StatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3961:1: ( ( rulestatement ) )
            // InternalPascal.g:3962:2: ( rulestatement )
            {
            // InternalPascal.g:3962:2: ( rulestatement )
            // InternalPascal.g:3963:3: rulestatement
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
    // InternalPascal.g:3972:1: rule__Statement__LabelAssignment_0_0 : ( rulelabel ) ;
    public final void rule__Statement__LabelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3976:1: ( ( rulelabel ) )
            // InternalPascal.g:3977:2: ( rulelabel )
            {
            // InternalPascal.g:3977:2: ( rulelabel )
            // InternalPascal.g:3978:3: rulelabel
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
    // InternalPascal.g:3987:1: rule__Statement__SimpleAssignment_1 : ( rulesimple_statement ) ;
    public final void rule__Statement__SimpleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3991:1: ( ( rulesimple_statement ) )
            // InternalPascal.g:3992:2: ( rulesimple_statement )
            {
            // InternalPascal.g:3992:2: ( rulesimple_statement )
            // InternalPascal.g:3993:3: rulesimple_statement
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
    // InternalPascal.g:4002:1: rule__Simple_statement__AssignmentAssignment_0 : ( ruleassignment_statement ) ;
    public final void rule__Simple_statement__AssignmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4006:1: ( ( ruleassignment_statement ) )
            // InternalPascal.g:4007:2: ( ruleassignment_statement )
            {
            // InternalPascal.g:4007:2: ( ruleassignment_statement )
            // InternalPascal.g:4008:3: ruleassignment_statement
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
    // InternalPascal.g:4017:1: rule__Simple_statement__FunctionAssignment_1 : ( rulefunction_designator ) ;
    public final void rule__Simple_statement__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4021:1: ( ( rulefunction_designator ) )
            // InternalPascal.g:4022:2: ( rulefunction_designator )
            {
            // InternalPascal.g:4022:2: ( rulefunction_designator )
            // InternalPascal.g:4023:3: rulefunction_designator
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
    // InternalPascal.g:4032:1: rule__Simple_statement__Function_noargsAssignment_2 : ( RULE_ID ) ;
    public final void rule__Simple_statement__Function_noargsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4036:1: ( ( RULE_ID ) )
            // InternalPascal.g:4037:2: ( RULE_ID )
            {
            // InternalPascal.g:4037:2: ( RULE_ID )
            // InternalPascal.g:4038:3: RULE_ID
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
    // InternalPascal.g:4047:1: rule__Assignment_statement__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Assignment_statement__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4051:1: ( ( rulevariable ) )
            // InternalPascal.g:4052:2: ( rulevariable )
            {
            // InternalPascal.g:4052:2: ( rulevariable )
            // InternalPascal.g:4053:3: rulevariable
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
    // InternalPascal.g:4062:1: rule__Assignment_statement__ExpressionAssignment_2 : ( ruleexpression ) ;
    public final void rule__Assignment_statement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4066:1: ( ( ruleexpression ) )
            // InternalPascal.g:4067:2: ( ruleexpression )
            {
            // InternalPascal.g:4067:2: ( ruleexpression )
            // InternalPascal.g:4068:3: ruleexpression
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
    // InternalPascal.g:4077:1: rule__Label__NumberAssignment_0 : ( RULE_SIGNED_INTEGER_NUMBER ) ;
    public final void rule__Label__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4081:1: ( ( RULE_SIGNED_INTEGER_NUMBER ) )
            // InternalPascal.g:4082:2: ( RULE_SIGNED_INTEGER_NUMBER )
            {
            // InternalPascal.g:4082:2: ( RULE_SIGNED_INTEGER_NUMBER )
            // InternalPascal.g:4083:3: RULE_SIGNED_INTEGER_NUMBER
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
    // InternalPascal.g:4092:1: rule__Label__NumberAssignment_1 : ( RULE_INTEGER_NUMBER ) ;
    public final void rule__Label__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4096:1: ( ( RULE_INTEGER_NUMBER ) )
            // InternalPascal.g:4097:2: ( RULE_INTEGER_NUMBER )
            {
            // InternalPascal.g:4097:2: ( RULE_INTEGER_NUMBER )
            // InternalPascal.g:4098:3: RULE_INTEGER_NUMBER
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
    // InternalPascal.g:4107:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4111:1: ( ( RULE_ID ) )
            // InternalPascal.g:4112:2: ( RULE_ID )
            {
            // InternalPascal.g:4112:2: ( RULE_ID )
            // InternalPascal.g:4113:3: RULE_ID
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
    // InternalPascal.g:4122:1: rule__Variable__VariableAssignment_1 : ( rulevar_ ) ;
    public final void rule__Variable__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4126:1: ( ( rulevar_ ) )
            // InternalPascal.g:4127:2: ( rulevar_ )
            {
            // InternalPascal.g:4127:2: ( rulevar_ )
            // InternalPascal.g:4128:3: rulevar_
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
    // InternalPascal.g:4137:1: rule__Var___ExpressionsAssignment_0_1 : ( ruleexpression_list ) ;
    public final void rule__Var___ExpressionsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4141:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:4142:2: ( ruleexpression_list )
            {
            // InternalPascal.g:4142:2: ( ruleexpression_list )
            // InternalPascal.g:4143:3: ruleexpression_list
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
    // InternalPascal.g:4152:1: rule__Var___ArrayAssignment_0_3 : ( rulevar_ ) ;
    public final void rule__Var___ArrayAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4156:1: ( ( rulevar_ ) )
            // InternalPascal.g:4157:2: ( rulevar_ )
            {
            // InternalPascal.g:4157:2: ( rulevar_ )
            // InternalPascal.g:4158:3: rulevar_
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
    // InternalPascal.g:4167:1: rule__Var___AccessorAssignment_1_0 : ( ( '.' ) ) ;
    public final void rule__Var___AccessorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4171:1: ( ( ( '.' ) ) )
            // InternalPascal.g:4172:2: ( ( '.' ) )
            {
            // InternalPascal.g:4172:2: ( ( '.' ) )
            // InternalPascal.g:4173:3: ( '.' )
            {
             before(grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0()); 
            // InternalPascal.g:4174:3: ( '.' )
            // InternalPascal.g:4175:4: '.'
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
    // InternalPascal.g:4186:1: rule__Var___NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Var___NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4190:1: ( ( RULE_ID ) )
            // InternalPascal.g:4191:2: ( RULE_ID )
            {
            // InternalPascal.g:4191:2: ( RULE_ID )
            // InternalPascal.g:4192:3: RULE_ID
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
    // InternalPascal.g:4201:1: rule__Var___VariableAssignment_1_2 : ( rulevar_ ) ;
    public final void rule__Var___VariableAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4205:1: ( ( rulevar_ ) )
            // InternalPascal.g:4206:2: ( rulevar_ )
            {
            // InternalPascal.g:4206:2: ( rulevar_ )
            // InternalPascal.g:4207:3: rulevar_
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
    // InternalPascal.g:4216:1: rule__Var___PointerAssignment_2_1 : ( rulevar_ ) ;
    public final void rule__Var___PointerAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4220:1: ( ( rulevar_ ) )
            // InternalPascal.g:4221:2: ( rulevar_ )
            {
            // InternalPascal.g:4221:2: ( rulevar_ )
            // InternalPascal.g:4222:3: rulevar_
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
    // InternalPascal.g:4231:1: rule__Expression_list__ExpressionsAssignment_0 : ( ruleexpression ) ;
    public final void rule__Expression_list__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4235:1: ( ( ruleexpression ) )
            // InternalPascal.g:4236:2: ( ruleexpression )
            {
            // InternalPascal.g:4236:2: ( ruleexpression )
            // InternalPascal.g:4237:3: ruleexpression
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
    // InternalPascal.g:4246:1: rule__Expression_list__ExpressionsAssignment_1_1 : ( ruleexpression ) ;
    public final void rule__Expression_list__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4250:1: ( ( ruleexpression ) )
            // InternalPascal.g:4251:2: ( ruleexpression )
            {
            // InternalPascal.g:4251:2: ( ruleexpression )
            // InternalPascal.g:4252:3: ruleexpression
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
    // InternalPascal.g:4261:1: rule__Expression__ExpressionsAssignment_0 : ( rulesimple_expression ) ;
    public final void rule__Expression__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4265:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:4266:2: ( rulesimple_expression )
            {
            // InternalPascal.g:4266:2: ( rulesimple_expression )
            // InternalPascal.g:4267:3: rulesimple_expression
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
    // InternalPascal.g:4276:1: rule__Expression__OperatorsAssignment_1_0_0 : ( RULE_RELATIONAL_OP ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4280:1: ( ( RULE_RELATIONAL_OP ) )
            // InternalPascal.g:4281:2: ( RULE_RELATIONAL_OP )
            {
            // InternalPascal.g:4281:2: ( RULE_RELATIONAL_OP )
            // InternalPascal.g:4282:3: RULE_RELATIONAL_OP
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
    // InternalPascal.g:4291:1: rule__Expression__OperatorsAssignment_1_0_1 : ( ( 'in' ) ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4295:1: ( ( ( 'in' ) ) )
            // InternalPascal.g:4296:2: ( ( 'in' ) )
            {
            // InternalPascal.g:4296:2: ( ( 'in' ) )
            // InternalPascal.g:4297:3: ( 'in' )
            {
             before(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 
            // InternalPascal.g:4298:3: ( 'in' )
            // InternalPascal.g:4299:4: 'in'
            {
             before(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalPascal.g:4310:1: rule__Expression__OperatorsAssignment_1_0_2 : ( ( '=' ) ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4314:1: ( ( ( '=' ) ) )
            // InternalPascal.g:4315:2: ( ( '=' ) )
            {
            // InternalPascal.g:4315:2: ( ( '=' ) )
            // InternalPascal.g:4316:3: ( '=' )
            {
             before(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 
            // InternalPascal.g:4317:3: ( '=' )
            // InternalPascal.g:4318:4: '='
            {
             before(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalPascal.g:4329:1: rule__Expression__ExpressionsAssignment_1_1 : ( rulesimple_expression ) ;
    public final void rule__Expression__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4333:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:4334:2: ( rulesimple_expression )
            {
            // InternalPascal.g:4334:2: ( rulesimple_expression )
            // InternalPascal.g:4335:3: rulesimple_expression
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
    // InternalPascal.g:4344:1: rule__Simple_expression__PrefixOperatorAssignment_0 : ( RULE_ADDITION_OP ) ;
    public final void rule__Simple_expression__PrefixOperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4348:1: ( ( RULE_ADDITION_OP ) )
            // InternalPascal.g:4349:2: ( RULE_ADDITION_OP )
            {
            // InternalPascal.g:4349:2: ( RULE_ADDITION_OP )
            // InternalPascal.g:4350:3: RULE_ADDITION_OP
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
    // InternalPascal.g:4359:1: rule__Simple_expression__TermsAssignment_1 : ( ruleterm ) ;
    public final void rule__Simple_expression__TermsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4363:1: ( ( ruleterm ) )
            // InternalPascal.g:4364:2: ( ruleterm )
            {
            // InternalPascal.g:4364:2: ( ruleterm )
            // InternalPascal.g:4365:3: ruleterm
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
    // InternalPascal.g:4374:1: rule__Simple_expression__OperatorsAssignment_2_0_0_0 : ( RULE_ADDITION_OP ) ;
    public final void rule__Simple_expression__OperatorsAssignment_2_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4378:1: ( ( RULE_ADDITION_OP ) )
            // InternalPascal.g:4379:2: ( RULE_ADDITION_OP )
            {
            // InternalPascal.g:4379:2: ( RULE_ADDITION_OP )
            // InternalPascal.g:4380:3: RULE_ADDITION_OP
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
    // InternalPascal.g:4389:1: rule__Simple_expression__OperatorsAssignment_2_0_0_1 : ( ( 'or' ) ) ;
    public final void rule__Simple_expression__OperatorsAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4393:1: ( ( ( 'or' ) ) )
            // InternalPascal.g:4394:2: ( ( 'or' ) )
            {
            // InternalPascal.g:4394:2: ( ( 'or' ) )
            // InternalPascal.g:4395:3: ( 'or' )
            {
             before(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 
            // InternalPascal.g:4396:3: ( 'or' )
            // InternalPascal.g:4397:4: 'or'
            {
             before(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalPascal.g:4408:1: rule__Simple_expression__TermsAssignment_2_0_1 : ( ruleterm ) ;
    public final void rule__Simple_expression__TermsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4412:1: ( ( ruleterm ) )
            // InternalPascal.g:4413:2: ( ruleterm )
            {
            // InternalPascal.g:4413:2: ( ruleterm )
            // InternalPascal.g:4414:3: ruleterm
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
    // InternalPascal.g:4423:1: rule__Simple_expression__TermsAssignment_2_1 : ( ruleunsigned_number ) ;
    public final void rule__Simple_expression__TermsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4427:1: ( ( ruleunsigned_number ) )
            // InternalPascal.g:4428:2: ( ruleunsigned_number )
            {
            // InternalPascal.g:4428:2: ( ruleunsigned_number )
            // InternalPascal.g:4429:3: ruleunsigned_number
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
    // InternalPascal.g:4438:1: rule__Term__FactorsAssignment_0 : ( rulefactor ) ;
    public final void rule__Term__FactorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4442:1: ( ( rulefactor ) )
            // InternalPascal.g:4443:2: ( rulefactor )
            {
            // InternalPascal.g:4443:2: ( rulefactor )
            // InternalPascal.g:4444:3: rulefactor
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
    // InternalPascal.g:4453:1: rule__Term__OperatorsAssignment_1_0_0 : ( RULE_MULTIPLICATION_OP ) ;
    public final void rule__Term__OperatorsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4457:1: ( ( RULE_MULTIPLICATION_OP ) )
            // InternalPascal.g:4458:2: ( RULE_MULTIPLICATION_OP )
            {
            // InternalPascal.g:4458:2: ( RULE_MULTIPLICATION_OP )
            // InternalPascal.g:4459:3: RULE_MULTIPLICATION_OP
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
    // InternalPascal.g:4468:1: rule__Term__OperatorsAssignment_1_0_1 : ( ( 'div' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4472:1: ( ( ( 'div' ) ) )
            // InternalPascal.g:4473:2: ( ( 'div' ) )
            {
            // InternalPascal.g:4473:2: ( ( 'div' ) )
            // InternalPascal.g:4474:3: ( 'div' )
            {
             before(grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0()); 
            // InternalPascal.g:4475:3: ( 'div' )
            // InternalPascal.g:4476:4: 'div'
            {
             before(grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalPascal.g:4487:1: rule__Term__OperatorsAssignment_1_0_2 : ( ( 'mod' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4491:1: ( ( ( 'mod' ) ) )
            // InternalPascal.g:4492:2: ( ( 'mod' ) )
            {
            // InternalPascal.g:4492:2: ( ( 'mod' ) )
            // InternalPascal.g:4493:3: ( 'mod' )
            {
             before(grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0()); 
            // InternalPascal.g:4494:3: ( 'mod' )
            // InternalPascal.g:4495:4: 'mod'
            {
             before(grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalPascal.g:4506:1: rule__Term__OperatorsAssignment_1_0_3 : ( ( 'and' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4510:1: ( ( ( 'and' ) ) )
            // InternalPascal.g:4511:2: ( ( 'and' ) )
            {
            // InternalPascal.g:4511:2: ( ( 'and' ) )
            // InternalPascal.g:4512:3: ( 'and' )
            {
             before(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0()); 
            // InternalPascal.g:4513:3: ( 'and' )
            // InternalPascal.g:4514:4: 'and'
            {
             before(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalPascal.g:4525:1: rule__Term__FactorsAssignment_1_1 : ( rulefactor ) ;
    public final void rule__Term__FactorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4529:1: ( ( rulefactor ) )
            // InternalPascal.g:4530:2: ( rulefactor )
            {
            // InternalPascal.g:4530:2: ( rulefactor )
            // InternalPascal.g:4531:3: rulefactor
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
    // InternalPascal.g:4540:1: rule__Factor__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Factor__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4544:1: ( ( rulevariable ) )
            // InternalPascal.g:4545:2: ( rulevariable )
            {
            // InternalPascal.g:4545:2: ( rulevariable )
            // InternalPascal.g:4546:3: rulevariable
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
    // InternalPascal.g:4555:1: rule__Factor__NumberAssignment_1 : ( rulenumber ) ;
    public final void rule__Factor__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4559:1: ( ( rulenumber ) )
            // InternalPascal.g:4560:2: ( rulenumber )
            {
            // InternalPascal.g:4560:2: ( rulenumber )
            // InternalPascal.g:4561:3: rulenumber
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
    // InternalPascal.g:4570:1: rule__Factor__StringAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Factor__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4574:1: ( ( RULE_STRING ) )
            // InternalPascal.g:4575:2: ( RULE_STRING )
            {
            // InternalPascal.g:4575:2: ( RULE_STRING )
            // InternalPascal.g:4576:3: RULE_STRING
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
    // InternalPascal.g:4585:1: rule__Factor__SetAssignment_3 : ( ruleset ) ;
    public final void rule__Factor__SetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4589:1: ( ( ruleset ) )
            // InternalPascal.g:4590:2: ( ruleset )
            {
            // InternalPascal.g:4590:2: ( ruleset )
            // InternalPascal.g:4591:3: ruleset
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
    // InternalPascal.g:4600:1: rule__Factor__NilAssignment_4 : ( ( 'nil' ) ) ;
    public final void rule__Factor__NilAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4604:1: ( ( ( 'nil' ) ) )
            // InternalPascal.g:4605:2: ( ( 'nil' ) )
            {
            // InternalPascal.g:4605:2: ( ( 'nil' ) )
            // InternalPascal.g:4606:3: ( 'nil' )
            {
             before(grammarAccess.getFactorAccess().getNilNilKeyword_4_0()); 
            // InternalPascal.g:4607:3: ( 'nil' )
            // InternalPascal.g:4608:4: 'nil'
            {
             before(grammarAccess.getFactorAccess().getNilNilKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalPascal.g:4619:1: rule__Factor__BooleanAssignment_5 : ( ( 'true' ) ) ;
    public final void rule__Factor__BooleanAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4623:1: ( ( ( 'true' ) ) )
            // InternalPascal.g:4624:2: ( ( 'true' ) )
            {
            // InternalPascal.g:4624:2: ( ( 'true' ) )
            // InternalPascal.g:4625:3: ( 'true' )
            {
             before(grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0()); 
            // InternalPascal.g:4626:3: ( 'true' )
            // InternalPascal.g:4627:4: 'true'
            {
             before(grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalPascal.g:4638:1: rule__Factor__BooleanAssignment_6 : ( ( 'false' ) ) ;
    public final void rule__Factor__BooleanAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4642:1: ( ( ( 'false' ) ) )
            // InternalPascal.g:4643:2: ( ( 'false' ) )
            {
            // InternalPascal.g:4643:2: ( ( 'false' ) )
            // InternalPascal.g:4644:3: ( 'false' )
            {
             before(grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0()); 
            // InternalPascal.g:4645:3: ( 'false' )
            // InternalPascal.g:4646:4: 'false'
            {
             before(grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalPascal.g:4657:1: rule__Factor__FunctionAssignment_7 : ( rulefunction_designator ) ;
    public final void rule__Factor__FunctionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4661:1: ( ( rulefunction_designator ) )
            // InternalPascal.g:4662:2: ( rulefunction_designator )
            {
            // InternalPascal.g:4662:2: ( rulefunction_designator )
            // InternalPascal.g:4663:3: rulefunction_designator
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
    // InternalPascal.g:4672:1: rule__Factor__ExpressionAssignment_8_1 : ( ruleexpression ) ;
    public final void rule__Factor__ExpressionAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4676:1: ( ( ruleexpression ) )
            // InternalPascal.g:4677:2: ( ruleexpression )
            {
            // InternalPascal.g:4677:2: ( ruleexpression )
            // InternalPascal.g:4678:3: ruleexpression
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
    // InternalPascal.g:4687:1: rule__Factor__NotAssignment_9_1 : ( rulefactor ) ;
    public final void rule__Factor__NotAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4691:1: ( ( rulefactor ) )
            // InternalPascal.g:4692:2: ( rulefactor )
            {
            // InternalPascal.g:4692:2: ( rulefactor )
            // InternalPascal.g:4693:3: rulefactor
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
    // InternalPascal.g:4702:1: rule__Function_designator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Function_designator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4706:1: ( ( RULE_ID ) )
            // InternalPascal.g:4707:2: ( RULE_ID )
            {
            // InternalPascal.g:4707:2: ( RULE_ID )
            // InternalPascal.g:4708:3: RULE_ID
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
    // InternalPascal.g:4717:1: rule__Function_designator__ExpressionsAssignment_2 : ( ruleexpression_list ) ;
    public final void rule__Function_designator__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4721:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:4722:2: ( ruleexpression_list )
            {
            // InternalPascal.g:4722:2: ( ruleexpression_list )
            // InternalPascal.g:4723:3: ruleexpression_list
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
    // InternalPascal.g:4732:1: rule__Function_procedure_declaration__ProceduresAssignment_0_0 : ( rulefunction_declaration ) ;
    public final void rule__Function_procedure_declaration__ProceduresAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4736:1: ( ( rulefunction_declaration ) )
            // InternalPascal.g:4737:2: ( rulefunction_declaration )
            {
            // InternalPascal.g:4737:2: ( rulefunction_declaration )
            // InternalPascal.g:4738:3: rulefunction_declaration
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
    // InternalPascal.g:4747:1: rule__Function_procedure_declaration__FunctionsAssignment_0_1 : ( ruleprocedure_declaration ) ;
    public final void rule__Function_procedure_declaration__FunctionsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4751:1: ( ( ruleprocedure_declaration ) )
            // InternalPascal.g:4752:2: ( ruleprocedure_declaration )
            {
            // InternalPascal.g:4752:2: ( ruleprocedure_declaration )
            // InternalPascal.g:4753:3: ruleprocedure_declaration
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
    // InternalPascal.g:4762:1: rule__Function_heading__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function_heading__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4766:1: ( ( RULE_ID ) )
            // InternalPascal.g:4767:2: ( RULE_ID )
            {
            // InternalPascal.g:4767:2: ( RULE_ID )
            // InternalPascal.g:4768:3: RULE_ID
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
    // InternalPascal.g:4777:1: rule__Function_heading__ParametersAssignment_2 : ( ruleformal_parameter_list ) ;
    public final void rule__Function_heading__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4781:1: ( ( ruleformal_parameter_list ) )
            // InternalPascal.g:4782:2: ( ruleformal_parameter_list )
            {
            // InternalPascal.g:4782:2: ( ruleformal_parameter_list )
            // InternalPascal.g:4783:3: ruleformal_parameter_list
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
    // InternalPascal.g:4792:1: rule__Function_heading__ReturnTypeAssignment_4 : ( RULE_ID ) ;
    public final void rule__Function_heading__ReturnTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4796:1: ( ( RULE_ID ) )
            // InternalPascal.g:4797:2: ( RULE_ID )
            {
            // InternalPascal.g:4797:2: ( RULE_ID )
            // InternalPascal.g:4798:3: RULE_ID
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
    // InternalPascal.g:4807:1: rule__Function_declaration__HeadingAssignment_0 : ( rulefunction_heading ) ;
    public final void rule__Function_declaration__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4811:1: ( ( rulefunction_heading ) )
            // InternalPascal.g:4812:2: ( rulefunction_heading )
            {
            // InternalPascal.g:4812:2: ( rulefunction_heading )
            // InternalPascal.g:4813:3: rulefunction_heading
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
    // InternalPascal.g:4822:1: rule__Function_declaration__BlockAssignment_2 : ( ruleblock ) ;
    public final void rule__Function_declaration__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4826:1: ( ( ruleblock ) )
            // InternalPascal.g:4827:2: ( ruleblock )
            {
            // InternalPascal.g:4827:2: ( ruleblock )
            // InternalPascal.g:4828:3: ruleblock
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
    // InternalPascal.g:4837:1: rule__Formal_parameter_list__ParametersAssignment_1 : ( ruleformal_parameter_section ) ;
    public final void rule__Formal_parameter_list__ParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4841:1: ( ( ruleformal_parameter_section ) )
            // InternalPascal.g:4842:2: ( ruleformal_parameter_section )
            {
            // InternalPascal.g:4842:2: ( ruleformal_parameter_section )
            // InternalPascal.g:4843:3: ruleformal_parameter_section
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
    // InternalPascal.g:4852:1: rule__Formal_parameter_list__ParametersAssignment_2_1 : ( ruleformal_parameter_section ) ;
    public final void rule__Formal_parameter_list__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4856:1: ( ( ruleformal_parameter_section ) )
            // InternalPascal.g:4857:2: ( ruleformal_parameter_section )
            {
            // InternalPascal.g:4857:2: ( ruleformal_parameter_section )
            // InternalPascal.g:4858:3: ruleformal_parameter_section
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
    // InternalPascal.g:4867:1: rule__Formal_parameter_section__ValueAssignment_0 : ( rulevalue_parameter_section ) ;
    public final void rule__Formal_parameter_section__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4871:1: ( ( rulevalue_parameter_section ) )
            // InternalPascal.g:4872:2: ( rulevalue_parameter_section )
            {
            // InternalPascal.g:4872:2: ( rulevalue_parameter_section )
            // InternalPascal.g:4873:3: rulevalue_parameter_section
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
    // InternalPascal.g:4882:1: rule__Formal_parameter_section__VariableAssignment_1 : ( rulevariable_parameter_section ) ;
    public final void rule__Formal_parameter_section__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4886:1: ( ( rulevariable_parameter_section ) )
            // InternalPascal.g:4887:2: ( rulevariable_parameter_section )
            {
            // InternalPascal.g:4887:2: ( rulevariable_parameter_section )
            // InternalPascal.g:4888:3: rulevariable_parameter_section
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
    // InternalPascal.g:4897:1: rule__Formal_parameter_section__ProcedureAssignment_2 : ( ruleprocedure_heading ) ;
    public final void rule__Formal_parameter_section__ProcedureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4901:1: ( ( ruleprocedure_heading ) )
            // InternalPascal.g:4902:2: ( ruleprocedure_heading )
            {
            // InternalPascal.g:4902:2: ( ruleprocedure_heading )
            // InternalPascal.g:4903:3: ruleprocedure_heading
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
    // InternalPascal.g:4912:1: rule__Formal_parameter_section__FunctionAssignment_3 : ( rulefunction_heading ) ;
    public final void rule__Formal_parameter_section__FunctionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4916:1: ( ( rulefunction_heading ) )
            // InternalPascal.g:4917:2: ( rulefunction_heading )
            {
            // InternalPascal.g:4917:2: ( rulefunction_heading )
            // InternalPascal.g:4918:3: rulefunction_heading
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
    // InternalPascal.g:4927:1: rule__Value_parameter_section__IdentifiersAssignment_0 : ( ruleidentifier_list ) ;
    public final void rule__Value_parameter_section__IdentifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4931:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:4932:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:4932:2: ( ruleidentifier_list )
            // InternalPascal.g:4933:3: ruleidentifier_list
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
    // InternalPascal.g:4942:1: rule__Value_parameter_section__TypeAssignment_2 : ( ruleparameter_type ) ;
    public final void rule__Value_parameter_section__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4946:1: ( ( ruleparameter_type ) )
            // InternalPascal.g:4947:2: ( ruleparameter_type )
            {
            // InternalPascal.g:4947:2: ( ruleparameter_type )
            // InternalPascal.g:4948:3: ruleparameter_type
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
    // InternalPascal.g:4957:1: rule__Identifier_list__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Identifier_list__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4961:1: ( ( RULE_ID ) )
            // InternalPascal.g:4962:2: ( RULE_ID )
            {
            // InternalPascal.g:4962:2: ( RULE_ID )
            // InternalPascal.g:4963:3: RULE_ID
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
    // InternalPascal.g:4972:1: rule__Identifier_list__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Identifier_list__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4976:1: ( ( RULE_ID ) )
            // InternalPascal.g:4977:2: ( RULE_ID )
            {
            // InternalPascal.g:4977:2: ( RULE_ID )
            // InternalPascal.g:4978:3: RULE_ID
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
    // InternalPascal.g:4987:1: rule__Parameter_type__NameAssignment : ( RULE_ID ) ;
    public final void rule__Parameter_type__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4991:1: ( ( RULE_ID ) )
            // InternalPascal.g:4992:2: ( RULE_ID )
            {
            // InternalPascal.g:4992:2: ( RULE_ID )
            // InternalPascal.g:4993:3: RULE_ID
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
    // InternalPascal.g:5002:1: rule__Variable_parameter_section__IndentifiersAssignment_1 : ( ruleidentifier_list ) ;
    public final void rule__Variable_parameter_section__IndentifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5006:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:5007:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:5007:2: ( ruleidentifier_list )
            // InternalPascal.g:5008:3: ruleidentifier_list
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
    // InternalPascal.g:5017:1: rule__Variable_parameter_section__TypeAssignment_3 : ( ruleparameter_type ) ;
    public final void rule__Variable_parameter_section__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5021:1: ( ( ruleparameter_type ) )
            // InternalPascal.g:5022:2: ( ruleparameter_type )
            {
            // InternalPascal.g:5022:2: ( ruleparameter_type )
            // InternalPascal.g:5023:3: ruleparameter_type
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
    // InternalPascal.g:5032:1: rule__Procedure_declaration__HeadingAssignment_0 : ( ruleprocedure_heading ) ;
    public final void rule__Procedure_declaration__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5036:1: ( ( ruleprocedure_heading ) )
            // InternalPascal.g:5037:2: ( ruleprocedure_heading )
            {
            // InternalPascal.g:5037:2: ( ruleprocedure_heading )
            // InternalPascal.g:5038:3: ruleprocedure_heading
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
    // InternalPascal.g:5047:1: rule__Procedure_declaration__BlockAssignment_2 : ( ruleblock ) ;
    public final void rule__Procedure_declaration__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5051:1: ( ( ruleblock ) )
            // InternalPascal.g:5052:2: ( ruleblock )
            {
            // InternalPascal.g:5052:2: ( ruleblock )
            // InternalPascal.g:5053:3: ruleblock
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
    // InternalPascal.g:5062:1: rule__Procedure_heading__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure_heading__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5066:1: ( ( RULE_ID ) )
            // InternalPascal.g:5067:2: ( RULE_ID )
            {
            // InternalPascal.g:5067:2: ( RULE_ID )
            // InternalPascal.g:5068:3: RULE_ID
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
    // InternalPascal.g:5077:1: rule__Procedure_heading__ParametersAssignment_2 : ( ruleformal_parameter_list ) ;
    public final void rule__Procedure_heading__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5081:1: ( ( ruleformal_parameter_list ) )
            // InternalPascal.g:5082:2: ( ruleformal_parameter_list )
            {
            // InternalPascal.g:5082:2: ( ruleformal_parameter_list )
            // InternalPascal.g:5083:3: ruleformal_parameter_list
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
    // InternalPascal.g:5092:1: rule__Set__BracketsAssignment_0 : ( ( '[' ) ) ;
    public final void rule__Set__BracketsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5096:1: ( ( ( '[' ) ) )
            // InternalPascal.g:5097:2: ( ( '[' ) )
            {
            // InternalPascal.g:5097:2: ( ( '[' ) )
            // InternalPascal.g:5098:3: ( '[' )
            {
             before(grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0()); 
            // InternalPascal.g:5099:3: ( '[' )
            // InternalPascal.g:5100:4: '['
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
    // InternalPascal.g:5111:1: rule__Set__ExpressionsAssignment_1 : ( ruleexpression_list ) ;
    public final void rule__Set__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5115:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:5116:2: ( ruleexpression_list )
            {
            // InternalPascal.g:5116:2: ( ruleexpression_list )
            // InternalPascal.g:5117:3: ruleexpression_list
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
    // InternalPascal.g:5126:1: rule__Set__BracketsAssignment_2 : ( ( ']' ) ) ;
    public final void rule__Set__BracketsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5130:1: ( ( ( ']' ) ) )
            // InternalPascal.g:5131:2: ( ( ']' ) )
            {
            // InternalPascal.g:5131:2: ( ( ']' ) )
            // InternalPascal.g:5132:3: ( ']' )
            {
             before(grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0()); 
            // InternalPascal.g:5133:3: ( ']' )
            // InternalPascal.g:5134:4: ']'
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
    // InternalPascal.g:5145:1: rule__Number__NumberAssignment : ( ruleany_number ) ;
    public final void rule__Number__NumberAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5149:1: ( ( ruleany_number ) )
            // InternalPascal.g:5150:2: ( ruleany_number )
            {
            // InternalPascal.g:5150:2: ( ruleany_number )
            // InternalPascal.g:5151:3: ruleany_number
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
    // InternalPascal.g:5160:1: rule__Signed_number__IntegerAssignment_0 : ( RULE_SIGNED_INTEGER_NUMBER ) ;
    public final void rule__Signed_number__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5164:1: ( ( RULE_SIGNED_INTEGER_NUMBER ) )
            // InternalPascal.g:5165:2: ( RULE_SIGNED_INTEGER_NUMBER )
            {
            // InternalPascal.g:5165:2: ( RULE_SIGNED_INTEGER_NUMBER )
            // InternalPascal.g:5166:3: RULE_SIGNED_INTEGER_NUMBER
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
    // InternalPascal.g:5175:1: rule__Signed_number__RealAssignment_1 : ( RULE_SIGNED_REAL_NUMBER ) ;
    public final void rule__Signed_number__RealAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5179:1: ( ( RULE_SIGNED_REAL_NUMBER ) )
            // InternalPascal.g:5180:2: ( RULE_SIGNED_REAL_NUMBER )
            {
            // InternalPascal.g:5180:2: ( RULE_SIGNED_REAL_NUMBER )
            // InternalPascal.g:5181:3: RULE_SIGNED_REAL_NUMBER
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
    // InternalPascal.g:5190:1: rule__Unsigned_number__IntegerAssignment_0 : ( RULE_INTEGER_NUMBER ) ;
    public final void rule__Unsigned_number__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5194:1: ( ( RULE_INTEGER_NUMBER ) )
            // InternalPascal.g:5195:2: ( RULE_INTEGER_NUMBER )
            {
            // InternalPascal.g:5195:2: ( RULE_INTEGER_NUMBER )
            // InternalPascal.g:5196:3: RULE_INTEGER_NUMBER
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
    // InternalPascal.g:5205:1: rule__Unsigned_number__RealAssignment_1 : ( RULE_REAL_NUMBER ) ;
    public final void rule__Unsigned_number__RealAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5209:1: ( ( RULE_REAL_NUMBER ) )
            // InternalPascal.g:5210:2: ( RULE_REAL_NUMBER )
            {
            // InternalPascal.g:5210:2: ( RULE_REAL_NUMBER )
            // InternalPascal.g:5211:3: RULE_REAL_NUMBER
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


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\12\12\uffff";
    static final String dfa_3s = "\1\4\1\6\12\uffff";
    static final String dfa_4s = "\1\57\1\54\12\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\1\1\10";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\3\uffff\1\3\2\2\20\uffff\1\4\3\uffff\1\10\1\uffff\1\11\11\uffff\1\5\1\6\1\7",
            "\4\12\2\uffff\1\12\11\uffff\1\12\1\uffff\1\12\1\uffff\1\12\2\uffff\4\12\1\13\1\12\4\uffff\6\12",
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
            return "1086:1: rule__Factor__Alternatives : ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__FunctionAssignment_7 ) ) | ( ( rule__Factor__Group_8__0 ) ) | ( ( rule__Factor__Group_9__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000005000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000005002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000E00A20001D70L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000A0400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000018000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000001140L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000020000001142L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00001C0000000200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00001C0000000202L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000E00E20001D70L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000007000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000E00A60001D70L});

}